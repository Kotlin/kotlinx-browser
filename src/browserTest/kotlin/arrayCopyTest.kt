/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See generator/src/main/kotlin/helpers/generate.kt for details


@file:OptIn(ExperimentalUnsignedTypes::class)
import org.khronos.webgl.*
import kotlin.test.*

private fun testJsRoundTrip(array: ByteArray) {
    val jsArray = array.toInt8Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toByteArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: UByteArray) {
    val jsArray = array.toUint8Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i].toUByte())
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toUByteArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: ShortArray) {
    val jsArray = array.toInt16Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toShortArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: UShortArray) {
    val jsArray = array.toUint16Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i].toUShort())
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toUShortArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: IntArray) {
    val jsArray = array.toInt32Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toIntArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: UIntArray) {
    val jsArray = array.toUint32Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i].toUInt())
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toUIntArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: FloatArray) {
    val jsArray = array.toFloat32Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toFloatArray()
    assertContentEquals(array, roundTrippedArray)
}

private fun testJsRoundTrip(array: DoubleArray) {
    val jsArray = array.toFloat64Array()
    for (i in array.indices) {
        assertEquals(array[i], jsArray[i])
    }
    assertEquals(array.size, jsArray.length)
    val roundTrippedArray = jsArray.toDoubleArray()
    assertContentEquals(array, roundTrippedArray)
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
