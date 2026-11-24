/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'geometry', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*
import org.khronos.webgl.*

/**
 * The DOMPointReadOnly interface specifies the coordinate and perspective fields used by DOMPoint to define a 2D or 3D
 * point in a coordinate system.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly)
 */
public open external class DOMPointReadOnly : JsAny {
    /**
     * The DOMPointReadOnly() constructor returns a new DOMPointReadOnly object representing a point in 2D or 3D space,
     * optionally with perspective, whose values cannot be altered by script code.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/DOMPointReadOnly)
     */
    public constructor(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally)

    /**
     * The DOMPointReadOnly interface's x property holds the horizontal coordinate, x, for a read-only point in space.
     * This property cannot be changed by JavaScript code in this read-only version of the DOMPoint object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/x)
     */
    public open val x: Double

    /**
     * The DOMPointReadOnly interface's y property holds the vertical coordinate, y, for a read-only point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/y)
     */
    public open val y: Double

    /**
     * The DOMPointReadOnly interface's z property holds the depth coordinate, z, for a read-only point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/z)
     */
    public open val z: Double

    /**
     * The DOMPointReadOnly interface's w property holds the point's perspective value, w, for a read-only point in
     * space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/w)
     */
    public open val w: Double

    /**
     * The matrixTransform() method of the DOMPointReadOnly interface applies a matrix transform specified as an object
     * to the DOMPointReadOnly object, creating and returning a new DOMPointReadOnly object. Neither the matrix nor the
     * point are altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/matrixTransform)
     */
    public open fun matrixTransform(matrix: DOMMatrixInit = definedExternally): DOMPoint

    /**
     * The toJSON() method of the DOMPointReadOnly interface returns a JSON-serializable plain object representing the
     * DOMPointReadOnly object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/toJSON)
     */
    public open fun toJSON(): JsAny

    public companion object {
        /**
         * The static DOMPointReadOnly method fromPoint() creates and returns a new DOMPointReadOnly object given a
         * source point.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPointReadOnly/fromPoint_static)
         */
        public fun fromPoint(other: DOMPointInit = definedExternally): DOMPointReadOnly
    }
}

/**
 * A DOMPoint object represents a 2D or 3D point in a coordinate system; it includes values for the coordinates in up to
 * three dimensions, as well as an optional perspective value. DOMPoint is based on DOMPointReadOnly but allows its
 * properties' values to be changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint)
 */
public open external class DOMPoint : DOMPointReadOnly {
    /**
     * The DOMPoint() constructor creates and returns a new DOMPoint object, given the values for some or all of its
     * properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/DOMPoint)
     */
    public constructor(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally)

    /**
     * The DOMPoint interface's x property holds the horizontal coordinate, x, for a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/x)
     */
    override var x: Double

    /**
     * The DOMPoint interface's y property holds the vertical coordinate, y, for a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/y)
     */
    override var y: Double

    /**
     * The DOMPoint interface's z property specifies the depth coordinate of a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/z)
     */
    override var z: Double

    /**
     * The DOMPoint interface's w property holds the point's perspective value, w, for a point in space.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/w)
     */
    override var w: Double

    public companion object {
        /**
         * The fromPoint() static method of the DOMPoint interface creates and returns a new mutable DOMPoint object
         * given a source point.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMPoint/fromPoint_static)
         */
        public fun fromPoint(other: DOMPointInit = definedExternally): DOMPoint
    }
}

public external interface DOMPointInit : JsAny {
    public var x: Double?
    public var y: Double?
    public var z: Double?
    public var w: Double?
}

public fun DOMPointInit(x: Double? = null, y: Double? = null, z: Double? = null, w: Double? = null): DOMPointInit = newJsObject<DOMPointInit>().apply {
    if (x != null) this.x = x
    if (y != null) this.y = y
    if (z != null) this.z = z
    if (w != null) this.w = w
}

/**
 * The DOMRectReadOnly interface specifies the standard properties (also used by DOMRect) to define a rectangle whose
 * properties are immutable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly)
 */
