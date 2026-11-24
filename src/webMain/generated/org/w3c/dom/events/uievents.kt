/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'uievents', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.events

import org.w3c.dom.*

/**
 * The UIEvent interface represents simple user interface events. It is part of the UI Events API, which includes
 * various event types and interfaces related to user interactions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent)
 */
public open external class UIEvent : Event {
    /**
     * The UIEvent() constructor creates a new UIEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/UIEvent)
     */
    public constructor(type: String, eventInitDict: UIEventInit = definedExternally)

    /**
     * The UIEvent.view read-only property returns the WindowProxy object from which the event was generated. In
     * browsers, this is the Window object the event happened in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/view)
     */
    public open val view: Window?

    /**
     * The UIEvent.detail read-only property, when non-zero, provides the current (or next, depending on the event)
     * click count.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail)
     */
    public open val detail: Int

    /**
     * The UIEvent.initUIEvent() method initializes a UI event once it's been created.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/initUIEvent)
     */
    public open fun initUIEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, detailArg: Int = definedExternally)

    /**
     * The UIEvent.which read-only property of the UIEvent interface returns a number that indicates which button was
     * pressed on the mouse, or the numeric keyCode or the character code (charCode) of the key pressed on the keyboard.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/which)
     */
    public open val which: Int

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface UIEventInit : EventInit {
    public var view: Window?
    public var detail: Int?
    public var which: Int?
}

public fun UIEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null): UIEventInit = newJsObject<UIEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (view != null) this.view = view
    if (detail != null) this.detail = detail
    if (which != null) this.which = which
}

/**
 * The FocusEvent interface represents focus-related events, including focus, blur, focusin, and focusout.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 */
