/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
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
import org.w3c.dom.svg.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

actual external abstract class HTMLAllCollection {
    actual open val length: Int
    actual fun item(nameOrIndex: String): UnionElementOrHTMLCollection?
    actual fun namedItem(name: String): UnionElementOrHTMLCollection?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLAllCollection.get(index: Int): Element? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? = asDynamic()[name]

/**
 * Exposes the JavaScript [HTMLFormControlsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLFormControlsCollection) to Kotlin
 */
actual external abstract class HTMLFormControlsCollection : HTMLCollection

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
actual external abstract class RadioNodeList : NodeList, UnionElementOrRadioNodeList {
    actual open var value: String
}

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
actual external abstract class HTMLOptionsCollection : HTMLCollection {
    actual override var length: Int
    actual open var selectedIndex: Int
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: dynamic)
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)
    actual fun remove(index: Int)
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?) { asDynamic()[index] = option }

/**
 * Exposes the JavaScript [HTMLElement](https://developer.mozilla.org/en/docs/Web/API/HTMLElement) to Kotlin
 */
actual external abstract class HTMLElement : Element, GlobalEventHandlers, DocumentAndElementEventHandlers, ElementContentEditable, ElementCSSInlineStyle {
    actual open var title: String
    actual open var lang: String
    actual open var translate: Boolean
    actual open var dir: String
    actual open val dataset: DOMStringMap
    actual open var hidden: Boolean
    actual open var tabIndex: Int
    actual open var accessKey: String
    actual open val accessKeyLabel: String
    actual open var draggable: Boolean
    actual open val dropzone: DOMTokenList
    actual open var contextMenu: HTMLMenuElement?
    actual open var spellcheck: Boolean
    actual open var innerText: String
    actual open val offsetParent: Element?
    actual open val offsetTop: Int
    actual open val offsetLeft: Int
    actual open val offsetWidth: Int
    actual open val offsetHeight: Int
    actual fun click()
    actual fun focus()
    actual fun blur()
    actual fun forceSpellCheck()

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLUnknownElement](https://developer.mozilla.org/en/docs/Web/API/HTMLUnknownElement) to Kotlin
 */
actual external abstract class HTMLUnknownElement : HTMLElement {
    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [DOMStringMap](https://developer.mozilla.org/en/docs/Web/API/DOMStringMap) to Kotlin
 */
actual external abstract class DOMStringMap

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun DOMStringMap.get(name: String): String? = asDynamic()[name]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun DOMStringMap.set(name: String, value: String) { asDynamic()[name] = value }

/**
 * Exposes the JavaScript [HTMLHtmlElement](https://developer.mozilla.org/en/docs/Web/API/HTMLHtmlElement) to Kotlin
 */
actual external abstract class HTMLHtmlElement : HTMLElement {
    actual open var version: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLHeadElement](https://developer.mozilla.org/en/docs/Web/API/HTMLHeadElement) to Kotlin
 */
actual external abstract class HTMLHeadElement : HTMLElement {
    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTitleElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTitleElement) to Kotlin
 */
actual external abstract class HTMLTitleElement : HTMLElement {
    actual open var text: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLBaseElement](https://developer.mozilla.org/en/docs/Web/API/HTMLBaseElement) to Kotlin
 */
actual external abstract class HTMLBaseElement : HTMLElement {
    actual open var href: String
    actual open var target: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLLinkElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLinkElement) to Kotlin
 */
actual external abstract class HTMLLinkElement : HTMLElement, LinkStyle {
    actual open var href: String
    actual open var crossOrigin: String?
    actual open var rel: String
    actual open var `as`: RequestDestination
    actual open val relList: DOMTokenList
    actual open var media: String
    actual open var nonce: String
    actual open var hreflang: String
    actual open var type: String
    actual open val sizes: DOMTokenList
    actual open var referrerPolicy: String
    actual open var charset: String
    actual open var rev: String
    actual open var target: String
    actual open var scope: String
    actual open var workerType: WorkerType

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLMetaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMetaElement) to Kotlin
 */
actual external abstract class HTMLMetaElement : HTMLElement {
    actual open var name: String
    actual open var httpEquiv: String
    actual open var content: String
    actual open var scheme: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLStyleElement](https://developer.mozilla.org/en/docs/Web/API/HTMLStyleElement) to Kotlin
 */
actual external abstract class HTMLStyleElement : HTMLElement, LinkStyle {
    actual open var media: String
    actual open var nonce: String
    actual open var type: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLBodyElement](https://developer.mozilla.org/en/docs/Web/API/HTMLBodyElement) to Kotlin
 */
actual external abstract class HTMLBodyElement : HTMLElement, WindowEventHandlers {
    actual open var text: String
    actual open var link: String
    actual open var vLink: String
    actual open var aLink: String
    actual open var bgColor: String
    actual open var background: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLHeadingElement](https://developer.mozilla.org/en/docs/Web/API/HTMLHeadingElement) to Kotlin
 */
actual external abstract class HTMLHeadingElement : HTMLElement {
    actual open var align: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLParagraphElement](https://developer.mozilla.org/en/docs/Web/API/HTMLParagraphElement) to Kotlin
 */
actual external abstract class HTMLParagraphElement : HTMLElement {
    actual open var align: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLHRElement](https://developer.mozilla.org/en/docs/Web/API/HTMLHRElement) to Kotlin
 */
actual external abstract class HTMLHRElement : HTMLElement {
    actual open var align: String
    actual open var color: String
    actual open var noShade: Boolean
    actual open var size: String
    actual open var width: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLPreElement](https://developer.mozilla.org/en/docs/Web/API/HTMLPreElement) to Kotlin
 */
actual external abstract class HTMLPreElement : HTMLElement {
    actual open var width: Int

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLQuoteElement](https://developer.mozilla.org/en/docs/Web/API/HTMLQuoteElement) to Kotlin
 */
actual external abstract class HTMLQuoteElement : HTMLElement {
    actual open var cite: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLOListElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOListElement) to Kotlin
 */
actual external abstract class HTMLOListElement : HTMLElement {
    actual open var reversed: Boolean
    actual open var start: Int
    actual open var type: String
    actual open var compact: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLUListElement](https://developer.mozilla.org/en/docs/Web/API/HTMLUListElement) to Kotlin
 */
actual external abstract class HTMLUListElement : HTMLElement {
    actual open var compact: Boolean
    actual open var type: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLLIElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLIElement) to Kotlin
 */
actual external abstract class HTMLLIElement : HTMLElement {
    actual open var value: Int
    actual open var type: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLDListElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDListElement) to Kotlin
 */
actual external abstract class HTMLDListElement : HTMLElement {
    actual open var compact: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLDivElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDivElement) to Kotlin
 */
actual external abstract class HTMLDivElement : HTMLElement {
    actual open var align: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLAnchorElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAnchorElement) to Kotlin
 */
actual external abstract class HTMLAnchorElement : HTMLElement, HTMLHyperlinkElementUtils {
    actual open var target: String
    actual open var download: String
    actual open var ping: String
    actual open var rel: String
    actual open val relList: DOMTokenList
    actual open var hreflang: String
    actual open var type: String
    actual open var text: String
    actual open var referrerPolicy: String
    actual open var coords: String
    actual open var charset: String
    actual open var name: String
    actual open var rev: String
    actual open var shape: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLDataElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDataElement) to Kotlin
 */
actual external abstract class HTMLDataElement : HTMLElement {
    actual open var value: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTimeElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTimeElement) to Kotlin
 */
actual external abstract class HTMLTimeElement : HTMLElement {
    actual open var dateTime: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLSpanElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSpanElement) to Kotlin
 */
actual external abstract class HTMLSpanElement : HTMLElement {
    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLBRElement](https://developer.mozilla.org/en/docs/Web/API/HTMLBRElement) to Kotlin
 */
actual external abstract class HTMLBRElement : HTMLElement {
    actual open var clear: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLHyperlinkElementUtils](https://developer.mozilla.org/en/docs/Web/API/HTMLHyperlinkElementUtils) to Kotlin
 */
actual external interface HTMLHyperlinkElementUtils {
    actual var href: String
    actual val origin: String
    actual var protocol: String
    actual var username: String
    actual var password: String
    actual var host: String
    actual var hostname: String
    actual var port: String
    actual var pathname: String
    actual var search: String
    actual var hash: String
}

/**
 * Exposes the JavaScript [HTMLModElement](https://developer.mozilla.org/en/docs/Web/API/HTMLModElement) to Kotlin
 */
actual external abstract class HTMLModElement : HTMLElement {
    actual open var cite: String
    actual open var dateTime: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLPictureElement](https://developer.mozilla.org/en/docs/Web/API/HTMLPictureElement) to Kotlin
 */
actual external abstract class HTMLPictureElement : HTMLElement {
    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLSourceElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSourceElement) to Kotlin
 */
actual external abstract class HTMLSourceElement : HTMLElement {
    actual open var src: String
    actual open var type: String
    actual open var srcset: String
    actual open var sizes: String
    actual open var media: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLImageElement](https://developer.mozilla.org/en/docs/Web/API/HTMLImageElement) to Kotlin
 */
actual external abstract class HTMLImageElement : HTMLElement, HTMLOrSVGImageElement, TexImageSource {
    actual open var alt: String
    actual open var src: String
    actual open var srcset: String
    actual open var sizes: String
    actual open var crossOrigin: String?
    actual open var useMap: String
    actual open var isMap: Boolean
    actual open var width: Int
    actual open var height: Int
    actual open val naturalWidth: Int
    actual open val naturalHeight: Int
    actual open val complete: Boolean
    actual open val currentSrc: String
    actual open var referrerPolicy: String
    actual open var name: String
    actual open var lowsrc: String
    actual open var align: String
    actual open var hspace: Int
    actual open var vspace: Int
    actual open var longDesc: String
    actual open var border: String
    actual open val x: Int
    actual open val y: Int

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLIFrameElement](https://developer.mozilla.org/en/docs/Web/API/HTMLIFrameElement) to Kotlin
 */
actual external abstract class HTMLIFrameElement : HTMLElement {
    actual open var src: String
    actual open var srcdoc: String
    actual open var name: String
    actual open val sandbox: DOMTokenList
    actual open var allowFullscreen: Boolean
    actual open var allowUserMedia: Boolean
    actual open var width: String
    actual open var height: String
    actual open var referrerPolicy: String
    actual open val contentDocument: Document?
    actual open val contentWindow: Window?
    actual open var align: String
    actual open var scrolling: String
    actual open var frameBorder: String
    actual open var longDesc: String
    actual open var marginHeight: String
    actual open var marginWidth: String
    actual fun getSVGDocument(): Document?

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLEmbedElement](https://developer.mozilla.org/en/docs/Web/API/HTMLEmbedElement) to Kotlin
 */
actual external abstract class HTMLEmbedElement : HTMLElement {
    actual open var src: String
    actual open var type: String
    actual open var width: String
    actual open var height: String
    actual open var align: String
    actual open var name: String
    actual fun getSVGDocument(): Document?

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLObjectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLObjectElement) to Kotlin
 */
actual external abstract class HTMLObjectElement : HTMLElement {
    actual open var data: String
    actual open var type: String
    actual open var typeMustMatch: Boolean
    actual open var name: String
    actual open var useMap: String
    actual open val form: HTMLFormElement?
    actual open var width: String
    actual open var height: String
    actual open val contentDocument: Document?
    actual open val contentWindow: Window?
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open var align: String
    actual open var archive: String
    actual open var code: String
    actual open var declare: Boolean
    actual open var hspace: Int
    actual open var standby: String
    actual open var vspace: Int
    actual open var codeBase: String
    actual open var codeType: String
    actual open var border: String
    actual fun getSVGDocument(): Document?
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLParamElement](https://developer.mozilla.org/en/docs/Web/API/HTMLParamElement) to Kotlin
 */
actual external abstract class HTMLParamElement : HTMLElement {
    actual open var name: String
    actual open var value: String
    actual open var type: String
    actual open var valueType: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLVideoElement](https://developer.mozilla.org/en/docs/Web/API/HTMLVideoElement) to Kotlin
 */
actual external abstract class HTMLVideoElement : HTMLMediaElement, CanvasImageSource, TexImageSource {
    actual open var width: Int
    actual open var height: Int
    actual open val videoWidth: Int
    actual open val videoHeight: Int
    actual open var poster: String
    actual open var playsInline: Boolean

    actual companion object {
        actual val NETWORK_EMPTY: Short
        actual val NETWORK_IDLE: Short
        actual val NETWORK_LOADING: Short
        actual val NETWORK_NO_SOURCE: Short
        actual val HAVE_NOTHING: Short
        actual val HAVE_METADATA: Short
        actual val HAVE_CURRENT_DATA: Short
        actual val HAVE_FUTURE_DATA: Short
        actual val HAVE_ENOUGH_DATA: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLAudioElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAudioElement) to Kotlin
 */
actual external abstract class HTMLAudioElement : HTMLMediaElement {
    actual companion object {
        actual val NETWORK_EMPTY: Short
        actual val NETWORK_IDLE: Short
        actual val NETWORK_LOADING: Short
        actual val NETWORK_NO_SOURCE: Short
        actual val HAVE_NOTHING: Short
        actual val HAVE_METADATA: Short
        actual val HAVE_CURRENT_DATA: Short
        actual val HAVE_FUTURE_DATA: Short
        actual val HAVE_ENOUGH_DATA: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTrackElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTrackElement) to Kotlin
 */
actual external abstract class HTMLTrackElement : HTMLElement {
    actual open var kind: String
    actual open var src: String
    actual open var srclang: String
    actual open var label: String
    actual open var default: Boolean
    actual open val readyState: Short
    actual open val track: TextTrack

    actual companion object {
        actual val NONE: Short
        actual val LOADING: Short
        actual val LOADED: Short
        actual val ERROR: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLMediaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMediaElement) to Kotlin
 */
actual external abstract class HTMLMediaElement : HTMLElement {
    actual open val error: MediaError?
    actual open var src: String
    actual open var srcObject: MediaProvider?
    actual open val currentSrc: String
    actual open var crossOrigin: String?
    actual open val networkState: Short
    actual open var preload: String
    actual open val buffered: TimeRanges
    actual open val readyState: Short
    actual open val seeking: Boolean
    actual open var currentTime: Double
    actual open val duration: Double
    actual open val paused: Boolean
    actual open var defaultPlaybackRate: Double
    actual open var playbackRate: Double
    actual open val played: TimeRanges
    actual open val seekable: TimeRanges
    actual open val ended: Boolean
    actual open var autoplay: Boolean
    actual open var loop: Boolean
    actual open var controls: Boolean
    actual open var volume: Double
    actual open var muted: Boolean
    actual open var defaultMuted: Boolean
    actual open val audioTracks: AudioTrackList
    actual open val videoTracks: VideoTrackList
    actual open val textTracks: TextTrackList
    actual open val mediaKeys: MediaKeys?
    actual open var onencrypted: ((Event) -> dynamic)?
    actual open var onwaitingforkey: ((Event) -> dynamic)?
    actual fun load()
    actual fun canPlayType(type: String): CanPlayTypeResult
    actual fun fastSeek(time: Double)
    actual fun getStartDate(): dynamic
    actual fun play(): Promise<Unit>
    actual fun pause()
    actual fun addTextTrack(kind: TextTrackKind, label: String, language: String): TextTrack
    actual fun setMediaKeys(mediaKeys: MediaKeys?): Promise<Unit>

    actual companion object {
        actual val NETWORK_EMPTY: Short
        actual val NETWORK_IDLE: Short
        actual val NETWORK_LOADING: Short
        actual val NETWORK_NO_SOURCE: Short
        actual val HAVE_NOTHING: Short
        actual val HAVE_METADATA: Short
        actual val HAVE_CURRENT_DATA: Short
        actual val HAVE_FUTURE_DATA: Short
        actual val HAVE_ENOUGH_DATA: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [MediaError](https://developer.mozilla.org/en/docs/Web/API/MediaError) to Kotlin
 */
actual external abstract class MediaError {
    actual open val code: Short

    actual companion object {
        actual val MEDIA_ERR_ABORTED: Short
        actual val MEDIA_ERR_NETWORK: Short
        actual val MEDIA_ERR_DECODE: Short
        actual val MEDIA_ERR_SRC_NOT_SUPPORTED: Short
    }
}

/**
 * Exposes the JavaScript [AudioTrackList](https://developer.mozilla.org/en/docs/Web/API/AudioTrackList) to Kotlin
 */
actual external abstract class AudioTrackList : EventTarget {
    actual open val length: Int
    actual open var onchange: ((Event) -> dynamic)?
    actual open var onaddtrack: ((TrackEvent) -> dynamic)?
    actual open var onremovetrack: ((TrackEvent) -> dynamic)?
    actual fun getTrackById(id: String): AudioTrack?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun AudioTrackList.get(index: Int): AudioTrack? = asDynamic()[index]

/**
 * Exposes the JavaScript [AudioTrack](https://developer.mozilla.org/en/docs/Web/API/AudioTrack) to Kotlin
 */
actual external abstract class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
    actual open val id: String
    actual open val kind: String
    actual open val label: String
    actual open val language: String
    actual open var enabled: Boolean
    actual open val sourceBuffer: SourceBuffer?
}

/**
 * Exposes the JavaScript [VideoTrackList](https://developer.mozilla.org/en/docs/Web/API/VideoTrackList) to Kotlin
 */
actual external abstract class VideoTrackList : EventTarget {
    actual open val length: Int
    actual open val selectedIndex: Int
    actual open var onchange: ((Event) -> dynamic)?
    actual open var onaddtrack: ((TrackEvent) -> dynamic)?
    actual open var onremovetrack: ((TrackEvent) -> dynamic)?
    actual fun getTrackById(id: String): VideoTrack?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun VideoTrackList.get(index: Int): VideoTrack? = asDynamic()[index]

/**
 * Exposes the JavaScript [VideoTrack](https://developer.mozilla.org/en/docs/Web/API/VideoTrack) to Kotlin
 */
actual external abstract class VideoTrack : UnionAudioTrackOrTextTrackOrVideoTrack {
    actual open val id: String
    actual open val kind: String
    actual open val label: String
    actual open val language: String
    actual open var selected: Boolean
    actual open val sourceBuffer: SourceBuffer?
}

actual external abstract class TextTrackList : EventTarget {
    actual open val length: Int
    actual open var onchange: ((Event) -> dynamic)?
    actual open var onaddtrack: ((TrackEvent) -> dynamic)?
    actual open var onremovetrack: ((TrackEvent) -> dynamic)?
    actual fun getTrackById(id: String): TextTrack?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun TextTrackList.get(index: Int): TextTrack? = asDynamic()[index]

/**
 * Exposes the JavaScript [TextTrack](https://developer.mozilla.org/en/docs/Web/API/TextTrack) to Kotlin
 */
actual external abstract class TextTrack : EventTarget, UnionAudioTrackOrTextTrackOrVideoTrack {
    actual open val kind: TextTrackKind
    actual open val label: String
    actual open val language: String
    actual open val id: String
    actual open val inBandMetadataTrackDispatchType: String
    actual open var mode: TextTrackMode
    actual open val cues: TextTrackCueList?
    actual open val activeCues: TextTrackCueList?
    actual open var oncuechange: ((Event) -> dynamic)?
    actual open val sourceBuffer: SourceBuffer?
    actual fun addCue(cue: TextTrackCue)
    actual fun removeCue(cue: TextTrackCue)
}

actual external abstract class TextTrackCueList {
    actual open val length: Int
    actual fun getCueById(id: String): TextTrackCue?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun TextTrackCueList.get(index: Int): TextTrackCue? = asDynamic()[index]

/**
 * Exposes the JavaScript [TextTrackCue](https://developer.mozilla.org/en/docs/Web/API/TextTrackCue) to Kotlin
 */
actual external abstract class TextTrackCue : EventTarget {
    actual open val track: TextTrack?
    actual open var id: String
    actual open var startTime: Double
    actual open var endTime: Double
    actual open var pauseOnExit: Boolean
    actual open var onenter: ((Event) -> dynamic)?
    actual open var onexit: ((Event) -> dynamic)?
}

/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
actual external abstract class TimeRanges {
    actual open val length: Int
    actual fun start(index: Int): Double
    actual fun end(index: Int): Double
}

/**
 * Exposes the JavaScript [TrackEvent](https://developer.mozilla.org/en/docs/Web/API/TrackEvent) to Kotlin
 */
actual external open class TrackEvent actual constructor(type: String, eventInitDict: TrackEventInit) : Event {
    actual open val track: UnionAudioTrackOrTextTrackOrVideoTrack?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface TrackEventInit : EventInit {
    actual var track: UnionAudioTrackOrTextTrackOrVideoTrack? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun TrackEventInit(track: UnionAudioTrackOrTextTrackOrVideoTrack?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): TrackEventInit {
    val o = js("({})")
    o["track"] = track
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as TrackEventInit
}

/**
 * Exposes the JavaScript [HTMLMapElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMapElement) to Kotlin
 */
actual external abstract class HTMLMapElement : HTMLElement {
    actual open var name: String
    actual open val areas: HTMLCollection

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLAreaElement) to Kotlin
 */
actual external abstract class HTMLAreaElement : HTMLElement, HTMLHyperlinkElementUtils {
    actual open var alt: String
    actual open var coords: String
    actual open var shape: String
    actual open var target: String
    actual open var download: String
    actual open var ping: String
    actual open var rel: String
    actual open val relList: DOMTokenList
    actual open var referrerPolicy: String
    actual open var noHref: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTableElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableElement) to Kotlin
 */
actual external abstract class HTMLTableElement : HTMLElement {
    actual open var caption: HTMLTableCaptionElement?
    actual open var tHead: HTMLTableSectionElement?
    actual open var tFoot: HTMLTableSectionElement?
    actual open val tBodies: HTMLCollection
    actual open val rows: HTMLCollection
    actual open var align: String
    actual open var border: String
    actual open var frame: String
    actual open var rules: String
    actual open var summary: String
    actual open var width: String
    actual open var bgColor: String
    actual open var cellPadding: String
    actual open var cellSpacing: String
    actual fun createCaption(): HTMLTableCaptionElement
    actual fun deleteCaption()
    actual fun createTHead(): HTMLTableSectionElement
    actual fun deleteTHead()
    actual fun createTFoot(): HTMLTableSectionElement
    actual fun deleteTFoot()
    actual fun createTBody(): HTMLTableSectionElement
    actual fun insertRow(index: Int): HTMLTableRowElement
    actual fun deleteRow(index: Int)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTableCaptionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableCaptionElement) to Kotlin
 */
actual external abstract class HTMLTableCaptionElement : HTMLElement {
    actual open var align: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTableColElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableColElement) to Kotlin
 */
actual external abstract class HTMLTableColElement : HTMLElement {
    actual open var span: Int
    actual open var align: String
    actual open var ch: String
    actual open var chOff: String
    actual open var vAlign: String
    actual open var width: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTableSectionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableSectionElement) to Kotlin
 */
actual external abstract class HTMLTableSectionElement : HTMLElement {
    actual open val rows: HTMLCollection
    actual open var align: String
    actual open var ch: String
    actual open var chOff: String
    actual open var vAlign: String
    actual fun insertRow(index: Int): HTMLElement
    actual fun deleteRow(index: Int)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTableRowElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableRowElement) to Kotlin
 */
actual external abstract class HTMLTableRowElement : HTMLElement {
    actual open val rowIndex: Int
    actual open val sectionRowIndex: Int
    actual open val cells: HTMLCollection
    actual open var align: String
    actual open var ch: String
    actual open var chOff: String
    actual open var vAlign: String
    actual open var bgColor: String
    actual fun insertCell(index: Int): HTMLElement
    actual fun deleteCell(index: Int)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTableCellElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTableCellElement) to Kotlin
 */
actual external abstract class HTMLTableCellElement : HTMLElement {
    actual open var colSpan: Int
    actual open var rowSpan: Int
    actual open var headers: String
    actual open val cellIndex: Int
    actual open var scope: String
    actual open var abbr: String
    actual open var align: String
    actual open var axis: String
    actual open var height: String
    actual open var width: String
    actual open var ch: String
    actual open var chOff: String
    actual open var noWrap: Boolean
    actual open var vAlign: String
    actual open var bgColor: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLFormElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFormElement) to Kotlin
 */
actual external abstract class HTMLFormElement : HTMLElement {
    actual open var acceptCharset: String
    actual open var action: String
    actual open var autocomplete: String
    actual open var enctype: String
    actual open var encoding: String
    actual open var method: String
    actual open var name: String
    actual open var noValidate: Boolean
    actual open var target: String
    actual open val elements: HTMLFormControlsCollection
    actual open val length: Int
    actual fun submit()
    actual fun reset()
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLFormElement.get(index: Int): Element? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? = asDynamic()[name]

/**
 * Exposes the JavaScript [HTMLLabelElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLabelElement) to Kotlin
 */
actual external abstract class HTMLLabelElement : HTMLElement {
    actual open val form: HTMLFormElement?
    actual open var htmlFor: String
    actual open val control: HTMLElement?

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLInputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLInputElement) to Kotlin
 */
actual external abstract class HTMLInputElement : HTMLElement {
    actual open var accept: String
    actual open var alt: String
    actual open var autocomplete: String
    actual open var autofocus: Boolean
    actual open var defaultChecked: Boolean
    actual open var checked: Boolean
    actual open var dirName: String
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open val files: FileList?
    actual open var formAction: String
    actual open var formEnctype: String
    actual open var formMethod: String
    actual open var formNoValidate: Boolean
    actual open var formTarget: String
    actual open var height: Int
    actual open var indeterminate: Boolean
    actual open var inputMode: String
    actual open val list: HTMLElement?
    actual open var max: String
    actual open var maxLength: Int
    actual open var min: String
    actual open var minLength: Int
    actual open var multiple: Boolean
    actual open var name: String
    actual open var pattern: String
    actual open var placeholder: String
    actual open var readOnly: Boolean
    actual open var required: Boolean
    actual open var size: Int
    actual open var src: String
    actual open var step: String
    actual open var type: String
    actual open var defaultValue: String
    actual open var value: String
    actual open var valueAsDate: dynamic
    actual open var valueAsNumber: Double
    actual open var width: Int
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open val labels: NodeList
    actual open var selectionStart: Int?
    actual open var selectionEnd: Int?
    actual open var selectionDirection: String?
    actual open var align: String
    actual open var useMap: String
    actual fun stepUp(n: Int)
    actual fun stepDown(n: Int)
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)
    actual fun select()
    actual fun setRangeText(replacement: String)
    actual fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode)
    actual fun setSelectionRange(start: Int, end: Int, direction: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLButtonElement](https://developer.mozilla.org/en/docs/Web/API/HTMLButtonElement) to Kotlin
 */
actual external abstract class HTMLButtonElement : HTMLElement {
    actual open var autofocus: Boolean
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open var formAction: String
    actual open var formEnctype: String
    actual open var formMethod: String
    actual open var formNoValidate: Boolean
    actual open var formTarget: String
    actual open var name: String
    actual open var type: String
    actual open var value: String
    actual open var menu: HTMLMenuElement?
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open val labels: NodeList
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLSelectElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSelectElement) to Kotlin
 */
actual external abstract class HTMLSelectElement : HTMLElement, ItemArrayLike<Element> {
    actual open var autocomplete: String
    actual open var autofocus: Boolean
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open var multiple: Boolean
    actual open var name: String
    actual open var required: Boolean
    actual open var size: Int
    actual open val type: String
    actual open val options: HTMLOptionsCollection
    actual override var length: Int
    actual open val selectedOptions: HTMLCollection
    actual open var selectedIndex: Int
    actual open var value: String
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open val labels: NodeList
    actual fun namedItem(name: String): HTMLOptionElement?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: dynamic)
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)
    actual fun remove(index: Int)
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)
    actual override fun item(index: Int): Element?

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLSelectElement.get(index: Int): Element? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLSelectElement.set(index: Int, option: HTMLOptionElement?) { asDynamic()[index] = option }

/**
 * Exposes the JavaScript [HTMLDataListElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDataListElement) to Kotlin
 */
actual external abstract class HTMLDataListElement : HTMLElement {
    actual open val options: HTMLCollection

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLOptGroupElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOptGroupElement) to Kotlin
 */
actual external abstract class HTMLOptGroupElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
    actual open var disabled: Boolean
    actual open var label: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLOptionElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionElement) to Kotlin
 */
actual external abstract class HTMLOptionElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement {
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open var label: String
    actual open var defaultSelected: Boolean
    actual open var selected: Boolean
    actual open var value: String
    actual open var text: String
    actual open val index: Int

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTextAreaElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTextAreaElement) to Kotlin
 */
actual external abstract class HTMLTextAreaElement : HTMLElement {
    actual open var autocomplete: String
    actual open var autofocus: Boolean
    actual open var cols: Int
    actual open var dirName: String
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open var inputMode: String
    actual open var maxLength: Int
    actual open var minLength: Int
    actual open var name: String
    actual open var placeholder: String
    actual open var readOnly: Boolean
    actual open var required: Boolean
    actual open var rows: Int
    actual open var wrap: String
    actual open val type: String
    actual open var defaultValue: String
    actual open var value: String
    actual open val textLength: Int
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open val labels: NodeList
    actual open var selectionStart: Int?
    actual open var selectionEnd: Int?
    actual open var selectionDirection: String?
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)
    actual fun select()
    actual fun setRangeText(replacement: String)
    actual fun setRangeText(replacement: String, start: Int, end: Int, selectionMode: SelectionMode)
    actual fun setSelectionRange(start: Int, end: Int, direction: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLKeygenElement](https://developer.mozilla.org/en/docs/Web/API/HTMLKeygenElement) to Kotlin
 */
actual external abstract class HTMLKeygenElement : HTMLElement {
    actual open var autofocus: Boolean
    actual open var challenge: String
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open var keytype: String
    actual open var name: String
    actual open val type: String
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open val labels: NodeList
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLOutputElement](https://developer.mozilla.org/en/docs/Web/API/HTMLOutputElement) to Kotlin
 */
actual external abstract class HTMLOutputElement : HTMLElement {
    actual open val htmlFor: DOMTokenList
    actual open val form: HTMLFormElement?
    actual open var name: String
    actual open val type: String
    actual open var defaultValue: String
    actual open var value: String
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual open val labels: NodeList
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLProgressElement](https://developer.mozilla.org/en/docs/Web/API/HTMLProgressElement) to Kotlin
 */
actual external abstract class HTMLProgressElement : HTMLElement {
    actual open var value: Double
    actual open var max: Double
    actual open val position: Double
    actual open val labels: NodeList

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLMeterElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMeterElement) to Kotlin
 */
actual external abstract class HTMLMeterElement : HTMLElement {
    actual open var value: Double
    actual open var min: Double
    actual open var max: Double
    actual open var low: Double
    actual open var high: Double
    actual open var optimum: Double
    actual open val labels: NodeList

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLFieldSetElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFieldSetElement) to Kotlin
 */
actual external abstract class HTMLFieldSetElement : HTMLElement {
    actual open var disabled: Boolean
    actual open val form: HTMLFormElement?
    actual open var name: String
    actual open val type: String
    actual open val elements: HTMLCollection
    actual open val willValidate: Boolean
    actual open val validity: ValidityState
    actual open val validationMessage: String
    actual fun checkValidity(): Boolean
    actual fun reportValidity(): Boolean
    actual fun setCustomValidity(error: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLLegendElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLegendElement) to Kotlin
 */
actual external abstract class HTMLLegendElement : HTMLElement {
    actual open val form: HTMLFormElement?
    actual open var align: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [ValidityState](https://developer.mozilla.org/en/docs/Web/API/ValidityState) to Kotlin
 */
actual external abstract class ValidityState {
    actual open val valueMissing: Boolean
    actual open val typeMismatch: Boolean
    actual open val patternMismatch: Boolean
    actual open val tooLong: Boolean
    actual open val tooShort: Boolean
    actual open val rangeUnderflow: Boolean
    actual open val rangeOverflow: Boolean
    actual open val stepMismatch: Boolean
    actual open val badInput: Boolean
    actual open val customError: Boolean
    actual open val valid: Boolean
}

/**
 * Exposes the JavaScript [HTMLDetailsElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDetailsElement) to Kotlin
 */
actual external abstract class HTMLDetailsElement : HTMLElement {
    actual open var open: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external abstract class HTMLMenuElement : HTMLElement {
    actual open var type: String
    actual open var label: String
    actual open var compact: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external abstract class HTMLMenuItemElement : HTMLElement {
    actual open var type: String
    actual open var label: String
    actual open var icon: String
    actual open var disabled: Boolean
    actual open var checked: Boolean
    actual open var radiogroup: String
    actual open var default: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external open class RelatedEvent actual constructor(type: String, eventInitDict: RelatedEventInit) : Event {
    actual open val relatedTarget: EventTarget?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface RelatedEventInit : EventInit {
    actual var relatedTarget: EventTarget? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun RelatedEventInit(relatedTarget: EventTarget?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): RelatedEventInit {
    val o = js("({})")
    o["relatedTarget"] = relatedTarget
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as RelatedEventInit
}

/**
 * Exposes the JavaScript [HTMLDialogElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDialogElement) to Kotlin
 */
actual external abstract class HTMLDialogElement : HTMLElement {
    actual open var open: Boolean
    actual open var returnValue: String
    actual fun show(anchor: UnionElementOrMouseEvent)
    actual fun showModal(anchor: UnionElementOrMouseEvent)
    actual fun close(returnValue: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLScriptElement](https://developer.mozilla.org/en/docs/Web/API/HTMLScriptElement) to Kotlin
 */
actual external abstract class HTMLScriptElement : HTMLElement, HTMLOrSVGScriptElement {
    actual open var src: String
    actual open var type: String
    actual open var charset: String
    actual open var async: Boolean
    actual open var defer: Boolean
    actual open var crossOrigin: String?
    actual open var text: String
    actual open var nonce: String
    actual open var event: String
    actual open var htmlFor: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLTemplateElement](https://developer.mozilla.org/en/docs/Web/API/HTMLTemplateElement) to Kotlin
 */
actual external abstract class HTMLTemplateElement : HTMLElement {
    actual open val content: DocumentFragment

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLSlotElement](https://developer.mozilla.org/en/docs/Web/API/HTMLSlotElement) to Kotlin
 */
actual external abstract class HTMLSlotElement : HTMLElement {
    actual open var name: String
    actual fun assignedNodes(options: AssignedNodesOptions): Array<Node>

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface AssignedNodesOptions {
    actual var flatten: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun AssignedNodesOptions(flatten: Boolean?): AssignedNodesOptions {
    val o = js("({})")
    o["flatten"] = flatten
    return o as AssignedNodesOptions
}

/**
 * Exposes the JavaScript [HTMLCanvasElement](https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement) to Kotlin
 */
actual external abstract class HTMLCanvasElement : HTMLElement, CanvasImageSource, TexImageSource {
    actual open var width: Int
    actual open var height: Int
    actual fun getContext(contextId: String, vararg arguments: Any?): RenderingContext?
    actual fun toDataURL(type: String, quality: Any?): String
    actual fun toBlob(_callback: (Blob?) -> Unit, type: String, quality: Any?)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface CanvasRenderingContext2DSettings {
    actual var alpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun CanvasRenderingContext2DSettings(alpha: Boolean?): CanvasRenderingContext2DSettings {
    val o = js("({})")
    o["alpha"] = alpha
    return o as CanvasRenderingContext2DSettings
}

/**
 * Exposes the JavaScript [CanvasRenderingContext2D](https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D) to Kotlin
 */
actual external abstract class CanvasRenderingContext2D : CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasHitRegion, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, RenderingContext {
    actual open val canvas: HTMLCanvasElement
}

actual external interface CanvasState {
    actual fun save()
    actual fun restore()
}

actual external interface CanvasTransform {
    actual fun scale(x: Double, y: Double)
    actual fun rotate(angle: Double)
    actual fun translate(x: Double, y: Double)
    actual fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
    actual fun getTransform(): DOMMatrix
    actual fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
    actual fun setTransform(transform: dynamic)
    actual fun resetTransform()
}

actual external interface CanvasCompositing {
    actual var globalAlpha: Double
    actual var globalCompositeOperation: String
}

actual external interface CanvasImageSmoothing {
    actual var imageSmoothingEnabled: Boolean
    actual var imageSmoothingQuality: ImageSmoothingQuality
}

actual external interface CanvasFillStrokeStyles {
    actual var strokeStyle: dynamic
    actual var fillStyle: dynamic
    actual fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
    actual fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
    actual fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}

actual external interface CanvasShadowStyles {
    actual var shadowOffsetX: Double
    actual var shadowOffsetY: Double
    actual var shadowBlur: Double
    actual var shadowColor: String
}

actual external interface CanvasFilters {
    actual var filter: String
}

actual external interface CanvasRect {
    actual fun clearRect(x: Double, y: Double, w: Double, h: Double)
    actual fun fillRect(x: Double, y: Double, w: Double, h: Double)
    actual fun strokeRect(x: Double, y: Double, w: Double, h: Double)
}

actual external interface CanvasDrawPath {
    actual fun beginPath()
    actual fun fill(fillRule: CanvasFillRule)
    actual fun fill(path: Path2D, fillRule: CanvasFillRule)
    actual fun stroke()
    actual fun stroke(path: Path2D)
    actual fun clip(fillRule: CanvasFillRule)
    actual fun clip(path: Path2D, fillRule: CanvasFillRule)
    actual fun resetClip()
    actual fun isPointInPath(x: Double, y: Double, fillRule: CanvasFillRule): Boolean
    actual fun isPointInPath(path: Path2D, x: Double, y: Double, fillRule: CanvasFillRule): Boolean
    actual fun isPointInStroke(x: Double, y: Double): Boolean
    actual fun isPointInStroke(path: Path2D, x: Double, y: Double): Boolean
}

actual external interface CanvasUserInterface {
    actual fun drawFocusIfNeeded(element: Element)
    actual fun drawFocusIfNeeded(path: Path2D, element: Element)
    actual fun scrollPathIntoView()
    actual fun scrollPathIntoView(path: Path2D)
}

actual external interface CanvasText {
    actual fun fillText(text: String, x: Double, y: Double, maxWidth: Double)
    actual fun strokeText(text: String, x: Double, y: Double, maxWidth: Double)
    actual fun measureText(text: String): TextMetrics
}

actual external interface CanvasDrawImage {
    actual fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
    actual fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)
    actual fun drawImage(image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double)
}

actual external interface CanvasHitRegion {
    actual fun addHitRegion(options: HitRegionOptions)
    actual fun removeHitRegion(id: String)
    actual fun clearHitRegions()
}

actual external interface CanvasImageData {
    actual fun createImageData(sw: Double, sh: Double): ImageData
    actual fun createImageData(imagedata: ImageData): ImageData
    actual fun getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData
    actual fun putImageData(imagedata: ImageData, dx: Double, dy: Double)
    actual fun putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double, dirtyWidth: Double, dirtyHeight: Double)
}

actual external interface CanvasPathDrawingStyles {
    actual var lineWidth: Double
    actual var lineCap: CanvasLineCap
    actual var lineJoin: CanvasLineJoin
    actual var miterLimit: Double
    actual var lineDashOffset: Double
    actual fun setLineDash(segments: Array<Double>)
    actual fun getLineDash(): Array<Double>
}

actual external interface CanvasTextDrawingStyles {
    actual var font: String
    actual var textAlign: CanvasTextAlign
    actual var textBaseline: CanvasTextBaseline
    actual var direction: CanvasDirection
}

actual external interface CanvasPath {
    actual fun closePath()
    actual fun moveTo(x: Double, y: Double)
    actual fun lineTo(x: Double, y: Double)
    actual fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
    actual fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
    actual fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
    actual fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
    actual fun rect(x: Double, y: Double, w: Double, h: Double)
    actual fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean)
    actual fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean)
}

/**
 * Exposes the JavaScript [CanvasGradient](https://developer.mozilla.org/en/docs/Web/API/CanvasGradient) to Kotlin
 */
actual external abstract class CanvasGradient {
    actual fun addColorStop(offset: Double, color: String)
}

/**
 * Exposes the JavaScript [CanvasPattern](https://developer.mozilla.org/en/docs/Web/API/CanvasPattern) to Kotlin
 */
actual external abstract class CanvasPattern {
    actual fun setTransform(transform: dynamic)
}

/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
actual external abstract class TextMetrics {
    actual open val width: Double
    actual open val actualBoundingBoxLeft: Double
    actual open val actualBoundingBoxRight: Double
    actual open val fontBoundingBoxAscent: Double
    actual open val fontBoundingBoxDescent: Double
    actual open val actualBoundingBoxAscent: Double
    actual open val actualBoundingBoxDescent: Double
    actual open val emHeightAscent: Double
    actual open val emHeightDescent: Double
    actual open val hangingBaseline: Double
    actual open val alphabeticBaseline: Double
    actual open val ideographicBaseline: Double
}

actual external interface HitRegionOptions {
    actual var path: Path2D? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var fillRule: CanvasFillRule? /* = CanvasFillRule.NONZERO */
        get() = definedExternally
        set(value) = definedExternally
    actual var id: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var parentID: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var cursor: String? /* = "inherit" */
        get() = definedExternally
        set(value) = definedExternally
    actual var control: Element? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var label: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var role: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun HitRegionOptions(path: Path2D?, fillRule: CanvasFillRule?, id: String?, parentID: String?, cursor: String?, control: Element?, label: String?, role: String?): HitRegionOptions {
    val o = js("({})")
    o["path"] = path
    o["fillRule"] = fillRule
    o["id"] = id
    o["parentID"] = parentID
    o["cursor"] = cursor
    o["control"] = control
    o["label"] = label
    o["role"] = role
    return o as HitRegionOptions
}

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
actual external open class ImageData : ImageBitmapSource, TexImageSource {
    actual constructor(sw: Int, sh: Int)
    actual constructor(data: Uint8ClampedArray, sw: Int, sh: Int)
    actual open val width: Int
    actual open val height: Int
    actual open val data: Uint8ClampedArray
}

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
actual external open class Path2D actual constructor() : CanvasPath {
    actual constructor(path: Path2D)
    actual constructor(paths: Array<Path2D>, fillRule: CanvasFillRule)
    actual constructor(d: String)
    actual fun addPath(path: Path2D, transform: dynamic)
    actual override fun closePath()
    actual override fun moveTo(x: Double, y: Double)
    actual override fun lineTo(x: Double, y: Double)
    actual override fun quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double)
    actual override fun bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double)
    actual override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double)
    actual override fun arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radiusX: Double, radiusY: Double, rotation: Double)
    actual override fun rect(x: Double, y: Double, w: Double, h: Double)
    actual override fun arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean /* = definedExternally */)
    actual override fun ellipse(x: Double, y: Double, radiusX: Double, radiusY: Double, rotation: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean /* = definedExternally */)
}

/**
 * Exposes the JavaScript [ImageBitmapRenderingContext](https://developer.mozilla.org/en/docs/Web/API/ImageBitmapRenderingContext) to Kotlin
 */
actual external abstract class ImageBitmapRenderingContext {
    actual open val canvas: HTMLCanvasElement
    actual fun transferFromImageBitmap(bitmap: ImageBitmap?)
}

actual external interface ImageBitmapRenderingContextSettings {
    actual var alpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ImageBitmapRenderingContextSettings(alpha: Boolean?): ImageBitmapRenderingContextSettings {
    val o = js("({})")
    o["alpha"] = alpha
    return o as ImageBitmapRenderingContextSettings
}

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
actual external abstract class CustomElementRegistry {
    actual fun define(name: String, constructor: () -> dynamic, options: ElementDefinitionOptions)
    actual fun get(name: String): Any?
    actual fun whenDefined(name: String): Promise<Unit>
}

actual external interface ElementDefinitionOptions {
    actual var extends: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ElementDefinitionOptions(extends_: String?): ElementDefinitionOptions {
    val o = js("({})")
    o["extends"] = extends_
    return o as ElementDefinitionOptions
}

actual external interface ElementContentEditable {
    actual var contentEditable: String
    actual val isContentEditable: Boolean
}

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
actual external abstract class DataTransfer {
    actual open var dropEffect: String
    actual open var effectAllowed: String
    actual open val items: DataTransferItemList
    actual open val types: Array<out String>
    actual open val files: FileList
    actual fun setDragImage(image: Element, x: Int, y: Int)
    actual fun getData(format: String): String
    actual fun setData(format: String, data: String)
    actual fun clearData(format: String)
}

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
actual external abstract class DataTransferItemList {
    actual open val length: Int
    actual fun add(data: String, type: String): DataTransferItem?
    actual fun add(data: File): DataTransferItem?
    actual fun remove(index: Int)
    actual fun clear()
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun DataTransferItemList.get(index: Int): DataTransferItem? = asDynamic()[index]

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
actual external abstract class DataTransferItem {
    actual open val kind: String
    actual open val type: String
    actual fun getAsString(_callback: ((String) -> Unit)?)
    actual fun getAsFile(): File?
}

/**
 * Exposes the JavaScript [DragEvent](https://developer.mozilla.org/en/docs/Web/API/DragEvent) to Kotlin
 */
actual external open class DragEvent actual constructor(type: String, eventInitDict: DragEventInit) : MouseEvent {
    actual open val dataTransfer: DataTransfer?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface DragEventInit : MouseEventInit {
    actual var dataTransfer: DataTransfer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun DragEventInit(dataTransfer: DataTransfer?, screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): DragEventInit {
    val o = js("({})")
    o["dataTransfer"] = dataTransfer
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
    return o as DragEventInit
}

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
actual external abstract class Window : EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowOrWorkerGlobalScope, WindowSessionStorage, WindowLocalStorage, GlobalPerformance, UnionMessagePortOrWindowProxy {
    actual open val window: Window
    actual open val self: Window
    actual open val document: Document
    actual open var name: String
    actual open val location: Location
    actual open val history: History
    actual open val customElements: CustomElementRegistry
    actual open val locationbar: BarProp
    actual open val menubar: BarProp
    actual open val personalbar: BarProp
    actual open val scrollbars: BarProp
    actual open val statusbar: BarProp
    actual open val toolbar: BarProp
    actual open var status: String
    actual open val closed: Boolean
    actual open val frames: Window
    actual open val length: Int
    actual open val top: Window
    actual open var opener: Any?
    actual open val parent: Window
    actual open val frameElement: Element?
    actual open val navigator: Navigator
    actual open val applicationCache: ApplicationCache
    actual open val external: External
    actual open val screen: Screen
    actual open val innerWidth: Int
    actual open val innerHeight: Int
    actual open val scrollX: Double
    actual open val pageXOffset: Double
    actual open val scrollY: Double
    actual open val pageYOffset: Double
    actual open val screenX: Int
    actual open val screenY: Int
    actual open val outerWidth: Int
    actual open val outerHeight: Int
    actual open val devicePixelRatio: Double
    actual fun close()
    actual fun stop()
    actual fun focus()
    actual fun blur()
    actual fun open(url: String, target: String, features: String): Window?
    actual fun alert()
    actual fun alert(message: String)
    actual fun confirm(message: String): Boolean
    actual fun prompt(message: String, default: String): String?
    actual fun print()
    actual fun requestAnimationFrame(callback: (Double) -> Unit): Int
    actual fun cancelAnimationFrame(handle: Int)
    actual fun postMessage(message: Any?, targetOrigin: String, transfer: Array<dynamic>)
    actual fun captureEvents()
    actual fun releaseEvents()
    actual fun matchMedia(query: String): MediaQueryList
    actual fun moveTo(x: Int, y: Int)
    actual fun moveBy(x: Int, y: Int)
    actual fun resizeTo(x: Int, y: Int)
    actual fun resizeBy(x: Int, y: Int)
    actual fun scroll(options: ScrollToOptions)
    actual fun scroll(x: Double, y: Double)
    actual fun scrollTo(options: ScrollToOptions)
    actual fun scrollTo(x: Double, y: Double)
    actual fun scrollBy(options: ScrollToOptions)
    actual fun scrollBy(x: Double, y: Double)
    actual fun getComputedStyle(elt: Element, pseudoElt: String?): CSSStyleDeclaration
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun Window.get(name: String): dynamic = asDynamic()[name]

actual external abstract class BarProp {
    actual open val visible: Boolean
}

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
actual external abstract class History {
    actual open val length: Int
    actual open var scrollRestoration: ScrollRestoration
    actual open val state: Any?
    actual fun go(delta: Int)
    actual fun back()
    actual fun forward()
    actual fun pushState(data: Any?, title: String, url: String?)
    actual fun replaceState(data: Any?, title: String, url: String?)
}

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
actual external abstract class Location {
    actual open var href: String
    actual open val origin: String
    actual open var protocol: String
    actual open var host: String
    actual open var hostname: String
    actual open var port: String
    actual open var pathname: String
    actual open var search: String
    actual open var hash: String
    actual open val ancestorOrigins: Array<out String>
    actual fun assign(url: String)
    actual fun replace(url: String)
    actual fun reload()
}

/**
 * Exposes the JavaScript [PopStateEvent](https://developer.mozilla.org/en/docs/Web/API/PopStateEvent) to Kotlin
 */
actual external open class PopStateEvent actual constructor(type: String, eventInitDict: PopStateEventInit) : Event {
    actual open val state: Any?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface PopStateEventInit : EventInit {
    actual var state: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun PopStateEventInit(state: Any?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PopStateEventInit {
    val o = js("({})")
    o["state"] = state
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as PopStateEventInit
}

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
actual external open class HashChangeEvent actual constructor(type: String, eventInitDict: HashChangeEventInit) : Event {
    actual open val oldURL: String
    actual open val newURL: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface HashChangeEventInit : EventInit {
    actual var oldURL: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var newURL: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun HashChangeEventInit(oldURL: String?, newURL: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): HashChangeEventInit {
    val o = js("({})")
    o["oldURL"] = oldURL
    o["newURL"] = newURL
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as HashChangeEventInit
}

/**
 * Exposes the JavaScript [PageTransitionEvent](https://developer.mozilla.org/en/docs/Web/API/PageTransitionEvent) to Kotlin
 */
actual external open class PageTransitionEvent actual constructor(type: String, eventInitDict: PageTransitionEventInit) : Event {
    actual open val persisted: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface PageTransitionEventInit : EventInit {
    actual var persisted: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun PageTransitionEventInit(persisted: Boolean?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PageTransitionEventInit {
    val o = js("({})")
    o["persisted"] = persisted
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as PageTransitionEventInit
}

/**
 * Exposes the JavaScript [BeforeUnloadEvent](https://developer.mozilla.org/en/docs/Web/API/BeforeUnloadEvent) to Kotlin
 */
actual external open class BeforeUnloadEvent : Event {
    actual var returnValue: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external abstract class ApplicationCache : EventTarget {
    actual open val status: Short
    actual open var onchecking: ((Event) -> dynamic)?
    actual open var onerror: ((Event) -> dynamic)?
    actual open var onnoupdate: ((Event) -> dynamic)?
    actual open var ondownloading: ((Event) -> dynamic)?
    actual open var onprogress: ((ProgressEvent) -> dynamic)?
    actual open var onupdateready: ((Event) -> dynamic)?
    actual open var oncached: ((Event) -> dynamic)?
    actual open var onobsolete: ((Event) -> dynamic)?
    actual fun update()
    actual fun abort()
    actual fun swapCache()

    actual companion object {
        actual val UNCACHED: Short
        actual val IDLE: Short
        actual val CHECKING: Short
        actual val DOWNLOADING: Short
        actual val UPDATEREADY: Short
        actual val OBSOLETE: Short
    }
}

/**
 * Exposes the JavaScript [NavigatorOnLine](https://developer.mozilla.org/en/docs/Web/API/NavigatorOnLine) to Kotlin
 */
actual external interface NavigatorOnLine {
    actual val onLine: Boolean
}

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
actual external open class ErrorEvent actual constructor(type: String, eventInitDict: ErrorEventInit) : Event {
    actual open val message: String
    actual open val filename: String
    actual open val lineno: Int
    actual open val colno: Int
    actual open val error: Any?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ErrorEventInit : EventInit {
    actual var message: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var filename: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var lineno: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var colno: Int? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var error: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ErrorEventInit(message: String?, filename: String?, lineno: Int?, colno: Int?, error: Any?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ErrorEventInit {
    val o = js("({})")
    o["message"] = message
    o["filename"] = filename
    o["lineno"] = lineno
    o["colno"] = colno
    o["error"] = error
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as ErrorEventInit
}

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
actual external open class PromiseRejectionEvent actual constructor(type: String, eventInitDict: PromiseRejectionEventInit) : Event {
    actual open val promise: Promise<Any?>
    actual open val reason: Any?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface PromiseRejectionEventInit : EventInit {
    actual var promise: Promise<Any?>?
    actual var reason: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun PromiseRejectionEventInit(promise: Promise<Any?>?, reason: Any?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PromiseRejectionEventInit {
    val o = js("({})")
    o["promise"] = promise
    o["reason"] = reason
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as PromiseRejectionEventInit
}

/**
 * Exposes the JavaScript [GlobalEventHandlers](https://developer.mozilla.org/en/docs/Web/API/GlobalEventHandlers) to Kotlin
 */
actual external interface GlobalEventHandlers {
    actual var onabort: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onblur: ((FocusEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncancel: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncanplay: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncanplaythrough: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onchange: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onclick: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onclose: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncontextmenu: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncuechange: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondblclick: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondrag: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragend: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragenter: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragexit: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragleave: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragover: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragstart: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondrop: ((DragEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondurationchange: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onemptied: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onended: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onfocus: ((FocusEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oninput: ((InputEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oninvalid: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onkeydown: ((KeyboardEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onkeypress: ((KeyboardEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onkeyup: ((KeyboardEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onload: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadeddata: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadedmetadata: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadend: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadstart: ((ProgressEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmousedown: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseenter: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseleave: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmousemove: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseout: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseover: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseup: ((MouseEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onwheel: ((WheelEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpause: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onplay: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onplaying: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onprogress: ((ProgressEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onratechange: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onreset: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onresize: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onscroll: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onseeked: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onseeking: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onselect: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onshow: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onstalled: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onsubmit: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onsuspend: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ontimeupdate: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ontoggle: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onvolumechange: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onwaiting: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ongotpointercapture: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onlostpointercapture: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerdown: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointermove: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerup: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointercancel: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerover: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerout: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerenter: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerleave: ((PointerEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
actual external interface WindowEventHandlers {
    actual var onafterprint: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onbeforeprint: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onhashchange: ((HashChangeEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onlanguagechange: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmessage: ((MessageEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onoffline: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ononline: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpagehide: ((PageTransitionEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpageshow: ((PageTransitionEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpopstate: ((PopStateEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onrejectionhandled: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onstorage: ((StorageEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onunhandledrejection: ((PromiseRejectionEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onunload: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

actual external interface DocumentAndElementEventHandlers {
    actual var oncopy: ((ClipboardEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncut: ((ClipboardEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpaste: ((ClipboardEvent) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

/**
 * Exposes the JavaScript [WindowOrWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WindowOrWorkerGlobalScope) to Kotlin
 */
actual external interface WindowOrWorkerGlobalScope {
    actual val origin: String
    actual val caches: CacheStorage
    actual fun btoa(data: String): String
    actual fun atob(data: String): String
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun setTimeout(handler: dynamic, timeout: Int, vararg arguments: Any?): Int
    actual fun clearTimeout(handle: Int)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun setInterval(handler: dynamic, timeout: Int, vararg arguments: Any?): Int
    actual fun clearInterval(handle: Int)
    actual fun createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): Promise<ImageBitmap>
    actual fun createImageBitmap(image: ImageBitmapSource, sx: Int, sy: Int, sw: Int, sh: Int, options: ImageBitmapOptions): Promise<ImageBitmap>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun fetch(input: dynamic, init: RequestInit): Promise<Response>
}

/**
 * Exposes the JavaScript [Navigator](https://developer.mozilla.org/en/docs/Web/API/Navigator) to Kotlin
 */
actual external abstract class Navigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils, NavigatorCookies, NavigatorPlugins, NavigatorConcurrentHardware {
    actual open val clipboard: Clipboard
    actual open val mediaDevices: MediaDevices
    actual open val maxTouchPoints: Int
    actual open val serviceWorker: ServiceWorkerContainer
    actual fun requestMediaKeySystemAccess(keySystem: String, supportedConfigurations: Array<MediaKeySystemConfiguration>): Promise<MediaKeySystemAccess>
    actual fun getUserMedia(constraints: MediaStreamConstraints, successCallback: (MediaStream) -> Unit, errorCallback: (dynamic) -> Unit)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun vibrate(pattern: dynamic): Boolean
}

/**
 * Exposes the JavaScript [NavigatorID](https://developer.mozilla.org/en/docs/Web/API/NavigatorID) to Kotlin
 */
actual external interface NavigatorID {
    actual val appCodeName: String
    actual val appName: String
    actual val appVersion: String
    actual val platform: String
    actual val product: String
    actual val productSub: String
    actual val userAgent: String
    actual val vendor: String
    actual val vendorSub: String
    actual val oscpu: String
    actual fun taintEnabled(): Boolean
}

/**
 * Exposes the JavaScript [NavigatorLanguage](https://developer.mozilla.org/en/docs/Web/API/NavigatorLanguage) to Kotlin
 */
actual external interface NavigatorLanguage {
    actual val language: String
    actual val languages: Array<out String>
}

actual external interface NavigatorContentUtils {
    actual fun registerProtocolHandler(scheme: String, url: String, title: String)
    actual fun registerContentHandler(mimeType: String, url: String, title: String)
    actual fun isProtocolHandlerRegistered(scheme: String, url: String): String
    actual fun isContentHandlerRegistered(mimeType: String, url: String): String
    actual fun unregisterProtocolHandler(scheme: String, url: String)
    actual fun unregisterContentHandler(mimeType: String, url: String)
}

actual external interface NavigatorCookies {
    actual val cookieEnabled: Boolean
}

/**
 * Exposes the JavaScript [NavigatorPlugins](https://developer.mozilla.org/en/docs/Web/API/NavigatorPlugins) to Kotlin
 */
actual external interface NavigatorPlugins {
    actual val plugins: PluginArray
    actual val mimeTypes: MimeTypeArray
    actual fun javaEnabled(): Boolean
}

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
actual external abstract class PluginArray : ItemArrayLike<Plugin> {
    actual fun refresh(reload: Boolean)
    actual override fun item(index: Int): Plugin?
    actual fun namedItem(name: String): Plugin?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun PluginArray.get(index: Int): Plugin? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun PluginArray.get(name: String): Plugin? = asDynamic()[name]

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
actual external abstract class MimeTypeArray : ItemArrayLike<MimeType> {
    actual override fun item(index: Int): MimeType?
    actual fun namedItem(name: String): MimeType?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun MimeTypeArray.get(index: Int): MimeType? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun MimeTypeArray.get(name: String): MimeType? = asDynamic()[name]

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
actual external abstract class Plugin : ItemArrayLike<MimeType> {
    actual open val name: String
    actual open val description: String
    actual open val filename: String
    actual override fun item(index: Int): MimeType?
    actual fun namedItem(name: String): MimeType?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun Plugin.get(index: Int): MimeType? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun Plugin.get(name: String): MimeType? = asDynamic()[name]

/**
 * Exposes the JavaScript [MimeType](https://developer.mozilla.org/en/docs/Web/API/MimeType) to Kotlin
 */
actual external abstract class MimeType {
    actual open val type: String
    actual open val description: String
    actual open val suffixes: String
    actual open val enabledPlugin: Plugin
}

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
actual external abstract class ImageBitmap : CanvasImageSource, TexImageSource {
    actual open val width: Int
    actual open val height: Int
    actual fun close()
}

actual external interface ImageBitmapOptions {
    actual var imageOrientation: ImageOrientation? /* = ImageOrientation.NONE */
        get() = definedExternally
        set(value) = definedExternally
    actual var premultiplyAlpha: PremultiplyAlpha? /* = PremultiplyAlpha.DEFAULT */
        get() = definedExternally
        set(value) = definedExternally
    actual var colorSpaceConversion: ColorSpaceConversion? /* = ColorSpaceConversion.DEFAULT */
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeWidth: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeHeight: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeQuality: ResizeQuality? /* = ResizeQuality.LOW */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ImageBitmapOptions(imageOrientation: ImageOrientation?, premultiplyAlpha: PremultiplyAlpha?, colorSpaceConversion: ColorSpaceConversion?, resizeWidth: Int?, resizeHeight: Int?, resizeQuality: ResizeQuality?): ImageBitmapOptions {
    val o = js("({})")
    o["imageOrientation"] = imageOrientation
    o["premultiplyAlpha"] = premultiplyAlpha
    o["colorSpaceConversion"] = colorSpaceConversion
    o["resizeWidth"] = resizeWidth
    o["resizeHeight"] = resizeHeight
    o["resizeQuality"] = resizeQuality
    return o as ImageBitmapOptions
}

/**
 * Exposes the JavaScript [MessageEvent](https://developer.mozilla.org/en/docs/Web/API/MessageEvent) to Kotlin
 */
actual external open class MessageEvent actual constructor(type: String, eventInitDict: MessageEventInit) : Event {
    actual open val data: Any?
    actual open val origin: String
    actual open val lastEventId: String
    actual open val source: UnionMessagePortOrWindowProxy?
    actual open val ports: Array<out MessagePort>
    actual fun initMessageEvent(type: String, bubbles: Boolean, cancelable: Boolean, data: Any?, origin: String, lastEventId: String, source: UnionMessagePortOrWindowProxy?, ports: Array<MessagePort>)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface MessageEventInit : EventInit {
    actual var data: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var origin: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var lastEventId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var source: UnionMessagePortOrWindowProxy? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var ports: Array<MessagePort>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MessageEventInit(data: Any?, origin: String?, lastEventId: String?, source: UnionMessagePortOrWindowProxy?, ports: Array<MessagePort>?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MessageEventInit {
    val o = js("({})")
    o["data"] = data
    o["origin"] = origin
    o["lastEventId"] = lastEventId
    o["source"] = source
    o["ports"] = ports
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as MessageEventInit
}

/**
 * Exposes the JavaScript [EventSource](https://developer.mozilla.org/en/docs/Web/API/EventSource) to Kotlin
 */
actual external open class EventSource actual constructor(url: String, eventSourceInitDict: EventSourceInit) : EventTarget {
    actual open val url: String
    actual open val withCredentials: Boolean
    actual open val readyState: Short
    actual var onopen: ((Event) -> dynamic)?
    actual var onmessage: ((MessageEvent) -> dynamic)?
    actual var onerror: ((Event) -> dynamic)?
    actual fun close()

    actual companion object {
        actual val CONNECTING: Short
        actual val OPEN: Short
        actual val CLOSED: Short
    }
}

actual external interface EventSourceInit {
    actual var withCredentials: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun EventSourceInit(withCredentials: Boolean?): EventSourceInit {
    val o = js("({})")
    o["withCredentials"] = withCredentials
    return o as EventSourceInit
}

/**
 * Exposes the JavaScript [WebSocket](https://developer.mozilla.org/en/docs/Web/API/WebSocket) to Kotlin
 */
actual external open class WebSocket actual constructor(url: String, protocols: dynamic) : EventTarget {
    actual open val url: String
    actual open val readyState: Short
    actual open val bufferedAmount: Number
    actual var onopen: ((Event) -> dynamic)?
    actual var onerror: ((Event) -> dynamic)?
    actual var onclose: ((Event) -> dynamic)?
    actual open val extensions: String
    actual open val protocol: String
    actual var onmessage: ((MessageEvent) -> dynamic)?
    actual var binaryType: BinaryType
    actual fun close(code: Short, reason: String)
    actual fun send(data: String)
    actual fun send(data: Blob)
    actual fun send(data: ArrayBuffer)
    actual fun send(data: ArrayBufferView)

    actual companion object {
        actual val CONNECTING: Short
        actual val OPEN: Short
        actual val CLOSING: Short
        actual val CLOSED: Short
    }
}

/**
 * Exposes the JavaScript [CloseEvent](https://developer.mozilla.org/en/docs/Web/API/CloseEvent) to Kotlin
 */
actual external open class CloseEvent actual constructor(type: String, eventInitDict: CloseEventInit) : Event {
    actual open val wasClean: Boolean
    actual open val code: Short
    actual open val reason: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface CloseEventInit : EventInit {
    actual var wasClean: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var code: Short? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var reason: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun CloseEventInit(wasClean: Boolean?, code: Short?, reason: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): CloseEventInit {
    val o = js("({})")
    o["wasClean"] = wasClean
    o["code"] = code
    o["reason"] = reason
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as CloseEventInit
}

/**
 * Exposes the JavaScript [MessageChannel](https://developer.mozilla.org/en/docs/Web/API/MessageChannel) to Kotlin
 */
actual external open class MessageChannel actual constructor() {
    actual open val port1: MessagePort
    actual open val port2: MessagePort
}

/**
 * Exposes the JavaScript [MessagePort](https://developer.mozilla.org/en/docs/Web/API/MessagePort) to Kotlin
 */
actual external abstract class MessagePort : EventTarget, UnionMessagePortOrWindowProxy, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker {
    actual open var onmessage: ((MessageEvent) -> dynamic)?
    actual fun postMessage(message: Any?, transfer: Array<dynamic>)
    actual fun start()
    actual fun close()
}

/**
 * Exposes the JavaScript [BroadcastChannel](https://developer.mozilla.org/en/docs/Web/API/BroadcastChannel) to Kotlin
 */
actual external open class BroadcastChannel actual constructor(name: String) : EventTarget {
    actual open val name: String
    actual var onmessage: ((MessageEvent) -> dynamic)?
    actual fun postMessage(message: Any?)
    actual fun close()
}

/**
 * Exposes the JavaScript [WorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WorkerGlobalScope) to Kotlin
 */
actual external abstract class WorkerGlobalScope : EventTarget, WindowOrWorkerGlobalScope, GlobalPerformance {
    actual open val self: WorkerGlobalScope
    actual open val location: WorkerLocation
    actual open val navigator: WorkerNavigator
    actual open var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
    actual open var onlanguagechange: ((Event) -> dynamic)?
    actual open var onoffline: ((Event) -> dynamic)?
    actual open var ononline: ((Event) -> dynamic)?
    actual open var onrejectionhandled: ((Event) -> dynamic)?
    actual open var onunhandledrejection: ((PromiseRejectionEvent) -> dynamic)?
    actual fun importScripts(vararg urls: String)
}

/**
 * Exposes the JavaScript [DedicatedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/DedicatedWorkerGlobalScope) to Kotlin
 */
actual external abstract class DedicatedWorkerGlobalScope : WorkerGlobalScope {
    actual open var onmessage: ((MessageEvent) -> dynamic)?
    actual fun postMessage(message: Any?, transfer: Array<dynamic>)
    actual fun close()
}

/**
 * Exposes the JavaScript [SharedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/SharedWorkerGlobalScope) to Kotlin
 */
actual external abstract class SharedWorkerGlobalScope : WorkerGlobalScope {
    actual open val name: String
    actual open val applicationCache: ApplicationCache
    actual open var onconnect: ((Event) -> dynamic)?
    actual fun close()
}

/**
 * Exposes the JavaScript [AbstractWorker](https://developer.mozilla.org/en/docs/Web/API/AbstractWorker) to Kotlin
 */
actual external interface AbstractWorker {
    actual var onerror: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

/**
 * Exposes the JavaScript [Worker](https://developer.mozilla.org/en/docs/Web/API/Worker) to Kotlin
 */
actual external open class Worker actual constructor(scriptURL: String, options: WorkerOptions) : EventTarget, AbstractWorker {
    actual var onmessage: ((MessageEvent) -> dynamic)?
    actual override var onerror: ((Event) -> dynamic)?
    actual fun terminate()
    actual fun postMessage(message: Any?, transfer: Array<dynamic>)
}

actual external interface WorkerOptions {
    actual var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
    actual var credentials: RequestCredentials? /* = RequestCredentials.OMIT */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun WorkerOptions(type: WorkerType?, credentials: RequestCredentials?): WorkerOptions {
    val o = js("({})")
    o["type"] = type
    o["credentials"] = credentials
    return o as WorkerOptions
}

/**
 * Exposes the JavaScript [SharedWorker](https://developer.mozilla.org/en/docs/Web/API/SharedWorker) to Kotlin
 */
actual external open class SharedWorker actual constructor(scriptURL: String, name: String, options: WorkerOptions) : EventTarget, AbstractWorker {
    actual open val port: MessagePort
    actual override var onerror: ((Event) -> dynamic)?
}

/**
 * Exposes the JavaScript [NavigatorConcurrentHardware](https://developer.mozilla.org/en/docs/Web/API/NavigatorConcurrentHardware) to Kotlin
 */
actual external interface NavigatorConcurrentHardware {
    actual val hardwareConcurrency: Number
}

/**
 * Exposes the JavaScript [WorkerNavigator](https://developer.mozilla.org/en/docs/Web/API/WorkerNavigator) to Kotlin
 */
actual external abstract class WorkerNavigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorConcurrentHardware {
    actual open val serviceWorker: ServiceWorkerContainer
}

/**
 * Exposes the JavaScript [WorkerLocation](https://developer.mozilla.org/en/docs/Web/API/WorkerLocation) to Kotlin
 */
actual external abstract class WorkerLocation {
    actual open val href: String
    actual open val origin: String
    actual open val protocol: String
    actual open val host: String
    actual open val hostname: String
    actual open val port: String
    actual open val pathname: String
    actual open val search: String
    actual open val hash: String
}

/**
 * Exposes the JavaScript [Storage](https://developer.mozilla.org/en/docs/Web/API/Storage) to Kotlin
 */
actual external abstract class Storage {
    actual open val length: Int
    actual fun key(index: Int): String?
    actual fun removeItem(key: String)
    actual fun clear()
    actual fun getItem(key: String): String?
    actual fun setItem(key: String, value: String)
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun Storage.get(key: String): String? = asDynamic()[key]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun Storage.set(key: String, value: String) { asDynamic()[key] = value }

/**
 * Exposes the JavaScript [WindowSessionStorage](https://developer.mozilla.org/en/docs/Web/API/WindowSessionStorage) to Kotlin
 */
actual external interface WindowSessionStorage {
    actual val sessionStorage: Storage
}

/**
 * Exposes the JavaScript [WindowLocalStorage](https://developer.mozilla.org/en/docs/Web/API/WindowLocalStorage) to Kotlin
 */
actual external interface WindowLocalStorage {
    actual val localStorage: Storage
}

/**
 * Exposes the JavaScript [StorageEvent](https://developer.mozilla.org/en/docs/Web/API/StorageEvent) to Kotlin
 */
actual external open class StorageEvent actual constructor(type: String, eventInitDict: StorageEventInit) : Event {
    actual open val key: String?
    actual open val oldValue: String?
    actual open val newValue: String?
    actual open val url: String
    actual open val storageArea: Storage?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface StorageEventInit : EventInit {
    actual var key: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var oldValue: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var newValue: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var url: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var storageArea: Storage? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun StorageEventInit(key: String?, oldValue: String?, newValue: String?, url: String?, storageArea: Storage?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): StorageEventInit {
    val o = js("({})")
    o["key"] = key
    o["oldValue"] = oldValue
    o["newValue"] = newValue
    o["url"] = url
    o["storageArea"] = storageArea
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as StorageEventInit
}

actual external abstract class HTMLAppletElement : HTMLElement {
    actual open var align: String
    actual open var alt: String
    actual open var archive: String
    actual open var code: String
    actual open var codeBase: String
    actual open var height: String
    actual open var hspace: Int
    actual open var name: String
    actual open var _object: String
    actual open var vspace: Int
    actual open var width: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLMarqueeElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMarqueeElement) to Kotlin
 */
actual external abstract class HTMLMarqueeElement : HTMLElement {
    actual open var behavior: String
    actual open var bgColor: String
    actual open var direction: String
    actual open var height: String
    actual open var hspace: Int
    actual open var loop: Int
    actual open var scrollAmount: Int
    actual open var scrollDelay: Int
    actual open var trueSpeed: Boolean
    actual open var vspace: Int
    actual open var width: String
    actual open var onbounce: ((Event) -> dynamic)?
    actual open var onfinish: ((Event) -> dynamic)?
    actual open var onstart: ((Event) -> dynamic)?
    actual fun start()
    actual fun stop()

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLFrameSetElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFrameSetElement) to Kotlin
 */
actual external abstract class HTMLFrameSetElement : HTMLElement, WindowEventHandlers {
    actual open var cols: String
    actual open var rows: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external abstract class HTMLFrameElement : HTMLElement {
    actual open var name: String
    actual open var scrolling: String
    actual open var src: String
    actual open var frameBorder: String
    actual open var longDesc: String
    actual open var noResize: Boolean
    actual open val contentDocument: Document?
    actual open val contentWindow: Window?
    actual open var marginHeight: String
    actual open var marginWidth: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external abstract class HTMLDirectoryElement : HTMLElement {
    actual open var compact: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [HTMLFontElement](https://developer.mozilla.org/en/docs/Web/API/HTMLFontElement) to Kotlin
 */
actual external abstract class HTMLFontElement : HTMLElement {
    actual open var color: String
    actual open var face: String
    actual open var size: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface External {
    actual fun AddSearchProvider()
    actual fun IsSearchProviderInstalled()
}

actual external interface EventInit {
    actual var bubbles: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var cancelable: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var composed: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun EventInit(bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): EventInit {
    val o = js("({})")
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as EventInit
}

/**
 * Exposes the JavaScript [CustomEvent](https://developer.mozilla.org/en/docs/Web/API/CustomEvent) to Kotlin
 */
actual external open class CustomEvent actual constructor(type: String, eventInitDict: CustomEventInit) : Event {
    actual open val detail: Any?
    actual fun initCustomEvent(type: String, bubbles: Boolean, cancelable: Boolean, detail: Any?)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface CustomEventInit : EventInit {
    actual var detail: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun CustomEventInit(detail: Any?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): CustomEventInit {
    val o = js("({})")
    o["detail"] = detail
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as CustomEventInit
}

actual external interface EventListenerOptions {
    actual var capture: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun EventListenerOptions(capture: Boolean?): EventListenerOptions {
    val o = js("({})")
    o["capture"] = capture
    return o as EventListenerOptions
}

actual external interface AddEventListenerOptions : EventListenerOptions {
    actual var passive: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var once: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun AddEventListenerOptions(passive: Boolean?, once: Boolean?, capture: Boolean?): AddEventListenerOptions {
    val o = js("({})")
    o["passive"] = passive
    o["once"] = once
    o["capture"] = capture
    return o as AddEventListenerOptions
}

actual external interface NonElementParentNode {
    actual fun getElementById(elementId: String): Element?
}

/**
 * Exposes the JavaScript [DocumentOrShadowRoot](https://developer.mozilla.org/en/docs/Web/API/DocumentOrShadowRoot) to Kotlin
 */
actual external interface DocumentOrShadowRoot {
    actual val fullscreenElement: Element?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
actual external interface ParentNode {
    actual val children: HTMLCollection
    actual val firstElementChild: Element?
        get() = definedExternally
    actual val lastElementChild: Element?
        get() = definedExternally
    actual val childElementCount: Int
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun prepend(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun append(vararg nodes: dynamic)
    actual fun querySelector(selectors: String): Element?
    actual fun querySelectorAll(selectors: String): NodeList
}

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
actual external interface NonDocumentTypeChildNode {
    actual val previousElementSibling: Element?
        get() = definedExternally
    actual val nextElementSibling: Element?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
actual external interface ChildNode {
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun before(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun after(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun replaceWith(vararg nodes: dynamic)
    actual fun remove()
}

/**
 * Exposes the JavaScript [Slotable](https://developer.mozilla.org/en/docs/Web/API/Slotable) to Kotlin
 */
actual external interface Slotable {
    actual val assignedSlot: HTMLSlotElement?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
actual external abstract class NodeList : ItemArrayLike<Node> {
    actual override fun item(index: Int): Node?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun NodeList.get(index: Int): Node? = asDynamic()[index]

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
actual external abstract class HTMLCollection : ItemArrayLike<Element>, UnionElementOrHTMLCollection {
    actual override fun item(index: Int): Element?
    actual fun namedItem(name: String): Element?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLCollection.get(index: Int): Element? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun HTMLCollection.get(name: String): Element? = asDynamic()[name]

/**
 * Exposes the JavaScript [MutationObserver](https://developer.mozilla.org/en/docs/Web/API/MutationObserver) to Kotlin
 */
actual external open class MutationObserver actual constructor(callback: (Array<MutationRecord>, MutationObserver) -> Unit) {
    actual fun observe(target: Node, options: MutationObserverInit)
    actual fun disconnect()
    actual fun takeRecords(): Array<MutationRecord>
}

/**
 * Exposes the JavaScript [MutationObserverInit](https://developer.mozilla.org/en/docs/Web/API/MutationObserverInit) to Kotlin
 */
actual external interface MutationObserverInit {
    actual var childList: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var attributes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var characterData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var subtree: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var attributeOldValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var characterDataOldValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var attributeFilter: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MutationObserverInit(childList: Boolean?, attributes: Boolean?, characterData: Boolean?, subtree: Boolean?, attributeOldValue: Boolean?, characterDataOldValue: Boolean?, attributeFilter: Array<String>?): MutationObserverInit {
    val o = js("({})")
    o["childList"] = childList
    o["attributes"] = attributes
    o["characterData"] = characterData
    o["subtree"] = subtree
    o["attributeOldValue"] = attributeOldValue
    o["characterDataOldValue"] = characterDataOldValue
    o["attributeFilter"] = attributeFilter
    return o as MutationObserverInit
}

/**
 * Exposes the JavaScript [MutationRecord](https://developer.mozilla.org/en/docs/Web/API/MutationRecord) to Kotlin
 */
actual external abstract class MutationRecord {
    actual open val type: String
    actual open val target: Node
    actual open val addedNodes: NodeList
    actual open val removedNodes: NodeList
    actual open val previousSibling: Node?
    actual open val nextSibling: Node?
    actual open val attributeName: String?
    actual open val attributeNamespace: String?
    actual open val oldValue: String?
}

/**
 * Exposes the JavaScript [Node](https://developer.mozilla.org/en/docs/Web/API/Node) to Kotlin
 */
actual external abstract class Node : EventTarget {
    actual open val nodeType: Short
    actual open val nodeName: String
    actual open val baseURI: String
    actual open val isConnected: Boolean
    actual open val ownerDocument: Document?
    actual open val parentNode: Node?
    actual open val parentElement: Element?
    actual open val childNodes: NodeList
    actual open val firstChild: Node?
    actual open val lastChild: Node?
    actual open val previousSibling: Node?
    actual open val nextSibling: Node?
    actual open var nodeValue: String?
    actual open var textContent: String?
    actual fun getRootNode(options: GetRootNodeOptions): Node
    actual fun hasChildNodes(): Boolean
    actual fun normalize()
    actual fun cloneNode(deep: Boolean): Node
    actual fun isEqualNode(otherNode: Node?): Boolean
    actual fun isSameNode(otherNode: Node?): Boolean
    actual fun compareDocumentPosition(other: Node): Short
    actual fun contains(other: Node?): Boolean
    actual fun lookupPrefix(namespace: String?): String?
    actual fun lookupNamespaceURI(prefix: String?): String?
    actual fun isDefaultNamespace(namespace: String?): Boolean
    actual fun insertBefore(node: Node, child: Node?): Node
    actual fun appendChild(node: Node): Node
    actual fun replaceChild(node: Node, child: Node): Node
    actual fun removeChild(child: Node): Node

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface GetRootNodeOptions {
    actual var composed: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun GetRootNodeOptions(composed: Boolean?): GetRootNodeOptions {
    val o = js("({})")
    o["composed"] = composed
    return o as GetRootNodeOptions
}

/**
 * Exposes the JavaScript [Document](https://developer.mozilla.org/en/docs/Web/API/Document) to Kotlin
 */
actual external open class Document actual constructor() : Node, GlobalEventHandlers, DocumentAndElementEventHandlers, NonElementParentNode, DocumentOrShadowRoot, ParentNode, GeometryUtils {
    actual open val implementation: DOMImplementation
    actual open val URL: String
    actual open val documentURI: String
    actual open val origin: String
    actual open val compatMode: String
    actual open val characterSet: String
    actual open val charset: String
    actual open val inputEncoding: String
    actual open val contentType: String
    actual open val doctype: DocumentType?
    actual open val documentElement: Element?
    actual open val location: Location?
    actual var domain: String
    actual open val referrer: String
    actual var cookie: String
    actual open val lastModified: String
    actual open val readyState: DocumentReadyState
    actual var title: String
    actual var dir: String
    actual var body: HTMLElement?
    actual open val head: HTMLHeadElement?
    actual open val images: HTMLCollection
    actual open val embeds: HTMLCollection
    actual open val plugins: HTMLCollection
    actual open val links: HTMLCollection
    actual open val forms: HTMLCollection
    actual open val scripts: HTMLCollection
    actual open val currentScript: HTMLOrSVGScriptElement?
    actual open val defaultView: Window?
    actual open val activeElement: Element?
    actual var designMode: String
    actual var onreadystatechange: ((Event) -> dynamic)?
    actual var fgColor: String
    actual var linkColor: String
    actual var vlinkColor: String
    actual var alinkColor: String
    actual var bgColor: String
    actual open val anchors: HTMLCollection
    actual open val applets: HTMLCollection
    actual open val all: HTMLAllCollection
    actual open val scrollingElement: Element?
    actual open val styleSheets: StyleSheetList
    actual open val rootElement: SVGSVGElement?
    actual open val fullscreenEnabled: Boolean
    actual open val fullscreen: Boolean
    actual var onfullscreenchange: ((Event) -> dynamic)?
    actual var onfullscreenerror: ((Event) -> dynamic)?
    actual override var onabort: ((Event) -> dynamic)?
    actual override var onblur: ((FocusEvent) -> dynamic)?
    actual override var oncancel: ((Event) -> dynamic)?
    actual override var oncanplay: ((Event) -> dynamic)?
    actual override var oncanplaythrough: ((Event) -> dynamic)?
    actual override var onchange: ((Event) -> dynamic)?
    actual override var onclick: ((MouseEvent) -> dynamic)?
    actual override var onclose: ((Event) -> dynamic)?
    actual override var oncontextmenu: ((MouseEvent) -> dynamic)?
    actual override var oncuechange: ((Event) -> dynamic)?
    actual override var ondblclick: ((MouseEvent) -> dynamic)?
    actual override var ondrag: ((DragEvent) -> dynamic)?
    actual override var ondragend: ((DragEvent) -> dynamic)?
    actual override var ondragenter: ((DragEvent) -> dynamic)?
    actual override var ondragexit: ((DragEvent) -> dynamic)?
    actual override var ondragleave: ((DragEvent) -> dynamic)?
    actual override var ondragover: ((DragEvent) -> dynamic)?
    actual override var ondragstart: ((DragEvent) -> dynamic)?
    actual override var ondrop: ((DragEvent) -> dynamic)?
    actual override var ondurationchange: ((Event) -> dynamic)?
    actual override var onemptied: ((Event) -> dynamic)?
    actual override var onended: ((Event) -> dynamic)?
    actual override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
    actual override var onfocus: ((FocusEvent) -> dynamic)?
    actual override var oninput: ((InputEvent) -> dynamic)?
    actual override var oninvalid: ((Event) -> dynamic)?
    actual override var onkeydown: ((KeyboardEvent) -> dynamic)?
    actual override var onkeypress: ((KeyboardEvent) -> dynamic)?
    actual override var onkeyup: ((KeyboardEvent) -> dynamic)?
    actual override var onload: ((Event) -> dynamic)?
    actual override var onloadeddata: ((Event) -> dynamic)?
    actual override var onloadedmetadata: ((Event) -> dynamic)?
    actual override var onloadend: ((Event) -> dynamic)?
    actual override var onloadstart: ((ProgressEvent) -> dynamic)?
    actual override var onmousedown: ((MouseEvent) -> dynamic)?
    actual override var onmouseenter: ((MouseEvent) -> dynamic)?
    actual override var onmouseleave: ((MouseEvent) -> dynamic)?
    actual override var onmousemove: ((MouseEvent) -> dynamic)?
    actual override var onmouseout: ((MouseEvent) -> dynamic)?
    actual override var onmouseover: ((MouseEvent) -> dynamic)?
    actual override var onmouseup: ((MouseEvent) -> dynamic)?
    actual override var onwheel: ((WheelEvent) -> dynamic)?
    actual override var onpause: ((Event) -> dynamic)?
    actual override var onplay: ((Event) -> dynamic)?
    actual override var onplaying: ((Event) -> dynamic)?
    actual override var onprogress: ((ProgressEvent) -> dynamic)?
    actual override var onratechange: ((Event) -> dynamic)?
    actual override var onreset: ((Event) -> dynamic)?
    actual override var onresize: ((Event) -> dynamic)?
    actual override var onscroll: ((Event) -> dynamic)?
    actual override var onseeked: ((Event) -> dynamic)?
    actual override var onseeking: ((Event) -> dynamic)?
    actual override var onselect: ((Event) -> dynamic)?
    actual override var onshow: ((Event) -> dynamic)?
    actual override var onstalled: ((Event) -> dynamic)?
    actual override var onsubmit: ((Event) -> dynamic)?
    actual override var onsuspend: ((Event) -> dynamic)?
    actual override var ontimeupdate: ((Event) -> dynamic)?
    actual override var ontoggle: ((Event) -> dynamic)?
    actual override var onvolumechange: ((Event) -> dynamic)?
    actual override var onwaiting: ((Event) -> dynamic)?
    actual override var ongotpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onlostpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onpointerdown: ((PointerEvent) -> dynamic)?
    actual override var onpointermove: ((PointerEvent) -> dynamic)?
    actual override var onpointerup: ((PointerEvent) -> dynamic)?
    actual override var onpointercancel: ((PointerEvent) -> dynamic)?
    actual override var onpointerover: ((PointerEvent) -> dynamic)?
    actual override var onpointerout: ((PointerEvent) -> dynamic)?
    actual override var onpointerenter: ((PointerEvent) -> dynamic)?
    actual override var onpointerleave: ((PointerEvent) -> dynamic)?
    actual override var oncopy: ((ClipboardEvent) -> dynamic)?
    actual override var oncut: ((ClipboardEvent) -> dynamic)?
    actual override var onpaste: ((ClipboardEvent) -> dynamic)?
    actual override val fullscreenElement: Element?
    actual override val children: HTMLCollection
    actual override val firstElementChild: Element?
    actual override val lastElementChild: Element?
    actual override val childElementCount: Int
    actual fun getElementsByTagName(qualifiedName: String): HTMLCollection
    actual fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
    actual fun getElementsByClassName(classNames: String): HTMLCollection
    actual fun createElement(localName: String, options: ElementCreationOptions): Element
    actual fun createElementNS(namespace: String?, qualifiedName: String, options: ElementCreationOptions): Element
    actual fun createDocumentFragment(): DocumentFragment
    actual fun createTextNode(data: String): Text
    actual fun createCDATASection(data: String): CDATASection
    actual fun createComment(data: String): Comment
    actual fun createProcessingInstruction(target: String, data: String): ProcessingInstruction
    actual fun importNode(node: Node, deep: Boolean): Node
    actual fun adoptNode(node: Node): Node
    actual fun createAttribute(localName: String): Attr
    actual fun createAttributeNS(namespace: String?, qualifiedName: String): Attr
    actual fun createEvent(param_interface: String): Event
    actual fun createRange(): Range
    actual fun createNodeIterator(root: Node, whatToShow: Int, filter: NodeFilter?): NodeIterator
    actual fun createNodeIterator(root: Node, whatToShow: Int, filter: ((Node) -> Short)?): NodeIterator
    actual fun createTreeWalker(root: Node, whatToShow: Int, filter: NodeFilter?): TreeWalker
    actual fun createTreeWalker(root: Node, whatToShow: Int, filter: ((Node) -> Short)?): TreeWalker
    actual fun getElementsByName(elementName: String): NodeList
    actual fun open(type: String, replace: String): Document
    actual fun open(url: String, name: String, features: String): Window
    actual fun close()
    actual fun write(vararg text: String)
    actual fun writeln(vararg text: String)
    actual fun hasFocus(): Boolean
    actual fun execCommand(commandId: String, showUI: Boolean, value: String): Boolean
    actual fun queryCommandEnabled(commandId: String): Boolean
    actual fun queryCommandIndeterm(commandId: String): Boolean
    actual fun queryCommandState(commandId: String): Boolean
    actual fun queryCommandSupported(commandId: String): Boolean
    actual fun queryCommandValue(commandId: String): String
    actual fun clear()
    actual fun captureEvents()
    actual fun releaseEvents()
    actual fun elementFromPoint(x: Double, y: Double): Element?
    actual fun elementsFromPoint(x: Double, y: Double): Array<Element>
    actual fun caretPositionFromPoint(x: Double, y: Double): CaretPosition?
    actual fun createTouch(view: Window, target: EventTarget, identifier: Int, pageX: Int, pageY: Int, screenX: Int, screenY: Int): Touch
    actual fun createTouchList(vararg touches: Touch): TouchList
    actual fun exitFullscreen(): Promise<Unit>
    actual override fun getElementById(elementId: String): Element?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun prepend(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun append(vararg nodes: dynamic)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
    actual override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun Document.get(name: String): dynamic = asDynamic()[name]

/**
 * Exposes the JavaScript [XMLDocument](https://developer.mozilla.org/en/docs/Web/API/XMLDocument) to Kotlin
 */
actual external open class XMLDocument : Document {
    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface ElementCreationOptions {
    actual var `is`: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ElementCreationOptions(param_is: String?): ElementCreationOptions {
    val o = js("({})")
    o["is"] = param_is
    return o as ElementCreationOptions
}

/**
 * Exposes the JavaScript [DOMImplementation](https://developer.mozilla.org/en/docs/Web/API/DOMImplementation) to Kotlin
 */
actual external abstract class DOMImplementation {
    actual fun createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType
    actual fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType?): XMLDocument
    actual fun createHTMLDocument(title: String): Document
    actual fun hasFeature(): Boolean
}

/**
 * Exposes the JavaScript [DocumentType](https://developer.mozilla.org/en/docs/Web/API/DocumentType) to Kotlin
 */
actual external abstract class DocumentType : Node, ChildNode {
    actual open val name: String
    actual open val publicId: String
    actual open val systemId: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [DocumentFragment](https://developer.mozilla.org/en/docs/Web/API/DocumentFragment) to Kotlin
 */
actual external open class DocumentFragment actual constructor() : Node, NonElementParentNode, ParentNode {
    actual override val children: HTMLCollection
    actual override val firstElementChild: Element?
    actual override val lastElementChild: Element?
    actual override val childElementCount: Int
    actual override fun getElementById(elementId: String): Element?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun prepend(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun append(vararg nodes: dynamic)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [ShadowRoot](https://developer.mozilla.org/en/docs/Web/API/ShadowRoot) to Kotlin
 */
actual external open class ShadowRoot : DocumentFragment, DocumentOrShadowRoot {
    actual open val mode: ShadowRootMode
    actual open val host: Element
    actual override val fullscreenElement: Element?

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [Element](https://developer.mozilla.org/en/docs/Web/API/Element) to Kotlin
 */
actual external abstract class Element : Node, ParentNode, NonDocumentTypeChildNode, ChildNode, Slotable, GeometryUtils, UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrMouseEvent, UnionElementOrProcessingInstruction {
    actual open val namespaceURI: String?
    actual open val prefix: String?
    actual open val localName: String
    actual open val tagName: String
    actual open var id: String
    actual open var className: String
    actual open val classList: DOMTokenList
    actual open var slot: String
    actual open val attributes: NamedNodeMap
    actual open val shadowRoot: ShadowRoot?
    actual open var scrollTop: Double
    actual open var scrollLeft: Double
    actual open val scrollWidth: Int
    actual open val scrollHeight: Int
    actual open val clientTop: Int
    actual open val clientLeft: Int
    actual open val clientWidth: Int
    actual open val clientHeight: Int
    actual open var innerHTML: String
    actual open var outerHTML: String
    actual fun hasAttributes(): Boolean
    actual fun getAttributeNames(): Array<String>
    actual fun getAttribute(qualifiedName: String): String?
    actual fun getAttributeNS(namespace: String?, localName: String): String?
    actual fun setAttribute(qualifiedName: String, value: String)
    actual fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)
    actual fun removeAttribute(qualifiedName: String)
    actual fun removeAttributeNS(namespace: String?, localName: String)
    actual fun hasAttribute(qualifiedName: String): Boolean
    actual fun hasAttributeNS(namespace: String?, localName: String): Boolean
    actual fun getAttributeNode(qualifiedName: String): Attr?
    actual fun getAttributeNodeNS(namespace: String?, localName: String): Attr?
    actual fun setAttributeNode(attr: Attr): Attr?
    actual fun setAttributeNodeNS(attr: Attr): Attr?
    actual fun removeAttributeNode(attr: Attr): Attr
    actual fun attachShadow(init: ShadowRootInit): ShadowRoot
    actual fun closest(selectors: String): Element?
    actual fun matches(selectors: String): Boolean
    actual fun webkitMatchesSelector(selectors: String): Boolean
    actual fun getElementsByTagName(qualifiedName: String): HTMLCollection
    actual fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
    actual fun getElementsByClassName(classNames: String): HTMLCollection
    actual fun insertAdjacentElement(where: String, element: Element): Element?
    actual fun insertAdjacentText(where: String, data: String)
    actual fun getClientRects(): Array<DOMRect>
    actual fun getBoundingClientRect(): DOMRect
    actual fun scrollIntoView()
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun scrollIntoView(arg: dynamic)
    actual fun scroll(options: ScrollToOptions)
    actual fun scroll(x: Double, y: Double)
    actual fun scrollTo(options: ScrollToOptions)
    actual fun scrollTo(x: Double, y: Double)
    actual fun scrollBy(options: ScrollToOptions)
    actual fun scrollBy(x: Double, y: Double)
    actual fun insertAdjacentHTML(position: String, text: String)
    actual fun setPointerCapture(pointerId: Int)
    actual fun releasePointerCapture(pointerId: Int)
    actual fun hasPointerCapture(pointerId: Int): Boolean
    actual fun requestFullscreen(): Promise<Unit>

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface ShadowRootInit {
    actual var mode: ShadowRootMode?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ShadowRootInit(mode: ShadowRootMode?): ShadowRootInit {
    val o = js("({})")
    o["mode"] = mode
    return o as ShadowRootInit
}

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
actual external abstract class NamedNodeMap : ItemArrayLike<Attr> {
    actual fun getNamedItemNS(namespace: String?, localName: String): Attr?
    actual fun setNamedItem(attr: Attr): Attr?
    actual fun setNamedItemNS(attr: Attr): Attr?
    actual fun removeNamedItem(qualifiedName: String): Attr
    actual fun removeNamedItemNS(namespace: String?, localName: String): Attr
    actual override fun item(index: Int): Attr?
    actual fun getNamedItem(qualifiedName: String): Attr?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun NamedNodeMap.get(index: Int): Attr? = asDynamic()[index]

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun NamedNodeMap.get(qualifiedName: String): Attr? = asDynamic()[qualifiedName]

/**
 * Exposes the JavaScript [Attr](https://developer.mozilla.org/en/docs/Web/API/Attr) to Kotlin
 */
actual external abstract class Attr : Node {
    actual open val namespaceURI: String?
    actual open val prefix: String?
    actual open val localName: String
    actual open val name: String
    actual open var value: String
    actual open val ownerElement: Element?
    actual open val specified: Boolean

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [CharacterData](https://developer.mozilla.org/en/docs/Web/API/CharacterData) to Kotlin
 */
actual external abstract class CharacterData : Node, NonDocumentTypeChildNode, ChildNode {
    actual open var data: String
    actual open val length: Int
    actual fun substringData(offset: Int, count: Int): String
    actual fun appendData(data: String)
    actual fun insertData(offset: Int, data: String)
    actual fun deleteData(offset: Int, count: Int)
    actual fun replaceData(offset: Int, count: Int, data: String)

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [Text](https://developer.mozilla.org/en/docs/Web/API/Text) to Kotlin
 */
actual external open class Text actual constructor(data: String) : CharacterData, Slotable, GeometryUtils {
    actual open val wholeText: String
    actual override val assignedSlot: HTMLSlotElement?
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    actual fun splitText(offset: Int): Text
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
    actual override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun before(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun after(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun replaceWith(vararg nodes: dynamic)
    actual override fun remove()

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [CDATASection](https://developer.mozilla.org/en/docs/Web/API/CDATASection) to Kotlin
 */
actual external open class CDATASection : Text {
    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [ProcessingInstruction](https://developer.mozilla.org/en/docs/Web/API/ProcessingInstruction) to Kotlin
 */
actual external abstract class ProcessingInstruction : CharacterData, LinkStyle, UnionElementOrProcessingInstruction {
    actual open val target: String

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [Comment](https://developer.mozilla.org/en/docs/Web/API/Comment) to Kotlin
 */
actual external open class Comment actual constructor(data: String) : CharacterData {
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun before(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun after(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun replaceWith(vararg nodes: dynamic)
    actual override fun remove()

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [Range](https://developer.mozilla.org/en/docs/Web/API/Range) to Kotlin
 */
actual external open class Range actual constructor() {
    actual open val startContainer: Node
    actual open val startOffset: Int
    actual open val endContainer: Node
    actual open val endOffset: Int
    actual open val collapsed: Boolean
    actual open val commonAncestorContainer: Node
    actual fun setStart(node: Node, offset: Int)
    actual fun setEnd(node: Node, offset: Int)
    actual fun setStartBefore(node: Node)
    actual fun setStartAfter(node: Node)
    actual fun setEndBefore(node: Node)
    actual fun setEndAfter(node: Node)
    actual fun collapse(toStart: Boolean)
    actual fun selectNode(node: Node)
    actual fun selectNodeContents(node: Node)
    actual fun compareBoundaryPoints(how: Short, sourceRange: Range): Short
    actual fun deleteContents()
    actual fun extractContents(): DocumentFragment
    actual fun cloneContents(): DocumentFragment
    actual fun insertNode(node: Node)
    actual fun surroundContents(newParent: Node)
    actual fun cloneRange(): Range
    actual fun detach()
    actual fun isPointInRange(node: Node, offset: Int): Boolean
    actual fun comparePoint(node: Node, offset: Int): Short
    actual fun intersectsNode(node: Node): Boolean
    actual fun getClientRects(): Array<DOMRect>
    actual fun getBoundingClientRect(): DOMRect
    actual fun createContextualFragment(fragment: String): DocumentFragment

    actual companion object {
        actual val START_TO_START: Short
        actual val START_TO_END: Short
        actual val END_TO_END: Short
        actual val END_TO_START: Short
    }
}

/**
 * Exposes the JavaScript [NodeIterator](https://developer.mozilla.org/en/docs/Web/API/NodeIterator) to Kotlin
 */
actual external abstract class NodeIterator {
    actual open val root: Node
    actual open val referenceNode: Node
    actual open val pointerBeforeReferenceNode: Boolean
    actual open val whatToShow: Int
    actual open val filter: NodeFilter?
    actual fun nextNode(): Node?
    actual fun previousNode(): Node?
    actual fun detach()
}

/**
 * Exposes the JavaScript [TreeWalker](https://developer.mozilla.org/en/docs/Web/API/TreeWalker) to Kotlin
 */
actual external abstract class TreeWalker {
    actual open val root: Node
    actual open val whatToShow: Int
    actual open val filter: NodeFilter?
    actual open var currentNode: Node
    actual fun parentNode(): Node?
    actual fun firstChild(): Node?
    actual fun lastChild(): Node?
    actual fun previousSibling(): Node?
    actual fun nextSibling(): Node?
    actual fun previousNode(): Node?
    actual fun nextNode(): Node?
}

/**
 * Exposes the JavaScript [NodeFilter](https://developer.mozilla.org/en/docs/Web/API/NodeFilter) to Kotlin
 */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface NodeFilter {
    actual fun acceptNode(node: Node): Short

    actual companion object {
        actual val FILTER_ACCEPT: Short
        actual val FILTER_REJECT: Short
        actual val FILTER_SKIP: Short
        actual val SHOW_ALL: Int
        actual val SHOW_ELEMENT: Int
        actual val SHOW_ATTRIBUTE: Int
        actual val SHOW_TEXT: Int
        actual val SHOW_CDATA_SECTION: Int
        actual val SHOW_ENTITY_REFERENCE: Int
        actual val SHOW_ENTITY: Int
        actual val SHOW_PROCESSING_INSTRUCTION: Int
        actual val SHOW_COMMENT: Int
        actual val SHOW_DOCUMENT: Int
        actual val SHOW_DOCUMENT_TYPE: Int
        actual val SHOW_DOCUMENT_FRAGMENT: Int
        actual val SHOW_NOTATION: Int
    }
}

/**
 * Exposes the JavaScript [DOMTokenList](https://developer.mozilla.org/en/docs/Web/API/DOMTokenList) to Kotlin
 */
actual external abstract class DOMTokenList : ItemArrayLike<String> {
    actual open var value: String
    actual fun contains(token: String): Boolean
    actual fun add(vararg tokens: String)
    actual fun remove(vararg tokens: String)
    actual fun toggle(token: String, force: Boolean): Boolean
    actual fun replace(token: String, newToken: String)
    actual fun supports(token: String): Boolean
    actual override fun item(index: Int): String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun DOMTokenList.get(index: Int): String? = asDynamic()[index]

/**
 * Exposes the JavaScript [DOMPointReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMPointReadOnly) to Kotlin
 */
actual external open class DOMPointReadOnly actual constructor(x: Double, y: Double, z: Double, w: Double) {
    actual open val x: Double
    actual open val y: Double
    actual open val z: Double
    actual open val w: Double
    actual fun matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}

/**
 * Exposes the JavaScript [DOMPoint](https://developer.mozilla.org/en/docs/Web/API/DOMPoint) to Kotlin
 */
actual external open class DOMPoint : DOMPointReadOnly {
    actual constructor(point: DOMPointInit)
    actual constructor(x: Double, y: Double, z: Double, w: Double)
    actual override var x: Double
    actual override var y: Double
    actual override var z: Double
    actual override var w: Double
}

/**
 * Exposes the JavaScript [DOMPointInit](https://developer.mozilla.org/en/docs/Web/API/DOMPointInit) to Kotlin
 */
actual external interface DOMPointInit {
    actual var x: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var y: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var z: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var w: Double? /* = 1.0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun DOMPointInit(x: Double?, y: Double?, z: Double?, w: Double?): DOMPointInit {
    val o = js("({})")
    o["x"] = x
    o["y"] = y
    o["z"] = z
    o["w"] = w
    return o as DOMPointInit
}

/**
 * Exposes the JavaScript [DOMRect](https://developer.mozilla.org/en/docs/Web/API/DOMRect) to Kotlin
 */
actual external open class DOMRect actual constructor(x: Double, y: Double, width: Double, height: Double) : DOMRectReadOnly {
    actual override var x: Double
    actual override var y: Double
    actual override var width: Double
    actual override var height: Double
}

/**
 * Exposes the JavaScript [DOMRectReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMRectReadOnly) to Kotlin
 */
actual external open class DOMRectReadOnly actual constructor(x: Double, y: Double, width: Double, height: Double) {
    actual open val x: Double
    actual open val y: Double
    actual open val width: Double
    actual open val height: Double
    actual open val top: Double
    actual open val right: Double
    actual open val bottom: Double
    actual open val left: Double
}

actual external interface DOMRectInit {
    actual var x: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var y: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var width: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var height: Double? /* = 0.0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun DOMRectInit(x: Double?, y: Double?, width: Double?, height: Double?): DOMRectInit {
    val o = js("({})")
    o["x"] = x
    o["y"] = y
    o["width"] = width
    o["height"] = height
    return o as DOMRectInit
}

actual external interface DOMRectList : ItemArrayLike<DOMRect> {
    actual override fun item(index: Int): DOMRect?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun DOMRectList.get(index: Int): DOMRect? = asDynamic()[index]

/**
 * Exposes the JavaScript [DOMQuad](https://developer.mozilla.org/en/docs/Web/API/DOMQuad) to Kotlin
 */
actual external open class DOMQuad {
    actual constructor(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit)
    actual constructor(rect: DOMRectInit)
    actual open val p1: DOMPoint
    actual open val p2: DOMPoint
    actual open val p3: DOMPoint
    actual open val p4: DOMPoint
    actual open val bounds: DOMRectReadOnly
}

/**
 * Exposes the JavaScript [DOMMatrixReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMMatrixReadOnly) to Kotlin
 */
actual external open class DOMMatrixReadOnly actual constructor(numberSequence: Array<Double>) {
    actual open val a: Double
    actual open val b: Double
    actual open val c: Double
    actual open val d: Double
    actual open val e: Double
    actual open val f: Double
    actual open val m11: Double
    actual open val m12: Double
    actual open val m13: Double
    actual open val m14: Double
    actual open val m21: Double
    actual open val m22: Double
    actual open val m23: Double
    actual open val m24: Double
    actual open val m31: Double
    actual open val m32: Double
    actual open val m33: Double
    actual open val m34: Double
    actual open val m41: Double
    actual open val m42: Double
    actual open val m43: Double
    actual open val m44: Double
    actual open val is2D: Boolean
    actual open val isIdentity: Boolean
    actual fun translate(tx: Double, ty: Double, tz: Double): DOMMatrix
    actual fun scale(scale: Double, originX: Double, originY: Double): DOMMatrix
    actual fun scale3d(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix
    actual fun scaleNonUniform(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix
    actual fun rotate(angle: Double, originX: Double, originY: Double): DOMMatrix
    actual fun rotateFromVector(x: Double, y: Double): DOMMatrix
    actual fun rotateAxisAngle(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
    actual fun skewX(sx: Double): DOMMatrix
    actual fun skewY(sy: Double): DOMMatrix
    actual fun multiply(other: DOMMatrix): DOMMatrix
    actual fun flipX(): DOMMatrix
    actual fun flipY(): DOMMatrix
    actual fun inverse(): DOMMatrix
    actual fun transformPoint(point: DOMPointInit): DOMPoint
    actual fun toFloat32Array(): Float32Array
    actual fun toFloat64Array(): Float64Array
}

/**
 * Exposes the JavaScript [DOMMatrix](https://developer.mozilla.org/en/docs/Web/API/DOMMatrix) to Kotlin
 */
actual external open class DOMMatrix actual constructor() : DOMMatrixReadOnly {
    actual constructor(transformList: String)
    actual constructor(other: DOMMatrixReadOnly)
    actual constructor(array32: Float32Array)
    actual constructor(array64: Float64Array)
    actual constructor(numberSequence: Array<Double>)
    actual override var a: Double
    actual override var b: Double
    actual override var c: Double
    actual override var d: Double
    actual override var e: Double
    actual override var f: Double
    actual override var m11: Double
    actual override var m12: Double
    actual override var m13: Double
    actual override var m14: Double
    actual override var m21: Double
    actual override var m22: Double
    actual override var m23: Double
    actual override var m24: Double
    actual override var m31: Double
    actual override var m32: Double
    actual override var m33: Double
    actual override var m34: Double
    actual override var m41: Double
    actual override var m42: Double
    actual override var m43: Double
    actual override var m44: Double
    actual fun multiplySelf(other: DOMMatrix): DOMMatrix
    actual fun preMultiplySelf(other: DOMMatrix): DOMMatrix
    actual fun translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix
    actual fun scaleSelf(scale: Double, originX: Double, originY: Double): DOMMatrix
    actual fun scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix
    actual fun scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix
    actual fun rotateSelf(angle: Double, originX: Double, originY: Double): DOMMatrix
    actual fun rotateFromVectorSelf(x: Double, y: Double): DOMMatrix
    actual fun rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix
    actual fun skewXSelf(sx: Double): DOMMatrix
    actual fun skewYSelf(sy: Double): DOMMatrix
    actual fun invertSelf(): DOMMatrix
    actual fun setMatrixValue(transformList: String): DOMMatrix
}

actual external interface ScrollOptions {
    actual var behavior: ScrollBehavior? /* = ScrollBehavior.AUTO */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ScrollOptions(behavior: ScrollBehavior?): ScrollOptions {
    val o = js("({})")
    o["behavior"] = behavior
    return o as ScrollOptions
}

/**
 * Exposes the JavaScript [ScrollToOptions](https://developer.mozilla.org/en/docs/Web/API/ScrollToOptions) to Kotlin
 */
actual external interface ScrollToOptions : ScrollOptions {
    actual var left: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var top: Double?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ScrollToOptions(left: Double?, top: Double?, behavior: ScrollBehavior?): ScrollToOptions {
    val o = js("({})")
    o["left"] = left
    o["top"] = top
    o["behavior"] = behavior
    return o as ScrollToOptions
}

/**
 * Exposes the JavaScript [MediaQueryList](https://developer.mozilla.org/en/docs/Web/API/MediaQueryList) to Kotlin
 */
actual external abstract class MediaQueryList : EventTarget {
    actual open val media: String
    actual open val matches: Boolean
    actual open var onchange: ((Event) -> dynamic)?
    actual fun addListener(listener: EventListener?)
    actual fun addListener(listener: ((Event) -> Unit)?)
    actual fun removeListener(listener: EventListener?)
    actual fun removeListener(listener: ((Event) -> Unit)?)
}

/**
 * Exposes the JavaScript [MediaQueryListEvent](https://developer.mozilla.org/en/docs/Web/API/MediaQueryListEvent) to Kotlin
 */
actual external open class MediaQueryListEvent actual constructor(type: String, eventInitDict: MediaQueryListEventInit) : Event {
    actual open val media: String
    actual open val matches: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface MediaQueryListEventInit : EventInit {
    actual var media: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var matches: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaQueryListEventInit(media: String?, matches: Boolean?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaQueryListEventInit {
    val o = js("({})")
    o["media"] = media
    o["matches"] = matches
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as MediaQueryListEventInit
}

/**
 * Exposes the JavaScript [Screen](https://developer.mozilla.org/en/docs/Web/API/Screen) to Kotlin
 */
actual external abstract class Screen {
    actual open val availWidth: Int
    actual open val availHeight: Int
    actual open val width: Int
    actual open val height: Int
    actual open val colorDepth: Int
    actual open val pixelDepth: Int
}

/**
 * Exposes the JavaScript [CaretPosition](https://developer.mozilla.org/en/docs/Web/API/CaretPosition) to Kotlin
 */
actual external abstract class CaretPosition {
    actual open val offsetNode: Node
    actual open val offset: Int
    actual fun getClientRect(): DOMRect?
}

actual external interface ScrollIntoViewOptions : ScrollOptions {
    actual var block: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
        get() = definedExternally
        set(value) = definedExternally
    actual var inline: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ScrollIntoViewOptions(block: ScrollLogicalPosition?, inline: ScrollLogicalPosition?, behavior: ScrollBehavior?): ScrollIntoViewOptions {
    val o = js("({})")
    o["block"] = block
    o["inline"] = inline
    o["behavior"] = behavior
    return o as ScrollIntoViewOptions
}

actual external interface BoxQuadOptions {
    actual var box: CSSBoxType? /* = CSSBoxType.BORDER */
        get() = definedExternally
        set(value) = definedExternally
    actual var relativeTo: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun BoxQuadOptions(box: CSSBoxType?, relativeTo: dynamic): BoxQuadOptions {
    val o = js("({})")
    o["box"] = box
    o["relativeTo"] = relativeTo
    return o as BoxQuadOptions
}

actual external interface ConvertCoordinateOptions {
    actual var fromBox: CSSBoxType? /* = CSSBoxType.BORDER */
        get() = definedExternally
        set(value) = definedExternally
    actual var toBox: CSSBoxType? /* = CSSBoxType.BORDER */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ConvertCoordinateOptions(fromBox: CSSBoxType?, toBox: CSSBoxType?): ConvertCoordinateOptions {
    val o = js("({})")
    o["fromBox"] = fromBox
    o["toBox"] = toBox
    return o as ConvertCoordinateOptions
}

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
actual external interface GeometryUtils {
    actual fun getBoxQuads(options: BoxQuadOptions): Array<DOMQuad>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions): DOMQuad
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions): DOMQuad
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions): DOMPoint
}

/**
 * Exposes the JavaScript [Touch](https://developer.mozilla.org/en/docs/Web/API/Touch) to Kotlin
 */
actual external abstract class Touch {
    actual open val identifier: Int
    actual open val target: EventTarget
    actual open val screenX: Int
    actual open val screenY: Int
    actual open val clientX: Int
    actual open val clientY: Int
    actual open val pageX: Int
    actual open val pageY: Int
    actual open val region: String?
}

actual external abstract class TouchList : ItemArrayLike<Touch> {
    actual override fun item(index: Int): Touch?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun TouchList.get(index: Int): Touch? = asDynamic()[index]

actual external open class TouchEvent : UIEvent {
    actual open val touches: TouchList
    actual open val targetTouches: TouchList
    actual open val changedTouches: TouchList
    actual open val altKey: Boolean
    actual open val metaKey: Boolean
    actual open val ctrlKey: Boolean
    actual open val shiftKey: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

/**
 * Exposes the JavaScript [Image](https://developer.mozilla.org/en/docs/Web/API/Image) to Kotlin
 */
actual external open class Image actual constructor(width: Int, height: Int) : HTMLImageElement {
    actual override var onabort: ((Event) -> dynamic)?
    actual override var onblur: ((FocusEvent) -> dynamic)?
    actual override var oncancel: ((Event) -> dynamic)?
    actual override var oncanplay: ((Event) -> dynamic)?
    actual override var oncanplaythrough: ((Event) -> dynamic)?
    actual override var onchange: ((Event) -> dynamic)?
    actual override var onclick: ((MouseEvent) -> dynamic)?
    actual override var onclose: ((Event) -> dynamic)?
    actual override var oncontextmenu: ((MouseEvent) -> dynamic)?
    actual override var oncuechange: ((Event) -> dynamic)?
    actual override var ondblclick: ((MouseEvent) -> dynamic)?
    actual override var ondrag: ((DragEvent) -> dynamic)?
    actual override var ondragend: ((DragEvent) -> dynamic)?
    actual override var ondragenter: ((DragEvent) -> dynamic)?
    actual override var ondragexit: ((DragEvent) -> dynamic)?
    actual override var ondragleave: ((DragEvent) -> dynamic)?
    actual override var ondragover: ((DragEvent) -> dynamic)?
    actual override var ondragstart: ((DragEvent) -> dynamic)?
    actual override var ondrop: ((DragEvent) -> dynamic)?
    actual override var ondurationchange: ((Event) -> dynamic)?
    actual override var onemptied: ((Event) -> dynamic)?
    actual override var onended: ((Event) -> dynamic)?
    actual override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
    actual override var onfocus: ((FocusEvent) -> dynamic)?
    actual override var oninput: ((InputEvent) -> dynamic)?
    actual override var oninvalid: ((Event) -> dynamic)?
    actual override var onkeydown: ((KeyboardEvent) -> dynamic)?
    actual override var onkeypress: ((KeyboardEvent) -> dynamic)?
    actual override var onkeyup: ((KeyboardEvent) -> dynamic)?
    actual override var onload: ((Event) -> dynamic)?
    actual override var onloadeddata: ((Event) -> dynamic)?
    actual override var onloadedmetadata: ((Event) -> dynamic)?
    actual override var onloadend: ((Event) -> dynamic)?
    actual override var onloadstart: ((ProgressEvent) -> dynamic)?
    actual override var onmousedown: ((MouseEvent) -> dynamic)?
    actual override var onmouseenter: ((MouseEvent) -> dynamic)?
    actual override var onmouseleave: ((MouseEvent) -> dynamic)?
    actual override var onmousemove: ((MouseEvent) -> dynamic)?
    actual override var onmouseout: ((MouseEvent) -> dynamic)?
    actual override var onmouseover: ((MouseEvent) -> dynamic)?
    actual override var onmouseup: ((MouseEvent) -> dynamic)?
    actual override var onwheel: ((WheelEvent) -> dynamic)?
    actual override var onpause: ((Event) -> dynamic)?
    actual override var onplay: ((Event) -> dynamic)?
    actual override var onplaying: ((Event) -> dynamic)?
    actual override var onprogress: ((ProgressEvent) -> dynamic)?
    actual override var onratechange: ((Event) -> dynamic)?
    actual override var onreset: ((Event) -> dynamic)?
    actual override var onresize: ((Event) -> dynamic)?
    actual override var onscroll: ((Event) -> dynamic)?
    actual override var onseeked: ((Event) -> dynamic)?
    actual override var onseeking: ((Event) -> dynamic)?
    actual override var onselect: ((Event) -> dynamic)?
    actual override var onshow: ((Event) -> dynamic)?
    actual override var onstalled: ((Event) -> dynamic)?
    actual override var onsubmit: ((Event) -> dynamic)?
    actual override var onsuspend: ((Event) -> dynamic)?
    actual override var ontimeupdate: ((Event) -> dynamic)?
    actual override var ontoggle: ((Event) -> dynamic)?
    actual override var onvolumechange: ((Event) -> dynamic)?
    actual override var onwaiting: ((Event) -> dynamic)?
    actual override var ongotpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onlostpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onpointerdown: ((PointerEvent) -> dynamic)?
    actual override var onpointermove: ((PointerEvent) -> dynamic)?
    actual override var onpointerup: ((PointerEvent) -> dynamic)?
    actual override var onpointercancel: ((PointerEvent) -> dynamic)?
    actual override var onpointerover: ((PointerEvent) -> dynamic)?
    actual override var onpointerout: ((PointerEvent) -> dynamic)?
    actual override var onpointerenter: ((PointerEvent) -> dynamic)?
    actual override var onpointerleave: ((PointerEvent) -> dynamic)?
    actual override var oncopy: ((ClipboardEvent) -> dynamic)?
    actual override var oncut: ((ClipboardEvent) -> dynamic)?
    actual override var onpaste: ((ClipboardEvent) -> dynamic)?
    actual override var contentEditable: String
    actual override val isContentEditable: Boolean
    actual override val style: CSSStyleDeclaration
    actual override val children: HTMLCollection
    actual override val firstElementChild: Element?
    actual override val lastElementChild: Element?
    actual override val childElementCount: Int
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    actual override val assignedSlot: HTMLSlotElement?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun prepend(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun append(vararg nodes: dynamic)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun before(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun after(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun replaceWith(vararg nodes: dynamic)
    actual override fun remove()
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
    actual override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external open class Audio actual constructor(src: String) : HTMLAudioElement {
    actual override var onabort: ((Event) -> dynamic)?
    actual override var onblur: ((FocusEvent) -> dynamic)?
    actual override var oncancel: ((Event) -> dynamic)?
    actual override var oncanplay: ((Event) -> dynamic)?
    actual override var oncanplaythrough: ((Event) -> dynamic)?
    actual override var onchange: ((Event) -> dynamic)?
    actual override var onclick: ((MouseEvent) -> dynamic)?
    actual override var onclose: ((Event) -> dynamic)?
    actual override var oncontextmenu: ((MouseEvent) -> dynamic)?
    actual override var oncuechange: ((Event) -> dynamic)?
    actual override var ondblclick: ((MouseEvent) -> dynamic)?
    actual override var ondrag: ((DragEvent) -> dynamic)?
    actual override var ondragend: ((DragEvent) -> dynamic)?
    actual override var ondragenter: ((DragEvent) -> dynamic)?
    actual override var ondragexit: ((DragEvent) -> dynamic)?
    actual override var ondragleave: ((DragEvent) -> dynamic)?
    actual override var ondragover: ((DragEvent) -> dynamic)?
    actual override var ondragstart: ((DragEvent) -> dynamic)?
    actual override var ondrop: ((DragEvent) -> dynamic)?
    actual override var ondurationchange: ((Event) -> dynamic)?
    actual override var onemptied: ((Event) -> dynamic)?
    actual override var onended: ((Event) -> dynamic)?
    actual override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
    actual override var onfocus: ((FocusEvent) -> dynamic)?
    actual override var oninput: ((InputEvent) -> dynamic)?
    actual override var oninvalid: ((Event) -> dynamic)?
    actual override var onkeydown: ((KeyboardEvent) -> dynamic)?
    actual override var onkeypress: ((KeyboardEvent) -> dynamic)?
    actual override var onkeyup: ((KeyboardEvent) -> dynamic)?
    actual override var onload: ((Event) -> dynamic)?
    actual override var onloadeddata: ((Event) -> dynamic)?
    actual override var onloadedmetadata: ((Event) -> dynamic)?
    actual override var onloadend: ((Event) -> dynamic)?
    actual override var onloadstart: ((ProgressEvent) -> dynamic)?
    actual override var onmousedown: ((MouseEvent) -> dynamic)?
    actual override var onmouseenter: ((MouseEvent) -> dynamic)?
    actual override var onmouseleave: ((MouseEvent) -> dynamic)?
    actual override var onmousemove: ((MouseEvent) -> dynamic)?
    actual override var onmouseout: ((MouseEvent) -> dynamic)?
    actual override var onmouseover: ((MouseEvent) -> dynamic)?
    actual override var onmouseup: ((MouseEvent) -> dynamic)?
    actual override var onwheel: ((WheelEvent) -> dynamic)?
    actual override var onpause: ((Event) -> dynamic)?
    actual override var onplay: ((Event) -> dynamic)?
    actual override var onplaying: ((Event) -> dynamic)?
    actual override var onprogress: ((ProgressEvent) -> dynamic)?
    actual override var onratechange: ((Event) -> dynamic)?
    actual override var onreset: ((Event) -> dynamic)?
    actual override var onresize: ((Event) -> dynamic)?
    actual override var onscroll: ((Event) -> dynamic)?
    actual override var onseeked: ((Event) -> dynamic)?
    actual override var onseeking: ((Event) -> dynamic)?
    actual override var onselect: ((Event) -> dynamic)?
    actual override var onshow: ((Event) -> dynamic)?
    actual override var onstalled: ((Event) -> dynamic)?
    actual override var onsubmit: ((Event) -> dynamic)?
    actual override var onsuspend: ((Event) -> dynamic)?
    actual override var ontimeupdate: ((Event) -> dynamic)?
    actual override var ontoggle: ((Event) -> dynamic)?
    actual override var onvolumechange: ((Event) -> dynamic)?
    actual override var onwaiting: ((Event) -> dynamic)?
    actual override var ongotpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onlostpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onpointerdown: ((PointerEvent) -> dynamic)?
    actual override var onpointermove: ((PointerEvent) -> dynamic)?
    actual override var onpointerup: ((PointerEvent) -> dynamic)?
    actual override var onpointercancel: ((PointerEvent) -> dynamic)?
    actual override var onpointerover: ((PointerEvent) -> dynamic)?
    actual override var onpointerout: ((PointerEvent) -> dynamic)?
    actual override var onpointerenter: ((PointerEvent) -> dynamic)?
    actual override var onpointerleave: ((PointerEvent) -> dynamic)?
    actual override var oncopy: ((ClipboardEvent) -> dynamic)?
    actual override var oncut: ((ClipboardEvent) -> dynamic)?
    actual override var onpaste: ((ClipboardEvent) -> dynamic)?
    actual override var contentEditable: String
    actual override val isContentEditable: Boolean
    actual override val style: CSSStyleDeclaration
    actual override val children: HTMLCollection
    actual override val firstElementChild: Element?
    actual override val lastElementChild: Element?
    actual override val childElementCount: Int
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    actual override val assignedSlot: HTMLSlotElement?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun prepend(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun append(vararg nodes: dynamic)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun before(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun after(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun replaceWith(vararg nodes: dynamic)
    actual override fun remove()
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
    actual override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

    actual companion object {
        actual val NETWORK_EMPTY: Short
        actual val NETWORK_IDLE: Short
        actual val NETWORK_LOADING: Short
        actual val NETWORK_NO_SOURCE: Short
        actual val HAVE_NOTHING: Short
        actual val HAVE_METADATA: Short
        actual val HAVE_CURRENT_DATA: Short
        actual val HAVE_FUTURE_DATA: Short
        actual val HAVE_ENOUGH_DATA: Short
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

/**
 * Exposes the JavaScript [Option](https://developer.mozilla.org/en/docs/Web/API/Option) to Kotlin
 */
actual external open class Option actual constructor(text: String, value: String, defaultSelected: Boolean, selected: Boolean) : HTMLOptionElement {
    actual override var onabort: ((Event) -> dynamic)?
    actual override var onblur: ((FocusEvent) -> dynamic)?
    actual override var oncancel: ((Event) -> dynamic)?
    actual override var oncanplay: ((Event) -> dynamic)?
    actual override var oncanplaythrough: ((Event) -> dynamic)?
    actual override var onchange: ((Event) -> dynamic)?
    actual override var onclick: ((MouseEvent) -> dynamic)?
    actual override var onclose: ((Event) -> dynamic)?
    actual override var oncontextmenu: ((MouseEvent) -> dynamic)?
    actual override var oncuechange: ((Event) -> dynamic)?
    actual override var ondblclick: ((MouseEvent) -> dynamic)?
    actual override var ondrag: ((DragEvent) -> dynamic)?
    actual override var ondragend: ((DragEvent) -> dynamic)?
    actual override var ondragenter: ((DragEvent) -> dynamic)?
    actual override var ondragexit: ((DragEvent) -> dynamic)?
    actual override var ondragleave: ((DragEvent) -> dynamic)?
    actual override var ondragover: ((DragEvent) -> dynamic)?
    actual override var ondragstart: ((DragEvent) -> dynamic)?
    actual override var ondrop: ((DragEvent) -> dynamic)?
    actual override var ondurationchange: ((Event) -> dynamic)?
    actual override var onemptied: ((Event) -> dynamic)?
    actual override var onended: ((Event) -> dynamic)?
    actual override var onerror: ((dynamic, String, Int, Int, Any?) -> dynamic)?
    actual override var onfocus: ((FocusEvent) -> dynamic)?
    actual override var oninput: ((InputEvent) -> dynamic)?
    actual override var oninvalid: ((Event) -> dynamic)?
    actual override var onkeydown: ((KeyboardEvent) -> dynamic)?
    actual override var onkeypress: ((KeyboardEvent) -> dynamic)?
    actual override var onkeyup: ((KeyboardEvent) -> dynamic)?
    actual override var onload: ((Event) -> dynamic)?
    actual override var onloadeddata: ((Event) -> dynamic)?
    actual override var onloadedmetadata: ((Event) -> dynamic)?
    actual override var onloadend: ((Event) -> dynamic)?
    actual override var onloadstart: ((ProgressEvent) -> dynamic)?
    actual override var onmousedown: ((MouseEvent) -> dynamic)?
    actual override var onmouseenter: ((MouseEvent) -> dynamic)?
    actual override var onmouseleave: ((MouseEvent) -> dynamic)?
    actual override var onmousemove: ((MouseEvent) -> dynamic)?
    actual override var onmouseout: ((MouseEvent) -> dynamic)?
    actual override var onmouseover: ((MouseEvent) -> dynamic)?
    actual override var onmouseup: ((MouseEvent) -> dynamic)?
    actual override var onwheel: ((WheelEvent) -> dynamic)?
    actual override var onpause: ((Event) -> dynamic)?
    actual override var onplay: ((Event) -> dynamic)?
    actual override var onplaying: ((Event) -> dynamic)?
    actual override var onprogress: ((ProgressEvent) -> dynamic)?
    actual override var onratechange: ((Event) -> dynamic)?
    actual override var onreset: ((Event) -> dynamic)?
    actual override var onresize: ((Event) -> dynamic)?
    actual override var onscroll: ((Event) -> dynamic)?
    actual override var onseeked: ((Event) -> dynamic)?
    actual override var onseeking: ((Event) -> dynamic)?
    actual override var onselect: ((Event) -> dynamic)?
    actual override var onshow: ((Event) -> dynamic)?
    actual override var onstalled: ((Event) -> dynamic)?
    actual override var onsubmit: ((Event) -> dynamic)?
    actual override var onsuspend: ((Event) -> dynamic)?
    actual override var ontimeupdate: ((Event) -> dynamic)?
    actual override var ontoggle: ((Event) -> dynamic)?
    actual override var onvolumechange: ((Event) -> dynamic)?
    actual override var onwaiting: ((Event) -> dynamic)?
    actual override var ongotpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onlostpointercapture: ((PointerEvent) -> dynamic)?
    actual override var onpointerdown: ((PointerEvent) -> dynamic)?
    actual override var onpointermove: ((PointerEvent) -> dynamic)?
    actual override var onpointerup: ((PointerEvent) -> dynamic)?
    actual override var onpointercancel: ((PointerEvent) -> dynamic)?
    actual override var onpointerover: ((PointerEvent) -> dynamic)?
    actual override var onpointerout: ((PointerEvent) -> dynamic)?
    actual override var onpointerenter: ((PointerEvent) -> dynamic)?
    actual override var onpointerleave: ((PointerEvent) -> dynamic)?
    actual override var oncopy: ((ClipboardEvent) -> dynamic)?
    actual override var oncut: ((ClipboardEvent) -> dynamic)?
    actual override var onpaste: ((ClipboardEvent) -> dynamic)?
    actual override var contentEditable: String
    actual override val isContentEditable: Boolean
    actual override val style: CSSStyleDeclaration
    actual override val children: HTMLCollection
    actual override val firstElementChild: Element?
    actual override val lastElementChild: Element?
    actual override val childElementCount: Int
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    actual override val assignedSlot: HTMLSlotElement?
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun prepend(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun append(vararg nodes: dynamic)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun before(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun after(vararg nodes: dynamic)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual override fun replaceWith(vararg nodes: dynamic)
    actual override fun remove()
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): Array<DOMQuad>
    actual override fun convertQuadFromNode(quad: dynamic, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: dynamic, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

    actual companion object {
        actual val ELEMENT_NODE: Short
        actual val ATTRIBUTE_NODE: Short
        actual val TEXT_NODE: Short
        actual val CDATA_SECTION_NODE: Short
        actual val ENTITY_REFERENCE_NODE: Short
        actual val ENTITY_NODE: Short
        actual val PROCESSING_INSTRUCTION_NODE: Short
        actual val COMMENT_NODE: Short
        actual val DOCUMENT_NODE: Short
        actual val DOCUMENT_TYPE_NODE: Short
        actual val DOCUMENT_FRAGMENT_NODE: Short
        actual val NOTATION_NODE: Short
        actual val DOCUMENT_POSITION_DISCONNECTED: Short
        actual val DOCUMENT_POSITION_PRECEDING: Short
        actual val DOCUMENT_POSITION_FOLLOWING: Short
        actual val DOCUMENT_POSITION_CONTAINS: Short
        actual val DOCUMENT_POSITION_CONTAINED_BY: Short
        actual val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}

actual external interface UnionElementOrHTMLCollection

actual external interface UnionElementOrRadioNodeList

actual external interface UnionHTMLOptGroupElementOrHTMLOptionElement

actual external interface UnionAudioTrackOrTextTrackOrVideoTrack

actual external interface UnionElementOrMouseEvent

actual external interface UnionMessagePortOrWindowProxy

actual external interface MediaProvider

actual external interface RenderingContext

actual external interface HTMLOrSVGImageElement : CanvasImageSource

actual external interface CanvasImageSource : ImageBitmapSource

actual external interface ImageBitmapSource

actual external interface HTMLOrSVGScriptElement

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface DocumentReadyState {
    actual companion object
}

actual inline val DocumentReadyState.Companion.LOADING: DocumentReadyState get() = "loading".asDynamic().unsafeCast<DocumentReadyState>()

actual inline val DocumentReadyState.Companion.INTERACTIVE: DocumentReadyState get() = "interactive".asDynamic().unsafeCast<DocumentReadyState>()

actual inline val DocumentReadyState.Companion.COMPLETE: DocumentReadyState get() = "complete".asDynamic().unsafeCast<DocumentReadyState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanPlayTypeResult {
    actual companion object
}

actual inline val CanPlayTypeResult.Companion.EMPTY: CanPlayTypeResult get() = "".asDynamic().unsafeCast<CanPlayTypeResult>()

actual inline val CanPlayTypeResult.Companion.MAYBE: CanPlayTypeResult get() = "maybe".asDynamic().unsafeCast<CanPlayTypeResult>()

actual inline val CanPlayTypeResult.Companion.PROBABLY: CanPlayTypeResult get() = "probably".asDynamic().unsafeCast<CanPlayTypeResult>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface TextTrackMode {
    actual companion object
}

actual inline val TextTrackMode.Companion.DISABLED: TextTrackMode get() = "disabled".asDynamic().unsafeCast<TextTrackMode>()

actual inline val TextTrackMode.Companion.HIDDEN: TextTrackMode get() = "hidden".asDynamic().unsafeCast<TextTrackMode>()

actual inline val TextTrackMode.Companion.SHOWING: TextTrackMode get() = "showing".asDynamic().unsafeCast<TextTrackMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface TextTrackKind {
    actual companion object
}

actual inline val TextTrackKind.Companion.SUBTITLES: TextTrackKind get() = "subtitles".asDynamic().unsafeCast<TextTrackKind>()

actual inline val TextTrackKind.Companion.CAPTIONS: TextTrackKind get() = "captions".asDynamic().unsafeCast<TextTrackKind>()

actual inline val TextTrackKind.Companion.DESCRIPTIONS: TextTrackKind get() = "descriptions".asDynamic().unsafeCast<TextTrackKind>()

actual inline val TextTrackKind.Companion.CHAPTERS: TextTrackKind get() = "chapters".asDynamic().unsafeCast<TextTrackKind>()

actual inline val TextTrackKind.Companion.METADATA: TextTrackKind get() = "metadata".asDynamic().unsafeCast<TextTrackKind>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface SelectionMode {
    actual companion object
}

actual inline val SelectionMode.Companion.SELECT: SelectionMode get() = "select".asDynamic().unsafeCast<SelectionMode>()

actual inline val SelectionMode.Companion.START: SelectionMode get() = "start".asDynamic().unsafeCast<SelectionMode>()

actual inline val SelectionMode.Companion.END: SelectionMode get() = "end".asDynamic().unsafeCast<SelectionMode>()

actual inline val SelectionMode.Companion.PRESERVE: SelectionMode get() = "preserve".asDynamic().unsafeCast<SelectionMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanvasFillRule {
    actual companion object
}

actual inline val CanvasFillRule.Companion.NONZERO: CanvasFillRule get() = "nonzero".asDynamic().unsafeCast<CanvasFillRule>()

actual inline val CanvasFillRule.Companion.EVENODD: CanvasFillRule get() = "evenodd".asDynamic().unsafeCast<CanvasFillRule>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ImageSmoothingQuality {
    actual companion object
}

actual inline val ImageSmoothingQuality.Companion.LOW: ImageSmoothingQuality get() = "low".asDynamic().unsafeCast<ImageSmoothingQuality>()

actual inline val ImageSmoothingQuality.Companion.MEDIUM: ImageSmoothingQuality get() = "medium".asDynamic().unsafeCast<ImageSmoothingQuality>()

actual inline val ImageSmoothingQuality.Companion.HIGH: ImageSmoothingQuality get() = "high".asDynamic().unsafeCast<ImageSmoothingQuality>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanvasLineCap {
    actual companion object
}

actual inline val CanvasLineCap.Companion.BUTT: CanvasLineCap get() = "butt".asDynamic().unsafeCast<CanvasLineCap>()

actual inline val CanvasLineCap.Companion.ROUND: CanvasLineCap get() = "round".asDynamic().unsafeCast<CanvasLineCap>()

actual inline val CanvasLineCap.Companion.SQUARE: CanvasLineCap get() = "square".asDynamic().unsafeCast<CanvasLineCap>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanvasLineJoin {
    actual companion object
}

actual inline val CanvasLineJoin.Companion.ROUND: CanvasLineJoin get() = "round".asDynamic().unsafeCast<CanvasLineJoin>()

actual inline val CanvasLineJoin.Companion.BEVEL: CanvasLineJoin get() = "bevel".asDynamic().unsafeCast<CanvasLineJoin>()

actual inline val CanvasLineJoin.Companion.MITER: CanvasLineJoin get() = "miter".asDynamic().unsafeCast<CanvasLineJoin>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanvasTextAlign {
    actual companion object
}

actual inline val CanvasTextAlign.Companion.START: CanvasTextAlign get() = "start".asDynamic().unsafeCast<CanvasTextAlign>()

actual inline val CanvasTextAlign.Companion.END: CanvasTextAlign get() = "end".asDynamic().unsafeCast<CanvasTextAlign>()

actual inline val CanvasTextAlign.Companion.LEFT: CanvasTextAlign get() = "left".asDynamic().unsafeCast<CanvasTextAlign>()

actual inline val CanvasTextAlign.Companion.RIGHT: CanvasTextAlign get() = "right".asDynamic().unsafeCast<CanvasTextAlign>()

actual inline val CanvasTextAlign.Companion.CENTER: CanvasTextAlign get() = "center".asDynamic().unsafeCast<CanvasTextAlign>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanvasTextBaseline {
    actual companion object
}

actual inline val CanvasTextBaseline.Companion.TOP: CanvasTextBaseline get() = "top".asDynamic().unsafeCast<CanvasTextBaseline>()

actual inline val CanvasTextBaseline.Companion.HANGING: CanvasTextBaseline get() = "hanging".asDynamic().unsafeCast<CanvasTextBaseline>()

actual inline val CanvasTextBaseline.Companion.MIDDLE: CanvasTextBaseline get() = "middle".asDynamic().unsafeCast<CanvasTextBaseline>()

actual inline val CanvasTextBaseline.Companion.ALPHABETIC: CanvasTextBaseline get() = "alphabetic".asDynamic().unsafeCast<CanvasTextBaseline>()

actual inline val CanvasTextBaseline.Companion.IDEOGRAPHIC: CanvasTextBaseline get() = "ideographic".asDynamic().unsafeCast<CanvasTextBaseline>()

actual inline val CanvasTextBaseline.Companion.BOTTOM: CanvasTextBaseline get() = "bottom".asDynamic().unsafeCast<CanvasTextBaseline>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CanvasDirection {
    actual companion object
}

actual inline val CanvasDirection.Companion.LTR: CanvasDirection get() = "ltr".asDynamic().unsafeCast<CanvasDirection>()

actual inline val CanvasDirection.Companion.RTL: CanvasDirection get() = "rtl".asDynamic().unsafeCast<CanvasDirection>()

actual inline val CanvasDirection.Companion.INHERIT: CanvasDirection get() = "inherit".asDynamic().unsafeCast<CanvasDirection>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ScrollRestoration {
    actual companion object
}

actual inline val ScrollRestoration.Companion.AUTO: ScrollRestoration get() = "auto".asDynamic().unsafeCast<ScrollRestoration>()

actual inline val ScrollRestoration.Companion.MANUAL: ScrollRestoration get() = "manual".asDynamic().unsafeCast<ScrollRestoration>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ImageOrientation {
    actual companion object
}

actual inline val ImageOrientation.Companion.NONE: ImageOrientation get() = "none".asDynamic().unsafeCast<ImageOrientation>()

actual inline val ImageOrientation.Companion.FLIPY: ImageOrientation get() = "flipY".asDynamic().unsafeCast<ImageOrientation>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface PremultiplyAlpha {
    actual companion object
}

actual inline val PremultiplyAlpha.Companion.NONE: PremultiplyAlpha get() = "none".asDynamic().unsafeCast<PremultiplyAlpha>()

actual inline val PremultiplyAlpha.Companion.PREMULTIPLY: PremultiplyAlpha get() = "premultiply".asDynamic().unsafeCast<PremultiplyAlpha>()

actual inline val PremultiplyAlpha.Companion.DEFAULT: PremultiplyAlpha get() = "default".asDynamic().unsafeCast<PremultiplyAlpha>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ColorSpaceConversion {
    actual companion object
}

actual inline val ColorSpaceConversion.Companion.NONE: ColorSpaceConversion get() = "none".asDynamic().unsafeCast<ColorSpaceConversion>()

actual inline val ColorSpaceConversion.Companion.DEFAULT: ColorSpaceConversion get() = "default".asDynamic().unsafeCast<ColorSpaceConversion>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ResizeQuality {
    actual companion object
}

actual inline val ResizeQuality.Companion.PIXELATED: ResizeQuality get() = "pixelated".asDynamic().unsafeCast<ResizeQuality>()

actual inline val ResizeQuality.Companion.LOW: ResizeQuality get() = "low".asDynamic().unsafeCast<ResizeQuality>()

actual inline val ResizeQuality.Companion.MEDIUM: ResizeQuality get() = "medium".asDynamic().unsafeCast<ResizeQuality>()

actual inline val ResizeQuality.Companion.HIGH: ResizeQuality get() = "high".asDynamic().unsafeCast<ResizeQuality>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface BinaryType {
    actual companion object
}

actual inline val BinaryType.Companion.BLOB: BinaryType get() = "blob".asDynamic().unsafeCast<BinaryType>()

actual inline val BinaryType.Companion.ARRAYBUFFER: BinaryType get() = "arraybuffer".asDynamic().unsafeCast<BinaryType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface WorkerType {
    actual companion object
}

actual inline val WorkerType.Companion.CLASSIC: WorkerType get() = "classic".asDynamic().unsafeCast<WorkerType>()

actual inline val WorkerType.Companion.MODULE: WorkerType get() = "module".asDynamic().unsafeCast<WorkerType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ShadowRootMode {
    actual companion object
}

actual inline val ShadowRootMode.Companion.OPEN: ShadowRootMode get() = "open".asDynamic().unsafeCast<ShadowRootMode>()

actual inline val ShadowRootMode.Companion.CLOSED: ShadowRootMode get() = "closed".asDynamic().unsafeCast<ShadowRootMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ScrollBehavior {
    actual companion object
}

actual inline val ScrollBehavior.Companion.AUTO: ScrollBehavior get() = "auto".asDynamic().unsafeCast<ScrollBehavior>()

actual inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior get() = "instant".asDynamic().unsafeCast<ScrollBehavior>()

actual inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior get() = "smooth".asDynamic().unsafeCast<ScrollBehavior>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ScrollLogicalPosition {
    actual companion object
}

actual inline val ScrollLogicalPosition.Companion.START: ScrollLogicalPosition get() = "start".asDynamic().unsafeCast<ScrollLogicalPosition>()

actual inline val ScrollLogicalPosition.Companion.CENTER: ScrollLogicalPosition get() = "center".asDynamic().unsafeCast<ScrollLogicalPosition>()

actual inline val ScrollLogicalPosition.Companion.END: ScrollLogicalPosition get() = "end".asDynamic().unsafeCast<ScrollLogicalPosition>()

actual inline val ScrollLogicalPosition.Companion.NEAREST: ScrollLogicalPosition get() = "nearest".asDynamic().unsafeCast<ScrollLogicalPosition>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface CSSBoxType {
    actual companion object
}

actual inline val CSSBoxType.Companion.MARGIN: CSSBoxType get() = "margin".asDynamic().unsafeCast<CSSBoxType>()

actual inline val CSSBoxType.Companion.BORDER: CSSBoxType get() = "border".asDynamic().unsafeCast<CSSBoxType>()

actual inline val CSSBoxType.Companion.PADDING: CSSBoxType get() = "padding".asDynamic().unsafeCast<CSSBoxType>()

actual inline val CSSBoxType.Companion.CONTENT: CSSBoxType get() = "content".asDynamic().unsafeCast<CSSBoxType>()