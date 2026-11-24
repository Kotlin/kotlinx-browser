/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'dom', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.pointerevents.*
import org.w3c.dom.svg.*
import org.w3c.fullscreen.*

public external interface HTMLOrSVGScriptElement : JsAny

/**
 * The Event interface represents an event which takes place on an EventTarget.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event)
 */
public open external class Event : JsAny {
    /**
     * The Event() constructor creates a new Event object. An event created in this way is called a synthetic event, as
     * opposed to an event fired by the browser, and can be dispatched by a script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/Event)
     */
    public constructor(type: String, eventInitDict: EventInit = definedExternally)

    /**
     * The type read-only property of the Event interface returns a string containing the event's type. It is set when
     * the event is constructed and is the name commonly used to refer to the specific event, such as click, load, or
     * error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/type)
     */
    public open val type: String

    /**
     * The read-only target property of the Event interface is a reference to the object onto which the event was
     * dispatched. It is different from Event.currentTarget when the event handler is called during the bubbling or
     * capturing phase of the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/target)
     */
    public open val target: EventTarget?

    /**
     * The srcElement read-only property of the Event interface is a deprecated alias for the Event.target property. Use
     * Event.target instead.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/srcElement)
     */
    public open val srcElement: EventTarget?

    /**
     * The currentTarget read-only property of the Event interface identifies the element to which the event handler has
     * been attached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/currentTarget)
     */
    public open val currentTarget: EventTarget?

    /**
     * The composedPath() method of the Event interface returns the event's path which is an array of the objects on
     * which listeners will be invoked. This does not include nodes in shadow trees if the shadow root was created with
     * its ShadowRoot.mode closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/composedPath)
     */
    public open fun composedPath(): JsArray<EventTarget>

    /**
     * The eventPhase read-only property of the Event interface indicates which phase of the event flow is currently
     * being evaluated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/eventPhase)
     */
    public open val eventPhase: Short

    /**
     * The stopPropagation() method of the Event interface prevents further propagation of the current event in the
     * capturing and bubbling phases. It does not, however, prevent any default behaviors from occurring; for instance,
     * clicks on links are still processed. If you want to stop those behaviors, see the preventDefault() method. It
     * also does not prevent propagation to other event-handlers of the current element. If you want to stop those, see
     * stopImmediatePropagation().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/stopPropagation)
     */
    public open fun stopPropagation()

    /**
     * The cancelBubble property of the Event interface is deprecated. Use Event.stopPropagation() instead. Setting its
     * value to true before returning from an event handler prevents propagation of the event. In later implementations,
     * setting this to false does nothing. See Browser compatibility for details.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/cancelBubble)
     */
    public open var cancelBubble: Boolean

    /**
     * The stopImmediatePropagation() method of the Event interface prevents other listeners of the same event from
     * being called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/stopImmediatePropagation)
     */
    public open fun stopImmediatePropagation()

    /**
     * The bubbles read-only property of the Event interface indicates whether the event bubbles up through the DOM tree
     * or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/bubbles)
     */
    public open val bubbles: Boolean

    /**
     * The cancelable read-only property of the Event interface indicates whether the event can be canceled, and
     * therefore prevented as if the event never happened.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/cancelable)
     */
    public open val cancelable: Boolean

    /**
     * The Event property returnValue indicates whether the default action for this event has been prevented or not.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/returnValue)
     */
    public open var returnValue: Boolean

    /**
     * The preventDefault() method of the Event interface tells the user agent that the event is being explicitly
     * handled, so its default action, such as page scrolling, link navigation, or pasting text, should not be taken.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/preventDefault)
     */
    public open fun preventDefault()

    /**
     * The defaultPrevented read-only property of the Event interface returns a boolean value indicating whether or not
     * the call to Event.preventDefault() canceled the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/defaultPrevented)
     */
    public open val defaultPrevented: Boolean

    /**
     * The read-only composed property of the Event interface returns a boolean value which indicates whether or not the
     * event will propagate across the shadow DOM boundary into the standard DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/composed)
     */
    public open val composed: Boolean

    /**
     * The isTrusted read-only property of the Event interface is a boolean value that is true when the event was
     * generated by the user agent (including via user actions and programmatic methods such as HTMLElement.focus()),
     * and false when the event was dispatched via EventTarget.dispatchEvent(). The click event fired through
     * HTMLElement.click() sets the isTrusted property to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/isTrusted)
     */
    public open val isTrusted: Boolean

    /**
     * The timeStamp read-only property of the Event interface returns the time (in milliseconds) at which the event was
     * created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/timeStamp)
     */
    public open val timeStamp: Double

    /**
     * The Event.initEvent() method is used to initialize the value of an event created using Document.createEvent().
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/initEvent)
     */
    public open fun initEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally)

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface EventInit : JsAny {
    public var bubbles: Boolean?
    public var cancelable: Boolean?
    public var composed: Boolean?
}

public fun EventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): EventInit = newJsObject<EventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

/**
 * The CustomEvent interface can be used to attach custom data to an event generated by an application.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent)
 */
public open external class CustomEvent : Event {
    /**
     * The CustomEvent() constructor creates a new CustomEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/CustomEvent)
     */
    public constructor(type: String, eventInitDict: CustomEventInit = definedExternally)

    /**
     * The read-only detail property of the CustomEvent interface returns any data passed when initializing the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    public open val detail: JsAny?

    /**
     * The CustomEvent.initCustomEvent() method initializes a CustomEvent object. If the event has already been
     * dispatched, this method does nothing.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/initCustomEvent)
     */
    public open fun initCustomEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, detail: JsAny? = definedExternally)

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface CustomEventInit : EventInit {
    public var detail: JsAny?
}

public fun CustomEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, detail: JsAny? = null): CustomEventInit = newJsObject<CustomEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (detail != null) this.detail = detail
}

/**
 * The EventTarget interface is implemented by objects that can receive events and may have listeners for them. In other
 * words, any target of events implements the methods associated with this interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
 */
public open external class EventTarget : JsAny {
    /**
     * The EventTarget() constructor creates a new EventTarget object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/EventTarget)
     */
    public constructor()

    /**
     * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
     * specified event is delivered to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
     */
    public open fun addEventListener(type: String, callback: EventListener?, options: AddEventListenerOptions)

    /**
     * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
     * specified event is delivered to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
     */
    public open fun addEventListener(type: String, callback: EventListener?, options: Boolean)

    /**
     * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
     * specified event is delivered to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
     */
    public open fun addEventListener(type: String, callback: EventListener?)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     */
    public open fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     */
    public open fun removeEventListener(type: String, callback: (Event) -> Unit, options: EventListenerOptions)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     */
    public open fun removeEventListener(type: String, callback: EventListener?, options: Boolean)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     */
    public open fun removeEventListener(type: String, callback: (Event) -> Unit, options: Boolean)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     */
    public open fun removeEventListener(type: String, callback: EventListener?)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     */
    public open fun removeEventListener(type: String, callback: (Event) -> Unit)

    /**
     * The dispatchEvent() method of the EventTarget sends an Event to the object, (synchronously) invoking the affected
     * event listeners in the appropriate order. The normal event processing rules (including the capturing and optional
     * bubbling phase) also apply to events dispatched manually with dispatchEvent().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
     */
    public open fun dispatchEvent(event: Event): Boolean
}

private fun toEventListener(callback: (Event) -> Unit): EventListener = js("callback")

/**
 * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
 * specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 */
public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit, options: AddEventListenerOptions): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener, options)
    return { removeEventListener(type, listener, options) }
}

/**
 * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
 * specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 */
public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit, options: Boolean): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener, options)
    return { removeEventListener(type, listener, options) }
}

/**
 * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
 * specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 */
public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener)
    return { removeEventListener(type, listener) }
}

public external interface EventListener : JsAny {
    public fun handleEvent(event: Event)
}

public external interface EventListenerOptions : JsAny {
    public var capture: Boolean?
}

public fun EventListenerOptions(capture: Boolean? = null): EventListenerOptions = newJsObject<EventListenerOptions>().apply {
    if (capture != null) this.capture = capture
}

public external interface AddEventListenerOptions : EventListenerOptions {
    public var passive: Boolean?
    public var once: Boolean?
    public var signal: AbortSignal?
}

public fun AddEventListenerOptions(capture: Boolean? = null, passive: Boolean? = null, once: Boolean? = null, signal: AbortSignal? = null): AddEventListenerOptions = newJsObject<AddEventListenerOptions>().apply {
    if (capture != null) this.capture = capture
    if (passive != null) this.passive = passive
    if (once != null) this.once = once
    if (signal != null) this.signal = signal
}

/**
 * The AbortController interface represents a controller object that allows you to abort one or more Web requests as and
 * when desired.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortController)
 */
public open external class AbortController : JsAny {
    /**
     * The AbortController() constructor creates a new AbortController object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortController/AbortController)
     */
    public constructor()

    /**
     * The signal read-only property of the AbortController interface returns an AbortSignal object instance, which can
     * be used to communicate with/abort an asynchronous operation as desired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortController/signal)
     */
    public open val signal: AbortSignal

    /**
     * The abort() method of the AbortController interface aborts an asynchronous operation before it has completed.
     * This is able to abort fetch requests, the consumption of any response bodies, or streams.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortController/abort)
     */
    public open fun abort(reason: JsAny? = definedExternally)
}

/**
 * The AbortSignal interface represents a signal object that allows you to communicate with an asynchronous operation
 * (such as a fetch request) and abort it if required via an AbortController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
 */
public abstract external class AbortSignal : EventTarget {
    /**
     * The aborted read-only property returns a value that indicates whether the asynchronous operations the signal is
     * communicating with are aborted (true) or not (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/aborted)
     */
    public open val aborted: Boolean

    /**
     * The reason read-only property returns a JavaScript value that indicates the abort reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason)
     */
    public open val reason: JsAny?

    /**
     * The throwIfAborted() method throws the signal's abort reason if the signal has been aborted; otherwise it does
     * nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted)
     */
    public open fun throwIfAborted()

    /**
     * The abort event of the AbortSignal is fired when the associated request is aborted, i.e., using
     * AbortController.abort().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
     */
    public open var onabort: ((Event) -> Unit)?

    public companion object {
        /**
         * The AbortSignal.abort() static method returns an AbortSignal that is already set as aborted (and which does
         * not trigger an abort event).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static)
         */
        public fun abort(reason: JsAny? = definedExternally): AbortSignal

        /**
         * The AbortSignal.timeout() static method returns an AbortSignal that will automatically abort after a
         * specified time.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static)
         */
        public fun timeout(milliseconds: Double): AbortSignal

        /**
         * The AbortSignal.any() static method takes an iterable of abort signals and returns an AbortSignal. The
         * returned abort signal is aborted when any of the input iterable abort signals are aborted. The abort reason
         * will be set to the reason of the first signal that is aborted. If any of the given abort signals are already
         * aborted then so will be the returned AbortSignal.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/any_static)
         */
        public fun any(signals: JsArray<AbortSignal>): AbortSignal
    }
}

public external interface NonElementParentNode : JsAny {
    /**
     * The getElementById() method of the Document interface returns an Element object representing the element whose id
     * property matches the specified string. Since element IDs are required to be unique if specified, they're a useful
     * way to get access to a specific element quickly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
     */
    public fun getElementById(elementId: String): Element?
}

public external interface DocumentOrShadowRoot : JsAny {
    /**
     * The customElementRegistry read-only property of the Document interface returns the CustomElementRegistry object
     * associated with this document, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/customElementRegistry)
     */
    public val customElementRegistry: CustomElementRegistry?

    /**
     * The activeElement read-only property of the Document interface returns the Element within the DOM that is
     * receiving keyboard events such as keydown and keyup. This is usually analogous to the focused element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/activeElement)
     */
    public val activeElement: Element?

    /**
     * The styleSheets read-only property of the Document interface returns a StyleSheetList of CSSStyleSheet objects,
     * for stylesheets explicitly linked into or embedded in a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/styleSheets)
     */
    public val styleSheets: StyleSheetList

    /**
     * The adoptedStyleSheets property of the Document interface is used for setting an array of constructed stylesheets
     * to be used by the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptedStyleSheets)
     */
    public var adoptedStyleSheets: JsArray<CSSStyleSheet>

    /**
     * The Document.fullscreenElement read-only property returns the Element that is currently being presented in
     * fullscreen mode in this document, or null if fullscreen mode is not currently in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenElement)
     */
    public val fullscreenElement: Element?
}

public external interface ParentNode : JsAny {
    /**
     * The read-only children property returns a live HTMLCollection which contains all of the child elements of the
     * document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     */
    public val children: HTMLCollection

    /**
     * The Document.firstElementChild read-only property returns the document's first child Element, or null if there
     * are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     */
    public val firstElementChild: Element?

    /**
     * The Document.lastElementChild read-only property returns the document's last child Element, or null if there are
     * no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     */
    public val lastElementChild: Element?

    /**
     * The Document.childElementCount read-only property returns the number of child elements of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     */
    public val childElementCount: Int

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    public fun prepend(vararg nodes: Node)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    public fun prepend(vararg nodes: String)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    public fun prepend()

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    public fun append(vararg nodes: Node)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    public fun append(vararg nodes: String)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    public fun append()

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    public fun replaceChildren(vararg nodes: Node)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    public fun replaceChildren(vararg nodes: String)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    public fun replaceChildren()

    /**
     * The moveBefore() method of the Document interface moves a given Node inside the Document DOM node as a direct
     * child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     */
    public fun moveBefore(node: Node, child: Node?)

    /**
     * The Document method querySelector() returns the first Element within the document that matches the specified CSS
     * selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     */
    public fun querySelector(selectors: String): Element?

    /**
     * The Document method querySelectorAll() returns a static (not live) NodeList representing a list of the document's
     * elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     */
    public fun querySelectorAll(selectors: String): NodeList
}

public external interface NonDocumentTypeChildNode : JsAny {
    /**
     * The Element.previousElementSibling read-only property returns the Element immediately prior to the specified one
     * in its parent's children list, or null if the specified element is the first one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/previousElementSibling)
     */
    public val previousElementSibling: Element?

    /**
     * The Element.nextElementSibling read-only property returns the element immediately following the specified one in
     * its parent's children list, or null if the specified element is the last one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/nextElementSibling)
     */
    public val nextElementSibling: Element?
    public fun beforeHTML(html: String, options: SetHTMLOptions = definedExternally)
    public fun afterHTML(html: String, options: SetHTMLOptions = definedExternally)
    public fun replaceWithHTML(html: String, options: SetHTMLOptions = definedExternally)
    public fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
}

public external interface ChildNode : JsAny {
    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    public fun before(vararg nodes: Node)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    public fun before(vararg nodes: String)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    public fun before()

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    public fun after(vararg nodes: Node)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    public fun after(vararg nodes: String)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    public fun after()

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    public fun replaceWith(vararg nodes: Node)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    public fun replaceWith(vararg nodes: String)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    public fun replaceWith()

    /**
     * The remove() method of the DocumentType interface removes the DocumentType node from its parent node. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/remove)
     */
    public fun remove()
}

public external interface Slottable : JsAny {
    /**
     * The assignedSlot read-only property of the Element interface returns an HTMLSlotElement representing the
     * &lt;slot&gt; element the node is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot)
     */
    public val assignedSlot: HTMLSlotElement?
}

/**
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as
 * document.querySelectorAll().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList)
 */
