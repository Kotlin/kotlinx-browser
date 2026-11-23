/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.surface

import org.jetbrains.kotlin.tools.idl.Golden
import org.jetbrains.kotlin.tools.idl.RepoPaths
import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.loadSurface
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** The real allowlist + exclusions resolve completely, and the committed surface report is up to date. */
class RealSurfaceTest {
    private val surface by lazy { loadSurface() }

    @Test
    fun surfaceReportIsUpToDate() {
        Golden.assertMatchesFile(RepoPaths.surfaceReport, surface.report())
    }

    @Test
    fun trustedTypesAlternativesAreDroppedFromHtmlSinks() {
        val innerHTML = surface.ir.definitions.filterIsInstance<IdlInterface>()
            .flatMap { it.members }.filterIsInstance<IdlAttribute>().first { it.name == "innerHTML" }
        assertEquals(
            IdlNamedType("DOMString", extAttrs = listOf(IdlExtendedAttribute("LegacyNullToEmptyString", null))),
            innerHTML.type,
        )
    }

    @Test
    fun noReferenceIntoAnExcludedSpecSurvives() {
        val rendered = surface.ir.definitions.joinToString("\n") { it.render() }
        for (name in listOf("TrustedHTML", "Animation ", "GPUCanvasContext", "VideoFrame", "CSSPseudoElement", "ViewTransition")) {
            assertTrue(name !in rendered, "$name still referenced")
        }
    }
}
