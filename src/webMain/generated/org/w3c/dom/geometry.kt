/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'geometry', DO NOT EDIT!

package org.w3c.dom

import kotlin.js.*
import org.khronos.webgl.*

public external open class DOMPointReadOnly : JsAny {
    constructor(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally)
    open val x: Double
    open val y: Double
    open val z: Double
    open val w: Double
    open fun matrixTransform(matrix: DOMMatrixInit = definedExternally): DOMPoint
    open fun toJSON(): JsAny

    companion object {
        fun fromPoint(other: DOMPointInit = definedExternally): DOMPointReadOnly
    }
}

public external open class DOMPoint : DOMPointReadOnly {
    constructor(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, w: Double = definedExternally)
    override var x: Double
    override var y: Double
    override var z: Double
    override var w: Double

    companion object {
        fun fromPoint(other: DOMPointInit = definedExternally): DOMPoint
    }
}

public external interface DOMPointInit : JsAny {
    var x: Double?
    var y: Double?
    var z: Double?
    var w: Double?
}

public fun DOMPointInit(x: Double? = null, y: Double? = null, z: Double? = null, w: Double? = null): DOMPointInit = newJsObject<DOMPointInit>().apply {
    if (x != null) this.x = x
    if (y != null) this.y = y
    if (z != null) this.z = z
    if (w != null) this.w = w
}

public external open class DOMRectReadOnly : JsAny {
    constructor(x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally)
    open val x: Double
    open val y: Double
    open val width: Double
    open val height: Double
    open val top: Double
    open val right: Double
    open val bottom: Double
    open val left: Double
    open fun toJSON(): JsAny

    companion object {
        fun fromRect(other: DOMRectInit = definedExternally): DOMRectReadOnly
    }
}

public external open class DOMRect : DOMRectReadOnly {
    constructor(x: Double = definedExternally, y: Double = definedExternally, width: Double = definedExternally, height: Double = definedExternally)
    override var x: Double
    override var y: Double
    override var width: Double
    override var height: Double

    companion object {
        fun fromRect(other: DOMRectInit = definedExternally): DOMRect
    }
}

public external interface DOMRectInit : JsAny {
    var x: Double?
    var y: Double?
    var width: Double?
    var height: Double?
}

public fun DOMRectInit(x: Double? = null, y: Double? = null, width: Double? = null, height: Double? = null): DOMRectInit = newJsObject<DOMRectInit>().apply {
    if (x != null) this.x = x
    if (y != null) this.y = y
    if (width != null) this.width = width
    if (height != null) this.height = height
}

public external abstract class DOMRectList : ItemArrayLike<DOMRect> {
    override val length: Int
    override fun item(index: Int): DOMRect?
}

public operator fun DOMRectList.get(index: Int): DOMRect? = getProperty(this, index)

public external open class DOMQuad : JsAny {
    constructor(p1: DOMPointInit = definedExternally, p2: DOMPointInit = definedExternally, p3: DOMPointInit = definedExternally, p4: DOMPointInit = definedExternally)
    open val p1: DOMPoint
    open val p2: DOMPoint
    open val p3: DOMPoint
    open val p4: DOMPoint
    open fun getBounds(): DOMRect
    open fun toJSON(): JsAny

    companion object {
        fun fromRect(other: DOMRectInit = definedExternally): DOMQuad
        fun fromQuad(other: DOMQuadInit = definedExternally): DOMQuad
    }
}

public external interface DOMQuadInit : JsAny {
    var p1: DOMPointInit?
    var p2: DOMPointInit?
    var p3: DOMPointInit?
    var p4: DOMPointInit?
}

public fun DOMQuadInit(p1: DOMPointInit? = null, p2: DOMPointInit? = null, p3: DOMPointInit? = null, p4: DOMPointInit? = null): DOMQuadInit = newJsObject<DOMQuadInit>().apply {
    if (p1 != null) this.p1 = p1
    if (p2 != null) this.p2 = p2
    if (p3 != null) this.p3 = p3
    if (p4 != null) this.p4 = p4
}

