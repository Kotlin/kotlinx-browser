/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

import org.khronos.webgl.*
import kotlin.test.*

/** The JS-only typed-array overloads taking a Kotlin array: it is passed to JS as is, an array of numbers. */
class TypedArraysJsTest {
    @Test
    fun factories() {
        val signed = Int8Array(arrayOf<Byte>(1, -2))
        assertEquals(2, signed.length)
        assertEquals(-2, signed[1])
        assertEquals(255u, Uint8Array(arrayOf<Byte>(-1))[0])
        assertEquals(1.5f, Float32Array(arrayOf(1.5f))[0])
        assertEquals(70000, Int32Array(arrayOf(70000))[0])
    }

    @Test
    fun setWithOffset() {
        val array = Int16Array(3)
        array.set(arrayOf<Short>(7, -8), 1)
        assertEquals(listOf<Short>(0, 7, -8), List(3) { array[it] })
        array.set(arrayOf<Short>(9))
        assertEquals(9, array[0])
    }
}
