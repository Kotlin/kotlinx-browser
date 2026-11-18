/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ctor
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ext
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.op
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface as find

class ExpandUnionOverloadsTest {

    /** The members of `X` after expansion, rendered as Web IDL. */
    private fun expand(vararg members: IdlMember): List<String> {
        val input = ir(spec("s", iface("A"), iface("B"), iface("X", *members)))
        return input.expandUnionOverloads(UnionMarkers.of(input)).find("X").members.map { it.render() }
    }

    @Test
    fun eachMemberGetsAnOverload() {
        assertEquals(
            listOf("undefined f(DOMString x, long y);", "undefined f(Blob x, long y);"),
            expand(op("f", t("undefined"), arg("x", union(t("DOMString"), t("Blob"))), arg("y", t("long")))),
        )
    }

    @Test
    fun anOptionalUnionAlsoGivesAnOverloadEndingBeforeIt() {
        val options = arg("options", union(t("DOMString"), t("boolean")), optional = true).copy(default = IdlValue.EmptyDictionary)
        assertEquals(
            listOf(
                "undefined f(long a, DOMString options, optional long after);",
                "undefined f(long a, boolean options, optional long after);",
                "undefined f(long a);",
            ),
            expand(op("f", t("undefined"), arg("a", t("long")), options, arg("after", t("long"), optional = true))),
        )
    }

    @Test
    fun nullabilityAndUndefinedGoToEveryMember() {
        assertEquals(
            listOf("undefined f(DOMString? x);", "undefined f(long? x);"),
            expand(op("f", t("undefined"), arg("x", union(t("DOMString"), t("long"), nullable = true)))),
        )
        assertEquals(
            listOf("undefined f(DOMString? x);", "undefined f(long? x);"),
            expand(op("f", t("undefined"), arg("x", union(t("DOMString"), t("undefined"), t("long"))))),
        )
    }

    @Test
    fun typeExtendedAttributesGoToEveryMember() {
        val shared = union(t("Float32Array"), t("long")).copy(extAttrs = listOf(ext("AllowShared")))
        assertEquals(
            listOf("undefined f([AllowShared] Float32Array x);", "undefined f([AllowShared] long x);"),
            expand(op("f", t("undefined"), arg("x", shared))),
        )
    }

    @Test
    fun severalUnionsGiveTheCartesianProduct() {
        assertEquals(
            listOf(
                "undefined f(DOMString x, long y);", "undefined f(DOMString x, boolean y);",
                "undefined f(Blob x, long y);", "undefined f(Blob x, boolean y);",
            ),
            expand(op("f", t("undefined"), arg("x", union(t("DOMString"), t("Blob"))), arg("y", union(t("long"), t("boolean"))))),
        )
    }

    @Test
    fun constructorsAndVariadicsAreExpanded() {
        assertEquals(
            listOf("constructor(DOMString init);", "constructor(long init);", "constructor();"),
            expand(ctor(arg("init", union(t("DOMString"), t("long")), optional = true))),
        )
        val nodes = arg("nodes", union(t("A"), t("DOMString"))).copy(variadic = true)
        assertEquals(
            listOf("undefined append(A... nodes);", "undefined append(DOMString... nodes);"),
            expand(op("append", t("undefined"), nodes)),
            "a variadic argument is not optional: no extra overload",
        )
    }

    @Test
    fun unionsWithAMarkerAreKept() {
        assertEquals(
            listOf("undefined f((A or B) x);"),
            expand(op("f", t("undefined"), arg("x", union(t("A"), t("B"))))),
        )
    }

    @Test
    fun anOverloadEqualToAnEarlierOneIsDropped() {
        assertEquals(
            listOf("undefined f(DOMString x);", "undefined f(long x);"),
            expand(op("f", t("undefined"), arg("x", t("DOMString"))), op("f", t("undefined"), arg("x", union(t("DOMString"), t("long"))))),
        )
    }
}
