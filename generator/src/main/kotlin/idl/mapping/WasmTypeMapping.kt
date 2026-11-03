/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.mapping

import org.jetbrains.kotlin.tools.idl.ir.IdlGenericType
import org.jetbrains.kotlin.tools.idl.ir.IdlNamedType
import org.jetbrains.kotlin.tools.idl.ir.IdlType
import org.jetbrains.kotlin.tools.idl.ir.IdlUnionType
import org.jetbrains.kotlin.tools.idl.surface.Builtins

/** A Kotlin type as the Kotlin/Wasm backend will print it. */
sealed interface KotlinType {
    val nullable: Boolean

    /** A concrete Kotlin type with a fully-qualified name, e.g. `kotlin.js.JsArray<kotlin.js.JsString>`. */
    data class Named(
        val fqName: String,
        val typeArguments: List<KotlinType> = emptyList(),
        override val nullable: Boolean = false,
    ) : KotlinType

    /**
     * A reference to an IDL definition (interface, dictionary, enum, callback, typedef). Its Kotlin package and shape
     * are decided by the backend once lowerings have resolved typedefs, mixins and partials.
     */
    data class Reference(val idlName: String, override val nullable: Boolean = false) : KotlinType

    /** A Web IDL union. The backend expands it into a (name-aware) overload set; it is never printed as a type. */
    data class Union(val alternatives: List<KotlinType>, override val nullable: Boolean = false) : KotlinType
}

/**
 * Where a type occurs. Kotlin/Wasm interop allows Kotlin primitives and `String` in signatures, but type arguments of
 * external generics (`JsArray<T>`, `Promise<T>`) are bounded by `JsAny?`, so the same IDL type maps differently.
 */
enum class TypePosition {
    /** Attribute, argument, dictionary member, constant. */
    VALUE,

    /** Operation/callback return type: additionally allows `undefined` → `Unit`. */
    RETURN,

    /** Type argument of a generic: must be a `JsAny?` subtype. */
    TYPE_ARGUMENT,
}

class UnmappableTypeException(message: String) : IllegalArgumentException(message)

/**
 * The Web IDL → Kotlin/Wasm type mapping. This is part of the generator's contract: the backend must not
 * post-process its result (no `ReplaceDynamics`-style passes), and `dynamic` cannot appear in it.
 *
 * | Web IDL                                   | VALUE / RETURN      | TYPE_ARGUMENT        |
 * |-------------------------------------------|---------------------|----------------------|
 * | `undefined`                               | `Unit` (RETURN only)| `JsAny?`             |
 * | `any`                                     | `JsAny?`            | `JsAny?`             |
 * | `object`, `record<K, V>`, `DOMError`      | `JsAny`             | `JsAny`              |
 * | `boolean`                                 | `Boolean`           | `JsBoolean`          |
 * | `byte`, `octet`                           | `Byte`              | `JsNumber`           |
 * | `short`, `unsigned short`                 | `Short`             | `JsNumber`           |
 * | `long`, `unsigned long`                   | `Int`               | `JsNumber`           |
 * | `long long`, `unsigned long long`         | `Double`            | `JsNumber`           |
 * | `float`, `unrestricted float`             | `Float`             | `JsNumber`           |
 * | `double`, `unrestricted double`           | `Double`            | `JsNumber`           |
 * | `bigint`                                  | `JsBigInt`          | `JsBigInt`           |
 * | `DOMString`, `USVString`, `ByteString`, `CSSOMString` | `String` | `JsString`          |
 * | `sequence<T>`, `FrozenArray<T>`, `ObservableArray<T>` | `JsArray<T>` | same             |
 * | `Promise<T>`                              | `Promise<T>`        | same                 |
 * | `async_sequence<T>`                       | `JsAny`             | `JsAny`              |
 * | `ArrayBuffer`, `ArrayBufferView`, `DataView`, typed arrays | `org.khronos.webgl.*` | same     |
 * | `BufferSource`, `AllowSharedBufferSource` | `org.khronos.webgl.BufferDataSource` | same |
 * | union                                     | [KotlinType.Union]  | `JsAny`              |
 * | `(undefined or T)`                        | `T?`                | `T?`                 |
 * | `WindowProxy`                              | `Window` reference  | same                 |
 * | any other name                            | [KotlinType.Reference] | same              |
 *
 * `long long` deliberately maps to `Double`, not `JsBigInt`: per the Web IDL ECMAScript binding, `long long` and
 * `unsigned long long` values are JS Numbers (e.g. `Blob.size`). Only the IDL `bigint` type is a JS BigInt.
 * `Double` is exact up to 2^53, which is all a JS Number can carry anyway; Kotlin `Long` would be wrong too, because
 * Kotlin/Wasm marshals `Long` as BigInt.
 */
object WasmTypeMapping {