public abstract external class NodeList : ItemArrayLike<Node> {
    /**
     * Returns a node from a NodeList by index. This method doesn't throw exceptions as long as you provide arguments. A
     * value of null is returned if the index is out of range, and a TypeError is thrown if no argument is provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList/item)
     */
    override fun item(index: Int): Node?

    /**
     * The NodeList.length property returns the number of items in a NodeList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList/length)
     */
    override val length: Int
    // not printed yet: iterable
}

public operator fun NodeList.get(index: Int): Node? = getProperty(this, index)

/**
 * The HTMLCollection interface represents a generic collection (array-like object similar to arguments) of elements (in
 * document order) and offers methods and properties for selecting from the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection)
 */
public abstract external class HTMLCollection : UnionElementOrHTMLCollection, ItemArrayLike<Element> {
    /**
     * The HTMLCollection.length property returns the number of items in a HTMLCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/length)
     */
    override val length: Int

    /**
     * The HTMLCollection method item() returns the element located at the specified offset into the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/item)
     */
    override fun item(index: Int): Element?

    /**
     * The namedItem() method of the HTMLCollection interface returns the first Element in the collection whose id or
     * name attribute match the specified name, or null if no element matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/namedItem)
     */
    public open fun namedItem(name: String): Element?
}

public operator fun HTMLCollection.get(index: Int): Element? = getProperty(this, index)

public operator fun HTMLCollection.get(name: String): Element? = getProperty(this, name)

/**
 * The MutationObserver interface provides the ability to watch for changes being made to the DOM tree. It is designed
 * as a replacement for the older Mutation Events feature, which was part of the DOM3 Events specification.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver)
 */
public open external class MutationObserver : JsAny {
    /**
     * The DOM MutationObserver() constructor — part of the MutationObserver interface — creates and returns a new
     * observer which invokes a specified callback when DOM events occur.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/MutationObserver)
     */
    public constructor(callback: (JsArray<MutationRecord>, MutationObserver) -> Unit)

    /**
     * The MutationObserver method observe() configures the MutationObserver callback to begin receiving notifications
     * of changes to the DOM that match the given options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/observe)
     */
    public open fun observe(target: Node, options: MutationObserverInit = definedExternally)

    /**
     * The MutationObserver method disconnect() tells the observer to stop watching for mutations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/disconnect)
     */
    public open fun disconnect()

    /**
     * The MutationObserver method takeRecords() returns a list of all matching DOM changes that have been detected but
     * not yet processed by the observer's callback function, leaving the mutation queue empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationObserver/takeRecords)
     */
    public open fun takeRecords(): JsArray<MutationRecord>
}

public external interface MutationObserverInit : JsAny {
    public var childList: Boolean?
    public var attributes: Boolean?
    public var characterData: Boolean?
    public var subtree: Boolean?
    public var attributeOldValue: Boolean?
    public var characterDataOldValue: Boolean?
    public var attributeFilter: JsArray<JsString>?
}

public fun MutationObserverInit(childList: Boolean? = null, attributes: Boolean? = null, characterData: Boolean? = null, subtree: Boolean? = null, attributeOldValue: Boolean? = null, characterDataOldValue: Boolean? = null, attributeFilter: JsArray<JsString>? = null): MutationObserverInit = newJsObject<MutationObserverInit>().apply {
    if (childList != null) this.childList = childList
    if (attributes != null) this.attributes = attributes
    if (characterData != null) this.characterData = characterData
    if (subtree != null) this.subtree = subtree
    if (attributeOldValue != null) this.attributeOldValue = attributeOldValue
    if (characterDataOldValue != null) this.characterDataOldValue = characterDataOldValue
    if (attributeFilter != null) this.attributeFilter = attributeFilter
}

/**
 * The MutationRecord is a read-only interface that represents an individual DOM mutation observed by a
 * MutationObserver. It is the object inside the array passed to the callback of a MutationObserver.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord)
 */
public abstract external class MutationRecord : JsAny {
    /**
     * The MutationRecord read-only property type is the type of the MutationRecord observed by a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type)
     */
    public open val type: String

    /**
     * The MutationRecord read-only property target is the target (i.e., the mutated/changed node) of a mutation
     * observed with a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/target)
     */
    public open val target: Node

    /**
     * The MutationRecord read-only property addedNodes is a NodeList of nodes added to a target node by a mutation
     * observed with a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/addedNodes)
     */
    public open val addedNodes: NodeList

    /**
     * The MutationRecord read-only property removedNodes is a NodeList of nodes removed from a target node by a
     * mutation observed with a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/removedNodes)
     */
    public open val removedNodes: NodeList

    /**
     * The MutationRecord read-only property previousSibling is the previous sibling of an added or removed child node
     * of the target of a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/previousSibling)
     */
    public open val previousSibling: Node?

    /**
     * The MutationRecord read-only property nextSibling is the next sibling of an added or removed child node of the
     * target of a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/nextSibling)
     */
    public open val nextSibling: Node?

    /**
     * The MutationRecord read-only property attributeName contains the name of a changed attribute belonging to a node
     * that is observed by a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeName)
     */
    public open val attributeName: String?

    /**
     * The MutationRecord read-only property attributeNamespace is the namespace of the mutated attribute in the
     * MutationRecord observed by a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeNamespace)
     */
    public open val attributeNamespace: String?

    /**
     * The MutationRecord read-only property oldValue contains the character data or attribute value of an observed node
     * before it was changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/oldValue)
     */
    public open val oldValue: String?
}

/**
 * The DOM Node interface is an abstract base class upon which many other DOM API objects are based, thus letting those
 * object types be used similarly and often interchangeably. As an abstract class, there is no such thing as a plain
 * Node object. All objects that implement Node functionality are based on one of its subclasses. Most notable are
 * Document, Element, and DocumentFragment.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node)
 */
