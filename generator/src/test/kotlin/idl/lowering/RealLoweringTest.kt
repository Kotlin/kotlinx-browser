/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.dukat.idlDeclarations.IDLInterfaceDeclaration
import org.jetbrains.dukat.idlDeclarations.InterfaceKind
import org.jetbrains.dukat.idlLowerings.addConstructors
import org.jetbrains.dukat.idlLowerings.markAbstractOrOpen
import org.jetbrains.dukat.idlLowerings.resolvePartials
import org.jetbrains.kotlin.tools.idl.Golden
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.GOLDEN_SLICE
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.slice
import org.jetbrains.kotlin.tools.idl.dukat.toDukat
import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.loadSurface
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** The lowerings on the real, pinned surface. */
class RealLoweringTest {

    private val surface by lazy { loadSurface().ir }
    private val lowered by lazy { surface.lower() }
    private val shapes
        get() = lowered.shapes

    @Test
    fun invariants() {
        assertEquals(
            emptyList(),
            lowered
                .ir
                .definitions
                .filter { it is IdlPartialable && it.partial }
                .toList()
        )

        assertEquals(
            emptyList(),
            lowered
                .ir
                .definitions
                .filterIsInstance<IdlTypedef>()
                .toList()
        )

        val typedefNames = surface
            .definitions
            .filterIsInstance<IdlTypedef>()
            .map { it.name }
            .toSet()

        val leftover = lowered
            .ir
            .definitions
            .flatMap { d ->
                d.allTypes()
                    .filterIsInstance<IdlNamedType>()
                    .map { it.name }
            }
            .filter { it in typedefNames }
            .toSet()

        assertEquals(
            emptySet(),
            leftover,
            "typedef references left after resolveTypedefs"
        )
    }

    @Test
    fun knownShapes() {
        assertEquals(
            ShapeKind.OPEN_CLASS,
            shapes["EventTarget"].kind
        )
        assertEquals(
            ShapeKind.ABSTRACT_CLASS,
            shapes["XMLHttpRequestUpload"].kind
        )
        assertEquals(
            ShapeKind.ABSTRACT_CLASS,
            shapes["HTMLImageElement"].kind,
            "[HTMLConstructor] constructor() does not count"
        )
        assertEquals(
            ShapeKind.OPEN_CLASS,
            shapes["Image"].kind
        )
        assertEquals(
            listOf("HTMLImageElement"),
            shapes["Image"].supertypes
        )
        assertEquals(
            setOf("Image", "Audio", "Option"),
            shapes.factoryClasses.map { it.name }.toSet()
        )
        assertEquals(
            ShapeKind.INTERFACE,
            shapes["GlobalEventHandlers"].kind
        )
        assertEquals(
            ShapeKind.INTERFACE,
            shapes["EventListener"].kind
        )
        assertEquals(
            ShapeKind.OBJECT,
            shapes["CSS"].kind
        )
        assertTrue(
            "GlobalEventHandlers" in shapes["HTMLElement"].supertypes,
            shapes["HTMLElement"].supertypes.toString()
        )
        assertEquals("Element", shapes["HTMLElement"].supertypes.first())
    }

    @Test
    fun constantsAreCopied() {
        fun names(n: String) = shapes[n].constants.map { it.constant.name }
        assertTrue("ELEMENT_NODE" in names("Element"))
        assertTrue("ELEMENT_NODE" in names("Image"))
        assertTrue("COLOR_BUFFER_BIT" in names("WebGLRenderingContext"))
        assertTrue("COLOR_BUFFER_BIT" in names("WebGL2RenderingContext"))
        assertTrue("READ_BUFFER" in names("WebGL2RenderingContext"))
        // The only constants that cannot be copied anywhere. Needs a decision (Key Decision 13 covers classes only).
        assertEquals(setOf("NodeFilter"), shapes.constantsWithoutClassHome.keys)
    }

    /**
     * The port is compared with dukat's own `markAbstractOrOpen` on the same input. Every difference must be one of
     * the two deliberate fixes; anything else fails.
     */
    @Test
    fun abstractOrOpenDiffersFromDukatOnlyByTheCorrectedRule() {
        val dukat = surface
            .toDukat()
            .resolvePartials()
            .addConstructors()
            .markAbstractOrOpen()
            .files
            .flatMap { it.declarations }
            .filterIsInstance<IDLInterfaceDeclaration>()
            .filter { !it.mixin }
            .associate { it.name to it.kind }

        val interfaces = lowered
            .ir
            .definitions
            .filterIsInstance<IdlInterface>()
            .associateBy { it.name }

        val inheritedOnly = mutableListOf<String>()

        val htmlConstructorOnly = mutableListOf<String>()
        val unexplained = mutableListOf<String>()

        for ([name, dukatKind] in dukat) {
            val ours = shapes
                .byName[name]
                ?.kind
                ?: run { unexplained += "$name: missing"; continue }

            val expected = when (dukatKind) {
                InterfaceKind.INTERFACE -> ShapeKind.INTERFACE
                InterfaceKind.ABSTRACT_CLASS -> ShapeKind.ABSTRACT_CLASS
                InterfaceKind.OPEN_CLASS -> ShapeKind.OPEN_CLASS
            }

            if (ours == expected) {
                continue
            }

            // IrToDukat feeds namespaces to dukat as interfaces with static members (it has no namespace support).
            if (ours == ShapeKind.OBJECT && surface.definitions.any { it is IdlNamespace && it.name == name }) {
                continue
            }

            val ctors = interfaces[name]?.members?.filterIsInstance<IdlConstructor>().orEmpty()
            when {
                expected == ShapeKind.OPEN_CLASS &&
                        ours == ShapeKind.ABSTRACT_CLASS &&
                        ctors.isEmpty() ->
                    inheritedOnly += name

                expected == ShapeKind.OPEN_CLASS &&
                        ours == ShapeKind.ABSTRACT_CLASS &&
                        ctors.all { it.extAttrs.has("HTMLConstructor") } ->
                    htmlConstructorOnly += name

                else -> unexplained += "$name: dukat $dukatKind, ours $ours"
            }
        }
        assertEquals(
            emptyList(),
            unexplained
        )
        assertTrue("XMLHttpRequestUpload" in inheritedOnly)
        assertTrue("HTMLImageElement" in htmlConstructorOnly)
    }

    @Test
    fun goldenLoweredSlice() {
        val slice = LoweredIR(
            lowered.ir.slice(GOLDEN_SLICE),
            shapes
        )
        Golden.assertMatches("lowered-slice.idl", slice.render())
    }
}
