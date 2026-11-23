/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'uievents', DO NOT EDIT!

package org.w3c.dom.events

import org.w3c.dom.*

public external open class UIEvent : Event {
    constructor(type: String, eventInitDict: UIEventInit = definedExternally)
    open val view: Window?
    open val detail: Int
    open fun initUIEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, detailArg: Int = definedExternally)
    open val which: Int

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface UIEventInit : EventInit {
    var view: Window?
    var detail: Int?
    var which: Int?
}

public fun UIEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null): UIEventInit = newJsObject<UIEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (view != null) this.view = view
    if (detail != null) this.detail = detail
    if (which != null) this.which = which
}

public external open class FocusEvent : UIEvent {
    constructor(type: String, eventInitDict: FocusEventInit = definedExternally)
    open val relatedTarget: EventTarget?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface FocusEventInit : UIEventInit {
    var relatedTarget: EventTarget?
}

public fun FocusEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, relatedTarget: EventTarget? = null): FocusEventInit = newJsObject<FocusEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (view != null) this.view = view
    if (detail != null) this.detail = detail
    if (which != null) this.which = which
    if (relatedTarget != null) this.relatedTarget = relatedTarget
}

public external open class InputEvent : UIEvent {
    constructor(type: String, eventInitDict: InputEventInit = definedExternally)
    open val data: String?
    open val isComposing: Boolean
    open val inputType: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface InputEventInit : UIEventInit {
    var data: String?
    var isComposing: Boolean?
    var inputType: String?
}

public fun InputEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, data: String? = null, isComposing: Boolean? = null, inputType: String? = null): InputEventInit = newJsObject<InputEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (view != null) this.view = view
    if (detail != null) this.detail = detail
    if (which != null) this.which = which
    if (data != null) this.data = data
    if (isComposing != null) this.isComposing = isComposing
    if (inputType != null) this.inputType = inputType
}

public external open class KeyboardEvent : UIEvent {
    constructor(type: String, eventInitDict: KeyboardEventInit = definedExternally)
    open val key: String
    open val code: String
    open val location: Int
    open val ctrlKey: Boolean
    open val shiftKey: Boolean
    open val altKey: Boolean
    open val metaKey: Boolean
    open val repeat: Boolean
    open val isComposing: Boolean
    open fun getModifierState(keyArg: String): Boolean
    open fun initKeyboardEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, keyArg: String = definedExternally, locationArg: Int = definedExternally, ctrlKey: Boolean = definedExternally, altKey: Boolean = definedExternally, shiftKey: Boolean = definedExternally, metaKey: Boolean = definedExternally)
    open val charCode: Int
    open val keyCode: Int

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

public external interface KeyboardEventInit : EventModifierInit {
    var key: String?
    var code: String?
    var location: Int?
    var repeat: Boolean?
    var isComposing: Boolean?
    var charCode: Int?
    var keyCode: Int?
}

public fun KeyboardEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, key: String? = null, code: String? = null, location: Int? = null, repeat: Boolean? = null, isComposing: Boolean? = null, charCode: Int? = null, keyCode: Int? = null): KeyboardEventInit = newJsObject<KeyboardEventInit>().apply {
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
    if (key != null) this.key = key
    if (code != null) this.code = code
    if (location != null) this.location = location
    if (repeat != null) this.repeat = repeat
    if (isComposing != null) this.isComposing = isComposing
    if (charCode != null) this.charCode = charCode
    if (keyCode != null) this.keyCode = keyCode
}

public external interface EventModifierInit : UIEventInit {
    var ctrlKey: Boolean?
    var shiftKey: Boolean?
    var altKey: Boolean?
    var metaKey: Boolean?
    var modifierAltGraph: Boolean?
    var modifierCapsLock: Boolean?
    var modifierFn: Boolean?
    var modifierFnLock: Boolean?
    var modifierHyper: Boolean?
    var modifierNumLock: Boolean?
    var modifierScrollLock: Boolean?
    var modifierSuper: Boolean?
    var modifierSymbol: Boolean?
    var modifierSymbolLock: Boolean?
}

public fun EventModifierInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null): EventModifierInit = newJsObject<EventModifierInit>().apply {
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
}

public external open class CompositionEvent : UIEvent {
    constructor(type: String, eventInitDict: CompositionEventInit = definedExternally)
    open val data: String
    open fun initCompositionEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, dataArg: String = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface CompositionEventInit : UIEventInit {
    var data: String?
}

public fun CompositionEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, data: String? = null): CompositionEventInit = newJsObject<CompositionEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (view != null) this.view = view
    if (detail != null) this.detail = detail
    if (which != null) this.which = which
    if (data != null) this.data = data
}

public external abstract class TextEvent : UIEvent {
    open val data: String
    open fun initTextEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, view: Window? = definedExternally, data: String = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}
