/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.frontend.WebrefEvent
import org.jetbrains.kotlin.tools.idl.frontend.WebrefEventTarget
import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.includes
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.*

class EventHandlerTypesTest {

    private val handler = IdlCallback("EventHandlerNonNull", t("any"), listOf(arg("event", t("Event"))), emptyList())
    private val onError = IdlCallback("OnErrorEventHandlerNonNull", t("any"), listOf(arg("event", union(t("Event"), t("DOMString")))), emptyList())
    private fun h() = t("EventHandlerNonNull", nullable = true)

    /** The event hierarchy every test shares; `PushEvent` (extends `ExtendableEvent`) is deliberately not on the surface. */
    private val eventInterfaces = listOf(
        iface("Event"),
        iface("UIEvent", inheritance = "Event"),
        iface("MouseEvent", inheritance = "UIEvent"),
        iface("PointerEvent", inheritance = "MouseEvent"),
        iface("FocusEvent", inheritance = "UIEvent"),
        iface("ProgressEvent", inheritance = "Event"),
        iface("ExtendableEvent", inheritance = "Event"),
        iface("Node"),
        iface("Element", inheritance = "Node"),
        iface("HTMLElement", inheritance = "Element"),
    )

    private fun ev(type: String, eventInterface: String, vararg targets: String, bubblingPath: List<String> = emptyList()) =
        WebrefEvent(type, eventInterface, targets.map { WebrefEventTarget(it, bubblingPath) })

    private fun events(vararg definitions: IdlDefinition, events: List<WebrefEvent>): EventHandlerTypes {
        return EventHandlerTypes.of(ir(spec("s", handler, onError, *eventInterfaces.toTypedArray(), *definitions)), events)
    }

    @Test
    fun handlerGetsTheInterfaceOfTheEventFiredAtItsInterface() {
        val e = events(
            iface("XHR", attr("onload", h())),
            iface("Img", attr("onload", h())),
            events = listOf(ev("load", "ProgressEvent", "XHR"), ev("load", "Event", "Img")),
        )
        assertEquals("ProgressEvent", e["XHR", "onload"])
        assertNull(e["Img", "onload"])
    }

    @Test
    fun targetsMatchAncestorsDescendantsAndBubblingPath() {
        val e = events(
            iface("Div", attr("onclick", h()), inheritance = "HTMLElement"),
            iface("Window", attr("onclick", h())),
            iface("Svg", attr("onclick", h())),
            events = listOf(ev("click", "PointerEvent", "Element", bubblingPath = listOf("Window"))),
        )
        assertEquals("PointerEvent", e["Div", "onclick"], "fired at an ancestor")
        assertEquals("PointerEvent", e["Window", "onclick"], "bubbles through")
        assertNull(e["Svg", "onclick"], "unrelated")
    }

    @Test
    fun mixinHandlersUseTheIncludingInterfaces() {
        val e = events(
            mixin("GlobalEventHandlers", attr("onclick", h())),
            iface("Div", inheritance = "HTMLElement"),
            includes("Div", "GlobalEventHandlers"),
            events = listOf(ev("click", "PointerEvent", "Element")),
        )
        assertEquals(mapOf("onclick" to "PointerEvent"), e.of("GlobalEventHandlers"))
    }

    @Test
    fun differentEventsGetTheirCommonAncestor() {
        val e = events(
            iface("X", attr("onclick", h()), attr("onprogress", h())),
            events = listOf(
                ev("click", "PointerEvent", "X"), ev("click", "FocusEvent", "X"),
                ev("progress", "ProgressEvent", "X"), ev("progress", "Event", "X", "Media"),
            ),
        )
        assertEquals("UIEvent", e["X", "onclick"])
        assertNull(e["X", "onprogress"], "the plain Event also fires at Media, which ProgressEvent does not cover")
    }

    @Test
    fun plainEventEntryCoveredByASpecificOneIsIgnored() {
        val e = events(
            iface("Window", attr("onfocus", h())),
            iface("Div", attr("onfocus", h()), inheritance = "HTMLElement"),
            events = listOf(ev("focus", "Event", "Window", "HTMLElement"), ev("focus", "FocusEvent", "Window", "Element")),
        )
        assertEquals("FocusEvent", e["Window", "onfocus"])
        assertEquals("FocusEvent", e["Div", "onfocus"])
    }

    @Test
    fun eventInterfaceOutsideTheSurfaceCountsAsEvent() {
        val e = events(
            iface("SW", attr("onpush", h()), attr("onactivate", h())),
            events = listOf(ev("push", "PushEvent", "SW"), ev("activate", "ExtendableEvent", "SW"), ev("activate", "PushEvent", "SW")),
        )
        assertNull(e["SW", "onpush"], "its ancestry is unknown")
        assertNull(e["SW", "onactivate"], "common ancestor of ExtendableEvent and Event")
    }

    @Test
    fun onlyHandlersTakingEventAreTyped() {
        val e = events(
            iface("X", attr("onerror", t("OnErrorEventHandlerNonNull", nullable = true)), attr("onclick", t("DOMString"))),
            events = listOf(ev("error", "ProgressEvent", "X"), ev("click", "PointerEvent", "X")),
        )
        assertNull(e["X", "onerror"], "(Event or DOMString) is not Event")
        assertNull(e["X", "onclick"], "not a callback")
    }

    @Test
    fun handlersWithoutEventDataAreListed() {
        val e = events(iface("X", attr("onwebkitanimationend", h())), events = emptyList())
        assertEquals(listOf("X" to "onwebkitanimationend"), e.withoutEventData)
    }
}
