/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*

/**
 * Port of dukat's `addOverloadsForUnions`. An operation or constructor argument whose type is a union without a
 * [UnionMarker] is replaced by one overload per union member: `send(optional (Document or XMLHttpRequestBodyInit)? body)`
 * becomes `send(Document? body)`, `send(Blob? body)`, …, `send()`. Several such arguments give the cartesian product.
 *
 *  - An expanded argument is no longer optional and loses its default; an optional one also gives an overload that
 *    ends before it, as dukat did. So does a variadic one, unlike dukat: `append(Node... nodes)` and
 *    `append(DOMString... nodes)` alone make `append()` ambiguous in Kotlin (both candidates are `vararg`), so
 *    `append()` is added, and Kotlin prefers it over both (`replaceChildren()` clears the children).
 *  - The union's nullability goes to every member; `undefined` members are dropped and make them nullable instead.
 *  - The union's type-level extended attributes go to every member, before the member's own.
 *  - An overload equal to an earlier one of the same member (same name and argument types) is dropped, so a union
 *    member that duplicates a declared overload does not clash.
 *
 * Unlike dukat, constructors are expanded too (dukat left them as `JsAny`), and unions with a marker are kept.
 * Unions elsewhere (attributes, return types, dictionary members, type arguments) are not touched.
 */
fun IdlIR.expandUnionOverloads(markers: UnionMarkers): IdlIR {
    fun expandable(type: IdlType) = type is IdlUnionType && markers[type] == null

    fun expand(arguments: List<IdlArgument>): List<List<IdlArgument>> {
        val i = arguments
            .indexOfFirst { expandable(it.type) }

        if (i < 0) {
            return listOf(arguments)
        }

        val argument = arguments[i]

        val union = argument.type as IdlUnionType

        val members = union.members
            .filterNot { it is IdlNamedType && it.name == UNDEFINED }

        val nullable = union.nullable || members.size < union.members.size

        val variants = members
            .map { m ->
                val type = m
                    .withNullable(m.nullable || nullable)
                    .withExtAttrs(
                        (union.extAttrs + m.extAttrs)
                            .distinct()
                    )

                arguments
                    .toMutableList()
                    .also {
                        it[i] = argument.copy(
                            type = type,
                            optional = false,
                            default = null
                        )
                    }
            }

        val withoutIt = if (argument.optional || argument.variadic) {
            listOf(arguments.subList(0, i))
        } else {
            emptyList()
        }

        return (variants + withoutIt).flatMap(::expand)
    }

    fun expandMembers(members: List<IdlMember>): List<IdlMember> = members
        .flatMap { m ->
            when (m) {
                is IdlOperation -> expand(m.arguments)
                    .map { m.copy(arguments = it) }

                is IdlConstructor -> expand(m.arguments)
                    .map { m.copy(arguments = it) }

                else -> listOf(m)
            }
        }
        .distinctBy { if (it is IdlOperation || it is IdlConstructor) memberKey(it) else it }

    return IdlIR(
        specs
            .map { spec ->
                spec.copy(
                    definitions = spec
                        .definitions
                        .map { d ->
                            when (d) {
                                is IdlInterface -> d.copy(members = expandMembers(d.members))
                                is IdlNamespace -> d.copy(members = expandMembers(d.members))
                                else -> d
                            }
                        }
                )
            }
    )
}

private const val UNDEFINED = "undefined"
