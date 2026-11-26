// file: org/w3c/dom/html.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'html', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.pointerevents.*
import org.w3c.fetch.*
import org.w3c.performance.*
import org.w3c.workers.*

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
 * The HTMLElement interface represents any HTML element. Some elements directly implement this interface, while others
 * implement it via an interface that inherits it.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class HTMLElement : Element, GlobalEventHandlers, ElementContentEditable, HTMLOrSVGOrMathMLElement, ElementCSSInlineStyle {
    /**
     * The HTMLElement.title property represents the title of the element: the text usually displayed in a 'tooltip'
     * popup when the mouse is over the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/title)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var title: String

    /**
     * The lang property of the HTMLElement interface indicates the base language of an element's attribute values and
     * text content, in the form of a BCP 47 language tag. It reflects the element's lang attribute; the xml:lang
     * attribute does not affect this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/lang)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var lang: String

    /**
     * The translate property of the HTMLElement interface indicates whether an element's attribute values and the
     * values of its Text node children are to be translated when the page is localized, or whether to leave them
     * unchanged.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/translate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var translate: Boolean

    /**
     * The HTMLElement.dir property indicates the text writing directionality of the content of the current element. It
     * reflects the element's dir attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dir)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var dir: String

    /**
     * The HTMLElement property hidden reflects the value of the element's hidden attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidden)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var hidden: JsAny?

    /**
     * The HTMLElement property inert reflects the value of the element's inert attribute. It is a boolean value that,
     * when present, makes the browser "ignore" user input events for the element, including focus events and events
     * from assistive technologies. The browser may also ignore page search and text selection in the element. This can
     * be useful when building UIs such as modals where you would want to "trap" the focus inside the modal when it's
     * visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inert)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var inert: Boolean

    /**
     * The HTMLElement.click() method simulates a mouse click on an element. When called on an element, the element's
     * click event is fired (unless its disabled attribute is set).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/click)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun click()

    /**
     * The HTMLElement.accessKey property sets the keystroke which a user can press to jump to a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var accessKey: String

    /**
     * The HTMLElement.accessKeyLabel read-only property returns a string containing the element's browser-assigned
     * access key (if any); otherwise it returns an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/accessKeyLabel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val accessKeyLabel: String

    /**
     * The draggable property of the HTMLElement interface gets and sets a Boolean primitive indicating if the element
     * is draggable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/draggable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var draggable: Boolean

    /**
     * The spellcheck property of the HTMLElement interface represents a boolean value that controls the spell-checking
     * hint. It is available on all HTML elements, though it doesn't affect all of them.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/spellcheck)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var spellcheck: Boolean

    /**
     * The writingSuggestions property of the HTMLElement interface is a string indicating if browser-provided writing
     * suggestions should be enabled under the scope of the element or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/writingSuggestions)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var writingSuggestions: String

    /**
     * The autocapitalize property of the HTMLElement interface represents the element's capitalization behavior for
     * user input.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocapitalize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var autocapitalize: String

    /**
     * The autocorrect property of the HTMLElement interface controls whether or not autocorrection of editable text is
     * enabled for spelling and/or punctuation errors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autocorrect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var autocorrect: Boolean

    /**
     * The innerText property of the HTMLElement interface represents the rendered text content of a node and its
     * descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/innerText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var innerText: String

    /**
     * The outerText property of the HTMLElement interface returns the same value as HTMLElement.innerText. When used as
     * a setter it replaces the whole current node with the given text (this differs from innerText, which replaces the
     * content inside the current node).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/outerText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var outerText: String

    /**
     * The HTMLElement.attachInternals() method returns an ElementInternals object. This method allows a custom element
     * to participate in HTML forms. The ElementInternals interface provides utilities for working with these elements
     * in the same way you would work with any standard HTML form element, and also exposes the Accessibility Object
     * Model to the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/attachInternals)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun attachInternals(): ElementInternals

    /**
     * The showPopover() method of the HTMLElement interface shows a popover element (i.e., one that has a valid popover
     * attribute) by adding it to the top layer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/showPopover)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun showPopover(options: ShowPopoverOptions = definedExternally)

    /**
     * The hidePopover() method of the HTMLElement interface hides a popover element (i.e., one that has a valid popover
     * attribute) by removing it from the top layer and styling it with display: none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/hidePopover)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hidePopover()

    /**
     * The togglePopover() method of the HTMLElement interface toggles a popover element (i.e., one that has a valid
     * popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun togglePopover(options: TogglePopoverOptions): Boolean

    /**
     * The togglePopover() method of the HTMLElement interface toggles a popover element (i.e., one that has a valid
     * popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun togglePopover(options: Boolean): Boolean

    /**
     * The togglePopover() method of the HTMLElement interface toggles a popover element (i.e., one that has a valid
     * popover attribute) between the hidden and showing states.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/togglePopover)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun togglePopover(): Boolean

    /**
     * The popover property of the HTMLElement interface gets and sets an element's popover state via JavaScript
     * ("auto", "hint", or "manual"), and can be used for feature detection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/popover)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var popover: String?
    public open var headingOffset: Int
    public open var headingReset: Boolean
    public open val scrollParent: Element?

    /**
     * The HTMLElement.offsetParent read-only property returns a reference to the element which is the closest (nearest
     * in the containment hierarchy) positioned ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetParent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetParent: Element?

    /**
     * The offsetTop read-only property of the HTMLElement interface returns the distance from the outer border of the
     * current element (including its margin) to the top padding edge of the offsetParent, the closest positioned
     * ancestor element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetTop)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetTop: Int

    /**
     * The offsetLeft read-only property of the HTMLElement interface returns the number of pixels that the upper left
     * corner of the current element is offset to the left within the HTMLElement.offsetParent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetLeft)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetLeft: Int

    /**
     * The offsetWidth read-only property of the HTMLElement interface returns the layout width of an element as an
     * integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetWidth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetWidth: Int

    /**
     * The offsetHeight read-only property of the HTMLElement interface returns the height of an element, including
     * vertical padding and borders, as an integer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/offsetHeight)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val offsetHeight: Int

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
 * The DOMStringMap interface is used for the HTMLElement.dataset attribute, to represent data for custom attributes
 * added to elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMStringMap)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class DOMStringMap : JsAny {
    // not printed yet: deleter <anonymous>(DOMString)
}

public operator fun DOMStringMap.get(name: String): String? = getStringProperty(this, name)

public operator fun DOMStringMap.set(name: String, value: String) { setStringProperty(this, name, value) }

/**
 * The HTMLAnchorElement interface represents hyperlink elements and provides special properties and methods (beyond
 * those of the regular HTMLElement object interface that they inherit from) for manipulating the layout and
 * presentation of such elements. This interface corresponds to &lt;a&gt; element; not to be confused with &lt;link&gt;,
 * which is represented by HTMLLinkElement.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class HTMLAnchorElement : HTMLElement, HyperlinkElementUtils, HTMLHyperlinkElementUtils {
    /**
     * The download property of the HTMLAnchorElement interface is a string indicating that the linked resource is
     * intended to be downloaded rather than displayed in the browser. The value, if any, represents the proposed name
     * of the file. It reflects the download attribute of the &lt;a&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/download)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var download: String

    /**
     * The ping property of the HTMLAnchorElement interface is a space-separated list of URLs. When the link is
     * followed, the browser will send POST requests with the body PING to the URLs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/ping)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var ping: String

    /**
     * The HTMLAnchorElement.rel property reflects the rel attribute. It is a string containing a space-separated list
     * of link types indicating the relationship between the resource represented by the &lt;a&gt; element and the
     * current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/rel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var rel: String

    /**
     * The read-only relList property of the HTMLAnchorElement returns a live DOMTokenList object containing the set of
     * link types indicating the relationship between the resource represented by the &lt;a&gt; element and the current
     * document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/relList)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val relList: DOMTokenList

    /**
     * The text property of the HTMLAnchorElement represents the text inside the element. This property represents the
     * same information as Node.textContent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/text)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var text: String

    /**
     * The HTMLAnchorElement.referrerPolicy property reflect the HTML referrerpolicy attribute of the &lt;a&gt; element
     * defining which referrer is sent when fetching the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAnchorElement/referrerPolicy)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var referrerPolicy: String
    public open var coords: String
    public open var charset: String
    public open var name: String
    public open var rev: String
    public open var shape: String

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
 * The HTMLImageElement interface represents an HTML &lt;img&gt; element, providing the properties and methods used to
 * manipulate image elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class HTMLImageElement : HTMLElement, CanvasImageSource, TexImageSource {
    /**
     * The alt property of the HTMLImageElement interface provides fallback (alternate) text to display when the image
     * specified by the &lt;img&gt; element is not displayed, whether because of an error, because the user has disabled
     * the loading of images, or because the image hasn't finished loading yet. It reflects the &lt;img&gt; element's
     * alt content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/alt)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var alt: String

    /**
     * The src property of the HTMLImageElement interface specifies the image to display in the &lt;img&gt; element. It
     * reflects the &lt;img&gt; element's src content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/src)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var src: String

    /**
     * The srcset property of the HTMLImageElement interface identifies one or more image candidate strings, separated
     * using commas (,), each specifying image resources to use under given circumstances. Each image candidate string
     * contains an image URL and an optional width or pixel density descriptor that indicates the conditions under which
     * that candidate should be used instead of the image specified by the src property. It reflects the &lt;img&gt;
     * element's srcset content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/srcset)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var srcset: String

    /**
     * The sizes property of the HTMLImageElement interface allows you to specify the layout width of the image for each
     * of a list of media queries, or auto for lazy-loaded images to allow the browser to automatically select an image
     * to display based on the layout size of the element. This allows the browser to choose between different images
     * specified in the element srcset to match different media conditions — even images with different orientations or
     * aspect ratios.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/sizes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var sizes: String

    /**
     * The crossOrigin property of the HTMLImageElement interface is a string which specifies the Cross-Origin Resource
     * Sharing (CORS) setting to use when retrieving the image. It reflects the &lt;img&gt; element's crossorigin
     * content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/crossOrigin)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var crossOrigin: String?

    /**
     * The useMap property of the HTMLImageElement interface provides the name of the client-side image map to apply to
     * the image. It reflects the &lt;img&gt; element's usemap content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/useMap)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var useMap: String

    /**
     * The isMap property of the HTMLImageElement interface indicates that the image is part of a server-side map. If
     * so, the coordinates where the user clicked on the image are sent to the server. It reflects the &lt;img&gt;
     * element's ismap content attribute. This attribute is allowed only if the &lt;img&gt; element is a descendant of
     * an &lt;a&gt; element with a valid href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/isMap)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var isMap: Boolean
    public open var controls: Boolean

    /**
     * The width property of the HTMLImageElement interface indicates the width at which the image is drawn, in CSS
     * pixels, if the image is being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's
     * the natural, pixel density-corrected width of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/width)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var width: Int

    /**
     * The height property of the HTMLImageElement interface indicates the height at which the image is drawn, in CSS
     * pixels, if the image is being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's
     * the natural, pixel density-corrected height of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/height)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var height: Int

    /**
     * The read-only naturalWidth property of the HTMLImageElement interface returns the intrinsic (natural),
     * density-corrected width of the image in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalWidth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val naturalWidth: Int

    /**
     * The read-only naturalHeight property of the HTMLImageElement interface returns the intrinsic (natural),
     * density-corrected height of the image in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalHeight)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val naturalHeight: Int

    /**
     * The complete read-only property of the HTMLImageElement interface is a Boolean value indicating whether or not
     * the image has completely loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/complete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val complete: Boolean

    /**
     * The currentSrc read-only property of the HTMLImageElement interface indicates the URL of the image selected by
     * the browser to load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/currentSrc)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentSrc: String

    /**
     * The referrerPolicy property of the HTMLImageElement interface defines which referrer is sent when fetching the
     * resource. It reflects the &lt;img&gt; element's referrerpolicy content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/referrerPolicy)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var referrerPolicy: String

    /**
     * The decoding property of the HTMLImageElement interface provides a hint to the browser as to how it should decode
     * the image. More specifically, whether it should wait for the image to be decoded before presenting other content
     * updates or not. It reflects the &lt;img&gt; element's decoding content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var decoding: String

    /**
     * The loading property of the HTMLImageElement interface provides a hint to the browser on how to handle the
     * loading of the image which is currently outside the window's visual viewport. This helps to optimize the loading
     * of the document's contents by postponing loading the image until it's expected to be needed, rather than
     * immediately during the initial page load. It reflects the &lt;img&gt; element's loading content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var loading: String

    /**
     * The fetchPriority property of the HTMLImageElement interface represents a hint to the browser indicating how it
     * should prioritize fetching a particular image relative to other images. It reflects the &lt;img&gt; element's
     * fetchpriority content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var fetchPriority: String

    /**
     * The decode() method of the HTMLImageElement interface returns a Promise that resolves once the image is decoded
     * and is safe to be appended to the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun decode(): Promise<JsAny?>

    /**
     * The deprecated name property of the HTMLImageElement interface specifies a name for the element. It reflects the
     * &lt;img&gt; element's name content attribute. It has been replaced by the id property available on all elements,
     * and is kept only for compatibility reasons.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var name: String
    public open var lowsrc: String

    /**
     * The deprecated align property of the HTMLImageElement interface is a string which indicates how to position the
     * image relative to its container. It reflects the &lt;img&gt; element's align content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/align)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var align: String

    /**
     * The deprecated hspace property of the HTMLImageElement interface specifies the number of pixels of empty space to
     * leave empty on the left and right sides of the &lt;img&gt; element when laying out the page. It reflects the
     * &lt;img&gt; element's hspace content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/hspace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var hspace: Int

    /**
     * The deprecated vspace property of the HTMLImageElement interface specifies the number of pixels of empty space to
     * leave empty on the top and bottom sides of the &lt;img&gt; element when laying out the page. It reflects the
     * &lt;img&gt; element's vspace content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/vspace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var vspace: Int

    /**
     * The deprecated longDesc property of the HTMLImageElement interface specifies the URL of a text or HTML file which
     * contains a long-form description of the image. This can be used to provide optional added details beyond the
     * short description provided in the title attribute. It reflects the &lt;img&gt; element's longdesc content
     * attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/longDesc)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var longDesc: String

    /**
     * The deprecated border property of the HTMLImageElement interface specifies the number of pixels thick the border
     * surrounding the image should be. A value of 0, the default, indicates that no border should be drawn. It reflects
     * the &lt;img&gt; element's border content attribute.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/border)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var border: String

    /**
     * The read-only x property of the HTMLImageElement interface indicates the x-coordinate of the &lt;img&gt;
     * element's left border edge relative to the root element's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/x)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val x: Int

    /**
     * The read-only y property of the HTMLImageElement interface indicates the y-coordinate of the &lt;img&gt;
     * element's top border edge relative to the root element's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/y)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val y: Int

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

public open external class Image : HTMLImageElement {
    public constructor(width: Int = definedExternally, height: Int = definedExternally)

    /**
     * The read-only children property returns a live HTMLCollection which contains all of the child elements of the
     * document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val children: HTMLCollection

    /**
     * The Document.firstElementChild read-only property returns the document's first child Element, or null if there
     * are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val firstElementChild: Element?

    /**
     * The Document.lastElementChild read-only property returns the document's last child Element, or null if there are
     * no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val lastElementChild: Element?

    /**
     * The Document.childElementCount read-only property returns the number of child elements of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val childElementCount: Int

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun prepend(vararg nodes: Node)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun prepend(vararg nodes: String)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun prepend()

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun append(vararg nodes: Node)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun append(vararg nodes: String)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun append()

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceChildren(vararg nodes: Node)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceChildren(vararg nodes: String)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceChildren()

    /**
     * The moveBefore() method of the Document interface moves a given Node inside the Document DOM node as a direct
     * child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun moveBefore(node: Node, child: Node?)

    /**
     * The Document method querySelector() returns the first Element within the document that matches the specified CSS
     * selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun querySelector(selectors: String): Element?

    /**
     * The Document method querySelectorAll() returns a static (not live) NodeList representing a list of the document's
     * elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun querySelectorAll(selectors: String): NodeList

    /**
     * The Element.previousElementSibling read-only property returns the Element immediately prior to the specified one
     * in its parent's children list, or null if the specified element is the first one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/previousElementSibling)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val previousElementSibling: Element?

    /**
     * The Element.nextElementSibling read-only property returns the element immediately following the specified one in
     * its parent's children list, or null if the specified element is the last one in the list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/nextElementSibling)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun before(vararg nodes: Node)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun before(vararg nodes: String)

    /**
     * The before() method of the DocumentType interface inserts a set of Node objects or strings in the children list
     * of this DocumentType's parent, just before this DocumentType. Strings are inserted as equivalent Text nodes.
     * Nothing happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/before)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun before()

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun after(vararg nodes: Node)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun after(vararg nodes: String)

    /**
     * The after() method of the DocumentType interface inserts a set of Node objects or strings in the children list of
     * the DocumentType's parent, just after the DocumentType. Strings are inserted as equivalent Text nodes. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/after)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun after()

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceWith(vararg nodes: Node)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceWith(vararg nodes: String)

    /**
     * The replaceWith() method of the DocumentType interface replaces this DocumentType in the children list of its
     * parent with a set of Node objects or strings. Strings are inserted as equivalent Text nodes. Nothing happens if
     * parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/replaceWith)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceWith()

    /**
     * The remove() method of the DocumentType interface removes the DocumentType node from its parent node. Nothing
     * happens if parentNode is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/remove)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun remove()

    /**
     * The assignedSlot read-only property of the Element interface returns an HTMLSlotElement representing the
     * &lt;slot&gt; element the node is inserted in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/assignedSlot)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var role: String?

    /**
     * The ariaActiveDescendantElement property of the ElementInternals interface represents the current active element
     * when focus is on a composite widget, combobox, textbox, group, or application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaActiveDescendantElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaActiveDescendantElement: Element?

    /**
     * The ariaAtomic property of the ElementInternals interface reflects the value of the aria-atomic attribute, which
     * indicates whether assistive technologies will present all, or only parts of, the changed region based on the
     * change notifications defined by the aria-relevant attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAtomic)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaAtomic: String?

    /**
     * The ariaAutoComplete property of the ElementInternals interface reflects the value of the aria-autocomplete
     * attribute, which indicates whether inputting text could trigger display of one or more predictions of the user's
     * intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they
     * were made.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaAutoComplete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaAutoComplete: String?

    /**
     * The ariaBrailleLabel property of the ElementInternals interface reflects the value of the aria-braillelabel
     * attribute, which defines the ARIA braille label of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleLabel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaBrailleLabel: String?

    /**
     * The ariaBrailleRoleDescription property of the ElementInternals interface reflects the value of the
     * aria-brailleroledescription attribute, which defines the ARIA braille role description of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBrailleRoleDescription)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaBrailleRoleDescription: String?

    /**
     * The ariaBusy property of the ElementInternals interface reflects the value of the aria-busy attribute, which
     * indicates whether an element is being modified, as assistive technologies may want to wait until the
     * modifications are complete before exposing them to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaBusy)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaBusy: String?

    /**
     * The ariaChecked property of the ElementInternals interface reflects the value of the aria-checked attribute,
     * which indicates the current "checked" state of checkboxes, radio buttons, and other widgets that have a checked
     * state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaChecked)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaChecked: String?

    /**
     * The ariaColCount property of the ElementInternals interface reflects the value of the aria-colcount attribute,
     * which defines the number of columns in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaColCount: String?

    /**
     * The ariaColIndex property of the ElementInternals interface reflects the value of the aria-colindex attribute,
     * which defines an element's column index or position with respect to the total number of columns within a table,
     * grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaColIndex: String?

    /**
     * The ariaColIndexText property of the ElementInternals interface reflects the value of the aria-colindextext
     * attribute, which defines a human-readable text alternative of aria-colindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColIndexText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaColIndexText: String?

    /**
     * The ariaColSpan property of the ElementInternals interface reflects the value of the aria-colspan attribute,
     * which defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaColSpan)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaColSpan: String?

    /**
     * The ariaControlsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that are controlled by the element it is applied to. For example, this might be set on a combobox to
     * indicate the element that it pops up, or on a scrollbar to indicate the ID of the element it controls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaControlsElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaControlsElements: JsArray<Element>?

    /**
     * The ariaCurrent property of the ElementInternals interface reflects the value of the aria-current attribute,
     * which indicates the element that represents the current item within a container or set of related elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaCurrent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaCurrent: String?

    /**
     * The ariaDescribedByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible description for the element it is applied to. The accessible description is
     * similar to the accessible label (see ariaLabelledByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescribedByElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaDescribedByElements: JsArray<Element>?

    /**
     * The ariaDescription property of the ElementInternals interface reflects the value of the aria-description
     * attribute, which defines a string value that describes or annotates the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDescription)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaDescription: String?

    /**
     * The ariaDetailsElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible details for the element it is applied to. The accessible details are similar
     * to the accessible description (see ariaDescribedByElements), but provides more verbose information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDetailsElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaDetailsElements: JsArray<Element>?

    /**
     * The ariaDisabled property of the ElementInternals interface reflects the value of the aria-disabled attribute,
     * which indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaDisabled)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaDisabled: String?

    /**
     * The ariaErrorMessageElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an error message for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaErrorMessageElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaErrorMessageElements: JsArray<Element>?

    /**
     * The ariaExpanded property of the ElementInternals interface reflects the value of the aria-expanded attribute,
     * which indicates whether a grouping element owned or controlled by this element is expanded or collapsed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaExpanded)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaFlowToElements: JsArray<Element>?

    /**
     * The ariaHasPopup property of the ElementInternals interface reflects the value of the aria-haspopup attribute,
     * which indicates the availability and type of interactive popup element, such as menu or dialog, that can be
     * triggered by an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHasPopup)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaHasPopup: String?

    /**
     * The ariaHidden property of the ElementInternals interface reflects the value of the aria-hidden attribute, which
     * indicates whether the element is exposed to an accessibility API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaHidden)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaHidden: String?

    /**
     * The ariaInvalid property of the ElementInternals interface reflects the value of the aria-invalid attribute.
     * Relevant for the application, checkbox, combobox, gridcell, listbox, radiogroup, slider, spinbutton, textbox, and
     * tree roles, it indicates to the accessibility API whether the entered value does not conform to the format
     * expected by the application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaInvalid)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaInvalid: String?

    /**
     * The ariaKeyShortcuts property of the ElementInternals interface reflects the value of the aria-keyshortcuts
     * attribute, which indicates keyboard shortcuts that an author has implemented to activate or give focus to an
     * element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaKeyShortcuts)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaKeyShortcuts: String?

    /**
     * The ariaLabel property of the ElementInternals interface reflects the value of the aria-label attribute, which
     * defines a string value that labels the current Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaLabel: String?

    /**
     * The ariaLabelledByElements property of the ElementInternals interface is an array containing the element (or
     * elements) that provide an accessible name for the element it is applied to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLabelledByElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaLabelledByElements: JsArray<Element>?

    /**
     * The ariaLevel property of the ElementInternals interface reflects the value of the aria-level attribute, which
     * defines the hierarchical level of an element within a structure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLevel)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaLevel: String?

    /**
     * The ariaLive property of the ElementInternals interface reflects the value of the aria-live attribute, which
     * indicates that an element will be updated, and describes the types of updates the user agents, assistive
     * technologies, and user can expect from the live region.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaLive)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaLive: String?

    /**
     * The ariaModal property of the ElementInternals interface reflects the value of the aria-modal attribute, which
     * indicates whether an element is modal when displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaModal)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaModal: String?

    /**
     * The ariaMultiLine property of the ElementInternals interface reflects the value of the aria-multiline attribute,
     * which indicates whether a text box accepts multiple lines of input or only a single line.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiLine)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaMultiLine: String?

    /**
     * The ariaMultiSelectable property of the ElementInternals interface reflects the value of the aria-multiselectable
     * attribute, which indicates that the user may select more than one item from the current selectable descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaMultiSelectable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaMultiSelectable: String?

    /**
     * The ariaOrientation property of the ElementInternals interface reflects the value of the aria-orientation
     * attribute, which indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOrientation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaOrientation: String?

    /**
     * The ariaOwnsElements property of the ElementInternals interface is an array containing the element (or elements)
     * that define a visual, functional, or contextual relationship between a parent element that it is applied to, and
     * its child elements. This is used when the shadow DOM hierarchy cannot be used to represent the relationship, and
     * it would not otherwise be available to assistive technology,
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaOwnsElements)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaOwnsElements: JsArray<Element>?

    /**
     * The ariaPlaceholder property of the ElementInternals interface reflects the value of the aria-placeholder
     * attribute, which defines a short hint intended to aid the user with data entry when the control has no value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPlaceholder)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaPlaceholder: String?

    /**
     * The ariaPosInSet property of the ElementInternals interface reflects the value of the aria-posinset attribute,
     * which defines an element's number or position in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPosInSet)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaPosInSet: String?

    /**
     * The ariaPressed property of the ElementInternals interface reflects the value of the aria-pressed attribute,
     * which indicates the current "pressed" state of toggle buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaPressed)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaPressed: String?

    /**
     * The ariaReadOnly property of the ElementInternals interface reflects the value of the aria-readonly attribute,
     * which indicates that the element is not editable, but is otherwise operable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaReadOnly)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaReadOnly: String?

    /**
     * The ariaRelevant property of the ElementInternals interface reflects the value of the aria-relevant attribute,
     * which indicates what notifications the user agent will trigger when the accessibility tree within a live region
     * is modified. This is used to describe what changes in an aria-live region are relevant and should be announced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRelevant)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRelevant: String?

    /**
     * The ariaRequired property of the ElementInternals interface reflects the value of the aria-required attribute,
     * which indicates that user input is required on the element before a form may be submitted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRequired)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRequired: String?

    /**
     * The ariaRoleDescription property of the ElementInternals interface reflects the value of the aria-roledescription
     * attribute, which defines a human-readable, author-localized description for the role of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRoleDescription)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRoleDescription: String?

    /**
     * The ariaRowCount property of the ElementInternals interface reflects the value of the aria-rowcount attribute,
     * which defines the total number of rows in a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRowCount: String?

    /**
     * The ariaRowIndex property of the ElementInternals interface reflects the value of the aria-rowindex attribute,
     * which defines an element's row index or position with respect to the total number of rows within a table, grid,
     * or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRowIndex: String?

    /**
     * The ariaRowIndexText property of the ElementInternals interface reflects the value of the aria-rowindextext
     * attribute, which defines a human-readable text alternative of aria-rowindex.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowIndexText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRowIndexText: String?

    /**
     * The ariaRowSpan property of the ElementInternals interface reflects the value of the aria-rowspan attribute,
     * which defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaRowSpan)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaRowSpan: String?

    /**
     * The ariaSelected property of the ElementInternals interface reflects the value of the aria-selected attribute,
     * which indicates the current "selected" state of elements that have a selected state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSelected)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaSelected: String?

    /**
     * The ariaSetSize property of the ElementInternals interface reflects the value of the aria-setsize attribute,
     * which defines the number of items in the current set of listitems or treeitems.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSetSize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaSetSize: String?

    /**
     * The ariaSort property of the ElementInternals interface reflects the value of the aria-sort attribute, which
     * indicates if items in a table or grid are sorted in ascending or descending order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaSort)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaSort: String?

    /**
     * The ariaValueMax property of the ElementInternals interface reflects the value of the aria-valuemax attribute,
     * which defines the maximum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMax)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaValueMax: String?

    /**
     * The ariaValueMin property of the ElementInternals interface reflects the value of the aria-valuemin attribute,
     * which defines the minimum allowed value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueMin)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaValueMin: String?

    /**
     * The ariaValueNow property of the ElementInternals interface reflects the value of the aria-valuenow attribute,
     * which defines the current value for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueNow)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaValueNow: String?

    /**
     * The ariaValueText property of the ElementInternals interface reflects the value of the aria-valuetext attribute,
     * which defines the human-readable text alternative of aria-valuenow for a range widget.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ElementInternals/ariaValueText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ariaValueText: String?

    /**
     * The ariaNotify() method of the Element interface queues a string of text to be announced by a screen reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/ariaNotify)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
    override var onabort: ((Event) -> Unit)?

    /**
     * The auxclick event is fired at an Element when a non-primary pointing device button (any mouse button other than
     * the primary—usually leftmost—button) has been pressed and released both within the same element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onauxclick: ((PointerEvent) -> Unit)?

    /**
     * The DOM beforeinput event fires when the value of an &lt;input&gt; or &lt;textarea&gt; element is about to be
     * modified. But in contrast to the input event, it does not fire on the &lt;select&gt; element. The event also
     * applies to elements with contenteditable enabled, and to any element when designMode is turned on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onbeforeinput: ((InputEvent) -> Unit)?

    /**
     * An element receives a beforematch event when it is in the hidden until found state and the browser is about to
     * reveal its content because the user has found the content through the "find in page" feature or through fragment
     * navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforematch_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onbeforematch: ((Event) -> Unit)?

    /**
     * The beforetoggle event of the HTMLElement interface fires on a popover or &lt;dialog&gt; element just before it
     * is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onbeforetoggle: ((ToggleEvent) -> Unit)?

    /**
     * The blur event fires when an element has lost focus. The event does not bubble, but the related focusout event
     * that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onchange: ((Event) -> Unit)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onclick: ((PointerEvent) -> Unit)?
    override var onclose: ((Event) -> Unit)?

    /**
     * The command event of the HTMLElement interface fires on an element that is controlled via a button with valid
     * commandForElement and command values, whenever the button is interacted with (e.g., it is clicked).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncommand: ((CommandEvent) -> Unit)?
    override var oncontextlost: ((Event) -> Unit)?

    /**
     * The contextmenu event fires when the user attempts to open a context menu. This event is typically triggered by
     * clicking the right mouse button, or by pressing the context menu key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncontextmenu: ((PointerEvent) -> Unit)?
    override var oncontextrestored: ((Event) -> Unit)?

    /**
     * The copy event of the Clipboard API fires when the user initiates a copy action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncopy: ((ClipboardEvent) -> Unit)?
    override var oncuechange: ((Event) -> Unit)?

    /**
     * The cut event of the Clipboard API is fired when the user has initiated a "cut" action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncut: ((ClipboardEvent) -> Unit)?

    /**
     * The dblclick event fires when a pointing device button (such as a mouse's primary button) is double-clicked; that
     * is, when it's rapidly clicked twice on a single element within a very short span of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondblclick: ((MouseEvent) -> Unit)?

    /**
     * The drag event is fired repeatedly as an element or text selection is being dragged by the user. The firing
     * frequency depends on the browser, operating system, and pointer movement; do not rely on a fixed interval.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondrag: ((DragEvent) -> Unit)?

    /**
     * The dragend event is fired when a drag operation ends (by releasing a mouse button or hitting the escape key).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragend: ((DragEvent) -> Unit)?

    /**
     * The dragenter event is fired when a dragged element or text selection enters a valid drop target. The target
     * object is the immediate user selection (the element directly indicated by the user as the drop target), or the
     * &lt;body&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragenter: ((DragEvent) -> Unit)?

    /**
     * The dragleave event is fired when a dragged element or text selection leaves a valid drop target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragleave: ((DragEvent) -> Unit)?

    /**
     * The dragover event is fired repeatedly when an element or text selection is being dragged over a potential drop
     * target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragover: ((DragEvent) -> Unit)?

    /**
     * The dragstart event is fired when the user starts dragging an element or text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragstart: ((DragEvent) -> Unit)?

    /**
     * The drop event is fired when an element or text selection is dropped on a valid drop target. To ensure that the
     * drop event always fires as expected, you should always include a preventDefault() call in the part of your code
     * which handles the dragover event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?

    /**
     * The focus event fires when an element has received focus. The event does not bubble, but the related focusin
     * event that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onfocus: ((FocusEvent) -> Unit)?
    override var onformdata: ((FormDataEvent) -> Unit)?

    /**
     * The input event fires when the value of an &lt;input&gt;, &lt;select&gt;, or &lt;textarea&gt; element has been
     * changed as a direct result of a user action (such as typing in a textbox or checking a checkbox).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oninput: ((InputEvent) -> Unit)?
    override var oninvalid: ((Event) -> Unit)?

    /**
     * The keydown event is fired when a key is pressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onkeypress: ((KeyboardEvent) -> Unit)?

    /**
     * The keyup event is fired when a key is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onkeyup: ((KeyboardEvent) -> Unit)?

    /**
     * The load event fires for elements containing a resource when the resource has successfully loaded. Currently, the
     * list of supported HTML elements are: &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;link&gt;, &lt;object&gt;,
     * &lt;script&gt;, &lt;style&gt;, and &lt;track&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmousedown: ((MouseEvent) -> Unit)?

    /**
     * The mouseenter event is fired at an Element when a pointing device (usually a mouse) is initially moved so that
     * its hotspot is within the element at which the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseenter: ((MouseEvent) -> Unit)?

    /**
     * The mouseleave event is fired at an Element when the cursor of a pointing device (usually a mouse) is moved out
     * of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseleave: ((MouseEvent) -> Unit)?

    /**
     * The mousemove event is fired at an element when a pointing device (usually a mouse) is moved while the cursor's
     * hotspot is inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmousemove: ((MouseEvent) -> Unit)?

    /**
     * The mouseout event is fired at an Element when a pointing device (usually a mouse) is used to move the cursor so
     * that it is no longer contained within the element or one of its children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseout: ((MouseEvent) -> Unit)?

    /**
     * The mouseover event is fired at an Element when a pointing device (such as a mouse or trackpad) is used to move
     * the cursor onto the element or one of its child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseover: ((MouseEvent) -> Unit)?

    /**
     * The mouseup event is fired at an Element when a button on a pointing device (such as a mouse or trackpad) is
     * released while the pointer is located inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseup: ((MouseEvent) -> Unit)?

    /**
     * The paste event of the Clipboard API is fired when the user has initiated a "paste" action through the browser's
     * user interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onresize: ((Event) -> Unit)?

    /**
     * The scroll event fires when the document view has been scrolled. To detect when scrolling has completed, see the
     * scrollend event of Document. For element scrolling, see scroll event of Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onscroll: ((Event) -> Unit)?

    /**
     * The scrollend event fires when the document view has completed scrolling. Scrolling is considered completed when
     * the scroll position has no more pending updates and the user has completed their gesture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onscrollend: ((Event) -> Unit)?

    /**
     * The securitypolicyviolation event is fired when a Content Security Policy is violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onwheel: ((WheelEvent) -> Unit)?

    /**
     * The touchstart event is fired when one or more touch points are placed on the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchstart: ((TouchEvent) -> Unit)?

    /**
     * The touchend event fires when one or more touch points are removed from the touch surface. Remember that it is
     * possible to get a touchcancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchend: ((TouchEvent) -> Unit)?

    /**
     * The touchmove event is fired when one or more touch points are moved along the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchmove: ((TouchEvent) -> Unit)?

    /**
     * The touchcancel event is fired when one or more touch points have been disrupted in an implementation-specific
     * manner.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchcancel: ((TouchEvent) -> Unit)?

    /**
     * The pointerover event is fired when a pointing device is moved into an element's hit test boundaries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerover: ((PointerEvent) -> Unit)?

    /**
     * The pointerenter event fires when a pointing device is moved into the hit test boundaries of an element or one of
     * its descendants, including as a result of a pointerdown event from a device that does not support hover (see
     * pointerdown). Otherwise, pointerenter works the same as mouseenter, and are dispatched at the same time. They are
     * also dispatched at the same time as mouseover and pointerover events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerenter: ((PointerEvent) -> Unit)?

    /**
     * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions
     * from no buttons pressed to at least one button pressed. For touch, it is fired when physical contact is made with
     * the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerdown: ((PointerEvent) -> Unit)?

    /**
     * The pointermove event is fired when a pointer changes coordinates, and the pointer has not been canceled by a
     * browser touch-action. The event is also fired when a pointer changes any of its other properties, provided the
     * change doesn't produce some other pointer event. This includes any change to pressure, tangential pressure, tilt,
     * twist, contact geometry (width and height), or chorded buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointermove: ((PointerEvent) -> Unit)?

    /**
     * The pointerrawupdate event is fired when a pointer changes any properties that don't fire pointerdown or
     * pointerup events. See pointermove for a list of these properties.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerrawupdate_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerrawupdate: ((PointerEvent) -> Unit)?

    /**
     * The pointerup event is fired when a pointer is no longer active. Remember that it is possible to get a
     * pointercancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerup: ((PointerEvent) -> Unit)?

    /**
     * The pointercancel event is fired when the browser determines that there are unlikely to be any more pointer
     * events, or if after the pointerdown event is fired, the pointer is then used to manipulate the viewport by
     * panning, zooming, or scrolling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointercancel: ((PointerEvent) -> Unit)?

    /**
     * The pointerout event is fired for several reasons including: pointing device is moved out of the hit test
     * boundaries of an element; firing the pointerup event for a device that does not support hover (see pointerup);
     * after firing the pointercancel event (see pointercancel); when a pen stylus leaves the hover range detectable by
     * the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerout: ((PointerEvent) -> Unit)?

    /**
     * The pointerleave event is fired when a pointing device is moved out of the hit test boundaries of an element. For
     * pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer. Otherwise,
     * pointerleave works the same as mouseleave, and are dispatched at the same time. They are also dispatched at the
     * same time as mouseout and pointerout events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerleave: ((PointerEvent) -> Unit)?

    /**
     * The gotpointercapture event is fired when an element captures a pointer using setPointerCapture().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ongotpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The lostpointercapture event is fired when a captured pointer is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/lostpointercapture_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onlostpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The contentEditable property of the HTMLElement interface specifies whether or not the element is editable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/contentEditable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var contentEditable: String

    /**
     * The enterKeyHint property is an enumerated property defining what action label (or icon) to present for the enter
     * key on virtual keyboards.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/enterKeyHint)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var enterKeyHint: String

    /**
     * The HTMLElement.isContentEditable read-only property returns a boolean value that is true if the contents of the
     * element are editable; otherwise it returns false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/isContentEditable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val isContentEditable: Boolean

    /**
     * The HTMLElement property inputMode reflects the value of the element's inputmode attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/inputMode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var inputMode: String

    /**
     * The dataset read-only property of the HTMLElement interface provides read/write access to custom data attributes
     * (data-*) on elements. It exposes a map of strings (DOMStringMap) with an entry for each data-* attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dataset)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val dataset: DOMStringMap

    /**
     * The nonce property of the HTMLElement interface returns the cryptographic number used once that is used by
     * Content Security Policy to determine whether a given fetch will be allowed to proceed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/nonce)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var nonce: String

    /**
     * The autofocus property of the HTMLElement interface represents a boolean value reflecting the autofocus HTML
     * global attribute. This indicates whether the element should be focused on page load or, if it is nested inside a
     * &lt;dialog&gt; or popover element, when the &lt;dialog&gt; or popover is shown.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/autofocus)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var autofocus: Boolean

    /**
     * The tabIndex property of the HTMLElement interface represents the tab order of the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/tabIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var tabIndex: Int

    /**
     * The HTMLElement.focus() method sets focus on the specified element, if it can be focused. The focused element is
     * the element that will receive keyboard and similar events by default.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/focus)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun focus(options: FocusOptions)

    /**
     * The HTMLElement.blur() method removes keyboard focus from the current element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/blur)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun blur()

    /**
     * The read-only style property of the HTMLElement interface returns the inline style of an element in the form of a
     * live CSSStyleProperties object. This object can be used to get and set the inline styles of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/style)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val style: CSSStyleProperties

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
 * The HTMLTableCellElement interface provides special properties and methods (beyond the regular HTMLElement interface
 * it also has available to it by inheritance) for manipulating the layout and presentation of table cells, either
 * header cells (&lt;th&gt;) or data cells (&lt;td&gt;), in an HTML document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class HTMLTableCellElement : HTMLElement {
    /**
     * The colSpan property of the HTMLTableCellElement interface represents the number of columns this cell must span;
     * this lets the cell occupy space across multiple columns of the table. It reflects the colspan attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/colSpan)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var colSpan: Int

    /**
     * The rowSpan property of the HTMLTableCellElement interface represents the number of rows this cell must span;
     * this lets the cell occupy space across multiple rows of the table. It reflects the rowspan attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/rowSpan)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var rowSpan: Int

    /**
     * The headers property of the HTMLTableCellElement interface contains a list of IDs of &lt;th&gt; elements that are
     * headers for this specific cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/headers)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var headers: String

    /**
     * The cellIndex read-only property of the HTMLTableCellElement interface represents the position of a cell within
     * its row (&lt;tr&gt;). The first cell has an index of 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/cellIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val cellIndex: Int

    /**
     * The scope property of the HTMLTableCellElement interface indicates the scope of a &lt;th&gt; cell.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/scope)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var scope: String

    /**
     * The abbr property of the HTMLTableCellElement interface indicates an abbreviation associated with the cell. If
     * the cell does not represent a header cell &lt;th&gt;, it is ignored.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/abbr)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var abbr: String

    /**
     * The align property of the HTMLTableCellElement interface is a string indicating how to horizontally align text in
     * the &lt;th&gt; or &lt;td&gt; table cell.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/align)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var align: String
    public open var axis: String
    public open var height: String
    public open var width: String

    /**
     * The ch property of the HTMLTableCellElement interface does nothing. It reflects the char attribute of the cell
     * element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/ch)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var ch: String

    /**
     * The chOff property of the HTMLTableCellElement interface does nothing. It reflects the charoff attribute of the
     * cell element.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/chOff)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var chOff: String

    /**
     * The noWrap property of the HTMLTableCellElement interface returns a Boolean value indicating if the text of the
     * cell may be wrapped on several lines or not.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/noWrap)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var noWrap: Boolean

    /**
     * The vAlign property of the HTMLTableCellElement interface is a string indicating how to vertically align text in
     * a &lt;th&gt; or &lt;td&gt; table cell.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/vAlign)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var vAlign: String

    /**
     * The HTMLTableCellElement.bgColor property is used to set the background color of a cell or get the value of the
     * obsolete bgColor attribute, if present.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTableCellElement/bgColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var bgColor: String

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
 * The CanvasRenderingContext2D interface, part of the Canvas API, provides the 2D rendering context for the drawing
 * surface of a &lt;canvas&gt; element. It is used for drawing shapes, text, images, and other objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class CanvasRenderingContext2D : CanvasSettings, CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, RenderingContext {
    /**
     * The CanvasRenderingContext2D.canvas property, part of the Canvas API, is a read-only reference to the
     * HTMLCanvasElement object that is associated with a given context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/canvas)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val canvas: HTMLCanvasElement
}

public external interface CanvasDrawImage : JsAny {
    /**
     * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image
     * onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)

    /**
     * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image
     * onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)

    /**
     * The CanvasRenderingContext2D.drawImage() method of the Canvas 2D API provides different ways to draw an image
     * onto the canvas.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/drawImage)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun drawImage(image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double)
}

/**
 * The CustomStateSet interface of the Document Object Model stores a list of states for an autonomous custom element,
 * and allows states to be added and removed from the set.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomStateSet)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class CustomStateSet : JsAny {
    // not printed yet: setlike
}

public external interface GlobalEventHandlers : JsAny {
    public var onabort: ((Event) -> Unit)?

    /**
     * The auxclick event is fired at an Element when a non-primary pointing device button (any mouse button other than
     * the primary—usually leftmost—button) has been pressed and released both within the same element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onauxclick: ((PointerEvent) -> Unit)?

    /**
     * The DOM beforeinput event fires when the value of an &lt;input&gt; or &lt;textarea&gt; element is about to be
     * modified. But in contrast to the input event, it does not fire on the &lt;select&gt; element. The event also
     * applies to elements with contenteditable enabled, and to any element when designMode is turned on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onbeforeinput: ((InputEvent) -> Unit)?

    /**
     * An element receives a beforematch event when it is in the hidden until found state and the browser is about to
     * reveal its content because the user has found the content through the "find in page" feature or through fragment
     * navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforematch_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onbeforematch: ((Event) -> Unit)?

    /**
     * The beforetoggle event of the HTMLElement interface fires on a popover or &lt;dialog&gt; element just before it
     * is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onbeforetoggle: ((ToggleEvent) -> Unit)?

    /**
     * The blur event fires when an element has lost focus. The event does not bubble, but the related focusout event
     * that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onblur: ((FocusEvent) -> Unit)?
    public var oncancel: ((Event) -> Unit)?
    public var oncanplay: ((Event) -> Unit)?
    public var oncanplaythrough: ((Event) -> Unit)?

    /**
     * The change event is fired for &lt;input&gt;, &lt;select&gt;, and &lt;textarea&gt; elements when the user modifies
     * the element's value. Unlike the input event, the change event is not necessarily fired for each alteration to an
     * element's value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/change_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onchange: ((Event) -> Unit)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onclick: ((PointerEvent) -> Unit)?
    public var onclose: ((Event) -> Unit)?

    /**
     * The command event of the HTMLElement interface fires on an element that is controlled via a button with valid
     * commandForElement and command values, whenever the button is interacted with (e.g., it is clicked).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var oncommand: ((CommandEvent) -> Unit)?
    public var oncontextlost: ((Event) -> Unit)?

    /**
     * The contextmenu event fires when the user attempts to open a context menu. This event is typically triggered by
     * clicking the right mouse button, or by pressing the context menu key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var oncontextmenu: ((PointerEvent) -> Unit)?
    public var oncontextrestored: ((Event) -> Unit)?

    /**
     * The copy event of the Clipboard API fires when the user initiates a copy action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var oncopy: ((ClipboardEvent) -> Unit)?
    public var oncuechange: ((Event) -> Unit)?

    /**
     * The cut event of the Clipboard API is fired when the user has initiated a "cut" action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var oncut: ((ClipboardEvent) -> Unit)?

    /**
     * The dblclick event fires when a pointing device button (such as a mouse's primary button) is double-clicked; that
     * is, when it's rapidly clicked twice on a single element within a very short span of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondblclick: ((MouseEvent) -> Unit)?

    /**
     * The drag event is fired repeatedly as an element or text selection is being dragged by the user. The firing
     * frequency depends on the browser, operating system, and pointer movement; do not rely on a fixed interval.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondrag: ((DragEvent) -> Unit)?

    /**
     * The dragend event is fired when a drag operation ends (by releasing a mouse button or hitting the escape key).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondragend: ((DragEvent) -> Unit)?

    /**
     * The dragenter event is fired when a dragged element or text selection enters a valid drop target. The target
     * object is the immediate user selection (the element directly indicated by the user as the drop target), or the
     * &lt;body&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondragenter: ((DragEvent) -> Unit)?

    /**
     * The dragleave event is fired when a dragged element or text selection leaves a valid drop target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondragleave: ((DragEvent) -> Unit)?

    /**
     * The dragover event is fired repeatedly when an element or text selection is being dragged over a potential drop
     * target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondragover: ((DragEvent) -> Unit)?

    /**
     * The dragstart event is fired when the user starts dragging an element or text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondragstart: ((DragEvent) -> Unit)?

    /**
     * The drop event is fired when an element or text selection is dropped on a valid drop target. To ensure that the
     * drop event always fires as expected, you should always include a preventDefault() call in the part of your code
     * which handles the dragover event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ondrop: ((DragEvent) -> Unit)?
    public var ondurationchange: ((Event) -> Unit)?
    public var onemptied: ((Event) -> Unit)?
    public var onended: ((Event) -> Unit)?

    /**
     * The error event is fired on an element when a resource failed to load, or can't be used. For example, if a script
     * has an execution error or an image can't be found or is invalid.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/error_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?

    /**
     * The focus event fires when an element has received focus. The event does not bubble, but the related focusin
     * event that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onfocus: ((FocusEvent) -> Unit)?
    public var onformdata: ((FormDataEvent) -> Unit)?

    /**
     * The input event fires when the value of an &lt;input&gt;, &lt;select&gt;, or &lt;textarea&gt; element has been
     * changed as a direct result of a user action (such as typing in a textbox or checking a checkbox).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var oninput: ((InputEvent) -> Unit)?
    public var oninvalid: ((Event) -> Unit)?

    /**
     * The keydown event is fired when a key is pressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onkeydown: ((KeyboardEvent) -> Unit)?

    /**
     * The keypress event is fired when a letter, number, punctuation, or symbol key is pressed, or else when the Enter
     * key is pressed — including when the Enter key is pressed in combination with the Shift key or Ctrl key.
     * Otherwise, when a modifier key such as the Alt, Shift, Ctrl, Meta, Esc, or Option key is pressed in isolation,
     * the keypress event is not fired.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keypress_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onkeypress: ((KeyboardEvent) -> Unit)?

    /**
     * The keyup event is fired when a key is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onkeyup: ((KeyboardEvent) -> Unit)?

    /**
     * The load event fires for elements containing a resource when the resource has successfully loaded. Currently, the
     * list of supported HTML elements are: &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;link&gt;, &lt;object&gt;,
     * &lt;script&gt;, &lt;style&gt;, and &lt;track&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onload: ((Event) -> Unit)?
    public var onloadeddata: ((Event) -> Unit)?
    public var onloadedmetadata: ((Event) -> Unit)?
    public var onloadstart: ((Event) -> Unit)?

    /**
     * The mousedown event is fired at an Element when a pointing device button is pressed while the pointer is inside
     * the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousedown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmousedown: ((MouseEvent) -> Unit)?

    /**
     * The mouseenter event is fired at an Element when a pointing device (usually a mouse) is initially moved so that
     * its hotspot is within the element at which the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmouseenter: ((MouseEvent) -> Unit)?

    /**
     * The mouseleave event is fired at an Element when the cursor of a pointing device (usually a mouse) is moved out
     * of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmouseleave: ((MouseEvent) -> Unit)?

    /**
     * The mousemove event is fired at an element when a pointing device (usually a mouse) is moved while the cursor's
     * hotspot is inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmousemove: ((MouseEvent) -> Unit)?

    /**
     * The mouseout event is fired at an Element when a pointing device (usually a mouse) is used to move the cursor so
     * that it is no longer contained within the element or one of its children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmouseout: ((MouseEvent) -> Unit)?

    /**
     * The mouseover event is fired at an Element when a pointing device (such as a mouse or trackpad) is used to move
     * the cursor onto the element or one of its child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmouseover: ((MouseEvent) -> Unit)?

    /**
     * The mouseup event is fired at an Element when a button on a pointing device (such as a mouse or trackpad) is
     * released while the pointer is located inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onmouseup: ((MouseEvent) -> Unit)?

    /**
     * The paste event of the Clipboard API is fired when the user has initiated a "paste" action through the browser's
     * user interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpaste: ((ClipboardEvent) -> Unit)?
    public var onpause: ((Event) -> Unit)?
    public var onplay: ((Event) -> Unit)?
    public var onplaying: ((Event) -> Unit)?
    public var onprogress: ((Event) -> Unit)?
    public var onratechange: ((Event) -> Unit)?
    public var onreset: ((Event) -> Unit)?

    /**
     * The resize event fires when the document view (window) has been resized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/resize_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onresize: ((Event) -> Unit)?

    /**
     * The scroll event fires when the document view has been scrolled. To detect when scrolling has completed, see the
     * scrollend event of Document. For element scrolling, see scroll event of Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onscroll: ((Event) -> Unit)?

    /**
     * The scrollend event fires when the document view has completed scrolling. Scrolling is considered completed when
     * the scroll position has no more pending updates and the user has completed their gesture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onscrollend: ((Event) -> Unit)?

    /**
     * The securitypolicyviolation event is fired when a Content Security Policy is violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onsecuritypolicyviolation: ((Event) -> Unit)?
    public var onseeked: ((Event) -> Unit)?
    public var onseeking: ((Event) -> Unit)?
    public var onselect: ((Event) -> Unit)?
    public var onslotchange: ((Event) -> Unit)?
    public var onstalled: ((Event) -> Unit)?
    public var onsubmit: ((SubmitEvent) -> Unit)?
    public var onsuspend: ((Event) -> Unit)?
    public var ontimeupdate: ((Event) -> Unit)?

    /**
     * The toggle event of the HTMLElement interface fires on a popover element, &lt;dialog&gt; element, or
     * &lt;details&gt; element just after it is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/toggle_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ontoggle: ((ToggleEvent) -> Unit)?
    public var onvolumechange: ((Event) -> Unit)?
    public var onwaiting: ((Event) -> Unit)?
    public var onwebkitanimationend: ((Event) -> Unit)?
    public var onwebkitanimationiteration: ((Event) -> Unit)?
    public var onwebkitanimationstart: ((Event) -> Unit)?
    public var onwebkittransitionend: ((Event) -> Unit)?

    /**
     * The wheel event fires when the user rotates a wheel button on a pointing device (typically a mouse). It is also
     * fired for related devices that simulate wheel actions, such as trackpads and mouse balls.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/wheel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onwheel: ((WheelEvent) -> Unit)?

    /**
     * The touchstart event is fired when one or more touch points are placed on the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ontouchstart: ((TouchEvent) -> Unit)?

    /**
     * The touchend event fires when one or more touch points are removed from the touch surface. Remember that it is
     * possible to get a touchcancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ontouchend: ((TouchEvent) -> Unit)?

    /**
     * The touchmove event is fired when one or more touch points are moved along the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ontouchmove: ((TouchEvent) -> Unit)?

    /**
     * The touchcancel event is fired when one or more touch points have been disrupted in an implementation-specific
     * manner.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ontouchcancel: ((TouchEvent) -> Unit)?

    /**
     * The pointerover event is fired when a pointing device is moved into an element's hit test boundaries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerover: ((PointerEvent) -> Unit)?

    /**
     * The pointerenter event fires when a pointing device is moved into the hit test boundaries of an element or one of
     * its descendants, including as a result of a pointerdown event from a device that does not support hover (see
     * pointerdown). Otherwise, pointerenter works the same as mouseenter, and are dispatched at the same time. They are
     * also dispatched at the same time as mouseover and pointerover events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerenter: ((PointerEvent) -> Unit)?

    /**
     * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions
     * from no buttons pressed to at least one button pressed. For touch, it is fired when physical contact is made with
     * the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerdown: ((PointerEvent) -> Unit)?

    /**
     * The pointermove event is fired when a pointer changes coordinates, and the pointer has not been canceled by a
     * browser touch-action. The event is also fired when a pointer changes any of its other properties, provided the
     * change doesn't produce some other pointer event. This includes any change to pressure, tangential pressure, tilt,
     * twist, contact geometry (width and height), or chorded buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointermove: ((PointerEvent) -> Unit)?

    /**
     * The pointerrawupdate event is fired when a pointer changes any properties that don't fire pointerdown or
     * pointerup events. See pointermove for a list of these properties.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerrawupdate_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerrawupdate: ((PointerEvent) -> Unit)?

    /**
     * The pointerup event is fired when a pointer is no longer active. Remember that it is possible to get a
     * pointercancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerup: ((PointerEvent) -> Unit)?

    /**
     * The pointercancel event is fired when the browser determines that there are unlikely to be any more pointer
     * events, or if after the pointerdown event is fired, the pointer is then used to manipulate the viewport by
     * panning, zooming, or scrolling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointercancel: ((PointerEvent) -> Unit)?

    /**
     * The pointerout event is fired for several reasons including: pointing device is moved out of the hit test
     * boundaries of an element; firing the pointerup event for a device that does not support hover (see pointerup);
     * after firing the pointercancel event (see pointercancel); when a pen stylus leaves the hover range detectable by
     * the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerout: ((PointerEvent) -> Unit)?

    /**
     * The pointerleave event is fired when a pointing device is moved out of the hit test boundaries of an element. For
     * pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer. Otherwise,
     * pointerleave works the same as mouseleave, and are dispatched at the same time. They are also dispatched at the
     * same time as mouseout and pointerout events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onpointerleave: ((PointerEvent) -> Unit)?

    /**
     * The gotpointercapture event is fired when an element captures a pointer using setPointerCapture().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var ongotpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The lostpointercapture event is fired when a captured pointer is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/lostpointercapture_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var onlostpointercapture: ((PointerEvent) -> Unit)?
}

public external interface WindowOrWorkerGlobalScope : JsAny {
    public val origin: String
    public val isSecureContext: Boolean
    public val crossOriginIsolated: Boolean
    public fun reportError(e: JsAny?)
    public fun btoa(data: String): String
    public fun atob(data: String): String
    public fun setTimeout(handler: String, timeout: Int = definedExternally): Int
    public fun setTimeout(handler: () -> Unit, timeout: Int = definedExternally): Int
    public fun clearTimeout(id: Int = definedExternally)
    public fun setInterval(handler: String, timeout: Int = definedExternally): Int
    public fun setInterval(handler: () -> Unit, timeout: Int = definedExternally): Int
    public fun clearInterval(id: Int = definedExternally)
    public fun queueMicrotask(callback: () -> Unit)
    public fun createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions = definedExternally): Promise<ImageBitmap>
    public fun createImageBitmap(image: ImageBitmapSource, sx: Int, sy: Int, sw: Int, sh: Int, options: ImageBitmapOptions = definedExternally): Promise<ImageBitmap>
    public fun structuredClone(value: JsAny?, options: StructuredSerializeOptions = definedExternally): JsAny?
    public fun fetch(input: Request, init: RequestInit = definedExternally): Promise<Response>
    public fun fetch(input: String, init: RequestInit = definedExternally): Promise<Response>
    public val performance: Performance

    /**
     * Available only in secure contexts.
     */
    public val caches: CacheStorage
}

