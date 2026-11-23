/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.const
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ctor
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ext
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.includes
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.op
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.*

class ShapesTest {

    private fun shapes(vararg definitions: IdlDefinition): Shapes {
        val ir = ir(spec("s", *definitions))
        return Shapes.of(ir, UnionMarkers.of(ir))
    }

    @Test
    fun openOnlyWithOwnConstructor() {
        val s = shapes(
            iface("EventTarget", ctor()),
            iface("XMLHttpRequestEventTarget", inheritance = "EventTarget"),
            iface("XMLHttpRequestUpload", inheritance = "XMLHttpRequestEventTarget"),
            iface("Event", ctor(arg("type", t("DOMString")))),
        )
        assertEquals(ShapeKind.OPEN_CLASS, s["EventTarget"].kind)
        assertEquals(ShapeKind.ABSTRACT_CLASS, s["XMLHttpRequestEventTarget"].kind, "an inherited constructor does not count")
        assertEquals(ShapeKind.ABSTRACT_CLASS, s["XMLHttpRequestUpload"].kind)
        assertEquals(ShapeKind.OPEN_CLASS, s["Event"].kind)
    }

    @Test
    fun htmlConstructorDoesNotCount() {
        // Modern IDL: `[HTMLConstructor] constructor();` — only usable by custom-element subclasses.
        val s = shapes(iface("HTMLImageElement", ctor().copy(extAttrs = listOf(ext("HTMLConstructor")))))
        assertEquals(ShapeKind.ABSTRACT_CLASS, s["HTMLImageElement"].kind)
    }

    @Test
    fun mixinsAndCallbackInterfacesAreInterfacesNamespacesAreObjects() {
        val s = shapes(
            mixin("GlobalEventHandlers"),
            iface("EventListener", kind = IdlInterfaceKind.CALLBACK_INTERFACE),
            IdlNamespace("CSS", false, emptyList(), emptyList()),
            iface("HTMLElement"),
            includes("HTMLElement", "GlobalEventHandlers"),
        )
        assertEquals(ShapeKind.INTERFACE, s["GlobalEventHandlers"].kind)
        assertEquals(ShapeKind.INTERFACE, s["EventListener"].kind)
        assertEquals(ShapeKind.OBJECT, s["CSS"].kind)
        assertEquals(listOf("GlobalEventHandlers"), s["HTMLElement"].supertypes)
    }

    @Test
    fun constantsAreCopiedFromAncestorsAndMixins() {
        val s = shapes(
            iface("Node", const("ELEMENT_NODE", "1")),
            iface("Element", const("OWN", "7"), inheritance = "Node"),
            iface("HTMLElement", inheritance = "Element"),
            mixin("Base", const("COLOR_BUFFER_BIT", "0x4000")),
            iface("GL"),
            includes("GL", "Base"),
            includes("Element", "M"),
            mixin("M", const("FROM_M", "2")),
        )
        assertEquals(
            listOf("ELEMENT_NODE" to "Node"),
            s["Node"].constants.map { it.constant.name to it.declaredIn },
        )
        assertEquals(
            listOf("OWN" to "Element", "FROM_M" to "M", "ELEMENT_NODE" to "Node"),
            s["HTMLElement"].constants.map { it.constant.name to it.declaredIn },
            "nearest first: each ancestor, then its mixins",
        )
        assertEquals(listOf("COLOR_BUFFER_BIT"), s["GL"].constants.map { it.constant.name })
        assertEquals(emptyList(), s["Base"].constants, "interfaces get no companion constants")
    }

    @Test
    fun conflictingCopiedConstantFails() {
        val e = assertFailsWith<LoweringException> {
            shapes(iface("A", const("X", "1")), iface("B", const("X", "2"), inheritance = "A"))
        }
        assertEquals(listOf("B: constant X is 2 in B but 1 in A"), e.problems)
    }

