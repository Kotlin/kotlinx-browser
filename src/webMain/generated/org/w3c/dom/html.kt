/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'html', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.css.*
import org.w3c.dom.encryptedmedia.*
import org.w3c.dom.events.*
import org.w3c.dom.mediacapture.*
import org.w3c.dom.mediasource.*
import org.w3c.dom.pointerevents.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

public external interface UnionElementOrHTMLCollection : JsAny

public external interface UnionElementOrRadioNodeList : JsAny

public external interface UnionHTMLOptGroupElementOrHTMLOptionElement : JsAny

public external interface MediaProvider : JsAny

public external interface UnionAudioTrackOrTextTrackOrVideoTrack : JsAny

public external interface UnionElementOrText : GeometryNode

public external interface RenderingContext : JsAny

public external interface CanvasImageSource : ImageBitmapSource

public external interface UnionHTMLCanvasElementOrOffscreenCanvas : CanvasImageSource, TexImageSource

public external interface OffscreenRenderingContext : JsAny

public external interface ImageBitmapSource : JsAny

public external interface MessageEventSource : JsAny

/**
 * The HTMLAllCollection interface represents a collection of all of the document's elements, accessible by index (like
 * an array) and by the element's id. It is returned by the document.all property.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection)
 */
public abstract external class HTMLAllCollection : JsAny {
    /**
     * The HTMLAllCollection.length property returns the number of items in this HTMLAllCollection.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection/length)
     */
    open val length: Int

    /**
     * The namedItem() method of the HTMLAllCollection interface returns the first Element in the collection whose id or
     * name attribute matches the specified name, or null if no element matches.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection/namedItem)
     */
    open fun namedItem(name: String): UnionElementOrHTMLCollection?

    /**
     * The item() method of the HTMLAllCollection interface returns the element located at the specified offset into the
     * collection, or the element with the specified value for its id or name attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection/item)
     */
    open fun item(nameOrIndex: String = definedExternally): UnionElementOrHTMLCollection?
}

public operator fun HTMLAllCollection.get(index: Int): Element? = getProperty(this, index)

public operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? = getProperty(this, name)

/**
 * The HTMLFormControlsCollection interface represents a collection of HTML form control elements, returned by the
 * HTMLFormElement interface's elements property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormControlsCollection)
 */
public abstract external class HTMLFormControlsCollection : HTMLCollection

public operator fun HTMLFormControlsCollection.get(name: String): UnionElementOrRadioNodeList? = getProperty(this, name)

/**
 * The RadioNodeList interface represents a collection of elements in a &lt;form&gt; returned by a call to
 * HTMLFormControlsCollection.namedItem().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RadioNodeList)
 */
public abstract external class RadioNodeList : NodeList, UnionElementOrRadioNodeList {
    /**
     * If the underlying element collection contains radio buttons, the RadioNodeList.value property represents the
     * checked radio button. On retrieving the value property, the value of the currently checked radio button is
     * returned as a string. If the collection does not contain any radio buttons or none of the radio buttons in the
     * collection is in checked state, the empty string is returned. On setting the value property, the first radio
     * button input element whose value property is equal to the new value will be set to checked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RadioNodeList/value)
     */
    open var value: String
}

/**
 * The HTMLOptionsCollection interface represents a collection of &lt;option&gt; HTML elements (in document order) and
 * offers methods and properties for selecting from the list as well as optionally altering its items. This object is
 * returned only by the options property of select.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection)
 */
public abstract external class HTMLOptionsCollection : HTMLCollection {
    /**
     * The length property of the HTMLOptionsCollection interface returns the number of &lt;option&gt; elements in the
     * collection. The property can get or set the size of the collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/length)
     */
    override var length: Int

    /**
     * The add() method of the HTMLOptionsCollection interface adds an HTMLOptionElement or HTMLOptGroupElement to this
     * HTMLOptionsCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/add)
     */
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: HTMLElement?)

    /**
     * The add() method of the HTMLOptionsCollection interface adds an HTMLOptionElement or HTMLOptGroupElement to this
     * HTMLOptionsCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/add)
     */
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Int?)

    /**
     * The add() method of the HTMLOptionsCollection interface adds an HTMLOptionElement or HTMLOptGroupElement to this
     * HTMLOptionsCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/add)
     */
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)

    /**
     * The remove() method of the HTMLOptionsCollection interface removes the &lt;option&gt; element specified by the
     * index from this collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/remove)
     */
    open fun remove(index: Int)

    /**
     * The selectedIndex property of the HTMLOptionsCollection interface is the numeric index of the first selected
     * &lt;option&gt; element, if any, or −1 if no &lt;option&gt; is selected. Setting this property selects the option
     * at that index and deselects all other options in this collection, while setting it to -1 deselects any currently
     * selected elements. It is exactly equivalent to the selectedIndex property of the HTMLSelectElement that owns this
     * collection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionsCollection/selectedIndex)
     */
    open var selectedIndex: Int
}

public operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?) { setProperty(this, index, option) }

/**
 * The DOMStringList interface is a legacy type returned by some APIs and represents a non-modifiable list of strings
 * (DOMString).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList)
 */
public abstract external class DOMStringList : ItemArrayLike<JsString> {
    /**
     * The read-only length property indicates the number of strings in the DOMStringList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/length)
     */
    override val length: Int

    /**
     * The item() method returns a string from a DOMStringList by index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/item)
     */
    override fun item(index: Int): JsString?

    /**
     * The contains() method returns a boolean indicating whether the given string is in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringList/contains)
     */
    open fun contains(string: String): Boolean
}

public operator fun DOMStringList.get(index: Int): String? = getStringProperty(this, index)

public external interface DocumentReadyState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val DocumentReadyState.Companion.LOADING: DocumentReadyState get() = "loading".toJsString().unsafeCast<DocumentReadyState>()
public inline val DocumentReadyState.Companion.INTERACTIVE: DocumentReadyState get() = "interactive".toJsString().unsafeCast<DocumentReadyState>()
public inline val DocumentReadyState.Companion.COMPLETE: DocumentReadyState get() = "complete".toJsString().unsafeCast<DocumentReadyState>()

public external interface DocumentVisibilityState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val DocumentVisibilityState.Companion.VISIBLE: DocumentVisibilityState get() = "visible".toJsString().unsafeCast<DocumentVisibilityState>()
public inline val DocumentVisibilityState.Companion.HIDDEN: DocumentVisibilityState get() = "hidden".toJsString().unsafeCast<DocumentVisibilityState>()

/**
 * The HTMLElement interface represents any HTML element. Some elements directly implement this interface, while others
 * implement it via an interface that inherits it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement)
 */
public abstract external class HTMLElement : Element, GlobalEventHandlers, ElementContentEditable, HTMLOrSVGOrMathMLElement, ElementCSSInlineStyle {
    /**
     * The HTMLElement.title property represents the title of the element: the text usually displayed in a 'tooltip'
     * popup when the mouse is over the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title)
     */
    open var title: String

    /**
     * The lang property of the HTMLElement interface indicates the base language of an element's attribute values and
     * text content, in the form of a BCP 47 language tag. It reflects the element's lang attribute; the xml:lang
     * attribute does not affect this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang)
     */
    open var lang: String

    /**
     * The translate property of the HTMLElement interface indicates whether an element's attribute values and the
     * values of its Text node children are to be translated when the page is localized, or whether to leave them
     * unchanged.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/translate)
     */
    open var translate: Boolean

    /**
     * The HTMLElement.dir property indicates the text writing directionality of the content of the current element. It
     * reflects the element's dir attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir)
     */
    open var dir: String

    /**
     * The HTMLElement property hidden reflects the value of the element's hidden attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden)
     */
    open var hidden: JsAny?

    /**
     * The HTMLElement property inert reflects the value of the element's inert attribute. It is a boolean value that,
     * when present, makes the browser "ignore" user input events for the element, including focus events and events
     * from assistive technologies. The browser may also ignore page search and text selection in the element. This can
     * be useful when building UIs such as modals where you would want to "trap" the focus inside the modal when it's
     * visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert)
     */
    open var inert: Boolean

    /**
     * The HTMLElement.click() method simulates a mouse click on an element. When called on an element, the element's
     * click event is fired (unless its disabled attribute is set).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click)
     */
    open fun click()

    /**
     * The HTMLElement.accessKey property sets the keystroke which a user can press to jump to a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey)
     */
    open var accessKey: String

    /**
     * The HTMLElement.accessKeyLabel read-only property returns a string containing the element's browser-assigned
     * access key (if any); otherwise it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel)
     */
    open val accessKeyLabel: String

    /**
     * The draggable property of the HTMLElement interface gets and sets a Boolean primitive indicating if the element
     * is draggable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable)
     */
    open var draggable: Boolean

    /**
     * The spellcheck property of the HTMLElement interface represents a boolean value that controls the spell-checking
     * hint. It is available on all HTML elements, though it doesn't affect all of them.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck)
     */
    open var spellcheck: Boolean

    /**
     * The writingSuggestions property of the HTMLElement interface is a string indicating if browser-provided writing
     * suggestions should be enabled under the scope of the element or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/writingSuggestions)
     */
    open var writingSuggestions: String

    /**
     * The autocapitalize property of the HTMLElement interface represents the element's capitalization behavior for
     * user input.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize)
     */
    open var autocapitalize: String

    /**
     * The autocorrect property of the HTMLElement interface controls whether or not autocorrection of editable text is
     * enabled for spelling and/or punctuation errors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocorrect)
     */
    open var autocorrect: Boolean

    /**
     * The innerText property of the HTMLElement interface represents the rendered text content of a node and its
     * descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText)
     */
    open var innerText: String

    /**
     * The outerText property of the HTMLElement interface returns the same value as HTMLElement.innerText. When used as
     * a setter it replaces the whole current node with the given text (this differs from innerText, which replaces the
     * content inside the current node).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText)
     */
    open var outerText: String

    /**
     * The HTMLElement.attachInternals() method returns an ElementInternals object. This method allows a custom element
     * to participate in HTML forms. The ElementInternals interface provides utilities for working with these elements
     * in the same way you would work with any standard HTML form element, and also exposes the Accessibility Object
     * Model to the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals)
     */
    open fun attachInternals(): ElementInternals

    /**
     * The showPopover() method of the HTMLElement interface shows a popover element (i.e., one that has a valid popover
     * attribute) by adding it to the top layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/showPopover)
     */
    open fun showPopover(options: ShowPopoverOptions = definedExternally)

    /**
     * The hidePopover() method of the HTMLElement interface hides a popover element (i.e., one that has a valid popover
     * attribute) by removing it from the top layer and styling it with display: none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidePopover)
     */
    open fun hidePopover()

    /**
     * The togglePopover() method of the HTMLElement interface toggles a popover element (i.e., one that has a valid
     * popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     */
    open fun togglePopover(options: TogglePopoverOptions): Boolean

    /**
     * The togglePopover() method of the HTMLElement interface toggles a popover element (i.e., one that has a valid
     * popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     */
    open fun togglePopover(options: Boolean): Boolean

    /**
     * The togglePopover() method of the HTMLElement interface toggles a popover element (i.e., one that has a valid
     * popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     */
    open fun togglePopover(): Boolean

    /**
     * The popover property of the HTMLElement interface gets and sets an element's popover state via JavaScript
     * ("auto", "hint", or "manual"), and can be used for feature detection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/popover)
     */
    open var popover: String?
    open var headingOffset: Int
    open var headingReset: Boolean
    open val scrollParent: Element?

    /**
     * The HTMLElement.offsetParent read-only property returns a reference to the element which is the closest (nearest
     * in the containment hierarchy) positioned ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent)
     */
    open val offsetParent: Element?

    /**
     * The offsetTop read-only property of the HTMLElement interface returns the distance from the outer border of the
     * current element (including its margin) to the top padding edge of the offsetParent, the closest positioned
     * ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop)
     */
    open val offsetTop: Int

    /**
     * The offsetLeft read-only property of the HTMLElement interface returns the number of pixels that the upper left
     * corner of the current element is offset to the left within the HTMLElement.offsetParent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft)
     */
    open val offsetLeft: Int

    /**
     * The offsetWidth read-only property of the HTMLElement interface returns the layout width of an element as an
     * integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth)
     */
    open val offsetWidth: Int

    /**
     * The offsetHeight read-only property of the HTMLElement interface returns the height of an element, including
     * vertical padding and borders, as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight)
     */
    open val offsetHeight: Int

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface ShowPopoverOptions : JsAny {
    var source: HTMLElement?
}

public fun ShowPopoverOptions(source: HTMLElement? = null): ShowPopoverOptions = newJsObject<ShowPopoverOptions>().apply {
    if (source != null) this.source = source
}

public external interface TogglePopoverOptions : ShowPopoverOptions {
    var force: Boolean?
}

public fun TogglePopoverOptions(source: HTMLElement? = null, force: Boolean? = null): TogglePopoverOptions = newJsObject<TogglePopoverOptions>().apply {
    if (source != null) this.source = source
    if (force != null) this.force = force
}

/**
 * The HTMLUnknownElement interface represents an invalid HTML element and derives from the HTMLElement interface, but
 * without implementing any additional properties or methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLUnknownElement)
 */
public abstract external class HTMLUnknownElement : HTMLElement {

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface HTMLOrSVGOrMathMLElement : JsAny {
    /**
     * The dataset read-only property of the HTMLElement interface provides read/write access to custom data attributes
     * (data-*) on elements. It exposes a map of strings (DOMStringMap) with an entry for each data-* attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset)
     */
    val dataset: DOMStringMap

    /**
     * The nonce property of the HTMLElement interface returns the cryptographic number used once that is used by
     * Content Security Policy to determine whether a given fetch will be allowed to proceed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce)
     */
    var nonce: String

    /**
     * The autofocus property of the HTMLElement interface represents a boolean value reflecting the autofocus HTML
     * global attribute. This indicates whether the element should be focused on page load or, if it is nested inside a
     * &lt;dialog&gt; or popover element, when the &lt;dialog&gt; or popover is shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autofocus)
     */
    var autofocus: Boolean

    /**
     * The tabIndex property of the HTMLElement interface represents the tab order of the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex)
     */
    var tabIndex: Int

    /**
     * The HTMLElement.focus() method sets focus on the specified element, if it can be focused. The focused element is
     * the element that will receive keyboard and similar events by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus)
     */
    fun focus(options: FocusOptions = definedExternally)

    /**
     * The HTMLElement.blur() method removes keyboard focus from the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur)
     */
    fun blur()
}

/**
 * The DOMStringMap interface is used for the HTMLElement.dataset attribute, to represent data for custom attributes
 * added to elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringMap)
 */
public abstract external class DOMStringMap : JsAny {
    // not printed yet: deleter <anonymous>(DOMString)
}

public operator fun DOMStringMap.get(name: String): String? = getStringProperty(this, name)

public operator fun DOMStringMap.set(name: String, value: String) { setStringProperty(this, name, value) }

/**
 * The HTMLHtmlElement interface serves as the root node for a given HTML document. This object inherits the properties
 * and methods described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLHtmlElement)
 */
public abstract external class HTMLHtmlElement : HTMLElement {
    /**
     * Returns version information about the document type definition (DTD) of a document. While this property is
     * recognized by Mozilla, the return value for this property is always an empty string.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLHtmlElement/version)
     */
    open var version: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLHeadElement interface contains the descriptive information, or metadata, for a document. This object inherits
 * all of the properties and methods described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLHeadElement)
 */
public abstract external class HTMLHeadElement : HTMLElement {

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTitleElement interface is implemented by a document's &lt;title&gt;. This element inherits all of the
 * properties and methods of the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTitleElement)
 */
public abstract external class HTMLTitleElement : HTMLElement {
    /**
     * The text property of the HTMLTitleElement interface represents the child text content of the document's title as
     * a string. It contains the &lt;title&gt; element's content as text; if HTML tags are included within the
     * &lt;title&gt; element, they are included as part of the string value rather than being parsed as HTML.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTitleElement/text)
     */
    open var text: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLBaseElement interface contains the base URI for a document. This object inherits all of the properties and
 * methods as described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement)
 */
public abstract external class HTMLBaseElement : HTMLElement {
    /**
     * The href property of the HTMLBaseElement interface contains a string that is the URL to use as the base for
     * relative URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/href)
     */
    open var href: String

    /**
     * The target property of the HTMLBaseElement interface is a string that represents the default target tab to show
     * the resulting output for hyperlinks and form elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBaseElement/target)
     */
    open var target: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLLinkElement interface represents reference information for external resources and the relationship of those
 * resources to a document and vice versa (corresponds to &lt;link&gt; element; not to be confused with &lt;a&gt;, which
 * is represented by HTMLAnchorElement). This object inherits all of the properties and methods of the HTMLElement
 * interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement)
 */
public abstract external class HTMLLinkElement : HTMLElement, LinkStyle {
    /**
     * The href property of the HTMLLinkElement interface contains a string that is the URL associated with the link.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/href)
     */
    open var href: String

    /**
     * The crossOrigin property of the HTMLLinkElement interface specifies the Cross-Origin Resource Sharing (CORS)
     * setting to use when retrieving the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/crossOrigin)
     */
    open var crossOrigin: String?

    /**
     * The rel property of the HTMLLinkElement interface reflects the rel attribute. It is a string containing a
     * space-separated list of link types indicating the relationship between the resource represented by the
     * &lt;link&gt; element and the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/rel)
     */
    open var rel: String

    /**
     * The as property of the HTMLLinkElement interface returns a string representing the type of content to be
     * preloaded by a link element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/as)
     */
    open var `as`: String

    /**
     * The read-only relList property of the HTMLLinkElement returns a live DOMTokenList object containing the set of
     * link types indicating the relationship between the resource represented by the &lt;link&gt; element and the
     * current document. It reflects the &lt;link&gt; element's rel content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/relList)
     */
    open val relList: DOMTokenList

    /**
     * The media property of the HTMLLinkElement interface is a string representing a list of one or more media formats
     * to which the resource applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/media)
     */
    open var media: String

    /**
     * The integrity property of the HTMLLinkElement interface is a string containing inline metadata that a browser can
     * use to verify that a fetched resource has been delivered without unexpected manipulation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/integrity)
     */
    open var integrity: String

    /**
     * The hreflang property of the HTMLLinkElement interface is used to indicate the language and the geographical
     * targeting of a page. This hint can be used by browsers to select the more appropriate page or to improve SEO.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/hreflang)
     */
    open var hreflang: String

    /**
     * The type property of the HTMLLinkElement interface is a string that reflects the MIME type of the linked
     * resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/type)
     */
    open var type: String

    /**
     * The read-only sizes property of the HTMLLinkElement interface defines the sizes of the icons for visual media
     * contained in the resource. It reflects the &lt;link&gt; element's sizes attribute, which takes a list of
     * space-separated sizes, each in the format &lt;width in pixels&gt;x&lt;height in pixels&gt;, or the keyword any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/sizes)
     */
    open val sizes: DOMTokenList

    /**
     * The imageSrcset property of the HTMLLinkElement interface is a string which identifies one or more
     * comma-separated image candidate strings. This property reflects the value of the &lt;link&gt; element's
     * imagesrcset attribute. This property can retrieve or set the imagesrcset attribute value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/imageSrcset)
     */
    open var imageSrcset: String

    /**
     * The imageSizes property of the HTMLLinkElement interface indicates the size and conditions for the preloaded
     * images defined by the imageSrcset property. It reflects the value of the &lt;link&gt; element's imagesizes
     * attribute. This property can retrieve or set the imagesizes attribute value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/imageSizes)
     */
    open var imageSizes: String

    /**
     * The referrerPolicy property of the HTMLLinkElement interface reflects the HTML referrerpolicy attribute of the
     * &lt;link&gt; element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/referrerPolicy)
     */
    open var referrerPolicy: String

    /**
     * The read-only blocking property of the HTMLLinkElement returns a live DOMTokenList object containing the
     * operations that should be blocked on the fetching of an external resource. It reflects the &lt;link&gt; element's
     * blocking content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/blocking)
     */
    open val blocking: DOMTokenList

    /**
     * The disabled property of the HTMLLinkElement interface is a boolean value that represents whether the link is
     * disabled. It only has an effect with style sheet links (rel property set to stylesheet).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The fetchPriority property of the HTMLLinkElement interface represents a hint to the browser indicating how it
     * should prioritize fetching a particular resource relative to other resources of the same type. It reflects the
     * &lt;link&gt; element's fetchpriority content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLinkElement/fetchPriority)
     */
    open var fetchPriority: String
    open var charset: String
    open var rev: String
    open var target: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLMetaElement interface contains descriptive metadata about a document provided in HTML as &lt;meta&gt;
 * elements. This interface inherits all of the properties and methods described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement)
 */
public abstract external class HTMLMetaElement : HTMLElement {
    /**
     * The HTMLMetaElement.name property is used in combination with HTMLMetaElement.content to define the name-value
     * pairs for the metadata of a document. The name attribute defines the metadata name and the content attribute
     * defines the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/name)
     */
    open var name: String

    /**
     * The HTMLMetaElement.httpEquiv property gets or sets the pragma directive or an HTTP response header name for the
     * HTMLMetaElement.content attribute. For more details on the possible values, see the http-equiv attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/httpEquiv)
     */
    open var httpEquiv: String

    /**
     * The HTMLMetaElement.content property gets or sets the content attribute of pragma directives and named
     * &lt;meta&gt; data in conjunction with HTMLMetaElement.name or HTMLMetaElement.httpEquiv. For more information,
     * see the content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/content)
     */
    open var content: String

    /**
     * The HTMLMetaElement.media property enables specifying the media for theme-color metadata.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/media)
     */
    open var media: String

    /**
     * The HTMLMetaElement.scheme property defines the scheme of the value in the HTMLMetaElement.content attribute. The
     * scheme property was created to enable providing additional information to be used to interpret the value of the
     * content property. The scheme property takes as its value a scheme format (i.e., YYYY-MM-DD) or scheme format name
     * (i.e., ISBN), or a URI providing more information regarding the scheme format. The scheme defines the format of
     * the value of the content attribute. The scheme content is interpreted as an extension of the element's
     * HTMLMetaElement.name if a browser or user agent recognizes the scheme.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/scheme)
     */
    open var scheme: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLStyleElement interface represents a &lt;style&gt; element. It inherits properties and methods from its
 * parent, HTMLElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement)
 */
public abstract external class HTMLStyleElement : HTMLElement, LinkStyle {
    /**
     * The HTMLStyleElement.disabled property can be used to get and set whether the stylesheet is disabled (true) or
     * not (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The HTMLStyleElement.media property specifies the intended destination medium for style information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/media)
     */
    open var media: String

    /**
     * The read-only blocking property of the HTMLStyleElement returns a live DOMTokenList object containing the
     * operations that should be blocked on the fetching of an external resource. It reflects the &lt;style&gt;
     * element's blocking content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/blocking)
     */
    open val blocking: DOMTokenList

    /**
     * The HTMLStyleElement.type property returns the type of the current style. The value mirrors the HTML
     * &lt;style&gt; element's type attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLStyleElement/type)
     */
    open var type: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLBodyElement interface provides special properties (beyond those inherited from the regular HTMLElement
 * interface) for manipulating &lt;body&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBodyElement)
 */
public abstract external class HTMLBodyElement : HTMLElement, WindowEventHandlers {
    open var text: String
    open var link: String
    open var vLink: String
    open var aLink: String
    open var bgColor: String
    open var background: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLHeadingElement interface represents the different heading elements, &lt;h1&gt; through &lt;h6&gt;. It
 * inherits methods and properties from the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLHeadingElement)
 */
public abstract external class HTMLHeadingElement : HTMLElement {
    open var align: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLParagraphElement interface provides special properties (beyond those of the regular HTMLElement object
 * interface it inherits) for manipulating &lt;p&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLParagraphElement)
 */
public abstract external class HTMLParagraphElement : HTMLElement {
    open var align: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLHRElement interface provides special properties (beyond those of the HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;hr&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLHRElement)
 */
public abstract external class HTMLHRElement : HTMLElement {
    open var align: String
    open var color: String
    open var noShade: Boolean
    open var size: String
    open var width: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLPreElement interface exposes specific properties and methods (beyond those of the HTMLElement interface it
 * also has available to it by inheritance) for manipulating a block of preformatted text (&lt;pre&gt;).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLPreElement)
 */
public abstract external class HTMLPreElement : HTMLElement {
    open var width: Int

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLQuoteElement interface provides special properties and methods (beyond the regular HTMLElement interface it
 * also has available to it by inheritance) for manipulating quoting elements, like &lt;blockquote&gt; and &lt;q&gt;,
 * but not the &lt;cite&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLQuoteElement)
 */
public abstract external class HTMLQuoteElement : HTMLElement {
    /**
     * The cite property of the HTMLQuoteElement interface indicates the URL for the source of the quotation. It
     * reflects the &lt;q&gt; element's cite attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLQuoteElement/cite)
     */
    open var cite: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLOListElement interface provides special properties (beyond those defined on the regular HTMLElement interface
 * it also has available to it by inheritance) for manipulating ordered list elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOListElement)
 */
public abstract external class HTMLOListElement : HTMLElement {
    /**
     * The reversed property of the HTMLOListElement interface indicates order of a list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOListElement/reversed)
     */
    open var reversed: Boolean

    /**
     * The start property of the HTMLOListElement interface indicates starting value of the ordered list, with default
     * value of 1.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOListElement/start)
     */
    open var start: Int

    /**
     * The type property of the HTMLOListElement interface indicates the kind of marker to be used to display ordered
     * list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOListElement/type)
     */
    open var type: String

    /**
     * The compact property of the HTMLOListElement interface indicates that spacing between list items should be
     * reduced. The exact handling of the compact attribute is browser-specific. Instead of using this property,
     * consider using CSS line-height instead.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOListElement/compact)
     */
    open var compact: Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLUListElement interface provides special properties (beyond those defined on the regular HTMLElement interface
 * it also has available to it by inheritance) for manipulating unordered list (&lt;ul&gt;) elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLUListElement)
 */
public abstract external class HTMLUListElement : HTMLElement {
    /**
     * The compact property of the HTMLUListElement interface indicates that spacing between list items should be
     * reduced. The exact handling of the compact attribute is browser-specific. Instead of using this property,
     * consider using CSS line-height instead.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLUListElement/compact)
     */
    open var compact: Boolean
    open var type: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLMenuElement interface provides additional properties (beyond those inherited from the HTMLElement interface)
 * for manipulating a &lt;menu&gt; element. &lt;menu&gt; is a semantic alternative to the &lt;ul&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMenuElement)
 */
public abstract external class HTMLMenuElement : HTMLElement {
    /**
     * The compact property of the HTMLMenuElement interface indicates that spacing between list items should be
     * reduced. The exact handling of the compact attribute is browser-specific. Instead of using this property,
     * consider using CSS line-height instead.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMenuElement/compact)
     */
    open var compact: Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLLIElement interface exposes specific properties and methods (beyond those defined by regular HTMLElement
 * interface it also has available to it by inheritance) for manipulating list elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLIElement)
 */
public abstract external class HTMLLIElement : HTMLElement {
    /**
     * The value property of the HTMLLIElement interface indicates the ordinal position of the list element inside a
     * given &lt;ol&gt;. It can be smaller than 0. If the &lt;li&gt; element is not a child of an &lt;ol&gt; element,
     * the property has no meaning.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLIElement/value)
     */
    open var value: Int
    open var type: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLDListElement interface provides special properties (beyond those of the regular HTMLElement interface it also
 * has available to it by inheritance) for manipulating definition list (&lt;dl&gt;) elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDListElement)
 */
public abstract external class HTMLDListElement : HTMLElement {
    /**
     * The compact property of the HTMLDListElement interface indicates that spacing between list items should be
     * reduced. The exact handling of the compact attribute is browser-specific. Instead of using this property,
     * consider using CSS line-height instead.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDListElement/compact)
     */
    open var compact: Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLDivElement interface provides special properties (beyond the regular HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;div&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDivElement)
 */
public abstract external class HTMLDivElement : HTMLElement {
    open var align: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLAnchorElement interface represents hyperlink elements and provides special properties and methods (beyond
 * those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and
 * presentation of such elements. This interface corresponds to &lt;a&gt; element; not to be confused with &lt;link&gt;,
 * which is represented by HTMLLinkElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement)
 */
public abstract external class HTMLAnchorElement : HTMLElement, HyperlinkElementUtils, HTMLHyperlinkElementUtils {
    /**
     * The download property of the HTMLAnchorElement interface is a string indicating that the linked resource is
     * intended to be downloaded rather than displayed in the browser. The value, if any, represents the proposed name
     * of the file. It reflects the download attribute of the &lt;a&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/download)
     */
    open var download: String

    /**
     * The ping property of the HTMLAnchorElement interface is a space-separated list of URLs. When the link is
     * followed, the browser will send POST requests with the body PING to the URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/ping)
     */
    open var ping: String

    /**
     * The HTMLAnchorElement.rel property reflects the rel attribute. It is a string containing a space-separated list
     * of link types indicating the relationship between the resource represented by the &lt;a&gt; element and the
     * current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/rel)
     */
    open var rel: String

    /**
     * The read-only relList property of the HTMLAnchorElement returns a live DOMTokenList object containing the set of
     * link types indicating the relationship between the resource represented by the &lt;a&gt; element and the current
     * document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/relList)
     */
    open val relList: DOMTokenList

    /**
     * The text property of the HTMLAnchorElement represents the text inside the element. This property represents the
     * same information as Node.textContent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/text)
     */
    open var text: String

    /**
     * The HTMLAnchorElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the &lt;a&gt; element
     * defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy)
     */
    open var referrerPolicy: String
    open var coords: String
    open var charset: String
    open var name: String
    open var rev: String
    open var shape: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLDataElement interface provides special properties (beyond the regular HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;data&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDataElement)
 */
public abstract external class HTMLDataElement : HTMLElement {
    /**
     * The value property of the HTMLDataElement interface returns a string reflecting the value HTML attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDataElement/value)
     */
    open var value: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTimeElement interface provides special properties (beyond the regular HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;time&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTimeElement)
 */
public abstract external class HTMLTimeElement : HTMLElement {
    /**
     * The dateTime property of the HTMLTimeElement interface is a string that reflects the datetime HTML attribute,
     * containing a machine-readable form of the element's date and time value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTimeElement/dateTime)
     */
    open var dateTime: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLSpanElement interface represents a &lt;span&gt; element and derives from the HTMLElement interface, but
 * without implementing any additional properties or methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSpanElement)
 */
public abstract external class HTMLSpanElement : HTMLElement {

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLBRElement interface represents an HTML line break element (&lt;br&gt;). It inherits from HTMLElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLBRElement)
 */
public abstract external class HTMLBRElement : HTMLElement {
    open var clear: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface HyperlinkElementUtils : JsAny {
    /**
     * The origin read-only property of the HTMLAnchorElement interface returns a string containing the Unicode
     * serialization of the origin of the &lt;a&gt; element's href.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/origin)
     */
    val origin: String

    /**
     * The protocol property of the HTMLAnchorElement interface is a string containing the protocol or scheme of the
     * &lt;a&gt; element's href, including the final ":".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/protocol)
     */
    var protocol: String

    /**
     * The username property of the HTMLAnchorElement interface is a string containing the username component of the
     * &lt;a&gt; element's href. If the URL does not have a username, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/username)
     */
    var username: String

    /**
     * The password property of the HTMLAnchorElement interface is a string containing the password component of the
     * &lt;a&gt; element's href. If the URL does not have a password, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/password)
     */
    var password: String

    /**
     * The host property of the HTMLAnchorElement interface is a string containing the host, which is the hostname, and
     * then, if the port of the URL is nonempty, a ":", followed by the port of the URL. If the URL does not have a
     * hostname, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/host)
     */
    var host: String

    /**
     * The hostname property of the HTMLAnchorElement interface is a string containing either the domain name or IP
     * address of the &lt;a&gt; element's href. If the URL does not have a hostname, this property contains an empty
     * string, "". IPv4 and IPv6 addresses are normalized, such as stripping leading zeros, and domain names are
     * converted to IDN.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hostname)
     */
    var hostname: String

    /**
     * The port property of the HTMLAnchorElement interface is a string containing the port number of the &lt;a&gt;
     * element's href. If the port is the default for the protocol (80 for ws: and http:, 443 for wss: and https:, and
     * 21 for ftp:), this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/port)
     */
    var port: String

    /**
     * The HTMLAnchorElement.pathname property is a string containing an initial '/' followed by the path of the URL not
     * including the query string or fragment (or the empty string if there is no path).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/pathname)
     */
    var pathname: String

    /**
     * The search property of the HTMLAnchorElement interface is a search string, also called a query string, that is a
     * string containing a "?" followed by the parameters of the &lt;a&gt; element's href. If the URL does not have a
     * search query, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/search)
     */
    var search: String

    /**
     * The hash property of the HTMLAnchorElement interface is a string containing a "#" followed by the fragment
     * identifier of the &lt;a&gt; element's href. If the URL does not have a fragment identifier, this property
     * contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hash)
     */
    var hash: String

    /**
     * The hreflang property of the HTMLAnchorElement interface is a string that is the language of the linked resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/hreflang)
     */
    var hreflang: String

    /**
     * The type property of the HTMLAnchorElement interface is a string that indicates the MIME type of the linked
     * resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/type)
     */
    var type: String
}

public external interface HTMLHyperlinkElementUtils : JsAny {
    /**
     * The href property of the HTMLAnchorElement interface is a stringifier that returns the absolute URL corresponding
     * to the element's href attribute (or an empty string if href is unset). Setting this property updates the
     * element's href attribute to the provided value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/href)
     */
    var href: String

    /**
     * The target property of the HTMLAnchorElement interface is a string that indicates where to display the linked
     * resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/target)
     */
    var target: String
}

/**
 * The HTMLModElement interface provides special properties (beyond the regular methods and properties available through
 * the HTMLElement interface they also have available to them by inheritance) for manipulating modification elements,
 * that is &lt;del&gt; and &lt;ins&gt;.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLModElement)
 */
public abstract external class HTMLModElement : HTMLElement {
    /**
     * The cite property of the HTMLModElement interface indicates the URL of the resource explaining the modification.
     * It reflects the cite attribute of the &lt;del&gt; element and &lt;ins&gt; elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLModElement/cite)
     */
    open var cite: String

    /**
     * The dateTime property of the HTMLModElement interface is a string containing a machine-readable date with an
     * optional time value. It reflects the datetime HTML attribute of the &lt;del&gt; and &lt;ins&gt; elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLModElement/dateTime)
     */
    open var dateTime: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLPictureElement interface represents a &lt;picture&gt; HTML element. It doesn't implement specific properties
 * or methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLPictureElement)
 */
public abstract external class HTMLPictureElement : HTMLElement {

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLSourceElement interface provides special properties (beyond the regular HTMLElement object interface it also
 * has available to it by inheritance) for manipulating &lt;source&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement)
 */
public abstract external class HTMLSourceElement : HTMLElement {
    /**
     * The src property of the HTMLSourceElement interface is a string indicating the URL of a media resource to use as
     * the source for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/src)
     */
    open var src: String

    /**
     * The type property of the HTMLSourceElement interface is a string representing the MIME type of the media
     * resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/type)
     */
    open var type: String

    /**
     * The srcset property of the HTMLSourceElement interface is a string containing a comma-separated list of candidate
     * images.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/srcset)
     */
    open var srcset: String

    /**
     * The sizes property of the HTMLSourceElement interface is a string representing a list of one or more sizes,
     * representing sizes between breakpoints, to which the resource applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/sizes)
     */
    open var sizes: String

    /**
     * The media property of the HTMLSourceElement interface is a string representing the intended destination medium
     * for the resource. The value is a media query, which is a comma separated list of media-types, media-features, and
     * logical operators.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/media)
     */
    open var media: String

    /**
     * The width property of the HTMLSourceElement interface is a non-negative number indicating the width of the image
     * resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/width)
     */
    open var width: Int

    /**
     * The height property of the HTMLSourceElement interface is a non-negative number indicating the height of the
     * image resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSourceElement/height)
     */
    open var height: Int

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLImageElement interface represents an HTML &lt;img&gt; element, providing the properties and methods used to
 * manipulate image elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement)
 */
public abstract external class HTMLImageElement : HTMLElement, CanvasImageSource, TexImageSource {
    /**
     * The alt property of the HTMLImageElement interface provides fallback (alternate) text to display when the image
     * specified by the &lt;img&gt; element is not displayed, whether because of an error, because the user has disabled
     * the loading of images, or because the image hasn't finished loading yet. It reflects the &lt;img&gt; element's
     * alt content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/alt)
     */
    open var alt: String

    /**
     * The src property of the HTMLImageElement interface specifies the image to display in the &lt;img&gt; element. It
     * reflects the &lt;img&gt; element's src content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/src)
     */
    open var src: String

    /**
     * The srcset property of the HTMLImageElement interface identifies one or more image candidate strings, separated
     * using commas (,), each specifying image resources to use under given circumstances. Each image candidate string
     * contains an image URL and an optional width or pixel density descriptor that indicates the conditions under which
     * that candidate should be used instead of the image specified by the src property. It reflects the &lt;img&gt;
     * element's srcset content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/srcset)
     */
    open var srcset: String

    /**
     * The sizes property of the HTMLImageElement interface allows you to specify the layout width of the image for each
     * of a list of media queries, or auto for lazy-loaded images to allow the browser to automatically select an image
     * to display based on the layout size of the element. This allows the browser to choose between different images
     * specified in the element srcset to match different media conditions — even images with different orientations or
     * aspect ratios.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/sizes)
     */
    open var sizes: String

    /**
     * The crossOrigin property of the HTMLImageElement interface is a string which specifies the Cross-Origin Resource
     * Sharing (CORS) setting to use when retrieving the image. It reflects the &lt;img&gt; element's crossorigin
     * content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/crossOrigin)
     */
    open var crossOrigin: String?

    /**
     * The useMap property of the HTMLImageElement interface provides the name of the client-side image map to apply to
     * the image. It reflects the &lt;img&gt; element's usemap content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/useMap)
     */
    open var useMap: String

    /**
     * The isMap property of the HTMLImageElement interface indicates that the image is part of a server-side map. If
     * so, the coordinates where the user clicked on the image are sent to the server. It reflects the &lt;img&gt;
     * element's ismap content attribute. This attribute is allowed only if the &lt;img&gt; element is a descendant of
     * an &lt;a&gt; element with a valid href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/isMap)
     */
    open var isMap: Boolean
    open var controls: Boolean

    /**
     * The width property of the HTMLImageElement interface indicates the width at which the image is drawn, in CSS
     * pixels, if the image is being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's
     * the natural, pixel density-corrected width of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/width)
     */
    open var width: Int

    /**
     * The height property of the HTMLImageElement interface indicates the height at which the image is drawn, in CSS
     * pixels, if the image is being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's
     * the natural, pixel density-corrected height of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/height)
     */
    open var height: Int

    /**
     * The read-only naturalWidth property of the HTMLImageElement interface returns the intrinsic (natural),
     * density-corrected width of the image in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalWidth)
     */
    open val naturalWidth: Int

    /**
     * The read-only naturalHeight property of the HTMLImageElement interface returns the intrinsic (natural),
     * density-corrected height of the image in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalHeight)
     */
    open val naturalHeight: Int

    /**
     * The complete read-only property of the HTMLImageElement interface is a Boolean value indicating whether or not
     * the image has completely loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/complete)
     */
    open val complete: Boolean

    /**
     * The currentSrc read-only property of the HTMLImageElement interface indicates the URL of the image selected by
     * the browser to load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/currentSrc)
     */
    open val currentSrc: String

    /**
     * The referrerPolicy property of the HTMLImageElement interface defines which referrer is sent when fetching the
     * resource. It reflects the &lt;img&gt; element's referrerpolicy content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/referrerPolicy)
     */
    open var referrerPolicy: String

    /**
     * The decoding property of the HTMLImageElement interface provides a hint to the browser as to how it should decode
     * the image. More specifically, whether it should wait for the image to be decoded before presenting other content
     * updates or not. It reflects the &lt;img&gt; element's decoding content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding)
     */
    open var decoding: String

    /**
     * The loading property of the HTMLImageElement interface provides a hint to the browser on how to handle the
     * loading of the image which is currently outside the window's visual viewport. This helps to optimize the loading
     * of the document's contents by postponing loading the image until it's expected to be needed, rather than
     * immediately during the initial page load. It reflects the &lt;img&gt; element's loading content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading)
     */
    open var loading: String

    /**
     * The fetchPriority property of the HTMLImageElement interface represents a hint to the browser indicating how it
     * should prioritize fetching a particular image relative to other images. It reflects the &lt;img&gt; element's
     * fetchpriority content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority)
     */
    open var fetchPriority: String

    /**
     * The decode() method of the HTMLImageElement interface returns a Promise that resolves once the image is decoded
     * and is safe to be appended to the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
     */
    open fun decode(): Promise<JsAny?>

    /**
     * The deprecated name property of the HTMLImageElement interface specifies a name for the element. It reflects the
     * &lt;img&gt; element's name content attribute. It has been replaced by the id property available on all elements,
     * and is kept only for compatibility reasons.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/name)
     */
    open var name: String
    open var lowsrc: String

    /**
     * The deprecated align property of the HTMLImageElement interface is a string which indicates how to position the
     * image relative to its container. It reflects the &lt;img&gt; element's align content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/align)
     */
    open var align: String

    /**
     * The deprecated hspace property of the HTMLImageElement interface specifies the number of pixels of empty space to
     * leave empty on the left and right sides of the &lt;img&gt; element when laying out the page. It reflects the
     * &lt;img&gt; element's hspace content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/hspace)
     */
    open var hspace: Int

    /**
     * The deprecated vspace property of the HTMLImageElement interface specifies the number of pixels of empty space to
     * leave empty on the top and bottom sides of the &lt;img&gt; element when laying out the page. It reflects the
     * &lt;img&gt; element's vspace content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/vspace)
     */
    open var vspace: Int

    /**
     * The deprecated longDesc property of the HTMLImageElement interface specifies the URL of a text or HTML file which
     * contains a long-form description of the image. This can be used to provide optional added details beyond the
     * short description provided in the title attribute. It reflects the &lt;img&gt; element's longdesc content
     * attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/longDesc)
     */
    open var longDesc: String

    /**
     * The deprecated border property of the HTMLImageElement interface specifies the number of pixels thick the border
     * surrounding the image should be. A value of 0, the default, indicates that no border should be drawn. It reflects
     * the &lt;img&gt; element's border content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/border)
     */
    open var border: String

    /**
     * The read-only x property of the HTMLImageElement interface indicates the x-coordinate of the &lt;img&gt;
     * element's left border edge relative to the root element's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/x)
     */
    open val x: Int

    /**
     * The read-only y property of the HTMLImageElement interface indicates the y-coordinate of the &lt;img&gt;
     * element's top border edge relative to the root element's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/y)
     */
    open val y: Int

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public open external class Image : HTMLImageElement {
    constructor(width: Int = definedExternally, height: Int = definedExternally)

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
     * The assignedSlot read-only property of the Element interface returns an HTMLSlotElement representing the
     * &lt;slot&gt; element the node is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot)
     */
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint

    /**
     * The role property of the ElementInternals interface returns the WAI-ARIA role for the element. For example, a
     * checkbox might have role="checkbox". It reflects the role attribute; it does not return the element's implicit
     * ARIA role, if any, unless explicitly set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/role)
     */
    override var role: String?

    /**
     * The ariaActiveDescendantElement property of the ElementInternals interface represents the current active element
     * when focus is on a composite widget, combobox, textbox, group, or application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaActiveDescendantElement)
     */
    override var ariaActiveDescendantElement: Element?

    /**
     * The ariaAtomic property of the ElementInternals interface reflects the value of the aria-atomic attribute, which
     * indicates whether assistive technologies will present all, or only parts of, the changed region based on the
     * change notifications defined by the aria-relevant attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAtomic)
     */
    override var ariaAtomic: String?

    /**
     * The ariaAutoComplete property of the ElementInternals interface reflects the value of the aria-autocomplete
     * attribute, which indicates whether inputting text could trigger display of one or more predictions of the user's
     * intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they
     * were made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAutoComplete)
     */
    override var ariaAutoComplete: String?

    /**
     * The ariaBrailleLabel property of the ElementInternals interface reflects the value of the aria-braillelabel
     * attribute, which defines the ARIA braille label of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleLabel)
     */
    override var ariaBrailleLabel: String?

    /**
     * The ariaBrailleRoleDescription property of the ElementInternals interface reflects the value of the
     * aria-brailleroledescription attribute, which defines the ARIA braille role description of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleRoleDescription)
     */
    override var ariaBrailleRoleDescription: String?

    /**
     * The ariaBusy property of the ElementInternals interface reflects the value of the aria-busy attribute, which
     * indicates whether an element is being modified, as assistive technologies may want to wait until the
     * modifications are complete before exposing them to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBusy)
     */
    override var ariaBusy: String?

    /**
     * The ariaChecked property of the ElementInternals interface reflects the value of the aria-checked attribute,
     * which indicates the current "checked" state of checkboxes, radio buttons, and other widgets that have a checked
     * state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaChecked)
     */
    override var ariaChecked: String?

    /**
     * The ariaColCount property of the ElementInternals interface reflects the value of the aria-colcount attribute,
     * which defines the number of columns in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColCount)
     */
    override var ariaColCount: String?

    /**
     * The ariaColIndex property of the ElementInternals interface reflects the value of the aria-colindex attribute,
     * which defines an element's column index or position with respect to the total number of columns within a table,
     * grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndex)
     */
    override var ariaColIndex: String?

    /**
     * The ariaColIndexText property of the ElementInternals interface reflects the value of the aria-colindextext
     * attribute, which defines a human-readable text alternative of aria-colindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndexText)
     */
    override var ariaColIndexText: String?

    /**
     * The ariaColSpan property of the ElementInternals interface reflects the value of the aria-colspan attribute,
     * which defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColSpan)
     */
    override var ariaColSpan: String?

    /**
     * The ariaControlsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that are controlled by the element it is applied to. For example, this might be set on a combobox to
     * indicate the element that it pops up, or on a scrollbar to indicate the ID of the element it controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaControlsElements)
     */
    override var ariaControlsElements: JsArray<Element>?

    /**
     * The ariaCurrent property of the ElementInternals interface reflects the value of the aria-current attribute,
     * which indicates the element that represents the current item within a container or set of related elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaCurrent)
     */
    override var ariaCurrent: String?

    /**
     * The ariaDescribedByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible description for the element it is applied to. The accessible description is
     * similar to the accessible label (see ariaLabelledByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescribedByElements)
     */
    override var ariaDescribedByElements: JsArray<Element>?

    /**
     * The ariaDescription property of the ElementInternals interface reflects the value of the aria-description
     * attribute, which defines a string value that describes or annotates the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescription)
     */
    override var ariaDescription: String?

    /**
     * The ariaDetailsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible details for the element it is applied to. The accessible details are similar
     * to the accessible description (see ariaDescribedByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDetailsElements)
     */
    override var ariaDetailsElements: JsArray<Element>?

    /**
     * The ariaDisabled property of the ElementInternals interface reflects the value of the aria-disabled attribute,
     * which indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDisabled)
     */
    override var ariaDisabled: String?

    /**
     * The ariaErrorMessageElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an error message for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaErrorMessageElements)
     */
    override var ariaErrorMessageElements: JsArray<Element>?

    /**
     * The ariaExpanded property of the ElementInternals interface reflects the value of the aria-expanded attribute,
     * which indicates whether a grouping element owned or controlled by this element is expanded or collapsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaExpanded)
     */
    override var ariaExpanded: String?

    /**
     * The ariaFlowToElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an alternate reading order of content, overriding the general default reading order at the
     * user's discretion. If just one element is provided this is the next element in the reading order. If multiple
     * elements are provided, then each element represents a possible path that should be offered to the user for
     * selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaFlowToElements)
     */
    override var ariaFlowToElements: JsArray<Element>?

    /**
     * The ariaHasPopup property of the ElementInternals interface reflects the value of the aria-haspopup attribute,
     * which indicates the availability and type of interactive popup element, such as menu or dialog, that can be
     * triggered by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHasPopup)
     */
    override var ariaHasPopup: String?

    /**
     * The ariaHidden property of the ElementInternals interface reflects the value of the aria-hidden attribute, which
     * indicates whether the element is exposed to an accessibility API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHidden)
     */
    override var ariaHidden: String?

    /**
     * The ariaInvalid property of the ElementInternals interface reflects the value of the aria-invalid attribute.
     * Relevant for the application, checkbox, combobox, gridcell, listbox, radiogroup, slider, spinbutton, textbox, and
     * tree roles, it indicates to the accessibility API whether the entered value does not conform to the format
     * expected by the application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaInvalid)
     */
    override var ariaInvalid: String?

    /**
     * The ariaKeyShortcuts property of the ElementInternals interface reflects the value of the aria-keyshortcuts
     * attribute, which indicates keyboard shortcuts that an author has implemented to activate or give focus to an
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaKeyShortcuts)
     */
    override var ariaKeyShortcuts: String?

    /**
     * The ariaLabel property of the ElementInternals interface reflects the value of the aria-label attribute, which
     * defines a string value that labels the current Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabel)
     */
    override var ariaLabel: String?

    /**
     * The ariaLabelledByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible name for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabelledByElements)
     */
    override var ariaLabelledByElements: JsArray<Element>?

    /**
     * The ariaLevel property of the ElementInternals interface reflects the value of the aria-level attribute, which
     * defines the hierarchical level of an element within a structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLevel)
     */
    override var ariaLevel: String?

    /**
     * The ariaLive property of the ElementInternals interface reflects the value of the aria-live attribute, which
     * indicates that an element will be updated, and describes the types of updates the user agents, assistive
     * technologies, and user can expect from the live region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLive)
     */
    override var ariaLive: String?

    /**
     * The ariaModal property of the ElementInternals interface reflects the value of the aria-modal attribute, which
     * indicates whether an element is modal when displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaModal)
     */
    override var ariaModal: String?

    /**
     * The ariaMultiLine property of the ElementInternals interface reflects the value of the aria-multiline attribute,
     * which indicates whether a text box accepts multiple lines of input or only a single line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiLine)
     */
    override var ariaMultiLine: String?

    /**
     * The ariaMultiSelectable property of the ElementInternals interface reflects the value of the aria-multiselectable
     * attribute, which indicates that the user may select more than one item from the current selectable descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiSelectable)
     */
    override var ariaMultiSelectable: String?

    /**
     * The ariaOrientation property of the ElementInternals interface reflects the value of the aria-orientation
     * attribute, which indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOrientation)
     */
    override var ariaOrientation: String?

    /**
     * The ariaOwnsElements property of the ElementInternals interface is an array containing the element (or elements)
     * that define a visual, functional, or contextual relationship between a parent element that it is applied to, and
     * its child elements. This is used when the shadow DOM hierarchy cannot be used to represent the relationship, and
     * it would not otherwise be available to assistive technology,
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOwnsElements)
     */
    override var ariaOwnsElements: JsArray<Element>?

    /**
     * The ariaPlaceholder property of the ElementInternals interface reflects the value of the aria-placeholder
     * attribute, which defines a short hint intended to aid the user with data entry when the control has no value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPlaceholder)
     */
    override var ariaPlaceholder: String?

    /**
     * The ariaPosInSet property of the ElementInternals interface reflects the value of the aria-posinset attribute,
     * which defines an element's number or position in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPosInSet)
     */
    override var ariaPosInSet: String?

    /**
     * The ariaPressed property of the ElementInternals interface reflects the value of the aria-pressed attribute,
     * which indicates the current "pressed" state of toggle buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPressed)
     */
    override var ariaPressed: String?

    /**
     * The ariaReadOnly property of the ElementInternals interface reflects the value of the aria-readonly attribute,
     * which indicates that the element is not editable, but is otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaReadOnly)
     */
    override var ariaReadOnly: String?

    /**
     * The ariaRelevant property of the ElementInternals interface reflects the value of the aria-relevant attribute,
     * which indicates what notifications the user agent will trigger when the accessibility tree within a live region
     * is modified. This is used to describe what changes in an aria-live region are relevant and should be announced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRelevant)
     */
    override var ariaRelevant: String?

    /**
     * The ariaRequired property of the ElementInternals interface reflects the value of the aria-required attribute,
     * which indicates that user input is required on the element before a form may be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRequired)
     */
    override var ariaRequired: String?

    /**
     * The ariaRoleDescription property of the ElementInternals interface reflects the value of the aria-roledescription
     * attribute, which defines a human-readable, author-localized description for the role of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRoleDescription)
     */
    override var ariaRoleDescription: String?

    /**
     * The ariaRowCount property of the ElementInternals interface reflects the value of the aria-rowcount attribute,
     * which defines the total number of rows in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowCount)
     */
    override var ariaRowCount: String?

    /**
     * The ariaRowIndex property of the ElementInternals interface reflects the value of the aria-rowindex attribute,
     * which defines an element's row index or position with respect to the total number of rows within a table, grid,
     * or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndex)
     */
    override var ariaRowIndex: String?

    /**
     * The ariaRowIndexText property of the ElementInternals interface reflects the value of the aria-rowindextext
     * attribute, which defines a human-readable text alternative of aria-rowindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndexText)
     */
    override var ariaRowIndexText: String?

    /**
     * The ariaRowSpan property of the ElementInternals interface reflects the value of the aria-rowspan attribute,
     * which defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowSpan)
     */
    override var ariaRowSpan: String?

    /**
     * The ariaSelected property of the ElementInternals interface reflects the value of the aria-selected attribute,
     * which indicates the current "selected" state of elements that have a selected state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSelected)
     */
    override var ariaSelected: String?

    /**
     * The ariaSetSize property of the ElementInternals interface reflects the value of the aria-setsize attribute,
     * which defines the number of items in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSetSize)
     */
    override var ariaSetSize: String?

    /**
     * The ariaSort property of the ElementInternals interface reflects the value of the aria-sort attribute, which
     * indicates if items in a table or grid are sorted in ascending or descending order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSort)
     */
    override var ariaSort: String?

    /**
     * The ariaValueMax property of the ElementInternals interface reflects the value of the aria-valuemax attribute,
     * which defines the maximum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMax)
     */
    override var ariaValueMax: String?

    /**
     * The ariaValueMin property of the ElementInternals interface reflects the value of the aria-valuemin attribute,
     * which defines the minimum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMin)
     */
    override var ariaValueMin: String?

    /**
     * The ariaValueNow property of the ElementInternals interface reflects the value of the aria-valuenow attribute,
     * which defines the current value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueNow)
     */
    override var ariaValueNow: String?

    /**
     * The ariaValueText property of the ElementInternals interface reflects the value of the aria-valuetext attribute,
     * which defines the human-readable text alternative of aria-valuenow for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueText)
     */
    override var ariaValueText: String?

    /**
     * The ariaNotify() method of the Element interface queues a string of text to be announced by a screen reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaNotify)
     */
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
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
     * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable)
     */
    override var contentEditable: String

    /**
     * The enterKeyHint property is an enumerated property defining what action label (or icon) to present for the enter
     * key on virtual keyboards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint)
     */
    override var enterKeyHint: String

    /**
     * The HTMLElement.isContentEditable read-only property returns a boolean value that is true if the contents of the
     * element are editable; otherwise it returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable)
     */
    override val isContentEditable: Boolean

    /**
     * The HTMLElement property inputMode reflects the value of the element's inputmode attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode)
     */
    override var inputMode: String

    /**
     * The dataset read-only property of the HTMLElement interface provides read/write access to custom data attributes
     * (data-*) on elements. It exposes a map of strings (DOMStringMap) with an entry for each data-* attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset)
     */
    override val dataset: DOMStringMap

    /**
     * The nonce property of the HTMLElement interface returns the cryptographic number used once that is used by
     * Content Security Policy to determine whether a given fetch will be allowed to proceed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce)
     */
    override var nonce: String

    /**
     * The autofocus property of the HTMLElement interface represents a boolean value reflecting the autofocus HTML
     * global attribute. This indicates whether the element should be focused on page load or, if it is nested inside a
     * &lt;dialog&gt; or popover element, when the &lt;dialog&gt; or popover is shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autofocus)
     */
    override var autofocus: Boolean

    /**
     * The tabIndex property of the HTMLElement interface represents the tab order of the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex)
     */
    override var tabIndex: Int

    /**
     * The HTMLElement.focus() method sets focus on the specified element, if it can be focused. The focused element is
     * the element that will receive keyboard and similar events by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus)
     */
    override fun focus(options: FocusOptions)

    /**
     * The HTMLElement.blur() method removes keyboard focus from the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur)
     */
    override fun blur()

    /**
     * The read-only style property of the HTMLElement interface returns the inline style of an element in the form of a
     * live CSSStyleProperties object. This object can be used to get and set the inline styles of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style)
     */
    override val style: CSSStyleProperties

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLIFrameElement interface provides special properties and methods (beyond those of the HTMLElement interface it
 * also has available to it by inheritance) for manipulating the layout and presentation of inline frame elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement)
 */
public abstract external class HTMLIFrameElement : HTMLElement {
    /**
     * The HTMLIFrameElement.src A string that reflects the src HTML attribute, containing the address of the content to
     * be embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/src)
     */
    open var src: String

    /**
     * The srcdoc property of the HTMLIFrameElement interface gets or sets the inline HTML markup of the frame's
     * document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/srcdoc)
     */
    open var srcdoc: String

    /**
     * The name property of the HTMLIFrameElement interface is a string value that reflects the name attribute of the
     * &lt;iframe&gt; element, indicating the specific name of the &lt;iframe&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/name)
     */
    open var name: String

    /**
     * The read-only sandbox property of the HTMLIFrameElement returns a live DOMTokenList object indicating extra
     * restrictions on the behavior of the nested content. It reflects the &lt;iframe&gt; element's sandbox content
     * attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/sandbox)
     */
    open val sandbox: DOMTokenList

    /**
     * The allow property of the HTMLIFrameElement interface indicates the Permissions Policy specified for this
     * &lt;iframe&gt; element. The policy defines what features are available to the &lt;iframe&gt; element (for
     * example, access to the microphone, camera, battery, web-share, etc.) based on the origin of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/allow)
     */
    open var allow: String

    /**
     * The allowFullscreen property of the HTMLIFrameElement interface is a boolean value that reflects the
     * allowfullscreen attribute of the &lt;iframe&gt; element, indicating whether to allow the iframe's contents to use
     * requestFullscreen().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/allowFullscreen)
     */
    open var allowFullscreen: Boolean

    /**
     * The width property of the HTMLIFrameElement interface returns a string that reflects the width attribute of the
     * &lt;iframe&gt; element, indicating the width of the frame in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/width)
     */
    open var width: String

    /**
     * The height property of the HTMLIFrameElement interface returns a string that reflects the height attribute of the
     * &lt;iframe&gt; element, indicating the height of the frame in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/height)
     */
    open var height: String

    /**
     * The HTMLIFrameElement.referrerPolicy property reflects the HTML referrerpolicy attribute of the &lt;iframe&gt;
     * element defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/referrerPolicy)
     */
    open var referrerPolicy: String

    /**
     * The loading property of the HTMLIFrameElement interface is a string that provides a hint to the browser
     * indicating whether the iframe should be loaded immediately on page load, or only when it is needed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/loading)
     */
    open var loading: String

    /**
     * The contentDocument read-only property of the HTMLIFrameElement interface returns a Document (that is, the active
     * document in the inline frame's nested browsing context) if the iframe and the iframe's parent document are Same
     * Origin, else returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/contentDocument)
     */
    open val contentDocument: Document?

    /**
     * The contentWindow property returns the Window object of an HTMLIFrameElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/contentWindow)
     */
    open val contentWindow: Window?

    /**
     * The getSVGDocument() method of the HTMLIFrameElement interface returns the Document object of the embedded SVG.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLIFrameElement/getSVGDocument)
     */
    open fun getSVGDocument(): Document?
    open var align: String
    open var scrolling: String
    open var frameBorder: String
    open var longDesc: String
    open var marginHeight: String
    open var marginWidth: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLEmbedElement interface provides special properties (beyond the regular HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;embed&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement)
 */
public abstract external class HTMLEmbedElement : HTMLElement {
    /**
     * The src property of the HTMLEmbedElement interface returns a string that indicates the URL of the resource being
     * embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/src)
     */
    open var src: String

    /**
     * The type property of the HTMLEmbedElement interface returns a string that reflects the type attribute of the
     * &lt;embed&gt; element, indicating the MIME type of the resource. It reflects the &lt;embed&gt; element's type
     * attribute
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/type)
     */
    open var type: String

    /**
     * The width property of the HTMLEmbedElement interface returns a string that reflects the width attribute of the
     * &lt;embed&gt; element, indicating the displayed width of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/width)
     */
    open var width: String

    /**
     * The height property of the HTMLEmbedElement interface returns a string that reflects the height attribute of the
     * &lt;embed&gt; element, indicating the displayed height of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/height)
     */
    open var height: String

    /**
     * The getSVGDocument() method of the HTMLEmbedElement interface returns the Document object of the embedded SVG.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLEmbedElement/getSVGDocument)
     */
    open fun getSVGDocument(): Document?
    open var align: String
    open var name: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLObjectElement interface provides special properties and methods (beyond those on the HTMLElement interface it
 * also has available to it by inheritance) for manipulating the layout and presentation of &lt;object&gt; element,
 * representing external resources.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement)
 */
public abstract external class HTMLObjectElement : HTMLElement {
    /**
     * The data property of the HTMLObjectElement interface returns a string that reflects the data HTML attribute,
     * specifying the address of a resource's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/data)
     */
    open var data: String

    /**
     * The type property of the HTMLObjectElement interface returns a string that reflects the type HTML attribute,
     * specifying the MIME type of the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/type)
     */
    open var type: String

    /**
     * The name property of the HTMLObjectElement interface returns a string that reflects the name HTML attribute,
     * specifying the name of the browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/name)
     */
    open var name: String

    /**
     * The form read-only property of the HTMLObjectElement interface returns an HTMLFormElement object that owns this
     * &lt;object&gt;, or null if this object element is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The width property of the HTMLObjectElement interface returns a string that reflects the width HTML attribute,
     * specifying the displayed width of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/width)
     */
    open var width: String

    /**
     * The height property of the HTMLObjectElement interface Returns a string that reflects the height HTML attribute,
     * specifying the displayed height of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/height)
     */
    open var height: String

    /**
     * The contentDocument read-only property of the HTMLObjectElement interface Returns a Document representing the
     * active document of the object element's nested browsing context, if any; otherwise null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/contentDocument)
     */
    open val contentDocument: Document?

    /**
     * The contentWindow read-only property of the HTMLObjectElement interface returns a WindowProxy representing the
     * window proxy of the object element's nested browsing context, if any; otherwise null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/contentWindow)
     */
    open val contentWindow: Window?

    /**
     * The getSVGDocument() method of the HTMLObjectElement interface returns the Document object of the embedded SVG.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/getSVGDocument)
     */
    open fun getSVGDocument(): Document?

    /**
     * The willValidate read-only property of the HTMLObjectElement interface returns false, because &lt;object&gt;
     * elements are not candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLObjectElement interface returns a ValidityState object that represents
     * the validity states this element is in. Although &lt;object&gt; elements are never candidates for constraint
     * validation, the validity state may still be invalid if a custom validity message has been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLObjectElement interface returns a string representing a
     * localized message that describes the validation constraints that the control does not satisfy (if any). This is
     * the empty string if the control is not a candidate for constraint validation (willValidate is false), or it
     * satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLObjectElement interface checks if the element is valid, but always returns
     * true because &lt;object&gt; elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLObjectElement interface performs the same validity checking steps as the
     * checkValidity() method. It always returns true because &lt;object&gt; elements are never candidates for
     * constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The setCustomValidity() method of the HTMLObjectElement interface sets a custom validity message for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)
    open var align: String
    open var archive: String
    open var code: String
    open var declare: Boolean
    open var hspace: Int
    open var standby: String
    open var vspace: Int
    open var codeBase: String
    open var codeType: String

    /**
     * The useMap property of the HTMLObjectElement interface returns a string that reflects the usemap HTML attribute,
     * specifying a &lt;map&gt; element to use.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLObjectElement/useMap)
     */
    open var useMap: String
    open var border: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Implemented by the &lt;video&gt; element, the HTMLVideoElement interface provides special properties and methods for
 * manipulating video objects. It also inherits properties and methods of HTMLMediaElement and HTMLElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement)
 */
public abstract external class HTMLVideoElement : HTMLMediaElement, CanvasImageSource, TexImageSource {
    /**
     * The width property of the HTMLVideoElement interface returns an integer that reflects the width attribute of the
     * &lt;video&gt; element, specifying the displayed width of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/width)
     */
    open var width: Int

    /**
     * The height property of the HTMLVideoElement interface returns an integer that reflects the height attribute of
     * the &lt;video&gt; element, specifying the displayed height of the resource in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/height)
     */
    open var height: Int

    /**
     * The HTMLVideoElement interface's read-only videoWidth property indicates the intrinsic width of the video,
     * expressed in CSS pixels. In simple terms, this is the width of the media in its natural size.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoWidth)
     */
    open val videoWidth: Int

    /**
     * The HTMLVideoElement interface's read-only videoHeight property indicates the intrinsic height of the video,
     * expressed in CSS pixels. In simple terms, this is the height of the media in its natural size.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/videoHeight)
     */
    open val videoHeight: Int

    /**
     * The poster property of the HTMLVideoElement interface is a string that reflects the URL for an image to be shown
     * while no video data is available. If the property does not represent a valid URL, no poster frame will be shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLVideoElement/poster)
     */
    open var poster: String
    open var playsInline: Boolean

    companion object {
        val NETWORK_EMPTY: Short
        val NETWORK_IDLE: Short
        val NETWORK_LOADING: Short
        val NETWORK_NO_SOURCE: Short
        val HAVE_NOTHING: Short
        val HAVE_METADATA: Short
        val HAVE_CURRENT_DATA: Short
        val HAVE_FUTURE_DATA: Short
        val HAVE_ENOUGH_DATA: Short
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLAudioElement interface provides access to the properties of &lt;audio&gt; elements, as well as methods to
 * manipulate them.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAudioElement)
 */
public abstract external class HTMLAudioElement : HTMLMediaElement {

    companion object {
        val NETWORK_EMPTY: Short
        val NETWORK_IDLE: Short
        val NETWORK_LOADING: Short
        val NETWORK_NO_SOURCE: Short
        val HAVE_NOTHING: Short
        val HAVE_METADATA: Short
        val HAVE_CURRENT_DATA: Short
        val HAVE_FUTURE_DATA: Short
        val HAVE_ENOUGH_DATA: Short
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public open external class Audio : HTMLAudioElement {
    constructor(src: String = definedExternally)

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
     * The assignedSlot read-only property of the Element interface returns an HTMLSlotElement representing the
     * &lt;slot&gt; element the node is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot)
     */
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint

    /**
     * The role property of the ElementInternals interface returns the WAI-ARIA role for the element. For example, a
     * checkbox might have role="checkbox". It reflects the role attribute; it does not return the element's implicit
     * ARIA role, if any, unless explicitly set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/role)
     */
    override var role: String?

    /**
     * The ariaActiveDescendantElement property of the ElementInternals interface represents the current active element
     * when focus is on a composite widget, combobox, textbox, group, or application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaActiveDescendantElement)
     */
    override var ariaActiveDescendantElement: Element?

    /**
     * The ariaAtomic property of the ElementInternals interface reflects the value of the aria-atomic attribute, which
     * indicates whether assistive technologies will present all, or only parts of, the changed region based on the
     * change notifications defined by the aria-relevant attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAtomic)
     */
    override var ariaAtomic: String?

    /**
     * The ariaAutoComplete property of the ElementInternals interface reflects the value of the aria-autocomplete
     * attribute, which indicates whether inputting text could trigger display of one or more predictions of the user's
     * intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they
     * were made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAutoComplete)
     */
    override var ariaAutoComplete: String?

    /**
     * The ariaBrailleLabel property of the ElementInternals interface reflects the value of the aria-braillelabel
     * attribute, which defines the ARIA braille label of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleLabel)
     */
    override var ariaBrailleLabel: String?

    /**
     * The ariaBrailleRoleDescription property of the ElementInternals interface reflects the value of the
     * aria-brailleroledescription attribute, which defines the ARIA braille role description of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleRoleDescription)
     */
    override var ariaBrailleRoleDescription: String?

    /**
     * The ariaBusy property of the ElementInternals interface reflects the value of the aria-busy attribute, which
     * indicates whether an element is being modified, as assistive technologies may want to wait until the
     * modifications are complete before exposing them to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBusy)
     */
    override var ariaBusy: String?

    /**
     * The ariaChecked property of the ElementInternals interface reflects the value of the aria-checked attribute,
     * which indicates the current "checked" state of checkboxes, radio buttons, and other widgets that have a checked
     * state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaChecked)
     */
    override var ariaChecked: String?

    /**
     * The ariaColCount property of the ElementInternals interface reflects the value of the aria-colcount attribute,
     * which defines the number of columns in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColCount)
     */
    override var ariaColCount: String?

    /**
     * The ariaColIndex property of the ElementInternals interface reflects the value of the aria-colindex attribute,
     * which defines an element's column index or position with respect to the total number of columns within a table,
     * grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndex)
     */
    override var ariaColIndex: String?

    /**
     * The ariaColIndexText property of the ElementInternals interface reflects the value of the aria-colindextext
     * attribute, which defines a human-readable text alternative of aria-colindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndexText)
     */
    override var ariaColIndexText: String?

    /**
     * The ariaColSpan property of the ElementInternals interface reflects the value of the aria-colspan attribute,
     * which defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColSpan)
     */
    override var ariaColSpan: String?

    /**
     * The ariaControlsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that are controlled by the element it is applied to. For example, this might be set on a combobox to
     * indicate the element that it pops up, or on a scrollbar to indicate the ID of the element it controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaControlsElements)
     */
    override var ariaControlsElements: JsArray<Element>?

    /**
     * The ariaCurrent property of the ElementInternals interface reflects the value of the aria-current attribute,
     * which indicates the element that represents the current item within a container or set of related elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaCurrent)
     */
    override var ariaCurrent: String?

    /**
     * The ariaDescribedByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible description for the element it is applied to. The accessible description is
     * similar to the accessible label (see ariaLabelledByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescribedByElements)
     */
    override var ariaDescribedByElements: JsArray<Element>?

    /**
     * The ariaDescription property of the ElementInternals interface reflects the value of the aria-description
     * attribute, which defines a string value that describes or annotates the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescription)
     */
    override var ariaDescription: String?

    /**
     * The ariaDetailsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible details for the element it is applied to. The accessible details are similar
     * to the accessible description (see ariaDescribedByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDetailsElements)
     */
    override var ariaDetailsElements: JsArray<Element>?

    /**
     * The ariaDisabled property of the ElementInternals interface reflects the value of the aria-disabled attribute,
     * which indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDisabled)
     */
    override var ariaDisabled: String?

    /**
     * The ariaErrorMessageElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an error message for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaErrorMessageElements)
     */
    override var ariaErrorMessageElements: JsArray<Element>?

    /**
     * The ariaExpanded property of the ElementInternals interface reflects the value of the aria-expanded attribute,
     * which indicates whether a grouping element owned or controlled by this element is expanded or collapsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaExpanded)
     */
    override var ariaExpanded: String?

    /**
     * The ariaFlowToElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an alternate reading order of content, overriding the general default reading order at the
     * user's discretion. If just one element is provided this is the next element in the reading order. If multiple
     * elements are provided, then each element represents a possible path that should be offered to the user for
     * selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaFlowToElements)
     */
    override var ariaFlowToElements: JsArray<Element>?

    /**
     * The ariaHasPopup property of the ElementInternals interface reflects the value of the aria-haspopup attribute,
     * which indicates the availability and type of interactive popup element, such as menu or dialog, that can be
     * triggered by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHasPopup)
     */
    override var ariaHasPopup: String?

    /**
     * The ariaHidden property of the ElementInternals interface reflects the value of the aria-hidden attribute, which
     * indicates whether the element is exposed to an accessibility API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHidden)
     */
    override var ariaHidden: String?

    /**
     * The ariaInvalid property of the ElementInternals interface reflects the value of the aria-invalid attribute.
     * Relevant for the application, checkbox, combobox, gridcell, listbox, radiogroup, slider, spinbutton, textbox, and
     * tree roles, it indicates to the accessibility API whether the entered value does not conform to the format
     * expected by the application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaInvalid)
     */
    override var ariaInvalid: String?

    /**
     * The ariaKeyShortcuts property of the ElementInternals interface reflects the value of the aria-keyshortcuts
     * attribute, which indicates keyboard shortcuts that an author has implemented to activate or give focus to an
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaKeyShortcuts)
     */
    override var ariaKeyShortcuts: String?

    /**
     * The ariaLabel property of the ElementInternals interface reflects the value of the aria-label attribute, which
     * defines a string value that labels the current Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabel)
     */
    override var ariaLabel: String?

    /**
     * The ariaLabelledByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible name for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabelledByElements)
     */
    override var ariaLabelledByElements: JsArray<Element>?

    /**
     * The ariaLevel property of the ElementInternals interface reflects the value of the aria-level attribute, which
     * defines the hierarchical level of an element within a structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLevel)
     */
    override var ariaLevel: String?

    /**
     * The ariaLive property of the ElementInternals interface reflects the value of the aria-live attribute, which
     * indicates that an element will be updated, and describes the types of updates the user agents, assistive
     * technologies, and user can expect from the live region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLive)
     */
    override var ariaLive: String?

    /**
     * The ariaModal property of the ElementInternals interface reflects the value of the aria-modal attribute, which
     * indicates whether an element is modal when displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaModal)
     */
    override var ariaModal: String?

    /**
     * The ariaMultiLine property of the ElementInternals interface reflects the value of the aria-multiline attribute,
     * which indicates whether a text box accepts multiple lines of input or only a single line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiLine)
     */
    override var ariaMultiLine: String?

    /**
     * The ariaMultiSelectable property of the ElementInternals interface reflects the value of the aria-multiselectable
     * attribute, which indicates that the user may select more than one item from the current selectable descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiSelectable)
     */
    override var ariaMultiSelectable: String?

    /**
     * The ariaOrientation property of the ElementInternals interface reflects the value of the aria-orientation
     * attribute, which indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOrientation)
     */
    override var ariaOrientation: String?

    /**
     * The ariaOwnsElements property of the ElementInternals interface is an array containing the element (or elements)
     * that define a visual, functional, or contextual relationship between a parent element that it is applied to, and
     * its child elements. This is used when the shadow DOM hierarchy cannot be used to represent the relationship, and
     * it would not otherwise be available to assistive technology,
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOwnsElements)
     */
    override var ariaOwnsElements: JsArray<Element>?

    /**
     * The ariaPlaceholder property of the ElementInternals interface reflects the value of the aria-placeholder
     * attribute, which defines a short hint intended to aid the user with data entry when the control has no value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPlaceholder)
     */
    override var ariaPlaceholder: String?

    /**
     * The ariaPosInSet property of the ElementInternals interface reflects the value of the aria-posinset attribute,
     * which defines an element's number or position in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPosInSet)
     */
    override var ariaPosInSet: String?

    /**
     * The ariaPressed property of the ElementInternals interface reflects the value of the aria-pressed attribute,
     * which indicates the current "pressed" state of toggle buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPressed)
     */
    override var ariaPressed: String?

    /**
     * The ariaReadOnly property of the ElementInternals interface reflects the value of the aria-readonly attribute,
     * which indicates that the element is not editable, but is otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaReadOnly)
     */
    override var ariaReadOnly: String?

    /**
     * The ariaRelevant property of the ElementInternals interface reflects the value of the aria-relevant attribute,
     * which indicates what notifications the user agent will trigger when the accessibility tree within a live region
     * is modified. This is used to describe what changes in an aria-live region are relevant and should be announced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRelevant)
     */
    override var ariaRelevant: String?

    /**
     * The ariaRequired property of the ElementInternals interface reflects the value of the aria-required attribute,
     * which indicates that user input is required on the element before a form may be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRequired)
     */
    override var ariaRequired: String?

    /**
     * The ariaRoleDescription property of the ElementInternals interface reflects the value of the aria-roledescription
     * attribute, which defines a human-readable, author-localized description for the role of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRoleDescription)
     */
    override var ariaRoleDescription: String?

    /**
     * The ariaRowCount property of the ElementInternals interface reflects the value of the aria-rowcount attribute,
     * which defines the total number of rows in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowCount)
     */
    override var ariaRowCount: String?

    /**
     * The ariaRowIndex property of the ElementInternals interface reflects the value of the aria-rowindex attribute,
     * which defines an element's row index or position with respect to the total number of rows within a table, grid,
     * or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndex)
     */
    override var ariaRowIndex: String?

    /**
     * The ariaRowIndexText property of the ElementInternals interface reflects the value of the aria-rowindextext
     * attribute, which defines a human-readable text alternative of aria-rowindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndexText)
     */
    override var ariaRowIndexText: String?

    /**
     * The ariaRowSpan property of the ElementInternals interface reflects the value of the aria-rowspan attribute,
     * which defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowSpan)
     */
    override var ariaRowSpan: String?

    /**
     * The ariaSelected property of the ElementInternals interface reflects the value of the aria-selected attribute,
     * which indicates the current "selected" state of elements that have a selected state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSelected)
     */
    override var ariaSelected: String?

    /**
     * The ariaSetSize property of the ElementInternals interface reflects the value of the aria-setsize attribute,
     * which defines the number of items in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSetSize)
     */
    override var ariaSetSize: String?

    /**
     * The ariaSort property of the ElementInternals interface reflects the value of the aria-sort attribute, which
     * indicates if items in a table or grid are sorted in ascending or descending order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSort)
     */
    override var ariaSort: String?

    /**
     * The ariaValueMax property of the ElementInternals interface reflects the value of the aria-valuemax attribute,
     * which defines the maximum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMax)
     */
    override var ariaValueMax: String?

    /**
     * The ariaValueMin property of the ElementInternals interface reflects the value of the aria-valuemin attribute,
     * which defines the minimum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMin)
     */
    override var ariaValueMin: String?

    /**
     * The ariaValueNow property of the ElementInternals interface reflects the value of the aria-valuenow attribute,
     * which defines the current value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueNow)
     */
    override var ariaValueNow: String?

    /**
     * The ariaValueText property of the ElementInternals interface reflects the value of the aria-valuetext attribute,
     * which defines the human-readable text alternative of aria-valuenow for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueText)
     */
    override var ariaValueText: String?

    /**
     * The ariaNotify() method of the Element interface queues a string of text to be announced by a screen reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaNotify)
     */
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
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
     * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable)
     */
    override var contentEditable: String

    /**
     * The enterKeyHint property is an enumerated property defining what action label (or icon) to present for the enter
     * key on virtual keyboards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint)
     */
    override var enterKeyHint: String

    /**
     * The HTMLElement.isContentEditable read-only property returns a boolean value that is true if the contents of the
     * element are editable; otherwise it returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable)
     */
    override val isContentEditable: Boolean

    /**
     * The HTMLElement property inputMode reflects the value of the element's inputmode attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode)
     */
    override var inputMode: String

    /**
     * The dataset read-only property of the HTMLElement interface provides read/write access to custom data attributes
     * (data-*) on elements. It exposes a map of strings (DOMStringMap) with an entry for each data-* attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset)
     */
    override val dataset: DOMStringMap

    /**
     * The nonce property of the HTMLElement interface returns the cryptographic number used once that is used by
     * Content Security Policy to determine whether a given fetch will be allowed to proceed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce)
     */
    override var nonce: String

    /**
     * The autofocus property of the HTMLElement interface represents a boolean value reflecting the autofocus HTML
     * global attribute. This indicates whether the element should be focused on page load or, if it is nested inside a
     * &lt;dialog&gt; or popover element, when the &lt;dialog&gt; or popover is shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autofocus)
     */
    override var autofocus: Boolean

    /**
     * The tabIndex property of the HTMLElement interface represents the tab order of the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex)
     */
    override var tabIndex: Int

    /**
     * The HTMLElement.focus() method sets focus on the specified element, if it can be focused. The focused element is
     * the element that will receive keyboard and similar events by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus)
     */
    override fun focus(options: FocusOptions)

    /**
     * The HTMLElement.blur() method removes keyboard focus from the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur)
     */
    override fun blur()

    /**
     * The read-only style property of the HTMLElement interface returns the inline style of an element in the form of a
     * live CSSStyleProperties object. This object can be used to get and set the inline styles of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style)
     */
    override val style: CSSStyleProperties

    companion object {
        val NETWORK_EMPTY: Short
        val NETWORK_IDLE: Short
        val NETWORK_LOADING: Short
        val NETWORK_NO_SOURCE: Short
        val HAVE_NOTHING: Short
        val HAVE_METADATA: Short
        val HAVE_CURRENT_DATA: Short
        val HAVE_FUTURE_DATA: Short
        val HAVE_ENOUGH_DATA: Short
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTrackElement interface represents an HTML &lt;track&gt; element within the DOM. This element can be used as a
 * child of either &lt;audio&gt; or &lt;video&gt; to specify a text track containing information such as closed captions
 * or subtitles.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement)
 */
public abstract external class HTMLTrackElement : HTMLElement {
    /**
     * The kind property of the HTMLTrackElement interface represents the type of track, or how the text track is meant
     * to be used. It reflects the &lt;track&gt; element's enumerated kind attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/kind)
     */
    open var kind: String

    /**
     * The src property of the HTMLTrackElement interface reflects the value of the &lt;track&gt; element's src
     * attribute, which indicates the URL of the text track's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/src)
     */
    open var src: String

    /**
     * The srclang property of the HTMLTrackElement interface reflects the value of the &lt;track&gt; element's srclang
     * attribute or the empty string if not defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/srclang)
     */
    open var srclang: String

    /**
     * The label property of the HTMLTrackElement represents the user-readable title displayed when listing subtitle,
     * caption, and audio descriptions for a track. It reflects the &lt;track&gt; element's label attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/label)
     */
    open var label: String

    /**
     * The default property of the HTMLTrackElement interface represents whether the track will be enabled if the user's
     * preferences do not indicate that another track would be more appropriate. It reflects the &lt;track&gt; element's
     * boolean default attribute, returning true if present and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/default)
     */
    open var default: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/readyState)
     */
    open val readyState: Short

    /**
     * The track read-only property of the HTMLTrackElement interface returns a TextTrack object corresponding to the
     * text track of the &lt;track&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTrackElement/track)
     */
    open val track: TextTrack

    companion object {
        val NONE: Short
        val LOADING: Short
        val LOADED: Short
        val ERROR: Short
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface CanPlayTypeResult : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanPlayTypeResult.Companion.EMPTY: CanPlayTypeResult get() = "".toJsString().unsafeCast<CanPlayTypeResult>()
public inline val CanPlayTypeResult.Companion.MAYBE: CanPlayTypeResult get() = "maybe".toJsString().unsafeCast<CanPlayTypeResult>()
public inline val CanPlayTypeResult.Companion.PROBABLY: CanPlayTypeResult get() = "probably".toJsString().unsafeCast<CanPlayTypeResult>()

/**
 * The HTMLMediaElement interface adds to HTMLElement the properties and methods needed to support basic media-related
 * capabilities that are common to audio and video.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement)
 */
public abstract external class HTMLMediaElement : HTMLElement {
    /**
     * The error read-only property of the HTMLMediaElement interface is the MediaError object for the most recent
     * error, or null if there has not been an error. When an error event is received by the element, you can determine
     * details about what happened by examining this object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/error)
     */
    open val error: MediaError?

    /**
     * The HTMLMediaElement.src property reflects the value of the HTML media element's src attribute, which indicates
     * the URL of a media resource to use in the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/src)
     */
    open var src: String

    /**
     * The srcObject property of the HTMLMediaElement interface sets or returns the object which serves as the source of
     * the media associated with the HTMLMediaElement, or null if not assigned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/srcObject)
     */
    open var srcObject: MediaProvider?

    /**
     * The currentSrc read-only property of the HTMLMediaElement interface contains the absolute URL of the chosen media
     * resource. This could happen, for example, if the web server selects a media file based on the resolution of the
     * user's display. The value is an empty string if the networkState property is EMPTY.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentSrc)
     */
    open val currentSrc: String

    /**
     * The HTMLMediaElement.crossOrigin property is the CORS setting for this media element. See CORS settings
     * attributes for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/crossOrigin)
     */
    open var crossOrigin: String?

    /**
     * The networkState read-only property of the HTMLMediaElement interface indicates the current state of the fetching
     * of media over the network.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/networkState)
     */
    open val networkState: Short

    /**
     * The preload property of the HTMLMediaElement interface is a string that provides a hint to the browser about what
     * the author thinks will lead to the best user experience.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preload)
     */
    open var preload: String

    /**
     * The buffered read-only property of HTMLMediaElement objects returns a new static normalized TimeRanges object
     * that represents the ranges of the media resource, if any, that the user agent has buffered at the moment the
     * buffered property is accessed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/buffered)
     */
    open val buffered: TimeRanges

    /**
     * The HTMLMediaElement method load() resets the media element to its initial state and begins the process of
     * selecting a media source and loading the media in preparation for playback to begin at the beginning.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/load)
     */
    open fun load()

    /**
     * The HTMLMediaElement method canPlayType() reports how likely it is that the current browser will be able to play
     * media of a given MIME type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/canPlayType)
     */
    open fun canPlayType(type: String): CanPlayTypeResult

    /**
     * The readyState read-only property of the HTMLMediaElement interface indicates the readiness state of the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/readyState)
     */
    open val readyState: Short

    /**
     * The seeking read-only property of the HTMLMediaElement interface is a Boolean indicating whether the resource,
     * the &lt;audio&gt; or &lt;video&gt;, is in the process of seeking to a new position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seeking)
     */
    open val seeking: Boolean

    /**
     * The HTMLMediaElement interface's currentTime property specifies the current playback time in seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/currentTime)
     */
    open var currentTime: Double

    /**
     * The HTMLMediaElement.fastSeek() method quickly seeks the media to the new time with precision tradeoff.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/fastSeek)
     */
    open fun fastSeek(time: Double)

    /**
     * The read-only HTMLMediaElement property duration indicates the length of the element's media in seconds.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/duration)
     */
    open val duration: Double

    /**
     * The getStartDate() method of the HTMLMediaElement interface returns a new Date object representing the real-world
     * date and time corresponding to the beginning of the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/getStartDate)
     */
    open fun getStartDate(): JsAny

    /**
     * The read-only HTMLMediaElement.paused property tells whether the media element is paused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/paused)
     */
    open val paused: Boolean

    /**
     * The HTMLMediaElement.defaultPlaybackRate property indicates the default playback rate for the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultPlaybackRate)
     */
    open var defaultPlaybackRate: Double

    /**
     * The HTMLMediaElement.playbackRate property sets the rate at which the media is being played back. This is used to
     * implement user controls for fast forward, slow motion, and so forth. The normal playback rate is multiplied by
     * this value to obtain the current rate, so a value of 1.0 indicates normal speed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/playbackRate)
     */
    open var playbackRate: Double

    /**
     * The HTMLMediaElement.preservesPitch property determines whether or not the browser should adjust the pitch of the
     * audio to compensate for changes to the playback rate made by setting HTMLMediaElement.playbackRate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/preservesPitch)
     */
    open var preservesPitch: Boolean

    /**
     * The played read-only property of the HTMLMediaElement interface indicates the time ranges the resource, an
     * &lt;audio&gt; or &lt;video&gt; media file, has played. It returns a new TimeRanges object that contains the
     * ranges of the media source that the browser has played, if any, at the time the attribute is evaluated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/played)
     */
    open val played: TimeRanges

    /**
     * The seekable read-only property of HTMLMediaElement objects returns a new static normalized TimeRanges object
     * that represents the ranges of the media resource, if any, that the user agent is able to seek to at the time
     * seekable property is accessed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/seekable)
     */
    open val seekable: TimeRanges

    /**
     * The ended read-only property of the HTMLMediaElement interface indicates whether the media element has ended
     * playback.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/ended)
     */
    open val ended: Boolean

    /**
     * The HTMLMediaElement.autoplay property reflects the autoplay HTML attribute, indicating whether playback should
     * automatically begin as soon as enough media is available to do so without interruption.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/autoplay)
     */
    open var autoplay: Boolean

    /**
     * The HTMLMediaElement.loop property reflects the loop HTML attribute, which controls whether the media element
     * should start over when it reaches the end.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loop)
     */
    open var loop: Boolean

    /**
     * The HTMLMediaElement play() method attempts to begin playback of the media. It returns a Promise which is
     * resolved when playback has been successfully started.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/play)
     */
    open fun play(): Promise<JsAny?>

    /**
     * The HTMLMediaElement.pause() method will pause playback of the media, if the media is already in a paused state
     * this method will have no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/pause)
     */
    open fun pause()

    /**
     * The HTMLMediaElement.controls property reflects the controls HTML attribute, which controls whether user
     * interface controls for playing the media item will be displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/controls)
     */
    open var controls: Boolean

    /**
     * The HTMLMediaElement.volume property sets the volume at which the media will be played.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/volume)
     */
    open var volume: Double

    /**
     * The HTMLMediaElement.muted property indicates whether the media element is muted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/muted)
     */
    open var muted: Boolean

    /**
     * The HTMLMediaElement.defaultMuted property reflects the muted HTML attribute, which indicates whether the media
     * element's audio output should be muted by default. This property has no dynamic effect. To mute and unmute the
     * audio output, use the muted property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/defaultMuted)
     */
    open var defaultMuted: Boolean

    /**
     * The loading property of the HTMLMediaElement interface provides a hint to the browser on how to handle the
     * loading of the media which is currently outside the window's visual viewport. This helps to optimize the loading
     * of the document's contents by postponing loading the media until it's expected to be needed, rather than
     * immediately during the initial page load. It reflects the &lt;audio&gt; element's loading content attribute or
     * the &lt;video&gt; element's loading content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/loading)
     */
    open var loading: String

    /**
     * The read-only audioTracks property on HTMLMediaElement objects returns an AudioTrackList object listing all of
     * the AudioTrack objects representing the media element's audio tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/audioTracks)
     */
    open val audioTracks: AudioTrackList

    /**
     * The read-only videoTracks property on HTMLMediaElement objects returns a VideoTrackList object listing all of the
     * VideoTrack objects representing the media element's video tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/videoTracks)
     */
    open val videoTracks: VideoTrackList

    /**
     * The read-only textTracks property on HTMLMediaElement objects returns a TextTrackList object listing all of the
     * TextTrack objects representing the media element's text tracks, in the same order as in the list of text tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/textTracks)
     */
    open val textTracks: TextTrackList

    /**
     * The addTextTrack() method of the HTMLMediaElement interface creates a new TextTrack object and adds it to the
     * media element. It fires an addtrack event on this media element's textTracks. This method can't be used on a
     * TextTrackList interface, only an HTMLMediaElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/addTextTrack)
     */
    open fun addTextTrack(kind: TextTrackKind, label: String = definedExternally, language: String = definedExternally): TextTrack

    /**
     * The read-only HTMLMediaElement.mediaKeys property returns a MediaKeys object, that is a set of keys that the
     * element can use for decryption of media data during playback.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/mediaKeys)
     */
    open val mediaKeys: MediaKeys?

    /**
     * The encrypted event is fired when initialization data is found in the media that indicates it is encrypted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/encrypted_event)
     */
    open var onencrypted: ((MediaEncryptedEvent) -> Unit)?

    /**
     * The waitingforkey event is fired at a media element when it is first unable to play because it needs a key to
     * decode the following data, and playback is stopped.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/waitingforkey_event)
     */
    open var onwaitingforkey: ((Event) -> Unit)?

    /**
     * The setMediaKeys() method of the HTMLMediaElement interface sets the MediaKeys that will be used to decrypt media
     * during playback.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMediaElement/setMediaKeys)
     */
    open fun setMediaKeys(mediaKeys: MediaKeys?): Promise<JsAny?>

    companion object {
        val NETWORK_EMPTY: Short
        val NETWORK_IDLE: Short
        val NETWORK_LOADING: Short
        val NETWORK_NO_SOURCE: Short
        val HAVE_NOTHING: Short
        val HAVE_METADATA: Short
        val HAVE_CURRENT_DATA: Short
        val HAVE_FUTURE_DATA: Short
        val HAVE_ENOUGH_DATA: Short
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The MediaError interface represents an error which occurred while handling media in an HTML media element based on
 * HTMLMediaElement, such as &lt;audio&gt; or &lt;video&gt;.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError)
 */
public abstract external class MediaError : JsAny {
    /**
     * The read-only property MediaError.code returns a numeric value which represents the kind of error that occurred
     * on a media element. To get a text string with specific diagnostic information, see MediaError.message.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/code)
     */
    open val code: Short

    /**
     * The read-only property MediaError.message returns a human-readable string offering specific diagnostic details
     * related to the error described by the MediaError object, or an empty string ("") if no diagnostic information can
     * be determined or provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaError/message)
     */
    open val message: String

    companion object {
        val MEDIA_ERR_ABORTED: Short
        val MEDIA_ERR_NETWORK: Short
        val MEDIA_ERR_DECODE: Short
        val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
    }
}

/**
 * The AudioTrackList interface is used to represent a list of the audio tracks contained within a given HTML media
 * element, with each track represented by a separate AudioTrack object in the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrackList)
 */
public abstract external class AudioTrackList : EventTarget {
    /**
     * The read-only AudioTrackList property length returns the number of entries in the AudioTrackList, each of which
     * is an AudioTrack representing one audio track in the media element. A value of 0 indicates that there are no
     * audio tracks in the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrackList/length)
     */
    open val length: Int

    /**
     * The AudioTrackList method getTrackById() returns the first AudioTrack object from the track list whose id matches
     * the specified string. This lets you find a specified track if you know its ID string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrackList/getTrackById)
     */
    open fun getTrackById(id: String): AudioTrack?

    /**
     * The change event is fired when an audio track is enabled or disabled, for example by changing the track's enabled
     * property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrackList/change_event)
     */
    open var onchange: ((Event) -> Unit)?

    /**
     * The addtrack event is fired when a track is added to an AudioTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrackList/addtrack_event)
     */
    open var onaddtrack: ((TrackEvent) -> Unit)?

    /**
     * The removetrack event is fired when a track is removed from an AudioTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrackList/removetrack_event)
     */
    open var onremovetrack: ((TrackEvent) -> Unit)?
}

public operator fun AudioTrackList.get(index: Int): AudioTrack? = getProperty(this, index)

/**
 * The AudioTrack interface represents a single audio track from one of the HTML media elements, &lt;audio&gt; or
 * &lt;video&gt;.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack)
 */
public abstract external class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
    /**
     * The id read-only property of the AudioTrack interface contains a string which uniquely identifies the track
     * represented by the AudioTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack/id)
     */
    open val id: String

    /**
     * The kind read-only property of the AudioTrack interface contains a string indicating the category of audio
     * contained in the AudioTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack/kind)
     */
    open val kind: String

    /**
     * The read-only AudioTrack property label returns a string specifying the audio track's human-readable label, if
     * one is available; otherwise, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack/label)
     */
    open val label: String

    /**
     * The read-only AudioTrack property language returns a string identifying the language used in the audio track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack/language)
     */
    open val language: String

    /**
     * The AudioTrack property enabled specifies whether or not the described audio track is currently enabled for use.
     * If the track is disabled by setting enabled to false, the track is muted and does not produce audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack/enabled)
     */
    open var enabled: Boolean

    /**
     * The read-only AudioTrack property sourceBuffer returns the SourceBuffer that created the track, or null if the
     * track was not created by a SourceBuffer or the SourceBuffer has been removed from the MediaSource.sourceBuffers
     * attribute of its parent media source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioTrack/sourceBuffer)
     */
    open val sourceBuffer: SourceBuffer?
}

/**
 * The VideoTrackList interface is used to represent a list of the video tracks contained within a &lt;video&gt;
 * element, with each track represented by a separate VideoTrack object in the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList)
 */
public abstract external class VideoTrackList : EventTarget {
    /**
     * The read-only VideoTrackList property length returns the number of entries in the VideoTrackList, each of which
     * is a VideoTrack representing one video track in the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList/length)
     */
    open val length: Int

    /**
     * The VideoTrackList method getTrackById() returns the first VideoTrack object from the track list whose id matches
     * the specified string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList/getTrackById)
     */
    open fun getTrackById(id: String): VideoTrack?

    /**
     * The read-only VideoTrackList property selectedIndex returns the index of the currently selected track, if any, or
     * -1 otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList/selectedIndex)
     */
    open val selectedIndex: Int

    /**
     * The change event is fired when a video track is made active or inactive, for example by changing the track's
     * selected property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList/change_event)
     */
    open var onchange: ((Event) -> Unit)?

    /**
     * The addtrack event is fired when a video track is added to a VideoTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList/addtrack_event)
     */
    open var onaddtrack: ((TrackEvent) -> Unit)?

    /**
     * The removetrack event is fired when a video track is removed from a VideoTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrackList/removetrack_event)
     */
    open var onremovetrack: ((TrackEvent) -> Unit)?
}

public operator fun VideoTrackList.get(index: Int): VideoTrack? = getProperty(this, index)

/**
 * The VideoTrack interface represents a single video track from a &lt;video&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack)
 */
public abstract external class VideoTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
    /**
     * The id read-only property of the VideoTrack interface contains a string which uniquely identifies the track
     * represented by the VideoTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack/id)
     */
    open val id: String

    /**
     * The kind read-only property of the VideoTrack interface contains a string indicating the category of video
     * contained in the VideoTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack/kind)
     */
    open val kind: String

    /**
     * The read-only VideoTrack property label returns a string specifying the video track's human-readable label, if
     * one is available; otherwise, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack/label)
     */
    open val label: String

    /**
     * The read-only VideoTrack property language returns a string identifying the language used in the video track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack/language)
     */
    open val language: String

    /**
     * The VideoTrack property selected controls whether or not a particular video track is active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack/selected)
     */
    open var selected: Boolean

    /**
     * The read-only VideoTrack property sourceBuffer returns the SourceBuffer that created the track, or null if the
     * track was not created by a SourceBuffer or the SourceBuffer has been removed from the MediaSource.sourceBuffers
     * attribute of its parent media source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoTrack/sourceBuffer)
     */
    open val sourceBuffer: SourceBuffer?
}

/**
 * The TextTrackList interface is used to represent a list of the text tracks defined for the associated video or audio
 * element, with each track represented by a separate TextTrack object in the list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList)
 */
public abstract external class TextTrackList : EventTarget {
    /**
     * The read-only TextTrackList property length returns the number of entries in the TextTrackList, each of which is
     * a TextTrack representing one track in the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/length)
     */
    open val length: Int

    /**
     * The TextTrackList method getTrackById() returns the first TextTrack object from the track list whose id matches
     * the specified string. This lets you find a specified track if you know its ID string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/getTrackById)
     */
    open fun getTrackById(id: String): TextTrack?

    /**
     * The change event is fired when a text track is made active or inactive, or a TextTrackList is otherwise changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event)
     */
    open var onchange: ((Event) -> Unit)?

    /**
     * The addtrack event is fired when a track is added to a TextTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event)
     */
    open var onaddtrack: ((TrackEvent) -> Unit)?

    /**
     * The removetrack event is fired when a track is removed from a TextTrackList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event)
     */
    open var onremovetrack: ((TrackEvent) -> Unit)?
}

public operator fun TextTrackList.get(index: Int): TextTrack? = getProperty(this, index)

public external interface TextTrackMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val TextTrackMode.Companion.DISABLED: TextTrackMode get() = "disabled".toJsString().unsafeCast<TextTrackMode>()
public inline val TextTrackMode.Companion.HIDDEN: TextTrackMode get() = "hidden".toJsString().unsafeCast<TextTrackMode>()
public inline val TextTrackMode.Companion.SHOWING: TextTrackMode get() = "showing".toJsString().unsafeCast<TextTrackMode>()

public external interface TextTrackKind : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val TextTrackKind.Companion.SUBTITLES: TextTrackKind get() = "subtitles".toJsString().unsafeCast<TextTrackKind>()
public inline val TextTrackKind.Companion.CAPTIONS: TextTrackKind get() = "captions".toJsString().unsafeCast<TextTrackKind>()
public inline val TextTrackKind.Companion.DESCRIPTIONS: TextTrackKind get() = "descriptions".toJsString().unsafeCast<TextTrackKind>()
public inline val TextTrackKind.Companion.CHAPTERS: TextTrackKind get() = "chapters".toJsString().unsafeCast<TextTrackKind>()
public inline val TextTrackKind.Companion.METADATA: TextTrackKind get() = "metadata".toJsString().unsafeCast<TextTrackKind>()

/**
 * The TextTrack interface of the WebVTT API represents a text track associated with a media element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack)
 */
public abstract external class TextTrack : EventTarget, UnionAudioTrackOrTextTrackOrVideoTrack {
    /**
     * The kind read-only property of the TextTrack interface returns the kind of text track this object represents.
     * This decides how the track will be handled by a user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/kind)
     */
    open val kind: TextTrackKind

    /**
     * The label read-only property of the TextTrack interface returns a human-readable label for the text track, if it
     * is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/label)
     */
    open val label: String

    /**
     * The language read-only property of the TextTrack interface returns the language of the text track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/language)
     */
    open val language: String

    /**
     * The id read-only property of the TextTrack interface returns the ID of the track if it has one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/id)
     */
    open val id: String

    /**
     * The inBandMetadataTrackDispatchType read-only property of the TextTrack interface returns the text track's
     * in-band metadata dispatch type of the text track represented by the TextTrack object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/inBandMetadataTrackDispatchType)
     */
    open val inBandMetadataTrackDispatchType: String

    /**
     * The TextTrack interface's mode property is a string specifying and controlling the text track's mode: disabled,
     * hidden, or showing. You can read this value to determine the current mode, and you can change this value to
     * switch modes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/mode)
     */
    open var mode: TextTrackMode

    /**
     * The cues read-only property of the TextTrack interface returns a TextTrackCueList object containing all of the
     * track's cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cues)
     */
    open val cues: TextTrackCueList?

    /**
     * The activeCues read-only property of the TextTrack interface returns a TextTrackCueList object listing the
     * currently active cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/activeCues)
     */
    open val activeCues: TextTrackCueList?

    /**
     * The addCue() method of the TextTrack interface adds a new cue to the list of cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/addCue)
     */
    open fun addCue(cue: TextTrackCue)

    /**
     * The removeCue() method of the TextTrack interface removes a cue from the list of cues.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/removeCue)
     */
    open fun removeCue(cue: TextTrackCue)

    /**
     * The cuechange event fires when a TextTrack has changed the currently displaying cues. The event is fired on both
     * the TextTrack and the HTMLTrackElement in which it's being presented, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/cuechange_event)
     */
    open var oncuechange: ((Event) -> Unit)?

    /**
     * The read-only sourceBuffer property of the TextTrack interface returns the SourceBuffer that created the track,
     * or null if the track was not created by a SourceBuffer or the SourceBuffer has been removed from the
     * MediaSource.sourceBuffers attribute of its parent media source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrack/sourceBuffer)
     */
    open val sourceBuffer: SourceBuffer?
}

/**
 * The TextTrackCueList interface of the WebVTT API is an array-like object that represents a dynamically updating list
 * of TextTrackCue objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList)
 */
public abstract external class TextTrackCueList : JsAny {
    /**
     * The length read-only property of the TextTrackCueList interface returns the number of cues in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList/length)
     */
    open val length: Int

    /**
     * The getCueById() method of the TextTrackCueList interface returns the first VTTCue in the list represented by the
     * TextTrackCueList object whose identifier matches the value of id.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCueList/getCueById)
     */
    open fun getCueById(id: String): TextTrackCue?
}

public operator fun TextTrackCueList.get(index: Int): TextTrackCue? = getProperty(this, index)

/**
 * The TextTrackCue interface of the WebVTT API is the abstract base class for the various derived cue types, such as
 * VTTCue and DataCue; you will work with these derived types rather than the base class.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue)
 */
public abstract external class TextTrackCue : EventTarget {
    /**
     * The track read-only property of the TextTrackCue interface returns the TextTrack object that this cue belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/track)
     */
    open val track: TextTrack?

    /**
     * The id property of the TextTrackCue interface returns and sets the identifier for this cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/id)
     */
    open var id: String

    /**
     * The startTime property of the TextTrackCue interface returns and sets the start time of the cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/startTime)
     */
    open var startTime: Double

    /**
     * The endTime property of the TextTrackCue interface returns and sets the end time of the cue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/endTime)
     */
    open var endTime: Double

    /**
     * The pauseOnExit property of the TextTrackCue interface returns or sets the flag indicating whether playback of
     * the media should pause when the end of the range to which this cue applies is reached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/pauseOnExit)
     */
    open var pauseOnExit: Boolean

    /**
     * The enter event fires when a cue becomes active. In the case of subtitles or a caption this is when it displays
     * over the media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/enter_event)
     */
    open var onenter: ((Event) -> Unit)?

    /**
     * The exit event fires when a cue stops being active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackCue/exit_event)
     */
    open var onexit: ((Event) -> Unit)?
}

/**
 * When loading a media resource for use by an &lt;audio&gt; or &lt;video&gt; element, the TimeRanges interface is used
 * for representing the time ranges of the media resource that have been buffered, the time ranges that have been
 * played, and the time ranges that are seekable.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges)
 */
public abstract external class TimeRanges : JsAny {
    /**
     * The TimeRanges.length read-only property returns the number of ranges in the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/length)
     */
    open val length: Int

    /**
     * The start() method of the TimeRanges interface returns the time offset (in seconds) at which a specified time
     * range begins.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/start)
     */
    open fun start(index: Int): Double

    /**
     * The end() method of the TimeRanges interface returns the time offset (in seconds) at which a specified time range
     * ends.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TimeRanges/end)
     */
    open fun end(index: Int): Double
}

/**
 * The TrackEvent interface of the HTML DOM API is used for events which represent changes to a set of available tracks
 * on an HTML media element; these events are addtrack and removetrack.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent)
 */
public open external class TrackEvent : Event {
    /**
     * The TrackEvent() constructor creates and returns a new TrackEvent object describing an event which occurred on a
     * list of tracks (AudioTrackList, VideoTrackList, or TextTrackList).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent/TrackEvent)
     */
    constructor(type: String, eventInitDict: TrackEventInit = definedExternally)

    /**
     * The read-only track property of the TrackEvent interface specifies the media track object to which the event
     * applies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TrackEvent/track)
     */
    open val track: UnionAudioTrackOrTextTrackOrVideoTrack?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface TrackEventInit : EventInit {
    var track: UnionAudioTrackOrTextTrackOrVideoTrack?
}

public fun TrackEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, track: UnionAudioTrackOrTextTrackOrVideoTrack? = null): TrackEventInit = newJsObject<TrackEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (track != null) this.track = track
}

/**
 * The HTMLMapElement interface provides special properties and methods (beyond those of the regular object HTMLElement
 * interface it also has available to it by inheritance) for manipulating the layout and presentation of map elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMapElement)
 */
public abstract external class HTMLMapElement : HTMLElement {
    /**
     * The name property of the HTMLMapElement represents the unique name &lt;map&gt; element. Its value can be used
     * with the useMap attribute of the &lt;img&gt; element to reference a &lt;map&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMapElement/name)
     */
    open var name: String

    /**
     * The areas read-only property of the HTMLMapElement interface returns a collection of &lt;area&gt; elements
     * associated with the &lt;map&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMapElement/areas)
     */
    open val areas: HTMLCollection

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLAreaElement interface provides special properties and methods (beyond those of the regular object HTMLElement
 * interface it also has available to it by inheritance) for manipulating the layout and presentation of &lt;area&gt;
 * elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement)
 */
public abstract external class HTMLAreaElement : HTMLElement, HyperlinkElementUtils, HTMLHyperlinkElementUtils {
    /**
     * The alt property of the HTMLAreaElement interface specifies the text of the hyperlink, defining the textual label
     * for an image map's link. It reflects the &lt;area&gt; element's alt attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/alt)
     */
    open var alt: String

    /**
     * The coords property of the HTMLAreaElement interface specifies the coordinates of the element's shape as a list
     * of floating-point numbers. It reflects the &lt;area&gt; element's coords attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/coords)
     */
    open var coords: String

    /**
     * The shape property of the HTMLAreaElement interface specifies the shape of an image map area. It reflects the
     * &lt;area&gt; element's shape attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/shape)
     */
    open var shape: String

    /**
     * The download property of the HTMLAreaElement interface is a string indicating that the linked resource is
     * intended to be downloaded rather than displayed in the browser. The value, if any, represents the proposed name
     * of the file. It reflects the download attribute of the &lt;area&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/download)
     */
    open var download: String

    /**
     * The ping property of the HTMLAreaElement interface is a space-separated list of URLs. When the link is followed,
     * the browser will send POST requests with the body PING to the URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/ping)
     */
    open var ping: String

    /**
     * The HTMLAreaElement.rel property reflects the rel attribute. It is a string containing a space-separated list of
     * link types indicating the relationship between the resource represented by the &lt;area&gt; element and the
     * current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/rel)
     */
    open var rel: String

    /**
     * The read-only relList property of the HTMLAreaElement returns a live DOMTokenList object containing the set of
     * link types indicating the relationship between the resource represented by the &lt;area&gt; element and the
     * current document. It reflects the &lt;area&gt; element's rel content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/relList)
     */
    open val relList: DOMTokenList

    /**
     * The HTMLAreaElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the &lt;area&gt; element
     * defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/referrerPolicy)
     */
    open var referrerPolicy: String
    open var noHref: Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTableElement interface provides special properties and methods (beyond the regular HTMLElement object
 * interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an
 * HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement)
 */
public abstract external class HTMLTableElement : HTMLElement {
    /**
     * The caption property of the HTMLTableElement interface represents the first &lt;caption&gt; element child of the
     * given &lt;table&gt;, or null if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/caption)
     */
    open var caption: HTMLTableCaptionElement?

    /**
     * The createCaption() method of the HTMLTableElement interface creates a &lt;caption&gt; element, inserts it as the
     * first child of the given &lt;table&gt;, and returns it. If the table already has a &lt;caption&gt; element child,
     * this method returns the first such child without creating one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createCaption)
     */
    open fun createCaption(): HTMLTableCaptionElement

    /**
     * The deleteCaption() method of the HTMLTableElement interface removes the first &lt;caption&gt; element child from
     * a given &lt;table&gt;, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteCaption)
     */
    open fun deleteCaption()

    /**
     * The tHead property of the HTMLTableElement interface represents the first &lt;thead&gt; element child of the
     * given &lt;table&gt;, or null if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tHead)
     */
    open var tHead: HTMLTableSectionElement?

    /**
     * The createTHead() method of the HTMLTableElement interface creates a &lt;thead&gt; element, inserts it before the
     * first element child of the given &lt;table&gt; that's neither a &lt;caption&gt; nor a &lt;colgroup&gt;, or as the
     * last child if no such insertion location is found, and returns it. If the table already has a &lt;thead&gt;
     * element child, this method returns the first such child without creating one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTHead)
     */
    open fun createTHead(): HTMLTableSectionElement

    /**
     * The deleteTHead() method of the HTMLTableElement interface removes the first &lt;thead&gt; element child from a
     * given &lt;table&gt;, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTHead)
     */
    open fun deleteTHead()

    /**
     * The tFoot property of the HTMLTableElement interface represents the first &lt;tfoot&gt; element child of the
     * given &lt;table&gt;, or null if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tFoot)
     */
    open var tFoot: HTMLTableSectionElement?

    /**
     * The createTFoot() method of the HTMLTableElement interface creates a &lt;tfoot&gt; element, inserts it as the
     * last child of the given &lt;table&gt;, and returns it. If the table already has a &lt;tfoot&gt; element child,
     * this method returns the first such child without creating one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTFoot)
     */
    open fun createTFoot(): HTMLTableSectionElement

    /**
     * The deleteTFoot() method of the HTMLTableElement interface removes the first &lt;tfoot&gt; element child from a
     * given &lt;table&gt;, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteTFoot)
     */
    open fun deleteTFoot()

    /**
     * The tBodies read-only property of the HTMLTableElement interface returns a live HTMLCollection of all
     * &lt;tbody&gt; element children of the given &lt;table&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/tBodies)
     */
    open val tBodies: HTMLCollection

    /**
     * The createTBody() method of the HTMLTableElement interface creates a &lt;tbody&gt; element, inserts it
     * immediately after the last &lt;tbody&gt; element child of the given &lt;table&gt;, or as the last child if there
     * is no such element, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/createTBody)
     */
    open fun createTBody(): HTMLTableSectionElement

    /**
     * The rows read-only property of the HTMLTableElement interface returns a live HTMLCollection of all &lt;tr&gt;
     * elements that are a child of the given &lt;table&gt; element, or a child of one of the table's &lt;thead&gt;,
     * &lt;tbody&gt;, and &lt;tfoot&gt; children. The members of the &lt;thead&gt; appear first, followed by members of
     * the &lt;tbody&gt; and the table itself, and members of the &lt;tfoot&gt; come last, sorted by tree order within
     * each group.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rows)
     */
    open val rows: HTMLCollection

    /**
     * The insertRow() method of the HTMLTableElement interface creates a &lt;tr&gt; element, inserts it at the
     * specified position in the rows collection, and returns it. If the rows collection is empty and the table also has
     * no &lt;tbody&gt; elements, a &lt;tbody&gt; element is first created and inserted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/insertRow)
     */
    open fun insertRow(index: Int = definedExternally): HTMLTableRowElement

    /**
     * The deleteRow() method of the HTMLTableElement interface removes a specific row (&lt;tr&gt;) from a given
     * &lt;table&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/deleteRow)
     */
    open fun deleteRow(index: Int)

    /**
     * The HTMLTableElement.align property represents the alignment of the table.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/align)
     */
    open var align: String

    /**
     * The HTMLTableElement.border property represents the border width of the &lt;table&gt; element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/border)
     */
    open var border: String

    /**
     * The HTMLTableElement interface's frame property is a string that indicates which of the table's exterior borders
     * should be drawn.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/frame)
     */
    open var frame: String

    /**
     * The HTMLTableElement.rules property indicates which cell borders to render in the table.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/rules)
     */
    open var rules: String

    /**
     * The HTMLTableElement.summary property represents the table description.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/summary)
     */
    open var summary: String

    /**
     * The HTMLTableElement.width property represents the desired width of the table.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/width)
     */
    open var width: String

    /**
     * The bgcolor property of the HTMLTableElement represents the background color of the table.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/bgColor)
     */
    open var bgColor: String

    /**
     * The HTMLTableElement.cellPadding property represents the padding around the individual cells of the table.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/cellPadding)
     */
    open var cellPadding: String

    /**
     * While you should instead use the CSS border-spacing property, the obsolete HTMLTableElement interface's
     * cellSpacing property represents the spacing around the individual &lt;th&gt; and &lt;td&gt; elements representing
     * a table's cells. Any two cells are separated by the sum of the cellSpacing of each of the two cells.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableElement/cellSpacing)
     */
    open var cellSpacing: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTableCaptionElement interface provides special properties (beyond the regular HTMLElement interface it also
 * has available to it by inheritance) for manipulating table &lt;caption&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCaptionElement)
 */
public abstract external class HTMLTableCaptionElement : HTMLElement {
    /**
     * The align property of the HTMLTableCaptionElement interface is a string indicating how to horizontally align text
     * in the &lt;caption&gt; table element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCaptionElement/align)
     */
    open var align: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTableColElement interface provides properties for manipulating single or grouped table column elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableColElement)
 */
public abstract external class HTMLTableColElement : HTMLElement {
    /**
     * The span property of the HTMLTableColElement interface represents the number of columns this &lt;col&gt; or
     * &lt;colgroup&gt; must span; this lets the column occupy space across multiple columns of the table. It reflects
     * the span attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableColElement/span)
     */
    open var span: Int

    /**
     * The align property of the HTMLTableColElement interface is a string indicating how to horizontally align text in
     * a table &lt;col&gt; column element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableColElement/align)
     */
    open var align: String

    /**
     * The ch property of the HTMLTableColElement interface does nothing. It reflects the char attribute of the
     * &lt;col&gt; element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableColElement/ch)
     */
    open var ch: String

    /**
     * The chOff property of the HTMLTableColElement interface does nothing. It reflects the charoff attribute of the
     * &lt;col&gt; element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableColElement/chOff)
     */
    open var chOff: String

    /**
     * The vAlign property of the HTMLTableColElement interface is a string indicating how to vertically align text in a
     * table &lt;col&gt; column element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableColElement/vAlign)
     */
    open var vAlign: String
    open var width: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTableSectionElement interface provides special properties and methods (beyond the HTMLElement interface it
 * also has available to it by inheritance) for manipulating the layout and presentation of sections, that is headers,
 * footers and bodies (&lt;thead&gt;, &lt;tfoot&gt;, and &lt;tbody&gt;, respectively) in an HTML table.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement)
 */
public abstract external class HTMLTableSectionElement : HTMLElement {
    /**
     * The rows read-only property of the HTMLTableSectionElement interface returns a live HTMLCollection containing the
     * rows in the section. The HTMLCollection is live and is automatically updated when rows are added or removed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/rows)
     */
    open val rows: HTMLCollection

    /**
     * The insertRow() method of the HTMLTableSectionElement interface creates a &lt;tr&gt; element, inserts it at the
     * specified position in the given table sectioning element (&lt;thead&gt;, &lt;tfoot&gt;, or &lt;tbody&gt;), and
     * returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/insertRow)
     */
    open fun insertRow(index: Int = definedExternally): HTMLTableRowElement

    /**
     * The deleteRow() method of the HTMLTableSectionElement interface removes a specific row (&lt;tr&gt;) from the
     * given table sectioning element (&lt;thead&gt;, &lt;tfoot&gt;, or &lt;tbody&gt;).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/deleteRow)
     */
    open fun deleteRow(index: Int)

    /**
     * The align property of the HTMLTableSectionElement interface is a string indicating how to horizontally align text
     * in a &lt;thead&gt;, &lt;tbody&gt; or &lt;tfoot&gt; table section. Individual rows and cells can override it.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/align)
     */
    open var align: String

    /**
     * The ch property of the HTMLTableSectionElement interface does nothing. It reflects the char attribute of the
     * section element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/ch)
     */
    open var ch: String

    /**
     * The chOff property of the HTMLTableSectionElement interface does nothing. It reflects the charoff attribute of
     * the section element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/chOff)
     */
    open var chOff: String

    /**
     * The vAlign property of the HTMLTableSectionElement interface is a string indicating how to vertically align text
     * in a &lt;thead&gt;, &lt;tbody&gt; or &lt;tfoot&gt; table section. Individual rows and cells can override it.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableSectionElement/vAlign)
     */
    open var vAlign: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTableRowElement interface provides special properties and methods (beyond the HTMLElement interface it also
 * has available to it by inheritance) for manipulating the layout and presentation of rows in an HTML table.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement)
 */
public abstract external class HTMLTableRowElement : HTMLElement {
    /**
     * The rowIndex read-only property of the HTMLTableRowElement interface represents the position of a row within the
     * whole &lt;table&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/rowIndex)
     */
    open val rowIndex: Int

    /**
     * The sectionRowIndex read-only property of the HTMLTableRowElement interface represents the position of a row
     * within the current section (&lt;thead&gt;, &lt;tbody&gt;, or &lt;tfoot&gt;).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/sectionRowIndex)
     */
    open val sectionRowIndex: Int

    /**
     * The cells read-only property of the HTMLTableRowElement interface returns a live HTMLCollection containing the
     * cells in the row. The HTMLCollection is live and is automatically updated when cells are added or removed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/cells)
     */
    open val cells: HTMLCollection

    /**
     * The insertCell() method of the HTMLTableRowElement interface creates a &lt;td&gt; element, inserts it at the
     * specified position in the given &lt;tr&gt; element, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/insertCell)
     */
    open fun insertCell(index: Int = definedExternally): HTMLTableCellElement

    /**
     * The deleteCell() method of the HTMLTableRowElement interface removes a specific row cell from a given &lt;tr&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/deleteCell)
     */
    open fun deleteCell(index: Int)

    /**
     * The align property of the HTMLTableRowElement interface is a string indicating how to horizontally align text in
     * the &lt;tr&gt; table row. Individual cells can override it.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/align)
     */
    open var align: String

    /**
     * The ch property of the HTMLTableRowElement interface does nothing. It reflects the char attribute of the
     * &lt;tr&gt; element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/ch)
     */
    open var ch: String

    /**
     * The chOff property of the HTMLTableRowElement interface does nothing. It reflects the charoff attribute of the
     * &lt;tr&gt; element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/chOff)
     */
    open var chOff: String

    /**
     * The vAlign property of the HTMLTableRowElement interface is a string indicating how to vertically align text in a
     * &lt;tr&gt; table row. Individual cells can override it.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/vAlign)
     */
    open var vAlign: String

    /**
     * The HTMLTableRowElement.bgColor property is used to set the background color of a row or retrieve the value of
     * the obsolete bgColor attribute, if present.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableRowElement/bgColor)
     */
    open var bgColor: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTableCellElement interface provides special properties and methods (beyond the regular HTMLElement interface
 * it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either
 * header cells (&lt;th&gt;) or data cells (&lt;td&gt;), in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement)
 */
public abstract external class HTMLTableCellElement : HTMLElement {
    /**
     * The colSpan property of the HTMLTableCellElement interface represents the number of columns this cell must span;
     * this lets the cell occupy space across multiple columns of the table. It reflects the colspan attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/colSpan)
     */
    open var colSpan: Int

    /**
     * The rowSpan property of the HTMLTableCellElement interface represents the number of rows this cell must span;
     * this lets the cell occupy space across multiple rows of the table. It reflects the rowspan attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/rowSpan)
     */
    open var rowSpan: Int

    /**
     * The headers property of the HTMLTableCellElement interface contains a list of IDs of &lt;th&gt; elements that are
     * headers for this specific cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/headers)
     */
    open var headers: String

    /**
     * The cellIndex read-only property of the HTMLTableCellElement interface represents the position of a cell within
     * its row (&lt;tr&gt;). The first cell has an index of 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/cellIndex)
     */
    open val cellIndex: Int

    /**
     * The scope property of the HTMLTableCellElement interface indicates the scope of a &lt;th&gt; cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/scope)
     */
    open var scope: String

    /**
     * The abbr property of the HTMLTableCellElement interface indicates an abbreviation associated with the cell. If
     * the cell does not represent a header cell &lt;th&gt;, it is ignored.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/abbr)
     */
    open var abbr: String

    /**
     * The align property of the HTMLTableCellElement interface is a string indicating how to horizontally align text in
     * the &lt;th&gt; or &lt;td&gt; table cell.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/align)
     */
    open var align: String
    open var axis: String
    open var height: String
    open var width: String

    /**
     * The ch property of the HTMLTableCellElement interface does nothing. It reflects the char attribute of the cell
     * element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/ch)
     */
    open var ch: String

    /**
     * The chOff property of the HTMLTableCellElement interface does nothing. It reflects the charoff attribute of the
     * cell element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/chOff)
     */
    open var chOff: String

    /**
     * The noWrap property of the HTMLTableCellElement interface returns a Boolean value indicating if the text of the
     * cell may be wrapped on several lines or not.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/noWrap)
     */
    open var noWrap: Boolean

    /**
     * The vAlign property of the HTMLTableCellElement interface is a string indicating how to vertically align text in
     * a &lt;th&gt; or &lt;td&gt; table cell.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/vAlign)
     */
    open var vAlign: String

    /**
     * The HTMLTableCellElement.bgColor property is used to set the background color of a cell or get the value of the
     * obsolete bgColor attribute, if present.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/bgColor)
     */
    open var bgColor: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLFormElement interface represents a &lt;form&gt; element in the DOM. It allows access to—and, in some cases,
 * modification of—aspects of the form, as well as access to its component elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement)
 */
public abstract external class HTMLFormElement : HTMLElement {
    /**
     * The HTMLFormElement.acceptCharset property represents the character encoding for the given &lt;form&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/acceptCharset)
     */
    open var acceptCharset: String

    /**
     * The HTMLFormElement.action property represents the action of the &lt;form&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/action)
     */
    open var action: String

    /**
     * The autocomplete property of the HTMLFormElement interface indicates whether the value of the form's controls can
     * be automatically completed by the browser. It reflects the &lt;form&gt; element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/autocomplete)
     */
    open var autocomplete: String

    /**
     * The HTMLFormElement.enctype property is the MIME type of content that is used to submit the form to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/enctype)
     */
    open var enctype: String

    /**
     * The HTMLFormElement.encoding property is an alternative name for the enctype element on the DOM HTMLFormElement
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/encoding)
     */
    open var encoding: String

    /**
     * The HTMLFormElement.method property represents the HTTP method used to submit the &lt;form&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/method)
     */
    open var method: String

    /**
     * The HTMLFormElement.name property represents the name of the current &lt;form&gt; element as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/name)
     */
    open var name: String

    /**
     * The noValidate property of the HTMLFormElement interface is a boolean value indicating if the &lt;form&gt; will
     * bypass constraint validation when submitted. It reflects the &lt;form&gt; element's novalidate attribute; if the
     * attribute present, the value is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/noValidate)
     */
    open var noValidate: Boolean

    /**
     * The target property of the HTMLFormElement interface represents the target of the form's action (i.e., the frame
     * in which to render its output).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/target)
     */
    open var target: String

    /**
     * The rel property of the HTMLFormElement interface reflects the rel attribute. It is a string containing what
     * kinds of links the HTML &lt;form&gt; element creates, as a space-separated list of enumerated values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/rel)
     */
    open var rel: String

    /**
     * The read-only relList property of the HTMLFormElement returns a live DOMTokenList object containing the set of
     * link types indicating the relationship between the resource represented by the &lt;form&gt; element and the
     * current document. It reflects the &lt;form&gt; element's rel content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/relList)
     */
    open val relList: DOMTokenList

    /**
     * The elements read-only property of the HTMLFormElement interface returns an HTMLFormControlsCollection listing
     * all the listed form controls associated with the &lt;form&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/elements)
     */
    open val elements: HTMLFormControlsCollection

    /**
     * The HTMLFormElement.length read-only property returns the number of controls in the &lt;form&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/length)
     */
    open val length: Int

    /**
     * The HTMLFormElement.submit() method submits a given &lt;form&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit)
     */
    open fun submit()

    /**
     * The HTMLFormElement method requestSubmit() requests that the form be submitted using a specific submit button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/requestSubmit)
     */
    open fun requestSubmit(submitter: HTMLElement? = definedExternally)

    /**
     * The HTMLFormElement.reset() method restores a form element's default values. This method does the same thing as
     * clicking the form's &lt;input type="reset"&gt; control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset)
     */
    open fun reset()

    /**
     * The checkValidity() method of the HTMLFormElement interface returns a boolean value which indicates if all
     * associated controls meet any constraint validation rules applied to them. The method also fires an invalid event
     * on each invalid element, but not on the form element itself. Because there's no default browser behavior for
     * checkValidity(), canceling this invalid event has no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLFormElement interface performs the same validity checking steps as the
     * checkValidity() method. In addition, for each invalid event that was fired and not canceled, the browser displays
     * the problem to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public operator fun HTMLFormElement.get(index: Int): Element? = getProperty(this, index)

public operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? = getProperty(this, name)

/**
 * The HTMLLabelElement interface gives access to properties specific to &lt;label&gt; elements. It inherits methods and
 * properties from the base HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement)
 */
public abstract external class HTMLLabelElement : HTMLElement {
    /**
     * The form read-only property of the HTMLLabelElement interface returns an HTMLFormElement object that owns the
     * control associated with this &lt;label&gt;, or null if this label is not associated with a labelable
     * form-associated element (&lt;button&gt;, &lt;input&gt;, &lt;output&gt;, &lt;select&gt;, &lt;textarea&gt;, or
     * form-associated custom elements) that is owned by a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The htmlFor property of the HTMLLabelElement interface is the ID of the associated label's control element. It
     * reflects the value of, and is used to set and get the for content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/htmlFor)
     */
    open var htmlFor: String

    /**
     * The read-only HTMLLabelElement.control property returns a reference to the control (in the form of an object of
     * type HTMLElement or one of its derivatives) with which the &lt;label&gt; element is associated, or null if the
     * label isn't associated with a control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLabelElement/control)
     */
    open val control: HTMLElement?

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLInputElement interface provides special properties and methods for manipulating the options, layout, and
 * presentation of &lt;input&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement)
 */
public abstract external class HTMLInputElement : HTMLElement, PopoverTargetAttributes {
    /**
     * The accept property of the HTMLInputElement interface reflects the &lt;input&gt; element's accept attribute,
     * generally a comma-separated list of unique file type specifiers providing a hint for the expected file type for
     * an &lt;input&gt; of type file. If the attribute is not explicitly set, the accept property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/accept)
     */
    open var accept: String

    /**
     * The alpha property of the HTMLInputElement interface reflects the &lt;input&gt; element's alpha attribute, which
     * indicates whether the CSS color's alpha component can be manipulated by the end user and does not have to be
     * fully opaque. It is only relevant to color controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/alpha)
     */
    open var alpha: Boolean

    /**
     * The alt property of the HTMLInputElement interface defines the textual label for the button for users and user
     * agents who cannot use the image. It reflects the &lt;input&gt; element's alt attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/alt)
     */
    open var alt: String

    /**
     * The autocomplete property of the HTMLInputElement interface indicates whether the value of the control can be
     * automatically completed by the browser. It reflects the &lt;input&gt; element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/autocomplete)
     */
    open var autocomplete: String

    /**
     * The defaultChecked property of the HTMLInputElement interface specifies the default checkedness state of the
     * element. This property reflects the &lt;input&gt; element's checked attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/defaultChecked)
     */
    open var defaultChecked: Boolean

    /**
     * The checked property of the HTMLInputElement interface specifies the current checkedness of the element; that is,
     * whether the form control is checked or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/checked)
     */
    open var checked: Boolean

    /**
     * The colorSpace property of the HTMLInputElement interface reflects the &lt;input&gt; element's colorspace
     * attribute, which indicates whether the color space of the serialized CSS color is sRGB (the default) or
     * display-p3. It is only relevant to color controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/colorSpace)
     */
    open var colorSpace: String

    /**
     * The dirName property of the HTMLInputElement interface is the directionality of the element and enables the
     * submission of that value. It reflects the value of the &lt;input&gt; element's dirName attribute. This property
     * can be retrieved or set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/dirName)
     */
    open var dirName: String

    /**
     * The HTMLInputElement.disabled property is a boolean value that reflects the disabled HTML attribute, which
     * indicates whether the control is disabled. If it is disabled, it does not accept clicks. A disabled element is
     * unusable and un-clickable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The form read-only property of the HTMLInputElement interface returns an HTMLFormElement object that owns this
     * &lt;input&gt;, or null if this input is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The HTMLInputElement.files property allows you to access the FileList selected with the &lt;input type="file"&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/files)
     */
    open var files: FileList?

    /**
     * The formAction property of the HTMLInputElement interface is the URL of the program that is executed on the
     * server when the form that owns this control is submitted. It reflects the value of the &lt;input&gt;'s formaction
     * attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formAction)
     */
    open var formAction: String

    /**
     * The formEnctype property of the HTMLInputElement interface is the MIME type of the content sent to the server
     * when the &lt;input&gt; with the formEnctype is the method of form submission. It reflects the value of the
     * &lt;input&gt;'s formenctype attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formEnctype)
     */
    open var formEnctype: String

    /**
     * The formMethod property of the HTMLInputElement interface is the HTTP method used to submit the &lt;form&gt; if
     * the &lt;input&gt; element is the control that submits the form. It reflects the value of the &lt;input&gt;'s
     * formmethod attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formMethod)
     */
    open var formMethod: String

    /**
     * The formNoValidate property of the HTMLInputElement interface is a boolean value indicating if the &lt;form&gt;
     * will bypass constraint validation when submitted via the &lt;input&gt;. It reflects the &lt;input&gt; element's
     * formnovalidate attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formNoValidate)
     */
    open var formNoValidate: Boolean

    /**
     * The formTarget property of the HTMLInputElement interface is the tab, window, or iframe where the response of the
     * submitted &lt;form&gt; is to be displayed. It reflects the value of the &lt;input&gt; element's formtarget
     * attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/formTarget)
     */
    open var formTarget: String

    /**
     * The height property of the HTMLInputElement interface specifies the height of a control. It reflects the
     * &lt;input&gt; element's height attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/height)
     */
    open var height: Int

    /**
     * The indeterminate property of the HTMLInputElement interface returns a boolean value that indicates whether the
     * checkbox is in the indeterminate state. For example, a "select all/deselect all" checkbox may be in the
     * indeterminate state when some but not all of its sub-controls are checked. The indeterminate state can only be
     * set via JavaScript and is only relevant to checkbox controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/indeterminate)
     */
    open var indeterminate: Boolean

    /**
     * The list read-only property of the HTMLInputElement interface returns the HTMLDataListElement pointed to by the
     * list attribute of the element, or null if the list attribute is not defined or the list attribute's value is not
     * associated with any &lt;datalist&gt; in the same tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/list)
     */
    open val list: HTMLDataListElement?

    /**
     * The max property of the HTMLInputElement interface reflects the &lt;input&gt; element's max attribute, which
     * generally defines the maximum valid value for a numeric or date-time input. If the attribute is not explicitly
     * set, the max property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/max)
     */
    open var max: String

    /**
     * The maxLength property of the HTMLInputElement interface indicates the maximum number of characters (in UTF-16
     * code units) allowed to be entered for the value of the &lt;input&gt; element, and the maximum number of
     * characters allowed for the value to be valid. It reflects the element's maxlength attribute. -1 means there is no
     * limit on the length of the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/maxLength)
     */
    open var maxLength: Int

    /**
     * The min property of the HTMLInputElement interface reflects the &lt;input&gt; element's min attribute, which
     * generally defines the minimum valid value for a numeric or date-time input. If the attribute is not explicitly
     * set, the min property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/min)
     */
    open var min: String

    /**
     * The minLength property of the HTMLInputElement interface indicates the minimum number of characters (in UTF-16
     * code units) required for the value of the &lt;input&gt; element to be valid. It reflects the element's minlength
     * attribute. -1 means there is no minimum length requirement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/minLength)
     */
    open var minLength: Int

    /**
     * The HTMLInputElement.multiple property indicates if an input can have more than one value. Firefox currently only
     * supports multiple for &lt;input type="file"&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/multiple)
     */
    open var multiple: Boolean

    /**
     * The name property of the HTMLInputElement interface indicates the name of the &lt;input&gt; element. It reflects
     * the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/name)
     */
    open var name: String

    /**
     * The pattern property of the HTMLInputElement interface represents a regular expression a non-null &lt;input&gt;
     * value should match. It reflects the &lt;input&gt; element's pattern attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/pattern)
     */
    open var pattern: String

    /**
     * The placeholder property of the HTMLInputElement interface represents a hint to the user of what can be entered
     * in the control. It reflects the &lt;input&gt; element's placeholder attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/placeholder)
     */
    open var placeholder: String

    /**
     * The readOnly property of the HTMLInputElement interface indicates that the user cannot modify the value of the
     * &lt;input&gt;. It reflects the &lt;input&gt; element's readonly boolean attribute; returning true if the
     * attribute is present and false when omitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/readOnly)
     */
    open var readOnly: Boolean

    /**
     * The required property of the HTMLInputElement interface specifies that the user must fill in a value before
     * submitting a form. It reflects the &lt;input&gt; element's required attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/required)
     */
    open var required: Boolean

    /**
     * The size property of the HTMLInputElement interface defines the number of visible characters displayed. It
     * reflects the &lt;input&gt; element's size attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/size)
     */
    open var size: Int

    /**
     * The src property of the HTMLInputElement interface specifies the source of an image to display as the graphical
     * submit button. It reflects the &lt;input&gt; element's src attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/src)
     */
    open var src: String

    /**
     * The step property of the HTMLInputElement interface indicates the step by which numeric or date-time
     * &lt;input&gt; elements can change. It reflects the element's step attribute. Valid values include the string
     * "any" or a string containing a positive floating point number. If the attribute is not explicitly set, the step
     * property is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/step)
     */
    open var step: String

    /**
     * The type property of the HTMLInputElement interface indicates the kind of data allowed in the &lt;input&gt;
     * element, for example a number, a date, or an email. Browsers will select the appropriate widget and behavior to
     * help users to enter a valid value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/type)
     */
    open var type: String

    /**
     * The defaultValue property of the HTMLInputElement interface indicates the original (or default) value of the
     * &lt;input&gt; element. It reflects the element's value attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/defaultValue)
     */
    open var defaultValue: String

    /**
     * The value property of the HTMLInputElement interface represents the current value of the &lt;input&gt; element as
     * a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/value)
     */
    open var value: String

    /**
     * The valueAsDate property of the HTMLInputElement interface represents the current value of the &lt;input&gt;
     * element as a Date, or null if conversion is not possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/valueAsDate)
     */
    open var valueAsDate: JsAny?

    /**
     * The valueAsNumber property of the HTMLInputElement interface represents the current value of the &lt;input&gt;
     * element as a number or NaN if converting to a numeric value is not possible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/valueAsNumber)
     */
    open var valueAsNumber: Double

    /**
     * The width property of the HTMLInputElement interface specifies the width of a control. It reflects the
     * &lt;input&gt; element's width attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/width)
     */
    open var width: Int

    /**
     * The HTMLInputElement.stepUp() method increments the value of a numeric type of &lt;input&gt; element by the value
     * of the step attribute, or the default step value if the step attribute is not explicitly set. The method, when
     * invoked, increments the value by (step * n), where n defaults to 1 if not specified, and step defaults to the
     * default value for step if not specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/stepUp)
     */
    open fun stepUp(n: Int = definedExternally)

    /**
     * The HTMLInputElement.stepDown() method decrements the value of a numeric type of &lt;input&gt; element by the
     * value of the step attribute or up to n multiples of the step attribute if a number is passed as the parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/stepDown)
     */
    open fun stepDown(n: Int = definedExternally)

    /**
     * The willValidate read-only property of the HTMLInputElement interface indicates whether the &lt;input&gt; element
     * is a candidate for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLInputElement interface returns a ValidityState object that represents
     * the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLInputElement interface returns a string representing a
     * localized message that describes the validation constraints that the &lt;input&gt; control does not satisfy (if
     * any).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLInputElement interface returns a boolean value which indicates if the
     * element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on
     * the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no
     * effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLInputElement interface performs the same validity checking steps as the
     * checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to
     * the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The HTMLInputElement.setCustomValidity() method sets a custom validity message for the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)

    /**
     * The HTMLInputElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated with
     * the &lt;input&gt; element. If the element has the type hidden, the property returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/labels)
     */
    open val labels: NodeList?

    /**
     * The select() method of the HTMLInputElement interface selects all the text in an &lt;input&gt; element that
     * includes a text field.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/select)
     */
    open fun select()

    /**
     * The selectionStart property of the HTMLInputElement interface specifies the start position of the current text
     * selection in an &lt;input&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionStart)
     */
    open var selectionStart: Int?

    /**
     * The selectionEnd property of the HTMLInputElement interface specifies the end position of the current text
     * selection in an &lt;input&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionEnd)
     */
    open var selectionEnd: Int?

    /**
     * The selectionDirection property of the HTMLInputElement interface is a string that indicates the direction in
     * which the user is selecting the text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/selectionDirection)
     */
    open var selectionDirection: String?

    /**
     * The HTMLInputElement.setRangeText() method replaces a range of text in an &lt;input&gt; or &lt;textarea&gt;
     * element with a new string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setRangeText)
     */
    open fun setRangeText(replacement: String)

    /**
     * The HTMLInputElement.setRangeText() method replaces a range of text in an &lt;input&gt; or &lt;textarea&gt;
     * element with a new string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setRangeText)
     */
    open fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode = definedExternally)

    /**
     * The setSelectionRange() method of the HTMLInputElement interface sets the start and end positions of the current
     * text selection in an &lt;input&gt; element. This updates the selection state immediately, though the visual
     * highlight only appears when the element is focused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/setSelectionRange)
     */
    open fun setSelectionRange(start: Int, end: Int, direction: String = definedExternally)

    /**
     * The HTMLInputElement.showPicker() method displays the browser picker for an input element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/showPicker)
     */
    open fun showPicker()
    open var align: String
    open var useMap: String
    open var hspace: Int
    open var vspace: Int

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLButtonElement interface provides properties and methods (beyond the regular HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;button&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement)
 */
public abstract external class HTMLButtonElement : HTMLElement, PopoverTargetAttributes {
    /**
     * The command property of the HTMLButtonElement interface gets and sets the action to be performed on an element
     * being controlled by this button. For this to have an effect, commandfor must be set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/command)
     */
    open var command: String

    /**
     * The commandForElement property of the HTMLButtonElement interface gets and sets the element to control via a
     * button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/commandForElement)
     */
    open var commandForElement: Element?

    /**
     * The HTMLButtonElement.disabled property indicates whether the control is disabled, meaning that it does not
     * accept any clicks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The form read-only property of the HTMLButtonElement interface returns an HTMLFormElement object that owns this
     * &lt;button&gt;, or null if this button is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The formAction property of the HTMLButtonElement interface is the URL of the program that is executed on the
     * server when the form that owns this control is submitted. It reflects the value of the &lt;button&gt;'s
     * formaction attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formAction)
     */
    open var formAction: String

    /**
     * The formEnctype property of the HTMLButtonElement interface is the MIME type of the content sent to the server
     * when the form is submitted. It reflects the value of the &lt;button&gt;'s formenctype attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formEnctype)
     */
    open var formEnctype: String

    /**
     * The formMethod property of the HTMLButtonElement interface is the HTTP method used to submit the &lt;form&gt; if
     * the &lt;button&gt; element is the control that submits the form. It reflects the value of the &lt;button&gt;'s
     * formmethod attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formMethod)
     */
    open var formMethod: String

    /**
     * The formNoValidate property of the HTMLButtonElement interface is a boolean value indicating if the &lt;form&gt;
     * will bypass constraint validation when submitted via the &lt;button&gt;. It reflects the &lt;button&gt; element's
     * formnovalidate attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formNoValidate)
     */
    open var formNoValidate: Boolean

    /**
     * The formTarget property of the HTMLButtonElement interface is the tab, window, or iframe where the response of
     * the submitted &lt;form&gt; is to be displayed. It reflects the value of the &lt;button&gt; element's formtarget
     * attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/formTarget)
     */
    open var formTarget: String

    /**
     * The name property of the HTMLButtonElement interface indicates the name of the &lt;button&gt; element or the
     * empty string if the element has no name. It reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/name)
     */
    open var name: String

    /**
     * The type property of the HTMLButtonElement interface is a string that indicates the behavior type of the
     * &lt;button&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/type)
     */
    open var type: String

    /**
     * The value property of the HTMLButtonElement interface represents the value of the &lt;button&gt; element as a
     * string, or the empty string if no value is set. It reflects the element's value attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/value)
     */
    open var value: String

    /**
     * The willValidate read-only property of the HTMLButtonElement interface indicates whether the &lt;button&gt;
     * element is a candidate for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLButtonElement interface returns a ValidityState object that represents
     * the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLButtonElement interface returns a string representing a
     * localized message that describes the validation constraints that the &lt;button&gt; control does not satisfy (if
     * any). This is the empty string if the control is not a candidate for constraint validation (the &lt;button&gt;'s
     * type is button or reset), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLButtonElement interface returns a boolean value which indicates if the
     * element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on
     * the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no
     * effect. It always returns true if the &lt;button&gt; element is not a candidate for constraint validation (its
     * willValidate is false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLButtonElement interface performs the same validity checking steps as the
     * checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to
     * the user. It always returns true if the &lt;button&gt; element is not a candidate for constraint validation (its
     * willValidate is false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The setCustomValidity() method of the HTMLButtonElement interface sets the custom validity message for the
     * &lt;button&gt; element. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)

    /**
     * The HTMLButtonElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated with
     * the &lt;button&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/labels)
     */
    open val labels: NodeList

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLSelectElement interface represents a &lt;select&gt; HTML Element. These elements also share all of the
 * properties and methods of other HTML elements via the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement)
 */
public abstract external class HTMLSelectElement : HTMLElement, ItemArrayLike<HTMLOptionElement> {
    /**
     * The autocomplete property of the HTMLSelectElement interface indicates whether the value of the control can be
     * automatically completed by the browser. It reflects the &lt;select&gt; element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/autocomplete)
     */
    open var autocomplete: String

    /**
     * The HTMLSelectElement.disabled property is a boolean value that reflects the disabled HTML attribute, which
     * indicates whether the control is disabled. If it is disabled, it does not accept clicks. A disabled element is
     * unusable and un-clickable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The form read-only property of the HTMLSelectElement interface returns an HTMLFormElement object that owns this
     * &lt;select&gt;, or null if this select is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The multiple property of the HTMLSelectElement interface specifies that the user may select more than one option
     * from the list of options. It reflects the &lt;select&gt; element's multiple attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/multiple)
     */
    open var multiple: Boolean

    /**
     * The name property of the HTMLSelectElement interface indicates the name of the &lt;select&gt; element. It
     * reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/name)
     */
    open var name: String

    /**
     * The required property of the HTMLSelectElement interface specifies that the user must select an option with a
     * non-empty string value before submitting a form. It reflects the &lt;select&gt; element's required attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/required)
     */
    open var required: Boolean

    /**
     * The size property of the HTMLSelectElement interface specifies the number of options, or rows, that should be
     * visible at one time. It reflects the &lt;select&gt; element's size attribute. If omitted, the value is 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/size)
     */
    open var size: Int

    /**
     * The HTMLSelectElement.type read-only property returns the form control's type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/type)
     */
    open val type: String

    /**
     * The HTMLSelectElement.options read-only property returns a HTMLOptionsCollection of the &lt;option&gt; elements
     * contained by the &lt;select&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/options)
     */
    open val options: HTMLOptionsCollection

    /**
     * The length property of the HTMLSelectElement interface specifies the number of &lt;option&gt; elements in the
     * &lt;select&gt; element. It represents the number of nodes in the options collection. On setting, it acts as
     * (HTMLOptionsCollection.length).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/length)
     */
    override var length: Int

    /**
     * The HTMLSelectElement.item() method returns the Element corresponding to the HTMLOptionElement whose position in
     * the options list corresponds to the index given in the parameter, or null if there are none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/item)
     */
    override fun item(index: Int): HTMLOptionElement?

    /**
     * The HTMLSelectElement.namedItem() method returns the HTMLOptionElement corresponding to the HTMLOptionElement
     * whose name or id match the specified name, or null if no option matches.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/namedItem)
     */
    open fun namedItem(name: String): HTMLOptionElement?

    /**
     * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/add)
     */
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: HTMLElement?)

    /**
     * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/add)
     */
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Int?)

    /**
     * The HTMLSelectElement.add() method adds an element to the collection of option elements for this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/add)
     */
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)

    /**
     * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for
     * this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/remove)
     */
    override fun remove()

    /**
     * The HTMLSelectElement.remove() method removes the element at the specified index from the options collection for
     * this select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/remove)
     */
    open fun remove(index: Int)

    /**
     * The read-only HTMLSelectElement property selectedOptions contains a list of the &lt;option&gt; elements contained
     * within the &lt;select&gt; element that are currently selected. The list of selected options is an HTMLCollection
     * object with one entry per currently selected option.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedOptions)
     */
    open val selectedOptions: HTMLCollection

    /**
     * The selectedIndex property of the HTMLSelectElement interface is the numeric index of the first selected
     * &lt;option&gt; element in a &lt;select&gt; element, if any, or −1 if no &lt;option&gt; is selected. Setting this
     * property selects the option at that index and deselects all other options, while setting it to -1 deselects any
     * currently selected options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/selectedIndex)
     */
    open var selectedIndex: Int

    /**
     * The HTMLSelectElement.value property contains the value of the first selected &lt;option&gt; element associated
     * with this &lt;select&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/value)
     */
    open var value: String

    /**
     * The willValidate read-only property of the HTMLSelectElement interface indicates whether the &lt;select&gt;
     * element is a candidate for constraint validation. It is false if any conditions bar it from constraint
     * validation, such as when its disabled property is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLSelectElement interface returns a ValidityState object that represents
     * the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLSelectElement interface returns a string representing a
     * localized message that describes the validation constraints that the &lt;select&gt; control does not satisfy (if
     * any). This is the empty string if the control is not a candidate for constraint validation
     * (HTMLSelectElement.willValidate is false), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLSelectElement interface returns a boolean value which indicates if the
     * element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on
     * the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no
     * effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLSelectElement interface performs the same validity checking steps as the
     * checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to
     * the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The HTMLSelectElement.setCustomValidity() method sets the custom validity message for the selection element to
     * the specified message. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)

    /**
     * The HTMLSelectElement.showPicker() method displays the browser picker for a select element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/showPicker)
     */
    open fun showPicker()

    /**
     * The HTMLSelectElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated with
     * the &lt;select&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectElement/labels)
     */
    open val labels: NodeList

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public operator fun HTMLSelectElement.get(index: Int): HTMLOptionElement? = getProperty(this, index)

public operator fun HTMLSelectElement.set(index: Int, option: HTMLOptionElement?) { setProperty(this, index, option) }

/**
 * The HTMLDataListElement interface provides special properties (beyond the HTMLElement object interface it also has
 * available to it by inheritance) to manipulate &lt;datalist&gt; elements and their content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDataListElement)
 */
public abstract external class HTMLDataListElement : HTMLElement {
    /**
     * The options read-only property of the HTMLDataListElement interface returns an HTMLCollection of
     * HTMLOptionElement elements contained in a &lt;datalist&gt;. The descendant &lt;option&gt; elements provide
     * predefined options for the &lt;input&gt; control associated with the &lt;datalist&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDataListElement/options)
     */
    open val options: HTMLCollection

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLOptGroupElement interface provides special properties and methods (beyond the regular HTMLElement object
 * interface they also have available to them by inheritance) for manipulating the layout and presentation of
 * &lt;optgroup&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptGroupElement)
 */
public abstract external class HTMLOptGroupElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
    /**
     * The disabled property of the HTMLOptGroupElement interface is a boolean value that reflects the &lt;optgroup&gt;
     * element's disabled attribute, which indicates whether the control is disabled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptGroupElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The label property of the HTMLOptGroupElement interface is a string value that reflects the &lt;optgroup&gt;
     * element's label attribute, which provides a textual label to the group of options.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptGroupElement/label)
     */
    open var label: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLOptionElement interface represents &lt;option&gt; elements and inherits all properties and methods of the
 * HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement)
 */
public abstract external class HTMLOptionElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
    /**
     * The disabled property of the HTMLOptionElement is a boolean value that indicates whether the &lt;option&gt;
     * element is unavailable to be selected. The property reflects the value of the disabled HTML attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The form read-only property of the HTMLOptionElement interface returns an HTMLFormElement object that owns the
     * HTMLSelectElement associated with this &lt;option&gt;, or null if this option is not associated with a
     * &lt;select&gt; owned by a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The label property of the HTMLOptionElement represents the text displayed for an option in a &lt;select&gt;
     * element or as part of a list of suggestions in a &lt;datalist&gt; element. It reflects the &lt;option&gt;
     * element's label attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/label)
     */
    open var label: String

    /**
     * The defaultSelected property of the HTMLOptionElement interface specifies the default selected state of the
     * element. This property reflects the &lt;option&gt; element's selected attribute. The presence of the selected
     * attribute sets the defaultSelected property to true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/defaultSelected)
     */
    open var defaultSelected: Boolean

    /**
     * The selected property of the HTMLOptionElement interface specifies the current selectedness of the element; that
     * is, whether the &lt;option&gt; is selected or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/selected)
     */
    open var selected: Boolean

    /**
     * The value property of the HTMLOptionElement interface represents the value of the &lt;option&gt; element as a
     * string, or the empty string if no value is set. It reflects the element's value attribute, if present. Otherwise,
     * it returns or sets the contents of the element, similar to the textContent property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/value)
     */
    open var value: String

    /**
     * The text property of the HTMLOptionElement represents the text inside the &lt;option&gt; element. This property
     * represents the same information as Node.textContent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/text)
     */
    open var text: String

    /**
     * The read-only index property of the HTMLOptionElement interface specifies the 0-based index of the element; that
     * is, the position of the &lt;option&gt; within the list of options it belongs to, in tree-order, as an integer. If
     * the &lt;option&gt; is not part of an option-list, the value is 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOptionElement/index)
     */
    open val index: Int

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public open external class Option : HTMLOptionElement {
    constructor(text: String = definedExternally, value: String = definedExternally, defaultSelected: Boolean = definedExternally, selected: Boolean = definedExternally)

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
     * The assignedSlot read-only property of the Element interface returns an HTMLSlotElement representing the
     * &lt;slot&gt; element the node is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot)
     */
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint

    /**
     * The role property of the ElementInternals interface returns the WAI-ARIA role for the element. For example, a
     * checkbox might have role="checkbox". It reflects the role attribute; it does not return the element's implicit
     * ARIA role, if any, unless explicitly set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/role)
     */
    override var role: String?

    /**
     * The ariaActiveDescendantElement property of the ElementInternals interface represents the current active element
     * when focus is on a composite widget, combobox, textbox, group, or application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaActiveDescendantElement)
     */
    override var ariaActiveDescendantElement: Element?

    /**
     * The ariaAtomic property of the ElementInternals interface reflects the value of the aria-atomic attribute, which
     * indicates whether assistive technologies will present all, or only parts of, the changed region based on the
     * change notifications defined by the aria-relevant attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAtomic)
     */
    override var ariaAtomic: String?

    /**
     * The ariaAutoComplete property of the ElementInternals interface reflects the value of the aria-autocomplete
     * attribute, which indicates whether inputting text could trigger display of one or more predictions of the user's
     * intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they
     * were made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAutoComplete)
     */
    override var ariaAutoComplete: String?

    /**
     * The ariaBrailleLabel property of the ElementInternals interface reflects the value of the aria-braillelabel
     * attribute, which defines the ARIA braille label of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleLabel)
     */
    override var ariaBrailleLabel: String?

    /**
     * The ariaBrailleRoleDescription property of the ElementInternals interface reflects the value of the
     * aria-brailleroledescription attribute, which defines the ARIA braille role description of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleRoleDescription)
     */
    override var ariaBrailleRoleDescription: String?

    /**
     * The ariaBusy property of the ElementInternals interface reflects the value of the aria-busy attribute, which
     * indicates whether an element is being modified, as assistive technologies may want to wait until the
     * modifications are complete before exposing them to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBusy)
     */
    override var ariaBusy: String?

    /**
     * The ariaChecked property of the ElementInternals interface reflects the value of the aria-checked attribute,
     * which indicates the current "checked" state of checkboxes, radio buttons, and other widgets that have a checked
     * state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaChecked)
     */
    override var ariaChecked: String?

    /**
     * The ariaColCount property of the ElementInternals interface reflects the value of the aria-colcount attribute,
     * which defines the number of columns in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColCount)
     */
    override var ariaColCount: String?

    /**
     * The ariaColIndex property of the ElementInternals interface reflects the value of the aria-colindex attribute,
     * which defines an element's column index or position with respect to the total number of columns within a table,
     * grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndex)
     */
    override var ariaColIndex: String?

    /**
     * The ariaColIndexText property of the ElementInternals interface reflects the value of the aria-colindextext
     * attribute, which defines a human-readable text alternative of aria-colindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndexText)
     */
    override var ariaColIndexText: String?

    /**
     * The ariaColSpan property of the ElementInternals interface reflects the value of the aria-colspan attribute,
     * which defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColSpan)
     */
    override var ariaColSpan: String?

    /**
     * The ariaControlsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that are controlled by the element it is applied to. For example, this might be set on a combobox to
     * indicate the element that it pops up, or on a scrollbar to indicate the ID of the element it controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaControlsElements)
     */
    override var ariaControlsElements: JsArray<Element>?

    /**
     * The ariaCurrent property of the ElementInternals interface reflects the value of the aria-current attribute,
     * which indicates the element that represents the current item within a container or set of related elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaCurrent)
     */
    override var ariaCurrent: String?

    /**
     * The ariaDescribedByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible description for the element it is applied to. The accessible description is
     * similar to the accessible label (see ariaLabelledByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescribedByElements)
     */
    override var ariaDescribedByElements: JsArray<Element>?

    /**
     * The ariaDescription property of the ElementInternals interface reflects the value of the aria-description
     * attribute, which defines a string value that describes or annotates the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescription)
     */
    override var ariaDescription: String?

    /**
     * The ariaDetailsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible details for the element it is applied to. The accessible details are similar
     * to the accessible description (see ariaDescribedByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDetailsElements)
     */
    override var ariaDetailsElements: JsArray<Element>?

    /**
     * The ariaDisabled property of the ElementInternals interface reflects the value of the aria-disabled attribute,
     * which indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDisabled)
     */
    override var ariaDisabled: String?

    /**
     * The ariaErrorMessageElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an error message for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaErrorMessageElements)
     */
    override var ariaErrorMessageElements: JsArray<Element>?

    /**
     * The ariaExpanded property of the ElementInternals interface reflects the value of the aria-expanded attribute,
     * which indicates whether a grouping element owned or controlled by this element is expanded or collapsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaExpanded)
     */
    override var ariaExpanded: String?

    /**
     * The ariaFlowToElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an alternate reading order of content, overriding the general default reading order at the
     * user's discretion. If just one element is provided this is the next element in the reading order. If multiple
     * elements are provided, then each element represents a possible path that should be offered to the user for
     * selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaFlowToElements)
     */
    override var ariaFlowToElements: JsArray<Element>?

    /**
     * The ariaHasPopup property of the ElementInternals interface reflects the value of the aria-haspopup attribute,
     * which indicates the availability and type of interactive popup element, such as menu or dialog, that can be
     * triggered by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHasPopup)
     */
    override var ariaHasPopup: String?

    /**
     * The ariaHidden property of the ElementInternals interface reflects the value of the aria-hidden attribute, which
     * indicates whether the element is exposed to an accessibility API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHidden)
     */
    override var ariaHidden: String?

    /**
     * The ariaInvalid property of the ElementInternals interface reflects the value of the aria-invalid attribute.
     * Relevant for the application, checkbox, combobox, gridcell, listbox, radiogroup, slider, spinbutton, textbox, and
     * tree roles, it indicates to the accessibility API whether the entered value does not conform to the format
     * expected by the application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaInvalid)
     */
    override var ariaInvalid: String?

    /**
     * The ariaKeyShortcuts property of the ElementInternals interface reflects the value of the aria-keyshortcuts
     * attribute, which indicates keyboard shortcuts that an author has implemented to activate or give focus to an
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaKeyShortcuts)
     */
    override var ariaKeyShortcuts: String?

    /**
     * The ariaLabel property of the ElementInternals interface reflects the value of the aria-label attribute, which
     * defines a string value that labels the current Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabel)
     */
    override var ariaLabel: String?

    /**
     * The ariaLabelledByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible name for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabelledByElements)
     */
    override var ariaLabelledByElements: JsArray<Element>?

    /**
     * The ariaLevel property of the ElementInternals interface reflects the value of the aria-level attribute, which
     * defines the hierarchical level of an element within a structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLevel)
     */
    override var ariaLevel: String?

    /**
     * The ariaLive property of the ElementInternals interface reflects the value of the aria-live attribute, which
     * indicates that an element will be updated, and describes the types of updates the user agents, assistive
     * technologies, and user can expect from the live region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLive)
     */
    override var ariaLive: String?

    /**
     * The ariaModal property of the ElementInternals interface reflects the value of the aria-modal attribute, which
     * indicates whether an element is modal when displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaModal)
     */
    override var ariaModal: String?

    /**
     * The ariaMultiLine property of the ElementInternals interface reflects the value of the aria-multiline attribute,
     * which indicates whether a text box accepts multiple lines of input or only a single line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiLine)
     */
    override var ariaMultiLine: String?

    /**
     * The ariaMultiSelectable property of the ElementInternals interface reflects the value of the aria-multiselectable
     * attribute, which indicates that the user may select more than one item from the current selectable descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiSelectable)
     */
    override var ariaMultiSelectable: String?

    /**
     * The ariaOrientation property of the ElementInternals interface reflects the value of the aria-orientation
     * attribute, which indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOrientation)
     */
    override var ariaOrientation: String?

    /**
     * The ariaOwnsElements property of the ElementInternals interface is an array containing the element (or elements)
     * that define a visual, functional, or contextual relationship between a parent element that it is applied to, and
     * its child elements. This is used when the shadow DOM hierarchy cannot be used to represent the relationship, and
     * it would not otherwise be available to assistive technology,
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOwnsElements)
     */
    override var ariaOwnsElements: JsArray<Element>?

    /**
     * The ariaPlaceholder property of the ElementInternals interface reflects the value of the aria-placeholder
     * attribute, which defines a short hint intended to aid the user with data entry when the control has no value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPlaceholder)
     */
    override var ariaPlaceholder: String?

    /**
     * The ariaPosInSet property of the ElementInternals interface reflects the value of the aria-posinset attribute,
     * which defines an element's number or position in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPosInSet)
     */
    override var ariaPosInSet: String?

    /**
     * The ariaPressed property of the ElementInternals interface reflects the value of the aria-pressed attribute,
     * which indicates the current "pressed" state of toggle buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPressed)
     */
    override var ariaPressed: String?

    /**
     * The ariaReadOnly property of the ElementInternals interface reflects the value of the aria-readonly attribute,
     * which indicates that the element is not editable, but is otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaReadOnly)
     */
    override var ariaReadOnly: String?

    /**
     * The ariaRelevant property of the ElementInternals interface reflects the value of the aria-relevant attribute,
     * which indicates what notifications the user agent will trigger when the accessibility tree within a live region
     * is modified. This is used to describe what changes in an aria-live region are relevant and should be announced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRelevant)
     */
    override var ariaRelevant: String?

    /**
     * The ariaRequired property of the ElementInternals interface reflects the value of the aria-required attribute,
     * which indicates that user input is required on the element before a form may be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRequired)
     */
    override var ariaRequired: String?

    /**
     * The ariaRoleDescription property of the ElementInternals interface reflects the value of the aria-roledescription
     * attribute, which defines a human-readable, author-localized description for the role of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRoleDescription)
     */
    override var ariaRoleDescription: String?

    /**
     * The ariaRowCount property of the ElementInternals interface reflects the value of the aria-rowcount attribute,
     * which defines the total number of rows in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowCount)
     */
    override var ariaRowCount: String?

    /**
     * The ariaRowIndex property of the ElementInternals interface reflects the value of the aria-rowindex attribute,
     * which defines an element's row index or position with respect to the total number of rows within a table, grid,
     * or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndex)
     */
    override var ariaRowIndex: String?

    /**
     * The ariaRowIndexText property of the ElementInternals interface reflects the value of the aria-rowindextext
     * attribute, which defines a human-readable text alternative of aria-rowindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndexText)
     */
    override var ariaRowIndexText: String?

    /**
     * The ariaRowSpan property of the ElementInternals interface reflects the value of the aria-rowspan attribute,
     * which defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowSpan)
     */
    override var ariaRowSpan: String?

    /**
     * The ariaSelected property of the ElementInternals interface reflects the value of the aria-selected attribute,
     * which indicates the current "selected" state of elements that have a selected state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSelected)
     */
    override var ariaSelected: String?

    /**
     * The ariaSetSize property of the ElementInternals interface reflects the value of the aria-setsize attribute,
     * which defines the number of items in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSetSize)
     */
    override var ariaSetSize: String?

    /**
     * The ariaSort property of the ElementInternals interface reflects the value of the aria-sort attribute, which
     * indicates if items in a table or grid are sorted in ascending or descending order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSort)
     */
    override var ariaSort: String?

    /**
     * The ariaValueMax property of the ElementInternals interface reflects the value of the aria-valuemax attribute,
     * which defines the maximum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMax)
     */
    override var ariaValueMax: String?

    /**
     * The ariaValueMin property of the ElementInternals interface reflects the value of the aria-valuemin attribute,
     * which defines the minimum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMin)
     */
    override var ariaValueMin: String?

    /**
     * The ariaValueNow property of the ElementInternals interface reflects the value of the aria-valuenow attribute,
     * which defines the current value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueNow)
     */
    override var ariaValueNow: String?

    /**
     * The ariaValueText property of the ElementInternals interface reflects the value of the aria-valuetext attribute,
     * which defines the human-readable text alternative of aria-valuenow for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueText)
     */
    override var ariaValueText: String?

    /**
     * The ariaNotify() method of the Element interface queues a string of text to be announced by a screen reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaNotify)
     */
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
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
     * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable)
     */
    override var contentEditable: String

    /**
     * The enterKeyHint property is an enumerated property defining what action label (or icon) to present for the enter
     * key on virtual keyboards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint)
     */
    override var enterKeyHint: String

    /**
     * The HTMLElement.isContentEditable read-only property returns a boolean value that is true if the contents of the
     * element are editable; otherwise it returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable)
     */
    override val isContentEditable: Boolean

    /**
     * The HTMLElement property inputMode reflects the value of the element's inputmode attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode)
     */
    override var inputMode: String

    /**
     * The dataset read-only property of the HTMLElement interface provides read/write access to custom data attributes
     * (data-*) on elements. It exposes a map of strings (DOMStringMap) with an entry for each data-* attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset)
     */
    override val dataset: DOMStringMap

    /**
     * The nonce property of the HTMLElement interface returns the cryptographic number used once that is used by
     * Content Security Policy to determine whether a given fetch will be allowed to proceed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce)
     */
    override var nonce: String

    /**
     * The autofocus property of the HTMLElement interface represents a boolean value reflecting the autofocus HTML
     * global attribute. This indicates whether the element should be focused on page load or, if it is nested inside a
     * &lt;dialog&gt; or popover element, when the &lt;dialog&gt; or popover is shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autofocus)
     */
    override var autofocus: Boolean

    /**
     * The tabIndex property of the HTMLElement interface represents the tab order of the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex)
     */
    override var tabIndex: Int

    /**
     * The HTMLElement.focus() method sets focus on the specified element, if it can be focused. The focused element is
     * the element that will receive keyboard and similar events by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus)
     */
    override fun focus(options: FocusOptions)

    /**
     * The HTMLElement.blur() method removes keyboard focus from the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur)
     */
    override fun blur()

    /**
     * The read-only style property of the HTMLElement interface returns the inline style of an element in the form of a
     * live CSSStyleProperties object. This object can be used to get and set the inline styles of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style)
     */
    override val style: CSSStyleProperties

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLTextAreaElement interface provides properties and methods for manipulating the layout and presentation of
 * &lt;textarea&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement)
 */
public abstract external class HTMLTextAreaElement : HTMLElement {
    /**
     * The autocomplete property of the HTMLTextAreaElement interface indicates whether the value of the control can be
     * automatically completed by the browser. It reflects the &lt;textarea&gt; element's autocomplete attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/autocomplete)
     */
    open var autocomplete: String

    /**
     * The cols property of the HTMLTextAreaElement interface is a positive integer representing the visible width of
     * the multi-line text control, in average character widths. It reflects the &lt;textarea&gt; element's cols
     * attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/cols)
     */
    open var cols: Int

    /**
     * The dirName property of the HTMLTextAreaElement interface is the directionality of the element. It reflects the
     * value of the &lt;textarea&gt; element's dirName attribute. This property can be retrieved or set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/dirName)
     */
    open var dirName: String

    /**
     * The disabled property of the HTMLTextAreaElement interface indicates whether this multi-line text control is
     * disabled and cannot be interacted with. It reflects the &lt;textarea&gt; element's disabled attribute. When
     * false, this textarea may still be disabled if its containing element, such as a &lt;fieldset&gt;, is disabled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The form read-only property of the HTMLTextAreaElement interface returns an HTMLFormElement object that owns this
     * &lt;textarea&gt;, or null if this textarea is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The maxLength property of the HTMLTextAreaElement interface indicates the maximum number of characters (in UTF-16
     * code units) allowed to be entered for the value of the &lt;textarea&gt; element, and the maximum number of
     * characters allowed for the value to be valid. It reflects the element's maxlength attribute. -1 means there is no
     * limit on the length of the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/maxLength)
     */
    open var maxLength: Int

    /**
     * The minLength property of the HTMLTextAreaElement interface indicates the minimum number of characters (in UTF-16
     * code units) required for the value of the &lt;textarea&gt; element to be valid. It reflects the element's
     * minlength attribute. -1 means there is no minimum length requirement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/minLength)
     */
    open var minLength: Int

    /**
     * The name property of the HTMLTextAreaElement interface indicates the name of the &lt;textarea&gt; element. It
     * reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/name)
     */
    open var name: String

    /**
     * The placeholder property of the HTMLTextAreaElement interface represents a hint to the user of what can be
     * entered in the control. It reflects the &lt;textarea&gt; element's placeholder attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/placeholder)
     */
    open var placeholder: String

    /**
     * The readOnly property of the HTMLTextAreaElement interface indicates that the user cannot modify the value of the
     * control. Unlike the disabled attribute, the readonly attribute does not prevent the user from clicking or
     * selecting in the control. It reflects the &lt;textarea&gt; element's readonly attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/readOnly)
     */
    open var readOnly: Boolean

    /**
     * The required property of the HTMLTextAreaElement interface specifies that the user must fill in a value before
     * submitting a form. It reflects the &lt;textarea&gt; element's required attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/required)
     */
    open var required: Boolean

    /**
     * The rows property of the HTMLTextAreaElement interface is a positive integer representing the visible text lines
     * of the text control. It reflects the &lt;textarea&gt; element's rows attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/rows)
     */
    open var rows: Int

    /**
     * The wrap property of the HTMLTextAreaElement interface indicates how the control should wrap the value for form
     * submission. It reflects the &lt;textarea&gt; element's wrap attribute. Note that the "hard" value only has an
     * effect when the cols attribute is also set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/wrap)
     */
    open var wrap: String

    /**
     * The type read-only property of the HTMLTextAreaElement interface returns the string "textarea".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/type)
     */
    open val type: String

    /**
     * The defaultValue property of the HTMLTextAreaElement interface represents the default text content of this text
     * area. Getting and setting this value is equivalent to getting and setting textContent on the &lt;textarea&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/defaultValue)
     */
    open var defaultValue: String

    /**
     * The value property of the HTMLTextAreaElement interface represents the value of the &lt;textarea&gt; element as a
     * string, which is an empty string if the widget contains no content. It returns or sets the raw value contained in
     * the control.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/value)
     */
    open var value: String

    /**
     * The textLength read-only property of the HTMLTextAreaElement interface is a non-negative integer representing the
     * number of characters, in UTF-16 code units, of the &lt;textarea&gt; element's value. It is a shortcut of
     * accessing length on its value property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/textLength)
     */
    open val textLength: Int

    /**
     * The willValidate read-only property of the HTMLTextAreaElement interface indicates whether the &lt;textarea&gt;
     * element is a candidate for constraint validation. It is false if any conditions bar it from constraint
     * validation, such as when its disabled or readOnly property is true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLTextAreaElement interface returns a ValidityState object that
     * represents the validity states this element is in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLTextAreaElement interface returns a string representing a
     * localized message that describes the validation constraints that the &lt;textarea&gt; control does not satisfy
     * (if any). This is the empty string if the control is not a candidate for constraint validation
     * (HTMLTextAreaElement.willValidate is false), or it satisfies its constraints.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLTextAreaElement interface returns a boolean value which indicates if the
     * element meets any constraint validation rules applied to it. If false, the method also fires an invalid event on
     * the element. Because there's no default browser behavior for checkValidity(), canceling this invalid event has no
     * effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLTextAreaElement interface performs the same validity checking steps as the
     * checkValidity() method. In addition, if the invalid event is not canceled, the browser displays the problem to
     * the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The setCustomValidity() method of the HTMLTextAreaElement interface sets the custom validity message for the
     * &lt;textarea&gt; element. Use the empty string to indicate that the element does not have a custom validity
     * error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)

    /**
     * The HTMLTextAreaElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated
     * with the &lt;textArea&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/labels)
     */
    open val labels: NodeList

    /**
     * The select() method of the HTMLTextAreaElement interface selects all the text in a &lt;textarea&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/select)
     */
    open fun select()

    /**
     * The selectionStart property of the HTMLTextAreaElement interface specifies the start position of the current text
     * selection in a &lt;textarea&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionStart)
     */
    open var selectionStart: Int

    /**
     * The selectionEnd property of the HTMLTextAreaElement interface specifies the end position of the current text
     * selection in a &lt;textarea&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionEnd)
     */
    open var selectionEnd: Int

    /**
     * The selectionDirection property of the HTMLTextAreaElement interface is a string that indicates the direction in
     * which the user is selecting the text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionDirection)
     */
    open var selectionDirection: String

    /**
     * The setRangeText() method of the HTMLTextAreaElement interface replaces a range of text in a &lt;textarea&gt;
     * element with new text passed as the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setRangeText)
     */
    open fun setRangeText(replacement: String)

    /**
     * The setRangeText() method of the HTMLTextAreaElement interface replaces a range of text in a &lt;textarea&gt;
     * element with new text passed as the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setRangeText)
     */
    open fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode = definedExternally)

    /**
     * The setSelectionRange() method of the HTMLTextAreaElement interface sets the start and end positions of the
     * current text selection in a &lt;textarea&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setSelectionRange)
     */
    open fun setSelectionRange(start: Int, end: Int, direction: String = definedExternally)

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLOutputElement interface provides properties and methods (beyond those inherited from HTMLElement) for
 * manipulating the layout and presentation of &lt;output&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement)
 */
public abstract external class HTMLOutputElement : HTMLElement {
    /**
     * The read-only htmlFor property of the HTMLOutputElement returns a live DOMTokenList object containing a list of
     * ids of those elements contributing input values to (or otherwise affected) the calculation. It reflects the
     * &lt;output&gt; element's for content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/htmlFor)
     */
    open val htmlFor: DOMTokenList

    /**
     * The form read-only property of the HTMLOutputElement interface returns an HTMLFormElement object that owns this
     * &lt;output&gt;, or null if this output is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The name property of the HTMLOutputElement interface indicates the name of the &lt;output&gt; element. It
     * reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/name)
     */
    open var name: String

    /**
     * The type read-only property of the HTMLOutputElement interface returns the string "output".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/type)
     */
    open val type: String

    /**
     * The defaultValue property of the HTMLOutputElement interface represents the default text content of this
     * &lt;output&gt; element. Getting and setting this value is equivalent to getting and setting textContent on the
     * &lt;output&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/defaultValue)
     */
    open var defaultValue: String

    /**
     * The value property of the HTMLOutputElement interface represents the value of the &lt;output&gt; element as a
     * string, or the empty string if no value is set. It returns or sets the contents of the element, similar to the
     * textContent property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/value)
     */
    open var value: String

    /**
     * The willValidate read-only property of the HTMLOutputElement interface returns false, because &lt;output&gt;
     * elements are not candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLOutputElement interface returns a ValidityState object that represents
     * the validity states this element is in. Although &lt;output&gt; elements are never candidates for constraint
     * validation, the validity state may still be invalid if a custom validity message has been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLOutputElement interface returns a string representing a
     * localized message that describes the validation constraints that the &lt;output&gt; control does not satisfy (if
     * any). This is the empty string as &lt;output&gt; elements are not candidates for constraint validation
     * (HTMLOutputElement.willValidate is false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLOutputElement interface checks if the element is valid, but always returns
     * true because &lt;output&gt; elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLOutputElement interface performs the same validity checking steps as the
     * checkValidity() method. It always returns true because &lt;output&gt; elements are never candidates for
     * constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The setCustomValidity() method of the HTMLOutputElement interface sets the custom validity message for the
     * &lt;output&gt; element. Use the empty string to indicate that the element does not have a custom validity error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)

    /**
     * The HTMLOutputElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated with
     * the &lt;output&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLOutputElement/labels)
     */
    open val labels: NodeList

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLProgressElement interface provides special properties and methods (beyond the regular HTMLElement interface
 * it also has available to it by inheritance) for manipulating the layout and presentation of &lt;progress&gt;
 * elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement)
 */
public abstract external class HTMLProgressElement : HTMLElement {
    /**
     * The value property of the HTMLProgressElement interface represents the current progress of the &lt;progress&gt;
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/value)
     */
    open var value: Double

    /**
     * The max property of the HTMLProgressElement interface represents the upper bound of the &lt;progress&gt;
     * element's range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/max)
     */
    open var max: Double

    /**
     * The position read-only property of the HTMLProgressElement interface returns current progress of the
     * &lt;progress&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/position)
     */
    open val position: Double

    /**
     * The HTMLProgressElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated
     * with the &lt;progress&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLProgressElement/labels)
     */
    open val labels: NodeList

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTML &lt;meter&gt; elements expose the HTMLMeterElement interface, which provides special properties and methods
 * (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout
 * and presentation of &lt;meter&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement)
 */
public abstract external class HTMLMeterElement : HTMLElement {
    /**
     * The value property of the HTMLMeterElement interface represents the current value of the &lt;meter&gt; element as
     * a floating-point number. It reflects the element's value attribute. If no value is set, it is the
     * HTMLMeterElement.min value or 0, whichever is greater.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/value)
     */
    open var value: Double

    /**
     * The min property of the HTMLMeterElement interface represents the minimum value of the &lt;meter&gt; element as a
     * floating-point number. It reflects the element's min attribute, or 0 if no min is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/min)
     */
    open var min: Double

    /**
     * The max property of the HTMLMeterElement interface represents the maximum value of the &lt;meter&gt; element as a
     * floating-point number. It reflects the element's max attribute, or the min value if no max is set, or 1 if
     * neither the min nor the max is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/max)
     */
    open var max: Double

    /**
     * The low property of the HTMLMeterElement interface represents the low boundary of the &lt;meter&gt; element as a
     * floating-point number. It reflects the element's low attribute, or the value of min if not defined. The value of
     * low is clamped by the min and max values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/low)
     */
    open var low: Double

    /**
     * The high property of the HTMLMeterElement interface represents the high boundary of the &lt;meter&gt; element as
     * a floating-point number. It reflects the element's high attribute, or the value of max if not defined. The value
     * of high is clamped by the low and max values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/high)
     */
    open var high: Double

    /**
     * The optimum property of the HTMLMeterElement interface represents the optimum boundary of the &lt;meter&gt;
     * element as a floating-point number. It reflects the element's optimum attribute, or the midpoint between min and
     * max values if not defined. The value of optimum is clamped by the min and max values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/optimum)
     */
    open var optimum: Double

    /**
     * The HTMLMeterElement.labels read-only property returns a NodeList of the &lt;label&gt; elements associated with
     * the &lt;meter&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMeterElement/labels)
     */
    open val labels: NodeList

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLFieldSetElement interface provides special properties and methods (beyond the regular HTMLElement interface
 * it also has available to it by inheritance) for manipulating the layout and presentation of &lt;fieldset&gt;
 * elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement)
 */
public abstract external class HTMLFieldSetElement : HTMLElement {
    /**
     * The disabled property of the HTMLFieldSetElement interface is a boolean value that reflects the &lt;fieldset&gt;
     * element's disabled attribute, which indicates whether the control is disabled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/disabled)
     */
    open var disabled: Boolean

    /**
     * The form read-only property of the HTMLFieldSetElement interface returns an HTMLFormElement object that owns this
     * &lt;fieldset&gt;, or null if this fieldset is not owned by any form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/form)
     */
    open val form: HTMLFormElement?

    /**
     * The name property of the HTMLFieldSetElement interface indicates the name of the &lt;fieldset&gt; element. It
     * reflects the element's name attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/name)
     */
    open var name: String

    /**
     * The type read-only property of the HTMLFieldSetElement interface returns the string "fieldset".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/type)
     */
    open val type: String

    /**
     * The elements read-only property of the HTMLFieldSetElement interface returns an HTMLCollection object containing
     * all form control elements (&lt;button&gt;, &lt;fieldset&gt;, &lt;input&gt;, &lt;object&gt;, &lt;output&gt;,
     * &lt;select&gt;, and &lt;textarea&gt;) that are descendants of this field set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/elements)
     */
    open val elements: HTMLCollection

    /**
     * The willValidate read-only property of the HTMLFieldSetElement interface returns false, because &lt;fieldset&gt;
     * elements are not candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the HTMLFieldSetElement interface returns a ValidityState object that
     * represents the validity states this element is in. Although &lt;fieldset&gt; elements are never candidates for
     * constraint validation, the validity state may still be invalid if a custom validity message has been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the HTMLFieldSetElement interface returns a string representing a
     * localized message that describes the validation constraints that the &lt;fieldset&gt; control does not satisfy
     * (if any). This is the empty string as &lt;fieldset&gt; elements are not candidates for constraint validation
     * (HTMLFieldSetElement.willValidate is false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the HTMLFieldSetElement interface checks if the element is valid, but always
     * returns true because &lt;fieldset&gt; elements are never candidates for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the HTMLFieldSetElement interface performs the same validity checking steps as the
     * checkValidity() method. It always returns true because &lt;fieldset&gt; elements are never candidates for
     * constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The setCustomValidity() method of the HTMLFieldSetElement interface sets the custom validity message for the
     * &lt;fieldset&gt; element. Use the empty string to indicate that the element does not have a custom validity
     * error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFieldSetElement/setCustomValidity)
     */
    open fun setCustomValidity(error: String)

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLLegendElement is an interface allowing you to access properties of the &lt;legend&gt; elements. It inherits
 * properties and methods from the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLegendElement)
 */
public abstract external class HTMLLegendElement : HTMLElement {
    /**
     * The form read-only property of the HTMLLegendElement interface returns an HTMLFormElement object that owns the
     * HTMLFieldSetElement associated with this &lt;legend&gt;, or null if this legend is not associated with a
     * &lt;fieldset&gt; owned by a form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLLegendElement/form)
     */
    open val form: HTMLFormElement?
    open var align: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLSelectedContentElement interface represents a &lt;selectedcontent&gt; element in the DOM.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSelectedContentElement)
 */
public abstract external class HTMLSelectedContentElement : HTMLElement {

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface SelectionMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val SelectionMode.Companion.SELECT: SelectionMode get() = "select".toJsString().unsafeCast<SelectionMode>()
public inline val SelectionMode.Companion.START: SelectionMode get() = "start".toJsString().unsafeCast<SelectionMode>()
public inline val SelectionMode.Companion.END: SelectionMode get() = "end".toJsString().unsafeCast<SelectionMode>()
public inline val SelectionMode.Companion.PRESERVE: SelectionMode get() = "preserve".toJsString().unsafeCast<SelectionMode>()

/**
 * The ValidityState interface represents the validity states that an element can be in, with respect to constraint
 * validation. Together, they help explain why an element's value fails to validate, if it's not valid.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState)
 */
public abstract external class ValidityState : JsAny {
    /**
     * The read-only valueMissing property of the ValidityState interface indicates if a required control, such as an
     * &lt;input&gt;, &lt;select&gt;, or &lt;textarea&gt;, has an empty value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valueMissing)
     */
    open val valueMissing: Boolean

    /**
     * The read-only typeMismatch property of the ValidityState interface indicates if the value of an &lt;input&gt;,
     * after having been edited by the user, does not conform to the constraints set by the element's type attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/typeMismatch)
     */
    open val typeMismatch: Boolean

    /**
     * The read-only patternMismatch property of the ValidityState interface indicates if the value of an &lt;input&gt;,
     * after having been edited by the user, does not conform to the constraints set by the element's pattern attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/patternMismatch)
     */
    open val patternMismatch: Boolean

    /**
     * The read-only tooLong property of the ValidityState interface indicates if the value of an &lt;input&gt; or
     * &lt;textarea&gt;, after having been edited by the user, exceeds the maximum code-unit length established by the
     * element's maxlength attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooLong)
     */
    open val tooLong: Boolean

    /**
     * The read-only tooShort property of the ValidityState interface indicates if the value of an &lt;input&gt;,
     * &lt;button&gt;, &lt;select&gt;, &lt;output&gt;, &lt;fieldset&gt; or &lt;textarea&gt;, after having been edited by
     * the user, is less than the minimum code-unit length established by the element's minlength attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/tooShort)
     */
    open val tooShort: Boolean

    /**
     * The read-only rangeUnderflow property of the ValidityState interface indicates if the value of an &lt;input&gt;,
     * after having been edited by the user, does not conform to the constraints set by the element's min attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeUnderflow)
     */
    open val rangeUnderflow: Boolean

    /**
     * The read-only rangeOverflow property of the ValidityState interface indicates if the value of an &lt;input&gt;,
     * after having been edited by the user, does not conform to the constraints set by the element's max attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/rangeOverflow)
     */
    open val rangeOverflow: Boolean

    /**
     * The read-only stepMismatch property of the ValidityState interface indicates if the value of an &lt;input&gt;,
     * after having been edited by the user, does not conform to the constraints set by the element's step attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/stepMismatch)
     */
    open val stepMismatch: Boolean

    /**
     * The read-only badInput property of the ValidityState interface indicates if the user has provided input that the
     * browser is unable to convert. For example, if you have a number input element whose content is a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/badInput)
     */
    open val badInput: Boolean

    /**
     * The read-only customError property of the ValidityState interface returns true if an element doesn't meet the
     * validation required in the custom validity set by the element's setCustomValidity() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/customError)
     */
    open val customError: Boolean

    /**
     * The read-only valid property of the ValidityState interface indicates if the value of an &lt;input&gt; element
     * meets all its validation constraints, and is therefore considered to be valid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ValidityState/valid)
     */
    open val valid: Boolean
}

/**
 * The SubmitEvent interface defines the object used to represent an HTML form's submit event. This event is fired at
 * the &lt;form&gt; when the form's submit action is invoked.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent)
 */
public open external class SubmitEvent : Event {
    /**
     * The SubmitEvent() constructor creates and returns a new SubmitEvent object, which is used to represent a submit
     * event fired at an HTML form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent/SubmitEvent)
     */
    constructor(type: String, eventInitDict: SubmitEventInit = definedExternally)

    /**
     * The read-only submitter property found on the SubmitEvent interface specifies the submit button or other element
     * that was invoked to cause the form to be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubmitEvent/submitter)
     */
    open val submitter: HTMLElement?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface SubmitEventInit : EventInit {
    var submitter: HTMLElement?
}

public fun SubmitEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, submitter: HTMLElement? = null): SubmitEventInit = newJsObject<SubmitEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (submitter != null) this.submitter = submitter
}

/**
 * The FormDataEvent interface represents a formdata event — such an event is fired on an HTMLFormElement object after
 * the entry list representing the form's data is constructed. This happens when the form is submitted, but can also be
 * triggered by the invocation of a FormData() constructor.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent)
 */
public open external class FormDataEvent : Event {
    /**
     * The FormDataEvent() constructor creates a new FormDataEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent/FormDataEvent)
     */
    constructor(type: String, eventInitDict: FormDataEventInit)

    /**
     * The formData read-only property of the FormDataEvent interface contains the FormData object representing the data
     * contained in the form when the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormDataEvent/formData)
     */
    open val formData: FormData

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface FormDataEventInit : EventInit {
    var formData: FormData
}

public fun FormDataEventInit(formData: FormData, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): FormDataEventInit = newJsObject<FormDataEventInit>().apply {
    this.formData = formData
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

/**
 * The HTMLDetailsElement interface provides special properties (beyond the regular HTMLElement interface it also has
 * available to it by inheritance) for manipulating &lt;details&gt; elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement)
 */
public abstract external class HTMLDetailsElement : HTMLElement {
    /**
     * The name property of the HTMLDetailsElement interface reflects the name attribute of &lt;details&gt; elements. It
     * enables multiple &lt;details&gt; elements to be connected together, where only one of the &lt;details&gt;
     * elements can be open at once. This allows developers to easily create UI features such as accordions without
     * scripting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/name)
     */
    open var name: String

    /**
     * The open property of the HTMLDetailsElement interface is a boolean value reflecting the open HTML attribute,
     * indicating whether the &lt;details&gt;'s contents (not counting the &lt;summary&gt;) is to be shown to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDetailsElement/open)
     */
    open var open: Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLDialogElement interface provides methods to manipulate &lt;dialog&gt; elements. It inherits properties and
 * methods from the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement)
 */
public abstract external class HTMLDialogElement : HTMLElement {
    /**
     * The open property of the HTMLDialogElement interface is a boolean value reflecting the open HTML attribute,
     * indicating whether the &lt;dialog&gt; is available for interaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open)
     */
    open var open: Boolean

    /**
     * The returnValue property of the HTMLDialogElement interface is a string representing the return value for a
     * &lt;dialog&gt; element when it's closed. You can set the value directly (dialog.returnValue = "result") or by
     * providing the value as a string argument to close() or requestClose().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue)
     */
    open var returnValue: String

    /**
     * The closedBy property of the HTMLDialogElement interface indicates the types of user actions that can be used to
     * close the associated &lt;dialog&gt; element. It sets or returns the dialog's closedby attribute value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy)
     */
    open var closedBy: String

    /**
     * The show() method of the HTMLDialogElement interface displays the dialog as a non-modal dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/show)
     */
    open fun show()

    /**
     * The showModal() method of the HTMLDialogElement interface displays the dialog as a modal dialog, over the top of
     * any other dialogs or elements that might be visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/showModal)
     */
    open fun showModal()

    /**
     * The close() method of the HTMLDialogElement interface closes the &lt;dialog&gt;. An optional string may be passed
     * as an argument, updating the returnValue of the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close)
     */
    open fun close(returnValue: String = definedExternally)

    /**
     * The requestClose() method of the HTMLDialogElement interface requests to close the &lt;dialog&gt;. An optional
     * string may be passed as an argument, updating the returnValue of the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/requestClose)
     */
    open fun requestClose(returnValue: String = definedExternally)

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * HTML &lt;script&gt; elements expose the HTMLScriptElement interface, which provides special properties and methods
 * for manipulating the behavior and execution of &lt;script&gt; elements (beyond the inherited HTMLElement interface).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement)
 */
public abstract external class HTMLScriptElement : HTMLElement, HTMLOrSVGScriptElement {
    /**
     * The type property of the HTMLScriptElement interface is a string that reflects the type of the script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/type)
     */
    open var type: String

    /**
     * The src property of the HTMLScriptElement interface is a string representing the URL of an external script; this
     * can be used as an alternative to embedding a script directly within a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/src)
     */
    open var src: String

    /**
     * The noModule property of the HTMLScriptElement interface is a boolean value that indicates whether the script
     * should be executed in browsers that support ES modules. Practically, this can be used to serve fallback scripts
     * to older browsers that do not support JavaScript modules.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/noModule)
     */
    open var noModule: Boolean

    /**
     * The async property of the HTMLScriptElement interface is a boolean value that controls how the script should be
     * executed. For classic scripts, if the async property is set to true, the external script will be fetched in
     * parallel to parsing and evaluated as soon as it is available. For module scripts, if the async property is set to
     * true, the script and all their dependencies will be fetched in parallel to parsing and evaluated as soon as they
     * are available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/async)
     */
    open var async: Boolean

    /**
     * The defer property of the HTMLScriptElement interface is a boolean value that controls how the script should be
     * executed. For classic scripts, if the defer property is set to true, the external script will be executed after
     * the document has been parsed, but before firing DOMContentLoaded event. For module scripts, the defer property
     * has no effect.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/defer)
     */
    open var defer: Boolean

    /**
     * The read-only blocking property of the HTMLScriptElement returns a live DOMTokenList object containing the
     * operations that should be blocked on the fetching of an external resource. It reflects the &lt;script&gt;
     * element's blocking content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/blocking)
     */
    open val blocking: DOMTokenList

    /**
     * The crossOrigin property of the HTMLScriptElement interface reflects the Cross-Origin Resource Sharing settings
     * for the script element. For classic scripts from other origins, this controls if full error information will be
     * exposed. For module scripts, it controls the script itself and any script it imports. See CORS settings
     * attributes for details.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin)
     */
    open var crossOrigin: String?

    /**
     * The referrerPolicy property of the HTMLScriptElement interface reflects the HTML referrerpolicy of the
     * &lt;script&gt; element, which defines how the referrer is set when fetching the script and any scripts it
     * imports.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/referrerPolicy)
     */
    open var referrerPolicy: String

    /**
     * The integrity property of the HTMLScriptElement interface is a string that contains inline metadata that a
     * browser can use to verify that a fetched resource has been delivered without unexpected manipulation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/integrity)
     */
    open var integrity: String

    /**
     * The fetchPriority property of the HTMLScriptElement interface represents a hint to the browser indicating how it
     * should prioritize fetching an external script relative to other external scripts. It reflects the &lt;script&gt;
     * element's fetchpriority content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/fetchPriority)
     */
    open var fetchPriority: String

    /**
     * The innerText property of the HTMLScriptElement interface represents the text content of the &lt;script&gt;
     * element. It behaves in the same way as the textContent and text properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/innerText)
     */
    override var innerText: String

    /**
     * The textContent property of the HTMLScriptElement interface represents the inline text content of the
     * &lt;script&gt; element. It behaves in the same way as the text and innerText properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/textContent)
     */
    override var textContent: String?

    /**
     * The text property of the HTMLScriptElement interface represents the inline text content of the &lt;script&gt;
     * element. It behaves in the same way as the textContent and innerText property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/text)
     */
    open var text: String
    open var charset: String
    open var event: String
    open var htmlFor: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short

        /**
         * The supports() static method of the HTMLScriptElement interface provides a simple and consistent method to
         * feature-detect what types of scripts are supported by the user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/supports_static)
         */
        fun supports(type: String): Boolean
    }
}

/**
 * The HTMLTemplateElement interface enables access to the contents of an HTML &lt;template&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement)
 */
public abstract external class HTMLTemplateElement : HTMLElement {
    /**
     * The content property of the HTMLTemplateElement interface returns the &lt;template&gt; element's template
     * contents as a DocumentFragment. This content's ownerDocument is a separate Document from the one that contains
     * the &lt;template&gt; element itself — unless the containing document is itself constructed for the purpose of
     * holding template content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/content)
     */
    open val content: DocumentFragment

    /**
     * The htmlFor property of the HTMLTemplateElement interface is the ID of the Processing Instruction marker to
     * replace with the contents of the associated &lt;template&gt; element. It reflects the value of, and is used to
     * set and get the for content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/htmlFor)
     */
    open var htmlFor: String

    /**
     * The shadowRootMode property of the HTMLTemplateElement interface reflects the value of the shadowrootmode
     * attribute of the associated &lt;template&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootMode)
     */
    open var shadowRootMode: String

    /**
     * The shadowRootDelegatesFocus property of the HTMLTemplateElement interface reflects the value of the
     * shadowrootdelegatesfocus attribute of the associated &lt;template&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootDelegatesFocus)
     */
    open var shadowRootDelegatesFocus: Boolean

    /**
     * The shadowRootSerializable property reflects the value of the shadowrootserializable attribute of the associated
     * &lt;template&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootSerializable)
     */
    open var shadowRootSerializable: Boolean

    /**
     * The shadowRootSlotAssignment property of the HTMLTemplateElement interface indicates whether the element has been
     * configured to use named or unnamed slot assignment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootSlotAssignment)
     */
    open var shadowRootSlotAssignment: String

    /**
     * The shadowRootClonable property reflects the value of the shadowrootclonable attribute of the associated
     * &lt;template&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootClonable)
     */
    open var shadowRootClonable: Boolean

    /**
     * The shadowRootCustomElementRegistry property of the HTMLTemplateElement interface reflects the value of the
     * shadowrootcustomelementregistry attribute of the associated &lt;template&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootCustomElementRegistry)
     */
    open var shadowRootCustomElementRegistry: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLSlotElement interface of the Shadow DOM API enables access to the name and assigned nodes of an HTML
 * &lt;slot&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement)
 */
public abstract external class HTMLSlotElement : HTMLElement {
    /**
     * The name property of the HTMLSlotElement interface returns or sets the slot name. A slot is a placeholder inside
     * a web component that users can fill with their own markup.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/name)
     */
    open var name: String

    /**
     * The assignedNodes() method of the HTMLSlotElement interface returns a sequence of the nodes assigned to this
     * slot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedNodes)
     */
    open fun assignedNodes(options: AssignedNodesOptions = definedExternally): JsArray<Node>

    /**
     * The assignedElements() method of the HTMLSlotElement interface returns a sequence of the elements assigned to
     * this slot (and no other nodes).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assignedElements)
     */
    open fun assignedElements(options: AssignedNodesOptions = definedExternally): JsArray<Element>

    /**
     * The assign() method of the HTMLSlotElement interface sets the slot's manually assigned nodes to an ordered set of
     * slottables. The manually assigned nodes set is initially empty until nodes are assigned using assign().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLSlotElement/assign)
     */
    open fun assign(vararg nodes: UnionElementOrText)

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface AssignedNodesOptions : JsAny {
    var flatten: Boolean?
}

public fun AssignedNodesOptions(flatten: Boolean? = null): AssignedNodesOptions = newJsObject<AssignedNodesOptions>().apply {
    if (flatten != null) this.flatten = flatten
}

/**
 * The HTMLCanvasElement interface provides properties and methods for manipulating the layout and presentation of
 * &lt;canvas&gt; elements. The HTMLCanvasElement interface also inherits the properties and methods of the HTMLElement
 * interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement)
 */
public abstract external class HTMLCanvasElement : HTMLElement, UnionHTMLCanvasElementOrOffscreenCanvas {
    /**
     * The HTMLCanvasElement.width property is a positive integer reflecting the width HTML attribute of the
     * &lt;canvas&gt; element interpreted in CSS pixels. When the attribute is not specified, or if it is set to an
     * invalid value, like a negative, the default value of 300 is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/width)
     */
    open var width: Int

    /**
     * The HTMLCanvasElement.height property is a positive integer reflecting the height HTML attribute of the
     * &lt;canvas&gt; element interpreted in CSS pixels. When the attribute is not specified, or if it is set to an
     * invalid value, like a negative, the default value of 150 is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/height)
     */
    open var height: Int

    /**
     * The HTMLCanvasElement.getContext() method returns a drawing context on the canvas, or null if the context
     * identifier is not supported, or the canvas has already been set to a different context mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/getContext)
     */
    open fun getContext(contextId: String, options: JsAny? = definedExternally): RenderingContext?

    /**
     * The HTMLCanvasElement.toDataURL() method returns a data URL containing a representation of the image in the
     * format specified by the type parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toDataURL)
     */
    open fun toDataURL(type: String = definedExternally, quality: JsAny? = definedExternally): String

    /**
     * The HTMLCanvasElement.toBlob() method creates a Blob object representing the image contained in the canvas. This
     * file may be cached on the disk or stored in memory at the discretion of the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/toBlob)
     */
    open fun toBlob(callback: (Blob?) -> Unit, type: String = definedExternally, quality: JsAny? = definedExternally)

    /**
     * The HTMLCanvasElement.transferControlToOffscreen() method transfers control to an OffscreenCanvas object, either
     * on the main thread or on a worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCanvasElement/transferControlToOffscreen)
     */
    open fun transferControlToOffscreen(): OffscreenCanvas

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public external interface CanvasColorType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasColorType.Companion.UNORM8: CanvasColorType get() = "unorm8".toJsString().unsafeCast<CanvasColorType>()
public inline val CanvasColorType.Companion.FLOAT16: CanvasColorType get() = "float16".toJsString().unsafeCast<CanvasColorType>()

public external interface CanvasFillRule : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasFillRule.Companion.NONZERO: CanvasFillRule get() = "nonzero".toJsString().unsafeCast<CanvasFillRule>()
public inline val CanvasFillRule.Companion.EVENODD: CanvasFillRule get() = "evenodd".toJsString().unsafeCast<CanvasFillRule>()

public external interface CanvasRenderingContext2DSettings : JsAny {
    var alpha: Boolean?
    var desynchronized: Boolean?
    var colorSpace: PredefinedColorSpace?
    var colorType: CanvasColorType?
    var willReadFrequently: Boolean?
}

public fun CanvasRenderingContext2DSettings(alpha: Boolean? = null, desynchronized: Boolean? = null, colorSpace: PredefinedColorSpace? = null, colorType: CanvasColorType? = null, willReadFrequently: Boolean? = null): CanvasRenderingContext2DSettings = newJsObject<CanvasRenderingContext2DSettings>().apply {
    if (alpha != null) this.alpha = alpha
    if (desynchronized != null) this.desynchronized = desynchronized
    if (colorSpace != null) this.colorSpace = colorSpace
    if (colorType != null) this.colorType = colorType
    if (willReadFrequently != null) this.willReadFrequently = willReadFrequently
}

public external interface ImageSmoothingQuality : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ImageSmoothingQuality.Companion.LOW: ImageSmoothingQuality get() = "low".toJsString().unsafeCast<ImageSmoothingQuality>()
public inline val ImageSmoothingQuality.Companion.MEDIUM: ImageSmoothingQuality get() = "medium".toJsString().unsafeCast<ImageSmoothingQuality>()
public inline val ImageSmoothingQuality.Companion.HIGH: ImageSmoothingQuality get() = "high".toJsString().unsafeCast<ImageSmoothingQuality>()

/**
 * The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing
 * surface of a &lt;canvas&gt; element. It is used for drawing shapes, text, images, and other objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D)
 */
public abstract external class CanvasRenderingContext2D : CanvasSettings, CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, RenderingContext {
    /**
     * The CanvasRenderingContext2D.canvas property, part of the Canvas API, is a read-only reference to the
     * HTMLCanvasElement object that is associated with a given context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     */
    open val canvas: HTMLCanvasElement
}

public external interface CanvasSettings : JsAny {
    /**
     * The CanvasRenderingContext2D.getContextAttributes() method returns an object that contains attributes used by the
     * context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getContextAttributes)
     */
    fun getContextAttributes(): CanvasRenderingContext2DSettings
}

public external interface CanvasState : JsAny {
    /**
     * The CanvasRenderingContext2D.save() method of the Canvas 2D API saves the entire state of the canvas by pushing
     * the current state onto a stack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/save)
     */
    fun save()

    /**
     * The CanvasRenderingContext2D.restore() method of the Canvas 2D API restores the most recently saved canvas state
     * by popping the top entry in the drawing state stack. If there is no saved state, this method does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/restore)
     */
    fun restore()

    /**
     * The CanvasRenderingContext2D.reset() method of the Canvas 2D API resets the rendering context to its default
     * state, allowing it to be reused for drawing something else without having to explicitly reset all the properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/reset)
     */
    fun reset()

    /**
     * The CanvasRenderingContext2D.isContextLost() method of the Canvas 2D API returns true if the rendering context is
     * lost (and has not yet been reset). This might occur due to driver crashes, running out of memory, and so on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isContextLost)
     */
    fun isContextLost(): Boolean
}

public external interface CanvasTransform : JsAny {
    /**
     * The CanvasRenderingContext2D.scale() method of the Canvas 2D API adds a scaling transformation to the canvas
     * units horizontally and/or vertically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/scale)
     */
    fun scale(x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.rotate() method of the Canvas 2D API adds a rotation to the transformation matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rotate)
     */
    fun rotate(angle: Double)

    /**
     * The CanvasRenderingContext2D.translate() method of the Canvas 2D API adds a translation transformation to the
     * current matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/translate)
     */
    fun translate(x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.transform() method of the Canvas 2D API multiplies the current transformation with
     * the matrix described by the arguments of this method. This lets you scale, rotate, translate (move), and skew the
     * context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/transform)
     */
    fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)

    /**
     * The CanvasRenderingContext2D.getTransform() method of the Canvas 2D API retrieves the current transformation
     * matrix being applied to the context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getTransform)
     */
    fun getTransform(): DOMMatrix

    /**
     * The CanvasRenderingContext2D.setTransform() method of the Canvas 2D API resets (overrides) the current
     * transformation to the identity matrix, and then invokes a transformation described by the arguments of this
     * method. This lets you scale, rotate, translate (move), and skew the context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform)
     */
    fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)

    /**
     * The CanvasRenderingContext2D.setTransform() method of the Canvas 2D API resets (overrides) the current
     * transformation to the identity matrix, and then invokes a transformation described by the arguments of this
     * method. This lets you scale, rotate, translate (move), and skew the context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setTransform)
     */
    fun setTransform(transform: DOMMatrix2DInit = definedExternally)

    /**
     * The CanvasRenderingContext2D.resetTransform() method of the Canvas 2D API resets the current transform to the
     * identity matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/resetTransform)
     */
    fun resetTransform()
}

public external interface CanvasCompositing : JsAny {
    /**
     * The CanvasRenderingContext2D.globalAlpha property of the Canvas 2D API specifies the alpha (transparency) value
     * that is applied to shapes and images before they are drawn onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalAlpha)
     */
    var globalAlpha: Double

    /**
     * The CanvasRenderingContext2D.globalCompositeOperation property of the Canvas 2D API sets the type of compositing
     * operation to apply when drawing new shapes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/globalCompositeOperation)
     */
    var globalCompositeOperation: String
}

public external interface CanvasImageSmoothing : JsAny {
    /**
     * The imageSmoothingEnabled property of the CanvasRenderingContext2D interface, part of the Canvas API, determines
     * whether scaled images are smoothed (true, default) or not (false). On getting the imageSmoothingEnabled property,
     * the last value it was set to is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingEnabled)
     */
    var imageSmoothingEnabled: Boolean

    /**
     * The imageSmoothingQuality property of the CanvasRenderingContext2D interface, part of the Canvas API, lets you
     * set the quality of image smoothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/imageSmoothingQuality)
     */
    var imageSmoothingQuality: ImageSmoothingQuality
}

public external interface CanvasFillStrokeStyles : JsAny {
    /**
     * The CanvasRenderingContext2D.strokeStyle property of the Canvas 2D API specifies the color, gradient, or pattern
     * to use for the strokes (outlines) around shapes. The default is black.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeStyle)
     */
    var strokeStyle: JsAny

    /**
     * The CanvasRenderingContext2D.fillStyle property of the Canvas 2D API specifies the color, gradient, or pattern to
     * use inside shapes. The default style is black.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillStyle)
     */
    var fillStyle: JsAny

    /**
     * The CanvasRenderingContext2D.createLinearGradient() method of the Canvas 2D API creates a gradient along the line
     * connecting two given coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createLinearGradient)
     */
    fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient

    /**
     * The CanvasRenderingContext2D.createRadialGradient() method of the Canvas 2D API creates a radial gradient using
     * the size and coordinates of two circles.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createRadialGradient)
     */
    fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient

    /**
     * The CanvasRenderingContext2D.createConicGradient() method of the Canvas 2D API creates a gradient around a point
     * with given coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createConicGradient)
     */
    fun createConicGradient(startAngle: Double, x: Double, y: Double): CanvasGradient

    /**
     * The CanvasRenderingContext2D.createPattern() method of the Canvas 2D API creates a pattern using the specified
     * image and repetition. This method returns a CanvasPattern.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createPattern)
     */
    fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}

public external interface CanvasShadowStyles : JsAny {
    /**
     * The CanvasRenderingContext2D.shadowOffsetX property of the Canvas 2D API specifies the distance that shadows will
     * be offset horizontally.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetX)
     */
    var shadowOffsetX: Double

    /**
     * The CanvasRenderingContext2D.shadowOffsetY property of the Canvas 2D API specifies the distance that shadows will
     * be offset vertically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowOffsetY)
     */
    var shadowOffsetY: Double

    /**
     * The CanvasRenderingContext2D.shadowBlur property of the Canvas 2D API specifies the amount of blur applied to
     * shadows. The default is 0 (no blur).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowBlur)
     */
    var shadowBlur: Double

    /**
     * The CanvasRenderingContext2D.shadowColor property of the Canvas 2D API specifies the color of shadows.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/shadowColor)
     */
    var shadowColor: String
}

public external interface CanvasFilters : JsAny {
    /**
     * The CanvasRenderingContext2D.filter property of the Canvas 2D API provides filter effects such as blurring and
     * grayscaling. It is similar to the CSS filter property and accepts the same values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/filter)
     */
    var filter: String
}

public external interface CanvasRect : JsAny {
    /**
     * The CanvasRenderingContext2D.clearRect() method of the Canvas 2D API erases the pixels in a rectangular area by
     * setting them to transparent black.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clearRect)
     */
    fun clearRect(x: Double, y: Double, w: Double, h: Double)

    /**
     * The CanvasRenderingContext2D.fillRect() method of the Canvas 2D API draws a rectangle that is filled according to
     * the current fillStyle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillRect)
     */
    fun fillRect(x: Double, y: Double, w: Double, h: Double)

    /**
     * The CanvasRenderingContext2D.strokeRect() method of the Canvas 2D API draws a rectangle that is stroked
     * (outlined) according to the current strokeStyle and other context settings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeRect)
     */
    fun strokeRect(x: Double, y: Double, w: Double, h: Double)
}

public external interface CanvasDrawPath : JsAny {
    /**
     * The CanvasRenderingContext2D.beginPath() method of the Canvas 2D API starts a new path by emptying the list of
     * sub-paths. Call this method when you want to create a new path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/beginPath)
     */
    fun beginPath()

    /**
     * The CanvasRenderingContext2D.fill() method of the Canvas 2D API fills the current or given path with the current
     * fillStyle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill)
     */
    fun fill(fillRule: CanvasFillRule = definedExternally)

    /**
     * The CanvasRenderingContext2D.fill() method of the Canvas 2D API fills the current or given path with the current
     * fillStyle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fill)
     */
    fun fill(path: Path2D, fillRule: CanvasFillRule = definedExternally)

    /**
     * The CanvasRenderingContext2D.stroke() method of the Canvas 2D API strokes (outlines) the current or given path
     * with the current stroke style.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke)
     */
    fun stroke()

    /**
     * The CanvasRenderingContext2D.stroke() method of the Canvas 2D API strokes (outlines) the current or given path
     * with the current stroke style.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/stroke)
     */
    fun stroke(path: Path2D)

    /**
     * The CanvasRenderingContext2D.clip() method of the Canvas 2D API turns the current or given path into the current
     * clipping region. The previous clipping region, if any, is intersected with the current or given path to create
     * the new clipping region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip)
     */
    fun clip(fillRule: CanvasFillRule = definedExternally)

    /**
     * The CanvasRenderingContext2D.clip() method of the Canvas 2D API turns the current or given path into the current
     * clipping region. The previous clipping region, if any, is intersected with the current or given path to create
     * the new clipping region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/clip)
     */
    fun clip(path: Path2D, fillRule: CanvasFillRule = definedExternally)

    /**
     * The CanvasRenderingContext2D.isPointInPath() method of the Canvas 2D API reports whether or not the specified
     * point is contained in the current path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath)
     */
    fun isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule = definedExternally): Boolean

    /**
     * The CanvasRenderingContext2D.isPointInPath() method of the Canvas 2D API reports whether or not the specified
     * point is contained in the current path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInPath)
     */
    fun isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule = definedExternally): Boolean

    /**
     * The CanvasRenderingContext2D.isPointInStroke() method of the Canvas 2D API reports whether or not the specified
     * point is inside the area contained by the stroking of a path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke)
     */
    fun isPointInStroke(x: Double, y: Double): Boolean

    /**
     * The CanvasRenderingContext2D.isPointInStroke() method of the Canvas 2D API reports whether or not the specified
     * point is inside the area contained by the stroking of a path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/isPointInStroke)
     */
    fun isPointInStroke(path: Path2D, x: Double, y: Double): Boolean
}

public external interface CanvasUserInterface : JsAny {
    /**
     * The CanvasRenderingContext2D.drawFocusIfNeeded() method of the Canvas 2D API draws a focus ring around the
     * current or given path, if the specified element is focused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded)
     */
    fun drawFocusIfNeeded(element: Element)

    /**
     * The CanvasRenderingContext2D.drawFocusIfNeeded() method of the Canvas 2D API draws a focus ring around the
     * current or given path, if the specified element is focused.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawFocusIfNeeded)
     */
    fun drawFocusIfNeeded(path: Path2D, element: Element)
}

public external interface CanvasText : JsAny {
    /**
     * The CanvasRenderingContext2D method fillText(), part of the Canvas 2D API, draws a text string at the specified
     * coordinates, filling the string's characters with the current fillStyle. An optional parameter allows specifying
     * a maximum width for the rendered text, which the user agent will achieve by condensing the text or by using a
     * lower font size.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fillText)
     */
    fun fillText(text: String, x: Double, y: Double, maxWidth: Double = definedExternally)

    /**
     * The CanvasRenderingContext2D method strokeText(), part of the Canvas 2D API, strokes — that is, draws the
     * outlines of — the characters of a text string at the specified coordinates. An optional parameter allows
     * specifying a maximum width for the rendered text, which the user agent will achieve by condensing the text or by
     * using a lower font size.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/strokeText)
     */
    fun strokeText(text: String, x: Double, y: Double, maxWidth: Double = definedExternally)

    /**
     * The CanvasRenderingContext2D.measureText() method returns a TextMetrics object that contains information about
     * the measured text (such as its width, for example).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/measureText)
     */
    fun measureText(text: String): TextMetrics
}

public external interface CanvasDrawImage : JsAny {
    /**
     * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image
     * onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     */
    fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)

    /**
     * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image
     * onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     */
    fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)

    /**
     * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image
     * onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     */
    fun drawImage(image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double)
}

public external interface CanvasImageData : JsAny {
    /**
     * The CanvasRenderingContext2D.createImageData() method of the Canvas 2D API creates a new, blank ImageData object
     * with the specified dimensions. All of the pixels in the new object are transparent black.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData)
     */
    fun createImageData(sw: Int, sh: Int, settings: ImageDataSettings = definedExternally): ImageData

    /**
     * The CanvasRenderingContext2D.createImageData() method of the Canvas 2D API creates a new, blank ImageData object
     * with the specified dimensions. All of the pixels in the new object are transparent black.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/createImageData)
     */
    fun createImageData(imageData: ImageData): ImageData

    /**
     * The CanvasRenderingContext2D method getImageData() of the Canvas 2D API returns an ImageData object representing
     * the underlying pixel data for a specified portion of the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getImageData)
     */
    fun getImageData(sx: Int, sy: Int, sw: Int, sh: Int, settings: ImageDataSettings = definedExternally): ImageData

    /**
     * The CanvasRenderingContext2D.putImageData() method of the Canvas 2D API paints data from the given ImageData
     * object onto the canvas. If a dirty rectangle is provided, only the pixels from that rectangle are painted. This
     * method is not affected by the canvas transformation matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData)
     */
    fun putImageData(imageData: ImageData, dx: Int, dy: Int)

    /**
     * The CanvasRenderingContext2D.putImageData() method of the Canvas 2D API paints data from the given ImageData
     * object onto the canvas. If a dirty rectangle is provided, only the pixels from that rectangle are painted. This
     * method is not affected by the canvas transformation matrix.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/putImageData)
     */
    fun putImageData(imageData: ImageData, dx: Int, dy: Int, dirtyX: Int, dirtyY: Int, dirtyWidth: Int, dirtyHeight: Int)
}

public external interface CanvasLineCap : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasLineCap.Companion.BUTT: CanvasLineCap get() = "butt".toJsString().unsafeCast<CanvasLineCap>()
public inline val CanvasLineCap.Companion.ROUND: CanvasLineCap get() = "round".toJsString().unsafeCast<CanvasLineCap>()
public inline val CanvasLineCap.Companion.SQUARE: CanvasLineCap get() = "square".toJsString().unsafeCast<CanvasLineCap>()

public external interface CanvasLineJoin : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasLineJoin.Companion.ROUND: CanvasLineJoin get() = "round".toJsString().unsafeCast<CanvasLineJoin>()
public inline val CanvasLineJoin.Companion.BEVEL: CanvasLineJoin get() = "bevel".toJsString().unsafeCast<CanvasLineJoin>()
public inline val CanvasLineJoin.Companion.MITER: CanvasLineJoin get() = "miter".toJsString().unsafeCast<CanvasLineJoin>()

public external interface CanvasTextAlign : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasTextAlign.Companion.START: CanvasTextAlign get() = "start".toJsString().unsafeCast<CanvasTextAlign>()
public inline val CanvasTextAlign.Companion.END: CanvasTextAlign get() = "end".toJsString().unsafeCast<CanvasTextAlign>()
public inline val CanvasTextAlign.Companion.LEFT: CanvasTextAlign get() = "left".toJsString().unsafeCast<CanvasTextAlign>()
public inline val CanvasTextAlign.Companion.RIGHT: CanvasTextAlign get() = "right".toJsString().unsafeCast<CanvasTextAlign>()
public inline val CanvasTextAlign.Companion.CENTER: CanvasTextAlign get() = "center".toJsString().unsafeCast<CanvasTextAlign>()

public external interface CanvasTextBaseline : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasTextBaseline.Companion.TOP: CanvasTextBaseline get() = "top".toJsString().unsafeCast<CanvasTextBaseline>()
public inline val CanvasTextBaseline.Companion.HANGING: CanvasTextBaseline get() = "hanging".toJsString().unsafeCast<CanvasTextBaseline>()
public inline val CanvasTextBaseline.Companion.MIDDLE: CanvasTextBaseline get() = "middle".toJsString().unsafeCast<CanvasTextBaseline>()
public inline val CanvasTextBaseline.Companion.ALPHABETIC: CanvasTextBaseline get() = "alphabetic".toJsString().unsafeCast<CanvasTextBaseline>()
public inline val CanvasTextBaseline.Companion.IDEOGRAPHIC: CanvasTextBaseline get() = "ideographic".toJsString().unsafeCast<CanvasTextBaseline>()
public inline val CanvasTextBaseline.Companion.BOTTOM: CanvasTextBaseline get() = "bottom".toJsString().unsafeCast<CanvasTextBaseline>()

public external interface CanvasDirection : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasDirection.Companion.LTR: CanvasDirection get() = "ltr".toJsString().unsafeCast<CanvasDirection>()
public inline val CanvasDirection.Companion.RTL: CanvasDirection get() = "rtl".toJsString().unsafeCast<CanvasDirection>()
public inline val CanvasDirection.Companion.INHERIT: CanvasDirection get() = "inherit".toJsString().unsafeCast<CanvasDirection>()

public external interface CanvasFontKerning : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasFontKerning.Companion.AUTO: CanvasFontKerning get() = "auto".toJsString().unsafeCast<CanvasFontKerning>()
public inline val CanvasFontKerning.Companion.NORMAL: CanvasFontKerning get() = "normal".toJsString().unsafeCast<CanvasFontKerning>()
public inline val CanvasFontKerning.Companion.NONE: CanvasFontKerning get() = "none".toJsString().unsafeCast<CanvasFontKerning>()

public external interface CanvasFontStretch : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasFontStretch.Companion.ULTRA_CONDENSED: CanvasFontStretch get() = "ultra-condensed".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.EXTRA_CONDENSED: CanvasFontStretch get() = "extra-condensed".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.CONDENSED: CanvasFontStretch get() = "condensed".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.SEMI_CONDENSED: CanvasFontStretch get() = "semi-condensed".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.NORMAL: CanvasFontStretch get() = "normal".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.SEMI_EXPANDED: CanvasFontStretch get() = "semi-expanded".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.EXPANDED: CanvasFontStretch get() = "expanded".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.EXTRA_EXPANDED: CanvasFontStretch get() = "extra-expanded".toJsString().unsafeCast<CanvasFontStretch>()
public inline val CanvasFontStretch.Companion.ULTRA_EXPANDED: CanvasFontStretch get() = "ultra-expanded".toJsString().unsafeCast<CanvasFontStretch>()

public external interface CanvasFontVariantCaps : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasFontVariantCaps.Companion.NORMAL: CanvasFontVariantCaps get() = "normal".toJsString().unsafeCast<CanvasFontVariantCaps>()
public inline val CanvasFontVariantCaps.Companion.SMALL_CAPS: CanvasFontVariantCaps get() = "small-caps".toJsString().unsafeCast<CanvasFontVariantCaps>()
public inline val CanvasFontVariantCaps.Companion.ALL_SMALL_CAPS: CanvasFontVariantCaps get() = "all-small-caps".toJsString().unsafeCast<CanvasFontVariantCaps>()
public inline val CanvasFontVariantCaps.Companion.PETITE_CAPS: CanvasFontVariantCaps get() = "petite-caps".toJsString().unsafeCast<CanvasFontVariantCaps>()
public inline val CanvasFontVariantCaps.Companion.ALL_PETITE_CAPS: CanvasFontVariantCaps get() = "all-petite-caps".toJsString().unsafeCast<CanvasFontVariantCaps>()
public inline val CanvasFontVariantCaps.Companion.UNICASE: CanvasFontVariantCaps get() = "unicase".toJsString().unsafeCast<CanvasFontVariantCaps>()
public inline val CanvasFontVariantCaps.Companion.TITLING_CAPS: CanvasFontVariantCaps get() = "titling-caps".toJsString().unsafeCast<CanvasFontVariantCaps>()

public external interface CanvasTextRendering : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val CanvasTextRendering.Companion.AUTO: CanvasTextRendering get() = "auto".toJsString().unsafeCast<CanvasTextRendering>()
public inline val CanvasTextRendering.Companion.OPTIMIZE_SPEED: CanvasTextRendering get() = "optimizeSpeed".toJsString().unsafeCast<CanvasTextRendering>()
public inline val CanvasTextRendering.Companion.OPTIMIZE_LEGIBILITY: CanvasTextRendering get() = "optimizeLegibility".toJsString().unsafeCast<CanvasTextRendering>()
public inline val CanvasTextRendering.Companion.GEOMETRIC_PRECISION: CanvasTextRendering get() = "geometricPrecision".toJsString().unsafeCast<CanvasTextRendering>()

public external interface CanvasPathDrawingStyles : JsAny {
    /**
     * The CanvasRenderingContext2D.lineWidth property of the Canvas 2D API sets the thickness of lines.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineWidth)
     */
    var lineWidth: Double

    /**
     * The CanvasRenderingContext2D.lineCap property of the Canvas 2D API determines the shape used to draw the end
     * points of lines.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineCap)
     */
    var lineCap: CanvasLineCap

    /**
     * The CanvasRenderingContext2D.lineJoin property of the Canvas 2D API determines the shape used to join two line
     * segments where they meet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineJoin)
     */
    var lineJoin: CanvasLineJoin

    /**
     * The CanvasRenderingContext2D.miterLimit property of the Canvas 2D API sets the miter limit ratio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/miterLimit)
     */
    var miterLimit: Double

    /**
     * The setLineDash() method of the Canvas 2D API's CanvasRenderingContext2D interface sets the line dash pattern
     * used when stroking lines. It uses an array of values that specify alternating lengths of lines and gaps which
     * describe the pattern.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/setLineDash)
     */
    fun setLineDash(segments: JsArray<JsNumber>)

    /**
     * The getLineDash() method of the Canvas 2D API's CanvasRenderingContext2D interface gets the current line dash
     * pattern.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getLineDash)
     */
    fun getLineDash(): JsArray<JsNumber>

    /**
     * The CanvasRenderingContext2D.lineDashOffset property of the Canvas 2D API sets the line dash offset, or "phase."
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineDashOffset)
     */
    var lineDashOffset: Double
}

public external interface CanvasTextDrawingStyles : JsAny {
    /**
     * The CanvasRenderingContext2D.lang property of the Canvas 2D API gets or sets the language of the canvas drawing
     * context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lang)
     */
    var lang: String

    /**
     * The CanvasRenderingContext2D.font property of the Canvas 2D API specifies the current text style to use when
     * drawing text. This string uses the same syntax as the CSS font specifier.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/font)
     */
    var font: String

    /**
     * The CanvasRenderingContext2D.textAlign property of the Canvas 2D API specifies the current text alignment used
     * when drawing text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textAlign)
     */
    var textAlign: CanvasTextAlign

    /**
     * The CanvasRenderingContext2D.textBaseline property of the Canvas 2D API specifies the current text baseline used
     * when drawing text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textBaseline)
     */
    var textBaseline: CanvasTextBaseline

    /**
     * The CanvasRenderingContext2D.direction property of the Canvas 2D API specifies the current text direction used to
     * draw text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/direction)
     */
    var direction: CanvasDirection

    /**
     * The CanvasRenderingContext2D.letterSpacing property of the Canvas API specifies the spacing between letters when
     * drawing text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/letterSpacing)
     */
    var letterSpacing: String

    /**
     * The CanvasRenderingContext2D.fontKerning property of the Canvas API specifies how font kerning information is
     * used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontKerning)
     */
    var fontKerning: CanvasFontKerning

    /**
     * The CanvasRenderingContext2D.fontStretch property of the Canvas API specifies how the font may be expanded or
     * condensed when drawing text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontStretch)
     */
    var fontStretch: CanvasFontStretch

    /**
     * The CanvasRenderingContext2D.fontVariantCaps property of the Canvas API specifies an alternative capitalization
     * of the rendered text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/fontVariantCaps)
     */
    var fontVariantCaps: CanvasFontVariantCaps

    /**
     * The CanvasRenderingContext2D.textRendering property of the Canvas API provides information to the rendering
     * engine about what to optimize for when rendering text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/textRendering)
     */
    var textRendering: CanvasTextRendering

    /**
     * The CanvasRenderingContext2D.wordSpacing property of the Canvas API specifies the spacing between words when
     * drawing text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/wordSpacing)
     */
    var wordSpacing: String
}

public external interface CanvasPath : JsAny {
    /**
     * The CanvasRenderingContext2D.closePath() method of the Canvas 2D API attempts to add a straight line from the
     * current point to the start of the current sub-path. If the shape has already been closed or has only one point,
     * this function does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/closePath)
     */
    fun closePath()

    /**
     * The CanvasRenderingContext2D.moveTo() method of the Canvas 2D API begins a new sub-path at the point specified by
     * the given (x, y) coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/moveTo)
     */
    fun moveTo(x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D method lineTo(), part of the Canvas 2D API, adds a straight line to the current
     * sub-path by connecting the sub-path's last point to the specified (x, y) coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineTo)
     */
    fun lineTo(x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.quadraticCurveTo() method of the Canvas 2D API adds a quadratic Bézier curve to the
     * current sub-path. It requires two points: the first one is a control point and the second one is the end point.
     * The starting point is the latest point in the current path, which can be changed using moveTo() before creating
     * the quadratic Bézier curve.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo)
     */
    fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.bezierCurveTo() method of the Canvas 2D API adds a cubic Bézier curve to the current
     * sub-path. It requires three points: the first two are control points and the third one is the end point. The
     * starting point is the latest point in the current path, which can be changed using moveTo() before creating the
     * Bézier curve.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo)
     */
    fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.arcTo() method of the Canvas 2D API adds a circular arc to the current sub-path,
     * using the given control points and radius. The arc is automatically connected to the path's latest point with a
     * straight line if necessary, for example if the starting point and control points are in a line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arcTo)
     */
    fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)

    /**
     * The CanvasRenderingContext2D.rect() method of the Canvas 2D API adds a rectangle to the current path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rect)
     */
    fun rect(x: Double, y: Double, w: Double, h: Double)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: Double)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: DOMPointInit)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: JsArray<JsAny>)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    fun roundRect(x: Double, y: Double, w: Double, h: Double)

    /**
     * The CanvasRenderingContext2D.arc() method of the Canvas 2D API adds a circular arc to the current sub-path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc)
     */
    fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean = definedExternally)

    /**
     * The CanvasRenderingContext2D.ellipse() method of the Canvas 2D API adds an elliptical arc to the current
     * sub-path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse)
     */
    fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean = definedExternally)
}

/**
 * The CanvasGradient interface represents an opaque object describing a gradient. It is returned by the methods
 * CanvasRenderingContext2D.createLinearGradient(), CanvasRenderingContext2D.createConicGradient() or
 * CanvasRenderingContext2D.createRadialGradient().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasGradient)
 */
public abstract external class CanvasGradient : JsAny {
    /**
     * The CanvasGradient.addColorStop() method adds a new color stop, defined by an offset and a color, to a given
     * canvas gradient.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasGradient/addColorStop)
     */
    open fun addColorStop(offset: Double, color: String)
}

/**
 * The CanvasPattern interface represents an opaque object describing a pattern, based on an image, a canvas, or a
 * video, created by the CanvasRenderingContext2D.createPattern() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasPattern)
 */
public abstract external class CanvasPattern : JsAny {
    /**
     * The CanvasPattern.setTransform() method uses a DOMMatrix object as the pattern's transformation matrix and
     * invokes it on the pattern.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasPattern/setTransform)
     */
    open fun setTransform(transform: DOMMatrix2DInit = definedExternally)
}

/**
 * The TextMetrics interface represents the dimensions of a piece of text in the canvas; a TextMetrics instance can be
 * retrieved using the CanvasRenderingContext2D.measureText() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics)
 */
public abstract external class TextMetrics : JsAny {
    /**
     * The read-only width property of the TextMetrics interface contains the text's advance width (the width of that
     * inline box) in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/width)
     */
    open val width: Double

    /**
     * The read-only actualBoundingBoxLeft property of the TextMetrics interface is a double giving the distance
     * parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign property to the
     * left side of the bounding rectangle of the given text, in CSS pixels; positive numbers indicating a distance
     * going left from the given alignment point.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxLeft)
     */
    open val actualBoundingBoxLeft: Double

    /**
     * The read-only actualBoundingBoxRight property of the TextMetrics interface is a double giving the distance
     * parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign property to the
     * right side of the bounding rectangle of the given text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxRight)
     */
    open val actualBoundingBoxRight: Double

    /**
     * The read-only fontBoundingBoxAscent property of the TextMetrics interface returns the distance from the
     * horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute, to the top of the highest
     * bounding rectangle of all the fonts used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxAscent)
     */
    open val fontBoundingBoxAscent: Double

    /**
     * The read-only fontBoundingBoxDescent property of the TextMetrics interface returns the distance from the
     * horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the bottom of the bounding
     * rectangle of all the fonts used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxDescent)
     */
    open val fontBoundingBoxDescent: Double

    /**
     * The read-only actualBoundingBoxAscent property of the TextMetrics interface is a double giving the distance from
     * the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the top of the bounding
     * rectangle used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxAscent)
     */
    open val actualBoundingBoxAscent: Double

    /**
     * The read-only actualBoundingBoxDescent property of the TextMetrics interface is a double giving the distance from
     * the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the bottom of the
     * bounding rectangle used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxDescent)
     */
    open val actualBoundingBoxDescent: Double

    /**
     * The read-only emHeightAscent property of the TextMetrics interface returns the distance from the horizontal line
     * indicated by the CanvasRenderingContext2D.textBaseline property to the top of the em square in the line box, in
     * CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightAscent)
     */
    open val emHeightAscent: Double

    /**
     * The read-only emHeightDescent property of the TextMetrics interface returns the distance from the horizontal line
     * indicated by the CanvasRenderingContext2D.textBaseline property to the bottom of the em square in the line box,
     * in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightDescent)
     */
    open val emHeightDescent: Double

    /**
     * The read-only hangingBaseline property of the TextMetrics interface is a double giving the distance from the
     * horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the hanging baseline of the
     * line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/hangingBaseline)
     */
    open val hangingBaseline: Double

    /**
     * The read-only alphabeticBaseline property of the TextMetrics interface is a double giving the distance from the
     * horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the alphabetic baseline of the
     * line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/alphabeticBaseline)
     */
    open val alphabeticBaseline: Double

    /**
     * The read-only ideographicBaseline property of the TextMetrics interface is a double giving the distance from the
     * horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the ideographic baseline of
     * the line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/ideographicBaseline)
     */
    open val ideographicBaseline: Double
}

/**
 * The Path2D interface of the Canvas 2D API is used to declare a path that can then be used on a
 * CanvasRenderingContext2D object. The path methods of the CanvasRenderingContext2D interface are also present on this
 * interface, which gives you the convenience of being able to retain and replay your path whenever desired.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D)
 */
public open external class Path2D : CanvasPath {
    /**
     * The Path2D() constructor returns a newly instantiated Path2D object, optionally with another path as an argument
     * (creates a copy), or optionally with a string consisting of SVG path data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/Path2D)
     */
    constructor(path: Path2D)

    /**
     * The Path2D() constructor returns a newly instantiated Path2D object, optionally with another path as an argument
     * (creates a copy), or optionally with a string consisting of SVG path data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/Path2D)
     */
    constructor(path: String)

    /**
     * The Path2D() constructor returns a newly instantiated Path2D object, optionally with another path as an argument
     * (creates a copy), or optionally with a string consisting of SVG path data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/Path2D)
     */
    constructor()

    /**
     * The Path2D.addPath() method of the Canvas 2D API adds one Path2D object to another Path2D object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Path2D/addPath)
     */
    open fun addPath(path: Path2D, transform: DOMMatrix2DInit = definedExternally)

    /**
     * The CanvasRenderingContext2D.closePath() method of the Canvas 2D API attempts to add a straight line from the
     * current point to the start of the current sub-path. If the shape has already been closed or has only one point,
     * this function does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/closePath)
     */
    override fun closePath()

    /**
     * The CanvasRenderingContext2D.moveTo() method of the Canvas 2D API begins a new sub-path at the point specified by
     * the given (x, y) coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/moveTo)
     */
    override fun moveTo(x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D method lineTo(), part of the Canvas 2D API, adds a straight line to the current
     * sub-path by connecting the sub-path's last point to the specified (x, y) coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/lineTo)
     */
    override fun lineTo(x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.quadraticCurveTo() method of the Canvas 2D API adds a quadratic Bézier curve to the
     * current sub-path. It requires two points: the first one is a control point and the second one is the end point.
     * The starting point is the latest point in the current path, which can be changed using moveTo() before creating
     * the quadratic Bézier curve.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/quadraticCurveTo)
     */
    override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.bezierCurveTo() method of the Canvas 2D API adds a cubic Bézier curve to the current
     * sub-path. It requires three points: the first two are control points and the third one is the end point. The
     * starting point is the latest point in the current path, which can be changed using moveTo() before creating the
     * Bézier curve.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/bezierCurveTo)
     */
    override fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)

    /**
     * The CanvasRenderingContext2D.arcTo() method of the Canvas 2D API adds a circular arc to the current sub-path,
     * using the given control points and radius. The arc is automatically connected to the path's latest point with a
     * straight line if necessary, for example if the starting point and control points are in a line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arcTo)
     */
    override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)

    /**
     * The CanvasRenderingContext2D.rect() method of the Canvas 2D API adds a rectangle to the current path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/rect)
     */
    override fun rect(x: Double, y: Double, w: Double, h: Double)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    override fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: Double)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    override fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: DOMPointInit)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    override fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: JsArray<JsAny>)

    /**
     * The CanvasRenderingContext2D.roundRect() method of the Canvas 2D API adds a rounded rectangle to the current
     * path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/roundRect)
     */
    override fun roundRect(x: Double, y: Double, w: Double, h: Double)

    /**
     * The CanvasRenderingContext2D.arc() method of the Canvas 2D API adds a circular arc to the current sub-path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/arc)
     */
    override fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean)

    /**
     * The CanvasRenderingContext2D.ellipse() method of the Canvas 2D API adds an elliptical arc to the current
     * sub-path.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/ellipse)
     */
    override fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean)
}

/**
 * The ImageBitmapRenderingContext interface is a canvas rendering context that provides the functionality to replace
 * the canvas's contents with the given ImageBitmap. Its context id (the first argument to
 * HTMLCanvasElement.getContext() or OffscreenCanvas.getContext()) is "bitmaprenderer".
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext)
 */
public abstract external class ImageBitmapRenderingContext : RenderingContext, OffscreenRenderingContext {
    /**
     * The ImageBitmapRenderingContext.canvas property, part of the Canvas API, is a read-only reference to the
     * HTMLCanvasElement or OffscreenCanvas object that is associated with the given context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/canvas)
     */
    open val canvas: UnionHTMLCanvasElementOrOffscreenCanvas

    /**
     * The ImageBitmapRenderingContext.transferFromImageBitmap() method displays the given ImageBitmap in the canvas
     * associated with this rendering context. The ownership of the ImageBitmap is transferred to the canvas as well.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmapRenderingContext/transferFromImageBitmap)
     */
    open fun transferFromImageBitmap(bitmap: ImageBitmap?)
}

public external interface ImageBitmapRenderingContextSettings : JsAny {
    var alpha: Boolean?
}

public fun ImageBitmapRenderingContextSettings(alpha: Boolean? = null): ImageBitmapRenderingContextSettings = newJsObject<ImageBitmapRenderingContextSettings>().apply {
    if (alpha != null) this.alpha = alpha
}

public external interface ImageEncodeOptions : JsAny {
    var type: String?
    var quality: Double?
}

public fun ImageEncodeOptions(type: String? = null, quality: Double? = null): ImageEncodeOptions = newJsObject<ImageEncodeOptions>().apply {
    if (type != null) this.type = type
    if (quality != null) this.quality = quality
}

public external interface OffscreenRenderingContextId : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val OffscreenRenderingContextId.Companion._2D: OffscreenRenderingContextId get() = "2d".toJsString().unsafeCast<OffscreenRenderingContextId>()
public inline val OffscreenRenderingContextId.Companion.BITMAPRENDERER: OffscreenRenderingContextId get() = "bitmaprenderer".toJsString().unsafeCast<OffscreenRenderingContextId>()
public inline val OffscreenRenderingContextId.Companion.WEBGL: OffscreenRenderingContextId get() = "webgl".toJsString().unsafeCast<OffscreenRenderingContextId>()
public inline val OffscreenRenderingContextId.Companion.WEBGL2: OffscreenRenderingContextId get() = "webgl2".toJsString().unsafeCast<OffscreenRenderingContextId>()
public inline val OffscreenRenderingContextId.Companion.WEBGPU: OffscreenRenderingContextId get() = "webgpu".toJsString().unsafeCast<OffscreenRenderingContextId>()

/**
 * When using the &lt;canvas&gt; element or the Canvas API, rendering, animation, and user interaction usually happen on
 * the main execution thread of a web application. The computation relating to canvas animations and rendering can have
 * a significant impact on application performance.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas)
 */
public open external class OffscreenCanvas : EventTarget, UnionHTMLCanvasElementOrOffscreenCanvas {
    /**
     * The OffscreenCanvas() constructor returns a newly instantiated OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/OffscreenCanvas)
     */
    constructor(width: Double, height: Double)

    /**
     * The width property returns and sets the width of an OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/width)
     */
    open var width: Double

    /**
     * The height property returns and sets the height of an OffscreenCanvas object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/height)
     */
    open var height: Double

    /**
     * The OffscreenCanvas.getContext() method returns a drawing context for an offscreen canvas, or null if the context
     * identifier is not supported, or the offscreen canvas has already been set to a different context mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/getContext)
     */
    open fun getContext(contextId: OffscreenRenderingContextId, options: JsAny? = definedExternally): OffscreenRenderingContext?

    /**
     * The transferToImageBitmap() method of the OffscreenCanvas interface creates an ImageBitmap object from the most
     * recently rendered image of the OffscreenCanvas. The image in the OffscreenCanvas is replaced with a new blank
     * image for subsequent rendering.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/transferToImageBitmap)
     */
    open fun transferToImageBitmap(): ImageBitmap

    /**
     * The OffscreenCanvas.convertToBlob() method creates a Blob object representing the image contained in the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/convertToBlob)
     */
    open fun convertToBlob(options: ImageEncodeOptions = definedExternally): Promise<Blob>

    /**
     * The contextlost event of the OffscreenCanvas interface is fired if the browser detects that the
     * OffscreenCanvasRenderingContext2D context is lost. Contexts can be lost for several reasons, such as an
     * associated GPU driver crashes, or the application runs out of memory, and so on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextlost_event)
     */
    open var oncontextlost: ((Event) -> Unit)?

    /**
     * The contextrestored event of the OffscreenCanvas interface is fired if the browser restores an
     * OffscreenCanvasRenderingContext2D context that was previously lost.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvas/contextrestored_event)
     */
    open var oncontextrestored: ((Event) -> Unit)?
}

/**
 * The OffscreenCanvasRenderingContext2D interface is a CanvasRenderingContext2D rendering context for drawing to the
 * bitmap of an OffscreenCanvas object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OffscreenCanvasRenderingContext2D)
 */
public abstract external class OffscreenCanvasRenderingContext2D : CanvasSettings, CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, OffscreenRenderingContext {
    /**
     * The CanvasRenderingContext2D.canvas property, part of the Canvas API, is a read-only reference to the
     * HTMLCanvasElement object that is associated with a given context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     */
    open val canvas: OffscreenCanvas
}

public external interface PredefinedColorSpace : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val PredefinedColorSpace.Companion.SRGB: PredefinedColorSpace get() = "srgb".toJsString().unsafeCast<PredefinedColorSpace>()
public inline val PredefinedColorSpace.Companion.SRGB_LINEAR: PredefinedColorSpace get() = "srgb-linear".toJsString().unsafeCast<PredefinedColorSpace>()
public inline val PredefinedColorSpace.Companion.DISPLAY_P3: PredefinedColorSpace get() = "display-p3".toJsString().unsafeCast<PredefinedColorSpace>()
public inline val PredefinedColorSpace.Companion.DISPLAY_P3_LINEAR: PredefinedColorSpace get() = "display-p3-linear".toJsString().unsafeCast<PredefinedColorSpace>()

/**
 * The CustomElementRegistry interface provides methods for registering custom elements and querying registered
 * elements. To get an instance of it, use the window.customElements property. To create a scoped registry, use the
 * CustomElementRegistry() constructor.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry)
 */
public open external class CustomElementRegistry : JsAny {
    /**
     * The CustomElementRegistry() constructor creates a new CustomElementRegistry object for scoped usage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/CustomElementRegistry)
     */
    constructor()

    /**
     * The define() method of the CustomElementRegistry interface adds a definition for a custom element to the custom
     * element registry, mapping its name to the constructor which will be used to create it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/define)
     */
    open fun define(name: String, constructor: () -> HTMLElement, options: ElementDefinitionOptions = definedExternally)

    /**
     * The get() method of the CustomElementRegistry interface returns the constructor for a previously-defined custom
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/get)
     */
    open fun get(name: String): (() -> HTMLElement)?

    /**
     * The getName() method of the CustomElementRegistry interface returns the name for a previously-defined custom
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/getName)
     */
    open fun getName(constructor: () -> HTMLElement): String?

    /**
     * The whenDefined() method of the CustomElementRegistry interface returns a Promise that resolves when the named
     * element is defined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/whenDefined)
     */
    open fun whenDefined(name: String): Promise<JsAny>

    /**
     * The upgrade() method of the CustomElementRegistry interface upgrades all shadow-containing custom elements in a
     * Node subtree, even before they are connected to the main document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/upgrade)
     */
    open fun upgrade(root: Node)

    /**
     * The initialize() method of the CustomElementRegistry interface associates this registry with a DOM subtree,
     * setting the customElementRegistry of each inclusive descendant that doesn't already have one, and attempting to
     * upgrade any custom elements found.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomElementRegistry/initialize)
     */
    open fun initialize(root: Node)
}

public external interface ElementDefinitionOptions : JsAny {
    var extends: String?
}

public fun ElementDefinitionOptions(extends: String? = null): ElementDefinitionOptions = newJsObject<ElementDefinitionOptions>().apply {
    if (extends != null) this.extends = extends
}

/**
 * The ElementInternals interface of the Document Object Model gives web developers a way to allow custom elements to
 * fully participate in HTML forms. It provides utilities for working with these elements in the same way you would work
 * with any standard HTML form element, and also exposes the Accessibility Object Model to the element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals)
 */
public abstract external class ElementInternals : ARIAMixin {
    /**
     * The shadowRoot read-only property of the ElementInternals interface returns the ShadowRoot for this element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/shadowRoot)
     */
    open val shadowRoot: ShadowRoot?

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: File?, state: File?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: File?, state: String?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: File?, state: FormData?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: File?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: String?, state: File?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: String?, state: String?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: String?, state: FormData?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: String?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: FormData?, state: File?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: FormData?, state: String?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: FormData?, state: FormData?)

    /**
     * The setFormValue() method of the ElementInternals interface sets the element's submission value and state,
     * communicating these to the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setFormValue)
     */
    open fun setFormValue(value: FormData?)

    /**
     * The form read-only property of the ElementInternals interface returns the HTMLFormElement associated with this
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/form)
     */
    open val form: HTMLFormElement?

    /**
     * The setValidity() method of the ElementInternals interface sets the validity of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/setValidity)
     */
    open fun setValidity(flags: ValidityStateFlags = definedExternally, message: String = definedExternally, anchor: HTMLElement = definedExternally)

    /**
     * The willValidate read-only property of the ElementInternals interface returns true if the element is a
     * submittable element that is a candidate for constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/willValidate)
     */
    open val willValidate: Boolean

    /**
     * The validity read-only property of the ElementInternals interface returns a ValidityState object which represents
     * the different validity states the element can be in, with respect to constraint validation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validity)
     */
    open val validity: ValidityState

    /**
     * The validationMessage read-only property of the ElementInternals interface returns the validation message for the
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/validationMessage)
     */
    open val validationMessage: String

    /**
     * The checkValidity() method of the ElementInternals interface checks if the element meets any constraint
     * validation rules applied to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/checkValidity)
     */
    open fun checkValidity(): Boolean

    /**
     * The reportValidity() method of the ElementInternals interface checks if the element meets any constraint
     * validation rules applied to it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/reportValidity)
     */
    open fun reportValidity(): Boolean

    /**
     * The labels read-only property of the ElementInternals interface returns the labels associated with the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/labels)
     */
    open val labels: NodeList

    /**
     * The states read-only property of the ElementInternals interface returns a CustomStateSet representing the
     * possible states of the custom element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/states)
     */
    open val states: CustomStateSet
}

public external interface ValidityStateFlags : JsAny {
    var valueMissing: Boolean?
    var typeMismatch: Boolean?
    var patternMismatch: Boolean?
    var tooLong: Boolean?
    var tooShort: Boolean?
    var rangeUnderflow: Boolean?
    var rangeOverflow: Boolean?
    var stepMismatch: Boolean?
    var badInput: Boolean?
    var customError: Boolean?
}

public fun ValidityStateFlags(valueMissing: Boolean? = null, typeMismatch: Boolean? = null, patternMismatch: Boolean? = null, tooLong: Boolean? = null, tooShort: Boolean? = null, rangeUnderflow: Boolean? = null, rangeOverflow: Boolean? = null, stepMismatch: Boolean? = null, badInput: Boolean? = null, customError: Boolean? = null): ValidityStateFlags = newJsObject<ValidityStateFlags>().apply {
    if (valueMissing != null) this.valueMissing = valueMissing
    if (typeMismatch != null) this.typeMismatch = typeMismatch
    if (patternMismatch != null) this.patternMismatch = patternMismatch
    if (tooLong != null) this.tooLong = tooLong
    if (tooShort != null) this.tooShort = tooShort
    if (rangeUnderflow != null) this.rangeUnderflow = rangeUnderflow
    if (rangeOverflow != null) this.rangeOverflow = rangeOverflow
    if (stepMismatch != null) this.stepMismatch = stepMismatch
    if (badInput != null) this.badInput = badInput
    if (customError != null) this.customError = customError
}

/**
 * The CustomStateSet interface of the Document Object Model stores a list of states for an autonomous custom element,
 * and allows states to be added and removed from the set.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomStateSet)
 */
public abstract external class CustomStateSet : JsAny {
    // not printed yet: setlike
}

/**
 * The VisibilityStateEntry interface provides timings of page visibility state changes, i.e., when a tab changes from
 * the foreground to the background or vice versa.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisibilityStateEntry)
 */
public abstract external class VisibilityStateEntry : PerformanceEntry {
    override val name: String
    override val entryType: String
    override val startTime: Double
}

/**
 * The UserActivation interface provides information about whether a user is currently interacting with the page, or has
 * completed an interaction since page load.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UserActivation)
 */
public abstract external class UserActivation : JsAny {
    /**
     * The read-only hasBeenActive property of the UserActivation interface indicates whether the current window has
     * sticky user activation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UserActivation/hasBeenActive)
     */
    open val hasBeenActive: Boolean

    /**
     * The read-only isActive property of the UserActivation interface indicates whether the current window has
     * transient user activation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UserActivation/isActive)
     */
    open val isActive: Boolean
}

/**
 * The ToggleEvent interface represents an event that fires when a popover element is toggled between being shown and
 * hidden.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent)
 */
public open external class ToggleEvent : Event {
    /**
     * The ToggleEvent() constructor creates a new ToggleEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/ToggleEvent)
     */
    constructor(type: String, eventInitDict: ToggleEventInit = definedExternally)

    /**
     * The oldState read-only property of the ToggleEvent interface is a string representing the state the element is
     * transitioning from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/oldState)
     */
    open val oldState: String

    /**
     * The newState read-only property of the ToggleEvent interface is a string representing the state the element is
     * transitioning to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/newState)
     */
    open val newState: String

    /**
     * The source read-only property of the ToggleEvent interface is an Element object instance representing the HTML
     * popover control element that initiated the toggle.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ToggleEvent/source)
     */
    open val source: Element?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ToggleEventInit : EventInit {
    var oldState: String?
    var newState: String?
    var source: Element?
}

public fun ToggleEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, oldState: String? = null, newState: String? = null, source: Element? = null): ToggleEventInit = newJsObject<ToggleEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (oldState != null) this.oldState = oldState
    if (newState != null) this.newState = newState
    if (source != null) this.source = source
}

/**
 * The CommandEvent interface represents an event notifying the user when a button element with valid commandForElement
 * and command attributes is about to invoke an interactive element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent)
 */
public open external class CommandEvent : Event {
    /**
     * The CommandEvent() constructor creates a new CommandEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/CommandEvent)
     */
    constructor(type: String, eventInitDict: CommandEventInit = definedExternally)

    /**
     * The source read-only property of the CommandEvent interface returns an EventTarget representing the control that
     * invoked the given command.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/source)
     */
    open val source: Element?

    /**
     * The command read-only property of the CommandEvent interface returns a string containing the value of the command
     * property at the time the event was dispatched.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CommandEvent/command)
     */
    open val command: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface CommandEventInit : EventInit {
    var source: Element?
    var command: String?
}

public fun CommandEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, source: Element? = null, command: String? = null): CommandEventInit = newJsObject<CommandEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (source != null) this.source = source
    if (command != null) this.command = command
}

public external interface FocusOptions : JsAny {
    var preventScroll: Boolean?
    var focusVisible: Boolean?
}

public fun FocusOptions(preventScroll: Boolean? = null, focusVisible: Boolean? = null): FocusOptions = newJsObject<FocusOptions>().apply {
    if (preventScroll != null) this.preventScroll = preventScroll
    if (focusVisible != null) this.focusVisible = focusVisible
}

public external interface ElementContentEditable : JsAny {
    /**
     * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable)
     */
    var contentEditable: String

    /**
     * The enterKeyHint property is an enumerated property defining what action label (or icon) to present for the enter
     * key on virtual keyboards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint)
     */
    var enterKeyHint: String

    /**
     * The HTMLElement.isContentEditable read-only property returns a boolean value that is true if the contents of the
     * element are editable; otherwise it returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable)
     */
    val isContentEditable: Boolean

    /**
     * The HTMLElement property inputMode reflects the value of the element's inputmode attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode)
     */
    var inputMode: String
}

/**
 * The CloseWatcher interface allows a custom UI component with open and close semantics to respond to device-specific
 * close actions in the same way as a built-in component.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher)
 */
public open external class CloseWatcher : EventTarget {
    /**
     * The CloseWatcher() constructor creates a new CloseWatcher object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/CloseWatcher)
     */
    constructor(options: CloseWatcherOptions = definedExternally)

    /**
     * The requestClose() method of the CloseWatcher interface fires a cancel event and if that event is not canceled
     * with Event.preventDefault(), proceeds to fire a close event, and then finally deactivates the close watcher as if
     * destroy() was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/requestClose)
     */
    open fun requestClose()

    /**
     * The close() method of the CloseWatcher interface lets you skip any logic in the cancel event handler and
     * immediately fire the close event. It then deactivates the close watcher as if destroy() was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/close)
     */
    open fun close()

    /**
     * The destroy() method of the CloseWatcher interface deactivates the close watcher. This is intended to be called
     * if the relevant UI element is torn down in some other way than being closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/destroy)
     */
    open fun destroy()

    /**
     * A cancel event is fired at a CloseWatcher object before the close event, so that close can be prevented from
     * firing, if necessary. It is triggered by all close signals (e.g., the Esc key) as well as
     * CloseWatcher.requestClose().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/cancel_event)
     */
    open var oncancel: ((Event) -> Unit)?

    /**
     * A close event is fired at a CloseWatcher object when a close request was received and only fired if the cancel
     * event that preceded the close one was not canceled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseWatcher/close_event)
     */
    open var onclose: ((Event) -> Unit)?
}

public external interface CloseWatcherOptions : JsAny {
    var signal: AbortSignal?
}

public fun CloseWatcherOptions(signal: AbortSignal? = null): CloseWatcherOptions = newJsObject<CloseWatcherOptions>().apply {
    if (signal != null) this.signal = signal
}

/**
 * The DataTransfer object is used to hold any data transferred between contexts, such as a drag and drop operation, or
 * clipboard read/write. It may hold one or more data items, each of one or more data types.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer)
 */
public open external class DataTransfer : JsAny {
    /**
     * The DataTransfer constructor creates a new DataTransfer object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/DataTransfer)
     */
    constructor()

    /**
     * The DataTransfer.dropEffect property controls the feedback (typically visual) the user is given during a drag and
     * drop operation. It will affect which cursor is displayed while dragging. For example, when the user hovers over a
     * target drop element, the browser's cursor may indicate which type of operation will occur.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/dropEffect)
     */
    open var dropEffect: String

    /**
     * The effectAllowed property of the DataTransfer interface specifies the effect that is allowed for a drag
     * operation. The copy operation is used to indicate that the data being dragged will be copied from its present
     * location to the drop location. The move operation is used to indicate that the data being dragged will be moved,
     * and the link operation is used to indicate that some form of relationship or connection will be created between
     * the source and drop locations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/effectAllowed)
     */
    open var effectAllowed: String

    /**
     * The items read-only property of the DataTransfer interface is a DataTransferItemList of the DataTransferItem
     * objects in a drag operation. The list includes one item for each item in the operation, and if the operation had
     * no items, the list is empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/items)
     */
    open val items: DataTransferItemList

    /**
     * The setDragImage() method of the DataTransfer interface sets a custom image to use as drag feedback. The image
     * will typically be an &lt;img&gt; element but it can also be a &lt;canvas&gt; or any other visible element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setDragImage)
     */
    open fun setDragImage(image: Element, x: Int, y: Int)

    /**
     * The types read-only property of the DataTransfer interface returns the available types that exist in the items.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/types)
     */
    open val types: JsArray<JsString>

    /**
     * The getData() method of the DataTransfer interface retrieves drag data (as a string) for the specified type. If
     * the drag operation does not include data, this method returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/getData)
     */
    open fun getData(format: String): String

    /**
     * The setData() method of the DataTransfer interface sets the drag operation's drag data to the specified data and
     * type. If data for the given type does not exist, it is added at the end of the drag data store, such that the
     * last item in the types list will be the new type. If data for the given type already exists, the existing data is
     * replaced in the same position. That is, the order of the types list is not changed when replacing data of the
     * same type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/setData)
     */
    open fun setData(format: String, data: String)

    /**
     * The clearData() method of the DataTransfer interface removes the drag operation's drag data for the given type.
     * If data for the given type does not exist, this method does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/clearData)
     */
    open fun clearData(format: String = definedExternally)

    /**
     * The files read-only property of the DataTransfer interface is a list of the files in the drag operation. If the
     * operation includes no files, the list is empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransfer/files)
     */
    open val files: FileList
}

/**
 * The DataTransferItemList object is a list of DataTransferItem objects representing items being dragged. During a drag
 * operation, each DragEvent has a dataTransfer property and that property is a DataTransferItemList.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList)
 */
public abstract external class DataTransferItemList : JsAny {
    /**
     * The length read-only property of the DataTransferItemList interface returns the number of items currently in the
     * drag item list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/length)
     */
    open val length: Int

    /**
     * The add() method of the DataTransferItemList interface creates a new DataTransferItem using the specified data
     * and adds it to the drag data list. The item may be a File or a string of a given type. If the item is
     * successfully added to the list, the newly-created DataTransferItem object is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/add)
     */
    open fun add(data: String, type: String): DataTransferItem?

    /**
     * The add() method of the DataTransferItemList interface creates a new DataTransferItem using the specified data
     * and adds it to the drag data list. The item may be a File or a string of a given type. If the item is
     * successfully added to the list, the newly-created DataTransferItem object is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/add)
     */
    open fun add(data: File): DataTransferItem?

    /**
     * The remove() method of the DataTransferItemList interface removes the DataTransferItem at the specified index
     * from the list. If the index is less than zero or greater than one less than the length of the list, the list will
     * not be changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/remove)
     */
    open fun remove(index: Int)

    /**
     * The clear() method of the DataTransferItemList interface removes all DataTransferItem objects from the drag data
     * items list, leaving the list empty.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItemList/clear)
     */
    open fun clear()
}

public operator fun DataTransferItemList.get(index: Int): DataTransferItem? = getProperty(this, index)

/**
 * The DataTransferItem object represents one drag data item. During a drag operation, each DragEvent has a dataTransfer
 * property which contains a list of drag data items. Each item in the list is a DataTransferItem object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem)
 */
public abstract external class DataTransferItem : JsAny {
    /**
     * The kind read-only property of the DataTransferItem interface returns the kind–a string or a file–of the object
     * representing the drag data item.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/kind)
     */
    open val kind: String

    /**
     * The type read-only property of the DataTransferItem interface returns the type (format) of the object
     * representing the drag data item. The type is a Unicode string generally given by a MIME type, although a MIME
     * type is not required.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/type)
     */
    open val type: String

    /**
     * The getAsString() method of the DataTransferItem interface invokes the given callback with the drag data item's
     * string data as the argument if the item's kind is a Plain unicode string (i.e., kind is string).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsString)
     */
    open fun getAsString(callback: ((String) -> Unit)?)

    /**
     * The getAsFile() method of the DataTransferItem interface returns the drag data item's File object if the item is
     * a file. If the item is not a file, this method returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DataTransferItem/getAsFile)
     */
    open fun getAsFile(): File?
}

/**
 * The DragEvent interface is a DOM event that represents a drag and drop interaction. The user initiates a drag by
 * placing a pointer device (such as a mouse) on the touch surface and then dragging the pointer to a new location (such
 * as another DOM element). Applications are free to interpret a drag and drop interaction in an application-specific
 * way.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DragEvent)
 */
public open external class DragEvent : MouseEvent {
    /**
     * This constructor is used to create a synthetic DragEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DragEvent/DragEvent)
     */
    constructor(type: String, eventInitDict: DragEventInit = definedExternally)

    /**
     * The DragEvent.dataTransfer read-only property holds the drag operation's data (as a DataTransfer object).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DragEvent/dataTransfer)
     */
    open val dataTransfer: DataTransfer?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface DragEventInit : MouseEventInit {
    var dataTransfer: DataTransfer?
}

public fun DragEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, screenX: Int? = null, screenY: Int? = null, clientX: Int? = null, clientY: Int? = null, button: Short? = null, buttons: Short? = null, relatedTarget: EventTarget? = null, dataTransfer: DataTransfer? = null): DragEventInit = newJsObject<DragEventInit>().apply {
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
    if (dataTransfer != null) this.dataTransfer = dataTransfer
}

public external interface PopoverTargetAttributes : JsAny {
    /**
     * The popoverTargetElement property of the HTMLInputElement interface gets and sets the popover element to control
     * via an &lt;input&gt; element of type="button".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/popoverTargetElement)
     */
    var popoverTargetElement: Element?

    /**
     * The popoverTargetAction property of the HTMLInputElement interface gets and sets the action to be performed
     * ("hide", "show", or "toggle") on a popover element being controlled by an &lt;input&gt; element of type="button".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLInputElement/popoverTargetAction)
     */
    var popoverTargetAction: String
}

public open external class Origin : JsAny {
    constructor()
    open val opaque: Boolean
    open fun isSameOrigin(other: Origin): Boolean
    open fun isSameSite(other: Origin): Boolean

    companion object {
        fun from(value: JsAny?): Origin
    }
}

/**
 * The Window interface represents a window containing a DOM document; the document property points to the DOM document
 * loaded in that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window)
 */
public abstract external class Window : EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowOrWorkerGlobalScope, AnimationFrameProvider, WindowSessionStorage, WindowLocalStorage, MessageEventSource {
    /**
     * The window read-only property of the Window interface points to the window object itself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/window)
     */
    open val window: Window

    /**
     * The Window.self read-only property returns the window itself, as a WindowProxy. It can be used with dot notation
     * on a window object (that is, window.self) or standalone (self). The advantage of the standalone notation is that
     * a similar notation exists for non-window contexts, such as in Web Workers. By using self, you can refer to the
     * global scope in a way that will work not only in a window context (self will resolve to window.self) but also in
     * a worker context (self will then resolve to WorkerGlobalScope.self).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/self)
     */
    open val self: Window

    /**
     * The document read-only property of the Window interface returns a reference to the document contained in the
     * window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/document)
     */
    open val document: Document

    /**
     * The Window.name property gets/sets the name of the window's browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/name)
     */
    open var name: String

    /**
     * The read-only location property of the Window interface returns a Location object with information about the
     * current location of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/location)
     */
    open val location: Location

    /**
     * The Window.history read-only property returns a reference to the History object, which provides an interface for
     * manipulating the browser session history (pages visited in the tab or frame that the current page is loaded in).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/history)
     */
    open val history: History

    /**
     * The navigation read-only property of the Window interface returns the current window's associated Navigation
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/navigation)
     */
    open val navigation: Navigation

    /**
     * The customElements read-only property of the Window interface returns a reference to the global
     * CustomElementRegistry object, which can be used to register new custom elements and get information about
     * previously registered custom elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/customElements)
     */
    open val customElements: CustomElementRegistry

    /**
     * The locationbar read-only property of the Window interface returns the locationbar object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/locationbar)
     */
    open val locationbar: BarProp

    /**
     * The menubar read-only property of the Window interface returns the menubar object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/menubar)
     */
    open val menubar: BarProp

    /**
     * The personalbar read-only property of the Window interface returns the personalbar object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/personalbar)
     */
    open val personalbar: BarProp

    /**
     * The scrollbars read-only property of the Window interface returns the scrollbars object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollbars)
     */
    open val scrollbars: BarProp

    /**
     * The statusbar read-only property of the Window interface returns the statusbar object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/statusbar)
     */
    open val statusbar: BarProp

    /**
     * The toolbar read-only property of the Window interface returns the toolbar object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/toolbar)
     */
    open val toolbar: BarProp

    /**
     * The status property of the Window interface was originally intended to set the text in the status bar at the
     * bottom of the browser window. However, the HTML standard now requires setting window.status to have no effect on
     * the text displayed in the status bar.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/status)
     */
    open var status: String

    /**
     * The Window.close() method closes the current window, or the window on which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/close)
     */
    open fun close()

    /**
     * The Window.closed read-only property indicates whether the referenced window is closed or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/closed)
     */
    open val closed: Boolean

    /**
     * The window.stop() stops further resource loading in the current browsing context, equivalent to the stop button
     * in the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/stop)
     */
    open fun stop()

    /**
     * Makes a request to bring the window to the front. It may fail due to user settings and the window isn't
     * guaranteed to be frontmost before this method returns.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/focus)
     */
    open fun focus()

    /**
     * The Window.blur() method does nothing.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/blur)
     */
    open fun blur()

    /**
     * The frames read-only property of the Window interface returns the window itself, which is an array-like object,
     * listing the direct sub-frames of the current window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frames)
     */
    open val frames: Window

    /**
     * The length read-only property of the Window interface returns the number of frames (either &lt;frame&gt; or
     * &lt;iframe&gt; elements) in the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/length)
     */
    open val length: Int

    /**
     * The top read-only property of the Window interface returns a reference to the topmost window in the window
     * hierarchy.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/top)
     */
    open val top: Window?

    /**
     * The Window interface's opener property returns a reference to the window that opened the window, either with
     * open(), or by navigating a link with a target attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/opener)
     */
    open var opener: JsAny?

    /**
     * The parent read-only property of the Window interface is a reference to the parent of the current window or
     * subframe.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/parent)
     */
    open val parent: Window?

    /**
     * The frameElement read-only property of the Window interface returns the element (such as &lt;iframe&gt; or
     * &lt;object&gt;) in which the window is embedded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/frameElement)
     */
    open val frameElement: Element?

    /**
     * The open() method of the Window interface loads a specified resource into a new or existing browsing context
     * (that is, a tab, a window, or an iframe) under a specified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/open)
     */
    open fun open(url: String = definedExternally, target: String = definedExternally, features: String = definedExternally): Window?

    /**
     * The Window.navigator read-only property returns a reference to the Navigator object, which has methods and
     * properties about the application running the script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/navigator)
     */
    open val navigator: Navigator
    open val clientInformation: Navigator

    /**
     * The originAgentCluster read-only property of the Window interface returns true if this window belongs to an
     * origin-keyed agent cluster: this means that the operating system has provided dedicated resources (for example an
     * operating system process) to this window's origin that are not shared with windows from other origins.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/originAgentCluster)
     */
    open val originAgentCluster: Boolean

    /**
     * window.alert() instructs the browser to display a dialog with an optional message, and to wait until the user
     * dismisses the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/alert)
     */
    open fun alert()

    /**
     * window.alert() instructs the browser to display a dialog with an optional message, and to wait until the user
     * dismisses the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/alert)
     */
    open fun alert(message: String)

    /**
     * window.confirm() instructs the browser to display a dialog with an optional message, and to wait until the user
     * either confirms or cancels the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/confirm)
     */
    open fun confirm(message: String = definedExternally): Boolean

    /**
     * window.prompt() instructs the browser to display a dialog with an optional message prompting the user to input
     * some text, and to wait until the user either submits the text or cancels the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/prompt)
     */
    open fun prompt(message: String = definedExternally, default: String = definedExternally): String?

    /**
     * Opens the print dialog to print the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/print)
     */
    open fun print()

    /**
     * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a
     * page and a pop-up that it spawned, or between a page and an iframe embedded within it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/postMessage)
     */
    open fun postMessage(message: JsAny?, targetOrigin: String, transfer: JsArray<JsAny> = definedExternally)

    /**
     * The window.postMessage() method safely enables cross-origin communication between Window objects; e.g., between a
     * page and a pop-up that it spawned, or between a page and an iframe embedded within it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/postMessage)
     */
    open fun postMessage(message: JsAny?, options: WindowPostMessageOptions = definedExternally)

    /**
     * The Window.captureEvents() method does nothing. Its original behavior has been removed from the specification,
     * but the method itself has been retained so as not to break code that calls it.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/captureEvents)
     */
    open fun captureEvents()

    /**
     * Releases the window from trapping events of a specific type.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/releaseEvents)
     */
    open fun releaseEvents()

    /**
     * The external read-only property of the Window interface returns an instance of the External interface, which was
     * intended to contain functions related to adding external search providers to the browser. However, this is now
     * deprecated, and the contained methods are now dummy functions that do nothing as per spec.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/external)
     */
    open val external: External

    /**
     * The read-only Window property event returns the Event which is currently being handled by the site's code.
     * Outside the context of an event handler, the value is always undefined.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/event)
     */
    open val event: Event?

    /**
     * The Window interface's matchMedia() method returns a new MediaQueryList object that can then be used to determine
     * if the document matches the media query string, as well as to monitor the document to detect when it matches (or
     * stops matching) that media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/matchMedia)
     */
    open fun matchMedia(query: String): MediaQueryList

    /**
     * The screen read-only property of the Window interface returns a reference to the screen object associated with
     * the window. The screen object, implementing the Screen interface, is a special object for inspecting properties
     * of the screen on which the current window is being rendered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screen)
     */
    open val screen: Screen

    /**
     * The visualViewport read-only property of the Window interface returns a VisualViewport object representing the
     * visual viewport for a given window, or null if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/visualViewport)
     */
    open val visualViewport: VisualViewport?

    /**
     * The moveTo() method of the Window interface moves the current window to the specified coordinates.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveTo)
     */
    open fun moveTo(x: Int, y: Int)

    /**
     * The moveBy() method of the Window interface moves the current window by a specified amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/moveBy)
     */
    open fun moveBy(x: Int, y: Int)

    /**
     * The Window.resizeTo() method dynamically resizes the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeTo)
     */
    open fun resizeTo(width: Int, height: Int)

    /**
     * The Window.resizeBy() method resizes the current window by a specified amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resizeBy)
     */
    open fun resizeBy(x: Int, y: Int)

    /**
     * The read-only Window property innerWidth returns the interior width of the window in pixels (that is, the width
     * of the window's layout viewport). That includes the width of the vertical scroll bar, if one is present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerWidth)
     */
    open val innerWidth: Int

    /**
     * The read-only innerHeight property of the Window interface returns the interior height of the window in pixels,
     * including the height of the horizontal scroll bar, if present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/innerHeight)
     */
    open val innerHeight: Int

    /**
     * The read-only scrollX property of the Window interface returns the number of pixels by which the document is
     * currently scrolled horizontally. This value is subpixel precise in modern browsers, meaning that it isn't
     * necessarily a whole number. You can get the number of pixels the document is scrolled vertically from the scrollY
     * property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollX)
     */
    open val scrollX: Double
    open val pageXOffset: Double

    /**
     * The read-only scrollY property of the Window interface returns the number of pixels by which the document is
     * currently scrolled vertically. This value is subpixel precise in modern browsers, meaning that it isn't
     * necessarily a whole number. You can get the number of pixels the document is scrolled horizontally from the
     * scrollX property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollY)
     */
    open val scrollY: Double
    open val pageYOffset: Double

    /**
     * The scroll() method of the Window interface scrolls the window to a particular place in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll)
     */
    open fun scroll(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scroll() method of the Window interface scrolls the window to a particular place in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scroll)
     */
    open fun scroll(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollTo() method of the Window interface scrolls to a particular set of coordinates in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollTo)
     */
    open fun scrollTo(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scrollTo() method of the Window interface scrolls to a particular set of coordinates in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollTo)
     */
    open fun scrollTo(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollBy() method of the Window interface scrolls the document in the window by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollBy)
     */
    open fun scrollBy(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scrollBy() method of the Window interface scrolls the document in the window by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/scrollBy)
     */
    open fun scrollBy(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The screenX read-only property of the Window interface returns the horizontal distance, in CSS pixels, from the
     * left border of the user's browser window to the left side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenX)
     */
    open val screenX: Int

    /**
     * The screenLeft read-only property of the Window interface returns the horizontal distance, in CSS pixels, from
     * the left border of the user's browser window to the left side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenLeft)
     */
    open val screenLeft: Int

    /**
     * The screenY read-only property of the Window interface returns the vertical distance, in CSS pixels, from the top
     * border of the user's browser window to the top side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenY)
     */
    open val screenY: Int

    /**
     * The screenTop read-only property of the Window interface returns the vertical distance, in CSS pixels, from the
     * top border of the user's browser window to the top side of the screen.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/screenTop)
     */
    open val screenTop: Int

    /**
     * Window.outerWidth read-only property returns the width of the outside of the browser window. It represents the
     * width of the whole browser window including sidebar (if expanded), window chrome and window resizing
     * borders/handles.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerWidth)
     */
    open val outerWidth: Int

    /**
     * The Window.outerHeight read-only property returns the height in pixels of the whole browser window, including any
     * sidebar, window chrome, and window-resizing borders/handles.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/outerHeight)
     */
    open val outerHeight: Int

    /**
     * The devicePixelRatio read-only property of the Window interface returns the ratio of the resolution in physical
     * pixels to the resolution in CSS pixels for the current display device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/devicePixelRatio)
     */
    open val devicePixelRatio: Double

    /**
     * The Window.getComputedStyle() method returns a live read-only CSSStyleProperties object containing the resolved
     * values of all CSS properties of an element, after applying active stylesheets and resolving any computation those
     * values may contain.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/getComputedStyle)
     */
    open fun getComputedStyle(elt: Element, pseudoElt: String? = definedExternally): CSSStyleProperties

    /**
     * The fetchLater() method of the Window interface creates a deferred fetch.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetchLater)
     */
    open fun fetchLater(input: Request, init: DeferredRequestInit = definedExternally): FetchLaterResult

    /**
     * The fetchLater() method of the Window interface creates a deferred fetch.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetchLater)
     */
    open fun fetchLater(input: String, init: DeferredRequestInit = definedExternally): FetchLaterResult
}

public operator fun Window.get(name: String): JsAny? = getProperty(this, name)

public external interface WindowPostMessageOptions : StructuredSerializeOptions {
    var targetOrigin: String?
}

public fun WindowPostMessageOptions(transfer: JsArray<JsAny>? = null, targetOrigin: String? = null): WindowPostMessageOptions = newJsObject<WindowPostMessageOptions>().apply {
    if (transfer != null) this.transfer = transfer
    if (targetOrigin != null) this.targetOrigin = targetOrigin
}

/**
 * The BarProp interface of the Document Object Model represents the web browser user interface elements that are
 * exposed to scripts in web pages. Each of the following interface elements are represented by a BarProp object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BarProp)
 */
public abstract external class BarProp : JsAny {
    /**
     * The visible read-only property of the BarProp interface returns true if the user interface element it represents
     * is visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BarProp/visible)
     */
    open val visible: Boolean
}

/**
 * The Location interface represents the location (URL) of the object it is linked to. Changes done on it are reflected
 * on the object it relates to. Both the Document and Window interface have such a linked Location, accessible via
 * Document.location and Window.location respectively.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location)
 */
public abstract external class Location : JsAny {
    /**
     * The href property of the Location interface is a stringifier that returns a string containing the whole URL, and
     * allows the href to be updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/href)
     */
    open var href: String

    /**
     * The origin read-only property of the Location interface returns a string containing the Unicode serialization of
     * the origin of the location's URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/origin)
     */
    open val origin: String

    /**
     * The protocol property of the Location interface is a string containing the protocol or scheme of the location's
     * URL, including the final ":".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/protocol)
     */
    open var protocol: String

    /**
     * The host property of the Location interface is a string containing the host, which is the hostname, and then, if
     * the port of the URL is nonempty, a ":", followed by the port of the URL. If the URL does not have a hostname,
     * this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/host)
     */
    open var host: String

    /**
     * The hostname property of the Location interface is a string containing either the domain name or IP address of
     * the location URL. If the URL does not have a hostname, this property contains an empty string, "". IPv4 and IPv6
     * addresses are normalized, such as stripping leading zeros, and domain names are converted to IDN.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hostname)
     */
    open var hostname: String

    /**
     * The port property of the Location interface is a string containing the port number of the location's URL. If the
     * port is the default for the protocol (80 for ws: and http:, 443 for wss: and https:, and 21 for ftp:), this
     * property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/port)
     */
    open var port: String

    /**
     * The pathname property of the Location interface is a string containing the path of the URL for the location. If
     * there is no path, pathname will be empty: otherwise, pathname contains an initial '/' followed by the path of the
     * URL, not including the query string or fragment.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/pathname)
     */
    open var pathname: String

    /**
     * The search property of the Location interface is a search string, also called a query string, that is a string
     * containing a "?" followed by the parameters of the location's URL. If the URL does not have a search query, this
     * property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/search)
     */
    open var search: String

    /**
     * The hash property of the Location interface is a string containing a "#" followed by the fragment identifier of
     * the location URL. If the URL does not have a fragment identifier, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/hash)
     */
    open var hash: String

    /**
     * The assign() method of the Location interface causes the window to load and display the document at the URL
     * specified. After the navigation occurs, the user can navigate back to the page that called Location.assign() by
     * pressing the "back" button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/assign)
     */
    open fun assign(url: String)

    /**
     * The replace() method of the Location interface replaces the current resource with the one at the provided URL.
     * The difference from the assign() method is that after using replace() the current page will not be saved in
     * session History, meaning the user won't be able to use the back button to navigate to it. Not to be confused with
     * the String method String.prototype.replace().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/replace)
     */
    open fun replace(url: String)

    /**
     * The reload() method of the Location interface reloads the current URL, like the Refresh button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/reload)
     */
    open fun reload()

    /**
     * The ancestorOrigins read-only property of the Location interface is a static DOMStringList containing, in reverse
     * order, the origins of all ancestor browsing contexts of the document associated with the given Location object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Location/ancestorOrigins)
     */
    open val ancestorOrigins: DOMStringList
}

public external interface ScrollRestoration : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ScrollRestoration.Companion.AUTO: ScrollRestoration get() = "auto".toJsString().unsafeCast<ScrollRestoration>()
public inline val ScrollRestoration.Companion.MANUAL: ScrollRestoration get() = "manual".toJsString().unsafeCast<ScrollRestoration>()

/**
 * The History interface of the History API allows manipulation of the browser session history, that is the pages
 * visited in the tab or frame that the current page is loaded in.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History)
 */
public abstract external class History : JsAny {
    /**
     * The length read-only property of the History interface returns an integer representing the number of entries in
     * the session history, including the currently loaded page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/length)
     */
    open val length: Int

    /**
     * The scrollRestoration property of the History interface allows web applications to explicitly set default scroll
     * restoration behavior on history navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/scrollRestoration)
     */
    open var scrollRestoration: ScrollRestoration

    /**
     * The state read-only property of the History interface returns a value representing the state at the top of the
     * history stack. This is a way to look at the state without having to wait for a popstate event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/state)
     */
    open val state: JsAny?

    /**
     * The go() method of the History interface loads a specific page from the session history. You can use it to move
     * forwards and backwards through the history depending on the value of a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/go)
     */
    open fun go(delta: Int = definedExternally)

    /**
     * The back() method of the History interface causes the browser to move back one page in the session history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/back)
     */
    open fun back()

    /**
     * The forward() method of the History interface causes the browser to move forward one page in the session history.
     * It has the same effect as calling history.go(1).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/forward)
     */
    open fun forward()

    /**
     * The pushState() method of the History interface adds an entry to the browser's session history stack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/pushState)
     */
    open fun pushState(data: JsAny?, unused: String, url: String? = definedExternally)

    /**
     * The replaceState() method of the History interface modifies the current history entry, replacing it with the
     * state object and URL passed in the method parameters. This method is particularly useful when you want to update
     * the state object or URL of the current history entry in response to some user action.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/History/replaceState)
     */
    open fun replaceState(data: JsAny?, unused: String, url: String? = definedExternally)
}

/**
 * The Navigation interface of the Navigation API allows control over all navigation actions for the current window in
 * one central place, including initiating navigations programmatically, examining navigation history entries, and
 * managing navigations as they happen.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation)
 */
public abstract external class Navigation : EventTarget {
    /**
     * The entries() method of the Navigation interface returns an array of NavigationHistoryEntry objects representing
     * all existing history entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/entries)
     */
    open fun entries(): JsArray<NavigationHistoryEntry>

    /**
     * The currentEntry read-only property of the Navigation interface returns a NavigationHistoryEntry object
     * representing the location the user is currently navigated to right now.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currentEntry)
     */
    open val currentEntry: NavigationHistoryEntry?

    /**
     * The updateCurrentEntry() method of the Navigation interface updates the state of the currentEntry; used in cases
     * where the state change will be independent of a navigation or reload.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/updateCurrentEntry)
     */
    open fun updateCurrentEntry(options: NavigationUpdateCurrentEntryOptions)

    /**
     * The transition read-only property of the Navigation interface returns a NavigationTransition object representing
     * the status of an in-progress navigation, which can be used to track it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/transition)
     */
    open val transition: NavigationTransition?

    /**
     * The activation read-only property of the Navigation interface returns a NavigationActivation object containing
     * information about the most recent cross-document navigation, which "activated" this Document. The property will
     * stay constant during same-document navigations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/activation)
     */
    open val activation: NavigationActivation?

    /**
     * The canGoBack read-only property of the Navigation interface returns true if it is possible to navigate backwards
     * in the navigation history (i.e., the currentEntry is not the first one in the history entry list), and false if
     * it is not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/canGoBack)
     */
    open val canGoBack: Boolean

    /**
     * The canGoForward read-only property of the Navigation interface returns true if it is possible to navigate
     * forwards in the navigation history (i.e., the currentEntry is not the last one in the history entry list), and
     * false if it is not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/canGoForward)
     */
    open val canGoForward: Boolean

    /**
     * The navigate() method of the Navigation interface navigates to a specific URL, updating any provided state in the
     * history entries list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate)
     */
    open fun navigate(url: String, options: NavigationNavigateOptions = definedExternally): NavigationResult

    /**
     * The reload() method of the Navigation interface reloads the current URL, updating any provided state in the
     * history entries list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/reload)
     */
    open fun reload(options: NavigationReloadOptions = definedExternally): NavigationResult

    /**
     * The traverseTo() method of the Navigation interface navigates to the NavigationHistoryEntry identified by the
     * given key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/traverseTo)
     */
    open fun traverseTo(key: String, options: NavigationOptions = definedExternally): NavigationResult

    /**
     * The back() method of the Navigation interface navigates backwards by one entry in the navigation history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/back)
     */
    open fun back(options: NavigationOptions = definedExternally): NavigationResult

    /**
     * The forward() method of the Navigation interface navigates forwards by one entry in the navigation history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/forward)
     */
    open fun forward(options: NavigationOptions = definedExternally): NavigationResult

    /**
     * The navigate event of the Navigation interface is fired when any type of navigation is initiated, allowing you to
     * intercept as required.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigate_event)
     */
    open var onnavigate: ((NavigateEvent) -> Unit)?

    /**
     * The navigatesuccess event of the Navigation interface is fired when a successful navigation has finished.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigatesuccess_event)
     */
    open var onnavigatesuccess: ((Event) -> Unit)?

    /**
     * The navigateerror event of the Navigation interface is fired when a navigation fails.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/navigateerror_event)
     */
    open var onnavigateerror: ((ErrorEvent) -> Unit)?

    /**
     * The currententrychange event of the Navigation interface is fired when the Navigation.currentEntry has changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigation/currententrychange_event)
     */
    open var oncurrententrychange: ((NavigationCurrentEntryChangeEvent) -> Unit)?
}

public external interface NavigationUpdateCurrentEntryOptions : JsAny {
    var state: JsAny?
}

public fun NavigationUpdateCurrentEntryOptions(state: JsAny?): NavigationUpdateCurrentEntryOptions = newJsObject<NavigationUpdateCurrentEntryOptions>().apply {
    this.state = state
}

public external interface NavigationOptions : JsAny {
    var info: JsAny?
}

public fun NavigationOptions(info: JsAny? = null): NavigationOptions = newJsObject<NavigationOptions>().apply {
    if (info != null) this.info = info
}

public external interface NavigationNavigateOptions : NavigationOptions {
    var state: JsAny?
    var history: NavigationHistoryBehavior?
}

public fun NavigationNavigateOptions(info: JsAny? = null, state: JsAny? = null, history: NavigationHistoryBehavior? = null): NavigationNavigateOptions = newJsObject<NavigationNavigateOptions>().apply {
    if (info != null) this.info = info
    if (state != null) this.state = state
    if (history != null) this.history = history
}

public external interface NavigationReloadOptions : NavigationOptions {
    var state: JsAny?
}

public fun NavigationReloadOptions(info: JsAny? = null, state: JsAny? = null): NavigationReloadOptions = newJsObject<NavigationReloadOptions>().apply {
    if (info != null) this.info = info
    if (state != null) this.state = state
}

public external interface NavigationResult : JsAny {
    var committed: Promise<NavigationHistoryEntry>?
    var finished: Promise<NavigationHistoryEntry>?
}

public fun NavigationResult(committed: Promise<NavigationHistoryEntry>? = null, finished: Promise<NavigationHistoryEntry>? = null): NavigationResult = newJsObject<NavigationResult>().apply {
    if (committed != null) this.committed = committed
    if (finished != null) this.finished = finished
}

public external interface NavigationHistoryBehavior : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NavigationHistoryBehavior.Companion.AUTO: NavigationHistoryBehavior get() = "auto".toJsString().unsafeCast<NavigationHistoryBehavior>()
public inline val NavigationHistoryBehavior.Companion.PUSH: NavigationHistoryBehavior get() = "push".toJsString().unsafeCast<NavigationHistoryBehavior>()
public inline val NavigationHistoryBehavior.Companion.REPLACE: NavigationHistoryBehavior get() = "replace".toJsString().unsafeCast<NavigationHistoryBehavior>()

public external interface NavigationType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NavigationType.Companion.PUSH: NavigationType get() = "push".toJsString().unsafeCast<NavigationType>()
public inline val NavigationType.Companion.REPLACE: NavigationType get() = "replace".toJsString().unsafeCast<NavigationType>()
public inline val NavigationType.Companion.RELOAD: NavigationType get() = "reload".toJsString().unsafeCast<NavigationType>()
public inline val NavigationType.Companion.TRAVERSE: NavigationType get() = "traverse".toJsString().unsafeCast<NavigationType>()

/**
 * The NavigationHistoryEntry interface of the Navigation API represents a single navigation history entry.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry)
 */
public abstract external class NavigationHistoryEntry : EventTarget {
    /**
     * The url read-only property of the NavigationHistoryEntry interface returns the absolute URL of this history
     * entry. If the entry corresponds to a different Document than the current one (like sameDocument property is
     * false), and that Document was fetched with a Referrer-Policy header set to no-referrer or origin, the property
     * returns null. If current document is not fully active, it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/url)
     */
    open val url: String?

    /**
     * The key read-only property of the NavigationHistoryEntry interface returns the key of the history entry, or an
     * empty string if current document is not fully active. This is a unique, UA-generated value that represents the
     * history entry's slot in the entries list. It is used to navigate that particular slot via
     * Navigation.traverseTo(). The key will be reused by other entries that replace the entry in the list (that is, if
     * the NavigateEvent.navigationType is replace).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/key)
     */
    open val key: String

    /**
     * The id read-only property of the NavigationHistoryEntry interface returns the id of the history entry, or an
     * empty string if current document is not fully active. This is a unique, UA-generated value that always represents
     * a specific history entry, useful to correlate it with an external resource such as a storage cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/id)
     */
    open val id: String

    /**
     * The index read-only property of the NavigationHistoryEntry interface returns the index of the history entry in
     * the history entries list (that is, the list returned by Navigation.entries()), or -1 if the entry does not appear
     * in the list or if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/index)
     */
    open val index: Double

    /**
     * The sameDocument read-only property of the NavigationHistoryEntry interface returns true if this history entry is
     * for the same document as the current Document value and current document is fully active, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/sameDocument)
     */
    open val sameDocument: Boolean

    /**
     * The getState() method of the NavigationHistoryEntry interface returns a clone of the developer-supplied state
     * associated with this history entry.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/getState)
     */
    open fun getState(): JsAny?

    /**
     * The dispose event of the NavigationHistoryEntry interface is fired when the entry is no longer part of the
     * history entry list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationHistoryEntry/dispose_event)
     */
    open var ondispose: ((Event) -> Unit)?
}

/**
 * The NavigationTransition interface of the Navigation API represents an ongoing navigation — a navigation that hasn't
 * yet reached the navigatesuccess or navigateerror stage.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition)
 */
public abstract external class NavigationTransition : JsAny {
    /**
     * The navigationType read-only property of the NavigationTransition interface returns the type of the ongoing
     * navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/navigationType)
     */
    open val navigationType: NavigationType

    /**
     * The from read-only property of the NavigationTransition interface returns the NavigationHistoryEntry that the
     * transition is coming from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/from)
     */
    open val from: NavigationHistoryEntry

    /**
     * The to read-only property of the NavigationTransition interface returns the NavigationDestination that the
     * transition is navigating to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/to)
     */
    open val to: NavigationDestination

    /**
     * The committed read-only property of the NavigationTransition interface returns a Promise that fulfills when
     * Navigation.currentEntry is updated and the new URL is displayed in the browser, marking the navigation as
     * committed. This happens after all precommit handlers for the navigation are fulfilled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/committed)
     */
    open val committed: Promise<JsAny?>

    /**
     * The finished read-only property of the NavigationTransition interface returns a Promise that fulfills at the same
     * time the navigatesuccess event fires, or rejects at the same time the navigateerror event fires.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationTransition/finished)
     */
    open val finished: Promise<JsAny?>
}

/**
 * The NavigationActivation interface of the Navigation API represents a recent cross-document navigation. It contains
 * the navigation type and outgoing and inbound document history entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation)
 */
public abstract external class NavigationActivation : JsAny {
    /**
     * The from read-only property of the NavigationActivation interface contains a NavigationHistoryEntry object
     * representing the history entry for the outgoing ("from") document in the navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/from)
     */
    open val from: NavigationHistoryEntry?

    /**
     * The entry read-only property of the NavigationActivation interface contains a NavigationHistoryEntry object
     * representing the history entry for the inbound ("to") document in the navigation. This is equivalent to the
     * Navigation.currentEntry property at the moment the inbound document was activated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/entry)
     */
    open val entry: NavigationHistoryEntry

    /**
     * The navigationType read-only property of the NavigationActivation interface contains a string indicating the type
     * of navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationActivation/navigationType)
     */
    open val navigationType: NavigationType
}

/**
 * The NavigateEvent interface of the Navigation API is the event object for the navigate event, which fires when any
 * type of navigation is initiated (this includes usage of History API features like History.go()). NavigateEvent
 * provides access to information about that navigation, and allows developers to intercept and control the navigation
 * handling.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent)
 */
public open external class NavigateEvent : Event {
    /**
     * The NavigateEvent() constructor creates a new NavigateEvent object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/NavigateEvent)
     */
    constructor(type: String, eventInitDict: NavigateEventInit)

    /**
     * The navigationType read-only property of the NavigateEvent interface returns the type of the navigation — push,
     * reload, replace, or traverse.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/navigationType)
     */
    open val navigationType: NavigationType

    /**
     * The destination read-only property of the NavigateEvent interface returns a NavigationDestination object
     * representing the destination being navigated to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/destination)
     */
    open val destination: NavigationDestination

    /**
     * The canIntercept read-only property of the NavigateEvent interface returns true if the navigation can be
     * intercepted and have its URL rewritten, or false otherwise
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/canIntercept)
     */
    open val canIntercept: Boolean

    /**
     * The userInitiated read-only property of the NavigateEvent interface returns true if the navigation was initiated
     * by the user (e.g., by clicking a link, submitting a form, or pressing the browser's "Back"/"Forward" buttons), or
     * false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/userInitiated)
     */
    open val userInitiated: Boolean

    /**
     * The hashChange read-only property of the NavigateEvent interface returns true if the navigation is a fragment
     * navigation (i.e., to a fragment identifier in the same document), or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/hashChange)
     */
    open val hashChange: Boolean

    /**
     * The signal read-only property of the NavigateEvent interface returns an AbortSignal, which will become aborted if
     * the navigation is canceled (e.g., by the user pressing the browser's "Stop" button, or another navigation
     * starting and thus canceling the ongoing one).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/signal)
     */
    open val signal: AbortSignal

    /**
     * The formData read-only property of the NavigateEvent interface returns the FormData object representing the
     * submitted data in the case of a POST form submission, or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/formData)
     */
    open val formData: FormData?

    /**
     * The downloadRequest read-only property of the NavigateEvent interface returns the filename of the file requested
     * for download, in the case of a download navigation (e.g., an &lt;a&gt; or &lt;area&gt; element with a download
     * attribute), or null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/downloadRequest)
     */
    open val downloadRequest: String?

    /**
     * The info read-only property of the NavigateEvent interface returns the info data value passed by the initiating
     * navigation operation (e.g., Navigation.back(), or Navigation.navigate()), or undefined if no info data was
     * passed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/info)
     */
    open val info: JsAny?

    /**
     * The hasUAVisualTransition read-only property of the NavigateEvent interface returns true if the user agent
     * performed a visual transition for this navigation before dispatching this event, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/hasUAVisualTransition)
     */
    open val hasUAVisualTransition: Boolean

    /**
     * The sourceElement read-only property of the NavigateEvent interface returns an Element object representing the
     * initiating element, in cases where the navigation was initiated by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/sourceElement)
     */
    open val sourceElement: Element?

    /**
     * The intercept() method of the NavigateEvent interface intercepts this navigation, turning it into a same-document
     * navigation to the destination URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/intercept)
     */
    open fun intercept(options: NavigationInterceptOptions = definedExternally)

    /**
     * The scroll() method of the NavigateEvent interface can be called to manually trigger the browser-driven scrolling
     * behavior that occurs in response to the navigation, if you want it to happen before the navigation handling has
     * completed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigateEvent/scroll)
     */
    open fun scroll()

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface NavigateEventInit : EventInit {
    var navigationType: NavigationType?
    var destination: NavigationDestination
    var canIntercept: Boolean?
    var userInitiated: Boolean?
    var hashChange: Boolean?
    var signal: AbortSignal
    var formData: FormData?
    var downloadRequest: String?
    var info: JsAny?
    var hasUAVisualTransition: Boolean?
    var sourceElement: Element?
}

public fun NavigateEventInit(destination: NavigationDestination, signal: AbortSignal, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, navigationType: NavigationType? = null, canIntercept: Boolean? = null, userInitiated: Boolean? = null, hashChange: Boolean? = null, formData: FormData? = null, downloadRequest: String? = null, info: JsAny? = null, hasUAVisualTransition: Boolean? = null, sourceElement: Element? = null): NavigateEventInit = newJsObject<NavigateEventInit>().apply {
    this.destination = destination
    this.signal = signal
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (navigationType != null) this.navigationType = navigationType
    if (canIntercept != null) this.canIntercept = canIntercept
    if (userInitiated != null) this.userInitiated = userInitiated
    if (hashChange != null) this.hashChange = hashChange
    if (formData != null) this.formData = formData
    if (downloadRequest != null) this.downloadRequest = downloadRequest
    if (info != null) this.info = info
    if (hasUAVisualTransition != null) this.hasUAVisualTransition = hasUAVisualTransition
    if (sourceElement != null) this.sourceElement = sourceElement
}

public external interface NavigationInterceptOptions : JsAny {
    var precommitHandler: ((NavigationPrecommitController) -> Promise<JsAny?>)?
    var handler: (() -> Promise<JsAny?>)?
    var focusReset: NavigationFocusReset?
    var scroll: NavigationScrollBehavior?
}

public fun NavigationInterceptOptions(precommitHandler: ((NavigationPrecommitController) -> Promise<JsAny?>)? = null, handler: (() -> Promise<JsAny?>)? = null, focusReset: NavigationFocusReset? = null, scroll: NavigationScrollBehavior? = null): NavigationInterceptOptions = newJsObject<NavigationInterceptOptions>().apply {
    if (precommitHandler != null) this.precommitHandler = precommitHandler
    if (handler != null) this.handler = handler
    if (focusReset != null) this.focusReset = focusReset
    if (scroll != null) this.scroll = scroll
}

public external interface NavigationFocusReset : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NavigationFocusReset.Companion.AFTER_TRANSITION: NavigationFocusReset get() = "after-transition".toJsString().unsafeCast<NavigationFocusReset>()
public inline val NavigationFocusReset.Companion.MANUAL: NavigationFocusReset get() = "manual".toJsString().unsafeCast<NavigationFocusReset>()

public external interface NavigationScrollBehavior : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NavigationScrollBehavior.Companion.AFTER_TRANSITION: NavigationScrollBehavior get() = "after-transition".toJsString().unsafeCast<NavigationScrollBehavior>()
public inline val NavigationScrollBehavior.Companion.MANUAL: NavigationScrollBehavior get() = "manual".toJsString().unsafeCast<NavigationScrollBehavior>()

/**
 * The NavigationPrecommitController interface of the Navigation API is passed as an argument to a navigation precommit
 * handler callback.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPrecommitController)
 */
public abstract external class NavigationPrecommitController : JsAny {
    /**
     * The redirect() method of the NavigationPrecommitController interface redirects the browser to a specified URL and
     * specifies history behavior and any desired state information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPrecommitController/redirect)
     */
    open fun redirect(url: String, options: NavigationNavigateOptions = definedExternally)

    /**
     * The addHandler() method of the NavigationPrecommitController interface allows you to dynamically add a handler
     * callback function in precommit code, which will then be run after the navigation has committed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPrecommitController/addHandler)
     */
    open fun addHandler(handler: () -> Promise<JsAny?>)
}

/**
 * The NavigationDestination interface of the Navigation API represents the destination being navigated to in the
 * current navigation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination)
 */
public abstract external class NavigationDestination : JsAny {
    /**
     * The url read-only property of the NavigationDestination interface returns the URL being navigated to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/url)
     */
    open val url: String

    /**
     * The key read-only property of the NavigationDestination interface returns the key value of the destination
     * NavigationHistoryEntry if the NavigateEvent.navigationType is traverse, or an empty string otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/key)
     */
    open val key: String

    /**
     * The id read-only property of the NavigationDestination interface returns the id value of the destination
     * NavigationHistoryEntry if the NavigateEvent.navigationType is traverse, or an empty string otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/id)
     */
    open val id: String

    /**
     * The index read-only property of the NavigationDestination interface returns the index value of the destination
     * NavigationHistoryEntry if the NavigateEvent.navigationType is traverse, or -1 otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/index)
     */
    open val index: Double

    /**
     * The sameDocument read-only property of the NavigationDestination interface returns true if the navigation is to
     * the same document as the current Document value, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/sameDocument)
     */
    open val sameDocument: Boolean

    /**
     * The getState() method of the NavigationDestination interface returns a clone of the developer-supplied state
     * associated with the destination NavigationHistoryEntry, or navigation operation (e.g., navigate()) as
     * appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationDestination/getState)
     */
    open fun getState(): JsAny?
}

/**
 * The NavigationCurrentEntryChangeEvent interface of the Navigation API is the event object for the currententrychange
 * event, which fires when the Navigation.currentEntry has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent)
 */
public open external class NavigationCurrentEntryChangeEvent : Event {
    /**
     * The NavigationCurrentEntryChangeEvent() constructor creates a new NavigationCurrentEntryChangeEvent object.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/NavigationCurrentEntryChangeEvent)
     */
    constructor(type: String, eventInitDict: NavigationCurrentEntryChangeEventInit)

    /**
     * The navigationType read-only property of the NavigationCurrentEntryChangeEvent interface returns the type of the
     * navigation that resulted in the change. The property may be null if the change occurs due to
     * Navigation.updateCurrentEntry().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/navigationType)
     */
    open val navigationType: NavigationType?

    /**
     * The from read-only property of the NavigationCurrentEntryChangeEvent interface returns the NavigationHistoryEntry
     * that was navigated from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationCurrentEntryChangeEvent/from)
     */
    open val from: NavigationHistoryEntry

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface NavigationCurrentEntryChangeEventInit : EventInit {
    var navigationType: NavigationType?
    var from: NavigationHistoryEntry
}

public fun NavigationCurrentEntryChangeEventInit(from: NavigationHistoryEntry, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, navigationType: NavigationType? = null): NavigationCurrentEntryChangeEventInit = newJsObject<NavigationCurrentEntryChangeEventInit>().apply {
    this.from = from
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (navigationType != null) this.navigationType = navigationType
}

/**
 * PopStateEvent is an interface for the popstate event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent)
 */
public open external class PopStateEvent : Event {
    /**
     * The PopStateEvent() constructor creates a new PopStateEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/PopStateEvent)
     */
    constructor(type: String, eventInitDict: PopStateEventInit = definedExternally)

    /**
     * The state read-only property of the PopStateEvent interface represents the state stored when the event was
     * created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/state)
     */
    open val state: JsAny?

    /**
     * The hasUAVisualTransition read-only property of the PopStateEvent interface returns true if the user agent
     * performed a visual transition for this navigation before dispatching this event, or false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PopStateEvent/hasUAVisualTransition)
     */
    open val hasUAVisualTransition: Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface PopStateEventInit : EventInit {
    var state: JsAny?
    var hasUAVisualTransition: Boolean?
}

public fun PopStateEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, state: JsAny? = null, hasUAVisualTransition: Boolean? = null): PopStateEventInit = newJsObject<PopStateEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (state != null) this.state = state
    if (hasUAVisualTransition != null) this.hasUAVisualTransition = hasUAVisualTransition
}

/**
 * The HashChangeEvent interface represents events that fire when the fragment identifier of the URL has changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent)
 */
public open external class HashChangeEvent : Event {
    /**
     * The HashChangeEvent() constructor creates a new HashChangeEvent object, that is used by the hashchange event
     * fired at the window object when the fragment of the URL changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/HashChangeEvent)
     */
    constructor(type: String, eventInitDict: HashChangeEventInit = definedExternally)

    /**
     * The oldURL read-only property of the HashChangeEvent interface returns the previous URL from which the window was
     * navigated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/oldURL)
     */
    open val oldURL: String

    /**
     * The newURL read-only property of the HashChangeEvent interface returns the new URL to which the window is
     * navigating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/newURL)
     */
    open val newURL: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface HashChangeEventInit : EventInit {
    var oldURL: String?
    var newURL: String?
}

public fun HashChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, oldURL: String? = null, newURL: String? = null): HashChangeEventInit = newJsObject<HashChangeEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (oldURL != null) this.oldURL = oldURL
    if (newURL != null) this.newURL = newURL
}

/**
 * The PageSwapEvent event object is made available inside handler functions for the pageswap event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent)
 */
public open external class PageSwapEvent : Event {
    /**
     * The PageSwapEvent() constructor creates a new PageSwapEvent object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/PageSwapEvent)
     */
    constructor(type: String, eventInitDict: PageSwapEventInit = definedExternally)

    /**
     * The activation read-only property of the PageSwapEvent interface contains a NavigationActivation object
     * containing the navigation type and current and destination document history entries for a same-origin navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageSwapEvent/activation)
     */
    open val activation: NavigationActivation?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface PageSwapEventInit : EventInit {
    var activation: NavigationActivation?
}

public fun PageSwapEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, activation: NavigationActivation? = null): PageSwapEventInit = newJsObject<PageSwapEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (activation != null) this.activation = activation
}

/**
 * The PageRevealEvent event object is made available inside handler functions for the pagereveal event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageRevealEvent)
 */
public open external class PageRevealEvent : Event {
    /**
     * The PageRevealEvent() constructor creates a new PageRevealEvent object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageRevealEvent/PageRevealEvent)
     */
    constructor(type: String, eventInitDict: PageRevealEventInit = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface PageRevealEventInit : EventInit

public fun PageRevealEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): PageRevealEventInit = newJsObject<PageRevealEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

/**
 * The PageTransitionEvent event object is available inside handler functions for the pageshow and pagehide events,
 * fired when a document is being loaded or unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent)
 */
public open external class PageTransitionEvent : Event {
    /**
     * The PageTransitionEvent() constructor creates a new PageTransitionEvent object, that is used by the pageshow or
     * pagehide events, fired at the window object when a page is loaded or unloaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent/PageTransitionEvent)
     */
    constructor(type: String, eventInitDict: PageTransitionEventInit = definedExternally)

    /**
     * The persisted read-only property indicates if a webpage is loading from a cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PageTransitionEvent/persisted)
     */
    open val persisted: Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface PageTransitionEventInit : EventInit {
    var persisted: Boolean?
}

public fun PageTransitionEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, persisted: Boolean? = null): PageTransitionEventInit = newJsObject<PageTransitionEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (persisted != null) this.persisted = persisted
}

/**
 * The BeforeUnloadEvent interface represents the event object for the beforeunload event, which is fired when the
 * current window, contained document, and associated resources are about to be unloaded.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BeforeUnloadEvent)
 */
public abstract external class BeforeUnloadEvent : Event {

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

/**
 * The NotRestoredReasonDetails interface of the Performance API represents a single reason why a navigated page was
 * blocked from using the back/forward cache (bfcache).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasonDetails)
 */
public abstract external class NotRestoredReasonDetails : JsAny {
    /**
     * The reason read-only property of the NotRestoredReasonDetails interface returns a string describing a reason that
     * the page was blocked from using the back/forward cache (bfcache).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasonDetails/reason)
     */
    open val reason: String

    /**
     * The toJSON() method of the NotRestoredReasonDetails interface returns a JSON-serializable plain object
     * representing the NotRestoredReasonDetails object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasonDetails/toJSON)
     */
    open fun toJSON(): JsAny
}

/**
 * The NotRestoredReasons interface of the Performance API provides report data containing reasons why the current
 * document was blocked from using the back/forward cache (bfcache) on navigation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons)
 */
public abstract external class NotRestoredReasons : JsAny {
    /**
     * The src read-only property of the NotRestoredReasons interface returns a string representing the path to the
     * source of the &lt;iframe&gt; the document is contained in (for example &lt;iframe src="b.html"&gt;).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/src)
     */
    open val src: String?

    /**
     * The id read-only property of the NotRestoredReasons interface returns a string representing the id attribute
     * value of the &lt;iframe&gt; the document is contained in (for example &lt;iframe id="foo" src="..."&gt;).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/id)
     */
    open val id: String?

    /**
     * The name read-only property of the NotRestoredReasons interface returns a string representing the name attribute
     * value of the &lt;iframe&gt; the document is contained in (for example &lt;iframe name="bar" src="..."&gt;).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/name)
     */
    open val name: String?

    /**
     * The url read-only property of the NotRestoredReasons interface returns a string representing the URL of the
     * navigated page or &lt;iframe&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/url)
     */
    open val url: String?

    /**
     * The reasons read-only property of the NotRestoredReasons interface returns an array of NotRestoredReasonDetails
     * objects, each representing a reason why the navigated page was blocked from using the back/forward cache
     * (bfcache).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/reasons)
     */
    open val reasons: JsArray<NotRestoredReasonDetails>?

    /**
     * The children read-only property of the NotRestoredReasons interface returns an array of NotRestoredReasons
     * objects, one for each child &lt;iframe&gt; embedded in the current document, which may contain reasons why the
     * top-level frame was blocked relating to the child frames.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/children)
     */
    open val children: JsArray<NotRestoredReasons>?

    /**
     * The toJSON() method of the NotRestoredReasons interface returns a JSON-serializable plain object representing the
     * NotRestoredReasons object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotRestoredReasons/toJSON)
     */
    open fun toJSON(): JsAny
}

/**
 * The ErrorEvent interface represents events providing information related to errors in scripts or in files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent)
 */
public open external class ErrorEvent : Event {
    /**
     * The ErrorEvent() constructor creates a new ErrorEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/ErrorEvent)
     */
    constructor(type: String, eventInitDict: ErrorEventInit = definedExternally)

    /**
     * The message read-only property of the ErrorEvent interface returns a string containing a human-readable error
     * message describing the problem.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/message)
     */
    open val message: String

    /**
     * The filename read-only property of the ErrorEvent interface returns a string containing the name of the script
     * file in which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/filename)
     */
    open val filename: String

    /**
     * The lineno read-only property of the ErrorEvent interface returns an integer containing the line number of the
     * script file on which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/lineno)
     */
    open val lineno: Int

    /**
     * The colno read-only property of the ErrorEvent interface returns an integer containing the column number of the
     * script file on which the error occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/colno)
     */
    open val colno: Int

    /**
     * The error read-only property of the ErrorEvent interface returns a JavaScript value, such as an Error or
     * DOMException, representing the error associated with this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ErrorEvent/error)
     */
    open val error: JsAny?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ErrorEventInit : EventInit {
    var message: String?
    var filename: String?
    var lineno: Int?
    var colno: Int?
    var error: JsAny?
}

public fun ErrorEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, message: String? = null, filename: String? = null, lineno: Int? = null, colno: Int? = null, error: JsAny? = null): ErrorEventInit = newJsObject<ErrorEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (message != null) this.message = message
    if (filename != null) this.filename = filename
    if (lineno != null) this.lineno = lineno
    if (colno != null) this.colno = colno
    if (error != null) this.error = error
}

/**
 * The PromiseRejectionEvent interface represents events which are sent to the global script context when JavaScript
 * Promises are rejected. These events are particularly useful for telemetry and debugging purposes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent)
 */
public open external class PromiseRejectionEvent : Event {
    /**
     * The PromiseRejectionEvent() constructor returns a new PromiseRejectionEvent object, which represents events fired
     * when a JavaScript Promise is rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/PromiseRejectionEvent)
     */
    constructor(type: String, eventInitDict: PromiseRejectionEventInit)

    /**
     * The PromiseRejectionEvent interface's promise read-only property indicates the JavaScript Promise which was
     * rejected. You can examine the event's PromiseRejectionEvent.reason property to learn why the promise was
     * rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/promise)
     */
    open val promise: JsAny

    /**
     * The PromiseRejectionEvent reason read-only property is any JavaScript value or Object which provides the reason
     * passed into Promise.reject(). This in theory provides information about why the promise was rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PromiseRejectionEvent/reason)
     */
    open val reason: JsAny?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface PromiseRejectionEventInit : EventInit {
    var promise: JsAny
    var reason: JsAny?
}

public fun PromiseRejectionEventInit(promise: JsAny, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, reason: JsAny? = null): PromiseRejectionEventInit = newJsObject<PromiseRejectionEventInit>().apply {
    this.promise = promise
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (reason != null) this.reason = reason
}

public external interface GlobalEventHandlers : JsAny {
    var onabort: ((Event) -> Unit)?

    /**
     * The auxclick event is fired at an Element when a non-primary pointing device button (any mouse button other than
     * the primary—usually leftmost—button) has been pressed and released both within the same element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     */
    var onauxclick: ((PointerEvent) -> Unit)?

    /**
     * The DOM beforeinput event fires when the value of an &lt;input&gt; or &lt;textarea&gt; element is about to be
     * modified. But in contrast to the input event, it does not fire on the &lt;select&gt; element. The event also
     * applies to elements with contenteditable enabled, and to any element when designMode is turned on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     */
    var onbeforeinput: ((InputEvent) -> Unit)?

    /**
     * An element receives a beforematch event when it is in the hidden until found state and the browser is about to
     * reveal its content because the user has found the content through the "find in page" feature or through fragment
     * navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforematch_event)
     */
    var onbeforematch: ((Event) -> Unit)?

    /**
     * The beforetoggle event of the HTMLElement interface fires on a popover or &lt;dialog&gt; element just before it
     * is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     */
    var onbeforetoggle: ((ToggleEvent) -> Unit)?

    /**
     * The blur event fires when an element has lost focus. The event does not bubble, but the related focusout event
     * that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     */
    var onblur: ((FocusEvent) -> Unit)?
    var oncancel: ((Event) -> Unit)?
    var oncanplay: ((Event) -> Unit)?
    var oncanplaythrough: ((Event) -> Unit)?

    /**
     * The change event is fired for &lt;input&gt;, &lt;select&gt;, and &lt;textarea&gt; elements when the user modifies
     * the element's value. Unlike the input event, the change event is not necessarily fired for each alteration to an
     * element's value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/change_event)
     */
    var onchange: ((Event) -> Unit)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     */
    var onclick: ((PointerEvent) -> Unit)?
    var onclose: ((Event) -> Unit)?

    /**
     * The command event of the HTMLElement interface fires on an element that is controlled via a button with valid
     * commandForElement and command values, whenever the button is interacted with (e.g., it is clicked).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
     */
    var oncommand: ((CommandEvent) -> Unit)?
    var oncontextlost: ((Event) -> Unit)?

    /**
     * The contextmenu event fires when the user attempts to open a context menu. This event is typically triggered by
     * clicking the right mouse button, or by pressing the context menu key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     */
    var oncontextmenu: ((PointerEvent) -> Unit)?
    var oncontextrestored: ((Event) -> Unit)?

    /**
     * The copy event of the Clipboard API fires when the user initiates a copy action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event)
     */
    var oncopy: ((ClipboardEvent) -> Unit)?
    var oncuechange: ((Event) -> Unit)?

    /**
     * The cut event of the Clipboard API is fired when the user has initiated a "cut" action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event)
     */
    var oncut: ((ClipboardEvent) -> Unit)?

    /**
     * The dblclick event fires when a pointing device button (such as a mouse's primary button) is double-clicked; that
     * is, when it's rapidly clicked twice on a single element within a very short span of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     */
    var ondblclick: ((MouseEvent) -> Unit)?

    /**
     * The drag event is fired repeatedly as an element or text selection is being dragged by the user. The firing
     * frequency depends on the browser, operating system, and pointer movement; do not rely on a fixed interval.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     */
    var ondrag: ((DragEvent) -> Unit)?

    /**
     * The dragend event is fired when a drag operation ends (by releasing a mouse button or hitting the escape key).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     */
    var ondragend: ((DragEvent) -> Unit)?

    /**
     * The dragenter event is fired when a dragged element or text selection enters a valid drop target. The target
     * object is the immediate user selection (the element directly indicated by the user as the drop target), or the
     * &lt;body&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     */
    var ondragenter: ((DragEvent) -> Unit)?

    /**
     * The dragleave event is fired when a dragged element or text selection leaves a valid drop target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     */
    var ondragleave: ((DragEvent) -> Unit)?

    /**
     * The dragover event is fired repeatedly when an element or text selection is being dragged over a potential drop
     * target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     */
    var ondragover: ((DragEvent) -> Unit)?

    /**
     * The dragstart event is fired when the user starts dragging an element or text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     */
    var ondragstart: ((DragEvent) -> Unit)?

    /**
     * The drop event is fired when an element or text selection is dropped on a valid drop target. To ensure that the
     * drop event always fires as expected, you should always include a preventDefault() call in the part of your code
     * which handles the dragover event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     */
    var ondrop: ((DragEvent) -> Unit)?
    var ondurationchange: ((Event) -> Unit)?
    var onemptied: ((Event) -> Unit)?
    var onended: ((Event) -> Unit)?

    /**
     * The error event is fired on an element when a resource failed to load, or can't be used. For example, if a script
     * has an execution error or an image can't be found or is invalid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
     */
    var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?

    /**
     * The focus event fires when an element has received focus. The event does not bubble, but the related focusin
     * event that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     */
    var onfocus: ((FocusEvent) -> Unit)?
    var onformdata: ((FormDataEvent) -> Unit)?

    /**
     * The input event fires when the value of an &lt;input&gt;, &lt;select&gt;, or &lt;textarea&gt; element has been
     * changed as a direct result of a user action (such as typing in a textbox or checking a checkbox).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     */
    var oninput: ((InputEvent) -> Unit)?
    var oninvalid: ((Event) -> Unit)?

    /**
     * The keydown event is fired when a key is pressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     */
    var onkeydown: ((KeyboardEvent) -> Unit)?

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
    var onkeypress: ((KeyboardEvent) -> Unit)?

    /**
     * The keyup event is fired when a key is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     */
    var onkeyup: ((KeyboardEvent) -> Unit)?

    /**
     * The load event fires for elements containing a resource when the resource has successfully loaded. Currently, the
     * list of supported HTML elements are: &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;link&gt;, &lt;object&gt;,
     * &lt;script&gt;, &lt;style&gt;, and &lt;track&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
     */
    var onload: ((Event) -> Unit)?
    var onloadeddata: ((Event) -> Unit)?
    var onloadedmetadata: ((Event) -> Unit)?
    var onloadstart: ((Event) -> Unit)?

    /**
     * The mousedown event is fired at an Element when a pointing device button is pressed while the pointer is inside
     * the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     */
    var onmousedown: ((MouseEvent) -> Unit)?

    /**
     * The mouseenter event is fired at an Element when a pointing device (usually a mouse) is initially moved so that
     * its hotspot is within the element at which the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     */
    var onmouseenter: ((MouseEvent) -> Unit)?

    /**
     * The mouseleave event is fired at an Element when the cursor of a pointing device (usually a mouse) is moved out
     * of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     */
    var onmouseleave: ((MouseEvent) -> Unit)?

    /**
     * The mousemove event is fired at an element when a pointing device (usually a mouse) is moved while the cursor's
     * hotspot is inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     */
    var onmousemove: ((MouseEvent) -> Unit)?

    /**
     * The mouseout event is fired at an Element when a pointing device (usually a mouse) is used to move the cursor so
     * that it is no longer contained within the element or one of its children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     */
    var onmouseout: ((MouseEvent) -> Unit)?

    /**
     * The mouseover event is fired at an Element when a pointing device (such as a mouse or trackpad) is used to move
     * the cursor onto the element or one of its child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     */
    var onmouseover: ((MouseEvent) -> Unit)?

    /**
     * The mouseup event is fired at an Element when a button on a pointing device (such as a mouse or trackpad) is
     * released while the pointer is located inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     */
    var onmouseup: ((MouseEvent) -> Unit)?

    /**
     * The paste event of the Clipboard API is fired when the user has initiated a "paste" action through the browser's
     * user interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event)
     */
    var onpaste: ((ClipboardEvent) -> Unit)?
    var onpause: ((Event) -> Unit)?
    var onplay: ((Event) -> Unit)?
    var onplaying: ((Event) -> Unit)?
    var onprogress: ((Event) -> Unit)?
    var onratechange: ((Event) -> Unit)?
    var onreset: ((Event) -> Unit)?

    /**
     * The resize event fires when the document view (window) has been resized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
     */
    var onresize: ((Event) -> Unit)?

    /**
     * The scroll event fires when the document view has been scrolled. To detect when scrolling has completed, see the
     * scrollend event of Document. For element scrolling, see scroll event of Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     */
    var onscroll: ((Event) -> Unit)?

    /**
     * The scrollend event fires when the document view has completed scrolling. Scrolling is considered completed when
     * the scroll position has no more pending updates and the user has completed their gesture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     */
    var onscrollend: ((Event) -> Unit)?

    /**
     * The securitypolicyviolation event is fired when a Content Security Policy is violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event)
     */
    var onsecuritypolicyviolation: ((Event) -> Unit)?
    var onseeked: ((Event) -> Unit)?
    var onseeking: ((Event) -> Unit)?
    var onselect: ((Event) -> Unit)?
    var onslotchange: ((Event) -> Unit)?
    var onstalled: ((Event) -> Unit)?
    var onsubmit: ((SubmitEvent) -> Unit)?
    var onsuspend: ((Event) -> Unit)?
    var ontimeupdate: ((Event) -> Unit)?

    /**
     * The toggle event of the HTMLElement interface fires on a popover element, &lt;dialog&gt; element, or
     * &lt;details&gt; element just after it is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/toggle_event)
     */
    var ontoggle: ((ToggleEvent) -> Unit)?
    var onvolumechange: ((Event) -> Unit)?
    var onwaiting: ((Event) -> Unit)?
    var onwebkitanimationend: ((Event) -> Unit)?
    var onwebkitanimationiteration: ((Event) -> Unit)?
    var onwebkitanimationstart: ((Event) -> Unit)?
    var onwebkittransitionend: ((Event) -> Unit)?

    /**
     * The wheel event fires when the user rotates a wheel button on a pointing device (typically a mouse). It is also
     * fired for related devices that simulate wheel actions, such as trackpads and mouse balls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event)
     */
    var onwheel: ((WheelEvent) -> Unit)?

    /**
     * The touchstart event is fired when one or more touch points are placed on the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     */
    var ontouchstart: ((TouchEvent) -> Unit)?

    /**
     * The touchend event fires when one or more touch points are removed from the touch surface. Remember that it is
     * possible to get a touchcancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     */
    var ontouchend: ((TouchEvent) -> Unit)?

    /**
     * The touchmove event is fired when one or more touch points are moved along the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     */
    var ontouchmove: ((TouchEvent) -> Unit)?

    /**
     * The touchcancel event is fired when one or more touch points have been disrupted in an implementation-specific
     * manner.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     */
    var ontouchcancel: ((TouchEvent) -> Unit)?

    /**
     * The pointerover event is fired when a pointing device is moved into an element's hit test boundaries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event)
     */
    var onpointerover: ((PointerEvent) -> Unit)?

    /**
     * The pointerenter event fires when a pointing device is moved into the hit test boundaries of an element or one of
     * its descendants, including as a result of a pointerdown event from a device that does not support hover (see
     * pointerdown). Otherwise, pointerenter works the same as mouseenter, and are dispatched at the same time. They are
     * also dispatched at the same time as mouseover and pointerover events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event)
     */
    var onpointerenter: ((PointerEvent) -> Unit)?

    /**
     * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions
     * from no buttons pressed to at least one button pressed. For touch, it is fired when physical contact is made with
     * the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event)
     */
    var onpointerdown: ((PointerEvent) -> Unit)?

    /**
     * The pointermove event is fired when a pointer changes coordinates, and the pointer has not been canceled by a
     * browser touch-action. The event is also fired when a pointer changes any of its other properties, provided the
     * change doesn't produce some other pointer event. This includes any change to pressure, tangential pressure, tilt,
     * twist, contact geometry (width and height), or chorded buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event)
     */
    var onpointermove: ((PointerEvent) -> Unit)?

    /**
     * The pointerrawupdate event is fired when a pointer changes any properties that don't fire pointerdown or
     * pointerup events. See pointermove for a list of these properties.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerrawupdate_event)
     */
    var onpointerrawupdate: ((PointerEvent) -> Unit)?

    /**
     * The pointerup event is fired when a pointer is no longer active. Remember that it is possible to get a
     * pointercancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event)
     */
    var onpointerup: ((PointerEvent) -> Unit)?

    /**
     * The pointercancel event is fired when the browser determines that there are unlikely to be any more pointer
     * events, or if after the pointerdown event is fired, the pointer is then used to manipulate the viewport by
     * panning, zooming, or scrolling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event)
     */
    var onpointercancel: ((PointerEvent) -> Unit)?

    /**
     * The pointerout event is fired for several reasons including: pointing device is moved out of the hit test
     * boundaries of an element; firing the pointerup event for a device that does not support hover (see pointerup);
     * after firing the pointercancel event (see pointercancel); when a pen stylus leaves the hover range detectable by
     * the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event)
     */
    var onpointerout: ((PointerEvent) -> Unit)?

    /**
     * The pointerleave event is fired when a pointing device is moved out of the hit test boundaries of an element. For
     * pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer. Otherwise,
     * pointerleave works the same as mouseleave, and are dispatched at the same time. They are also dispatched at the
     * same time as mouseout and pointerout events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event)
     */
    var onpointerleave: ((PointerEvent) -> Unit)?

    /**
     * The gotpointercapture event is fired when an element captures a pointer using setPointerCapture().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event)
     */
    var ongotpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The lostpointercapture event is fired when a captured pointer is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/lostpointercapture_event)
     */
    var onlostpointercapture: ((PointerEvent) -> Unit)?
}

public external interface WindowEventHandlers : JsAny {
    /**
     * The afterprint event is fired after the associated document has started printing or the print preview has been
     * closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/afterprint_event)
     */
    var onafterprint: ((Event) -> Unit)?

    /**
     * The beforeprint event is fired when the associated document is about to be printed or previewed for printing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeprint_event)
     */
    var onbeforeprint: ((Event) -> Unit)?

    /**
     * The beforeunload event is fired when the current window, contained document, and associated resources are about
     * to be unloaded. The document is still visible and the event is still cancelable at this point.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/beforeunload_event)
     */
    var onbeforeunload: ((BeforeUnloadEvent) -> String?)?

    /**
     * The hashchange event is fired when the fragment identifier of the URL has changed (the part of the URL beginning
     * with and following the # symbol).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/hashchange_event)
     */
    var onhashchange: ((HashChangeEvent) -> Unit)?

    /**
     * The languagechange event is fired at the global scope object when the user's preferred language changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/languagechange_event)
     */
    var onlanguagechange: ((Event) -> Unit)?

    /**
     * The message event is fired on a Window object when the window receives a message, for example from a call to
     * Window.postMessage() from another browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/message_event)
     */
    var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The messageerror event is fired on a Window object when it receives a message that can't be deserialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/messageerror_event)
     */
    var onmessageerror: ((MessageEvent) -> Unit)?

    /**
     * The offline event of the Window interface is fired when the browser has lost access to the network and the value
     * of Navigator.onLine switches to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/offline_event)
     */
    var onoffline: ((Event) -> Unit)?

    /**
     * The online event of the Window interface is fired when the browser has gained access to the network and the value
     * of Navigator.onLine switches to true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/online_event)
     */
    var ononline: ((Event) -> Unit)?

    /**
     * The pagehide event is sent to a Window when the browser hides the current page in the process of presenting a
     * different page from the session's history.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagehide_event)
     */
    var onpagehide: ((PageTransitionEvent) -> Unit)?

    /**
     * The pagereveal event is fired when a document is first rendered, either when loading a fresh document from the
     * network or activating a document (either from back/forward cache (bfcache) or prerender).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pagereveal_event)
     */
    var onpagereveal: ((PageRevealEvent) -> Unit)?

    /**
     * The pageshow event is sent to a Window when the browser navigates to a new document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageshow_event)
     */
    var onpageshow: ((PageTransitionEvent) -> Unit)?

    /**
     * The pageswap event is fired when you navigate across documents, when the previous document is about to unload.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/pageswap_event)
     */
    var onpageswap: ((PageSwapEvent) -> Unit)?

    /**
     * The popstate event of the Window interface is fired when the active history entry changes while the user
     * navigates the session history. It changes the current history entry to that of the last page the user visited or,
     * if history.pushState() has been used to add a history entry to the history stack, that history entry is used
     * instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/popstate_event)
     */
    var onpopstate: ((PopStateEvent) -> Unit)?

    /**
     * The rejectionhandled event is sent to the script's global scope (usually window but also Worker) whenever a
     * rejected JavaScript Promise is handled late, i.e., when a handler is attached to the promise after its rejection
     * had caused an unhandledrejection event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/rejectionhandled_event)
     */
    var onrejectionhandled: ((PromiseRejectionEvent) -> Unit)?

    /**
     * The storage event of the Window interface fires when another document that shares the same storage area (either
     * localStorage or sessionStorage) as the current window updates that storage area. The event is not fired on the
     * window that made the change.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/storage_event)
     */
    var onstorage: ((StorageEvent) -> Unit)?

    /**
     * The unhandledrejection event is sent to the global scope of a script when a JavaScript Promise that has no
     * rejection handler is rejected; typically, this is the window, but may also be a Worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unhandledrejection_event)
     */
    var onunhandledrejection: ((PromiseRejectionEvent) -> Unit)?

    /**
     * The unload event is fired when the document or a child resource is being unloaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/unload_event)
     */
    var onunload: ((Event) -> Unit)?
}

public external interface WindowOrWorkerGlobalScope : JsAny {
    val origin: String
    val isSecureContext: Boolean
    val crossOriginIsolated: Boolean
    fun reportError(e: JsAny?)
    fun btoa(data: String): String
    fun atob(data: String): String
    fun setTimeout(handler: String, timeout: Int = definedExternally, vararg arguments: JsAny?): Int
    fun setTimeout(handler: (JsAny?) -> JsAny?, timeout: Int = definedExternally, vararg arguments: JsAny?): Int
    fun clearTimeout(id: Int = definedExternally)
    fun setInterval(handler: String, timeout: Int = definedExternally, vararg arguments: JsAny?): Int
    fun setInterval(handler: (JsAny?) -> JsAny?, timeout: Int = definedExternally, vararg arguments: JsAny?): Int
    fun clearInterval(id: Int = definedExternally)
    fun queueMicrotask(callback: () -> Unit)
    fun createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions = definedExternally): Promise<ImageBitmap>
    fun createImageBitmap(image: ImageBitmapSource, sx: Int, sy: Int, sw: Int, sh: Int, options: ImageBitmapOptions = definedExternally): Promise<ImageBitmap>
    fun structuredClone(value: JsAny?, options: StructuredSerializeOptions = definedExternally): JsAny?
    fun fetch(input: Request, init: RequestInit = definedExternally): Promise<Response>
    fun fetch(input: String, init: RequestInit = definedExternally): Promise<Response>
    val performance: Performance

    /**
     * Available only in secure contexts.
     */
    val caches: CacheStorage
}

public external interface SanitizerPresets : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val SanitizerPresets.Companion.DEFAULT: SanitizerPresets get() = "default".toJsString().unsafeCast<SanitizerPresets>()

public external interface SetHTMLOptions : JsAny {
    var sanitizer: JsAny?
}

public fun SetHTMLOptions(sanitizer: JsAny? = null): SetHTMLOptions = newJsObject<SetHTMLOptions>().apply {
    if (sanitizer != null) this.sanitizer = sanitizer
}

public external interface SetHTMLUnsafeOptions : JsAny {
    var sanitizer: JsAny?
    var runScripts: Boolean?
}

public fun SetHTMLUnsafeOptions(sanitizer: JsAny? = null, runScripts: Boolean? = null): SetHTMLUnsafeOptions = newJsObject<SetHTMLUnsafeOptions>().apply {
    if (sanitizer != null) this.sanitizer = sanitizer
    if (runScripts != null) this.runScripts = runScripts
}

public external interface ParseHTMLUnsafeOptions : JsAny {
    var sanitizer: JsAny?
}

public fun ParseHTMLUnsafeOptions(sanitizer: JsAny? = null): ParseHTMLUnsafeOptions = newJsObject<ParseHTMLUnsafeOptions>().apply {
    if (sanitizer != null) this.sanitizer = sanitizer
}

public external interface GetHTMLOptions : JsAny {
    var serializableShadowRoots: Boolean?
    var shadowRoots: JsArray<ShadowRoot>?
}

public fun GetHTMLOptions(serializableShadowRoots: Boolean? = null, shadowRoots: JsArray<ShadowRoot>? = null): GetHTMLOptions = newJsObject<GetHTMLOptions>().apply {
    if (serializableShadowRoots != null) this.serializableShadowRoots = serializableShadowRoots
    if (shadowRoots != null) this.shadowRoots = shadowRoots
}

/**
 * The DOMParser interface provides the ability to parse XML or HTML source code from a string into a DOM Document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser)
 */
public open external class DOMParser : JsAny {
    /**
     * The DOMParser() constructor creates a new DOMParser object. This object can be used to parse the text of a
     * document using the parseFromString() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser/DOMParser)
     */
    constructor()

    /**
     * The parseFromString() method of the DOMParser interface parses an input containing either HTML or XML, returning
     * a Document with the type given in the contentType property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMParser/parseFromString)
     */
    open fun parseFromString(string: String, type: DOMParserSupportedType): Document
}

public external interface DOMParserSupportedType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val DOMParserSupportedType.Companion.TEXT_HTML: DOMParserSupportedType get() = "text/html".toJsString().unsafeCast<DOMParserSupportedType>()
public inline val DOMParserSupportedType.Companion.TEXT_XML: DOMParserSupportedType get() = "text/xml".toJsString().unsafeCast<DOMParserSupportedType>()
public inline val DOMParserSupportedType.Companion.APPLICATION_XML: DOMParserSupportedType get() = "application/xml".toJsString().unsafeCast<DOMParserSupportedType>()
public inline val DOMParserSupportedType.Companion.APPLICATION_XHTML_XML: DOMParserSupportedType get() = "application/xhtml+xml".toJsString().unsafeCast<DOMParserSupportedType>()
public inline val DOMParserSupportedType.Companion.IMAGE_SVG_XML: DOMParserSupportedType get() = "image/svg+xml".toJsString().unsafeCast<DOMParserSupportedType>()

/**
 * The XMLSerializer interface provides the serializeToString() method to construct an XML string representing a DOM
 * tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer)
 */
public open external class XMLSerializer : JsAny {
    /**
     * The XMLSerializer() constructor creates a new XMLSerializer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer/XMLSerializer)
     */
    constructor()

    /**
     * The XMLSerializer method serializeToString() constructs a string representing the specified DOM tree in XML form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLSerializer/serializeToString)
     */
    open fun serializeToString(root: Node): String
}

/**
 * The Sanitizer interface of the HTML Sanitizer API defines a configuration object that specifies what elements,
 * attributes and comments are allowed or should be removed when inserting strings of HTML into an Element or
 * ShadowRoot, or when parsing an HTML string into a Document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer)
 */
public open external class Sanitizer : JsAny {
    /**
     * The Sanitizer() constructor creates a new Sanitizer object, which can be used to filter unwanted elements and
     * attributes from HTML or documents before they are inserted/parsed into the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/Sanitizer)
     */
    constructor(configuration: SanitizerConfig)

    /**
     * The Sanitizer() constructor creates a new Sanitizer object, which can be used to filter unwanted elements and
     * attributes from HTML or documents before they are inserted/parsed into the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/Sanitizer)
     */
    constructor(configuration: SanitizerPresets)

    /**
     * The Sanitizer() constructor creates a new Sanitizer object, which can be used to filter unwanted elements and
     * attributes from HTML or documents before they are inserted/parsed into the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/Sanitizer)
     */
    constructor()

    /**
     * The get() method of the Sanitizer interface returns a SanitizerConfig dictionary instance that represents the
     * current Sanitizer configuration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/get)
     */
    open fun get(): SanitizerConfig

    /**
     * The allowElement() method of the Sanitizer interface sets that the specified element is allowed in the output
     * when the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/allowElement)
     */
    open fun allowElement(element: String): Boolean

    /**
     * The allowElement() method of the Sanitizer interface sets that the specified element is allowed in the output
     * when the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/allowElement)
     */
    open fun allowElement(element: SanitizerElementNamespaceWithAttributes): Boolean

    /**
     * The removeElement() method of the Sanitizer interface sets the specified element be removed from the output when
     * the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeElement)
     */
    open fun removeElement(element: String): Boolean

    /**
     * The removeElement() method of the Sanitizer interface sets the specified element be removed from the output when
     * the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeElement)
     */
    open fun removeElement(element: SanitizerElementNamespace): Boolean

    /**
     * The replaceElementWithChildren() method of the Sanitizer interface sets an element to be replaced by its child
     * HTML elements when the sanitizer is used. This is primarily used for stripping styles from text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/replaceElementWithChildren)
     */
    open fun replaceElementWithChildren(element: String): Boolean

    /**
     * The replaceElementWithChildren() method of the Sanitizer interface sets an element to be replaced by its child
     * HTML elements when the sanitizer is used. This is primarily used for stripping styles from text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/replaceElementWithChildren)
     */
    open fun replaceElementWithChildren(element: SanitizerElementNamespace): Boolean
    open fun allowProcessingInstruction(pi: String): Boolean
    open fun allowProcessingInstruction(pi: SanitizerProcessingInstruction): Boolean
    open fun removeProcessingInstruction(pi: String): Boolean
    open fun removeProcessingInstruction(pi: SanitizerProcessingInstruction): Boolean

    /**
     * The allowAttribute() method of the Sanitizer interface sets an attribute to be allowed on all elements when the
     * sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/allowAttribute)
     */
    open fun allowAttribute(attribute: String): Boolean

    /**
     * The allowAttribute() method of the Sanitizer interface sets an attribute to be allowed on all elements when the
     * sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/allowAttribute)
     */
    open fun allowAttribute(attribute: SanitizerAttributeNamespace): Boolean

    /**
     * The removeAttribute() method of the Sanitizer interface sets an attribute to be removed from all elements when
     * the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeAttribute)
     */
    open fun removeAttribute(attribute: String): Boolean

    /**
     * The removeAttribute() method of the Sanitizer interface sets an attribute to be removed from all elements when
     * the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeAttribute)
     */
    open fun removeAttribute(attribute: SanitizerAttributeNamespace): Boolean

    /**
     * The setComments() method of the Sanitizer interface sets whether comments will be allowed or removed by the
     * sanitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/setComments)
     */
    open fun setComments(allow: Boolean): Boolean

    /**
     * The setDataAttributes() method of the Sanitizer interface sets whether all data-* attributes will be allowed by
     * the sanitizer, or if they must be individually specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/setDataAttributes)
     */
    open fun setDataAttributes(allow: Boolean): Boolean
    open fun setJavascriptURLs(allow: Boolean): Boolean

    /**
     * The removeUnsafe() method of the Sanitizer interface configures the sanitizer so that it will remove all elements
     * and attributes that are considered XSS-unsafe by the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeUnsafe)
     */
    open fun removeUnsafe(): Boolean
}

public external interface SanitizerElementNamespace : JsAny {
    var name: String
    var namespace: String?
}

public fun SanitizerElementNamespace(name: String, namespace: String? = null): SanitizerElementNamespace = newJsObject<SanitizerElementNamespace>().apply {
    this.name = name
    if (namespace != null) this.namespace = namespace
}

public external interface SanitizerElementNamespaceWithAttributes : SanitizerElementNamespace {
    var attributes: JsArray<JsAny>?
    var removeAttributes: JsArray<JsAny>?
}

public fun SanitizerElementNamespaceWithAttributes(name: String, namespace: String? = null, attributes: JsArray<JsAny>? = null, removeAttributes: JsArray<JsAny>? = null): SanitizerElementNamespaceWithAttributes = newJsObject<SanitizerElementNamespaceWithAttributes>().apply {
    this.name = name
    if (namespace != null) this.namespace = namespace
    if (attributes != null) this.attributes = attributes
    if (removeAttributes != null) this.removeAttributes = removeAttributes
}

public external interface SanitizerAttributeNamespace : JsAny {
    var name: String
    var namespace: String?
}

public fun SanitizerAttributeNamespace(name: String, namespace: String? = null): SanitizerAttributeNamespace = newJsObject<SanitizerAttributeNamespace>().apply {
    this.name = name
    if (namespace != null) this.namespace = namespace
}

public external interface SanitizerProcessingInstruction : JsAny {
    var target: String
}

public fun SanitizerProcessingInstruction(target: String): SanitizerProcessingInstruction = newJsObject<SanitizerProcessingInstruction>().apply {
    this.target = target
}

public external interface SanitizerConfig : JsAny {
    var elements: JsArray<JsAny>?
    var removeElements: JsArray<JsAny>?
    var replaceWithChildrenElements: JsArray<JsAny>?
    var processingInstructions: JsArray<JsAny>?
    var removeProcessingInstructions: JsArray<JsAny>?
    var attributes: JsArray<JsAny>?
    var removeAttributes: JsArray<JsAny>?
    var comments: Boolean?
    var dataAttributes: Boolean?
    var javascriptURLs: Boolean?
}

public fun SanitizerConfig(elements: JsArray<JsAny>? = null, removeElements: JsArray<JsAny>? = null, replaceWithChildrenElements: JsArray<JsAny>? = null, processingInstructions: JsArray<JsAny>? = null, removeProcessingInstructions: JsArray<JsAny>? = null, attributes: JsArray<JsAny>? = null, removeAttributes: JsArray<JsAny>? = null, comments: Boolean? = null, dataAttributes: Boolean? = null, javascriptURLs: Boolean? = null): SanitizerConfig = newJsObject<SanitizerConfig>().apply {
    if (elements != null) this.elements = elements
    if (removeElements != null) this.removeElements = removeElements
    if (replaceWithChildrenElements != null) this.replaceWithChildrenElements = replaceWithChildrenElements
    if (processingInstructions != null) this.processingInstructions = processingInstructions
    if (removeProcessingInstructions != null) this.removeProcessingInstructions = removeProcessingInstructions
    if (attributes != null) this.attributes = attributes
    if (removeAttributes != null) this.removeAttributes = removeAttributes
    if (comments != null) this.comments = comments
    if (dataAttributes != null) this.dataAttributes = dataAttributes
    if (javascriptURLs != null) this.javascriptURLs = javascriptURLs
}

/**
 * The Navigator interface represents the state and the identity of the user agent. It allows scripts to query it and to
 * register themselves to carry on some activities.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator)
 */
public abstract external class Navigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils, NavigatorCookies, NavigatorPlugins, NavigatorConcurrentHardware {
    /**
     * The read-only userActivation property of the Navigator interface returns a UserActivation object which contains
     * information about the current window's user activation state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/userActivation)
     */
    open val userActivation: UserActivation

    /**
     * The maxTouchPoints read-only property of the Navigator interface returns the maximum number of simultaneous touch
     * contact points that are supported by the current device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/maxTouchPoints)
     */
    open val maxTouchPoints: Int

    /**
     * The mediaDevices read-only property of the Navigator interface returns a MediaDevices object, which provides
     * access to connected media input devices like cameras and microphones, as well as screen sharing.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaDevices)
     */
    open val mediaDevices: MediaDevices

    /**
     * The clipboard read-only property of the Navigator interface returns a Clipboard object used to read and write the
     * clipboard's contents.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clipboard)
     */
    open val clipboard: Clipboard

    /**
     * The vibrate() method of the Navigator interface pulses the vibration hardware on the device, if such hardware
     * exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in
     * progress when this method is called, the previous pattern is halted and the new one begins instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate)
     */
    open fun vibrate(pattern: Int): Boolean

    /**
     * The vibrate() method of the Navigator interface pulses the vibration hardware on the device, if such hardware
     * exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in
     * progress when this method is called, the previous pattern is halted and the new one begins instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate)
     */
    open fun vibrate(pattern: JsArray<JsNumber>): Boolean

    /**
     * The serviceWorker read-only property of the Navigator interface returns the ServiceWorkerContainer object for the
     * associated document, which provides access to registration, removal, upgrade, and communication with the
     * ServiceWorker.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/serviceWorker)
     */
    open val serviceWorker: ServiceWorkerContainer

    /**
     * The requestMediaKeySystemAccess() method of the Navigator interface returns a Promise which delivers a
     * MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used
     * to create keys for decrypting a media stream.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMediaKeySystemAccess)
     */
    open fun requestMediaKeySystemAccess(keySystem: String, supportedConfigurations: JsArray<MediaKeySystemConfiguration>): Promise<MediaKeySystemAccess>
}

public external interface NavigatorID : JsAny {
    /**
     * The appCodeName read-only property of the Navigator interface is always "Mozilla", in any browser. This property
     * is kept only for compatibility purposes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/appCodeName)
     */
    val appCodeName: String

    /**
     * The appName read-only property of the Navigator interface is always "Netscape", in any browser. This property is
     * kept only for compatibility purposes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/appName)
     */
    val appName: String

    /**
     * The Navigator.appVersion read-only property of the Navigator interface returns a string representing version
     * information about the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/appVersion)
     */
    val appVersion: String

    /**
     * The platform property read-only property of the Navigator interface returns a string identifying the platform on
     * which the user's browser is running.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/platform)
     */
    val platform: String

    /**
     * The product read-only property of the Navigator interface is always "Gecko", in any browser. This property is
     * kept only for compatibility purposes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/product)
     */
    val product: String

    /**
     * The Navigator.productSub read-only property that returns either the string "20030107", or the string "20100101".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/productSub)
     */
    val productSub: String

    /**
     * The Navigator.userAgent read-only property of the Navigator interface returns the User-Agent (UA) string for the
     * current browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/userAgent)
     */
    val userAgent: String

    /**
     * The vendor read-only property of the Navigator interface is always either "Google Inc.", "Apple Computer, Inc.",
     * or (in Firefox) the empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vendor)
     */
    val vendor: String

    /**
     * The vendorSub read-only property of the Navigator interface is always the empty string, in any browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vendorSub)
     */
    val vendorSub: String

    /**
     * The Navigator.taintEnabled() method always returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/taintEnabled)
     */
    fun taintEnabled(): Boolean

    /**
     * The oscpu read-only property of the Navigator interface returns a string that identifies the current operating
     * system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/oscpu)
     */
    val oscpu: String
}

public external interface NavigatorLanguage : JsAny {
    /**
     * The language read-only property of the Navigator interface returns a string representing the preferred language
     * of the user, usually the language of the browser UI.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/language)
     */
    val language: String

    /**
     * The languages read-only property of the Navigator interface returns an array of strings representing the user's
     * preferred languages. The language is described using a BCP 47 language tag. In the returned array they are
     * ordered by preference with the most preferred language first.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/languages)
     */
    val languages: JsArray<JsString>
}

public external interface NavigatorOnLine : JsAny {
    /**
     * The onLine read-only property of the Navigator interface returns whether the device is connected to the network,
     * with true meaning online and false meaning offline. The property's value changes after the browser checks its
     * network connection, usually when the user follows links or when a script requests a remote page. For example, the
     * property should return false when users click links soon after they lose internet connection. When its value
     * changes, an online or offline event is fired on the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/onLine)
     */
    val onLine: Boolean
}

public external interface NavigatorContentUtils : JsAny {
    /**
     * The Navigator method registerProtocolHandler() lets websites register their ability to open or handle particular
     * URL schemes (also known as protocols).
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/registerProtocolHandler)
     */
    fun registerProtocolHandler(scheme: String, url: String)

    /**
     * The Navigator method unregisterProtocolHandler() removes a protocol handler for a given URL scheme.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/unregisterProtocolHandler)
     */
    fun unregisterProtocolHandler(scheme: String, url: String)
}

public external interface NavigatorCookies : JsAny {
    /**
     * navigator.cookieEnabled returns a Boolean value that indicates whether cookies are enabled or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/cookieEnabled)
     */
    val cookieEnabled: Boolean
}

public external interface NavigatorPlugins : JsAny {
    /**
     * The plugins read-only property of the Navigator interface returns a PluginArray object, listing the Plugin
     * objects describing the plugins installed in the application. Named properties of the returned object are not
     * enumerable (except in very old browser versions).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/plugins)
     */
    val plugins: PluginArray

    /**
     * The mimeTypes read-only property of the Navigator interface returns a MimeTypeArray object, which contains a list
     * of MimeType objects representing the MIME types recognized and supported by the browser. The array can be queried
     * for information about the enabled plugin that is used to handle a file of the specified type. Named properties of
     * the returned object are not enumerable (except in very old browser versions).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mimeTypes)
     */
    val mimeTypes: MimeTypeArray

    /**
     * This method always returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/javaEnabled)
     */
    fun javaEnabled(): Boolean

    /**
     * The pdfViewerEnabled read-only property of the Navigator interface indicates whether the browser supports inline
     * display of PDF files when navigating to them.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/pdfViewerEnabled)
     */
    val pdfViewerEnabled: Boolean
}

/**
 * The PluginArray interface is used to store a list of Plugin objects; it's returned by the navigator.plugins property.
 * The PluginArray is not a JavaScript array, but has the length property and supports accessing individual items using
 * bracket notation (plugins\[2\]), as well as via item(index) and namedItem("name") methods.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PluginArray)
 */
public abstract external class PluginArray : ItemArrayLike<Plugin> {
    open fun refresh()
    override val length: Int
    override fun item(index: Int): Plugin?
    open fun namedItem(name: String): Plugin?
}

public operator fun PluginArray.get(index: Int): Plugin? = getProperty(this, index)

public operator fun PluginArray.get(name: String): Plugin? = getProperty(this, name)

/**
 * The MimeTypeArray interface returns an array of MimeType instances, each of which contains information about a
 * supported browser plugins. This object is returned by the deprecated Navigator.mimeTypes property.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MimeTypeArray)
 */
public abstract external class MimeTypeArray : ItemArrayLike<MimeType> {
    override val length: Int
    override fun item(index: Int): MimeType?
    open fun namedItem(name: String): MimeType?
}

public operator fun MimeTypeArray.get(index: Int): MimeType? = getProperty(this, index)

public operator fun MimeTypeArray.get(name: String): MimeType? = getProperty(this, name)

/**
 * The Plugin interface provides information about a browser plugin.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Plugin)
 */
public abstract external class Plugin : ItemArrayLike<MimeType> {
    open val name: String
    open val description: String
    open val filename: String
    override val length: Int
    override fun item(index: Int): MimeType?
    open fun namedItem(name: String): MimeType?
}

public operator fun Plugin.get(index: Int): MimeType? = getProperty(this, index)

public operator fun Plugin.get(name: String): MimeType? = getProperty(this, name)

/**
 * The MimeType interface provides contains information about a MIME type associated with a particular plugin.
 * Navigator.mimeTypes returns an array of this object.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MimeType)
 */
public abstract external class MimeType : JsAny {
    open val type: String
    open val description: String
    open val suffixes: String
    open val enabledPlugin: Plugin
}

public external interface ImageDataPixelFormat : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ImageDataPixelFormat.Companion.RGBA_UNORM8: ImageDataPixelFormat get() = "rgba-unorm8".toJsString().unsafeCast<ImageDataPixelFormat>()
public inline val ImageDataPixelFormat.Companion.RGBA_FLOAT16: ImageDataPixelFormat get() = "rgba-float16".toJsString().unsafeCast<ImageDataPixelFormat>()

public external interface ImageDataSettings : JsAny {
    var colorSpace: PredefinedColorSpace?
    var pixelFormat: ImageDataPixelFormat?
}

public fun ImageDataSettings(colorSpace: PredefinedColorSpace? = null, pixelFormat: ImageDataPixelFormat? = null): ImageDataSettings = newJsObject<ImageDataSettings>().apply {
    if (colorSpace != null) this.colorSpace = colorSpace
    if (pixelFormat != null) this.pixelFormat = pixelFormat
}

/**
 * The ImageData interface represents the underlying pixel data of an area of a &lt;canvas&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData)
 */
public open external class ImageData : TexImageSource {
    /**
     * The ImageData() constructor returns a newly instantiated ImageData object built from the typed array given and
     * having the specified width and height.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/ImageData)
     */
    constructor(sw: Int, sh: Int, settings: ImageDataSettings = definedExternally)

    /**
     * The ImageData() constructor returns a newly instantiated ImageData object built from the typed array given and
     * having the specified width and height.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/ImageData)
     */
    constructor(data: Uint8ClampedArray, sw: Int, sh: Int = definedExternally, settings: ImageDataSettings = definedExternally)

    /**
     * The readonly ImageData.width property returns the number of pixels per row in the ImageData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/width)
     */
    open val width: Int

    /**
     * The readonly ImageData.height property returns the number of rows in the ImageData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/height)
     */
    open val height: Int

    /**
     * The readonly ImageData.data property returns a Uint8ClampedArray or Float16Array that contains the ImageData
     * object's pixel data. Data is stored as a one-dimensional array in the RGBA order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/data)
     */
    open val data: Uint8ClampedArray

    /**
     * The read-only ImageData.pixelFormat property is a string indicating the pixel format of the image data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/pixelFormat)
     */
    open val pixelFormat: ImageDataPixelFormat

    /**
     * The read-only ImageData.colorSpace property is a string indicating the color space of the image data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageData/colorSpace)
     */
    open val colorSpace: PredefinedColorSpace
}

/**
 * The ImageBitmap interface represents a bitmap image which can be drawn to a &lt;canvas&gt; without undue latency. It
 * can be created from a variety of source objects using the Window.createImageBitmap() or
 * WorkerGlobalScope.createImageBitmap() factory method. ImageBitmap provides an asynchronous and resource efficient
 * pathway to prepare textures for rendering in WebGL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap)
 */
public abstract external class ImageBitmap : CanvasImageSource, TexImageSource {
    /**
     * The ImageBitmap.width read-only property returns the ImageBitmap object's width in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/width)
     */
    open val width: Int

    /**
     * The ImageBitmap.height read-only property returns the ImageBitmap object's height in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/height)
     */
    open val height: Int

    /**
     * The ImageBitmap.close() method disposes of all graphical resources associated with an ImageBitmap.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageBitmap/close)
     */
    open fun close()
}

public external interface ImageOrientation : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ImageOrientation.Companion.FROM_IMAGE: ImageOrientation get() = "from-image".toJsString().unsafeCast<ImageOrientation>()
public inline val ImageOrientation.Companion.FLIP_Y: ImageOrientation get() = "flipY".toJsString().unsafeCast<ImageOrientation>()

public external interface PremultiplyAlpha : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val PremultiplyAlpha.Companion.NONE: PremultiplyAlpha get() = "none".toJsString().unsafeCast<PremultiplyAlpha>()
public inline val PremultiplyAlpha.Companion.PREMULTIPLY: PremultiplyAlpha get() = "premultiply".toJsString().unsafeCast<PremultiplyAlpha>()
public inline val PremultiplyAlpha.Companion.DEFAULT: PremultiplyAlpha get() = "default".toJsString().unsafeCast<PremultiplyAlpha>()

public external interface ColorSpaceConversion : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ColorSpaceConversion.Companion.NONE: ColorSpaceConversion get() = "none".toJsString().unsafeCast<ColorSpaceConversion>()
public inline val ColorSpaceConversion.Companion.DEFAULT: ColorSpaceConversion get() = "default".toJsString().unsafeCast<ColorSpaceConversion>()

public external interface ResizeQuality : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ResizeQuality.Companion.PIXELATED: ResizeQuality get() = "pixelated".toJsString().unsafeCast<ResizeQuality>()
public inline val ResizeQuality.Companion.LOW: ResizeQuality get() = "low".toJsString().unsafeCast<ResizeQuality>()
public inline val ResizeQuality.Companion.MEDIUM: ResizeQuality get() = "medium".toJsString().unsafeCast<ResizeQuality>()
public inline val ResizeQuality.Companion.HIGH: ResizeQuality get() = "high".toJsString().unsafeCast<ResizeQuality>()

public external interface ImageBitmapOptions : JsAny {
    var imageOrientation: ImageOrientation?
    var premultiplyAlpha: PremultiplyAlpha?
    var colorSpaceConversion: ColorSpaceConversion?
    var resizeWidth: Int?
    var resizeHeight: Int?
    var resizeQuality: ResizeQuality?
}

public fun ImageBitmapOptions(imageOrientation: ImageOrientation? = null, premultiplyAlpha: PremultiplyAlpha? = null, colorSpaceConversion: ColorSpaceConversion? = null, resizeWidth: Int? = null, resizeHeight: Int? = null, resizeQuality: ResizeQuality? = null): ImageBitmapOptions = newJsObject<ImageBitmapOptions>().apply {
    if (imageOrientation != null) this.imageOrientation = imageOrientation
    if (premultiplyAlpha != null) this.premultiplyAlpha = premultiplyAlpha
    if (colorSpaceConversion != null) this.colorSpaceConversion = colorSpaceConversion
    if (resizeWidth != null) this.resizeWidth = resizeWidth
    if (resizeHeight != null) this.resizeHeight = resizeHeight
    if (resizeQuality != null) this.resizeQuality = resizeQuality
}

public external interface AnimationFrameProvider : JsAny {
    /**
     * The window.requestAnimationFrame() method tells the browser you wish to perform an animation. It requests the
     * browser to call a user-supplied callback function before the next repaint.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/requestAnimationFrame)
     */
    fun requestAnimationFrame(callback: (Double) -> Unit): Int

    /**
     * The window.cancelAnimationFrame() method cancels an animation frame request previously scheduled through a call
     * to window.requestAnimationFrame().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/cancelAnimationFrame)
     */
    fun cancelAnimationFrame(handle: Int)
}

/**
 * The MessageEvent interface represents a message received by a target object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent)
 */
public open external class MessageEvent : Event {
    /**
     * The MessageEvent() constructor creates a new MessageEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/MessageEvent)
     */
    constructor(type: String, eventInitDict: MessageEventInit = definedExternally)

    /**
     * The data read-only property of the MessageEvent interface represents the data sent by the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/data)
     */
    open val data: JsAny?

    /**
     * The origin read-only property of the MessageEvent interface is a string representing the origin of the message
     * emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/origin)
     */
    open val origin: String

    /**
     * The lastEventId read-only property of the MessageEvent interface is a string representing a unique ID for the
     * event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/lastEventId)
     */
    open val lastEventId: String

    /**
     * The source read-only property of the MessageEvent interface is a MessageEventSource (which can be a WindowProxy,
     * MessagePort, or ServiceWorker object) representing the message emitter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/source)
     */
    open val source: MessageEventSource?

    /**
     * The ports read-only property of the MessageEvent interface is an array of MessagePort objects containing all
     * MessagePort objects sent with the message, in order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageEvent/ports)
     */
    open val ports: JsArray<MessagePort>
    open fun initMessageEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, data: JsAny? = definedExternally, origin: String = definedExternally, lastEventId: String = definedExternally, source: MessageEventSource? = definedExternally, ports: JsArray<MessagePort> = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface MessageEventInit : EventInit {
    var data: JsAny?
    var origin: String?
    var lastEventId: String?
    var source: MessageEventSource?
    var ports: JsArray<MessagePort>?
}

public fun MessageEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, data: JsAny? = null, origin: String? = null, lastEventId: String? = null, source: MessageEventSource? = null, ports: JsArray<MessagePort>? = null): MessageEventInit = newJsObject<MessageEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (data != null) this.data = data
    if (origin != null) this.origin = origin
    if (lastEventId != null) this.lastEventId = lastEventId
    if (source != null) this.source = source
    if (ports != null) this.ports = ports
}

/**
 * The EventSource interface is web content's interface to server-sent events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource)
 */
public open external class EventSource : EventTarget {
    /**
     * The EventSource() constructor returns a newly-created EventSource, which represents a remote resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/EventSource)
     */
    constructor(url: String, eventSourceInitDict: EventSourceInit = definedExternally)

    /**
     * The url read-only property of the EventSource interface returns a string representing the URL of the source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/url)
     */
    open val url: String

    /**
     * The withCredentials read-only property of the EventSource interface returns a boolean value indicating whether
     * the EventSource object was instantiated with CORS credentials set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/withCredentials)
     */
    open val withCredentials: Boolean

    /**
     * The readyState read-only property of the EventSource interface returns a number representing the state of the
     * connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
     */
    open val readyState: Short

    /**
     * The open event of the EventSource interface is fired when a connection with an event source is opened.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/open_event)
     */
    open var onopen: ((Event) -> Unit)?

    /**
     * The message event of the EventSource interface is fired when data is received through an event source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/message_event)
     */
    open var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The error event of the EventSource API is fired when a connection with an event source fails to be opened.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/error_event)
     */
    open var onerror: ((Event) -> Unit)?

    /**
     * The close() method of the EventSource interface closes the connection, if one is made, and sets the
     * EventSource.readyState attribute to 2 (closed).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/close)
     */
    open fun close()

    companion object {
        val CONNECTING: Short
        val OPEN: Short
        val CLOSED: Short
    }
}

public external interface EventSourceInit : JsAny {
    var withCredentials: Boolean?
}

public fun EventSourceInit(withCredentials: Boolean? = null): EventSourceInit = newJsObject<EventSourceInit>().apply {
    if (withCredentials != null) this.withCredentials = withCredentials
}

/**
 * The MessageChannel interface of the Channel Messaging API allows us to create a new message channel and send data
 * through it via its two MessagePort properties.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel)
 */
public open external class MessageChannel : JsAny {
    /**
     * The MessageChannel() constructor of the MessageChannel interface returns a new MessageChannel object with two new
     * MessagePort objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/MessageChannel)
     */
    constructor()

    /**
     * The port1 read-only property of the MessageChannel interface returns the first port of the message channel — the
     * port attached to the context that originated the channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/port1)
     */
    open val port1: MessagePort

    /**
     * The port2 read-only property of the MessageChannel interface returns the second port of the message channel — the
     * port attached to the context at the other end of the channel, which the message is initially sent to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessageChannel/port2)
     */
    open val port2: MessagePort
}

public external interface MessageEventTarget : JsAny {
    /**
     * The message event is fired on a MessagePort object when a message arrives on that channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/message_event)
     */
    var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The messageerror event is fired on a MessagePort object when it receives a message that can't be deserialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/messageerror_event)
     */
    var onmessageerror: ((MessageEvent) -> Unit)?
}

/**
 * The MessagePort interface of the Channel Messaging API represents one of the two ports of a MessageChannel, allowing
 * messages to be sent from one port and listening out for them arriving at the other.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort)
 */
public abstract external class MessagePort : EventTarget, MessageEventTarget, MessageEventSource, UnionClientOrMessagePortOrServiceWorker {
    /**
     * The postMessage() method of the MessagePort interface sends a message from the port, and optionally, transfers
     * ownership of objects to other browsing contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
     */
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)

    /**
     * The postMessage() method of the MessagePort interface sends a message from the port, and optionally, transfers
     * ownership of objects to other browsing contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
     */
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)

    /**
     * The start() method of the MessagePort interface starts the sending of messages queued on the port. This method is
     * only needed when using EventTarget.addEventListener; it is implied when using onmessage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/start)
     */
    open fun start()

    /**
     * The close() method of the MessagePort interface disconnects the port, so it is no longer active. This stops the
     * flow of messages to that port.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close)
     */
    open fun close()
}

public external interface StructuredSerializeOptions : JsAny {
    var transfer: JsArray<JsAny>?
}

public fun StructuredSerializeOptions(transfer: JsArray<JsAny>? = null): StructuredSerializeOptions = newJsObject<StructuredSerializeOptions>().apply {
    if (transfer != null) this.transfer = transfer
}

/**
 * The BroadcastChannel interface represents a named channel that any browsing context of a given origin can subscribe
 * to. It allows communication between different documents (in different windows, tabs, frames or iframes) of the same
 * origin. Messages are broadcasted via a message event fired at all BroadcastChannel objects listening to the channel,
 * except the object that sent the message.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel)
 */
public open external class BroadcastChannel : EventTarget {
    /**
     * The BroadcastChannel() constructor creates a new BroadcastChannel and connects it to the underlying channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/BroadcastChannel)
     */
    constructor(name: String)

    /**
     * The name read-only property of the BroadcastChannel interface returns a string, which uniquely identifies the
     * given channel with its name. This name is passed to the BroadcastChannel() constructor at creation time and is
     * therefore read-only.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/name)
     */
    open val name: String

    /**
     * The postMessage() method of the BroadcastChannel interface sends a message, which can be of any kind of Object,
     * to each listener in any browsing context with the same origin. The message is transmitted as a message event
     * targeted at each BroadcastChannel bound to the channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/postMessage)
     */
    open fun postMessage(message: JsAny?)

    /**
     * The close() method of the BroadcastChannel interface terminates the connection to the underlying channel,
     * allowing the object to be garbage collected. This is a necessary step to perform as there is no other way for a
     * browser to know that this channel is not needed anymore.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/close)
     */
    open fun close()

    /**
     * The message event of the BroadcastChannel interface fires when a message arrives on that channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/message_event)
     */
    open var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The messageerror event of the BroadcastChannel interface fires when a message that can't be deserialized arrives
     * on the channel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BroadcastChannel/messageerror_event)
     */
    open var onmessageerror: ((MessageEvent) -> Unit)?
}

/**
 * The WorkerGlobalScope interface of the Web Workers API is an interface representing the scope of any worker. Workers
 * have no browsing context; this scope contains the information usually conveyed by Window objects — in this case event
 * handlers, the console or the associated WorkerNavigator object. Each WorkerGlobalScope has its own event loop.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope)
 */
public abstract external class WorkerGlobalScope : EventTarget, WindowOrWorkerGlobalScope {
    /**
     * The self read-only property of the WorkerGlobalScope interface returns a reference to the WorkerGlobalScope
     * itself. Most of the time it is a specific scope like DedicatedWorkerGlobalScope, SharedWorkerGlobalScope, or
     * ServiceWorkerGlobalScope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/self)
     */
    open val self: WorkerGlobalScope

    /**
     * The read-only location property of the WorkerGlobalScope interface returns the WorkerLocation associated with the
     * worker. It is a specific location object, mostly a subset of the Location for browsing scopes, but adapted to
     * workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/location)
     */
    open val location: WorkerLocation

    /**
     * The navigator read-only property of the WorkerGlobalScope interface returns the WorkerNavigator associated with
     * the worker. It is a specific navigator object, mostly a subset of the Navigator for browsing scopes, but adapted
     * to workers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/navigator)
     */
    open val navigator: WorkerNavigator

    /**
     * The importScripts() method of the WorkerGlobalScope interface synchronously imports one or more scripts into the
     * scope of a classic worker (a worker constructed from a classic script).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/importScripts)
     */
    open fun importScripts(vararg urls: String)

    /**
     * The error event of the WorkerGlobalScope interface fires when an error occurs in the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/error_event)
     */
    open var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?

    /**
     * The languagechange event is fired at the global scope object when the user's preferred language changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/languagechange_event)
     */
    open var onlanguagechange: ((Event) -> Unit)?

    /**
     * The offline event of the WorkerGlobalScope fires when the device loses connection to the internet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/offline_event)
     */
    open var onoffline: ((Event) -> Unit)?

    /**
     * The online event of the WorkerGlobalScope fires when the device reconnects to the internet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/online_event)
     */
    open var ononline: ((Event) -> Unit)?

    /**
     * The rejectionhandled event is sent to the script's global scope (typically WorkerGlobalScope) whenever a rejected
     * Promise is handled late, i.e., when a handler is attached to the promise after its rejection had caused an
     * unhandledrejection event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/rejectionhandled_event)
     */
    open var onrejectionhandled: ((PromiseRejectionEvent) -> Unit)?

    /**
     * The unhandledrejection event is sent to the global scope (typically WorkerGlobalScope) of a script when a Promise
     * that has no rejection handler is rejected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerGlobalScope/unhandledrejection_event)
     */
    open var onunhandledrejection: ((PromiseRejectionEvent) -> Unit)?
}

/**
 * The DedicatedWorkerGlobalScope object (the Worker global scope) is accessible through the self keyword. Some
 * additional global functions, namespaces objects, and constructors, not typically associated with the worker global
 * scope, but available on it, are listed in the JavaScript Reference. See also: Functions available to workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope)
 */
public abstract external class DedicatedWorkerGlobalScope : WorkerGlobalScope, AnimationFrameProvider, MessageEventTarget {
    /**
     * The name read-only property of the DedicatedWorkerGlobalScope interface returns the name that the Worker was
     * (optionally) given when it was created. This is the name that the Worker() constructor can pass to get a
     * reference to the DedicatedWorkerGlobalScope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/name)
     */
    open val name: String

    /**
     * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that
     * spawned it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/postMessage)
     */
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)

    /**
     * The postMessage() method of the DedicatedWorkerGlobalScope interface sends a message to the main thread that
     * spawned it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/postMessage)
     */
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)

    /**
     * The close() method of the DedicatedWorkerGlobalScope interface discards any tasks queued in the
     * DedicatedWorkerGlobalScope's event loop, effectively closing this particular scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DedicatedWorkerGlobalScope/close)
     */
    open fun close()
}

/**
 * The SharedWorkerGlobalScope object (the SharedWorker global scope) is accessible through the self keyword. Some
 * additional global functions, namespaces objects, and constructors, not typically associated with the worker global
 * scope, but available on it, are listed in the JavaScript Reference. See the complete list of functions available to
 * workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope)
 */
public abstract external class SharedWorkerGlobalScope : WorkerGlobalScope {
    /**
     * The name read-only property of the SharedWorkerGlobalScope interface returns the name that the SharedWorker was
     * (optionally) given when it was created. This is the name that the SharedWorker() constructor can pass to get a
     * reference to the SharedWorkerGlobalScope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/name)
     */
    open val name: String

    /**
     * The close() method of the SharedWorkerGlobalScope interface discards any tasks queued in the
     * SharedWorkerGlobalScope's event loop, effectively closing this particular scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/close)
     */
    open fun close()

    /**
     * The connect event is fired in shared workers at their SharedWorkerGlobalScope when a new client connects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorkerGlobalScope/connect_event)
     */
    open var onconnect: ((MessageEvent) -> Unit)?
}

public external interface AbstractWorker : JsAny {
    /**
     * The error event of the Worker interface fires when an error occurs in the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/error_event)
     */
    var onerror: ((Event) -> Unit)?
}

/**
 * The Worker interface of the Web Workers API represents a background task that can be created via script, which can
 * send messages back to its creator.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker)
 */
public open external class Worker : EventTarget, AbstractWorker, MessageEventTarget {
    /**
     * The Worker() constructor creates a Worker object that executes the classic script or module at the specified URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/Worker)
     */
    constructor(scriptURL: String, options: WorkerOptions = definedExternally)

    /**
     * The terminate() method of the Worker interface immediately terminates the Worker. This does not offer the worker
     * an opportunity to finish its operations; it is stopped at once.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/terminate)
     */
    open fun terminate()

    /**
     * The postMessage() method of the Worker interface sends a message to the worker. The first parameter is the data
     * to send to the worker. The data may be any JavaScript object that can be handled by the structured clone
     * algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
     */
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)

    /**
     * The postMessage() method of the Worker interface sends a message to the worker. The first parameter is the data
     * to send to the worker. The data may be any JavaScript object that can be handled by the structured clone
     * algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
     */
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)

    /**
     * The error event of the Worker interface fires when an error occurs in the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/error_event)
     */
    override var onerror: ((Event) -> Unit)?

    /**
     * The message event is fired on a Worker object when the worker's parent receives a message from its worker (i.e.,
     * when the worker sends a message using DedicatedWorkerGlobalScope.postMessage()).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/message_event)
     */
    override var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The messageerror event is fired on a Worker object when it receives a message that can't be deserialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/messageerror_event)
     */
    override var onmessageerror: ((MessageEvent) -> Unit)?
}

public external interface WorkerOptions : JsAny {
    var name: String?
    var type: WorkerType?
    var credentials: RequestCredentials?
}

public fun WorkerOptions(name: String? = null, type: WorkerType? = null, credentials: RequestCredentials? = null): WorkerOptions = newJsObject<WorkerOptions>().apply {
    if (name != null) this.name = name
    if (type != null) this.type = type
    if (credentials != null) this.credentials = credentials
}

public external interface WorkerType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val WorkerType.Companion.CLASSIC: WorkerType get() = "classic".toJsString().unsafeCast<WorkerType>()
public inline val WorkerType.Companion.MODULE: WorkerType get() = "module".toJsString().unsafeCast<WorkerType>()

/**
 * The SharedWorker interface represents a specific kind of worker that can be accessed from several browsing contexts,
 * such as multiple windows or iframes. Shared workers implement a different interface than dedicated workers, have a
 * different global scope (SharedWorkerGlobalScope), and their constructor is not exposed in DedicatedWorkerGlobalScope,
 * so they cannot be instantiated from dedicated workers.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker)
 */
public open external class SharedWorker : EventTarget, AbstractWorker {
    /**
     * The SharedWorker() constructor creates a SharedWorker object that executes the script at the specified URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker)
     */
    constructor(scriptURL: String, options: String)

    /**
     * The SharedWorker() constructor creates a SharedWorker object that executes the script at the specified URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker)
     */
    constructor(scriptURL: String, options: SharedWorkerOptions)

    /**
     * The SharedWorker() constructor creates a SharedWorker object that executes the script at the specified URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/SharedWorker)
     */
    constructor(scriptURL: String)

    /**
     * The port property of the SharedWorker interface returns a MessagePort object used to communicate and control the
     * shared worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/port)
     */
    open val port: MessagePort

    /**
     * The error event of the SharedWorker interface fires when an error occurs in the worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SharedWorker/error_event)
     */
    override var onerror: ((Event) -> Unit)?
}

public external interface SharedWorkerOptions : WorkerOptions {
    var extendedLifetime: Boolean?
}

public fun SharedWorkerOptions(name: String? = null, type: WorkerType? = null, credentials: RequestCredentials? = null, extendedLifetime: Boolean? = null): SharedWorkerOptions = newJsObject<SharedWorkerOptions>().apply {
    if (name != null) this.name = name
    if (type != null) this.type = type
    if (credentials != null) this.credentials = credentials
    if (extendedLifetime != null) this.extendedLifetime = extendedLifetime
}

public external interface NavigatorConcurrentHardware : JsAny {
    /**
     * The navigator.hardwareConcurrency read-only property returns the number of logical processors available to run
     * threads on the user's computer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/hardwareConcurrency)
     */
    val hardwareConcurrency: Double
}

/**
 * The WorkerNavigator interface represents a subset of the Navigator interface allowed to be accessed from a Worker.
 * Such an object is initialized for each worker and is available via the self.navigator property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator)
 */
public abstract external class WorkerNavigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorConcurrentHardware {
    /**
     * The serviceWorker read-only property of the WorkerNavigator interface returns the ServiceWorkerContainer object
     * for the associated document, which provides access to registration, removal, upgrade, and communication with the
     * ServiceWorker.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerNavigator/serviceWorker)
     */
    open val serviceWorker: ServiceWorkerContainer
}

/**
 * The WorkerLocation interface defines the absolute location of the script executed by the Worker. Such an object is
 * initialized for each worker and is available via the WorkerGlobalScope.location property obtained by calling
 * self.location.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation)
 */
public abstract external class WorkerLocation : JsAny {
    /**
     * The href property of a WorkerLocation object returns a string containing the serialized URL for the worker's
     * location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/href)
     */
    open val href: String

    /**
     * The origin property of a WorkerLocation object returns the worker's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/origin)
     */
    open val origin: String

    /**
     * The protocol property of a WorkerLocation object returns the protocol part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/protocol)
     */
    open val protocol: String

    /**
     * The host property of a WorkerLocation object returns the host part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/host)
     */
    open val host: String

    /**
     * The hostname property of a WorkerLocation object returns the hostname part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/hostname)
     */
    open val hostname: String

    /**
     * The port property of a WorkerLocation object returns the port part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/port)
     */
    open val port: String

    /**
     * The pathname property of a WorkerLocation object returns the pathname part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/pathname)
     */
    open val pathname: String

    /**
     * The search property of a WorkerLocation object returns the search part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/search)
     */
    open val search: String

    /**
     * The hash property of a WorkerLocation object returns the hash part of the worker's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkerLocation/hash)
     */
    open val hash: String
}

/**
 * The WorkletGlobalScope interface is an abstract class that specific worklet scope classes inherit from. Each
 * WorkletGlobalScope defines a new global environment.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WorkletGlobalScope)
 */
public abstract external class WorkletGlobalScope : JsAny

/**
 * The Worklet interface is a lightweight version of Web Workers and gives developers access to low-level parts of the
 * rendering pipeline.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet)
 */
public abstract external class Worklet : JsAny {
    /**
     * The addModule() method of the Worklet interface loads the module in the given JavaScript file and adds it to the
     * current Worklet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worklet/addModule)
     */
    open fun addModule(moduleURL: String, options: WorkletOptions = definedExternally): Promise<JsAny?>
}

public external interface WorkletOptions : JsAny {
    var credentials: RequestCredentials?
}

public fun WorkletOptions(credentials: RequestCredentials? = null): WorkletOptions = newJsObject<WorkletOptions>().apply {
    if (credentials != null) this.credentials = credentials
}

/**
 * The Storage interface of the Web Storage API provides access to a particular domain's session or local storage. It
 * allows, for example, the addition, modification, or deletion of stored data items.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage)
 */
public abstract external class Storage : JsAny {
    /**
     * The length read-only property of the Storage interface returns the number of data items stored in a given Storage
     * object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage/length)
     */
    open val length: Int

    /**
     * The key() method of the Storage interface, when passed a number n, returns the name of the nth key in a given
     * Storage object. The order of keys is user-agent defined, so you should not rely on it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage/key)
     */
    open fun key(index: Int): String?

    /**
     * The getItem() method of the Storage interface, when passed a key name, will return that key's value, or null if
     * the key does not exist, in the given Storage object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage/getItem)
     */
    open fun getItem(key: String): String?

    /**
     * The setItem() method of the Storage interface, when passed a key name and value, will add that key to the given
     * Storage object, or update that key's value if it already exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage/setItem)
     */
    open fun setItem(key: String, value: String)

    /**
     * The removeItem() method of the Storage interface, when passed a key name, will remove that key from the given
     * Storage object if it exists. The Storage interface of the Web Storage API provides access to a particular
     * domain's session or local storage.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage/removeItem)
     */
    open fun removeItem(key: String)

    /**
     * The clear() method of the Storage interface clears all keys stored in a given Storage object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Storage/clear)
     */
    open fun clear()
}

public operator fun Storage.get(key: String): String? = getStringProperty(this, key)

public operator fun Storage.set(key: String, value: String) { setStringProperty(this, key, value) }

public external interface WindowSessionStorage : JsAny {
    /**
     * The read-only sessionStorage property accesses a session Storage object for the current origin. sessionStorage is
     * similar to localStorage; the difference is that while localStorage is partitioned by origin only, sessionStorage
     * is partitioned by both origin and browser tabs (top-level browsing contexts). The data in sessionStorage is only
     * kept for the duration of the page session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/sessionStorage)
     */
    val sessionStorage: Storage
}

public external interface WindowLocalStorage : JsAny {
    /**
     * The localStorage read-only property of the window interface allows you to access a Storage object for the
     * Document's origin; the stored data is saved across browser sessions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/localStorage)
     */
    val localStorage: Storage
}

/**
 * The StorageEvent interface is implemented by the storage event, which is sent to a window when a storage area the
 * window has access to is changed within the context of another document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent)
 */
public open external class StorageEvent : Event {
    /**
     * The StorageEvent() constructor creates a new StorageEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/StorageEvent)
     */
    constructor(type: String, eventInitDict: StorageEventInit = definedExternally)

    /**
     * The key property of the StorageEvent interface returns the key for the storage item that was changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/key)
     */
    open val key: String?

    /**
     * The oldValue property of the StorageEvent interface returns the original value of the storage item whose value
     * changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/oldValue)
     */
    open val oldValue: String?

    /**
     * The newValue property of the StorageEvent interface returns the new value of the storage item whose value was
     * changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/newValue)
     */
    open val newValue: String?

    /**
     * The url property of the StorageEvent interface returns the URL of the document whose storage changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/url)
     */
    open val url: String

    /**
     * The storageArea property of the StorageEvent interface returns the storage object that was affected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/storageArea)
     */
    open val storageArea: Storage?

    /**
     * The StorageEvent.initStorageEvent() method is used to initialize the value of a StorageEvent.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StorageEvent/initStorageEvent)
     */
    open fun initStorageEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, key: String? = definedExternally, oldValue: String? = definedExternally, newValue: String? = definedExternally, url: String = definedExternally, storageArea: Storage? = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface StorageEventInit : EventInit {
    var key: String?
    var oldValue: String?
    var newValue: String?
    var url: String?
    var storageArea: Storage?
}

public fun StorageEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, key: String? = null, oldValue: String? = null, newValue: String? = null, url: String? = null, storageArea: Storage? = null): StorageEventInit = newJsObject<StorageEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (key != null) this.key = key
    if (oldValue != null) this.oldValue = oldValue
    if (newValue != null) this.newValue = newValue
    if (url != null) this.url = url
    if (storageArea != null) this.storageArea = storageArea
}

/**
 * The HTMLMarqueeElement interface provides methods to manipulate &lt;marquee&gt; elements.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMarqueeElement)
 */
public abstract external class HTMLMarqueeElement : HTMLElement {
    open var behavior: String
    open var bgColor: String
    open var direction: String
    open var height: String
    open var hspace: Int
    open var loop: Int
    open var scrollAmount: Int
    open var scrollDelay: Int
    open var trueSpeed: Boolean
    open var vspace: Int
    open var width: String
    open fun start()
    open fun stop()

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLFrameSetElement interface provides special properties (beyond those of the regular HTMLElement interface they
 * also inherit) for manipulating &lt;frameset&gt; elements.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFrameSetElement)
 */
public abstract external class HTMLFrameSetElement : HTMLElement, WindowEventHandlers {
    open var cols: String
    open var rows: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public abstract external class HTMLFrameElement : HTMLElement {
    open var name: String
    open var scrolling: String
    open var src: String
    open var frameBorder: String
    open var longDesc: String
    open var noResize: Boolean
    open val contentDocument: Document?
    open val contentWindow: Window?
    open var marginHeight: String
    open var marginWidth: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public abstract external class HTMLDirectoryElement : HTMLElement {
    open var compact: Boolean

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Implements the document object model (DOM) representation of the font element. The HTML Font Element &lt;font&gt;
 * defines the font size, font face and color of text.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement)
 */
public abstract external class HTMLFontElement : HTMLElement {
    /**
     * The obsolete HTMLFontElement.color property is a string that reflects the color HTML attribute, containing either
     * a named color or a color specified in the hexadecimal #RRGGBB format.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/color)
     */
    open var color: String

    /**
     * The obsolete HTMLFontElement.face property is a string that reflects the face HTML attribute, containing a
     * comma-separated list of one or more font names.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/face)
     */
    open var face: String

    /**
     * The obsolete HTMLFontElement.size property is a string that reflects the size HTML attribute. It contains either
     * a font size ranging from 1 to 7 or a number relative to the default value 3, for example -2 or +1.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFontElement/size)
     */
    open var size: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * The HTMLParamElement interface provides special properties (beyond those of the regular HTMLElement object interface
 * it inherits) for manipulating &lt;param&gt; elements, representing a pair of a key and a value that acts as a
 * parameter for an &lt;object&gt; element.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLParamElement)
 */
public abstract external class HTMLParamElement : HTMLElement {
    open var name: String
    open var value: String
    open var type: String
    open var valueType: String

    companion object {
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short
        val TEXT_NODE: Short
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short
        val PROCESSING_INSTRUCTION_NODE: Short
        val COMMENT_NODE: Short
        val DOCUMENT_NODE: Short
        val DOCUMENT_TYPE_NODE: Short
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short
        val DOCUMENT_POSITION_DISCONNECTED: Short
        val DOCUMENT_POSITION_PRECEDING: Short
        val DOCUMENT_POSITION_FOLLOWING: Short
        val DOCUMENT_POSITION_CONTAINS: Short
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

public abstract external class External : JsAny {
    open fun AddSearchProvider()
    open fun IsSearchProviderInstalled()
}
