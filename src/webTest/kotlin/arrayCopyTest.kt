/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/generators/helpers/generate.kt for details.


@file:OptIn(ExperimentalUnsignedTypes::class)
import org.khronos.webgl.*
import kotlin.test.*

private fun testJsRoundTrip(array: ByteArray) {
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

private fun testJsRoundTrip(array: UByteArray) {
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

private fun testJsRoundTrip(array: ShortArray) {
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

private fun testJsRoundTrip(array: UShortArray) {
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

private fun testJsRoundTrip(array: IntArray) {
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

private fun testJsRoundTrip(array: UIntArray) {
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

private fun testJsRoundTrip(array: FloatArray) {
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

private fun testJsRoundTrip(array: DoubleArray) {
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
    fun testByteArray() {
        testJsRoundTrip(byteArrayOf())
        testJsRoundTrip(byteArrayOf(0.toByte(), (-42).toByte(), Byte.MIN_VALUE, Byte.MAX_VALUE))
        testJsRoundTrip(ByteArray(1000) { it.toByte() })
    }

    @Test
    fun testUByteArray() {
        testJsRoundTrip(ubyteArrayOf())
        testJsRoundTrip(ubyteArrayOf(0.toUByte(), (-42).toUByte(), UByte.MIN_VALUE, UByte.MAX_VALUE))
        testJsRoundTrip(UByteArray(1000) { it.toUByte() })
    }

    @Test
    fun testShortArray() {
        testJsRoundTrip(shortArrayOf())
        testJsRoundTrip(shortArrayOf(0.toShort(), (-42).toShort(), Short.MIN_VALUE, Short.MAX_VALUE))
        testJsRoundTrip(ShortArray(1000) { it.toShort() })
    }

    @Test
    fun testUShortArray() {
        testJsRoundTrip(ushortArrayOf())
        testJsRoundTrip(ushortArrayOf(0.toUShort(), (-42).toUShort(), UShort.MIN_VALUE, UShort.MAX_VALUE))
        testJsRoundTrip(UShortArray(1000) { it.toUShort() })
    }

    @Test
    fun testIntArray() {
        testJsRoundTrip(intArrayOf())
        testJsRoundTrip(intArrayOf(0.toInt(), (-42).toInt(), Int.MIN_VALUE, Int.MAX_VALUE))
        testJsRoundTrip(IntArray(1000) { it.toInt() })
    }

    @Test
    fun testUIntArray() {
        testJsRoundTrip(uintArrayOf())
        testJsRoundTrip(uintArrayOf(0.toUInt(), (-42).toUInt(), UInt.MIN_VALUE, UInt.MAX_VALUE))
        testJsRoundTrip(UIntArray(1000) { it.toUInt() })
    }

    @Test
    fun testFloatArray() {
        testJsRoundTrip(floatArrayOf())
        testJsRoundTrip(floatArrayOf(0.toFloat(), (-42).toFloat(), Float.MIN_VALUE, Float.MAX_VALUE))
        testJsRoundTrip(FloatArray(1000) { it.toFloat() })
    }

    @Test
    fun testDoubleArray() {
        testJsRoundTrip(doubleArrayOf())
        testJsRoundTrip(doubleArrayOf(0.toDouble(), (-42).toDouble(), Double.MIN_VALUE, Double.MAX_VALUE))
        testJsRoundTrip(DoubleArray(1000) { it.toDouble() })
    }
}
