/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.backend

import org.jetbrains.kotlin.tools.idl.Golden
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.GOLDEN_SLICE
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.slice
import org.jetbrains.kotlin.tools.idl.loadEvents
import org.jetbrains.kotlin.tools.idl.loadSurface
import org.jetbrains.kotlin.tools.idl.loadWebDocs
import org.jetbrains.kotlin.tools.idl.ir.IdlInterface
import org.jetbrains.kotlin.tools.idl.ir.IdlOperation
import org.jetbrains.kotlin.tools.idl.ir.IdlOperationSpecial
import org.jetbrains.kotlin.tools.idl.lowering.lower
import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinBackendTest {
    private val lowered by lazy { loadSurface().ir.lower(loadEvents()) }

    /** The Kotlin printed for the golden slice; lookups (packages, shapes, overrides) use the whole surface. */
    @Test
    fun goldenKotlinSlice() {
        val backend = KotlinBackend(lowered, loadWebDocs())
        val printed = lowered.ir
            .slice(GOLDEN_SLICE)
            .specs
            .joinToString("\n") { spec -> "// file: ${backend.path(spec)}\n" + backend.file(spec) }
        Golden.assertMatches("kotlin-slice.kt", printed)
    }

    /** Fails on anything the backend cannot print, such as two enum values with the same Kotlin name. */
    @Test
    fun everySpecPrints() {
        val backend = KotlinBackend(lowered, loadWebDocs())
        lowered.ir.specs.forEach { backend.file(it) }
    }

    /** Each exclusion still names a special getter or setter, so it goes away when the spec is fixed. */
    @Test
    fun notIndexersAreStillSpecial() {
        val specials = lowered.ir.definitions
            .filterIsInstance<IdlInterface>()
            .flatMap { i ->
                i.members
                    .filterIsInstance<IdlOperation>()
                    .filter { it.special == IdlOperationSpecial.GETTER || it.special == IdlOperationSpecial.SETTER }
                    .map { "${i.name}.${it.name}" }
            }
        assertEquals(emptySet(), NOT_INDEXERS - specials.toSet())
    }

    /** Each registration names an operation taking a callback interface, and its removal exists. */
    @Test
    fun listenerRegistrationsExist() {
        val operations = lowered.ir.definitions
            .filterIsInstance<IdlInterface>()
            .flatMap { i -> i.members.filterIsInstance<IdlOperation>().map { "${i.name}.${it.name}" } }
            .toSet()
        val missing = LISTENER_REGISTRATIONS.flatMap { (add, remove) -> listOf(add, add.substringBefore('.') + "." + remove) }
        assertEquals(emptySet(), missing.toSet() - operations)
    }

    @Test
    fun enumValueNames() {
        val cases = mapOf(
            "navigate" to "NAVIGATE",
            "same-origin" to "SAME_ORIGIN",
            "" to "EMPTY",
            "flipY" to "FLIP_Y",
            "keyID" to "KEY_ID",
            "HRTF" to "HRTF",
            "smpteSt2094-10" to "SMPTE_ST2094_10",
            "2d" to "_2D",
            "2d-array" to "_2D_ARRAY",
            "application/xhtml+xml" to "APPLICATION_XHTML_XML",
            "AES_128_GCM_SHA256_128" to "AES_128_GCM_SHA256_128",
            "I420AP10" to "I420AP10",
        )
        assertEquals(cases, cases.mapValues { enumValueName(it.key) })
    }
}
