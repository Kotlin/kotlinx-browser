/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.generators.helpers

import org.jetbrains.kotlin.tools.dukat.getHeader
import java.io.File
import java.io.FileWriter

fun main() {
    generatePublicStdlibFunctions()
    generateTests()
}

fun generatePublicStdlibFunctions() {
    val conversions = listOf(
        Conversion("Byte", "Int8"),
        Conversion("UByte", "Uint8", isUnsigned = true),
        Conversion("Short", "Int16"),
        Conversion("UShort", "Uint16", isUnsigned = true),
        Conversion("Int", "Int32"),
        Conversion("UInt", "Uint32", isUnsigned = true),
        Conversion("Float", "Float32"),
        Conversion("Double", "Float64")
    )

    FileWriter(File("../src/webMain/kotlin/arrayCopy.kt")).use { writer: FileWriter ->
        with(writer) {
            appendLine(getHeader(seeDetailsAt = "generator/src/main/kotlin/helpers/generate.kt"))
            appendLine("package org.khronos.webgl")

            conversions.forEach { (ktType, jsType, isUnsigned) ->
                appendExpectConversionsForType(ktType, jsType, isUnsigned)
            }
        }
    }
    FileWriter(File("../src/jsMain/kotlin/arrayCopy.js.kt")).use { writer: FileWriter ->
        with(writer) {
            appendLine(getHeader(seeDetailsAt = "generator/src/main/kotlin/helpers/generate.kt"))

            appendLine("package org.khronos.webgl")

            conversions.forEach { (ktType, jsType, isUnsigned) ->
                appendJsConversionsForType(ktType, jsType, isUnsigned)
            }
        }
    }
    FileWriter(File("../src/wasmJsMain/kotlin/arrayCopy.wasm.kt")).use { writer: FileWriter ->
        with(writer) {
            appendLine(getHeader(seeDetailsAt = "generator/src/main/kotlin/helpers/generate.kt"))
            appendLine("package org.khronos.webgl")

            conversions.forEach { (ktType, jsType, isUnsigned) ->
                appendWasmConversionsForType(ktType, jsType, isUnsigned)
            }
        }
    }
}


private fun FileWriter.appendExpectConversionsForType(
    ktType: String,
    jsType: String,
    isUnsigned: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine()
    appendLine("/** Returns a new [$kotlinArrayType] containing all the elements of this [$jsArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public expect fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType")
    appendLine()
    appendLine("/** Returns a new [$jsArrayType] containing all the elements of this [$kotlinArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public expect fun $kotlinArrayType.to$jsArrayType(): $jsArrayType")
}


private fun FileWriter.appendJsConversionsForType(
    ktType: String,
    jsType: String,
    isUnsigned: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine()
    appendLine("/** Returns a new [$kotlinArrayType] containing all the elements of this [$jsArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public actual inline fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
    appendLine("    unsafeCast<$kotlinArrayType>()")

    appendLine()
    appendLine("/** Returns a new [$jsArrayType] containing all the elements of this [$kotlinArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public actual inline fun $kotlinArrayType.to$jsArrayType(): $jsArrayType =")
    appendLine("    unsafeCast<$jsArrayType>()")
}

private fun FileWriter.appendWasmConversionsForType(
    ktType: String,
    jsType: String,
    isUnsigned: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine()
    appendLine("/** Returns a new [$kotlinArrayType] containing all the elements of this [$jsArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public actual fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
    if (isUnsigned) {
        appendLine("    $kotlinArrayType(this.length) { this[it].to$ktType() }")
    } else {
        appendLine("    $kotlinArrayType(this.length) { this[it] }")
    }

    appendLine()
    appendLine("/** Returns a new [$jsArrayType] containing all the elements of this [$kotlinArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public actual fun $kotlinArrayType.to$jsArrayType(): $jsArrayType {")
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
    FileWriter(File("../src/webtest/kotlin/arrayCopyTest.kt")).use { writer: FileWriter ->
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

data class Conversion(val jsType: String, val ktType: String, val isUnsigned: Boolean = false)
data class InteropCorrespondence(val interopType: String, val wasmType: String, val jsType: String)
