/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ctor
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.includes
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.op
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.*

class OverridesTest {

    private fun overrides(vararg definitions: IdlDefinition): Overrides {
        val ir = ir(spec("s", *definitions))
        val markers = UnionMarkers.of(ir)
        return Overrides.of(ir, Shapes.of(ir, markers), markers)
    }

    private fun readonly(name: String, type: IdlType) = attr(name, type).copy(readonly = true)

    @Test
    fun aRedeclaredMemberIsAnOverride() {
        val x = attr("x", t("double"))
        val o = overrides(
            iface("DOMPointReadOnly", readonly("x", t("double")), op("f", t("Node"), arg("a", t("DOMString")))),
            iface("DOMPoint", x, op("f", t("Element"), arg("a", t("USVString"))), op("f", t("Node"), arg("a", t("long"))), inheritance = "DOMPointReadOnly"),
            iface("Node"), iface("Element", inheritance = "Node"),
        )
        assertTrue(o["DOMPoint"].isOverride(x), "a var over a val of the same type")
        assertTrue(o["DOMPoint"].isOverride(op("f", t("Element"), arg("a", t("USVString")))), "same Kotlin parameters, narrower return type")
        assertFalse(o["DOMPoint"].isOverride(op("f", t("Node"), arg("a", t("long")))), "other parameters: an overload")
        assertEquals(emptySet(), o["DOMPoint"].dropped)
    }

    @Test
    fun aMemberThatCannotOverrideIsDropped() {
        val className = readonly("className", t("SVGAnimatedString"))
        val returnValue = attr("returnValue", t("DOMString"))
        val o = overrides(
            iface("Element", attr("className", t("DOMString")), attr("returnValue", t("boolean")), attr("v", t("long"))),
            iface("SVGElement", className, returnValue, readonly("v", t("long")), inheritance = "Element"),
            iface("SVGAnimatedString"),
        )
        assertEquals(
            listOf("attribute className", "attribute returnValue", "attribute v"),
            o["SVGElement"].dropped.map { memberKey(it) },
            "another type; another type for a var; a val over a var",
        )
        assertFalse(o["SVGElement"].isOverride(className))
        assertTrue(o["SVGElement"].isDropped(className))
    }

    @Test
    fun anOpenClassAddsTheAbstractMembersItInherits() {
        val onclick = attr("onclick", t("EventHandler"))
        val children = readonly("children", t("HTMLCollection"))
        val o = overrides(
            mixin("GlobalEventHandlers", onclick),
            mixin("ParentNode", children),
            iface("Node", ctor()),
            iface("Document", ctor(), inheritance = "Node"),
            includes("Document", "GlobalEventHandlers"),
            includes("Document", "ParentNode"),
            iface("XMLDocument", ctor(), inheritance = "Document"),
            iface("Element", inheritance = "Node"),
            includes("Element", "ParentNode"),
        )
        assertEquals(
            listOf(InheritedMember(onclick, "GlobalEventHandlers"), InheritedMember(children, "ParentNode")),
            o["Document"].added,
        )
        assertEquals(emptyList(), o["XMLDocument"].added, "Document already implements them")
        assertEquals(emptyList(), o["Element"].added, "an abstract class does not")
    }

    @Test
    fun aFactoryClassIsAnOpenClassToo() {
        val onclick = attr("onclick", t("EventHandler"))
        val o = overrides(
            mixin("GlobalEventHandlers", onclick),
            iface("HTMLImageElement", extAttrs = listOf(Idl.ext("LegacyFactoryFunction", "Image"))),
            includes("HTMLImageElement", "GlobalEventHandlers"),
        )
        assertEquals(listOf(InheritedMember(onclick, "GlobalEventHandlers")), o["Image"].added)
        assertEquals(emptyList(), o["HTMLImageElement"].added)
    }

    @Test
    fun itemArrayLikeMembersAreOverridden() {
        val length = readonly("length", t("unsigned long"))
        val item = IdlOperation("item", t("Node", nullable = true), listOf(arg("index", t("unsigned long"))), IdlOperationSpecial.GETTER, emptyList())
        val o = overrides(
            iface("NodeList", item, length),
            iface("RadioNodeList", readonly("length", t("unsigned long")), inheritance = "NodeList"),
            iface("Node"),
        )
        assertTrue(o["NodeList"].isOverride(length))
        assertTrue(o["NodeList"].isOverride(item))
        assertTrue(o["RadioNodeList"].isOverride(readonly("length", t("unsigned long"))))
    }

    @Test
    fun unionMarkersAreSupertypesOfTheirMembers() {
        val namedItem = op("namedItem", union(t("RadioNodeList"), t("Element"), nullable = true), arg("name", t("DOMString")))
        val o = overrides(
            iface("Element"), iface("RadioNodeList"),
            iface("HTMLCollection", op("namedItem", t("Element", nullable = true), arg("name", t("DOMString")))),
            iface("HTMLFormControlsCollection", namedItem, inheritance = "HTMLCollection"),
            iface("Wider", op("namedItem", union(t("RadioNodeList"), t("Element"), nullable = true), arg("name", t("DOMString")))),
            iface("Narrower", op("namedItem", t("Element"), arg("name", t("DOMString"))), inheritance = "Wider"),
        )
        assertTrue(o["HTMLFormControlsCollection"].isDropped(namedItem), "the marker is not an Element")
        assertTrue(o["Narrower"].isOverride(op("namedItem", t("Element"), arg("name", t("DOMString")))), "Element is a member of the marker")
    }
}
