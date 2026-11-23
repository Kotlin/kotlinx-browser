/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'html', DO NOT EDIT!

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

public external abstract class HTMLAllCollection : JsAny {
    open val length: Int
    open fun namedItem(name: String): UnionElementOrHTMLCollection?
    open fun item(nameOrIndex: String = definedExternally): UnionElementOrHTMLCollection?
}

public operator fun HTMLAllCollection.get(index: Int): Element? = getProperty(this, index)

public operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? = getProperty(this, name)

public external abstract class HTMLFormControlsCollection : HTMLCollection

public operator fun HTMLFormControlsCollection.get(name: String): UnionElementOrRadioNodeList? = getProperty(this, name)

public external abstract class RadioNodeList : NodeList, UnionElementOrRadioNodeList {
    open var value: String
}

public external abstract class HTMLOptionsCollection : HTMLCollection {
    override var length: Int
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: HTMLElement?)
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Int?)
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)
    open fun remove(index: Int)
    open var selectedIndex: Int
}

public operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?) { setProperty(this, index, option) }

public external abstract class DOMStringList : ItemArrayLike<JsString> {
    override val length: Int
    override fun item(index: Int): JsString?
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

public external abstract class HTMLElement : Element, GlobalEventHandlers, ElementContentEditable, HTMLOrSVGOrMathMLElement, ElementCSSInlineStyle {
    open var title: String
    open var lang: String
    open var translate: Boolean
    open var dir: String
    open var hidden: JsAny?
    open var inert: Boolean
    open fun click()
    open var accessKey: String
    open val accessKeyLabel: String
    open var draggable: Boolean
    open var spellcheck: Boolean
    open var writingSuggestions: String
    open var autocapitalize: String
    open var autocorrect: Boolean
    open var innerText: String
    open var outerText: String
    open fun attachInternals(): ElementInternals
    open fun showPopover(options: ShowPopoverOptions = definedExternally)
    open fun hidePopover()
    open fun togglePopover(options: TogglePopoverOptions): Boolean
    open fun togglePopover(options: Boolean): Boolean
    open fun togglePopover(): Boolean
    open var popover: String?
    open var headingOffset: Int
    open var headingReset: Boolean
    open val scrollParent: Element?
    open val offsetParent: Element?
    open val offsetTop: Int
    open val offsetLeft: Int
    open val offsetWidth: Int
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

public external abstract class HTMLUnknownElement : HTMLElement {

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
    val dataset: DOMStringMap
    var nonce: String
    var autofocus: Boolean
    var tabIndex: Int
    fun focus(options: FocusOptions = definedExternally)
    fun blur()
}

public external abstract class DOMStringMap : JsAny {
    // not printed yet: deleter <anonymous>(DOMString)
}

public operator fun DOMStringMap.get(name: String): String? = getStringProperty(this, name)

public operator fun DOMStringMap.set(name: String, value: String) { setStringProperty(this, name, value) }

public external abstract class HTMLHtmlElement : HTMLElement {
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

public external abstract class HTMLHeadElement : HTMLElement {

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

public external abstract class HTMLTitleElement : HTMLElement {
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

public external abstract class HTMLBaseElement : HTMLElement {
    open var href: String
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

public external abstract class HTMLLinkElement : HTMLElement, LinkStyle {
    open var href: String
    open var crossOrigin: String?
    open var rel: String
    open var `as`: String
    open val relList: DOMTokenList
    open var media: String
    open var integrity: String
    open var hreflang: String
    open var type: String
    open val sizes: DOMTokenList
    open var imageSrcset: String
    open var imageSizes: String
    open var referrerPolicy: String
    open val blocking: DOMTokenList
    open var disabled: Boolean
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

public external abstract class HTMLMetaElement : HTMLElement {
    open var name: String
    open var httpEquiv: String
    open var content: String
    open var media: String
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

public external abstract class HTMLStyleElement : HTMLElement, LinkStyle {
    open var disabled: Boolean
    open var media: String
    open val blocking: DOMTokenList
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

public external abstract class HTMLBodyElement : HTMLElement, WindowEventHandlers {
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

public external abstract class HTMLHeadingElement : HTMLElement {
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

public external abstract class HTMLParagraphElement : HTMLElement {
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

public external abstract class HTMLHRElement : HTMLElement {
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

public external abstract class HTMLPreElement : HTMLElement {
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

public external abstract class HTMLQuoteElement : HTMLElement {
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

public external abstract class HTMLOListElement : HTMLElement {
    open var reversed: Boolean
    open var start: Int
    open var type: String
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

public external abstract class HTMLUListElement : HTMLElement {
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

public external abstract class HTMLMenuElement : HTMLElement {
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

public external abstract class HTMLLIElement : HTMLElement {
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

public external abstract class HTMLDListElement : HTMLElement {
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

public external abstract class HTMLDivElement : HTMLElement {
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

public external abstract class HTMLAnchorElement : HTMLElement, HyperlinkElementUtils, HTMLHyperlinkElementUtils {
    open var download: String
    open var ping: String
    open var rel: String
    open val relList: DOMTokenList
    open var text: String
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

public external abstract class HTMLDataElement : HTMLElement {
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

public external abstract class HTMLTimeElement : HTMLElement {
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

public external abstract class HTMLSpanElement : HTMLElement {

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

public external abstract class HTMLBRElement : HTMLElement {
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
    val origin: String
    var protocol: String
    var username: String
    var password: String
    var host: String
    var hostname: String
    var port: String
    var pathname: String
    var search: String
    var hash: String
    var hreflang: String
    var type: String
}

public external interface HTMLHyperlinkElementUtils : JsAny {
    var href: String
    var target: String
}

public external abstract class HTMLModElement : HTMLElement {
    open var cite: String
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

public external abstract class HTMLPictureElement : HTMLElement {

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

public external abstract class HTMLSourceElement : HTMLElement {
    open var src: String
    open var type: String
    open var srcset: String
    open var sizes: String
    open var media: String
    open var width: Int
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

public external abstract class HTMLImageElement : HTMLElement, CanvasImageSource, TexImageSource {
    open var alt: String
    open var src: String
    open var srcset: String
    open var sizes: String
    open var crossOrigin: String?
    open var useMap: String
    open var isMap: Boolean
    open var controls: Boolean
    open var width: Int
    open var height: Int
    open val naturalWidth: Int
    open val naturalHeight: Int
    open val complete: Boolean
    open val currentSrc: String
    open var referrerPolicy: String
    open var decoding: String
    open var loading: String
    open var fetchPriority: String
    open fun decode(): Promise<JsAny?>
    open var name: String
    open var lowsrc: String
    open var align: String
    open var hspace: Int
    open var vspace: Int
    open var longDesc: String
    open var border: String
    open val x: Int
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

public external open class Image : HTMLImageElement {
    constructor(width: Int = definedExternally, height: Int = definedExternally)
    override val children: HTMLCollection
    override val firstElementChild: Element?
    override val lastElementChild: Element?
    override val childElementCount: Int
    override fun prepend(vararg nodes: Node)
    override fun prepend(vararg nodes: String)
    override fun prepend()
    override fun append(vararg nodes: Node)
    override fun append(vararg nodes: String)
    override fun append()
    override fun replaceChildren(vararg nodes: Node)
    override fun replaceChildren(vararg nodes: String)
    override fun replaceChildren()
    override fun moveBefore(node: Node, child: Node?)
    override fun querySelector(selectors: String): Element?
    override fun querySelectorAll(selectors: String): NodeList
    override val previousElementSibling: Element?
    override val nextElementSibling: Element?
    override fun beforeHTML(html: String, options: SetHTMLOptions)
    override fun afterHTML(html: String, options: SetHTMLOptions)
    override fun replaceWithHTML(html: String, options: SetHTMLOptions)
    override fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun before(vararg nodes: Node)
    override fun before(vararg nodes: String)
    override fun before()
    override fun after(vararg nodes: Node)
    override fun after(vararg nodes: String)
    override fun after()
    override fun replaceWith(vararg nodes: Node)
    override fun replaceWith(vararg nodes: String)
    override fun replaceWith()
    override fun remove()
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint
    override var role: String?
    override var ariaActiveDescendantElement: Element?
    override var ariaAtomic: String?
    override var ariaAutoComplete: String?
    override var ariaBrailleLabel: String?
    override var ariaBrailleRoleDescription: String?
    override var ariaBusy: String?
    override var ariaChecked: String?
    override var ariaColCount: String?
    override var ariaColIndex: String?
    override var ariaColIndexText: String?
    override var ariaColSpan: String?
    override var ariaControlsElements: JsArray<Element>?
    override var ariaCurrent: String?
    override var ariaDescribedByElements: JsArray<Element>?
    override var ariaDescription: String?
    override var ariaDetailsElements: JsArray<Element>?
    override var ariaDisabled: String?
    override var ariaErrorMessageElements: JsArray<Element>?
    override var ariaExpanded: String?
    override var ariaFlowToElements: JsArray<Element>?
    override var ariaHasPopup: String?
    override var ariaHidden: String?
    override var ariaInvalid: String?
    override var ariaKeyShortcuts: String?
    override var ariaLabel: String?
    override var ariaLabelledByElements: JsArray<Element>?
    override var ariaLevel: String?
    override var ariaLive: String?
    override var ariaModal: String?
    override var ariaMultiLine: String?
    override var ariaMultiSelectable: String?
    override var ariaOrientation: String?
    override var ariaOwnsElements: JsArray<Element>?
    override var ariaPlaceholder: String?
    override var ariaPosInSet: String?
    override var ariaPressed: String?
    override var ariaReadOnly: String?
    override var ariaRelevant: String?
    override var ariaRequired: String?
    override var ariaRoleDescription: String?
    override var ariaRowCount: String?
    override var ariaRowIndex: String?
    override var ariaRowIndexText: String?
    override var ariaRowSpan: String?
    override var ariaSelected: String?
    override var ariaSetSize: String?
    override var ariaSort: String?
    override var ariaValueMax: String?
    override var ariaValueMin: String?
    override var ariaValueNow: String?
    override var ariaValueText: String?
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
    override var onabort: ((Event) -> Unit)?
    override var onauxclick: ((PointerEvent) -> Unit)?
    override var onbeforeinput: ((InputEvent) -> Unit)?
    override var onbeforematch: ((Event) -> Unit)?
    override var onbeforetoggle: ((ToggleEvent) -> Unit)?
    override var onblur: ((FocusEvent) -> Unit)?
    override var oncancel: ((Event) -> Unit)?
    override var oncanplay: ((Event) -> Unit)?
    override var oncanplaythrough: ((Event) -> Unit)?
    override var onchange: ((Event) -> Unit)?
    override var onclick: ((PointerEvent) -> Unit)?
    override var onclose: ((Event) -> Unit)?
    override var oncommand: ((CommandEvent) -> Unit)?
    override var oncontextlost: ((Event) -> Unit)?
    override var oncontextmenu: ((PointerEvent) -> Unit)?
    override var oncontextrestored: ((Event) -> Unit)?
    override var oncopy: ((ClipboardEvent) -> Unit)?
    override var oncuechange: ((Event) -> Unit)?
    override var oncut: ((ClipboardEvent) -> Unit)?
    override var ondblclick: ((MouseEvent) -> Unit)?
    override var ondrag: ((DragEvent) -> Unit)?
    override var ondragend: ((DragEvent) -> Unit)?
    override var ondragenter: ((DragEvent) -> Unit)?
    override var ondragleave: ((DragEvent) -> Unit)?
    override var ondragover: ((DragEvent) -> Unit)?
    override var ondragstart: ((DragEvent) -> Unit)?
    override var ondrop: ((DragEvent) -> Unit)?
    override var ondurationchange: ((Event) -> Unit)?
    override var onemptied: ((Event) -> Unit)?
    override var onended: ((Event) -> Unit)?
    override var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?
    override var onfocus: ((FocusEvent) -> Unit)?
    override var onformdata: ((FormDataEvent) -> Unit)?
    override var oninput: ((InputEvent) -> Unit)?
    override var oninvalid: ((Event) -> Unit)?
    override var onkeydown: ((KeyboardEvent) -> Unit)?
    override var onkeypress: ((KeyboardEvent) -> Unit)?
    override var onkeyup: ((KeyboardEvent) -> Unit)?
    override var onload: ((Event) -> Unit)?
    override var onloadeddata: ((Event) -> Unit)?
    override var onloadedmetadata: ((Event) -> Unit)?
    override var onloadstart: ((Event) -> Unit)?
    override var onmousedown: ((MouseEvent) -> Unit)?
    override var onmouseenter: ((MouseEvent) -> Unit)?
    override var onmouseleave: ((MouseEvent) -> Unit)?
    override var onmousemove: ((MouseEvent) -> Unit)?
    override var onmouseout: ((MouseEvent) -> Unit)?
    override var onmouseover: ((MouseEvent) -> Unit)?
    override var onmouseup: ((MouseEvent) -> Unit)?
    override var onpaste: ((ClipboardEvent) -> Unit)?
    override var onpause: ((Event) -> Unit)?
    override var onplay: ((Event) -> Unit)?
    override var onplaying: ((Event) -> Unit)?
    override var onprogress: ((Event) -> Unit)?
    override var onratechange: ((Event) -> Unit)?
    override var onreset: ((Event) -> Unit)?
    override var onresize: ((Event) -> Unit)?
    override var onscroll: ((Event) -> Unit)?
    override var onscrollend: ((Event) -> Unit)?
    override var onsecuritypolicyviolation: ((Event) -> Unit)?
    override var onseeked: ((Event) -> Unit)?
    override var onseeking: ((Event) -> Unit)?
    override var onselect: ((Event) -> Unit)?
    override var onslotchange: ((Event) -> Unit)?
    override var onstalled: ((Event) -> Unit)?
    override var onsubmit: ((SubmitEvent) -> Unit)?
    override var onsuspend: ((Event) -> Unit)?
    override var ontimeupdate: ((Event) -> Unit)?
    override var ontoggle: ((ToggleEvent) -> Unit)?
    override var onvolumechange: ((Event) -> Unit)?
    override var onwaiting: ((Event) -> Unit)?
    override var onwebkitanimationend: ((Event) -> Unit)?
    override var onwebkitanimationiteration: ((Event) -> Unit)?
    override var onwebkitanimationstart: ((Event) -> Unit)?
    override var onwebkittransitionend: ((Event) -> Unit)?
    override var onwheel: ((WheelEvent) -> Unit)?
    override var ontouchstart: ((TouchEvent) -> Unit)?
    override var ontouchend: ((TouchEvent) -> Unit)?
    override var ontouchmove: ((TouchEvent) -> Unit)?
    override var ontouchcancel: ((TouchEvent) -> Unit)?
    override var onpointerover: ((PointerEvent) -> Unit)?
    override var onpointerenter: ((PointerEvent) -> Unit)?
    override var onpointerdown: ((PointerEvent) -> Unit)?
    override var onpointermove: ((PointerEvent) -> Unit)?
    override var onpointerrawupdate: ((PointerEvent) -> Unit)?
    override var onpointerup: ((PointerEvent) -> Unit)?
    override var onpointercancel: ((PointerEvent) -> Unit)?
    override var onpointerout: ((PointerEvent) -> Unit)?
    override var onpointerleave: ((PointerEvent) -> Unit)?
    override var ongotpointercapture: ((PointerEvent) -> Unit)?
    override var onlostpointercapture: ((PointerEvent) -> Unit)?
    override var contentEditable: String
    override var enterKeyHint: String
    override val isContentEditable: Boolean
    override var inputMode: String
    override val dataset: DOMStringMap
    override var nonce: String
    override var autofocus: Boolean
    override var tabIndex: Int
    override fun focus(options: FocusOptions)
    override fun blur()
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

public external abstract class HTMLIFrameElement : HTMLElement {
    open var src: String
    open var srcdoc: String
    open var name: String
    open val sandbox: DOMTokenList
    open var allow: String
    open var allowFullscreen: Boolean
    open var width: String
    open var height: String
    open var referrerPolicy: String
    open var loading: String
    open val contentDocument: Document?
    open val contentWindow: Window?
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

public external abstract class HTMLEmbedElement : HTMLElement {
    open var src: String
    open var type: String
    open var width: String
    open var height: String
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

public external abstract class HTMLObjectElement : HTMLElement {
    open var data: String
    open var type: String
    open var name: String
    open val form: HTMLFormElement?
    open var width: String
    open var height: String
    open val contentDocument: Document?
    open val contentWindow: Window?
    open fun getSVGDocument(): Document?
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
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

public external abstract class HTMLVideoElement : HTMLMediaElement, CanvasImageSource, TexImageSource {
    open var width: Int
    open var height: Int
    open val videoWidth: Int
    open val videoHeight: Int
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

public external abstract class HTMLAudioElement : HTMLMediaElement {

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

public external open class Audio : HTMLAudioElement {
    constructor(src: String = definedExternally)
    override val children: HTMLCollection
    override val firstElementChild: Element?
    override val lastElementChild: Element?
    override val childElementCount: Int
    override fun prepend(vararg nodes: Node)
    override fun prepend(vararg nodes: String)
    override fun prepend()
    override fun append(vararg nodes: Node)
    override fun append(vararg nodes: String)
    override fun append()
    override fun replaceChildren(vararg nodes: Node)
    override fun replaceChildren(vararg nodes: String)
    override fun replaceChildren()
    override fun moveBefore(node: Node, child: Node?)
    override fun querySelector(selectors: String): Element?
    override fun querySelectorAll(selectors: String): NodeList
    override val previousElementSibling: Element?
    override val nextElementSibling: Element?
    override fun beforeHTML(html: String, options: SetHTMLOptions)
    override fun afterHTML(html: String, options: SetHTMLOptions)
    override fun replaceWithHTML(html: String, options: SetHTMLOptions)
    override fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun before(vararg nodes: Node)
    override fun before(vararg nodes: String)
    override fun before()
    override fun after(vararg nodes: Node)
    override fun after(vararg nodes: String)
    override fun after()
    override fun replaceWith(vararg nodes: Node)
    override fun replaceWith(vararg nodes: String)
    override fun replaceWith()
    override fun remove()
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint
    override var role: String?
    override var ariaActiveDescendantElement: Element?
    override var ariaAtomic: String?
    override var ariaAutoComplete: String?
    override var ariaBrailleLabel: String?
    override var ariaBrailleRoleDescription: String?
    override var ariaBusy: String?
    override var ariaChecked: String?
    override var ariaColCount: String?
    override var ariaColIndex: String?
    override var ariaColIndexText: String?
    override var ariaColSpan: String?
    override var ariaControlsElements: JsArray<Element>?
    override var ariaCurrent: String?
    override var ariaDescribedByElements: JsArray<Element>?
    override var ariaDescription: String?
    override var ariaDetailsElements: JsArray<Element>?
    override var ariaDisabled: String?
    override var ariaErrorMessageElements: JsArray<Element>?
    override var ariaExpanded: String?
    override var ariaFlowToElements: JsArray<Element>?
    override var ariaHasPopup: String?
    override var ariaHidden: String?
    override var ariaInvalid: String?
    override var ariaKeyShortcuts: String?
    override var ariaLabel: String?
    override var ariaLabelledByElements: JsArray<Element>?
    override var ariaLevel: String?
    override var ariaLive: String?
    override var ariaModal: String?
    override var ariaMultiLine: String?
    override var ariaMultiSelectable: String?
    override var ariaOrientation: String?
    override var ariaOwnsElements: JsArray<Element>?
    override var ariaPlaceholder: String?
    override var ariaPosInSet: String?
    override var ariaPressed: String?
    override var ariaReadOnly: String?
    override var ariaRelevant: String?
    override var ariaRequired: String?
    override var ariaRoleDescription: String?
    override var ariaRowCount: String?
    override var ariaRowIndex: String?
    override var ariaRowIndexText: String?
    override var ariaRowSpan: String?
    override var ariaSelected: String?
    override var ariaSetSize: String?
    override var ariaSort: String?
    override var ariaValueMax: String?
    override var ariaValueMin: String?
    override var ariaValueNow: String?
    override var ariaValueText: String?
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
    override var onabort: ((Event) -> Unit)?
    override var onauxclick: ((PointerEvent) -> Unit)?
    override var onbeforeinput: ((InputEvent) -> Unit)?
    override var onbeforematch: ((Event) -> Unit)?
    override var onbeforetoggle: ((ToggleEvent) -> Unit)?
    override var onblur: ((FocusEvent) -> Unit)?
    override var oncancel: ((Event) -> Unit)?
    override var oncanplay: ((Event) -> Unit)?
    override var oncanplaythrough: ((Event) -> Unit)?
    override var onchange: ((Event) -> Unit)?
    override var onclick: ((PointerEvent) -> Unit)?
    override var onclose: ((Event) -> Unit)?
    override var oncommand: ((CommandEvent) -> Unit)?
    override var oncontextlost: ((Event) -> Unit)?
    override var oncontextmenu: ((PointerEvent) -> Unit)?
    override var oncontextrestored: ((Event) -> Unit)?
    override var oncopy: ((ClipboardEvent) -> Unit)?
    override var oncuechange: ((Event) -> Unit)?
    override var oncut: ((ClipboardEvent) -> Unit)?
    override var ondblclick: ((MouseEvent) -> Unit)?
    override var ondrag: ((DragEvent) -> Unit)?
    override var ondragend: ((DragEvent) -> Unit)?
    override var ondragenter: ((DragEvent) -> Unit)?
    override var ondragleave: ((DragEvent) -> Unit)?
    override var ondragover: ((DragEvent) -> Unit)?
    override var ondragstart: ((DragEvent) -> Unit)?
    override var ondrop: ((DragEvent) -> Unit)?
    override var ondurationchange: ((Event) -> Unit)?
    override var onemptied: ((Event) -> Unit)?
    override var onended: ((Event) -> Unit)?
    override var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?
    override var onfocus: ((FocusEvent) -> Unit)?
    override var onformdata: ((FormDataEvent) -> Unit)?
    override var oninput: ((InputEvent) -> Unit)?
    override var oninvalid: ((Event) -> Unit)?
    override var onkeydown: ((KeyboardEvent) -> Unit)?
    override var onkeypress: ((KeyboardEvent) -> Unit)?
    override var onkeyup: ((KeyboardEvent) -> Unit)?
    override var onload: ((Event) -> Unit)?
    override var onloadeddata: ((Event) -> Unit)?
    override var onloadedmetadata: ((Event) -> Unit)?
    override var onloadstart: ((Event) -> Unit)?
    override var onmousedown: ((MouseEvent) -> Unit)?
    override var onmouseenter: ((MouseEvent) -> Unit)?
    override var onmouseleave: ((MouseEvent) -> Unit)?
    override var onmousemove: ((MouseEvent) -> Unit)?
    override var onmouseout: ((MouseEvent) -> Unit)?
    override var onmouseover: ((MouseEvent) -> Unit)?
    override var onmouseup: ((MouseEvent) -> Unit)?
    override var onpaste: ((ClipboardEvent) -> Unit)?
    override var onpause: ((Event) -> Unit)?
    override var onplay: ((Event) -> Unit)?
    override var onplaying: ((Event) -> Unit)?
    override var onprogress: ((Event) -> Unit)?
    override var onratechange: ((Event) -> Unit)?
    override var onreset: ((Event) -> Unit)?
    override var onresize: ((Event) -> Unit)?
    override var onscroll: ((Event) -> Unit)?
    override var onscrollend: ((Event) -> Unit)?
    override var onsecuritypolicyviolation: ((Event) -> Unit)?
    override var onseeked: ((Event) -> Unit)?
    override var onseeking: ((Event) -> Unit)?
    override var onselect: ((Event) -> Unit)?
    override var onslotchange: ((Event) -> Unit)?
    override var onstalled: ((Event) -> Unit)?
    override var onsubmit: ((SubmitEvent) -> Unit)?
    override var onsuspend: ((Event) -> Unit)?
    override var ontimeupdate: ((Event) -> Unit)?
    override var ontoggle: ((ToggleEvent) -> Unit)?
    override var onvolumechange: ((Event) -> Unit)?
    override var onwaiting: ((Event) -> Unit)?
    override var onwebkitanimationend: ((Event) -> Unit)?
    override var onwebkitanimationiteration: ((Event) -> Unit)?
    override var onwebkitanimationstart: ((Event) -> Unit)?
    override var onwebkittransitionend: ((Event) -> Unit)?
    override var onwheel: ((WheelEvent) -> Unit)?
    override var ontouchstart: ((TouchEvent) -> Unit)?
    override var ontouchend: ((TouchEvent) -> Unit)?
    override var ontouchmove: ((TouchEvent) -> Unit)?
    override var ontouchcancel: ((TouchEvent) -> Unit)?
    override var onpointerover: ((PointerEvent) -> Unit)?
    override var onpointerenter: ((PointerEvent) -> Unit)?
    override var onpointerdown: ((PointerEvent) -> Unit)?
    override var onpointermove: ((PointerEvent) -> Unit)?
    override var onpointerrawupdate: ((PointerEvent) -> Unit)?
    override var onpointerup: ((PointerEvent) -> Unit)?
    override var onpointercancel: ((PointerEvent) -> Unit)?
    override var onpointerout: ((PointerEvent) -> Unit)?
    override var onpointerleave: ((PointerEvent) -> Unit)?
    override var ongotpointercapture: ((PointerEvent) -> Unit)?
    override var onlostpointercapture: ((PointerEvent) -> Unit)?
    override var contentEditable: String
    override var enterKeyHint: String
    override val isContentEditable: Boolean
    override var inputMode: String
    override val dataset: DOMStringMap
    override var nonce: String
    override var autofocus: Boolean
    override var tabIndex: Int
    override fun focus(options: FocusOptions)
    override fun blur()
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

public external abstract class HTMLTrackElement : HTMLElement {
    open var kind: String
    open var src: String
    open var srclang: String
    open var label: String
    open var default: Boolean
    open val readyState: Short
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

public external abstract class HTMLMediaElement : HTMLElement {
    open val error: MediaError?
    open var src: String
    open var srcObject: MediaProvider?
    open val currentSrc: String
    open var crossOrigin: String?
    open val networkState: Short
    open var preload: String
    open val buffered: TimeRanges
    open fun load()
    open fun canPlayType(type: String): CanPlayTypeResult
    open val readyState: Short
    open val seeking: Boolean
    open var currentTime: Double
    open fun fastSeek(time: Double)
    open val duration: Double
    open fun getStartDate(): JsAny
    open val paused: Boolean
    open var defaultPlaybackRate: Double
    open var playbackRate: Double
    open var preservesPitch: Boolean
    open val played: TimeRanges
    open val seekable: TimeRanges
    open val ended: Boolean
    open var autoplay: Boolean
    open var loop: Boolean
    open fun play(): Promise<JsAny?>
    open fun pause()
    open var controls: Boolean
    open var volume: Double
    open var muted: Boolean
    open var defaultMuted: Boolean
    open var loading: String
    open val audioTracks: AudioTrackList
    open val videoTracks: VideoTrackList
    open val textTracks: TextTrackList
    open fun addTextTrack(kind: TextTrackKind, label: String = definedExternally, language: String = definedExternally): TextTrack
    open val mediaKeys: MediaKeys?
    open var onencrypted: ((MediaEncryptedEvent) -> Unit)?
    open var onwaitingforkey: ((Event) -> Unit)?
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

public external abstract class MediaError : JsAny {
    open val code: Short
    open val message: String

    companion object {
        val MEDIA_ERR_ABORTED: Short
        val MEDIA_ERR_NETWORK: Short
        val MEDIA_ERR_DECODE: Short
        val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
    }
}

public external abstract class AudioTrackList : EventTarget {
    open val length: Int
    open fun getTrackById(id: String): AudioTrack?
    open var onchange: ((Event) -> Unit)?
    open var onaddtrack: ((TrackEvent) -> Unit)?
    open var onremovetrack: ((TrackEvent) -> Unit)?
}

public operator fun AudioTrackList.get(index: Int): AudioTrack? = getProperty(this, index)

public external abstract class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
    open val id: String
    open val kind: String
    open val label: String
    open val language: String
    open var enabled: Boolean
    open val sourceBuffer: SourceBuffer?
}

public external abstract class VideoTrackList : EventTarget {
    open val length: Int
    open fun getTrackById(id: String): VideoTrack?
    open val selectedIndex: Int
    open var onchange: ((Event) -> Unit)?
    open var onaddtrack: ((TrackEvent) -> Unit)?
    open var onremovetrack: ((TrackEvent) -> Unit)?
}

public operator fun VideoTrackList.get(index: Int): VideoTrack? = getProperty(this, index)

public external abstract class VideoTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
    open val id: String
    open val kind: String
    open val label: String
    open val language: String
    open var selected: Boolean
    open val sourceBuffer: SourceBuffer?
}

public external abstract class TextTrackList : EventTarget {
    open val length: Int
    open fun getTrackById(id: String): TextTrack?
    open var onchange: ((Event) -> Unit)?
    open var onaddtrack: ((TrackEvent) -> Unit)?
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

public external abstract class TextTrack : EventTarget, UnionAudioTrackOrTextTrackOrVideoTrack {
    open val kind: TextTrackKind
    open val label: String
    open val language: String
    open val id: String
    open val inBandMetadataTrackDispatchType: String
    open var mode: TextTrackMode
    open val cues: TextTrackCueList?
    open val activeCues: TextTrackCueList?
    open fun addCue(cue: TextTrackCue)
    open fun removeCue(cue: TextTrackCue)
    open var oncuechange: ((Event) -> Unit)?
    open val sourceBuffer: SourceBuffer?
}

public external abstract class TextTrackCueList : JsAny {
    open val length: Int
    open fun getCueById(id: String): TextTrackCue?
}

public operator fun TextTrackCueList.get(index: Int): TextTrackCue? = getProperty(this, index)

public external abstract class TextTrackCue : EventTarget {
    open val track: TextTrack?
    open var id: String
    open var startTime: Double
    open var endTime: Double
    open var pauseOnExit: Boolean
    open var onenter: ((Event) -> Unit)?
    open var onexit: ((Event) -> Unit)?
}

public external abstract class TimeRanges : JsAny {
    open val length: Int
    open fun start(index: Int): Double
    open fun end(index: Int): Double
}

public external open class TrackEvent : Event {
    constructor(type: String, eventInitDict: TrackEventInit = definedExternally)
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

public external abstract class HTMLMapElement : HTMLElement {
    open var name: String
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

public external abstract class HTMLAreaElement : HTMLElement, HyperlinkElementUtils, HTMLHyperlinkElementUtils {
    open var alt: String
    open var coords: String
    open var shape: String
    open var download: String
    open var ping: String
    open var rel: String
    open val relList: DOMTokenList
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

public external abstract class HTMLTableElement : HTMLElement {
    open var caption: HTMLTableCaptionElement?
    open fun createCaption(): HTMLTableCaptionElement
    open fun deleteCaption()
    open var tHead: HTMLTableSectionElement?
    open fun createTHead(): HTMLTableSectionElement
    open fun deleteTHead()
    open var tFoot: HTMLTableSectionElement?
    open fun createTFoot(): HTMLTableSectionElement
    open fun deleteTFoot()
    open val tBodies: HTMLCollection
    open fun createTBody(): HTMLTableSectionElement
    open val rows: HTMLCollection
    open fun insertRow(index: Int = definedExternally): HTMLTableRowElement
    open fun deleteRow(index: Int)
    open var align: String
    open var border: String
    open var frame: String
    open var rules: String
    open var summary: String
    open var width: String
    open var bgColor: String
    open var cellPadding: String
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

public external abstract class HTMLTableCaptionElement : HTMLElement {
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

public external abstract class HTMLTableColElement : HTMLElement {
    open var span: Int
    open var align: String
    open var ch: String
    open var chOff: String
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

public external abstract class HTMLTableSectionElement : HTMLElement {
    open val rows: HTMLCollection
    open fun insertRow(index: Int = definedExternally): HTMLTableRowElement
    open fun deleteRow(index: Int)
    open var align: String
    open var ch: String
    open var chOff: String
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

public external abstract class HTMLTableRowElement : HTMLElement {
    open val rowIndex: Int
    open val sectionRowIndex: Int
    open val cells: HTMLCollection
    open fun insertCell(index: Int = definedExternally): HTMLTableCellElement
    open fun deleteCell(index: Int)
    open var align: String
    open var ch: String
    open var chOff: String
    open var vAlign: String
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

public external abstract class HTMLTableCellElement : HTMLElement {
    open var colSpan: Int
    open var rowSpan: Int
    open var headers: String
    open val cellIndex: Int
    open var scope: String
    open var abbr: String
    open var align: String
    open var axis: String
    open var height: String
    open var width: String
    open var ch: String
    open var chOff: String
    open var noWrap: Boolean
    open var vAlign: String
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

public external abstract class HTMLFormElement : HTMLElement {
    open var acceptCharset: String
    open var action: String
    open var autocomplete: String
    open var enctype: String
    open var encoding: String
    open var method: String
    open var name: String
    open var noValidate: Boolean
    open var target: String
    open var rel: String
    open val relList: DOMTokenList
    open val elements: HTMLFormControlsCollection
    open val length: Int
    open fun submit()
    open fun requestSubmit(submitter: HTMLElement? = definedExternally)
    open fun reset()
    open fun checkValidity(): Boolean
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

public external abstract class HTMLLabelElement : HTMLElement {
    open val form: HTMLFormElement?
    open var htmlFor: String
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

public external abstract class HTMLInputElement : HTMLElement, PopoverTargetAttributes {
    open var accept: String
    open var alpha: Boolean
    open var alt: String
    open var autocomplete: String
    open var defaultChecked: Boolean
    open var checked: Boolean
    open var colorSpace: String
    open var dirName: String
    open var disabled: Boolean
    open val form: HTMLFormElement?
    open var files: FileList?
    open var formAction: String
    open var formEnctype: String
    open var formMethod: String
    open var formNoValidate: Boolean
    open var formTarget: String
    open var height: Int
    open var indeterminate: Boolean
    open val list: HTMLDataListElement?
    open var max: String
    open var maxLength: Int
    open var min: String
    open var minLength: Int
    open var multiple: Boolean
    open var name: String
    open var pattern: String
    open var placeholder: String
    open var readOnly: Boolean
    open var required: Boolean
    open var size: Int
    open var src: String
    open var step: String
    open var type: String
    open var defaultValue: String
    open var value: String
    open var valueAsDate: JsAny?
    open var valueAsNumber: Double
    open var width: Int
    open fun stepUp(n: Int = definedExternally)
    open fun stepDown(n: Int = definedExternally)
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
    open fun setCustomValidity(error: String)
    open val labels: NodeList?
    open fun select()
    open var selectionStart: Int?
    open var selectionEnd: Int?
    open var selectionDirection: String?
    open fun setRangeText(replacement: String)
    open fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode = definedExternally)
    open fun setSelectionRange(start: Int, end: Int, direction: String = definedExternally)
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

public external abstract class HTMLButtonElement : HTMLElement, PopoverTargetAttributes {
    open var command: String
    open var commandForElement: Element?
    open var disabled: Boolean
    open val form: HTMLFormElement?
    open var formAction: String
    open var formEnctype: String
    open var formMethod: String
    open var formNoValidate: Boolean
    open var formTarget: String
    open var name: String
    open var type: String
    open var value: String
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
    open fun setCustomValidity(error: String)
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

public external abstract class HTMLSelectElement : HTMLElement, ItemArrayLike<HTMLOptionElement> {
    open var autocomplete: String
    open var disabled: Boolean
    open val form: HTMLFormElement?
    open var multiple: Boolean
    open var name: String
    open var required: Boolean
    open var size: Int
    open val type: String
    open val options: HTMLOptionsCollection
    override var length: Int
    override fun item(index: Int): HTMLOptionElement?
    open fun namedItem(name: String): HTMLOptionElement?
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: HTMLElement?)
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Int?)
    open fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)
    override fun remove()
    open fun remove(index: Int)
    open val selectedOptions: HTMLCollection
    open var selectedIndex: Int
    open var value: String
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
    open fun setCustomValidity(error: String)
    open fun showPicker()
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

public external abstract class HTMLDataListElement : HTMLElement {
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

public external abstract class HTMLOptGroupElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
    open var disabled: Boolean
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

public external abstract class HTMLOptionElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
    open var disabled: Boolean
    open val form: HTMLFormElement?
    open var label: String
    open var defaultSelected: Boolean
    open var selected: Boolean
    open var value: String
    open var text: String
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

public external open class Option : HTMLOptionElement {
    constructor(text: String = definedExternally, value: String = definedExternally, defaultSelected: Boolean = definedExternally, selected: Boolean = definedExternally)
    override val children: HTMLCollection
    override val firstElementChild: Element?
    override val lastElementChild: Element?
    override val childElementCount: Int
    override fun prepend(vararg nodes: Node)
    override fun prepend(vararg nodes: String)
    override fun prepend()
    override fun append(vararg nodes: Node)
    override fun append(vararg nodes: String)
    override fun append()
    override fun replaceChildren(vararg nodes: Node)
    override fun replaceChildren(vararg nodes: String)
    override fun replaceChildren()
    override fun moveBefore(node: Node, child: Node?)
    override fun querySelector(selectors: String): Element?
    override fun querySelectorAll(selectors: String): NodeList
    override val previousElementSibling: Element?
    override val nextElementSibling: Element?
    override fun beforeHTML(html: String, options: SetHTMLOptions)
    override fun afterHTML(html: String, options: SetHTMLOptions)
    override fun replaceWithHTML(html: String, options: SetHTMLOptions)
    override fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions)
    override fun before(vararg nodes: Node)
    override fun before(vararg nodes: String)
    override fun before()
    override fun after(vararg nodes: Node)
    override fun after(vararg nodes: String)
    override fun after()
    override fun replaceWith(vararg nodes: Node)
    override fun replaceWith(vararg nodes: String)
    override fun replaceWith()
    override fun remove()
    override val assignedSlot: HTMLSlotElement?
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint
    override var role: String?
    override var ariaActiveDescendantElement: Element?
    override var ariaAtomic: String?
    override var ariaAutoComplete: String?
    override var ariaBrailleLabel: String?
    override var ariaBrailleRoleDescription: String?
    override var ariaBusy: String?
    override var ariaChecked: String?
    override var ariaColCount: String?
    override var ariaColIndex: String?
    override var ariaColIndexText: String?
    override var ariaColSpan: String?
    override var ariaControlsElements: JsArray<Element>?
    override var ariaCurrent: String?
    override var ariaDescribedByElements: JsArray<Element>?
    override var ariaDescription: String?
    override var ariaDetailsElements: JsArray<Element>?
    override var ariaDisabled: String?
    override var ariaErrorMessageElements: JsArray<Element>?
    override var ariaExpanded: String?
    override var ariaFlowToElements: JsArray<Element>?
    override var ariaHasPopup: String?
    override var ariaHidden: String?
    override var ariaInvalid: String?
    override var ariaKeyShortcuts: String?
    override var ariaLabel: String?
    override var ariaLabelledByElements: JsArray<Element>?
    override var ariaLevel: String?
    override var ariaLive: String?
    override var ariaModal: String?
    override var ariaMultiLine: String?
    override var ariaMultiSelectable: String?
    override var ariaOrientation: String?
    override var ariaOwnsElements: JsArray<Element>?
    override var ariaPlaceholder: String?
    override var ariaPosInSet: String?
    override var ariaPressed: String?
    override var ariaReadOnly: String?
    override var ariaRelevant: String?
    override var ariaRequired: String?
    override var ariaRoleDescription: String?
    override var ariaRowCount: String?
    override var ariaRowIndex: String?
    override var ariaRowIndexText: String?
    override var ariaRowSpan: String?
    override var ariaSelected: String?
    override var ariaSetSize: String?
    override var ariaSort: String?
    override var ariaValueMax: String?
    override var ariaValueMin: String?
    override var ariaValueNow: String?
    override var ariaValueText: String?
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)
    override var onabort: ((Event) -> Unit)?
    override var onauxclick: ((PointerEvent) -> Unit)?
    override var onbeforeinput: ((InputEvent) -> Unit)?
    override var onbeforematch: ((Event) -> Unit)?
    override var onbeforetoggle: ((ToggleEvent) -> Unit)?
    override var onblur: ((FocusEvent) -> Unit)?
    override var oncancel: ((Event) -> Unit)?
    override var oncanplay: ((Event) -> Unit)?
    override var oncanplaythrough: ((Event) -> Unit)?
    override var onchange: ((Event) -> Unit)?
    override var onclick: ((PointerEvent) -> Unit)?
    override var onclose: ((Event) -> Unit)?
    override var oncommand: ((CommandEvent) -> Unit)?
    override var oncontextlost: ((Event) -> Unit)?
    override var oncontextmenu: ((PointerEvent) -> Unit)?
    override var oncontextrestored: ((Event) -> Unit)?
    override var oncopy: ((ClipboardEvent) -> Unit)?
    override var oncuechange: ((Event) -> Unit)?
    override var oncut: ((ClipboardEvent) -> Unit)?
    override var ondblclick: ((MouseEvent) -> Unit)?
    override var ondrag: ((DragEvent) -> Unit)?
    override var ondragend: ((DragEvent) -> Unit)?
    override var ondragenter: ((DragEvent) -> Unit)?
    override var ondragleave: ((DragEvent) -> Unit)?
    override var ondragover: ((DragEvent) -> Unit)?
    override var ondragstart: ((DragEvent) -> Unit)?
    override var ondrop: ((DragEvent) -> Unit)?
    override var ondurationchange: ((Event) -> Unit)?
    override var onemptied: ((Event) -> Unit)?
    override var onended: ((Event) -> Unit)?
    override var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?
    override var onfocus: ((FocusEvent) -> Unit)?
    override var onformdata: ((FormDataEvent) -> Unit)?
    override var oninput: ((InputEvent) -> Unit)?
    override var oninvalid: ((Event) -> Unit)?
    override var onkeydown: ((KeyboardEvent) -> Unit)?
    override var onkeypress: ((KeyboardEvent) -> Unit)?
    override var onkeyup: ((KeyboardEvent) -> Unit)?
    override var onload: ((Event) -> Unit)?
    override var onloadeddata: ((Event) -> Unit)?
    override var onloadedmetadata: ((Event) -> Unit)?
    override var onloadstart: ((Event) -> Unit)?
    override var onmousedown: ((MouseEvent) -> Unit)?
    override var onmouseenter: ((MouseEvent) -> Unit)?
    override var onmouseleave: ((MouseEvent) -> Unit)?
    override var onmousemove: ((MouseEvent) -> Unit)?
    override var onmouseout: ((MouseEvent) -> Unit)?
    override var onmouseover: ((MouseEvent) -> Unit)?
    override var onmouseup: ((MouseEvent) -> Unit)?
    override var onpaste: ((ClipboardEvent) -> Unit)?
    override var onpause: ((Event) -> Unit)?
    override var onplay: ((Event) -> Unit)?
    override var onplaying: ((Event) -> Unit)?
    override var onprogress: ((Event) -> Unit)?
    override var onratechange: ((Event) -> Unit)?
    override var onreset: ((Event) -> Unit)?
    override var onresize: ((Event) -> Unit)?
    override var onscroll: ((Event) -> Unit)?
    override var onscrollend: ((Event) -> Unit)?
    override var onsecuritypolicyviolation: ((Event) -> Unit)?
    override var onseeked: ((Event) -> Unit)?
    override var onseeking: ((Event) -> Unit)?
    override var onselect: ((Event) -> Unit)?
    override var onslotchange: ((Event) -> Unit)?
    override var onstalled: ((Event) -> Unit)?
    override var onsubmit: ((SubmitEvent) -> Unit)?
    override var onsuspend: ((Event) -> Unit)?
    override var ontimeupdate: ((Event) -> Unit)?
    override var ontoggle: ((ToggleEvent) -> Unit)?
    override var onvolumechange: ((Event) -> Unit)?
    override var onwaiting: ((Event) -> Unit)?
    override var onwebkitanimationend: ((Event) -> Unit)?
    override var onwebkitanimationiteration: ((Event) -> Unit)?
    override var onwebkitanimationstart: ((Event) -> Unit)?
    override var onwebkittransitionend: ((Event) -> Unit)?
    override var onwheel: ((WheelEvent) -> Unit)?
    override var ontouchstart: ((TouchEvent) -> Unit)?
    override var ontouchend: ((TouchEvent) -> Unit)?
    override var ontouchmove: ((TouchEvent) -> Unit)?
    override var ontouchcancel: ((TouchEvent) -> Unit)?
    override var onpointerover: ((PointerEvent) -> Unit)?
    override var onpointerenter: ((PointerEvent) -> Unit)?
    override var onpointerdown: ((PointerEvent) -> Unit)?
    override var onpointermove: ((PointerEvent) -> Unit)?
    override var onpointerrawupdate: ((PointerEvent) -> Unit)?
    override var onpointerup: ((PointerEvent) -> Unit)?
    override var onpointercancel: ((PointerEvent) -> Unit)?
    override var onpointerout: ((PointerEvent) -> Unit)?
    override var onpointerleave: ((PointerEvent) -> Unit)?
    override var ongotpointercapture: ((PointerEvent) -> Unit)?
    override var onlostpointercapture: ((PointerEvent) -> Unit)?
    override var contentEditable: String
    override var enterKeyHint: String
    override val isContentEditable: Boolean
    override var inputMode: String
    override val dataset: DOMStringMap
    override var nonce: String
    override var autofocus: Boolean
    override var tabIndex: Int
    override fun focus(options: FocusOptions)
    override fun blur()
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

public external abstract class HTMLTextAreaElement : HTMLElement {
    open var autocomplete: String
    open var cols: Int
    open var dirName: String
    open var disabled: Boolean
    open val form: HTMLFormElement?
    open var maxLength: Int
    open var minLength: Int
    open var name: String
    open var placeholder: String
    open var readOnly: Boolean
    open var required: Boolean
    open var rows: Int
    open var wrap: String
    open val type: String
    open var defaultValue: String
    open var value: String
    open val textLength: Int
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
    open fun setCustomValidity(error: String)
    open val labels: NodeList
    open fun select()
    open var selectionStart: Int
    open var selectionEnd: Int
    open var selectionDirection: String
    open fun setRangeText(replacement: String)
    open fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode = definedExternally)
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

public external abstract class HTMLOutputElement : HTMLElement {
    open val htmlFor: DOMTokenList
    open val form: HTMLFormElement?
    open var name: String
    open val type: String
    open var defaultValue: String
    open var value: String
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
    open fun setCustomValidity(error: String)
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

public external abstract class HTMLProgressElement : HTMLElement {
    open var value: Double
    open var max: Double
    open val position: Double
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

public external abstract class HTMLMeterElement : HTMLElement {
    open var value: Double
    open var min: Double
    open var max: Double
    open var low: Double
    open var high: Double
    open var optimum: Double
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

public external abstract class HTMLFieldSetElement : HTMLElement {
    open var disabled: Boolean
    open val form: HTMLFormElement?
    open var name: String
    open val type: String
    open val elements: HTMLCollection
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
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

public external abstract class HTMLLegendElement : HTMLElement {
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

public external abstract class HTMLSelectedContentElement : HTMLElement {

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

public external abstract class ValidityState : JsAny {
    open val valueMissing: Boolean
    open val typeMismatch: Boolean
    open val patternMismatch: Boolean
    open val tooLong: Boolean
    open val tooShort: Boolean
    open val rangeUnderflow: Boolean
    open val rangeOverflow: Boolean
    open val stepMismatch: Boolean
    open val badInput: Boolean
    open val customError: Boolean
    open val valid: Boolean
}

public external open class SubmitEvent : Event {
    constructor(type: String, eventInitDict: SubmitEventInit = definedExternally)
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

public external open class FormDataEvent : Event {
    constructor(type: String, eventInitDict: FormDataEventInit)
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

public external abstract class HTMLDetailsElement : HTMLElement {
    open var name: String
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

public external abstract class HTMLDialogElement : HTMLElement {
    open var open: Boolean
    open var returnValue: String
    open var closedBy: String
    open fun show()
    open fun showModal()
    open fun close(returnValue: String = definedExternally)
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

public external abstract class HTMLScriptElement : HTMLElement, HTMLOrSVGScriptElement {
    open var type: String
    open var src: String
    open var noModule: Boolean
    open var async: Boolean
    open var defer: Boolean
    open val blocking: DOMTokenList
    open var crossOrigin: String?
    open var referrerPolicy: String
    open var integrity: String
    open var fetchPriority: String
    override var innerText: String
    override var textContent: String?
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
        fun supports(type: String): Boolean
    }
}

public external abstract class HTMLTemplateElement : HTMLElement {
    open val content: DocumentFragment
    open var htmlFor: String
    open var shadowRootMode: String
    open var shadowRootDelegatesFocus: Boolean
    open var shadowRootSerializable: Boolean
    open var shadowRootSlotAssignment: String
    open var shadowRootClonable: Boolean
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

public external abstract class HTMLSlotElement : HTMLElement {
    open var name: String
    open fun assignedNodes(options: AssignedNodesOptions = definedExternally): JsArray<Node>
    open fun assignedElements(options: AssignedNodesOptions = definedExternally): JsArray<Element>
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

public external abstract class HTMLCanvasElement : HTMLElement, UnionHTMLCanvasElementOrOffscreenCanvas {
    open var width: Int
    open var height: Int
    open fun getContext(contextId: String, options: JsAny? = definedExternally): RenderingContext?
    open fun toDataURL(type: String = definedExternally, quality: JsAny? = definedExternally): String
    open fun toBlob(callback: (Blob?) -> Unit, type: String = definedExternally, quality: JsAny? = definedExternally)
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

public external abstract class CanvasRenderingContext2D : CanvasSettings, CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, RenderingContext {
    open val canvas: HTMLCanvasElement
}

public external interface CanvasSettings : JsAny {
    fun getContextAttributes(): CanvasRenderingContext2DSettings
}

public external interface CanvasState : JsAny {
    fun save()
    fun restore()
    fun reset()
    fun isContextLost(): Boolean
}

public external interface CanvasTransform : JsAny {
    fun scale(x: Double, y: Double)
    fun rotate(angle: Double)
    fun translate(x: Double, y: Double)
    fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
    fun getTransform(): DOMMatrix
    fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
    fun setTransform(transform: DOMMatrix2DInit = definedExternally)
    fun resetTransform()
}

public external interface CanvasCompositing : JsAny {
    var globalAlpha: Double
    var globalCompositeOperation: String
}

public external interface CanvasImageSmoothing : JsAny {
    var imageSmoothingEnabled: Boolean
    var imageSmoothingQuality: ImageSmoothingQuality
}

public external interface CanvasFillStrokeStyles : JsAny {
    var strokeStyle: JsAny
    var fillStyle: JsAny
    fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
    fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
    fun createConicGradient(startAngle: Double, x: Double, y: Double): CanvasGradient
    fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}

public external interface CanvasShadowStyles : JsAny {
    var shadowOffsetX: Double
    var shadowOffsetY: Double
    var shadowBlur: Double
    var shadowColor: String
}

public external interface CanvasFilters : JsAny {
    var filter: String
}

public external interface CanvasRect : JsAny {
    fun clearRect(x: Double, y: Double, w: Double, h: Double)
    fun fillRect(x: Double, y: Double, w: Double, h: Double)
    fun strokeRect(x: Double, y: Double, w: Double, h: Double)
}

public external interface CanvasDrawPath : JsAny {
    fun beginPath()
    fun fill(fillRule: CanvasFillRule = definedExternally)
    fun fill(path: Path2D, fillRule: CanvasFillRule = definedExternally)
    fun stroke()
    fun stroke(path: Path2D)
    fun clip(fillRule: CanvasFillRule = definedExternally)
    fun clip(path: Path2D, fillRule: CanvasFillRule = definedExternally)
    fun isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule = definedExternally): Boolean
    fun isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule = definedExternally): Boolean
    fun isPointInStroke(x: Double, y: Double): Boolean
    fun isPointInStroke(path: Path2D, x: Double, y: Double): Boolean
}

public external interface CanvasUserInterface : JsAny {
    fun drawFocusIfNeeded(element: Element)
    fun drawFocusIfNeeded(path: Path2D, element: Element)
}

public external interface CanvasText : JsAny {
    fun fillText(text: String, x: Double, y: Double, maxWidth: Double = definedExternally)
    fun strokeText(text: String, x: Double, y: Double, maxWidth: Double = definedExternally)
    fun measureText(text: String): TextMetrics
}

public external interface CanvasDrawImage : JsAny {
    fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
    fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)
    fun drawImage(image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double)
}

public external interface CanvasImageData : JsAny {
    fun createImageData(sw: Int, sh: Int, settings: ImageDataSettings = definedExternally): ImageData
    fun createImageData(imageData: ImageData): ImageData
    fun getImageData(sx: Int, sy: Int, sw: Int, sh: Int, settings: ImageDataSettings = definedExternally): ImageData
    fun putImageData(imageData: ImageData, dx: Int, dy: Int)
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
    var lineWidth: Double
    var lineCap: CanvasLineCap
    var lineJoin: CanvasLineJoin
    var miterLimit: Double
    fun setLineDash(segments: JsArray<JsNumber>)
    fun getLineDash(): JsArray<JsNumber>
    var lineDashOffset: Double
}

public external interface CanvasTextDrawingStyles : JsAny {
    var lang: String
    var font: String
    var textAlign: CanvasTextAlign
    var textBaseline: CanvasTextBaseline
    var direction: CanvasDirection
    var letterSpacing: String
    var fontKerning: CanvasFontKerning
    var fontStretch: CanvasFontStretch
    var fontVariantCaps: CanvasFontVariantCaps
    var textRendering: CanvasTextRendering
    var wordSpacing: String
}

public external interface CanvasPath : JsAny {
    fun closePath()
    fun moveTo(x: Double, y: Double)
    fun lineTo(x: Double, y: Double)
    fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
    fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
    fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
    fun rect(x: Double, y: Double, w: Double, h: Double)
    fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: Double)
    fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: DOMPointInit)
    fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: JsArray<JsAny>)
    fun roundRect(x: Double, y: Double, w: Double, h: Double)
    fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean = definedExternally)
    fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean = definedExternally)
}

public external abstract class CanvasGradient : JsAny {
    open fun addColorStop(offset: Double, color: String)
}

public external abstract class CanvasPattern : JsAny {
    open fun setTransform(transform: DOMMatrix2DInit = definedExternally)
}

public external abstract class TextMetrics : JsAny {
    open val width: Double
    open val actualBoundingBoxLeft: Double
    open val actualBoundingBoxRight: Double
    open val fontBoundingBoxAscent: Double
    open val fontBoundingBoxDescent: Double
    open val actualBoundingBoxAscent: Double
    open val actualBoundingBoxDescent: Double
    open val emHeightAscent: Double
    open val emHeightDescent: Double
    open val hangingBaseline: Double
    open val alphabeticBaseline: Double
    open val ideographicBaseline: Double
}

public external open class Path2D : CanvasPath {
    constructor(path: Path2D)
    constructor(path: String)
    constructor()
    open fun addPath(path: Path2D, transform: DOMMatrix2DInit = definedExternally)
    override fun closePath()
    override fun moveTo(x: Double, y: Double)
    override fun lineTo(x: Double, y: Double)
    override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
    override fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
    override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
    override fun rect(x: Double, y: Double, w: Double, h: Double)
    override fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: Double)
    override fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: DOMPointInit)
    override fun roundRect(x: Double, y: Double, w: Double, h: Double, radii: JsArray<JsAny>)
    override fun roundRect(x: Double, y: Double, w: Double, h: Double)
    override fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean)
    override fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, counterclockwise: Boolean)
}

public external abstract class ImageBitmapRenderingContext : RenderingContext, OffscreenRenderingContext {
    open val canvas: UnionHTMLCanvasElementOrOffscreenCanvas
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

public external open class OffscreenCanvas : EventTarget, UnionHTMLCanvasElementOrOffscreenCanvas {
    constructor(width: Double, height: Double)
    open var width: Double
    open var height: Double
    open fun getContext(contextId: OffscreenRenderingContextId, options: JsAny? = definedExternally): OffscreenRenderingContext?
    open fun transferToImageBitmap(): ImageBitmap
    open fun convertToBlob(options: ImageEncodeOptions = definedExternally): Promise<Blob>
    open var oncontextlost: ((Event) -> Unit)?
    open var oncontextrestored: ((Event) -> Unit)?
}

public external abstract class OffscreenCanvasRenderingContext2D : CanvasSettings, CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, OffscreenRenderingContext {
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

public external open class CustomElementRegistry : JsAny {
    constructor()
    open fun define(name: String, constructor: () -> HTMLElement, options: ElementDefinitionOptions = definedExternally)
    open fun get(name: String): (() -> HTMLElement)?
    open fun getName(constructor: () -> HTMLElement): String?
    open fun whenDefined(name: String): Promise<JsAny>
    open fun upgrade(root: Node)
    open fun initialize(root: Node)
}

public external interface ElementDefinitionOptions : JsAny {
    var extends: String?
}

public fun ElementDefinitionOptions(extends: String? = null): ElementDefinitionOptions = newJsObject<ElementDefinitionOptions>().apply {
    if (extends != null) this.extends = extends
}

public external abstract class ElementInternals : ARIAMixin {
    open val shadowRoot: ShadowRoot?
    open fun setFormValue(value: File?, state: File?)
    open fun setFormValue(value: File?, state: String?)
    open fun setFormValue(value: File?, state: FormData?)
    open fun setFormValue(value: File?)
    open fun setFormValue(value: String?, state: File?)
    open fun setFormValue(value: String?, state: String?)
    open fun setFormValue(value: String?, state: FormData?)
    open fun setFormValue(value: String?)
    open fun setFormValue(value: FormData?, state: File?)
    open fun setFormValue(value: FormData?, state: String?)
    open fun setFormValue(value: FormData?, state: FormData?)
    open fun setFormValue(value: FormData?)
    open val form: HTMLFormElement?
    open fun setValidity(flags: ValidityStateFlags = definedExternally, message: String = definedExternally, anchor: HTMLElement = definedExternally)
    open val willValidate: Boolean
    open val validity: ValidityState
    open val validationMessage: String
    open fun checkValidity(): Boolean
    open fun reportValidity(): Boolean
    open val labels: NodeList
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

public external abstract class CustomStateSet : JsAny {
    // not printed yet: setlike
}

public external abstract class VisibilityStateEntry : PerformanceEntry {
    override val name: String
    override val entryType: String
    override val startTime: Double
}

public external abstract class UserActivation : JsAny {
    open val hasBeenActive: Boolean
    open val isActive: Boolean
}

public external open class ToggleEvent : Event {
    constructor(type: String, eventInitDict: ToggleEventInit = definedExternally)
    open val oldState: String
    open val newState: String
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

public external open class CommandEvent : Event {
    constructor(type: String, eventInitDict: CommandEventInit = definedExternally)
    open val source: Element?
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
    var contentEditable: String
    var enterKeyHint: String
    val isContentEditable: Boolean
    var inputMode: String
}

public external open class CloseWatcher : EventTarget {
    constructor(options: CloseWatcherOptions = definedExternally)
    open fun requestClose()
    open fun close()
    open fun destroy()
    open var oncancel: ((Event) -> Unit)?
    open var onclose: ((Event) -> Unit)?
}

public external interface CloseWatcherOptions : JsAny {
    var signal: AbortSignal?
}

public fun CloseWatcherOptions(signal: AbortSignal? = null): CloseWatcherOptions = newJsObject<CloseWatcherOptions>().apply {
    if (signal != null) this.signal = signal
}

public external open class DataTransfer : JsAny {
    constructor()
    open var dropEffect: String
    open var effectAllowed: String
    open val items: DataTransferItemList
    open fun setDragImage(image: Element, x: Int, y: Int)
    open val types: JsArray<JsString>
    open fun getData(format: String): String
    open fun setData(format: String, data: String)
    open fun clearData(format: String = definedExternally)
    open val files: FileList
}

public external abstract class DataTransferItemList : JsAny {
    open val length: Int
    open fun add(data: String, type: String): DataTransferItem?
    open fun add(data: File): DataTransferItem?
    open fun remove(index: Int)
    open fun clear()
}

public operator fun DataTransferItemList.get(index: Int): DataTransferItem? = getProperty(this, index)

public external abstract class DataTransferItem : JsAny {
    open val kind: String
    open val type: String
    open fun getAsString(callback: ((String) -> Unit)?)
    open fun getAsFile(): File?
}

public external open class DragEvent : MouseEvent {
    constructor(type: String, eventInitDict: DragEventInit = definedExternally)
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
    var popoverTargetElement: Element?
    var popoverTargetAction: String
}

public external open class Origin : JsAny {
    constructor()
    open val opaque: Boolean
    open fun isSameOrigin(other: Origin): Boolean
    open fun isSameSite(other: Origin): Boolean

    companion object {
        fun from(value: JsAny?): Origin
    }
}

public external abstract class Window : EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowOrWorkerGlobalScope, AnimationFrameProvider, WindowSessionStorage, WindowLocalStorage, MessageEventSource {
    open val window: Window
    open val self: Window
    open val document: Document
    open var name: String
    open val location: Location
    open val history: History
    open val navigation: Navigation
    open val customElements: CustomElementRegistry
    open val locationbar: BarProp
    open val menubar: BarProp
    open val personalbar: BarProp
    open val scrollbars: BarProp
    open val statusbar: BarProp
    open val toolbar: BarProp
    open var status: String
    open fun close()
    open val closed: Boolean
    open fun stop()
    open fun focus()
    open fun blur()
    open val frames: Window
    open val length: Int
    open val top: Window?
    open var opener: JsAny?
    open val parent: Window?
    open val frameElement: Element?
    open fun open(url: String = definedExternally, target: String = definedExternally, features: String = definedExternally): Window?
    open val navigator: Navigator
    open val clientInformation: Navigator
    open val originAgentCluster: Boolean
    open fun alert()
    open fun alert(message: String)
    open fun confirm(message: String = definedExternally): Boolean
    open fun prompt(message: String = definedExternally, default: String = definedExternally): String?
    open fun print()
    open fun postMessage(message: JsAny?, targetOrigin: String, transfer: JsArray<JsAny> = definedExternally)
    open fun postMessage(message: JsAny?, options: WindowPostMessageOptions = definedExternally)
    open fun captureEvents()
    open fun releaseEvents()
    open val external: External
    open val event: Event?
    open fun matchMedia(query: String): MediaQueryList
    open val screen: Screen
    open val visualViewport: VisualViewport?
    open fun moveTo(x: Int, y: Int)
    open fun moveBy(x: Int, y: Int)
    open fun resizeTo(width: Int, height: Int)
    open fun resizeBy(x: Int, y: Int)
    open val innerWidth: Int
    open val innerHeight: Int
    open val scrollX: Double
    open val pageXOffset: Double
    open val scrollY: Double
    open val pageYOffset: Double
    open fun scroll(options: ScrollToOptions = definedExternally): Promise<ScrollResult>
    open fun scroll(x: Double, y: Double): Promise<ScrollResult>
    open fun scrollTo(options: ScrollToOptions = definedExternally): Promise<ScrollResult>
    open fun scrollTo(x: Double, y: Double): Promise<ScrollResult>
    open fun scrollBy(options: ScrollToOptions = definedExternally): Promise<ScrollResult>
    open fun scrollBy(x: Double, y: Double): Promise<ScrollResult>
    open val screenX: Int
    open val screenLeft: Int
    open val screenY: Int
    open val screenTop: Int
    open val outerWidth: Int
    open val outerHeight: Int
    open val devicePixelRatio: Double
    open fun getComputedStyle(elt: Element, pseudoElt: String? = definedExternally): CSSStyleProperties
    open fun fetchLater(input: Request, init: DeferredRequestInit = definedExternally): FetchLaterResult
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

public external abstract class BarProp : JsAny {
    open val visible: Boolean
}

public external abstract class Location : JsAny {
    open var href: String
    open val origin: String
    open var protocol: String
    open var host: String
    open var hostname: String
    open var port: String
    open var pathname: String
    open var search: String
    open var hash: String
    open fun assign(url: String)
    open fun replace(url: String)
    open fun reload()
    open val ancestorOrigins: DOMStringList
}

public external interface ScrollRestoration : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ScrollRestoration.Companion.AUTO: ScrollRestoration get() = "auto".toJsString().unsafeCast<ScrollRestoration>()
public inline val ScrollRestoration.Companion.MANUAL: ScrollRestoration get() = "manual".toJsString().unsafeCast<ScrollRestoration>()

public external abstract class History : JsAny {
    open val length: Int
    open var scrollRestoration: ScrollRestoration
    open val state: JsAny?
    open fun go(delta: Int = definedExternally)
    open fun back()
    open fun forward()
    open fun pushState(data: JsAny?, unused: String, url: String? = definedExternally)
    open fun replaceState(data: JsAny?, unused: String, url: String? = definedExternally)
}

public external abstract class Navigation : EventTarget {
    open fun entries(): JsArray<NavigationHistoryEntry>
    open val currentEntry: NavigationHistoryEntry?
    open fun updateCurrentEntry(options: NavigationUpdateCurrentEntryOptions)
    open val transition: NavigationTransition?
    open val activation: NavigationActivation?
    open val canGoBack: Boolean
    open val canGoForward: Boolean
    open fun navigate(url: String, options: NavigationNavigateOptions = definedExternally): NavigationResult
    open fun reload(options: NavigationReloadOptions = definedExternally): NavigationResult
    open fun traverseTo(key: String, options: NavigationOptions = definedExternally): NavigationResult
    open fun back(options: NavigationOptions = definedExternally): NavigationResult
    open fun forward(options: NavigationOptions = definedExternally): NavigationResult
    open var onnavigate: ((NavigateEvent) -> Unit)?
    open var onnavigatesuccess: ((Event) -> Unit)?
    open var onnavigateerror: ((ErrorEvent) -> Unit)?
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

public external abstract class NavigationHistoryEntry : EventTarget {
    open val url: String?
    open val key: String
    open val id: String
    open val index: Double
    open val sameDocument: Boolean
    open fun getState(): JsAny?
    open var ondispose: ((Event) -> Unit)?
}

public external abstract class NavigationTransition : JsAny {
    open val navigationType: NavigationType
    open val from: NavigationHistoryEntry
    open val to: NavigationDestination
    open val committed: Promise<JsAny?>
    open val finished: Promise<JsAny?>
}

public external abstract class NavigationActivation : JsAny {
    open val from: NavigationHistoryEntry?
    open val entry: NavigationHistoryEntry
    open val navigationType: NavigationType
}

public external open class NavigateEvent : Event {
    constructor(type: String, eventInitDict: NavigateEventInit)
    open val navigationType: NavigationType
    open val destination: NavigationDestination
    open val canIntercept: Boolean
    open val userInitiated: Boolean
    open val hashChange: Boolean
    open val signal: AbortSignal
    open val formData: FormData?
    open val downloadRequest: String?
    open val info: JsAny?
    open val hasUAVisualTransition: Boolean
    open val sourceElement: Element?
    open fun intercept(options: NavigationInterceptOptions = definedExternally)
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

public external abstract class NavigationPrecommitController : JsAny {
    open fun redirect(url: String, options: NavigationNavigateOptions = definedExternally)
    open fun addHandler(handler: () -> Promise<JsAny?>)
}

public external abstract class NavigationDestination : JsAny {
    open val url: String
    open val key: String
    open val id: String
    open val index: Double
    open val sameDocument: Boolean
    open fun getState(): JsAny?
}

public external open class NavigationCurrentEntryChangeEvent : Event {
    constructor(type: String, eventInitDict: NavigationCurrentEntryChangeEventInit)
    open val navigationType: NavigationType?
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

public external open class PopStateEvent : Event {
    constructor(type: String, eventInitDict: PopStateEventInit = definedExternally)
    open val state: JsAny?
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

public external open class HashChangeEvent : Event {
    constructor(type: String, eventInitDict: HashChangeEventInit = definedExternally)
    open val oldURL: String
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

public external open class PageSwapEvent : Event {
    constructor(type: String, eventInitDict: PageSwapEventInit = definedExternally)
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

public external open class PageRevealEvent : Event {
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

public external open class PageTransitionEvent : Event {
    constructor(type: String, eventInitDict: PageTransitionEventInit = definedExternally)
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

public external abstract class BeforeUnloadEvent : Event {

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external abstract class NotRestoredReasonDetails : JsAny {
    open val reason: String
    open fun toJSON(): JsAny
}

public external abstract class NotRestoredReasons : JsAny {
    open val src: String?
    open val id: String?
    open val name: String?
    open val url: String?
    open val reasons: JsArray<NotRestoredReasonDetails>?
    open val children: JsArray<NotRestoredReasons>?
    open fun toJSON(): JsAny
}

public external open class ErrorEvent : Event {
    constructor(type: String, eventInitDict: ErrorEventInit = definedExternally)
    open val message: String
    open val filename: String
    open val lineno: Int
    open val colno: Int
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

public external open class PromiseRejectionEvent : Event {
    constructor(type: String, eventInitDict: PromiseRejectionEventInit)
    open val promise: JsAny
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
    var onauxclick: ((PointerEvent) -> Unit)?
    var onbeforeinput: ((InputEvent) -> Unit)?
    var onbeforematch: ((Event) -> Unit)?
    var onbeforetoggle: ((ToggleEvent) -> Unit)?
    var onblur: ((FocusEvent) -> Unit)?
    var oncancel: ((Event) -> Unit)?
    var oncanplay: ((Event) -> Unit)?
    var oncanplaythrough: ((Event) -> Unit)?
    var onchange: ((Event) -> Unit)?
    var onclick: ((PointerEvent) -> Unit)?
    var onclose: ((Event) -> Unit)?
    var oncommand: ((CommandEvent) -> Unit)?
    var oncontextlost: ((Event) -> Unit)?
    var oncontextmenu: ((PointerEvent) -> Unit)?
    var oncontextrestored: ((Event) -> Unit)?
    var oncopy: ((ClipboardEvent) -> Unit)?
    var oncuechange: ((Event) -> Unit)?
    var oncut: ((ClipboardEvent) -> Unit)?
    var ondblclick: ((MouseEvent) -> Unit)?
    var ondrag: ((DragEvent) -> Unit)?
    var ondragend: ((DragEvent) -> Unit)?
    var ondragenter: ((DragEvent) -> Unit)?
    var ondragleave: ((DragEvent) -> Unit)?
    var ondragover: ((DragEvent) -> Unit)?
    var ondragstart: ((DragEvent) -> Unit)?
    var ondrop: ((DragEvent) -> Unit)?
    var ondurationchange: ((Event) -> Unit)?
    var onemptied: ((Event) -> Unit)?
    var onended: ((Event) -> Unit)?
    var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?
    var onfocus: ((FocusEvent) -> Unit)?
    var onformdata: ((FormDataEvent) -> Unit)?
    var oninput: ((InputEvent) -> Unit)?
    var oninvalid: ((Event) -> Unit)?
    var onkeydown: ((KeyboardEvent) -> Unit)?
    var onkeypress: ((KeyboardEvent) -> Unit)?
    var onkeyup: ((KeyboardEvent) -> Unit)?
    var onload: ((Event) -> Unit)?
    var onloadeddata: ((Event) -> Unit)?
    var onloadedmetadata: ((Event) -> Unit)?
    var onloadstart: ((Event) -> Unit)?
    var onmousedown: ((MouseEvent) -> Unit)?
    var onmouseenter: ((MouseEvent) -> Unit)?
    var onmouseleave: ((MouseEvent) -> Unit)?
    var onmousemove: ((MouseEvent) -> Unit)?
    var onmouseout: ((MouseEvent) -> Unit)?
    var onmouseover: ((MouseEvent) -> Unit)?
    var onmouseup: ((MouseEvent) -> Unit)?
    var onpaste: ((ClipboardEvent) -> Unit)?
    var onpause: ((Event) -> Unit)?
    var onplay: ((Event) -> Unit)?
    var onplaying: ((Event) -> Unit)?
    var onprogress: ((Event) -> Unit)?
    var onratechange: ((Event) -> Unit)?
    var onreset: ((Event) -> Unit)?
    var onresize: ((Event) -> Unit)?
    var onscroll: ((Event) -> Unit)?
    var onscrollend: ((Event) -> Unit)?
    var onsecuritypolicyviolation: ((Event) -> Unit)?
    var onseeked: ((Event) -> Unit)?
    var onseeking: ((Event) -> Unit)?
    var onselect: ((Event) -> Unit)?
    var onslotchange: ((Event) -> Unit)?
    var onstalled: ((Event) -> Unit)?
    var onsubmit: ((SubmitEvent) -> Unit)?
    var onsuspend: ((Event) -> Unit)?
    var ontimeupdate: ((Event) -> Unit)?
    var ontoggle: ((ToggleEvent) -> Unit)?
    var onvolumechange: ((Event) -> Unit)?
    var onwaiting: ((Event) -> Unit)?
    var onwebkitanimationend: ((Event) -> Unit)?
    var onwebkitanimationiteration: ((Event) -> Unit)?
    var onwebkitanimationstart: ((Event) -> Unit)?
    var onwebkittransitionend: ((Event) -> Unit)?
    var onwheel: ((WheelEvent) -> Unit)?
    var ontouchstart: ((TouchEvent) -> Unit)?
    var ontouchend: ((TouchEvent) -> Unit)?
    var ontouchmove: ((TouchEvent) -> Unit)?
    var ontouchcancel: ((TouchEvent) -> Unit)?
    var onpointerover: ((PointerEvent) -> Unit)?
    var onpointerenter: ((PointerEvent) -> Unit)?
    var onpointerdown: ((PointerEvent) -> Unit)?
    var onpointermove: ((PointerEvent) -> Unit)?
    var onpointerrawupdate: ((PointerEvent) -> Unit)?
    var onpointerup: ((PointerEvent) -> Unit)?
    var onpointercancel: ((PointerEvent) -> Unit)?
    var onpointerout: ((PointerEvent) -> Unit)?
    var onpointerleave: ((PointerEvent) -> Unit)?
    var ongotpointercapture: ((PointerEvent) -> Unit)?
    var onlostpointercapture: ((PointerEvent) -> Unit)?
}

public external interface WindowEventHandlers : JsAny {
    var onafterprint: ((Event) -> Unit)?
    var onbeforeprint: ((Event) -> Unit)?
    var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
    var onhashchange: ((HashChangeEvent) -> Unit)?
    var onlanguagechange: ((Event) -> Unit)?
    var onmessage: ((MessageEvent) -> Unit)?
    var onmessageerror: ((MessageEvent) -> Unit)?
    var onoffline: ((Event) -> Unit)?
    var ononline: ((Event) -> Unit)?
    var onpagehide: ((PageTransitionEvent) -> Unit)?
    var onpagereveal: ((PageRevealEvent) -> Unit)?
    var onpageshow: ((PageTransitionEvent) -> Unit)?
    var onpageswap: ((PageSwapEvent) -> Unit)?
    var onpopstate: ((PopStateEvent) -> Unit)?
    var onrejectionhandled: ((PromiseRejectionEvent) -> Unit)?
    var onstorage: ((StorageEvent) -> Unit)?
    var onunhandledrejection: ((PromiseRejectionEvent) -> Unit)?
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

public external open class DOMParser : JsAny {
    constructor()
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

public external open class XMLSerializer : JsAny {
    constructor()
    open fun serializeToString(root: Node): String
}

public external open class Sanitizer : JsAny {
    constructor(configuration: SanitizerConfig)
    constructor(configuration: SanitizerPresets)
    constructor()
    open fun get(): SanitizerConfig
    open fun allowElement(element: String): Boolean
    open fun allowElement(element: SanitizerElementNamespaceWithAttributes): Boolean
    open fun removeElement(element: String): Boolean
    open fun removeElement(element: SanitizerElementNamespace): Boolean
    open fun replaceElementWithChildren(element: String): Boolean
    open fun replaceElementWithChildren(element: SanitizerElementNamespace): Boolean
    open fun allowProcessingInstruction(pi: String): Boolean
    open fun allowProcessingInstruction(pi: SanitizerProcessingInstruction): Boolean
    open fun removeProcessingInstruction(pi: String): Boolean
    open fun removeProcessingInstruction(pi: SanitizerProcessingInstruction): Boolean
    open fun allowAttribute(attribute: String): Boolean
    open fun allowAttribute(attribute: SanitizerAttributeNamespace): Boolean
    open fun removeAttribute(attribute: String): Boolean
    open fun removeAttribute(attribute: SanitizerAttributeNamespace): Boolean
    open fun setComments(allow: Boolean): Boolean
    open fun setDataAttributes(allow: Boolean): Boolean
    open fun setJavascriptURLs(allow: Boolean): Boolean
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

public external abstract class Navigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils, NavigatorCookies, NavigatorPlugins, NavigatorConcurrentHardware {
    open val userActivation: UserActivation
    open val maxTouchPoints: Int
    open val mediaDevices: MediaDevices
    open val clipboard: Clipboard
    open fun vibrate(pattern: Int): Boolean
    open fun vibrate(pattern: JsArray<JsNumber>): Boolean
    open val serviceWorker: ServiceWorkerContainer
    open fun requestMediaKeySystemAccess(keySystem: String, supportedConfigurations: JsArray<MediaKeySystemConfiguration>): Promise<MediaKeySystemAccess>
}

public external interface NavigatorID : JsAny {
    val appCodeName: String
    val appName: String
    val appVersion: String
    val platform: String
    val product: String
    val productSub: String
    val userAgent: String
    val vendor: String
    val vendorSub: String
    fun taintEnabled(): Boolean
    val oscpu: String
}

public external interface NavigatorLanguage : JsAny {
    val language: String
    val languages: JsArray<JsString>
}

public external interface NavigatorOnLine : JsAny {
    val onLine: Boolean
}

public external interface NavigatorContentUtils : JsAny {
    fun registerProtocolHandler(scheme: String, url: String)
    fun unregisterProtocolHandler(scheme: String, url: String)
}

public external interface NavigatorCookies : JsAny {
    val cookieEnabled: Boolean
}

public external interface NavigatorPlugins : JsAny {
    val plugins: PluginArray
    val mimeTypes: MimeTypeArray
    fun javaEnabled(): Boolean
    val pdfViewerEnabled: Boolean
}

public external abstract class PluginArray : ItemArrayLike<Plugin> {
    open fun refresh()
    override val length: Int
    override fun item(index: Int): Plugin?
    open fun namedItem(name: String): Plugin?
}

public operator fun PluginArray.get(index: Int): Plugin? = getProperty(this, index)

public operator fun PluginArray.get(name: String): Plugin? = getProperty(this, name)

public external abstract class MimeTypeArray : ItemArrayLike<MimeType> {
    override val length: Int
    override fun item(index: Int): MimeType?
    open fun namedItem(name: String): MimeType?
}

public operator fun MimeTypeArray.get(index: Int): MimeType? = getProperty(this, index)

public operator fun MimeTypeArray.get(name: String): MimeType? = getProperty(this, name)

public external abstract class Plugin : ItemArrayLike<MimeType> {
    open val name: String
    open val description: String
    open val filename: String
    override val length: Int
    override fun item(index: Int): MimeType?
    open fun namedItem(name: String): MimeType?
}

public operator fun Plugin.get(index: Int): MimeType? = getProperty(this, index)

public operator fun Plugin.get(name: String): MimeType? = getProperty(this, name)

public external abstract class MimeType : JsAny {
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

public external open class ImageData : TexImageSource {
    constructor(sw: Int, sh: Int, settings: ImageDataSettings = definedExternally)
    constructor(data: Uint8ClampedArray, sw: Int, sh: Int = definedExternally, settings: ImageDataSettings = definedExternally)
    open val width: Int
    open val height: Int
    open val data: Uint8ClampedArray
    open val pixelFormat: ImageDataPixelFormat
    open val colorSpace: PredefinedColorSpace
}

public external abstract class ImageBitmap : CanvasImageSource, TexImageSource {
    open val width: Int
    open val height: Int
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
    fun requestAnimationFrame(callback: (Double) -> Unit): Int
    fun cancelAnimationFrame(handle: Int)
}

public external open class MessageEvent : Event {
    constructor(type: String, eventInitDict: MessageEventInit = definedExternally)
    open val data: JsAny?
    open val origin: String
    open val lastEventId: String
    open val source: MessageEventSource?
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

public external open class EventSource : EventTarget {
    constructor(url: String, eventSourceInitDict: EventSourceInit = definedExternally)
    open val url: String
    open val withCredentials: Boolean
    open val readyState: Short
    open var onopen: ((Event) -> Unit)?
    open var onmessage: ((MessageEvent) -> Unit)?
    open var onerror: ((Event) -> Unit)?
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

public external open class MessageChannel : JsAny {
    constructor()
    open val port1: MessagePort
    open val port2: MessagePort
}

public external interface MessageEventTarget : JsAny {
    var onmessage: ((MessageEvent) -> Unit)?
    var onmessageerror: ((MessageEvent) -> Unit)?
}

public external abstract class MessagePort : EventTarget, MessageEventTarget, MessageEventSource, UnionClientOrMessagePortOrServiceWorker {
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)
    open fun start()
    open fun close()
}

public external interface StructuredSerializeOptions : JsAny {
    var transfer: JsArray<JsAny>?
}

public fun StructuredSerializeOptions(transfer: JsArray<JsAny>? = null): StructuredSerializeOptions = newJsObject<StructuredSerializeOptions>().apply {
    if (transfer != null) this.transfer = transfer
}

public external open class BroadcastChannel : EventTarget {
    constructor(name: String)
    open val name: String
    open fun postMessage(message: JsAny?)
    open fun close()
    open var onmessage: ((MessageEvent) -> Unit)?
    open var onmessageerror: ((MessageEvent) -> Unit)?
}

public external abstract class WorkerGlobalScope : EventTarget, WindowOrWorkerGlobalScope {
    open val self: WorkerGlobalScope
    open val location: WorkerLocation
    open val navigator: WorkerNavigator
    open fun importScripts(vararg urls: String)
    open var onerror: ((JsAny, String, Int, Int, JsAny?) -> Unit)?
    open var onlanguagechange: ((Event) -> Unit)?
    open var onoffline: ((Event) -> Unit)?
    open var ononline: ((Event) -> Unit)?
    open var onrejectionhandled: ((PromiseRejectionEvent) -> Unit)?
    open var onunhandledrejection: ((PromiseRejectionEvent) -> Unit)?
}

public external abstract class DedicatedWorkerGlobalScope : WorkerGlobalScope, AnimationFrameProvider, MessageEventTarget {
    open val name: String
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)
    open fun close()
}

public external abstract class SharedWorkerGlobalScope : WorkerGlobalScope {
    open val name: String
    open fun close()
    open var onconnect: ((MessageEvent) -> Unit)?
}

public external interface AbstractWorker : JsAny {
    var onerror: ((Event) -> Unit)?
}

public external open class Worker : EventTarget, AbstractWorker, MessageEventTarget {
    constructor(scriptURL: String, options: WorkerOptions = definedExternally)
    open fun terminate()
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)
    override var onerror: ((Event) -> Unit)?
    override var onmessage: ((MessageEvent) -> Unit)?
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

public external open class SharedWorker : EventTarget, AbstractWorker {
    constructor(scriptURL: String, options: String)
    constructor(scriptURL: String, options: SharedWorkerOptions)
    constructor(scriptURL: String)
    open val port: MessagePort
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
    val hardwareConcurrency: Double
}

public external abstract class WorkerNavigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorConcurrentHardware {
    open val serviceWorker: ServiceWorkerContainer
}

public external abstract class WorkerLocation : JsAny {
    open val href: String
    open val origin: String
    open val protocol: String
    open val host: String
    open val hostname: String
    open val port: String
    open val pathname: String
    open val search: String
    open val hash: String
}

public external abstract class WorkletGlobalScope : JsAny

public external abstract class Worklet : JsAny {
    open fun addModule(moduleURL: String, options: WorkletOptions = definedExternally): Promise<JsAny?>
}

public external interface WorkletOptions : JsAny {
    var credentials: RequestCredentials?
}

public fun WorkletOptions(credentials: RequestCredentials? = null): WorkletOptions = newJsObject<WorkletOptions>().apply {
    if (credentials != null) this.credentials = credentials
}

public external abstract class Storage : JsAny {
    open val length: Int
    open fun key(index: Int): String?
    open fun getItem(key: String): String?
    open fun setItem(key: String, value: String)
    open fun removeItem(key: String)
    open fun clear()
}

public operator fun Storage.get(key: String): String? = getStringProperty(this, key)

public operator fun Storage.set(key: String, value: String) { setStringProperty(this, key, value) }

public external interface WindowSessionStorage : JsAny {
    val sessionStorage: Storage
}

public external interface WindowLocalStorage : JsAny {
    val localStorage: Storage
}

public external open class StorageEvent : Event {
    constructor(type: String, eventInitDict: StorageEventInit = definedExternally)
    open val key: String?
    open val oldValue: String?
    open val newValue: String?
    open val url: String
    open val storageArea: Storage?
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

public external abstract class HTMLMarqueeElement : HTMLElement {
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

public external abstract class HTMLFrameSetElement : HTMLElement, WindowEventHandlers {
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

public external abstract class HTMLFrameElement : HTMLElement {
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

public external abstract class HTMLDirectoryElement : HTMLElement {
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

public external abstract class HTMLFontElement : HTMLElement {
    open var color: String
    open var face: String
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

public external abstract class HTMLParamElement : HTMLElement {
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

public external abstract class External : JsAny {
    open fun AddSearchProvider()
    open fun IsSearchProviderInstalled()
}
