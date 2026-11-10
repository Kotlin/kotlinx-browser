/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.const
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ctor
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ext
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.includes
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import kotlin.test.*

class ShapesTest {

    private fun shapes(vararg definitions: IdlDefinition) = Shapes.of(ir(spec("s", *definitions)))

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
        assertEquals(emptyMap(), s.constantsWithoutClassHome, "Base is included by a class")
    }

    @Test
    fun conflictingCopiedConstantFails() {
        val e = assertFailsWith<LoweringException> {
            shapes(iface("A", const("X", "1")), iface("B", const("X", "2"), inheritance = "A"))
        }
        assertEquals(listOf("B: constant X is 2 in B but 1 in A"), e.problems)
    }

    @Test
    fun callbackInterfaceConstantsHaveNoClassHome() {
        val s = shapes(iface("NodeFilter", const("FILTER_ACCEPT", "1"), kind = IdlInterfaceKind.CALLBACK_INTERFACE), mixin("Unused", const("U", "1")))
        assertEquals(setOf("NodeFilter", "Unused"), s.constantsWithoutClassHome.keys)
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
