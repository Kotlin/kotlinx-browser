/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: HAND-WRITTEN, NOT GENERATED.
// ECMAScript built-ins (ArrayBuffer, typed arrays, DataView) that Web IDL references but does not define.
// The generator treats these names as built-ins; see generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/surface/Builtins.kt.

package org.khronos.webgl

import kotlin.js.*

/**
 * Exposes the JavaScript [ArrayBuffer](https://developer.mozilla.org/en/docs/Web/API/ArrayBuffer) to Kotlin
 */
public open external class ArrayBuffer(length: Int) : BufferDataSource, JsAny {
    public open val byteLength: Int
    public fun slice(begin: Int, end: Int = definedExternally): ArrayBuffer

    public companion object {
        public fun isView(value: JsAny?): Boolean
    }
}

/**
 * Exposes the JavaScript [ArrayBufferView](https://developer.mozilla.org/en/docs/Web/API/ArrayBufferView) to Kotlin
 */
public external interface ArrayBufferView : BufferDataSource, JsAny {
    public val buffer: ArrayBuffer
    public val byteOffset: Int
    public val byteLength: Int
}

/**
 * The members every typed array has (ECMAScript's `%TypedArray%`), with [Self] the concrete array type, so code can
 * take any typed array: `fun checksum(data: TypedArray<*>)`. Element access stays on each array, whose Kotlin element
 * types differ (`Byte`, `UByte`, `Float`, …).
 *
 * An interface, not a class: `%TypedArray%` is not a global, and a check against an external class (`is`, `as`) reads
 * the global of its name, which would fail at runtime. Interfaces are not checked.
 */
public external interface TypedArray<Self : TypedArray<Self>> : ArrayBufferView, JsAny {
    public val length: Int

    /** Copies the elements of [array], of any typed array type, into this array starting at [offset], converting each. */
    public fun set(array: TypedArray<*>, offset: Int = definedExternally)

    /** Copies the numbers of [array] into this array starting at [offset], converting each to the element type. */
    public fun set(array: JsArray<JsNumber>, offset: Int = definedExternally)

    /** A view of the elements from [start] to [end] (exclusive) on the same buffer; the whole array by default. */
    public fun subarray(start: Int = definedExternally, end: Int = definedExternally): Self
}

/**
 * Exposes the JavaScript [Int8Array](https://developer.mozilla.org/en/docs/Web/API/Int8Array) to Kotlin
 */
public open external class Int8Array : TypedArray<Int8Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Int8Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt8Array(obj: Int8Array, index: Int): Byte = js("obj[index]")

public operator fun Int8Array.get(index: Int): Byte = getMethodImplForInt8Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt8Array(obj: Int8Array, index: Int, value: Byte) { js("obj[index] = value;") }

public operator fun Int8Array.set(index: Int, value: Byte): Unit = setMethodImplForInt8Array(this, index, value)

/**
 * Exposes the JavaScript [Uint8Array](https://developer.mozilla.org/en/docs/Web/API/Uint8Array) to Kotlin
 */
public open external class Uint8Array : TypedArray<Uint8Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Uint8Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint8Array(obj: Uint8Array, index: Int): Int = js("obj[index]")

public operator fun Uint8Array.get(index: Int): UByte = getMethodImplForUint8Array(this, index).toUByte()

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint8Array(obj: Uint8Array, index: Int, value: Int) { js("obj[index] = value;") }

public operator fun Uint8Array.set(index: Int, value: UByte): Unit = setMethodImplForUint8Array(this, index, value.toInt())

/**
 * Exposes the JavaScript [Uint8ClampedArray](https://developer.mozilla.org/en/docs/Web/API/Uint8ClampedArray) to Kotlin
 */
public open external class Uint8ClampedArray : TypedArray<Uint8ClampedArray>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Uint8ClampedArray

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint8ClampedArray(obj: Uint8ClampedArray, index: Int): Int = js("obj[index]")

public operator fun Uint8ClampedArray.get(index: Int): UByte = getMethodImplForUint8ClampedArray(this, index).toUByte()

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint8ClampedArray(obj: Uint8ClampedArray, index: Int, value: Int) { js("obj[index] = value;") }

public operator fun Uint8ClampedArray.set(index: Int, value: UByte): Unit = setMethodImplForUint8ClampedArray(this, index, value.toInt())

/**
 * Exposes the JavaScript [Int16Array](https://developer.mozilla.org/en/docs/Web/API/Int16Array) to Kotlin
 */
