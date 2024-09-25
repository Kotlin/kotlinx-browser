/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.generators.wasm.js

import org.jetbrains.kotlin.tools.dukat.getHeader
import java.io.File
import java.io.FileWriter

fun main() {
    generatePublicStdlibFunctions()
    generateTests()
}

fun generatePublicStdlibFunctions() {
    FileWriter(File("../src/wasmJsMain/kotlin/arrayCopy.kt")).use { writer: FileWriter ->
        with(writer) {
            appendLine(getHeader(seeDetailsAt = "generator/src/main/kotlin/helpers/generate.kt"))

            appendLine("package org.khronos.webgl")

            appendConversionsForType("Byte", "Int8")
            appendConversionsForType("UByte", "Uint8", isUnsigned = true)
            appendConversionsForType("Short", "Int16")
            appendConversionsForType("UShort", "Uint16", isUnsigned = true)
            appendConversionsForType("Int", "Int32")
            appendConversionsForType("UInt", "Uint32", isUnsigned = true)
            appendConversionsForType("Float", "Float32")
            appendConversionsForType("Double", "Float64")
        }
    }
}

private fun FileWriter.appendConversionsForType(
    ktType: String,
    jsType: String,
    isUnsigned: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine()
    appendLine("/** Returns a new array containing all the elements of this array. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
    if (isUnsigned) {
        appendLine("    $kotlinArrayType(this.length) { this[it].to$ktType() }")
    } else {
        appendLine("    $kotlinArrayType(this.length) { this[it] }")
    }

    appendLine()
    appendLine("/** Returns a new array containing all the elements of this array. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public fun $kotlinArrayType.to$jsArrayType(): $jsArrayType {")
    appendLine("    val result = $jsArrayType(this.size)")
    appendLine("    for (index in this.indices) {")
    if (isUnsigned) {
        val signedType = ktType.drop(1)
        appendLine("        result[index] = this[index].to$signedType()")
    } else {
        appendLine("        result[index] = this[index]")
    }
    appendLine("    }")
    appendLine("    return result")
    appendLine("}")
}

fun generateTests() {
    FileWriter(File("../src/wasmJsTest/kotlin/arrayCopyTest.kt")).use { writer: FileWriter ->
        with(writer) {
            appendLine(getHeader(seeDetailsAt = "generator/src/main/kotlin/helpers/generate.kt"))

            appendLine("@file:OptIn(ExperimentalUnsignedTypes::class)")
            appendLine("import org.khronos.webgl.*")
            appendLine("import kotlin.test.*")


            appendTestJsRoundTripHelper("Byte", "Int8")
            appendTestJsRoundTripHelper("UByte", "Uint8", isUnsigned = true)
            appendTestJsRoundTripHelper("Short", "Int16")
            appendTestJsRoundTripHelper("UShort", "Uint16", isUnsigned = true)
            appendTestJsRoundTripHelper("Int", "Int32")
            appendTestJsRoundTripHelper("UInt", "Uint32", isUnsigned = true)
            appendTestJsRoundTripHelper("Float", "Float32")
            appendTestJsRoundTripHelper("Double", "Float64")

            appendLine()
            appendLine("class JsArrayConversionTest {")

            appendTestFunction("Byte")
            appendTestFunction("UByte")
            appendTestFunction("Short")
            appendTestFunction("UShort")
            appendTestFunction("Int")
            appendTestFunction("UInt")
            appendTestFunction("Float")
            appendTestFunction("Double")

            appendLine("}")

        }
    }
}

private fun FileWriter.appendTestJsRoundTripHelper(
    ktType: String,
    jsType: String,
    isUnsigned: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine(
        """
            
            private fun testJsRoundTrip(array: $kotlinArrayType) {
                val jsArray = array.to$jsArrayType()
                for (i in array.indices) {
                    assertEquals(array[i], jsArray[i]${if (isUnsigned) ".to$ktType()" else ""})
                }
                assertEquals(array.size, jsArray.length)
                val roundTrippedArray = jsArray.to$kotlinArrayType()
                assertContentEquals(array, roundTrippedArray)
            }
        """.trimIndent()
    )
}

private fun FileWriter.appendTestFunction(
    ktType: String,
) {
    val kotlinArrayType = "${ktType}Array"
    val ktArrayOf = "${ktType.lowercase()}ArrayOf"

    appendLine()
    appendLine("    @Test")
    appendLine("    fun test$kotlinArrayType() {")
    appendLine("        testJsRoundTrip($ktArrayOf())")
    appendLine("        testJsRoundTrip($ktArrayOf(0.to$ktType(), (-42).to$ktType(), $ktType.MIN_VALUE, $ktType.MAX_VALUE))")
    appendLine("        testJsRoundTrip($kotlinArrayType(1000) { it.to$ktType() })")
    appendLine("    }")
}