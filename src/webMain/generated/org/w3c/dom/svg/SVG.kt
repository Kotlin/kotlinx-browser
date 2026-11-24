/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'SVG', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.svg

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.dom.css.*

/**
 * All of the SVG DOM interfaces that correspond directly to elements in the SVG language derive from the SVGElement
 * interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement)
 */
public abstract external class SVGElement : Element, ElementCSSInlineStyle, GlobalEventHandlers, HTMLOrSVGOrMathMLElement {
    /**
     * The ownerSVGElement read-only property of the SVGElement interface reflects the nearest ancestor &lt;svg&gt;
     * element. null if the given element is the outermost &lt;svg&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/ownerSVGElement)
     */
    public open val ownerSVGElement: SVGSVGElement?

    /**
     * The viewportElement read-only property of the SVGElement interface represents the SVGElement which established
     * the current viewport. Often the nearest ancestor &lt;svg&gt; element. null if the given element is the outermost
     * &lt;svg&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGElement/viewportElement)
     */
    public open val viewportElement: SVGElement?

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

public external interface SVGBoundingBoxOptions : JsAny {
    public var fill: Boolean?
    public var stroke: Boolean?
    public var markers: Boolean?
    public var clipped: Boolean?
}

public fun SVGBoundingBoxOptions(fill: Boolean? = null, stroke: Boolean? = null, markers: Boolean? = null, clipped: Boolean? = null): SVGBoundingBoxOptions = newJsObject<SVGBoundingBoxOptions>().apply {
    if (fill != null) this.fill = fill
    if (stroke != null) this.stroke = stroke
    if (markers != null) this.markers = markers
    if (clipped != null) this.clipped = clipped
}

/**
 * The SVGGraphicsElement interface represents SVG elements whose primary purpose is to directly render graphics into a
 * group.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement)
 */
public abstract external class SVGGraphicsElement : SVGElement, SVGTests {
    /**
     * The transform read-only property of the SVGGraphicsElement interface reflects the computed value of the transform
     * property and its corresponding transform attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/transform)
     */
    public open val transform: SVGAnimatedTransformList

    /**
     * The getBBox() method of the SVGGraphicsElement interface returns the smallest rectangle that contains the
     * element. The rectangle is measured in the user coordinate system of the element, with the geometry attributes of
     * the element and its descendants applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getBBox)
     */
    public open fun getBBox(options: SVGBoundingBoxOptions = definedExternally): DOMRect

    /**
     * The getCTM() method of the SVGGraphicsElement interface represents the matrix that transforms the current
     * element's coordinate system to its SVG viewport's coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getCTM)
     */
    public open fun getCTM(): DOMMatrix?

    /**
     * The getScreenCTM() method of the SVGGraphicsElement interface represents the matrix that transforms the current
     * element's coordinate system to the coordinate system of the SVG viewport for the SVG document fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/getScreenCTM)
     */
    public open fun getScreenCTM(): DOMMatrix?

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
 * The SVGGeometryElement interface represents SVG elements whose rendering is defined by geometry with an equivalent
 * path, and which can be filled and stroked. This includes paths and the basic shapes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement)
 */
public abstract external class SVGGeometryElement : SVGGraphicsElement {
    /**
     * The SVGGeometryElement.pathLength property reflects the pathLength attribute and returns the total length of the
     * path, in user units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/pathLength)
     */
    public open val pathLength: SVGAnimatedNumber

    /**
     * The isPointInFill() method of the SVGGeometryElement interface determines whether a given point is within the
     * fill shape of an element. The point argument is interpreted as a point in the local coordinate system of the
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInFill)
     */
    public open fun isPointInFill(point: DOMPointInit = definedExternally): Boolean

    /**
     * The isPointInStroke() method of the SVGGeometryElement interface determines whether a given point is within the
     * stroke shape of an element. The point argument is interpreted as a point in the local coordinate system of the
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/isPointInStroke)
     */
    public open fun isPointInStroke(point: DOMPointInit = definedExternally): Boolean

    /**
     * The SVGGeometryElement.getTotalLength() method returns the user agent's computed value for the total length of
     * the path in user units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getTotalLength)
     */
    public open fun getTotalLength(): Float

    /**
     * The SVGGeometryElement.getPointAtLength() method returns the point at a given distance along the path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGeometryElement/getPointAtLength)
     */
    public open fun getPointAtLength(distance: Float): DOMPoint

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
 * The SVGNumber interface corresponds to the &lt;number&gt; basic data type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumber)
 */
public abstract external class SVGNumber : JsAny {
    /**
     * The value property of the SVGNumber interface represents the number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumber/value)
     */
    public open var value: Float
}

/**
 * The SVGLength interface correspond to the &lt;length&gt; basic data type.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength)
 */
public abstract external class SVGLength : JsAny {
    /**
     * The unitType property of the SVGLength interface represents the type of the value as specified by one of the
     * SVG_LENGTHTYPE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/unitType)
     */
    public open val unitType: Short

    /**
     * The value property of the SVGLength interface represents the floating point value of the &lt;length&gt; in user
     * units.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/value)
     */
    public open var value: Float

    /**
     * The valueInSpecifiedUnits property of the SVGLength interface represents floating point value, in the units
     * expressed by unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/valueInSpecifiedUnits)
     */
    public open var valueInSpecifiedUnits: Float

    /**
     * The valueAsString property of the SVGLength interface represents the &lt;length&gt;'s value as a string, in the
     * units expressed by unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/valueAsString)
     */
    public open var valueAsString: String

    /**
     * The newValueSpecifiedUnits() method of the SVGLength interface resets the value as a number with an associated
     * unitType, thereby replacing the values for all of the attributes on the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/newValueSpecifiedUnits)
     */
    public open fun newValueSpecifiedUnits(unitType: Short, valueInSpecifiedUnits: Float)

    /**
     * The convertToSpecifiedUnits() method of the SVGLength interface allows you to convert the length's value to the
     * specified unit type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLength/convertToSpecifiedUnits)
     */
    public open fun convertToSpecifiedUnits(unitType: Short)

    public companion object {
        public val SVG_LENGTHTYPE_UNKNOWN: Short
        public val SVG_LENGTHTYPE_NUMBER: Short
        public val SVG_LENGTHTYPE_PERCENTAGE: Short
        public val SVG_LENGTHTYPE_EMS: Short
        public val SVG_LENGTHTYPE_EXS: Short
        public val SVG_LENGTHTYPE_PX: Short
        public val SVG_LENGTHTYPE_CM: Short
        public val SVG_LENGTHTYPE_MM: Short
        public val SVG_LENGTHTYPE_IN: Short
        public val SVG_LENGTHTYPE_PT: Short
        public val SVG_LENGTHTYPE_PC: Short
    }
}

/**
 * The SVGAngle interface is used to represent a value that can be an &lt;angle&gt; or &lt;number&gt; value.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle)
 */
public abstract external class SVGAngle : JsAny {
    /**
     * The unitType property of the SVGAngle interface is one of the unit type constants and represents the units in
     * which this angle's value is expressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/unitType)
     */
    public open val unitType: Short

    /**
     * The value property of the SVGAngle interface represents the floating point value of the &lt;angle&gt; in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/value)
     */
    public open var value: Float

    /**
     * The valueInSpecifiedUnits property of the SVGAngle interface represents the value of this angle as a number, in
     * the units expressed by the angle's unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/valueInSpecifiedUnits)
     */
    public open var valueInSpecifiedUnits: Float

    /**
     * The valueAsString property of the SVGAngle interface represents the angle's value as a string, in the units
     * expressed by unitType.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/valueAsString)
     */
    public open var valueAsString: String

    /**
     * The newValueSpecifiedUnits() method of the SVGAngle interface sets the value to a number with an associated
     * unitType, thereby replacing the values for all of the attributes on the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/newValueSpecifiedUnits)
     */
    public open fun newValueSpecifiedUnits(unitType: Short, valueInSpecifiedUnits: Float)

    /**
     * The convertToSpecifiedUnits() method of the SVGAngle interface allows you to convert the angle's value to the
     * specified unit type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAngle/convertToSpecifiedUnits)
     */
    public open fun convertToSpecifiedUnits(unitType: Short)

    public companion object {
        public val SVG_ANGLETYPE_UNKNOWN: Short
        public val SVG_ANGLETYPE_UNSPECIFIED: Short
        public val SVG_ANGLETYPE_DEG: Short
        public val SVG_ANGLETYPE_RAD: Short
        public val SVG_ANGLETYPE_GRAD: Short
    }
}

/**
 * The SVGNumberList interface defines a list of numbers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList)
 */
public abstract external class SVGNumberList : JsAny {
    /**
     * The length property of the SVGNumberList interface returns the number of items in the list. It is an alias of
     * numberOfItems to make SVG lists more array-like.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/length)
     */
    public open val length: Int

    /**
     * The numberOfItems property of the SVGNumberList interface returns the number of items in the list. length is an
     * alias of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/numberOfItems)
     */
    public open val numberOfItems: Int

    /**
     * The clear() method of the SVGNumberList interface clears all existing items from the list, with the result being
     * an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/clear)
     */
    public open fun clear()

    /**
     * The initialize() method of the SVGNumberList interface clears all existing items from the list and re-initializes
     * the list to hold the single item specified by the parameter. If the inserted item is already in a list, it is
     * removed from its previous list before it is inserted into this list. The inserted item is the item itself and not
     * a copy. The return value is the item inserted into the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/initialize)
     */
    public open fun initialize(newItem: SVGNumber): SVGNumber

    /**
     * The getItem() method of the SVGNumberList interface returns the specified item from the list. The returned item
     * is the item itself and not a copy. Any changes made to the item are immediately reflected in the list. The first
     * item is indexed 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/getItem)
     */
    public open fun getItem(index: Int): SVGNumber

    /**
     * The insertItemBefore() method of the SVGNumberList interface inserts a new item into the list at the specified
     * position. The first item is indexed 0. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/insertItemBefore)
     */
    public open fun insertItemBefore(newItem: SVGNumber, index: Int): SVGNumber

    /**
     * The replaceItem() method of the SVGNumberList interface replaces an existing item in the list with a new item. If
     * the new item is already in a list, it is removed from its previous list before it is inserted into this list. The
     * inserted item is the item itself and not a copy. If the item is already in this list, note that the index of the
     * item to replace is before the removal of the item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/replaceItem)
     */
    public open fun replaceItem(newItem: SVGNumber, index: Int): SVGNumber

    /**
     * The removeItem() method of the SVGNumberList interface removes an existing item at the given index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/removeItem)
     */
    public open fun removeItem(index: Int): SVGNumber

    /**
     * The appendItem() method of the SVGNumberList interface inserts a new item at the end of the list. If the given
     * item is already in a list, it is removed from its previous list before it is inserted into this list. The
     * inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/appendItem)
     */
    public open fun appendItem(newItem: SVGNumber): SVGNumber
}

public operator fun SVGNumberList.get(index: Int): SVGNumber? = getProperty(this, index)

public operator fun SVGNumberList.set(index: Int, newItem: SVGNumber) { setProperty(this, index, newItem) }

/**
 * The SVGLengthList interface defines a list of SVGLength objects. It is used for the baseVal and animVal properties of
 * SVGAnimatedLengthList.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList)
 */
public abstract external class SVGLengthList : JsAny {
    /**
     * The length property of the SVGLengthList interface returns the number of items in the list. It is an alias of
     * numberOfItems to make SVG lists more array-like.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/length)
     */
    public open val length: Int

    /**
     * The numberOfItems property of the SVGLengthList interface returns the number of items in the list. length is an
     * alias of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/numberOfItems)
     */
    public open val numberOfItems: Int

    /**
     * The clear() method of the SVGLengthList interface clears all existing items from the list, with the result being
     * an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/clear)
     */
    public open fun clear()

    /**
     * The initialize() method of the SVGLengthList interface clears all existing items from the list and re-initializes
     * the list to hold the single item specified by the parameter. If the inserted item is already in a list, it is
     * removed from its previous list before it is inserted into this list. The inserted item is the item itself and not
     * a copy. The return value is the item inserted into the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/initialize)
     */
    public open fun initialize(newItem: SVGLength): SVGLength

    /**
     * The getItem() method of the SVGLengthList interface returns the specified item from the list. The returned item
     * is the item itself and not a copy. Any changes made to the item are immediately reflected in the list. The first
     * item is indexed 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/getItem)
     */
    public open fun getItem(index: Int): SVGLength

    /**
     * The insertItemBefore() method of the SVGLengthList interface inserts a new item into the list at the specified
     * position. The first item is indexed 0. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/insertItemBefore)
     */
    public open fun insertItemBefore(newItem: SVGLength, index: Int): SVGLength

    /**
     * The replaceItem() method of the SVGLengthList interface replaces an existing item in the list with a new item. If
     * the new item is already in a list, it is removed from its previous list before it is inserted into this list. The
     * inserted item is the item itself and not a copy. If the item is already in this list, note that the index of the
     * item to replace is before the removal of the item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/replaceItem)
     */
    public open fun replaceItem(newItem: SVGLength, index: Int): SVGLength

    /**
     * The removeItem() method of the SVGLengthList interface removes an existing item at the given index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/removeItem)
     */
    public open fun removeItem(index: Int): SVGLength

    /**
     * The appendItem() method of the SVGLengthList interface inserts a new item at the end of the list. If the given
     * item is already in a list, it is removed from its previous list before it is inserted into this list. The
     * inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/appendItem)
     */
    public open fun appendItem(newItem: SVGLength): SVGLength
}

public operator fun SVGLengthList.get(index: Int): SVGLength? = getProperty(this, index)

public operator fun SVGLengthList.set(index: Int, newItem: SVGLength) { setProperty(this, index, newItem) }

/**
 * The SVGStringList interface defines a list of strings.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList)
 */
public abstract external class SVGStringList : JsAny {
    /**
     * The length property of the SVGStringList interface returns the number of items in the list. It is an alias of
     * numberOfItems to make SVG lists more array-like.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/length)
     */
    public open val length: Int

    /**
     * The numberOfItems property of the SVGStringList interface returns the number of items in the list. length is an
     * alias of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/numberOfItems)
     */
    public open val numberOfItems: Int

    /**
     * The clear() method of the SVGStringList interface clears all existing items from the list, with the result being
     * an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/clear)
     */
    public open fun clear()

    /**
     * The initialize() method of the SVGStringList interface clears all existing items from the list and re-initializes
     * the list to hold the single item specified by the parameter. If the inserted item is already in a list, it is
     * removed from its previous list before it is inserted into this list. The inserted item is the item itself and not
     * a copy. The return value is the item inserted into the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/initialize)
     */
    public open fun initialize(newItem: String): String

    /**
     * The getItem() method of the SVGStringList interface returns the specified item from the list. The returned item
     * is the item itself and not a copy. Any changes made to the item are immediately reflected in the list. The first
     * item is indexed 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/getItem)
     */
    public open fun getItem(index: Int): String

    /**
     * The insertItemBefore() method of the SVGStringList interface inserts a new item into the list at the specified
     * position. The first item is indexed 0. The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/insertItemBefore)
     */
    public open fun insertItemBefore(newItem: String, index: Int): String

    /**
     * The replaceItem() method of the SVGStringList interface replaces an existing item in the list with a new item.
     * The inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/replaceItem)
     */
    public open fun replaceItem(newItem: String, index: Int): String

    /**
     * The removeItem() method of the SVGStringList interface removes an existing item at the given index from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/removeItem)
     */
    public open fun removeItem(index: Int): String

    /**
     * The appendItem() method of the SVGStringList interface inserts a new item at the end of the list. If the given
     * item is already in a list, it is removed from its previous list before it is inserted into this list. The
     * inserted item is the item itself and not a copy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStringList/appendItem)
     */
    public open fun appendItem(newItem: String): String
}

public operator fun SVGStringList.get(index: Int): String? = getStringProperty(this, index)

public operator fun SVGStringList.set(index: Int, newItem: String) { setStringProperty(this, index, newItem) }

/**
 * The SVGAnimatedBoolean interface is used for attributes of type boolean which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedBoolean)
 */
public abstract external class SVGAnimatedBoolean : JsAny {
    /**
     * The baseVal property of the SVGAnimatedBoolean interface is the value of the associated animatable boolean SVG
     * attribute in its base (none-animated) state. It reflects the value of the associated animatable boolean attribute
     * when no animations are applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedBoolean/baseVal)
     */
    public open var baseVal: Boolean

    /**
     * The animVal read-only property of the SVGAnimatedBoolean interface represents the current animated value of the
     * associated animatable boolean SVG attribute. If the attribute is not animated, animVal is the same as
     * SVGAnimatedBoolean.baseVal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedBoolean/animVal)
     */
    public open val animVal: Boolean
}

/**
 * The SVGAnimatedEnumeration interface describes attribute values which are constants from a particular enumeration and
 * which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedEnumeration)
 */
public abstract external class SVGAnimatedEnumeration : JsAny {
    /**
     * The baseVal property of the SVGAnimatedEnumeration interface represents the value of an SVG enumeration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedEnumeration/baseVal)
     */
    public open var baseVal: Short

    /**
     * The animVal read-only property of the SVGAnimatedEnumeration interface represents the value of an SVG
     * enumeration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedEnumeration/animVal)
     */
    public open val animVal: Short
}

/**
 * The SVGAnimatedInteger interface is used for attributes of basic type &lt;integer&gt; which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedInteger)
 */
public abstract external class SVGAnimatedInteger : JsAny {
    /**
     * The baseVal property of the SVGAnimatedInteger interface represents the base (non-animated) value of an
     * animatable &lt;integer&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedInteger/baseVal)
     */
    public open var baseVal: Int

    /**
     * The animVal property of the SVGAnimatedInteger interface represents the animated value of an &lt;integer&gt;. If
     * no animation is applied, animVal equals baseVal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedInteger/animVal)
     */
    public open val animVal: Int
}

/**
 * The SVGAnimatedNumber interface represents attributes of type &lt;number&gt; which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumber)
 */
public abstract external class SVGAnimatedNumber : JsAny {
    /**
     * The baseVal property of the SVGAnimatedNumber interface represents the base (non-animated) value of an animatable
     * numeric attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumber/baseVal)
     */
    public open var baseVal: Float

    /**
     * The animVal read-only property of the SVGAnimatedNumber interface represents the animated value of an SVG
     * element's numeric attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumber/animVal)
     */
    public open val animVal: Float
}

/**
 * The SVGAnimatedLength interface represents attributes of type &lt;length&gt; which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLength)
 */
public abstract external class SVGAnimatedLength : JsAny {
    /**
     * The baseVal property of the SVGAnimatedLength interface contains the initial value of an SVG enumeration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLength/baseVal)
     */
    public open val baseVal: SVGLength

    /**
     * The animVal property of the SVGAnimatedLength interface contains the current value of an SVG enumeration. If
     * there is no animation, it is the same value as the baseVal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLength/animVal)
     */
    public open val animVal: SVGLength
}

/**
 * The SVGAnimatedAngle interface is used for attributes of basic type &lt;angle&gt; which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedAngle)
 */
public abstract external class SVGAnimatedAngle : JsAny {
    /**
     * The baseVal read-only property of the SVGAnimatedAngle interface represents the base (non-animated) value of the
     * associated &lt;angle&gt; on an SVG element. This property is used to retrieve the static value of the
     * &lt;angle&gt;, unaffected by any ongoing animations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedAngle/baseVal)
     */
    public open val baseVal: SVGAngle

    /**
     * The animVal read-only property of the SVGAnimatedAngle interface represents the current animated value of the
     * associated &lt;angle&gt; on an SVG element. If the attribute is not currently being animated, animVal will be the
     * same as the baseVal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedAngle/animVal)
     */
    public open val animVal: SVGAngle
}

/**
 * The SVGAnimatedString interface represents string attributes which can be animated from each SVG declaration. You
 * need to create SVG attribute before doing anything else, everything should be declared inside this.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedString)
 */
public abstract external class SVGAnimatedString : JsAny {
    /**
     * The baseVal property of the SVGAnimatedString interface gets or sets the base value of the given attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedString/baseVal)
     */
    public open var baseVal: String

    /**
     * The animVal read-only property of the SVGAnimatedString interface is a string representing the animated value of
     * the reflected attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedString/animVal)
     */
    public open val animVal: String
}

/**
 * The SVGAnimatedRect interface represents an SVGRect attribute that can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect)
 */
public abstract external class SVGAnimatedRect : JsAny {
    /**
     * The baseVal read-only property of the SVGAnimatedRect interface represents the current non-animated value of the
     * viewBox attribute of an SVG element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect/baseVal)
     */
    public open val baseVal: DOMRect

    /**
     * The animVal read-only property of the SVGAnimatedRect interface represents the current animated value of the
     * viewBox attribute of an SVG element as a read-only DOMRectReadOnly object. It provides access to the rectangle's
     * dynamic state, including the x, y, width, and height values during the animation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedRect/animVal)
     */
    public open val animVal: DOMRect
}

/**
 * The SVGAnimatedNumberList interface represents a list of attributes of type &lt;number&gt; which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumberList)
 */
public abstract external class SVGAnimatedNumberList : JsAny {
    /**
     * The baseVal read-only property of the SVGAnimatedNumberList interface represents the base (non-animated) value of
     * an animatable attribute that accepts a list of &lt;number&gt; values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumberList/baseVal)
     */
    public open val baseVal: SVGNumberList

    /**
     * The animVal read-only property of the SVGAnimatedNumberList interface represents the current animated value of an
     * animatable attribute that accepts a list of &lt;number&gt; values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedNumberList/animVal)
     */
    public open val animVal: SVGNumberList
}

/**
 * The SVGAnimatedLengthList interface is used for attributes of type SVGLengthList which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLengthList)
 */
public abstract external class SVGAnimatedLengthList : JsAny {
    /**
     * The baseVal read-only property of the SVGAnimatedLengthList interface represents the base (non-animated) value of
     * an animatable attribute that accepts a list of &lt;length&gt;, &lt;percentage&gt;, or &lt;number&gt; values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLengthList/baseVal)
     */
    public open val baseVal: SVGLengthList

    /**
     * The animVal read-only property of the SVGAnimatedLengthList interface represents the animated value of an
     * attribute that accepts a list of &lt;length&gt;, &lt;percentage&gt;, or &lt;number&gt; values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedLengthList/animVal)
     */
    public open val animVal: SVGLengthList
}

/**
 * The SVGUnitTypes interface defines a commonly used set of constants used for reflecting gradientUnits,
 * patternContentUnits and other similar attributes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUnitTypes)
 */
public abstract external class SVGUnitTypes : JsAny {

    public companion object {
        public val SVG_UNIT_TYPE_UNKNOWN: Short
        public val SVG_UNIT_TYPE_USERSPACEONUSE: Short
        public val SVG_UNIT_TYPE_OBJECTBOUNDINGBOX: Short
    }
}

public external interface SVGTests : JsAny {
    /**
     * The requiredExtensions read-only property of the SVGGraphicsElement interface reflects the requiredExtensions
     * attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/requiredExtensions)
     */
    public val requiredExtensions: SVGStringList

    /**
     * The systemLanguage read-only property of the SVGGraphicsElement interface reflects the systemLanguage attribute
     * of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGraphicsElement/systemLanguage)
     */
    public val systemLanguage: SVGStringList
}

public external interface SVGFitToViewBox : JsAny {
    /**
     * The viewBox read-only property of the SVGSVGElement interface reflects the &lt;svg&gt; element's viewBox
     * attribute as an SVGAnimatedRect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/viewBox)
     */
    public val viewBox: SVGAnimatedRect

    /**
     * The preserveAspectRatio read-only property of the SVGSVGElement interface reflects the preserveAspectRatio
     * attribute of the given element. It defines how the SVG element's content should be scaled to fit the given space,
     * preserving its aspect ratio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/preserveAspectRatio)
     */
    public val preserveAspectRatio: SVGAnimatedPreserveAspectRatio
}

public external interface SVGURIReference : JsAny {
    /**
     * The href read-only property of the SVGUseElement interface reflects the href or xlink:href attribute of the given
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUseElement/href)
     */
    public val href: SVGAnimatedString
}

/**
 * The SVGSVGElement interface provides access to the properties of &lt;svg&gt; elements, as well as methods to
 * manipulate them. This interface contains also various miscellaneous commonly-used utility methods, such as matrix
 * operations and the ability to control the time of redraw on visual rendering devices.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement)
 */
public abstract external class SVGSVGElement : SVGGraphicsElement, SVGFitToViewBox, WindowEventHandlers {
    /**
     * The x read-only property of the SVGSVGElement interface describes the horizontal coordinate of the position of
     * that SVG as an SVGAnimatedLength. When an &lt;svg&gt; is nested within another &lt;svg&gt;, the horizontal
     * coordinate is a length in the user coordinate system that is the given distance from the origin of the user
     * coordinate system along the x-axis. Its syntax is the same as that for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/x)
     */
    public open val x: SVGAnimatedLength

    /**
     * The y read-only property of the SVGSVGElement interface describes the vertical coordinate of the position of that
     * SVG as an SVGAnimatedLength. When an &lt;svg&gt; is nested within another &lt;svg&gt;, the vertical coordinate is
     * a length in the user coordinate system that is the given distance from the origin of the user coordinate system
     * along the y-axis. Its syntax is the same as that for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/y)
     */
    public open val y: SVGAnimatedLength

    /**
     * The width read-only property of the SVGSVGElement interface describes the horizontal size of element as an
     * SVGAnimatedLength. It reflects the &lt;svg&gt; element's width attribute, which may not be the SVG's rendered
     * width.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/width)
     */
    public open val width: SVGAnimatedLength

    /**
     * The height read-only property of the SVGSVGElement interface describes the vertical size of element as an
     * SVGAnimatedLength. It reflects the &lt;svg&gt; element's height attribute, which may not be the SVG's rendered
     * height.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/height)
     */
    public open val height: SVGAnimatedLength

    /**
     * The currentScale property of the SVGSVGElement interface reflects the current scale factor relative to the
     * initial view to take into account user magnification and panning operations on the outermost &lt;svg&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/currentScale)
     */
    public open var currentScale: Float

    /**
     * The currentTranslate read-only property of the SVGSVGElement interface reflects the translation factor that takes
     * into account user "magnification" corresponding to an outermost &lt;svg&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/currentTranslate)
     */
    public open val currentTranslate: DOMPoint
    public open fun getIntersectionList(rect: DOMRect, referenceElement: SVGElement?): NodeList
    public open fun getEnclosureList(rect: DOMRect, referenceElement: SVGElement?): NodeList

    /**
     * The checkIntersection() method of the SVGSVGElement interface checks if the rendered content of the given element
     * intersects the supplied rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/checkIntersection)
     */
    public open fun checkIntersection(element: SVGElement, rect: DOMRect): Boolean

    /**
     * The checkEnclosure() method of the SVGSVGElement interface checks if the rendered content of the given element is
     * entirely contained within the supplied rectangle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/checkEnclosure)
     */
    public open fun checkEnclosure(element: SVGElement, rect: DOMRect): Boolean

    /**
     * The deselectAll() method of the SVGSVGElement interface unselects any selected objects, including any selections
     * of text strings and type-in bars.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/deselectAll)
     */
    public open fun deselectAll()

    /**
     * The createSVGNumber() method of the SVGSVGElement interface creates an SVGNumber object outside of any document
     * trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGNumber)
     */
    public open fun createSVGNumber(): SVGNumber

    /**
     * The createSVGLength() method of the SVGSVGElement interface creates an SVGLength object outside of any document
     * trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGLength)
     */
    public open fun createSVGLength(): SVGLength

    /**
     * The createSVGAngle() method of the SVGSVGElement interface creates an SVGAngle object outside of any document
     * trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGAngle)
     */
    public open fun createSVGAngle(): SVGAngle

    /**
     * The createSVGPoint() method of the SVGSVGElement interface creates a DOMPoint object outside of any document
     * trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGPoint)
     */
    public open fun createSVGPoint(): DOMPoint

    /**
     * The createSVGMatrix() method of the SVGSVGElement interface creates a DOMMatrix object outside of any document
     * trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGMatrix)
     */
    public open fun createSVGMatrix(): DOMMatrix

    /**
     * The createSVGRect() method of the SVGSVGElement interface creates a DOMRect object outside of any document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGRect)
     */
    public open fun createSVGRect(): DOMRect

    /**
     * The createSVGTransform() method of the SVGSVGElement interface creates an SVGTransform object outside of any
     * document trees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGTransform)
     */
    public open fun createSVGTransform(): SVGTransform

    /**
     * The createSVGTransformFromMatrix() method of the SVGSVGElement interface creates an SVGTransform object outside
     * of any document trees, based on the given DOMMatrix object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/createSVGTransformFromMatrix)
     */
    public open fun createSVGTransformFromMatrix(matrix: DOMMatrix2DInit = definedExternally): SVGTransform

    /**
     * The getElementById() method of the SVGSVGElement interface searches the SVG document fragment (i.e., the search
     * is restricted to a subset of the document tree) for an Element whose id property matches the specified string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSVGElement/getElementById)
     */
    public open fun getElementById(elementId: String): Element?
    public open fun suspendRedraw(maxWaitMilliseconds: Int): Int
    public open fun unsuspendRedraw(suspendHandleID: Int)
    public open fun unsuspendRedrawAll()
    public open fun forceRedraw()

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
 * The SVGGElement interface corresponds to the &lt;g&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGElement)
 */
public abstract external class SVGGElement : SVGGraphicsElement {

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
 * The SVGDefsElement interface corresponds to the &lt;defs&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGDefsElement)
 */
public abstract external class SVGDefsElement : SVGGraphicsElement {

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
 * The SVGDescElement interface corresponds to the &lt;desc&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGDescElement)
 */
public abstract external class SVGDescElement : SVGElement {

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
 * The SVGMetadataElement interface corresponds to the &lt;metadata&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMetadataElement)
 */
public abstract external class SVGMetadataElement : SVGElement {

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
 * The SVGTitleElement interface corresponds to the &lt;title&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTitleElement)
 */
public abstract external class SVGTitleElement : SVGElement {

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
 * The SVGSymbolElement interface corresponds to the &lt;symbol&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSymbolElement)
 */
public abstract external class SVGSymbolElement : SVGGraphicsElement, SVGFitToViewBox {

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
 * The SVGUseElement interface corresponds to the &lt;use&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUseElement)
 */
public abstract external class SVGUseElement : SVGGraphicsElement, SVGURIReference {
    /**
     * The x read-only property of the SVGUseElement interface describes the x-axis coordinate of the start point of the
     * referenced element as an SVGAnimatedLength. It reflects the computed value of the x attribute on the &lt;use&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUseElement/x)
     */
    public open val x: SVGAnimatedLength

    /**
     * The y read-only property of the SVGUseElement interface describes the y-axis coordinate of the start point of the
     * referenced element as an SVGAnimatedLength. It reflects the computed value of the y attribute on the &lt;use&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUseElement/y)
     */
    public open val y: SVGAnimatedLength

    /**
     * The width read-only property of the SVGUseElement interface describes the width of the referenced element as an
     * SVGAnimatedLength. It reflects the computed value of the width attribute on the &lt;use&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUseElement/width)
     */
    public open val width: SVGAnimatedLength

    /**
     * The height read-only property of the SVGUseElement interface describes the height of the referenced element as an
     * SVGAnimatedLength. It reflects the computed value of the height attribute on the &lt;use&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGUseElement/height)
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

/**
 * The SVGSwitchElement interface corresponds to the &lt;switch&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGSwitchElement)
 */
public abstract external class SVGSwitchElement : SVGGraphicsElement {

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

public external interface GetSVGDocument : JsAny {
    public fun getSVGDocument(): Document
}

/**
 * The SVGStyleElement interface corresponds to the SVG &lt;style&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement)
 */
public abstract external class SVGStyleElement : SVGElement, LinkStyle {
    /**
     * The SVGStyleElement.type property returns the type of the current style. The value reflects the associated SVG
     * &lt;style&gt; element's type attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/type)
     */
    public open var type: String

    /**
     * The SVGStyleElement.media property is a media query string corresponding to the media attribute of the given SVG
     * style element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/media)
     */
    public open var media: String

    /**
     * The SVGStyleElement.title property is a string corresponding to the title attribute of the given SVG style
     * element. It may be used to select between alternate style sheets.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/title)
     */
    public open var title: String

    /**
     * The SVGStyleElement.disabled property can be used to get and set whether the stylesheet is disabled (true) or not
     * (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStyleElement/disabled)
     */
    public open var disabled: Boolean

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
 * The SVGTransform interface reflects one of the component transformations within an SVGTransformList; thus, an
 * SVGTransform object corresponds to a single component (e.g., scale(…) or matrix(…)) within a transform attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform)
 */
public abstract external class SVGTransform : JsAny {
    /**
     * The type read-only property of the SVGTransform interface represents the type of transformation applied,
     * specified by one of the SVG_TRANSFORM_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/type)
     */
    public open val type: Short

    /**
     * The matrix read-only property of the SVGTransform interface represents the transformation matrix that corresponds
     * to the transformation type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/matrix)
     */
    public open val matrix: DOMMatrix

    /**
     * The angle read-only property of the SVGTransform interface represents the angle of the transformation in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/angle)
     */
    public open val angle: Float

    /**
     * The setMatrix() method of the SVGTransform interface sets the transform type to SVG_TRANSFORM_MATRIX, with
     * parameter matrix defining the new transformation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setMatrix)
     */
    public open fun setMatrix(matrix: DOMMatrix2DInit = definedExternally)

    /**
     * The setTranslate() method of the SVGTransform interface sets the transform type to SVG_TRANSFORM_TRANSLATE, with
     * parameters tx and ty defining the translation amounts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setTranslate)
     */
    public open fun setTranslate(tx: Float, ty: Float)

    /**
     * The setScale() method of the SVGTransform interface sets the transform type to SVG_TRANSFORM_SCALE, with
     * parameters sx and sy defining the scale amounts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setScale)
     */
    public open fun setScale(sx: Float, sy: Float)

    /**
     * The setRotate() method of the SVGTransform interface sets the transform type to SVG_TRANSFORM_ROTATE, with
     * parameter angle defining the rotation angle and parameters cx and cy defining the optional center of rotation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setRotate)
     */
    public open fun setRotate(angle: Float, cx: Float, cy: Float)

    /**
     * The setSkewX() method of the SVGTransform interface sets the transform type to SVG_TRANSFORM_SKEWX, with
     * parameter angle defining the amount of skew along the X-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setSkewX)
     */
    public open fun setSkewX(angle: Float)

    /**
     * The setSkewY() method of the SVGTransform interface sets the transform type to SVG_TRANSFORM_SKEWY, with
     * parameter angle defining the amount of skew along the Y-axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransform/setSkewY)
     */
    public open fun setSkewY(angle: Float)

    public companion object {
        public val SVG_TRANSFORM_UNKNOWN: Short
        public val SVG_TRANSFORM_MATRIX: Short
        public val SVG_TRANSFORM_TRANSLATE: Short
        public val SVG_TRANSFORM_SCALE: Short
        public val SVG_TRANSFORM_ROTATE: Short
        public val SVG_TRANSFORM_SKEWX: Short
        public val SVG_TRANSFORM_SKEWY: Short
    }
}

/**
 * The SVGTransformList interface defines a list of SVGTransform objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList)
 */
public abstract external class SVGTransformList : JsAny {
    /**
     * The length read-only property of the SVGTransformList interface represents the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/length)
     */
    public open val length: Int

    /**
     * The numberOfItems read-only property of the SVGTransformList interface represents the number of items in the
     * list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/numberOfItems)
     */
    public open val numberOfItems: Int

    /**
     * The clear() method of the SVGTransformList interface clears all existing current items from the list, with the
     * result being an empty list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/clear)
     */
    public open fun clear()

    /**
     * The initialize() method of the SVGTransformList interface clears all existing current items from the list and
     * re-initializes the list to hold the single item specified by the parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/initialize)
     */
    public open fun initialize(newItem: SVGTransform): SVGTransform

    /**
     * The getItem() method of the SVGTransformList interface returns the specified item from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/getItem)
     */
    public open fun getItem(index: Int): SVGTransform

    /**
     * The insertItemBefore() method of the SVGTransformList interface inserts a new item into the list at the specified
     * position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/insertItemBefore)
     */
    public open fun insertItemBefore(newItem: SVGTransform, index: Int): SVGTransform

    /**
     * The replaceItem() method of the SVGTransformList interface replaces an existing item in the list with a new item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/replaceItem)
     */
    public open fun replaceItem(newItem: SVGTransform, index: Int): SVGTransform

    /**
     * The removeItem() method of the SVGTransformList interface removes an existing item from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/removeItem)
     */
    public open fun removeItem(index: Int): SVGTransform

    /**
     * The appendItem() method of the SVGTransformList interface inserts a new item at the end of the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/appendItem)
     */
    public open fun appendItem(newItem: SVGTransform): SVGTransform

    /**
     * The createSVGTransformFromMatrix() method of the SVGTransformList interface creates an SVGTransform object which
     * is initialized to a transform of type SVG_TRANSFORM_MATRIX and whose values are the given matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/createSVGTransformFromMatrix)
     */
    public open fun createSVGTransformFromMatrix(matrix: DOMMatrix2DInit = definedExternally): SVGTransform

    /**
     * The consolidate() method of the SVGTransformList interface consolidates the list of separate SVGTransform objects
     * by multiplying the equivalent transformation matrices together to result in a list consisting of a single
     * SVGTransform object of type SVG_TRANSFORM_MATRIX.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/consolidate)
     */
    public open fun consolidate(): SVGTransform?
}

public operator fun SVGTransformList.get(index: Int): SVGTransform? = getProperty(this, index)

public operator fun SVGTransformList.set(index: Int, newItem: SVGTransform) { setProperty(this, index, newItem) }

/**
 * The SVGAnimatedTransformList interface represents attributes which take a list of numbers and which can be animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedTransformList)
 */
public abstract external class SVGAnimatedTransformList : JsAny {
    /**
     * The baseVal read-only property of the SVGAnimatedTransformList interface represents the non-animated value of the
     * transform attribute of an SVG element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedTransformList/baseVal)
     */
    public open val baseVal: SVGTransformList

    /**
     * The animVal read-only property of the SVGAnimatedTransformList interface represents the animated value of the
     * transform attribute of an SVG element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedTransformList/animVal)
     */
    public open val animVal: SVGTransformList
}

/**
 * The SVGPreserveAspectRatio interface corresponds to the preserveAspectRatio attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio)
 */
public abstract external class SVGPreserveAspectRatio : JsAny {
    /**
     * The align property of the SVGPreserveAspectRatio interface reflects the type of the alignment value as specified
     * by one of the SVG_PRESERVEASPECTRATIO_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio/align)
     */
    public open var align: Short

    /**
     * The meetOrSlice property of the SVGPreserveAspectRatio interface reflects the type of the meet-or-slice value as
     * specified by one of the SVG_MEETORSLICE_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPreserveAspectRatio/meetOrSlice)
     */
    public open var meetOrSlice: Short

    public companion object {
        public val SVG_PRESERVEASPECTRATIO_UNKNOWN: Short
        public val SVG_PRESERVEASPECTRATIO_NONE: Short
        public val SVG_PRESERVEASPECTRATIO_XMINYMIN: Short
        public val SVG_PRESERVEASPECTRATIO_XMIDYMIN: Short
        public val SVG_PRESERVEASPECTRATIO_XMAXYMIN: Short
        public val SVG_PRESERVEASPECTRATIO_XMINYMID: Short
        public val SVG_PRESERVEASPECTRATIO_XMIDYMID: Short
        public val SVG_PRESERVEASPECTRATIO_XMAXYMID: Short
        public val SVG_PRESERVEASPECTRATIO_XMINYMAX: Short
        public val SVG_PRESERVEASPECTRATIO_XMIDYMAX: Short
        public val SVG_PRESERVEASPECTRATIO_XMAXYMAX: Short
        public val SVG_MEETORSLICE_UNKNOWN: Short
        public val SVG_MEETORSLICE_MEET: Short
        public val SVG_MEETORSLICE_SLICE: Short
    }
}

/**
 * The SVGAnimatedPreserveAspectRatio interface represents attributes of type SVGPreserveAspectRatio which can be
 * animated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedPreserveAspectRatio)
 */
public abstract external class SVGAnimatedPreserveAspectRatio : JsAny {
    /**
     * The baseVal read-only property of the SVGAnimatedPreserveAspectRatio interface represents the base (non-animated)
     * value of the preserveAspectRatio attribute of an SVG element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedPreserveAspectRatio/baseVal)
     */
    public open val baseVal: SVGPreserveAspectRatio

    /**
     * The animVal read-only property of the SVGAnimatedPreserveAspectRatio interface represents the value of the
     * preserveAspectRatio attribute of an SVG element after any animations or transformations are applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedPreserveAspectRatio/animVal)
     */
    public open val animVal: SVGPreserveAspectRatio
}

/**
 * The SVGRectElement interface provides access to the properties of &lt;rect&gt; elements, as well as methods to
 * manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement)
 */
public abstract external class SVGRectElement : SVGGeometryElement {
    /**
     * The x read-only property of the SVGRectElement interface describes the horizontal coordinate of the position of
     * an SVG rectangle as a SVGAnimatedLength. The &lt;coordinate&gt; is a length in the user coordinate system that is
     * the given distance from the origin of the user coordinate system along the x-axis. Its syntax is the same as that
     * for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement/x)
     */
    public open val x: SVGAnimatedLength

    /**
     * The y read-only property of the SVGRectElement interface describes the vertical coordinate of the position of an
     * SVG rectangle as a SVGAnimatedLength. The &lt;coordinate&gt; is a length in the user coordinate system that is
     * the given distance from the origin of the user coordinate system along the y-axis. Its syntax is the same as that
     * for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement/y)
     */
    public open val y: SVGAnimatedLength

    /**
     * The width read-only property of the SVGRectElement interface describes the horizontal size of an SVG rectangle as
     * a SVGAnimatedLength. The length is in user coordinate system units along the x-axis. Its syntax is the same as
     * that for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement/width)
     */
    public open val width: SVGAnimatedLength

    /**
     * The height read-only property of the SVGRectElement interface describes the vertical size of an SVG rectangle as
     * a SVGAnimatedLength. The length is in user coordinate system units along the y-axis. Its syntax is the same as
     * that for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement/height)
     */
    public open val height: SVGAnimatedLength

    /**
     * The rx read-only property of the SVGRectElement interface describes the horizontal curve of the corners of an SVG
     * rectangle as a SVGAnimatedLength. The length is in user coordinate system units along the x-axis. Its syntax is
     * the same as that for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement/rx)
     */
    public open val rx: SVGAnimatedLength

    /**
     * The ry read-only property of the SVGRectElement interface describes the vertical curve of the corners of an SVG
     * rectangle as a SVGAnimatedLength. The length is in user coordinate system units along the y-axis. Its syntax is
     * the same as that for &lt;length&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRectElement/ry)
     */
    public open val ry: SVGAnimatedLength

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
 * The SVGCircleElement interface is an interface for the &lt;circle&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement)
 */
public abstract external class SVGCircleElement : SVGGeometryElement {
    /**
     * The cx read-only property of the SVGCircleElement interface reflects the cx attribute of a &lt;circle&gt; element
     * and by that defines the x-coordinate of the circle's center.&lt;
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement/cx)
     */
    public open val cx: SVGAnimatedLength

    /**
     * The cy read-only property of the SVGCircleElement interface reflects the cy attribute of a &lt;circle&gt; element
     * and by that defines the y-coordinate of the circle's center.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement/cy)
     */
    public open val cy: SVGAnimatedLength

    /**
     * The r read-only property of the SVGCircleElement interface reflects the r attribute of a &lt;circle&gt; element
     * and by that defines the radius of the circle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGCircleElement/r)
     */
    public open val r: SVGAnimatedLength

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
 * The SVGEllipseElement interface provides access to the properties of &lt;ellipse&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGEllipseElement)
 */
public abstract external class SVGEllipseElement : SVGGeometryElement {
    /**
     * The cx read-only property of the SVGEllipseElement interface describes the x-axis coordinate of the center of the
     * ellipse as an SVGAnimatedLength. It reflects the computed value of the cx attribute on the &lt;ellipse&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGEllipseElement/cx)
     */
    public open val cx: SVGAnimatedLength

    /**
     * The cy read-only property of the SVGEllipseElement interface describes the y-axis coordinate of the center of the
     * ellipse as an SVGAnimatedLength. It reflects the computed value of the cy attribute on the &lt;ellipse&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGEllipseElement/cy)
     */
    public open val cy: SVGAnimatedLength

    /**
     * The rx read-only property of the SVGEllipseElement interface describes the x-axis radius of the ellipse as an
     * SVGAnimatedLength. It reflects the computed value of the rx attribute on the &lt;ellipse&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGEllipseElement/rx)
     */
    public open val rx: SVGAnimatedLength

    /**
     * The ry read-only property of the SVGEllipseElement interface describes the y-axis radius of the ellipse as an
     * SVGAnimatedLength. It reflects the computed value of the ry attribute on the &lt;ellipse&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGEllipseElement/ry)
     */
    public open val ry: SVGAnimatedLength

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
 * The SVGLineElement interface provides access to the properties of &lt;line&gt; elements, as well as methods to
 * manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLineElement)
 */
public abstract external class SVGLineElement : SVGGeometryElement {
    /**
     * The x1 read-only property of the SVGLineElement interface describes the start of the SVG line along the x-axis as
     * an SVGAnimatedLength. It reflects the &lt;line&gt; element's x1 geometric attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLineElement/x1)
     */
    public open val x1: SVGAnimatedLength

    /**
     * The y1 read-only property of the SVGLineElement interface describes the start of the SVG line along the y-axis as
     * an SVGAnimatedLength. It reflects the &lt;line&gt; element's y1 geometric attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLineElement/y1)
     */
    public open val y1: SVGAnimatedLength

    /**
     * The x2 read-only property of the SVGLineElement interface describes the x-axis coordinate value of the end of a
     * line as an SVGAnimatedLength. It reflects the &lt;line&gt; element's x2 geometric attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLineElement/x2)
     */
    public open val x2: SVGAnimatedLength

    /**
     * The y2 read-only property of the SVGLineElement interface describes the v-axis coordinate value of the end of a
     * line as an SVGAnimatedLength. It reflects the &lt;line&gt; element's y2 geometric attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLineElement/y2)
     */
    public open val y2: SVGAnimatedLength

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

public external interface SVGAnimatedPoints : JsAny {
    /**
     * The points read-only property of the SVGPolylineElement interface reflects the base (i.e., static) value of the
     * element's points attribute. Modifications via the SVGPointList object are reflected in the points attribute, and
     * vice versa.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPolylineElement/points)
     */
    public val points: SVGPointList

    /**
     * The animatedPoints read-only property of the SVGPolylineElement interface reflects the animated value of the
     * element's points attribute. If the points attribute is not being animated, it contains the same value as the
     * points property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPolylineElement/animatedPoints)
     */
    public val animatedPoints: SVGPointList
}

/**
 * The SVGPointList interface represents a list of DOMPoint objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList)
 */
public abstract external class SVGPointList : JsAny {
    /**
     * The length read-only property of the SVGPointList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/length)
     */
    public open val length: Int

    /**
     * The numberOfItems read-only property of the SVGPointList interface returns the number of items in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/numberOfItems)
     */
    public open val numberOfItems: Int

    /**
     * The clear() method of the SVGPointList interface removes all items from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/clear)
     */
    public open fun clear()

    /**
     * The initialize() method of the SVGPointList interface clears the list then adds a single new DOMPoint object to
     * the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/initialize)
     */
    public open fun initialize(newItem: DOMPoint): DOMPoint

    /**
     * The getItem() method of the SVGPointList interface gets one item from the list at the specified index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/getItem)
     */
    public open fun getItem(index: Int): DOMPoint

    /**
     * The insertItemBefore() method of the SVGPointList interface inserts a DOMPoint before another item in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/insertItemBefore)
     */
    public open fun insertItemBefore(newItem: DOMPoint, index: Int): DOMPoint

    /**
     * The replaceItem() method of the SVGPointList interface replaces a DOMPoint in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/replaceItem)
     */
    public open fun replaceItem(newItem: DOMPoint, index: Int): DOMPoint

    /**
     * The removeItem() method of the SVGPointList interface removes a DOMPoint from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/removeItem)
     */
    public open fun removeItem(index: Int): DOMPoint

    /**
     * The appendItem() method of the SVGPointList interface adds a DOMPoint to the end of the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPointList/appendItem)
     */
    public open fun appendItem(newItem: DOMPoint): DOMPoint
}

public operator fun SVGPointList.get(index: Int): DOMPoint? = getProperty(this, index)

public operator fun SVGPointList.set(index: Int, newItem: DOMPoint) { setProperty(this, index, newItem) }

/**
 * The SVGPolylineElement interface provides access to the properties of &lt;polyline&gt; elements, as well as methods
 * to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPolylineElement)
 */
public abstract external class SVGPolylineElement : SVGGeometryElement, SVGAnimatedPoints {

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
 * The SVGPolygonElement interface provides access to the properties of &lt;polygon&gt; elements, as well as methods to
 * manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPolygonElement)
 */
public abstract external class SVGPolygonElement : SVGGeometryElement, SVGAnimatedPoints {

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
 * The SVGTextContentElement interface is implemented by elements that support rendering child text content. It is
 * inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, and SVGTextPathElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement)
 */
public abstract external class SVGTextContentElement : SVGGraphicsElement {
    /**
     * The textLength read-only property of the SVGTextContentElement interface reflects the textLength attribute of the
     * given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/textLength)
     */
    public open val textLength: SVGAnimatedLength

    /**
     * The lengthAdjust read-only property of the SVGTextContentElement interface reflects the lengthAdjust attribute of
     * the given element. It takes one of the LENGTHADJUST_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/lengthAdjust)
     */
    public open val lengthAdjust: SVGAnimatedEnumeration

    /**
     * The getNumberOfChars() method of the SVGTextContentElement interface represents the total number of addressable
     * characters available for rendering within the current element, regardless of whether they will be rendered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getNumberOfChars)
     */
    public open fun getNumberOfChars(): Int

    /**
     * The getComputedTextLength() method of the SVGTextContentElement interface represents the computed length for the
     * text within the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getComputedTextLength)
     */
    public open fun getComputedTextLength(): Float

    /**
     * The getSubStringLength() method of the SVGTextContentElement interface represents the computed length of the
     * formatted text advance distance for a substring of text within the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getSubStringLength)
     */
    public open fun getSubStringLength(charnum: Int, nchars: Int): Float

    /**
     * The getStartPositionOfChar() method of the SVGTextContentElement interface returns the position of a typographic
     * character after text layout has been performed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getStartPositionOfChar)
     */
    public open fun getStartPositionOfChar(charnum: Int): DOMPoint

    /**
     * The getEndPositionOfChar() method of the SVGTextContentElement interface returns the trailing position of a
     * typographic character after text layout has been performed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getEndPositionOfChar)
     */
    public open fun getEndPositionOfChar(charnum: Int): DOMPoint

    /**
     * The getExtentOfChar() method of the SVGTextContentElement interface the represents computed tight bounding box of
     * the glyph cell that corresponds to a given typographic character.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getExtentOfChar)
     */
    public open fun getExtentOfChar(charnum: Int): DOMRect

    /**
     * The getRotationOfChar() method of the SVGTextContentElement interface the represents the rotation of a
     * typographic character.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getRotationOfChar)
     */
    public open fun getRotationOfChar(charnum: Int): Float

    /**
     * The getCharNumAtPosition() method of the SVGTextContentElement interface represents the character which caused a
     * text glyph to be rendered at a given position in the coordinate system. Because the relationship between
     * characters and glyphs is not one-to-one, only the first character of the relevant typographic character is
     * returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getCharNumAtPosition)
     */
    public open fun getCharNumAtPosition(point: DOMPointInit = definedExternally): Int
    public open fun selectSubString(charnum: Int, nchars: Int)

    public companion object {
        public val LENGTHADJUST_UNKNOWN: Short
        public val LENGTHADJUST_SPACING: Short
        public val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * The SVGTextPositioningElement interface is implemented by elements that support attributes that position individual
 * text glyphs. It is inherited by SVGTextElement and SVGTSpanElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement)
 */
public abstract external class SVGTextPositioningElement : SVGTextContentElement {
    /**
     * The x read-only property of the SVGTextPositioningElement interface describes the x-axis coordinate of the
     * SVGTextElement or SVGTSpanElement as an SVGAnimatedLengthList. It reflects the x attribute's horizontal position
     * of the individual text glyphs in the user coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement/x)
     */
    public open val x: SVGAnimatedLengthList

    /**
     * The y read-only property of the SVGTextPositioningElement interface describes the y-axis coordinate of the
     * SVGTextElement or SVGTSpanElement as an SVGAnimatedLengthList. It reflects the y attribute's vertical position of
     * the individual text glyphs in the user coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement/y)
     */
    public open val y: SVGAnimatedLengthList

    /**
     * The dx read-only property of the SVGTextPositioningElement interface describes the x-axis coordinate of the
     * SVGTextElement or SVGTSpanElement as an SVGAnimatedLengthList. It reflects the dx attribute's horizontal
     * displacement of the individual text glyphs in the user coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement/dx)
     */
    public open val dx: SVGAnimatedLengthList

    /**
     * The dy read-only property of the SVGTextPositioningElement interface describes the y-axis coordinate of the
     * SVGTextElement or SVGTSpanElement as an SVGAnimatedLengthList. It reflects the dy attribute's vertical
     * displacement of the individual text glyphs in the user coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement/dy)
     */
    public open val dy: SVGAnimatedLengthList

    /**
     * The rotate read-only property of the SVGTextPositioningElement interface reflects the rotation of individual text
     * glyphs, as specified by the rotate attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPositioningElement/rotate)
     */
    public open val rotate: SVGAnimatedNumberList

    public companion object {
        public val LENGTHADJUST_UNKNOWN: Short
        public val LENGTHADJUST_SPACING: Short
        public val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * The SVGTextElement interface corresponds to the &lt;text&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextElement)
 */
public abstract external class SVGTextElement : SVGTextPositioningElement {

    public companion object {
        public val LENGTHADJUST_UNKNOWN: Short
        public val LENGTHADJUST_SPACING: Short
        public val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * The SVGTSpanElement interface represents a &lt;tspan&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTSpanElement)
 */
public abstract external class SVGTSpanElement : SVGTextPositioningElement {

    public companion object {
        public val LENGTHADJUST_UNKNOWN: Short
        public val LENGTHADJUST_SPACING: Short
        public val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * The SVGTextPathElement interface corresponds to the &lt;textPath&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement)
 */
public abstract external class SVGTextPathElement : SVGTextContentElement, SVGURIReference {
    /**
     * The startOffset read-only property of the SVGTextPathElement interface reflects the X component of the
     * startOffset attribute of the given &lt;textPath&gt;, which defines an offset from the start of the path for the
     * initial current text position along the path after converting the path to the &lt;textPath&gt; element's
     * coordinate system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/startOffset)
     */
    public open val startOffset: SVGAnimatedLength

    /**
     * The method read-only property of the SVGTextPathElement interface represents the method by which text should be
     * rendered along the path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/method)
     */
    public open val method: SVGAnimatedEnumeration

    /**
     * The spacing read-only property of the SVGTextPathElement interface represents the spacing between typographic
     * characters that are to be rendered along a path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/spacing)
     */
    public open val spacing: SVGAnimatedEnumeration

    /**
     * The side read-only property of the SVGTextPathElement interface represents the side of the path that the text is
     * placed on (relative to the path direction).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextPathElement/side)
     */
    public open val side: SVGAnimatedEnumeration

    public companion object {
        public val TEXTPATH_METHODTYPE_UNKNOWN: Short
        public val TEXTPATH_METHODTYPE_ALIGN: Short
        public val TEXTPATH_METHODTYPE_STRETCH: Short
        public val TEXTPATH_SPACINGTYPE_UNKNOWN: Short
        public val TEXTPATH_SPACINGTYPE_AUTO: Short
        public val TEXTPATH_SPACINGTYPE_EXACT: Short
        public val TEXTPATH_SIDETYPE_UNKNOWN: Short
        public val TEXTPATH_SIDETYPE_LEFT: Short
        public val TEXTPATH_SIDETYPE_RIGHT: Short
        public val LENGTHADJUST_UNKNOWN: Short
        public val LENGTHADJUST_SPACING: Short
        public val LENGTHADJUST_SPACINGANDGLYPHS: Short
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
 * The SVGImageElement interface corresponds to the &lt;image&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement)
 */
public abstract external class SVGImageElement : SVGGraphicsElement, SVGURIReference, CanvasImageSource {
    /**
     * The x read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the x
     * attribute of the given &lt;image&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/x)
     */
    public open val x: SVGAnimatedLength

    /**
     * The y read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the y
     * attribute of the given &lt;image&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/y)
     */
    public open val y: SVGAnimatedLength

    /**
     * The width read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the
     * width attribute of the given &lt;image&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/width)
     */
    public open val width: SVGAnimatedLength

    /**
     * The height read-only property of the SVGImageElement interface returns an SVGAnimatedLength corresponding to the
     * height attribute of the given &lt;image&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/height)
     */
    public open val height: SVGAnimatedLength

    /**
     * The preserveAspectRatio read-only property of the SVGImageElement interface returns an
     * SVGAnimatedPreserveAspectRatio corresponding to the preserveAspectRatio attribute of the given &lt;image&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/preserveAspectRatio)
     */
    public open val preserveAspectRatio: SVGAnimatedPreserveAspectRatio

    /**
     * The crossOrigin property of the SVGImageElement interface is a string which specifies the Cross-Origin Resource
     * Sharing (CORS) setting to use when retrieving the image. It reflects the crossorigin content attribute of the
     * given &lt;image&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGImageElement/crossOrigin)
     */
    public open var crossOrigin: String?
    public open var referrerPolicy: String

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
 * The SVGForeignObjectElement interface provides access to the properties of &lt;foreignObject&gt; elements, as well as
 * methods to manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGForeignObjectElement)
 */
public abstract external class SVGForeignObjectElement : SVGGraphicsElement {
    /**
     * The x read-only property of the SVGForeignObjectElement interface describes the x-axis coordinate of the
     * &lt;foreignObject&gt; element. It reflects the computed value of the x attribute on the &lt;foreignObject&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGForeignObjectElement/x)
     */
    public open val x: SVGAnimatedLength

    /**
     * The y read-only property of the SVGForeignObjectElement interface describes the y-axis coordinate of the
     * &lt;foreignObject&gt; element. It reflects the computed value of the y attribute on the &lt;foreignObject&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGForeignObjectElement/y)
     */
    public open val y: SVGAnimatedLength

    /**
     * The width read-only property of the SVGForeignObjectElement interface describes the width of the
     * &lt;foreignObject&gt; element. It reflects the computed value of the width attribute on the &lt;foreignObject&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGForeignObjectElement/width)
     */
    public open val width: SVGAnimatedLength

    /**
     * The height read-only property of the SVGForeignObjectElement interface describes the height of the
     * &lt;foreignObject&gt; element. It reflects the computed value of the height attribute on the
     * &lt;foreignObject&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGForeignObjectElement/height)
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

/**
 * The SVGMarkerElement interface provides access to the properties of &lt;marker&gt; elements, as well as methods to
 * manipulate them. The &lt;marker&gt; element defines the graphics used for drawing marks on a shape.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement)
 */
public abstract external class SVGMarkerElement : SVGElement, SVGFitToViewBox {
    /**
     * The refX read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object containing the
     * value of the refX attribute of the &lt;marker&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refX)
     */
    public open val refX: SVGAnimatedLength

    /**
     * The refY read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object containing the
     * value of the refY attribute of the &lt;marker&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/refY)
     */
    public open val refY: SVGAnimatedLength

    /**
     * The markerUnits read-only property of the SVGMarkerElement interface returns an SVGAnimatedEnumeration object.
     * This object returns an integer which represents the keyword values that the markerUnits attribute accepts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerUnits)
     */
    public open val markerUnits: SVGAnimatedEnumeration

    /**
     * The markerWidth read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object
     * containing the width of the &lt;marker&gt; viewport as defined by the markerWidth attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerWidth)
     */
    public open val markerWidth: SVGAnimatedLength

    /**
     * The markerHeight read-only property of the SVGMarkerElement interface returns an SVGAnimatedLength object
     * containing the height of the &lt;marker&gt; viewport as defined by the markerHeight attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/markerHeight)
     */
    public open val markerHeight: SVGAnimatedLength

    /**
     * The orientType read-only property of the SVGMarkerElement interface returns an SVGAnimatedEnumeration object
     * indicating whether the orient attribute is auto, an angle value, or something else.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientType)
     */
    public open val orientType: SVGAnimatedEnumeration

    /**
     * The orientAngle read-only property of the SVGMarkerElement interface returns an SVGAnimatedAngle object
     * containing the angle of the orient attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orientAngle)
     */
    public open val orientAngle: SVGAnimatedAngle

    /**
     * The orient property of the SVGMarkerElement interface defines how the marker is rotated when it is placed at its
     * position on the shape. It reflects the orient attribute value of the corresponding &lt;marker&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/orient)
     */
    public open var orient: String

    /**
     * The setOrientToAuto() method of the SVGMarkerElement interface sets the value of the orient attribute to auto.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAuto)
     */
    public open fun setOrientToAuto()

    /**
     * The setOrientToAngle() method of the SVGMarkerElement interface sets the value of the orient attribute to the
     * value in the SVGAngle passed in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGMarkerElement/setOrientToAngle)
     */
    public open fun setOrientToAngle(angle: SVGAngle)

    public companion object {
        public val SVG_MARKERUNITS_UNKNOWN: Short
        public val SVG_MARKERUNITS_USERSPACEONUSE: Short
        public val SVG_MARKERUNITS_STROKEWIDTH: Short
        public val SVG_MARKER_ORIENT_UNKNOWN: Short
        public val SVG_MARKER_ORIENT_AUTO: Short
        public val SVG_MARKER_ORIENT_ANGLE: Short
        public val SVG_MARKER_ORIENT_AUTO_START_REVERSE: Short
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
 * The SVGGradient interface is a base interface used by SVGLinearGradientElement and SVGRadialGradientElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement)
 */
public abstract external class SVGGradientElement : SVGElement, SVGURIReference {
    /**
     * The gradientUnits read-only property of the SVGGradientElement interface reflects the gradientUnits attribute of
     * the given element. It takes one of the SVG_UNIT_TYPE_* constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement/gradientUnits)
     */
    public open val gradientUnits: SVGAnimatedEnumeration

    /**
     * The gradientTransform read-only property of the SVGGradientElement interface reflects the gradientTransform
     * attribute of the given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement/gradientTransform)
     */
    public open val gradientTransform: SVGAnimatedTransformList

    /**
     * The spreadMethod read-only property of the SVGGradientElement interface reflects the spreadMethod attribute of
     * the given element. It takes one of the SVG_SPREADMETHOD_* constants defined on this interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGGradientElement/spreadMethod)
     */
    public open val spreadMethod: SVGAnimatedEnumeration

    public companion object {
        public val SVG_SPREADMETHOD_UNKNOWN: Short
        public val SVG_SPREADMETHOD_PAD: Short
        public val SVG_SPREADMETHOD_REFLECT: Short
        public val SVG_SPREADMETHOD_REPEAT: Short
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
 * The SVGLinearGradientElement interface corresponds to the &lt;linearGradient&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLinearGradientElement)
 */
public abstract external class SVGLinearGradientElement : SVGGradientElement {
    /**
     * The x1 read-only property of the SVGLinearGradientElement interface describes the x-axis coordinate of the start
     * point of the gradient as an SVGAnimatedLength. It reflects the computed value of the x1 attribute on the
     * &lt;linearGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLinearGradientElement/x1)
     */
    public open val x1: SVGAnimatedLength

    /**
     * The y1 read-only property of the SVGLinearGradientElement interface describes the y-axis coordinate of the start
     * point of the gradient as an SVGAnimatedLength. It reflects the computed value of the y1 attribute on the
     * &lt;linearGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLinearGradientElement/y1)
     */
    public open val y1: SVGAnimatedLength

    /**
     * The x2 read-only property of the SVGLinearGradientElement interface describes the x-axis coordinate of the start
     * point of the gradient as an SVGAnimatedLength. It reflects the computed value of the x2 attribute on the
     * &lt;linearGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLinearGradientElement/x2)
     */
    public open val x2: SVGAnimatedLength

    /**
     * The y2 read-only property of the SVGLinearGradientElement interface describes the y-axis coordinate of the start
     * point of the gradient as an SVGAnimatedLength. It reflects the computed value of the y2 attribute on the
     * &lt;linearGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLinearGradientElement/y2)
     */
    public open val y2: SVGAnimatedLength

    public companion object {
        public val SVG_SPREADMETHOD_UNKNOWN: Short
        public val SVG_SPREADMETHOD_PAD: Short
        public val SVG_SPREADMETHOD_REFLECT: Short
        public val SVG_SPREADMETHOD_REPEAT: Short
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
 * The SVGRadialGradientElement interface corresponds to the &lt;RadialGradient&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement)
 */
public abstract external class SVGRadialGradientElement : SVGGradientElement {
    /**
     * The cx read-only property of the SVGRadialGradientElement interface describes the x-axis coordinate of the center
     * of the radial gradient as an SVGAnimatedLength. It reflects the computed value of the cx attribute on the
     * &lt;radialGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement/cx)
     */
    public open val cx: SVGAnimatedLength

    /**
     * The cy read-only property of the SVGRadialGradientElement interface describes the y-axis coordinate of the center
     * of the radial gradient as an SVGAnimatedLength. It reflects the computed value of the cy attribute on the
     * &lt;radialGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement/cy)
     */
    public open val cy: SVGAnimatedLength

    /**
     * The r read-only property of the SVGRadialGradientElement interface describes the radius of the radial gradient as
     * an SVGAnimatedLength. It reflects the computed value of the r attribute on the &lt;radialGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement/r)
     */
    public open val r: SVGAnimatedLength

    /**
     * The fx read-only property of the SVGRadialGradientElement interface describes the x-axis coordinate of the focal
     * point of the radial gradient as an SVGAnimatedLength. It reflects the computed value of the fx attribute on the
     * &lt;radialGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement/fx)
     */
    public open val fx: SVGAnimatedLength

    /**
     * The fy read-only property of the SVGRadialGradientElement interface describes the y-axis coordinate of the focal
     * point of the radial gradient as an SVGAnimatedLength. It reflects the computed value of the fy attribute on the
     * &lt;radialGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement/fy)
     */
    public open val fy: SVGAnimatedLength

    /**
     * The fr read-only property of the SVGRadialGradientElement interface describes the radius of the focal circle of
     * the radial gradient as an SVGAnimatedLength. It reflects the computed value of the fr attribute on the
     * &lt;radialGradient&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGRadialGradientElement/fr)
     */
    public open val fr: SVGAnimatedLength

    public companion object {
        public val SVG_SPREADMETHOD_UNKNOWN: Short
        public val SVG_SPREADMETHOD_PAD: Short
        public val SVG_SPREADMETHOD_REFLECT: Short
        public val SVG_SPREADMETHOD_REPEAT: Short
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
 * The SVGStopElement interface corresponds to the &lt;stop&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStopElement)
 */
public abstract external class SVGStopElement : SVGElement {
    /**
     * The offset read-only property of the SVGStopElement interface reflects the offset attribute of the given
     * &lt;stop&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGStopElement/offset)
     */
    public open val offset: SVGAnimatedNumber

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
 * The SVGPatternElement interface corresponds to the &lt;pattern&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement)
 */
public abstract external class SVGPatternElement : SVGElement, SVGFitToViewBox, SVGURIReference {
    /**
     * The patternUnits read-only property of the SVGPatternElement interface reflects the patternUnits attribute of the
     * given &lt;pattern&gt; element. It specifies the coordinate system for the pattern content and takes one of the
     * constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/patternUnits)
     */
    public open val patternUnits: SVGAnimatedEnumeration

    /**
     * The patternContentUnits read-only property of the SVGPatternElement interface reflects the patternContentUnits
     * attribute of the given &lt;pattern&gt; element. It specifies the coordinate system for the pattern content and
     * takes one of the constants defined in SVGUnitTypes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/patternContentUnits)
     */
    public open val patternContentUnits: SVGAnimatedEnumeration

    /**
     * The patternTransform read-only property of the SVGPatternElement interface reflects the patternTransform
     * attribute of the given &lt;pattern&gt; element. This property holds the transformation applied to the pattern
     * itself, allowing for operations like translate, rotate, scale, and skew.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/patternTransform)
     */
    public open val patternTransform: SVGAnimatedTransformList

    /**
     * The x read-only property of the SVGPatternElement interface describes the x-axis coordinate of the start point of
     * the pattern as an SVGAnimatedLength. It reflects the computed value of the x attribute on the &lt;pattern&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/x)
     */
    public open val x: SVGAnimatedLength

    /**
     * The y read-only property of the SVGPatternElement interface describes the y-axis coordinate of the start point of
     * the pattern as an SVGAnimatedLength. It reflects the computed value of the y attribute on the &lt;pattern&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/y)
     */
    public open val y: SVGAnimatedLength

    /**
     * The width read-only property of the SVGPatternElement interface describes the width of the pattern as an
     * SVGAnimatedLength. It reflects the computed value of the width attribute on the &lt;pattern&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/width)
     */
    public open val width: SVGAnimatedLength

    /**
     * The height read-only property of the SVGPatternElement interface describes the height of the pattern as an
     * SVGAnimatedLength. It reflects the computed value of the height attribute on the &lt;pattern&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGPatternElement/height)
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

/**
 * The SVGScriptElement interface corresponds to the SVG &lt;script&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGScriptElement)
 */
public abstract external class SVGScriptElement : SVGElement, SVGURIReference, HTMLOrSVGScriptElement {
    /**
     * The type property of the SVGScriptElement interface reflects the type attribute of the given &lt;script&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGScriptElement/type)
     */
    public open var type: String

    /**
     * The crossOrigin property of the SVGScriptElement interface reflects the Cross-Origin Resource Sharing settings
     * for the &lt;script&gt; element. For classic scripts from other origins, this controls whether full error
     * information will be exposed. For module scripts, it controls the script itself and any scripts it imports. See
     * CORS settings attributes for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGScriptElement/crossOrigin)
     */
    public open var crossOrigin: String?
    public open var referrerPolicy: String

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
 * The SVGAElement interface provides access to the properties of an &lt;a&gt; element, as well as methods to manipulate
 * them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement)
 */
public abstract external class SVGAElement : SVGGraphicsElement, SVGURIReference, HyperlinkElementUtils {
    /**
     * The SVGAElement.target read-only property of SVGAElement returns an SVGAnimatedString object that specifies the
     * portion of a target window, frame, pane into which a document is to be opened when a link is activated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/target)
     */
    public open val target: SVGAnimatedString

    /**
     * The download property of the SVGAElement interface returns a string indicating that the browser should treat the
     * linked URL as a download.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/download)
     */
    public open var download: String

    /**
     * The ping property of the SVGAElement interface returns a string that reflects the ping attribute, containing a
     * space-separated list of URLs to which, when the hyperlink is followed, POST requests with the body PING will be
     * sent by the browser (in the background). Typically used for tracking.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/ping)
     */
    public open var ping: String

    /**
     * The rel property of the SVGAElement interface returns a string reflecting the value of the rel attribute of the
     * SVG &lt;a&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/rel)
     */
    public open var rel: String

    /**
     * The read-only relList property of the SVGAElement returns a live DOMTokenList reflecting the space-separated
     * string &lt;list-of-Link-Types&gt; values of the rel attribute of the SVG &lt;a&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/relList)
     */
    public open val relList: DOMTokenList

    /**
     * The referrerPolicy property of the SVGAElement interface returns a string specifying which referrer to send when
     * fetching the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAElement/referrerPolicy)
     */
    public open var referrerPolicy: String

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
 * The SVGViewElement interface provides access to the properties of &lt;view&gt; elements, as well as methods to
 * manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGViewElement)
 */
public abstract external class SVGViewElement : SVGElement, SVGFitToViewBox {

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
