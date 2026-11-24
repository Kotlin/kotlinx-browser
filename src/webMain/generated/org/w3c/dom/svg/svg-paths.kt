/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'svg-paths', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.svg

import kotlin.js.*
import org.w3c.dom.*

public abstract external class SVGPathSegment : JsAny {
    public open var type: String
    public open var values: JsArray<JsNumber>
}

public external interface SVGPathDataSettings : JsAny {
    public var normalize: Boolean?
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
    public fun getPathData(settings: SVGPathDataSettings = definedExternally): JsArray<SVGPathSegment>

    /**
     * The SVGPathElement.setPathData() method sets the sequence of path segments as the new path data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement/setPathData)
     */
    public fun setPathData(pathData: JsArray<SVGPathSegment>)
}

/**
 * The SVGPathElement interface corresponds to the &lt;path&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPathElement)
 */
public abstract external class SVGPathElement : SVGGeometryElement, SVGPathData {
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
    public open fun getPathSegmentAtLength(distance: Float): SVGPathSegment?

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}
