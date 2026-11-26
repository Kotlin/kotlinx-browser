/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

import kotlinx.browser.document
import kotlinx.browser.localStorage
import kotlinx.browser.window
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.get
import org.w3c.dom.*
import org.w3c.animations.*
import org.w3c.css.fonts.*
import org.w3c.dom.pointerevents.PointerEvent
import org.w3c.encoding.TextDecoder
import org.w3c.encoding.TextEncoder
import org.w3c.webaudio.OfflineAudioContext
import kotlin.test.*

private fun isBrowser(): Boolean = js("typeof document !== 'undefined'")
private fun str(o: JsAny): String = js("String(o)")

/**
 * The generated shapes against real browser objects (`./gradlew jsBrowserTest wasmJsBrowserTest`, Playwright
 * Chromium). Each test returns at once on Node, which has no DOM; [InteropTest] covers what Node can check.
 */
class DomTest {
    private fun div(): HTMLDivElement = document.createElement("div") as HTMLDivElement

    /** On Wasm `as` is an `instanceof` check against the JS global of the class. */
    @Test
    fun castsToRealClasses() {
        if (!isBrowser()) return
        val element: Element = document.createElement("canvas")
        assertIs<HTMLCanvasElement>(element)
        assertIs<CanvasRenderingContext2D>(element.getContext("2d"))
        assertIs<HTMLElement>(document.body)
        assertFalse(document.createElement("span") is HTMLDivElement)
    }

    @Test
    fun collectionsIndexAndAsList() {
        if (!isBrowser()) return
        val parent = div()
        parent.innerHTML = """<p id="a"></p><p id="b"></p><span></span>"""
        assertEquals("b", parent.children[1]?.id)
        assertEquals("SPAN", parent.children["b"]?.nextElementSibling?.tagName)
        assertNull(parent.children[3])
        assertEquals(listOf("P", "P", "SPAN"), parent.children.asList().map { it.tagName })
        assertEquals(2, parent.querySelectorAll("p").asList().size)
        assertEquals("a", (parent.querySelectorAll("p")[0] as Element).id)
    }

    /** Unions become overloads: nodes, strings, and `append()`/`replaceChildren()` with no arguments. */
    @Test
    fun varargOverloads() {
        if (!isBrowser()) return
        val parent = div()
        parent.append(document.createElement("b"), document.createElement("i"))
        parent.append("x", "y")
        assertEquals("<b></b><i></i>xy", parent.innerHTML)
        parent.replaceChildren("z")
        assertEquals("z", parent.innerHTML)
        parent.replaceChildren()
        assertEquals("", parent.innerHTML)
    }

    @Test
    fun eventHandlerReceivesItsEventType() {
        if (!isBrowser()) return
        val element = div()
        var received: PointerEvent? = null
        element.onclick = { received = it }
        element.click()
        val event = assertNotNull(received)
        assertIs<PointerEvent>(event)
        assertEquals("click", event.type)
    }

    /** With `capture = true`, which Node's EventTarget gets wrong (see InteropTest). */
    @Test
    fun returnedFunctionRemovesACaptureListener() {
        if (!isBrowser()) return
        val element = div()
        var count = 0
        val remove = element.addEventListener("click", { count++ }, true)
        element.click()
        remove()
        element.click()
        assertEquals(1, count)
    }

    /** The factory omits absent members; `once` alone is honored by the browser. */
    @Test
    fun listenerOptionsDictionary() {
        if (!isBrowser()) return
        val element = div()
        var count = 0
        element.addEventListener("click", { count++ }, AddEventListenerOptions(once = true))
        element.click()
        element.click()
        assertEquals(1, count)
    }

    @Test
    fun namedPropertiesOfDatasetAndStorage() {
        if (!isBrowser()) return
        val element = div()
        element.dataset["fooBar"] = "1"
        assertEquals("1", element.getAttribute("data-foo-bar"))
        assertEquals("1", element.dataset["fooBar"])
        assertNull(element.dataset["missing"])

        localStorage["kotlinx-browser-test"] = "v"
        assertEquals("v", localStorage.getItem("kotlinx-browser-test"))
        assertEquals("v", localStorage["kotlinx-browser-test"])
        localStorage.removeItem("kotlinx-browser-test")
        assertNull(localStorage["kotlinx-browser-test"])
    }

