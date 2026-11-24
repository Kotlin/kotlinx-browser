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

/**
 * The Touch interface represents a single contact point on a touch-sensitive device. The contact point is commonly a
 * finger or stylus and the device may be a touchscreen or trackpad.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch)
 */
public external open class Touch : JsAny {
    /**
     * The Touch() constructor creates a new Touch object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/Touch)
     */
    constructor(touchInitDict: TouchInit)

    /**
     * The identifier read-only property of the Touch interface returns a value uniquely identifying this point of
     * contact with the touch surface. This value remains consistent for every event involving this finger's (or
     * stylus's) movement on the surface until it is lifted off the surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/identifier)
     */
    open val identifier: Int

    /**
     * The read-only target property of the Touch interface returns the (EventTarget) on which the touch contact started
     * when it was first placed on the surface, even if the touch point has since moved outside the interactive area of
     * that element or even been removed from the document. Note that if the target element is removed from the
     * document, events will still be targeted at it, and hence won't necessarily bubble up to the window or document
     * anymore. If there is any risk of an element being removed while it is being touched, the best practice is to
     * attach the touch listeners directly to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/target)
     */
    open val target: EventTarget

    /**
     * The screenX read-only property of the Touch interface returns the X coordinate of the touch point relative to the
     * screen, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenX)
     */
    open val screenX: Double

    /**
     * The screenY read-only property of the Touch interface returns the Y coordinate of the touch point relative to the
     * screen, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/screenY)
     */
    open val screenY: Double

    /**
     * The Touch.clientX read-only property returns the X coordinate of the touch point relative to the viewport, not
     * including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientX)
     */
    open val clientX: Double

    /**
     * The Touch.clientY read-only property returns the Y coordinate of the touch point relative to the browser's
     * viewport, not including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/clientY)
     */
    open val clientY: Double

    /**
     * The Touch.pageX read-only property returns the X coordinate of the touch point relative to the viewport,
     * including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageX)
     */
    open val pageX: Double

    /**
     * The Touch.pageY read-only property returns the Y coordinate of the touch point relative to the viewport,
     * including any scroll offset.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/pageY)
     */
    open val pageY: Double

    /**
     * The radiusX read-only property of the Touch interface returns the X radius of the ellipse that most closely
     * circumscribes the area of contact with the touch surface. The value is in CSS pixels of the same scale as
     * Touch.screenX.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusX)
     */
    open val radiusX: Float

    /**
     * The radiusY read-only property of the Touch interface returns the Y radius of the ellipse that most closely
     * circumscribes the area of contact with the touch surface. The value is in CSS pixels of the same scale as
     * Touch.screenX.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/radiusY)
     */
    open val radiusY: Float

    /**
     * The rotationAngle read-only property of the Touch interface returns the rotation angle, in degrees, of the
     * contact area ellipse defined by Touch.radiusX and Touch.radiusY. The value may be between 0 and 90. Together,
     * these three values describe an ellipse that approximates the size and shape of the area of contact between the
     * user and the screen. This may be a relatively large ellipse representing the contact between a fingertip and the
     * screen or a small area representing the tip of a stylus, for example.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/rotationAngle)
     */
    open val rotationAngle: Float

    /**
     * The Touch.force read-only property returns the amount of pressure the user is applying to the touch surface for a
     * Touch point.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/force)
     */
    open val force: Float

    /**
     * The altitudeAngle read-only property of the Touch interface returns the angle between a transducer (a pointer or
     * stylus) axis and the X-Y plane of a device screen. The altitude angle describes whether the transducer is
     * perpendicular to the screen, parallel, or at some angle in between.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/altitudeAngle)
     */
    open val altitudeAngle: Float

    /**
     * The azimuthAngle read-only property of the Touch interface returns the angle between the Y-Z plane and the plane
     * containing both the transducer (pointer or stylus) axis and the Y axis. This represents the compass direction
     * that the transducer is pointing in relative to the device surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/azimuthAngle)
     */
    open val azimuthAngle: Float

    /**
     * The touchType read-only property of the Touch interface returns the type of device that triggered the touch, such
     * as a stylus, or direct touch from a finger.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Touch/touchType)
     */
    open val touchType: TouchType
}

/**
 * The TouchList interface represents a list of contact points on a touch surface. For example, if the user has three
 * fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch
 * object for each finger, for a total of three entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList)
 */
public external abstract class TouchList : ItemArrayLike<Touch> {
    /**
     * The length read-only property indicates the number of items (touch points) in a given TouchList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/length)
     */
    override val length: Int

    /**
     * The item() method returns the Touch object at the specified index in the TouchList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/item)
     */
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

/**
 * The TouchEvent interface represents an UIEvent which is sent when the state of contacts with a touch-sensitive
 * surface changes. This surface can be a touch screen or trackpad, for example. The event can describe one or more
 * points of contact with the screen and includes support for detecting movement, addition and removal of contact
 * points, and so forth.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent)
 */
public external open class TouchEvent : UIEvent {
    /**
     * The TouchEvent() constructor creates a new TouchEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/TouchEvent)
     */
    constructor(type: String, eventInitDict: TouchEventInit = definedExternally)

    /**
     * touches is a read-only TouchList listing all the Touch objects for touch points that are currently in contact
     * with the touch surface, regardless of whether or not they've changed or what their target element was at
     * touchstart time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/touches)
     */
    open val touches: TouchList

    /**
     * The targetTouches read-only property is a TouchList listing all the Touch objects for touch points that are still
     * in contact with the touch surface and whose touchstart event occurred inside the same target element as the
     * current target element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/targetTouches)
     */
    open val targetTouches: TouchList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/changedTouches)
     */
    open val changedTouches: TouchList

    /**
     * The read-only altKey property of the TouchEvent interface returns a boolean value indicating whether or not the
     * alt (Alternate) key is enabled when the touch event is created. If the alt key is enabled, the attribute's value
     * is true. Otherwise, it is false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/altKey)
     */
    open val altKey: Boolean

    /**
     * The read-only metaKey property of the TouchEvent interface returns a boolean value indicating whether or not the
     * Meta key is enabled when the touch event is created. If this key is enabled, the attribute's value is true.
     * Otherwise, it is false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/metaKey)
     */
    open val metaKey: Boolean

    /**
     * The read-only ctrlKey property of the TouchEvent interface returns a boolean value indicating whether the control
     * (Control) key is enabled when the touch event is created. If this key is enabled, the attribute's value is true.
     * Otherwise, it is false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/ctrlKey)
     */
    open val ctrlKey: Boolean

    /**
     * The read-only shiftKey property of the TouchEvent interface returns a boolean value indicating whether or not the
     * shift key is enabled when the touch event is created. If this key is enabled, the attribute's value is true.
     * Otherwise, it is false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchEvent/shiftKey)
     */
    open val shiftKey: Boolean
    open fun getModifierState(keyArg: String): Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}
