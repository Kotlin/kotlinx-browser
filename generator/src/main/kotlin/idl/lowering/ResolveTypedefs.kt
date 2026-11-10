/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*

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
 */
fun IdlIR.resolveTypedefs(): IdlIR {
    val typedefs = definitions
        .filterIsInstance<IdlTypedef>()
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
        return target
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
