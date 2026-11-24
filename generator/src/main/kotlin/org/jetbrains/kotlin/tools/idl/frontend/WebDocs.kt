/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import kotlinx.serialization.Serializable
import java.nio.file.Files
import java.nio.file.Path

/** What `bcd-api.json` keeps of a BCD compat statement (written by `prepareWebref` from `@mdn/browser-compat-data`). */
@Serializable
data class BcdEntry(val mdnUrl: String? = null, val deprecated: Boolean = false)

/**
 * A BCD `api.*` interface: its own entry and its [members] by BCD key. The keys are IDL member names, plus `X` for the
 * constructor of `X`, `name_static` for a static member and `type_event` for an event.
 */
@Serializable
data class BcdInterface(
    val mdnUrl: String? = null,
    val deprecated: Boolean = false,
    val members: Map<String, BcdEntry> = emptyMap(),
)

/** The documentation of one declaration: MDN's [summary] of its [mdnUrl] page, if MDN has one. */
data class WebDoc(val mdnUrl: String, val summary: String?, val deprecated: Boolean)

/**
 * The documentation of the Web API: BCD gives each interface and member its MDN page (CC0), and MDN's committed
 * [summaries] (`mdn/summaries.json`, CC-BY-SA 2.5, see NOTICE) give the page's first paragraph.
 */
class WebDocs(
    private val bcd: Map<String, BcdInterface>,
    private val summaries: Map<String, String>
) {

    /** The documentation of the BCD interface [name], or `null` if BCD has no MDN page for it. */
    fun ofInterface(name: String): WebDoc? = bcd[name]?.let { doc(it.mdnUrl, it.deprecated) }

    /** The documentation of the member [key] of the BCD interface [owner]: see [BcdInterface.members]. */
    fun ofMember(owner: String, key: String): WebDoc? =
        bcd[owner]?.members?.get(key)?.let { doc(it.mdnUrl, it.deprecated) }

    /** Whether BCD has the interface [name] at all, even without an MDN page. */
    fun hasInterface(name: String): Boolean = name in bcd

    private fun doc(mdnUrl: String?, deprecated: Boolean): WebDoc? {
        if (mdnUrl == null) return null
        return WebDoc(mdnUrl, summaries[mdnPath(mdnUrl)], deprecated)
    }

    companion object {
        val EMPTY = WebDocs(emptyMap(), emptyMap())

        fun fromFiles(bcd: Path, summaries: Path): WebDocs =
            fromStrings(
                Files.readString(bcd),
                Files.readString(summaries)
            )

        fun fromStrings(bcd: String, summaries: String): WebDocs =
            WebDocs(
                WEBREF_JSON.decodeFromString(bcd),
                WEBREF_JSON.decodeFromString(summaries)
            )

        /** `Web/API/Element/getAttribute` of `https://developer.mozilla.org/docs/Web/API/Element/getAttribute#syntax`. */
        fun mdnPath(mdnUrl: String): String =
            mdnUrl.substringBefore('#').removePrefix("https://developer.mozilla.org/").removePrefix("docs/")
                .removePrefix("en-US/docs/")
    }
}
