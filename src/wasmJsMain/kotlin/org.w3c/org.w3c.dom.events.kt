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
public actual external open class UIEvent actual constructor(type: String, eventInitDict: UIEventInit) : Event, JsAny {
    actual open val view: Window?
    actual open val detail: Int

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface UIEventInit : EventInit, JsAny {
    actual var view: Window? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var detail: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun UIEventInit(view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): UIEventInit = js("({ view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [FocusEvent](https://developer.mozilla.org/en/docs/Web/API/FocusEvent) to Kotlin
 */
public actual external open class FocusEvent actual constructor(type: String, eventInitDict: FocusEventInit) : UIEvent, JsAny {
    actual open val relatedTarget: EventTarget?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface FocusEventInit : UIEventInit, JsAny {
    actual var relatedTarget: EventTarget? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun FocusEventInit(relatedTarget: EventTarget?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): FocusEventInit = js("({ relatedTarget: relatedTarget, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent) to Kotlin
 */
public actual external open class MouseEvent actual constructor(type: String, eventInitDict: MouseEventInit) : UIEvent, UnionElementOrMouseEvent, JsAny {
    actual open val screenX: Int
    actual open val screenY: Int
    actual open val clientX: Int
    actual open val clientY: Int
    actual open val ctrlKey: Boolean
    actual open val shiftKey: Boolean
    actual open val altKey: Boolean
    actual open val metaKey: Boolean
    actual open val button: Short
    actual open val buttons: Short
    actual open val relatedTarget: EventTarget?
    actual open val region: String?
    actual open val pageX: Double
    actual open val pageY: Double
    actual open val x: Double
    actual open val y: Double
    actual open val offsetX: Double
    actual open val offsetY: Double
    actual fun getModifierState(keyArg: String): Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface MouseEventInit : EventModifierInit, JsAny {
    actual var screenX: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var screenY: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var clientX: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var clientY: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var button: Short? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var buttons: Short? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var relatedTarget: EventTarget? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var region: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MouseEventInit(screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MouseEventInit = js("({ screenX: screenX, screenY: screenY, clientX: clientX, clientY: clientY, button: button, buttons: buttons, relatedTarget: relatedTarget, region: region, ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external interface EventModifierInit : UIEventInit, JsAny {
    actual var ctrlKey: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var shiftKey: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var altKey: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var metaKey: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierAltGraph: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierCapsLock: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierFn: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierFnLock: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierHyper: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierNumLock: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierScrollLock: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierSuper: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierSymbol: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var modifierSymbolLock: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun EventModifierInit(ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): EventModifierInit = js("({ ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [WheelEvent](https://developer.mozilla.org/en/docs/Web/API/WheelEvent) to Kotlin
 */
public actual external open class WheelEvent actual constructor(type: String, eventInitDict: WheelEventInit) : MouseEvent, JsAny {
    actual open val deltaX: Double
    actual open val deltaY: Double
    actual open val deltaZ: Double
    actual open val deltaMode: Int

    actual companion object {
        actual val DOM_DELTA_PIXEL: Int
        actual val DOM_DELTA_LINE: Int
        actual val DOM_DELTA_PAGE: Int
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface WheelEventInit : MouseEventInit, JsAny {
    actual var deltaX: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var deltaY: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var deltaZ: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var deltaMode: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun WheelEventInit(deltaX: Double?, deltaY: Double?, deltaZ: Double?, deltaMode: Int?, screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): WheelEventInit = js("({ deltaX: deltaX, deltaY: deltaY, deltaZ: deltaZ, deltaMode: deltaMode, screenX: screenX, screenY: screenY, clientX: clientX, clientY: clientY, button: button, buttons: buttons, relatedTarget: relatedTarget, region: region, ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [InputEvent](https://developer.mozilla.org/en/docs/Web/API/InputEvent) to Kotlin
 */
public actual external open class InputEvent actual constructor(type: String, eventInitDict: InputEventInit) : UIEvent, JsAny {
    actual open val data: String
    actual open val isComposing: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface InputEventInit : UIEventInit, JsAny {
    actual var data: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var isComposing: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun InputEventInit(data: String?, isComposing: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): InputEventInit = js("({ data: data, isComposing: isComposing, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [KeyboardEvent](https://developer.mozilla.org/en/docs/Web/API/KeyboardEvent) to Kotlin
 */
public actual external open class KeyboardEvent actual constructor(type: String, eventInitDict: KeyboardEventInit) : UIEvent, JsAny {
    actual open val key: String
    actual open val code: String
    actual open val location: Int
    actual open val ctrlKey: Boolean
    actual open val shiftKey: Boolean
    actual open val altKey: Boolean
    actual open val metaKey: Boolean
    actual open val repeat: Boolean
    actual open val isComposing: Boolean
    actual open val charCode: Int
    actual open val keyCode: Int
    actual open val which: Int
    actual fun getModifierState(keyArg: String): Boolean

    actual companion object {
        actual val DOM_KEY_LOCATION_STANDARD: Int
        actual val DOM_KEY_LOCATION_LEFT: Int
        actual val DOM_KEY_LOCATION_RIGHT: Int
        actual val DOM_KEY_LOCATION_NUMPAD: Int
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface KeyboardEventInit : EventModifierInit, JsAny {
    actual var key: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var code: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var location: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var repeat: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var isComposing: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun KeyboardEventInit(key: String?, code: String?, location: Int?, repeat: Boolean?, isComposing: Boolean?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): KeyboardEventInit = js("({ key: key, code: code, location: location, repeat: repeat, isComposing: isComposing, ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [CompositionEvent](https://developer.mozilla.org/en/docs/Web/API/CompositionEvent) to Kotlin
 */
public actual external open class CompositionEvent actual constructor(type: String, eventInitDict: CompositionEventInit) : UIEvent, JsAny {
    actual open val data: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface CompositionEventInit : UIEventInit, JsAny {
    actual var data: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun CompositionEventInit(data: String?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): CompositionEventInit = js("({ data: data, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
public actual external open class Event actual constructor(type: String, eventInitDict: EventInit) : JsAny {
    actual open val type: String
    actual open val target: EventTarget?
    actual open val currentTarget: EventTarget?
    actual open val eventPhase: Short
    actual open val bubbles: Boolean
    actual open val cancelable: Boolean
    actual open val defaultPrevented: Boolean
    actual open val composed: Boolean
    actual open val isTrusted: Boolean
    actual open val timeStamp: JsNumber
    actual fun composedPath(): JsArray<EventTarget>
    actual fun stopPropagation()
    actual fun stopImmediatePropagation()
    actual fun preventDefault()
    actual fun initEvent(type: String, bubbles: Boolean, cancelable: Boolean)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

/**
 * Exposes the JavaScript [EventTarget](https://developer.mozilla.org/en/docs/Web/API/EventTarget) to Kotlin
 */
public actual external abstract class EventTarget : JsAny {
    actual fun addEventListener(type: String, callback: EventListener?, options: AddEventListenerOptions)
    actual fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: AddEventListenerOptions)
    actual fun addEventListener(type: String, callback: EventListener?, options: Boolean)
    actual fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: Boolean)
    actual fun addEventListener(type: String, callback: EventListener?)
    actual fun addEventListener(type: String, callback: ((Event) -> Unit)?)
    actual fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)
    actual fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: EventListenerOptions)
    actual fun removeEventListener(type: String, callback: EventListener?, options: Boolean)
    actual fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: Boolean)
    actual fun removeEventListener(type: String, callback: EventListener?)
    actual fun removeEventListener(type: String, callback: ((Event) -> Unit)?)
    actual fun dispatchEvent(event: Event): Boolean
}

/**
 * Exposes the JavaScript [EventListener](https://developer.mozilla.org/en/docs/Web/API/EventListener) to Kotlin
 */
public actual external interface EventListener : JsAny {
    actual fun handleEvent(event: Event)
}