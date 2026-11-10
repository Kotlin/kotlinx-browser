/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*

/** A lowering found input it cannot handle; every problem is reported at once. */
class LoweringException(val problems: List<String>) : RuntimeException(
    "Lowering failed with ${problems.size} problem(s):\n" + problems.joinToString("\n") { "  - $it" }
)

/**
 * Extended attributes that, written on a partial definition, apply to each member of that partial (Web IDL §3.3.2,
 * §3.3.3): they are pushed down onto the members before merging, so `partial interface X [Exposed=Window] { m; }`
 * still records that `m` is window-only. Any other extended attribute on a partial is merged onto the main definition.
 */
private val MEMBER_SCOPED_ATTRIBUTES = setOf("Exposed", "SecureContext")

/**
 * Port of dukat's `resolvePartials`. Every `partial` interface, mixin, namespace and dictionary is merged into its main
 * definition, which stays in the spec that defines it. Members keep their order: the main definition's first, then
 * each partial's in corpus (allowlist) order.
 *
 * Differences from dukat, all deliberate:
 *  - Member-scoped extended attributes of a partial are pushed down to its members instead of being merged onto the
 *    definition (dukat had no member-level extended attributes).
 *  - A member declared twice is an error rather than silently de-duplicated by name: today's corpus has none, and a
 *    future one is a spec bug worth seeing.
 *  - A partial without a main definition is an error (the surface pass already guarantees there is one).
 *  - A partial whose kind differs from its main definition (`partial dictionary X` for `interface X`) is an error.
 *
 * Partials are matched to their main definition by name alone: Web IDL gives all definitions one namespace.
 */
fun IdlIR.mergePartials(): IdlIR {

    val partials = definitions
        .filterIsInstance<IdlPartialable>()
        .filter { it.partial }
        .groupBy { it.name }

    val problems = mutableListOf<String>()

    val matched = mutableSetOf<String>()

    fun mergeIntoMainDefinition(d: IdlPartialable): IdlPartialable {
        val parts = partials[d.name].orEmpty()
        matched += d.name
        val [sameKind, otherKind] = parts
            .partition { it.kindLabel == d.kindLabel }
        otherKind.forEach { p ->
            problems += "partial ${p.kindLabel} ${p.name}, " +
                    "but ${d.name} is ${d.kindLabel}"
        }

        return if (sameKind.isEmpty()) {
            d
        } else {
            merge(d, sameKind, problems)
        }
    }

    val result = IdlIR(
        specs.map { spec ->
            spec.copy(
                definitions = spec.definitions
                    .mapNotNull { d ->
                        when {
                            d !is IdlPartialable -> d

                            d.partial -> null

                            else -> mergeIntoMainDefinition(d)
                        }
                    }
            )
        }
    )

    (partials.keys - matched).forEach { name ->
        problems += "partial ${partials.getValue(name).first().kindLabel} $name has no main definition"
    }

    if (problems.isNotEmpty()) throw LoweringException(problems)

    return result
}

/** The definition kind as written in Web IDL; a partial must have the same kind as its main definition. */
private val IdlPartialable.kindLabel: String
    get() = when (this) {
        is IdlInterface -> when (kind) {
            IdlInterfaceKind.INTERFACE -> "interface"
            IdlInterfaceKind.MIXIN -> "interface mixin"
            IdlInterfaceKind.CALLBACK_INTERFACE -> "callback interface"
        }

        is IdlNamespace -> "namespace"
        is IdlDictionary -> "dictionary"
    }

private fun merge(
    main: IdlPartialable,
    partials: List<IdlPartialable>,
    problems: MutableList<String>
): IdlPartialable {
    val definitionAttrs =
        (main.extAttrs +
                partials
                    .flatMap { p ->
                        p.extAttrs.filter { it.name !in MEMBER_SCOPED_ATTRIBUTES }
                    })
            .distinct()

    fun <M> mergeMembers(
        own: List<M>,
        partialMembers: (IdlPartialable) -> List<M>,
        key: (M) -> String,
        extAttrsOf: (M) -> List<IdlExtendedAttribute>,
        withExtAttrs: (M, List<IdlExtendedAttribute>) -> M,
    ): List<M> {
        val all = own + partials.flatMap { p ->
            val scoped = p.extAttrs.filter { it.name in MEMBER_SCOPED_ATTRIBUTES }
            partialMembers(p).map { m ->
                val memberAttrs = extAttrsOf(m)
                // Web IDL §3.3.7, §3.3.13: an [Exposed]/[SecureContext] must not be on both a member and its partial.
                scoped
                    .filter { s ->
                        memberAttrs.any { it.name == s.name }
                    }
                    .forEach { s ->
                        problems += "${main.name}: [${s.name}] is on both '${key(m)}' and its partial ${p.kindLabel}"
                    }
                if (scoped.isEmpty()) {
                    m
                } else {
                    withExtAttrs(m, (memberAttrs + scoped).distinctBy { it.name })
                }
            }
        }
        all.groupingBy(key)
            .eachCount()
            .filterValues { it > 1 }
            .keys
            .forEach { k ->
                problems += "${main.name}: '$k' is declared more than once"
            }
        return all
    }

    return when (main) {
        is IdlInterface -> main.copy(
            members = mergeMembers(
                main.members,
                { (it as IdlInterface).members },
                ::memberKey,
                IdlMember::extAttrs,
                ::withExtAttrs,
            ),
            extAttrs = definitionAttrs,
        )

        is IdlNamespace -> main.copy(
            members = mergeMembers(
                main.members,
                { (it as IdlNamespace).members },
                ::memberKey,
                IdlMember::extAttrs,
                ::withExtAttrs,
            ),
            extAttrs = definitionAttrs,
        )

        is IdlDictionary -> main.copy(
            members = mergeMembers(
                main.members,
                { (it as IdlDictionary).members },
                { it.name },
                IdlField::extAttrs,
                { f, attrs -> f.copy(extAttrs = attrs) },
            ),
            extAttrs = definitionAttrs,
        )
    }
}

private fun withExtAttrs(member: IdlMember, attrs: List<IdlExtendedAttribute>): IdlMember {
    return when (member) {
        is IdlAttribute -> member.copy(extAttrs = attrs)
        is IdlConstant -> member.copy(extAttrs = attrs)
        is IdlOperation -> member.copy(extAttrs = attrs)
        is IdlConstructor -> member.copy(extAttrs = attrs)
        is IdlDeclarationMember -> member.copy(extAttrs = attrs)
    }
}

/** Identity of a member for duplicate detection: overloads differ by argument types, everything else by name. */
internal fun memberKey(m: IdlMember): String = when (m) {
    is IdlAttribute -> {
        (if (m.special == IdlAttributeSpecial.STATIC) {
            "static "
        } else {
            ""
        }) + "attribute ${m.name}"
    }

    is IdlConstant -> "const ${m.name}"
    is IdlOperation -> listOfNotNull(
        m.special?.name?.lowercase(),
        m.name ?: "<anonymous>"
    ).joinToString(" ") +
            m.arguments.joinToString(", ", "(", ")") { it.type.render() }

    is IdlConstructor -> m.arguments
        .joinToString(", ", "constructor(", ")") { it.type.render() }

    is IdlDeclarationMember -> m.kind.name.lowercase()
}
