/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: HAND-WRITTEN, NOT GENERATED.
// ECMAScript built-ins (ArrayBuffer, typed arrays, DataView) that Web IDL references but does not define.
// The generator treats these names as built-ins; see generator/src/main/kotlin/idl/surface/Builtins.kt.

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.khronos.webgl

import kotlin.js.*

/**
 * Exposes the JavaScript [ArrayBuffer](https://developer.mozilla.org/en/docs/Web/API/ArrayBuffer) to Kotlin
 */
public actual open external class ArrayBuffer actual constructor(length: Int) : BufferDataSource {
    actual open val byteLength: Int
    actual fun slice(begin: Int, end: Int): ArrayBuffer

    actual companion object {
        actual fun isView(value: Any?): Boolean
    }
}

/**
 * Exposes the JavaScript [ArrayBufferView](https://developer.mozilla.org/en/docs/Web/API/ArrayBufferView) to Kotlin
 */
public actual external interface ArrayBufferView : BufferDataSource {
    actual val buffer: ArrayBuffer
    actual val byteOffset: Int
    actual val byteLength: Int
}

/**
 * Exposes the JavaScript [Int8Array](https://developer.mozilla.org/en/docs/Web/API/Int8Array) to Kotlin
 */
public actual open external class Int8Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Int8Array)
    constructor(array: Array<Byte>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int8Array, offset: Int)
    fun set(array: Array<Byte>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int8Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Int8Array.get(index: Int): Byte = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Int8Array.set(index: Int, value: Byte) { asDynamic()[index] = value }

/**
 * Exposes the JavaScript [Uint8Array](https://developer.mozilla.org/en/docs/Web/API/Uint8Array) to Kotlin
 */
public actual open external class Uint8Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Uint8Array)
    constructor(array: Array<Byte>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint8Array, offset: Int)
    fun set(array: Array<Byte>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint8Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint8Array.get(index: Int): UByte = asDynamic()[index].unsafeCast<Int>().toUByte()

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint8Array.set(index: Int, value: UByte) { asDynamic()[index] = value.toInt() }

/**
 * Exposes the JavaScript [Uint8ClampedArray](https://developer.mozilla.org/en/docs/Web/API/Uint8ClampedArray) to Kotlin
 */
public actual open external class Uint8ClampedArray : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Uint8ClampedArray)
    constructor(array: Array<Byte>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint8ClampedArray, offset: Int)
    fun set(array: Array<Byte>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint8ClampedArray

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint8ClampedArray.get(index: Int): UByte = asDynamic()[index].unsafeCast<Int>().toUByte()

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint8ClampedArray.set(index: Int, value: UByte) { asDynamic()[index] = value.toInt() }

/**
 * Exposes the JavaScript [Int16Array](https://developer.mozilla.org/en/docs/Web/API/Int16Array) to Kotlin
 */
public actual open external class Int16Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Int16Array)
    constructor(array: Array<Short>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int16Array, offset: Int)
    fun set(array: Array<Short>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int16Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Int16Array.get(index: Int): Short = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Int16Array.set(index: Int, value: Short) { asDynamic()[index] = value }

/**
 * Exposes the JavaScript [Uint16Array](https://developer.mozilla.org/en/docs/Web/API/Uint16Array) to Kotlin
 */
public actual open external class Uint16Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Uint16Array)
    constructor(array: Array<Short>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint16Array, offset: Int)
    fun set(array: Array<Short>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint16Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint16Array.get(index: Int): UShort = asDynamic()[index].unsafeCast<Int>().toUShort()

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint16Array.set(index: Int, value: UShort) { asDynamic()[index] = value.toInt() }

/**
 * Exposes the JavaScript [Int32Array](https://developer.mozilla.org/en/docs/Web/API/Int32Array) to Kotlin
 */
public actual open external class Int32Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Int32Array)
    constructor(array: Array<Int>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int32Array, offset: Int)
    fun set(array: Array<Int>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Int32Array.get(index: Int): Int = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Int32Array.set(index: Int, value: Int) { asDynamic()[index] = value }

/**
 * Exposes the JavaScript [Uint32Array](https://developer.mozilla.org/en/docs/Web/API/Uint32Array) to Kotlin
 */
public actual open external class Uint32Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Uint32Array)
    constructor(array: Array<Int>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint32Array, offset: Int)
    fun set(array: Array<Int>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint32Array.get(index: Int): UInt = asDynamic()[index].unsafeCast<Double>().toUInt()

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Uint32Array.set(index: Int, value: UInt) { asDynamic()[index] = value.toInt() }

/**
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 */
public actual open external class Float32Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Float32Array)
    constructor(array: Array<Float>)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Float32Array, offset: Int)
    fun set(array: Array<Float>, offset: Int = definedExternally)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Float32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Float32Array.get(index: Int): Float = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Float32Array.set(index: Int, value: Float) { asDynamic()[index] = value }

/**
 * Exposes the JavaScript [Float64Array](https://developer.mozilla.org/en/docs/Web/API/Float64Array) to Kotlin
 */
public actual open external class Float64Array : ArrayBufferView {
    actual constructor(length: Int)
    actual constructor(array: Float64Array)
    actual constructor(array: Array<Double>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Float64Array, offset: Int)
    actual fun set(array: Array<Double>, offset: Int)
    actual fun subarray(start: Int, end: Int): Float64Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Float64Array.get(index: Int): Double = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public actual inline operator fun Float64Array.set(index: Int, value: Double) { asDynamic()[index] = value }

/**
 * Exposes the JavaScript [DataView](https://developer.mozilla.org/en/docs/Web/API/DataView) to Kotlin
 */
public actual open external class DataView actual constructor(buffer: ArrayBuffer, byteOffset: Int, byteLength: Int) : ArrayBufferView {
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun getInt8(byteOffset: Int): Byte
    actual fun getUint8(byteOffset: Int): Byte
    actual fun getInt16(byteOffset: Int, littleEndian: Boolean): Short
    actual fun getUint16(byteOffset: Int, littleEndian: Boolean): Short
    actual fun getInt32(byteOffset: Int, littleEndian: Boolean): Int
    actual fun getUint32(byteOffset: Int, littleEndian: Boolean): Int
    actual fun getFloat32(byteOffset: Int, littleEndian: Boolean): Float
    actual fun getFloat64(byteOffset: Int, littleEndian: Boolean): Double
    actual fun setInt8(byteOffset: Int, value: Byte)
    actual fun setUint8(byteOffset: Int, value: Byte)
    actual fun setInt16(byteOffset: Int, value: Short, littleEndian: Boolean)
    actual fun setUint16(byteOffset: Int, value: Short, littleEndian: Boolean)
    actual fun setInt32(byteOffset: Int, value: Int, littleEndian: Boolean)
    actual fun setUint32(byteOffset: Int, value: Int, littleEndian: Boolean)
    actual fun setFloat32(byteOffset: Int, value: Float, littleEndian: Boolean)
    actual fun setFloat64(byteOffset: Int, value: Double, littleEndian: Boolean)
}

public actual external interface BufferDataSource