public open external class Int16Array : TypedArray<Int16Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Int16Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt16Array(obj: Int16Array, index: Int): Short = js("obj[index]")

public operator fun Int16Array.get(index: Int): Short = getMethodImplForInt16Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt16Array(obj: Int16Array, index: Int, value: Short) { js("obj[index] = value;") }

public operator fun Int16Array.set(index: Int, value: Short): Unit = setMethodImplForInt16Array(this, index, value)

/**
 * Exposes the JavaScript [Uint16Array](https://developer.mozilla.org/en/docs/Web/API/Uint16Array) to Kotlin
 */
public open external class Uint16Array : TypedArray<Uint16Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Uint16Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint16Array(obj: Uint16Array, index: Int): Int = js("obj[index]")

public operator fun Uint16Array.get(index: Int): UShort = getMethodImplForUint16Array(this, index).toUShort()

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint16Array(obj: Uint16Array, index: Int, value: Int) { js("obj[index] = value;") }

public operator fun Uint16Array.set(index: Int, value: UShort): Unit = setMethodImplForUint16Array(this, index, value.toInt())

/**
 * Exposes the JavaScript [Int32Array](https://developer.mozilla.org/en/docs/Web/API/Int32Array) to Kotlin
 */
public open external class Int32Array : TypedArray<Int32Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Int32Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForInt32Array(obj: Int32Array, index: Int): Int = js("obj[index]")

public operator fun Int32Array.get(index: Int): Int = getMethodImplForInt32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForInt32Array(obj: Int32Array, index: Int, value: Int) { js("obj[index] = value;") }

public operator fun Int32Array.set(index: Int, value: Int): Unit = setMethodImplForInt32Array(this, index, value)

/**
 * Exposes the JavaScript [Uint32Array](https://developer.mozilla.org/en/docs/Web/API/Uint32Array) to Kotlin
 */
public open external class Uint32Array : TypedArray<Uint32Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Uint32Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForUint32Array(obj: Uint32Array, index: Int): Double = js("obj[index]")

public operator fun Uint32Array.get(index: Int): UInt = getMethodImplForUint32Array(this, index).toUInt()

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForUint32Array(obj: Uint32Array, index: Int, value: Int) { js("obj[index] = value;") }

public operator fun Uint32Array.set(index: Int, value: UInt): Unit = setMethodImplForUint32Array(this, index, value.toInt())

/**
 * Exposes the JavaScript [Float32Array](https://developer.mozilla.org/en/docs/Web/API/Float32Array) to Kotlin
 */
public open external class Float32Array : TypedArray<Float32Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Float32Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFloat32Array(obj: Float32Array, index: Int): Float = js("obj[index]")

public operator fun Float32Array.get(index: Int): Float = getMethodImplForFloat32Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForFloat32Array(obj: Float32Array, index: Int, value: Float) { js("obj[index] = value;") }

public operator fun Float32Array.set(index: Int, value: Float): Unit = setMethodImplForFloat32Array(this, index, value)

/**
 * Exposes the JavaScript [Float64Array](https://developer.mozilla.org/en/docs/Web/API/Float64Array) to Kotlin
 */
