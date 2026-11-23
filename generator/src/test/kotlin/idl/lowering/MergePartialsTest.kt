/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.IdlAttribute
import org.jetbrains.kotlin.tools.idl.ir.IdlDictionary
import org.jetbrains.kotlin.tools.idl.ir.IdlField
import org.jetbrains.kotlin.tools.idl.ir.IdlNamedDefinition
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ext
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import kotlin.test.*
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface as find

class MergePartialsTest {

    @Test
    fun partialsMergeIntoMainInItsSpecInCorpusOrder() {
        val merged = ir(
            spec(
                "a",
                iface(
                    "X",
                    attr("fromA1"),
                    partial = true
                )
            ),
            spec(
                "main",
                iface(
                    "X",
                    attr(
                        "own"
                    ),
                    inheritance = "P"
                ),
                iface("P")
            ),
            spec(
                "b",
                iface(
                    "X",
                    attr("fromB"),
                    partial = true
                )
            ),
        ).mergePartials()

        assertEquals(
            listOf(emptyList(), listOf("X", "P"), emptyList()),
            merged.specs.map { s -> s.definitions.map { (it as IdlNamedDefinition).name } })

        val x = merged.find("X")
        assertFalse(x.partial)
        assertEquals("P", x.inheritance)
        assertEquals(listOf("own", "fromA1", "fromB"), x.members.map { (it as IdlAttribute).name })
    }

    @Test
    fun memberScopedAttributesOfPartialArePushedDown() {
        val window = ext("Exposed", "Window")
        val secure = ext("SecureContext")
        val merged = ir(
            spec(
                "main",
                iface(
                    "X",
                    attr("own"),
                    extAttrs = listOf(ext("Exposed", "*"))
                )
            ),
            spec(
                "b",
                iface(
                    "X",
                    attr("plain"),
                    attr("other", extAttrs = listOf(ext("Replaceable"))),
                    partial = true,
                    extAttrs = listOf(window, secure, ext("LegacyOverrideBuiltIns"))
                )
            ),
        ).mergePartials()

        val x = merged.find("X")
        assertEquals(
            listOf("Exposed", "LegacyOverrideBuiltIns"),
            x.extAttrs.map { it.name },
            "only non-member-scoped attributes move to the definition"
        )
        assertEquals(
            listOf(emptyList(), listOf(window, secure), listOf(ext("Replaceable"), window, secure)),
            x.members.map { it.extAttrs },
            "the partial's [Exposed] and [SecureContext] are added to each of its members",
        )
    }

    @Test
    fun memberScopedAttributeOnBothMemberAndPartialFails() {
        val e = assertFailsWith<LoweringException> {
            ir(
                spec(
                    "main",
                    iface("X")
                ),
                spec(
                    "b",
                    iface(
                        "X",
                        attr("a", extAttrs = listOf(ext("Exposed", "Worker"))),
                        partial = true,
                        extAttrs = listOf(ext("Exposed", "Window"))
                    )
                ),
            ).mergePartials()
        }
        assertEquals(listOf("X: [Exposed] is on both 'attribute a' and its partial interface"), e.problems)
    }

    @Test
    fun mixinsAndDictionariesMergeToo() {
        val merged = ir(
            spec(
                "main",
                mixin("M", attr("a")),
                IdlDictionary(
                    "D",
                    false,
                    null,
                    listOf(field("x")),
                    emptyList()
                )
            ),
            spec(
                "b",
                mixin(
                    "M",
                    attr("b"),
                    partial = true
                ),
                IdlDictionary(
                    "D",
                    true,
                    null,
                    listOf(field("y")),
                    emptyList()
                )
            ),
        ).mergePartials()

        assertEquals(
            listOf("a", "b"),
            merged
                .find("M")
                .members
                .map { (it as IdlAttribute).name }
        )
        assertEquals(
            listOf("x", "y"),
            merged
                .definitions
                .filterIsInstance<IdlDictionary>()
                .single()
                .members
                .map { it.name }
        )
    }

    @Test
    fun partialOfDifferentKindFails() {
        val e = assertFailsWith<LoweringException> {
            ir(
                spec("main", iface("X"), iface("Y")),
                spec(
                    "b",
                    IdlDictionary("X", true, null, listOf(field("x")), emptyList()),
                    mixin("Y", attr("a"), partial = true)
                ),
            ).mergePartials()
        }
        assertEquals(
            listOf(
                "partial dictionary X, but X is interface",
                "partial interface mixin Y, but Y is interface",
            ),
            e.problems,
        )
    }

    @Test
    fun duplicateMemberFails() {
        val e = assertFailsWith<LoweringException> {
            ir(
                spec(
                    "main",
                    iface(
                        "X",
                        attr("a")
                    )
                ),
                spec(
                    "b",
                    iface(
                        "X",
                        attr("a", t("DOMString")),
                        partial = true
                    )
                )
            ).mergePartials()
        }
        assertEquals(listOf("X: 'attribute a' is declared more than once"), e.problems)
    }

    @Test
    fun overloadsAreNotDuplicates() {
        val merged = ir(
            spec(
                "main",
                iface(
                    "X",
                    Idl.op(
                        "f",
                        t("undefined"),
                        Idl.arg("a", t("long"))
                    )
                )
            ),
            spec(
                "b",
                iface(
                    "X",
                    Idl.op(
                        "f",
                        t("undefined"),
                        Idl.arg("a", t("DOMString"))
                    ),
                    partial = true
                )
            ),
        ).mergePartials()

        assertEquals(2, merged.find("X").members.size)
    }

    @Test
    fun orphanPartialFails() {
        val e = assertFailsWith<LoweringException> {
            ir(
                spec(
                    "b",
                    iface(
                        "X",
                        partial = true
                    )
                )
            ).mergePartials()
        }
        assertTrue(e.problems.single().startsWith("partial interface X has no main definition"), e.message)
    }

    private fun field(name: String) =
        IdlField(
            name,
            t("long"),
            required = false,
            default = null,
            extAttrs = emptyList()
        )
}
