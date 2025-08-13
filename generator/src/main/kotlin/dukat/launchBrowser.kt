/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.dukat

import dukat.common.translateIdlToCommonSourceSet
import org.jetbrains.dukat.astModel.SourceSetModel
import org.jetbrains.dukat.translatorString.compileUnits
import org.jetbrains.dukat.translatorString.translateSourceSet
import org.jetbrains.kotlin.tools.dukat.js.translateIdlToJsSourceSet
import org.jetbrains.kotlin.tools.dukat.wasm.translateIdlToWasmSourceSet
import java.io.File

fun main() {
    val input = "../idl/org.w3c.dom.idl"

    compileAndSaveResultInto(
        "../src/webMain/kotlin/org.w3c/",
        translateIdlToCommonSourceSet(input)
    )

    compileAndSaveResultInto(
        "../src/wasmJsMain/kotlin/org.w3c/",
        translateIdlToWasmSourceSet(input)
    )

    compileAndSaveResultInto(
        "../src/jsMain/kotlin/org.w3c/",
        translateIdlToJsSourceSet(input)
    )
}

private fun compileAndSaveResultInto(directory: String, sourceSet: SourceSetModel) {
    compileUnits(translateSourceSet(sourceSet), directory)
    File(directory).walk().forEach {
        if (it.isFile && it.name.endsWith(".kt")) {
            it.writeText(getHeader() + it.readText())
        }
    }
}