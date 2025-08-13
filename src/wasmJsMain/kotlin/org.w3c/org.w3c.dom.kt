/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
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
import org.w3c.undefined
import org.w3c.workers.*
import org.w3c.xhr.*

public actual external abstract class HTMLAllCollection : JsAny {
    actual open val length: Int
    actual fun item(nameOrIndex: String): UnionElementOrHTMLCollection?
    actual fun namedItem(name: String): UnionElementOrHTMLCollection?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLAllCollection(obj: HTMLAllCollection, index: Int): Element? = js("obj[index]")

public actual operator fun HTMLAllCollection.get(index: Int): Element? = getMethodImplForHTMLAllCollection(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLAllCollection(obj: HTMLAllCollection, name: String): UnionElementOrHTMLCollection? = js("obj[name]")

public actual operator fun HTMLAllCollection.get(name: String): UnionElementOrHTMLCollection? = getMethodImplForHTMLAllCollection(this, name)

/**
 * Exposes the JavaScript [HTMLFormControlsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLFormControlsCollection) to Kotlin
 */
public actual external abstract class HTMLFormControlsCollection : HTMLCollection, JsAny

/**
 * Exposes the JavaScript [RadioNodeList](https://developer.mozilla.org/en/docs/Web/API/RadioNodeList) to Kotlin
 */
public actual external abstract class RadioNodeList : NodeList, UnionElementOrRadioNodeList, JsAny {
    actual open var value: String
}

/**
 * Exposes the JavaScript [HTMLOptionsCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLOptionsCollection) to Kotlin
 */
public actual external abstract class HTMLOptionsCollection : HTMLCollection, JsAny {
    actual override var length: Int
    actual open var selectedIndex: Int
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: HTMLElement)
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Int)
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement)
    actual fun remove(index: Int)
}

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForHTMLOptionsCollection(obj: HTMLOptionsCollection, index: Int, option: HTMLOptionElement?) { js("obj[index] = option;") }

public actual operator fun HTMLOptionsCollection.set(index: Int, option: HTMLOptionElement?) = setMethodImplForHTMLOptionsCollection(this, index, option)

/**
 * Exposes the JavaScript [HTMLElement](https://developer.mozilla.org/en/docs/Web/API/HTMLElement) to Kotlin
 */
