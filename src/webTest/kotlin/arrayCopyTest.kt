/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/generators/helpers/generate.kt for details.


@file:OptIn(ExperimentalUnsignedTypes::class)
import org.khronos.webgl.*
import kotlin.test.*

private fun testUint8ArrayRoundTrip(array: UByteArray) {
    val jsArray = array.toUint8Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toUByteArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Uint8Array(jsArray.buffer, Uint8Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toUByteArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testUint8ClampedArrayRoundTrip(array: UByteArray) {
    val jsArray = array.toUint8ClampedArray()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toUByteArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Uint8ClampedArray(jsArray.buffer, Uint8ClampedArray.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toUByteArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testInt8ArrayRoundTrip(array: ByteArray) {
    val jsArray = array.toInt8Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toByteArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Int8Array(jsArray.buffer, Int8Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toByteArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testUint16ArrayRoundTrip(array: UShortArray) {
    val jsArray = array.toUint16Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toUShortArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Uint16Array(jsArray.buffer, Uint16Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toUShortArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testInt16ArrayRoundTrip(array: ShortArray) {
    val jsArray = array.toInt16Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toShortArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Int16Array(jsArray.buffer, Int16Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toShortArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testUint32ArrayRoundTrip(array: UIntArray) {
    val jsArray = array.toUint32Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toUIntArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Uint32Array(jsArray.buffer, Uint32Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toUIntArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testInt32ArrayRoundTrip(array: IntArray) {
    val jsArray = array.toInt32Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toIntArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Int32Array(jsArray.buffer, Int32Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toIntArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testFloat32ArrayRoundTrip(array: FloatArray) {
    val jsArray = array.toFloat32Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toFloatArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Float32Array(jsArray.buffer, Float32Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toFloatArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

private fun testFloat64ArrayRoundTrip(array: DoubleArray) {
    val jsArray = array.toFloat64Array()
    assertEquals(array.size, jsArray.length)
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    val roundTrippedArray = jsArray.toDoubleArray()
    assertContentEquals(array, roundTrippedArray)

    // A view converts only its own elements.
    if (array.size >= 3) {
        val view = Float64Array(jsArray.buffer, Float64Array.BYTES_PER_ELEMENT, array.size - 2)
        assertContentEquals(array.copyOfRange(1, array.size - 1), view.toDoubleArray())
    }

    // Both conversions copy: changing one side leaves the other as it was.
    if (array.size >= 2 && array[0] != array[1]) {
        val first = jsArray[0]
        array[0] = array[1]
        roundTrippedArray[0] = array[1]
        assertEquals(first, jsArray[0])
    }
}

class JsArrayConversionTest {

    @Test
    fun testUint8Array() {
        testUint8ArrayRoundTrip(ubyteArrayOf())
        testUint8ArrayRoundTrip(ubyteArrayOf(0.toUByte(), (-42).toUByte(), UByte.MIN_VALUE, UByte.MAX_VALUE))
        testUint8ArrayRoundTrip(UByteArray(1000) { it.toUByte() })
    }

    @Test
    fun testUint8ClampedArray() {
        testUint8ClampedArrayRoundTrip(ubyteArrayOf())
        testUint8ClampedArrayRoundTrip(ubyteArrayOf(0.toUByte(), (-42).toUByte(), UByte.MIN_VALUE, UByte.MAX_VALUE))
        testUint8ClampedArrayRoundTrip(UByteArray(1000) { it.toUByte() })
    }

    @Test
    fun testInt8Array() {
        testInt8ArrayRoundTrip(byteArrayOf())
        testInt8ArrayRoundTrip(byteArrayOf(0.toByte(), (-42).toByte(), Byte.MIN_VALUE, Byte.MAX_VALUE))
        testInt8ArrayRoundTrip(ByteArray(1000) { it.toByte() })
    }

    @Test
    fun testUint16Array() {
        testUint16ArrayRoundTrip(ushortArrayOf())
        testUint16ArrayRoundTrip(ushortArrayOf(0.toUShort(), (-42).toUShort(), UShort.MIN_VALUE, UShort.MAX_VALUE))
        testUint16ArrayRoundTrip(UShortArray(1000) { it.toUShort() })
    }

    @Test
    fun testInt16Array() {
        testInt16ArrayRoundTrip(shortArrayOf())
        testInt16ArrayRoundTrip(shortArrayOf(0.toShort(), (-42).toShort(), Short.MIN_VALUE, Short.MAX_VALUE))
        testInt16ArrayRoundTrip(ShortArray(1000) { it.toShort() })
    }

    @Test
    fun testUint32Array() {
        testUint32ArrayRoundTrip(uintArrayOf())
        testUint32ArrayRoundTrip(uintArrayOf(0.toUInt(), (-42).toUInt(), UInt.MIN_VALUE, UInt.MAX_VALUE))
        testUint32ArrayRoundTrip(UIntArray(1000) { it.toUInt() })
    }

    @Test
    fun testInt32Array() {
        testInt32ArrayRoundTrip(intArrayOf())
        testInt32ArrayRoundTrip(intArrayOf(0.toInt(), (-42).toInt(), Int.MIN_VALUE, Int.MAX_VALUE))
        testInt32ArrayRoundTrip(IntArray(1000) { it.toInt() })
    }

    @Test
    fun testFloat32Array() {
        testFloat32ArrayRoundTrip(floatArrayOf())
        testFloat32ArrayRoundTrip(floatArrayOf(0.toFloat(), (-42).toFloat(), Float.MIN_VALUE, Float.MAX_VALUE))
        testFloat32ArrayRoundTrip(FloatArray(1000) { it.toFloat() })
    }

    @Test
    fun testFloat64Array() {
        testFloat64ArrayRoundTrip(doubleArrayOf())
        testFloat64ArrayRoundTrip(doubleArrayOf(0.toDouble(), (-42).toDouble(), Double.MIN_VALUE, Double.MAX_VALUE))
        testFloat64ArrayRoundTrip(DoubleArray(1000) { it.toDouble() })
    }
}
