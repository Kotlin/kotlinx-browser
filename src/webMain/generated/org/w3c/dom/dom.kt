/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'dom', DO NOT EDIT!

package org.w3c.dom

import kotlin.js.*
import org.w3c.dom.clipboard.*
import org.w3c.dom.css.*
import org.w3c.dom.events.*
import org.w3c.dom.pointerevents.*
import org.w3c.dom.svg.*
import org.w3c.fullscreen.*

public external interface HTMLOrSVGScriptElement : JsAny

public external open class Event : JsAny {
    constructor(type: String, eventInitDict: EventInit = definedExternally)
    open val type: String
    open val target: EventTarget?
    open val srcElement: EventTarget?
    open val currentTarget: EventTarget?
    open fun composedPath(): JsArray<EventTarget>
    open val eventPhase: Short
    open fun stopPropagation()
    open var cancelBubble: Boolean
    open fun stopImmediatePropagation()
    open val bubbles: Boolean
    open val cancelable: Boolean
    open var returnValue: Boolean
    open fun preventDefault()
    open val defaultPrevented: Boolean
    open val composed: Boolean
    open val isTrusted: Boolean
    open val timeStamp: Double
    open fun initEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface EventInit : JsAny {
    var bubbles: Boolean?
    var cancelable: Boolean?
    var composed: Boolean?
}

public fun EventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): EventInit = newJsObject<EventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

public external open class CustomEvent : Event {
    constructor(type: String, eventInitDict: CustomEventInit = definedExternally)
    open val detail: JsAny?
    open fun initCustomEvent(type: String, bubbles: Boolean = definedExternally, cancelable: Boolean = definedExternally, detail: JsAny? = definedExternally)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface CustomEventInit : EventInit {
    var detail: JsAny?
}

public fun CustomEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, detail: JsAny? = null): CustomEventInit = newJsObject<CustomEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (detail != null) this.detail = detail
}

public external open class EventTarget : JsAny {
    constructor()
    open fun addEventListener(type: String, callback: EventListener?, options: AddEventListenerOptions)
    open fun addEventListener(type: String, callback: EventListener?, options: Boolean)
    open fun addEventListener(type: String, callback: EventListener?)
    open fun removeEventListener(type: String, callback: EventListener?, options: EventListenerOptions)
    open fun removeEventListener(type: String, callback: (Event) -> Unit, options: EventListenerOptions)
    open fun removeEventListener(type: String, callback: EventListener?, options: Boolean)
    open fun removeEventListener(type: String, callback: (Event) -> Unit, options: Boolean)
    open fun removeEventListener(type: String, callback: EventListener?)
    open fun removeEventListener(type: String, callback: (Event) -> Unit)
    open fun dispatchEvent(event: Event): Boolean
}

private fun toEventListener(callback: (Event) -> Unit): EventListener = js("callback")

public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit, options: AddEventListenerOptions): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener, options)
    return { removeEventListener(type, listener, options) }
}

public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit, options: Boolean): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener, options)
    return { removeEventListener(type, listener, options) }
}

public fun EventTarget.addEventListener(type: String, callback: (Event) -> Unit): () -> Unit {
    val listener = toEventListener(callback)
    addEventListener(type, listener)
    return { removeEventListener(type, listener) }
}

public external interface EventListener : JsAny {
    fun handleEvent(event: Event)
}

public external interface EventListenerOptions : JsAny {
    var capture: Boolean?
}

public fun EventListenerOptions(capture: Boolean? = null): EventListenerOptions = newJsObject<EventListenerOptions>().apply {
    if (capture != null) this.capture = capture
}

public external interface AddEventListenerOptions : EventListenerOptions {
    var passive: Boolean?
    var once: Boolean?
    var signal: AbortSignal?
}

public fun AddEventListenerOptions(capture: Boolean? = null, passive: Boolean? = null, once: Boolean? = null, signal: AbortSignal? = null): AddEventListenerOptions = newJsObject<AddEventListenerOptions>().apply {
    if (capture != null) this.capture = capture
    if (passive != null) this.passive = passive
    if (once != null) this.once = once
    if (signal != null) this.signal = signal
}

