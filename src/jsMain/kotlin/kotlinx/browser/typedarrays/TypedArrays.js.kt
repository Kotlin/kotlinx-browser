/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: HAND-WRITTEN, NOT GENERATED.
// Kotlin/JS only: the typed-array overloads taking a Kotlin array of the element type, kept from the declarations
// bundled with Kotlin/JS. On JS such an array is a JS array of numbers, as is `JsArray<JsNumber>`; the shared
// declarations are in webMain. Only the signed and float arrays have them: a Kotlin array of signed values does not
// fit an unsigned typed array (a clamped one turns every negative byte into 0); use `UByteArray.toUint8Array()` etc.

package kotlinx.browser.typedarrays

/** A new [Int8Array] with the elements of [array]. */
public fun Int8Array(array: Array<Byte>): Int8Array = Int8Array(array.unsafeCast<Array<Double>>())

/** Copies the elements of [array] into this array, starting at [offset]. */
public fun Int8Array.set(array: Array<Byte>, offset: Int = 0): Unit = set(array.unsafeCast<Array<Double>>(), offset)

/** A new [Int16Array] with the elements of [array]. */
public fun Int16Array(array: Array<Short>): Int16Array = Int16Array(array.unsafeCast<Array<Double>>())

/** Copies the elements of [array] into this array, starting at [offset]. */
public fun Int16Array.set(array: Array<Short>, offset: Int = 0): Unit = set(array.unsafeCast<Array<Double>>(), offset)

/** A new [Int32Array] with the elements of [array]. */
public fun Int32Array(array: Array<Int>): Int32Array = Int32Array(array.unsafeCast<Array<Double>>())

/** Copies the elements of [array] into this array, starting at [offset]. */
public fun Int32Array.set(array: Array<Int>, offset: Int = 0): Unit = set(array.unsafeCast<Array<Double>>(), offset)

/** A new [Float32Array] with the elements of [array]. */
public fun Float32Array(array: Array<Float>): Float32Array = Float32Array(array.unsafeCast<Array<Double>>())

/** Copies the elements of [array] into this array, starting at [offset]. */
public fun Float32Array.set(array: Array<Float>, offset: Int = 0): Unit = set(array.unsafeCast<Array<Double>>(), offset)
