/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.svg

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.css.*

/**
 * Exposes the JavaScript [SVGElement](https://developer.mozilla.org/en/docs/Web/API/SVGElement) to Kotlin
 */
actual external abstract class SVGElement : Element, ElementCSSInlineStyle, GlobalEventHandlers, SVGElementInstance {
    actual open val dataset: DOMStringMap
    actual open val ownerSVGElement: SVGSVGElement?
    actual open val viewportElement: SVGElement?
    actual open var tabIndex: Int
    actual fun focus()
    actual fun blur()

    actual companion object {
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

actual external interface SVGBoundingBoxOptions {
    actual var fill: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var stroke: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var markers: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var clipped: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun SVGBoundingBoxOptions(fill: Boolean?, stroke: Boolean?, markers: Boolean?, clipped: Boolean?): SVGBoundingBoxOptions {
    val o = js("({})")
    o["fill"] = fill
    o["stroke"] = stroke
    o["markers"] = markers
    o["clipped"] = clipped
    return o as SVGBoundingBoxOptions
}

/**
 * Exposes the JavaScript [SVGGraphicsElement](https://developer.mozilla.org/en/docs/Web/API/SVGGraphicsElement) to Kotlin
 */
actual external abstract class SVGGraphicsElement : SVGElement, SVGTests {
    actual open val transform: SVGAnimatedTransformList
    actual fun getBBox(options: SVGBoundingBoxOptions): DOMRect
    actual fun getCTM(): DOMMatrix?
    actual fun getScreenCTM(): DOMMatrix?

    actual companion object {
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
 * Exposes the JavaScript [SVGGeometryElement](https://developer.mozilla.org/en/docs/Web/API/SVGGeometryElement) to Kotlin
 */
actual external abstract class SVGGeometryElement : SVGGraphicsElement {
    actual open val pathLength: SVGAnimatedNumber
    actual fun isPointInFill(point: DOMPoint): Boolean
    actual fun isPointInStroke(point: DOMPoint): Boolean
    actual fun getTotalLength(): Float
    actual fun getPointAtLength(distance: Float): DOMPoint

    actual companion object {
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
 * Exposes the JavaScript [SVGNumber](https://developer.mozilla.org/en/docs/Web/API/SVGNumber) to Kotlin
 */
actual external abstract class SVGNumber {
    actual open var value: Float
}

/**
 * Exposes the JavaScript [SVGLength](https://developer.mozilla.org/en/docs/Web/API/SVGLength) to Kotlin
 */
actual external abstract class SVGLength {
    actual open val unitType: Short
    actual open var value: Float
    actual open var valueInSpecifiedUnits: Float
    actual open var valueAsString: String
    actual fun newValueSpecifiedUnits(unitType: Short, valueInSpecifiedUnits: Float)
    actual fun convertToSpecifiedUnits(unitType: Short)

    actual companion object {
        actual val SVG_LENGTHTYPE_UNKNOWN: Short
        actual val SVG_LENGTHTYPE_NUMBER: Short
        actual val SVG_LENGTHTYPE_PERCENTAGE: Short
        actual val SVG_LENGTHTYPE_EMS: Short
        actual val SVG_LENGTHTYPE_EXS: Short
        actual val SVG_LENGTHTYPE_PX: Short
        actual val SVG_LENGTHTYPE_CM: Short
        actual val SVG_LENGTHTYPE_MM: Short
        actual val SVG_LENGTHTYPE_IN: Short
        actual val SVG_LENGTHTYPE_PT: Short
        actual val SVG_LENGTHTYPE_PC: Short
    }
}

/**
 * Exposes the JavaScript [SVGAngle](https://developer.mozilla.org/en/docs/Web/API/SVGAngle) to Kotlin
 */
actual external abstract class SVGAngle {
    actual open val unitType: Short
    actual open var value: Float
    actual open var valueInSpecifiedUnits: Float
    actual open var valueAsString: String
    actual fun newValueSpecifiedUnits(unitType: Short, valueInSpecifiedUnits: Float)
    actual fun convertToSpecifiedUnits(unitType: Short)

    actual companion object {
        actual val SVG_ANGLETYPE_UNKNOWN: Short
        actual val SVG_ANGLETYPE_UNSPECIFIED: Short
        actual val SVG_ANGLETYPE_DEG: Short
        actual val SVG_ANGLETYPE_RAD: Short
        actual val SVG_ANGLETYPE_GRAD: Short
    }
}

actual external abstract class SVGNameList {
    actual open val length: Int
    actual open val numberOfItems: Int
    actual fun clear()
    actual fun initialize(newItem: dynamic): dynamic
    actual fun insertItemBefore(newItem: dynamic, index: Int): dynamic
    actual fun replaceItem(newItem: dynamic, index: Int): dynamic
    actual fun removeItem(index: Int): dynamic
    actual fun appendItem(newItem: dynamic): dynamic
    actual fun getItem(index: Int): dynamic
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGNameList.get(index: Int): dynamic = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGNameList.set(index: Int, newItem: dynamic) { asDynamic()[index] = newItem }

/**
 * Exposes the JavaScript [SVGNumberList](https://developer.mozilla.org/en/docs/Web/API/SVGNumberList) to Kotlin
 */
actual external abstract class SVGNumberList {
    actual open val length: Int
    actual open val numberOfItems: Int
    actual fun clear()
    actual fun initialize(newItem: SVGNumber): SVGNumber
    actual fun insertItemBefore(newItem: SVGNumber, index: Int): SVGNumber
    actual fun replaceItem(newItem: SVGNumber, index: Int): SVGNumber
    actual fun removeItem(index: Int): SVGNumber
    actual fun appendItem(newItem: SVGNumber): SVGNumber
    actual fun getItem(index: Int): SVGNumber
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGNumberList.get(index: Int): SVGNumber? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGNumberList.set(index: Int, newItem: SVGNumber) { asDynamic()[index] = newItem }

/**
 * Exposes the JavaScript [SVGLengthList](https://developer.mozilla.org/en/docs/Web/API/SVGLengthList) to Kotlin
 */
actual external abstract class SVGLengthList {
    actual open val length: Int
    actual open val numberOfItems: Int
    actual fun clear()
    actual fun initialize(newItem: SVGLength): SVGLength
    actual fun insertItemBefore(newItem: SVGLength, index: Int): SVGLength
    actual fun replaceItem(newItem: SVGLength, index: Int): SVGLength
    actual fun removeItem(index: Int): SVGLength
    actual fun appendItem(newItem: SVGLength): SVGLength
    actual fun getItem(index: Int): SVGLength
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGLengthList.get(index: Int): SVGLength? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGLengthList.set(index: Int, newItem: SVGLength) { asDynamic()[index] = newItem }

/**
 * Exposes the JavaScript [SVGAnimatedBoolean](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedBoolean) to Kotlin
 */
actual external abstract class SVGAnimatedBoolean {
    actual open var baseVal: Boolean
    actual open val animVal: Boolean
}

/**
 * Exposes the JavaScript [SVGAnimatedEnumeration](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedEnumeration) to Kotlin
 */
actual external abstract class SVGAnimatedEnumeration {
    actual open var baseVal: Short
    actual open val animVal: Short
}

/**
 * Exposes the JavaScript [SVGAnimatedInteger](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedInteger) to Kotlin
 */
actual external abstract class SVGAnimatedInteger {
    actual open var baseVal: Int
    actual open val animVal: Int
}

/**
 * Exposes the JavaScript [SVGAnimatedNumber](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedNumber) to Kotlin
 */
actual external abstract class SVGAnimatedNumber {
    actual open var baseVal: Float
    actual open val animVal: Float
}

/**
 * Exposes the JavaScript [SVGAnimatedLength](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedLength) to Kotlin
 */
actual external abstract class SVGAnimatedLength {
    actual open val baseVal: SVGLength
    actual open val animVal: SVGLength
}

/**
 * Exposes the JavaScript [SVGAnimatedAngle](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedAngle) to Kotlin
 */
actual external abstract class SVGAnimatedAngle {
    actual open val baseVal: SVGAngle
    actual open val animVal: SVGAngle
}

/**
 * Exposes the JavaScript [SVGAnimatedString](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedString) to Kotlin
 */
actual external abstract class SVGAnimatedString {
    actual open var baseVal: String
    actual open val animVal: String
}

/**
 * Exposes the JavaScript [SVGAnimatedRect](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedRect) to Kotlin
 */
actual external abstract class SVGAnimatedRect {
    actual open val baseVal: DOMRect
    actual open val animVal: DOMRectReadOnly
}

/**
 * Exposes the JavaScript [SVGAnimatedNumberList](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedNumberList) to Kotlin
 */
actual external abstract class SVGAnimatedNumberList {
    actual open val baseVal: SVGNumberList
    actual open val animVal: SVGNumberList
}

/**
 * Exposes the JavaScript [SVGAnimatedLengthList](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedLengthList) to Kotlin
 */
actual external abstract class SVGAnimatedLengthList {
    actual open val baseVal: SVGLengthList
    actual open val animVal: SVGLengthList
}

/**
 * Exposes the JavaScript [SVGStringList](https://developer.mozilla.org/en/docs/Web/API/SVGStringList) to Kotlin
 */
actual external abstract class SVGStringList {
    actual open val length: Int
    actual open val numberOfItems: Int
    actual fun clear()
    actual fun initialize(newItem: String): String
    actual fun insertItemBefore(newItem: String, index: Int): String
    actual fun replaceItem(newItem: String, index: Int): String
    actual fun removeItem(index: Int): String
    actual fun appendItem(newItem: String): String
    actual fun getItem(index: Int): String
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGStringList.get(index: Int): String? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGStringList.set(index: Int, newItem: String) { asDynamic()[index] = newItem }

/**
 * Exposes the JavaScript [SVGUnitTypes](https://developer.mozilla.org/en/docs/Web/API/SVGUnitTypes) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface SVGUnitTypes {
    actual companion object {
        actual val SVG_UNIT_TYPE_UNKNOWN: Short
        actual val SVG_UNIT_TYPE_USERSPACEONUSE: Short
        actual val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Short
    }
}

/**
 * Exposes the JavaScript [SVGTests](https://developer.mozilla.org/en/docs/Web/API/SVGTests) to Kotlin
 */
actual external interface SVGTests {
    actual val requiredExtensions: SVGStringList
    actual val systemLanguage: SVGStringList
}

actual external interface SVGFitToViewBox {
    actual val viewBox: SVGAnimatedRect
    actual val preserveAspectRatio: SVGAnimatedPreserveAspectRatio
}

/**
 * Exposes the JavaScript [SVGZoomAndPan](https://developer.mozilla.org/en/docs/Web/API/SVGZoomAndPan) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface SVGZoomAndPan {
    actual var zoomAndPan: Short

    actual companion object {
        actual val SVG_ZOOMANDPAN_UNKNOWN: Short
        actual val SVG_ZOOMANDPAN_DISABLE: Short
        actual val SVG_ZOOMANDPAN_MAGNIFY: Short
    }
}

/**
 * Exposes the JavaScript [SVGURIReference](https://developer.mozilla.org/en/docs/Web/API/SVGURIReference) to Kotlin
 */
actual external interface SVGURIReference {
    actual val href: SVGAnimatedString
}

/**
 * Exposes the JavaScript [SVGSVGElement](https://developer.mozilla.org/en/docs/Web/API/SVGSVGElement) to Kotlin
 */
actual external abstract class SVGSVGElement : SVGGraphicsElement, SVGFitToViewBox, SVGZoomAndPan, WindowEventHandlers {
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength
    actual open val width: SVGAnimatedLength
    actual open val height: SVGAnimatedLength
    actual open var currentScale: Float
    actual open val currentTranslate: DOMPointReadOnly
    actual fun getIntersectionList(rect: DOMRectReadOnly, referenceElement: SVGElement?): NodeList
    actual fun getEnclosureList(rect: DOMRectReadOnly, referenceElement: SVGElement?): NodeList
    actual fun checkIntersection(element: SVGElement, rect: DOMRectReadOnly): Boolean
    actual fun checkEnclosure(element: SVGElement, rect: DOMRectReadOnly): Boolean
    actual fun deselectAll()
    actual fun createSVGNumber(): SVGNumber
    actual fun createSVGLength(): SVGLength
    actual fun createSVGAngle(): SVGAngle
    actual fun createSVGPoint(): DOMPoint
    actual fun createSVGMatrix(): DOMMatrix
    actual fun createSVGRect(): DOMRect
    actual fun createSVGTransform(): SVGTransform
    actual fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly): SVGTransform
    actual fun getElementById(elementId: String): Element
    actual fun suspendRedraw(maxWaitMilliseconds: Int): Int
    actual fun unsuspendRedraw(suspendHandleID: Int)
    actual fun unsuspendRedrawAll()
    actual fun forceRedraw()

    actual companion object {
        actual val SVG_ZOOMANDPAN_UNKNOWN: Short
        actual val SVG_ZOOMANDPAN_DISABLE: Short
        actual val SVG_ZOOMANDPAN_MAGNIFY: Short
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
 * Exposes the JavaScript [SVGGElement](https://developer.mozilla.org/en/docs/Web/API/SVGGElement) to Kotlin
 */
actual external abstract class SVGGElement : SVGGraphicsElement {
    actual companion object {
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

actual external abstract class SVGUnknownElement : SVGGraphicsElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGDefsElement](https://developer.mozilla.org/en/docs/Web/API/SVGDefsElement) to Kotlin
 */
actual external abstract class SVGDefsElement : SVGGraphicsElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGDescElement](https://developer.mozilla.org/en/docs/Web/API/SVGDescElement) to Kotlin
 */
actual external abstract class SVGDescElement : SVGElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGMetadataElement](https://developer.mozilla.org/en/docs/Web/API/SVGMetadataElement) to Kotlin
 */
actual external abstract class SVGMetadataElement : SVGElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGTitleElement](https://developer.mozilla.org/en/docs/Web/API/SVGTitleElement) to Kotlin
 */
actual external abstract class SVGTitleElement : SVGElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGSymbolElement](https://developer.mozilla.org/en/docs/Web/API/SVGSymbolElement) to Kotlin
 */
actual external abstract class SVGSymbolElement : SVGGraphicsElement, SVGFitToViewBox {
    actual companion object {
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
 * Exposes the JavaScript [SVGUseElement](https://developer.mozilla.org/en/docs/Web/API/SVGUseElement) to Kotlin
 */
actual external abstract class SVGUseElement : SVGGraphicsElement, SVGURIReference {
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength
    actual open val width: SVGAnimatedLength
    actual open val height: SVGAnimatedLength
    actual open val instanceRoot: SVGElement?
    actual open val animatedInstanceRoot: SVGElement?

    actual companion object {
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

actual external open class SVGUseElementShadowRoot : ShadowRoot {
    actual companion object {
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

actual external interface SVGElementInstance {
    actual val correspondingElement: SVGElement?
        get() = definedExternally
    actual val correspondingUseElement: SVGUseElement?
        get() = definedExternally
}

actual external open class ShadowAnimation actual constructor(source: dynamic, newTarget: dynamic) {
    actual open val sourceAnimation: dynamic
}

/**
 * Exposes the JavaScript [SVGSwitchElement](https://developer.mozilla.org/en/docs/Web/API/SVGSwitchElement) to Kotlin
 */
actual external abstract class SVGSwitchElement : SVGGraphicsElement {
    actual companion object {
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

actual external interface GetSVGDocument {
    actual fun getSVGDocument(): Document
}

/**
 * Exposes the JavaScript [SVGStyleElement](https://developer.mozilla.org/en/docs/Web/API/SVGStyleElement) to Kotlin
 */
actual external abstract class SVGStyleElement : SVGElement, LinkStyle {
    actual open var type: String
    actual open var media: String
    actual open var title: String

    actual companion object {
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
 * Exposes the JavaScript [SVGTransform](https://developer.mozilla.org/en/docs/Web/API/SVGTransform) to Kotlin
 */
actual external abstract class SVGTransform {
    actual open val type: Short
    actual open val matrix: DOMMatrix
    actual open val angle: Float
    actual fun setMatrix(matrix: DOMMatrixReadOnly)
    actual fun setTranslate(tx: Float, ty: Float)
    actual fun setScale(sx: Float, sy: Float)
    actual fun setRotate(angle: Float, cx: Float, cy: Float)
    actual fun setSkewX(angle: Float)
    actual fun setSkewY(angle: Float)

    actual companion object {
        actual val SVG_TRANSFORM_UNKNOWN: Short
        actual val SVG_TRANSFORM_MATRIX: Short
        actual val SVG_TRANSFORM_TRANSLATE: Short
        actual val SVG_TRANSFORM_SCALE: Short
        actual val SVG_TRANSFORM_ROTATE: Short
        actual val SVG_TRANSFORM_SKEWX: Short
        actual val SVG_TRANSFORM_SKEWY: Short
    }
}

/**
 * Exposes the JavaScript [SVGTransformList](https://developer.mozilla.org/en/docs/Web/API/SVGTransformList) to Kotlin
 */
actual external abstract class SVGTransformList {
    actual open val length: Int
    actual open val numberOfItems: Int
    actual fun clear()
    actual fun initialize(newItem: SVGTransform): SVGTransform
    actual fun insertItemBefore(newItem: SVGTransform, index: Int): SVGTransform
    actual fun replaceItem(newItem: SVGTransform, index: Int): SVGTransform
    actual fun removeItem(index: Int): SVGTransform
    actual fun appendItem(newItem: SVGTransform): SVGTransform
    actual fun createSVGTransformFromMatrix(matrix: DOMMatrixReadOnly): SVGTransform
    actual fun consolidate(): SVGTransform?
    actual fun getItem(index: Int): SVGTransform
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGTransformList.get(index: Int): SVGTransform? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGTransformList.set(index: Int, newItem: SVGTransform) { asDynamic()[index] = newItem }

/**
 * Exposes the JavaScript [SVGAnimatedTransformList](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedTransformList) to Kotlin
 */
actual external abstract class SVGAnimatedTransformList {
    actual open val baseVal: SVGTransformList
    actual open val animVal: SVGTransformList
}

/**
 * Exposes the JavaScript [SVGPreserveAspectRatio](https://developer.mozilla.org/en/docs/Web/API/SVGPreserveAspectRatio) to Kotlin
 */
actual external abstract class SVGPreserveAspectRatio {
    actual open var align: Short
    actual open var meetOrSlice: Short

    actual companion object {
        actual val SVG_PRESERVEASPECTRATIO_UNKNOWN: Short
        actual val SVG_PRESERVEASPECTRATIO_NONE: Short
        actual val SVG_PRESERVEASPECTRATIO_XMINYMIN: Short
        actual val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Short
        actual val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Short
        actual val SVG_PRESERVEASPECTRATIO_XMINYMID: Short
        actual val SVG_PRESERVEASPECTRATIO_XMIDYMID: Short
        actual val SVG_PRESERVEASPECTRATIO_XMAXYMID: Short
        actual val SVG_PRESERVEASPECTRATIO_XMINYMAX: Short
        actual val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Short
        actual val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Short
        actual val SVG_MEETORSLICE_UNKNOWN: Short
        actual val SVG_MEETORSLICE_MEET: Short
        actual val SVG_MEETORSLICE_SLICE: Short
    }
}

/**
 * Exposes the JavaScript [SVGAnimatedPreserveAspectRatio](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedPreserveAspectRatio) to Kotlin
 */
actual external abstract class SVGAnimatedPreserveAspectRatio {
    actual open val baseVal: SVGPreserveAspectRatio
    actual open val animVal: SVGPreserveAspectRatio
}

/**
 * Exposes the JavaScript [SVGPathElement](https://developer.mozilla.org/en/docs/Web/API/SVGPathElement) to Kotlin
 */
actual external abstract class SVGPathElement : SVGGeometryElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGRectElement](https://developer.mozilla.org/en/docs/Web/API/SVGRectElement) to Kotlin
 */
actual external abstract class SVGRectElement : SVGGeometryElement {
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength
    actual open val width: SVGAnimatedLength
    actual open val height: SVGAnimatedLength
    actual open val rx: SVGAnimatedLength
    actual open val ry: SVGAnimatedLength

    actual companion object {
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
 * Exposes the JavaScript [SVGCircleElement](https://developer.mozilla.org/en/docs/Web/API/SVGCircleElement) to Kotlin
 */
actual external abstract class SVGCircleElement : SVGGeometryElement {
    actual open val cx: SVGAnimatedLength
    actual open val cy: SVGAnimatedLength
    actual open val r: SVGAnimatedLength

    actual companion object {
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
 * Exposes the JavaScript [SVGEllipseElement](https://developer.mozilla.org/en/docs/Web/API/SVGEllipseElement) to Kotlin
 */
actual external abstract class SVGEllipseElement : SVGGeometryElement {
    actual open val cx: SVGAnimatedLength
    actual open val cy: SVGAnimatedLength
    actual open val rx: SVGAnimatedLength
    actual open val ry: SVGAnimatedLength

    actual companion object {
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
 * Exposes the JavaScript [SVGLineElement](https://developer.mozilla.org/en/docs/Web/API/SVGLineElement) to Kotlin
 */
actual external abstract class SVGLineElement : SVGGeometryElement {
    actual open val x1: SVGAnimatedLength
    actual open val y1: SVGAnimatedLength
    actual open val x2: SVGAnimatedLength
    actual open val y2: SVGAnimatedLength

    actual companion object {
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
 * Exposes the JavaScript [SVGMeshElement](https://developer.mozilla.org/en/docs/Web/API/SVGMeshElement) to Kotlin
 */
actual external abstract class SVGMeshElement : SVGGeometryElement, SVGURIReference {
    actual companion object {
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
 * Exposes the JavaScript [SVGAnimatedPoints](https://developer.mozilla.org/en/docs/Web/API/SVGAnimatedPoints) to Kotlin
 */
actual external interface SVGAnimatedPoints {
    actual val points: SVGPointList
    actual val animatedPoints: SVGPointList
}

actual external abstract class SVGPointList {
    actual open val length: Int
    actual open val numberOfItems: Int
    actual fun clear()
    actual fun initialize(newItem: DOMPoint): DOMPoint
    actual fun insertItemBefore(newItem: DOMPoint, index: Int): DOMPoint
    actual fun replaceItem(newItem: DOMPoint, index: Int): DOMPoint
    actual fun removeItem(index: Int): DOMPoint
    actual fun appendItem(newItem: DOMPoint): DOMPoint
    actual fun getItem(index: Int): DOMPoint
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGPointList.get(index: Int): DOMPoint? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SVGPointList.set(index: Int, newItem: DOMPoint) { asDynamic()[index] = newItem }

/**
 * Exposes the JavaScript [SVGPolylineElement](https://developer.mozilla.org/en/docs/Web/API/SVGPolylineElement) to Kotlin
 */
actual external abstract class SVGPolylineElement : SVGGeometryElement, SVGAnimatedPoints {
    actual companion object {
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
 * Exposes the JavaScript [SVGPolygonElement](https://developer.mozilla.org/en/docs/Web/API/SVGPolygonElement) to Kotlin
 */
actual external abstract class SVGPolygonElement : SVGGeometryElement, SVGAnimatedPoints {
    actual companion object {
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
 * Exposes the JavaScript [SVGTextContentElement](https://developer.mozilla.org/en/docs/Web/API/SVGTextContentElement) to Kotlin
 */
actual external abstract class SVGTextContentElement : SVGGraphicsElement {
    actual open val textLength: SVGAnimatedLength
    actual open val lengthAdjust: SVGAnimatedEnumeration
    actual fun getNumberOfChars(): Int
    actual fun getComputedTextLength(): Float
    actual fun getSubStringLength(charnum: Int, nchars: Int): Float
    actual fun getStartPositionOfChar(charnum: Int): DOMPoint
    actual fun getEndPositionOfChar(charnum: Int): DOMPoint
    actual fun getExtentOfChar(charnum: Int): DOMRect
    actual fun getRotationOfChar(charnum: Int): Float
    actual fun getCharNumAtPosition(point: DOMPoint): Int
    actual fun selectSubString(charnum: Int, nchars: Int)

    actual companion object {
        actual val LENGTHADJUST_UNKNOWN: Short
        actual val LENGTHADJUST_SPACING: Short
        actual val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * Exposes the JavaScript [SVGTextPositioningElement](https://developer.mozilla.org/en/docs/Web/API/SVGTextPositioningElement) to Kotlin
 */
actual external abstract class SVGTextPositioningElement : SVGTextContentElement {
    actual open val x: SVGAnimatedLengthList
    actual open val y: SVGAnimatedLengthList
    actual open val dx: SVGAnimatedLengthList
    actual open val dy: SVGAnimatedLengthList
    actual open val rotate: SVGAnimatedNumberList

    actual companion object {
        actual val LENGTHADJUST_UNKNOWN: Short
        actual val LENGTHADJUST_SPACING: Short
        actual val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * Exposes the JavaScript [SVGTextElement](https://developer.mozilla.org/en/docs/Web/API/SVGTextElement) to Kotlin
 */
actual external abstract class SVGTextElement : SVGTextPositioningElement {
    actual companion object {
        actual val LENGTHADJUST_UNKNOWN: Short
        actual val LENGTHADJUST_SPACING: Short
        actual val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * Exposes the JavaScript [SVGTSpanElement](https://developer.mozilla.org/en/docs/Web/API/SVGTSpanElement) to Kotlin
 */
actual external abstract class SVGTSpanElement : SVGTextPositioningElement {
    actual companion object {
        actual val LENGTHADJUST_UNKNOWN: Short
        actual val LENGTHADJUST_SPACING: Short
        actual val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * Exposes the JavaScript [SVGTextPathElement](https://developer.mozilla.org/en/docs/Web/API/SVGTextPathElement) to Kotlin
 */
actual external abstract class SVGTextPathElement : SVGTextContentElement, SVGURIReference {
    actual open val startOffset: SVGAnimatedLength
    actual open val method: SVGAnimatedEnumeration
    actual open val spacing: SVGAnimatedEnumeration

    actual companion object {
        actual val TEXTPATH_METHODTYPE_UNKNOWN: Short
        actual val TEXTPATH_METHODTYPE_ALIGN: Short
        actual val TEXTPATH_METHODTYPE_STRETCH: Short
        actual val TEXTPATH_SPACINGTYPE_UNKNOWN: Short
        actual val TEXTPATH_SPACINGTYPE_AUTO: Short
        actual val TEXTPATH_SPACINGTYPE_EXACT: Short
        actual val LENGTHADJUST_UNKNOWN: Short
        actual val LENGTHADJUST_SPACING: Short
        actual val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * Exposes the JavaScript [SVGImageElement](https://developer.mozilla.org/en/docs/Web/API/SVGImageElement) to Kotlin
 */
actual external abstract class SVGImageElement : SVGGraphicsElement, SVGURIReference, HTMLOrSVGImageElement {
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength
    actual open val width: SVGAnimatedLength
    actual open val height: SVGAnimatedLength
    actual open val preserveAspectRatio: SVGAnimatedPreserveAspectRatio
    actual open var crossOrigin: String?

    actual companion object {
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
 * Exposes the JavaScript [SVGForeignObjectElement](https://developer.mozilla.org/en/docs/Web/API/SVGForeignObjectElement) to Kotlin
 */
actual external abstract class SVGForeignObjectElement : SVGGraphicsElement {
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength
    actual open val width: SVGAnimatedLength
    actual open val height: SVGAnimatedLength

    actual companion object {
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

actual external abstract class SVGMarkerElement : SVGElement, SVGFitToViewBox {
    actual open val refX: SVGAnimatedLength
    actual open val refY: SVGAnimatedLength
    actual open val markerUnits: SVGAnimatedEnumeration
    actual open val markerWidth: SVGAnimatedLength
    actual open val markerHeight: SVGAnimatedLength
    actual open val orientType: SVGAnimatedEnumeration
    actual open val orientAngle: SVGAnimatedAngle
    actual open var orient: String
    actual fun setOrientToAuto()
    actual fun setOrientToAngle(angle: SVGAngle)

    actual companion object {
        actual val SVG_MARKERUNITS_UNKNOWN: Short
        actual val SVG_MARKERUNITS_USERSPACEONUSE: Short
        actual val SVG_MARKERUNITS_STROKEWIDTH: Short
        actual val SVG_MARKER_ORIENT_UNKNOWN: Short
        actual val SVG_MARKER_ORIENT_AUTO: Short
        actual val SVG_MARKER_ORIENT_ANGLE: Short
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
 * Exposes the JavaScript [SVGSolidcolorElement](https://developer.mozilla.org/en/docs/Web/API/SVGSolidcolorElement) to Kotlin
 */
actual external abstract class SVGSolidcolorElement : SVGElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGGradientElement](https://developer.mozilla.org/en/docs/Web/API/SVGGradientElement) to Kotlin
 */
actual external abstract class SVGGradientElement : SVGElement, SVGURIReference, SVGUnitTypes {
    actual open val gradientUnits: SVGAnimatedEnumeration
    actual open val gradientTransform: SVGAnimatedTransformList
    actual open val spreadMethod: SVGAnimatedEnumeration

    actual companion object {
        actual val SVG_SPREADMETHOD_UNKNOWN: Short
        actual val SVG_SPREADMETHOD_PAD: Short
        actual val SVG_SPREADMETHOD_REFLECT: Short
        actual val SVG_SPREADMETHOD_REPEAT: Short
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
 * Exposes the JavaScript [SVGLinearGradientElement](https://developer.mozilla.org/en/docs/Web/API/SVGLinearGradientElement) to Kotlin
 */
actual external abstract class SVGLinearGradientElement : SVGGradientElement {
    actual open val x1: SVGAnimatedLength
    actual open val y1: SVGAnimatedLength
    actual open val x2: SVGAnimatedLength
    actual open val y2: SVGAnimatedLength

    actual companion object {
        actual val SVG_SPREADMETHOD_UNKNOWN: Short
        actual val SVG_SPREADMETHOD_PAD: Short
        actual val SVG_SPREADMETHOD_REFLECT: Short
        actual val SVG_SPREADMETHOD_REPEAT: Short
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
 * Exposes the JavaScript [SVGRadialGradientElement](https://developer.mozilla.org/en/docs/Web/API/SVGRadialGradientElement) to Kotlin
 */
actual external abstract class SVGRadialGradientElement : SVGGradientElement {
    actual open val cx: SVGAnimatedLength
    actual open val cy: SVGAnimatedLength
    actual open val r: SVGAnimatedLength
    actual open val fx: SVGAnimatedLength
    actual open val fy: SVGAnimatedLength
    actual open val fr: SVGAnimatedLength

    actual companion object {
        actual val SVG_SPREADMETHOD_UNKNOWN: Short
        actual val SVG_SPREADMETHOD_PAD: Short
        actual val SVG_SPREADMETHOD_REFLECT: Short
        actual val SVG_SPREADMETHOD_REPEAT: Short
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

actual external abstract class SVGMeshGradientElement : SVGGradientElement {
    actual companion object {
        actual val SVG_SPREADMETHOD_UNKNOWN: Short
        actual val SVG_SPREADMETHOD_PAD: Short
        actual val SVG_SPREADMETHOD_REFLECT: Short
        actual val SVG_SPREADMETHOD_REPEAT: Short
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

actual external abstract class SVGMeshrowElement : SVGElement {
    actual companion object {
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

actual external abstract class SVGMeshpatchElement : SVGElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGStopElement](https://developer.mozilla.org/en/docs/Web/API/SVGStopElement) to Kotlin
 */
actual external abstract class SVGStopElement : SVGElement {
    actual open val offset: SVGAnimatedNumber

    actual companion object {
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
 * Exposes the JavaScript [SVGPatternElement](https://developer.mozilla.org/en/docs/Web/API/SVGPatternElement) to Kotlin
 */
actual external abstract class SVGPatternElement : SVGElement, SVGFitToViewBox, SVGURIReference, SVGUnitTypes {
    actual open val patternUnits: SVGAnimatedEnumeration
    actual open val patternContentUnits: SVGAnimatedEnumeration
    actual open val patternTransform: SVGAnimatedTransformList
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

actual external abstract class SVGHatchElement : SVGElement {
    actual companion object {
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

actual external abstract class SVGHatchpathElement : SVGElement {
    actual companion object {
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
 * Exposes the JavaScript [SVGCursorElement](https://developer.mozilla.org/en/docs/Web/API/SVGCursorElement) to Kotlin
 */
actual external abstract class SVGCursorElement : SVGElement, SVGURIReference {
    actual open val x: SVGAnimatedLength
    actual open val y: SVGAnimatedLength

    actual companion object {
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
 * Exposes the JavaScript [SVGScriptElement](https://developer.mozilla.org/en/docs/Web/API/SVGScriptElement) to Kotlin
 */
actual external abstract class SVGScriptElement : SVGElement, SVGURIReference, HTMLOrSVGScriptElement {
    actual open var type: String
    actual open var crossOrigin: String?

    actual companion object {
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
 * Exposes the JavaScript [SVGAElement](https://developer.mozilla.org/en/docs/Web/API/SVGAElement) to Kotlin
 */
actual external abstract class SVGAElement : SVGGraphicsElement, SVGURIReference {
    actual open val target: SVGAnimatedString
    actual open val download: SVGAnimatedString
    actual open val rel: SVGAnimatedString
    actual open val relList: SVGAnimatedString
    actual open val hreflang: SVGAnimatedString
    actual open val type: SVGAnimatedString

    actual companion object {
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
 * Exposes the JavaScript [SVGViewElement](https://developer.mozilla.org/en/docs/Web/API/SVGViewElement) to Kotlin
 */
actual external abstract class SVGViewElement : SVGElement, SVGFitToViewBox, SVGZoomAndPan {
    actual companion object {
        actual val SVG_ZOOMANDPAN_UNKNOWN: Short
        actual val SVG_ZOOMANDPAN_DISABLE: Short
        actual val SVG_ZOOMANDPAN_MAGNIFY: Short
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