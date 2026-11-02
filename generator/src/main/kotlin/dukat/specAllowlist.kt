/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.dukat

data class SpecEntry(
    val spec: String,
    val packageName: String,
)

/**
 * Explicit specification allowlist mapped to Kotlin package names,
 * preserving the mapping from the original IDL URLs table.
 */
val SPEC_ALLOWLIST: List<SpecEntry> = listOf(
    SpecEntry("html", "org.w3c.dom"),
    SpecEntry("dom", "org.w3c.dom"),
    SpecEntry("geometry", "org.w3c.dom"),
    SpecEntry("cssom-view", "org.w3c.dom"),
    SpecEntry("touch-events", "org.w3c.dom"),
    SpecEntry("uievents", "org.w3c.dom.events"),
    SpecEntry("pointerevents", "org.w3c.dom.pointerevents"),
    SpecEntry("cssom", "org.w3c.dom.css"),
    SpecEntry("css-masking", "org.w3c.css.masking"),
    SpecEntry("mediacapture-streams", "org.w3c.dom.mediacapture"),
    SpecEntry("clipboard-apis", "org.w3c.dom.clipboard"),
    SpecEntry("url", "org.w3c.dom.url"),
    SpecEntry("SVG", "org.w3c.dom.svg"),
    SpecEntry("webgl1", "org.khronos.webgl"),
    SpecEntry("webgl2", "org.khronos.webgl"),
    SpecEntry("xhr", "org.w3c.xhr"),
    SpecEntry("fetch", "org.w3c.fetch"),
    SpecEntry("FileAPI", "org.w3c.files"),
    SpecEntry("notifications", "org.w3c.notifications"),
    SpecEntry("fullscreen", "org.w3c.fullscreen"),
    SpecEntry("vibration", "org.w3c.vibration"),
    SpecEntry("hr-time", "org.w3c.performance"),
    SpecEntry("navigation-timing", "org.w3c.performance"),
    SpecEntry("service-workers", "org.w3c.workers"),
    SpecEntry("media-source", "org.w3c.dom.mediasource"),
    SpecEntry("encrypted-media", "org.w3c.dom.encryptedmedia"),
)

val SPEC_TO_PACKAGE_MAP: Map<String, String> = SPEC_ALLOWLIST.associate { it.spec to it.packageName }
