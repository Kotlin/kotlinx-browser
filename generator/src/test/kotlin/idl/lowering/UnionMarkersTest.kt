/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.*

class UnionMarkersTest {

    private val node = iface("Node")
    private val element = iface("Element", inheritance = "Node")
    private val text = iface("Text", inheritance = "Node")
    private val document = iface("Document", inheritance = "Node")

    private fun markers(vararg types: IdlType, extra: List<IdlDefinition> = emptyList()) = UnionMarkers.of(
        ir(spec("s", node, element, text, document, *extra.toTypedArray(),
            iface("Uses", *types.mapIndexed { i, t -> attr("a$i", t) }.toTypedArray())))
    )

    @Test
    fun namedAfterTheTypedefOrTheSortedMembers() {
        val named = union(t("Text"), t("Element"), t("Document")).copy(typedef = "GeometryNode")
        val anonymous = union(t("Text"), t("Element"), nullable = true)
        val m = markers(named, anonymous, union(t("Element"), t("Text")))
        assertEquals(listOf("GeometryNode", "UnionElementOrText"), m.byName.keys.toList(), "equal anonymous unions share a marker")
        assertEquals(listOf("Text", "Element", "Document"), m.byName.getValue("GeometryNode").members)
        assertEquals("UnionElementOrText", m[anonymous]?.name, "nullability does not matter")
        assertEquals("s", m.byName.getValue("GeometryNode").spec)
    }

    @Test
    fun onlyUnionsOfInterfacesAndMixinsQualify() {
        val callback = iface("NodeFilter", kind = IdlInterfaceKind.CALLBACK_INTERFACE)
        val m = markers(
            union(t("Element"), t("DOMString")),
            union(t("Element"), t("NodeFilter")),
            union(t("Element"), IdlGenericType("sequence", listOf(t("Node")))),
            union(t("Element"), t("ElementMixin")),
            union(t("Element"), t("WindowProxy")),
            extra = listOf(callback, mixin("ElementMixin"), iface("Window")),
        )
        assertEquals(setOf("UnionElementOrElementMixin", "UnionElementOrWindow"), m.byName.keys, "WindowProxy is Window")
        assertNull(m[union(t("Element"), t("DOMString"))])
        assertNull(m[union(t("Element"), t("DOMString")).copy(typedef = "Named")], "a named union of non-interfaces")
    }

    @Test
    fun aMarkerExtendsTheNearestMarkersWithMoreMembers() {
        val m = markers(
            union(t("Element"), t("Text")),
            union(t("Text"), t("Element"), t("Document")).copy(typedef = "GeometryNode"),
            union(t("Text"), t("Element"), t("Document"), t("Node")).copy(typedef = "Any"),
            union(t("Element"), t("Text")).copy(typedef = "SameMembers"),
        )
        assertEquals(listOf("GeometryNode"), m.byName.getValue("UnionElementOrText").supertypes, "not Any: it is implied")
        assertEquals(listOf("Any"), m.byName.getValue("GeometryNode").supertypes)
        assertEquals(listOf("GeometryNode"), m.byName.getValue("SameMembers").supertypes, "equal member sets are unrelated")
        assertEquals(listOf("UnionElementOrText", "SameMembers"), m.of("Element"), "only the most specific markers")
        assertEquals(listOf("GeometryNode"), m.of("Document"))
        assertEquals(listOf("UnionElementOrText", "GeometryNode", "Any", "SameMembers"), m.allOf("Element"))
    }

    @Test
    fun aMarkerNameTakenByADefinitionFails() {
        val e = assertFailsWith<LoweringException> {
            markers(union(t("Element"), t("Text")), extra = listOf(iface("UnionElementOrText")))
        }
        assertEquals(listOf("union marker UnionElementOrText clashes with a definition"), e.problems)
    }
}
