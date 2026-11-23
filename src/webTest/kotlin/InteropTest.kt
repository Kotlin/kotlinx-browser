/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.css.*
import org.w3c.fetch.*
import kotlin.test.*

private fun keys(o: JsAny): String = js("Object.keys(o).join(',')")
private fun str(o: JsAny): String = js("String(o)")
private fun array(): JsAny = js("['a', 'b']")
private fun obj(): JsAny = js("({ x: 'y' })")

/** The shapes the generator relies on, at runtime on both targets (Node: `EventTarget` and `Event` are global). */
class InteropTest {
    @Test
    fun returnedFunctionRemoves() {
        val target = EventTarget()
        var count = 0
        val remove = target.addEventListener("x") { count++ }
        target.dispatchEvent(Event("x"))
        remove()
        target.dispatchEvent(Event("x"))
        assertEquals(1, count)
    }

    @Test
    fun returnedFunctionRemovesWithOptions() {
        val target = EventTarget()
        var count = 0
        // Not `true`: Node's EventTarget (22.0–26.2) does not remove capture listeners, also from plain JS.
        val remove = target.addEventListener("x", { count++ }, false)
        target.dispatchEvent(Event("x"))
        remove()
        target.dispatchEvent(Event("x"))
        assertEquals(1, count)
    }

    @Test
    fun memberTwinRemovesWhatTheExtensionAdded() {
        val target = EventTarget()
        var count = 0
        val handler: (Event) -> Unit = { count++ }
        target.addEventListener("x", handler)
        target.dispatchEvent(Event("x"))
        target.removeEventListener("x", handler)
        target.dispatchEvent(Event("x"))
        assertEquals(1, count, "the same Kotlin function is the same JS function")
    }

    @Test
    fun factoryOmitsAbsentMembers() {
        val init = EventInit(bubbles = true)
        assertEquals("bubbles", keys(init))
        val event = Event("x", init)
        assertTrue(event.bubbles)
        assertFalse(event.cancelable)
    }

    @Test
    fun enumValueIsItsString() {
        assertEquals("no-cors", str(RequestMode.NO_CORS))
        assertEquals("cors", str(RequestMode.CORS))
    }

    @Test
    fun indexerHelpers() {
        assertEquals("b", getStringProperty(array(), 1))
        assertEquals(null, getStringProperty(array(), 5))
        val o = obj()
        setStringProperty(o, "z", "w")
        assertEquals("w", getStringProperty(o, "z"))
        assertEquals("x,z", keys(o))
    }

    /** The `@webref/css` attributes are the camel-cased JS property names (Node has no DOM: a plain object stands in). */
    @Test
    fun cssPropertyNames() {
        val style = obj().unsafeCast<CSSStyleProperties>()
        style.color = "red"
        style.backgroundColor = "blue"
        style.cssFloat = "left"
        assertEquals("x,color,backgroundColor,cssFloat", keys(style))
        assertEquals("red", style.color)
    }

    /** Interface constants hold their IDL values: no JS object is read (Node has neither global). */
    @Test
    fun interfaceConstants() {
        assertEquals(1, NodeFilter.FILTER_ACCEPT.toInt())
        assertEquals(-1, NodeFilter.SHOW_ALL, "0xFFFFFFFF")
        assertEquals(0x4000, WebGLRenderingContextBase.COLOR_BUFFER_BIT)
        assertEquals(-1.0, WebGL2RenderingContextBase.TIMEOUT_IGNORED)
    }
}
