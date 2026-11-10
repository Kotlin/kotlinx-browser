/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.ir

/*
 * Structural helpers for IR-to-IR lowerings. They only walk the tree; what to do with each node is the caller's job.
 */

/**
 * Applies [transform] to every top-level type position of the definition: attribute, constant, field, argument and
 * return types, `iterable`/`maplike`/`setlike` type arguments, and the arguments of extended attributes such as
 * `[LegacyFactoryFunction=Image(optional unsigned long width)]`.
 *
 * [transform] receives the outermost type of each position; it is responsible for recursing into union members and
 * generic arguments if it needs to (see [IdlType.mapNested]).
 */
fun IdlDefinition.mapTypes(transform: (IdlType) -> IdlType): IdlDefinition {

    fun IdlExtendedAttribute.map() =
        if (arguments.isEmpty()) {
            this
        } else {
            copy(arguments = arguments.map { it.map(transform) })
        }

    fun List<IdlExtendedAttribute>.map() =
        map { it.map() }

    fun IdlMember.map(): IdlMember = when (this) {
        is IdlAttribute -> copy(
            type = transform(type),
            extAttrs = extAttrs.map()
        )

        is IdlConstant -> copy(
            type = transform(type),
            extAttrs = extAttrs.map()
        )

        is IdlOperation -> copy(
            returnType = returnType?.let(transform),
            arguments = arguments.map {
                it.map(transform)
            },
            extAttrs = extAttrs.map(),
        )

        is IdlConstructor -> copy(
            arguments = arguments.map {
                it.map(transform)
            },
            extAttrs = extAttrs.map()
        )

        is IdlDeclarationMember -> copy(
            typeArguments = typeArguments.map(transform),
            arguments = arguments.map {
                it.map(transform)
            },
            extAttrs = extAttrs.map(),
        )
    }
    return when (this) {
        is IdlInterface -> copy(
            members = members.map {
                it.map()
            },
            extAttrs = extAttrs.map()
        )

        is IdlNamespace -> copy(
            members = members.map { it.map() },
            extAttrs = extAttrs.map()
        )

        is IdlDictionary -> copy(
            members = members.map {
                it.copy(
                    type = transform(it.type),
                    extAttrs = it.extAttrs.map()
                )
            },
            extAttrs = extAttrs.map()
        )

        is IdlCallback -> copy(
            returnType = transform(returnType),
            arguments = arguments.map {
                it.map(transform)
            },
            extAttrs = extAttrs.map()
        )

        is IdlTypedef -> copy(
            type = transform(type),
            extAttrs = extAttrs.map()
        )

        is IdlEnum, is IdlIncludes -> this
    }
}

private fun IdlArgument.map(transform: (IdlType) -> IdlType) =
    copy(type = transform(type))

/** Rebuilds this type bottom-up, applying [transform] to every node after its children have been transformed. */
fun IdlType.mapNested(transform: (IdlType) -> IdlType): IdlType = transform(
    when (this) {
        is IdlNamedType -> this
        is IdlGenericType -> copy(
            arguments = arguments.map {
                it.mapNested(transform)
            }
        )

        is IdlUnionType -> copy(
            members = members.map {
                it.mapNested(transform)
            }
        )
    }
)

fun IdlType.withNullable(nullable: Boolean): IdlType = when (this) {
    is IdlNamedType -> copy(nullable = nullable)
    is IdlGenericType -> copy(nullable = nullable)
    is IdlUnionType -> copy(nullable = nullable)
}

fun IdlType.withExtAttrs(extAttrs: List<IdlExtendedAttribute>): IdlType = when (this) {
    is IdlNamedType -> copy(extAttrs = extAttrs)
    is IdlGenericType -> copy(extAttrs = extAttrs)
    is IdlUnionType -> copy(extAttrs = extAttrs)
}

/** Every type node of the definition, including nested union members and generic arguments. */
fun IdlDefinition.allTypes(): List<IdlType> {
    val result = mutableListOf<IdlType>()

    fun visit(t: IdlType) {
        result += t
        when (t) {
            is IdlNamedType -> {}
            is IdlGenericType -> t.arguments.forEach(::visit)
            is IdlUnionType -> t.members.forEach(::visit)
        }
    }

    mapTypes { visit(it); it }
    return result
}
