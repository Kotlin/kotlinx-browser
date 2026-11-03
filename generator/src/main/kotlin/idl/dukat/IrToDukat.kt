/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.dukat

import org.jetbrains.dukat.astCommon.toNameEntity
import org.jetbrains.dukat.idlDeclarations.*
import org.jetbrains.kotlin.tools.idl.ir.*

/**
 * TEMPORARY bridge: [IdlIR] → dukat's `IDLSourceSetDeclaration`, so the existing dukat lowering chain keeps
 * generating while the lowerings are ported onto the IR one by one (Delivery Step 3). Delete together with the
 * `dukat` dependency.
 *
 * The conversion is deliberately lossy — dukat's model cannot hold what the IR holds — and reproduces what dukat's
 * own ANTLR front-end used to produce, so downstream lowerings see familiar input:
 *  - IDL type names lose their spaces (`unsigned long long` → `unsignedlonglong`), `undefined` becomes `void`.
 *  - `constructor(...)` members become `[Constructor(...)]` extended attributes, `[LegacyFactoryFunction=X(...)]`
 *    becomes `[NamedConstructor=X(...)]`, `[LegacyNoInterfaceObject]` becomes `[NoInterfaceObject]`.
 *  - Constants become static read-only attributes; anonymous getters/setters are named `get`/`set`.
 *  - Dropped (no representation in dukat): member-, argument- and type-level extended attributes; constant values;
 *    `iterable`/`maplike`/`setlike`/`async iterable`; `deleter` and bare `stringifier`; type arguments of `record`.
 *  - `ObservableArray<T>` becomes `FrozenArray<T>`; `async_sequence<T>` and `bigint` become `any`.
 *
 * Specs that share a Kotlin package are merged into one dukat file named `<package>.idl`, which keeps dukat's output
 * file names (`org.w3c.dom.kt`, …) and its package-based `relocateDeclarations` working unchanged.
 */
fun IdlIR.toDukat(): IDLSourceSetDeclaration {
    val files = specs.groupBy { it.packageName }.map { (packageName, specs) ->
        IDLFileDeclaration(
            fileName = "$packageName.idl",
            declarations = specs.flatMap { spec -> spec.definitions.mapNotNull { it.toDukat() } },
            referencedFiles = emptyList(),
            packageName = packageName.toNameEntity(),
        )
    }
    return IDLSourceSetDeclaration(files)
}

private fun IdlDefinition.toDukat(): IDLTopLevelDeclaration? = when (this) {
    is IdlInterface -> toDukat()
    is IdlNamespace -> IDLNamespaceDeclaration(
        name = name,
        attributes = members.mapNotNull { it.toDukatAttribute() },
        operations = members.mapNotNull { (it as? IdlOperation)?.toDukatOperation() },
        partial = partial,
    )

    is IdlDictionary -> IDLDictionaryDeclaration(
        name = name,
        members = members.map {
            IDLDictionaryMemberDeclaration(
                name = it.name,
                type = it.type.toDukat(),
                defaultValue = it.default?.toDukat(),
                required = it.required,
            )
        },
        parents = listOfNotNull(inheritance?.let(::single)),
        unions = emptyList(),
        partial = partial,
    )

    is IdlCallback -> IDLTypedefDeclaration(
        name = name,
        typeReference = IDLFunctionTypeDeclaration(
            name = name,
            returnType = returnType.toDukat(),
            arguments = arguments.map { it.toDukat().copy(name = "") },
            nullable = false,
        ),
    )

    is IdlEnum -> IDLEnumDeclaration(
        name = name,
        // dukat's parser kept the quotes and strips them itself.
        members = values.map { "\"$it\"" },
        unions = emptyList(),
    )

    is IdlTypedef -> IDLTypedefDeclaration(name = name, typeReference = type.toDukat())
    is IdlIncludes -> IDLIncludesStatementDeclaration(child = single(target), parent = single(mixin))
}

private fun IdlInterface.toDukat(): IDLInterfaceDeclaration {
    val constructorAttributes = members.filterIsInstance<IdlConstructor>().map { constructor ->
        IDLFunctionExtendedAttributeDeclaration("Constructor", constructor.arguments.map { it.toDukat() })
    }
    return IDLInterfaceDeclaration(
        name = name,
        attributes = members.mapNotNull { it.toDukatAttribute() },
        operations = members.mapNotNull { (it as? IdlOperation)?.toDukatOperation() },
        primaryConstructor = null,
        constructors = emptyList(),
        parents = listOfNotNull(inheritance?.let(::single)),
        unions = emptyList(),
        extendedAttributes = extAttrs.map { it.toDukat() } + constructorAttributes,
        getters = members.mapNotNull { (it as? IdlOperation)?.toDukatGetter() },
        setters = members.mapNotNull { (it as? IdlOperation)?.toDukatSetter() },
        kind = InterfaceKind.INTERFACE,
        callback = kind == IdlInterfaceKind.CALLBACK_INTERFACE,
        generated = false,
        partial = partial,
        mixin = kind == IdlInterfaceKind.MIXIN,
    )
}

private fun IdlMember.toDukatAttribute(): IDLAttributeDeclaration? = when (this) {
    is IdlAttribute -> IDLAttributeDeclaration(
        name = name,
        type = type.toDukat(),
        static = special == IdlAttributeSpecial.STATIC,
        readOnly = readonly,
        override = false,
    )

    is IdlConstant -> IDLAttributeDeclaration(name, type.toDukat(), static = true, readOnly = true, override = false)
    else -> null
}