public abstract external class Node : EventTarget {
    /**
     * The read-only nodeType property of a Node interface is an integer that identifies what the node is. It
     * distinguishes different kinds of nodes from each other, such as elements, text, and comments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeType)
     */
    public open val nodeType: Short

    /**
     * The read-only nodeName property of Node returns the name of the current node as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeName)
     */
    public open val nodeName: String

    /**
     * The read-only baseURI property of the Node interface returns the absolute base URL of the document containing the
     * node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/baseURI)
     */
    public open val baseURI: String

    /**
     * The read-only isConnected property of the Node interface returns a boolean indicating whether the node is
     * connected (directly or indirectly) to a Document object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isConnected)
     */
    public open val isConnected: Boolean

    /**
     * The read-only ownerDocument property of the Node interface returns the top-level document object of the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/ownerDocument)
     */
    public open val ownerDocument: Document?

    /**
     * The getRootNode() method of the Node interface returns the context object's root, which optionally includes the
     * shadow root if it is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/getRootNode)
     */
    public open fun getRootNode(options: GetRootNodeOptions = definedExternally): Node

    /**
     * The read-only parentNode property of the Node interface returns the parent of the specified node in the DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentNode)
     */
    public open val parentNode: Node?

    /**
     * The read-only parentElement property of Node interface returns the DOM node's parent Element, or null if the node
     * either has no parent, or its parent isn't a DOM Element. Node.parentNode on the other hand returns any kind of
     * parent, regardless of its type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentElement)
     */
    public open val parentElement: Element?

    /**
     * The hasChildNodes() method of the Node interface returns a boolean value indicating whether the given Node has
     * child nodes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/hasChildNodes)
     */
    public open fun hasChildNodes(): Boolean

    /**
     * The read-only childNodes property of the Node interface returns a live NodeList of child nodes of the given
     * element where the first child node is assigned index 0. Child nodes include elements, text and comments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/childNodes)
     */
    public open val childNodes: NodeList

    /**
     * The read-only firstChild property of the Node interface returns the node's first child in the tree, or null if
     * the node has no children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/firstChild)
     */
    public open val firstChild: Node?

    /**
     * The read-only lastChild property of the Node interface returns the last child of the node, or null if there are
     * no child nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lastChild)
     */
    public open val lastChild: Node?

    /**
     * The read-only previousSibling property of the Node interface returns the node immediately preceding the specified
     * one in its parent's childNodes list, or null if the specified node is the first in that list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/previousSibling)
     */
    public open val previousSibling: Node?

    /**
     * The read-only nextSibling property of the Node interface returns the node immediately following the specified one
     * in their parent's childNodes, or returns null if the specified node is the last child in the parent element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nextSibling)
     */
    public open val nextSibling: Node?

    /**
     * The nodeValue property of the Node interface returns or sets the value of the current node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeValue)
     */
    public open var nodeValue: String?

    /**
     * The textContent property of the Node interface represents the text content of the node and its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     */
    public open var textContent: String?

    /**
     * The normalize() method of the Node interface puts the specified node and all of its sub-tree into a normalized
     * form. In a normalized sub-tree, no text nodes in the sub-tree are empty and there are no adjacent text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/normalize)
     */
    public open fun normalize()

    /**
     * The cloneNode() method of the Node interface returns a duplicate of the node on which this method was called. Its
     * parameter controls if the subtree contained in the node is also cloned or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/cloneNode)
     */
    public open fun cloneNode(subtree: Boolean = definedExternally): Node

    /**
     * The isEqualNode() method of the Node interface tests whether two nodes are equal. Two nodes are equal when they
     * have the same type, defining characteristics (for elements, this would be their ID, number of children, and so
     * forth), its attributes match, and so on. The specific set of data points that must match varies depending on the
     * types of the nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isEqualNode)
     */
    public open fun isEqualNode(otherNode: Node?): Boolean

    /**
     * The isSameNode() method of the Node interface is a legacy alias the for the === strict equality operator. That
     * is, it tests whether two nodes are the same (in other words, whether they reference the same object).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isSameNode)
     */
    public open fun isSameNode(otherNode: Node?): Boolean

    /**
     * The compareDocumentPosition() method of the Node interface reports the position of its argument node relative to
     * the node on which it is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/compareDocumentPosition)
     */
    public open fun compareDocumentPosition(other: Node): Short

    /**
     * The contains() method of the Node interface returns a boolean value indicating whether a node is a descendant of
     * a given node, that is the node itself, one of its direct children (childNodes), one of the children's direct
     * children, and so on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/contains)
     */
    public open fun contains(other: Node?): Boolean

    /**
     * The lookupPrefix() method of the Node interface returns a string containing the prefix for a given namespace URI,
     * if present, and null if not. When multiple prefixes are possible, the first prefix is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupPrefix)
     */
    public open fun lookupPrefix(namespace: String?): String?

    /**
     * The lookupNamespaceURI() method of the Node interface takes a prefix as parameter and returns the namespace URI
     * associated with it on the given node if found (and null if not). This method's existence allows Node objects to
     * be passed as a namespace resolver to XPathEvaluator.createExpression() and XPathEvaluator.evaluate().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupNamespaceURI)
     */
    public open fun lookupNamespaceURI(prefix: String?): String?

    /**
     * The isDefaultNamespace() method of the Node interface accepts a namespace URI as an argument. It returns a
     * boolean value that is true if the namespace is the default namespace on the given node and false if not. The
     * default namespace can be retrieved with Node.lookupNamespaceURI() by passing null as the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isDefaultNamespace)
     */
    public open fun isDefaultNamespace(namespace: String?): Boolean

    /**
     * The insertBefore() method of the Node interface inserts a node before a reference node as a child of a specified
     * parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/insertBefore)
     */
    public open fun insertBefore(node: Node, child: Node?): Node

    /**
     * The appendChild() method of the Node interface adds a node to the end of the list of children of a specified
     * parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/appendChild)
     */
    public open fun appendChild(node: Node): Node

    /**
     * The replaceChild() method of the Node interface replaces a child node within the given (parent) node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/replaceChild)
     */
    public open fun replaceChild(node: Node, child: Node): Node

    /**
     * The removeChild() method of the Node interface removes a child node from the DOM and returns the removed node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/removeChild)
     */
    public open fun removeChild(child: Node): Node

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface GetRootNodeOptions : JsAny {
    public var composed: Boolean?
}

public fun GetRootNodeOptions(composed: Boolean? = null): GetRootNodeOptions = newJsObject<GetRootNodeOptions>().apply {
    if (composed != null) this.composed = composed
}

/**
 * The Document interface represents any web page loaded in the browser and serves as an entry point into the web page's
 * content, which is the DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document)
 */
public open external class Document : Node, GlobalEventHandlers, NonElementParentNode, DocumentOrShadowRoot, ParentNode, XPathEvaluatorBase, GeometryUtils, ARIANotifyMixin, GeometryNode {
    /**
     * The Document constructor creates a new Document object that is a web page loaded in the browser and serving as an
     * entry point into the page's content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/Document)
     */
    public constructor()

    /**
     * The implementation read-only property of the Document interface returns a DOMImplementation object associated
     * with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/implementation)
     */
    public open val implementation: DOMImplementation

    /**
     * The URL read-only property of the Document interface returns the document location as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/URL)
     */
    public open val URL: String

    /**
     * The documentURI read-only property of the Document interface returns the document location as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentURI)
     */
    public open val documentURI: String

    /**
     * The Document.compatMode read-only property indicates whether the document is rendered in Quirks mode or Standards
     * mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compatMode)
     */
    public open val compatMode: String

    /**
     * The Document.characterSet read-only property returns the character encoding of the document that it's currently
     * rendered with.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/characterSet)
     */
    public open val characterSet: String
    public open val charset: String
    public open val inputEncoding: String

    /**
     * The Document.contentType read-only property returns the MIME type that the document is being rendered as. This
     * may come from HTTP headers or other sources of MIME information, and might be affected by automatic type
     * conversions performed by either the browser or extensions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/contentType)
     */
    public open val contentType: String

    /**
     * The doctype read-only property of the Document interface is a DocumentType object representing the Document Type
     * Declaration (DTD) associated with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/doctype)
     */
    public open val doctype: DocumentType?

    /**
     * The documentElement read-only property of the Document interface returns the Element that is the root element of
     * the document (for example, the &lt;html&gt; element for HTML documents).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentElement)
     */
    public open val documentElement: Element?

    /**
     * The getElementsByTagName method of Document interface returns an HTMLCollection of elements with the given tag
     * name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagName)
     */
    public open fun getElementsByTagName(qualifiedName: String): HTMLCollection

    /**
     * Returns a list of elements with the given tag name belonging to the given namespace. The complete document is
     * searched, including the root node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagNameNS)
     */
    public open fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection

    /**
     * The getElementsByClassName method of Document interface returns an array-like object of all child elements which
     * have all of the given class name(s).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByClassName)
     */
    public open fun getElementsByClassName(classNames: String): HTMLCollection

    /**
     * The createElement() method of the Document interface creates a new HTMLElement that has the specified localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     */
    public open fun createElement(localName: String, options: String): Element

    /**
     * The createElement() method of the Document interface creates a new HTMLElement that has the specified localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     */
    public open fun createElement(localName: String, options: ElementCreationOptions): Element

    /**
     * The createElement() method of the Document interface creates a new HTMLElement that has the specified localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     */
    public open fun createElement(localName: String): Element

    /**
     * The createElementNS() method of the Document interface creates a new element with the specified namespace URI and
     * qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElementNS)
     */
    public open fun createElementNS(namespace: String?, qualifiedName: String, options: String): Element

    /**
     * The createElementNS() method of the Document interface creates a new element with the specified namespace URI and
     * qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElementNS)
     */
    public open fun createElementNS(namespace: String?, qualifiedName: String, options: ElementCreationOptions): Element

    /**
     * The createElementNS() method of the Document interface creates a new element with the specified namespace URI and
     * qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElementNS)
     */
    public open fun createElementNS(namespace: String?, qualifiedName: String): Element

    /**
     * Creates a new empty DocumentFragment into which DOM nodes can be added to build an offscreen DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createDocumentFragment)
     */
    public open fun createDocumentFragment(): DocumentFragment

    /**
     * Creates a new Text node. This method can be used to escape HTML characters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTextNode)
     */
    public open fun createTextNode(data: String): Text

    /**
     * createCDATASection() creates a new CDATA section node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createCDATASection)
     */
    public open fun createCDATASection(data: String): CDATASection

    /**
     * createComment() creates a new comment node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createComment)
     */
    public open fun createComment(data: String): Comment

    /**
     * The createProcessingInstruction() method of the Document interface creates a new ProcessingInstruction object and
     * returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createProcessingInstruction)
     */
    public open fun createProcessingInstruction(target: String, data: String): ProcessingInstruction

    /**
     * The importNode() method of the Document interface creates a copy of a Node or DocumentFragment from another
     * document, to be inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     */
    public open fun importNode(node: Node, options: Boolean): Node

    /**
     * The importNode() method of the Document interface creates a copy of a Node or DocumentFragment from another
     * document, to be inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     */
    public open fun importNode(node: Node, options: ImportNodeOptions): Node

    /**
     * The importNode() method of the Document interface creates a copy of a Node or DocumentFragment from another
     * document, to be inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     */
    public open fun importNode(node: Node): Node

    /**
     * Document.adoptNode() transfers a node from another document into the method's document. The adopted node and its
     * subtree are removed from their original document (if any), and their ownerDocument is changed to the current
     * document. The node can then be inserted into the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptNode)
     */
    public open fun adoptNode(node: Node): Node

    /**
     * The createAttribute() method of the Document interface creates a new attribute node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttribute)
     */
    public open fun createAttribute(localName: String): Attr

    /**
     * The createAttributeNS() method of the Document interface creates a new attribute node with the specified
     * namespace URI and qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttributeNS)
     */
    public open fun createAttributeNS(namespace: String?, qualifiedName: String): Attr

    /**
     * Creates an event of the type specified. The returned object should be first initialized and can then be passed to
     * EventTarget.dispatchEvent.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createEvent)
     */
    public open fun createEvent(`interface`: String): Event

    /**
     * The Document.createRange() method returns a new Range object whose start and end are offset 0 of the Document
     * object on which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createRange)
     */
    public open fun createRange(): Range

    /**
     * The Document.createNodeIterator() method returns a new NodeIterator object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     */
    public open fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): NodeIterator

    /**
     * The Document.createNodeIterator() method returns a new NodeIterator object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     */
    public open fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: (Node) -> Short): NodeIterator

    /**
     * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTreeWalker)
     */
    public open fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): TreeWalker

    /**
     * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTreeWalker)
     */
    public open fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: (Node) -> Short): TreeWalker

    /**
     * The read-only location property of the Document interface returns a Location object, which contains information
     * about the URL of the document and provides methods for changing that URL and loading another URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/location)
     */
    public open val location: Location?

    /**
     * The domain property of the Document interface gets/sets the domain portion of the origin of the current document,
     * as used by the same-origin policy.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/domain)
     */
    public open var domain: String

    /**
     * The referrer read-only property of the Document interface returns the URI of the page that linked to this page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/referrer)
     */
    public open val referrer: String

    /**
     * The Document property cookie lets you read and write cookies associated with the document. It serves as a getter
     * and setter for the actual values of the cookies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cookie)
     */
    public open var cookie: String

    /**
     * The lastModified read-only property of the Document interface returns a string containing the date and local time
     * on which the current document was last modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastModified)
     */
    public open val lastModified: String

    /**
     * The readyState read-only property of the Document interface describes the loading state of the document. When the
     * value of this property changes, a readystatechange event fires on the document object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState)
     */
    public open val readyState: DocumentReadyState

    /**
     * The document.title property gets or sets the current title of the document. When present, it defaults to the
     * value of the &lt;title&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/title)
     */
    public open var title: String

    /**
     * The Document.dir property is a string representing the directionality of the text of the document, whether left
     * to right (default) or right to left. Possible values are 'rtl', right to left, and 'ltr', left to right.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dir)
     */
    public open var dir: String

    /**
     * The Document.body property represents the &lt;body&gt; or &lt;frameset&gt; node of the current document, or null
     * if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/body)
     */
    public open var body: HTMLElement?

    /**
     * The head read-only property of the Document interface returns the &lt;head&gt; element of the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/head)
     */
    public open val head: HTMLHeadElement?

    /**
     * The images read-only property of the Document interface returns a collection of the images in the current HTML
     * document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/images)
     */
    public open val images: HTMLCollection

    /**
     * The embeds read-only property of the Document interface returns a list of the embedded &lt;embed&gt; elements
     * within the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/embeds)
     */
    public open val embeds: HTMLCollection

    /**
     * The plugins read-only property of the Document interface returns an HTMLCollection object containing one or more
     * HTMLEmbedElements representing the &lt;embed&gt; elements in the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/plugins)
     */
    public open val plugins: HTMLCollection

    /**
     * The links read-only property of the Document interface returns a collection of all &lt;area&gt; elements and
     * &lt;a&gt; elements in a document with a value for the href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/links)
     */
    public open val links: HTMLCollection

    /**
     * The forms read-only property of the Document interface returns an HTMLCollection listing all the &lt;form&gt;
     * elements contained in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/forms)
     */
    public open val forms: HTMLCollection

    /**
     * The scripts read-only property of the Document interface returns a list of the &lt;script&gt; elements in the
     * document. The returned object is an HTMLCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scripts)
     */
    public open val scripts: HTMLCollection

    /**
     * The getElementsByName() method of the Document object returns a NodeList Collection of elements with a given name
     * attribute in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByName)
     */
    public open fun getElementsByName(elementName: String): NodeList

    /**
     * The currentScript read-only property of the Document interface returns the &lt;script&gt; element whose script is
     * currently being processed and isn't a JavaScript module. (For modules use import.meta instead.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/currentScript)
     */
    public open val currentScript: HTMLOrSVGScriptElement?

    /**
     * The Document.open() method opens a document for writing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/open)
     */
    public open fun open(unused1: String = definedExternally, unused2: String = definedExternally): Document

    /**
     * The Document.open() method opens a document for writing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/open)
     */
    public open fun open(url: String, name: String, features: String): Window?

    /**
     * The Document.close() method finishes writing to a document, opened with Document.open().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/close)
     */
    public open fun close()

    /**
     * The write() method of the Document interface writes text in one or more TrustedHTML or string parameters to a
     * document stream opened by document.open().
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/write)
     */
    public open fun write(vararg text: String)

    /**
     * The writeln() method of the Document interface writes text in one or more TrustedHTML or string parameters to a
     * document stream opened by document.open(), followed by a newline character.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/writeln)
     */
    public open fun writeln(vararg text: String)

    /**
     * In browsers, document.defaultView returns the window object associated with a document, or null if none is
     * available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/defaultView)
     */
    public open val defaultView: Window?

    /**
     * The hasFocus() method of the Document interface returns a boolean value indicating whether the document or any
     * element inside the document has focus. This method can be used to determine whether the active element in a
     * document has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasFocus)
     */
    public open fun hasFocus(): Boolean

    /**
     * document.designMode controls whether the entire document is editable. Valid values are "on" and "off". According
     * to the specification, this property is meant to default to "off". Firefox follows this standard. The earlier
     * versions of Chrome and IE default to "inherit". Starting in Chrome 43, the default is "off" and "inherit" is no
     * longer supported. In IE6-10, the value is capitalized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/designMode)
     */
    public open var designMode: String

    /**
     * The execCommand method implements multiple different commands. Some of them provide access to the clipboard,
     * while others are for editing form inputs, contenteditable elements or entire documents (when switched to design
     * mode).
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/execCommand)
     */
    public open fun execCommand(commandId: String, showUI: Boolean = definedExternally, value: String = definedExternally): Boolean

    /**
     * The Document.queryCommandEnabled() method reports whether or not the specified editor command is enabled by the
     * browser.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/queryCommandEnabled)
     */
    public open fun queryCommandEnabled(commandId: String): Boolean
    public open fun queryCommandIndeterm(commandId: String): Boolean

    /**
     * The queryCommandState() method will tell you if the current selection has a certain Document.execCommand()
     * command applied.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/queryCommandState)
     */
    public open fun queryCommandState(commandId: String): Boolean

    /**
     * The Document.queryCommandSupported() method reports whether or not the specified editor command is supported by
     * the browser.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/queryCommandSupported)
     */
    public open fun queryCommandSupported(commandId: String): Boolean
    public open fun queryCommandValue(commandId: String): String

    /**
     * The Document.hidden read-only property returns a Boolean value indicating if the page is considered hidden or
     * not. This can be used to check whether the document is in the background or in a minimized window, or is
     * otherwise not visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hidden)
     */
    public open val hidden: Boolean

    /**
     * The Document.visibilityState read-only property returns the visibility of the document. It can be used to check
     * whether the document is in the background or in a minimized window, or is otherwise not visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState)
     */
    public open val visibilityState: DocumentVisibilityState

    /**
     * The readystatechange event is fired when the readyState attribute of a document has changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
     */
    public open var onreadystatechange: ((Event) -> Unit)?

    /**
     * The visibilitychange event is fired at the document when its visibility status changes — for example, when the
     * user switches browser tabs, navigates to a new page, minimizes or closes the browser, or on mobile, switches to a
     * different app.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
     */
    public open var onvisibilitychange: ((Event) -> Unit)?

    /**
     * fgColor gets/sets the foreground color, or text color, of the current document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fgColor)
     */
    public open var fgColor: String

    /**
     * The Document.linkColor property gets/sets the color of links within the document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/linkColor)
     */
    public open var linkColor: String

    /**
     * The Document.vlinkColor property gets/sets the color of links that the user has visited in the document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/vlinkColor)
     */
    public open var vlinkColor: String

    /**
     * Returns or sets the color of an active link in the document body. A link is active during the time between
     * mousedown and mouseup events.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/alinkColor)
     */
    public open var alinkColor: String

    /**
     * The deprecated bgColor property gets or sets the background color of the current document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/bgColor)
     */
    public open var bgColor: String

    /**
     * The anchors read-only property of the Document interface returns a list of all of the anchors in the document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/anchors)
     */
    public open val anchors: HTMLCollection

    /**
     * The applets read-only property of the Document interface returns an empty HTMLCollection. This property is kept
     * only for compatibility reasons; in older versions of browsers, it returned a list of the applets within a
     * document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/applets)
     */
    public open val applets: HTMLCollection

    /**
     * The Document.clear() method does nothing, but doesn't raise any error.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/clear)
     */
    public open fun clear()
    public open fun captureEvents()
    public open fun releaseEvents()

    /**
     * The Document interface's read-only all property returns an HTMLAllCollection rooted at the document node.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/all)
     */
    public open val all: HTMLAllCollection

    /**
     * The elementFromPoint() method, available on the Document object, returns the topmost Element at the specified
     * coordinates (relative to the viewport).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/elementFromPoint)
     */
    public open fun elementFromPoint(x: Double, y: Double): Element?

    /**
     * The elementsFromPoint() method of the Document interface returns an array of all elements at the specified
     * coordinates (relative to the viewport). The elements are ordered from the topmost to the bottommost box of the
     * viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/elementsFromPoint)
     */
    public open fun elementsFromPoint(x: Double, y: Double): JsArray<Element>

    /**
     * The caretPositionFromPoint() method of the Document interface returns a CaretPosition object, containing the DOM
     * node, along with the caret and caret's character offset within that node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/caretPositionFromPoint)
     */
    public open fun caretPositionFromPoint(x: Double, y: Double, options: CaretPositionFromPointOptions = definedExternally): CaretPosition?

    /**
     * The scrollingElement read-only property of the Document interface returns a reference to the Element that scrolls
     * the document. In standards mode, this is the root element of the document, document.documentElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollingElement)
     */
    public open val scrollingElement: Element?

    /**
     * The rootElement read-only property of the Document interface returns the Element that is the root element of the
     * document if it is an &lt;svg&gt; element, otherwise null. It is deprecated in favor of Document.documentElement,
     * which returns the root element for all documents.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/rootElement)
     */
    public open val rootElement: SVGSVGElement?

    /**
     * The read-only fullscreenEnabled property on the Document interface indicates whether or not fullscreen mode is
     * available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenEnabled)
     */
    public open val fullscreenEnabled: Boolean

    /**
     * The obsolete Document interface's fullscreen read-only property reports whether or not the document is currently
     * displaying content in fullscreen mode.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreen)
     */
    public open val fullscreen: Boolean

    /**
     * The Document method exitFullscreen() requests that the element on this document which is currently being
     * presented in fullscreen mode be taken out of fullscreen mode, restoring the previous state of the screen. This
     * usually reverses the effects of a previous call to Element.requestFullscreen().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitFullscreen)
     */
    public open fun exitFullscreen(): Promise<JsAny?>

    /**
     * The fullscreenchange event is fired immediately after the browser switches into or out of fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenchange_event)
     */
    public open var onfullscreenchange: ((Event) -> Unit)?

    /**
     * The fullscreenerror event is fired when the browser cannot switch to fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenerror_event)
     */
    public open var onfullscreenerror: ((Event) -> Unit)?
    override var onabort: ((Event) -> Unit)?

    /**
     * The auxclick event is fired at an Element when a non-primary pointing device button (any mouse button other than
     * the primary—usually leftmost—button) has been pressed and released both within the same element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     */
    override var onauxclick: ((PointerEvent) -> Unit)?

    /**
     * The DOM beforeinput event fires when the value of an &lt;input&gt; or &lt;textarea&gt; element is about to be
     * modified. But in contrast to the input event, it does not fire on the &lt;select&gt; element. The event also
     * applies to elements with contenteditable enabled, and to any element when designMode is turned on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     */
    override var onbeforeinput: ((InputEvent) -> Unit)?

    /**
     * An element receives a beforematch event when it is in the hidden until found state and the browser is about to
     * reveal its content because the user has found the content through the "find in page" feature or through fragment
     * navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforematch_event)
     */
    override var onbeforematch: ((Event) -> Unit)?

    /**
     * The beforetoggle event of the HTMLElement interface fires on a popover or &lt;dialog&gt; element just before it
     * is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     */
    override var onbeforetoggle: ((ToggleEvent) -> Unit)?

    /**
     * The blur event fires when an element has lost focus. The event does not bubble, but the related focusout event
     * that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     */
    override var onblur: ((FocusEvent) -> Unit)?
    override var oncancel: ((Event) -> Unit)?
    override var oncanplay: ((Event) -> Unit)?
    override var oncanplaythrough: ((Event) -> Unit)?

    /**
     * The change event is fired for &lt;input&gt;, &lt;select&gt;, and &lt;textarea&gt; elements when the user modifies
     * the element's value. Unlike the input event, the change event is not necessarily fired for each alteration to an
     * element's value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/change_event)
     */
    override var onchange: ((Event) -> Unit)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     */
    override var onclick: ((PointerEvent) -> Unit)?
    override var onclose: ((Event) -> Unit)?

    /**
     * The command event of the HTMLElement interface fires on an element that is controlled via a button with valid
     * commandForElement and command values, whenever the button is interacted with (e.g., it is clicked).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
     */
    override var oncommand: ((CommandEvent) -> Unit)?
    override var oncontextlost: ((Event) -> Unit)?

    /**
     * The contextmenu event fires when the user attempts to open a context menu. This event is typically triggered by
     * clicking the right mouse button, or by pressing the context menu key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     */
    override var oncontextmenu: ((PointerEvent) -> Unit)?
    override var oncontextrestored: ((Event) -> Unit)?

    /**
     * The copy event of the Clipboard API fires when the user initiates a copy action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event)
     */
    override var oncopy: ((ClipboardEvent) -> Unit)?
    override var oncuechange: ((Event) -> Unit)?

    /**
     * The cut event of the Clipboard API is fired when the user has initiated a "cut" action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event)
     */
    override var oncut: ((ClipboardEvent) -> Unit)?

    /**
     * The dblclick event fires when a pointing device button (such as a mouse's primary button) is double-clicked; that
     * is, when it's rapidly clicked twice on a single element within a very short span of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     */
    override var ondblclick: ((MouseEvent) -> Unit)?

    /**
     * The drag event is fired repeatedly as an element or text selection is being dragged by the user. The firing
     * frequency depends on the browser, operating system, and pointer movement; do not rely on a fixed interval.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     */
    override var ondrag: ((DragEvent) -> Unit)?

    /**
     * The dragend event is fired when a drag operation ends (by releasing a mouse button or hitting the escape key).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     */
    override var ondragend: ((DragEvent) -> Unit)?

    /**
     * The dragenter event is fired when a dragged element or text selection enters a valid drop target. The target
     * object is the immediate user selection (the element directly indicated by the user as the drop target), or the
     * &lt;body&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     */
    override var ondragenter: ((DragEvent) -> Unit)?

    /**
     * The dragleave event is fired when a dragged element or text selection leaves a valid drop target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     */
    override var ondragleave: ((DragEvent) -> Unit)?

    /**
     * The dragover event is fired repeatedly when an element or text selection is being dragged over a potential drop
     * target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     */
    override var ondragover: ((DragEvent) -> Unit)?

    /**
     * The dragstart event is fired when the user starts dragging an element or text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     */
    override var ondragstart: ((DragEvent) -> Unit)?

    /**
     * The drop event is fired when an element or text selection is dropped on a valid drop target. To ensure that the
     * drop event always fires as expected, you should always include a preventDefault() call in the part of your code
     * which handles the dragover event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     */
    override var ondrop: ((DragEvent) -> Unit)?
    override var ondurationchange: ((Event) -> Unit)?
    override var onemptied: ((Event) -> Unit)?
    override var onended: ((Event) -> Unit)?

    /**
     * The error event is fired on an element when a resource failed to load, or can't be used. For example, if a script
     * has an execution error or an image can't be found or is invalid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
     */
    override var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?

    /**
     * The focus event fires when an element has received focus. The event does not bubble, but the related focusin
     * event that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     */
    override var onfocus: ((FocusEvent) -> Unit)?
    override var onformdata: ((FormDataEvent) -> Unit)?

    /**
     * The input event fires when the value of an &lt;input&gt;, &lt;select&gt;, or &lt;textarea&gt; element has been
     * changed as a direct result of a user action (such as typing in a textbox or checking a checkbox).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     */
    override var oninput: ((InputEvent) -> Unit)?
    override var oninvalid: ((Event) -> Unit)?

    /**
     * The keydown event is fired when a key is pressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     */
    override var onkeydown: ((KeyboardEvent) -> Unit)?

    /**
     * The keypress event is fired when a letter, number, punctuation, or symbol key is pressed, or else when the Enter
     * key is pressed — including when the Enter key is pressed in combination with the Shift key or Ctrl key.
     * Otherwise, when a modifier key such as the Alt, Shift, Ctrl, Meta, Esc, or Option key is pressed in isolation,
     * the keypress event is not fired.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keypress_event)
     */
    override var onkeypress: ((KeyboardEvent) -> Unit)?

    /**
     * The keyup event is fired when a key is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     */
    override var onkeyup: ((KeyboardEvent) -> Unit)?

    /**
     * The load event fires for elements containing a resource when the resource has successfully loaded. Currently, the
     * list of supported HTML elements are: &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;link&gt;, &lt;object&gt;,
     * &lt;script&gt;, &lt;style&gt;, and &lt;track&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
     */
    override var onload: ((Event) -> Unit)?
    override var onloadeddata: ((Event) -> Unit)?
    override var onloadedmetadata: ((Event) -> Unit)?
    override var onloadstart: ((Event) -> Unit)?

    /**
     * The mousedown event is fired at an Element when a pointing device button is pressed while the pointer is inside
     * the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     */
    override var onmousedown: ((MouseEvent) -> Unit)?

    /**
     * The mouseenter event is fired at an Element when a pointing device (usually a mouse) is initially moved so that
     * its hotspot is within the element at which the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     */
    override var onmouseenter: ((MouseEvent) -> Unit)?

    /**
     * The mouseleave event is fired at an Element when the cursor of a pointing device (usually a mouse) is moved out
     * of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     */
    override var onmouseleave: ((MouseEvent) -> Unit)?

    /**
     * The mousemove event is fired at an element when a pointing device (usually a mouse) is moved while the cursor's
     * hotspot is inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     */
    override var onmousemove: ((MouseEvent) -> Unit)?

    /**
     * The mouseout event is fired at an Element when a pointing device (usually a mouse) is used to move the cursor so
     * that it is no longer contained within the element or one of its children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     */
    override var onmouseout: ((MouseEvent) -> Unit)?

    /**
     * The mouseover event is fired at an Element when a pointing device (such as a mouse or trackpad) is used to move
     * the cursor onto the element or one of its child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     */
    override var onmouseover: ((MouseEvent) -> Unit)?

    /**
     * The mouseup event is fired at an Element when a button on a pointing device (such as a mouse or trackpad) is
     * released while the pointer is located inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     */
    override var onmouseup: ((MouseEvent) -> Unit)?

    /**
     * The paste event of the Clipboard API is fired when the user has initiated a "paste" action through the browser's
     * user interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event)
     */
    override var onpaste: ((ClipboardEvent) -> Unit)?
    override var onpause: ((Event) -> Unit)?
    override var onplay: ((Event) -> Unit)?
    override var onplaying: ((Event) -> Unit)?
    override var onprogress: ((Event) -> Unit)?
    override var onratechange: ((Event) -> Unit)?
    override var onreset: ((Event) -> Unit)?

    /**
     * The resize event fires when the document view (window) has been resized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
     */
    override var onresize: ((Event) -> Unit)?

    /**
     * The scroll event fires when the document view has been scrolled. To detect when scrolling has completed, see the
     * scrollend event of Document. For element scrolling, see scroll event of Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     */
    override var onscroll: ((Event) -> Unit)?

    /**
     * The scrollend event fires when the document view has completed scrolling. Scrolling is considered completed when
     * the scroll position has no more pending updates and the user has completed their gesture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     */
    override var onscrollend: ((Event) -> Unit)?

    /**
     * The securitypolicyviolation event is fired when a Content Security Policy is violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event)
     */
    override var onsecuritypolicyviolation: ((Event) -> Unit)?
    override var onseeked: ((Event) -> Unit)?
    override var onseeking: ((Event) -> Unit)?
    override var onselect: ((Event) -> Unit)?
    override var onslotchange: ((Event) -> Unit)?
    override var onstalled: ((Event) -> Unit)?
    override var onsubmit: ((SubmitEvent) -> Unit)?
    override var onsuspend: ((Event) -> Unit)?
    override var ontimeupdate: ((Event) -> Unit)?

    /**
     * The toggle event of the HTMLElement interface fires on a popover element, &lt;dialog&gt; element, or
     * &lt;details&gt; element just after it is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/toggle_event)
     */
    override var ontoggle: ((ToggleEvent) -> Unit)?
    override var onvolumechange: ((Event) -> Unit)?
    override var onwaiting: ((Event) -> Unit)?
    override var onwebkitanimationend: ((Event) -> Unit)?
    override var onwebkitanimationiteration: ((Event) -> Unit)?
    override var onwebkitanimationstart: ((Event) -> Unit)?
    override var onwebkittransitionend: ((Event) -> Unit)?

    /**
     * The wheel event fires when the user rotates a wheel button on a pointing device (typically a mouse). It is also
     * fired for related devices that simulate wheel actions, such as trackpads and mouse balls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event)
     */
    override var onwheel: ((WheelEvent) -> Unit)?

    /**
     * The touchstart event is fired when one or more touch points are placed on the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     */
    override var ontouchstart: ((TouchEvent) -> Unit)?

    /**
     * The touchend event fires when one or more touch points are removed from the touch surface. Remember that it is
     * possible to get a touchcancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     */
    override var ontouchend: ((TouchEvent) -> Unit)?

    /**
     * The touchmove event is fired when one or more touch points are moved along the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     */
    override var ontouchmove: ((TouchEvent) -> Unit)?

    /**
     * The touchcancel event is fired when one or more touch points have been disrupted in an implementation-specific
     * manner.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     */
    override var ontouchcancel: ((TouchEvent) -> Unit)?

    /**
     * The pointerover event is fired when a pointing device is moved into an element's hit test boundaries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event)
     */
    override var onpointerover: ((PointerEvent) -> Unit)?

    /**
     * The pointerenter event fires when a pointing device is moved into the hit test boundaries of an element or one of
     * its descendants, including as a result of a pointerdown event from a device that does not support hover (see
     * pointerdown). Otherwise, pointerenter works the same as mouseenter, and are dispatched at the same time. They are
     * also dispatched at the same time as mouseover and pointerover events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event)
     */
    override var onpointerenter: ((PointerEvent) -> Unit)?

    /**
     * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions
     * from no buttons pressed to at least one button pressed. For touch, it is fired when physical contact is made with
     * the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event)
     */
    override var onpointerdown: ((PointerEvent) -> Unit)?

    /**
     * The pointermove event is fired when a pointer changes coordinates, and the pointer has not been canceled by a
     * browser touch-action. The event is also fired when a pointer changes any of its other properties, provided the
     * change doesn't produce some other pointer event. This includes any change to pressure, tangential pressure, tilt,
     * twist, contact geometry (width and height), or chorded buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event)
     */
    override var onpointermove: ((PointerEvent) -> Unit)?

    /**
     * The pointerrawupdate event is fired when a pointer changes any properties that don't fire pointerdown or
     * pointerup events. See pointermove for a list of these properties.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerrawupdate_event)
     */
    override var onpointerrawupdate: ((PointerEvent) -> Unit)?

    /**
     * The pointerup event is fired when a pointer is no longer active. Remember that it is possible to get a
     * pointercancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event)
     */
    override var onpointerup: ((PointerEvent) -> Unit)?

    /**
     * The pointercancel event is fired when the browser determines that there are unlikely to be any more pointer
     * events, or if after the pointerdown event is fired, the pointer is then used to manipulate the viewport by
     * panning, zooming, or scrolling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event)
     */
    override var onpointercancel: ((PointerEvent) -> Unit)?

    /**
     * The pointerout event is fired for several reasons including: pointing device is moved out of the hit test
     * boundaries of an element; firing the pointerup event for a device that does not support hover (see pointerup);
     * after firing the pointercancel event (see pointercancel); when a pen stylus leaves the hover range detectable by
     * the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event)
     */
    override var onpointerout: ((PointerEvent) -> Unit)?

    /**
     * The pointerleave event is fired when a pointing device is moved out of the hit test boundaries of an element. For
     * pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer. Otherwise,
     * pointerleave works the same as mouseleave, and are dispatched at the same time. They are also dispatched at the
     * same time as mouseout and pointerout events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event)
     */
    override var onpointerleave: ((PointerEvent) -> Unit)?

    /**
     * The gotpointercapture event is fired when an element captures a pointer using setPointerCapture().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event)
     */
    override var ongotpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The lostpointercapture event is fired when a captured pointer is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/lostpointercapture_event)
     */
    override var onlostpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The getElementById() method of the Document interface returns an Element object representing the element whose id
     * property matches the specified string. Since element IDs are required to be unique if specified, they're a useful
     * way to get access to a specific element quickly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
     */
    override fun getElementById(elementId: String): Element?

    /**
     * The customElementRegistry read-only property of the Document interface returns the CustomElementRegistry object
     * associated with this document, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/customElementRegistry)
     */
    override val customElementRegistry: CustomElementRegistry?

    /**
     * The activeElement read-only property of the Document interface returns the Element within the DOM that is
     * receiving keyboard events such as keydown and keyup. This is usually analogous to the focused element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/activeElement)
     */
    override val activeElement: Element?

    /**
     * The styleSheets read-only property of the Document interface returns a StyleSheetList of CSSStyleSheet objects,
     * for stylesheets explicitly linked into or embedded in a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/styleSheets)
     */
    override val styleSheets: StyleSheetList

    /**
     * The adoptedStyleSheets property of the Document interface is used for setting an array of constructed stylesheets
     * to be used by the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptedStyleSheets)
     */
    override var adoptedStyleSheets: JsArray<CSSStyleSheet>

    /**
     * The Document.fullscreenElement read-only property returns the Element that is currently being presented in
     * fullscreen mode in this document, or null if fullscreen mode is not currently in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenElement)
     */
    override val fullscreenElement: Element?

    /**
     * The read-only children property returns a live HTMLCollection which contains all of the child elements of the
     * document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     */
    override val children: HTMLCollection

    /**
     * The Document.firstElementChild read-only property returns the document's first child Element, or null if there
     * are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     */
    override val firstElementChild: Element?

    /**
     * The Document.lastElementChild read-only property returns the document's last child Element, or null if there are
     * no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     */
    override val lastElementChild: Element?

    /**
     * The Document.childElementCount read-only property returns the number of child elements of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     */
    override val childElementCount: Int

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    override fun prepend(vararg nodes: Node)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    override fun prepend(vararg nodes: String)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    override fun prepend()

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    override fun append(vararg nodes: Node)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    override fun append(vararg nodes: String)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    override fun append()

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    override fun replaceChildren(vararg nodes: Node)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    override fun replaceChildren(vararg nodes: String)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    override fun replaceChildren()

    /**
     * The moveBefore() method of the Document interface moves a given Node inside the Document DOM node as a direct
     * child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     */
    override fun moveBefore(node: Node, child: Node?)

    /**
     * The Document method querySelector() returns the first Element within the document that matches the specified CSS
     * selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     */
    override fun querySelector(selectors: String): Element?

    /**
     * The Document method querySelectorAll() returns a static (not live) NodeList representing a list of the document's
     * elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     */
    override fun querySelectorAll(selectors: String): NodeList

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     */
    override fun createExpression(expression: String, resolver: XPathNSResolver?): XPathExpression

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     */
    override fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression

    /**
     * The createNSResolver() method of the Document interface used to create a custom XPathNSResolver object. It now
     * returns the input as-is and is only kept for compatibility reasons.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNSResolver)
     */
    override fun createNSResolver(nodeResolver: Node): Node

    /**
     * The evaluate() method of the Document interface selects elements based on the XPath expression given in
     * parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     */
    override fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver?, type: Short, result: XPathResult?): XPathResult

    /**
     * The evaluate() method of the Document interface selects elements based on the XPath expression given in
     * parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     */
    override fun evaluate(expression: String, contextNode: Node, resolver: (String?) -> String?, type: Short, result: XPathResult?): XPathResult
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint

    /**
     * The ariaNotify() method of the Document interface queues a string of text to be announced by a screen reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/ariaNotify)
     */
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short

        /**
         * The parseHTMLUnsafe() static method of the Document object is used to parse HTML input, optionally filtering
         * unwanted HTML elements and attributes, in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTMLUnsafe_static)
         */
        public fun parseHTMLUnsafe(html: String, options: ParseHTMLUnsafeOptions = definedExternally): Document

        /**
         * The parseHTML() static method of the Document object provides an XSS-safe method to parse and sanitize a
         * string of HTML in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTML_static)
         */
        public fun parseHTML(html: String, options: SetHTMLOptions = definedExternally): Document
    }
}

