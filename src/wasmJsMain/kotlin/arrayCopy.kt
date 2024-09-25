/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/helpers/generate.kt for details


package org.khronos.webgl

/** Returns a new array containing all the elements of this array. */
public fun Int8Array.toByteArray(): ByteArray =
    ByteArray(this.length) { this[it] }

/** Returns a new array containing all the elements of this array. */
public fun ByteArray.toInt8Array(): Int8Array {
    val result = Int8Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
@ExperimentalUnsignedTypes
public fun Uint8Array.toUByteArray(): UByteArray =
    UByteArray(this.length) { this[it].toUByte() }

/** Returns a new array containing all the elements of this array. */
@ExperimentalUnsignedTypes
public fun UByteArray.toUint8Array(): Uint8Array {
    val result = Uint8Array(this.size)
    for (index in this.indices) {
        result[index] = this[index].toByte()
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
public fun Int16Array.toShortArray(): ShortArray =
    ShortArray(this.length) { this[it] }

/** Returns a new array containing all the elements of this array. */
public fun ShortArray.toInt16Array(): Int16Array {
    val result = Int16Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
@ExperimentalUnsignedTypes
public fun Uint16Array.toUShortArray(): UShortArray =
    UShortArray(this.length) { this[it].toUShort() }

/** Returns a new array containing all the elements of this array. */
@ExperimentalUnsignedTypes
public fun UShortArray.toUint16Array(): Uint16Array {
    val result = Uint16Array(this.size)
    for (index in this.indices) {
        result[index] = this[index].toShort()
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
public fun Int32Array.toIntArray(): IntArray =
    IntArray(this.length) { this[it] }

/** Returns a new array containing all the elements of this array. */
public fun IntArray.toInt32Array(): Int32Array {
    val result = Int32Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
@ExperimentalUnsignedTypes
public fun Uint32Array.toUIntArray(): UIntArray =
    UIntArray(this.length) { this[it].toUInt() }

/** Returns a new array containing all the elements of this array. */
@ExperimentalUnsignedTypes
public fun UIntArray.toUint32Array(): Uint32Array {
    val result = Uint32Array(this.size)
    for (index in this.indices) {
        result[index] = this[index].toInt()
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
public fun Float32Array.toFloatArray(): FloatArray =
    FloatArray(this.length) { this[it] }

/** Returns a new array containing all the elements of this array. */
public fun FloatArray.toFloat32Array(): Float32Array {
    val result = Float32Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}

/** Returns a new array containing all the elements of this array. */
public fun Float64Array.toDoubleArray(): DoubleArray =
    DoubleArray(this.length) { this[it] }

/** Returns a new array containing all the elements of this array. */
public fun DoubleArray.toFloat64Array(): Float64Array {
    val result = Float64Array(this.size)
    for (index in this.indices) {
        result[index] = this[index]
    }
    return result
}
