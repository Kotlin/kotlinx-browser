/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: HAND-WRITTEN, NOT GENERATED.
// ECMAScript built-ins (ArrayBuffer, typed arrays, DataView) that Web IDL references but does not define.
// The generator treats these names as built-ins; see generator/src/main/kotlin/idl/surface/Builtins.kt.

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.khronos.webgl

import kotlin.js.*

/**
 * Exposes the JavaScript [ArrayBuffer](https://developer.mozilla.org/en/docs/Web/API/ArrayBuffer) to Kotlin
 */
public actual external open class ArrayBuffer actual constructor(length: Int) : BufferDataSource, JsAny {
    actual open val byteLength: Int
    actual fun slice(begin: Int, end: Int): ArrayBuffer

    actual companion object {
        actual fun isView(value: JsAny?): Boolean
    }
}

/**
 * Exposes the JavaScript [ArrayBufferView](https://developer.mozilla.org/en/docs/Web/API/ArrayBufferView) to Kotlin
 */
public actual external interface ArrayBufferView : BufferDataSource, JsAny {
    actual val buffer: ArrayBuffer
    actual val byteOffset: Int
    actual val byteLength: Int
}

/**
 * Exposes the JavaScript [Int8Array](https://developer.mozilla.org/en/docs/Web/API/Int8Array) to Kotlin
 */
public actual external open class Int8Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Int8Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int8Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int8Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt8Array(obj: Int8Array, index: Int): Byte = js("obj[index]")

public actual operator fun Int8Array.get(index: Int): Byte = getMethodImplForInt8Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt8Array(obj: Int8Array, index: Int, value: Byte) { js("obj[index] = value;") }

public actual operator fun Int8Array.set(index: Int, value: Byte) = setMethodImplForInt8Array(this, index, value)

/**
 * Exposes the JavaScript [Uint8Array](https://developer.mozilla.org/en/docs/Web/API/Uint8Array) to Kotlin
 */
public actual external open class Uint8Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint8Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint8Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint8Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint8Array(obj: Uint8Array, index: Int): Byte = js("obj[index]")

public actual operator fun Uint8Array.get(index: Int): Byte = getMethodImplForUint8Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint8Array(obj: Uint8Array, index: Int, value: Byte) { js("obj[index] = value;") }

public actual operator fun Uint8Array.set(index: Int, value: Byte) = setMethodImplForUint8Array(this, index, value)

/**
 * Exposes the JavaScript [Uint8ClampedArray](https://developer.mozilla.org/en/docs/Web/API/Uint8ClampedArray) to Kotlin
 */
public actual external open class Uint8ClampedArray : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint8ClampedArray)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint8ClampedArray, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint8ClampedArray

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint8ClampedArray(obj: Uint8ClampedArray, index: Int): Byte = js("obj[index]")

public actual operator fun Uint8ClampedArray.get(index: Int): Byte = getMethodImplForUint8ClampedArray(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint8ClampedArray(obj: Uint8ClampedArray, index: Int, value: Byte) { js("obj[index] = value;") }

public actual operator fun Uint8ClampedArray.set(index: Int, value: Byte) = setMethodImplForUint8ClampedArray(this, index, value)

/**
 * Exposes the JavaScript [Int16Array](https://developer.mozilla.org/en/docs/Web/API/Int16Array) to Kotlin
 */
public actual external open class Int16Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Int16Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int16Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int16Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt16Array(obj: Int16Array, index: Int): Short = js("obj[index]")

public actual operator fun Int16Array.get(index: Int): Short = getMethodImplForInt16Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt16Array(obj: Int16Array, index: Int, value: Short) { js("obj[index] = value;") }

public actual operator fun Int16Array.set(index: Int, value: Short) = setMethodImplForInt16Array(this, index, value)

/**
 * Exposes the JavaScript [Uint16Array](https://developer.mozilla.org/en/docs/Web/API/Uint16Array) to Kotlin
 */
public actual external open class Uint16Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint16Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint16Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint16Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint16Array(obj: Uint16Array, index: Int): Short = js("obj[index]")

public actual operator fun Uint16Array.get(index: Int): Short = getMethodImplForUint16Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint16Array(obj: Uint16Array, index: Int, value: Short) { js("obj[index] = value;") }

public actual operator fun Uint16Array.set(index: Int, value: Short) = setMethodImplForUint16Array(this, index, value)

/**
 * Exposes the JavaScript [Int32Array](https://developer.mozilla.org/en/docs/Web/API/Int32Array) to Kotlin
 */
public actual external open class Int32Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Int32Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Int32Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Int32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt32Array(obj: Int32Array, index: Int): Int = js("obj[index]")

public actual operator fun Int32Array.get(index: Int): Int = getMethodImplForInt32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt32Array(obj: Int32Array, index: Int, value: Int) { js("obj[index] = value;") }

public actual operator fun Int32Array.set(index: Int, value: Int) = setMethodImplForInt32Array(this, index, value)

/**
 * Exposes the JavaScript [Uint32Array](https://developer.mozilla.org/en/docs/Web/API/Uint32Array) to Kotlin
 */
public actual external open class Uint32Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Uint32Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Uint32Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Uint32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint32Array(obj: Uint32Array, index: Int): Int = js("obj[index]")

public actual operator fun Uint32Array.get(index: Int): Int = getMethodImplForUint32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint32Array(obj: Uint32Array, index: Int, value: Int) { js("obj[index] = value;") }

public actual operator fun Uint32Array.set(index: Int, value: Int) = setMethodImplForUint32Array(this, index, value)

/**
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 */
public actual external open class Float32Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Float32Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Float32Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Float32Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFloat32Array(obj: Float32Array, index: Int): Float = js("obj[index]")

public actual operator fun Float32Array.get(index: Int): Float = getMethodImplForFloat32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForFloat32Array(obj: Float32Array, index: Int, value: Float) { js("obj[index] = value;") }

public actual operator fun Float32Array.set(index: Int, value: Float) = setMethodImplForFloat32Array(this, index, value)

/**
 * Exposes the JavaScript [Float64Array](https://developer.mozilla.org/en/docs/Web/API/Float64Array) to Kotlin
 */
public actual external open class Float64Array : ArrayBufferView, JsAny {
    actual constructor(length: Int)
    actual constructor(array: Float64Array)
    actual constructor(array: JsArray<JsNumber>)
    actual constructor(buffer: ArrayBuffer, byteOffset: Int, length: Int)
    actual open val length: Int
    actual override val buffer: ArrayBuffer
    actual override val byteOffset: Int
    actual override val byteLength: Int
    actual fun set(array: Float64Array, offset: Int)
    actual fun set(array: JsArray<JsNumber>, offset: Int)
    actual fun subarray(start: Int, end: Int): Float64Array

    actual companion object {
        actual val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFloat64Array(obj: Float64Array, index: Int): Double = js("obj[index]")

public actual operator fun Float64Array.get(index: Int): Double = getMethodImplForFloat64Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForFloat64Array(obj: Float64Array, index: Int, value: Double) { js("obj[index] = value;") }

public actual operator fun Float64Array.set(index: Int, value: Double) = setMethodImplForFloat64Array(this, index, value)

/**
 * Exposes the JavaScript [DataView](https://developer.mozilla.org/en/docs/Web/API/DataView) to Kotlin
 */
public actual external open class DataView actual constructor(buffer: ArrayBuffer, byteOffset: Int, byteLength: Int) : ArrayBufferView, JsAny {
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
