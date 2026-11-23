/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.mapping.TypePosition
import org.jetbrains.kotlin.tools.idl.mapping.WasmTypeMapping
import org.jetbrains.kotlin.tools.idl.Golden
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.GOLDEN_SLICE
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.slice
import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.loadEvents
import org.jetbrains.kotlin.tools.idl.loadSurface
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/** The lowerings on the real, pinned surface. */
class RealLoweringTest {

    private val surface by lazy { loadSurface().ir }
    private val lowered by lazy { surface.lower(loadEvents()) }
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
    }

    @Test
    fun unionMarkers() {
        val markers = lowered.unionMarkers.byName
        assertEquals(listOf("ImageBitmapSource"), markers.getValue("CanvasImageSource").supertypes)
        assertEquals(listOf("ImageBitmapSource"), markers.getValue("TexImageSource").supertypes)
        assertEquals(listOf("Window", "MessagePort", "ServiceWorker"), markers.getValue("MessageEventSource").members)
        assertTrue("UnionElementOrRadioNodeList" in markers)
        assertEquals("html", markers.getValue("CanvasImageSource").spec)
        assertEquals(
            listOf("HTMLElement", "CanvasImageSource", "TexImageSource"),
            shapes["HTMLImageElement"].supertypes,
            "ImageBitmapSource comes through both",
        )
    }

    /** No two overloads of a member have the same Kotlin/Wasm signature (CONFLICTING_OVERLOADS). */
    @Test
    fun overloadsHaveDistinctKotlinSignatures() {
        val clashes = mutableListOf<String>()
        for (d in lowered.ir.definitions) {
            val members = (d as? IdlInterface)?.members ?: (d as? IdlNamespace)?.members ?: continue
            members
                .mapNotNull { m ->
                    val [name, arguments] = when (m) {
                        is IdlOperation -> "${m.special?.name.orEmpty()} ${m.name.orEmpty()}" to m.arguments
                        is IdlConstructor -> "constructor" to m.arguments
                        else -> return@mapNotNull null
                    }
                    name + arguments.joinToString(", ", "(", ")") {
                        WasmTypeMapping.map(it.type, TypePosition.VALUE).toString() + if (it.variadic) "..." else ""
                    }
                }
                .groupingBy { it }
                .eachCount()
                .filterValues { it > 1 }
                .keys
                .forEach { clashes += "${(d as IdlNamedDefinition).name}: $it" }
        }
        assertEquals(emptyList(), clashes)
    }

    @Test
    fun overrides() {
        val overrides = lowered.overrides
        // Each conflicts with the member of the same name in: HTMLCollection, PerformanceEntry, Event, Element. Legacy
        // dropped namedItem and className too. BeforeUnloadEvent.returnValue (a String in legacy) conflicts since Event
        // gained the legacy `boolean returnValue`: an API loss.
        assertEquals(
            mapOf(
                "HTMLFormControlsCollection" to listOf("getter namedItem(DOMString)"),
                "VisibilityStateEntry" to listOf("attribute duration"),
                "BeforeUnloadEvent" to listOf("attribute returnValue"),
                "SVGElement" to listOf("attribute className"),
            ),
            overrides.byName
                .filterValues { it.dropped.isNotEmpty() }
                .mapValues { [_, o] -> o.dropped.map { memberKey(it) } },
        )
        fun added(name: String) = overrides[name].added.map { "${it.declaredIn}.${memberKey(it.member)}" }
        assertTrue("GlobalEventHandlers.attribute onclick" in added("Document"))
        assertTrue("GlobalEventHandlers.attribute onclick" in added("Image"))
        assertEquals(listOf("Body"), overrides["Request"].added.map { it.declaredIn }.distinct())
        assertEquals(emptyList(), overrides["XMLDocument"].added, "abstract; statics are in Shape.inheritedStatics")
        assertEquals(emptyList(), overrides["HTMLElement"].added, "abstract")
    }

    @Test
    fun inheritedStatics() {
        fun statics(name: String) = lowered.shapes[name].inheritedStatics.map { "${it.declaredIn}.${memberKey(it.member)}" }
        assertTrue("Document.static parseHTML(DOMString, SetHTMLOptions)" in statics("XMLDocument"), statics("XMLDocument").toString())
        assertEquals(
            listOf("MediaSource.static attribute canConstructInDedicatedWorker", "MediaSource.static isTypeSupported(DOMString)"),
            statics("ManagedMediaSource"),
        )
    }

    @Test
    fun eventHandlerTypes() {
        val events = lowered.eventHandlerTypes
        assertEquals("PointerEvent", events["GlobalEventHandlers", "onclick"])
        assertEquals("FocusEvent", events["GlobalEventHandlers", "onfocus"], "HTML's plain-Event index entry is covered by UI Events")
        assertEquals("SubmitEvent", events["GlobalEventHandlers", "onsubmit"])
        assertEquals(null, events["GlobalEventHandlers", "onprogress"], "media elements fire progress as a plain Event")
        assertEquals(null, events["GlobalEventHandlers", "onerror"], "OnErrorEventHandler takes (Event or DOMString)")
        assertEquals("BeforeUnloadEvent", events["WindowEventHandlers", "onbeforeunload"], "OnBeforeUnloadEventHandler takes Event too")
        assertEquals("ProgressEvent", events["XMLHttpRequestEventTarget", "onload"])
        assertEquals("MediaStreamTrackEvent", events["MediaStream", "onaddtrack"])
        assertEquals("TrackEvent", events["AudioTrackList", "onaddtrack"])
        assertEquals(null, events["Notification", "onclick"])
        assertEquals("MediaKeyMessageEvent", events["MediaKeySession", "onmessage"])
        assertEquals("ExtendableMessageEvent", events["ServiceWorkerGlobalScope", "onmessage"])
        assertTrue("GlobalEventHandlers" to "onwebkitanimationend" in events.withoutEventData)
    }

    @Test
    fun goldenLoweredSlice() {
        val slice = LoweredIR(
            lowered.ir.slice(GOLDEN_SLICE),
            shapes,
            lowered.eventHandlerTypes,
            lowered.unionMarkers,
            lowered.overrides,
        )
        Golden.assertMatches("lowered-slice.idl", slice.render())
    }
}
