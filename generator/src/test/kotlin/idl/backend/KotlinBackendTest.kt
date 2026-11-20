/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.backend

import org.jetbrains.kotlin.tools.idl.Golden
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.GOLDEN_SLICE
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.slice
import org.jetbrains.kotlin.tools.idl.loadEvents
import org.jetbrains.kotlin.tools.idl.loadSurface
import org.jetbrains.kotlin.tools.idl.lowering.lower
import kotlin.test.Test

class KotlinBackendTest {
    private val lowered by lazy { loadSurface().ir.lower(loadEvents()) }

    /** The Kotlin printed for the golden slice; lookups (packages, shapes, overrides) use the whole surface. */
    @Test
    fun goldenKotlinSlice() {
        val backend = KotlinBackend(lowered)
        val printed = lowered.ir
            .slice(GOLDEN_SLICE)
            .specs
            .joinToString("\n") { spec -> "// file: ${backend.path(spec)}\n" + backend.file(spec) }
        Golden.assertMatches("kotlin-slice.kt", printed)
    }
}
