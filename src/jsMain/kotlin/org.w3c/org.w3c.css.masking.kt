/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.css.masking

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.svg.*

/**
 * Exposes the JavaScript [SVGClipPathElement](https://developer.mozilla.org/en/docs/Web/API/SVGClipPathElement) to Kotlin
 */
actual external abstract class SVGClipPathElement : SVGElement, SVGUnitTypes {
    actual open val clipPathUnits: SVGAnimatedEnumeration
    actual open val transform: SVGAnimatedTransformList

    actual companion object {
        actual val SVG_UNIT_TYPE_UNKNOWN: Short
        actual val SVG_UNIT_TYPE_USERSPACEONUSE: Short
        actual val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [SVGMaskElement](https://developer.mozilla.org/en/docs/Web/API/SVGMaskElement) to Kotlin
 */
actual external abstract class SVGMaskElement : SVGElement, SVGUnitTypes {
    actual open val maskUnits: SVGAnimatedEnumeration
    actual open val maskContentUnits: SVGAnimatedEnumeration
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength
    actual open val width: SVGAnimatedLength
    actual open val height: SVGAnimatedLength

    actual companion object {
        actual val SVG_UNIT_TYPE_UNKNOWN: Short
        actual val SVG_UNIT_TYPE_USERSPACEONUSE: Short
        actual val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}