/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'gamepad', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.gamepad

import kotlin.js.*
import org.w3c.dom.*

/**
 * The Gamepad interface of the Gamepad API defines an individual gamepad or other controller, allowing access to
 * information such as button presses, axis positions, and id.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class Gamepad : JsAny {
    /**
     * The id read-only property of the Gamepad interface returns a string containing some information about the
     * controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/id)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val id: String

    /**
     * The index read-only property of the Gamepad interface returns an integer that is auto-incremented to be unique
     * for each device currently connected to the system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/index)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val index: Int

    /**
     * The connected read-only property of the Gamepad interface returns a boolean indicating whether the gamepad is
     * still connected to the system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/connected)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val connected: Boolean

    /**
     * The timestamp read-only property of the Gamepad interface returns a DOMHighResTimeStamp representing the last
     * time the data for this gamepad was updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/timestamp)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val timestamp: Double

    /**
     * The mapping read-only property of the Gamepad interface returns a string indicating whether the browser has
     * remapped the controls on the device to a known layout.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val mapping: GamepadMappingType

    /**
     * The axes read-only property of the Gamepad interface returns an array representing the controls with axes present
     * on the device (e.g., analog thumb sticks).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/axes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val axes: JsArray<JsNumber>

    /**
     * The buttons read-only property of the Gamepad interface returns an array of GamepadButton objects representing
     * the buttons present on the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/buttons)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val buttons: JsArray<GamepadButton>
    public open val touches: JsArray<GamepadTouch>

    /**
     * The vibrationActuator read-only property of the Gamepad interface returns a GamepadHapticActuator object, which
     * represents haptic feedback hardware available on the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/vibrationActuator)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val vibrationActuator: GamepadHapticActuator
}

/**
 * The GamepadButton interface defines an individual button of a gamepad or other controller, allowing access to the
 * current state of different types of buttons available on the control device.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class GamepadButton : JsAny {
    /**
     * The GamepadButton.pressed property of the GamepadButton interface returns a boolean indicating whether the button
     * is currently pressed (true) or unpressed (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/pressed)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val pressed: Boolean

    /**
     * The touched property of the GamepadButton interface returns a boolean indicating whether a button capable of
     * detecting touch is currently touched (true) or not touched (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/touched)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val touched: Boolean

    /**
     * The GamepadButton.value property of the GamepadButton interface returns a double value used to represent the
     * current state of analog buttons on many modern gamepads, such as the triggers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadButton/value)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val value: Double
}

public external interface GamepadTouch : JsAny {
    public var touchId: Int?
    public var surfaceId: Byte?
    public var position: DOMPointReadOnly?
    public var surfaceDimensions: DOMRectReadOnly?
}

public fun GamepadTouch(touchId: Int? = null, surfaceId: Byte? = null, position: DOMPointReadOnly? = null, surfaceDimensions: DOMRectReadOnly? = null): GamepadTouch {
    val dictionary = newJsObject<GamepadTouch>()
    if (touchId != null) dictionary.touchId = touchId
    if (surfaceId != null) dictionary.surfaceId = surfaceId
    if (position != null) dictionary.position = position
    if (surfaceDimensions != null) dictionary.surfaceDimensions = surfaceDimensions
    return dictionary
}

public external interface GamepadMappingType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val GamepadMappingType.Companion.EMPTY: GamepadMappingType get() = "".toJsString().unsafeCast<GamepadMappingType>()
public inline val GamepadMappingType.Companion.STANDARD: GamepadMappingType get() = "standard".toJsString().unsafeCast<GamepadMappingType>()
public inline val GamepadMappingType.Companion.XR_STANDARD: GamepadMappingType get() = "xr-standard".toJsString().unsafeCast<GamepadMappingType>()

/**
 * The GamepadHapticActuator interface of the Gamepad API represents hardware in the controller designed to provide
 * haptic feedback to the user (if available), most commonly vibration hardware.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class GamepadHapticActuator : JsAny {
    /**
     * The effects read-only property of the GamepadHapticActuator interface returns an array of enumerated values
     * representing the different haptic effects that the actuator supports.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/effects)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val effects: JsArray<GamepadHapticEffectType>

    /**
     * The playEffect() method of the GamepadHapticActuator interface causes the hardware to play a specific vibration
     * effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/playEffect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun playEffect(type: GamepadHapticEffectType, params: GamepadEffectParameters = definedExternally): Promise<GamepadHapticsResult>

    /**
     * The reset() method of the GamepadHapticActuator interface stops the hardware from playing an active vibration
     * effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadHapticActuator/reset)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun reset(): Promise<GamepadHapticsResult>
}

public external interface GamepadHapticsResult : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val GamepadHapticsResult.Companion.COMPLETE: GamepadHapticsResult get() = "complete".toJsString().unsafeCast<GamepadHapticsResult>()
public inline val GamepadHapticsResult.Companion.PREEMPTED: GamepadHapticsResult get() = "preempted".toJsString().unsafeCast<GamepadHapticsResult>()

public external interface GamepadHapticEffectType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val GamepadHapticEffectType.Companion.DUAL_RUMBLE: GamepadHapticEffectType get() = "dual-rumble".toJsString().unsafeCast<GamepadHapticEffectType>()
public inline val GamepadHapticEffectType.Companion.TRIGGER_RUMBLE: GamepadHapticEffectType get() = "trigger-rumble".toJsString().unsafeCast<GamepadHapticEffectType>()

public external interface GamepadEffectParameters : JsAny {
    public var duration: Double?
    public var startDelay: Double?
    public var strongMagnitude: Double?
    public var weakMagnitude: Double?
    public var leftTrigger: Double?
    public var rightTrigger: Double?
}

public fun GamepadEffectParameters(duration: Double? = null, startDelay: Double? = null, strongMagnitude: Double? = null, weakMagnitude: Double? = null, leftTrigger: Double? = null, rightTrigger: Double? = null): GamepadEffectParameters {
    val dictionary = newJsObject<GamepadEffectParameters>()
    if (duration != null) dictionary.duration = duration
    if (startDelay != null) dictionary.startDelay = startDelay
    if (strongMagnitude != null) dictionary.strongMagnitude = strongMagnitude
    if (weakMagnitude != null) dictionary.weakMagnitude = weakMagnitude
    if (leftTrigger != null) dictionary.leftTrigger = leftTrigger
    if (rightTrigger != null) dictionary.rightTrigger = rightTrigger
    return dictionary
}

/**
 * The GamepadEvent interface of the Gamepad API contains references to gamepads connected to the system, which is what
 * the gamepad events gamepadconnected and gamepaddisconnected are fired in response to.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class GamepadEvent : Event {
    /**
     * The GamepadEvent() constructor creates a new GamepadEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/GamepadEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: GamepadEventInit = definedExternally)

    /**
     * The GamepadEvent.gamepad property of the GamepadEvent interface returns a Gamepad object, providing access to the
     * associated gamepad data for fired gamepadconnected and gamepaddisconnected events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GamepadEvent/gamepad)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val gamepad: Gamepad

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface GamepadEventInit : EventInit {
    public var gamepad: Gamepad?
}

public fun GamepadEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, gamepad: Gamepad? = null): GamepadEventInit {
    val dictionary = newJsObject<GamepadEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (gamepad != null) dictionary.gamepad = gamepad
    return dictionary
}