public external open class AbortController : JsAny {
    constructor()
    open val signal: AbortSignal
    open fun abort(reason: JsAny? = definedExternally)
}

public external abstract class AbortSignal : EventTarget {
    open val aborted: Boolean
    open val reason: JsAny?
    open fun throwIfAborted()
    open var onabort: ((Event) -> Unit)?

    companion object {
        fun abort(reason: JsAny? = definedExternally): AbortSignal
        fun timeout(milliseconds: Double): AbortSignal
        fun any(signals: JsArray<AbortSignal>): AbortSignal
    }
}

public external interface NonElementParentNode : JsAny {
    fun getElementById(elementId: String): Element?
}

public external interface DocumentOrShadowRoot : JsAny {
    val customElementRegistry: CustomElementRegistry?
    val activeElement: Element?
    val styleSheets: StyleSheetList
    var adoptedStyleSheets: JsArray<CSSStyleSheet>
    val fullscreenElement: Element?
}

public external interface ParentNode : JsAny {
    val children: HTMLCollection
    val firstElementChild: Element?
    val lastElementChild: Element?
    val childElementCount: Int
    fun prepend(vararg nodes: Node)
    fun prepend(vararg nodes: String)
    fun prepend()
    fun append(vararg nodes: Node)
    fun append(vararg nodes: String)
    fun append()
    fun replaceChildren(vararg nodes: Node)
    fun replaceChildren(vararg nodes: String)
    fun replaceChildren()
    fun moveBefore(node: Node, child: Node?)
    fun querySelector(selectors: String): Element?
    fun querySelectorAll(selectors: String): NodeList
}

public external interface NonDocumentTypeChildNode : JsAny {
    val previousElementSibling: Element?
    val nextElementSibling: Element?
    fun beforeHTML(html: String, options: SetHTMLOptions = definedExternally)
    fun afterHTML(html: String, options: SetHTMLOptions = definedExternally)
    fun replaceWithHTML(html: String, options: SetHTMLOptions = definedExternally)
    fun beforeHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    fun afterHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    fun replaceWithHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
}

public external interface ChildNode : JsAny {
    fun before(vararg nodes: Node)
    fun before(vararg nodes: String)
    fun before()
    fun after(vararg nodes: Node)
    fun after(vararg nodes: String)
    fun after()
    fun replaceWith(vararg nodes: Node)
    fun replaceWith(vararg nodes: String)
    fun replaceWith()
    fun remove()
}

public external interface Slottable : JsAny {
    val assignedSlot: HTMLSlotElement?
}

public external abstract class NodeList : ItemArrayLike<Node> {
    override fun item(index: Int): Node?
    override val length: Int
    // not printed yet: iterable
}

public operator fun NodeList.get(index: Int): Node? = getProperty(this, index)

public external abstract class HTMLCollection : UnionElementOrHTMLCollection, ItemArrayLike<Element> {
    override val length: Int
    override fun item(index: Int): Element?
    open fun namedItem(name: String): Element?
}

public operator fun HTMLCollection.get(index: Int): Element? = getProperty(this, index)

public operator fun HTMLCollection.get(name: String): Element? = getProperty(this, name)

public external open class MutationObserver : JsAny {
    constructor(callback: (JsArray<MutationRecord>, MutationObserver) -> Unit)
    open fun observe(target: Node, options: MutationObserverInit = definedExternally)
    open fun disconnect()
    open fun takeRecords(): JsArray<MutationRecord>
}

