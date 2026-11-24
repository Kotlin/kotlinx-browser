/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.generators.helpers

import org.jetbrains.kotlin.tools.idl.GeneratorPaths
import java.nio.file.Files
import kotlin.test.Test
import kotlin.test.assertEquals

/** The committed typed-array conversion helpers and their test are exactly what `generateUtils` prints. */
class GeneratedUtilsTest {
    @Test
    fun generatedUtilsAreUpToDate() {
        for ((path, content) in generateUtils()) {
            val file = GeneratorPaths.repositoryRoot.resolve(path)
            val committed = if (Files.isRegularFile(file)) Files.readString(file) else null
            assertEquals(content, committed, "$path is out of date; run ./gradlew :generator:generateUtils")
        }
    }
}
