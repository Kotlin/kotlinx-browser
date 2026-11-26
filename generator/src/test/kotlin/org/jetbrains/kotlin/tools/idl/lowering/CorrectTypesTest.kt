/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.TypeCorrection
import org.jetbrains.kotlin.tools.idl.ir.IdlAttribute
import org.jetbrains.kotlin.tools.idl.ir.IdlDictionary
import org.jetbrains.kotlin.tools.idl.ir.IdlField
import org.jetbrains.kotlin.tools.idl.ir.IdlValue
import org.jetbrains.kotlin.tools.idl.lowering.Idl.attr
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface as find

class CorrectTypesTest {
    private val init = IdlDictionary(
        "EInit", partial = false, inheritance = null,
        members = listOf(IdlField("x", t("long"), required = false, default = IdlValue.Num("0"), extAttrs = emptyList())),
        extAttrs = emptyList(),
    )
    private val input = ir(spec("s", iface("E", attr("x", t("long")), attr("y", t("long", nullable = true))), init))

    private fun correction(owner: String, member: String) = TypeCorrection(owner, member, "double", "test")

    @Test
    fun attributesAndFieldsGetTheTypeAndKeepNullability() {
        val result = input.correctTypes(listOf(correction("E", "x"), correction("E", "y"), correction("EInit", "x")))
        assertEquals(
            listOf(t("double"), t("double", nullable = true)),
            result.find("E").members.map { (it as IdlAttribute).type },
        )
        assertEquals(t("double"), result.definitions.filterIsInstance<IdlDictionary>().single().members.single().type)
    }

    @Test
    fun staleEntriesFail() {
        assertFailsWith<LoweringException> { input.correctTypes(listOf(correction("E", "missing"))) }
        assertFailsWith<LoweringException> { input.correctTypes(listOf(correction("Missing", "x"))) }
        assertFailsWith<LoweringException> {
            input.correctTypes(listOf(correction("E", "x"))).correctTypes(listOf(correction("E", "x")))
        }
    }
}