public open external class DOMRectReadOnly : JsAny {
    /**
     * The DOMRectReadOnly() constructor creates a new DOMRectReadOnly object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/DOMRectReadOnly)
     */
    public constructor(x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally)

    /**
     * The x read-only property of the DOMRectReadOnly interface represents the x coordinate of the DOMRect's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/x)
     */
    public open val x: Double

    /**
     * The y read-only property of the DOMRectReadOnly interface represents the y coordinate of the DOMRect's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/y)
     */
    public open val y: Double

    /**
     * The width read-only property of the DOMRectReadOnly interface represents the width of the DOMRect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/width)
     */
    public open val width: Double

    /**
     * The height read-only property of the DOMRectReadOnly interface represents the height of the DOMRect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/height)
     */
    public open val height: Double

    /**
     * The top read-only property of the DOMRectReadOnly interface returns the top coordinate value of the DOMRect. (Has
     * the same value as y, or y + height if height is negative.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/top)
     */
    public open val top: Double

    /**
     * The right read-only property of the DOMRectReadOnly interface returns the right coordinate value of the DOMRect.
     * (Has the same value as x + width, or x if width is negative.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/right)
     */
    public open val right: Double

    /**
     * The bottom read-only property of the DOMRectReadOnly interface returns the bottom coordinate value of the
     * DOMRect. (Has the same value as y + height, or y if height is negative.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/bottom)
     */
    public open val bottom: Double

    /**
     * The left read-only property of the DOMRectReadOnly interface returns the left coordinate value of the DOMRect.
     * (Has the same value as x, or x + width if width is negative.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/left)
     */
    public open val left: Double

    /**
     * The toJSON() method of the DOMRectReadOnly interface returns a JSON-serializable plain object representing the
     * DOMRectReadOnly object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/toJSON)
     */
    public open fun toJSON(): JsAny

    public companion object {
        /**
         * The fromRect() static method of the DOMRectReadOnly object creates a new DOMRectReadOnly object with a given
         * location and dimensions.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectReadOnly/fromRect_static)
         */
        public fun fromRect(other: DOMRectInit = definedExternally): DOMRectReadOnly
    }
}

/**
 * A DOMRect describes the size and position of a rectangle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect)
 */
public open external class DOMRect : DOMRectReadOnly {
    /**
     * The DOMRect() constructor creates a new DOMRect object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/DOMRect)
     */
    public constructor(x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally)

    /**
     * The x property of the DOMRect interface represents the x-coordinate of the rectangle, which is the horizontal
     * distance between the viewport's left edge and the rectangle's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/x)
     */
    override var x: Double

    /**
     * The y property of the DOMRect interface represents the y-coordinate of the rectangle, which is the vertical
     * distance between the viewport's top edge and the rectangle's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/y)
     */
    override var y: Double

    /**
     * The width property of the DOMRect interface represents the width of the rectangle. The value can be negative.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/width)
     */
    override var width: Double

    /**
     * The height property of the DOMRect interface represents the height of the rectangle. The value can be negative.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/height)
     */
    override var height: Double

    public companion object {
        /**
         * The fromRect() static method of the DOMRect object creates a new DOMRect object with a given location and
         * dimensions.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRect/fromRect_static)
         */
        public fun fromRect(other: DOMRectInit = definedExternally): DOMRect
    }
}

public external interface DOMRectInit : JsAny {
    public var x: Double?
    public var y: Double?
    public var width: Double?
    public var height: Double?
}

public fun DOMRectInit(x: Double? = null, y: Double? = null, width: Double? = null, height: Double? = null): DOMRectInit = newJsObject<DOMRectInit>().apply {
    if (x != null) this.x = x
    if (y != null) this.y = y
    if (width != null) this.width = width
    if (height != null) this.height = height
}

/**
 * The DOMRectList interface represents a collection of DOMRect objects, typically used to hold the rectangles
 * associated with a particular element, like bounding boxes returned by methods such as getClientRects(). It provides
 * access to each rectangle in the list via its index, along with a length property that indicates the total number of
 * rectangles in the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList)
 */
public abstract external class DOMRectList : ItemArrayLike<DOMRect> {
    /**
     * The read-only length property of the DOMRectList interface returns the number of DOMRect objects in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/length)
     */
    override val length: Int

    /**
     * The DOMRectList method item() returns the DOMRect at the specified index within the list, or null if the index is
     * out of range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/item)
     */
    override fun item(index: Int): DOMRect?
}

