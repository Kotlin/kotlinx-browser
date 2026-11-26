/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*

/**
 * `setTimeout` and `setInterval` take a `() -> Unit` handler and no `arguments` (KT-60392).
 *
 * HTML types the handler as `typedef (DOMString or Function or TrustedScript) TimerHandler`, where `Function` is
 * `any (any... arguments)`, and calls a function handler with the operation's trailing `any... arguments`. Printed as
 * is, the handler is `(JsAny?) -> JsAny?`, which makes every Kotlin lambda end with a value. HTML ignores what the
 * handler returns, and a Kotlin lambda captures what it needs instead of receiving `arguments` (a string handler
 * ignores them too), so the `Function` alternative becomes `VoidFunction` (`undefined ()`) and `arguments` is dropped.
 * JS calling a `() -> Unit` with extra arguments is fine on both targets (`InteropTest`).
 *
 * Runs before [resolveTypedefs], while `TimerHandler` is still a name. Without the typedef (a test IR) it does
 * nothing; with it, any other shape than the one above fails, so a spec change is noticed.
 */
fun IdlIR.simplifyTimerHandlers(): IdlIR {
    val typedef = definitions
        .filterIsInstance<IdlTypedef>()
        .singleOrNull { it.name == TIMER_HANDLER }
        ?: return this

    val union = typedef.type as? IdlUnionType

    val function = union
        ?.members
        ?.singleOrNull { it is IdlNamedType && it.name == FUNCTION } as IdlNamedType?

    if (union == null || function == null) {
        throw LoweringException(listOf("typedef $TIMER_HANDLER is not a union with $FUNCTION: ${typedef.type.render()}"))
    }

    val problems = mutableListOf<String>()
    var operations = 0

    fun simplify(owner: String, op: IdlOperation): IdlOperation {
        val isTimerHandlerArgument = op.arguments.any { (it.type as? IdlNamedType)?.name == TIMER_HANDLER }
        if (!isTimerHandlerArgument) return op

        operations++

        val last = op.arguments.lastOrNull()

        if (last == null || !last.variadic || last.name != ARGUMENTS) {
            problems += "$owner.${op.name} takes a $TIMER_HANDLER but does not end with `any... $ARGUMENTS`"
            return op
        }

        return op.copy(arguments = op.arguments.dropLast(1))
    }

    val result = IdlIR(
        specs.map { spec ->
            spec.copy(
                definitions = spec.definitions.map { d ->
                    when (d) {
                        typedef -> typedef.copy(
                            type = union.copy(
                                members = union.members.map {
                                    if (it === function) {
                                        function.copy(name = VOID_FUNCTION)
                                    } else {
                                        it
                                    }
                                }
                            )
                        )

                        is IdlInterface -> d.copy(
                            members = d.members.map { m ->
                                if (m is IdlOperation) {
                                    simplify(d.name, m)
                                } else {
                                    m
                                }
                            }
                        )

                        else -> d
                    }
                }
            )
        }
    )

    if (operations == 0) problems += "no operation takes a $TIMER_HANDLER"
    if (problems.isNotEmpty()) throw LoweringException(problems)

    return result
}

private const val TIMER_HANDLER = "TimerHandler"
private const val FUNCTION = "Function"
private const val VOID_FUNCTION = "VoidFunction"
private const val ARGUMENTS = "arguments"