    @Test
    fun classList() {
        if (!isBrowser()) return
        val element = div()
        element.classList.add("a", "b")
        assertTrue(element.classList.contains("b"))
        assertEquals("b", element.classList[1])
        assertFalse(element.classList.toggle("a"))
        assertEquals("b", element.className)
    }

    /** The `@webref/css` accessors are the browser's own properties, and the computed style sees them. */
    @Test
    fun cssPropertyAccessors() {
        if (!isBrowser()) return
        val element = div()
        element.style.backgroundColor = "blue"
        element.style.cssFloat = "left"
        assertEquals("blue", element.style.getPropertyValue("background-color"))
        assertEquals("left", element.style.getPropertyValue("float"))

        element.style.color = "red"
        document.body!!.append(element)
        try {
            assertEquals("rgb(255, 0, 0)", window.getComputedStyle(element).color)
        } finally {
            element.remove()
        }
    }

    /** An enum value goes in through a dictionary and comes back from the browser as the same string. */
    @Test
    fun enumsThroughDictionaries() {
        if (!isBrowser()) return
        val shadow = div().attachShadow(ShadowRootInit(mode = ShadowRootMode.OPEN))
        assertEquals("open", str(shadow.mode))
        assertEquals(str(ShadowRootMode.OPEN), str(shadow.mode))
    }

    /** Constants of a class are read from its JS global; the browser has `Node`. */
    @Test
    fun classConstants() {
        if (!isBrowser()) return
        assertEquals(Node.ELEMENT_NODE, div().nodeType)
        assertEquals(Node.TEXT_NODE, document.createTextNode("x").nodeType)
    }

    /**
     * KT-16305: `observe` threw while the factory set absent members to `null` (`attributeFilter: null` is not a
     * sequence). Only the given members are set now, and `attributeFilter` takes a `JsArray`.
     */
    @Test
    fun mutationObserverOptions() {
        if (!isBrowser()) return
        val element = div()
        val observer = MutationObserver { _, _ -> }

        observer.observe(element, MutationObserverInit(childList = true))
        element.append("x")
        assertEquals("childList", observer.takeRecords().toList().single().type)

        observer.observe(element, MutationObserverInit(attributeFilter = listOf("title".toJsString()).toJsArray()))
        element.setAttribute("lang", "en")
        element.setAttribute("title", "t")
        val records = observer.takeRecords()
        observer.disconnect()
        assertEquals(listOf("title"), records.toList().map { it.attributeName })
    }

    /** An entry point of each spec added after the dukat-era set, reached through the mixins that bring it in. */
    @Test
    fun addedSpecs() {
        if (!isBrowser()) return
        assertEquals(36, window.crypto.randomUUID().length)
        val bytes = Uint8Array(16)
        window.crypto.getRandomValues(bytes)
        assertTrue(List(16) { bytes[it] }.any { it != 0.toUByte() })

        assertEquals(3, TextEncoder().encode("hé").length)
        assertEquals("hé", TextDecoder().decode(TextEncoder().encode("hé")))

        val face = FontFace("kotlinx-browser-test", "local(serif)")
        assertEquals(str(FontFaceLoadStatus.UNLOADED), str(face.status))
        document.fonts.add(face)
        assertTrue(document.fonts.delete(face))

        assertNotNull(window.indexedDB)
        assertNotNull(window.navigator.getGamepads())
        assertEquals(44100f, OfflineAudioContext(1, 128, 44100f).sampleRate)

        val animation = div().animate(null, 1000.0)
        assertEquals(str(AnimationPlayState.RUNNING), str(animation.playState))
        animation.cancel()
        assertEquals(str(AnimationPlayState.IDLE), str(animation.playState))
    }

    /** `ImageData.data` is a `Uint8ClampedArray`: its elements are `UByte`, so 255 is 255, not -1. */
    @Test
    fun canvasPixelsAreUnsigned() {
        if (!isBrowser()) return
        val canvas = document.createElement("canvas") as HTMLCanvasElement
        val context = canvas.getContext("2d") as CanvasRenderingContext2D
        context.fillStyle = "rgb(255, 128, 0)".toJsString()
        context.fillRect(0.0, 0.0, 1.0, 1.0)
        val data = context.getImageData(0, 0, 1, 1).data
        assertEquals(listOf<UByte>(255u, 128u, 0u, 255u), List(4) { data[it] })
    }
}