public operator fun DOMRectList.get(index: Int): DOMRect? = getProperty(this, index)

/**
 * A DOMQuad is a collection of four DOMPoints defining the corners of an arbitrary quadrilateral. Returning DOMQuads
 * lets getBoxQuads() return accurate information even when arbitrary 2D or 3D transforms are present. It has a handy
 * bounds attribute returning a DOMRectReadOnly for those cases where you just want an axis-aligned bounding rectangle.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad)
 */
public open external class DOMQuad : JsAny {
    /**
     * The DOMQuad() constructor creates and returns a new DOMQuad object, given the values for some or all of its
     * properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/DOMQuad)
     */
    public constructor(p1: DOMPointInit = definedExternally, p2: DOMPointInit = definedExternally, p3: DOMPointInit = definedExternally, p4: DOMPointInit = definedExternally)

    /**
     * The DOMQuad interface's p1 property holds the DOMPoint object that represents one of the four corners of the
     * DOMQuad. When created from DOMQuad.fromRect(), it is the point (x, y).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p1)
     */
    public open val p1: DOMPoint

    /**
     * The DOMQuad interface's p2 property holds the DOMPoint object that represents one of the four corners of the
     * DOMQuad. When created from DOMQuad.fromRect(), it is the point (x + width, y).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p2)
     */
    public open val p2: DOMPoint

    /**
     * The DOMQuad interface's p3 property holds the DOMPoint object that represents one of the four corners of the
     * DOMQuad. When created from DOMQuad.fromRect(), it is the point (x + width, y + height).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p3)
     */
    public open val p3: DOMPoint

    /**
     * The DOMQuad interface's p4 property holds the DOMPoint object that represents one of the four corners of the
     * DOMQuad. When created from DOMQuad.fromRect(), it is the point (x, y + height).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/p4)
     */
    public open val p4: DOMPoint

    /**
     * The DOMQuad method getBounds() returns a DOMRect object representing the smallest rectangle that fully contains
     * the DOMQuad object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/getBounds)
     */
    public open fun getBounds(): DOMRect

    /**
     * The toJSON() method of the DOMQuad interface returns a JSON-serializable plain object representing the DOMQuad
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/toJSON)
     */
    public open fun toJSON(): JsAny

    public companion object {
        /**
         * The fromRect() static method of the DOMQuad interface returns a new DOMQuad object based on the provided set
         * of coordinates in the shape of a DOMRect object.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/fromRect_static)
         */
        public fun fromRect(other: DOMRectInit = definedExternally): DOMQuad

        /**
         * The fromQuad() static method of the DOMQuad interface returns a new DOMQuad object based on the provided set
         * of coordinates in the shape of another DOMQuad object.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMQuad/fromQuad_static)
         */
        public fun fromQuad(other: DOMQuadInit = definedExternally): DOMQuad
    }
}

public external interface DOMQuadInit : JsAny {
    public var p1: DOMPointInit?
    public var p2: DOMPointInit?
    public var p3: DOMPointInit?
    public var p4: DOMPointInit?
}

public fun DOMQuadInit(p1: DOMPointInit? = null, p2: DOMPointInit? = null, p3: DOMPointInit? = null, p4: DOMPointInit? = null): DOMQuadInit = newJsObject<DOMQuadInit>().apply {
    if (p1 != null) this.p1 = p1
    if (p2 != null) this.p2 = p2
    if (p3 != null) this.p3 = p3
    if (p4 != null) this.p4 = p4
}

/**
 * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The DOMMatrix
 * interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix after creating
 * it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly)
 */