public open external class FocusEvent : UIEvent {
    /**
     * The FocusEvent() constructor returns a newly created FocusEvent object with an optional EventTarget. When the
     * event has both a source and a destination, the relatedTarget value must be set to the other target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/FocusEvent)
     */
    public constructor(type: String, eventInitDict: FocusEventInit = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget)
     */
    public open val relatedTarget: EventTarget?

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface FocusEventInit : UIEventInit {
    public var relatedTarget: EventTarget?
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

/**
 * The InputEvent interface represents an event notifying the user of editable content changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent)
 */
public open external class InputEvent : UIEvent {
    /**
     * The InputEvent() constructor creates a new InputEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent)
     */
    public constructor(type: String, eventInitDict: InputEventInit = definedExternally)

    /**
     * The data read-only property of the InputEvent interface returns a string with inserted characters. This may be an
     * empty string if the change doesn't insert text, such as when characters are deleted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/data)
     */
    public open val data: String?

    /**
     * The InputEvent.isComposing read-only property returns a boolean value indicating if the event is fired after
     * compositionstart and before compositionend.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/isComposing)
     */
    public open val isComposing: Boolean

    /**
     * The inputType read-only property of the InputEvent interface returns the type of change made to editable content.
     * Possible changes include for example inserting, deleting, and formatting text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/inputType)
     */
    public open val inputType: String

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface InputEventInit : UIEventInit {
    public var data: String?
    public var isComposing: Boolean?
    public var inputType: String?
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

/**
 * KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction
 * between the user and a key (or combination of a key with modifier keys) on the keyboard. The event type (keydown,
 * keypress, or keyup) identifies what kind of keyboard activity occurred.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent)
 */
public open external class KeyboardEvent : UIEvent {
    /**
     * The KeyboardEvent() constructor creates a new KeyboardEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent)
     */
    public constructor(type: String, eventInitDict: KeyboardEventInit = definedExternally)

    /**
     * The KeyboardEvent interface's key read-only property returns the value of the key pressed by the user, taking
     * into consideration the state of modifier keys such as Shift as well as the keyboard locale and layout.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/key)
     */
    public open val key: String

    /**
     * The code read-only property of the KeyboardEvent interface represents a physical key on the keyboard (as opposed
     * to the character generated by pressing the key). In other words, this property returns a value that isn't altered
     * by keyboard layout or the state of the modifier keys.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/code)
     */
    public open val code: String

    /**
     * The KeyboardEvent.location read-only property returns an unsigned long representing the location of the key on
     * the keyboard or other input device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/location)
     */
    public open val location: Int

    /**
     * The KeyboardEvent.ctrlKey read-only property returns a boolean value that indicates if the control key was
     * pressed (true) or not (false) when the event occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/ctrlKey)
     */
    public open val ctrlKey: Boolean

    /**
     * The KeyboardEvent.shiftKey read-only property is a boolean value that indicates if the shift key was pressed
     * (true) or not (false) when the event occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/shiftKey)
     */
    public open val shiftKey: Boolean

    /**
     * The KeyboardEvent.altKey read-only property is a boolean value that indicates if the alt key (Option or ⌥ on
     * macOS) was pressed (true) or not (false) when the event occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/altKey)
     */
    public open val altKey: Boolean

    /**
     * The KeyboardEvent.metaKey read-only property returning a boolean value that indicates if the Meta key was pressed
     * (true) or not (false) when the event occurred. Some operating systems may intercept the key so it is never
     * detected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/metaKey)
     */
    public open val metaKey: Boolean

    /**
     * The repeat read-only property of the KeyboardEvent interface returns a boolean value that is true if the given
     * key is being held down such that it is automatically repeating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/repeat)
     */
    public open val repeat: Boolean

    /**
     * The KeyboardEvent.isComposing read-only property returns a boolean value indicating if the event is fired within
     * a composition session, i.e., after compositionstart and before compositionend.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/isComposing)
     */
    public open val isComposing: Boolean

    /**
     * The KeyboardEvent.getModifierState() method returns the current state of the specified modifier key: true if the
     * modifier is active (that is the modifier key is pressed or locked), otherwise, false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/getModifierState)
     */
    public open fun getModifierState(keyArg: String): Boolean

    /**
     * The KeyboardEvent.initKeyboardEvent() method initializes the attributes of a keyboard event object. This method
     * was introduced in draft of DOM Level 3 Events, but deprecated in newer draft. Gecko won't support this feature
     * since implementing this method as experimental broke existing web apps (see Firefox bug 999645). Web applications
     * should use constructor instead of this if it's available.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/initKeyboardEvent)
     */
    public open fun initKeyboardEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, keyArg: String = definedExternally, locationArg: Int = definedExternally, ctrlKey: Boolean = definedExternally, altKey: Boolean = definedExternally, shiftKey: Boolean = definedExternally, metaKey: Boolean = definedExternally)

    /**
     * The charCode read-only property of the KeyboardEvent interface returns the Unicode value of a character key
     * pressed during a keypress event.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charCode)
     */
    public open val charCode: Int

    /**
     * The deprecated KeyboardEvent.keyCode read-only property represents a system and implementation dependent
     * numerical code identifying the unmodified value of the pressed key.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keyCode)
     */
    public open val keyCode: Int

    public companion object {
        public val DOM_KEY_LOCATION_STANDARD: Int
        public val DOM_KEY_LOCATION_LEFT: Int
        public val DOM_KEY_LOCATION_RIGHT: Int
        public val DOM_KEY_LOCATION_NUMPAD: Int
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface KeyboardEventInit : EventModifierInit {
    public var key: String?
    public var code: String?
    public var location: Int?
    public var repeat: Boolean?
    public var isComposing: Boolean?
    public var charCode: Int?
    public var keyCode: Int?
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
    public var ctrlKey: Boolean?
    public var shiftKey: Boolean?
    public var altKey: Boolean?
    public var metaKey: Boolean?
    public var modifierAltGraph: Boolean?
    public var modifierCapsLock: Boolean?
    public var modifierFn: Boolean?
    public var modifierFnLock: Boolean?
    public var modifierHyper: Boolean?
    public var modifierNumLock: Boolean?
    public var modifierScrollLock: Boolean?
    public var modifierSuper: Boolean?
    public var modifierSymbol: Boolean?
    public var modifierSymbolLock: Boolean?
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

/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
 */
public open external class CompositionEvent : UIEvent {
    /**
     * The CompositionEvent() constructor creates a new CompositionEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/CompositionEvent)
     */
    public constructor(type: String, eventInitDict: CompositionEventInit = definedExternally)

    /**
     * The data read-only property of the CompositionEvent interface returns the characters generated by the input
     * method that raised the event; its exact nature varies depending on the type of event that generated the
     * CompositionEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data)
     */
    public open val data: String

    /**
     * The initCompositionEvent() method of the CompositionEvent interface initializes the attributes of a
     * CompositionEvent object instance.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/initCompositionEvent)
     */
    public open fun initCompositionEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, dataArg: String = definedExternally)

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface CompositionEventInit : UIEventInit {
    public var data: String?
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

/**
 * The TextEvent interface is a legacy UI event interface for reporting changes to text UI elements.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent)
 */
public abstract external class TextEvent : UIEvent {
    /**
     * The data read-only property of the TextEvent interface returns the last character added to the input element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent/data)
     */
    public open val data: String

    /**
     * The initTextEventEvent() method of the TextEvent interface initializes the value of a TextEvent after it has been
     * created.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent/initTextEvent)
     */
    public open fun initTextEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, view: Window? = definedExternally, data: String = definedExternally)

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}
