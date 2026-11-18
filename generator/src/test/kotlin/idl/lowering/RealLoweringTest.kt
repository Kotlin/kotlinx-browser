/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.dukat.idlDeclarations.IDLInterfaceDeclaration
import org.jetbrains.dukat.idlDeclarations.IDLSingleTypeDeclaration
import org.jetbrains.dukat.idlDeclarations.InterfaceKind
import org.jetbrains.dukat.idlLowerings.EventMapKey
import org.jetbrains.dukat.idlLowerings.addConstructors
import org.jetbrains.dukat.idlLowerings.addItemArrayLike
import org.jetbrains.dukat.idlLowerings.eventSpecifierMapper
import org.jetbrains.dukat.idlLowerings.eventSpecifierMapperWithContext
import org.jetbrains.dukat.idlLowerings.markAbstractOrOpen
import org.jetbrains.dukat.idlLowerings.resolveMixins
import org.jetbrains.dukat.idlLowerings.resolvePartials
import org.jetbrains.kotlin.tools.idl.Golden
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.GOLDEN_SLICE
import org.jetbrains.kotlin.tools.idl.GoldenSliceTest.Companion.slice
import org.jetbrains.kotlin.tools.idl.dukat.toDukat
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
        // The only constants that cannot be copied anywhere. Needs a decision (Key Decision 13 covers classes only).
        assertEquals(setOf("NodeFilter"), shapes.constantsWithoutClassHome.keys)
    }

    /**
     * The port is compared with dukat's own `markAbstractOrOpen` on the same input. Every difference must be one of
     * the two deliberate fixes; anything else fails.
     */
    @Test
    fun abstractOrOpenDiffersFromDukatOnlyByTheCorrectedRule() {
        val dukat = surface
            .toDukat()
            .resolvePartials()
            .addConstructors()
            .markAbstractOrOpen()
            .files
            .flatMap { it.declarations }
            .filterIsInstance<IDLInterfaceDeclaration>()
            .filter { !it.mixin }
            .associate { it.name to it.kind }

        val interfaces = lowered
            .ir
            .definitions
            .filterIsInstance<IdlInterface>()
            .associateBy { it.name }

        val inheritedOnly = mutableListOf<String>()

        val htmlConstructorOnly = mutableListOf<String>()
        val unexplained = mutableListOf<String>()

        for ([name, dukatKind] in dukat) {
            val ours = shapes
                .byName[name]
                ?.kind
                ?: run { unexplained += "$name: missing"; continue }

            val expected = when (dukatKind) {
                InterfaceKind.INTERFACE -> ShapeKind.INTERFACE
                InterfaceKind.ABSTRACT_CLASS -> ShapeKind.ABSTRACT_CLASS
                InterfaceKind.OPEN_CLASS -> ShapeKind.OPEN_CLASS
            }

            if (ours == expected) {
                continue
            }

            // IrToDukat feeds namespaces to dukat as interfaces with static members (it has no namespace support).
            if (ours == ShapeKind.OBJECT && surface.definitions.any { it is IdlNamespace && it.name == name }) {
                continue
            }

            val ctors = interfaces[name]?.members?.filterIsInstance<IdlConstructor>().orEmpty()
            when {
                expected == ShapeKind.OPEN_CLASS &&
                        ours == ShapeKind.ABSTRACT_CLASS &&
                        ctors.isEmpty() ->
                    inheritedOnly += name

                expected == ShapeKind.OPEN_CLASS &&
                        ours == ShapeKind.ABSTRACT_CLASS &&
                        ctors.all { it.extAttrs.has("HTMLConstructor") } ->
                    htmlConstructorOnly += name

                else -> unexplained += "$name: dukat $dukatKind, ours $ours"
            }
        }
        assertEquals(
            emptyList(),
            unexplained
        )
        assertTrue("XMLHttpRequestUpload" in inheritedOnly)
        assertTrue("HTMLImageElement" in htmlConstructorOnly)
    }

    /** Same interfaces and element types as dukat's `addItemArrayLike`, which ran after inlining mixins. */
    @Test
    fun itemArrayLikeMatchesDukat() {
        val dukat = surface
            .toDukat()
            .resolvePartials()
            .resolveMixins()
            .addItemArrayLike()
            .files
            .flatMap { it.declarations }
            .filterIsInstance<IDLInterfaceDeclaration>()
            .mapNotNull { d ->
                d.parents
                    .find { it.name == "ItemArrayLike" }
                    ?.let { d.name to (it.typeParameter as IDLSingleTypeDeclaration).name }
            }
            .toMap()

        val ours = shapes
            .byName
            .values
            .mapNotNull { s -> s.itemArrayLike?.let { s.name to (it as IdlNamedType).name } }
            .toMap()

        assertEquals(dukat, ours)
        assertEquals("Node", ours["NodeList"])
        assertEquals(null, ours["AudioTrackList"], "an anonymous getter has no item() to call")
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

    /**
     * Every handler dukat's table narrowed is narrowed to the same type or a subtype of it, except where dukat was wrong.
     * Dukat narrowed an attribute when its name was in the table and its callback took a plain `Event`.
     */
    @Test
    fun eventHandlerTypesRefineDukatsTable() {
        val events = lowered.eventHandlerTypes
        val interfaces = lowered.ir.definitions.filterIsInstance<IdlInterface>().associateBy { it.name }
        val takesEvent = lowered.ir.definitions.filterIsInstance<IdlCallback>()
            .filter { cb -> cb.arguments.any { it.type == IdlNamedType("Event") } }.map { it.name }.toSet()
        fun ancestors(n: String) = generateSequence(n) { interfaces[it]?.inheritance }.toList()
        val dukatWrong = mapOf(
            "GlobalEventHandlers.onloadstart" to null, // media elements fire loadstart as a plain Event
            "GlobalEventHandlers.onprogress" to null, // media elements fire progress as a plain Event
            "Notification.onclick" to null, // a notification click is a plain Event
            "MediaKeySession.onmessage" to "MediaKeyMessageEvent", // not a MessageEvent
            "ServiceWorkerGlobalScope.onmessage" to "ExtendableMessageEvent", // not a MessageEvent
        )

        var refined = 0
        val unexplained = mutableListOf<String>()
        for (owner in interfaces.values) for (a in owner.members.filterIsInstance<IdlAttribute>()) {
            if ((a.type as? IdlNamedType)?.name !in takesEvent) continue
            val dukat = eventSpecifierMapperWithContext[EventMapKey(a.name, owner.name)] ?: eventSpecifierMapper[a.name] ?: continue
            val ours = events[owner.name, a.name]
            val handler = "${owner.name}.${a.name}"
            when {
                ours == dukat -> {}
                ours != null && dukat in ancestors(ours) -> refined++
                handler in dukatWrong && ours == dukatWrong[handler] -> {}
                else -> unexplained += "$handler: dukat $dukat, ours ${ours ?: "Event"}"
            }
        }
        assertEquals(emptyList(), unexplained)
        assertEquals(2, refined, "onclick and oncontextmenu: MouseEvent → PointerEvent")
    }

    @Test
    fun goldenLoweredSlice() {
        val slice = LoweredIR(
            lowered.ir.slice(GOLDEN_SLICE),
            shapes,
            lowered.eventHandlerTypes,
        )
        Golden.assertMatches("lowered-slice.idl", slice.render())
    }
}
