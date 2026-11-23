/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.ir

/*
 * The kotlinx-browser Web IDL intermediate representation.
 *
 * Design rules:
 *  - The IR mirrors the webidl2.js AST (https://github.com/w3c/webidl2.js#ast), not Kotlin.
 *    The front-end is a mechanical translation; all platform knowledge lives in lowerings and the backend.
 *  - Nothing is normalised away: IDL type names are kept as written ("unsigned long long", "undefined"),
 *    extended attributes are kept on every node that can carry them (definitions, members, arguments, types),
 *    and member order is preserved.
 *  - No Kotlin concepts (no `dynamic`, no `Unit`, no packages-as-NameEntity). The Kotlin package a spec lands
 *    in is the only exception, and it is carried as plain data on [IdlSpec].
 */

/** The whole input: one entry per webref spec shortname, in a deterministic order. */
data class IdlIR(val specs: List<IdlSpec>) {
    val definitions: Sequence<IdlDefinition> get() = specs.asSequence().flatMap { it.definitions }
}

/**
 * All definitions of one webref spec (one `@webref/idl` file).
 *
 * @property name webref spec shortname, e.g. `html`, `dom`, `webgl1`.
 * @property packageName Kotlin package the spec is generated into (from the spec allowlist).
 */
data class IdlSpec(
    val name: String,
    val packageName: String,
    val definitions: List<IdlDefinition>,
)

// ---------------------------------------------------------------------------------------------------------------------
// Definitions
// ---------------------------------------------------------------------------------------------------------------------

sealed interface IdlDefinition {
    val extAttrs: List<IdlExtendedAttribute>
}

/** A definition that introduces a name (everything except `includes`). */
sealed interface IdlNamedDefinition : IdlDefinition {
    val name: String
}

/** Definitions that may be declared `partial`. */
sealed interface IdlPartialable : IdlNamedDefinition {
    val partial: Boolean
}

enum class IdlInterfaceKind {
    /** `interface X {}` */
    INTERFACE,

    /** `interface mixin X {}` */
    MIXIN,

    /** `callback interface X {}` */
    CALLBACK_INTERFACE,
}