    fun map(type: IdlType, position: TypePosition): KotlinType = when (type) {
        is IdlNamedType -> mapNamed(type, position)
        is IdlGenericType -> mapGeneric(type, position)
        is IdlUnionType -> mapUnion(type, position)
    }

    /** `undefined` inside a union (`(undefined or CSSStyleValue)`) reads as "absent" and becomes nullability. */
    private fun mapUnion(type: IdlUnionType, position: TypePosition): KotlinType {
        val (undefined, members) = type.members.partition { it is IdlNamedType && it.name == "undefined" }
        val nullable = type.nullable || undefined.isNotEmpty()
        return when {
            members.size == 1 -> map(members.single(), position).withNullability(nullable || members.single().nullable)
            // A union inside a generic cannot become an overload set; the closest JsAny-bounded type is JsAny.
            position == TypePosition.TYPE_ARGUMENT -> KotlinType.Named(JS_ANY, nullable = nullable || members.any { it.nullable })
            else -> KotlinType.Union(members.map { map(it, TypePosition.VALUE) }, nullable)
        }
    }

    private fun KotlinType.withNullability(nullable: Boolean): KotlinType = when (this) {
        is KotlinType.Named -> copy(nullable = nullable)
        is KotlinType.Reference -> copy(nullable = nullable)
        is KotlinType.Union -> copy(nullable = nullable)
    }

    private fun mapNamed(type: IdlNamedType, position: TypePosition): KotlinType {
        val name = type.name
        val typeArgument = position == TypePosition.TYPE_ARGUMENT
        fun named(fqName: String, nullable: Boolean = type.nullable) = KotlinType.Named(fqName, nullable = nullable)

        return when (name) {
            "undefined" -> when (position) {
                TypePosition.RETURN -> named("kotlin.Unit", nullable = false)
                TypePosition.TYPE_ARGUMENT -> named(JS_ANY, nullable = true)
                TypePosition.VALUE -> throw UnmappableTypeException("'undefined' is only valid as a return type or type argument")
            }

            "any" -> named(JS_ANY, nullable = true)
            "object", "DOMError" -> named(JS_ANY)
            "boolean" -> named(if (typeArgument) "kotlin.js.JsBoolean" else "kotlin.Boolean")
            "bigint" -> named("kotlin.js.JsBigInt")
            in STRING_TYPES -> named(if (typeArgument) "kotlin.js.JsString" else "kotlin.String")
            in NUMERIC_TYPES -> named(if (typeArgument) "kotlin.js.JsNumber" else NUMERIC_TYPES.getValue(name))
            in BUFFER_TYPES -> named(BUFFER_TYPES.getValue(name))
            in Builtins.ALIASES -> KotlinType.Reference(Builtins.ALIASES.getValue(name), type.nullable)
            else -> KotlinType.Reference(name, type.nullable)
        }
    }

    private fun mapGeneric(type: IdlGenericType, position: TypePosition): KotlinType {
        fun arg(i: Int) = map(type.arguments[i], TypePosition.TYPE_ARGUMENT)
        return when (type.generic) {
            "sequence", "FrozenArray", "ObservableArray" ->
                KotlinType.Named("kotlin.js.JsArray", listOf(arg(0)), type.nullable)

            "Promise" -> KotlinType.Named("kotlin.js.Promise", listOf(arg(0)), type.nullable)
            "record", "async_sequence" -> KotlinType.Named(JS_ANY, nullable = type.nullable)
            else -> throw UnmappableTypeException("unknown generic type '${type.generic}' in position $position")
        }
    }

    private const val JS_ANY = "kotlin.js.JsAny"

    val STRING_TYPES: Set<String> = setOf("DOMString", "USVString", "ByteString", "CSSOMString")

    val NUMERIC_TYPES: Map<String, String> = mapOf(
        "byte" to "kotlin.Byte",
        "octet" to "kotlin.Byte",
        "short" to "kotlin.Short",
        "unsigned short" to "kotlin.Short",
        "long" to "kotlin.Int",
        "unsigned long" to "kotlin.Int",
        "long long" to "kotlin.Double",
        "unsigned long long" to "kotlin.Double",
        "float" to "kotlin.Float",
        "unrestricted float" to "kotlin.Float",
        "double" to "kotlin.Double",
        "unrestricted double" to "kotlin.Double",
    )

    val BUFFER_TYPES: Map<String, String> = listOf(
        "ArrayBuffer", "ArrayBufferView", "DataView",
        "Int8Array", "Int16Array", "Int32Array",
        "Uint8Array", "Uint16Array", "Uint32Array", "Uint8ClampedArray",
        "Float32Array", "Float64Array",
    ).associateWith { "org.khronos.webgl.$it" } + mapOf(
        "BufferSource" to "org.khronos.webgl.BufferDataSource",
        "AllowSharedBufferSource" to "org.khronos.webgl.BufferDataSource",
    )
}
