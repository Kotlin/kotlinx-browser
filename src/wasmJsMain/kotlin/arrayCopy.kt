/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/helpers/generate.kt for details


package org.khronos.webgl

/** Returns a new [ByteArray] containing all the elements of this [Int8Array]. */
public fun Int8Array.toByteArray(): ByteArray =
    ByteArray(this.length) { this[it] }

/** Returns a new [Int8Array] containing all the elements of this [ByteArray]. */
public fun ByteArray.toInt8Array(): Int8Array {
    val result = Int8Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new [UByteArray] containing all the elements of this [Uint8Array]. */
@ExperimentalUnsignedTypes
public fun Uint8Array.toUByteArray(): UByteArray =
    UByteArray(this.length) { this[it].toUByte() }

/** Returns a new [Uint8Array] containing all the elements of this [UByteArray]. */
@ExperimentalUnsignedTypes
public fun UByteArray.toUint8Array(): Uint8Array {
    val result = Uint8Array(this.size)
    for (index in this.indices) {
        result[index] = this[index].toByte()
    }
    return result
}

/** Returns a new [ShortArray] containing all the elements of this [Int16Array]. */
public fun Int16Array.toShortArray(): ShortArray =
    ShortArray(this.length) { this[it] }

/** Returns a new [Int16Array] containing all the elements of this [ShortArray]. */
public fun ShortArray.toInt16Array(): Int16Array {
    val result = Int16Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new [UShortArray] containing all the elements of this [Uint16Array]. */
@ExperimentalUnsignedTypes
public fun Uint16Array.toUShortArray(): UShortArray =
    UShortArray(this.length) { this[it].toUShort() }

/** Returns a new [Uint16Array] containing all the elements of this [UShortArray]. */
@ExperimentalUnsignedTypes
public fun UShortArray.toUint16Array(): Uint16Array {
    val result = Uint16Array(this.size)
    for (index in this.indices) {
        result[index] = this[index].toShort()
    }
    return result
}

/** Returns a new [IntArray] containing all the elements of this [Int32Array]. */
public fun Int32Array.toIntArray(): IntArray =
    IntArray(this.length) { this[it] }

/** Returns a new [Int32Array] containing all the elements of this [IntArray]. */
public fun IntArray.toInt32Array(): Int32Array {
    val result = Int32Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new [UIntArray] containing all the elements of this [Uint32Array]. */
@ExperimentalUnsignedTypes
public fun Uint32Array.toUIntArray(): UIntArray =
    UIntArray(this.length) { this[it].toUInt() }

/** Returns a new [Uint32Array] containing all the elements of this [UIntArray]. */
@ExperimentalUnsignedTypes
public fun UIntArray.toUint32Array(): Uint32Array {
    val result = Uint32Array(this.size)
    for (index in this.indices) {
        result[index] = this[index].toInt()
    }
    return result
}

/** Returns a new [FloatArray] containing all the elements of this [Float32Array]. */
public fun Float32Array.toFloatArray(): FloatArray =
    FloatArray(this.length) { this[it] }

/** Returns a new [Float32Array] containing all the elements of this [FloatArray]. */
public fun FloatArray.toFloat32Array(): Float32Array {
    val result = Float32Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new [DoubleArray] containing all the elements of this [Float64Array]. */
public fun Float64Array.toDoubleArray(): DoubleArray =
    DoubleArray(this.length) { this[it] }

/** Returns a new [Float64Array] containing all the elements of this [DoubleArray]. */
public fun DoubleArray.toFloat64Array(): Float64Array {
    val result = Float64Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}
