/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.events

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*

/**
 * Exposes the JavaScript [UIEvent](https://developer.mozilla.org/en/docs/Web/API/UIEvent) to Kotlin
 */
actual external open class UIEvent actual constructor(type: String, eventInitDict: UIEventInit) : Event {
    actual open val view: Window?
    actual open val detail: Int

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface UIEventInit : EventInit {
    actual var view: Window? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var detail: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun UIEventInit(view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): UIEventInit {
    val o = js("({})")
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as UIEventInit
}

/**
 * Exposes the JavaScript [FocusEvent](https://developer.mozilla.org/en/docs/Web/API/FocusEvent) to Kotlin
 */
actual external open class FocusEvent actual constructor(type: String, eventInitDict: FocusEventInit) : UIEvent {
    actual open val relatedTarget: EventTarget?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface FocusEventInit : UIEventInit {
    actual var relatedTarget: EventTarget? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun FocusEventInit(relatedTarget: EventTarget?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): FocusEventInit {
    val o = js("({})")
    o["relatedTarget"] = relatedTarget
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as FocusEventInit
}

/**
 * Exposes the JavaScript [MouseEvent](https://developer.mozilla.org/en/docs/Web/API/MouseEvent) to Kotlin
 */
actual external open class MouseEvent actual constructor(type: String, eventInitDict: MouseEventInit) : UIEvent, UnionElementOrMouseEvent {
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

actual external interface MouseEventInit : EventModifierInit {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MouseEventInit(screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MouseEventInit {
    val o = js("({})")
    o["screenX"] = screenX
    o["screenY"] = screenY
    o["clientX"] = clientX
    o["clientY"] = clientY
    o["button"] = button
    o["buttons"] = buttons
    o["relatedTarget"] = relatedTarget
    o["region"] = region
    o["ctrlKey"] = ctrlKey
    o["shiftKey"] = shiftKey
    o["altKey"] = altKey
    o["metaKey"] = metaKey
    o["modifierAltGraph"] = modifierAltGraph
    o["modifierCapsLock"] = modifierCapsLock
    o["modifierFn"] = modifierFn
    o["modifierFnLock"] = modifierFnLock
    o["modifierHyper"] = modifierHyper
    o["modifierNumLock"] = modifierNumLock
    o["modifierScrollLock"] = modifierScrollLock
    o["modifierSuper"] = modifierSuper
    o["modifierSymbol"] = modifierSymbol
    o["modifierSymbolLock"] = modifierSymbolLock
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as MouseEventInit
}

actual external interface EventModifierInit : UIEventInit {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun EventModifierInit(ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): EventModifierInit {
    val o = js("({})")
    o["ctrlKey"] = ctrlKey
    o["shiftKey"] = shiftKey
    o["altKey"] = altKey
    o["metaKey"] = metaKey
    o["modifierAltGraph"] = modifierAltGraph
    o["modifierCapsLock"] = modifierCapsLock
    o["modifierFn"] = modifierFn
    o["modifierFnLock"] = modifierFnLock
    o["modifierHyper"] = modifierHyper
    o["modifierNumLock"] = modifierNumLock
    o["modifierScrollLock"] = modifierScrollLock
    o["modifierSuper"] = modifierSuper
    o["modifierSymbol"] = modifierSymbol
    o["modifierSymbolLock"] = modifierSymbolLock
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as EventModifierInit
}

/**
 * Exposes the JavaScript [WheelEvent](https://developer.mozilla.org/en/docs/Web/API/WheelEvent) to Kotlin
 */
actual external open class WheelEvent actual constructor(type: String, eventInitDict: WheelEventInit) : MouseEvent {
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

actual external interface WheelEventInit : MouseEventInit {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun WheelEventInit(deltaX: Double?, deltaY: Double?, deltaZ: Double?, deltaMode: Int?, screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): WheelEventInit {
    val o = js("({})")
    o["deltaX"] = deltaX
    o["deltaY"] = deltaY
    o["deltaZ"] = deltaZ
    o["deltaMode"] = deltaMode
    o["screenX"] = screenX
    o["screenY"] = screenY
    o["clientX"] = clientX
    o["clientY"] = clientY
    o["button"] = button
    o["buttons"] = buttons
    o["relatedTarget"] = relatedTarget
    o["region"] = region
    o["ctrlKey"] = ctrlKey
    o["shiftKey"] = shiftKey
    o["altKey"] = altKey
    o["metaKey"] = metaKey
    o["modifierAltGraph"] = modifierAltGraph
    o["modifierCapsLock"] = modifierCapsLock
    o["modifierFn"] = modifierFn
    o["modifierFnLock"] = modifierFnLock
    o["modifierHyper"] = modifierHyper
    o["modifierNumLock"] = modifierNumLock
    o["modifierScrollLock"] = modifierScrollLock
    o["modifierSuper"] = modifierSuper
    o["modifierSymbol"] = modifierSymbol
    o["modifierSymbolLock"] = modifierSymbolLock
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as WheelEventInit
}

/**
 * Exposes the JavaScript [InputEvent](https://developer.mozilla.org/en/docs/Web/API/InputEvent) to Kotlin
 */
actual external open class InputEvent actual constructor(type: String, eventInitDict: InputEventInit) : UIEvent {
    actual open val data: String
    actual open val isComposing: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface InputEventInit : UIEventInit {
    actual var data: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var isComposing: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun InputEventInit(data: String?, isComposing: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): InputEventInit {
    val o = js("({})")
    o["data"] = data
    o["isComposing"] = isComposing
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as InputEventInit
}

/**
 * Exposes the JavaScript [KeyboardEvent](https://developer.mozilla.org/en/docs/Web/API/KeyboardEvent) to Kotlin
 */
actual external open class KeyboardEvent actual constructor(type: String, eventInitDict: KeyboardEventInit) : UIEvent {
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

actual external interface KeyboardEventInit : EventModifierInit {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun KeyboardEventInit(key: String?, code: String?, location: Int?, repeat: Boolean?, isComposing: Boolean?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): KeyboardEventInit {
    val o = js("({})")
    o["key"] = key
    o["code"] = code
    o["location"] = location
    o["repeat"] = repeat
    o["isComposing"] = isComposing
    o["ctrlKey"] = ctrlKey
    o["shiftKey"] = shiftKey
    o["altKey"] = altKey
    o["metaKey"] = metaKey
    o["modifierAltGraph"] = modifierAltGraph
    o["modifierCapsLock"] = modifierCapsLock
    o["modifierFn"] = modifierFn
    o["modifierFnLock"] = modifierFnLock
    o["modifierHyper"] = modifierHyper
    o["modifierNumLock"] = modifierNumLock
    o["modifierScrollLock"] = modifierScrollLock
    o["modifierSuper"] = modifierSuper
    o["modifierSymbol"] = modifierSymbol
    o["modifierSymbolLock"] = modifierSymbolLock
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as KeyboardEventInit
}

/**
 * Exposes the JavaScript [CompositionEvent](https://developer.mozilla.org/en/docs/Web/API/CompositionEvent) to Kotlin
 */
actual external open class CompositionEvent actual constructor(type: String, eventInitDict: CompositionEventInit) : UIEvent {
    actual open val data: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface CompositionEventInit : UIEventInit {
    actual var data: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun CompositionEventInit(data: String?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): CompositionEventInit {
    val o = js("({})")
    o["data"] = data
    o["view"] = view
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as CompositionEventInit
}

/**
 * Exposes the JavaScript [Event](https://developer.mozilla.org/en/docs/Web/API/Event) to Kotlin
 */
actual external open class Event actual constructor(type: String, eventInitDict: EventInit) {
    actual open val type: String
    actual open val target: EventTarget?
    actual open val currentTarget: EventTarget?
    actual open val eventPhase: Short
    actual open val bubbles: Boolean
    actual open val cancelable: Boolean
    actual open val defaultPrevented: Boolean
    actual open val composed: Boolean
    actual open val isTrusted: Boolean
    actual open val timeStamp: Number
    actual fun composedPath(): Array<EventTarget>
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
actual external abstract class EventTarget {
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun addEventListener(type: String, callback: EventListener?, options: dynamic)
    actual fun addEventListener(type: String, callback: ((Event) -> Unit)?, options: dynamic)
    actual fun addEventListener(type: String, callback: EventListener?)
    actual fun addEventListener(type: String, callback: ((Event) -> Unit)?)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun removeEventListener(type: String, callback: EventListener?, options: dynamic)
    actual fun removeEventListener(type: String, callback: ((Event) -> Unit)?, options: dynamic)
    actual fun removeEventListener(type: String, callback: EventListener?)
    actual fun removeEventListener(type: String, callback: ((Event) -> Unit)?)
    actual fun dispatchEvent(event: Event): Boolean
}

/**
 * Exposes the JavaScript [EventListener](https://developer.mozilla.org/en/docs/Web/API/EventListener) to Kotlin
 */
actual external interface EventListener {
    actual fun handleEvent(event: Event)
}