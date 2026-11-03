/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl

import org.jetbrains.kotlin.tools.dukat.SPEC_ALLOWLIST
import org.jetbrains.kotlin.tools.idl.frontend.IdlFrontend
import org.jetbrains.kotlin.tools.idl.frontend.IdlSource
import org.jetbrains.kotlin.tools.idl.frontend.WebIdl2JsonFrontend
import org.jetbrains.kotlin.tools.idl.ir.IdlIR
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/** Locations of committed generator inputs, independent of the current working directory. */
object RepoPaths {
    val root: Path by lazy {
        generateSequence(Paths.get("").toAbsolutePath()) { it.parent }
            .firstOrNull { Files.isRegularFile(it.resolve(WEBREF_JSON)) && Files.isDirectory(it.resolve("generator")) }
            ?: error("Cannot locate the kotlinx-browser repository root (looked for $WEBREF_JSON) from ${Paths.get("").toAbsolutePath()}")
    }

    val webrefJson: Path get() = root.resolve(WEBREF_JSON)

    private const val WEBREF_JSON = "webref-idl.json"
}

/** The specs the generator processes, in allowlist order. */
val ALLOWLISTED_SOURCES: List<IdlSource> = SPEC_ALLOWLIST.map { IdlSource(it.spec, it.packageName) }

fun defaultFrontend(): IdlFrontend = WebIdl2JsonFrontend.fromFile(RepoPaths.webrefJson)

fun loadAllowlistedIdl(frontend: IdlFrontend = defaultFrontend()): IdlIR = frontend.parse(ALLOWLISTED_SOURCES)
