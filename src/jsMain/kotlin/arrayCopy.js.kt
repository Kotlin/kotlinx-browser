/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/helpers/generate.kt for details


package org.khronos.webgl

/** Returns a new [UByteArray] containing all the elements of this [Uint8Array]. */
@ExperimentalUnsignedTypes
@Suppress("INVISIBLE_REFERENCE")
public actual inline fun Uint8Array.toUByteArray(): UByteArray =
    UByteArray(Int8Array(buffer).unsafeCast<ByteArray>())

/** Returns a new [Uint8Array] containing all the elements of this [UByteArray]. */
@ExperimentalUnsignedTypes
@Suppress("INVISIBLE_REFERENCE")
public actual inline fun UByteArray.toUint8Array(): Uint8Array =
    Uint8Array(storage.unsafeCast<Int8Array>().buffer)

/** Returns a new [ByteArray] containing all the elements of this [Int8Array]. */
public actual inline fun Int8Array.toByteArray(): ByteArray =
    unsafeCast<ByteArray>()

/** Returns a new [Int8Array] containing all the elements of this [ByteArray]. */
public actual inline fun ByteArray.toInt8Array(): Int8Array =
    unsafeCast<Int8Array>()

/** Returns a new [UShortArray] containing all the elements of this [Uint16Array]. */
@ExperimentalUnsignedTypes
@Suppress("INVISIBLE_REFERENCE")
public actual inline fun Uint16Array.toUShortArray(): UShortArray =
    UShortArray(Int16Array(buffer).unsafeCast<ShortArray>())

/** Returns a new [Uint16Array] containing all the elements of this [UShortArray]. */
@ExperimentalUnsignedTypes
@Suppress("INVISIBLE_REFERENCE")
public actual inline fun UShortArray.toUint16Array(): Uint16Array =
    Uint16Array(storage.unsafeCast<Int16Array>().buffer)

/** Returns a new [ShortArray] containing all the elements of this [Int16Array]. */
public actual inline fun Int16Array.toShortArray(): ShortArray =
    unsafeCast<ShortArray>()

/** Returns a new [Int16Array] containing all the elements of this [ShortArray]. */
public actual inline fun ShortArray.toInt16Array(): Int16Array =
    unsafeCast<Int16Array>()

/** Returns a new [UIntArray] containing all the elements of this [Uint32Array]. */
@ExperimentalUnsignedTypes
@Suppress("INVISIBLE_REFERENCE")
public actual inline fun Uint32Array.toUIntArray(): UIntArray =
    UIntArray(Int32Array(buffer).unsafeCast<IntArray>())

/** Returns a new [Uint32Array] containing all the elements of this [UIntArray]. */
@ExperimentalUnsignedTypes
@Suppress("INVISIBLE_REFERENCE")
public actual inline fun UIntArray.toUint32Array(): Uint32Array =
    Uint32Array(storage.unsafeCast<Int32Array>().buffer)

/** Returns a new [IntArray] containing all the elements of this [Int32Array]. */
public actual inline fun Int32Array.toIntArray(): IntArray =
    unsafeCast<IntArray>()

/** Returns a new [Int32Array] containing all the elements of this [IntArray]. */
public actual inline fun IntArray.toInt32Array(): Int32Array =
    unsafeCast<Int32Array>()

/** Returns a new [FloatArray] containing all the elements of this [Float32Array]. */
public actual inline fun Float32Array.toFloatArray(): FloatArray =
    unsafeCast<FloatArray>()

/** Returns a new [Float32Array] containing all the elements of this [FloatArray]. */
public actual inline fun FloatArray.toFloat32Array(): Float32Array =
    unsafeCast<Float32Array>()

/** Returns a new [DoubleArray] containing all the elements of this [Float64Array]. */
public actual inline fun Float64Array.toDoubleArray(): DoubleArray =
    unsafeCast<DoubleArray>()

/** Returns a new [Float64Array] containing all the elements of this [DoubleArray]. */
public actual inline fun DoubleArray.toFloat64Array(): Float64Array =
    unsafeCast<Float64Array>()
