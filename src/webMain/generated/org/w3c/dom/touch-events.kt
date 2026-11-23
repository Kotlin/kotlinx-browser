/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'touch-events', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*
import org.w3c.dom.events.*

public external interface TouchType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val TouchType.Companion.DIRECT: TouchType get() = "direct".toJsString().unsafeCast<TouchType>()
public inline val TouchType.Companion.STYLUS: TouchType get() = "stylus".toJsString().unsafeCast<TouchType>()

public external interface TouchInit : JsAny {
    var identifier: Int
    var target: EventTarget
    var clientX: Double?
    var clientY: Double?
    var screenX: Double?
    var screenY: Double?
    var pageX: Double?
    var pageY: Double?
    var radiusX: Float?
    var radiusY: Float?
    var rotationAngle: Float?
    var force: Float?
    var altitudeAngle: Double?
    var azimuthAngle: Double?
    var touchType: TouchType?
}

public fun TouchInit(identifier: Int, target: EventTarget, clientX: Double? = null, clientY: Double? = null, screenX: Double? = null, screenY: Double? = null, pageX: Double? = null, pageY: Double? = null, radiusX: Float? = null, radiusY: Float? = null, rotationAngle: Float? = null, force: Float? = null, altitudeAngle: Double? = null, azimuthAngle: Double? = null, touchType: TouchType? = null): TouchInit = newJsObject<TouchInit>().apply {
    this.identifier = identifier
    this.target = target
    if (clientX != null) this.clientX = clientX
    if (clientY != null) this.clientY = clientY
    if (screenX != null) this.screenX = screenX
    if (screenY != null) this.screenY = screenY
    if (pageX != null) this.pageX = pageX
    if (pageY != null) this.pageY = pageY
    if (radiusX != null) this.radiusX = radiusX
    if (radiusY != null) this.radiusY = radiusY
    if (rotationAngle != null) this.rotationAngle = rotationAngle
    if (force != null) this.force = force
    if (altitudeAngle != null) this.altitudeAngle = altitudeAngle
    if (azimuthAngle != null) this.azimuthAngle = azimuthAngle
    if (touchType != null) this.touchType = touchType
}

public external open class Touch : JsAny {
    constructor(touchInitDict: TouchInit)
    open val identifier: Int
    open val target: EventTarget
    open val screenX: Double
    open val screenY: Double
    open val clientX: Double
    open val clientY: Double
    open val pageX: Double
    open val pageY: Double
    open val radiusX: Float
    open val radiusY: Float
    open val rotationAngle: Float
    open val force: Float
    open val altitudeAngle: Float
    open val azimuthAngle: Float
    open val touchType: TouchType
}

public external abstract class TouchList : ItemArrayLike<Touch> {
    override val length: Int
    override fun item(index: Int): Touch?
}

public operator fun TouchList.get(index: Int): Touch? = getProperty(this, index)

public external interface TouchEventInit : EventModifierInit {
    var touches: JsArray<Touch>?
    var targetTouches: JsArray<Touch>?
    var changedTouches: JsArray<Touch>?
}

public fun TouchEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, touches: JsArray<Touch>? = null, targetTouches: JsArray<Touch>? = null, changedTouches: JsArray<Touch>? = null): TouchEventInit = newJsObject<TouchEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (view != null) this.view = view
    if (detail != null) this.detail = detail
    if (which != null) this.which = which
    if (ctrlKey != null) this.ctrlKey = ctrlKey
    if (shiftKey != null) this.shiftKey = shiftKey
    if (altKey != null) this.altKey = altKey
    if (metaKey != null) this.metaKey = metaKey
    if (modifierAltGraph != null) this.modifierAltGraph = modifierAltGraph
    if (modifierCapsLock != null) this.modifierCapsLock = modifierCapsLock
    if (modifierFn != null) this.modifierFn = modifierFn
    if (modifierFnLock != null) this.modifierFnLock = modifierFnLock
    if (modifierHyper != null) this.modifierHyper = modifierHyper
    if (modifierNumLock != null) this.modifierNumLock = modifierNumLock
    if (modifierScrollLock != null) this.modifierScrollLock = modifierScrollLock
    if (modifierSuper != null) this.modifierSuper = modifierSuper
    if (modifierSymbol != null) this.modifierSymbol = modifierSymbol
    if (modifierSymbolLock != null) this.modifierSymbolLock = modifierSymbolLock
    if (touches != null) this.touches = touches
    if (targetTouches != null) this.targetTouches = targetTouches
    if (changedTouches != null) this.changedTouches = changedTouches
}

public external open class TouchEvent : UIEvent {
    constructor(type: String, eventInitDict: TouchEventInit = definedExternally)
    open val touches: TouchList
    open val targetTouches: TouchList
    open val changedTouches: TouchList
    open val altKey: Boolean
    open val metaKey: Boolean
    open val ctrlKey: Boolean
    open val shiftKey: Boolean
    open fun getModifierState(keyArg: String): Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}
