/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'pointerevents', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.pointerevents

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.dom.events.*

public external interface PointerEventInit : MouseEventInit {
    public var pointerId: Int?
    public var width: Double?
    public var height: Double?
    public var pressure: Float?
    public var tangentialPressure: Float?
    public var tiltX: Int?
    public var tiltY: Int?
    public var twist: Int?
    public var altitudeAngle: Double?
    public var azimuthAngle: Double?
    public var pointerType: String?
    public var isPrimary: Boolean?
    public var persistentDeviceId: Int?
    public var coalescedEvents: JsArray<PointerEvent>?
    public var predictedEvents: JsArray<PointerEvent>?
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

/**
 * The PointerEvent interface represents the state of a DOM event produced by a pointer such as the geometry of the
 * contact point, the device type that generated the event, the amount of pressure that was applied on the contact
 * surface, etc.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class PointerEvent : MouseEvent {
    /**
     * The PointerEvent() constructor creates a new synthetic and untrusted PointerEvent object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/PointerEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: PointerEventInit = definedExternally)

    /**
     * The pointerId read-only property of the PointerEvent interface is an identifier assigned to the pointer that
     * triggered the event. The identifier is unique, being different from the identifiers of all other active pointer
     * events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pointerId: Int

    /**
     * The width read-only property of the PointerEvent interface represents the width of the pointer's contact geometry
     * along the x-axis, measured in CSS pixels. Depending on the source of the pointer device (such as a finger), for a
     * given pointer, each event may produce a different value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/width)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val width: Double

    /**
     * The height read-only property of the PointerEvent interface represents the height of the pointer's contact
     * geometry, along the y-axis (in CSS pixels). Depending on the source of the pointer device (for example a finger),
     * for a given pointer, each event may produce a different value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/height)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val height: Double

    /**
     * The pressure read-only property of the PointerEvent interface indicates the normalized pressure of the pointer
     * input.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pressure)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pressure: Float

    /**
     * The tangentialPressure read-only property of the PointerEvent interface represents the normalized tangential
     * pressure of the pointer input (also known as barrel pressure or cylinder stress).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tangentialPressure)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val tangentialPressure: Float

    /**
     * The tiltX read-only property of the PointerEvent interface is the angle (in degrees) between the Y-Z plane of the
     * pointer and the screen. This property is typically only useful for a pen/stylus pointer type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val tiltX: Int

    /**
     * The tiltY read-only property of the PointerEvent interface is the angle (in degrees) between the X-Z plane of the
     * pointer and the screen. This property is typically only useful for a pen/stylus pointer type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/tiltY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val tiltY: Int

    /**
     * The twist read-only property of the PointerEvent interface represents the clockwise rotation of the pointer
     * (e.g., pen stylus) around its major axis, in degrees.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/twist)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val twist: Int

    /**
     * The altitudeAngle read-only property of the PointerEvent interface represents the angle between a transducer (a
     * pointer or stylus) axis and the X-Y plane of a device screen. The altitude angle describes whether the transducer
     * is perpendicular to the screen, parallel, or at some angle in between.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/altitudeAngle)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val altitudeAngle: Double

    /**
     * The azimuthAngle read-only property of the PointerEvent interface represents the angle between the Y-Z plane and
     * the plane containing both the transducer (pointer or stylus) axis and the Y axis.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/azimuthAngle)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val azimuthAngle: Double

    /**
     * The pointerType read-only property of the PointerEvent interface indicates the device type (mouse, pen, or touch)
     * that caused a given pointer event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/pointerType)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pointerType: String

    /**
     * The isPrimary read-only property of the PointerEvent interface indicates whether or not the pointer device that
     * created the event is the primary pointer. It returns true if the pointer that caused the event to be fired is the
     * primary one and returns false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/isPrimary)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val isPrimary: Boolean

    /**
     * The persistentDeviceId read-only property of the PointerEvent interface is a unique identifier for the pointing
     * device generating the PointerEvent. This provides a secure, reliable way to identify multiple pointing devices
     * (such as pens) interacting with the screen simultaneously.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/persistentDeviceId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val persistentDeviceId: Int

    /**
     * The getCoalescedEvents() method of the PointerEvent interface returns a sequence of PointerEvent instances that
     * were coalesced (merged) into a single pointermove or pointerrawupdate event. Instead of a stream of many
     * pointermove events, user agents coalesce multiple updates into a single event. This helps with performance as the
     * user agent has less event handling to perform, but there is a reduction in the granularity and accuracy when
     * tracking, especially with fast and large movements.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getCoalescedEvents)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getCoalescedEvents(): JsArray<PointerEvent>

    /**
     * The getPredictedEvents() method of the PointerEvent interface returns a sequence of PointerEvent instances that
     * are estimated future pointer positions. How the predicted positions are calculated depends on the user agent, but
     * they are based on past points, current velocity, and trajectory.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PointerEvent/getPredictedEvents)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getPredictedEvents(): JsArray<PointerEvent>

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface MouseEventInit : EventModifierInit {
    public var screenX: Int?
    public var screenY: Int?
    public var clientX: Int?
    public var clientY: Int?
    public var button: Short?
    public var buttons: Short?
    public var relatedTarget: EventTarget?
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

/**
 * The MouseEvent interface represents events that occur due to the user interacting with a pointing device (such as a
 * mouse). Common events using this interface include click, dblclick, mouseup, mousedown.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class MouseEvent : UIEvent {
    /**
     * The MouseEvent() constructor creates a new MouseEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/MouseEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: MouseEventInit = definedExternally)

    /**
     * The screenX read-only property of the MouseEvent interface provides the horizontal coordinate (offset) of the
     * mouse pointer in screen coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val screenX: Int

    /**
     * The screenY read-only property of the MouseEvent interface provides the vertical coordinate (offset) of the mouse
     * pointer in screen coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/screenY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val screenY: Int

    /**
     * The clientX read-only property of the MouseEvent interface provides the horizontal coordinate within the
     * application's viewport at which the event occurred (as opposed to the coordinate within the page).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clientX: Int

    /**
     * The clientY read-only property of the MouseEvent interface provides the vertical coordinate within the
     * application's viewport at which the event occurred (as opposed to the coordinate within the page).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/clientY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clientY: Int

    /**
     * The MouseEvent.layerX read-only property returns the horizontal coordinate of the event relative to the current
     * layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/layerX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val layerX: Int

    /**
     * The MouseEvent.layerY read-only property returns the vertical coordinate of the event relative to the current
     * layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/layerY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val layerY: Int

    /**
     * The MouseEvent.ctrlKey read-only property is a boolean value that indicates whether the ctrl key was pressed or
     * not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/ctrlKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val ctrlKey: Boolean

    /**
     * The MouseEvent.shiftKey read-only property is a boolean value that indicates whether the shift key was pressed or
     * not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/shiftKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val shiftKey: Boolean

    /**
     * The MouseEvent.altKey read-only property is a boolean value that indicates whether the alt key was pressed or not
     * when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/altKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val altKey: Boolean

    /**
     * The MouseEvent.metaKey read-only property is a boolean value that indicates whether the meta key was pressed or
     * not when a given mouse event occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/metaKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val metaKey: Boolean

    /**
     * The MouseEvent.button read-only property indicates which button was pressed or released on the mouse to trigger
     * the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/button)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val button: Short

    /**
     * The MouseEvent.buttons read-only property indicates which buttons are pressed on the mouse (or other input
     * device) when a mouse event is triggered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/buttons)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val buttons: Short

    /**
     * The MouseEvent.relatedTarget read-only property is the secondary target for the mouse event, if there is one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/relatedTarget)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val relatedTarget: EventTarget?

    /**
     * The MouseEvent.getModifierState() method returns the current state of the specified modifier key: true if the
     * modifier is active (i.e., the modifier key is pressed or locked), otherwise, false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/getModifierState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getModifierState(keyArg: String): Boolean

    /**
     * The pageX read-only property of the MouseEvent interface returns the X (horizontal) coordinate (in pixels) at
     * which the mouse was clicked, relative to the left edge of the entire document. This includes any portion of the
     * document not currently visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pageX: Double

    /**
     * The pageY read-only property of the MouseEvent interface returns the Y (vertical) coordinate (in pixels) at which
     * the mouse was clicked, relative to the top edge of the entire document. This includes any portion of the document
     * not currently visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/pageY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pageY: Double

    /**
     * The x read-only property of the MouseEvent interface is an alias for the MouseEvent.clientX property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/x)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val x: Double

    /**
     * The y read-only property of the MouseEvent interface is an alias for the MouseEvent.clientY property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/y)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val y: Double

    /**
     * The offsetX read-only property of the MouseEvent interface provides the offset in the X coordinate of the mouse
     * pointer between that event and the padding edge of the target node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetX: Double

    /**
     * The offsetY read-only property of the MouseEvent interface provides the offset in the Y coordinate of the mouse
     * pointer between that event and the padding edge of the target node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/offsetY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetY: Double

    /**
     * The MouseEvent.initMouseEvent() method initializes the value of a mouse event once it's been created (normally
     * using the Document.createEvent() method).
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MouseEvent/initMouseEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun initMouseEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, detailArg: Int = definedExternally, screenXArg: Int = definedExternally, screenYArg: Int = definedExternally, clientXArg: Int = definedExternally, clientYArg: Int = definedExternally, ctrlKeyArg: Boolean = definedExternally, altKeyArg: Boolean = definedExternally, shiftKeyArg: Boolean = definedExternally, metaKeyArg: Boolean = definedExternally, buttonArg: Short = definedExternally, relatedTargetArg: EventTarget? = definedExternally)

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface WheelEventInit : MouseEventInit {
    public var deltaX: Double?
    public var deltaY: Double?
    public var deltaZ: Double?
    public var deltaMode: Int?
    public var momentum: Boolean?
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

/**
 * The WheelEvent interface represents events that occur due to the user moving a mouse wheel or similar input device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class WheelEvent : MouseEvent {
    /**
     * The WheelEvent() constructor returns a new WheelEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/WheelEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: WheelEventInit = definedExternally)

    /**
     * The WheelEvent.deltaX read-only property is a double representing the horizontal scroll amount in the
     * WheelEvent.deltaMode unit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaX)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val deltaX: Double

    /**
     * The WheelEvent.deltaY read-only property is a double representing the vertical scroll amount in the
     * WheelEvent.deltaMode unit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaY)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val deltaY: Double

    /**
     * The WheelEvent.deltaZ read-only property is a double representing the scroll amount along the z-axis, in the
     * WheelEvent.deltaMode unit.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaZ)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val deltaZ: Double

    /**
     * The WheelEvent.deltaMode read-only property returns an unsigned long representing the unit of the delta values
     * scroll amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WheelEvent/deltaMode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val deltaMode: Int
    public open val momentum: Boolean

    public companion object {
        public val DOM_DELTA_PIXEL: Int
        public val DOM_DELTA_LINE: Int
        public val DOM_DELTA_PAGE: Int
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}