public external interface MutationObserverInit : JsAny {
    var childList: Boolean?
    var attributes: Boolean?
    var characterData: Boolean?
    var subtree: Boolean?
    var attributeOldValue: Boolean?
    var characterDataOldValue: Boolean?
    var attributeFilter: JsArray<JsString>?
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

public external abstract class MutationRecord : JsAny {
    open val type: String
    open val target: Node
    open val addedNodes: NodeList
    open val removedNodes: NodeList
    open val previousSibling: Node?
    open val nextSibling: Node?
    open val attributeName: String?
    open val attributeNamespace: String?
    open val oldValue: String?
}

public external abstract class Node : EventTarget {
    open val nodeType: Short
    open val nodeName: String
    open val baseURI: String
    open val isConnected: Boolean
    open val ownerDocument: Document?
    open fun getRootNode(options: GetRootNodeOptions = definedExternally): Node
    open val parentNode: Node?
    open val parentElement: Element?
    open fun hasChildNodes(): Boolean
    open val childNodes: NodeList
    open val firstChild: Node?
    open val lastChild: Node?
    open val previousSibling: Node?
    open val nextSibling: Node?
    open var nodeValue: String?
    open var textContent: String?
    open fun normalize()
    open fun cloneNode(subtree: Boolean = definedExternally): Node
    open fun isEqualNode(otherNode: Node?): Boolean
    open fun isSameNode(otherNode: Node?): Boolean
    open fun compareDocumentPosition(other: Node): Short
    open fun contains(other: Node?): Boolean
    open fun lookupPrefix(namespace: String?): String?
    open fun lookupNamespaceURI(prefix: String?): String?
    open fun isDefaultNamespace(namespace: String?): Boolean
    open fun insertBefore(node: Node, child: Node?): Node
    open fun appendChild(node: Node): Node
    open fun replaceChild(node: Node, child: Node): Node
    open fun removeChild(child: Node): Node

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

public external interface GetRootNodeOptions : JsAny {
    var composed: Boolean?
}

public fun GetRootNodeOptions(composed: Boolean? = null): GetRootNodeOptions = newJsObject<GetRootNodeOptions>().apply {
    if (composed != null) this.composed = composed
}

public external open class Document : Node, GlobalEventHandlers, NonElementParentNode, DocumentOrShadowRoot, ParentNode, XPathEvaluatorBase, GeometryUtils, ARIANotifyMixin, GeometryNode {
    constructor()
    open val implementation: DOMImplementation
    open val URL: String
    open val documentURI: String
    open val compatMode: String
    open val characterSet: String
    open val charset: String
    open val inputEncoding: String
    open val contentType: String
    open val doctype: DocumentType?
    open val documentElement: Element?
    open fun getElementsByTagName(qualifiedName: String): HTMLCollection
    open fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
    open fun getElementsByClassName(classNames: String): HTMLCollection
    open fun createElement(localName: String, options: String): Element
    open fun createElement(localName: String, options: ElementCreationOptions): Element
    open fun createElement(localName: String): Element
    open fun createElementNS(namespace: String?, qualifiedName: String, options: String): Element
    open fun createElementNS(namespace: String?, qualifiedName: String, options: ElementCreationOptions): Element
    open fun createElementNS(namespace: String?, qualifiedName: String): Element
    open fun createDocumentFragment(): DocumentFragment
    open fun createTextNode(data: String): Text
    open fun createCDATASection(data: String): CDATASection
    open fun createComment(data: String): Comment
    open fun createProcessingInstruction(target: String, data: String): ProcessingInstruction
    open fun importNode(node: Node, options: Boolean): Node
    open fun importNode(node: Node, options: ImportNodeOptions): Node
    open fun importNode(node: Node): Node
    open fun adoptNode(node: Node): Node
    open fun createAttribute(localName: String): Attr
    open fun createAttributeNS(namespace: String?, qualifiedName: String): Attr
    open fun createEvent(`interface`: String): Event
    open fun createRange(): Range
    open fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): NodeIterator
    open fun createNodeIterator(root: Node, whatToShow: Int = definedExternally, filter: (Node) -> Short): NodeIterator
    open fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: NodeFilter? = definedExternally): TreeWalker
    open fun createTreeWalker(root: Node, whatToShow: Int = definedExternally, filter: (Node) -> Short): TreeWalker
    open val location: Location?
    open var domain: String
    open val referrer: String
    open var cookie: String
    open val lastModified: String
    open val readyState: DocumentReadyState
    open var title: String
    open var dir: String
    open var body: HTMLElement?
    open val head: HTMLHeadElement?
    open val images: HTMLCollection
    open val embeds: HTMLCollection
    open val plugins: HTMLCollection
    open val links: HTMLCollection
    open val forms: HTMLCollection
    open val scripts: HTMLCollection
    open fun getElementsByName(elementName: String): NodeList
    open val currentScript: HTMLOrSVGScriptElement?
    open fun open(unused1: String = definedExternally, unused2: String = definedExternally): Document
    open fun open(url: String, name: String, features: String): Window?
    open fun close()
    open fun write(vararg text: String)
    open fun writeln(vararg text: String)
    open val defaultView: Window?
    open fun hasFocus(): Boolean
    open var designMode: String
    open fun execCommand(commandId: String, showUI: Boolean = definedExternally, value: String = definedExternally): Boolean
    open fun queryCommandEnabled(commandId: String): Boolean
    open fun queryCommandIndeterm(commandId: String): Boolean
    open fun queryCommandState(commandId: String): Boolean
    open fun queryCommandSupported(commandId: String): Boolean
    open fun queryCommandValue(commandId: String): String
    open val hidden: Boolean
    open val visibilityState: DocumentVisibilityState
    open var onreadystatechange: ((Event) -> Unit)?
    open var onvisibilitychange: ((Event) -> Unit)?
    open var fgColor: String
    open var linkColor: String
    open var vlinkColor: String
    open var alinkColor: String
    open var bgColor: String
    open val anchors: HTMLCollection
    open val applets: HTMLCollection
    open fun clear()
    open fun captureEvents()
    open fun releaseEvents()
    open val all: HTMLAllCollection
    open fun elementFromPoint(x: Double, y: Double): Element?
    open fun elementsFromPoint(x: Double, y: Double): JsArray<Element>
    open fun caretPositionFromPoint(x: Double, y: Double, options: CaretPositionFromPointOptions = definedExternally): CaretPosition?
    open val scrollingElement: Element?
    open val rootElement: SVGSVGElement?
    open val fullscreenEnabled: Boolean
    open val fullscreen: Boolean
    open fun exitFullscreen(): Promise<JsAny?>
    open var onfullscreenchange: ((Event) -> Unit)?
    open var onfullscreenerror: ((Event) -> Unit)?
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
    override fun getElementById(elementId: String): Element?
    override val customElementRegistry: CustomElementRegistry?
    override val activeElement: Element?
    override val styleSheets: StyleSheetList
    override var adoptedStyleSheets: JsArray<CSSStyleSheet>
    override val fullscreenElement: Element?
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
    override fun createExpression(expression: String, resolver: XPathNSResolver?): XPathExpression
    override fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression
    override fun createNSResolver(nodeResolver: Node): Node
    override fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver?, type: Short, result: XPathResult?): XPathResult
    override fun evaluate(expression: String, contextNode: Node, resolver: (String?) -> String?, type: Short, result: XPathResult?): XPathResult
    override fun getBoxQuads(options: BoxQuadOptions): JsArray<DOMQuad>
    override fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions): DOMQuad
    override fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions): DOMPoint
    override fun ariaNotify(announcement: String, options: AriaNotificationOptions)

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
        fun parseHTMLUnsafe(html: String, options: ParseHTMLUnsafeOptions = definedExternally): Document
        fun parseHTML(html: String, options: SetHTMLOptions = definedExternally): Document
    }
}