public actual external abstract class HTMLElement : Element, GlobalEventHandlers, DocumentAndElementEventHandlers, ElementContentEditable, ElementCSSInlineStyle, JsAny {
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
public actual external abstract class HTMLUnknownElement : HTMLElement, JsAny {
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
public actual external abstract class DOMStringMap : JsAny

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForDOMStringMap(obj: DOMStringMap, name: String): String? = js("obj[name]")

public actual operator fun DOMStringMap.get(name: String): String? = getMethodImplForDOMStringMap(this, name)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForDOMStringMap(obj: DOMStringMap, name: String, value: String) { js("obj[name] = value;") }

public actual operator fun DOMStringMap.set(name: String, value: String) = setMethodImplForDOMStringMap(this, name, value)

/**
 * Exposes the JavaScript [HTMLHtmlElement](https://developer.mozilla.org/en/docs/Web/API/HTMLHtmlElement) to Kotlin
 */
public actual external abstract class HTMLHtmlElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLHeadElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTitleElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLBaseElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLLinkElement : HTMLElement, LinkStyle, JsAny {
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
public actual external abstract class HTMLMetaElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLStyleElement : HTMLElement, LinkStyle, JsAny {
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
public actual external abstract class HTMLBodyElement : HTMLElement, WindowEventHandlers, JsAny {
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
public actual external abstract class HTMLHeadingElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLParagraphElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLHRElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLPreElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLQuoteElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLOListElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLUListElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLLIElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLDListElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLDivElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLAnchorElement : HTMLElement, HTMLHyperlinkElementUtils, JsAny {
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
public actual external abstract class HTMLDataElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTimeElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLSpanElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLBRElement : HTMLElement, JsAny {
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
public actual external interface HTMLHyperlinkElementUtils : JsAny {
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
public actual external abstract class HTMLModElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLPictureElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLSourceElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLImageElement : HTMLElement, HTMLOrSVGImageElement, TexImageSource, JsAny {
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
public actual external abstract class HTMLIFrameElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLEmbedElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLObjectElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLParamElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLVideoElement : HTMLMediaElement, CanvasImageSource, TexImageSource, JsAny {
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
public actual external abstract class HTMLAudioElement : HTMLMediaElement, JsAny {
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
public actual external abstract class HTMLTrackElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLMediaElement : HTMLElement, JsAny {
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
    actual open var onencrypted: ((Event) -> Unit)?
    actual open var onwaitingforkey: ((Event) -> Unit)?
    actual fun load()
    actual fun canPlayType(type: String): CanPlayTypeResult
    actual fun fastSeek(time: Double)
    actual fun getStartDate(): JsAny
    actual fun play(): Promise<Nothing?>
    actual fun pause()
    actual fun addTextTrack(kind: TextTrackKind, label: String, language: String): TextTrack
    actual fun setMediaKeys(mediaKeys: MediaKeys?): Promise<Nothing?>

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
public actual external abstract class MediaError : JsAny {
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
public actual external abstract class AudioTrackList : EventTarget, JsAny {
    actual open val length: Int
    actual open var onchange: ((Event) -> Unit)?
    actual open var onaddtrack: ((TrackEvent) -> Unit)?
    actual open var onremovetrack: ((TrackEvent) -> Unit)?
    actual fun getTrackById(id: String): AudioTrack?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForAudioTrackList(obj: AudioTrackList, index: Int): AudioTrack? = js("obj[index]")

public actual operator fun AudioTrackList.get(index: Int): AudioTrack? = getMethodImplForAudioTrackList(this, index)

/**
 * Exposes the JavaScript [AudioTrack](https://developer.mozilla.org/en/docs/Web/API/AudioTrack) to Kotlin
 */
public actual external abstract class AudioTrack : UnionAudioTrackOrTextTrackOrVideoTrack, JsAny {
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
public actual external abstract class VideoTrackList : EventTarget, JsAny {
    actual open val length: Int
    actual open val selectedIndex: Int
    actual open var onchange: ((Event) -> Unit)?
    actual open var onaddtrack: ((TrackEvent) -> Unit)?
    actual open var onremovetrack: ((TrackEvent) -> Unit)?
    actual fun getTrackById(id: String): VideoTrack?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForVideoTrackList(obj: VideoTrackList, index: Int): VideoTrack? = js("obj[index]")

public actual operator fun VideoTrackList.get(index: Int): VideoTrack? = getMethodImplForVideoTrackList(this, index)

/**
 * Exposes the JavaScript [VideoTrack](https://developer.mozilla.org/en/docs/Web/API/VideoTrack) to Kotlin
 */
public actual external abstract class VideoTrack : UnionAudioTrackOrTextTrackOrVideoTrack, JsAny {
    actual open val id: String
    actual open val kind: String
    actual open val label: String
    actual open val language: String
    actual open var selected: Boolean
    actual open val sourceBuffer: SourceBuffer?
}

public actual external abstract class TextTrackList : EventTarget, JsAny {
    actual open val length: Int
    actual open var onchange: ((Event) -> Unit)?
    actual open var onaddtrack: ((TrackEvent) -> Unit)?
    actual open var onremovetrack: ((TrackEvent) -> Unit)?
    actual fun getTrackById(id: String): TextTrack?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForTextTrackList(obj: TextTrackList, index: Int): TextTrack? = js("obj[index]")

public actual operator fun TextTrackList.get(index: Int): TextTrack? = getMethodImplForTextTrackList(this, index)

/**
 * Exposes the JavaScript [TextTrack](https://developer.mozilla.org/en/docs/Web/API/TextTrack) to Kotlin
 */
public actual external abstract class TextTrack : EventTarget, UnionAudioTrackOrTextTrackOrVideoTrack, JsAny {
    actual open val kind: TextTrackKind
    actual open val label: String
    actual open val language: String
    actual open val id: String
    actual open val inBandMetadataTrackDispatchType: String
    actual open var mode: TextTrackMode
    actual open val cues: TextTrackCueList?
    actual open val activeCues: TextTrackCueList?
    actual open var oncuechange: ((Event) -> Unit)?
    actual open val sourceBuffer: SourceBuffer?
    actual fun addCue(cue: TextTrackCue)
    actual fun removeCue(cue: TextTrackCue)
}

public actual external abstract class TextTrackCueList : JsAny {
    actual open val length: Int
    actual fun getCueById(id: String): TextTrackCue?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForTextTrackCueList(obj: TextTrackCueList, index: Int): TextTrackCue? = js("obj[index]")

public actual operator fun TextTrackCueList.get(index: Int): TextTrackCue? = getMethodImplForTextTrackCueList(this, index)

/**
 * Exposes the JavaScript [TextTrackCue](https://developer.mozilla.org/en/docs/Web/API/TextTrackCue) to Kotlin
 */
public actual external abstract class TextTrackCue : EventTarget, JsAny {
    actual open val track: TextTrack?
    actual open var id: String
    actual open var startTime: Double
    actual open var endTime: Double
    actual open var pauseOnExit: Boolean
    actual open var onenter: ((Event) -> Unit)?
    actual open var onexit: ((Event) -> Unit)?
}

/**
 * Exposes the JavaScript [TimeRanges](https://developer.mozilla.org/en/docs/Web/API/TimeRanges) to Kotlin
 */
public actual external abstract class TimeRanges : JsAny {
    actual open val length: Int
    actual fun start(index: Int): Double
    actual fun end(index: Int): Double
}

/**
 * Exposes the JavaScript [TrackEvent](https://developer.mozilla.org/en/docs/Web/API/TrackEvent) to Kotlin
 */
public actual external open class TrackEvent actual constructor(type: String, eventInitDict: TrackEventInit) : Event, JsAny {
    actual open val track: UnionAudioTrackOrTextTrackOrVideoTrack?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface TrackEventInit : EventInit, JsAny {
    actual var track: UnionAudioTrackOrTextTrackOrVideoTrack? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun TrackEventInit(track: UnionAudioTrackOrTextTrackOrVideoTrack?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): TrackEventInit = js("({ track: track, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [HTMLMapElement](https://developer.mozilla.org/en/docs/Web/API/HTMLMapElement) to Kotlin
 */
public actual external abstract class HTMLMapElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLAreaElement : HTMLElement, HTMLHyperlinkElementUtils, JsAny {
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
public actual external abstract class HTMLTableElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTableCaptionElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTableColElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTableSectionElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTableRowElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLTableCellElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLFormElement : HTMLElement, JsAny {
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

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLFormElement(obj: HTMLFormElement, index: Int): Element? = js("obj[index]")

public actual operator fun HTMLFormElement.get(index: Int): Element? = getMethodImplForHTMLFormElement(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLFormElement(obj: HTMLFormElement, name: String): UnionElementOrRadioNodeList? = js("obj[name]")

public actual operator fun HTMLFormElement.get(name: String): UnionElementOrRadioNodeList? = getMethodImplForHTMLFormElement(this, name)

/**
 * Exposes the JavaScript [HTMLLabelElement](https://developer.mozilla.org/en/docs/Web/API/HTMLLabelElement) to Kotlin
 */
public actual external abstract class HTMLLabelElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLInputElement : HTMLElement, JsAny {
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
    actual open var valueAsDate: JsAny?
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
public actual external abstract class HTMLButtonElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLSelectElement : HTMLElement, ItemArrayLike<Element>, JsAny {
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
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: HTMLElement)
    actual fun add(element: UnionHTMLOptGroupElementOrHTMLOptionElement, before: Int)
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

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLSelectElement(obj: HTMLSelectElement, index: Int): Element? = js("obj[index]")

public actual operator fun HTMLSelectElement.get(index: Int): Element? = getMethodImplForHTMLSelectElement(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForHTMLSelectElement(obj: HTMLSelectElement, index: Int, option: HTMLOptionElement?) { js("obj[index] = option;") }

public actual operator fun HTMLSelectElement.set(index: Int, option: HTMLOptionElement?) = setMethodImplForHTMLSelectElement(this, index, option)

/**
 * Exposes the JavaScript [HTMLDataListElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDataListElement) to Kotlin
 */
public actual external abstract class HTMLDataListElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLOptGroupElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement, JsAny {
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
public actual external abstract class HTMLOptionElement : HTMLElement, UnionHTMLOptGroupElementOrHTMLOptionElement, JsAny {
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
public actual external abstract class HTMLTextAreaElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLKeygenElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLOutputElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLProgressElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLMeterElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLFieldSetElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLLegendElement : HTMLElement, JsAny {
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
public actual external abstract class ValidityState : JsAny {
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
public actual external abstract class HTMLDetailsElement : HTMLElement, JsAny {
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

public actual external abstract class HTMLMenuElement : HTMLElement, JsAny {
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

public actual external abstract class HTMLMenuItemElement : HTMLElement, JsAny {
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

public actual external open class RelatedEvent actual constructor(type: String, eventInitDict: RelatedEventInit) : Event, JsAny {
    actual open val relatedTarget: EventTarget?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface RelatedEventInit : EventInit, JsAny {
    actual var relatedTarget: EventTarget? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun RelatedEventInit(relatedTarget: EventTarget?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): RelatedEventInit = js("({ relatedTarget: relatedTarget, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [HTMLDialogElement](https://developer.mozilla.org/en/docs/Web/API/HTMLDialogElement) to Kotlin
 */
public actual external abstract class HTMLDialogElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLScriptElement : HTMLElement, HTMLOrSVGScriptElement, JsAny {
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
public actual external abstract class HTMLTemplateElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLSlotElement : HTMLElement, JsAny {
    actual open var name: String
    actual fun assignedNodes(options: AssignedNodesOptions): JsArray<Node>

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

public actual external interface AssignedNodesOptions : JsAny {
    actual var flatten: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun AssignedNodesOptions(flatten: Boolean?): AssignedNodesOptions = js("({ flatten: flatten })")

/**
 * Exposes the JavaScript [HTMLCanvasElement](https://developer.mozilla.org/en/docs/Web/API/HTMLCanvasElement) to Kotlin
 */
public actual external abstract class HTMLCanvasElement : HTMLElement, CanvasImageSource, TexImageSource, JsAny {
    actual open var width: Int
    actual open var height: Int
    actual fun getContext(contextId: String, vararg arguments: JsAny?): RenderingContext?
    actual fun toDataURL(type: String, quality: JsAny?): String
    actual fun toBlob(_callback: (Blob?) -> Unit, type: String, quality: JsAny?)

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

public actual external interface CanvasRenderingContext2DSettings : JsAny {
    actual var alpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun CanvasRenderingContext2DSettings(alpha: Boolean?): CanvasRenderingContext2DSettings = js("({ alpha: alpha })")

/**
 * Exposes the JavaScript [CanvasRenderingContext2D](https://developer.mozilla.org/en/docs/Web/API/CanvasRenderingContext2D) to Kotlin
 */
public actual external abstract class CanvasRenderingContext2D : CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasHitRegion, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, RenderingContext, JsAny {
    actual open val canvas: HTMLCanvasElement
}

public actual external interface CanvasState : JsAny {
    actual fun save()
    actual fun restore()
}

public actual external interface CanvasTransform : JsAny {
    actual fun scale(x: Double, y: Double)
    actual fun rotate(angle: Double)
    actual fun translate(x: Double, y: Double)
    actual fun transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
    actual fun getTransform(): DOMMatrix
    actual fun setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double)
    actual fun setTransform(transform: JsAny?)
    actual fun resetTransform()
}

public actual external interface CanvasCompositing : JsAny {
    actual var globalAlpha: Double
    actual var globalCompositeOperation: String
}

public actual external interface CanvasImageSmoothing : JsAny {
    actual var imageSmoothingEnabled: Boolean
    actual var imageSmoothingQuality: ImageSmoothingQuality
}

public actual external interface CanvasFillStrokeStyles : JsAny {
    actual var strokeStyle: JsAny? /* String|CanvasGradient|CanvasPattern */
    actual var fillStyle: JsAny? /* String|CanvasGradient|CanvasPattern */
    actual fun createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasGradient
    actual fun createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): CanvasGradient
    actual fun createPattern(image: CanvasImageSource, repetition: String): CanvasPattern?
}

public actual external interface CanvasShadowStyles : JsAny {
    actual var shadowOffsetX: Double
    actual var shadowOffsetY: Double
    actual var shadowBlur: Double
    actual var shadowColor: String
}

public actual external interface CanvasFilters : JsAny {
    actual var filter: String
}

public actual external interface CanvasRect : JsAny {
    actual fun clearRect(x: Double, y: Double, w: Double, h: Double)
    actual fun fillRect(x: Double, y: Double, w: Double, h: Double)
    actual fun strokeRect(x: Double, y: Double, w: Double, h: Double)
}

public actual external interface CanvasDrawPath : JsAny {
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

public actual external interface CanvasUserInterface : JsAny {
    actual fun drawFocusIfNeeded(element: Element)
    actual fun drawFocusIfNeeded(path: Path2D, element: Element)
    actual fun scrollPathIntoView()
    actual fun scrollPathIntoView(path: Path2D)
}

public actual external interface CanvasText : JsAny {
    actual fun fillText(text: String, x: Double, y: Double, maxWidth: Double)
    actual fun strokeText(text: String, x: Double, y: Double, maxWidth: Double)
    actual fun measureText(text: String): TextMetrics
}

public actual external interface CanvasDrawImage : JsAny {
    actual fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
    actual fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)
    actual fun drawImage(image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double)
}

public actual external interface CanvasHitRegion : JsAny {
    actual fun addHitRegion(options: HitRegionOptions)
    actual fun removeHitRegion(id: String)
    actual fun clearHitRegions()
}

public actual external interface CanvasImageData : JsAny {
    actual fun createImageData(sw: Double, sh: Double): ImageData
    actual fun createImageData(imagedata: ImageData): ImageData
    actual fun getImageData(sx: Double, sy: Double, sw: Double, sh: Double): ImageData
    actual fun putImageData(imagedata: ImageData, dx: Double, dy: Double)
    actual fun putImageData(imagedata: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double, dirtyWidth: Double, dirtyHeight: Double)
}

public actual external interface CanvasPathDrawingStyles : JsAny {
    actual var lineWidth: Double
    actual var lineCap: CanvasLineCap
    actual var lineJoin: CanvasLineJoin
    actual var miterLimit: Double
    actual var lineDashOffset: Double
    actual fun setLineDash(segments: JsArray<JsNumber>)
    actual fun getLineDash(): JsArray<JsNumber>
}

public actual external interface CanvasTextDrawingStyles : JsAny {
    actual var font: String
    actual var textAlign: CanvasTextAlign
    actual var textBaseline: CanvasTextBaseline
    actual var direction: CanvasDirection
}

public actual external interface CanvasPath : JsAny {
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
public actual external abstract class CanvasGradient : JsAny {
    actual fun addColorStop(offset: Double, color: String)
}

/**
 * Exposes the JavaScript [CanvasPattern](https://developer.mozilla.org/en/docs/Web/API/CanvasPattern) to Kotlin
 */
public actual external abstract class CanvasPattern : JsAny {
    actual fun setTransform(transform: JsAny?)
}

/**
 * Exposes the JavaScript [TextMetrics](https://developer.mozilla.org/en/docs/Web/API/TextMetrics) to Kotlin
 */
public actual external abstract class TextMetrics : JsAny {
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

public actual external interface HitRegionOptions : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun HitRegionOptions(path: Path2D?, fillRule: CanvasFillRule?, id: String?, parentID: String?, cursor: String?, control: Element?, label: String?, role: String?): HitRegionOptions = js("({ path: path, fillRule: fillRule, id: id, parentID: parentID, cursor: cursor, control: control, label: label, role: role })")

/**
 * Exposes the JavaScript [ImageData](https://developer.mozilla.org/en/docs/Web/API/ImageData) to Kotlin
 */
public actual external open class ImageData : ImageBitmapSource, TexImageSource, JsAny {
    actual constructor(sw: Int, sh: Int)
    actual constructor(data: Uint8ClampedArray, sw: Int, sh: Int)
    actual open val width: Int
    actual open val height: Int
    actual open val data: Uint8ClampedArray
}

/**
 * Exposes the JavaScript [Path2D](https://developer.mozilla.org/en/docs/Web/API/Path2D) to Kotlin
 */
public actual external open class Path2D actual constructor() : CanvasPath, JsAny {
    actual constructor(path: Path2D)
    actual constructor(paths: JsArray<Path2D>, fillRule: CanvasFillRule)
    actual constructor(d: String)
    actual fun addPath(path: Path2D, transform: JsAny?)
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
public actual external abstract class ImageBitmapRenderingContext : JsAny {
    actual open val canvas: HTMLCanvasElement
    actual fun transferFromImageBitmap(bitmap: ImageBitmap?)
}

public actual external interface ImageBitmapRenderingContextSettings : JsAny {
    actual var alpha: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ImageBitmapRenderingContextSettings(alpha: Boolean?): ImageBitmapRenderingContextSettings = js("({ alpha: alpha })")

/**
 * Exposes the JavaScript [CustomElementRegistry](https://developer.mozilla.org/en/docs/Web/API/CustomElementRegistry) to Kotlin
 */
public actual external abstract class CustomElementRegistry : JsAny {
    actual fun define(name: String, constructor: () -> JsAny?, options: ElementDefinitionOptions)
    actual fun get(name: String): JsAny?
    actual fun whenDefined(name: String): Promise<Nothing?>
}

public actual external interface ElementDefinitionOptions : JsAny {
    actual var extends: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ElementDefinitionOptions(extends_: String?): ElementDefinitionOptions = js("({ extends: extends_ })")

public actual external interface ElementContentEditable : JsAny {
    actual var contentEditable: String
    actual val isContentEditable: Boolean
}

/**
 * Exposes the JavaScript [DataTransfer](https://developer.mozilla.org/en/docs/Web/API/DataTransfer) to Kotlin
 */
public actual external abstract class DataTransfer : JsAny {
    actual open var dropEffect: String
    actual open var effectAllowed: String
    actual open val items: DataTransferItemList
    actual open val types: JsArray<out JsString>
    actual open val files: FileList
    actual fun setDragImage(image: Element, x: Int, y: Int)
    actual fun getData(format: String): String
    actual fun setData(format: String, data: String)
    actual fun clearData(format: String)
}

/**
 * Exposes the JavaScript [DataTransferItemList](https://developer.mozilla.org/en/docs/Web/API/DataTransferItemList) to Kotlin
 */
public actual external abstract class DataTransferItemList : JsAny {
    actual open val length: Int
    actual fun add(data: String, type: String): DataTransferItem?
    actual fun add(data: File): DataTransferItem?
    actual fun remove(index: Int)
    actual fun clear()
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForDataTransferItemList(obj: DataTransferItemList, index: Int): DataTransferItem? = js("obj[index]")

public actual operator fun DataTransferItemList.get(index: Int): DataTransferItem? = getMethodImplForDataTransferItemList(this, index)

/**
 * Exposes the JavaScript [DataTransferItem](https://developer.mozilla.org/en/docs/Web/API/DataTransferItem) to Kotlin
 */
public actual external abstract class DataTransferItem : JsAny {
    actual open val kind: String
    actual open val type: String
    actual fun getAsString(_callback: ((String) -> Unit)?)
    actual fun getAsFile(): File?
}

/**
 * Exposes the JavaScript [DragEvent](https://developer.mozilla.org/en/docs/Web/API/DragEvent) to Kotlin
 */
public actual external open class DragEvent actual constructor(type: String, eventInitDict: DragEventInit) : MouseEvent, JsAny {
    actual open val dataTransfer: DataTransfer?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface DragEventInit : MouseEventInit, JsAny {
    actual var dataTransfer: DataTransfer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun DragEventInit(dataTransfer: DataTransfer?, screenX: Int?, screenY: Int?, clientX: Int?, clientY: Int?, button: Short?, buttons: Short?, relatedTarget: EventTarget?, region: String?, ctrlKey: Boolean?, shiftKey: Boolean?, altKey: Boolean?, metaKey: Boolean?, modifierAltGraph: Boolean?, modifierCapsLock: Boolean?, modifierFn: Boolean?, modifierFnLock: Boolean?, modifierHyper: Boolean?, modifierNumLock: Boolean?, modifierScrollLock: Boolean?, modifierSuper: Boolean?, modifierSymbol: Boolean?, modifierSymbolLock: Boolean?, view: Window?, detail: Int?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): DragEventInit = js("({ dataTransfer: dataTransfer, screenX: screenX, screenY: screenY, clientX: clientX, clientY: clientY, button: button, buttons: buttons, relatedTarget: relatedTarget, region: region, ctrlKey: ctrlKey, shiftKey: shiftKey, altKey: altKey, metaKey: metaKey, modifierAltGraph: modifierAltGraph, modifierCapsLock: modifierCapsLock, modifierFn: modifierFn, modifierFnLock: modifierFnLock, modifierHyper: modifierHyper, modifierNumLock: modifierNumLock, modifierScrollLock: modifierScrollLock, modifierSuper: modifierSuper, modifierSymbol: modifierSymbol, modifierSymbolLock: modifierSymbolLock, view: view, detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [Window](https://developer.mozilla.org/en/docs/Web/API/Window) to Kotlin
 */
public actual external abstract class Window : EventTarget, GlobalEventHandlers, WindowEventHandlers, WindowOrWorkerGlobalScope, WindowSessionStorage, WindowLocalStorage, GlobalPerformance, UnionMessagePortOrWindowProxy, JsAny {
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
    actual open var opener: JsAny?
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
    actual fun postMessage(message: JsAny?, targetOrigin: String, transfer: JsArray<JsAny>)
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

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForWindow(obj: Window, name: String): JsAny? = js("obj[name]")

public actual operator fun Window.get(name: String): JsAny? = getMethodImplForWindow(this, name)

public actual external abstract class BarProp : JsAny {
    actual open val visible: Boolean
}

/**
 * Exposes the JavaScript [History](https://developer.mozilla.org/en/docs/Web/API/History) to Kotlin
 */
public actual external abstract class History : JsAny {
    actual open val length: Int
    actual open var scrollRestoration: ScrollRestoration
    actual open val state: JsAny?
    actual fun go(delta: Int)
    actual fun back()
    actual fun forward()
    actual fun pushState(data: JsAny?, title: String, url: String?)
    actual fun replaceState(data: JsAny?, title: String, url: String?)
}

/**
 * Exposes the JavaScript [Location](https://developer.mozilla.org/en/docs/Web/API/Location) to Kotlin
 */
public actual external abstract class Location : JsAny {
    actual open var href: String
    actual open val origin: String
    actual open var protocol: String
    actual open var host: String
    actual open var hostname: String
    actual open var port: String
    actual open var pathname: String
    actual open var search: String
    actual open var hash: String
    actual open val ancestorOrigins: JsArray<out JsString>
    actual fun assign(url: String)
    actual fun replace(url: String)
    actual fun reload()
}

/**
 * Exposes the JavaScript [PopStateEvent](https://developer.mozilla.org/en/docs/Web/API/PopStateEvent) to Kotlin
 */
public actual external open class PopStateEvent actual constructor(type: String, eventInitDict: PopStateEventInit) : Event, JsAny {
    actual open val state: JsAny?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface PopStateEventInit : EventInit, JsAny {
    actual var state: JsAny? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun PopStateEventInit(state: JsAny?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PopStateEventInit = js("({ state: state, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [HashChangeEvent](https://developer.mozilla.org/en/docs/Web/API/HashChangeEvent) to Kotlin
 */
public actual external open class HashChangeEvent actual constructor(type: String, eventInitDict: HashChangeEventInit) : Event, JsAny {
    actual open val oldURL: String
    actual open val newURL: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface HashChangeEventInit : EventInit, JsAny {
    actual var oldURL: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var newURL: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun HashChangeEventInit(oldURL: String?, newURL: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): HashChangeEventInit = js("({ oldURL: oldURL, newURL: newURL, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [PageTransitionEvent](https://developer.mozilla.org/en/docs/Web/API/PageTransitionEvent) to Kotlin
 */
public actual external open class PageTransitionEvent actual constructor(type: String, eventInitDict: PageTransitionEventInit) : Event, JsAny {
    actual open val persisted: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface PageTransitionEventInit : EventInit, JsAny {
    actual var persisted: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun PageTransitionEventInit(persisted: Boolean?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PageTransitionEventInit = js("({ persisted: persisted, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [BeforeUnloadEvent](https://developer.mozilla.org/en/docs/Web/API/BeforeUnloadEvent) to Kotlin
 */
public actual external open class BeforeUnloadEvent : Event, JsAny {
    actual var returnValue: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external abstract class ApplicationCache : EventTarget, JsAny {
    actual open val status: Short
    actual open var onchecking: ((Event) -> Unit)?
    actual open var onerror: ((Event) -> Unit)?
    actual open var onnoupdate: ((Event) -> Unit)?
    actual open var ondownloading: ((Event) -> Unit)?
    actual open var onprogress: ((ProgressEvent) -> Unit)?
    actual open var onupdateready: ((Event) -> Unit)?
    actual open var oncached: ((Event) -> Unit)?
    actual open var onobsolete: ((Event) -> Unit)?
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
public actual external interface NavigatorOnLine : JsAny {
    actual val onLine: Boolean
}

/**
 * Exposes the JavaScript [ErrorEvent](https://developer.mozilla.org/en/docs/Web/API/ErrorEvent) to Kotlin
 */
public actual external open class ErrorEvent actual constructor(type: String, eventInitDict: ErrorEventInit) : Event, JsAny {
    actual open val message: String
    actual open val filename: String
    actual open val lineno: Int
    actual open val colno: Int
    actual open val error: JsAny?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface ErrorEventInit : EventInit, JsAny {
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
    actual var error: JsAny? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ErrorEventInit(message: String?, filename: String?, lineno: Int?, colno: Int?, error: JsAny?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ErrorEventInit = js("({ message: message, filename: filename, lineno: lineno, colno: colno, error: error, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [PromiseRejectionEvent](https://developer.mozilla.org/en/docs/Web/API/PromiseRejectionEvent) to Kotlin
 */
public actual external open class PromiseRejectionEvent actual constructor(type: String, eventInitDict: PromiseRejectionEventInit) : Event, JsAny {
    actual open val promise: Promise<JsAny?>
    actual open val reason: JsAny?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface PromiseRejectionEventInit : EventInit, JsAny {
    actual var promise: Promise<JsAny?>?
    actual var reason: JsAny?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun PromiseRejectionEventInit(promise: Promise<JsAny?>?, reason: JsAny?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): PromiseRejectionEventInit = js("({ promise: promise, reason: reason, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [GlobalEventHandlers](https://developer.mozilla.org/en/docs/Web/API/GlobalEventHandlers) to Kotlin
 */
public actual external interface GlobalEventHandlers : JsAny {
    actual var onabort: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onblur: ((FocusEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncancel: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncanplay: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncanplaythrough: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onchange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onclick: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onclose: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncontextmenu: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncuechange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondblclick: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondrag: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragend: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragenter: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragexit: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragleave: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragover: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondragstart: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondrop: ((DragEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ondurationchange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onemptied: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onended: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onerror: ((JsAny? /* Event|String */, String, Int, Int, JsAny?) -> JsAny?)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onfocus: ((FocusEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oninput: ((InputEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oninvalid: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onkeydown: ((KeyboardEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onkeypress: ((KeyboardEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onkeyup: ((KeyboardEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onload: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadeddata: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadedmetadata: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadend: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onloadstart: ((ProgressEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmousedown: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseenter: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseleave: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmousemove: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseout: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseover: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmouseup: ((MouseEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onwheel: ((WheelEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpause: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onplay: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onplaying: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onprogress: ((ProgressEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onratechange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onreset: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onresize: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onscroll: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onseeked: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onseeking: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onselect: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onshow: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onstalled: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onsubmit: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onsuspend: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ontimeupdate: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ontoggle: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onvolumechange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onwaiting: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ongotpointercapture: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onlostpointercapture: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerdown: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointermove: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerup: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointercancel: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerover: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerout: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerenter: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpointerleave: ((PointerEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

/**
 * Exposes the JavaScript [WindowEventHandlers](https://developer.mozilla.org/en/docs/Web/API/WindowEventHandlers) to Kotlin
 */
public actual external interface WindowEventHandlers : JsAny {
    actual var onafterprint: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onbeforeprint: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onbeforeunload: ((BeforeUnloadEvent) -> String?)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onhashchange: ((HashChangeEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onlanguagechange: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onmessage: ((MessageEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onoffline: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var ononline: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpagehide: ((PageTransitionEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpageshow: ((PageTransitionEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpopstate: ((PopStateEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onrejectionhandled: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onstorage: ((StorageEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onunhandledrejection: ((PromiseRejectionEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onunload: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

public actual external interface DocumentAndElementEventHandlers : JsAny {
    actual var oncopy: ((ClipboardEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var oncut: ((ClipboardEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual var onpaste: ((ClipboardEvent) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

/**
 * Exposes the JavaScript [WindowOrWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WindowOrWorkerGlobalScope) to Kotlin
 */
public actual external interface WindowOrWorkerGlobalScope : JsAny {
    actual val origin: String
    actual val caches: CacheStorage
    actual fun btoa(data: String): String
    actual fun atob(data: String): String
    actual fun setTimeout(handler: String, timeout: Int, vararg arguments: JsAny?): Int
    actual fun setTimeout(handler: () -> JsAny?, timeout: Int, vararg arguments: JsAny?): Int
    actual fun clearTimeout(handle: Int)
    actual fun setInterval(handler: String, timeout: Int, vararg arguments: JsAny?): Int
    actual fun setInterval(handler: () -> JsAny?, timeout: Int, vararg arguments: JsAny?): Int
    actual fun clearInterval(handle: Int)
    actual fun createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): Promise<ImageBitmap>
    actual fun createImageBitmap(image: ImageBitmapSource, sx: Int, sy: Int, sw: Int, sh: Int, options: ImageBitmapOptions): Promise<ImageBitmap>
    actual fun fetch(input: Request, init: RequestInit): Promise<Response>
    actual fun fetch(input: String, init: RequestInit): Promise<Response>
}

/**
 * Exposes the JavaScript [Navigator](https://developer.mozilla.org/en/docs/Web/API/Navigator) to Kotlin
 */
public actual external abstract class Navigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorContentUtils, NavigatorCookies, NavigatorPlugins, NavigatorConcurrentHardware, JsAny {
    actual open val clipboard: Clipboard
    actual open val mediaDevices: MediaDevices
    actual open val maxTouchPoints: Int
    actual open val serviceWorker: ServiceWorkerContainer
    actual fun requestMediaKeySystemAccess(keySystem: String, supportedConfigurations: JsArray<MediaKeySystemConfiguration>): Promise<MediaKeySystemAccess>
    actual fun getUserMedia(constraints: MediaStreamConstraints, successCallback: (MediaStream) -> Unit, errorCallback: (JsAny) -> Unit)
    actual fun vibrate(pattern: Int): Boolean
    actual fun vibrate(pattern: JsArray<JsNumber>): Boolean
}

/**
 * Exposes the JavaScript [NavigatorID](https://developer.mozilla.org/en/docs/Web/API/NavigatorID) to Kotlin
 */
public actual external interface NavigatorID : JsAny {
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
public actual external interface NavigatorLanguage : JsAny {
    actual val language: String
    actual val languages: JsArray<out JsString>
}

public actual external interface NavigatorContentUtils : JsAny {
    actual fun registerProtocolHandler(scheme: String, url: String, title: String)
    actual fun registerContentHandler(mimeType: String, url: String, title: String)
    actual fun isProtocolHandlerRegistered(scheme: String, url: String): String
    actual fun isContentHandlerRegistered(mimeType: String, url: String): String
    actual fun unregisterProtocolHandler(scheme: String, url: String)
    actual fun unregisterContentHandler(mimeType: String, url: String)
}

public actual external interface NavigatorCookies : JsAny {
    actual val cookieEnabled: Boolean
}

/**
 * Exposes the JavaScript [NavigatorPlugins](https://developer.mozilla.org/en/docs/Web/API/NavigatorPlugins) to Kotlin
 */
public actual external interface NavigatorPlugins : JsAny {
    actual val plugins: PluginArray
    actual val mimeTypes: MimeTypeArray
    actual fun javaEnabled(): Boolean
}

/**
 * Exposes the JavaScript [PluginArray](https://developer.mozilla.org/en/docs/Web/API/PluginArray) to Kotlin
 */
public actual external abstract class PluginArray : ItemArrayLike<Plugin>, JsAny {
    actual fun refresh(reload: Boolean)
    actual override fun item(index: Int): Plugin?
    actual fun namedItem(name: String): Plugin?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForPluginArray(obj: PluginArray, index: Int): Plugin? = js("obj[index]")

public actual operator fun PluginArray.get(index: Int): Plugin? = getMethodImplForPluginArray(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForPluginArray(obj: PluginArray, name: String): Plugin? = js("obj[name]")

public actual operator fun PluginArray.get(name: String): Plugin? = getMethodImplForPluginArray(this, name)

/**
 * Exposes the JavaScript [MimeTypeArray](https://developer.mozilla.org/en/docs/Web/API/MimeTypeArray) to Kotlin
 */
public actual external abstract class MimeTypeArray : ItemArrayLike<MimeType>, JsAny {
    actual override fun item(index: Int): MimeType?
    actual fun namedItem(name: String): MimeType?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForMimeTypeArray(obj: MimeTypeArray, index: Int): MimeType? = js("obj[index]")

public actual operator fun MimeTypeArray.get(index: Int): MimeType? = getMethodImplForMimeTypeArray(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForMimeTypeArray(obj: MimeTypeArray, name: String): MimeType? = js("obj[name]")

public actual operator fun MimeTypeArray.get(name: String): MimeType? = getMethodImplForMimeTypeArray(this, name)

/**
 * Exposes the JavaScript [Plugin](https://developer.mozilla.org/en/docs/Web/API/Plugin) to Kotlin
 */
public actual external abstract class Plugin : ItemArrayLike<MimeType>, JsAny {
    actual open val name: String
    actual open val description: String
    actual open val filename: String
    actual override fun item(index: Int): MimeType?
    actual fun namedItem(name: String): MimeType?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForPlugin(obj: Plugin, index: Int): MimeType? = js("obj[index]")

public actual operator fun Plugin.get(index: Int): MimeType? = getMethodImplForPlugin(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForPlugin(obj: Plugin, name: String): MimeType? = js("obj[name]")

public actual operator fun Plugin.get(name: String): MimeType? = getMethodImplForPlugin(this, name)

/**
 * Exposes the JavaScript [MimeType](https://developer.mozilla.org/en/docs/Web/API/MimeType) to Kotlin
 */
public actual external abstract class MimeType : JsAny {
    actual open val type: String
    actual open val description: String
    actual open val suffixes: String
    actual open val enabledPlugin: Plugin
}

/**
 * Exposes the JavaScript [ImageBitmap](https://developer.mozilla.org/en/docs/Web/API/ImageBitmap) to Kotlin
 */
public actual external abstract class ImageBitmap : CanvasImageSource, TexImageSource, JsAny {
    actual open val width: Int
    actual open val height: Int
    actual fun close()
}

public actual external interface ImageBitmapOptions : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun ImageBitmapOptions(imageOrientation: ImageOrientation?, premultiplyAlpha: PremultiplyAlpha?, colorSpaceConversion: ColorSpaceConversion?, resizeWidth: Int?, resizeHeight: Int?, resizeQuality: ResizeQuality?): ImageBitmapOptions = js("({ imageOrientation: imageOrientation, premultiplyAlpha: premultiplyAlpha, colorSpaceConversion: colorSpaceConversion, resizeWidth: resizeWidth, resizeHeight: resizeHeight, resizeQuality: resizeQuality })")

/**
 * Exposes the JavaScript [MessageEvent](https://developer.mozilla.org/en/docs/Web/API/MessageEvent) to Kotlin
 */
public actual external open class MessageEvent actual constructor(type: String, eventInitDict: MessageEventInit) : Event, JsAny {
    actual open val data: JsAny?
    actual open val origin: String
    actual open val lastEventId: String
    actual open val source: UnionMessagePortOrWindowProxy?
    actual open val ports: JsArray<out MessagePort>
    actual fun initMessageEvent(type: String, bubbles: Boolean, cancelable: Boolean, data: JsAny?, origin: String, lastEventId: String, source: UnionMessagePortOrWindowProxy?, ports: JsArray<MessagePort>)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface MessageEventInit : EventInit, JsAny {
    actual var data: JsAny? /* = null */
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
    actual var ports: JsArray<MessagePort>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MessageEventInit(data: JsAny?, origin: String?, lastEventId: String?, source: UnionMessagePortOrWindowProxy?, ports: JsArray<MessagePort>?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MessageEventInit = js("({ data: data, origin: origin, lastEventId: lastEventId, source: source, ports: ports, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [EventSource](https://developer.mozilla.org/en/docs/Web/API/EventSource) to Kotlin
 */
public actual external open class EventSource actual constructor(url: String, eventSourceInitDict: EventSourceInit) : EventTarget, JsAny {
    actual open val url: String
    actual open val withCredentials: Boolean
    actual open val readyState: Short
    actual var onopen: ((Event) -> Unit)?
    actual var onmessage: ((MessageEvent) -> Unit)?
    actual var onerror: ((Event) -> Unit)?
    actual fun close()

    actual companion object {
        actual val CONNECTING: Short
        actual val OPEN: Short
        actual val CLOSED: Short
    }
}

public actual external interface EventSourceInit : JsAny {
    actual var withCredentials: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun EventSourceInit(withCredentials: Boolean?): EventSourceInit = js("({ withCredentials: withCredentials })")

/**
 * Exposes the JavaScript [WebSocket](https://developer.mozilla.org/en/docs/Web/API/WebSocket) to Kotlin
 */
public actual external open class WebSocket actual constructor(url: String, protocols: JsAny? /* String|JsArray<JsString> */) : EventTarget, JsAny {
    actual open val url: String
    actual open val readyState: Short
    actual open val bufferedAmount: JsNumber
    actual var onopen: ((Event) -> Unit)?
    actual var onerror: ((Event) -> Unit)?
    actual var onclose: ((Event) -> Unit)?
    actual open val extensions: String
    actual open val protocol: String
    actual var onmessage: ((MessageEvent) -> Unit)?
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
public actual external open class CloseEvent actual constructor(type: String, eventInitDict: CloseEventInit) : Event, JsAny {
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

public actual external interface CloseEventInit : EventInit, JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun CloseEventInit(wasClean: Boolean?, code: Short?, reason: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): CloseEventInit = js("({ wasClean: wasClean, code: code, reason: reason, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [MessageChannel](https://developer.mozilla.org/en/docs/Web/API/MessageChannel) to Kotlin
 */
public actual external open class MessageChannel actual constructor() : JsAny {
    actual open val port1: MessagePort
    actual open val port2: MessagePort
}

/**
 * Exposes the JavaScript [MessagePort](https://developer.mozilla.org/en/docs/Web/API/MessagePort) to Kotlin
 */
public actual external abstract class MessagePort : EventTarget, UnionMessagePortOrWindowProxy, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker, JsAny {
    actual open var onmessage: ((MessageEvent) -> Unit)?
    actual fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    actual fun start()
    actual fun close()
}

/**
 * Exposes the JavaScript [BroadcastChannel](https://developer.mozilla.org/en/docs/Web/API/BroadcastChannel) to Kotlin
 */
public actual external open class BroadcastChannel actual constructor(name: String) : EventTarget, JsAny {
    actual open val name: String
    actual var onmessage: ((MessageEvent) -> Unit)?
    actual fun postMessage(message: JsAny?)
    actual fun close()
}

/**
 * Exposes the JavaScript [WorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/WorkerGlobalScope) to Kotlin
 */
public actual external abstract class WorkerGlobalScope : EventTarget, WindowOrWorkerGlobalScope, GlobalPerformance, JsAny {
    actual open val self: WorkerGlobalScope
    actual open val location: WorkerLocation
    actual open val navigator: WorkerNavigator
    actual open var onerror: ((JsAny? /* Event|String */, String, Int, Int, JsAny?) -> JsAny?)?
    actual open var onlanguagechange: ((Event) -> Unit)?
    actual open var onoffline: ((Event) -> Unit)?
    actual open var ononline: ((Event) -> Unit)?
    actual open var onrejectionhandled: ((Event) -> Unit)?
    actual open var onunhandledrejection: ((PromiseRejectionEvent) -> Unit)?
    actual fun importScripts(vararg urls: String)
}

/**
 * Exposes the JavaScript [DedicatedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/DedicatedWorkerGlobalScope) to Kotlin
 */
public actual external abstract class DedicatedWorkerGlobalScope : WorkerGlobalScope, JsAny {
    actual open var onmessage: ((MessageEvent) -> Unit)?
    actual fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    actual fun close()
}

/**
 * Exposes the JavaScript [SharedWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/SharedWorkerGlobalScope) to Kotlin
 */
public actual external abstract class SharedWorkerGlobalScope : WorkerGlobalScope, JsAny {
    actual open val name: String
    actual open val applicationCache: ApplicationCache
    actual open var onconnect: ((Event) -> Unit)?
    actual fun close()
}

/**
 * Exposes the JavaScript [AbstractWorker](https://developer.mozilla.org/en/docs/Web/API/AbstractWorker) to Kotlin
 */
public actual external interface AbstractWorker : JsAny {
    actual var onerror: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

/**
 * Exposes the JavaScript [Worker](https://developer.mozilla.org/en/docs/Web/API/Worker) to Kotlin
 */
public actual external open class Worker actual constructor(scriptURL: String, options: WorkerOptions) : EventTarget, AbstractWorker, JsAny {
    actual var onmessage: ((MessageEvent) -> Unit)?
    actual override var onerror: ((Event) -> Unit)?
    actual fun terminate()
    actual fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
}

public actual external interface WorkerOptions : JsAny {
    actual var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
    actual var credentials: RequestCredentials? /* = RequestCredentials.OMIT */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun WorkerOptions(type: WorkerType?, credentials: RequestCredentials?): WorkerOptions = js("({ type: type, credentials: credentials })")

/**
 * Exposes the JavaScript [SharedWorker](https://developer.mozilla.org/en/docs/Web/API/SharedWorker) to Kotlin
 */
public actual external open class SharedWorker actual constructor(scriptURL: String, name: String, options: WorkerOptions) : EventTarget, AbstractWorker, JsAny {
    actual open val port: MessagePort
    actual override var onerror: ((Event) -> Unit)?
}

/**
 * Exposes the JavaScript [NavigatorConcurrentHardware](https://developer.mozilla.org/en/docs/Web/API/NavigatorConcurrentHardware) to Kotlin
 */
public actual external interface NavigatorConcurrentHardware : JsAny {
    actual val hardwareConcurrency: JsNumber
}

/**
 * Exposes the JavaScript [WorkerNavigator](https://developer.mozilla.org/en/docs/Web/API/WorkerNavigator) to Kotlin
 */
public actual external abstract class WorkerNavigator : NavigatorID, NavigatorLanguage, NavigatorOnLine, NavigatorConcurrentHardware, JsAny {
    actual open val serviceWorker: ServiceWorkerContainer
}

/**
 * Exposes the JavaScript [WorkerLocation](https://developer.mozilla.org/en/docs/Web/API/WorkerLocation) to Kotlin
 */
public actual external abstract class WorkerLocation : JsAny {
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
public actual external abstract class Storage : JsAny {
    actual open val length: Int
    actual fun key(index: Int): String?
    actual fun removeItem(key: String)
    actual fun clear()
    actual fun getItem(key: String): String?
    actual fun setItem(key: String, value: String)
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForStorage(obj: Storage, key: String): String? = js("obj[key]")

public actual operator fun Storage.get(key: String): String? = getMethodImplForStorage(this, key)

@Suppress("UNUSED_PARAMETER")
internal fun setMethodImplForStorage(obj: Storage, key: String, value: String) { js("obj[key] = value;") }

public actual operator fun Storage.set(key: String, value: String) = setMethodImplForStorage(this, key, value)

/**
 * Exposes the JavaScript [WindowSessionStorage](https://developer.mozilla.org/en/docs/Web/API/WindowSessionStorage) to Kotlin
 */
public actual external interface WindowSessionStorage : JsAny {
    actual val sessionStorage: Storage
}

/**
 * Exposes the JavaScript [WindowLocalStorage](https://developer.mozilla.org/en/docs/Web/API/WindowLocalStorage) to Kotlin
 */
public actual external interface WindowLocalStorage : JsAny {
    actual val localStorage: Storage
}

/**
 * Exposes the JavaScript [StorageEvent](https://developer.mozilla.org/en/docs/Web/API/StorageEvent) to Kotlin
 */
public actual external open class StorageEvent actual constructor(type: String, eventInitDict: StorageEventInit) : Event, JsAny {
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

public actual external interface StorageEventInit : EventInit, JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun StorageEventInit(key: String?, oldValue: String?, newValue: String?, url: String?, storageArea: Storage?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): StorageEventInit = js("({ key: key, oldValue: oldValue, newValue: newValue, url: url, storageArea: storageArea, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external abstract class HTMLAppletElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLMarqueeElement : HTMLElement, JsAny {
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
    actual open var onbounce: ((Event) -> Unit)?
    actual open var onfinish: ((Event) -> Unit)?
    actual open var onstart: ((Event) -> Unit)?
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
public actual external abstract class HTMLFrameSetElement : HTMLElement, WindowEventHandlers, JsAny {
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

public actual external abstract class HTMLFrameElement : HTMLElement, JsAny {
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

public actual external abstract class HTMLDirectoryElement : HTMLElement, JsAny {
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
public actual external abstract class HTMLFontElement : HTMLElement, JsAny {
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

public actual external interface External : JsAny {
    actual fun AddSearchProvider()
    actual fun IsSearchProviderInstalled()
}

public actual external interface EventInit : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun EventInit(bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): EventInit = js("({ bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [CustomEvent](https://developer.mozilla.org/en/docs/Web/API/CustomEvent) to Kotlin
 */
public actual external open class CustomEvent actual constructor(type: String, eventInitDict: CustomEventInit) : Event, JsAny {
    actual open val detail: JsAny?
    actual fun initCustomEvent(type: String, bubbles: Boolean, cancelable: Boolean, detail: JsAny?)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface CustomEventInit : EventInit, JsAny {
    actual var detail: JsAny? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun CustomEventInit(detail: JsAny?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): CustomEventInit = js("({ detail: detail, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external interface EventListenerOptions : JsAny {
    actual var capture: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun EventListenerOptions(capture: Boolean?): EventListenerOptions = js("({ capture: capture })")

public actual external interface AddEventListenerOptions : EventListenerOptions, JsAny {
    actual var passive: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var once: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun AddEventListenerOptions(passive: Boolean?, once: Boolean?, capture: Boolean?): AddEventListenerOptions = js("({ passive: passive, once: once, capture: capture })")

public actual external interface NonElementParentNode : JsAny {
    actual fun getElementById(elementId: String): Element?
}

/**
 * Exposes the JavaScript [DocumentOrShadowRoot](https://developer.mozilla.org/en/docs/Web/API/DocumentOrShadowRoot) to Kotlin
 */
public actual external interface DocumentOrShadowRoot : JsAny {
    actual val fullscreenElement: Element?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [ParentNode](https://developer.mozilla.org/en/docs/Web/API/ParentNode) to Kotlin
 */
public actual external interface ParentNode : JsAny {
    actual val children: HTMLCollection
    actual val firstElementChild: Element?
        get() = definedExternally
    actual val lastElementChild: Element?
        get() = definedExternally
    actual val childElementCount: Int
    actual fun prepend(vararg nodes: Node)
    actual fun prepend(vararg nodes: String)
    actual fun append(vararg nodes: Node)
    actual fun append(vararg nodes: String)
    actual fun querySelector(selectors: String): Element?
    actual fun querySelectorAll(selectors: String): NodeList
}

/**
 * Exposes the JavaScript [NonDocumentTypeChildNode](https://developer.mozilla.org/en/docs/Web/API/NonDocumentTypeChildNode) to Kotlin
 */
public actual external interface NonDocumentTypeChildNode : JsAny {
    actual val previousElementSibling: Element?
        get() = definedExternally
    actual val nextElementSibling: Element?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [ChildNode](https://developer.mozilla.org/en/docs/Web/API/ChildNode) to Kotlin
 */
public actual external interface ChildNode : JsAny {
    actual fun before(vararg nodes: Node)
    actual fun before(vararg nodes: String)
    actual fun after(vararg nodes: Node)
    actual fun after(vararg nodes: String)
    actual fun replaceWith(vararg nodes: Node)
    actual fun replaceWith(vararg nodes: String)
    actual fun remove()
}

/**
 * Exposes the JavaScript [Slotable](https://developer.mozilla.org/en/docs/Web/API/Slotable) to Kotlin
 */
public actual external interface Slotable : JsAny {
    actual val assignedSlot: HTMLSlotElement?
        get() = definedExternally
}

/**
 * Exposes the JavaScript [NodeList](https://developer.mozilla.org/en/docs/Web/API/NodeList) to Kotlin
 */
public actual external abstract class NodeList : ItemArrayLike<Node>, JsAny {
    actual override fun item(index: Int): Node?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForNodeList(obj: NodeList, index: Int): Node? = js("obj[index]")

public actual operator fun NodeList.get(index: Int): Node? = getMethodImplForNodeList(this, index)

/**
 * Exposes the JavaScript [HTMLCollection](https://developer.mozilla.org/en/docs/Web/API/HTMLCollection) to Kotlin
 */
public actual external abstract class HTMLCollection : ItemArrayLike<Element>, UnionElementOrHTMLCollection, JsAny {
    actual override fun item(index: Int): Element?
    actual fun namedItem(name: String): Element?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLCollection(obj: HTMLCollection, index: Int): Element? = js("obj[index]")

public actual operator fun HTMLCollection.get(index: Int): Element? = getMethodImplForHTMLCollection(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForHTMLCollection(obj: HTMLCollection, name: String): Element? = js("obj[name]")

public actual operator fun HTMLCollection.get(name: String): Element? = getMethodImplForHTMLCollection(this, name)

/**
 * Exposes the JavaScript [MutationObserver](https://developer.mozilla.org/en/docs/Web/API/MutationObserver) to Kotlin
 */
public actual external open class MutationObserver actual constructor(callback: (JsArray<MutationRecord>, MutationObserver) -> Unit) : JsAny {
    actual fun observe(target: Node, options: MutationObserverInit)
    actual fun disconnect()
    actual fun takeRecords(): JsArray<MutationRecord>
}

/**
 * Exposes the JavaScript [MutationObserverInit](https://developer.mozilla.org/en/docs/Web/API/MutationObserverInit) to Kotlin
 */
public actual external interface MutationObserverInit : JsAny {
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
    actual var attributeFilter: JsArray<JsString>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MutationObserverInit(childList: Boolean?, attributes: Boolean?, characterData: Boolean?, subtree: Boolean?, attributeOldValue: Boolean?, characterDataOldValue: Boolean?, attributeFilter: JsArray<JsString>?): MutationObserverInit = js("({ childList: childList, attributes: attributes, characterData: characterData, subtree: subtree, attributeOldValue: attributeOldValue, characterDataOldValue: characterDataOldValue, attributeFilter: attributeFilter })")

/**
 * Exposes the JavaScript [MutationRecord](https://developer.mozilla.org/en/docs/Web/API/MutationRecord) to Kotlin
 */
public actual external abstract class MutationRecord : JsAny {
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
public actual external abstract class Node : EventTarget, JsAny {
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

public actual external interface GetRootNodeOptions : JsAny {
    actual var composed: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun GetRootNodeOptions(composed: Boolean?): GetRootNodeOptions = js("({ composed: composed })")

/**
 * Exposes the JavaScript [Document](https://developer.mozilla.org/en/docs/Web/API/Document) to Kotlin
 */
public actual external open class Document actual constructor() : Node, GlobalEventHandlers, DocumentAndElementEventHandlers, NonElementParentNode, DocumentOrShadowRoot, ParentNode, GeometryUtils, JsAny {
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
    actual var onreadystatechange: ((Event) -> Unit)?
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
    actual var onfullscreenchange: ((Event) -> Unit)?
    actual var onfullscreenerror: ((Event) -> Unit)?
    actual override var onabort: ((Event) -> Unit)?
    actual override var onblur: ((FocusEvent) -> Unit)?
    actual override var oncancel: ((Event) -> Unit)?
    actual override var oncanplay: ((Event) -> Unit)?
    actual override var oncanplaythrough: ((Event) -> Unit)?
    actual override var onchange: ((Event) -> Unit)?
    actual override var onclick: ((MouseEvent) -> Unit)?
    actual override var onclose: ((Event) -> Unit)?
    actual override var oncontextmenu: ((MouseEvent) -> Unit)?
    actual override var oncuechange: ((Event) -> Unit)?
    actual override var ondblclick: ((MouseEvent) -> Unit)?
    actual override var ondrag: ((DragEvent) -> Unit)?
    actual override var ondragend: ((DragEvent) -> Unit)?
    actual override var ondragenter: ((DragEvent) -> Unit)?
    actual override var ondragexit: ((DragEvent) -> Unit)?
    actual override var ondragleave: ((DragEvent) -> Unit)?
    actual override var ondragover: ((DragEvent) -> Unit)?
    actual override var ondragstart: ((DragEvent) -> Unit)?
    actual override var ondrop: ((DragEvent) -> Unit)?
    actual override var ondurationchange: ((Event) -> Unit)?
    actual override var onemptied: ((Event) -> Unit)?
    actual override var onended: ((Event) -> Unit)?
    actual override var onerror: ((JsAny? /* Event|String */, String, Int, Int, JsAny?) -> JsAny?)?
    actual override var onfocus: ((FocusEvent) -> Unit)?
    actual override var oninput: ((InputEvent) -> Unit)?
    actual override var oninvalid: ((Event) -> Unit)?
    actual override var onkeydown: ((KeyboardEvent) -> Unit)?
    actual override var onkeypress: ((KeyboardEvent) -> Unit)?
    actual override var onkeyup: ((KeyboardEvent) -> Unit)?
    actual override var onload: ((Event) -> Unit)?
    actual override var onloadeddata: ((Event) -> Unit)?
    actual override var onloadedmetadata: ((Event) -> Unit)?
    actual override var onloadend: ((Event) -> Unit)?
    actual override var onloadstart: ((ProgressEvent) -> Unit)?
    actual override var onmousedown: ((MouseEvent) -> Unit)?
    actual override var onmouseenter: ((MouseEvent) -> Unit)?
    actual override var onmouseleave: ((MouseEvent) -> Unit)?
    actual override var onmousemove: ((MouseEvent) -> Unit)?
    actual override var onmouseout: ((MouseEvent) -> Unit)?
    actual override var onmouseover: ((MouseEvent) -> Unit)?
    actual override var onmouseup: ((MouseEvent) -> Unit)?
    actual override var onwheel: ((WheelEvent) -> Unit)?
    actual override var onpause: ((Event) -> Unit)?
    actual override var onplay: ((Event) -> Unit)?
    actual override var onplaying: ((Event) -> Unit)?
    actual override var onprogress: ((ProgressEvent) -> Unit)?
    actual override var onratechange: ((Event) -> Unit)?
    actual override var onreset: ((Event) -> Unit)?
    actual override var onresize: ((Event) -> Unit)?
    actual override var onscroll: ((Event) -> Unit)?
    actual override var onseeked: ((Event) -> Unit)?
    actual override var onseeking: ((Event) -> Unit)?
    actual override var onselect: ((Event) -> Unit)?
    actual override var onshow: ((Event) -> Unit)?
    actual override var onstalled: ((Event) -> Unit)?
    actual override var onsubmit: ((Event) -> Unit)?
    actual override var onsuspend: ((Event) -> Unit)?
    actual override var ontimeupdate: ((Event) -> Unit)?
    actual override var ontoggle: ((Event) -> Unit)?
    actual override var onvolumechange: ((Event) -> Unit)?
    actual override var onwaiting: ((Event) -> Unit)?
    actual override var ongotpointercapture: ((PointerEvent) -> Unit)?
    actual override var onlostpointercapture: ((PointerEvent) -> Unit)?
    actual override var onpointerdown: ((PointerEvent) -> Unit)?
    actual override var onpointermove: ((PointerEvent) -> Unit)?
    actual override var onpointerup: ((PointerEvent) -> Unit)?
    actual override var onpointercancel: ((PointerEvent) -> Unit)?
    actual override var onpointerover: ((PointerEvent) -> Unit)?
    actual override var onpointerout: ((PointerEvent) -> Unit)?
    actual override var onpointerenter: ((PointerEvent) -> Unit)?
    actual override var onpointerleave: ((PointerEvent) -> Unit)?
    actual override var oncopy: ((ClipboardEvent) -> Unit)?
    actual override var oncut: ((ClipboardEvent) -> Unit)?
    actual override var onpaste: ((ClipboardEvent) -> Unit)?
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
    actual fun elementsFromPoint(x: Double, y: Double): JsArray<Element>
    actual fun caretPositionFromPoint(x: Double, y: Double): CaretPosition?
    actual fun createTouch(view: Window, target: EventTarget, identifier: Int, pageX: Int, pageY: Int, screenX: Int, screenY: Int): Touch
    actual fun createTouchList(vararg touches: Touch): TouchList
    actual fun exitFullscreen(): Promise<Nothing?>
    actual override fun getElementById(elementId: String): Element?
    actual override fun prepend(vararg nodes: Node)
    actual override fun prepend(vararg nodes: String)
    actual override fun append(vararg nodes: Node)
    actual override fun append(vararg nodes: String)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): JsArray<DOMQuad>
    actual override fun convertQuadFromNode(quad: JsAny?, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

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

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForDocument(obj: Document, name: String): JsAny? = js("obj[name]")

public actual operator fun Document.get(name: String): JsAny? = getMethodImplForDocument(this, name)

/**
 * Exposes the JavaScript [XMLDocument](https://developer.mozilla.org/en/docs/Web/API/XMLDocument) to Kotlin
 */
public actual external open class XMLDocument : Document, JsAny {
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

public actual external interface ElementCreationOptions : JsAny {
    actual var `is`: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ElementCreationOptions(param_is: String?): ElementCreationOptions = js("({ is: is })")

/**
 * Exposes the JavaScript [DOMImplementation](https://developer.mozilla.org/en/docs/Web/API/DOMImplementation) to Kotlin
 */
public actual external abstract class DOMImplementation : JsAny {
    actual fun createDocumentType(qualifiedName: String, publicId: String, systemId: String): DocumentType
    actual fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType?): XMLDocument
    actual fun createHTMLDocument(title: String): Document
    actual fun hasFeature(): Boolean
}

/**
 * Exposes the JavaScript [DocumentType](https://developer.mozilla.org/en/docs/Web/API/DocumentType) to Kotlin
 */
public actual external abstract class DocumentType : Node, ChildNode, JsAny {
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
public actual external open class DocumentFragment actual constructor() : Node, NonElementParentNode, ParentNode, JsAny {
    actual override val children: HTMLCollection
    actual override val firstElementChild: Element?
    actual override val lastElementChild: Element?
    actual override val childElementCount: Int
    actual override fun getElementById(elementId: String): Element?
    actual override fun prepend(vararg nodes: Node)
    actual override fun prepend(vararg nodes: String)
    actual override fun append(vararg nodes: Node)
    actual override fun append(vararg nodes: String)
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
public actual external open class ShadowRoot : DocumentFragment, DocumentOrShadowRoot, JsAny {
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
public actual external abstract class Element : Node, ParentNode, NonDocumentTypeChildNode, ChildNode, Slotable, GeometryUtils, UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrMouseEvent, UnionElementOrProcessingInstruction, JsAny {
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
    actual fun getAttributeNames(): JsArray<JsString>
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
    actual fun getClientRects(): JsArray<DOMRect>
    actual fun getBoundingClientRect(): DOMRect
    actual fun scrollIntoView()
    actual fun scrollIntoView(arg: Boolean)
    actual fun scrollIntoView(arg: JsAny)
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
    actual fun requestFullscreen(): Promise<Nothing?>

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

public actual external interface ShadowRootInit : JsAny {
    actual var mode: ShadowRootMode?
}

@Suppress("UNUSED_PARAMETER")
public actual fun ShadowRootInit(mode: ShadowRootMode?): ShadowRootInit = js("({ mode: mode })")

/**
 * Exposes the JavaScript [NamedNodeMap](https://developer.mozilla.org/en/docs/Web/API/NamedNodeMap) to Kotlin
 */
public actual external abstract class NamedNodeMap : ItemArrayLike<Attr>, JsAny {
    actual fun getNamedItemNS(namespace: String?, localName: String): Attr?
    actual fun setNamedItem(attr: Attr): Attr?
    actual fun setNamedItemNS(attr: Attr): Attr?
    actual fun removeNamedItem(qualifiedName: String): Attr
    actual fun removeNamedItemNS(namespace: String?, localName: String): Attr
    actual override fun item(index: Int): Attr?
    actual fun getNamedItem(qualifiedName: String): Attr?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForNamedNodeMap(obj: NamedNodeMap, index: Int): Attr? = js("obj[index]")

public actual operator fun NamedNodeMap.get(index: Int): Attr? = getMethodImplForNamedNodeMap(this, index)

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForNamedNodeMap(obj: NamedNodeMap, qualifiedName: String): Attr? = js("obj[qualifiedName]")

public actual operator fun NamedNodeMap.get(qualifiedName: String): Attr? = getMethodImplForNamedNodeMap(this, qualifiedName)

/**
 * Exposes the JavaScript [Attr](https://developer.mozilla.org/en/docs/Web/API/Attr) to Kotlin
 */
public actual external abstract class Attr : Node, JsAny {
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
public actual external abstract class CharacterData : Node, NonDocumentTypeChildNode, ChildNode, JsAny {
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
public actual external open class Text actual constructor(data: String) : CharacterData, Slotable, GeometryUtils, JsAny {
    actual open val wholeText: String
    actual override val assignedSlot: HTMLSlotElement?
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    actual fun splitText(offset: Int): Text
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): JsArray<DOMQuad>
    actual override fun convertQuadFromNode(quad: JsAny?, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun before(vararg nodes: Node)
    actual override fun before(vararg nodes: String)
    actual override fun after(vararg nodes: Node)
    actual override fun after(vararg nodes: String)
    actual override fun replaceWith(vararg nodes: Node)
    actual override fun replaceWith(vararg nodes: String)
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
public actual external open class CDATASection : Text, JsAny {
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
public actual external abstract class ProcessingInstruction : CharacterData, LinkStyle, UnionElementOrProcessingInstruction, JsAny {
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
public actual external open class Comment actual constructor(data: String) : CharacterData, JsAny {
    actual override val previousElementSibling: Element?
    actual override val nextElementSibling: Element?
    actual override fun before(vararg nodes: Node)
    actual override fun before(vararg nodes: String)
    actual override fun after(vararg nodes: Node)
    actual override fun after(vararg nodes: String)
    actual override fun replaceWith(vararg nodes: Node)
    actual override fun replaceWith(vararg nodes: String)
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
public actual external open class Range actual constructor() : JsAny {
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
    actual fun getClientRects(): JsArray<DOMRect>
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
public actual external abstract class NodeIterator : JsAny {
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
public actual external abstract class TreeWalker : JsAny {
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
public actual external interface NodeFilter : JsAny {
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
public actual external abstract class DOMTokenList : ItemArrayLike<JsString>, JsAny {
    actual open var value: String
    actual fun contains(token: String): Boolean
    actual fun add(vararg tokens: String)
    actual fun remove(vararg tokens: String)
    actual fun toggle(token: String, force: Boolean): Boolean
    actual fun replace(token: String, newToken: String)
    actual fun supports(token: String): Boolean
    actual override fun item(index: Int): JsString?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForDOMTokenList(obj: DOMTokenList, index: Int): String? = js("obj[index]")

public actual operator fun DOMTokenList.get(index: Int): String? = getMethodImplForDOMTokenList(this, index)

/**
 * Exposes the JavaScript [DOMPointReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMPointReadOnly) to Kotlin
 */
public actual external open class DOMPointReadOnly actual constructor(x: Double, y: Double, z: Double, w: Double) : JsAny {
    actual open val x: Double
    actual open val y: Double
    actual open val z: Double
    actual open val w: Double
    actual fun matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}

/**
 * Exposes the JavaScript [DOMPoint](https://developer.mozilla.org/en/docs/Web/API/DOMPoint) to Kotlin
 */
public actual external open class DOMPoint : DOMPointReadOnly, JsAny {
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
public actual external interface DOMPointInit : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun DOMPointInit(x: Double?, y: Double?, z: Double?, w: Double?): DOMPointInit = js("({ x: x, y: y, z: z, w: w })")

/**
 * Exposes the JavaScript [DOMRect](https://developer.mozilla.org/en/docs/Web/API/DOMRect) to Kotlin
 */
public actual external open class DOMRect actual constructor(x: Double, y: Double, width: Double, height: Double) : DOMRectReadOnly, JsAny {
    actual override var x: Double
    actual override var y: Double
    actual override var width: Double
    actual override var height: Double
}

/**
 * Exposes the JavaScript [DOMRectReadOnly](https://developer.mozilla.org/en/docs/Web/API/DOMRectReadOnly) to Kotlin
 */
public actual external open class DOMRectReadOnly actual constructor(x: Double, y: Double, width: Double, height: Double) : JsAny {
    actual open val x: Double
    actual open val y: Double
    actual open val width: Double
    actual open val height: Double
    actual open val top: Double
    actual open val right: Double
    actual open val bottom: Double
    actual open val left: Double
}

public actual external interface DOMRectInit : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun DOMRectInit(x: Double?, y: Double?, width: Double?, height: Double?): DOMRectInit = js("({ x: x, y: y, width: width, height: height })")

public actual external interface DOMRectList : ItemArrayLike<DOMRect>, JsAny {
    actual override fun item(index: Int): DOMRect?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForDOMRectList(obj: DOMRectList, index: Int): DOMRect? = js("obj[index]")

public actual operator fun DOMRectList.get(index: Int): DOMRect? = getMethodImplForDOMRectList(this, index)

/**
 * Exposes the JavaScript [DOMQuad](https://developer.mozilla.org/en/docs/Web/API/DOMQuad) to Kotlin
 */
public actual external open class DOMQuad : JsAny {
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
public actual external open class DOMMatrixReadOnly actual constructor(numberSequence: JsArray<JsNumber>) : JsAny {
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
public actual external open class DOMMatrix actual constructor() : DOMMatrixReadOnly, JsAny {
    actual constructor(transformList: String)
    actual constructor(other: DOMMatrixReadOnly)
    actual constructor(array32: Float32Array)
    actual constructor(array64: Float64Array)
    actual constructor(numberSequence: JsArray<JsNumber>)
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

public actual external interface ScrollOptions : JsAny {
    actual var behavior: ScrollBehavior? /* = ScrollBehavior.AUTO */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ScrollOptions(behavior: ScrollBehavior?): ScrollOptions = js("({ behavior: behavior })")

/**
 * Exposes the JavaScript [ScrollToOptions](https://developer.mozilla.org/en/docs/Web/API/ScrollToOptions) to Kotlin
 */
public actual external interface ScrollToOptions : ScrollOptions, JsAny {
    actual var left: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var top: Double?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ScrollToOptions(left: Double?, top: Double?, behavior: ScrollBehavior?): ScrollToOptions = js("({ left: left, top: top, behavior: behavior })")

/**
 * Exposes the JavaScript [MediaQueryList](https://developer.mozilla.org/en/docs/Web/API/MediaQueryList) to Kotlin
 */
public actual external abstract class MediaQueryList : EventTarget, JsAny {
    actual open val media: String
    actual open val matches: Boolean
    actual open var onchange: ((Event) -> Unit)?
    actual fun addListener(listener: EventListener?)
    actual fun addListener(listener: ((Event) -> Unit)?)
    actual fun removeListener(listener: EventListener?)
    actual fun removeListener(listener: ((Event) -> Unit)?)
}

/**
 * Exposes the JavaScript [MediaQueryListEvent](https://developer.mozilla.org/en/docs/Web/API/MediaQueryListEvent) to Kotlin
 */
public actual external open class MediaQueryListEvent actual constructor(type: String, eventInitDict: MediaQueryListEventInit) : Event, JsAny {
    actual open val media: String
    actual open val matches: Boolean

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface MediaQueryListEventInit : EventInit, JsAny {
    actual var media: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var matches: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaQueryListEventInit(media: String?, matches: Boolean?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaQueryListEventInit = js("({ media: media, matches: matches, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [Screen](https://developer.mozilla.org/en/docs/Web/API/Screen) to Kotlin
 */
public actual external abstract class Screen : JsAny {
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
public actual external abstract class CaretPosition : JsAny {
    actual open val offsetNode: Node
    actual open val offset: Int
    actual fun getClientRect(): DOMRect?
}

public actual external interface ScrollIntoViewOptions : ScrollOptions, JsAny {
    actual var block: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
        get() = definedExternally
        set(value) = definedExternally
    actual var inline: ScrollLogicalPosition? /* = ScrollLogicalPosition.CENTER */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ScrollIntoViewOptions(block: ScrollLogicalPosition?, inline: ScrollLogicalPosition?, behavior: ScrollBehavior?): ScrollIntoViewOptions = js("({ block: block, inline: inline, behavior: behavior })")

public actual external interface BoxQuadOptions : JsAny {
    actual var box: CSSBoxType? /* = CSSBoxType.BORDER */
        get() = definedExternally
        set(value) = definedExternally
    actual var relativeTo: JsAny? /* Text|Element|CSSPseudoElement|Document */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun BoxQuadOptions(box: CSSBoxType?, relativeTo: JsAny? /* Text|Element|CSSPseudoElement|Document */): BoxQuadOptions = js("({ box: box, relativeTo: relativeTo })")

public actual external interface ConvertCoordinateOptions : JsAny {
    actual var fromBox: CSSBoxType? /* = CSSBoxType.BORDER */
        get() = definedExternally
        set(value) = definedExternally
    actual var toBox: CSSBoxType? /* = CSSBoxType.BORDER */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ConvertCoordinateOptions(fromBox: CSSBoxType?, toBox: CSSBoxType?): ConvertCoordinateOptions = js("({ fromBox: fromBox, toBox: toBox })")

/**
 * Exposes the JavaScript [GeometryUtils](https://developer.mozilla.org/en/docs/Web/API/GeometryUtils) to Kotlin
 */
public actual external interface GeometryUtils : JsAny {
    actual fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    actual fun convertQuadFromNode(quad: JsAny?, from: Text, options: ConvertCoordinateOptions): DOMQuad
    actual fun convertQuadFromNode(quad: JsAny?, from: Element, options: ConvertCoordinateOptions): DOMQuad
    actual fun convertQuadFromNode(quad: JsAny?, from: Document, options: ConvertCoordinateOptions): DOMQuad
    actual fun convertRectFromNode(rect: DOMRectReadOnly, from: Text, options: ConvertCoordinateOptions): DOMQuad
    actual fun convertRectFromNode(rect: DOMRectReadOnly, from: Element, options: ConvertCoordinateOptions): DOMQuad
    actual fun convertRectFromNode(rect: DOMRectReadOnly, from: Document, options: ConvertCoordinateOptions): DOMQuad
    actual fun convertPointFromNode(point: DOMPointInit, from: Text, options: ConvertCoordinateOptions): DOMPoint
    actual fun convertPointFromNode(point: DOMPointInit, from: Element, options: ConvertCoordinateOptions): DOMPoint
    actual fun convertPointFromNode(point: DOMPointInit, from: Document, options: ConvertCoordinateOptions): DOMPoint
}

/**
 * Exposes the JavaScript [Touch](https://developer.mozilla.org/en/docs/Web/API/Touch) to Kotlin
 */
public actual external abstract class Touch : JsAny {
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

public actual external abstract class TouchList : ItemArrayLike<Touch>, JsAny {
    actual override fun item(index: Int): Touch?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForTouchList(obj: TouchList, index: Int): Touch? = js("obj[index]")

public actual operator fun TouchList.get(index: Int): Touch? = getMethodImplForTouchList(this, index)

public actual external open class TouchEvent : UIEvent, JsAny {
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
public actual external open class Image actual constructor(width: Int, height: Int) : HTMLImageElement, JsAny {
    actual override var onabort: ((Event) -> Unit)?
    actual override var onblur: ((FocusEvent) -> Unit)?
    actual override var oncancel: ((Event) -> Unit)?
    actual override var oncanplay: ((Event) -> Unit)?
    actual override var oncanplaythrough: ((Event) -> Unit)?
    actual override var onchange: ((Event) -> Unit)?
    actual override var onclick: ((MouseEvent) -> Unit)?
    actual override var onclose: ((Event) -> Unit)?
    actual override var oncontextmenu: ((MouseEvent) -> Unit)?
    actual override var oncuechange: ((Event) -> Unit)?
    actual override var ondblclick: ((MouseEvent) -> Unit)?
    actual override var ondrag: ((DragEvent) -> Unit)?
    actual override var ondragend: ((DragEvent) -> Unit)?
    actual override var ondragenter: ((DragEvent) -> Unit)?
    actual override var ondragexit: ((DragEvent) -> Unit)?
    actual override var ondragleave: ((DragEvent) -> Unit)?
    actual override var ondragover: ((DragEvent) -> Unit)?
    actual override var ondragstart: ((DragEvent) -> Unit)?
    actual override var ondrop: ((DragEvent) -> Unit)?
    actual override var ondurationchange: ((Event) -> Unit)?
    actual override var onemptied: ((Event) -> Unit)?
    actual override var onended: ((Event) -> Unit)?
    actual override var onerror: ((JsAny? /* Event|String */, String, Int, Int, JsAny?) -> JsAny?)?
    actual override var onfocus: ((FocusEvent) -> Unit)?
    actual override var oninput: ((InputEvent) -> Unit)?
    actual override var oninvalid: ((Event) -> Unit)?
    actual override var onkeydown: ((KeyboardEvent) -> Unit)?
    actual override var onkeypress: ((KeyboardEvent) -> Unit)?
    actual override var onkeyup: ((KeyboardEvent) -> Unit)?
    actual override var onload: ((Event) -> Unit)?
    actual override var onloadeddata: ((Event) -> Unit)?
    actual override var onloadedmetadata: ((Event) -> Unit)?
    actual override var onloadend: ((Event) -> Unit)?
    actual override var onloadstart: ((ProgressEvent) -> Unit)?
    actual override var onmousedown: ((MouseEvent) -> Unit)?
    actual override var onmouseenter: ((MouseEvent) -> Unit)?
    actual override var onmouseleave: ((MouseEvent) -> Unit)?
    actual override var onmousemove: ((MouseEvent) -> Unit)?
    actual override var onmouseout: ((MouseEvent) -> Unit)?
    actual override var onmouseover: ((MouseEvent) -> Unit)?
    actual override var onmouseup: ((MouseEvent) -> Unit)?
    actual override var onwheel: ((WheelEvent) -> Unit)?
    actual override var onpause: ((Event) -> Unit)?
    actual override var onplay: ((Event) -> Unit)?
    actual override var onplaying: ((Event) -> Unit)?
    actual override var onprogress: ((ProgressEvent) -> Unit)?
    actual override var onratechange: ((Event) -> Unit)?
    actual override var onreset: ((Event) -> Unit)?
    actual override var onresize: ((Event) -> Unit)?
    actual override var onscroll: ((Event) -> Unit)?
    actual override var onseeked: ((Event) -> Unit)?
    actual override var onseeking: ((Event) -> Unit)?
    actual override var onselect: ((Event) -> Unit)?
    actual override var onshow: ((Event) -> Unit)?
    actual override var onstalled: ((Event) -> Unit)?
    actual override var onsubmit: ((Event) -> Unit)?
    actual override var onsuspend: ((Event) -> Unit)?
    actual override var ontimeupdate: ((Event) -> Unit)?
    actual override var ontoggle: ((Event) -> Unit)?
    actual override var onvolumechange: ((Event) -> Unit)?
    actual override var onwaiting: ((Event) -> Unit)?
    actual override var ongotpointercapture: ((PointerEvent) -> Unit)?
    actual override var onlostpointercapture: ((PointerEvent) -> Unit)?
    actual override var onpointerdown: ((PointerEvent) -> Unit)?
    actual override var onpointermove: ((PointerEvent) -> Unit)?
    actual override var onpointerup: ((PointerEvent) -> Unit)?
    actual override var onpointercancel: ((PointerEvent) -> Unit)?
    actual override var onpointerover: ((PointerEvent) -> Unit)?
    actual override var onpointerout: ((PointerEvent) -> Unit)?
    actual override var onpointerenter: ((PointerEvent) -> Unit)?
    actual override var onpointerleave: ((PointerEvent) -> Unit)?
    actual override var oncopy: ((ClipboardEvent) -> Unit)?
    actual override var oncut: ((ClipboardEvent) -> Unit)?
    actual override var onpaste: ((ClipboardEvent) -> Unit)?
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
    actual override fun prepend(vararg nodes: Node)
    actual override fun prepend(vararg nodes: String)
    actual override fun append(vararg nodes: Node)
    actual override fun append(vararg nodes: String)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    actual override fun before(vararg nodes: Node)
    actual override fun before(vararg nodes: String)
    actual override fun after(vararg nodes: Node)
    actual override fun after(vararg nodes: String)
    actual override fun replaceWith(vararg nodes: Node)
    actual override fun replaceWith(vararg nodes: String)
    actual override fun remove()
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): JsArray<DOMQuad>
    actual override fun convertQuadFromNode(quad: JsAny?, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

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

public actual external open class Audio actual constructor(src: String) : HTMLAudioElement, JsAny {
    actual override var onabort: ((Event) -> Unit)?
    actual override var onblur: ((FocusEvent) -> Unit)?
    actual override var oncancel: ((Event) -> Unit)?
    actual override var oncanplay: ((Event) -> Unit)?
    actual override var oncanplaythrough: ((Event) -> Unit)?
    actual override var onchange: ((Event) -> Unit)?
    actual override var onclick: ((MouseEvent) -> Unit)?
    actual override var onclose: ((Event) -> Unit)?
    actual override var oncontextmenu: ((MouseEvent) -> Unit)?
    actual override var oncuechange: ((Event) -> Unit)?
    actual override var ondblclick: ((MouseEvent) -> Unit)?
    actual override var ondrag: ((DragEvent) -> Unit)?
    actual override var ondragend: ((DragEvent) -> Unit)?
    actual override var ondragenter: ((DragEvent) -> Unit)?
    actual override var ondragexit: ((DragEvent) -> Unit)?
    actual override var ondragleave: ((DragEvent) -> Unit)?
    actual override var ondragover: ((DragEvent) -> Unit)?
    actual override var ondragstart: ((DragEvent) -> Unit)?
    actual override var ondrop: ((DragEvent) -> Unit)?
    actual override var ondurationchange: ((Event) -> Unit)?
    actual override var onemptied: ((Event) -> Unit)?
    actual override var onended: ((Event) -> Unit)?
    actual override var onerror: ((JsAny? /* Event|String */, String, Int, Int, JsAny?) -> JsAny?)?
    actual override var onfocus: ((FocusEvent) -> Unit)?
    actual override var oninput: ((InputEvent) -> Unit)?
    actual override var oninvalid: ((Event) -> Unit)?
    actual override var onkeydown: ((KeyboardEvent) -> Unit)?
    actual override var onkeypress: ((KeyboardEvent) -> Unit)?
    actual override var onkeyup: ((KeyboardEvent) -> Unit)?
    actual override var onload: ((Event) -> Unit)?
    actual override var onloadeddata: ((Event) -> Unit)?
    actual override var onloadedmetadata: ((Event) -> Unit)?
    actual override var onloadend: ((Event) -> Unit)?
    actual override var onloadstart: ((ProgressEvent) -> Unit)?
    actual override var onmousedown: ((MouseEvent) -> Unit)?
    actual override var onmouseenter: ((MouseEvent) -> Unit)?
    actual override var onmouseleave: ((MouseEvent) -> Unit)?
    actual override var onmousemove: ((MouseEvent) -> Unit)?
    actual override var onmouseout: ((MouseEvent) -> Unit)?
    actual override var onmouseover: ((MouseEvent) -> Unit)?
    actual override var onmouseup: ((MouseEvent) -> Unit)?
    actual override var onwheel: ((WheelEvent) -> Unit)?
    actual override var onpause: ((Event) -> Unit)?
    actual override var onplay: ((Event) -> Unit)?
    actual override var onplaying: ((Event) -> Unit)?
    actual override var onprogress: ((ProgressEvent) -> Unit)?
    actual override var onratechange: ((Event) -> Unit)?
    actual override var onreset: ((Event) -> Unit)?
    actual override var onresize: ((Event) -> Unit)?
    actual override var onscroll: ((Event) -> Unit)?
    actual override var onseeked: ((Event) -> Unit)?
    actual override var onseeking: ((Event) -> Unit)?
    actual override var onselect: ((Event) -> Unit)?
    actual override var onshow: ((Event) -> Unit)?
    actual override var onstalled: ((Event) -> Unit)?
    actual override var onsubmit: ((Event) -> Unit)?
    actual override var onsuspend: ((Event) -> Unit)?
    actual override var ontimeupdate: ((Event) -> Unit)?
    actual override var ontoggle: ((Event) -> Unit)?
    actual override var onvolumechange: ((Event) -> Unit)?
    actual override var onwaiting: ((Event) -> Unit)?
    actual override var ongotpointercapture: ((PointerEvent) -> Unit)?
    actual override var onlostpointercapture: ((PointerEvent) -> Unit)?
    actual override var onpointerdown: ((PointerEvent) -> Unit)?
    actual override var onpointermove: ((PointerEvent) -> Unit)?
    actual override var onpointerup: ((PointerEvent) -> Unit)?
    actual override var onpointercancel: ((PointerEvent) -> Unit)?
    actual override var onpointerover: ((PointerEvent) -> Unit)?
    actual override var onpointerout: ((PointerEvent) -> Unit)?
    actual override var onpointerenter: ((PointerEvent) -> Unit)?
    actual override var onpointerleave: ((PointerEvent) -> Unit)?
    actual override var oncopy: ((ClipboardEvent) -> Unit)?
    actual override var oncut: ((ClipboardEvent) -> Unit)?
    actual override var onpaste: ((ClipboardEvent) -> Unit)?
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
    actual override fun prepend(vararg nodes: Node)
    actual override fun prepend(vararg nodes: String)
    actual override fun append(vararg nodes: Node)
    actual override fun append(vararg nodes: String)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    actual override fun before(vararg nodes: Node)
    actual override fun before(vararg nodes: String)
    actual override fun after(vararg nodes: Node)
    actual override fun after(vararg nodes: String)
    actual override fun replaceWith(vararg nodes: Node)
    actual override fun replaceWith(vararg nodes: String)
    actual override fun remove()
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): JsArray<DOMQuad>
    actual override fun convertQuadFromNode(quad: JsAny?, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

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
public actual external open class Option actual constructor(text: String, value: String, defaultSelected: Boolean, selected: Boolean) : HTMLOptionElement, JsAny {
    actual override var onabort: ((Event) -> Unit)?
    actual override var onblur: ((FocusEvent) -> Unit)?
    actual override var oncancel: ((Event) -> Unit)?
    actual override var oncanplay: ((Event) -> Unit)?
    actual override var oncanplaythrough: ((Event) -> Unit)?
    actual override var onchange: ((Event) -> Unit)?
    actual override var onclick: ((MouseEvent) -> Unit)?
    actual override var onclose: ((Event) -> Unit)?
    actual override var oncontextmenu: ((MouseEvent) -> Unit)?
    actual override var oncuechange: ((Event) -> Unit)?
    actual override var ondblclick: ((MouseEvent) -> Unit)?
    actual override var ondrag: ((DragEvent) -> Unit)?
    actual override var ondragend: ((DragEvent) -> Unit)?
    actual override var ondragenter: ((DragEvent) -> Unit)?
    actual override var ondragexit: ((DragEvent) -> Unit)?
    actual override var ondragleave: ((DragEvent) -> Unit)?
    actual override var ondragover: ((DragEvent) -> Unit)?
    actual override var ondragstart: ((DragEvent) -> Unit)?
    actual override var ondrop: ((DragEvent) -> Unit)?
    actual override var ondurationchange: ((Event) -> Unit)?
    actual override var onemptied: ((Event) -> Unit)?
    actual override var onended: ((Event) -> Unit)?
    actual override var onerror: ((JsAny? /* Event|String */, String, Int, Int, JsAny?) -> JsAny?)?
    actual override var onfocus: ((FocusEvent) -> Unit)?
    actual override var oninput: ((InputEvent) -> Unit)?
    actual override var oninvalid: ((Event) -> Unit)?
    actual override var onkeydown: ((KeyboardEvent) -> Unit)?
    actual override var onkeypress: ((KeyboardEvent) -> Unit)?
    actual override var onkeyup: ((KeyboardEvent) -> Unit)?
    actual override var onload: ((Event) -> Unit)?
    actual override var onloadeddata: ((Event) -> Unit)?
    actual override var onloadedmetadata: ((Event) -> Unit)?
    actual override var onloadend: ((Event) -> Unit)?
    actual override var onloadstart: ((ProgressEvent) -> Unit)?
    actual override var onmousedown: ((MouseEvent) -> Unit)?
    actual override var onmouseenter: ((MouseEvent) -> Unit)?
    actual override var onmouseleave: ((MouseEvent) -> Unit)?
    actual override var onmousemove: ((MouseEvent) -> Unit)?
    actual override var onmouseout: ((MouseEvent) -> Unit)?
    actual override var onmouseover: ((MouseEvent) -> Unit)?
    actual override var onmouseup: ((MouseEvent) -> Unit)?
    actual override var onwheel: ((WheelEvent) -> Unit)?
    actual override var onpause: ((Event) -> Unit)?
    actual override var onplay: ((Event) -> Unit)?
    actual override var onplaying: ((Event) -> Unit)?
    actual override var onprogress: ((ProgressEvent) -> Unit)?
    actual override var onratechange: ((Event) -> Unit)?
    actual override var onreset: ((Event) -> Unit)?
    actual override var onresize: ((Event) -> Unit)?
    actual override var onscroll: ((Event) -> Unit)?
    actual override var onseeked: ((Event) -> Unit)?
    actual override var onseeking: ((Event) -> Unit)?
    actual override var onselect: ((Event) -> Unit)?
    actual override var onshow: ((Event) -> Unit)?
    actual override var onstalled: ((Event) -> Unit)?
    actual override var onsubmit: ((Event) -> Unit)?
    actual override var onsuspend: ((Event) -> Unit)?
    actual override var ontimeupdate: ((Event) -> Unit)?
    actual override var ontoggle: ((Event) -> Unit)?
    actual override var onvolumechange: ((Event) -> Unit)?
    actual override var onwaiting: ((Event) -> Unit)?
    actual override var ongotpointercapture: ((PointerEvent) -> Unit)?
    actual override var onlostpointercapture: ((PointerEvent) -> Unit)?
    actual override var onpointerdown: ((PointerEvent) -> Unit)?
    actual override var onpointermove: ((PointerEvent) -> Unit)?
    actual override var onpointerup: ((PointerEvent) -> Unit)?
    actual override var onpointercancel: ((PointerEvent) -> Unit)?
    actual override var onpointerover: ((PointerEvent) -> Unit)?
    actual override var onpointerout: ((PointerEvent) -> Unit)?
    actual override var onpointerenter: ((PointerEvent) -> Unit)?
    actual override var onpointerleave: ((PointerEvent) -> Unit)?
    actual override var oncopy: ((ClipboardEvent) -> Unit)?
    actual override var oncut: ((ClipboardEvent) -> Unit)?
    actual override var onpaste: ((ClipboardEvent) -> Unit)?
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
    actual override fun prepend(vararg nodes: Node)
    actual override fun prepend(vararg nodes: String)
    actual override fun append(vararg nodes: Node)
    actual override fun append(vararg nodes: String)
    actual override fun querySelector(selectors: String): Element?
    actual override fun querySelectorAll(selectors: String): NodeList
    actual override fun before(vararg nodes: Node)
    actual override fun before(vararg nodes: String)
    actual override fun after(vararg nodes: Node)
    actual override fun after(vararg nodes: String)
    actual override fun replaceWith(vararg nodes: Node)
    actual override fun replaceWith(vararg nodes: String)
    actual override fun remove()
    actual override fun getBoxQuads(options: BoxQuadOptions /* = definedExternally */): JsArray<DOMQuad>
    actual override fun convertQuadFromNode(quad: JsAny?, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertQuadFromNode(quad: JsAny?, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertRectFromNode(rect: DOMRectReadOnly, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMQuad
    actual override fun convertPointFromNode(point: DOMPointInit, from: Text, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Element, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint
    actual override fun convertPointFromNode(point: DOMPointInit, from: Document, options: ConvertCoordinateOptions /* = definedExternally */): DOMPoint

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

public actual external interface UnionElementOrHTMLCollection

public actual external interface UnionElementOrRadioNodeList

public actual external interface UnionHTMLOptGroupElementOrHTMLOptionElement

public actual external interface UnionAudioTrackOrTextTrackOrVideoTrack

public actual external interface UnionElementOrMouseEvent

public actual external interface UnionMessagePortOrWindowProxy

public actual external interface MediaProvider

public actual external interface RenderingContext

public actual external interface HTMLOrSVGImageElement : CanvasImageSource

public actual external interface CanvasImageSource : ImageBitmapSource

public actual external interface ImageBitmapSource

public actual external interface HTMLOrSVGScriptElement

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface DocumentReadyState : JsAny {
    actual companion object
}

public actual inline val DocumentReadyState.Companion.LOADING: DocumentReadyState get() = "loading".toJsString().unsafeCast<DocumentReadyState>()

public actual inline val DocumentReadyState.Companion.INTERACTIVE: DocumentReadyState get() = "interactive".toJsString().unsafeCast<DocumentReadyState>()

public actual inline val DocumentReadyState.Companion.COMPLETE: DocumentReadyState get() = "complete".toJsString().unsafeCast<DocumentReadyState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanPlayTypeResult : JsAny {
    actual companion object
}

public actual inline val CanPlayTypeResult.Companion.EMPTY: CanPlayTypeResult get() = "".toJsString().unsafeCast<CanPlayTypeResult>()

public actual inline val CanPlayTypeResult.Companion.MAYBE: CanPlayTypeResult get() = "maybe".toJsString().unsafeCast<CanPlayTypeResult>()

public actual inline val CanPlayTypeResult.Companion.PROBABLY: CanPlayTypeResult get() = "probably".toJsString().unsafeCast<CanPlayTypeResult>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface TextTrackMode : JsAny {
    actual companion object
}

public actual inline val TextTrackMode.Companion.DISABLED: TextTrackMode get() = "disabled".toJsString().unsafeCast<TextTrackMode>()

public actual inline val TextTrackMode.Companion.HIDDEN: TextTrackMode get() = "hidden".toJsString().unsafeCast<TextTrackMode>()

public actual inline val TextTrackMode.Companion.SHOWING: TextTrackMode get() = "showing".toJsString().unsafeCast<TextTrackMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface TextTrackKind : JsAny {
    actual companion object
}

public actual inline val TextTrackKind.Companion.SUBTITLES: TextTrackKind get() = "subtitles".toJsString().unsafeCast<TextTrackKind>()

public actual inline val TextTrackKind.Companion.CAPTIONS: TextTrackKind get() = "captions".toJsString().unsafeCast<TextTrackKind>()

public actual inline val TextTrackKind.Companion.DESCRIPTIONS: TextTrackKind get() = "descriptions".toJsString().unsafeCast<TextTrackKind>()

public actual inline val TextTrackKind.Companion.CHAPTERS: TextTrackKind get() = "chapters".toJsString().unsafeCast<TextTrackKind>()

public actual inline val TextTrackKind.Companion.METADATA: TextTrackKind get() = "metadata".toJsString().unsafeCast<TextTrackKind>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface SelectionMode : JsAny {
    actual companion object
}

public actual inline val SelectionMode.Companion.SELECT: SelectionMode get() = "select".toJsString().unsafeCast<SelectionMode>()

public actual inline val SelectionMode.Companion.START: SelectionMode get() = "start".toJsString().unsafeCast<SelectionMode>()

public actual inline val SelectionMode.Companion.END: SelectionMode get() = "end".toJsString().unsafeCast<SelectionMode>()

public actual inline val SelectionMode.Companion.PRESERVE: SelectionMode get() = "preserve".toJsString().unsafeCast<SelectionMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanvasFillRule : JsAny {
    actual companion object
}

public actual inline val CanvasFillRule.Companion.NONZERO: CanvasFillRule get() = "nonzero".toJsString().unsafeCast<CanvasFillRule>()

public actual inline val CanvasFillRule.Companion.EVENODD: CanvasFillRule get() = "evenodd".toJsString().unsafeCast<CanvasFillRule>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ImageSmoothingQuality : JsAny {
    actual companion object
}

public actual inline val ImageSmoothingQuality.Companion.LOW: ImageSmoothingQuality get() = "low".toJsString().unsafeCast<ImageSmoothingQuality>()

public actual inline val ImageSmoothingQuality.Companion.MEDIUM: ImageSmoothingQuality get() = "medium".toJsString().unsafeCast<ImageSmoothingQuality>()

public actual inline val ImageSmoothingQuality.Companion.HIGH: ImageSmoothingQuality get() = "high".toJsString().unsafeCast<ImageSmoothingQuality>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanvasLineCap : JsAny {
    actual companion object
}

public actual inline val CanvasLineCap.Companion.BUTT: CanvasLineCap get() = "butt".toJsString().unsafeCast<CanvasLineCap>()

public actual inline val CanvasLineCap.Companion.ROUND: CanvasLineCap get() = "round".toJsString().unsafeCast<CanvasLineCap>()

public actual inline val CanvasLineCap.Companion.SQUARE: CanvasLineCap get() = "square".toJsString().unsafeCast<CanvasLineCap>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanvasLineJoin : JsAny {
    actual companion object
}

public actual inline val CanvasLineJoin.Companion.ROUND: CanvasLineJoin get() = "round".toJsString().unsafeCast<CanvasLineJoin>()

public actual inline val CanvasLineJoin.Companion.BEVEL: CanvasLineJoin get() = "bevel".toJsString().unsafeCast<CanvasLineJoin>()

public actual inline val CanvasLineJoin.Companion.MITER: CanvasLineJoin get() = "miter".toJsString().unsafeCast<CanvasLineJoin>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanvasTextAlign : JsAny {
    actual companion object
}

public actual inline val CanvasTextAlign.Companion.START: CanvasTextAlign get() = "start".toJsString().unsafeCast<CanvasTextAlign>()

public actual inline val CanvasTextAlign.Companion.END: CanvasTextAlign get() = "end".toJsString().unsafeCast<CanvasTextAlign>()

public actual inline val CanvasTextAlign.Companion.LEFT: CanvasTextAlign get() = "left".toJsString().unsafeCast<CanvasTextAlign>()

public actual inline val CanvasTextAlign.Companion.RIGHT: CanvasTextAlign get() = "right".toJsString().unsafeCast<CanvasTextAlign>()

public actual inline val CanvasTextAlign.Companion.CENTER: CanvasTextAlign get() = "center".toJsString().unsafeCast<CanvasTextAlign>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanvasTextBaseline : JsAny {
    actual companion object
}

public actual inline val CanvasTextBaseline.Companion.TOP: CanvasTextBaseline get() = "top".toJsString().unsafeCast<CanvasTextBaseline>()

public actual inline val CanvasTextBaseline.Companion.HANGING: CanvasTextBaseline get() = "hanging".toJsString().unsafeCast<CanvasTextBaseline>()

public actual inline val CanvasTextBaseline.Companion.MIDDLE: CanvasTextBaseline get() = "middle".toJsString().unsafeCast<CanvasTextBaseline>()

public actual inline val CanvasTextBaseline.Companion.ALPHABETIC: CanvasTextBaseline get() = "alphabetic".toJsString().unsafeCast<CanvasTextBaseline>()

public actual inline val CanvasTextBaseline.Companion.IDEOGRAPHIC: CanvasTextBaseline get() = "ideographic".toJsString().unsafeCast<CanvasTextBaseline>()

public actual inline val CanvasTextBaseline.Companion.BOTTOM: CanvasTextBaseline get() = "bottom".toJsString().unsafeCast<CanvasTextBaseline>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CanvasDirection : JsAny {
    actual companion object
}

public actual inline val CanvasDirection.Companion.LTR: CanvasDirection get() = "ltr".toJsString().unsafeCast<CanvasDirection>()

public actual inline val CanvasDirection.Companion.RTL: CanvasDirection get() = "rtl".toJsString().unsafeCast<CanvasDirection>()

public actual inline val CanvasDirection.Companion.INHERIT: CanvasDirection get() = "inherit".toJsString().unsafeCast<CanvasDirection>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ScrollRestoration : JsAny {
    actual companion object
}

public actual inline val ScrollRestoration.Companion.AUTO: ScrollRestoration get() = "auto".toJsString().unsafeCast<ScrollRestoration>()

public actual inline val ScrollRestoration.Companion.MANUAL: ScrollRestoration get() = "manual".toJsString().unsafeCast<ScrollRestoration>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ImageOrientation : JsAny {
    actual companion object
}

public actual inline val ImageOrientation.Companion.NONE: ImageOrientation get() = "none".toJsString().unsafeCast<ImageOrientation>()

public actual inline val ImageOrientation.Companion.FLIPY: ImageOrientation get() = "flipY".toJsString().unsafeCast<ImageOrientation>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface PremultiplyAlpha : JsAny {
    actual companion object
}

public actual inline val PremultiplyAlpha.Companion.NONE: PremultiplyAlpha get() = "none".toJsString().unsafeCast<PremultiplyAlpha>()

public actual inline val PremultiplyAlpha.Companion.PREMULTIPLY: PremultiplyAlpha get() = "premultiply".toJsString().unsafeCast<PremultiplyAlpha>()

public actual inline val PremultiplyAlpha.Companion.DEFAULT: PremultiplyAlpha get() = "default".toJsString().unsafeCast<PremultiplyAlpha>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ColorSpaceConversion : JsAny {
    actual companion object
}

public actual inline val ColorSpaceConversion.Companion.NONE: ColorSpaceConversion get() = "none".toJsString().unsafeCast<ColorSpaceConversion>()

public actual inline val ColorSpaceConversion.Companion.DEFAULT: ColorSpaceConversion get() = "default".toJsString().unsafeCast<ColorSpaceConversion>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ResizeQuality : JsAny {
    actual companion object
}

public actual inline val ResizeQuality.Companion.PIXELATED: ResizeQuality get() = "pixelated".toJsString().unsafeCast<ResizeQuality>()

public actual inline val ResizeQuality.Companion.LOW: ResizeQuality get() = "low".toJsString().unsafeCast<ResizeQuality>()

public actual inline val ResizeQuality.Companion.MEDIUM: ResizeQuality get() = "medium".toJsString().unsafeCast<ResizeQuality>()

public actual inline val ResizeQuality.Companion.HIGH: ResizeQuality get() = "high".toJsString().unsafeCast<ResizeQuality>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface BinaryType : JsAny {
    actual companion object
}

public actual inline val BinaryType.Companion.BLOB: BinaryType get() = "blob".toJsString().unsafeCast<BinaryType>()

public actual inline val BinaryType.Companion.ARRAYBUFFER: BinaryType get() = "arraybuffer".toJsString().unsafeCast<BinaryType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface WorkerType : JsAny {
    actual companion object
}

public actual inline val WorkerType.Companion.CLASSIC: WorkerType get() = "classic".toJsString().unsafeCast<WorkerType>()

public actual inline val WorkerType.Companion.MODULE: WorkerType get() = "module".toJsString().unsafeCast<WorkerType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ShadowRootMode : JsAny {
    actual companion object
}

public actual inline val ShadowRootMode.Companion.OPEN: ShadowRootMode get() = "open".toJsString().unsafeCast<ShadowRootMode>()

public actual inline val ShadowRootMode.Companion.CLOSED: ShadowRootMode get() = "closed".toJsString().unsafeCast<ShadowRootMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ScrollBehavior : JsAny {
    actual companion object
}

public actual inline val ScrollBehavior.Companion.AUTO: ScrollBehavior get() = "auto".toJsString().unsafeCast<ScrollBehavior>()

public actual inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior get() = "instant".toJsString().unsafeCast<ScrollBehavior>()

public actual inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior get() = "smooth".toJsString().unsafeCast<ScrollBehavior>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ScrollLogicalPosition : JsAny {
    actual companion object
}

public actual inline val ScrollLogicalPosition.Companion.START: ScrollLogicalPosition get() = "start".toJsString().unsafeCast<ScrollLogicalPosition>()

public actual inline val ScrollLogicalPosition.Companion.CENTER: ScrollLogicalPosition get() = "center".toJsString().unsafeCast<ScrollLogicalPosition>()

public actual inline val ScrollLogicalPosition.Companion.END: ScrollLogicalPosition get() = "end".toJsString().unsafeCast<ScrollLogicalPosition>()

public actual inline val ScrollLogicalPosition.Companion.NEAREST: ScrollLogicalPosition get() = "nearest".toJsString().unsafeCast<ScrollLogicalPosition>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface CSSBoxType : JsAny {
    actual companion object
}

public actual inline val CSSBoxType.Companion.MARGIN: CSSBoxType get() = "margin".toJsString().unsafeCast<CSSBoxType>()

public actual inline val CSSBoxType.Companion.BORDER: CSSBoxType get() = "border".toJsString().unsafeCast<CSSBoxType>()

public actual inline val CSSBoxType.Companion.PADDING: CSSBoxType get() = "padding".toJsString().unsafeCast<CSSBoxType>()

public actual inline val CSSBoxType.Companion.CONTENT: CSSBoxType get() = "content".toJsString().unsafeCast<CSSBoxType>()