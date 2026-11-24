/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/helpers/generate.kt for details.

package org.khronos.webgl

/** Returns a new [UByteArray] containing all the elements of this [Uint8Array]. */
@ExperimentalUnsignedTypes
public actual inline fun Uint8Array.toUByteArray(): UByteArray =
    Int8Array(buffer, byteOffset, length).unsafeCast<ByteArray>().copyOf().asUByteArray()

/** Returns a new [Uint8Array] containing all the elements of this [UByteArray]. */
@ExperimentalUnsignedTypes
public actual inline fun UByteArray.toUint8Array(): Uint8Array =
    Uint8Array(asByteArray().copyOf().unsafeCast<Int8Array>().buffer)

/** Returns a new [ByteArray] containing all the elements of this [Int8Array]. */
public actual inline fun Int8Array.toByteArray(): ByteArray =
    unsafeCast<ByteArray>().copyOf()

/** Returns a new [Int8Array] containing all the elements of this [ByteArray]. */
public actual inline fun ByteArray.toInt8Array(): Int8Array =
    copyOf().unsafeCast<Int8Array>()

/** Returns a new [UShortArray] containing all the elements of this [Uint16Array]. */
@ExperimentalUnsignedTypes
public actual inline fun Uint16Array.toUShortArray(): UShortArray =
    Int16Array(buffer, byteOffset, length).unsafeCast<ShortArray>().copyOf().asUShortArray()

/** Returns a new [Uint16Array] containing all the elements of this [UShortArray]. */
@ExperimentalUnsignedTypes
public actual inline fun UShortArray.toUint16Array(): Uint16Array =
    Uint16Array(asShortArray().copyOf().unsafeCast<Int16Array>().buffer)

/** Returns a new [ShortArray] containing all the elements of this [Int16Array]. */
public actual inline fun Int16Array.toShortArray(): ShortArray =
    unsafeCast<ShortArray>().copyOf()

/** Returns a new [Int16Array] containing all the elements of this [ShortArray]. */
public actual inline fun ShortArray.toInt16Array(): Int16Array =
    copyOf().unsafeCast<Int16Array>()

/** Returns a new [UIntArray] containing all the elements of this [Uint32Array]. */
@ExperimentalUnsignedTypes
public actual inline fun Uint32Array.toUIntArray(): UIntArray =
    Int32Array(buffer, byteOffset, length).unsafeCast<IntArray>().copyOf().asUIntArray()

/** Returns a new [Uint32Array] containing all the elements of this [UIntArray]. */
@ExperimentalUnsignedTypes
public actual inline fun UIntArray.toUint32Array(): Uint32Array =
    Uint32Array(asIntArray().copyOf().unsafeCast<Int32Array>().buffer)

/** Returns a new [IntArray] containing all the elements of this [Int32Array]. */
public actual inline fun Int32Array.toIntArray(): IntArray =
    unsafeCast<IntArray>().copyOf()

/** Returns a new [Int32Array] containing all the elements of this [IntArray]. */
public actual inline fun IntArray.toInt32Array(): Int32Array =
    copyOf().unsafeCast<Int32Array>()

/** Returns a new [FloatArray] containing all the elements of this [Float32Array]. */
public actual inline fun Float32Array.toFloatArray(): FloatArray =
    unsafeCast<FloatArray>().copyOf()

/** Returns a new [Float32Array] containing all the elements of this [FloatArray]. */
public actual inline fun FloatArray.toFloat32Array(): Float32Array =
    copyOf().unsafeCast<Float32Array>()

/** Returns a new [DoubleArray] containing all the elements of this [Float64Array]. */
public actual inline fun Float64Array.toDoubleArray(): DoubleArray =
    unsafeCast<DoubleArray>().copyOf()

/** Returns a new [Float64Array] containing all the elements of this [DoubleArray]. */
public actual inline fun DoubleArray.toFloat64Array(): Float64Array =
    copyOf().unsafeCast<Float64Array>()