public operator fun Document.get(name: String): JsAny? = getProperty(this, name)

/**
 * The XMLDocument interface represents an XML document. It inherits from the generic Document and does not add any
 * specific methods or properties to it: nevertheless, several algorithms behave differently with the two types of
 * documents.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLDocument)
 */
public abstract external class XMLDocument : Document {

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short

        /**
         * The parseHTMLUnsafe() static method of the Document object is used to parse HTML input, optionally filtering
         * unwanted HTML elements and attributes, in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTMLUnsafe_static)
         */
        public fun parseHTMLUnsafe(html: String, options: ParseHTMLUnsafeOptions = definedExternally): Document

        /**
         * The parseHTML() static method of the Document object provides an XSS-safe method to parse and sanitize a
         * string of HTML in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTML_static)
         */
        public fun parseHTML(html: String, options: SetHTMLOptions = definedExternally): Document
    }
}

public external interface ElementCreationOptions : JsAny {
    public var customElementRegistry: CustomElementRegistry?
    public var `is`: String?
}

public fun ElementCreationOptions(customElementRegistry: CustomElementRegistry? = null, `is`: String? = null): ElementCreationOptions = newJsObject<ElementCreationOptions>().apply {
    if (customElementRegistry != null) this.customElementRegistry = customElementRegistry
    if (`is` != null) this.`is` = `is`
}

