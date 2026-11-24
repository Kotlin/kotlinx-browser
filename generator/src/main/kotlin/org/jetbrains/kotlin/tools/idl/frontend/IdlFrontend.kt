/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import org.jetbrains.kotlin.tools.idl.ir.IdlIR

/**
 * One spec to be read by a front-end.
 *
 * @property spec webref spec shortname (`html`, `dom`, …), i.e. the `@webref/idl` file name without `.idl`.
 * @property packageName Kotlin package the spec is generated into.
 */
data class IdlSource(val spec: String, val packageName: String)

/**
 * The only contract between IDL input and the rest of the generator.
 *
 * A front-end must either return a complete IR for every requested source or throw [IdlFrontendException];
 * it must never silently drop a definition or member it does not understand.
 */
fun interface IdlFrontend {
    fun parse(sources: List<IdlSource>): IdlIR
}

/** Thrown when input cannot be read faithfully. Carries every problem found, not just the first one. */
class IdlFrontendException(val problems: List<String>) : RuntimeException(
    buildString {
        append("IDL front-end failed with ${problems.size} problem(s):")
        problems.take(MAX_REPORTED).forEach { append("\n  - ").append(it) }
        if (problems.size > MAX_REPORTED) append("\n  … and ${problems.size - MAX_REPORTED} more")
    }
) {
    private companion object {
        const val MAX_REPORTED = 50
    }
}