public open external class Float64Array : TypedArray<Float64Array>, JsAny {
    public constructor(length: Int)
    public constructor(array: TypedArray<*>)
    public constructor(array: JsArray<JsNumber>)
    public constructor(buffer: ArrayBuffer, byteOffset: Int = definedExternally, length: Int = definedExternally)
    override val length: Int
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    override fun set(array: TypedArray<*>, offset: Int)
    override fun set(array: JsArray<JsNumber>, offset: Int)
    override fun subarray(start: Int, end: Int): Float64Array

    public companion object {
        public val BYTES_PER_ELEMENT: Int
    }
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFloat64Array(obj: Float64Array, index: Int): Double = js("obj[index]")

public operator fun Float64Array.get(index: Int): Double = getMethodImplForFloat64Array(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForFloat64Array(obj: Float64Array, index: Int, value: Double) { js("obj[index] = value;") }

public operator fun Float64Array.set(index: Int, value: Double): Unit = setMethodImplForFloat64Array(this, index, value)

/**
 * Exposes the JavaScript [DataView](https://developer.mozilla.org/en/docs/Web/API/DataView) to Kotlin
 */
public open external class DataView(buffer: ArrayBuffer, byteOffset: Int = definedExternally, byteLength: Int = definedExternally) : ArrayBufferView, JsAny {
    override val buffer: ArrayBuffer
    override val byteOffset: Int
    override val byteLength: Int
    public fun getInt8(byteOffset: Int): Byte
    public fun getInt16(byteOffset: Int, littleEndian: Boolean = definedExternally): Short
    public fun getInt32(byteOffset: Int, littleEndian: Boolean = definedExternally): Int
    public fun getFloat32(byteOffset: Int, littleEndian: Boolean = definedExternally): Float
    public fun getFloat64(byteOffset: Int, littleEndian: Boolean = definedExternally): Double
    public fun setInt8(byteOffset: Int, value: Byte)
    public fun setInt16(byteOffset: Int, value: Short, littleEndian: Boolean = definedExternally)
    public fun setInt32(byteOffset: Int, value: Int, littleEndian: Boolean = definedExternally)
    public fun setFloat32(byteOffset: Int, value: Float, littleEndian: Boolean = definedExternally)
    public fun setFloat64(byteOffset: Int, value: Double, littleEndian: Boolean = definedExternally)
}

// The unsigned accessors are extensions, like the indexers of the unsigned arrays: an unsigned type cannot cross the
// JS boundary, so the helpers take and return a JS number and the extension converts it (`getUint8` of 200 is 200u,
// not 200 in a `Byte` on JS and -56 on Wasm). The setters hand JS `value.toInt()`, which it wraps into range.

@Suppress("UNUSED_PARAMETER")
internal fun getUint8ImplForDataView(view: DataView, byteOffset: Int): Int = js("view.getUint8(byteOffset)")

/** The unsigned byte at [byteOffset]. */
public fun DataView.getUint8(byteOffset: Int): UByte = getUint8ImplForDataView(this, byteOffset).toUByte()

@Suppress("UNUSED_PARAMETER")
internal fun getUint16ImplForDataView(view: DataView, byteOffset: Int, littleEndian: Boolean): Int =
    js("view.getUint16(byteOffset, littleEndian)")

/** The unsigned 16-bit integer at [byteOffset], big-endian unless [littleEndian]. */
public fun DataView.getUint16(byteOffset: Int, littleEndian: Boolean = false): UShort =
    getUint16ImplForDataView(this, byteOffset, littleEndian).toUShort()

@Suppress("UNUSED_PARAMETER")
internal fun getUint32ImplForDataView(view: DataView, byteOffset: Int, littleEndian: Boolean): Double =
    js("view.getUint32(byteOffset, littleEndian)")

/** The unsigned 32-bit integer at [byteOffset], big-endian unless [littleEndian]. */
public fun DataView.getUint32(byteOffset: Int, littleEndian: Boolean = false): UInt =
    getUint32ImplForDataView(this, byteOffset, littleEndian).toUInt()

@Suppress("UNUSED_PARAMETER")
internal fun setUint8ImplForDataView(view: DataView, byteOffset: Int, value: Int) {
    js("view.setUint8(byteOffset, value);")
}

/** Stores [value] as an unsigned byte at [byteOffset]. */
public fun DataView.setUint8(byteOffset: Int, value: UByte): Unit =
    setUint8ImplForDataView(this, byteOffset, value.toInt())

@Suppress("UNUSED_PARAMETER")
internal fun setUint16ImplForDataView(view: DataView, byteOffset: Int, value: Int, littleEndian: Boolean) {
    js("view.setUint16(byteOffset, value, littleEndian);")
}

/** Stores [value] as an unsigned 16-bit integer at [byteOffset], big-endian unless [littleEndian]. */
public fun DataView.setUint16(byteOffset: Int, value: UShort, littleEndian: Boolean = false): Unit =
    setUint16ImplForDataView(this, byteOffset, value.toInt(), littleEndian)

@Suppress("UNUSED_PARAMETER")
internal fun setUint32ImplForDataView(view: DataView, byteOffset: Int, value: Int, littleEndian: Boolean) {
    js("view.setUint32(byteOffset, value, littleEndian);")
}

/** Stores [value] as an unsigned 32-bit integer at [byteOffset], big-endian unless [littleEndian]. */
public fun DataView.setUint32(byteOffset: Int, value: UInt, littleEndian: Boolean = false): Unit =
    setUint32ImplForDataView(this, byteOffset, value.toInt(), littleEndian)

public external interface BufferDataSource
