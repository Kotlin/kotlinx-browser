/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
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
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class UIEvent : Event {
    /**
     * The UIEvent() constructor creates a new UIEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/UIEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: UIEventInit = definedExternally)

    /**
     * The UIEvent.view read-only property returns the WindowProxy object from which the event was generated. In
     * browsers, this is the Window object the event happened in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/view)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val view: Window?

    /**
     * The UIEvent.detail read-only property, when non-zero, provides the current (or next, depending on the event)
     * click count.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val detail: Int

    /**
     * The UIEvent.initUIEvent() method initializes a UI event once it's been created.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/initUIEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun initUIEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, detailArg: Int = definedExternally)

    /**
     * The UIEvent.which read-only property of the UIEvent interface returns a number that indicates which button was
     * pressed on the mouse, or the numeric keyCode or the character code (charCode) of the key pressed on the keyboard.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/which)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

public fun UIEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null): UIEventInit {
    val dictionary = newJsObject<UIEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (view != null) dictionary.view = view
    if (detail != null) dictionary.detail = detail
    if (which != null) dictionary.which = which
    return dictionary
}

/**
 * The FocusEvent interface represents focus-related events, including focus, blur, focusin, and focusout.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class FocusEvent : UIEvent {
    /**
     * The FocusEvent() constructor returns a newly created FocusEvent object with an optional EventTarget. When the
     * event has both a source and a destination, the relatedTarget value must be set to the other target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/FocusEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: FocusEventInit = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FocusEvent/relatedTarget)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

public fun FocusEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, relatedTarget: EventTarget? = null): FocusEventInit {
    val dictionary = newJsObject<FocusEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (view != null) dictionary.view = view
    if (detail != null) dictionary.detail = detail
    if (which != null) dictionary.which = which
    if (relatedTarget != null) dictionary.relatedTarget = relatedTarget
    return dictionary
}

/**
 * The InputEvent interface represents an event notifying the user of editable content changes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class InputEvent : UIEvent {
    /**
     * The InputEvent() constructor creates a new InputEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/InputEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: InputEventInit = definedExternally)

    /**
     * The data read-only property of the InputEvent interface returns a string with inserted characters. This may be an
     * empty string if the change doesn't insert text, such as when characters are deleted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/data)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val data: String?

    /**
     * The InputEvent.isComposing read-only property returns a boolean value indicating if the event is fired after
     * compositionstart and before compositionend.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/isComposing)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val isComposing: Boolean

    /**
     * The inputType read-only property of the InputEvent interface returns the type of change made to editable content.
     * Possible changes include for example inserting, deleting, and formatting text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputEvent/inputType)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

public fun InputEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, data: String? = null, isComposing: Boolean? = null, inputType: String? = null): InputEventInit {
    val dictionary = newJsObject<InputEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (view != null) dictionary.view = view
    if (detail != null) dictionary.detail = detail
    if (which != null) dictionary.which = which
    if (data != null) dictionary.data = data
    if (isComposing != null) dictionary.isComposing = isComposing
    if (inputType != null) dictionary.inputType = inputType
    return dictionary
}

/**
 * KeyboardEvent objects describe a user interaction with the keyboard; each event describes a single interaction
 * between the user and a key (or combination of a key with modifier keys) on the keyboard. The event type (keydown,
 * keypress, or keyup) identifies what kind of keyboard activity occurred.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class KeyboardEvent : UIEvent {
    /**
     * The KeyboardEvent() constructor creates a new KeyboardEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/KeyboardEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: KeyboardEventInit = definedExternally)

    /**
     * The KeyboardEvent interface's key read-only property returns the value of the key pressed by the user, taking
     * into consideration the state of modifier keys such as Shift as well as the keyboard locale and layout.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/key)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val key: String

    /**
     * The code read-only property of the KeyboardEvent interface represents a physical key on the keyboard (as opposed
     * to the character generated by pressing the key). In other words, this property returns a value that isn't altered
     * by keyboard layout or the state of the modifier keys.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/code)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val code: String

    /**
     * The KeyboardEvent.location read-only property returns an unsigned long representing the location of the key on
     * the keyboard or other input device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/location)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val location: Int

    /**
     * The KeyboardEvent.ctrlKey read-only property returns a boolean value that indicates if the control key was
     * pressed (true) or not (false) when the event occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/ctrlKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val ctrlKey: Boolean

    /**
     * The KeyboardEvent.shiftKey read-only property is a boolean value that indicates if the shift key was pressed
     * (true) or not (false) when the event occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/shiftKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val shiftKey: Boolean

    /**
     * The KeyboardEvent.altKey read-only property is a boolean value that indicates if the alt key (Option or ⌥ on
     * macOS) was pressed (true) or not (false) when the event occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/altKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val altKey: Boolean

    /**
     * The KeyboardEvent.metaKey read-only property returning a boolean value that indicates if the Meta key was pressed
     * (true) or not (false) when the event occurred. Some operating systems may intercept the key so it is never
     * detected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/metaKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val metaKey: Boolean

    /**
     * The repeat read-only property of the KeyboardEvent interface returns a boolean value that is true if the given
     * key is being held down such that it is automatically repeating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/repeat)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val repeat: Boolean

    /**
     * The KeyboardEvent.isComposing read-only property returns a boolean value indicating if the event is fired within
     * a composition session, i.e., after compositionstart and before compositionend.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/isComposing)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val isComposing: Boolean

    /**
     * The KeyboardEvent.getModifierState() method returns the current state of the specified modifier key: true if the
     * modifier is active (that is the modifier key is pressed or locked), otherwise, false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/getModifierState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun initKeyboardEvent(typeArg: String, bubblesArg: Boolean = definedExternally, cancelableArg: Boolean = definedExternally, viewArg: Window? = definedExternally, keyArg: String = definedExternally, locationArg: Int = definedExternally, ctrlKey: Boolean = definedExternally, altKey: Boolean = definedExternally, shiftKey: Boolean = definedExternally, metaKey: Boolean = definedExternally)

    /**
     * The charCode read-only property of the KeyboardEvent interface returns the Unicode value of a character key
     * pressed during a keypress event.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/charCode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val charCode: Int

    /**
     * The deprecated KeyboardEvent.keyCode read-only property represents a system and implementation dependent
     * numerical code identifying the unmodified value of the pressed key.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/KeyboardEvent/keyCode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

public fun KeyboardEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, key: String? = null, code: String? = null, location: Int? = null, repeat: Boolean? = null, isComposing: Boolean? = null, charCode: Int? = null, keyCode: Int? = null): KeyboardEventInit {
    val dictionary = newJsObject<KeyboardEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (view != null) dictionary.view = view
    if (detail != null) dictionary.detail = detail
    if (which != null) dictionary.which = which
    if (ctrlKey != null) dictionary.ctrlKey = ctrlKey
    if (shiftKey != null) dictionary.shiftKey = shiftKey
    if (altKey != null) dictionary.altKey = altKey
    if (metaKey != null) dictionary.metaKey = metaKey
    if (modifierAltGraph != null) dictionary.modifierAltGraph = modifierAltGraph
    if (modifierCapsLock != null) dictionary.modifierCapsLock = modifierCapsLock
    if (modifierFn != null) dictionary.modifierFn = modifierFn
    if (modifierFnLock != null) dictionary.modifierFnLock = modifierFnLock
    if (modifierHyper != null) dictionary.modifierHyper = modifierHyper
    if (modifierNumLock != null) dictionary.modifierNumLock = modifierNumLock
    if (modifierScrollLock != null) dictionary.modifierScrollLock = modifierScrollLock
    if (modifierSuper != null) dictionary.modifierSuper = modifierSuper
    if (modifierSymbol != null) dictionary.modifierSymbol = modifierSymbol
    if (modifierSymbolLock != null) dictionary.modifierSymbolLock = modifierSymbolLock
    if (key != null) dictionary.key = key
    if (code != null) dictionary.code = code
    if (location != null) dictionary.location = location
    if (repeat != null) dictionary.repeat = repeat
    if (isComposing != null) dictionary.isComposing = isComposing
    if (charCode != null) dictionary.charCode = charCode
    if (keyCode != null) dictionary.keyCode = keyCode
    return dictionary
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

public fun EventModifierInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null): EventModifierInit {
    val dictionary = newJsObject<EventModifierInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (view != null) dictionary.view = view
    if (detail != null) dictionary.detail = detail
    if (which != null) dictionary.which = which
    if (ctrlKey != null) dictionary.ctrlKey = ctrlKey
    if (shiftKey != null) dictionary.shiftKey = shiftKey
    if (altKey != null) dictionary.altKey = altKey
    if (metaKey != null) dictionary.metaKey = metaKey
    if (modifierAltGraph != null) dictionary.modifierAltGraph = modifierAltGraph
    if (modifierCapsLock != null) dictionary.modifierCapsLock = modifierCapsLock
    if (modifierFn != null) dictionary.modifierFn = modifierFn
    if (modifierFnLock != null) dictionary.modifierFnLock = modifierFnLock
    if (modifierHyper != null) dictionary.modifierHyper = modifierHyper
    if (modifierNumLock != null) dictionary.modifierNumLock = modifierNumLock
    if (modifierScrollLock != null) dictionary.modifierScrollLock = modifierScrollLock
    if (modifierSuper != null) dictionary.modifierSuper = modifierSuper
    if (modifierSymbol != null) dictionary.modifierSymbol = modifierSymbol
    if (modifierSymbolLock != null) dictionary.modifierSymbolLock = modifierSymbolLock
    return dictionary
}

/**
 * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class CompositionEvent : UIEvent {
    /**
     * The CompositionEvent() constructor creates a new CompositionEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/CompositionEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: CompositionEventInit = definedExternally)

    /**
     * The data read-only property of the CompositionEvent interface returns the characters generated by the input
     * method that raised the event; its exact nature varies depending on the type of event that generated the
     * CompositionEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val data: String

    /**
     * The initCompositionEvent() method of the CompositionEvent interface initializes the attributes of a
     * CompositionEvent object instance.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/initCompositionEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

public fun CompositionEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, data: String? = null): CompositionEventInit {
    val dictionary = newJsObject<CompositionEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (view != null) dictionary.view = view
    if (detail != null) dictionary.detail = detail
    if (which != null) dictionary.which = which
    if (data != null) dictionary.data = data
    return dictionary
}

/**
 * The TextEvent interface is a legacy UI event interface for reporting changes to text UI elements.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class TextEvent : UIEvent {
    /**
     * The data read-only property of the TextEvent interface returns the last character added to the input element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent/data)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val data: String

    /**
     * The initTextEventEvent() method of the TextEvent interface initializes the value of a TextEvent after it has been
     * created.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent/initTextEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun initTextEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, view: Window? = definedExternally, data: String = definedExternally)

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}
