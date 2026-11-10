/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.IdlAttribute
import org.jetbrains.kotlin.tools.idl.ir.IdlNamedDefinition
import org.jetbrains.kotlin.tools.idl.ir.IdlType
import org.jetbrains.kotlin.tools.idl.ir.IdlTypedef
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ext
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.seq
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.typedef
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface as find

class ResolveTypedefsTest {

    private fun resolveAttr(vararg typedefs: IdlTypedef, type: IdlType): IdlType =
        (ir(
            spec(
                "s",
                *typedefs,
                iface(
                    "X",
                    attr("a", type)
                )
            )
        ).resolveTypedefs()
            .find("X")
            .members
            .single() as IdlAttribute).type

    @Test
    fun typedefsAreInlinedAndRemoved() {
        val resolved =
            ir(
                spec(
                    "s",
                    typedef(
                        "GLenum",
                        t("unsigned long")
                    ),
                    iface(
                        "X",
                        attr("a", t("GLenum"))
                    )
                )
            ).resolveTypedefs()

        assertEquals(listOf("X"), resolved.definitions.map { (it as IdlNamedDefinition).name }.toList())
        assertEquals(t("unsigned long"), (resolved.find("X").members.single() as IdlAttribute).type)
    }

    @Test
    fun nullabilityIsTheOrOfReferenceAndTarget() {
        val eventHandler = typedef(
            "EventHandler",
            t("EventHandlerNonNull", nullable = true)
        )
        assertEquals(
            t("EventHandlerNonNull", nullable = true),
            resolveAttr(
                eventHandler,
                type = t("EventHandler")
            )
        )
        assertEquals(
            t("EventHandlerNonNull", nullable = true),
            resolveAttr(
                eventHandler,
                type = t("EventHandler", nullable = true)
            )
        )
        assertEquals(
            t("long", nullable = true),
            resolveAttr(
                typedef("L", t("long")),
                type = t("L", nullable = true)
            )
        )
    }

    @Test
    fun unionTypedefsAreFlattenedIntoOuterUnions() {
        val bodyInit = typedef(
            "BodyInit",
            union(
                t("Blob"),
                t("DOMString")
            )
        )
        assertEquals(
            union(t("Blob"), t("DOMString"), t("long")),
            resolveAttr(bodyInit, type = union(t("BodyInit"), t("long")))
        )
        assertEquals(
            union(t("Blob"), t("DOMString"), t("long"), nullable = true),
            resolveAttr(bodyInit, type = union(t("BodyInit", nullable = true), t("long"))),
            "a nullable flattened member makes the outer union nullable",
        )
        assertEquals(
            union(t("Blob"), t("DOMString"), nullable = true),
            resolveAttr(bodyInit, type = t("BodyInit", nullable = true))
        )
    }

    @Test
    fun nestedPositionsAndTransitiveTypedefs() {
        val a = typedef(
            "A",
            t("B")
        )
        val b = typedef(
            "B",
            t("unsigned long")
        )
        assertEquals(
            seq(
                t("unsigned long")
            ),
            resolveAttr(
                a,
                b,
                type = seq(t("A"))
            )
        )
    }

    @Test
    fun typeExtendedAttributesAreKept() {
        val clamp = ext("Clamp")
        val allowShared = ext("AllowShared")
        assertEquals(
            t(
                "octet",
                extAttrs = listOf(clamp, allowShared)
            ),
            resolveAttr(
                typedef(
                    "O",
                    t(
                        "octet",
                        extAttrs = listOf(allowShared)
                    )
                ),
                type = t("O", extAttrs = listOf(clamp))
            ),
        )
    }

    @Test
    fun extendedAttributeArgumentsAreResolved() {
        val factory = ext(
            "LegacyFactoryFunction",
            "Image",
            arg(
                "width",
                t("Dim"),
                optional = true
            )
        )
        val resolved =
            ir(
                spec(
                    "s",
                    typedef(
                        "Dim",
                        t("unsigned long")
                    ),
                    iface(
                        "X",
                        extAttrs = listOf(factory)
                    )
                )
            ).resolveTypedefs()

        assertEquals(
            t("unsigned long"),
            resolved.find("X").extAttrs.single().arguments.single().type
        )
    }

    @Test
    fun cycleFails() {
        val e = assertFailsWith<LoweringException> {
            resolveAttr(
                typedef(
                    "A",
                    t("B")
                ),
                typedef(
                    "B",
                    t("A")
                ),
                type = t("A")
            )
        }
        assertTrue(e.problems.any { it.startsWith("typedef cycle") }, e.message)
    }
}
