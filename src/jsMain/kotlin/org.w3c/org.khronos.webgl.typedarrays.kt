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
    public actual open val byteLength: Int
    public actual fun slice(begin: Int, end: Int): ArrayBuffer

    public actual companion object {
        public actual fun isView(value: Any?): Boolean
    }
}

/**
 * Exposes the JavaScript [ArrayBufferView](https://developer.mozilla.org/en/docs/Web/API/ArrayBufferView) to Kotlin
 */
public actual external interface ArrayBufferView : BufferDataSource {
    public actual val buffer: ArrayBuffer
    public actual val byteOffset: Int
    public actual val byteLength: Int
}

/**
 * Exposes the JavaScript [Int8Array](https://developer.mozilla.org/en/docs/Web/API/Int8Array) to Kotlin
 */
public actual open external class Int8Array : ArrayBufferView {
    public actual constructor(length: Int)
    public actual constructor(array: Int8Array)
    public constructor(array: Array<Byte>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Int8Array, offset: Int)
    public fun set(array: Array<Byte>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Int8Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Uint8Array)
    public constructor(array: Array<Byte>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Uint8Array, offset: Int)
    public fun set(array: Array<Byte>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Uint8Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Uint8ClampedArray)
    public constructor(array: Array<Byte>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Uint8ClampedArray, offset: Int)
    public fun set(array: Array<Byte>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Uint8ClampedArray

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Int16Array)
    public constructor(array: Array<Short>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Int16Array, offset: Int)
    public fun set(array: Array<Short>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Int16Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Uint16Array)
    public constructor(array: Array<Short>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Uint16Array, offset: Int)
    public fun set(array: Array<Short>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Uint16Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Int32Array)
    public constructor(array: Array<Int>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Int32Array, offset: Int)
    public fun set(array: Array<Int>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Int32Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Uint32Array)
    public constructor(array: Array<Int>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Uint32Array, offset: Int)
    public fun set(array: Array<Int>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Uint32Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Float32Array)
    public constructor(array: Array<Float>)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Float32Array, offset: Int)
    public fun set(array: Array<Float>, offset: Int = definedExternally)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Float32Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual constructor(length: Int)
    public actual constructor(array: Float64Array)
    public actual constructor(array: Array<Double>)
    public actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    public actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    public actual fun set(array: Float64Array, offset: Int)
    public actual fun set(array: Array<Double>, offset: Int)
    public actual fun subarray(start: Int, end: Int): Float64Array

    public actual companion object {
        public actual val BYTES_PER_ELEMENT: Int
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
    public actual fun getInt8(byteOffset: Int): Byte
    public actual fun getUint8(byteOffset: Int): Byte
    public actual fun getInt16(byteOffset: Int, littleEndian: Boolean): Short
    public actual fun getUint16(byteOffset: Int, littleEndian: Boolean): Short
    public actual fun getInt32(byteOffset: Int, littleEndian: Boolean): Int
    public actual fun getUint32(byteOffset: Int, littleEndian: Boolean): Int
    public actual fun getFloat32(byteOffset: Int, littleEndian: Boolean): Float
    public actual fun getFloat64(byteOffset: Int, littleEndian: Boolean): Double
    public actual fun setInt8(byteOffset: Int, value: Byte)
    public actual fun setUint8(byteOffset: Int, value: Byte)
    public actual fun setInt16(byteOffset: Int, value: Short, littleEndian: Boolean)
    public actual fun setUint16(byteOffset: Int, value: Short, littleEndian: Boolean)
    public actual fun setInt32(byteOffset: Int, value: Int, littleEndian: Boolean)
    public actual fun setUint32(byteOffset: Int, value: Int, littleEndian: Boolean)
    public actual fun setFloat32(byteOffset: Int, value: Float, littleEndian: Boolean)
    public actual fun setFloat64(byteOffset: Int, value: Double, littleEndian: Boolean)
}

public actual external interface BufferDataSource
