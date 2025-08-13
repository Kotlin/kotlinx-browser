/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.events

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.undefined

/**
 * Exposes the JavaScript [UIEvent](https://developer.mozilla.org/en/docs/Web/API/UIEvent) to Kotlin
 */
public expect open class UIEvent(type: String, eventInitDict: UIEventInit = definedExternally) : Event, JsAny {
    open val view: Window?
    open val detail: Int

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface UIEventInit : EventInit, JsAny {
    open var view: Window? /* = null */
    open var detail: Int? /* = 0 */
}

@Suppress("UNUSED_PARAMETER")
public expect fun UIEventInit(view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): UIEventInit

/**
 * Exposes the JavaScript [FocusEvent](https://developer.mozilla.org/en/docs/Web/API/FocusEvent) to Kotlin
 */
public expect open class FocusEvent(type: String, eventInitDict: FocusEventInit = definedExternally) : UIEvent, JsAny {
    open val relatedTarget: EventTarget?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface FocusEventInit : UIEventInit, JsAny {
    open var relatedTarget: EventTarget? /* = null */
}

@Suppress("UNUSED_PARAMETER")
public expect fun FocusEventInit(relatedTarget: EventTarget? = null, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): FocusEventInit

/**
 * Exposes the JavaScript [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent) to Kotlin
 */
public expect open class MouseEvent(type: String, eventInitDict: MouseEventInit = definedExternally) : UIEvent, UnionElementOrMouseEvent, JsAny {
    open val screenX: Int
    open val screenY: Int
    open val clientX: Int
    open val clientY: Int
    open val ctrlKey: Boolean
    open val shiftKey: Boolean
    open val altKey: Boolean
    open val metaKey: Boolean
    open val button: Short
    open val buttons: Short
    open val relatedTarget: EventTarget?
    open val region: String?
    open val pageX: Double
    open val pageY: Double
    open val x: Double
    open val y: Double
    open val offsetX: Double
    open val offsetY: Double
    fun getModifierState(keyArg: String): Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface MouseEventInit : EventModifierInit, JsAny {
    open var screenX: Int? /* = 0 */
    open var screenY: Int? /* = 0 */
    open var clientX: Int? /* = 0 */
    open var clientY: Int? /* = 0 */
    open var button: Short? /* = 0 */
    open var buttons: Short? /* = 0 */
    open var relatedTarget: EventTarget? /* = null */
    open var region: String? /* = null */
}

@Suppress("UNUSED_PARAMETER")
public expect fun MouseEventInit(screenX: Int? = 0, screenY: Int? = 0, clientX: Int? = 0, clientY: Int? = 0, button: Short? = 0, buttons: Short? = 0, relatedTarget: EventTarget? = null, region: String? = null, ctrlKey: Boolean? = false, shiftKey: Boolean? = false, altKey: Boolean? = false, metaKey: Boolean? = false, modifierAltGraph: Boolean? = false, modifierCapsLock: Boolean? = false, modifierFn: Boolean? = false, modifierFnLock: Boolean? = false, modifierHyper: Boolean? = false, modifierNumLock: Boolean? = false, modifierScrollLock: Boolean? = false, modifierSuper: Boolean? = false, modifierSymbol: Boolean? = false, modifierSymbolLock: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): MouseEventInit

public expect interface EventModifierInit : UIEventInit, JsAny {
    open var ctrlKey: Boolean? /* = false */
    open var shiftKey: Boolean? /* = false */
    open var altKey: Boolean? /* = false */
    open var metaKey: Boolean? /* = false */
    open var modifierAltGraph: Boolean? /* = false */
    open var modifierCapsLock: Boolean? /* = false */
    open var modifierFn: Boolean? /* = false */
    open var modifierFnLock: Boolean? /* = false */
    open var modifierHyper: Boolean? /* = false */
    open var modifierNumLock: Boolean? /* = false */
    open var modifierScrollLock: Boolean? /* = false */
    open var modifierSuper: Boolean? /* = false */
    open var modifierSymbol: Boolean? /* = false */
    open var modifierSymbolLock: Boolean? /* = false */
}

@Suppress("UNUSED_PARAMETER")
public expect fun EventModifierInit(ctrlKey: Boolean? = false, shiftKey: Boolean? = false, altKey: Boolean? = false, metaKey: Boolean? = false, modifierAltGraph: Boolean? = false, modifierCapsLock: Boolean? = false, modifierFn: Boolean? = false, modifierFnLock: Boolean? = false, modifierHyper: Boolean? = false, modifierNumLock: Boolean? = false, modifierScrollLock: Boolean? = false, modifierSuper: Boolean? = false, modifierSymbol: Boolean? = false, modifierSymbolLock: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): EventModifierInit

/**
 * Exposes the JavaScript [WheelEvent](https://developer.mozilla.org/en/docs/Web/API/WheelEvent) to Kotlin
 */
public expect open class WheelEvent(type: String, eventInitDict: WheelEventInit = definedExternally) : MouseEvent, JsAny {
    open val deltaX: Double
    open val deltaY: Double
    open val deltaZ: Double
    open val deltaMode: Int

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

public expect interface WheelEventInit : MouseEventInit, JsAny {
    open var deltaX: Double? /* = 0.0 */
    open var deltaY: Double? /* = 0.0 */
    open var deltaZ: Double? /* = 0.0 */
    open var deltaMode: Int? /* = 0 */
}

@Suppress("UNUSED_PARAMETER")
public expect fun WheelEventInit(deltaX: Double? = 0.0, deltaY: Double? = 0.0, deltaZ: Double? = 0.0, deltaMode: Int? = 0, screenX: Int? = 0, screenY: Int? = 0, clientX: Int? = 0, clientY: Int? = 0, button: Short? = 0, buttons: Short? = 0, relatedTarget: EventTarget? = null, region: String? = null, ctrlKey: Boolean? = false, shiftKey: Boolean? = false, altKey: Boolean? = false, metaKey: Boolean? = false, modifierAltGraph: Boolean? = false, modifierCapsLock: Boolean? = false, modifierFn: Boolean? = false, modifierFnLock: Boolean? = false, modifierHyper: Boolean? = false, modifierNumLock: Boolean? = false, modifierScrollLock: Boolean? = false, modifierSuper: Boolean? = false, modifierSymbol: Boolean? = false, modifierSymbolLock: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): WheelEventInit

/**
 * Exposes the JavaScript [InputEvent](https://developer.mozilla.org/en/docs/Web/API/InputEvent) to Kotlin
 */
public expect open class InputEvent(type: String, eventInitDict: InputEventInit = definedExternally) : UIEvent, JsAny {
    open val data: String
    open val isComposing: Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface InputEventInit : UIEventInit, JsAny {
    open var data: String? /* = "" */
    open var isComposing: Boolean? /* = false */
}

@Suppress("UNUSED_PARAMETER")
public expect fun InputEventInit(data: String? = "", isComposing: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): InputEventInit

/**
 * Exposes the JavaScript [KeyboardEvent](https://developer.mozilla.org/en/docs/Web/API/KeyboardEvent) to Kotlin
 */
public expect open class KeyboardEvent(type: String, eventInitDict: KeyboardEventInit = definedExternally) : UIEvent, JsAny {
    open val key: String
    open val code: String
    open val location: Int
    open val ctrlKey: Boolean
    open val shiftKey: Boolean
    open val altKey: Boolean
    open val metaKey: Boolean
    open val repeat: Boolean
    open val isComposing: Boolean
    open val charCode: Int
    open val keyCode: Int
    open val which: Int
    fun getModifierState(keyArg: String): Boolean

    companion object {
        val DOM_KEY_LOCATION_STANDARD: Int
        val DOM_KEY_LOCATION_LEFT: Int
        val DOM_KEY_LOCATION_RIGHT: Int
        val DOM_KEY_LOCATION_NUMPAD: Int
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface KeyboardEventInit : EventModifierInit, JsAny {
    open var key: String? /* = "" */
    open var code: String? /* = "" */
    open var location: Int? /* = 0 */
    open var repeat: Boolean? /* = false */
    open var isComposing: Boolean? /* = false */
}

@Suppress("UNUSED_PARAMETER")
public expect fun KeyboardEventInit(key: String? = "", code: String? = "", location: Int? = 0, repeat: Boolean? = false, isComposing: Boolean? = false, ctrlKey: Boolean? = false, shiftKey: Boolean? = false, altKey: Boolean? = false, metaKey: Boolean? = false, modifierAltGraph: Boolean? = false, modifierCapsLock: Boolean? = false, modifierFn: Boolean? = false, modifierFnLock: Boolean? = false, modifierHyper: Boolean? = false, modifierNumLock: Boolean? = false, modifierScrollLock: Boolean? = false, modifierSuper: Boolean? = false, modifierSymbol: Boolean? = false, modifierSymbolLock: Boolean? = false, view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): KeyboardEventInit

/**
 * Exposes the JavaScript [CompositionEvent](https://developer.mozilla.org/en/docs/Web/API/CompositionEvent) to Kotlin
 */
public expect open class CompositionEvent(type: String, eventInitDict: CompositionEventInit = definedExternally) : UIEvent, JsAny {
    open val data: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface CompositionEventInit : UIEventInit, JsAny {
    open var data: String? /* = "" */
}

@Suppress("UNUSED_PARAMETER")
public expect fun CompositionEventInit(data: String? = "", view: Window? = null, detail: Int? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): CompositionEventInit

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
public expect open class Event(type: String, eventInitDict: EventInit = definedExternally) : JsAny {
    open val type: String
    open val target: EventTarget?
    open val currentTarget: EventTarget?
    open val eventPhase: Short
    open val bubbles: Boolean
    open val cancelable: Boolean
    open val defaultPrevented: Boolean
    open val composed: Boolean
    open val isTrusted: Boolean
    open val timeStamp: JsNumber
    fun composedPath(): JsArray<EventTarget>
    fun stopPropagation()
    fun stopImmediatePropagation()
    fun preventDefault()
    fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

/**
 * Exposes the JavaScript [EventTarget](https://developer.mozilla.org/en/docs/Web/API/EventTarget) to Kotlin
 */
public expect abstract class EventTarget : JsAny {
    fun addEventListener(type: String, callback: EventListener?, options: AddEventListenerOptions)
    fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: AddEventListenerOptions)
    fun addEventListener(type: String, callback: EventListener?, options: Boolean)
    fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: Boolean)
    fun addEventListener(type: String, callback: EventListener?)
    fun addEventListener(type: String, callback: ((Event) -> Unit)?)
    fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)
    fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: EventListenerOptions)
    fun removeEventListener(type: String, callback: EventListener?, options: Boolean)
    fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: Boolean)
    fun removeEventListener(type: String, callback: EventListener?)
    fun removeEventListener(type: String, callback: ((Event) -> Unit)?)
    fun dispatchEvent(event: Event): Boolean
}

/**
 * Exposes the JavaScript [EventListener](https://developer.mozilla.org/en/docs/Web/API/EventListener) to Kotlin
 */
public expect interface EventListener : JsAny {
    fun handleEvent(event: Event)
}