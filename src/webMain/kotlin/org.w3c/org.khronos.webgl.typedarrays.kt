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
public expect open class ArrayBuffer(length: Int) : BufferDataSource, JsAny {
    public open val byteLength: Int
    public fun slice(begin: Int, end: Int = definedExternally): ArrayBuffer

    public companion object {
        public fun isView(value: JsAny?): Boolean
    }
}

/**
 * Exposes the JavaScript [ArrayBufferView](https://developer.mozilla.org/en/docs/Web/API/ArrayBufferView) to Kotlin
 */
public expect interface ArrayBufferView : BufferDataSource, JsAny {
    public val buffer: ArrayBuffer
    public val byteOffset: Int
    public val byteLength: Int
}

/**
 * Exposes the JavaScript [Int8Array](https://developer.mozilla.org/en/docs/Web/API/Int8Array) to Kotlin
 */
public expect open class Int8Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Int8Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Int8Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Int8Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Int8Array.get(index: Int): Byte

public expect operator fun Int8Array.set(index: Int, value: Byte)

/**
 * Exposes the JavaScript [Uint8Array](https://developer.mozilla.org/en/docs/Web/API/Uint8Array) to Kotlin
 */
public expect open class Uint8Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Uint8Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Uint8Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Uint8Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Uint8Array.get(index: Int): UByte

public expect operator fun Uint8Array.set(index: Int, value: UByte)

/**
 * Exposes the JavaScript [Uint8ClampedArray](https://developer.mozilla.org/en/docs/Web/API/Uint8ClampedArray) to Kotlin
 */
public expect open class Uint8ClampedArray : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Uint8ClampedArray)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Uint8ClampedArray, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Uint8ClampedArray

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Uint8ClampedArray.get(index: Int): UByte

public expect operator fun Uint8ClampedArray.set(index: Int, value: UByte)

/**
 * Exposes the JavaScript [Int16Array](https://developer.mozilla.org/en/docs/Web/API/Int16Array) to Kotlin
 */
public expect open class Int16Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Int16Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Int16Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Int16Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Int16Array.get(index: Int): Short

public expect operator fun Int16Array.set(index: Int, value: Short)

/**
 * Exposes the JavaScript [Uint16Array](https://developer.mozilla.org/en/docs/Web/API/Uint16Array) to Kotlin
 */
public expect open class Uint16Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Uint16Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Uint16Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Uint16Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Uint16Array.get(index: Int): UShort

public expect operator fun Uint16Array.set(index: Int, value: UShort)

/**
 * Exposes the JavaScript [Int32Array](https://developer.mozilla.org/en/docs/Web/API/Int32Array) to Kotlin
 */
public expect open class Int32Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Int32Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Int32Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Int32Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Int32Array.get(index: Int): Int

public expect operator fun Int32Array.set(index: Int, value: Int)

/**
 * Exposes the JavaScript [Uint32Array](https://developer.mozilla.org/en/docs/Web/API/Uint32Array) to Kotlin
 */
public expect open class Uint32Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Uint32Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Uint32Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Uint32Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Uint32Array.get(index: Int): UInt

public expect operator fun Uint32Array.set(index: Int, value: UInt)

/**
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 */
public expect open class Float32Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Float32Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Float32Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Float32Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Float32Array.get(index: Int): Float

public expect operator fun Float32Array.set(index: Int, value: Float)

/**
 * Exposes the JavaScript [Float64Array](https://developer.mozilla.org/en/docs/Web/API/Float64Array) to Kotlin
 */
public expect open class Float64Array : ArrayBufferView, JsAny {
    public constructor(length: Int)
    public constructor(array: Float64Array)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    public open val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun set(array: Float64Array, offset: Int = definedExternally)
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)
    public fun subarray(start: Int, end: Int): Float64Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

public expect operator fun Float64Array.get(index: Int): Double

public expect operator fun Float64Array.set(index: Int, value: Double)

/**
 * Exposes the JavaScript [DataView](https://developer.mozilla.org/en/docs/Web/API/DataView) to Kotlin
 */
public expect open class DataView(buffer: ArrayBuffer, byteOffset: Int = definedExternally, byteLength: Int = definedExternally) : ArrayBufferView, JsAny {
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun getInt8(byteOffset: Int): Byte
    public fun getUint8(byteOffset: Int): Byte
    public fun getInt16(byteOffset: Int, littleEndian: Boolean = definedExternally): Short
    public fun getUint16(byteOffset: Int, littleEndian: Boolean = definedExternally): Short
    public fun getInt32(byteOffset: Int, littleEndian: Boolean = definedExternally): Int
    public fun getUint32(byteOffset: Int, littleEndian: Boolean = definedExternally): Int
    public fun getFloat32(byteOffset: Int, littleEndian: Boolean = definedExternally): Float
    public fun getFloat64(byteOffset: Int, littleEndian: Boolean = definedExternally): Double
    public fun setInt8(byteOffset: Int, value: Byte)
    public fun setUint8(byteOffset: Int, value: Byte)
    public fun setInt16(byteOffset: Int, value: Short, littleEndian: Boolean = definedExternally)
    public fun setUint16(byteOffset: Int, value: Short, littleEndian: Boolean = definedExternally)
    public fun setInt32(byteOffset: Int, value: Int, littleEndian: Boolean = definedExternally)
    public fun setUint32(byteOffset: Int, value: Int, littleEndian: Boolean = definedExternally)
    public fun setFloat32(byteOffset: Int, value: Float, littleEndian: Boolean = definedExternally)
    public fun setFloat64(byteOffset: Int, value: Double, littleEndian: Boolean = definedExternally)
}

public expect interface BufferDataSource
