/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.dukat

import org.jetbrains.dukat.idlDeclarations.*
import org.jetbrains.kotlin.tools.dukat.wasm.translateIdlToWasmSourceSet
import org.jetbrains.kotlin.tools.idl.loadAllowlistedIdl
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class IrToDukatTest {

    private val dukat by lazy { loadAllowlistedIdl().toDukat() }

    private fun interfaces(name: String) =
        dukat.files.flatMap { it.declarations }.filterIsInstance<IDLInterfaceDeclaration>().filter { it.name == name }

    @Test
    fun specsAreMergedPerPackage() {
        val names = dukat.files.map { it.fileName }
        assertEquals(names.distinct(), names)
        assertTrue("org.w3c.dom.idl" in names, names.toString())
        assertTrue("org.khronos.webgl.idl" in names, names.toString())
    }

    @Test
    fun constructorMembersBecomeLegacyConstructorAttributes() {
        val event = interfaces("Event").single { !it.partial }
        val constructor = event.extendedAttributes.filterIsInstance<IDLFunctionExtendedAttributeDeclaration>().single()
        assertEquals("Constructor", constructor.functionName)
        assertEquals(listOf("type", "eventInitDict"), constructor.arguments.map { it.name })
        assertEquals("{}", constructor.arguments[1].defaultValue)
    }

    @Test
    fun legacyFactoryFunctionBecomesNamedConstructor() {
        val image = interfaces("HTMLImageElement").single { !it.partial }
        val named = image.extendedAttributes.filterIsInstance<IDLNamedFunctionExtendedAttributeDeclaration>().single()
        assertEquals("NamedConstructor", named.name)
        assertEquals("Image", named.functionName)
        assertEquals(IDLSingleTypeDeclaration("unsignedlong", null, false), named.arguments[0].type)
    }

    @Test
    fun typesUseDukatSpelling() {
        val target = interfaces("EventTarget").single()
        val addEventListener = target.operations.single { it.name == "addEventListener" }
        assertEquals(IDLSingleTypeDeclaration("void", null, false), addEventListener.returnType)
        assertEquals("UnionAddEventListenerOptionsOrboolean", addEventListener.arguments[2].type.name)

        val timeout = interfaces("AbortSignal").single().operations.single { it.name == "timeout" }
        assertTrue(timeout.static)
        assertEquals("unsignedlonglong", timeout.arguments.single().type.name)
    }

    @Test
    fun anonymousSpecialOperations() {
        val map = interfaces("DOMStringMap").single()
        assertEquals(listOf("get"), map.getters.map { it.name })
        assertEquals(listOf("set"), map.setters.map { it.name })
        assertEquals(emptyList(), map.operations)
    }

    @Test
    fun enumValuesAreQuotedLikeTheLegacyParser() {
        val mode = dukat.files.flatMap { it.declarations }.filterIsInstance<IDLEnumDeclaration>().single { it.name == "RequestMode" }
        assertEquals(listOf("\"navigate\"", "\"same-origin\"", "\"no-cors\"", "\"cors\""), mode.members)
    }

    /** Smoke test: the existing dukat wasm chain accepts the adapter's output for the whole allowlist. */
    @Test
    fun dukatWasmChainRuns() {
        val sourceSet = translateIdlToWasmSourceSet(dukat)
        assertTrue(sourceSet.sources.isNotEmpty())
    }
}