    @Test
    fun itemArrayLikeNeedsOwnLengthAndItemGetter() {
        val unsignedLong = t("unsigned long")
        val length = attr("length", unsignedLong)
        fun getter(name: String?, returns: IdlType) =
            IdlOperation(name, returns, listOf(arg("index", unsignedLong)), IdlOperationSpecial.GETTER, emptyList())

        val s = shapes(
            iface("NodeList", length, getter("item", t("Node", nullable = true))),
            iface("RadioNodeList", inheritance = "NodeList"),
            iface("AudioTrackList", length, getter(null, t("AudioTrack"))),
            iface("SVGNumberList", length, getter("getItem", t("SVGNumber"))),
            iface("NoLength", getter("item", t("Node", nullable = true))),
        )
        assertEquals(t("Node"), s["NodeList"].itemArrayLike, "the element type is not nullable")
        assertEquals(null, s["RadioNodeList"].itemArrayLike, "inherited through NodeList")
        assertEquals(null, s["AudioTrackList"].itemArrayLike, "anonymous getter: there is no item()")
        assertEquals(null, s["SVGNumberList"].itemArrayLike)
        assertEquals(null, s["NoLength"].itemArrayLike)
    }

    @Test
    fun unionMarkersAreSupertypesUnlessInherited() {
        val s = shapes(
            iface("Node"),
            iface("Element", inheritance = "Node"),
            iface("HTMLElement", inheritance = "Element"),
            iface("Text", inheritance = "Node"),
            mixin("M"),
            iface("Doc", inheritance = "Node"),
            includes("Doc", "M"),
            iface("Uses", attr("a", union(t("Element"), t("Text"))), attr("b", union(t("HTMLElement"), t("Element"), t("M")))),
        )
        assertEquals(listOf("Node", "UnionElementOrText", "UnionElementOrHTMLElementOrM"), s["Element"].supertypes)
        assertEquals(listOf("Element"), s["HTMLElement"].supertypes, "inherited from Element")
        assertEquals(listOf("Node", "M"), s["Doc"].supertypes, "inherited from mixin M")
        assertEquals(listOf("UnionElementOrHTMLElementOrM"), s["M"].supertypes)
    }

    @Test
    fun staticsAreCopiedFromAncestors() {
        fun static(m: IdlOperation) = m.copy(special = IdlOperationSpecial.STATIC)
        val parseHTML = static(op("parseHTML", t("Document"), arg("html", t("DOMString"))))
        val ownParseHTML = static(op("parseHTML", t("Own"), arg("html", t("DOMString"))))
        val s = shapes(
            iface("Node"),
            iface("Document", parseHTML, inheritance = "Node"),
            iface("XMLDocument", inheritance = "Document"),
            iface("Own", ownParseHTML, inheritance = "Document"),
            iface("OwnChild", inheritance = "Own"),
            mixin("M"),
            iface("Doc", ctor(), extAttrs = listOf(ext("LegacyFactoryFunction", "Factory")), inheritance = "Document"),
        )
        assertEquals(emptyList(), s["Document"].inheritedStatics, "own statics are not copied")
        assertEquals(listOf(InheritedMember(parseHTML, "Document")), s["XMLDocument"].inheritedStatics)
        assertEquals(emptyList(), s["Own"].inheritedStatics, "declares its own")
        assertEquals(listOf(InheritedMember(ownParseHTML, "Own")), s["OwnChild"].inheritedStatics, "nearest wins")
        assertEquals(listOf(InheritedMember(parseHTML, "Document")), s["Factory"].inheritedStatics, "through the host")
        assertEquals(emptyList(), s["M"].inheritedStatics)
    }

    @Test
    fun legacyFactoryFunctionIsSeparateOpenClass() {
        val factory = ext("LegacyFactoryFunction", "Image", arg("width", t("unsigned long"), optional = true))
        val s = shapes(iface("Node", const("ELEMENT_NODE", "1")), iface("HTMLImageElement", inheritance = "Node", extAttrs = listOf(factory)))
        assertEquals(ShapeKind.ABSTRACT_CLASS, s["HTMLImageElement"].kind, "the host stays abstract")
        assertEquals(listOf(FactoryClass("Image", "HTMLImageElement", factory.arguments)), s.factoryClasses)
        assertEquals(Shape("Image", ShapeKind.OPEN_CLASS, listOf("HTMLImageElement"), s["HTMLImageElement"].constants), s["Image"])
    }

    @Test
    fun includesMustTargetInterfaceAndNameMixin() {
        val e = assertFailsWith<LoweringException> { shapes(iface("A"), iface("B"), includes("A", "B")) }
        assertEquals(listOf("'A includes B': B is not a mixin"), e.problems)
    }
}
