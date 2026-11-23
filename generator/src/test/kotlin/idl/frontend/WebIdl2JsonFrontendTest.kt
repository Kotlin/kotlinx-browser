/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import org.jetbrains.kotlin.tools.idl.ALLOWLISTED_SOURCES
import org.jetbrains.kotlin.tools.idl.RepoPaths
import org.jetbrains.kotlin.tools.idl.ir.*
import kotlin.test.*

class WebIdl2JsonFrontendTest {

    private val frontend by lazy { WebIdl2JsonFrontend.fromFile(RepoPaths.webrefJson) }
    private val allowlisted by lazy { frontend.parse(ALLOWLISTED_SOURCES) }

    private inline fun <reified T : IdlNamedDefinition> IdlIR.definitions(name: String): List<T> =
        definitions.filterIsInstance<T>().filter { it.name == name }.toList()

    private fun IdlIR.mainInterface(name: String): IdlInterface =
        definitions<IdlInterface>(name).single { !it.partial }

    // ---- parse integrity gate ---------------------------------------------------------------------------------------

    /** Every spec in the pinned corpus — not just the allowlisted ones — must be read with zero problems. */
    @Test
    fun wholeCorpusIsReadWithoutProblems() {
        val all = frontend.availableSpecs.map { IdlSource(it, "corpus.$it") }
        assertTrue(all.size > 300, "suspiciously small corpus: ${all.size} specs")
        val ir = frontend.parse(all)
        assertEquals(all.size, ir.specs.size)
        val empty = ir.specs.filter { it.definitions.isEmpty() }.map { it.name }
        assertEquals(emptyList(), empty, "specs without definitions")
    }

    @Test
    fun everyAllowlistedSpecIsPresent() {
        assertEquals(ALLOWLISTED_SOURCES.map { it.spec }, allowlisted.specs.map { it.name })
        assertEquals(ALLOWLISTED_SOURCES.map { it.packageName }, allowlisted.specs.map { it.packageName })
    }

    // ---- constructs the legacy ANTLR grammar broke or silently corrupted ---------------------------------------------

    @Test
    fun constructorIsAConstructorNotANamelessOperation() {
        val event = allowlisted.mainInterface("Event")
        val constructor = event.members.filterIsInstance<IdlConstructor>().single()
        assertEquals(listOf("type", "eventInitDict"), constructor.arguments.map { it.name })
        assertEquals(IdlValue.EmptyDictionary, constructor.arguments[1].default)
        assertTrue(event.members.filterIsInstance<IdlOperation>().none { it.name == null })
    }

    @Test
    fun undefinedIsAReturnTypeNotAReference() {
        val addEventListener = allowlisted.mainInterface("EventTarget").members
            .filterIsInstance<IdlOperation>().single { it.name == "addEventListener" }
        assertEquals(IdlNamedType("undefined"), addEventListener.returnType)
        assertEquals(
            IdlUnionType(listOf(IdlNamedType("AddEventListenerOptions"), IdlNamedType("boolean"))),
            addEventListener.arguments[2].type,
        )
    }

    @Test
    fun exposedWildcard() {
        assertEquals(
            IdlExtendedAttribute("Exposed", IdlExtendedAttributeValue.Wildcard),
            allowlisted.mainInterface("Event").extAttrs.find("Exposed"),
        )
    }

    @Test
    fun stringValuedAndListValuedExtendedAttributes() {
        val relList = allowlisted.mainInterface("HTMLAnchorElement").members
            .filterIsInstance<IdlAttribute>().single { it.name == "relList" }
        assertEquals(IdlExtendedAttributeValue.StringValue("rel"), relList.extAttrs.find("Reflect")?.rhs)
        assertEquals(IdlExtendedAttributeValue.Identifier("value"), relList.extAttrs.find("PutForwards")?.rhs)

        val colSpan = allowlisted.mainInterface("HTMLTableCellElement").members
            .filterIsInstance<IdlAttribute>().single { it.name == "colSpan" }
        assertEquals(IdlExtendedAttributeValue.IntegerList(listOf("1", "1000")), colSpan.extAttrs.find("ReflectRange")?.rhs)
        assertEquals(IdlExtendedAttributeValue.Integer("1"), colSpan.extAttrs.find("ReflectDefault")?.rhs)
    }

    @Test
    fun legacyFactoryFunctionKeepsItsArguments() {
        val image = allowlisted.mainInterface("HTMLImageElement").extAttrs.find("LegacyFactoryFunction")!!
        assertEquals(IdlExtendedAttributeValue.Identifier("Image"), image.rhs)
        assertEquals(listOf("width", "height"), image.arguments.map { it.name })
        assertTrue(image.arguments.all { it.optional && it.type == IdlNamedType("unsigned long") })
    }

