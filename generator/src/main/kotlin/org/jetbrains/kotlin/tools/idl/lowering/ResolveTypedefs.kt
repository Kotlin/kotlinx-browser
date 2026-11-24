/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.surface.legacyWindowAliases

/**
 * Port of dukat's `resolveTypedefs`. Every reference to a typedef is replaced by the type it names, and the typedef
 * definitions are removed: the generated API has no typealiases (neither did the legacy one), and union-overload
 * expansion needs the unions inlined.
 *
 * Semantics (Web IDL §2.13, "flattened member types"):
 *  - `T?` where `typedef X? T` stays nullable once (`X?`); nullability is the OR of both.
 *  - A union member that resolves to a union is spliced into the outer union; if it was nullable, the outer union
 *    becomes nullable instead.
 *  - Type-level extended attributes of the reference come first, then those of the typedef's type.
 *  - Typedefs that reference typedefs are resolved transitively; a cycle is an error.
 *  - A union keeps the name of the typedef it came from in [IdlUnionType.typedef] (the innermost one for a typedef of a
 *    typedef). A union spliced into an outer union loses it: only the outer union is a type of its own.
 *
 * A `[LegacyWindowAlias]` resolves like a typedef of its interface: `[LegacyWindowAlias=SVGRect] interface DOMRect`
 * makes `SVGRect getBBox()` return a `DOMRect` (the alias is only another global name for the same constructor).
 */
fun IdlIR.resolveTypedefs(): IdlIR {
    val aliases = definitions
        .flatMap { d ->
            d.legacyWindowAliases()
                .map {
                    IdlTypedef(
                        it,
                        IdlNamedType((d as IdlInterface).name),
                        emptyList()
                    )
                }
        }

    val typedefs = (definitions.filterIsInstance<IdlTypedef>() + aliases)
        .associateBy { it.name }

    if (typedefs.isEmpty()) return this
    val resolver = TypedefResolver(typedefs)
    val result = IdlIR(
        specs.map { spec ->
            spec.copy(
                definitions = spec
                    .definitions
                    .filter { it !is IdlTypedef }
                    .map { d -> d.mapTypes(resolver::resolve) }
            )
        }
    )
    if (resolver.problems.isNotEmpty()) throw LoweringException(resolver.problems.distinct())
    return result
}

private class TypedefResolver(private val typedefs: Map<String, IdlTypedef>) {
    val problems = mutableListOf<String>()
    private val resolved = mutableMapOf<String, IdlType>()
    private val inProgress = mutableSetOf<String>()

    fun resolve(type: IdlType): IdlType = type.mapNested { t ->
        when (t) {
            is IdlNamedType -> typedefs[t.name]?.let {
                inline(t, it)
            } ?: t

            is IdlGenericType -> t

            is IdlUnionType -> t.flattened()
        }
    }

    private fun inline(reference: IdlNamedType, typedef: IdlTypedef): IdlType {
        val target = resolvedTarget(typedef) ?: return reference
        val named = if (target is IdlUnionType && target.typedef == null) {
            target.copy(typedef = typedef.name)
        } else target

        return named
            .withNullable(target.nullable || reference.nullable)
            .withExtAttrs((reference.extAttrs + target.extAttrs).distinct())
    }

    private fun resolvedTarget(typedef: IdlTypedef): IdlType? {
        resolved[typedef.name]?.let { return it }
        if (!inProgress.add(typedef.name)) {
            problems += "typedef cycle through ${typedef.name}"
            return null
        }
        return resolve(typedef.type).also {
            inProgress -= typedef.name
            resolved[typedef.name] = it
        }
    }

    private fun IdlUnionType.flattened(): IdlUnionType {
        if (members.none { it is IdlUnionType }) return this

        var nullable = nullable

        val flat = members
            .flatMap { m ->
                if (m is IdlUnionType) {
                    nullable = nullable || m.nullable
                    m.members
                } else {
                    listOf(m)
                }
            }
        return copy(members = flat.distinct(), nullable = nullable)
    }
}
