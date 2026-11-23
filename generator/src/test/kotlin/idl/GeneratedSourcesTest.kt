/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl

import kotlin.test.Test
import kotlin.test.assertEquals

/** The committed `src/webMain/generated` is exactly what the generator prints. */
class GeneratedSourcesTest {
    @Test
    fun generatedSourcesAreUpToDate() {
        val expected = generateWebApi()
        val committed = committedWebApi()
        val hint = "src/webMain/generated is out of date; run ./gradlew :generator:generateWebApi"
        assertEquals(expected.keys, committed.keys, hint)
        for ((path, content) in expected) {
            assertEquals(content, committed[path], "$hint ($path)")
        }
    }
}