    @Test
    fun typeLevelExtendedAttributesAreKept() {
        val innerText = allowlisted.mainInterface("HTMLElement").members
            .filterIsInstance<IdlAttribute>().single { it.name == "innerText" }
        assertEquals(
            IdlNamedType("DOMString", extAttrs = listOf(IdlExtendedAttribute("LegacyNullToEmptyString", null))),
            innerText.type,
        )
        assertEquals(listOf("CEReactions"), innerText.extAttrs.map { it.name })
    }

    @Test
    fun multiWordPrimitiveNamesAreKeptVerbatim() {
        val timeout = allowlisted.mainInterface("AbortSignal").members
            .filterIsInstance<IdlOperation>().single { it.name == "timeout" }
        assertEquals(IdlOperationSpecial.STATIC, timeout.special)
        val argument = timeout.arguments.single()
        assertEquals(IdlNamedType("unsigned long long"), argument.type)
        // webidl2 attaches extended attributes written before an argument to the argument, not its type.
        assertEquals(listOf(IdlExtendedAttribute("EnforceRange", null)), argument.extAttrs)
    }

    @Test
    fun declarationMembersAndSpecialOperations() {
        val headers = allowlisted.mainInterface("Headers")
        val iterable = headers.members.filterIsInstance<IdlDeclarationMember>().single()
        assertEquals(IdlDeclarationMemberKind.ITERABLE, iterable.kind)
        assertEquals(listOf(IdlNamedType("ByteString"), IdlNamedType("ByteString")), iterable.typeArguments)

        val specials = allowlisted.mainInterface("DOMStringMap").members.filterIsInstance<IdlOperation>()
        assertEquals(
            listOf(IdlOperationSpecial.GETTER, IdlOperationSpecial.SETTER, IdlOperationSpecial.DELETER),
            specials.map { it.special },
        )
        assertTrue(specials.all { it.name == null })
    }

    @Test
    fun partialsAcrossSpecsAreKeptSeparate() {
        val elements = allowlisted.specs.flatMap { spec ->
            spec.definitions.filterIsInstance<IdlInterface>().filter { it.name == "Element" }.map { spec.name to it.partial }
        }
        assertEquals(listOf("dom" to false), elements.filter { !it.second })
        assertTrue(elements.count { it.second } >= 3, "expected partial Element in several specs: $elements")
    }

    @Test
    fun genericsAndBigint() {
        val adoptedStyleSheets = allowlisted.definitions<IdlInterface>("DocumentOrShadowRoot")
            .flatMap { it.members }.filterIsInstance<IdlAttribute>().single { it.name == "adoptedStyleSheets" }
        assertEquals(IdlGenericType("ObservableArray", listOf(IdlNamedType("CSSStyleSheet"))), adoptedStyleSheets.type)

        val changeId = allowlisted.mainInterface("ClipboardChangeEvent").members
            .filterIsInstance<IdlAttribute>().single { it.name == "changeId" }
        assertEquals(IdlNamedType("bigint"), changeId.type)
    }

    // ---- strictness -------------------------------------------------------------------------------------------------

    @Test
    fun missingSpecIsAnError() {
        val e = assertFailsWith<IdlFrontendException> {
            WebIdl2JsonFrontend.fromString("""{"a": []}""").parse(listOf(IdlSource("b", "p")))
        }
        assertEquals(listOf("spec 'b' is not present in the webref JSON"), e.problems)
    }

    @Test
    fun unknownDefinitionTypeIsAnError() {
        val e = assertFailsWith<IdlFrontendException> {
            WebIdl2JsonFrontend.fromString("""{"a": [{"type": "module", "name": "X"}]}""").parse(listOf(IdlSource("a", "p")))
        }
        assertTrue(e.problems.single().contains("unknown definition type 'module'"), e.message)
    }

    @Test
    fun unexpectedKeyIsAnError() {
        val json = """
            {"a": [{"type": "enum", "name": "E", "values": [{"type": "enum-value", "value": "x"}], "extAttrs": [], "since": 3}]}
        """
        val e = assertFailsWith<IdlFrontendException> {
            WebIdl2JsonFrontend.fromString(json).parse(listOf(IdlSource("a", "p")))
        }
        assertTrue(e.problems.single().contains("unexpected key(s) [since]"), e.message)
    }

    @Test
    fun allProblemsAreReportedNotJustTheFirst() {
        val json = """{"a": [{"type": "module"}, {"type": "package"}]}"""
        val e = assertFailsWith<IdlFrontendException> {
            WebIdl2JsonFrontend.fromString(json).parse(listOf(IdlSource("a", "p")))
        }
        assertEquals(2, e.problems.size, e.message)
    }
}