/** `interface`, `interface mixin` and `callback interface`. */
data class IdlInterface(
    override val name: String,
    val kind: IdlInterfaceKind,
    override val partial: Boolean,
    /** Parent interface name; always `null` for mixins. */
    val inheritance: String?,
    val members: List<IdlMember>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlPartialable

data class IdlNamespace(
    override val name: String,
    override val partial: Boolean,
    val members: List<IdlMember>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlPartialable

data class IdlDictionary(
    override val name: String,
    override val partial: Boolean,
    val inheritance: String?,
    val members: List<IdlField>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlPartialable

/** `callback Name = ReturnType (args);` */
data class IdlCallback(
    override val name: String,
    val returnType: IdlType,
    val arguments: List<IdlArgument>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlNamedDefinition

data class IdlEnum(
    override val name: String,
    /** Enum values, unquoted, in declaration order. */
    val values: List<String>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlNamedDefinition

data class IdlTypedef(
    override val name: String,
    val type: IdlType,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlNamedDefinition

/** `Target includes Mixin;` */
data class IdlIncludes(
    val target: String,
    val mixin: String,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlDefinition

// ---------------------------------------------------------------------------------------------------------------------
// Members
// ---------------------------------------------------------------------------------------------------------------------

sealed interface IdlMember {
    val extAttrs: List<IdlExtendedAttribute>
}

/** `const T NAME = value;` */
data class IdlConstant(
    val name: String,
    val type: IdlType,
    val value: IdlValue,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlMember

enum class IdlAttributeSpecial { STATIC, STRINGIFIER, INHERIT }

data class IdlAttribute(
    val name: String,
    val type: IdlType,
    val readonly: Boolean,
    val special: IdlAttributeSpecial?,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlMember

enum class IdlOperationSpecial { STATIC, GETTER, SETTER, DELETER, STRINGIFIER }

/**
 * A regular, static or special operation.
 *
 * The bare `stringifier;` form has neither a name nor a return type: [name] is `null` and [returnType] is `null`.
 * Anonymous special operations (`getter Foo (unsigned long index);`) have [name] == `null` and a non-null [returnType].
 */
data class IdlOperation(
    val name: String?,
    val returnType: IdlType?,
    val arguments: List<IdlArgument>,
    val special: IdlOperationSpecial?,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlMember

/** `constructor(args);` */
data class IdlConstructor(
    val arguments: List<IdlArgument>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlMember

enum class IdlDeclarationMemberKind { ITERABLE, ASYNC_ITERABLE, MAPLIKE, SETLIKE }

/**
 * `iterable<V>`, `iterable<K, V>`, `async iterable<V>(args)`, `maplike<K, V>`, `setlike<V>`.
 *
 * @property typeArguments one (value) or two (key, value) types, as written.
 * @property arguments only non-empty for `async iterable`.
 */
data class IdlDeclarationMember(
    val kind: IdlDeclarationMemberKind,
    val typeArguments: List<IdlType>,
    val readonly: Boolean,
    val arguments: List<IdlArgument>,
    override val extAttrs: List<IdlExtendedAttribute>,
) : IdlMember

/** A dictionary member. */
data class IdlField(
    val name: String,
    val type: IdlType,
    val required: Boolean,
    val default: IdlValue?,
    val extAttrs: List<IdlExtendedAttribute>,
)

data class IdlArgument(
    val name: String,
    val type: IdlType,
    val optional: Boolean,
    val variadic: Boolean,
    val default: IdlValue?,
    val extAttrs: List<IdlExtendedAttribute>,
)

// ---------------------------------------------------------------------------------------------------------------------
// Types
// ---------------------------------------------------------------------------------------------------------------------

sealed interface IdlType {
    val nullable: Boolean

    /** Type-level extended attributes, e.g. `[LegacyNullToEmptyString] DOMString`, `[AllowShared] BufferSource`. */
    val extAttrs: List<IdlExtendedAttribute>
}

/**
 * A non-generic, non-union type, kept exactly as spelled in IDL:
 * primitives (`unsigned long long`, `unrestricted double`, `bigint`, `undefined`, `any`, `object`, …),
 * string types (`DOMString`, `USVString`, `ByteString`), and references to named definitions.
 */
data class IdlNamedType(
    val name: String,
    override val nullable: Boolean = false,
    override val extAttrs: List<IdlExtendedAttribute> = emptyList(),
) : IdlType

/** `sequence<T>`, `FrozenArray<T>`, `ObservableArray<T>`, `Promise<T>`, `record<K, V>`, `async_sequence<T>`. */
data class IdlGenericType(
    val generic: String,
    val arguments: List<IdlType>,
    override val nullable: Boolean = false,
    override val extAttrs: List<IdlExtendedAttribute> = emptyList(),
) : IdlType

data class IdlUnionType(
    val members: List<IdlType>,
    override val nullable: Boolean = false,
    override val extAttrs: List<IdlExtendedAttribute> = emptyList(),
    /**
     * The typedef this union was inlined from (`CanvasImageSource`), set by `resolveTypedefs`; `null` for a union
     * written out in place. It names the union's marker interface, if it gets one.
     */
    val typedef: String? = null,
) : IdlType

// ---------------------------------------------------------------------------------------------------------------------
// Values (constants and defaults)
// ---------------------------------------------------------------------------------------------------------------------

sealed interface IdlValue {
    /** String literal, unquoted. */
    data class Str(val value: String) : IdlValue

    /** Numeric literal kept verbatim (`0x88FE`, `-1`, `1.5e3`), so no precision or radix information is lost. */
    data class Num(val literal: String) : IdlValue

    data class Bool(val value: Boolean) : IdlValue

    data class Infinity(val negative: Boolean) : IdlValue

    object NaN : IdlValue { override fun toString() = "NaN" }

    object Null : IdlValue { override fun toString() = "Null" }

    /** `[]` */
    object EmptySequence : IdlValue { override fun toString() = "EmptySequence" }

    /** `{}` */
    object EmptyDictionary : IdlValue { override fun toString() = "EmptyDictionary" }
}

// ---------------------------------------------------------------------------------------------------------------------
// Extended attributes
// ---------------------------------------------------------------------------------------------------------------------

/**
 * `[Name]`, `[Name=rhs]`, `[Name(args)]`, `[Name=rhs(args)]`.
 *
 * Kept structurally rather than as text, so that `[Exposed=*]`, `[Reflect="rel"]` and `[ReflectRange=(0,1)]`
 * survive intact.
 */
data class IdlExtendedAttribute(
    val name: String,
    val rhs: IdlExtendedAttributeValue?,
    /** Argument list for `[Name(args)]` / `[Name=Ident(args)]`; empty otherwise. */
    val arguments: List<IdlArgument> = emptyList(),
)

sealed interface IdlExtendedAttributeValue {
    data class Identifier(val value: String) : IdlExtendedAttributeValue
    data class IdentifierList(val values: List<String>) : IdlExtendedAttributeValue

    /** Unquoted. */
    data class StringValue(val value: String) : IdlExtendedAttributeValue

    /** Unquoted items. */
    data class StringList(val values: List<String>) : IdlExtendedAttributeValue
    data class Integer(val literal: String) : IdlExtendedAttributeValue
    data class IntegerList(val literals: List<String>) : IdlExtendedAttributeValue
    data class Decimal(val literal: String) : IdlExtendedAttributeValue
    data class DecimalList(val literals: List<String>) : IdlExtendedAttributeValue

    /** `*`, as in `[Exposed=*]`. */
    object Wildcard : IdlExtendedAttributeValue { override fun toString() = "Wildcard" }
}

fun List<IdlExtendedAttribute>.find(name: String): IdlExtendedAttribute? = firstOrNull { it.name == name }

fun List<IdlExtendedAttribute>.has(name: String): Boolean = any { it.name == name }
