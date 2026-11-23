/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.generators.helpers

import org.jetbrains.kotlin.tools.idl.RepoPaths
import java.nio.file.Files

private const val SEE_DETAILS_AT = "generator/src/main/kotlin/helpers/generate.kt"

/** Rewrites the typed-array conversion helpers and their test. `GeneratedUtilsTest` fails while the committed files differ. */
fun main() {
    for ((path, content) in generateUtils()) {
        Files.writeString(RepoPaths.root.resolve(path), content)
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
        "src/webMain/kotlin/arrayCopy.kt" to file {
            appendLine("package org.khronos.webgl")
            conversions.forEach { (ktType, jsType, signedConversion) ->
                appendExpectConversionsForType(ktType, jsType, signedConversion)
            }
        },
        "src/jsMain/kotlin/arrayCopy.js.kt" to file {
            appendLine("package org.khronos.webgl")
            conversions.forEach { (ktType, jsType, signedConversion) ->
                appendJsConversionsForType(ktType, jsType, signedConversion)
            }
        },
        "src/wasmJsMain/kotlin/arrayCopy.wasm.kt" to file {
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
        appendLine("@Suppress(\"INVISIBLE_REFERENCE\")")
    }
    appendLine("public actual inline fun $jsArrayType.to$kotlinArrayType(): $kotlinArrayType =")
    if (isUnsigned) {
        appendLine("    $kotlinArrayType($signedJsArrayType(buffer).unsafeCast<$signedKotlinArrayType>())")
    } else {
        appendLine("    unsafeCast<$kotlinArrayType>()")
    }

    appendLine()
    appendLine("/** Returns a new [$jsArrayType] containing all the elements of this [$kotlinArrayType]. */")
    if (isUnsigned) {
        appendLine("@ExperimentalUnsignedTypes")
        appendLine("@Suppress(\"INVISIBLE_REFERENCE\")")
    }
    appendLine("public actual inline fun $kotlinArrayType.to$jsArrayType(): $jsArrayType =")
    if (isUnsigned) {
        appendLine("    $jsArrayType(storage.unsafeCast<$signedJsArrayType>().buffer)")
    } else {
        appendLine("    unsafeCast<$jsArrayType>()")
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

private fun StringBuilder.appendTests() {
    appendLine()
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
    appendTestFunction("UByte", ignored = true)
    appendTestFunction("Short")
    appendTestFunction("UShort", ignored = true)
    appendTestFunction("Int")
    appendTestFunction("UInt", ignored = true)
    appendTestFunction("Float")
    appendTestFunction("Double")

    appendLine("}")
}

private fun StringBuilder.appendTestJsRoundTripHelper(
    ktType: String,
    jsType: String,
    isUnsigned: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val jsArrayType = "${jsType}Array"

    appendLine(
        """
            
            private fun testJsRoundTrip(array: $kotlinArrayType) {
                ${
                    if (isUnsigned) {
               """
               val jsArray = array.to$jsArrayType()
               // It never worked in JS since there is a bug in the implementation and we can't drop it because of ABI compatibility.
               // The bug is simple, we declare that get operator returns Byte/Short/Int, while it's not true (it always returns Int).
               //  for (i in array.indices) {
               //     assertEquals(array[i], jsArray[i]${if (isUnsigned) ".to$ktType()" else ""})
               // }
                """
                    } else {
                """
                val jsArray = array.to$jsArrayType()
                for (i in array.indices) {
                    assertEquals(array[i], jsArray[i]${if (isUnsigned) ".to$ktType()" else ""})
                }
                """
                    } 
                }
                assertEquals(array.size, jsArray.length)
                val roundTrippedArray = jsArray.to$kotlinArrayType()
                assertContentEquals(array, roundTrippedArray)
            }
        """.trimIndent()
    )
}

/** [ignored]: the unsigned round trips fail on JS (KT-79776). */
private fun StringBuilder.appendTestFunction(
    ktType: String,
    ignored: Boolean = false,
) {
    val kotlinArrayType = "${ktType}Array"
    val ktArrayOf = "${ktType.lowercase()}ArrayOf"

    appendLine()
    appendLine("    @Test")
    if (ignored) appendLine("    @Ignore // KT-79776")
    appendLine("    fun test$kotlinArrayType() {")
    appendLine("        testJsRoundTrip($ktArrayOf())")
    appendLine("        testJsRoundTrip($ktArrayOf(0.to$ktType(), (-42).to$ktType(), $ktType.MIN_VALUE, $ktType.MAX_VALUE))")
    appendLine("        testJsRoundTrip($kotlinArrayType(1000) { it.to$ktType() })")
    appendLine("    }")
}

data class Conversion(val ktType: String, val jsType: String, val signedConversion: Conversion? = null)
data class InteropCorrespondence(val interopType: String, val wasmType: String, val jsType: String)
