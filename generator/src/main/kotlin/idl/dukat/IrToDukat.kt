/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.dukat

import org.jetbrains.dukat.astCommon.toNameEntity
import org.jetbrains.dukat.idlDeclarations.*
import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.surface.Builtins
import org.jetbrains.kotlin.tools.idl.surface.legacyWindowAliases

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
 *  - `BufferSource`/`AllowSharedBufferSource` become `BufferDataSource`, `WindowProxy` becomes `Window`;
 *    `[LegacyWindowAlias]`es become typedefs.
 *
 * Specs that share a Kotlin package are merged into one dukat file named `<package>.idl`, which keeps dukat's output
 * file names (`org.w3c.dom.kt`, …) and its package-based `relocateDeclarations` working unchanged. Definitions are
 * first moved to their Kotlin package (package overrides; partials follow their main definition), because dukat's
 * `resolvePartials` lands a merged declaration in whichever file it sees last.
 */
fun IdlIR.toDukat(packageOverrides: Map<String, String> = emptyMap()): IDLSourceSetDeclaration {
    val files = withDukatWorkarounds().relocated(packageOverrides).specs.groupBy { it.packageName }.map { (packageName, specs) ->
        IDLFileDeclaration(
            fileName = "$packageName.idl",
            declarations = specs.flatMap { spec -> spec.definitions.flatMap { listOfNotNull(it.toDukat()) + it.aliasTypedefs() } },
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
    // Hand-written org.khronos.webgl declarations model the webidl buffer typedefs with a marker interface.
    "BufferSource", "AllowSharedBufferSource" -> "BufferDataSource"
    // JS Numbers (see WasmTypeMapping); dukat's own maps disagree between the common, wasm and JS chains.
    "long long", "unsigned long long" -> "unrestricteddouble"
    in Builtins.ALIASES -> Builtins.ALIASES.getValue(idlName)
    else -> idlName.replace(" ", "")
}

/**
 * `[LegacyWindowAlias=SVGPoint] interface DOMPoint` → `typedef DOMPoint SVGPoint;`, so references to the alias resolve.
 * dukat's resolveTypedefs inlines it (references become `DOMPoint`, as in the legacy API); the new backend will emit a
 * real `typealias` instead.
 */
private fun IdlDefinition.aliasTypedefs(): List<IDLTypedefDeclaration> {
    val target = (this as? IdlInterface)?.name ?: return emptyList()
    return legacyWindowAliases().map { IDLTypedefDeclaration(name = it, typeReference = single(target)) }
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

// ---------------------------------------------------------------------------------------------------------------------
// IR → IR workarounds for constructs the legacy dukat backend cannot express. They only exist so the transitional
// chain keeps compiling; each one maps to a rule the new backend implements properly.
// ---------------------------------------------------------------------------------------------------------------------

private fun IdlIR.withDukatWorkarounds(): IdlIR {
    val callbacks = definitions.filterIsInstance<IdlCallback>().map { it.name }.toSet()
    return IdlIR(specs.map { spec ->
        spec.copy(definitions = spec.definitions.map {
            it.namespaceAsInterface().mapTypes { t -> t.eraseCallbackTypeArguments(callbacks) }.erasePromiseUndefinedInCallbacks()
        })
    }).dropInexpressibleDictionaryDefaults()
}

/**
 * `callback F = Promise<undefined> ()` → `Promise<any>`: dukat's common chain prints the function type as
 * `() -> Promise<Nothing?>` and its JS chain as `() -> Promise<Unit>`, so expect and actual disagree.
 */
private fun IdlDefinition.erasePromiseUndefinedInCallbacks(): IdlDefinition {
    if (this !is IdlCallback) return this
    val type = returnType
    if (type !is IdlGenericType || type.generic != "Promise") return this
    val argument = type.arguments.single()
    if (argument !is IdlNamedType || argument.name != "undefined") return this
    return copy(returnType = type.copy(arguments = listOf(IdlNamedType("any"))))
}

/**
 * `namespace CSS { … }` → `interface CSS { static … }`. That is how the legacy IDL declared it (so the API keeps its
 * `abstract class CSS { companion object { … } }` shape), and dukat's common source set cannot emit
 * `expect external object`.
 */
private fun IdlDefinition.namespaceAsInterface(): IdlDefinition {
    if (this !is IdlNamespace) return this
    return IdlInterface(
        name = name,
        kind = IdlInterfaceKind.INTERFACE,
        partial = partial,
        inheritance = null,
        members = members.map { member ->
            when (member) {
                is IdlAttribute -> member.copy(special = IdlAttributeSpecial.STATIC)
                is IdlOperation -> member.copy(special = IdlOperationSpecial.STATIC)
                else -> member
            }
        },
        extAttrs = extAttrs,
    )
}

/** `Promise<CustomElementConstructor>` → `Promise<any>`: a Kotlin function type is not a `JsAny` type argument. */
private fun IdlType.eraseCallbackTypeArguments(callbacks: Set<String>): IdlType = when (this) {
    is IdlNamedType -> this
    is IdlUnionType -> copy(members = members.map { it.eraseCallbackTypeArguments(callbacks) })
    is IdlGenericType -> copy(arguments = arguments.map { argument ->
        if (argument is IdlNamedType && argument.name in callbacks) IdlNamedType("any")
        else argument.eraseCallbackTypeArguments(callbacks)
    })
}

/**
 * dukat prints dictionary defaults as Kotlin literals of the member's mapped type, which fails for string defaults of
 * union-typed members (`(MediaList or DOMString) media = ""`) and integer defaults of `long long` members (mapped to
 * `JsNumber`). Without a default the factory parameter is `undefined`, so JS applies the spec default instead.
 */
private fun IdlIR.dropInexpressibleDictionaryDefaults(): IdlIR = IdlIR(specs.map { spec ->
    spec.copy(definitions = spec.definitions.map { definition ->
        if (definition !is IdlDictionary) return@map definition
        definition.copy(members = definition.members.map { field ->
            val type = field.type
            val inexpressible = when {
                field.default == null || field.default == IdlValue.Null -> false
                type is IdlUnionType -> true
                type is IdlNamedType && type.name in setOf("long long", "unsigned long long") -> true
                else -> false
            }
            if (inexpressible) field.copy(default = null) else field
        })
    })
})

private fun IdlDefinition.mapTypes(transform: (IdlType) -> IdlType): IdlDefinition {
    fun IdlArgument.map() = copy(type = transform(type))
    fun IdlMember.map(): IdlMember = when (this) {
        is IdlAttribute -> copy(type = transform(type))
        is IdlConstant -> copy(type = transform(type))
        is IdlOperation -> copy(returnType = returnType?.let(transform), arguments = arguments.map { it.map() })
        is IdlConstructor -> copy(arguments = arguments.map { it.map() })
        is IdlDeclarationMember -> copy(typeArguments = typeArguments.map(transform), arguments = arguments.map { it.map() })
    }
    return when (this) {
        is IdlInterface -> copy(members = members.map { it.map() })
        is IdlNamespace -> copy(members = members.map { it.map() })
        is IdlDictionary -> copy(members = members.map { it.copy(type = transform(it.type)) })
        is IdlCallback -> copy(returnType = transform(returnType), arguments = arguments.map { it.map() })
        is IdlTypedef -> copy(type = transform(type))
        is IdlEnum, is IdlIncludes -> this
    }
}

/**
 * Puts each definition into its Kotlin package: [packageOverrides] first, then (for partials) the package of the main
 * definition, then the spec's package. Moved definitions go to synthetic spec entries, so dukat sees each declaration
 * and all its partials in one file.
 */
private fun IdlIR.relocated(packageOverrides: Map<String, String>): IdlIR {
    val mainPackage = mutableMapOf<String, String>()
    for (spec in specs) for (d in spec.definitions) {
        if (d is IdlNamedDefinition && !(d is IdlPartialable && d.partial)) mainPackage[d.name] = spec.packageName
    }
    val problems = packageOverrides.mapNotNull { (name, pkg) ->
        when (mainPackage[name]) {
            null -> "package override for '$name': no such definition"
            pkg -> "package override for '$name' is redundant: its spec already maps to $pkg"
            else -> null
        }
    }
    require(problems.isEmpty()) { problems.joinToString("\n") }

    fun target(d: IdlDefinition, spec: IdlSpec): String {
        if (d !is IdlNamedDefinition) return spec.packageName
        return packageOverrides[d.name] ?: mainPackage[d.name] ?: spec.packageName
    }

    val moved = mutableListOf<IdlSpec>()
    val kept = specs.map { spec ->
        val (stay, move) = spec.definitions.partition { target(it, spec) == spec.packageName }
        move.groupBy { target(it, spec) }.forEach { (pkg, definitions) -> moved += IdlSpec("${spec.name} (relocated)", pkg, definitions) }
        spec.copy(definitions = stay)
    }
    return IdlIR(kept + moved)
}
