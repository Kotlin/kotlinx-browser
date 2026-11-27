/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

import org.khronos.webgl.*
import kotlin.test.*

/** The hand-written typed arrays and `DataView`, on both targets (Node has them as globals). */
class TypedArraysTest {
    /** Before, `getUint8` of 255 was 255 in a `Byte` on JS and -1 on Wasm; the same for 16 and 32 bits. */
    @Test
    fun dataViewUnsignedAccessors() {
        val view = DataView(ArrayBuffer(8))
        view.setUint8(0, 255u)
        assertEquals(255u, view.getUint8(0))
        view.setUint8(0, 200u)
        assertEquals(200, view.getUint8(0).toInt())
        assertEquals((-56).toByte(), view.getInt8(0), "the same byte, read signed")

        view.setUint16(0, UShort.MAX_VALUE)
        assertEquals(UShort.MAX_VALUE, view.getUint16(0))
        view.setUint32(0, UInt.MAX_VALUE)
        assertEquals(UInt.MAX_VALUE, view.getUint32(0))
        assertEquals(-1, view.getInt32(0))
    }

    @Test
    fun dataViewEndianness() {
        val view = DataView(ArrayBuffer(4))
        view.setUint16(0, 0x0102u)
        assertEquals(1u, view.getUint8(0), "big-endian by default")
        view.setUint32(0, 0x01020304u, littleEndian = true)
        assertEquals(4u, view.getUint8(0))
        assertEquals(0x01020304u, view.getUint32(0, littleEndian = true))
        assertEquals(0x04030201u, view.getUint32(0))
    }

    /** `subarray()` is the whole array and `subarray(start)` its tail, sharing the buffer. */
    @Test
    fun subarrayBounds() {
        val array = Int16Array(4)
        for (i in 0 until 4) array[i] = (i + 1).toShort()
        assertEquals(4, array.subarray().length)
        val tail = array.subarray(2)
        assertEquals(listOf<Short>(3, 4), List(tail.length) { tail[it] })
        tail[0] = 30
        assertEquals(30, array[2])
        assertEquals(listOf<Short>(2), array.subarray(1, 2).let { s -> List(s.length) { s[it] } })
    }

    private fun describe(array: TypedArray<*>): String = "${array.length}/${array.byteLength}/${array.subarray(1).length}"

    /** One function for any typed array, and copies between array types convert each element as JS does. */
    @Test
    fun anyTypedArray() {
        assertEquals("4/4/3", describe(Int8Array(4)))
        assertEquals("4/16/3", describe(Float32Array(4)))
        assertEquals("4/32/3", describe(Float64Array(4)))

        val bytes = Uint8Array(3)
        bytes[0] = 1u; bytes[1] = 200u; bytes[2] = 255u
        val shorts = Int16Array(4)
        shorts.set(bytes, 1)
        assertEquals(listOf<Short>(0, 1, 200, 255), List(4) { shorts[it] })

        val signed = Int8Array(bytes)
        assertEquals(listOf<Byte>(1, -56, -1), List(3) { signed[it] })
        val floats = Float32Array(signed)
        assertEquals(-56f, floats[1])
    }
}
