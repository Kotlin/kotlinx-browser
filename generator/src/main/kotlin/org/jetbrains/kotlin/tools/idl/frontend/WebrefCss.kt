/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import kotlinx.serialization.Serializable
import org.jetbrains.kotlin.tools.idl.ir.*
import java.nio.file.Files
import java.nio.file.Path

/**
 * One CSS property of `@webref/css`: its [name] (`align-content`), the CSSOM attribute names it has on
 * `CSSStyleProperties` ([styleDeclaration]: `align-content`, `alignContent`), and, for a legacy alias from the Compat
 * spec (`-webkit-align-content`), the property it aliases.
 */
@Serializable
data class WebrefCssProperty(
    val name: String,
    val styleDeclaration: List<String>,
    val legacyAliasOf: String? = null,
)

/** Reader of the properties of `@webref/css` (`css.json`, written by `prepareWebref` as `webref-css.json`). */
object WebrefCss {
    fun fromFile(path: Path): List<WebrefCssProperty> = fromString(Files.readString(path))

    fun fromString(json: String): List<WebrefCssProperty> = WEBREF_JSON.decodeFromString(json)
}

/** The spec whose prose defines the CSS property attributes, and the interface it defines them on. */
private const val CSSOM = "cssom"
private const val CSS_STYLE_PROPERTIES = "CSSStyleProperties"

/** A camel-cased CSSOM attribute name (`alignContent`, `color`), as opposed to dashed or webkit-cased ones. */
private val CAMEL_CASED = Regex("[a-z][A-Za-z0-9]*")

/**
 * The attributes CSSOM defines in prose for every CSS property, as the IDL it would be:
 * `partial interface CSSStyleProperties { [CEReactions] attribute [LegacyNullToEmptyString] CSSOMString alignContent; … }`.
 *
 * Only the camel-cased attribute of each property: the dashed (`align-content`) and webkit-cased (`WebkitX`) ones
 * reach the same property and are not Kotlin identifiers. Vendor-prefixed legacy aliases (`-webkit-align-content`)
 * are left out, the standard property they alias is there; the unprefixed ones (`word-wrap`, `grid-gap`, …) are kept,
 * as they are in common use and the legacy API had them. Sorted by attribute name.
 */
fun cssPropertiesPartial(properties: List<WebrefCssProperty>): IdlInterface {
    val attributes = properties
        .filter { it.legacyAliasOf == null || !it.name.startsWith("-webkit-") }
        .map { p ->
            val camel = p.styleDeclaration.filter { CAMEL_CASED.matches(it) }
            require(camel.size == 1) { "CSS property '${p.name}': expected one camel-cased attribute, got $camel" }
            IdlAttribute(
                name = camel.single(),
                type = IdlNamedType("CSSOMString", extAttrs = listOf(IdlExtendedAttribute("LegacyNullToEmptyString", null))),
                readonly = false,
                special = null,
                extAttrs = listOf(IdlExtendedAttribute("CEReactions", null)),
            )
        }
        .sortedBy { it.name }
    val duplicates = attributes.groupingBy { it.name }.eachCount().filterValues { it > 1 }.keys
    require(duplicates.isEmpty()) { "CSS properties with the same attribute name: $duplicates" }

    return IdlInterface(
        name = CSS_STYLE_PROPERTIES,
        kind = IdlInterfaceKind.INTERFACE,
        partial = true,
        inheritance = null,
        members = attributes,
        extAttrs = emptyList(),
    )
}

/** [this] corpus with [cssPropertiesPartial] added to the end of the `cssom` spec. */
fun IdlIR.withCssProperties(properties: List<WebrefCssProperty>): IdlIR {
    require(specs.any { it.name == CSSOM }) { "spec '$CSSOM' is not in the corpus" }
    val partial = cssPropertiesPartial(properties)
    return copy(specs = specs.map { if (it.name == CSSOM) it.copy(definitions = it.definitions + partial) else it })
}
