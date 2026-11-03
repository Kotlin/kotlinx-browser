/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl

import java.nio.file.Files
import java.nio.file.Path
import kotlin.test.assertEquals

/** Golden files live in `generator/src/test/resources/golden`; regenerate with `./gradlew :generator:test -PupdateGolden=true`. */
object Golden {
    private val dir: Path get() = RepoPaths.root.resolve("generator/src/test/resources/golden")

    private val update: Boolean get() = System.getProperty("kotlinx.browser.updateGolden") == "true"

    fun assertMatches(fileName: String, actual: String) {
        val file = dir.resolve(fileName)
        if (update || !Files.exists(file)) {
            Files.createDirectories(file.parent)
            Files.writeString(file, actual)
            if (!update) error("Golden file $file did not exist and was created; review it and re-run.")
            return
        }
        assertEquals(Files.readString(file), actual, "Mismatch with golden file $file (re-run with -PupdateGolden=true to accept)")
    }
}