// file: org/w3c/dom/dom.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
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
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class Event : JsAny {
    /**
     * The Event() constructor creates a new Event object. An event created in this way is called a synthetic event, as
     * opposed to an event fired by the browser, and can be dispatched by a script.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/Event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: EventInit = definedExternally)

    /**
     * The type read-only property of the Event interface returns a string containing the event's type. It is set when
     * the event is constructed and is the name commonly used to refer to the specific event, such as click, load, or
     * error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val type: String

    /**
     * The read-only target property of the Event interface is a reference to the object onto which the event was
     * dispatched. It is different from Event.currentTarget when the event handler is called during the bubbling or
     * capturing phase of the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/target)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val target: EventTarget?

    /**
     * The srcElement read-only property of the Event interface is a deprecated alias for the Event.target property. Use
     * Event.target instead.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/srcElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val srcElement: EventTarget?

    /**
     * The currentTarget read-only property of the Event interface identifies the element to which the event handler has
     * been attached.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/currentTarget)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentTarget: EventTarget?

    /**
     * The composedPath() method of the Event interface returns the event's path which is an array of the objects on
     * which listeners will be invoked. This does not include nodes in shadow trees if the shadow root was created with
     * its ShadowRoot.mode closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/composedPath)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun composedPath(): JsArray<EventTarget>

    /**
     * The eventPhase read-only property of the Event interface indicates which phase of the event flow is currently
     * being evaluated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/eventPhase)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var cancelBubble: Boolean

    /**
     * The stopImmediatePropagation() method of the Event interface prevents other listeners of the same event from
     * being called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/stopImmediatePropagation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun stopImmediatePropagation()

    /**
     * The bubbles read-only property of the Event interface indicates whether the event bubbles up through the DOM tree
     * or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/bubbles)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val bubbles: Boolean

    /**
     * The cancelable read-only property of the Event interface indicates whether the event can be canceled, and
     * therefore prevented as if the event never happened.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/cancelable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val cancelable: Boolean

    /**
     * The Event property returnValue indicates whether the default action for this event has been prevented or not.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/returnValue)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var returnValue: Boolean

    /**
     * The preventDefault() method of the Event interface tells the user agent that the event is being explicitly
     * handled, so its default action, such as page scrolling, link navigation, or pasting text, should not be taken.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/preventDefault)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun preventDefault()

    /**
     * The defaultPrevented read-only property of the Event interface returns a boolean value indicating whether or not
     * the call to Event.preventDefault() canceled the event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/defaultPrevented)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val defaultPrevented: Boolean

    /**
     * The read-only composed property of the Event interface returns a boolean value which indicates whether or not the
     * event will propagate across the shadow DOM boundary into the standard DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/composed)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val composed: Boolean

    /**
     * The isTrusted read-only property of the Event interface is a boolean value that is true when the event was
     * generated by the user agent (including via user actions and programmatic methods such as HTMLElement.focus()),
     * and false when the event was dispatched via EventTarget.dispatchEvent(). The click event fired through
     * HTMLElement.click() sets the isTrusted property to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/isTrusted)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val isTrusted: Boolean

    /**
     * The timeStamp read-only property of the Event interface returns the time (in milliseconds) at which the event was
     * created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/timeStamp)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val timeStamp: Double

    /**
     * The Event.initEvent() method is used to initialize the value of an event created using Document.createEvent().
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Event/initEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

public fun EventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): EventInit {
    val dictionary = newJsObject<EventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    return dictionary
}

/**
 * The EventTarget interface is implemented by objects that can receive events and may have listeners for them. In other
 * words, any target of events implements the methods associated with this interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class EventTarget : JsAny {
    /**
     * The EventTarget() constructor creates a new EventTarget object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/EventTarget)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
     * specified event is delivered to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun addEventListener(type: String, callback: EventListener?, options: AddEventListenerOptions)

    /**
     * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
     * specified event is delivered to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun addEventListener(type: String, callback: EventListener?, options: Boolean)

    /**
     * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
     * specified event is delivered to the target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun addEventListener(type: String, callback: EventListener?)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeEventListener(type: String, callback: (Event) -> Unit, options: EventListenerOptions)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeEventListener(type: String, callback: EventListener?, options: Boolean)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeEventListener(type: String, callback: (Event) -> Unit, options: Boolean)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeEventListener(type: String, callback: EventListener?)

    /**
     * The removeEventListener() method of the EventTarget interface removes an event listener previously registered
     * with EventTarget.addEventListener() from the target. The event listener to be removed is identified using a
     * combination of the event type, the event listener function itself, and various optional options that may affect
     * the matching process; see Matching event listeners for removal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeEventListener(type: String, callback: (Event) -> Unit)

    /**
     * The dispatchEvent() method of the EventTarget sends an Event to the object, (synchronously) invoking the affected
     * event listeners in the appropriate order. The normal event processing rules (including the capturing and optional
     * bubbling phase) also apply to events dispatched manually with dispatchEvent().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun dispatchEvent(event: Event): Boolean
}

private fun toEventListener(callback: (Event) -> Unit): EventListener = js("callback")

/**
 * The addEventListener() method of the EventTarget interface sets up a function that will be called whenever the
 * specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener)
    return { removeEventListener(type, listener) }
}

public external interface EventListener : JsAny {
    public fun handleEvent(event: Event)
}

/**
 * The AbortSignal interface represents a signal object that allows you to communicate with an asynchronous operation
 * (such as a fetch request) and abort it if required via an AbortController object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class AbortSignal : EventTarget {
    /**
     * The aborted read-only property returns a value that indicates whether the asynchronous operations the signal is
     * communicating with are aborted (true) or not (false).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/aborted)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val aborted: Boolean

    /**
     * The reason read-only property returns a JavaScript value that indicates the abort reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/reason)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val reason: JsAny?

    /**
     * The throwIfAborted() method throws the signal's abort reason if the signal has been aborted; otherwise it does
     * nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/throwIfAborted)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun throwIfAborted()

    /**
     * The abort event of the AbortSignal is fired when the associated request is aborted, i.e., using
     * AbortController.abort().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onabort: ((Event) -> Unit)?

    public companion object {
        /**
         * The AbortSignal.abort() static method returns an AbortSignal that is already set as aborted (and which does
         * not trigger an abort event).
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/abort_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun abort(reason: JsAny? = definedExternally): AbortSignal

        /**
         * The AbortSignal.timeout() static method returns an AbortSignal that will automatically abort after a
         * specified time.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/timeout_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun timeout(milliseconds: Double): AbortSignal

        /**
         * The AbortSignal.any() static method takes an iterable of abort signals and returns an AbortSignal. The
         * returned abort signal is aborted when any of the input iterable abort signals are aborted. The abort reason
         * will be set to the reason of the first signal that is aborted. If any of the given abort signals are already
         * aborted then so will be the returned AbortSignal.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AbortSignal/any_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun getElementById(elementId: String): Element?
}

public external interface DocumentOrShadowRoot : JsAny {
    /**
     * The customElementRegistry read-only property of the Document interface returns the CustomElementRegistry object
     * associated with this document, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/customElementRegistry)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val customElementRegistry: CustomElementRegistry?

    /**
     * The activeElement read-only property of the Document interface returns the Element within the DOM that is
     * receiving keyboard events such as keydown and keyup. This is usually analogous to the focused element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/activeElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val activeElement: Element?

    /**
     * The styleSheets read-only property of the Document interface returns a StyleSheetList of CSSStyleSheet objects,
     * for stylesheets explicitly linked into or embedded in a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/styleSheets)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val styleSheets: StyleSheetList

    /**
     * The adoptedStyleSheets property of the Document interface is used for setting an array of constructed stylesheets
     * to be used by the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptedStyleSheets)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public var adoptedStyleSheets: JsArray<CSSStyleSheet>

    /**
     * The Document.fullscreenElement read-only property returns the Element that is currently being presented in
     * fullscreen mode in this document, or null if fullscreen mode is not currently in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val fullscreenElement: Element?
}

public external interface ParentNode : JsAny {
    /**
     * The read-only children property returns a live HTMLCollection which contains all of the child elements of the
     * document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val children: HTMLCollection

    /**
     * The Document.firstElementChild read-only property returns the document's first child Element, or null if there
     * are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val firstElementChild: Element?

    /**
     * The Document.lastElementChild read-only property returns the document's last child Element, or null if there are
     * no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val lastElementChild: Element?

    /**
     * The Document.childElementCount read-only property returns the number of child elements of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val childElementCount: Int

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun prepend(vararg nodes: Node)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun prepend(vararg nodes: String)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun prepend()

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun append(vararg nodes: Node)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun append(vararg nodes: String)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun append()

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun replaceChildren(vararg nodes: Node)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun replaceChildren(vararg nodes: String)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun replaceChildren()

    /**
     * The moveBefore() method of the Document interface moves a given Node inside the Document DOM node as a direct
     * child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun moveBefore(node: Node, child: Node?)

    /**
     * The Document method querySelector() returns the first Element within the document that matches the specified CSS
     * selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun querySelector(selectors: String): Element?

    /**
     * The Document method querySelectorAll() returns a static (not live) NodeList representing a list of the document's
     * elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun querySelectorAll(selectors: String): NodeList
}

/**
 * NodeList objects are collections of nodes, usually returned by properties such as Node.childNodes and methods such as
 * document.querySelectorAll().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class NodeList : ItemArrayLike<Node> {
    /**
     * Returns a node from a NodeList by index. This method doesn't throw exceptions as long as you provide arguments. A
     * value of null is returned if the index is out of range, and a TypeError is thrown if no argument is provided.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList/item)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun item(index: Int): Node?

    /**
     * The NodeList.length property returns the number of items in a NodeList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NodeList/length)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val length: Int
    // not printed yet: iterable
}

public operator fun NodeList.get(index: Int): Node? = getProperty(this, index)

/**
 * The DOM Node interface is an abstract base class upon which many other DOM API objects are based, thus letting those
 * object types be used similarly and often interchangeably. As an abstract class, there is no such thing as a plain
 * Node object. All objects that implement Node functionality are based on one of its subclasses. Most notable are
 * Document, Element, and DocumentFragment.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class Node : EventTarget {
    /**
     * The read-only nodeType property of a Node interface is an integer that identifies what the node is. It
     * distinguishes different kinds of nodes from each other, such as elements, text, and comments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeType)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val nodeType: Short

    /**
     * The read-only nodeName property of Node returns the name of the current node as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val nodeName: String

    /**
     * The read-only baseURI property of the Node interface returns the absolute base URL of the document containing the
     * node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/baseURI)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val baseURI: String

    /**
     * The read-only isConnected property of the Node interface returns a boolean indicating whether the node is
     * connected (directly or indirectly) to a Document object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isConnected)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val isConnected: Boolean

    /**
     * The read-only ownerDocument property of the Node interface returns the top-level document object of the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/ownerDocument)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val ownerDocument: Document?

    /**
     * The getRootNode() method of the Node interface returns the context object's root, which optionally includes the
     * shadow root if it is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/getRootNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getRootNode(options: GetRootNodeOptions = definedExternally): Node

    /**
     * The read-only parentNode property of the Node interface returns the parent of the specified node in the DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val parentNode: Node?

    /**
     * The read-only parentElement property of Node interface returns the DOM node's parent Element, or null if the node
     * either has no parent, or its parent isn't a DOM Element. Node.parentNode on the other hand returns any kind of
     * parent, regardless of its type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val parentElement: Element?

    /**
     * The hasChildNodes() method of the Node interface returns a boolean value indicating whether the given Node has
     * child nodes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/hasChildNodes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hasChildNodes(): Boolean

    /**
     * The read-only childNodes property of the Node interface returns a live NodeList of child nodes of the given
     * element where the first child node is assigned index 0. Child nodes include elements, text and comments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/childNodes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val childNodes: NodeList

    /**
     * The read-only firstChild property of the Node interface returns the node's first child in the tree, or null if
     * the node has no children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/firstChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val firstChild: Node?

    /**
     * The read-only lastChild property of the Node interface returns the last child of the node, or null if there are
     * no child nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lastChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val lastChild: Node?

    /**
     * The read-only previousSibling property of the Node interface returns the node immediately preceding the specified
     * one in its parent's childNodes list, or null if the specified node is the first in that list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/previousSibling)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val previousSibling: Node?

    /**
     * The read-only nextSibling property of the Node interface returns the node immediately following the specified one
     * in their parent's childNodes, or returns null if the specified node is the last child in the parent element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nextSibling)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val nextSibling: Node?

    /**
     * The nodeValue property of the Node interface returns or sets the value of the current node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeValue)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var nodeValue: String?

    /**
     * The textContent property of the Node interface represents the text content of the node and its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var textContent: String?

    /**
     * The normalize() method of the Node interface puts the specified node and all of its sub-tree into a normalized
     * form. In a normalized sub-tree, no text nodes in the sub-tree are empty and there are no adjacent text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/normalize)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun normalize()

    /**
     * The cloneNode() method of the Node interface returns a duplicate of the node on which this method was called. Its
     * parameter controls if the subtree contained in the node is also cloned or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/cloneNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun cloneNode(subtree: Boolean = definedExternally): Node

    /**
     * The isEqualNode() method of the Node interface tests whether two nodes are equal. Two nodes are equal when they
     * have the same type, defining characteristics (for elements, this would be their ID, number of children, and so
     * forth), its attributes match, and so on. The specific set of data points that must match varies depending on the
     * types of the nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isEqualNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun isEqualNode(otherNode: Node?): Boolean

    /**
     * The isSameNode() method of the Node interface is a legacy alias the for the === strict equality operator. That
     * is, it tests whether two nodes are the same (in other words, whether they reference the same object).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isSameNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun isSameNode(otherNode: Node?): Boolean

    /**
     * The compareDocumentPosition() method of the Node interface reports the position of its argument node relative to
     * the node on which it is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/compareDocumentPosition)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun compareDocumentPosition(other: Node): Short

    /**
     * The contains() method of the Node interface returns a boolean value indicating whether a node is a descendant of
     * a given node, that is the node itself, one of its direct children (childNodes), one of the children's direct
     * children, and so on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/contains)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun contains(other: Node?): Boolean

    /**
     * The lookupPrefix() method of the Node interface returns a string containing the prefix for a given namespace URI,
     * if present, and null if not. When multiple prefixes are possible, the first prefix is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupPrefix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun lookupPrefix(namespace: String?): String?

    /**
     * The lookupNamespaceURI() method of the Node interface takes a prefix as parameter and returns the namespace URI
     * associated with it on the given node if found (and null if not). This method's existence allows Node objects to
     * be passed as a namespace resolver to XPathEvaluator.createExpression() and XPathEvaluator.evaluate().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupNamespaceURI)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun lookupNamespaceURI(prefix: String?): String?

    /**
     * The isDefaultNamespace() method of the Node interface accepts a namespace URI as an argument. It returns a
     * boolean value that is true if the namespace is the default namespace on the given node and false if not. The
     * default namespace can be retrieved with Node.lookupNamespaceURI() by passing null as the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isDefaultNamespace)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun isDefaultNamespace(namespace: String?): Boolean

    /**
     * The insertBefore() method of the Node interface inserts a node before a reference node as a child of a specified
     * parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/insertBefore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun insertBefore(node: Node, child: Node?): Node

    /**
     * The appendChild() method of the Node interface adds a node to the end of the list of children of a specified
     * parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/appendChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun appendChild(node: Node): Node

    /**
     * The replaceChild() method of the Node interface replaces a child node within the given (parent) node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/replaceChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun replaceChild(node: Node, child: Node): Node

    /**
     * The removeChild() method of the Node interface removes a child node from the DOM and returns the removed node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/removeChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

/**
 * The Document interface represents any web page loaded in the browser and serves as an entry point into the web page's
 * content, which is the DOM tree.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class Document : Node, GlobalEventHandlers, NonElementParentNode, DocumentOrShadowRoot, ParentNode, XPathEvaluatorBase, GeometryUtils, ARIANotifyMixin, GeometryNode {
    /**
     * The Document constructor creates a new Document object that is a web page loaded in the browser and serving as an
     * entry point into the page's content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/Document)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The implementation read-only property of the Document interface returns a DOMImplementation object associated
     * with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/implementation)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val implementation: DOMImplementation

    /**
     * The URL read-only property of the Document interface returns the document location as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/URL)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val URL: String

    /**
     * The documentURI read-only property of the Document interface returns the document location as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentURI)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val documentURI: String

    /**
     * The Document.compatMode read-only property indicates whether the document is rendered in Quirks mode or Standards
     * mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/compatMode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val compatMode: String

    /**
     * The Document.characterSet read-only property returns the character encoding of the document that it's currently
     * rendered with.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/characterSet)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val contentType: String

    /**
     * The doctype read-only property of the Document interface is a DocumentType object representing the Document Type
     * Declaration (DTD) associated with the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/doctype)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val doctype: DocumentType?

    /**
     * The documentElement read-only property of the Document interface returns the Element that is the root element of
     * the document (for example, the &lt;html&gt; element for HTML documents).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/documentElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val documentElement: Element?

    /**
     * The getElementsByTagName method of Document interface returns an HTMLCollection of elements with the given tag
     * name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByTagName(qualifiedName: String): HTMLCollection

    /**
     * Returns a list of elements with the given tag name belonging to the given namespace. The complete document is
     * searched, including the root node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByTagNameNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection

    /**
     * The getElementsByClassName method of Document interface returns an array-like object of all child elements which
     * have all of the given class name(s).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByClassName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByClassName(classNames: String): HTMLCollection

    /**
     * The createElement() method of the Document interface creates a new HTMLElement that has the specified localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createElement(localName: String, options: String): Element

    /**
     * The createElement() method of the Document interface creates a new HTMLElement that has the specified localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createElement(localName: String, options: ElementCreationOptions): Element

    /**
     * The createElement() method of the Document interface creates a new HTMLElement that has the specified localName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createElement(localName: String): Element

    /**
     * The createElementNS() method of the Document interface creates a new element with the specified namespace URI and
     * qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElementNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createElementNS(namespace: String?, qualifiedName: String, options: String): Element

    /**
     * The createElementNS() method of the Document interface creates a new element with the specified namespace URI and
     * qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElementNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createElementNS(namespace: String?, qualifiedName: String, options: ElementCreationOptions): Element

    /**
     * The createElementNS() method of the Document interface creates a new element with the specified namespace URI and
     * qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createElementNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createElementNS(namespace: String?, qualifiedName: String): Element

    /**
     * Creates a new empty DocumentFragment into which DOM nodes can be added to build an offscreen DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createDocumentFragment)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createDocumentFragment(): DocumentFragment

    /**
     * Creates a new Text node. This method can be used to escape HTML characters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTextNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createTextNode(data: String): Text

    /**
     * createCDATASection() creates a new CDATA section node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createCDATASection)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createCDATASection(data: String): CDATASection

    /**
     * createComment() creates a new comment node, and returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createComment)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createComment(data: String): Comment

    /**
     * The createProcessingInstruction() method of the Document interface creates a new ProcessingInstruction object and
     * returns it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createProcessingInstruction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createProcessingInstruction(target: String, data: String): ProcessingInstruction

    /**
     * The importNode() method of the Document interface creates a copy of a Node or DocumentFragment from another
     * document, to be inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importNode(node: Node, options: Boolean): Node

    /**
     * The importNode() method of the Document interface creates a copy of a Node or DocumentFragment from another
     * document, to be inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importNode(node: Node, options: ImportNodeOptions): Node

    /**
     * The importNode() method of the Document interface creates a copy of a Node or DocumentFragment from another
     * document, to be inserted into the current document later.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/importNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importNode(node: Node): Node

    /**
     * Document.adoptNode() transfers a node from another document into the method's document. The adopted node and its
     * subtree are removed from their original document (if any), and their ownerDocument is changed to the current
     * document. The node can then be inserted into the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun adoptNode(node: Node): Node

    /**
     * The createAttribute() method of the Document interface creates a new attribute node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttribute)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createAttribute(localName: String): Attr

    /**
     * The createAttributeNS() method of the Document interface creates a new attribute node with the specified
     * namespace URI and qualified name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createAttributeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createAttributeNS(namespace: String?, qualifiedName: String): Attr

    /**
     * Creates an event of the type specified. The returned object should be first initialized and can then be passed to
     * EventTarget.dispatchEvent.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createEvent(`interface`: String): Event

    /**
     * The Document.createRange() method returns a new Range object whose start and end are offset 0 of the Document
     * object on which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createRange)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createRange(): Range

    /**
     * The Document.createNodeIterator() method returns a new NodeIterator object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): NodeIterator

    /**
     * The Document.createNodeIterator() method returns a new NodeIterator object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNodeIterator)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: (Node) -> Short): NodeIterator

    /**
     * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTreeWalker)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): TreeWalker

    /**
     * The Document.createTreeWalker() creator method returns a newly created TreeWalker object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createTreeWalker)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: (Node) -> Short): TreeWalker

    /**
     * The read-only location property of the Document interface returns a Location object, which contains information
     * about the URL of the document and provides methods for changing that URL and loading another URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/location)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val location: Location?

    /**
     * The domain property of the Document interface gets/sets the domain portion of the origin of the current document,
     * as used by the same-origin policy.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/domain)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var domain: String

    /**
     * The referrer read-only property of the Document interface returns the URI of the page that linked to this page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/referrer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val referrer: String

    /**
     * The Document property cookie lets you read and write cookies associated with the document. It serves as a getter
     * and setter for the actual values of the cookies.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/cookie)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var cookie: String

    /**
     * The lastModified read-only property of the Document interface returns a string containing the date and local time
     * on which the current document was last modified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastModified)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val lastModified: String

    /**
     * The readyState read-only property of the Document interface describes the loading state of the document. When the
     * value of this property changes, a readystatechange event fires on the document object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val readyState: DocumentReadyState

    /**
     * The document.title property gets or sets the current title of the document. When present, it defaults to the
     * value of the &lt;title&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/title)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var title: String

    /**
     * The Document.dir property is a string representing the directionality of the text of the document, whether left
     * to right (default) or right to left. Possible values are 'rtl', right to left, and 'ltr', left to right.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/dir)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var dir: String

    /**
     * The Document.body property represents the &lt;body&gt; or &lt;frameset&gt; node of the current document, or null
     * if no such element exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/body)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var body: HTMLElement?

    /**
     * The head read-only property of the Document interface returns the &lt;head&gt; element of the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/head)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val head: HTMLHeadElement?

    /**
     * The images read-only property of the Document interface returns a collection of the images in the current HTML
     * document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/images)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val images: HTMLCollection

    /**
     * The embeds read-only property of the Document interface returns a list of the embedded &lt;embed&gt; elements
     * within the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/embeds)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val embeds: HTMLCollection

    /**
     * The plugins read-only property of the Document interface returns an HTMLCollection object containing one or more
     * HTMLEmbedElements representing the &lt;embed&gt; elements in the current document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/plugins)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val plugins: HTMLCollection

    /**
     * The links read-only property of the Document interface returns a collection of all &lt;area&gt; elements and
     * &lt;a&gt; elements in a document with a value for the href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/links)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val links: HTMLCollection

    /**
     * The forms read-only property of the Document interface returns an HTMLCollection listing all the &lt;form&gt;
     * elements contained in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/forms)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val forms: HTMLCollection

    /**
     * The scripts read-only property of the Document interface returns a list of the &lt;script&gt; elements in the
     * document. The returned object is an HTMLCollection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scripts)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val scripts: HTMLCollection

    /**
     * The getElementsByName() method of the Document object returns a NodeList Collection of elements with a given name
     * attribute in the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementsByName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByName(elementName: String): NodeList

    /**
     * The currentScript read-only property of the Document interface returns the &lt;script&gt; element whose script is
     * currently being processed and isn't a JavaScript module. (For modules use import.meta instead.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/currentScript)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentScript: HTMLOrSVGScriptElement?

    /**
     * The Document.open() method opens a document for writing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/open)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun open(unused1: String = definedExternally, unused2: String = definedExternally): Document

    /**
     * The Document.open() method opens a document for writing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/open)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun open(url: String, name: String, features: String): Window?

    /**
     * The Document.close() method finishes writing to a document, opened with Document.open().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/close)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun close()

    /**
     * The write() method of the Document interface writes text in one or more TrustedHTML or string parameters to a
     * document stream opened by document.open().
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/write)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun write(vararg text: String)

    /**
     * The writeln() method of the Document interface writes text in one or more TrustedHTML or string parameters to a
     * document stream opened by document.open(), followed by a newline character.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/writeln)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun writeln(vararg text: String)

    /**
     * In browsers, document.defaultView returns the window object associated with a document, or null if none is
     * available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/defaultView)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val defaultView: Window?

    /**
     * The hasFocus() method of the Document interface returns a boolean value indicating whether the document or any
     * element inside the document has focus. This method can be used to determine whether the active element in a
     * document has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hasFocus)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hasFocus(): Boolean

    /**
     * document.designMode controls whether the entire document is editable. Valid values are "on" and "off". According
     * to the specification, this property is meant to default to "off". Firefox follows this standard. The earlier
     * versions of Chrome and IE default to "inherit". Starting in Chrome 43, the default is "off" and "inherit" is no
     * longer supported. In IE6-10, the value is capitalized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/designMode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun execCommand(commandId: String, showUI: Boolean = definedExternally, value: String = definedExternally): Boolean

    /**
     * The Document.queryCommandEnabled() method reports whether or not the specified editor command is enabled by the
     * browser.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/queryCommandEnabled)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun queryCommandState(commandId: String): Boolean

    /**
     * The Document.queryCommandSupported() method reports whether or not the specified editor command is supported by
     * the browser.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/queryCommandSupported)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun queryCommandSupported(commandId: String): Boolean
    public open fun queryCommandValue(commandId: String): String

    /**
     * The Document.hidden read-only property returns a Boolean value indicating if the page is considered hidden or
     * not. This can be used to check whether the document is in the background or in a minimized window, or is
     * otherwise not visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/hidden)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val hidden: Boolean

    /**
     * The Document.visibilityState read-only property returns the visibility of the document. It can be used to check
     * whether the document is in the background or in a minimized window, or is otherwise not visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val visibilityState: DocumentVisibilityState

    /**
     * The readystatechange event is fired when the readyState attribute of a document has changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readystatechange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onreadystatechange: ((Event) -> Unit)?

    /**
     * The visibilitychange event is fired at the document when its visibility status changes — for example, when the
     * user switches browser tabs, navigates to a new page, minimizes or closes the browser, or on mobile, switches to a
     * different app.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilitychange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onvisibilitychange: ((Event) -> Unit)?

    /**
     * fgColor gets/sets the foreground color, or text color, of the current document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fgColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var fgColor: String

    /**
     * The Document.linkColor property gets/sets the color of links within the document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/linkColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var linkColor: String

    /**
     * The Document.vlinkColor property gets/sets the color of links that the user has visited in the document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/vlinkColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var vlinkColor: String

    /**
     * Returns or sets the color of an active link in the document body. A link is active during the time between
     * mousedown and mouseup events.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/alinkColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var alinkColor: String

    /**
     * The deprecated bgColor property gets or sets the background color of the current document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/bgColor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var bgColor: String

    /**
     * The anchors read-only property of the Document interface returns a list of all of the anchors in the document.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/anchors)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val applets: HTMLCollection

    /**
     * The Document.clear() method does nothing, but doesn't raise any error.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/clear)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val all: HTMLAllCollection

    /**
     * The elementFromPoint() method, available on the Document object, returns the topmost Element at the specified
     * coordinates (relative to the viewport).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/elementFromPoint)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun elementFromPoint(x: Double, y: Double): Element?

    /**
     * The elementsFromPoint() method of the Document interface returns an array of all elements at the specified
     * coordinates (relative to the viewport). The elements are ordered from the topmost to the bottommost box of the
     * viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/elementsFromPoint)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun elementsFromPoint(x: Double, y: Double): JsArray<Element>

    /**
     * The caretPositionFromPoint() method of the Document interface returns a CaretPosition object, containing the DOM
     * node, along with the caret and caret's character offset within that node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/caretPositionFromPoint)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun caretPositionFromPoint(x: Double, y: Double, options: CaretPositionFromPointOptions = definedExternally): CaretPosition?

    /**
     * The scrollingElement read-only property of the Document interface returns a reference to the Element that scrolls
     * the document. In standards mode, this is the root element of the document, document.documentElement.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollingElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val rootElement: SVGSVGElement?

    /**
     * The read-only fullscreenEnabled property on the Document interface indicates whether or not fullscreen mode is
     * available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenEnabled)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val fullscreenEnabled: Boolean

    /**
     * The obsolete Document interface's fullscreen read-only property reports whether or not the document is currently
     * displaying content in fullscreen mode.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreen)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val fullscreen: Boolean

    /**
     * The Document method exitFullscreen() requests that the element on this document which is currently being
     * presented in fullscreen mode be taken out of fullscreen mode, restoring the previous state of the screen. This
     * usually reverses the effects of a previous call to Element.requestFullscreen().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/exitFullscreen)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun exitFullscreen(): Promise<JsAny?>

    /**
     * The fullscreenchange event is fired immediately after the browser switches into or out of fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenchange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onfullscreenchange: ((Event) -> Unit)?

    /**
     * The fullscreenerror event is fired when the browser cannot switch to fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenerror_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onfullscreenerror: ((Event) -> Unit)?
    override var onabort: ((Event) -> Unit)?

    /**
     * The auxclick event is fired at an Element when a non-primary pointing device button (any mouse button other than
     * the primary—usually leftmost—button) has been pressed and released both within the same element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/auxclick_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onauxclick: ((PointerEvent) -> Unit)?

    /**
     * The DOM beforeinput event fires when the value of an &lt;input&gt; or &lt;textarea&gt; element is about to be
     * modified. But in contrast to the input event, it does not fire on the &lt;select&gt; element. The event also
     * applies to elements with contenteditable enabled, and to any element when designMode is turned on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforeinput_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onbeforeinput: ((InputEvent) -> Unit)?

    /**
     * An element receives a beforematch event when it is in the hidden until found state and the browser is about to
     * reveal its content because the user has found the content through the "find in page" feature or through fragment
     * navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/beforematch_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onbeforematch: ((Event) -> Unit)?

    /**
     * The beforetoggle event of the HTMLElement interface fires on a popover or &lt;dialog&gt; element just before it
     * is shown or hidden.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/beforetoggle_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onbeforetoggle: ((ToggleEvent) -> Unit)?

    /**
     * The blur event fires when an element has lost focus. The event does not bubble, but the related focusout event
     * that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/blur_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onchange: ((Event) -> Unit)?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/click_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onclick: ((PointerEvent) -> Unit)?
    override var onclose: ((Event) -> Unit)?

    /**
     * The command event of the HTMLElement interface fires on an element that is controlled via a button with valid
     * commandForElement and command values, whenever the button is interacted with (e.g., it is clicked).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/command_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncommand: ((CommandEvent) -> Unit)?
    override var oncontextlost: ((Event) -> Unit)?

    /**
     * The contextmenu event fires when the user attempts to open a context menu. This event is typically triggered by
     * clicking the right mouse button, or by pressing the context menu key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/contextmenu_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncontextmenu: ((PointerEvent) -> Unit)?
    override var oncontextrestored: ((Event) -> Unit)?

    /**
     * The copy event of the Clipboard API fires when the user initiates a copy action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/copy_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncopy: ((ClipboardEvent) -> Unit)?
    override var oncuechange: ((Event) -> Unit)?

    /**
     * The cut event of the Clipboard API is fired when the user has initiated a "cut" action through the browser's user
     * interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/cut_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oncut: ((ClipboardEvent) -> Unit)?

    /**
     * The dblclick event fires when a pointing device button (such as a mouse's primary button) is double-clicked; that
     * is, when it's rapidly clicked twice on a single element within a very short span of time.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/dblclick_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondblclick: ((MouseEvent) -> Unit)?

    /**
     * The drag event is fired repeatedly as an element or text selection is being dragged by the user. The firing
     * frequency depends on the browser, operating system, and pointer movement; do not rely on a fixed interval.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drag_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondrag: ((DragEvent) -> Unit)?

    /**
     * The dragend event is fired when a drag operation ends (by releasing a mouse button or hitting the escape key).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragend: ((DragEvent) -> Unit)?

    /**
     * The dragenter event is fired when a dragged element or text selection enters a valid drop target. The target
     * object is the immediate user selection (the element directly indicated by the user as the drop target), or the
     * &lt;body&gt; element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragenter: ((DragEvent) -> Unit)?

    /**
     * The dragleave event is fired when a dragged element or text selection leaves a valid drop target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragleave: ((DragEvent) -> Unit)?

    /**
     * The dragover event is fired repeatedly when an element or text selection is being dragged over a potential drop
     * target.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragover: ((DragEvent) -> Unit)?

    /**
     * The dragstart event is fired when the user starts dragging an element or text selection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/dragstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ondragstart: ((DragEvent) -> Unit)?

    /**
     * The drop event is fired when an element or text selection is dropped on a valid drop target. To ensure that the
     * drop event always fires as expected, you should always include a preventDefault() call in the part of your code
     * which handles the dragover event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/drop_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?

    /**
     * The focus event fires when an element has received focus. The event does not bubble, but the related focusin
     * event that follows does bubble.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/focus_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onfocus: ((FocusEvent) -> Unit)?
    override var onformdata: ((FormDataEvent) -> Unit)?

    /**
     * The input event fires when the value of an &lt;input&gt;, &lt;select&gt;, or &lt;textarea&gt; element has been
     * changed as a direct result of a user action (such as typing in a textbox or checking a checkbox).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/input_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var oninput: ((InputEvent) -> Unit)?
    override var oninvalid: ((Event) -> Unit)?

    /**
     * The keydown event is fired when a key is pressed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keydown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onkeypress: ((KeyboardEvent) -> Unit)?

    /**
     * The keyup event is fired when a key is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/keyup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onkeyup: ((KeyboardEvent) -> Unit)?

    /**
     * The load event fires for elements containing a resource when the resource has successfully loaded. Currently, the
     * list of supported HTML elements are: &lt;embed&gt;, &lt;iframe&gt;, &lt;img&gt;, &lt;link&gt;, &lt;object&gt;,
     * &lt;script&gt;, &lt;style&gt;, and &lt;track&gt;.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLElement/load_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmousedown: ((MouseEvent) -> Unit)?

    /**
     * The mouseenter event is fired at an Element when a pointing device (usually a mouse) is initially moved so that
     * its hotspot is within the element at which the event was fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseenter: ((MouseEvent) -> Unit)?

    /**
     * The mouseleave event is fired at an Element when the cursor of a pointing device (usually a mouse) is moved out
     * of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseleave: ((MouseEvent) -> Unit)?

    /**
     * The mousemove event is fired at an element when a pointing device (usually a mouse) is moved while the cursor's
     * hotspot is inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mousemove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmousemove: ((MouseEvent) -> Unit)?

    /**
     * The mouseout event is fired at an Element when a pointing device (usually a mouse) is used to move the cursor so
     * that it is no longer contained within the element or one of its children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseout_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseout: ((MouseEvent) -> Unit)?

    /**
     * The mouseover event is fired at an Element when a pointing device (such as a mouse or trackpad) is used to move
     * the cursor onto the element or one of its child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseover: ((MouseEvent) -> Unit)?

    /**
     * The mouseup event is fired at an Element when a button on a pointing device (such as a mouse or trackpad) is
     * released while the pointer is located inside it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/mouseup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onmouseup: ((MouseEvent) -> Unit)?

    /**
     * The paste event of the Clipboard API is fired when the user has initiated a "paste" action through the browser's
     * user interface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/paste_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onresize: ((Event) -> Unit)?

    /**
     * The scroll event fires when the document view has been scrolled. To detect when scrolling has completed, see the
     * scrollend event of Document. For element scrolling, see scroll event of Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scroll_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onscroll: ((Event) -> Unit)?

    /**
     * The scrollend event fires when the document view has completed scrolling. Scrolling is considered completed when
     * the scroll position has no more pending updates and the user has completed their gesture.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/scrollend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onscrollend: ((Event) -> Unit)?

    /**
     * The securitypolicyviolation event is fired when a Content Security Policy is violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/securitypolicyviolation_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onwheel: ((WheelEvent) -> Unit)?

    /**
     * The touchstart event is fired when one or more touch points are placed on the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchstart: ((TouchEvent) -> Unit)?

    /**
     * The touchend event fires when one or more touch points are removed from the touch surface. Remember that it is
     * possible to get a touchcancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchend: ((TouchEvent) -> Unit)?

    /**
     * The touchmove event is fired when one or more touch points are moved along the touch surface.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchmove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchmove: ((TouchEvent) -> Unit)?

    /**
     * The touchcancel event is fired when one or more touch points have been disrupted in an implementation-specific
     * manner.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/touchcancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ontouchcancel: ((TouchEvent) -> Unit)?

    /**
     * The pointerover event is fired when a pointing device is moved into an element's hit test boundaries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerover_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerover: ((PointerEvent) -> Unit)?

    /**
     * The pointerenter event fires when a pointing device is moved into the hit test boundaries of an element or one of
     * its descendants, including as a result of a pointerdown event from a device that does not support hover (see
     * pointerdown). Otherwise, pointerenter works the same as mouseenter, and are dispatched at the same time. They are
     * also dispatched at the same time as mouseover and pointerover events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerenter_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerenter: ((PointerEvent) -> Unit)?

    /**
     * The pointerdown event is fired when a pointer becomes active. For mouse, it is fired when the device transitions
     * from no buttons pressed to at least one button pressed. For touch, it is fired when physical contact is made with
     * the digitizer. For pen, it is fired when the stylus makes physical contact with the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerdown_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerdown: ((PointerEvent) -> Unit)?

    /**
     * The pointermove event is fired when a pointer changes coordinates, and the pointer has not been canceled by a
     * browser touch-action. The event is also fired when a pointer changes any of its other properties, provided the
     * change doesn't produce some other pointer event. This includes any change to pressure, tangential pressure, tilt,
     * twist, contact geometry (width and height), or chorded buttons.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointermove_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointermove: ((PointerEvent) -> Unit)?

    /**
     * The pointerrawupdate event is fired when a pointer changes any properties that don't fire pointerdown or
     * pointerup events. See pointermove for a list of these properties.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerrawupdate_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerrawupdate: ((PointerEvent) -> Unit)?

    /**
     * The pointerup event is fired when a pointer is no longer active. Remember that it is possible to get a
     * pointercancel event instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerup_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerup: ((PointerEvent) -> Unit)?

    /**
     * The pointercancel event is fired when the browser determines that there are unlikely to be any more pointer
     * events, or if after the pointerdown event is fired, the pointer is then used to manipulate the viewport by
     * panning, zooming, or scrolling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointercancel_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointercancel: ((PointerEvent) -> Unit)?

    /**
     * The pointerout event is fired for several reasons including: pointing device is moved out of the hit test
     * boundaries of an element; firing the pointerup event for a device that does not support hover (see pointerup);
     * after firing the pointercancel event (see pointercancel); when a pen stylus leaves the hover range detectable by
     * the digitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerout_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerout: ((PointerEvent) -> Unit)?

    /**
     * The pointerleave event is fired when a pointing device is moved out of the hit test boundaries of an element. For
     * pen devices, this event is fired when the stylus leaves the hover range detectable by the digitizer. Otherwise,
     * pointerleave works the same as mouseleave, and are dispatched at the same time. They are also dispatched at the
     * same time as mouseout and pointerout events, if appropriate.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/pointerleave_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onpointerleave: ((PointerEvent) -> Unit)?

    /**
     * The gotpointercapture event is fired when an element captures a pointer using setPointerCapture().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/gotpointercapture_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var ongotpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The lostpointercapture event is fired when a captured pointer is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/lostpointercapture_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var onlostpointercapture: ((PointerEvent) -> Unit)?

    /**
     * The getElementById() method of the Document interface returns an Element object representing the element whose id
     * property matches the specified string. Since element IDs are required to be unique if specified, they're a useful
     * way to get access to a specific element quickly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/getElementById)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun getElementById(elementId: String): Element?

    /**
     * The customElementRegistry read-only property of the Document interface returns the CustomElementRegistry object
     * associated with this document, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/customElementRegistry)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val customElementRegistry: CustomElementRegistry?

    /**
     * The activeElement read-only property of the Document interface returns the Element within the DOM that is
     * receiving keyboard events such as keydown and keyup. This is usually analogous to the focused element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/activeElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val activeElement: Element?

    /**
     * The styleSheets read-only property of the Document interface returns a StyleSheetList of CSSStyleSheet objects,
     * for stylesheets explicitly linked into or embedded in a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/styleSheets)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val styleSheets: StyleSheetList

    /**
     * The adoptedStyleSheets property of the Document interface is used for setting an array of constructed stylesheets
     * to be used by the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/adoptedStyleSheets)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override var adoptedStyleSheets: JsArray<CSSStyleSheet>

    /**
     * The Document.fullscreenElement read-only property returns the Element that is currently being presented in
     * fullscreen mode in this document, or null if fullscreen mode is not currently in use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fullscreenElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val fullscreenElement: Element?

    /**
     * The read-only children property returns a live HTMLCollection which contains all of the child elements of the
     * document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val children: HTMLCollection

    /**
     * The Document.firstElementChild read-only property returns the document's first child Element, or null if there
     * are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val firstElementChild: Element?

    /**
     * The Document.lastElementChild read-only property returns the document's last child Element, or null if there are
     * no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val lastElementChild: Element?

    /**
     * The Document.childElementCount read-only property returns the number of child elements of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val childElementCount: Int

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun prepend(vararg nodes: Node)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun prepend(vararg nodes: String)

    /**
     * The Document.prepend() method inserts a set of Node objects or strings before the first child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun prepend()

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun append(vararg nodes: Node)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun append(vararg nodes: String)

    /**
     * The Document.append() method inserts a set of Node objects or strings after the last child of the document.
     * Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun append()

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceChildren(vararg nodes: Node)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceChildren(vararg nodes: String)

    /**
     * The Document.replaceChildren() method replaces the existing children of a Document with a specified new set of
     * children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun replaceChildren()

    /**
     * The moveBefore() method of the Document interface moves a given Node inside the Document DOM node as a direct
     * child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun moveBefore(node: Node, child: Node?)

    /**
     * The Document method querySelector() returns the first Element within the document that matches the specified CSS
     * selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun querySelector(selectors: String): Element?

    /**
     * The Document method querySelectorAll() returns a static (not live) NodeList representing a list of the document's
     * elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun querySelectorAll(selectors: String): NodeList

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun createExpression(expression: String, resolver: XPathNSResolver?): XPathExpression

    /**
     * This method compiles an XPathExpression which can then be used for (repeated) evaluations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createExpression)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression

    /**
     * The createNSResolver() method of the Document interface used to create a custom XPathNSResolver object. It now
     * returns the input as-is and is only kept for compatibility reasons.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/createNSResolver)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun createNSResolver(nodeResolver: Node): Node

    /**
     * The evaluate() method of the Document interface selects elements based on the XPath expression given in
     * parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver?, type: Short, result: XPathResult?): XPathResult

    /**
     * The evaluate() method of the Document interface selects elements based on the XPath expression given in
     * parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/evaluate)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun parseHTMLUnsafe(html: String, options: ParseHTMLUnsafeOptions = definedExternally): Document

        /**
         * The parseHTML() static method of the Document object provides an XSS-safe method to parse and sanitize a
         * string of HTML in order to create a new Document instance.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/parseHTML_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun parseHTML(html: String, options: SetHTMLOptions = definedExternally): Document
    }
}

public operator fun Document.get(name: String): JsAny? = getProperty(this, name)

/**
 * Element is the most general base class from which all element objects (i.e., objects that represent elements) in a
 * Document inherit. It only has methods and properties common to all kinds of elements. More specific classes inherit
 * from Element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class Element : Node, ParentNode, NonDocumentTypeChildNode, ChildNode, Slottable, GeometryUtils, ARIAMixin, ARIANotifyMixin, UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrText, UnionElementOrProcessingInstruction {
    /**
     * The Element.namespaceURI read-only property returns the namespace URI of the element, or null if the element is
     * not in a namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/namespaceURI)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val namespaceURI: String?

    /**
     * The Element.prefix read-only property returns the namespace prefix of the specified element, or null if no prefix
     * is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/prefix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val prefix: String?

    /**
     * The Element.localName read-only property returns the local part of the qualified name of an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/localName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val localName: String

    /**
     * The tagName read-only property of the Element interface returns the tag name of the element on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/tagName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val tagName: String

    /**
     * The id property of the Element interface reflects the element's id content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/id)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var id: String

    /**
     * The className property of the Element interface reflects the element's class content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/className)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var className: String

    /**
     * The read-only classList property of the Element interface contains a live DOMTokenList collection representing
     * the class attribute of the element. This can then be used to manipulate the class list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/classList)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val classList: DOMTokenList

    /**
     * The slot property of the Element interface returns the name of the shadow DOM slot the element is inserted in. It
     * reflects the element's slot content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/slot)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var slot: String

    /**
     * The hasAttributes() method of the Element interface returns a boolean value indicating whether the current
     * element has any attributes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hasAttributes(): Boolean

    /**
     * The attributes read-only property of the Element interface returns a live collection of all attribute nodes
     * registered to the specified node. It is a NamedNodeMap, not an Array, so it has no Array methods and the Attr
     * nodes' indexes may differ among browsers. To be more specific, attributes is a key/value pair of strings that
     * represents any information regarding that attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attributes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val attributes: NamedNodeMap

    /**
     * The getAttributeNames() method of the Element interface returns the attribute names of the element as an Array of
     * strings. If the element has no attributes it returns an empty array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNames)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAttributeNames(): JsArray<JsString>

    /**
     * The getAttribute() method of the Element interface returns the string value of the specified attribute of the
     * specified element. It returns null if the element doesn't have an attribute with the given name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttribute)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAttribute(qualifiedName: String): String?

    /**
     * The getAttributeNS() method of the Element interface returns the string value of the specified namespaced
     * attribute of the specified element. It returns null if the element doesn't have an attribute with the given name
     * in the namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAttributeNS(namespace: String?, localName: String): String?

    /**
     * The setAttribute() method of the Element interface sets the value of an attribute on the specified element. If
     * the attribute already exists, the value is updated; otherwise a new attribute is added with the specified name
     * and value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttribute)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setAttribute(qualifiedName: String, value: String)

    /**
     * The setAttributeNS() method of the Element interface adds a new attribute or changes the value of an attribute
     * with the given namespace and name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)

    /**
     * The Element method removeAttribute() removes the attribute with the specified name from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttribute)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeAttribute(qualifiedName: String)

    /**
     * The removeAttributeNS() method of the Element interface removes the specified attribute with the specified
     * namespace from an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeAttributeNS(namespace: String?, localName: String)

    /**
     * The toggleAttribute() method of the Element interface toggles a Boolean attribute on the given element, removing
     * it if present and adding it if not present.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/toggleAttribute)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun toggleAttribute(qualifiedName: String, force: Boolean = definedExternally): Boolean

    /**
     * The Element.hasAttribute() method returns a Boolean value indicating whether the specified element has the
     * specified attribute or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttribute)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hasAttribute(qualifiedName: String): Boolean

    /**
     * The hasAttributeNS() method of the Element interface returns a boolean value indicating whether the current
     * element has the specified attribute with the specified namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasAttributeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hasAttributeNS(namespace: String?, localName: String): Boolean

    /**
     * The getAttributeNode() method of the Element interface returns the specified attribute of the specified element,
     * as an Attr node. It returns null if the element doesn't have an attribute with the given name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAttributeNode(qualifiedName: String): Attr?

    /**
     * The getAttributeNodeNS() method of the Element interface returns the specified namespaced attribute of the
     * specified element, as an Attr node. It returns null if the element doesn't have an attribute with the given name
     * in the namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getAttributeNodeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAttributeNodeNS(namespace: String?, localName: String): Attr?

    /**
     * The setAttributeNode() method of the Element interface adds a new Attr node to the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setAttributeNode(attr: Attr): Attr?

    /**
     * The setAttributeNodeNS() method of the Element interface adds a new namespaced Attr node to an element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setAttributeNodeNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setAttributeNodeNS(attr: Attr): Attr?

    /**
     * The removeAttributeNode() method of the Element interface removes the specified Attr node from the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/removeAttributeNode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun removeAttributeNode(attr: Attr): Attr

    /**
     * The attachShadow() method of the Element interface attaches a shadow DOM tree to the specified element and
     * returns a reference to its ShadowRoot.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/attachShadow)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun attachShadow(init: ShadowRootInit): ShadowRoot

    /**
     * The Element.shadowRoot read-only property represents the shadow root hosted by the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/shadowRoot)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val shadowRoot: ShadowRoot?

    /**
     * The customElementRegistry read-only property of the Element interface returns the CustomElementRegistry object
     * associated with this element, or null if one has not been set.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/customElementRegistry)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val customElementRegistry: CustomElementRegistry?

    /**
     * The closest() method of the Element interface traverses the element and its parents (heading toward the document
     * root) until it finds a node that matches the specified CSS selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/closest)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun closest(selectors: String): Element?

    /**
     * The matches() method of the Element interface tests whether the element would be selected by the specified CSS
     * selector.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/matches)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun matches(selectors: String): Boolean
    public open fun webkitMatchesSelector(selectors: String): Boolean

    /**
     * The Element.getElementsByTagName() method returns a live HTMLCollection of elements with the given tag name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByTagName(qualifiedName: String): HTMLCollection

    /**
     * The Element.getElementsByTagNameNS() method returns a live HTMLCollection of elements with the given tag name
     * belonging to the given namespace. It is similar to Document.getElementsByTagNameNS, except that its search is
     * restricted to descendants of the specified element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByTagNameNS)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection

    /**
     * The Element method getElementsByClassName() returns a live HTMLCollection which contains every descendant element
     * which has the specified class name or names.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getElementsByClassName)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getElementsByClassName(classNames: String): HTMLCollection

    /**
     * The insertAdjacentElement() method of the Element interface inserts a given element node at a given position
     * relative to the element it is invoked upon.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentElement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun insertAdjacentElement(where: String, element: Element): Element?

    /**
     * The insertAdjacentText() method of the Element interface, given a relative position and a string, inserts a new
     * text node at the given position relative to the element it is called from.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun insertAdjacentText(where: String, data: String)

    /**
     * The setHTML() method of the Element interface provides an XSS-safe method to parse and sanitize a string of HTML
     * and insert it into the DOM as a subtree of the element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setHTML)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public open fun appendHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    public open fun prependHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)

    /**
     * The getHTML() method of the Element interface is used to serialize an element's DOM to an HTML string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getHTML)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getHTML(options: GetHTMLOptions = definedExternally): String

    /**
     * The innerHTML property of the Element interface gets or sets the HTML or XML markup contained within the element,
     * omitting any shadow roots in both cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/innerHTML)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var innerHTML: String

    /**
     * The outerHTML attribute of the Element interface gets or sets the HTML or XML markup of the element and its
     * descendants, omitting any shadow roots in both cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/outerHTML)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var outerHTML: String

    /**
     * The insertAdjacentHTML() method of the Element interface parses the specified input as HTML or XML and inserts
     * the resulting nodes into the DOM tree at a specified position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/insertAdjacentHTML)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun insertAdjacentHTML(position: String, string: String)

    /**
     * The getClientRects() method of the Element interface returns a collection of DOMRect objects that indicate the
     * bounding rectangles for each CSS border box in a client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getClientRects)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getClientRects(): DOMRectList

    /**
     * The Element.getBoundingClientRect() method returns a DOMRect object providing information about the size of an
     * element and its position relative to the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/getBoundingClientRect)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getBoundingClientRect(): DOMRect

    /**
     * The checkVisibility() method of the Element interface checks whether the element is potentially visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/checkVisibility)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun checkVisibility(options: CheckVisibilityOptions = definedExternally): Boolean

    /**
     * The scrollIntoView() method of the Element interface scrolls the element's ancestor containers such that the
     * element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollIntoView(arg: Boolean): Promise<ScrollResult>

    /**
     * The scrollIntoView() method of the Element interface scrolls the element's ancestor containers such that the
     * element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollIntoView(arg: ScrollIntoViewOptions): Promise<ScrollResult>

    /**
     * The scrollIntoView() method of the Element interface scrolls the element's ancestor containers such that the
     * element on which scrollIntoView() is called is visible to the user.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollIntoView)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollIntoView(): Promise<ScrollResult>

    /**
     * The scroll() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scroll(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scroll() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scroll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scroll(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollTo(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scrollTo() method of the Element interface scrolls to a particular set of coordinates inside a given element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTo)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollTo(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollBy() method of the Element interface scrolls an element by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollBy(options: ScrollToOptions = definedExternally): Promise<ScrollResult>

    /**
     * The scrollBy() method of the Element interface scrolls an element by the given amount.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollBy)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun scrollBy(x: Double, y: Double): Promise<ScrollResult>

    /**
     * The scrollTop property of the Element interface gets or sets the number of pixels by which an element's content
     * is scrolled from its top edge. This value is subpixel precise in modern browsers, meaning that it isn't
     * necessarily a whole number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollTop)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var scrollTop: Double

    /**
     * The scrollLeft property of the Element interface gets or sets the number of pixels by which an element's content
     * is scrolled from its left edge. This value is subpixel precise in modern browsers, meaning that it isn't
     * necessarily a whole number.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollLeft)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var scrollLeft: Double

    /**
     * The scrollWidth read-only property of the Element interface is a measurement of the width of an element's
     * content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollWidth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val scrollWidth: Int

    /**
     * The scrollHeight read-only property of the Element interface is a measurement of the height of an element's
     * content, including content not visible on the screen due to overflow.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/scrollHeight)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val scrollHeight: Int

    /**
     * The clientTop read-only property of the Element interface returns the width of the top border of an element in
     * pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientTop)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clientTop: Int

    /**
     * The clientLeft read-only property of the Element interface returns the width of the left border of an element in
     * pixels. It includes the width of the vertical scrollbar if the text direction of the element is right-to-left and
     * if there is an overflow causing a left vertical scrollbar to be rendered. clientLeft does not include the left
     * margin or the left padding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientLeft)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clientLeft: Int

    /**
     * The clientWidth read-only property of the Element interface is zero for inline elements and elements with no CSS;
     * otherwise, it's the inner width of an element in pixels. It includes padding but excludes borders, margins, and
     * vertical scrollbars (if present).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientWidth)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clientWidth: Int

    /**
     * The clientHeight read-only property of the Element interface is zero for elements with no CSS or inline layout
     * boxes; otherwise, it's the inner height of an element in pixels. It includes padding but excludes borders,
     * margins, and horizontal scrollbars (if present).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/clientHeight)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val clientHeight: Int

    /**
     * The currentCSSZoom read-only property of the Element interface provides the "effective" CSS zoom of an element,
     * taking into account the zoom applied to the element and all its parent elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/currentCSSZoom)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val currentCSSZoom: Double

    /**
     * The setPointerCapture() method of the Element interface is used to designate a specific element as the capture
     * target of future pointer events. Subsequent events for the pointer will be targeted at the capture element until
     * capture is released (via Element.releasePointerCapture() or the pointerup event is fired).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/setPointerCapture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun setPointerCapture(pointerId: Int)

    /**
     * The releasePointerCapture() method of the Element interface releases (stops) pointer capture that was previously
     * set for a specific (PointerEvent) pointer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/releasePointerCapture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun releasePointerCapture(pointerId: Int)

    /**
     * The hasPointerCapture() method of the Element interface checks whether the element on which it is invoked has
     * pointer capture for the pointer identified by the given pointer ID.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/hasPointerCapture)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun hasPointerCapture(pointerId: Int): Boolean

    /**
     * The requestFullscreen() method of the Element interface issues an asynchronous request to display the element in
     * fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/requestFullscreen)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun requestFullscreen(options: FullscreenOptions = definedExternally): Promise<JsAny?>

    /**
     * The fullscreenchange event is fired immediately after an Element switches into or out of fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenchange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onfullscreenchange: ((Event) -> Unit)?

    /**
     * The fullscreenerror event is fired when the browser cannot switch to fullscreen mode.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Element/fullscreenerror_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
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

// file: org/w3c/dom/cssom-view.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom-view', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*

public external interface GeometryNode : JsAny

// file: org/w3c/dom/events/uievents.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'uievents', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.events

import org.w3c.dom.*

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

// file: org/w3c/dom/pointerevents/pointerevents.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'pointerevents', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.pointerevents

import org.w3c.dom.*
import org.w3c.dom.events.*

public external interface MouseEventInit : EventModifierInit {
    public var screenX: Int?
    public var screenY: Int?
    public var clientX: Int?
    public var clientY: Int?
    public var button: Short?
    public var buttons: Short?
    public var relatedTarget: EventTarget?
}

public fun MouseEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, screenX: Int? = null, screenY: Int? = null, clientX: Int? = null, clientY: Int? = null, button: Short? = null, buttons: Short? = null, relatedTarget: EventTarget? = null): MouseEventInit {
    val dictionary = newJsObject<MouseEventInit>()
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
    if (screenX != null) dictionary.screenX = screenX
    if (screenY != null) dictionary.screenY = screenY
    if (clientX != null) dictionary.clientX = clientX
    if (clientY != null) dictionary.clientY = clientY
    if (button != null) dictionary.button = button
    if (buttons != null) dictionary.buttons = buttons
    if (relatedTarget != null) dictionary.relatedTarget = relatedTarget
    return dictionary
}

// file: org/w3c/dom/css/cssom.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.css

import kotlin.js.*

public external interface UnionElementOrProcessingInstruction : JsAny

/**
 * The CSS interface holds useful CSS-related methods. No objects with this interface are implemented: it contains only
 * static methods and is therefore a utilitarian interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSS)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public external object CSS {
    public fun escape(ident: String): String
    public fun supports(property: String, value: String): Boolean
    public fun supports(conditionText: String): Boolean
}

// file: org/w3c/dom/clipboard/clipboard-apis.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'clipboard-apis', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom.clipboard

import kotlin.js.*
import org.w3c.dom.*

/**
 * The ClipboardChangeEvent interface of the Clipboard API represents events fired whenever the contents of the system
 * clipboard are changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class ClipboardChangeEvent : Event {
    /**
     * The ClipboardChangeEvent() constructor creates a new ClipboardChangeEvent object instance when a clipboardchange
     * event occurs. The clipboardchange event fires whenever the system clipboard contents are changed either by a web
     * app or any other system application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent/ClipboardChangeEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: ClipboardChangeEventInit = definedExternally)

    /**
     * The types read-only property of the ClipboardChangeEvent interface returns an array of strings representing the
     * mandatory MIME types available on the system clipboard when the ClipboardChangeEvent event was fired. Optional
     * types and custom formats are not included to limit fingerprinting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent/types)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val types: JsArray<JsString>

    /**
     * The changeId read-only property of the ClipboardChangeEvent interface returns an integer representing a unique
     * identifier for this specific clipboard change operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent/changeId)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val changeId: JsBigInt

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

// file: org/khronos/webgl/webgl1.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webgl1', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.khronos.webgl

import kotlin.js.*
import org.w3c.dom.*

public external interface TexImageSource : ImageBitmapSource

public external interface WebGLRenderingContextOverloads : JsAny {
    /**
     * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data
     * store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bufferData(target: Int, size: Double, usage: Int)

    /**
     * The WebGLRenderingContext.bufferData() method of the WebGL API initializes and creates the buffer object's data
     * store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bufferData(target: Int, data: BufferDataSource?, usage: Int)

    /**
     * The WebGLRenderingContext.bufferSubData() method of the WebGL API updates a subset of a buffer object's data
     * store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/bufferSubData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun bufferSubData(target: Int, offset: Double, data: BufferDataSource)

    /**
     * The compressedTexImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a
     * two-dimensional texture image in a compressed format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView)

    /**
     * The compressedTexSubImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a
     * two-dimensional sub-rectangle for a texture image in a compressed format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/compressedTexSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView)

    /**
     * The WebGLRenderingContext.readPixels() method of the WebGL API reads a block of pixels from a specified rectangle
     * of the current color framebuffer into a TypedArray or a DataView object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/readPixels)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)

    /**
     * The texImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)

    /**
     * The texImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource)

    /**
     * The texSubImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * sub-rectangle for a texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)

    /**
     * The texSubImage2D() method of the WebGLRenderingContext interface of the WebGL API specifies a two-dimensional
     * sub-rectangle for a texture image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/texSubImage2D)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4fv(location: WebGLUniformLocation?, v: Float32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform1iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform2iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform3iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4iv(location: WebGLUniformLocation?, v: Int32Array)

    /**
     * The WebGLRenderingContext.uniform\[1234\]\[fi\]\[v\]() methods of the WebGL API specify values of uniform
     * variables. All active uniform variables defined in a program object are initialized to 0 when the program object
     * is linked successfully. They retain the values assigned to them by a call to this method until the next
     * successful link operation occurs on the program object, when they are once again initialized to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniform)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniform4iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)

    /**
     * The WebGLRenderingContext.uniformMatrix\[234\]fv() methods of the WebGL API specify matrix values for uniform
     * variables.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext/uniformMatrix)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
}

/**
 * The WebGLRenderingContext interface provides an interface to the OpenGL ES 2.0 graphics rendering context for the
 * drawing surface of an HTML &lt;canvas&gt; element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebGLRenderingContext)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class WebGLRenderingContext : WebGLRenderingContextBase, WebGLRenderingContextOverloads, RenderingContext, OffscreenRenderingContext {

    public companion object {
        public val DEPTH_BUFFER_BIT: Int
        public val STENCIL_BUFFER_BIT: Int
        public val COLOR_BUFFER_BIT: Int
        public val POINTS: Int
        public val LINES: Int
        public val LINE_LOOP: Int
        public val LINE_STRIP: Int
        public val TRIANGLES: Int
        public val TRIANGLE_STRIP: Int
        public val TRIANGLE_FAN: Int
        public val ZERO: Int
        public val ONE: Int
        public val SRC_COLOR: Int
        public val ONE_MINUS_SRC_COLOR: Int
        public val SRC_ALPHA: Int
        public val ONE_MINUS_SRC_ALPHA: Int
        public val DST_ALPHA: Int
        public val ONE_MINUS_DST_ALPHA: Int
        public val DST_COLOR: Int
        public val ONE_MINUS_DST_COLOR: Int
        public val SRC_ALPHA_SATURATE: Int
        public val FUNC_ADD: Int
        public val BLEND_EQUATION: Int
        public val BLEND_EQUATION_RGB: Int
        public val BLEND_EQUATION_ALPHA: Int
        public val FUNC_SUBTRACT: Int
        public val FUNC_REVERSE_SUBTRACT: Int
        public val BLEND_DST_RGB: Int
        public val BLEND_SRC_RGB: Int
        public val BLEND_DST_ALPHA: Int
        public val BLEND_SRC_ALPHA: Int
        public val CONSTANT_COLOR: Int
        public val ONE_MINUS_CONSTANT_COLOR: Int
        public val CONSTANT_ALPHA: Int
        public val ONE_MINUS_CONSTANT_ALPHA: Int
        public val BLEND_COLOR: Int
        public val ARRAY_BUFFER: Int
        public val ELEMENT_ARRAY_BUFFER: Int
        public val ARRAY_BUFFER_BINDING: Int
        public val ELEMENT_ARRAY_BUFFER_BINDING: Int
        public val STREAM_DRAW: Int
        public val STATIC_DRAW: Int
        public val DYNAMIC_DRAW: Int
        public val BUFFER_SIZE: Int
        public val BUFFER_USAGE: Int
        public val CURRENT_VERTEX_ATTRIB: Int
        public val FRONT: Int
        public val BACK: Int
        public val FRONT_AND_BACK: Int
        public val CULL_FACE: Int
        public val BLEND: Int
        public val DITHER: Int
        public val STENCIL_TEST: Int
        public val DEPTH_TEST: Int
        public val SCISSOR_TEST: Int
        public val POLYGON_OFFSET_FILL: Int
        public val SAMPLE_ALPHA_TO_COVERAGE: Int
        public val SAMPLE_COVERAGE: Int
        public val NO_ERROR: Int
        public val INVALID_ENUM: Int
        public val INVALID_VALUE: Int
        public val INVALID_OPERATION: Int
        public val OUT_OF_MEMORY: Int
        public val CW: Int
        public val CCW: Int
        public val LINE_WIDTH: Int
        public val ALIASED_POINT_SIZE_RANGE: Int
        public val ALIASED_LINE_WIDTH_RANGE: Int
        public val CULL_FACE_MODE: Int
        public val FRONT_FACE: Int
        public val DEPTH_RANGE: Int
        public val DEPTH_WRITEMASK: Int
        public val DEPTH_CLEAR_VALUE: Int
        public val DEPTH_FUNC: Int
        public val STENCIL_CLEAR_VALUE: Int
        public val STENCIL_FUNC: Int
        public val STENCIL_FAIL: Int
        public val STENCIL_PASS_DEPTH_FAIL: Int
        public val STENCIL_PASS_DEPTH_PASS: Int
        public val STENCIL_REF: Int
        public val STENCIL_VALUE_MASK: Int
        public val STENCIL_WRITEMASK: Int
        public val STENCIL_BACK_FUNC: Int
        public val STENCIL_BACK_FAIL: Int
        public val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        public val STENCIL_BACK_PASS_DEPTH_PASS: Int
        public val STENCIL_BACK_REF: Int
        public val STENCIL_BACK_VALUE_MASK: Int
        public val STENCIL_BACK_WRITEMASK: Int
        public val VIEWPORT: Int
        public val SCISSOR_BOX: Int
        public val COLOR_CLEAR_VALUE: Int
        public val COLOR_WRITEMASK: Int
        public val UNPACK_ALIGNMENT: Int
        public val PACK_ALIGNMENT: Int
        public val MAX_TEXTURE_SIZE: Int
        public val MAX_VIEWPORT_DIMS: Int
        public val SUBPIXEL_BITS: Int
        public val RED_BITS: Int
        public val GREEN_BITS: Int
        public val BLUE_BITS: Int
        public val ALPHA_BITS: Int
        public val DEPTH_BITS: Int
        public val STENCIL_BITS: Int
        public val POLYGON_OFFSET_UNITS: Int
        public val POLYGON_OFFSET_FACTOR: Int
        public val TEXTURE_BINDING_2D: Int
        public val SAMPLE_BUFFERS: Int
        public val SAMPLES: Int
        public val SAMPLE_COVERAGE_VALUE: Int
        public val SAMPLE_COVERAGE_INVERT: Int
        public val COMPRESSED_TEXTURE_FORMATS: Int
        public val DONT_CARE: Int
        public val FASTEST: Int
        public val NICEST: Int
        public val GENERATE_MIPMAP_HINT: Int
        public val BYTE: Int
        public val UNSIGNED_BYTE: Int
        public val SHORT: Int
        public val UNSIGNED_SHORT: Int
        public val INT: Int
        public val UNSIGNED_INT: Int
        public val FLOAT: Int
        public val DEPTH_COMPONENT: Int
        public val ALPHA: Int
        public val RGB: Int
        public val RGBA: Int
        public val LUMINANCE: Int
        public val LUMINANCE_ALPHA: Int
        public val UNSIGNED_SHORT_4_4_4_4: Int
        public val UNSIGNED_SHORT_5_5_5_1: Int
        public val UNSIGNED_SHORT_5_6_5: Int
        public val FRAGMENT_SHADER: Int
        public val VERTEX_SHADER: Int
        public val MAX_VERTEX_ATTRIBS: Int
        public val MAX_VERTEX_UNIFORM_VECTORS: Int
        public val MAX_VARYING_VECTORS: Int
        public val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        public val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        public val MAX_TEXTURE_IMAGE_UNITS: Int
        public val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        public val SHADER_TYPE: Int
        public val DELETE_STATUS: Int
        public val LINK_STATUS: Int
        public val VALIDATE_STATUS: Int
        public val ATTACHED_SHADERS: Int
        public val ACTIVE_UNIFORMS: Int
        public val ACTIVE_ATTRIBUTES: Int
        public val SHADING_LANGUAGE_VERSION: Int
        public val CURRENT_PROGRAM: Int
        public val NEVER: Int
        public val LESS: Int
        public val EQUAL: Int
        public val LEQUAL: Int
        public val GREATER: Int
        public val NOTEQUAL: Int
        public val GEQUAL: Int
        public val ALWAYS: Int
        public val KEEP: Int
        public val REPLACE: Int
        public val INCR: Int
        public val DECR: Int
        public val INVERT: Int
        public val INCR_WRAP: Int
        public val DECR_WRAP: Int
        public val VENDOR: Int
        public val RENDERER: Int
        public val VERSION: Int
        public val NEAREST: Int
        public val LINEAR: Int
        public val NEAREST_MIPMAP_NEAREST: Int
        public val LINEAR_MIPMAP_NEAREST: Int
        public val NEAREST_MIPMAP_LINEAR: Int
        public val LINEAR_MIPMAP_LINEAR: Int
        public val TEXTURE_MAG_FILTER: Int
        public val TEXTURE_MIN_FILTER: Int
        public val TEXTURE_WRAP_S: Int
        public val TEXTURE_WRAP_T: Int
        public val TEXTURE_2D: Int
        public val TEXTURE: Int
        public val TEXTURE_CUBE_MAP: Int
        public val TEXTURE_BINDING_CUBE_MAP: Int
        public val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        public val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        public val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        public val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        public val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        public val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        public val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        public val TEXTURE0: Int
        public val TEXTURE1: Int
        public val TEXTURE2: Int
        public val TEXTURE3: Int
        public val TEXTURE4: Int
        public val TEXTURE5: Int
        public val TEXTURE6: Int
        public val TEXTURE7: Int
        public val TEXTURE8: Int
        public val TEXTURE9: Int
        public val TEXTURE10: Int
        public val TEXTURE11: Int
        public val TEXTURE12: Int
        public val TEXTURE13: Int
        public val TEXTURE14: Int
        public val TEXTURE15: Int
        public val TEXTURE16: Int
        public val TEXTURE17: Int
        public val TEXTURE18: Int
        public val TEXTURE19: Int
        public val TEXTURE20: Int
        public val TEXTURE21: Int
        public val TEXTURE22: Int
        public val TEXTURE23: Int
        public val TEXTURE24: Int
        public val TEXTURE25: Int
        public val TEXTURE26: Int
        public val TEXTURE27: Int
        public val TEXTURE28: Int
        public val TEXTURE29: Int
        public val TEXTURE30: Int
        public val TEXTURE31: Int
        public val ACTIVE_TEXTURE: Int
        public val REPEAT: Int
        public val CLAMP_TO_EDGE: Int
        public val MIRRORED_REPEAT: Int
        public val FLOAT_VEC2: Int
        public val FLOAT_VEC3: Int
        public val FLOAT_VEC4: Int
        public val INT_VEC2: Int
        public val INT_VEC3: Int
        public val INT_VEC4: Int
        public val BOOL: Int
        public val BOOL_VEC2: Int
        public val BOOL_VEC3: Int
        public val BOOL_VEC4: Int
        public val FLOAT_MAT2: Int
        public val FLOAT_MAT3: Int
        public val FLOAT_MAT4: Int
        public val SAMPLER_2D: Int
        public val SAMPLER_CUBE: Int
        public val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        public val VERTEX_ATTRIB_ARRAY_SIZE: Int
        public val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        public val VERTEX_ATTRIB_ARRAY_TYPE: Int
        public val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        public val VERTEX_ATTRIB_ARRAY_POINTER: Int
        public val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        public val IMPLEMENTATION_COLOR_READ_TYPE: Int
        public val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        public val COMPILE_STATUS: Int
        public val LOW_FLOAT: Int
        public val MEDIUM_FLOAT: Int
        public val HIGH_FLOAT: Int
        public val LOW_INT: Int
        public val MEDIUM_INT: Int
        public val HIGH_INT: Int
        public val FRAMEBUFFER: Int
        public val RENDERBUFFER: Int
        public val RGBA4: Int
        public val RGB5_A1: Int
        public val RGBA8: Int
        public val RGB565: Int
        public val DEPTH_COMPONENT16: Int
        public val STENCIL_INDEX8: Int
        public val DEPTH_STENCIL: Int
        public val RENDERBUFFER_WIDTH: Int
        public val RENDERBUFFER_HEIGHT: Int
        public val RENDERBUFFER_INTERNAL_FORMAT: Int
        public val RENDERBUFFER_RED_SIZE: Int
        public val RENDERBUFFER_GREEN_SIZE: Int
        public val RENDERBUFFER_BLUE_SIZE: Int
        public val RENDERBUFFER_ALPHA_SIZE: Int
        public val RENDERBUFFER_DEPTH_SIZE: Int
        public val RENDERBUFFER_STENCIL_SIZE: Int
        public val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        public val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        public val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        public val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        public val COLOR_ATTACHMENT0: Int
        public val DEPTH_ATTACHMENT: Int
        public val STENCIL_ATTACHMENT: Int
        public val DEPTH_STENCIL_ATTACHMENT: Int
        public val NONE: Int
        public val FRAMEBUFFER_COMPLETE: Int
        public val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        public val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        public val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        public val FRAMEBUFFER_UNSUPPORTED: Int
        public val FRAMEBUFFER_BINDING: Int
        public val RENDERBUFFER_BINDING: Int
        public val MAX_RENDERBUFFER_SIZE: Int
        public val INVALID_FRAMEBUFFER_OPERATION: Int
        public val UNPACK_FLIP_Y_WEBGL: Int
        public val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        public val CONTEXT_LOST_WEBGL: Int
        public val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        public val BROWSER_DEFAULT_WEBGL: Int
    }
}

// file: org/w3c/xhr/xhr.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'xhr', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.xhr

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.files.*

/**
 * The FormData interface provides a way to construct a set of key/value pairs representing form fields and their
 * values, which can be sent using the fetch(), XMLHttpRequest.send() or navigator.sendBeacon() methods. It uses the
 * same format a form would use if the encoding type were set to "multipart/form-data".
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class FormData : JsAny {
    /**
     * The FormData() constructor creates a new FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/FormData)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(form: HTMLFormElement = definedExternally, submitter: HTMLElement? = definedExternally)

    /**
     * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object,
     * or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun append(name: String, value: String)

    /**
     * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object,
     * or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun append(name: String, blobValue: Blob, filename: String = definedExternally)

    /**
     * The delete() method of the FormData interface deletes a key and its value(s) from a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun delete(name: String)

    /**
     * The get() method of the FormData interface returns the first value associated with a given key from within a
     * FormData object. If you expect multiple values and want all of them, use the getAll() method instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun get(name: String): JsAny?

    /**
     * The getAll() method of the FormData interface returns all the values associated with a given key from within a
     * FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAll(name: String): JsArray<JsAny>

    /**
     * The has() method of the FormData interface returns whether a FormData object contains a certain key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun has(name: String): Boolean

    /**
     * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds
     * the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun set(name: String, value: String)

    /**
     * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds
     * the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun set(name: String, blobValue: Blob, filename: String = definedExternally)
    // not printed yet: iterable
}

// file: org/w3c/fetch/fetch.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'fetch', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.fetch

import kotlin.js.*
import org.w3c.dom.*

/**
 * The Headers interface of the Fetch API allows you to perform various actions on HTTP request and response headers.
 * These actions include retrieving, setting, adding to, and removing headers from the object's header list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class Headers : JsAny {
    /**
     * The Headers() constructor creates a new Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/Headers)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(init: JsArray<JsArray<JsString>>)

    /**
     * The Headers() constructor creates a new Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/Headers)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(init: JsAny)

    /**
     * The Headers() constructor creates a new Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/Headers)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The append() method of the Headers interface appends a new value onto an existing header inside a Headers object,
     * or adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun append(name: String, value: String)

    /**
     * The delete() method of the Headers interface deletes a header from the current Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun delete(name: String)

    /**
     * The get() method of the Headers interface returns a byte string of all the values of a header within a Headers
     * object with a given name. If the requested header doesn't exist in the Headers object, it returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun get(name: String): String?

    /**
     * The getSetCookie() method of the Headers interface returns an array containing the values of all Set-Cookie
     * headers associated with a response. This allows Headers objects to handle having multiple Set-Cookie headers,
     * which wasn't possible prior to its implementation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/getSetCookie)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getSetCookie(): JsArray<JsString>

    /**
     * The has() method of the Headers interface returns a boolean stating whether a Headers object contains a certain
     * header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun has(name: String): Boolean

    /**
     * The set() method of the Headers interface sets a new value for an existing header inside a Headers object, or
     * adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/set)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun set(name: String, value: String)
    // not printed yet: iterable
}

public external interface RequestInit : JsAny {
    public var method: String?
    public var headers: JsAny?
    public var body: JsAny?
    public var referrer: String?
    public var referrerPolicy: ReferrerPolicy?
    public var mode: RequestMode?
    public var credentials: RequestCredentials?
    public var cache: RequestCache?
    public var redirect: RequestRedirect?
    public var integrity: String?
    public var keepalive: Boolean?
    public var signal: AbortSignal?
    public var duplex: RequestDuplex?
    public var priority: RequestPriority?
    public var window: JsAny?
}

public fun RequestInit(method: String? = null, headers: JsAny? = null, body: JsAny? = null, referrer: String? = null, referrerPolicy: ReferrerPolicy? = null, mode: RequestMode? = null, credentials: RequestCredentials? = null, cache: RequestCache? = null, redirect: RequestRedirect? = null, integrity: String? = null, keepalive: Boolean? = null, signal: AbortSignal? = null, duplex: RequestDuplex? = null, priority: RequestPriority? = null, window: JsAny? = null): RequestInit {
    val dictionary = newJsObject<RequestInit>()
    if (method != null) dictionary.method = method
    if (headers != null) dictionary.headers = headers
    if (body != null) dictionary.body = body
    if (referrer != null) dictionary.referrer = referrer
    if (referrerPolicy != null) dictionary.referrerPolicy = referrerPolicy
    if (mode != null) dictionary.mode = mode
    if (credentials != null) dictionary.credentials = credentials
    if (cache != null) dictionary.cache = cache
    if (redirect != null) dictionary.redirect = redirect
    if (integrity != null) dictionary.integrity = integrity
    if (keepalive != null) dictionary.keepalive = keepalive
    if (signal != null) dictionary.signal = signal
    if (duplex != null) dictionary.duplex = duplex
    if (priority != null) dictionary.priority = priority
    if (window != null) dictionary.window = window
    return dictionary
}

public external interface RequestMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.CORS: RequestMode get() = "cors".toJsString().unsafeCast<RequestMode>()

public external interface RequestCredentials : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".toJsString().unsafeCast<RequestCredentials>()
public inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".toJsString().unsafeCast<RequestCredentials>()
public inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".toJsString().unsafeCast<RequestCredentials>()

// file: org/w3c/dom/wai-aria.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'wai-aria', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.dom


