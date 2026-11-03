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
import org.jetbrains.kotlin.tools.idl.dukat.toDukat
import org.jetbrains.kotlin.tools.idl.RepoPaths
import org.jetbrains.kotlin.tools.idl.loadSurface
import java.io.File

fun main() {
    val surface = loadSurface()
    RepoPaths.surfaceReport.toFile().writeText(surface.report())

    // Each translator gets its own copy: dukat lowerings are not guaranteed to be free of shared mutable state.
    fun input() = surface.ir.toDukat(PACKAGE_OVERRIDES)

    compileAndSaveResultInto(
        "../src/webMain/kotlin/org.w3c/",
        translateIdlToCommonSourceSet(input())
    )

    compileAndSaveResultInto(
        "../src/wasmJsMain/kotlin/org.w3c/",
        translateIdlToWasmSourceSet(input())
    )

    compileAndSaveResultInto(
        "../src/jsMain/kotlin/org.w3c/",
        translateIdlToJsSourceSet(input())
    )
}

private fun compileAndSaveResultInto(directory: String, sourceSet: SourceSetModel) {
    // Delete what an earlier run generated, so files this run does not produce do not linger.
    File(directory).walk().filter { it.isFile && it.name.endsWith(".kt") && it.isGenerated() }.forEach { it.delete() }
    for (path in compileUnits(translateSourceSet(sourceSet), directory)) {
        val file = File(directory, path) // compileUnits returns bare file names
        if (file.name.endsWith(".kt")) file.writeText(getHeader() + file.readText())
    }
}

/** Only files carrying the generated-file header are ever deleted; anything else in the directory is left alone. */
private fun File.isGenerated(): Boolean = useLines { lines -> lines.take(20).any { "THIS FILE IS AUTO-GENERATED" in it } }
