/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'pointerevents', DO NOT EDIT!

package org.w3c.dom.pointerevents

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.dom.events.*

public external interface PointerEventInit : MouseEventInit {
    var pointerId: Int?
    var width: Double?
    var height: Double?
    var pressure: Float?
    var tangentialPressure: Float?
    var tiltX: Int?
    var tiltY: Int?
    var twist: Int?
    var altitudeAngle: Double?
    var azimuthAngle: Double?
    var pointerType: String?
    var isPrimary: Boolean?
    var persistentDeviceId: Int?
    var coalescedEvents: JsArray<PointerEvent>?
    var predictedEvents: JsArray<PointerEvent>?
}

public fun PointerEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, screenX: Int? = null, screenY: Int? = null, clientX: Int? = null, clientY: Int? = null, button: Short? = null, buttons: Short? = null, relatedTarget: EventTarget? = null, pointerId: Int? = null, width: Double? = null, height: Double? = null, pressure: Float? = null, tangentialPressure: Float? = null, tiltX: Int? = null, tiltY: Int? = null, twist: Int? = null, altitudeAngle: Double? = null, azimuthAngle: Double? = null, pointerType: String? = null, isPrimary: Boolean? = null, persistentDeviceId: Int? = null, coalescedEvents: JsArray<PointerEvent>? = null, predictedEvents: JsArray<PointerEvent>? = null): PointerEventInit = newJsObject<PointerEventInit>().apply {
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
    if (screenX != null) this.screenX = screenX
    if (screenY != null) this.screenY = screenY
    if (clientX != null) this.clientX = clientX
    if (clientY != null) this.clientY = clientY
    if (button != null) this.button = button
    if (buttons != null) this.buttons = buttons
    if (relatedTarget != null) this.relatedTarget = relatedTarget
    if (pointerId != null) this.pointerId = pointerId
    if (width != null) this.width = width
    if (height != null) this.height = height
    if (pressure != null) this.pressure = pressure
    if (tangentialPressure != null) this.tangentialPressure = tangentialPressure
    if (tiltX != null) this.tiltX = tiltX
    if (tiltY != null) this.tiltY = tiltY
    if (twist != null) this.twist = twist
    if (altitudeAngle != null) this.altitudeAngle = altitudeAngle
    if (azimuthAngle != null) this.azimuthAngle = azimuthAngle
    if (pointerType != null) this.pointerType = pointerType
    if (isPrimary != null) this.isPrimary = isPrimary
    if (persistentDeviceId != null) this.persistentDeviceId = persistentDeviceId
    if (coalescedEvents != null) this.coalescedEvents = coalescedEvents
    if (predictedEvents != null) this.predictedEvents = predictedEvents
}

public external open class PointerEvent : MouseEvent {
    constructor(type: String, eventInitDict: PointerEventInit = definedExternally)
    open val pointerId: Int
    open val width: Double
    open val height: Double
    open val pressure: Float
    open val tangentialPressure: Float
    open val tiltX: Int
    open val tiltY: Int
    open val twist: Int
    open val altitudeAngle: Double
    open val azimuthAngle: Double
    open val pointerType: String
    open val isPrimary: Boolean
    open val persistentDeviceId: Int
    open fun getCoalescedEvents(): JsArray<PointerEvent>
    open fun getPredictedEvents(): JsArray<PointerEvent>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface MouseEventInit : EventModifierInit {
    var screenX: Int?
    var screenY: Int?
    var clientX: Int?
    var clientY: Int?
    var button: Short?
    var buttons: Short?
    var relatedTarget: EventTarget?
}

public fun MouseEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, screenX: Int? = null, screenY: Int? = null, clientX: Int? = null, clientY: Int? = null, button: Short? = null, buttons: Short? = null, relatedTarget: EventTarget? = null): MouseEventInit = newJsObject<MouseEventInit>().apply {
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
    if (screenX != null) this.screenX = screenX
    if (screenY != null) this.screenY = screenY
    if (clientX != null) this.clientX = clientX
    if (clientY != null) this.clientY = clientY
    if (button != null) this.button = button
    if (buttons != null) this.buttons = buttons
    if (relatedTarget != null) this.relatedTarget = relatedTarget
}

public external open class MouseEvent : UIEvent {
    constructor(type: String, eventInitDict: MouseEventInit = definedExternally)
    open val screenX: Int
    open val screenY: Int
    open val clientX: Int
    open val clientY: Int
    open val layerX: Int
    open val layerY: Int
    open val ctrlKey: Boolean
    open val shiftKey: Boolean
    open val altKey: Boolean
    open val metaKey: Boolean
    open val button: Short
    open val buttons: Short
    open val relatedTarget: EventTarget?
    open fun getModifierState(keyArg: String): Boolean
    open val pageX: Double
    open val pageY: Double
    open val x: Double
    open val y: Double
    open val offsetX: Double
    open val offsetY: Double
    open fun initMouseEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, detailArg: Int = definedExternally, screenXArg: Int = definedExternally, screenYArg: Int = definedExternally, clientXArg: Int = definedExternally, clientYArg: Int = definedExternally, ctrlKeyArg: Boolean = definedExternally, altKeyArg: Boolean = definedExternally, shiftKeyArg: Boolean = definedExternally, metaKeyArg: Boolean = definedExternally, buttonArg: Short = definedExternally, relatedTargetArg: EventTarget? = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface WheelEventInit : MouseEventInit {
    var deltaX: Double?
    var deltaY: Double?
    var deltaZ: Double?
    var deltaMode: Int?
    var momentum: Boolean?
}

public fun WheelEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, screenX: Int? = null, screenY: Int? = null, clientX: Int? = null, clientY: Int? = null, button: Short? = null, buttons: Short? = null, relatedTarget: EventTarget? = null, deltaX: Double? = null, deltaY: Double? = null, deltaZ: Double? = null, deltaMode: Int? = null, momentum: Boolean? = null): WheelEventInit = newJsObject<WheelEventInit>().apply {
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
    if (screenX != null) this.screenX = screenX
    if (screenY != null) this.screenY = screenY
    if (clientX != null) this.clientX = clientX
    if (clientY != null) this.clientY = clientY
    if (button != null) this.button = button
    if (buttons != null) this.buttons = buttons
    if (relatedTarget != null) this.relatedTarget = relatedTarget
    if (deltaX != null) this.deltaX = deltaX
    if (deltaY != null) this.deltaY = deltaY
    if (deltaZ != null) this.deltaZ = deltaZ
    if (deltaMode != null) this.deltaMode = deltaMode
    if (momentum != null) this.momentum = momentum
}

public external open class WheelEvent : MouseEvent {
    constructor(type: String, eventInitDict: WheelEventInit = definedExternally)
    open val deltaX: Double
    open val deltaY: Double
    open val deltaZ: Double
    open val deltaMode: Int
    open val momentum: Boolean

    companion object {
        val DOM_DELTA_PIXEL: Int
        val DOM_DELTA_LINE: Int
        val DOM_DELTA_PAGE: Int
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}
