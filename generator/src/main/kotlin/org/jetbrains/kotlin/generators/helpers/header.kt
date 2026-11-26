/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.generators.helpers

/**
 * The header of every generated source file: the copyright notice, then a note naming what the file is generated from
 * (`the Web IDL of 'dom'`; omitted when it is the generator itself) and where to look for details, then a blank line.
 * With [mdnExcerpts], also that the KDoc taken from MDN is under its own license, which the Apache 2.0 line above
 * does not cover.
 *
 * Fixed text and `\n` line breaks, so a regeneration gives the same bytes on every date and OS: the committed files
 * are compared with fresh output by `GeneratedSourcesTest` and `GeneratedUtilsTest`.
 */
fun generatedFileHeader(seeDetailsAt: String, generatedFrom: String? = null, mdnExcerpts: Boolean = false): String = """
    |/*
    | * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
    | * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.${if (mdnExcerpts) MDN_NOTE else ""}
    | */
    |
    |// NOTE: THIS FILE IS AUTO-GENERATED${generatedFrom?.let { " FROM $it" }.orEmpty()}, DO NOT EDIT!
    |// See $seeDetailsAt for details.
    |
    |""".trimMargin()

private const val MDN_NOTE = """
    | *
    | * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
    | * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file."""