public operator fun Document.get(name: String): JsAny? = getProperty(this, name)

public external abstract class XMLDocument : Document {

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
        fun parseHTMLUnsafe(html: String, options: ParseHTMLUnsafeOptions = definedExternally): Document
        fun parseHTML(html: String, options: SetHTMLOptions = definedExternally): Document
    }
}

public external interface ElementCreationOptions : JsAny {
    var customElementRegistry: CustomElementRegistry?
    var `is`: String?
}

public fun ElementCreationOptions(customElementRegistry: CustomElementRegistry? = null, `is`: String? = null): ElementCreationOptions = newJsObject<ElementCreationOptions>().apply {
    if (customElementRegistry != null) this.customElementRegistry = customElementRegistry
    if (`is` != null) this.`is` = `is`
}

public external interface ImportNodeOptions : JsAny {
    var customElementRegistry: CustomElementRegistry?
    var selfOnly: Boolean?
}

public fun ImportNodeOptions(customElementRegistry: CustomElementRegistry? = null, selfOnly: Boolean? = null): ImportNodeOptions = newJsObject<ImportNodeOptions>().apply {
    if (customElementRegistry != null) this.customElementRegistry = customElementRegistry
    if (selfOnly != null) this.selfOnly = selfOnly
}

public external abstract class DOMImplementation : JsAny {
    open fun createDocumentType(name: String, publicId: String, systemId: String): DocumentType
    open fun createDocument(namespace: String?, qualifiedName: String, doctype: DocumentType? = definedExternally): XMLDocument
    open fun createHTMLDocument(title: String = definedExternally): Document
    open fun hasFeature(): Boolean
}

