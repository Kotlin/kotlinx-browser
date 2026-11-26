/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.IdlArgument
import org.jetbrains.kotlin.tools.idl.ir.IdlOperation
import org.jetbrains.kotlin.tools.idl.ir.IdlTypedef
import org.jetbrains.kotlin.tools.idl.lowering.Idl.arg
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface
import org.jetbrains.kotlin.tools.idl.lowering.Idl.ir
import org.jetbrains.kotlin.tools.idl.lowering.Idl.mixin
import org.jetbrains.kotlin.tools.idl.lowering.Idl.op
import org.jetbrains.kotlin.tools.idl.lowering.Idl.spec
import org.jetbrains.kotlin.tools.idl.lowering.Idl.t
import org.jetbrains.kotlin.tools.idl.lowering.Idl.typedef
import org.jetbrains.kotlin.tools.idl.lowering.Idl.union
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertSame
import org.jetbrains.kotlin.tools.idl.lowering.Idl.iface as find

class TimerHandlersTest {
    private val arguments = IdlArgument("arguments", t("any"), optional = false, variadic = true, default = null, extAttrs = emptyList())
    private val timerHandler = typedef("TimerHandler", union(t("DOMString"), t("Function")))

    private fun timers(vararg tail: IdlArgument) = ir(
        spec(
            "html",
            timerHandler,
            mixin("WindowOrWorkerGlobalScope", op("setTimeout", t("long"), arg("handler", t("TimerHandler")), arg("timeout", t("long"), optional = true), *tail)),
        )
    )

    @Test
    fun functionBecomesVoidFunctionAndArgumentsAreDropped() {
        val result = timers(arguments).simplifyTimerHandlers()
        assertEquals(
            union(t("DOMString"), t("VoidFunction")),
            result.definitions.filterIsInstance<IdlTypedef>().single().type,
        )
        assertEquals(
            listOf("handler", "timeout"),
            (result.find("WindowOrWorkerGlobalScope").members.single() as IdlOperation).arguments.map { it.name },
        )
    }

    @Test
    fun withoutTheTypedefNothingChanges() {
        val input = ir(spec("s", iface("X", op("f", t("undefined"), arg("a", t("Function"))))))
        assertSame(input, input.simplifyTimerHandlers())
    }

    @Test
    fun anotherShapeFails() {
        assertFailsWith<LoweringException> { timers().simplifyTimerHandlers() }
        assertFailsWith<LoweringException> {
            ir(spec("html", typedef("TimerHandler", t("DOMString")))).simplifyTimerHandlers()
        }
    }
}
