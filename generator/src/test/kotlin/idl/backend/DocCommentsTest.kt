/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.backend

import org.jetbrains.kotlin.tools.idl.frontend.WebDocs
import org.jetbrains.kotlin.tools.idl.generateWebApi
import org.jetbrains.kotlin.tools.idl.ir.IdlOperation
import org.jetbrains.kotlin.tools.idl.ir.IdlOperationSpecial
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ctor
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.includes
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.op
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class DocCommentsTest {

    private val docs = WebDocs.fromStrings(
        bcd = """
            {
              "Node": {"mdnUrl": "https://developer.mozilla.org/docs/Web/API/Node", "members": {}},
              "Element": {"mdnUrl": "https://developer.mozilla.org/docs/Web/API/Element", "members": {
                "Element": {"mdnUrl": "https://developer.mozilla.org/docs/Web/API/Element/Element"},
                "append": {"mdnUrl": "https://developer.mozilla.org/docs/Web/API/Element/append"},
                "click_event": {"mdnUrl": "https://developer.mozilla.org/docs/Web/API/Element/click_event"},
                "create_static": {"mdnUrl": "https://developer.mozilla.org/docs/Web/API/Element/create_static", "deprecated": true}
              }},
              "HTMLElement": {"members": {}}
            }
        """,
        summaries = """{"Web/API/Element/append": "The append() method inserts nodes."}""",
    )

    private val lookup = DocLookup(
        docs,
        ir(
            spec(
                "s",
                iface("Element", ctor(), op("create", t("Element")).static(), inheritance = "Node"),
                iface("HTMLElement", inheritance = "Element"),
                mixin("ParentNode", op("append")),
                mixin("GlobalEventHandlers", attr("onclick")),
                includes("Element", "ParentNode"),
                includes("HTMLElement", "GlobalEventHandlers"),
            ),
        ),
    )

    @Test
    fun mixinMemberIsDocumentedOnTheIncludingInterface() {
        val doc = lookup.ofMember("ParentNode", op("append"))!!
        assertEquals("https://developer.mozilla.org/docs/Web/API/Element/append", doc.mdnUrl)
        assertEquals("The append() method inserts nodes.", doc.summary)
    }

    @Test
    fun eventHandlerIsDocumentedWithItsEventOnAnAncestorOfTheIncludingInterface() {
        val doc = lookup.ofMember("GlobalEventHandlers", attr("onclick"))!!
        assertEquals("https://developer.mozilla.org/docs/Web/API/Element/click_event", doc.mdnUrl)
        assertNull(doc.summary)
    }

    @Test
    fun constructorsAndStatics() {
        assertEquals("https://developer.mozilla.org/docs/Web/API/Element/Element", lookup.ofMember("Element", ctor())!!.mdnUrl)
        val static = lookup.ofMember("Element", op("create", t("Element")).static())!!
        assertEquals("https://developer.mozilla.org/docs/Web/API/Element/create_static", static.mdnUrl)
        assertEquals(true, static.deprecated)
    }

    @Test
    fun aMixinHasNoPageOfItsOwnAndAnInterfaceMemberIsNotLookedUpOnAncestors() {
        assertNull(lookup.ofDefinition("ParentNode"))
        assertNull(lookup.ofDefinition("HTMLElement"), "BCD has HTMLElement, but no MDN page")
        assertNull(lookup.ofMember("HTMLElement", op("append")), "Element.append is not HTMLElement's own page")
    }

    @Test
    fun kdocText() {
        val doc = docs.ofMember("Element", "append")!!.copy(
            summary = "Returns [key, value] pairs of <audio> elements, see */ and @param. " + "word ".repeat(30).trim(),
            deprecated = true,
        )
        assertEquals(
            listOf(
                "/**",
                " * Returns \\[key, value\\] pairs of &lt;audio&gt; elements, see *&#47; and \\@param. word word word word word word",
                " * word word word word word word word word word word word word word word word word word word word word word word",
                " * word word",
                " *",
                " * Deprecated: MDN no longer recommends using this feature.",
                " *",
                " * Available only in secure contexts.",
                " *",
                " * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/append)",
                " */",
            ),
            kdocLines(doc, secureContext = true, indent = 4),
        )
        assertEquals(emptyList(), kdocLines(null, secureContext = false, indent = 0))
    }

    @Test
    fun summaryWithoutTheListItIntroduces() {
        assertEquals("It is a key.", summaryText("It is a key. It can have the following values:"))
        assertNull(summaryText("It can be used to:"))
        assertEquals("One line.", summaryText("  One\n   line. "))
    }

    /** The pinned BCD and MDN summaries: how much of the generated API is documented. */
    @Test
    fun pinnedCoverage() {
        val kdocs = generateWebApi().values.flatMap { file -> Regex("/\\*\\*\n(.*?)\\*/", RegexOption.DOT_MATCHES_ALL).findAll(file).map { it.groupValues[1] } }
        assertEquals(4154, kdocs.size)
        assertEquals(4148, kdocs.count { "[MDN Reference]" in it })
        assertEquals(4137, kdocs.count { "[MDN Reference]" in it && !it.trimStart().startsWith("* [MDN Reference]") })
        assertEquals(162, kdocs.count { "Deprecated:" in it })
    }

    private fun IdlOperation.static() = copy(special = IdlOperationSpecial.STATIC)
}