public external abstract class DocumentType : Node, ChildNode {
    open val name: String
    open val publicId: String
    open val systemId: String

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

public external open class DocumentFragment : Node, NonElementParentNode, ParentNode {
    constructor()
    override fun getElementById(elementId: String): Element?
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

public external abstract class ShadowRoot : DocumentFragment, DocumentOrShadowRoot {
    open val mode: ShadowRootMode
    open val delegatesFocus: Boolean
    open val serializable: Boolean
    open val slotAssignment: SlotAssignmentMode
    open val clonable: Boolean
    open val host: Element
    open var onslotchange: ((Event) -> Unit)?
    open fun setHTML(html: String, options: SetHTMLOptions = definedExternally)
    open fun appendHTML(html: String, options: SetHTMLOptions = definedExternally)
    open fun prependHTML(html: String, options: SetHTMLOptions = definedExternally)
    open fun setHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    open fun appendHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    open fun prependHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    open fun getHTML(options: GetHTMLOptions = definedExternally): String
    open var innerHTML: String

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

public external interface ShadowRootMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ShadowRootMode.Companion.OPEN: ShadowRootMode get() = "open".toJsString().unsafeCast<ShadowRootMode>()
public inline val ShadowRootMode.Companion.CLOSED: ShadowRootMode get() = "closed".toJsString().unsafeCast<ShadowRootMode>()

public external interface SlotAssignmentMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val SlotAssignmentMode.Companion.MANUAL: SlotAssignmentMode get() = "manual".toJsString().unsafeCast<SlotAssignmentMode>()
public inline val SlotAssignmentMode.Companion.NAMED: SlotAssignmentMode get() = "named".toJsString().unsafeCast<SlotAssignmentMode>()

public external abstract class Element : Node, ParentNode, NonDocumentTypeChildNode, ChildNode, Slottable, GeometryUtils, ARIAMixin, ARIANotifyMixin, UnionElementOrHTMLCollection, UnionElementOrRadioNodeList, UnionElementOrText, UnionElementOrProcessingInstruction {
    open val namespaceURI: String?
    open val prefix: String?
    open val localName: String
    open val tagName: String
    open var id: String
    open var className: String
    open val classList: DOMTokenList
    open var slot: String
    open fun hasAttributes(): Boolean
    open val attributes: NamedNodeMap
    open fun getAttributeNames(): JsArray<JsString>
    open fun getAttribute(qualifiedName: String): String?
    open fun getAttributeNS(namespace: String?, localName: String): String?
    open fun setAttribute(qualifiedName: String, value: String)
    open fun setAttributeNS(namespace: String?, qualifiedName: String, value: String)
    open fun removeAttribute(qualifiedName: String)
    open fun removeAttributeNS(namespace: String?, localName: String)
    open fun toggleAttribute(qualifiedName: String, force: Boolean = definedExternally): Boolean
    open fun hasAttribute(qualifiedName: String): Boolean
    open fun hasAttributeNS(namespace: String?, localName: String): Boolean
    open fun getAttributeNode(qualifiedName: String): Attr?
    open fun getAttributeNodeNS(namespace: String?, localName: String): Attr?
    open fun setAttributeNode(attr: Attr): Attr?
    open fun setAttributeNodeNS(attr: Attr): Attr?
    open fun removeAttributeNode(attr: Attr): Attr
    open fun attachShadow(init: ShadowRootInit): ShadowRoot
    open val shadowRoot: ShadowRoot?
    open val customElementRegistry: CustomElementRegistry?
    open fun closest(selectors: String): Element?
    open fun matches(selectors: String): Boolean
    open fun webkitMatchesSelector(selectors: String): Boolean
    open fun getElementsByTagName(qualifiedName: String): HTMLCollection
    open fun getElementsByTagNameNS(namespace: String?, localName: String): HTMLCollection
    open fun getElementsByClassName(classNames: String): HTMLCollection
    open fun insertAdjacentElement(where: String, element: Element): Element?
    open fun insertAdjacentText(where: String, data: String)
    open fun setHTML(html: String, options: SetHTMLOptions = definedExternally)
    open fun appendHTML(html: String, options: SetHTMLOptions = definedExternally)
    open fun prependHTML(html: String, options: SetHTMLOptions = definedExternally)
    open fun setHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    open fun appendHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    open fun prependHTMLUnsafe(html: String, options: SetHTMLUnsafeOptions = definedExternally)
    open fun getHTML(options: GetHTMLOptions = definedExternally): String
    open var innerHTML: String
    open var outerHTML: String
    open fun insertAdjacentHTML(position: String, string: String)
    open fun getClientRects(): DOMRectList
    open fun getBoundingClientRect(): DOMRect
    open fun checkVisibility(options: CheckVisibilityOptions = definedExternally): Boolean
    open fun scrollIntoView(arg: Boolean): Promise<ScrollResult>
    open fun scrollIntoView(arg: ScrollIntoViewOptions): Promise<ScrollResult>
    open fun scrollIntoView(): Promise<ScrollResult>
    open fun scroll(options: ScrollToOptions = definedExternally): Promise<ScrollResult>
    open fun scroll(x: Double, y: Double): Promise<ScrollResult>
    open fun scrollTo(options: ScrollToOptions = definedExternally): Promise<ScrollResult>
    open fun scrollTo(x: Double, y: Double): Promise<ScrollResult>
    open fun scrollBy(options: ScrollToOptions = definedExternally): Promise<ScrollResult>
    open fun scrollBy(x: Double, y: Double): Promise<ScrollResult>
    open var scrollTop: Double
    open var scrollLeft: Double
    open val scrollWidth: Int
    open val scrollHeight: Int
    open val clientTop: Int
    open val clientLeft: Int
    open val clientWidth: Int
    open val clientHeight: Int
    open val currentCSSZoom: Double
    open fun setPointerCapture(pointerId: Int)
    open fun releasePointerCapture(pointerId: Int)
    open fun hasPointerCapture(pointerId: Int): Boolean
    open fun requestFullscreen(options: FullscreenOptions = definedExternally): Promise<JsAny?>
    open var onfullscreenchange: ((Event) -> Unit)?
    open var onfullscreenerror: ((Event) -> Unit)?

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

public external interface ShadowRootInit : JsAny {
    var mode: ShadowRootMode
    var delegatesFocus: Boolean?
    var serializable: Boolean?
    var slotAssignment: SlotAssignmentMode?
    var clonable: Boolean?
    var customElementRegistry: CustomElementRegistry?
}

public fun ShadowRootInit(mode: ShadowRootMode, delegatesFocus: Boolean? = null, serializable: Boolean? = null, slotAssignment: SlotAssignmentMode? = null, clonable: Boolean? = null, customElementRegistry: CustomElementRegistry? = null): ShadowRootInit = newJsObject<ShadowRootInit>().apply {
    this.mode = mode
    if (delegatesFocus != null) this.delegatesFocus = delegatesFocus
    if (serializable != null) this.serializable = serializable
    if (slotAssignment != null) this.slotAssignment = slotAssignment
    if (clonable != null) this.clonable = clonable
    if (customElementRegistry != null) this.customElementRegistry = customElementRegistry
}

public external abstract class NamedNodeMap : ItemArrayLike<Attr> {
    override val length: Int
    override fun item(index: Int): Attr?
    open fun getNamedItem(qualifiedName: String): Attr?
    open fun getNamedItemNS(namespace: String?, localName: String): Attr?
    open fun setNamedItem(attr: Attr): Attr?
    open fun setNamedItemNS(attr: Attr): Attr?
    open fun removeNamedItem(qualifiedName: String): Attr
    open fun removeNamedItemNS(namespace: String?, localName: String): Attr
}

public operator fun NamedNodeMap.get(index: Int): Attr? = getProperty(this, index)

public operator fun NamedNodeMap.get(qualifiedName: String): Attr? = getProperty(this, qualifiedName)

public external abstract class Attr : Node {
    open val namespaceURI: String?
    open val prefix: String?
    open val localName: String
    open val name: String
    open var value: String
    open val ownerElement: Element?
    open val specified: Boolean

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

public external abstract class CharacterData : Node, NonDocumentTypeChildNode, ChildNode {
    open var data: String
    open val length: Int
    open fun substringData(offset: Int, count: Int): String
    open fun appendData(data: String)
    open fun insertData(offset: Int, data: String)
    open fun deleteData(offset: Int, count: Int)
    open fun replaceData(offset: Int, count: Int, data: String)

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

public external open class Text : CharacterData, Slottable, GeometryUtils, UnionElementOrText {
    constructor(data: String = definedExternally)
    open fun splitText(offset: Int): Text
    open val wholeText: String
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

public external abstract class CDATASection : Text {

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

public external open class ProcessingInstruction : CharacterData, LinkStyle, UnionElementOrProcessingInstruction {
    constructor(target: String, data: String = definedExternally)
    open val target: String
    open fun hasAttributes(): Boolean
    open fun getAttributeNames(): JsArray<JsString>
    open fun getAttribute(name: String): String?
    open fun setAttribute(name: String, value: String)
    open fun removeAttribute(name: String)
    open fun toggleAttribute(name: String, force: Boolean = definedExternally): Boolean
    open fun hasAttribute(name: String): Boolean
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
    override val sheet: CSSStyleSheet?

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

public external open class Comment : CharacterData {
    constructor(data: String = definedExternally)
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

public external abstract class AbstractRange : JsAny {
    open val startContainer: Node
    open val startOffset: Int
    open val endContainer: Node
    open val endOffset: Int
    open val collapsed: Boolean
}

public external interface StaticRangeInit : JsAny {
    var startContainer: Node
    var startOffset: Int
    var endContainer: Node
    var endOffset: Int
}

public fun StaticRangeInit(startContainer: Node, startOffset: Int, endContainer: Node, endOffset: Int): StaticRangeInit = newJsObject<StaticRangeInit>().apply {
    this.startContainer = startContainer
    this.startOffset = startOffset
    this.endContainer = endContainer
    this.endOffset = endOffset
}

public external open class StaticRange : AbstractRange {
    constructor(init: StaticRangeInit)
}

public external open class Range : AbstractRange {
    constructor()
    open val commonAncestorContainer: Node
    open fun setStart(node: Node, offset: Int)
    open fun setEnd(node: Node, offset: Int)
    open fun setStartBefore(node: Node)
    open fun setStartAfter(node: Node)
    open fun setEndBefore(node: Node)
    open fun setEndAfter(node: Node)
    open fun collapse(toStart: Boolean = definedExternally)
    open fun selectNode(node: Node)
    open fun selectNodeContents(node: Node)
    open fun compareBoundaryPoints(how: Short, sourceRange: Range): Short
    open fun deleteContents()
    open fun extractContents(): DocumentFragment
    open fun cloneContents(): DocumentFragment
    open fun insertNode(node: Node)
    open fun surroundContents(newParent: Node)
    open fun cloneRange(): Range
    open fun detach()
    open fun isPointInRange(node: Node, offset: Int): Boolean
    open fun comparePoint(node: Node, offset: Int): Short
    open fun intersectsNode(node: Node): Boolean
    open fun createContextualFragment(string: String): DocumentFragment
    open fun getClientRects(): DOMRectList
    open fun getBoundingClientRect(): DOMRect

    companion object {
        val START_TO_START: Short
        val START_TO_END: Short
        val END_TO_END: Short
        val END_TO_START: Short
    }
}

public external abstract class NodeIterator : JsAny {
    open val root: Node
    open val referenceNode: Node
    open val pointerBeforeReferenceNode: Boolean
    open val whatToShow: Int
    open val filter: NodeFilter?
    open fun nextNode(): Node?
    open fun previousNode(): Node?
    open fun detach()
}

public external abstract class TreeWalker : JsAny {
    open val root: Node
    open val whatToShow: Int
    open val filter: NodeFilter?
    open var currentNode: Node
    open fun parentNode(): Node?
    open fun firstChild(): Node?
    open fun lastChild(): Node?
    open fun previousSibling(): Node?
    open fun nextSibling(): Node?
    open fun previousNode(): Node?
    open fun nextNode(): Node?
}

public external interface NodeFilter : JsAny {
    fun acceptNode(node: Node): Short

    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
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

public external abstract class DOMTokenList : ItemArrayLike<JsString> {
    override val length: Int
    override fun item(index: Int): JsString?
    open fun contains(token: String): Boolean
    open fun add(vararg tokens: String)
    open fun remove(vararg tokens: String)
    open fun toggle(token: String, force: Boolean = definedExternally): Boolean
    open fun replace(token: String, newToken: String): Boolean
    open fun supports(token: String): Boolean
    open var value: String
    // not printed yet: iterable
}

public operator fun DOMTokenList.get(index: Int): String? = getStringProperty(this, index)

public external abstract class XPathResult : JsAny {
    open val resultType: Short
    open val numberValue: Double
    open val stringValue: String
    open val booleanValue: Boolean
    open val singleNodeValue: Node?
    open val invalidIteratorState: Boolean
    open val snapshotLength: Int
    open fun iterateNext(): Node?
    open fun snapshotItem(index: Int): Node?

    companion object {
        val ANY_TYPE: Short
        val NUMBER_TYPE: Short
        val STRING_TYPE: Short
        val BOOLEAN_TYPE: Short
        val UNORDERED_NODE_ITERATOR_TYPE: Short
        val ORDERED_NODE_ITERATOR_TYPE: Short
        val UNORDERED_NODE_SNAPSHOT_TYPE: Short
        val ORDERED_NODE_SNAPSHOT_TYPE: Short
        val ANY_UNORDERED_NODE_TYPE: Short
        val FIRST_ORDERED_NODE_TYPE: Short
    }
}

public external abstract class XPathExpression : JsAny {
    open fun evaluate(contextNode: Node, type: Short = definedExternally, result: XPathResult? = definedExternally): XPathResult
}

public external interface XPathNSResolver : JsAny {
    fun lookupNamespaceURI(prefix: String?): String?
}

public external interface XPathEvaluatorBase : JsAny {
    fun createExpression(expression: String, resolver: XPathNSResolver? = definedExternally): XPathExpression
    fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression
    fun createNSResolver(nodeResolver: Node): Node
    fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver? = definedExternally, type: Short = definedExternally, result: XPathResult? = definedExternally): XPathResult
    fun evaluate(expression: String, contextNode: Node, resolver: (String?) -> String?, type: Short = definedExternally, result: XPathResult? = definedExternally): XPathResult
}

public external open class XPathEvaluator : XPathEvaluatorBase {
    constructor()
    override fun createExpression(expression: String, resolver: XPathNSResolver?): XPathExpression
    override fun createExpression(expression: String, resolver: (String?) -> String?): XPathExpression
    override fun createNSResolver(nodeResolver: Node): Node
    override fun evaluate(expression: String, contextNode: Node, resolver: XPathNSResolver?, type: Short, result: XPathResult?): XPathResult
    override fun evaluate(expression: String, contextNode: Node, resolver: (String?) -> String?, type: Short, result: XPathResult?): XPathResult
}

public external open class XSLTProcessor : JsAny {
    constructor()
    open fun importStylesheet(style: Node)
    open fun transformToFragment(source: Node, output: Document): DocumentFragment
    open fun transformToDocument(source: Node): Document
    open fun setParameter(namespaceURI: String, localName: String, value: JsAny?)
    open fun getParameter(namespaceURI: String, localName: String): JsAny?
    open fun removeParameter(namespaceURI: String, localName: String)
    open fun clearParameters()
    open fun reset()
}