public external interface ImportNodeOptions : JsAny {
    public var customElementRegistry: CustomElementRegistry?
    public var selfOnly: Boolean?
}

public fun ImportNodeOptions(customElementRegistry: CustomElementRegistry? = null, selfOnly: Boolean? = null): ImportNodeOptions = newJsObject<ImportNodeOptions>().apply {
    if (customElementRegistry != null) this.customElementRegistry = customElementRegistry
    if (selfOnly != null) this.selfOnly = selfOnly
}

/**
 * The DOMImplementation interface represents an object providing methods which are not dependent on any particular
 * document. Such an object is returned by the Document.implementation property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation)
 */
public abstract external class DOMImplementation : JsAny {
    /**
     * The DOMImplementation.createDocumentType() method returns a DocumentType object which can either be used with
     * DOMImplementation.createDocument upon document creation or can be put into the document via methods like
     * Node.insertBefore() or Node.replaceChild().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createDocumentType)
     */
    public open fun createDocumentType(name: String, publicId: String, systemId: String): DocumentType

    /**
     * The createDocument() method of the DOMImplementation interface creates and returns an XMLDocument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createDocument)
     */
    public open fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType? = definedExternally): XMLDocument

    /**
     * The DOMImplementation.createHTMLDocument() method creates a new HTML Document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createHTMLDocument)
     */
    public open fun createHTMLDocument(title: String = definedExternally): Document

    /**
     * The DOMImplementation.hasFeature() method returns a boolean flag indicating if a given feature is supported. It
     * is deprecated and modern browsers return true in all cases.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/hasFeature)
     */
    public open fun hasFeature(): Boolean
}

/**
 * The DocumentType interface represents a Node containing a doctype.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType)
 */
public abstract external class DocumentType : Node, ChildNode {
    /**
     * The read-only name property of the DocumentType returns the type of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/name)
     */
    public open val name: String

    /**
     * The read-only publicId property of the DocumentType returns a formal identifier of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/publicId)
     */
    public open val publicId: String

    /**
     * The read-only systemId property of the DocumentType returns the URL of the associated DTD.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/systemId)
     */
    public open val systemId: String

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The DocumentFragment interface represents a minimal document object that has no parent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment)
 */
public open external class DocumentFragment : Node, NonElementParentNode, ParentNode {
    /**
     * The DocumentFragment() constructor returns a new, empty DocumentFragment object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/DocumentFragment)
     */
    public constructor()

    /**
     * The getElementById() method of the DocumentFragment returns an Element object representing the element whose id
     * property matches the specified string. Since element IDs are required to be unique if specified, they're a useful
     * way to get access to a specific element quickly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/getElementById)
     */
    override fun getElementById(elementId: String): Element?

    /**
     * The read-only children property returns a live HTMLCollection which contains all of the child elements of the
     * document fragment upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/children)
     */
    override val children: HTMLCollection

    /**
     * The DocumentFragment.firstElementChild read-only property returns the document fragment's first child Element, or
     * null if there are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/firstElementChild)
     */
    override val firstElementChild: Element?

    /**
     * The DocumentFragment.lastElementChild read-only property returns the document fragment's last child Element, or
     * null if there are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/lastElementChild)
     */
    override val lastElementChild: Element?

    /**
     * The DocumentFragment.childElementCount read-only property returns the number of child elements of a
     * DocumentFragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/childElementCount)
     */
    override val childElementCount: Int

    /**
     * The DocumentFragment.prepend() method inserts a set of Node objects or strings before the first child of the
     * document fragment. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/prepend)
     */
    override fun prepend(vararg nodes: Node)

    /**
     * The DocumentFragment.prepend() method inserts a set of Node objects or strings before the first child of the
     * document fragment. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/prepend)
     */
    override fun prepend(vararg nodes: String)

    /**
     * The DocumentFragment.prepend() method inserts a set of Node objects or strings before the first child of the
     * document fragment. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/prepend)
     */
    override fun prepend()

    /**
     * The DocumentFragment.append() method inserts a set of Node objects or strings after the last child of the
     * document fragment. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/append)
     */
    override fun append(vararg nodes: Node)

    /**
     * The DocumentFragment.append() method inserts a set of Node objects or strings after the last child of the
     * document fragment. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/append)
     */
    override fun append(vararg nodes: String)

    /**
     * The DocumentFragment.append() method inserts a set of Node objects or strings after the last child of the
     * document fragment. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/append)
     */
    override fun append()

    /**
     * The DocumentFragment.replaceChildren() method replaces the existing children of a DocumentFragment with a
     * specified new set of children. These can be string or Node objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/replaceChildren)
     */
    override fun replaceChildren(vararg nodes: Node)

    /**
     * The DocumentFragment.replaceChildren() method replaces the existing children of a DocumentFragment with a
     * specified new set of children. These can be string or Node objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/replaceChildren)
     */
    override fun replaceChildren(vararg nodes: String)

    /**
     * The DocumentFragment.replaceChildren() method replaces the existing children of a DocumentFragment with a
     * specified new set of children. These can be string or Node objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/replaceChildren)
     */
    override fun replaceChildren()

    /**
     * The moveBefore() method of the DocumentFragment interface moves a given Node inside the invoking DocumentFragment
     * as a direct child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/moveBefore)
     */
    override fun moveBefore(node: Node, child: Node?)

    /**
     * The DocumentFragment.querySelector() method returns the first element, or null if no matches are found, within
     * the DocumentFragment (using depth-first pre-order traversal of the document's nodes) that matches the specified
     * group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/querySelector)
     */
    override fun querySelector(selectors: String): Element?

    /**
     * The DocumentFragment.querySelectorAll() method returns a NodeList of elements within the DocumentFragment (using
     * depth-first pre-order traversal of the document's nodes) that matches the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment/querySelectorAll)
     */
    override fun querySelectorAll(selectors: String): NodeList

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The ShadowRoot interface of the Shadow DOM API is the root node of a DOM subtree that is rendered separately from a
 * document's main DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot)
 */
public abstract external class ShadowRoot : DocumentFragment, DocumentOrShadowRoot {
    /**
     * The mode read-only property of the ShadowRoot specifies its mode — either open or closed. This defines whether or
     * not the shadow root's internal features are accessible from JavaScript.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/mode)
     */
    public open val mode: ShadowRootMode

    /**
     * The delegatesFocus read-only property of the ShadowRoot interface returns true if the shadow root delegates
     * focus, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/delegatesFocus)
     */
    public open val delegatesFocus: Boolean

    /**
     * The serializable read-only property of the ShadowRoot interface returns true if the shadow root is serializable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/serializable)
     */
    public open val serializable: Boolean

    /**
     * The read-only slotAssignment property of the ShadowRoot interface returns the slot assignment mode for the shadow
     * DOM tree. Nodes are either automatically assigned based on name matching (named) or manually assigned (manual).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/slotAssignment)
     */
    public open val slotAssignment: SlotAssignmentMode

    /**
     * The clonable read-only property of the ShadowRoot interface returns true if the shadow root is clonable, and
     * false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/clonable)
     */
    public open val clonable: Boolean

    /**
     * The host read-only property of the ShadowRoot returns a reference to the DOM element the ShadowRoot is attached
     * to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/host)
     */
    public open val host: Element
    public open var onslotchange: ((Event) -> Unit)?

    /**
     * The setHTML() method of the ShadowRoot interface provides an XSS-safe method to parse and sanitize a string of
     * HTML, which then replaces the existing tree in the Shadow DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/setHTML)
     */
    public open fun setHTML(html: String, options: SetHTMLOptions = definedExternally)
    public open fun appendHTML(html: String, options: SetHTMLOptions = definedExternally)
    public open fun prependHTML(html: String, options: SetHTMLOptions = definedExternally)

    /**
     * The setHTMLUnsafe() method of the ShadowRoot interface can be used to parse HTML input into a DocumentFragment,
     * optionally filtering out unwanted elements and attributes, and then use it to replace the existing tree in the
     * Shadow DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/setHTMLUnsafe)
     */
    public open fun setHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public open fun appendHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public open fun prependHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)

    /**
     * The getHTML() method of the ShadowRoot interface is used to serialize a shadow root's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/getHTML)
     */
    public open fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * The innerHTML property of the ShadowRoot interface gets or sets the HTML markup to the DOM tree inside the
     * ShadowRoot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ShadowRoot/innerHTML)
     */
    public open var innerHTML: String

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface ShadowRootMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ShadowRootMode.Companion.OPEN: ShadowRootMode get() = "open".toJsString().unsafeCast<ShadowRootMode>()
public inline val ShadowRootMode.Companion.CLOSED: ShadowRootMode get() = "closed".toJsString().unsafeCast<ShadowRootMode>()

public external interface SlotAssignmentMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val SlotAssignmentMode.Companion.MANUAL: SlotAssignmentMode get() = "manual".toJsString().unsafeCast<SlotAssignmentMode>()
public inline val SlotAssignmentMode.Companion.NAMED: SlotAssignmentMode get() = "named".toJsString().unsafeCast<SlotAssignmentMode>()

/**
 * Element is the most general base class from which all element objects (i.e., objects that represent elements) in a
 * Document inherit. It only has methods and properties common to all kinds of elements. More specific classes inherit
 * from Element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element)
 */