public external open class DOMMatrixReadOnly : JsAny {
    constructor(init: String)
    constructor(init: JsArray<JsNumber>)
    constructor()
    open val a: Double
    open val b: Double
    open val c: Double
    open val d: Double
    open val e: Double
    open val f: Double
    open val m11: Double
    open val m12: Double
    open val m13: Double
    open val m14: Double
    open val m21: Double
    open val m22: Double
    open val m23: Double
    open val m24: Double
    open val m31: Double
    open val m32: Double
    open val m33: Double
    open val m34: Double
    open val m41: Double
    open val m42: Double
    open val m43: Double
    open val m44: Double
    open val is2D: Boolean
    open val isIdentity: Boolean
    open fun translate(tx: Double = definedExternally, ty: Double = definedExternally, tz: Double = definedExternally): DOMMatrix
    open fun scale(scaleX: Double = definedExternally, scaleY: Double = definedExternally, scaleZ: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
    open fun scaleNonUniform(scaleX: Double = definedExternally, scaleY: Double = definedExternally): DOMMatrix
    open fun scale3d(scale: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
    open fun rotate(rotX: Double = definedExternally, rotY: Double = definedExternally, rotZ: Double = definedExternally): DOMMatrix
    open fun rotateFromVector(x: Double = definedExternally, y: Double = definedExternally): DOMMatrix
    open fun rotateAxisAngle(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, angle: Double = definedExternally): DOMMatrix
    open fun skewX(sx: Double = definedExternally): DOMMatrix
    open fun skewY(sy: Double = definedExternally): DOMMatrix
    open fun multiply(other: DOMMatrixInit = definedExternally): DOMMatrix
    open fun flipX(): DOMMatrix
    open fun flipY(): DOMMatrix
    open fun inverse(): DOMMatrix
    open fun transformPoint(point: DOMPointInit = definedExternally): DOMPoint
    open fun toFloat32Array(): Float32Array
    open fun toFloat64Array(): Float64Array
    open fun toJSON(): JsAny

    companion object {
        fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrixReadOnly
        fun fromFloat32Array(array32: Float32Array): DOMMatrixReadOnly
        fun fromFloat64Array(array64: Float64Array): DOMMatrixReadOnly
    }
}

public external open class DOMMatrix : DOMMatrixReadOnly {
    constructor(init: String)
    constructor(init: JsArray<JsNumber>)
    constructor()
    override var a: Double
    override var b: Double
    override var c: Double
    override var d: Double
    override var e: Double
    override var f: Double
    override var m11: Double
    override var m12: Double
    override var m13: Double
    override var m14: Double
    override var m21: Double
    override var m22: Double
    override var m23: Double
    override var m24: Double
    override var m31: Double
    override var m32: Double
    override var m33: Double
    override var m34: Double
    override var m41: Double
    override var m42: Double
    override var m43: Double
    override var m44: Double
    open fun multiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix
    open fun preMultiplySelf(other: DOMMatrixInit = definedExternally): DOMMatrix
    open fun translateSelf(tx: Double = definedExternally, ty: Double = definedExternally, tz: Double = definedExternally): DOMMatrix
    open fun scaleSelf(scaleX: Double = definedExternally, scaleY: Double = definedExternally, scaleZ: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
    open fun scale3dSelf(scale: Double = definedExternally, originX: Double = definedExternally, originY: Double = definedExternally, originZ: Double = definedExternally): DOMMatrix
    open fun rotateSelf(rotX: Double = definedExternally, rotY: Double = definedExternally, rotZ: Double = definedExternally): DOMMatrix
    open fun rotateFromVectorSelf(x: Double = definedExternally, y: Double = definedExternally): DOMMatrix
    open fun rotateAxisAngleSelf(x: Double = definedExternally, y: Double = definedExternally, z: Double = definedExternally, angle: Double = definedExternally): DOMMatrix
    open fun skewXSelf(sx: Double = definedExternally): DOMMatrix
    open fun skewYSelf(sy: Double = definedExternally): DOMMatrix
    open fun invertSelf(): DOMMatrix
    open fun setMatrixValue(transformList: String): DOMMatrix

    companion object {
        fun fromMatrix(other: DOMMatrixInit = definedExternally): DOMMatrix
        fun fromFloat32Array(array32: Float32Array): DOMMatrix
        fun fromFloat64Array(array64: Float64Array): DOMMatrix
    }
}

public external interface DOMMatrix2DInit : JsAny {
    var a: Double?
    var b: Double?
    var c: Double?
    var d: Double?
    var e: Double?
    var f: Double?
    var m11: Double?
    var m12: Double?
    var m21: Double?
    var m22: Double?
    var m41: Double?
    var m42: Double?
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
    var m13: Double?
    var m14: Double?
    var m23: Double?
    var m24: Double?
    var m31: Double?
    var m32: Double?
    var m33: Double?
    var m34: Double?
    var m43: Double?
    var m44: Double?
    var is2D: Boolean?
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
