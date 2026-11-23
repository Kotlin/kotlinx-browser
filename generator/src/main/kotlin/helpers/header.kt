/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.generators.helpers

import org.xml.sax.InputSource
import java.io.File
import javax.xml.xpath.XPathFactory

private val LINE_SEPARATOR = System.lineSeparator()

private fun readCopyrightNoticeFromProfile(copyrightProfile: File): String {
    val template = copyrightProfile.reader().use { reader ->
        XPathFactory.newInstance().newXPath().evaluate(
            "/component/copyright/option[@name='notice']/@value",
            InputSource(reader)
        )
    }
    val yearTemplate = "&#36;today.year"
    val year = java.time.LocalDate.now().year.toString()
    assert(yearTemplate in template)

    return template.replace(yearTemplate, year).lines()
        .joinToString("", prefix = "/*$LINE_SEPARATOR", postfix = " */$LINE_SEPARATOR") {
            " * $it$LINE_SEPARATOR"
        }
}

internal fun getHeader(seeDetailsAt: String): String {
    val copyrightNotice = readCopyrightNoticeFromProfile(
        File(".idea/copyright/apache.xml")
    )
    val note = "// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!$LINE_SEPARATOR" +
            "// See $seeDetailsAt for details$LINE_SEPARATOR"
    return copyrightNotice + LINE_SEPARATOR + note + LINE_SEPARATOR
}
