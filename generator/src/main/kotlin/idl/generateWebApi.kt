/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl

import org.jetbrains.kotlin.tools.idl.backend.KotlinBackend
import org.jetbrains.kotlin.tools.idl.lowering.lower
import java.nio.file.Files
import java.nio.file.Path

/** The generated `webMain` sources: path relative to [GeneratorPaths.generatedSources] → content, sorted by path. */
fun generateWebApi(): Map<String, String> {
    val lowered = loadSurface().ir.lower(loadEvents())
    val backend = KotlinBackend(lowered, loadWebDocs())
    return lowered.ir.specs
        .associate { backend.path(it) to backend.file(it) }
        .toSortedMap()
}

/** The committed generated sources, in the shape of [generateWebApi]. */
fun committedWebApi(root: Path = GeneratorPaths.generatedSources): Map<String, String> {
    if (!Files.isDirectory(root)) return emptyMap()
    return Files.walk(root).use { paths ->
        paths.filter { Files.isRegularFile(it) }
            .toList()
            .associate { root.relativize(it).toString().replace('\\', '/') to Files.readString(it) }
            .toSortedMap()
    }
}

/**
 * Regenerates `src/webMain/generated` from the pinned Web IDL: deletes it and writes every file again, so a spec
 * that is no longer generated leaves no file behind. Also rewrites `surface-report.txt`.
 * `GeneratedSourcesTest` fails while the committed files differ from this output.
 */
fun main() {
    val root = GeneratorPaths.generatedSources
    val files = generateWebApi()
    if (Files.isDirectory(root)) {
        Files.walk(root).use { paths -> paths.sorted(Comparator.reverseOrder()).forEach(Files::delete) }
    }
    for ((path, content) in files) {
        val file = root.resolve(path)
        Files.createDirectories(file.parent)
        Files.writeString(file, content)
    }
    Files.writeString(GeneratorPaths.surfaceReport, loadSurface().report())
    println("Generated ${files.size} files into $root")
}
