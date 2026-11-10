/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*

/** The Kotlin declaration kind an IDL interface-like definition becomes. Target-independent. */
enum class ShapeKind {
    /** `external interface`: mixins and callback interfaces. */
    INTERFACE,

    /** `external abstract class`: an interface without its own constructor ("Illegal constructor" in JS). */
    ABSTRACT_CLASS,

    /** `external open class`: an interface with its own `constructor(...)`. */
    OPEN_CLASS,

    /** `external object`: a namespace. */
    OBJECT,
}

/**
 * `[LegacyFactoryFunction=Image(...)]` on `HTMLImageElement`: a separate constructible class `Image` that extends the
 * host. The host itself keeps its own shape (usually abstract).
 */
data class FactoryClass(val name: String, val host: String, val arguments: List<IdlArgument>)

/** Where a constant shown on a class comes from: its own body, an ancestor, or an included mixin. */
data class ResolvedConstant(val constant: IdlConstant, val declaredIn: String)

data class Shape(
    val name: String,
    val kind: ShapeKind,
    /** Parent interface first (if any), then included mixins in `includes` order. */
    val supertypes: List<String>,
    /**
     * Constants a class exposes in its companion: own, then those of every ancestor and of every mixin included by
     * the class or an ancestor (Key Decision 13: copied, because a companion of an external interface is not usable
     * on wasm, and Kotlin companions are not inherited). Empty for [ShapeKind.INTERFACE] — see
     * [Shapes.constantsWithoutClassHome].
     */
    val constants: List<ResolvedConstant>,
)

/**
 * Port of dukat's `markAbstractOrOpen`, plus the mixin decision and constant copying, as a pure analysis over the
 * merged IR (run [mergePartials] first). It does not rewrite the IR: shapes are facts the backend reads.
 *
 * Corrected rule (Step 3): a class is `open` only with an **own** `constructor`. Dukat also made it open when any
 * *ancestor* had one, which turned 143 classes such as `XMLHttpRequestUpload` open after `EventTarget` gained
 * `constructor()`. An `[HTMLConstructor] constructor()` does not count: it only works for custom-element subclasses
 * and throws "Illegal constructor" otherwise (`new HTMLImageElement()`). `[LegacyFactoryFunction]`
 * does not make the host open either; it yields a separate [FactoryClass].
 */
class Shapes private constructor(
    val byName: Map<String, Shape>,
    val factoryClasses: List<FactoryClass>,
    /** Interfaces whose constants have no class to be copied into (e.g. callback interface `NodeFilter`). */
    val constantsWithoutClassHome: Map<String, List<IdlConstant>>,
) {
    operator fun get(name: String): Shape = byName[name] ?: error("no shape for '$name'")

    companion object {
        fun of(ir: IdlIR): Shapes {
            val interfaces = mutableMapOf<String, IdlInterface>()
            val namespaces = mutableListOf<IdlNamespace>()
            val problems = mutableListOf<String>()
            for (d in ir.definitions) {
                when (d) {
                    is IdlInterface -> {
                        if (d.partial) problems += "partial interface ${d.name} not merged; run mergePartials first"
                        interfaces[d.name] = d
                    }

                    is IdlNamespace -> namespaces += d
                    else -> {}
                }
            }

            val includes = ir.definitions
                .filterIsInstance<IdlIncludes>()
                .groupBy(
                    { it.target },
                    { it.mixin }
                )

            includes
                .forEach { [target, mixins] ->
                    if (interfaces[target]?.kind != IdlInterfaceKind.INTERFACE) {
                        problems += "'$target includes …': $target is not an interface"
                    }

                    mixins.forEach {
                        if (interfaces[it]?.kind != IdlInterfaceKind.MIXIN) {
                            problems += "'$target includes $it': $it is not a mixin"
                        }
                    }
                }

            fun kindOf(i: IdlInterface) = when {
                i.kind != IdlInterfaceKind.INTERFACE -> ShapeKind.INTERFACE

                i.members
                    .any {
                        it is IdlConstructor && !it.extAttrs.has("HTMLConstructor")
                    } -> ShapeKind.OPEN_CLASS

                else -> ShapeKind.ABSTRACT_CLASS
            }

            /** Self and ancestors, nearest first; each followed by its mixins. */
            fun constantSources(i: IdlInterface): List<IdlInterface> {
                val chain = generateSequence(i) { c ->
                    c.inheritance?.let { interfaces[it] }
                }.toList()
                return chain.flatMap { c ->
                    listOf(c) + includes[c.name]
                        .orEmpty()
                        .mapNotNull { interfaces[it] }
                }
            }

            fun constantsOf(i: IdlInterface): List<ResolvedConstant> {
                val seen = mutableMapOf<String, ResolvedConstant>()

                constantSources(i)
                    .forEach { (val name, val members) ->
                        members
                            .filterIsInstance<IdlConstant>()
                            .forEach { c ->
                                val previous = seen[c.name]

                                when {
                                    previous == null -> seen[c.name] = ResolvedConstant(c, name)

                                    previous.constant.value != c.value -> problems +=
                                        "${i.name}: constant ${c.name} is ${previous.constant.value.render()} in ${previous.declaredIn} but " +
                                                "${c.value.render()} in $name"
                                }
                            }
                    }
                return seen.values.toList()
            }

            val shapes = linkedMapOf<String, Shape>()
            interfaces
                .values
                .forEach { i ->
                    val kind = kindOf(i)

                    shapes[i.name] = Shape(
                        name = i.name,
                        kind = kind,
                        supertypes = listOfNotNull(i.inheritance) + includes[i.name].orEmpty(),
                        constants = if (kind == ShapeKind.INTERFACE) {
                            emptyList()
                        } else {
                            constantsOf(i)
                        },
                    )
                }

            namespaces.forEach { n ->
                shapes[n.name] = Shape(
                    n.name,
                    ShapeKind.OBJECT,
                    emptyList(),
                    emptyList()
                )
            }

            val factories = interfaces
                .values
                .flatMap { (val interfaceName = name, val extAttrs) ->
                    extAttrs
                        .filter { it.name == "LegacyFactoryFunction" }
                        .mapNotNull { attr ->
                            val name = (attr.rhs as? IdlExtendedAttributeValue.Identifier)?.value
                            if (name == null) {
                                problems += "$interfaceName: malformed ${attr.render()}"
                                null
                            } else {
                                FactoryClass(name, interfaceName, attr.arguments)
                            }
                        }
                }

            factories
                .filter { it.name in shapes }
                .forEach { problems += "factory class ${it.name} (of ${it.host}) clashes with a definition" }

            factories
                .forEach { (val name, val factory = host) ->
                    val host = interfaces.getValue(factory)
                    shapes[name] = Shape(
                        name,
                        ShapeKind.OPEN_CLASS,
                        listOf(factory),
                        constantsOf(host)
                    )
                }

            val classMixins = shapes
                .values
                .filter { it.kind != ShapeKind.INTERFACE }
                .flatMap { includes[it.name].orEmpty() }
                .toSet()

            val homeless = interfaces
                .values
                .filter {
                    kindOf(it) == ShapeKind.INTERFACE &&
                            !(it.kind == IdlInterfaceKind.MIXIN && it.name in classMixins)
                }
                .associate { it.name to it.members.filterIsInstance<IdlConstant>() }
                .filterValues { it.isNotEmpty() }

            if (problems.isNotEmpty()) throw LoweringException(problems)

            return Shapes(
                shapes,
                factories,
                homeless
            )
        }
    }
}
