/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.nio.file.Files
import java.nio.file.Path

/** Where an event fires: [target] (an interface name) and, if it bubbles, the interfaces it bubbles through. */
@Serializable
data class WebrefEventTarget(val target: String, val bubblingPath: List<String> = emptyList())

/** One entry of `@webref/events`: an event [type] (`click`) fired as [eventInterface] (`PointerEvent`) at [targets]. */
@Serializable
data class WebrefEvent(
    val type: String,
    @SerialName("interface") val eventInterface: String,
    val targets: List<WebrefEventTarget> = emptyList(),
    /** The defining spec's anchor, for error messages and the decision record. */
    val href: String = "",
)

/** Reader of `@webref/events` (`events.json`, written by `prepareWebref` as `webref-events.json`). */
object WebrefEvents {
    fun fromFile(path: Path): List<WebrefEvent> = fromString(Files.readString(path))

    fun fromString(json: String): List<WebrefEvent> = WEBREF_JSON.decodeFromString(json)
}

/** webref entries carry more than the generator reads (spec links, extended attributes, …): the rest is skipped. */
internal val WEBREF_JSON = Json { ignoreUnknownKeys = true }