/** Regular and static operations, plus named deleters/stringifiers (dukat's parser treated those as plain operations). */
private fun IdlOperation.toDukatOperation(): IDLOperationDeclaration? {
    if (special == IdlOperationSpecial.GETTER || special == IdlOperationSpecial.SETTER) return null
    val name = name ?: return null
    return IDLOperationDeclaration(
        name = name,
        returnType = returnType?.toDukat() ?: VOID,
        arguments = arguments.map { it.toDukat() },
        static = special == IdlOperationSpecial.STATIC,
        override = false,
    )
}

private fun IdlOperation.toDukatGetter(): IDLGetterDeclaration? {
    if (special != IdlOperationSpecial.GETTER) return null
    return IDLGetterDeclaration(
        name = name ?: "get",
        key = arguments.getOrNull(0)?.toDukat() ?: EMPTY_ARGUMENT,
        valueType = returnType?.toDukat() ?: VOID,
    )
}

private fun IdlOperation.toDukatSetter(): IDLSetterDeclaration? {
    if (special != IdlOperationSpecial.SETTER) return null
    return IDLSetterDeclaration(
        name = name ?: "set",
        key = arguments.getOrNull(0)?.toDukat() ?: EMPTY_ARGUMENT,
        value = arguments.getOrNull(1)?.toDukat() ?: EMPTY_ARGUMENT,
    )
}

private fun IdlArgument.toDukat() = IDLArgumentDeclaration(
    name = name,
    type = type.toDukat(),
    defaultValue = default?.toDukat(),
    optional = optional,
    variadic = variadic,
)

internal fun IdlType.toDukat(): IDLTypeDeclaration = when (this) {
    is IdlNamedType -> IDLSingleTypeDeclaration(dukatTypeName(name), null, nullable)
    is IdlGenericType -> when (generic) {
        "record" -> IDLSingleTypeDeclaration("record", null, nullable)
        "async_sequence" -> IDLSingleTypeDeclaration("any", null, nullable)
        "ObservableArray" -> IDLSingleTypeDeclaration("FrozenArray", arguments.single().toDukat(), nullable)
        else -> IDLSingleTypeDeclaration(generic, arguments.single().toDukat(), nullable)
    }

    is IdlUnionType -> {
        val unionMembers = members.map { it.toDukat() }
        IDLUnionTypeDeclaration(
            // Same naming scheme as dukat's TypeVisitor.
            name = unionMembers.sortedBy { it.name }.joinToString(separator = "Or", prefix = "Union") { it.name },
            unionMembers = unionMembers,
            originFile = null,
            nullable = nullable,
        )
    }
}

private fun dukatTypeName(idlName: String): String = when (idlName) {
    "undefined" -> "void"
    "bigint" -> "any"
    else -> idlName.replace(" ", "")
}

/** Default values as dukat's parser produced them: the IDL source text of the literal. */
private fun IdlValue.toDukat(): String = when (this) {
    is IdlValue.Str -> "\"$value\""
    is IdlValue.Num -> literal
    is IdlValue.Bool -> value.toString()
    is IdlValue.Infinity -> if (negative) "-Infinity" else "Infinity"
    IdlValue.NaN -> "NaN"
    IdlValue.Null -> "null"
    IdlValue.EmptySequence -> "[]"
    IdlValue.EmptyDictionary -> "{}"
}

private fun IdlExtendedAttribute.toDukat(): IDLExtendedAttributeDeclaration {
    val dukatName = when (name) {
        "LegacyNoInterfaceObject" -> "NoInterfaceObject"
        "LegacyFactoryFunction" -> "NamedConstructor"
        else -> name
    }
    val args = arguments.map { it.toDukat() }
    return when (val rhs = rhs) {
        // webidl2 does not distinguish `[X]` from `[X()]`; nothing relies on the difference.
        null -> if (arguments.isEmpty()) {
            IDLSimpleExtendedAttributeDeclaration(dukatName)
        } else {
            IDLFunctionExtendedAttributeDeclaration(dukatName, args)
        }

        is IdlExtendedAttributeValue.Identifier ->
            if (dukatName == "NamedConstructor") IDLNamedFunctionExtendedAttributeDeclaration(dukatName, rhs.value, args)
            else IDLAssignmentExtendedAttributeDeclaration(dukatName, rhs.value)

        is IdlExtendedAttributeValue.IdentifierList -> IDLListAssignmentExtendedAttributeDeclaration(dukatName, rhs.values)
        is IdlExtendedAttributeValue.StringValue -> IDLAssignmentExtendedAttributeDeclaration(dukatName, "\"${rhs.value}\"")
        is IdlExtendedAttributeValue.StringList ->
            IDLListAssignmentExtendedAttributeDeclaration(dukatName, rhs.values.map { "\"$it\"" })

        is IdlExtendedAttributeValue.Integer -> IDLAssignmentExtendedAttributeDeclaration(dukatName, rhs.literal)
        is IdlExtendedAttributeValue.IntegerList -> IDLListAssignmentExtendedAttributeDeclaration(dukatName, rhs.literals)
        is IdlExtendedAttributeValue.Decimal -> IDLAssignmentExtendedAttributeDeclaration(dukatName, rhs.literal)
        is IdlExtendedAttributeValue.DecimalList -> IDLListAssignmentExtendedAttributeDeclaration(dukatName, rhs.literals)
        IdlExtendedAttributeValue.Wildcard -> IDLAssignmentExtendedAttributeDeclaration(dukatName, "*")
    }
}

private fun single(name: String) = IDLSingleTypeDeclaration(name, null, false)

private val VOID = IDLSingleTypeDeclaration("void", null, false)

private val EMPTY_ARGUMENT = IDLArgumentDeclaration("", IDLSingleTypeDeclaration("", null, false), null, false, false)
