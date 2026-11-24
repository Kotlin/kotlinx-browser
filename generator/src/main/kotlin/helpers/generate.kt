/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.generators.helpers

import org.jetbrains.kotlin.tools.idl.GeneratorPaths
import java.nio.file.Files

private const val SEE_DETAILS_AT = "generator/src/main/kotlin/helpers/generate.kt"

/** Rewrites the typed-array conversion helpers and their test. `GeneratedUtilsTest` fails while the committed files differ. */
fun main() {
    for ((path, content) in generateUtils()) {
        val file = GeneratorPaths.repositoryRoot.resolve(path)
        Files.createDirectories(file.parent)
        Files.writeString(file, content)
    }
}

/** The generated typed-array conversion helpers and their test: path relative to the repository root → content. */
fun generateUtils(): Map<String, String> {
    val conversions = buildList {
        add(Conversion("Byte", "Int8").also {
            add(Conversion("UByte", "Uint8", signedConversion = it))
        })

        add(Conversion("Short", "Int16").also {
            add(Conversion("UShort", "Uint16", signedConversion = it))
        })

        add(Conversion("Int", "Int32").also {
            add(Conversion("UInt", "Uint32", signedConversion = it))
        })

        add(Conversion("Float", "Float32"))
        add(Conversion("Double", "Float64"))
    }

    fun file(body: StringBuilder.() -> Unit) = buildString {
        append(generatedFileHeader(SEE_DETAILS_AT))
        body()
    }

    return sortedMapOf(
        "src/webMain/kotlin/org/khronos/webgl/arrayCopy.kt" to file {
            appendLine("package org.khronos.webgl")
            conversions.forEach { (ktType, jsType, signedConversion) ->
                appendExpectConversionsForType(ktType, jsType, signedConversion)
            }
        },
        "src/jsMain/kotlin/org/khronos/webgl/arrayCopy.js.kt" to file {
            appendLine("package org.khronos.webgl")
            conversions.forEach { (ktType, jsType, signedConversion) ->
                appendJsConversionsForType(ktType, jsType, signedConversion)
            }
        },
        "src/wasmJsMain/kotlin/org/khronos/webgl/arrayCopy.wasm.kt" to file {
            appendLine("package org.khronos.webgl")
            conversions.forEach { (ktType, jsType, signedConversion) ->
                appendWasmConversionsForType(ktType, jsType, signedConversion)
            }
        },
        "src/webTest/kotlin/arrayCopyTest.kt" to file { appendTests() },
    )
}

private fun StringBuilder.appendExpectConversionsForType(
    ktType: String,
    jsType: String,
    signedConversion: Conversion?
) {
    val isUnsigned = signedConversion != null
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


/**
 * On JS a Kotlin primitive array is the typed array of the same kind (`ByteArray` is an `Int8Array`), so a conversion
 * is a copy of exactly the elements of the view (`byteOffset`, `length`), never the object itself or its whole buffer.
 * An unsigned array goes through the signed one (`UByteArray` ↔ `ByteArray` ↔ `Int8Array`) with public API only.
 */
private fun StringBuilder.appendJsConversionsForType(
    ktType: String,
    jsType: String,
    signedConversion: Conversion?
) {
    val isUnsigned = signedConversion != null
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"
    val signedJsArrayType = "${signedConversion?.jsType}Array"
    val signedKotlinArrayType = "${signedConversion?.ktType}Array"

    appendLine()
    appendLine("/** Returns a new [$kotlinArrayType] containing all the elements of this [$jsArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
        appendLine("public actual inline fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
        appendLine("    $signedJsArrayType(buffer, byteOffset, length).unsafeCast<$signedKotlinArrayType>().copyOf().as$kotlinArrayType()")
    } else {
        appendLine("public actual inline fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
        appendLine("    unsafeCast<$kotlinArrayType>().copyOf()")
    }

    appendLine()
    appendLine("/** Returns a new [$jsArrayType] containing all the elements of this [$kotlinArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
        appendLine("public actual inline fun $kotlinArrayType.to$jsArrayType(): $jsArrayType =")
        appendLine("    $jsArrayType(as$signedKotlinArrayType().copyOf().unsafeCast<$signedJsArrayType>().buffer)")
    } else {
        appendLine("public actual inline fun $kotlinArrayType.to$jsArrayType(): $jsArrayType =")
        appendLine("    copyOf().unsafeCast<$jsArrayType>()")
    }
}

private fun StringBuilder.appendWasmConversionsForType(
    ktType: String,
    jsType: String,
    signedConversion: Conversion?
) {
    val isUnsigned = signedConversion != null
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine()
    appendLine("/** Returns a new [$kotlinArrayType] containing all the elements of this [$jsArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public actual fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
    appendLine("    $kotlinArrayType(this.length) { this[it] }")

    appendLine()
    appendLine("/** Returns a new [$jsArrayType] containing all the elements of this [$kotlinArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
    }
    appendLine("public actual fun $kotlinArrayType.to$jsArrayType(): $jsArrayType {")
    appendLine("    val result = $jsArrayType(this.size)")
    appendLine("    for (index in this.indices) {")
    appendLine("        result[index] = this[index]")
    appendLine("    }")
    appendLine("    return result")
    appendLine("}")
}

private fun StringBuilder.appendTests() {
    appendLine()
    appendLine("@file:OptIn(ExperimentalUnsignedTypes::class)")
    appendLine("import org.khronos.webgl.*")
    appendLine("import kotlin.test.*")


    appendTestJsRoundTripHelper("Byte", "Int8")
    appendTestJsRoundTripHelper("UByte", "Uint8")
    appendTestJsRoundTripHelper("Short", "Int16")
    appendTestJsRoundTripHelper("UShort", "Uint16")
    appendTestJsRoundTripHelper("Int", "Int32")
    appendTestJsRoundTripHelper("UInt", "Uint32")
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

private fun StringBuilder.appendTestJsRoundTripHelper(
    ktType: String,
    jsType: String,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine(
        """
            
            private fun testJsRoundTrip(array: $kotlinArrayType) {
                val jsArray = array.to$jsArrayType()
                assertEquals(array.size, jsArray.length)
                for (i in array.indices) {
                    assertEquals(array[i], jsArray[i])
                }
                val roundTrippedArray = jsArray.to$kotlinArrayType()
                assertContentEquals(array, roundTrippedArray)

                // A view converts only its own elements.
                if (array.size >= 3) {
                    val view = $jsArrayType(jsArray.buffer, $jsArrayType.BYTES_PER_ELEMENT, array.size - 2)
                    assertContentEquals(array.copyOfRange(1, array.size - 1), view.to$kotlinArrayType())
                }

                // Both conversions copy: changing one side leaves the other as it was.
                if (array.size >= 2 && array[0] != array[1]) {
                    val first = jsArray[0]
                    array[0] = array[1]
                    roundTrippedArray[0] = array[1]
                    assertEquals(first, jsArray[0])
                }
            }
        """.trimIndent()
    )
}

private fun StringBuilder.appendTestFunction(
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

data class Conversion(val ktType: String, val jsType: String, val signedConversion: Conversion? = null)