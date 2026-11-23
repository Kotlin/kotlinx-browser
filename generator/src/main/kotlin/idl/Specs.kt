/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl

data class SpecEntry(
    val spec: String,
    val packageName: String,
)

/**
 * The specs the generator processes, mapped to Kotlin package names; a definition is generated into its spec's
 * package (no per-definition overrides).
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
    // Split out of html, SVG and cssom after the legacy IDL snapshot; generated into the packages they had there.
    SpecEntry("websockets", "org.w3c.dom"),
    SpecEntry("svg-paths", "org.w3c.dom.svg"),
    SpecEntry("css-conditional", "org.w3c.dom.css"),
    // Dependencies of the specs above, generated so references to them resolve.
    SpecEntry("webidl", "org.w3c.dom"),
    SpecEntry("wai-aria", "org.w3c.dom"),
    SpecEntry("streams", "org.w3c.streams"),
    SpecEntry("referrer-policy", "org.w3c.fetch"),
    SpecEntry("performance-timeline", "org.w3c.performance"),
    SpecEntry("resource-timing", "org.w3c.performance"),
)

/** A spec that allowlisted specs reference but that is deliberately not generated. */
data class ExcludedSpec(
    val spec: String,
    val reason: String,
)

/**
 * Specs referenced by the allowlist but not generated. Every reference into them is pruned from the surface
 * (members removed, union alternatives dropped) and listed in `surface-report.txt`. An entry that no longer prunes
 * anything fails the build, so this list can only shrink as specs are moved into [SPEC_ALLOWLIST].
 */
val EXCLUDED_SPECS: List<ExcludedSpec> = listOf(
    ExcludedSpec(
        "trusted-types",
        "Trusted Types alternatives are dropped from unions so HTML sinks stay String-typed, as in the legacy API; revisit with BCD filtering."
    ),
    ExcludedSpec("web-animations", "Web Animations API is not part of the basic surface yet."),
    ExcludedSpec("css-view-transitions", "View Transitions are not part of the basic surface yet."),
    ExcludedSpec("css-pseudo", "CSSPseudoElement is experimental."),
    ExcludedSpec("webgpu", "WebGPU is not part of the basic surface."),
    ExcludedSpec("webcodecs", "WebCodecs is not part of the basic surface."),
    ExcludedSpec("permissions", "Permissions API is not part of the basic surface yet."),
    ExcludedSpec("urlpattern", "URLPattern is not part of the basic surface yet."),
    ExcludedSpec("mathml-core", "MathML is not part of the basic surface."),
)

/** A type defined by no spec in the corpus (an ECMAScript built-in) that is deliberately not provided. */
data class ExcludedType(
    val name: String,
    val reason: String,
)

/** Like [EXCLUDED_SPECS], for single built-in types. Same pruning and self-pruning rules. */
val EXCLUDED_TYPES: List<ExcludedType> = listOf(
    ExcludedType(
        "Float16Array",
        "Not provided by the hand-written typed arrays yet; ImageData.data stays Uint8ClampedArray as in the legacy API."
    ),
)