public abstract external class Element : Node, ParentNode, NonDocumentTypeChildNode, ChildNode, Slottable, GeometryUtils, ARIAMixin, ARIANotifyMixin, UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrText, UnionElementOrProcessingInstruction {
    /**
     * The Element.namespaceURI read-only property returns the namespace URI of the element, or null if the element is
     * not in a namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/namespaceURI)
     */
    public open val namespaceURI: String?

    /**
     * The Element.prefix read-only property returns the namespace prefix of the specified element, or null if no prefix
     * is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/prefix)
     */
    public open val prefix: String?

    /**
     * The Element.localName read-only property returns the local part of the qualified name of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/localName)
     */
    public open val localName: String

    /**
     * The tagName read-only property of the Element interface returns the tag name of the element on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/tagName)
     */
    public open val tagName: String

    /**
     * The id property of the Element interface reflects the element's id content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/id)
     */
    public open var id: String

    /**
     * The className property of the Element interface reflects the element's class content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/className)
     */
    public open var className: String

    /**
     * The read-only classList property of the Element interface contains a live DOMTokenList collection representing
     * the class attribute of the element. This can then be used to manipulate the class list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/classList)
     */
    public open val classList: DOMTokenList

    /**
     * The slot property of the Element interface returns the name of the shadow DOM slot the element is inserted in. It
     * reflects the element's slot content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/slot)
     */
    public open var slot: String

    /**
     * The hasAttributes() method of the Element interface returns a boolean value indicating whether the current
     * element has any attributes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributes)
     */
    public open fun hasAttributes(): Boolean

    /**
     * The attributes read-only property of the Element interface returns a live collection of all attribute nodes
     * registered to the specified node. It is a NamedNodeMap, not an Array, so it has no Array methods and the Attr
     * nodes' indexes may differ among browsers. To be more specific, attributes is a key/value pair of strings that
     * represents any information regarding that attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attributes)
     */
    public open val attributes: NamedNodeMap

    /**
     * The getAttributeNames() method of the Element interface returns the attribute names of the element as an Array of
     * strings. If the element has no attributes it returns an empty array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNames)
     */
    public open fun getAttributeNames(): JsArray<JsString>

    /**
     * The getAttribute() method of the Element interface returns the string value of the specified attribute of the
     * specified element. It returns null if the element doesn't have an attribute with the given name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttribute)
     */
    public open fun getAttribute(qualifiedName: String): String?

    /**
     * The getAttributeNS() method of the Element interface returns the string value of the specified namespaced
     * attribute of the specified element. It returns null if the element doesn't have an attribute with the given name
     * in the namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNS)
     */
    public open fun getAttributeNS(namespace: String?, localName: String): String?

    /**
     * The setAttribute() method of the Element interface sets the value of an attribute on the specified element. If
     * the attribute already exists, the value is updated; otherwise a new attribute is added with the specified name
     * and value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttribute)
     */
    public open fun setAttribute(qualifiedName: String, value: String)

    /**
     * The setAttributeNS() method of the Element interface adds a new attribute or changes the value of an attribute
     * with the given namespace and name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNS)
     */
    public open fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)

    /**
     * The Element method removeAttribute() removes the attribute with the specified name from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttribute)
     */
    public open fun removeAttribute(qualifiedName: String)

    /**
     * The removeAttributeNS() method of the Element interface removes the specified attribute with the specified
     * namespace from an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNS)
     */
    public open fun removeAttributeNS(namespace: String?, localName: String)

    /**
     * The toggleAttribute() method of the Element interface toggles a Boolean attribute on the given element, removing
     * it if present and adding it if not present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/toggleAttribute)
     */
    public open fun toggleAttribute(qualifiedName: String, force: Boolean = definedExternally): Boolean

    /**
     * The Element.hasAttribute() method returns a Boolean value indicating whether the specified element has the
     * specified attribute or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttribute)
     */
    public open fun hasAttribute(qualifiedName: String): Boolean

    /**
     * The hasAttributeNS() method of the Element interface returns a boolean value indicating whether the current
     * element has the specified attribute with the specified namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributeNS)
     */
    public open fun hasAttributeNS(namespace: String?, localName: String): Boolean

    /**
     * The getAttributeNode() method of the Element interface returns the specified attribute of the specified element,
     * as an Attr node. It returns null if the element doesn't have an attribute with the given name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNode)
     */
    public open fun getAttributeNode(qualifiedName: String): Attr?

    /**
     * The getAttributeNodeNS() method of the Element interface returns the specified namespaced attribute of the
     * specified element, as an Attr node. It returns null if the element doesn't have an attribute with the given name
     * in the namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNodeNS)
     */
    public open fun getAttributeNodeNS(namespace: String?, localName: String): Attr?

    /**
     * The setAttributeNode() method of the Element interface adds a new Attr node to the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNode)
     */
    public open fun setAttributeNode(attr: Attr): Attr?

    /**
     * The setAttributeNodeNS() method of the Element interface adds a new namespaced Attr node to an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNodeNS)
     */
    public open fun setAttributeNodeNS(attr: Attr): Attr?

    /**
     * The removeAttributeNode() method of the Element interface removes the specified Attr node from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNode)
     */
    public open fun removeAttributeNode(attr: Attr): Attr

    /**
     * The attachShadow() method of the Element interface attaches a shadow DOM tree to the specified element and
     * returns a reference to its ShadowRoot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attachShadow)
     */
    public open fun attachShadow(init: ShadowRootInit): ShadowRoot

    /**
     * The Element.shadowRoot read-only property represents the shadow root hosted by the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/shadowRoot)
     */
    public open val shadowRoot: ShadowRoot?

    /**
     * The customElementRegistry read-only property of the Element interface returns the CustomElementRegistry object
     * associated with this element, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/customElementRegistry)
     */
    public open val customElementRegistry: CustomElementRegistry?

    /**
     * The closest() method of the Element interface traverses the element and its parents (heading toward the document
     * root) until it finds a node that matches the specified CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/closest)
     */
    public open fun closest(selectors: String): Element?

    /**
     * The matches() method of the Element interface tests whether the element would be selected by the specified CSS
     * selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/matches)
     */
    public open fun matches(selectors: String): Boolean
    public open fun webkitMatchesSelector(selectors: String): Boolean

    /**
     * The Element.getElementsByTagName() method returns a live HTMLCollection of elements with the given tag name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagName)
     */
    public open fun getElementsByTagName(qualifiedName: String): HTMLCollection

    /**
     * The Element.getElementsByTagNameNS() method returns a live HTMLCollection of elements with the given tag name
     * belonging to the given namespace. It is similar to Document.getElementsByTagNameNS, except that its search is
     * restricted to descendants of the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagNameNS)
     */
    public open fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection

    /**
     * The Element method getElementsByClassName() returns a live HTMLCollection which contains every descendant element
     * which has the specified class name or names.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByClassName)
     */
    public open fun getElementsByClassName(classNames: String): HTMLCollection

    /**
     * The insertAdjacentElement() method of the Element interface inserts a given element node at a given position
     * relative to the element it is invoked upon.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentElement)
     */
    public open fun insertAdjacentElement(where: String, element: Element): Element?

    /**
     * The insertAdjacentText() method of the Element interface, given a relative position and a string, inserts a new
     * text node at the given position relative to the element it is called from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentText)
     */
    public open fun insertAdjacentText(where: String, data: String)

    /**
     * The setHTML() method of the Element interface provides an XSS-safe method to parse and sanitize a string of HTML
     * and insert it into the DOM as a subtree of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setHTML)
     */
    public open fun setHTML(html: String, options: SetHTMLOptions = definedExternally)
    public open fun appendHTML(html: String, options: SetHTMLOptions = definedExternally)
    public open fun prependHTML(html: String, options: SetHTMLOptions = definedExternally)

    /**
     * The setHTMLUnsafe() method of the Element interface is used to parse HTML input into a DocumentFragment,
     * optionally filtering out unwanted elements and attributes, and those that don't belong in the context, and then
     * using it to replace the element's subtree in the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setHTMLUnsafe)
     */
    public open fun setHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public open fun appendHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public open fun prependHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)

    /**
     * The getHTML() method of the Element interface is used to serialize an element's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getHTML)
     */
    public open fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * The innerHTML property of the Element interface gets or sets the HTML or XML markup contained within the element,
     * omitting any shadow roots in both cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML)
     */
    public open var innerHTML: String

    /**
     * The outerHTML attribute of the Element interface gets or sets the HTML or XML markup of the element and its
     * descendants, omitting any shadow roots in both cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/outerHTML)
     */
    public open var outerHTML: String

    /**
     * The insertAdjacentHTML() method of the Element interface parses the specified input as HTML or XML and inserts
     * the resulting nodes into the DOM tree at a specified position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentHTML)
     */
    public open fun insertAdjacentHTML(position: String, string: String)

    /**
     * The getClientRects() method of the Element interface returns a collection of DOMRect objects that indicate the
     * bounding rectangles for each CSS border box in a client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getClientRects)
     */
    public open fun getClientRects(): DOMRectList

    /**
     * The Element.getBoundingClientRect() method returns a DOMRect object providing information about the size of an
     * element and its position relative to the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getBoundingClientRect)
     */
    public open fun getBoundingClientRect(): DOMRect

    /**
     * The checkVisibility() method of the Element interface checks whether the element is potentially visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/checkVisibility)
     */
    public open fun checkVisibility(options: CheckVisibilityOptions = definedExternally): Boolean

    /**
     * The scrollIntoView() method of the Element interface scrolls the element's ancestor containers such that the
     * element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
    public open fun scrollIntoView(arg: Boolean): Promise<ScrollResult>

    /**
     * The scrollIntoView() method of the Element interface scrolls the element's ancestor containers such that the
     * element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
    public open fun scrollIntoView(arg: ScrollIntoViewOptions): Promise<ScrollResult>

    /**
     * The scrollIntoView() method of the Element interface scrolls the element's ancestor containers such that the
     * element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     */
    public open fun scrollIntoView(): Promise<ScrollResult>

    /**
     * The scroll() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     */
    public open fun scroll(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scroll() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     */
    public open fun scroll(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     */
    public open fun scrollTo(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     */
    public open fun scrollTo(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollBy() method of the Element interface scrolls an element by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     */
    public open fun scrollBy(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scrollBy() method of the Element interface scrolls an element by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     */
    public open fun scrollBy(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollTop property of the Element interface gets or sets the number of pixels by which an element's content
     * is scrolled from its top edge. This value is subpixel precise in modern browsers, meaning that it isn't
     * necessarily a whole number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTop)
     */
    public open var scrollTop: Double

    /**
     * The scrollLeft property of the Element interface gets or sets the number of pixels by which an element's content
     * is scrolled from its left edge. This value is subpixel precise in modern browsers, meaning that it isn't
     * necessarily a whole number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollLeft)
     */
    public open var scrollLeft: Double

    /**
     * The scrollWidth read-only property of the Element interface is a measurement of the width of an element's
     * content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollWidth)
     */
    public open val scrollWidth: Int

    /**
     * The scrollHeight read-only property of the Element interface is a measurement of the height of an element's
     * content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollHeight)
     */
    public open val scrollHeight: Int

    /**
     * The clientTop read-only property of the Element interface returns the width of the top border of an element in
     * pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientTop)
     */
    public open val clientTop: Int

    /**
     * The clientLeft read-only property of the Element interface returns the width of the left border of an element in
     * pixels. It includes the width of the vertical scrollbar if the text direction of the element is right-to-left and
     * if there is an overflow causing a left vertical scrollbar to be rendered. clientLeft does not include the left
     * margin or the left padding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientLeft)
     */
    public open val clientLeft: Int

    /**
     * The clientWidth read-only property of the Element interface is zero for inline elements and elements with no CSS;
     * otherwise, it's the inner width of an element in pixels. It includes padding but excludes borders, margins, and
     * vertical scrollbars (if present).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientWidth)
     */
    public open val clientWidth: Int

    /**
     * The clientHeight read-only property of the Element interface is zero for elements with no CSS or inline layout
     * boxes; otherwise, it's the inner height of an element in pixels. It includes padding but excludes borders,
     * margins, and horizontal scrollbars (if present).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientHeight)
     */
    public open val clientHeight: Int

    /**
     * The currentCSSZoom read-only property of the Element interface provides the "effective" CSS zoom of an element,
     * taking into account the zoom applied to the element and all its parent elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/currentCSSZoom)
     */
    public open val currentCSSZoom: Double

    /**
     * The setPointerCapture() method of the Element interface is used to designate a specific element as the capture
     * target of future pointer events. Subsequent events for the pointer will be targeted at the capture element until
     * capture is released (via Element.releasePointerCapture() or the pointerup event is fired).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setPointerCapture)
     */
    public open fun setPointerCapture(pointerId: Int)

    /**
     * The releasePointerCapture() method of the Element interface releases (stops) pointer capture that was previously
     * set for a specific (PointerEvent) pointer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/releasePointerCapture)
     */
    public open fun releasePointerCapture(pointerId: Int)

    /**
     * The hasPointerCapture() method of the Element interface checks whether the element on which it is invoked has
     * pointer capture for the pointer identified by the given pointer ID.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasPointerCapture)
     */
    public open fun hasPointerCapture(pointerId: Int): Boolean

    /**
     * The requestFullscreen() method of the Element interface issues an asynchronous request to display the element in
     * fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestFullscreen)
     */
    public open fun requestFullscreen(options: FullscreenOptions = definedExternally): Promise<JsAny?>

    /**
     * The fullscreenchange event is fired immediately after an Element switches into or out of fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event)
     */
    public open var onfullscreenchange: ((Event) -> Unit)?

    /**
     * The fullscreenerror event is fired when the browser cannot switch to fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event)
     */
    public open var onfullscreenerror: ((Event) -> Unit)?

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface ShadowRootInit : JsAny {
    public var mode: ShadowRootMode
    public var delegatesFocus: Boolean?
    public var serializable: Boolean?
    public var slotAssignment: SlotAssignmentMode?
    public var clonable: Boolean?
    public var customElementRegistry: CustomElementRegistry?
}

public fun ShadowRootInit(mode: ShadowRootMode, delegatesFocus: Boolean? = null, serializable: Boolean? = null, slotAssignment: SlotAssignmentMode? = null, clonable: Boolean? = null, customElementRegistry: CustomElementRegistry? = null): ShadowRootInit = newJsObject<ShadowRootInit>().apply {
    this.mode = mode
    if (delegatesFocus != null) this.delegatesFocus = delegatesFocus
    if (serializable != null) this.serializable = serializable
    if (slotAssignment != null) this.slotAssignment = slotAssignment
    if (clonable != null) this.clonable = clonable
    if (customElementRegistry != null) this.customElementRegistry = customElementRegistry
}

/**
 * The NamedNodeMap interface represents a collection of Attr objects. Objects inside a NamedNodeMap are not in any
 * particular order, unlike NodeList, although they may be accessed by an index as in an array.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap)
 */
public abstract external class NamedNodeMap : ItemArrayLike<Attr> {
    /**
     * The read-only length property of the NamedNodeMap interface is the number of objects stored in the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/length)
     */
    override val length: Int

    /**
     * The item() method of the NamedNodeMap interface returns the item in the map matching the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/item)
     */
    override fun item(index: Int): Attr?

    /**
     * The getNamedItem() method of the NamedNodeMap interface returns the Attr corresponding to the given name, or null
     * if there is no corresponding attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItem)
     */
    public open fun getNamedItem(qualifiedName: String): Attr?

    /**
     * The getNamedItemNS() method of the NamedNodeMap interface returns the Attr corresponding to the given local name
     * in the given namespace, or null if there is no corresponding attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/getNamedItemNS)
     */
    public open fun getNamedItemNS(namespace: String?, localName: String): Attr?

    /**
     * The setNamedItem() method of the NamedNodeMap interface puts the Attr identified by its name in the map. If there
     * is already an Attr with the same name in the map, it is replaced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItem)
     */
    public open fun setNamedItem(attr: Attr): Attr?

    /**
     * The setNamedItemNS() method of the NamedNodeMap interface puts the Attr identified by its name in the map. If
     * there was already an Attr with the same name in the map, it is replaced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/setNamedItemNS)
     */
    public open fun setNamedItemNS(attr: Attr): Attr?

    /**
     * The removeNamedItem() method of the NamedNodeMap interface removes the Attr corresponding to the given name from
     * the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItem)
     */
    public open fun removeNamedItem(qualifiedName: String): Attr

    /**
     * The removeNamedItemNS() method of the NamedNodeMap interface removes the Attr corresponding to the given
     * namespace and local name from the map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NamedNodeMap/removeNamedItemNS)
     */
    public open fun removeNamedItemNS(namespace: String?, localName: String): Attr
}

public operator fun NamedNodeMap.get(index: Int): Attr? = getProperty(this, index)

public operator fun NamedNodeMap.get(qualifiedName: String): Attr? = getProperty(this, qualifiedName)

/**
 * The Attr interface represents one of an element's attributes as an object. In most situations, you will directly
 * retrieve the attribute value as a string (e.g., Element.getAttribute()), but some cases may require interacting with
 * Attr instances (e.g., Element.getAttributeNode()).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr)
 */
public abstract external class Attr : Node {
    /**
     * The read-only namespaceURI property of the Attr interface returns the namespace URI of the attribute, or null if
     * the element is not in a namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/namespaceURI)
     */
    public open val namespaceURI: String?

    /**
     * The read-only prefix property of the Attr returns the namespace prefix of the attribute, or null if no prefix is
     * specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/prefix)
     */
    public open val prefix: String?

    /**
     * The read-only localName property of the Attr interface returns the local part of the qualified name of an
     * attribute, that is the name of the attribute, stripped from any namespace in front of it. For example, if the
     * qualified name is xml:lang, the returned local name is lang, if the element supports that namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/localName)
     */
    public open val localName: String

    /**
     * The read-only name property of the Attr interface returns the qualified name of an attribute, that is the name of
     * the attribute, with the namespace prefix, if any, in front of it. For example, if the local name is lang and the
     * namespace prefix is xml, the returned qualified name is xml:lang.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/name)
     */
    public open val name: String

    /**
     * The value property of the Attr interface contains the value of the attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/value)
     */
    public open var value: String

    /**
     * The read-only ownerElement property of the Attr interface returns the Element the attribute belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/ownerElement)
     */
    public open val ownerElement: Element?

    /**
     * The read-only specified property of the Attr interface always returns true.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/specified)
     */
    public open val specified: Boolean

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The CharacterData abstract interface represents a Node object that contains characters. This is an abstract
 * interface, meaning there aren't any objects of type CharacterData: it is implemented by other interfaces like Text,
 * Comment, CDATASection, or ProcessingInstruction, which aren't abstract.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData)
 */
public abstract external class CharacterData : Node, NonDocumentTypeChildNode, ChildNode {
    /**
     * The data property of the CharacterData interface represents the value of the current object's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/data)
     */
    public open var data: String

    /**
     * The read-only CharacterData.length property returns the number of characters in the contained data, as a positive
     * integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/length)
     */
    public open val length: Int

    /**
     * The substringData() method of the CharacterData interface returns a portion of the existing data, starting at the
     * specified index and extending for a given number of characters afterwards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/substringData)
     */
    public open fun substringData(offset: Int, count: Int): String

    /**
     * The appendData() method of the CharacterData interface adds the provided data to the end of the node's current
     * data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/appendData)
     */
    public open fun appendData(data: String)

    /**
     * The insertData() method of the CharacterData interface inserts the provided data into this CharacterData node's
     * current data, at the provided offset from the start of the existing data. The provided data is spliced into the
     * existing data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/insertData)
     */
    public open fun insertData(offset: Int, data: String)

    /**
     * The deleteData() method of the CharacterData interface removes all or part of the data from this CharacterData
     * node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/deleteData)
     */
    public open fun deleteData(offset: Int, count: Int)

    /**
     * The replaceData() method of the CharacterData interface removes a certain number of characters of the existing
     * text in a given CharacterData node and replaces those characters with the text provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceData)
     */
    public open fun replaceData(offset: Int, count: Int, data: String)

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The Text interface represents a text node in a DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text)
 */
public open external class Text : CharacterData, Slottable, GeometryUtils, UnionElementOrText {
    /**
     * The Text() constructor returns a new Text object with the optional string given in parameter as its textual
     * content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/Text)
     */
    public constructor(data: String = definedExternally)

    /**
     * The splitText() method of the Text interface breaks the Text node into two nodes at the specified offset, keeping
     * both nodes in the tree as siblings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/splitText)
     */
    public open fun splitText(offset: Int): Text

    /**
     * The read-only wholeText property of the Text interface returns the full text of all Text nodes logically adjacent
     * to the node. The text is concatenated in document order. This allows specifying any text node and obtaining all
     * adjacent text as a single string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/wholeText)
     */
    public open val wholeText: String

    /**
     * The Element.previousElementSibling read-only property returns the Element immediately prior to the specified one
     * in its parent's children list, or null if the specified element is the first one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/previousElementSibling)
     */
    override val previousElementSibling: Element?

    /**
     * The Element.nextElementSibling read-only property returns the element immediately following the specified one in
     * its parent's children list, or null if the specified element is the last one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/nextElementSibling)
     */
    override val nextElementSibling: Element?
    override fun beforeHTML(html: String, options: SetHTMLOptions)
    override fun afterHTML(html: String, options: SetHTMLOptions)
    override fun replaceWithHTML(html: String, options: SetHTMLOptions)
    override fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before(vararg nodes: Node)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before(vararg nodes: String)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before()

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after(vararg nodes: Node)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after(vararg nodes: String)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after()

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith(vararg nodes: Node)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith(vararg nodes: String)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith()

    /**
     * The remove() method of the DocumentType interface removes the DocumentType node from its parent node. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/remove)
     */
    override fun remove()

    /**
     * The read-only assignedSlot property of the Text interface returns the HTMLSlotElement object associated with the
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Text/assignedSlot)
     */
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The CDATASection interface represents a CDATA section that can be used within XML to include extended portions of
 * unescaped text. When inside a CDATA section, the symbols &lt; and &amp; don't need escaping as they normally do.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CDATASection)
 */
public abstract external class CDATASection : Text {

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The ProcessingInstruction interface represents a processing instruction — a Node that embeds an instruction targeting
 * a specific application, which can be ignored by any application that doesn't recognize the instruction.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction)
 */
public open external class ProcessingInstruction : CharacterData, LinkStyle, UnionElementOrProcessingInstruction {
    public constructor(target: String, data: String = definedExternally)

    /**
     * The read-only target property of the ProcessingInstruction interface represent the application to which the
     * ProcessingInstruction is targeted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/target)
     */
    public open val target: String

    /**
     * The hasAttributes() method of the ProcessingInstruction interface returns a boolean value indicating whether the
     * current element has any attributes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/hasAttributes)
     */
    public open fun hasAttributes(): Boolean

    /**
     * The getAttributeNames() method of the ProcessingInstruction interface returns the attribute names of the
     * processing instruction as an Array of strings. If the processing instruction has no attributes it returns an
     * empty array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/getAttributeNames)
     */
    public open fun getAttributeNames(): JsArray<JsString>

    /**
     * The getAttribute() method of the ProcessingInstruction interface returns the value of a specified attribute on
     * the processing instruction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/getAttribute)
     */
    public open fun getAttribute(name: String): String?

    /**
     * The setAttribute() method of the ProcessingInstruction interface sets the value of an attribute on the processing
     * instruction. If the attribute already exists, the value is updated; otherwise, a new attribute is added with the
     * specified name and value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/setAttribute)
     */
    public open fun setAttribute(name: String, value: String)

    /**
     * The removeAttribute() method of the ProcessingInstruction removes the attribute with the specified name from the
     * processing instruction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/removeAttribute)
     */
    public open fun removeAttribute(name: String)

    /**
     * The toggleAttribute() method of the ProcessingInstruction interface toggles a boolean attribute on the given
     * processing instruction, removing it if present and adding it if not present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/toggleAttribute)
     */
    public open fun toggleAttribute(name: String, force: Boolean = definedExternally): Boolean

    /**
     * The hasAttribute() method of the ProcessingInstruction interface returns a boolean value indicating whether the
     * specified element has the specified attribute or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/hasAttribute)
     */
    public open fun hasAttribute(name: String): Boolean

    /**
     * The Element.previousElementSibling read-only property returns the Element immediately prior to the specified one
     * in its parent's children list, or null if the specified element is the first one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/previousElementSibling)
     */
    override val previousElementSibling: Element?

    /**
     * The Element.nextElementSibling read-only property returns the element immediately following the specified one in
     * its parent's children list, or null if the specified element is the last one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/nextElementSibling)
     */
    override val nextElementSibling: Element?
    override fun beforeHTML(html: String, options: SetHTMLOptions)
    override fun afterHTML(html: String, options: SetHTMLOptions)
    override fun replaceWithHTML(html: String, options: SetHTMLOptions)
    override fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before(vararg nodes: Node)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before(vararg nodes: String)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before()

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after(vararg nodes: Node)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after(vararg nodes: String)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after()

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith(vararg nodes: Node)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith(vararg nodes: String)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith()

    /**
     * The remove() method of the DocumentType interface removes the DocumentType node from its parent node. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/remove)
     */
    override fun remove()

    /**
     * The read-only sheet property of the ProcessingInstruction interface contains the stylesheet associated to the
     * ProcessingInstruction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProcessingInstruction/sheet)
     */
    override val sheet: CSSStyleSheet?

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The Comment interface represents textual notations within markup; although it is generally not visually shown, such
 * comments are available to be read in the source view.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Comment)
 */
public open external class Comment : CharacterData {
    /**
     * The Comment() constructor returns a newly created Comment object with the optional string given in parameter as
     * its textual content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Comment/Comment)
     */
    public constructor(data: String = definedExternally)

    /**
     * The Element.previousElementSibling read-only property returns the Element immediately prior to the specified one
     * in its parent's children list, or null if the specified element is the first one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/previousElementSibling)
     */
    override val previousElementSibling: Element?

    /**
     * The Element.nextElementSibling read-only property returns the element immediately following the specified one in
     * its parent's children list, or null if the specified element is the last one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/nextElementSibling)
     */
    override val nextElementSibling: Element?
    override fun beforeHTML(html: String, options: SetHTMLOptions)
    override fun afterHTML(html: String, options: SetHTMLOptions)
    override fun replaceWithHTML(html: String, options: SetHTMLOptions)
    override fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before(vararg nodes: Node)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before(vararg nodes: String)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     */
    override fun before()

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after(vararg nodes: Node)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after(vararg nodes: String)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     */
    override fun after()

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith(vararg nodes: Node)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith(vararg nodes: String)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     */
    override fun replaceWith()

    /**
     * The remove() method of the DocumentType interface removes the DocumentType node from its parent node. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/remove)
     */
    override fun remove()

    public companion object {
        public val ELEMENT_NODE: Short
        public val ATTRIBUTE_NODE: Short
        public val TEXT_NODE: Short
        public val CDATA_SECTION_NODE: Short
        public val ENTITY_REFERENCE_NODE: Short
        public val ENTITY_NODE: Short
        public val PROCESSING_INSTRUCTION_NODE: Short
        public val COMMENT_NODE: Short
        public val DOCUMENT_NODE: Short
        public val DOCUMENT_TYPE_NODE: Short
        public val DOCUMENT_FRAGMENT_NODE: Short
        public val NOTATION_NODE: Short
        public val DOCUMENT_POSITION_DISCONNECTED: Short
        public val DOCUMENT_POSITION_PRECEDING: Short
        public val DOCUMENT_POSITION_FOLLOWING: Short
        public val DOCUMENT_POSITION_CONTAINS: Short
        public val DOCUMENT_POSITION_CONTAINED_BY: Short
        public val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The AbstractRange abstract interface is the base class upon which all DOM range types are defined. A range is an
 * object that indicates the start and end points of a section of content within the document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange)
 */
public abstract external class AbstractRange : JsAny {
    /**
     * The read-only startContainer property of the AbstractRange interface returns the Node in which the start of the
     * range is located.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startContainer)
     */
    public open val startContainer: Node

    /**
     * The read-only startOffset property of the AbstractRange interface returns the offset into the start node of the
     * range's start position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/startOffset)
     */
    public open val startOffset: Int

    /**
     * The read-only endContainer property of the AbstractRange interface returns the Node in which the end of the range
     * is located.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endContainer)
     */
    public open val endContainer: Node

    /**
     * The endOffset read-only property of the AbstractRange interface returns the offset into the end node of the
     * range's end position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/endOffset)
     */
    public open val endOffset: Int

    /**
     * The read-only collapsed property of the AbstractRange interface returns true if the range's start position and
     * end position are the same.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbstractRange/collapsed)
     */
    public open val collapsed: Boolean
}

public external interface StaticRangeInit : JsAny {
    public var startContainer: Node
    public var startOffset: Int
    public var endContainer: Node
    public var endOffset: Int
}

public fun StaticRangeInit(startContainer: Node, startOffset: Int, endContainer: Node, endOffset: Int): StaticRangeInit = newJsObject<StaticRangeInit>().apply {
    this.startContainer = startContainer
    this.startOffset = startOffset
    this.endContainer = endContainer
    this.endOffset = endOffset
}

/**
 * The DOM StaticRange interface extends AbstractRange to provide a method to specify a range of content in the DOM
 * whose contents don't update to reflect changes which occur within the DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StaticRange)
 */
public open external class StaticRange : AbstractRange {
    /**
     * The StaticRange() constructor creates a new StaticRange object representing a span of content within the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StaticRange/StaticRange)
     */
    public constructor(init: StaticRangeInit)
}

/**
 * The Range interface represents a fragment of a document that can contain nodes and parts of text nodes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range)
 */
public open external class Range : AbstractRange {
    /**
     * The Range() constructor returns a newly created Range object whose start and end are offset 0 of the global
     * document object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/Range)
     */
    public constructor()

    /**
     * The Range.commonAncestorContainer read-only property returns the deepest — or furthest down the document tree —
     * Node that contains both boundary points of the Range. This means that if startContainer and endContainer both
     * refer to the same node, this node is the common ancestor container.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/commonAncestorContainer)
     */
    public open val commonAncestorContainer: Node

    /**
     * The Range.setStart() method sets the start position of a Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStart)
     */
    public open fun setStart(node: Node, offset: Int)

    /**
     * The Range.setEnd() method sets the end position of a Range to be located at the given offset into the specified
     * node. Setting the end point above (higher in the document) than the start point will result in a collapsed range
     * with the start and end points both set to the specified end position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEnd)
     */
    public open fun setEnd(node: Node, offset: Int)

    /**
     * The Range.setStartBefore() method sets the start position of a Range relative to another Node. The parent Node of
     * the start of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartBefore)
     */
    public open fun setStartBefore(node: Node)

    /**
     * The Range.setStartAfter() method sets the start position of a Range relative to a Node. The parent Node of the
     * start of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setStartAfter)
     */
    public open fun setStartAfter(node: Node)

    /**
     * The Range.setEndBefore() method sets the end position of a Range relative to another Node. The parent Node of end
     * of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndBefore)
     */
    public open fun setEndBefore(node: Node)

    /**
     * The Range.setEndAfter() method sets the end position of a Range relative to another Node. The parent Node of end
     * of the Range will be the same as that for the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/setEndAfter)
     */
    public open fun setEndAfter(node: Node)

    /**
     * The collapse() method of the Range interface collapses the Range to one of its boundary points.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/collapse)
     */
    public open fun collapse(toStart: Boolean = definedExternally)

    /**
     * The Range.selectNode() method sets the Range to contain the Node and its contents. The parent Node of the start
     * and end of the Range will be the same as the parent of the referenceNode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNode)
     */
    public open fun selectNode(node: Node)

    /**
     * The Range.selectNodeContents() method sets the Range to contain the contents of a Node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/selectNodeContents)
     */
    public open fun selectNodeContents(node: Node)

    /**
     * The compareBoundaryPoints() method of the Range interface compares the boundary points of the Range with those of
     * another range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/compareBoundaryPoints)
     */
    public open fun compareBoundaryPoints(how: Short, sourceRange: Range): Short

    /**
     * The Range.deleteContents() method removes all completely-selected nodes within this range from the document. For
     * the partially selected nodes at the start or end of the range, only the selected portion of the text is deleted,
     * while the node itself remains intact. Afterwards, the range is collapsed to the end of the last selected node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/deleteContents)
     */
    public open fun deleteContents()

    /**
     * The extractContents() method of the Range interface is similar to a combination of Range.cloneContents() and
     * Range.deleteContents(). It removes the child Nodes of the range from the document, clones them, and returns them
     * as a new DocumentFragment object. For partially selected nodes, only the selected text is deleted, but all
     * containing parent nodes up to the common ancestor are cloned as well, resulting in two copies of these nodes, one
     * in the original document and one in the extracted fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/extractContents)
     */
    public open fun extractContents(): DocumentFragment

    /**
     * The cloneContents() method of the Range interface copies the selected Node children of the range's
     * commonAncestorContainer and puts them in a new DocumentFragment object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneContents)
     */
    public open fun cloneContents(): DocumentFragment

    /**
     * The Range.insertNode() method inserts a node at the start of the Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/insertNode)
     */
    public open fun insertNode(node: Node)

    /**
     * The surroundContents() method of the Range interface surrounds the selected content by a provided node. It
     * extracts the contents of the range, replaces the children of newParent with the extracted contents, inserts
     * newParent at the location of the extracted contents, and makes the range select newParent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/surroundContents)
     */
    public open fun surroundContents(newParent: Node)

    /**
     * The Range.cloneRange() method returns a Range object with boundary points identical to the cloned Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/cloneRange)
     */
    public open fun cloneRange(): Range

    /**
     * The Range.detach() method does nothing. It used to disable the Range object and enable the browser to release
     * associated resources. The method has been kept for compatibility.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/detach)
     */
    public open fun detach()

    /**
     * The isPointInRange() method of the Range interface determines whether a specified point is within the Range. The
     * point is specified by a reference node and an offset within that node. It is equivalent to calling
     * Range.comparePoint() and checking if the result is 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/isPointInRange)
     */
    public open fun isPointInRange(node: Node, offset: Int): Boolean

    /**
     * The comparePoint() method of the Range interface determines whether a specified point is before, within, or after
     * the Range. The point is specified by a reference node and an offset within that node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/comparePoint)
     */
    public open fun comparePoint(node: Node, offset: Int): Short

    /**
     * The Range.intersectsNode() method returns a boolean indicating whether the given Node intersects the Range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/intersectsNode)
     */
    public open fun intersectsNode(node: Node): Boolean

    /**
     * The Range.createContextualFragment() method of the Range interface returns a DocumentFragment representing the
     * parsed input HTML or XML.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/createContextualFragment)
     */
    public open fun createContextualFragment(string: String): DocumentFragment

    /**
     * The Range.getClientRects() method returns a list of DOMRect objects representing the area of the screen occupied
     * by the range. This is created by aggregating the results of calls to Element.getClientRects() for all the
     * elements in the range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getClientRects)
     */
    public open fun getClientRects(): DOMRectList

    /**
     * The Range.getBoundingClientRect() method returns a DOMRect object that bounds the contents of the range; this is
     * a rectangle enclosing the union of the bounding rectangles for all the elements in the range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Range/getBoundingClientRect)
     */
    public open fun getBoundingClientRect(): DOMRect

    public companion object {
        public val START_TO_START: Short
        public val START_TO_END: Short
        public val END_TO_END: Short
        public val END_TO_START: Short
    }
}

/**
 * The NodeIterator interface represents an iterator to traverse nodes of a DOM subtree in document order.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator)
 */
public abstract external class NodeIterator : JsAny {
    /**
     * The NodeIterator.root read-only property represents the Node that is the root of what the NodeIterator traverses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/root)
     */
    public open val root: Node

    /**
     * The NodeIterator.referenceNode read-only property returns the Node to which the iterator is anchored; as new
     * nodes are inserted, the iterator remains anchored to the reference node as specified by this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/referenceNode)
     */
    public open val referenceNode: Node

    /**
     * The NodeIterator.pointerBeforeReferenceNode read-only property returns a boolean flag that indicates whether the
     * NodeFilter is anchored before (if this value is true) or after (if this value is false) the anchor node indicated
     * by the NodeIterator.referenceNode property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/pointerBeforeReferenceNode)
     */
    public open val pointerBeforeReferenceNode: Boolean

    /**
     * The NodeIterator.whatToShow read-only property represents an unsigned integer representing a bitmask signifying
     * what types of nodes should be returned by the NodeIterator.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/whatToShow)
     */
    public open val whatToShow: Int

    /**
     * The NodeIterator.filter read-only property returns a NodeFilter object, that is an object which implements an
     * acceptNode(node) method, used to screen nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/filter)
     */
    public open val filter: NodeFilter?

    /**
     * The NodeIterator.nextNode() method returns the next node in the set represented by the NodeIterator and advances
     * the position of the iterator within the set. The first call to nextNode() returns the first node in the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/nextNode)
     */
    public open fun nextNode(): Node?

    /**
     * The NodeIterator.previousNode() method returns the previous node in the set represented by the NodeIterator and
     * moves the position of the iterator backwards within the set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/previousNode)
     */
    public open fun previousNode(): Node?

    /**
     * The NodeIterator.detach() method is a no-op, kept for backward compatibility only.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeIterator/detach)
     */
    public open fun detach()
}

/**
 * The TreeWalker object represents the nodes of a document subtree and a position within them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker)
 */
public abstract external class TreeWalker : JsAny {
    /**
     * The TreeWalker.root read-only property returns the root Node that the TreeWalker traverses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/root)
     */
    public open val root: Node

    /**
     * The TreeWalker.whatToShow read-only property returns a bitmask that indicates the types of nodes to show.
     * Non-matching nodes are skipped, but their children may be included, if relevant.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/whatToShow)
     */
    public open val whatToShow: Int

    /**
     * The TreeWalker.filter read-only property returns the NodeFilter associated with the TreeWalker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/filter)
     */
    public open val filter: NodeFilter?

    /**
     * The TreeWalker.currentNode property represents the Node which the TreeWalker is currently pointing at.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/currentNode)
     */
    public open var currentNode: Node

    /**
     * The TreeWalker.parentNode() method moves the current Node to the first visible ancestor node in the document
     * order, and returns the found node. If no such node exists, or if it is above the TreeWalker's root node, it
     * returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/parentNode)
     */
    public open fun parentNode(): Node?

    /**
     * The TreeWalker.firstChild() method moves the current Node to the first visible child of the current node, and
     * returns the found child. If no such child exists, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/firstChild)
     */
    public open fun firstChild(): Node?

    /**
     * The TreeWalker.lastChild() method moves the current Node to the last visible child of the current node, and
     * returns the found child. If no such child exists, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/lastChild)
     */
    public open fun lastChild(): Node?

    /**
     * The TreeWalker.previousSibling() method moves the current Node to its previous sibling, if any, and returns the
     * found sibling. If there is no such node, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousSibling)
     */
    public open fun previousSibling(): Node?

    /**
     * The TreeWalker.nextSibling() method moves the current Node to its next sibling, if any, and returns the found
     * sibling. If there is no such node, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextSibling)
     */
    public open fun nextSibling(): Node?

    /**
     * The TreeWalker.previousNode() method moves the current Node to the previous visible node in the document order,
     * and returns the found node. If no such node exists, or if it is before that the root node defined at the object
     * construction, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/previousNode)
     */
    public open fun previousNode(): Node?

    /**
     * The TreeWalker.nextNode() method moves the current Node to the next visible node in the document order, and
     * returns the found node. If no such node exists, it returns null and the current node is not changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TreeWalker/nextNode)
     */
    public open fun nextNode(): Node?
}

public external interface NodeFilter : JsAny {
    public fun acceptNode(node: Node): Short

    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val NodeFilter.Companion.FILTER_ACCEPT: Short get() = 1
public inline val NodeFilter.Companion.FILTER_REJECT: Short get() = 2
public inline val NodeFilter.Companion.FILTER_SKIP: Short get() = 3
public inline val NodeFilter.Companion.SHOW_ALL: Int get() = 0xFFFFFFFF.toInt()
public inline val NodeFilter.Companion.SHOW_ELEMENT: Int get() = 0x1
public inline val NodeFilter.Companion.SHOW_ATTRIBUTE: Int get() = 0x2
public inline val NodeFilter.Companion.SHOW_TEXT: Int get() = 0x4
public inline val NodeFilter.Companion.SHOW_CDATA_SECTION: Int get() = 0x8
public inline val NodeFilter.Companion.SHOW_ENTITY_REFERENCE: Int get() = 0x10
public inline val NodeFilter.Companion.SHOW_ENTITY: Int get() = 0x20
public inline val NodeFilter.Companion.SHOW_PROCESSING_INSTRUCTION: Int get() = 0x40
public inline val NodeFilter.Companion.SHOW_COMMENT: Int get() = 0x80
public inline val NodeFilter.Companion.SHOW_DOCUMENT: Int get() = 0x100
public inline val NodeFilter.Companion.SHOW_DOCUMENT_TYPE: Int get() = 0x200
public inline val NodeFilter.Companion.SHOW_DOCUMENT_FRAGMENT: Int get() = 0x400
public inline val NodeFilter.Companion.SHOW_NOTATION: Int get() = 0x800

/**
 * The DOMTokenList interface represents a set of space-separated tokens. Such a set is returned by Element.classList or
 * HTMLLinkElement.relList, and many others.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList)
 */
public abstract external class DOMTokenList : ItemArrayLike<JsString> {
    /**
     * The read-only length property of the DOMTokenList interface is an integer representing the number of objects
     * stored in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/length)
     */
    override val length: Int

    /**
     * The item() method of the DOMTokenList interface returns an item in the list, determined by its position in the
     * list, its index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/item)
     */
    override fun item(index: Int): JsString?

    /**
     * The contains() method of the DOMTokenList interface returns a boolean value — true if the underlying list
     * contains the given token, otherwise false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/contains)
     */
    public open fun contains(token: String): Boolean

    /**
     * The add() method of the DOMTokenList interface adds the given tokens to the list, omitting any that are already
     * present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/add)
     */
    public open fun add(vararg tokens: String)

    /**
     * The remove() method of the DOMTokenList interface removes the specified tokens from the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/remove)
     */
    public open fun remove(vararg tokens: String)

    /**
     * The toggle() method of the DOMTokenList interface removes an existing token from the list and returns false. If
     * the token doesn't exist it's added and the function returns true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/toggle)
     */
    public open fun toggle(token: String, force: Boolean = definedExternally): Boolean

    /**
     * The replace() method of the DOMTokenList interface replaces an existing token with a new token. If the first
     * token doesn't exist, replace() returns false immediately, without adding the new token to the token list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/replace)
     */
    public open fun replace(token: String, newToken: String): Boolean

    /**
     * The supports() method of the DOMTokenList interface returns true if a given token is in the associated
     * attribute's supported tokens. This method is intended to support feature detection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/supports)
     */
    public open fun supports(token: String): Boolean

    /**
     * The value property of the DOMTokenList interface is a stringifier that returns the value of the list serialized
     * as a string, or clears and sets the list to the given value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMTokenList/value)
     */
    public open var value: String
    // not printed yet: iterable
}

public operator fun DOMTokenList.get(index: Int): String? = getStringProperty(this, index)

/**
 * The XPathResult interface represents the results generated by evaluating an XPath expression within the context of a
 * given node.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult)
 */
public abstract external class XPathResult : JsAny {
    /**
     * The read-only resultType property of the XPathResult interface represents the type of the result, as defined by
     * the type constants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/resultType)
     */
    public open val resultType: Short

    /**
     * The read-only numberValue property of the XPathResult interface returns the numeric value of a result with
     * XPathResult.resultType being NUMBER_TYPE.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/numberValue)
     */
    public open val numberValue: Double

    /**
     * The read-only stringValue property of the XPathResult interface returns the string value of a result with
     * XPathResult.resultType being STRING_TYPE.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/stringValue)
     */
    public open val stringValue: String

    /**
     * The read-only booleanValue property of the XPathResult interface returns the boolean value of a result with
     * XPathResult.resultType being BOOLEAN_TYPE.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/booleanValue)
     */
    public open val booleanValue: Boolean

    /**
     * The read-only singleNodeValue property of the XPathResult interface returns a Node value or null in case no node
     * was matched of a result with XPathResult.resultType being ANY_UNORDERED_NODE_TYPE or FIRST_ORDERED_NODE_TYPE.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/singleNodeValue)
     */
    public open val singleNodeValue: Node?

    /**
     * The read-only invalidIteratorState property of the XPathResult interface signifies that the iterator has become
     * invalid. It is true if XPathResult.resultType is UNORDERED_NODE_ITERATOR_TYPE or ORDERED_NODE_ITERATOR_TYPE and
     * the document has been modified since this result was returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/invalidIteratorState)
     */
    public open val invalidIteratorState: Boolean

    /**
     * The read-only snapshotLength property of the XPathResult interface represents the number of nodes in the result
     * snapshot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/snapshotLength)
     */
    public open val snapshotLength: Int

    /**
     * The iterateNext() method of the XPathResult interface iterates over a node set result and returns the next node
     * from it or null if there are no more nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/iterateNext)
     */
    public open fun iterateNext(): Node?

    /**
     * The snapshotItem() method of the XPathResult interface returns an item of the snapshot collection or null in case
     * the index is not within the range of nodes. Unlike the iterator result, the snapshot does not become invalid, but
     * may not correspond to the current document if it is mutated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathResult/snapshotItem)
     */
    public open fun snapshotItem(index: Int): Node?

    public companion object {
        public val ANY_TYPE: Short
        public val NUMBER_TYPE: Short
        public val STRING_TYPE: Short
        public val BOOLEAN_TYPE: Short
        public val UNORDERED_NODE_ITERATOR_TYPE: Short
        public val ORDERED_NODE_ITERATOR_TYPE: Short
        public val UNORDERED_NODE_SNAPSHOT_TYPE: Short
        public val ORDERED_NODE_SNAPSHOT_TYPE: Short
        public val ANY_UNORDERED_NODE_TYPE: Short
        public val FIRST_ORDERED_NODE_TYPE: Short
    }
}

/**
 * This interface is a compiled XPath expression that can be evaluated on a document or specific node to return
 * information from its DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression)
 */
public abstract external class XPathExpression : JsAny {
    /**
     * The evaluate() method of the XPathExpression interface executes an XPath expression on the given node or document
     * and returns an XPathResult.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathExpression/evaluate)
     */
    public open fun evaluate(contextNode: Node, type: Short = definedExternally, result: XPathResult? = definedExternally): XPathResult
}

public external interface XPathNSResolver : JsAny {
    public fun lookupNamespaceURI(prefix: String?): String?
}

public external interface XPathEvaluatorBase : JsAny {
    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     */
    public fun createExpression(expression: String, resolver: XPathNSResolver? = definedExternally): XPathExpression

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     */
    public fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression

    /**
     * The createNSResolver() method of the Document interface used to create a custom XPathNSResolver object. It now
     * returns the input as-is and is only kept for compatibility reasons.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNSResolver)
     */
    public fun createNSResolver(nodeResolver: Node): Node

    /**
     * The evaluate() method of the Document interface selects elements based on the XPath expression given in
     * parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     */
    public fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver? = definedExternally, type: Short = definedExternally, result: XPathResult? = definedExternally): XPathResult

    /**
     * The evaluate() method of the Document interface selects elements based on the XPath expression given in
     * parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     */
    public fun evaluate(expression: String, contextNode: Node, resolver: (String?) -> String?, type: Short = definedExternally, result: XPathResult? = definedExternally): XPathResult
}

/**
 * The XPathEvaluator interface allows you to compile and evaluate XPath expressions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator)
 */
public open external class XPathEvaluator : XPathEvaluatorBase {
    /**
     * The XPathEvaluator() constructor creates a new XPathEvaluator.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator/XPathEvaluator)
     */
    public constructor()

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations of the XPath
     * expression.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator/createExpression)
     */
    override fun createExpression(expression: String, resolver: XPathNSResolver?): XPathExpression

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations of the XPath
     * expression.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator/createExpression)
     */
    override fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression

    /**
     * The createNSResolver() method of the XPathEvaluator interface used to create a custom XPathNSResolver object. It
     * now returns the input as-is and is only kept for compatibility reasons.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator/createNSResolver)
     */
    override fun createNSResolver(nodeResolver: Node): Node

    /**
     * The evaluate() method of the XPathEvaluator interface executes an XPath expression on the given node or document
     * and returns an XPathResult.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator/evaluate)
     */
    override fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver?, type: Short, result: XPathResult?): XPathResult

    /**
     * The evaluate() method of the XPathEvaluator interface executes an XPath expression on the given node or document
     * and returns an XPathResult.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XPathEvaluator/evaluate)
     */
    override fun evaluate(expression: String, contextNode: Node, resolver: (String?) -> String?, type: Short, result: XPathResult?): XPathResult
}

/**
 * An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as
 * output. It has methods to load the XSLT stylesheet, to manipulate &lt;xsl:param&gt; parameter values, and to apply
 * the transformation to documents.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor)
 */
public open external class XSLTProcessor : JsAny {
    /**
     * The XSLTProcessor() constructor creates a new XSLTProcessor object instance.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/XSLTProcessor)
     */
    public constructor()

    /**
     * The importStylesheet() method of the XSLTProcessor interface imports an XSLT stylesheet for the processor.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/importStylesheet)
     */
    public open fun importStylesheet(style: Node)

    /**
     * The transformToFragment() method of the XSLTProcessor interface transforms a provided Node source to a
     * DocumentFragment using the XSLT stylesheet associated with the XSLTProcessor.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToFragment)
     */
    public open fun transformToFragment(source: Node, output: Document): DocumentFragment

    /**
     * The transformToDocument() method of the XSLTProcessor interface transforms the provided Node source to a Document
     * using the XSLT stylesheet associated with XSLTProcessor.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToDocument)
     */
    public open fun transformToDocument(source: Node): Document

    /**
     * The setParameter() method of the XSLTProcessor interface sets the value of a parameter (&lt;xsl:param&gt;) in the
     * stylesheet imported in the processor.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/setParameter)
     */
    public open fun setParameter(namespaceURI: String, localName: String, value: JsAny?)

    /**
     * The getParameter() method of the XSLTProcessor interface returns the value of a parameter (&lt;xsl:param&gt;)
     * from the stylesheet imported in the processor.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/getParameter)
     */
    public open fun getParameter(namespaceURI: String, localName: String): JsAny?

    /**
     * The removeParameter() method of the XSLTProcessor interface removes the parameter (&lt;xsl:param&gt;) and its
     * value from the stylesheet imported in the processor.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/removeParameter)
     */
    public open fun removeParameter(namespaceURI: String, localName: String)

    /**
     * The clearParameters() method of the XSLTProcessor interface removes all parameters (&lt;xsl:param&gt;) and their
     * values from the stylesheet imported in the processor. The XSLTProcessor will then use the default values
     * specified in the XSLT stylesheet.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/clearParameters)
     */
    public open fun clearParameters()

    /**
     * The reset() method of the XSLTProcessor interface removes all parameters (&lt;xsl:param&gt;) and the XSLT
     * stylesheet from the processor. The XSLTProcessor will then be in its original state when it was created.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/reset)
     */
    public open fun reset()
}
