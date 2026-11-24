/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl

import org.jetbrains.kotlin.tools.idl.frontend.IdlFrontend
import org.jetbrains.kotlin.tools.idl.frontend.IdlSource
import org.jetbrains.kotlin.tools.idl.frontend.WebDocs
import org.jetbrains.kotlin.tools.idl.frontend.WebIdl2JsonFrontend
import org.jetbrains.kotlin.tools.idl.frontend.WebrefCss
import org.jetbrains.kotlin.tools.idl.frontend.WebrefCssProperty
import org.jetbrains.kotlin.tools.idl.frontend.WebrefEvent
import org.jetbrains.kotlin.tools.idl.frontend.WebrefEvents
import org.jetbrains.kotlin.tools.idl.frontend.withCssProperties
import org.jetbrains.kotlin.tools.idl.ir.IdlIR
import org.jetbrains.kotlin.tools.idl.surface.Exclusion
import org.jetbrains.kotlin.tools.idl.surface.SurfaceBuilder
import org.jetbrains.kotlin.tools.idl.surface.SurfaceResult
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Where the generator reads its inputs and writes its outputs. Every location is a system property, set by the
 * Gradle tasks that run the generator (`generateWebApi`, `generateUtils`, `dumpIdlIr`, `test`; see
 * `generator/build.gradle.kts`), so nothing depends on the working directory or on files at fixed places.
 */
object GeneratorPaths {
    /** `@webref/idl` parsed by webidl2: spec shortname → definitions. Written by `prepareWebref`. */
    val webrefIdl: Path get() = path("kotlinx.browser.webrefIdl")

    /** `@webref/events`, from the same crawl as [webrefIdl]. Written by `prepareWebref`. */
    val webrefEvents: Path get() = path("kotlinx.browser.webrefEvents")

    /** The properties of `@webref/css`, from the same crawl as [webrefIdl]. Written by `prepareWebref`. */
    val webrefCss: Path get() = path("kotlinx.browser.webrefCss")

    /** From `@mdn/browser-compat-data`: the MDN page and status of each Web API declaration. Written by `prepareWebref`. */
    val bcd: Path get() = path("kotlinx.browser.bcd")

    /** MDN's summary of each Web API page (committed, CC-BY-SA 2.5): written by `updateMdnSummaries`. */
    val mdnSummaries: Path get() = path("kotlinx.browser.mdnSummaries")

    /** The generated `webMain` declarations (committed): written by `generateWebApi`, verified by `GeneratedSourcesTest`. */
    val generatedSources: Path get() = path("kotlinx.browser.generatedSources")

    /** Every pruning decision (committed): written by `generateWebApi`, verified by `RealSurfaceTest`. */
    val surfaceReport: Path get() = path("kotlinx.browser.surfaceReport")

    /** The repository root, which the paths of `generateUtils` are relative to. */
    val repositoryRoot: Path get() = path("kotlinx.browser.repositoryRoot")

    private fun path(property: String): Path =
        System.getProperty(property)?.let { Paths.get(it) }
            ?: error("System property '$property' is not set: run the generator through its Gradle tasks, or pass -D$property=<path>")
}

/** The specs the generator processes, in allowlist order. */
val ALLOWLISTED_SOURCES: List<IdlSource> = SPEC_ALLOWLIST.map { IdlSource(it.spec, it.packageName) }

fun defaultFrontend(): IdlFrontend = WebIdl2JsonFrontend.fromFile(GeneratorPaths.webrefIdl)

fun loadAllowlistedIdl(frontend: IdlFrontend = defaultFrontend()): IdlIR = frontend.parse(ALLOWLISTED_SOURCES)

/** Specs and built-in types referenced by the allowlist but not generated. */
val EXCLUSIONS: List<Exclusion> =
    EXCLUDED_SPECS.map { Exclusion.Spec(it.spec, it.reason) } + EXCLUDED_TYPES.map {
        Exclusion.Type(
            it.name,
            it.reason
        )
    }

/**
 * The generated surface: allowlisted specs, plus the CSS property attributes CSSOM defines in prose
 * ([withCssProperties]), with references into excluded specs pruned and every remaining reference resolved. Throws
 * [org.jetbrains.kotlin.tools.idl.surface.SurfaceException] if anything is unresolved.
 */
fun loadSurface(
    frontend: WebIdl2JsonFrontend = WebIdl2JsonFrontend.fromFile(GeneratorPaths.webrefIdl),
    cssProperties: List<WebrefCssProperty> = loadCssProperties(),
): SurfaceResult {
    val corpus = frontend
        .parse(frontend.availableSpecs.map { IdlSource(it, packageName = "") })
        .withCssProperties(cssProperties)
    return SurfaceBuilder.build(corpus, ALLOWLISTED_SOURCES, EXCLUSIONS)
}

/** The properties of the pinned `@webref/css`. */
fun loadCssProperties(): List<WebrefCssProperty> = WebrefCss.fromFile(GeneratorPaths.webrefCss)

/** The KDoc of the generated declarations: BCD and the committed MDN summaries. */
fun loadWebDocs(): WebDocs = WebDocs.fromFiles(GeneratorPaths.bcd, GeneratorPaths.mdnSummaries)

/** The pinned `@webref/events`. */
fun loadEvents(): List<WebrefEvent> = WebrefEvents.fromFile(GeneratorPaths.webrefEvents)
