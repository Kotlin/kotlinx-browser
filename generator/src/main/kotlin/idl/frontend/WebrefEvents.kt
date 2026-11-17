/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonParser
import java.nio.file.Files
import java.nio.file.Path

/** Where an event fires: [target] (an interface name) and, if it bubbles, the interfaces it bubbles through. */
data class WebrefEventTarget(val target: String, val bubblingPath: List<String> = emptyList())

/** One entry of `@webref/events`: an event [type] (`click`) fired as [eventInterface] (`PointerEvent`) at [targets]. */
data class WebrefEvent(
    val type: String,
    val eventInterface: String,
    val targets: List<WebrefEventTarget>,
    /** The defining spec's anchor, for error messages and the decision record. */
    val href: String = "",
)

/** Reader of `@webref/events` (`events.json`, committed as `webref-events.json`). */
object WebrefEvents {
    fun fromFile(path: Path): List<WebrefEvent> =
        Files.newBufferedReader(path).use { fromJson(JsonParser.parseReader(it), path.toString()) }

    fun fromString(json: String): List<WebrefEvent> = fromJson(JsonParser.parseString(json), "<string>")

    private fun fromJson(element: JsonElement, origin: String): List<WebrefEvent> {
        require(element.isJsonArray) { "$origin: expected a JSON array of events" }
        return element.asJsonArray.mapIndexed { i, e ->
            val o = e.asJsonObject
            fun string(key: String) = o.get(key)?.takeIf { it.isJsonPrimitive }?.asString
                ?: throw IllegalArgumentException("$origin: event #$i has no '$key'")
            WebrefEvent(
                type = string("type"),
                eventInterface = string("interface"),
                targets = o.getAsJsonArray("targets").orEmpty().map { t ->
                    val to = t.asJsonObject
                    WebrefEventTarget(
                        target = to.get("target").asString,
                        bubblingPath = to.getAsJsonArray("bubblingPath").orEmpty().map { it.asString },
                    )
                },
                href = o.get("href")?.asString.orEmpty(),
            )
        }
    }

    private fun JsonArray?.orEmpty(): List<JsonElement> = this?.toList() ?: emptyList()
}
