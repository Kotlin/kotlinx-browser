/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'css-masking', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.css.masking

import org.w3c.dom.svg.*

/**
 * The SVGClipPathElement interface provides access to the properties of &lt;clipPath&gt; elements, as well as methods
 * to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGClipPathElement)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class SVGClipPathElement : SVGElement {
    /**
     * The read-only clipPathUnits property of the SVGClipPathElement interface reflects the clipPathUnits attribute of
     * a &lt;clipPath&gt; element which defines the coordinate system to use for the content of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGClipPathElement/clipPathUnits)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clipPathUnits: SVGAnimatedEnumeration

    /**
     * The read-only transform property of the SVGClipPathElement interface reflects the transform attribute of a
     * &lt;clipPath&gt; element, that is a list of transformations applied to the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGClipPathElement/transform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val transform: SVGAnimatedTransformList

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

/**
 * The SVGMaskElement interface provides access to the properties of &lt;mask&gt; elements, as well as methods to
 * manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class SVGMaskElement : SVGElement {
    /**
     * The read-only maskUnits property of the SVGMaskElement interface reflects the maskUnits attribute of a
     * &lt;mask&gt; element which defines the coordinate system to use for the mask of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/maskUnits)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val maskUnits: SVGAnimatedEnumeration

    /**
     * The read-only maskContentUnits property of the SVGMaskElement interface reflects the maskContentUnits attribute.
     * It indicates which coordinate system to use for the contents of the &lt;mask&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/maskContentUnits)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val maskContentUnits: SVGAnimatedEnumeration

    /**
     * The read-only x property of the SVGMaskElement interface returns an SVGAnimatedLength object containing the value
     * of the x attribute of the &lt;mask&gt;. It represents the x-axis coordinate of the top-left corner of the masking
     * area.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/x)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val x: SVGAnimatedLength

    /**
     * The read-only y property of the SVGMaskElement interface returns an SVGAnimatedLength object containing the value
     * of the y attribute of the &lt;mask&gt;. It represents the y-axis coordinate of the top-left corner of the masking
     * area.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/y)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val y: SVGAnimatedLength

    /**
     * The read-only width property of the SVGMaskElement interface returns an SVGAnimatedLength object containing the
     * value of the width attribute of the &lt;mask&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/width)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val width: SVGAnimatedLength

    /**
     * The read-only height property of the SVGMaskElement interface returns an SVGAnimatedLength object containing the
     * value of the height attribute of the &lt;mask&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMaskElement/height)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val height: SVGAnimatedLength

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
