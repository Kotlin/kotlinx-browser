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
    /**
     * The SVGPathElement.getPathData() method returns the sequence of path segments that corresponds to the path data,
     * optionally normalizing the values and segment types.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getPathData)
     */
    fun getPathData(settings: SVGPathDataSettings = definedExternally): JsArray<SVGPathSegment>

    /**
     * The SVGPathElement.setPathData() method sets the sequence of path segments as the new path data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/setPathData)
     */
    fun setPathData(pathData: JsArray<SVGPathSegment>)
}

/**
 * The SVGPathElement interface corresponds to the &lt;path&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement)
 */
public external abstract class SVGPathElement : SVGGeometryElement, SVGPathData {
    /**
     * The pathLength read-only property of the SVGPathElement interface reflects the pathLength attribute of the given
     * &lt;path&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/pathLength)
     */
    override val pathLength: SVGAnimatedNumber

    /**
     * The getTotalLength() method of the SVGPathElement interface returns the user agent's computed value for the total
     * length of the path in user units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getTotalLength)
     */
    override fun getTotalLength(): Float

    /**
     * The getPointAtLength() method of the SVGPathElement interface returns the point at a given distance along the
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getPointAtLength)
     */
    override fun getPointAtLength(distance: Float): DOMPoint

    /**
     * The getPathSegmentAtLength() method of the SVGPathElement interface returns the path segment at a given distance
     * along the path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/getPathSegmentAtLength)
     */
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
