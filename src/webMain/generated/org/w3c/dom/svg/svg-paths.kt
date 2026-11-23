/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'svg-paths', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.svg

import kotlin.js.*
import org.w3c.dom.*

public external abstract class SVGPathSegment : JsAny {
    open var type: String
    open var values: JsArray<JsNumber>
}

public external interface SVGPathDataSettings : JsAny {
    var normalize: Boolean?
}

public fun SVGPathDataSettings(normalize: Boolean? = null): SVGPathDataSettings = newJsObject<SVGPathDataSettings>().apply {
    if (normalize != null) this.normalize = normalize
}

public external interface SVGPathData : JsAny {
    fun getPathData(settings: SVGPathDataSettings = definedExternally): JsArray<SVGPathSegment>
    fun setPathData(pathData: JsArray<SVGPathSegment>)
}

public external abstract class SVGPathElement : SVGGeometryElement, SVGPathData {
    override val pathLength: SVGAnimatedNumber
    override fun getTotalLength(): Float
    override fun getPointAtLength(distance: Float): DOMPoint
    open fun getPathSegmentAtLength(distance: Float): SVGPathSegment?

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}
