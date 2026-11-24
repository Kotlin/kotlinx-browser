/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl

import org.jetbrains.kotlin.tools.idl.frontend.IdlSource
import org.jetbrains.kotlin.tools.idl.frontend.WebIdl2JsonFrontend
import org.jetbrains.kotlin.tools.idl.ir.render
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Renders the IR of the whole pinned corpus back as Web IDL, one file per spec, into the directory given as the only
 * argument (`./gradlew :generator:dumpIdlIr` passes `generator/build/idl-ir`). Feeding the output back into webidl2
 * must reproduce the parsed corpus: `checkIrRoundTrip`.
 */
fun main(args: Array<String>) {
    val out = Paths.get(args.singleOrNull() ?: error("usage: dumpIdlIr <output directory>"))
    val frontend = WebIdl2JsonFrontend.fromFile(GeneratorPaths.webrefIdl)
    val ir = frontend.parse(frontend.availableSpecs.map { IdlSource(it, "corpus") })
    Files.createDirectories(out)
    for (spec in ir.specs) {
        Files.writeString(out.resolve("${spec.name}.idl"), spec.definitions.joinToString("\n", postfix = "\n") { it.render() })
    }
    println("Rendered ${ir.specs.size} specs into $out")
}