public open external class DOMMatrixReadOnly : JsAny {
    /**
     * The DOMMatrixReadOnly() constructor creates a new DOMMatrixReadOnly object which represents a 4x4 matrix,
     * suitable for 2D and 3D operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly)
     */
    public constructor(init: String)

    /**
     * The DOMMatrixReadOnly() constructor creates a new DOMMatrixReadOnly object which represents a 4x4 matrix,
     * suitable for 2D and 3D operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly)
     */
    public constructor(init: JsArray<JsNumber>)

    /**
     * The DOMMatrixReadOnly() constructor creates a new DOMMatrixReadOnly object which represents a 4x4 matrix,
     * suitable for 2D and 3D operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/DOMMatrixReadOnly)
     */
    public constructor()

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val a: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val b: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val c: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val d: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val e: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val f: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m11: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m12: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m13: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m14: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m21: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m22: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m23: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m24: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m31: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m32: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m33: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m34: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m41: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m42: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m43: Double

    /**
     * The DOMMatrixReadOnly interface represents a read-only 4×4 matrix, suitable for 2D and 3D operations. The
     * DOMMatrix interface — which is based upon DOMMatrixReadOnly—adds mutability, allowing you to alter the matrix
     * after creating it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly#instance_properties)
     */
    public open val m44: Double

    /**
     * The readonly is2D property of the DOMMatrixReadOnly interface is a Boolean flag that is true when the matrix is
     * 2D. The value is true if the matrix was initialized as a 2D matrix and only 2D transformation operations were
     * applied. Otherwise, the matrix is defined in 3D, and is2D is false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/is2D)
     */
    public open val is2D: Boolean

    /**
     * The readonly isIdentity property of the DOMMatrixReadOnly interface is a Boolean whose value is true if the
     * matrix is the identity matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/isIdentity)
     */
    public open val isIdentity: Boolean

    /**
     * The translate() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original
     * matrix with a translation applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/translate)
     */
    public open fun translate(tx: Double = definedExternally, ty: Double = definedExternally, tz: Double = definedExternally): DOMMatrix

    /**
     * The scale() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original
     * matrix with a scale transform applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale)
     */
    public open fun scale(scaleX: Double = definedExternally, scaleY: Double = definedExternally, scaleZ: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
    public open fun scaleNonUniform(scaleX: Double = definedExternally, scaleY: Double = definedExternally): DOMMatrix

    /**
     * The scale3d() method of the DOMMatrixReadOnly interface creates a new matrix which is the result of a 3D scale
     * transform being applied to the matrix. It returns a new DOMMatrix created by scaling the source 3d matrix by the
     * given scale factor centered on the origin point specified by the origin parameters, with a default origin of (0,
     * 0, 0). The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/scale3d)
     */
    public open fun scale3d(scale: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix

    /**
     * The rotate() method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by rotating the source
     * matrix around each of its axes by the specified number of degrees. The original matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotate)
     */
    public open fun rotate(rotX: Double = definedExternally, rotY: Double = definedExternally, rotZ: Double = definedExternally): DOMMatrix

    /**
     * The rotateFromVector() method of the DOMMatrixReadOnly interface is returns a new DOMMatrix created by rotating
     * the source matrix by the angle between the specified vector and (1, 0). The rotation angle is determined by the
     * angle between the vector (1,0)T and (x,y)T in the clockwise direction, or (+/-)arctan(y/x). If x and y are both
     * 0, the angle is specified as 0. The original matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateFromVector)
     */
    public open fun rotateFromVector(x: Double = definedExternally, y: Double = definedExternally): DOMMatrix

    /**
     * The rotateAxisAngle() method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by rotating the
     * source matrix by the given vector and angle. The original matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/rotateAxisAngle)
     */
    public open fun rotateAxisAngle(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, angle: Double = definedExternally): DOMMatrix

    /**
     * The skewX() method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by applying the specified
     * skew transformation to the source matrix along its x-axis. The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewX)
     */
    public open fun skewX(sx: Double = definedExternally): DOMMatrix

    /**
     * The skewY() method of the DOMMatrixReadOnly interface returns a new DOMMatrix created by applying the specified
     * skew transformation to the source matrix along its y-axis. The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/skewY)
     */
    public open fun skewY(sy: Double = definedExternally): DOMMatrix

    /**
     * The multiply() method of the DOMMatrixReadOnly interface creates and returns a new matrix which is the dot
     * product of the matrix and the otherMatrix parameter. If otherMatrix is omitted, the matrix is multiplied by a
     * matrix in which every element is 0 except the bottom-right corner and the element immediately above and to its
     * left: m33 and m34. These have the default value of 1. The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/multiply)
     */
    public open fun multiply(other: DOMMatrixInit = definedExternally): DOMMatrix

    /**
     * The flipX() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original
     * matrix flipped about the x-axis. This is equivalent to multiplying the matrix by DOMMatrix(-1, 0, 0, 1, 0, 0).
     * The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipX)
     */
    public open fun flipX(): DOMMatrix

    /**
     * The flipY() method of the DOMMatrixReadOnly interface creates a new matrix being the result of the original
     * matrix flipped about the y-axis. This is equivalent to multiplying the matrix by DOMMatrix(1, 0, 0, -1, 0, 0).
     * The original matrix is not modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/flipY)
     */
    public open fun flipY(): DOMMatrix

    /**
     * The inverse() method of the DOMMatrixReadOnly interface creates a new matrix which is the inverse of the original
     * matrix. If the matrix cannot be inverted, the new matrix's components are all set to NaN and its is2D property is
     * set to false. The original matrix is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/inverse)
     */
    public open fun inverse(): DOMMatrix

    /**
     * The transformPoint method of the DOMMatrixReadOnly interface creates a new DOMPoint object, transforming a
     * specified point by the matrix. Neither the matrix nor the original point are altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/transformPoint)
     */
    public open fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint

    /**
     * The toFloat32Array() method of the DOMMatrixReadOnly interface returns a new Float32Array containing all 16
     * elements (m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, m41, m42, m43, m44) which comprise the
     * matrix. The elements are stored into the array as single-precision floating-point numbers in column-major
     * (colexographical access, or "colex") order. (In other words, down the first column from top to bottom, then the
     * second column, and so forth.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat32Array)
     */
    public open fun toFloat32Array(): Float32Array

    /**
     * The toFloat64Array() method of the DOMMatrixReadOnly interface returns a new Float64Array containing all 16
     * elements (m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, m41, m42, m43, m44) which comprise the
     * matrix. The elements are stored into the array as double-precision floating-point numbers in column-major
     * (colexographical access, or "colex") order. (In other words, down the first column from top to bottom, then the
     * second column, and so forth.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toFloat64Array)
     */
    public open fun toFloat64Array(): Float64Array

    /**
     * The toJSON() method of the DOMMatrixReadOnly interface returns a JSON-serializable plain object representing the
     * DOMMatrixReadOnly object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/toJSON)
     */
    public open fun toJSON(): JsAny

    public companion object {
        /**
         * The fromMatrix() static method of the DOMMatrixReadOnly interface creates a new DOMMatrixReadOnly object
         * given an existing matrix or an object which provides the values for its properties.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/fromMatrix_static)
         */
        public fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrixReadOnly

        /**
         * The fromFloat32Array() static method of the DOMMatrixReadOnly interface creates a new DOMMatrixReadOnly
         * object given an array of single-precision (32-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/fromFloat32Array_static)
         */
        public fun fromFloat32Array(array32: Float32Array): DOMMatrixReadOnly

        /**
         * The fromFloat64Array() static method of the DOMMatrixReadOnly interface creates a new DOMMatrixReadOnly
         * object given an array of double-precision (64-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrixReadOnly/fromFloat64Array_static)
         */
        public fun fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly
    }
}

/**
 * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
 * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
 * workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix)
 */
public open external class DOMMatrix : DOMMatrixReadOnly {
    /**
     * The DOMMatrix() constructor creates a new DOMMatrix object which represents a 4x4 matrix, suitable for 2D and 3D
     * operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/DOMMatrix)
     */
    public constructor(init: String)

    /**
     * The DOMMatrix() constructor creates a new DOMMatrix object which represents a 4x4 matrix, suitable for 2D and 3D
     * operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/DOMMatrix)
     */
    public constructor(init: JsArray<JsNumber>)

    /**
     * The DOMMatrix() constructor creates a new DOMMatrix object which represents a 4x4 matrix, suitable for 2D and 3D
     * operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/DOMMatrix)
     */
    public constructor()

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var a: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var b: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var c: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var d: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var e: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var f: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m11: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m12: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m13: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m14: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m21: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m22: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m23: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m24: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m31: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m32: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m33: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m34: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m41: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m42: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m43: Double

    /**
     * The DOMMatrix interface represents 4×4 matrices, suitable for 2D and 3D operations including rotation and
     * translation. It is a mutable version of the DOMMatrixReadOnly interface. The interface is available inside web
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix#instance_properties)
     */
    override var m44: Double

    /**
     * The multiplySelf() method of the DOMMatrix interface multiplies a matrix by the otherMatrix parameter, computing
     * the dot product of the original matrix and the specified matrix: A⋅B. If no matrix is specified as the
     * multiplier, the matrix is multiplied by a matrix in which every element is 0 except the bottom-right corner and
     * the element immediately above and to its left: m33 and m34. These have the default value of 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/multiplySelf)
     */
    public open fun multiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix

    /**
     * The preMultiplySelf() method of the DOMMatrix interface modifies the matrix by pre-multiplying it with the
     * specified DOMMatrix. This is equivalent to the dot product B⋅A, where matrix A is the source matrix and B is the
     * matrix given as an input to the method. If no matrix is specified as the multiplier, the matrix is multiplied by
     * a matrix in which every element is 0 except the bottom-right corner and the element immediately above and to its
     * left: m33 and m34. These have the default value of 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/preMultiplySelf)
     */
    public open fun preMultiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix

    /**
     * The translateSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a matrix.
     * It applies the specified vectors and returns the updated matrix. The default vector is \[0, 0, 0\].
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/translateSelf)
     */
    public open fun translateSelf(tx: Double = definedExternally, ty: Double = definedExternally, tz: Double = definedExternally): DOMMatrix

    /**
     * The scaleSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a matrix by
     * applying a specified scaling factor, centered on the given origin, with a default origin of (0, 0), returning the
     * scaled matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scaleSelf)
     */
    public open fun scaleSelf(scaleX: Double = definedExternally, scaleY: Double = definedExternally, scaleZ: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix

    /**
     * The scale3dSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a matrix by
     * applying a specified scaling factor to all three axes, centered on the given origin, with a default origin of (0,
     * 0, 0), returning the 3D-scaled matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/scale3dSelf)
     */
    public open fun scale3dSelf(scale: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix

    /**
     * The rotateSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It
     * rotates the source matrix around each of its axes by the specified number of degrees and returns the rotated
     * matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateSelf)
     */
    public open fun rotateSelf(rotX: Double = definedExternally, rotY: Double = definedExternally, rotZ: Double = definedExternally): DOMMatrix

    /**
     * The rotateFromVectorSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a
     * matrix by rotating the matrix by the angle between the specified vector and (1, 0). The rotation angle is
     * determined by the angle between the vector (1,0)T and (x,y)T in the clockwise direction, or (+/-)arctan(y/x). If
     * x and y are both 0, the angle is specified as 0, and the matrix is not altered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateFromVectorSelf)
     */
    public open fun rotateFromVectorSelf(x: Double = definedExternally, y: Double = definedExternally): DOMMatrix

    /**
     * The rotateAxisAngleSelf() method of the DOMMatrix interface is a transformation method that rotates the source
     * matrix by the given vector and angle, returning the altered matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/rotateAxisAngleSelf)
     */
    public open fun rotateAxisAngleSelf(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, angle: Double = definedExternally): DOMMatrix

    /**
     * The skewXSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It
     * skews the source matrix by applying the specified skew transformation along the X-axis and returns the skewed
     * matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/skewXSelf)
     */
    public open fun skewXSelf(sx: Double = definedExternally): DOMMatrix

    /**
     * The skewYSelf() method of the DOMMatrix interface is a mutable transformation method that modifies a matrix. It
     * skews the source matrix by applying the specified skew transformation along the Y-axis and returns the skewed
     * matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/skewYSelf)
     */
    public open fun skewYSelf(sy: Double = definedExternally): DOMMatrix

    /**
     * The invertSelf() method of the DOMMatrix interface inverts the original matrix. If the matrix cannot be inverted,
     * the new matrix's components are all set to NaN and its is2D property is set to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/invertSelf)
     */
    public open fun invertSelf(): DOMMatrix

    /**
     * The setMatrixValue() method of the DOMMatrix interface replaces the contents of the matrix with the matrix
     * described by the specified transform or transforms, returning itself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/setMatrixValue)
     */
    public open fun setMatrixValue(transformList: String): DOMMatrix

    public companion object {
        /**
         * The fromMatrix() static method of the DOMMatrix interface creates a new DOMMatrix object given an existing
         * matrix or an object which provides the values for its properties.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/fromMatrix_static)
         */
        public fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrix

        /**
         * The fromFloat32Array() static method of the DOMMatrix interface creates a new DOMMatrix object given an array
         * of single-precision (32-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/fromFloat32Array_static)
         */
        public fun fromFloat32Array(array32: Float32Array): DOMMatrix

        /**
         * The fromFloat64Array() static method of the DOMMatrix interface creates a new DOMMatrix object given an array
         * of double-precision (64-bit) floating-point values.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMMatrix/fromFloat64Array_static)
         */
        public fun fromFloat64Array(array64: Float64Array): DOMMatrix
    }
}

public external interface DOMMatrix2DInit : JsAny {
    public var a: Double?
    public var b: Double?
    public var c: Double?
    public var d: Double?
    public var e: Double?
    public var f: Double?
    public var m11: Double?
    public var m12: Double?
    public var m21: Double?
    public var m22: Double?
    public var m41: Double?
    public var m42: Double?
}

public fun DOMMatrix2DInit(a: Double? = null, b: Double? = null, c: Double? = null, d: Double? = null, e: Double? = null, f: Double? = null, m11: Double? = null, m12: Double? = null, m21: Double? = null, m22: Double? = null, m41: Double? = null, m42: Double? = null): DOMMatrix2DInit = newJsObject<DOMMatrix2DInit>().apply {
    if (a != null) this.a = a
    if (b != null) this.b = b
    if (c != null) this.c = c
    if (d != null) this.d = d
    if (e != null) this.e = e
    if (f != null) this.f = f
    if (m11 != null) this.m11 = m11
    if (m12 != null) this.m12 = m12
    if (m21 != null) this.m21 = m21
    if (m22 != null) this.m22 = m22
    if (m41 != null) this.m41 = m41
    if (m42 != null) this.m42 = m42
}

public external interface DOMMatrixInit : DOMMatrix2DInit {
    public var m13: Double?
    public var m14: Double?
    public var m23: Double?
    public var m24: Double?
    public var m31: Double?
    public var m32: Double?
    public var m33: Double?
    public var m34: Double?
    public var m43: Double?
    public var m44: Double?
    public var is2D: Boolean?
}

public fun DOMMatrixInit(a: Double? = null, b: Double? = null, c: Double? = null, d: Double? = null, e: Double? = null, f: Double? = null, m11: Double? = null, m12: Double? = null, m21: Double? = null, m22: Double? = null, m41: Double? = null, m42: Double? = null, m13: Double? = null, m14: Double? = null, m23: Double? = null, m24: Double? = null, m31: Double? = null, m32: Double? = null, m33: Double? = null, m34: Double? = null, m43: Double? = null, m44: Double? = null, is2D: Boolean? = null): DOMMatrixInit = newJsObject<DOMMatrixInit>().apply {
    if (a != null) this.a = a
    if (b != null) this.b = b
    if (c != null) this.c = c
    if (d != null) this.d = d
    if (e != null) this.e = e
    if (f != null) this.f = f
    if (m11 != null) this.m11 = m11
    if (m12 != null) this.m12 = m12
    if (m21 != null) this.m21 = m21
    if (m22 != null) this.m22 = m22
    if (m41 != null) this.m41 = m41
    if (m42 != null) this.m42 = m42
    if (m13 != null) this.m13 = m13
    if (m14 != null) this.m14 = m14
    if (m23 != null) this.m23 = m23
    if (m24 != null) this.m24 = m24
    if (m31 != null) this.m31 = m31
    if (m32 != null) this.m32 = m32
    if (m33 != null) this.m33 = m33
    if (m34 != null) this.m34 = m34
    if (m43 != null) this.m43 = m43
    if (m44 != null) this.m44 = m44
    if (is2D != null) this.is2D = is2D
}
