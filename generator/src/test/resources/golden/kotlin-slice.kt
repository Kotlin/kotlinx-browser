// file: org/w3c/dom/html.kt
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

public external abstract class DOMStringMap : JsAny {
    // not printed yet: deleter <anonymous>(DOMString)
}

public operator fun DOMStringMap.get(name: String): String? = getStringProperty(this, name)

public operator fun DOMStringMap.set(name: String, value: String) { setStringProperty(this, name, value) }

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

public external abstract class CanvasRenderingContext2D : CanvasSettings, CanvasState, CanvasTransform, CanvasCompositing, CanvasImageSmoothing, CanvasFillStrokeStyles, CanvasShadowStyles, CanvasFilters, CanvasRect, CanvasDrawPath, CanvasUserInterface, CanvasText, CanvasDrawImage, CanvasImageData, CanvasPathDrawingStyles, CanvasTextDrawingStyles, CanvasPath, RenderingContext {
    open val canvas: HTMLCanvasElement
}

public external interface CanvasDrawImage : JsAny {
    fun drawImage(image: CanvasImageSource, dx: Double, dy: Double)
    fun drawImage(image: CanvasImageSource, dx: Double, dy: Double, dw: Double, dh: Double)
    fun drawImage(image: CanvasImageSource, sx: Double, sy: Double, sw: Double, sh: Double, dx: Double, dy: Double, dw: Double, dh: Double)
}

public external abstract class CustomStateSet : JsAny {
    // not printed yet: setlike
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

// file: org/w3c/dom/dom.kt
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

public external abstract class NodeList : ItemArrayLike<Node> {
    override fun item(index: Int): Node?
    override val length: Int
    // not printed yet: iterable
}

public operator fun NodeList.get(index: Int): Node? = getProperty(this, index)

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

// file: org/w3c/dom/cssom-view.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom-view', DO NOT EDIT!

package org.w3c.dom

import kotlin.js.*

public external interface GeometryNode : JsAny

// file: org/w3c/dom/events/uievents.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'uievents', DO NOT EDIT!

package org.w3c.dom.events

import org.w3c.dom.*

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

// file: org/w3c/dom/pointerevents/pointerevents.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'pointerevents', DO NOT EDIT!

package org.w3c.dom.pointerevents

import org.w3c.dom.*
import org.w3c.dom.events.*

public external interface MouseEventInit : EventModifierInit {
    var screenX: Int?
    var screenY: Int?
    var clientX: Int?
    var clientY: Int?
    var button: Short?
    var buttons: Short?
    var relatedTarget: EventTarget?
}

public fun MouseEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, view: Window? = null, detail: Int? = null, which: Int? = null, ctrlKey: Boolean? = null, shiftKey: Boolean? = null, altKey: Boolean? = null, metaKey: Boolean? = null, modifierAltGraph: Boolean? = null, modifierCapsLock: Boolean? = null, modifierFn: Boolean? = null, modifierFnLock: Boolean? = null, modifierHyper: Boolean? = null, modifierNumLock: Boolean? = null, modifierScrollLock: Boolean? = null, modifierSuper: Boolean? = null, modifierSymbol: Boolean? = null, modifierSymbolLock: Boolean? = null, screenX: Int? = null, screenY: Int? = null, clientX: Int? = null, clientY: Int? = null, button: Short? = null, buttons: Short? = null, relatedTarget: EventTarget? = null): MouseEventInit = newJsObject<MouseEventInit>().apply {
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
}

// file: org/w3c/dom/css/cssom.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom', DO NOT EDIT!

package org.w3c.dom.css

import kotlin.js.*

public external interface UnionElementOrProcessingInstruction : JsAny

public external object CSS {
    fun escape(ident: String): String
}

// file: org/w3c/dom/clipboard/clipboard-apis.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'clipboard-apis', DO NOT EDIT!

package org.w3c.dom.clipboard

import kotlin.js.*
import org.w3c.dom.*

public external open class ClipboardChangeEvent : Event {
    constructor(type: String, eventInitDict: ClipboardChangeEventInit = definedExternally)
    open val types: JsArray<JsString>
    open val changeId: JsBigInt

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

// file: org/khronos/webgl/webgl1.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webgl1', DO NOT EDIT!

package org.khronos.webgl

import kotlin.js.*
import org.w3c.dom.*

public external interface TexImageSource : ImageBitmapSource

public external interface WebGLRenderingContextOverloads : JsAny {
    fun bufferData(target: Int, size: Double, usage: Int)
    fun bufferData(target: Int, data: BufferDataSource?, usage: Int)
    fun bufferSubData(target: Int, offset: Double, data: BufferDataSource)
    fun compressedTexImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, data: ArrayBufferView)
    fun compressedTexSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, data: ArrayBufferView)
    fun readPixels(x: Int, y: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage2D(target: Int, level: Int, internalformat: Int, width: Int, height: Int, border: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texImage2D(target: Int, level: Int, internalformat: Int, format: Int, type: Int, source: TexImageSource)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, width: Int, height: Int, format: Int, type: Int, pixels: ArrayBufferView?)
    fun texSubImage2D(target: Int, level: Int, xoffset: Int, yoffset: Int, format: Int, type: Int, source: TexImageSource)
    fun uniform1fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform1fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform2fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform2fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform3fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform3fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform4fv(location: WebGLUniformLocation?, v: Float32Array)
    fun uniform4fv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform1iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform1iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform2iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform2iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform3iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform3iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniform4iv(location: WebGLUniformLocation?, v: Int32Array)
    fun uniform4iv(location: WebGLUniformLocation?, v: JsArray<JsNumber>)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    fun uniformMatrix2fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    fun uniformMatrix3fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: Float32Array)
    fun uniformMatrix4fv(location: WebGLUniformLocation?, transpose: Boolean, value: JsArray<JsNumber>)
}

public external abstract class WebGLRenderingContext : WebGLRenderingContextBase, WebGLRenderingContextOverloads, RenderingContext, OffscreenRenderingContext {

    companion object {
        val DEPTH_BUFFER_BIT: Int
        val STENCIL_BUFFER_BIT: Int
        val COLOR_BUFFER_BIT: Int
        val POINTS: Int
        val LINES: Int
        val LINE_LOOP: Int
        val LINE_STRIP: Int
        val TRIANGLES: Int
        val TRIANGLE_STRIP: Int
        val TRIANGLE_FAN: Int
        val ZERO: Int
        val ONE: Int
        val SRC_COLOR: Int
        val ONE_MINUS_SRC_COLOR: Int
        val SRC_ALPHA: Int
        val ONE_MINUS_SRC_ALPHA: Int
        val DST_ALPHA: Int
        val ONE_MINUS_DST_ALPHA: Int
        val DST_COLOR: Int
        val ONE_MINUS_DST_COLOR: Int
        val SRC_ALPHA_SATURATE: Int
        val FUNC_ADD: Int
        val BLEND_EQUATION: Int
        val BLEND_EQUATION_RGB: Int
        val BLEND_EQUATION_ALPHA: Int
        val FUNC_SUBTRACT: Int
        val FUNC_REVERSE_SUBTRACT: Int
        val BLEND_DST_RGB: Int
        val BLEND_SRC_RGB: Int
        val BLEND_DST_ALPHA: Int
        val BLEND_SRC_ALPHA: Int
        val CONSTANT_COLOR: Int
        val ONE_MINUS_CONSTANT_COLOR: Int
        val CONSTANT_ALPHA: Int
        val ONE_MINUS_CONSTANT_ALPHA: Int
        val BLEND_COLOR: Int
        val ARRAY_BUFFER: Int
        val ELEMENT_ARRAY_BUFFER: Int
        val ARRAY_BUFFER_BINDING: Int
        val ELEMENT_ARRAY_BUFFER_BINDING: Int
        val STREAM_DRAW: Int
        val STATIC_DRAW: Int
        val DYNAMIC_DRAW: Int
        val BUFFER_SIZE: Int
        val BUFFER_USAGE: Int
        val CURRENT_VERTEX_ATTRIB: Int
        val FRONT: Int
        val BACK: Int
        val FRONT_AND_BACK: Int
        val CULL_FACE: Int
        val BLEND: Int
        val DITHER: Int
        val STENCIL_TEST: Int
        val DEPTH_TEST: Int
        val SCISSOR_TEST: Int
        val POLYGON_OFFSET_FILL: Int
        val SAMPLE_ALPHA_TO_COVERAGE: Int
        val SAMPLE_COVERAGE: Int
        val NO_ERROR: Int
        val INVALID_ENUM: Int
        val INVALID_VALUE: Int
        val INVALID_OPERATION: Int
        val OUT_OF_MEMORY: Int
        val CW: Int
        val CCW: Int
        val LINE_WIDTH: Int
        val ALIASED_POINT_SIZE_RANGE: Int
        val ALIASED_LINE_WIDTH_RANGE: Int
        val CULL_FACE_MODE: Int
        val FRONT_FACE: Int
        val DEPTH_RANGE: Int
        val DEPTH_WRITEMASK: Int
        val DEPTH_CLEAR_VALUE: Int
        val DEPTH_FUNC: Int
        val STENCIL_CLEAR_VALUE: Int
        val STENCIL_FUNC: Int
        val STENCIL_FAIL: Int
        val STENCIL_PASS_DEPTH_FAIL: Int
        val STENCIL_PASS_DEPTH_PASS: Int
        val STENCIL_REF: Int
        val STENCIL_VALUE_MASK: Int
        val STENCIL_WRITEMASK: Int
        val STENCIL_BACK_FUNC: Int
        val STENCIL_BACK_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_FAIL: Int
        val STENCIL_BACK_PASS_DEPTH_PASS: Int
        val STENCIL_BACK_REF: Int
        val STENCIL_BACK_VALUE_MASK: Int
        val STENCIL_BACK_WRITEMASK: Int
        val VIEWPORT: Int
        val SCISSOR_BOX: Int
        val COLOR_CLEAR_VALUE: Int
        val COLOR_WRITEMASK: Int
        val UNPACK_ALIGNMENT: Int
        val PACK_ALIGNMENT: Int
        val MAX_TEXTURE_SIZE: Int
        val MAX_VIEWPORT_DIMS: Int
        val SUBPIXEL_BITS: Int
        val RED_BITS: Int
        val GREEN_BITS: Int
        val BLUE_BITS: Int
        val ALPHA_BITS: Int
        val DEPTH_BITS: Int
        val STENCIL_BITS: Int
        val POLYGON_OFFSET_UNITS: Int
        val POLYGON_OFFSET_FACTOR: Int
        val TEXTURE_BINDING_2D: Int
        val SAMPLE_BUFFERS: Int
        val SAMPLES: Int
        val SAMPLE_COVERAGE_VALUE: Int
        val SAMPLE_COVERAGE_INVERT: Int
        val COMPRESSED_TEXTURE_FORMATS: Int
        val DONT_CARE: Int
        val FASTEST: Int
        val NICEST: Int
        val GENERATE_MIPMAP_HINT: Int
        val BYTE: Int
        val UNSIGNED_BYTE: Int
        val SHORT: Int
        val UNSIGNED_SHORT: Int
        val INT: Int
        val UNSIGNED_INT: Int
        val FLOAT: Int
        val DEPTH_COMPONENT: Int
        val ALPHA: Int
        val RGB: Int
        val RGBA: Int
        val LUMINANCE: Int
        val LUMINANCE_ALPHA: Int
        val UNSIGNED_SHORT_4_4_4_4: Int
        val UNSIGNED_SHORT_5_5_5_1: Int
        val UNSIGNED_SHORT_5_6_5: Int
        val FRAGMENT_SHADER: Int
        val VERTEX_SHADER: Int
        val MAX_VERTEX_ATTRIBS: Int
        val MAX_VERTEX_UNIFORM_VECTORS: Int
        val MAX_VARYING_VECTORS: Int
        val MAX_COMBINED_TEXTURE_IMAGE_UNITS: Int
        val MAX_VERTEX_TEXTURE_IMAGE_UNITS: Int
        val MAX_TEXTURE_IMAGE_UNITS: Int
        val MAX_FRAGMENT_UNIFORM_VECTORS: Int
        val SHADER_TYPE: Int
        val DELETE_STATUS: Int
        val LINK_STATUS: Int
        val VALIDATE_STATUS: Int
        val ATTACHED_SHADERS: Int
        val ACTIVE_UNIFORMS: Int
        val ACTIVE_ATTRIBUTES: Int
        val SHADING_LANGUAGE_VERSION: Int
        val CURRENT_PROGRAM: Int
        val NEVER: Int
        val LESS: Int
        val EQUAL: Int
        val LEQUAL: Int
        val GREATER: Int
        val NOTEQUAL: Int
        val GEQUAL: Int
        val ALWAYS: Int
        val KEEP: Int
        val REPLACE: Int
        val INCR: Int
        val DECR: Int
        val INVERT: Int
        val INCR_WRAP: Int
        val DECR_WRAP: Int
        val VENDOR: Int
        val RENDERER: Int
        val VERSION: Int
        val NEAREST: Int
        val LINEAR: Int
        val NEAREST_MIPMAP_NEAREST: Int
        val LINEAR_MIPMAP_NEAREST: Int
        val NEAREST_MIPMAP_LINEAR: Int
        val LINEAR_MIPMAP_LINEAR: Int
        val TEXTURE_MAG_FILTER: Int
        val TEXTURE_MIN_FILTER: Int
        val TEXTURE_WRAP_S: Int
        val TEXTURE_WRAP_T: Int
        val TEXTURE_2D: Int
        val TEXTURE: Int
        val TEXTURE_CUBE_MAP: Int
        val TEXTURE_BINDING_CUBE_MAP: Int
        val TEXTURE_CUBE_MAP_POSITIVE_X: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_X: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Y: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Y: Int
        val TEXTURE_CUBE_MAP_POSITIVE_Z: Int
        val TEXTURE_CUBE_MAP_NEGATIVE_Z: Int
        val MAX_CUBE_MAP_TEXTURE_SIZE: Int
        val TEXTURE0: Int
        val TEXTURE1: Int
        val TEXTURE2: Int
        val TEXTURE3: Int
        val TEXTURE4: Int
        val TEXTURE5: Int
        val TEXTURE6: Int
        val TEXTURE7: Int
        val TEXTURE8: Int
        val TEXTURE9: Int
        val TEXTURE10: Int
        val TEXTURE11: Int
        val TEXTURE12: Int
        val TEXTURE13: Int
        val TEXTURE14: Int
        val TEXTURE15: Int
        val TEXTURE16: Int
        val TEXTURE17: Int
        val TEXTURE18: Int
        val TEXTURE19: Int
        val TEXTURE20: Int
        val TEXTURE21: Int
        val TEXTURE22: Int
        val TEXTURE23: Int
        val TEXTURE24: Int
        val TEXTURE25: Int
        val TEXTURE26: Int
        val TEXTURE27: Int
        val TEXTURE28: Int
        val TEXTURE29: Int
        val TEXTURE30: Int
        val TEXTURE31: Int
        val ACTIVE_TEXTURE: Int
        val REPEAT: Int
        val CLAMP_TO_EDGE: Int
        val MIRRORED_REPEAT: Int
        val FLOAT_VEC2: Int
        val FLOAT_VEC3: Int
        val FLOAT_VEC4: Int
        val INT_VEC2: Int
        val INT_VEC3: Int
        val INT_VEC4: Int
        val BOOL: Int
        val BOOL_VEC2: Int
        val BOOL_VEC3: Int
        val BOOL_VEC4: Int
        val FLOAT_MAT2: Int
        val FLOAT_MAT3: Int
        val FLOAT_MAT4: Int
        val SAMPLER_2D: Int
        val SAMPLER_CUBE: Int
        val VERTEX_ATTRIB_ARRAY_ENABLED: Int
        val VERTEX_ATTRIB_ARRAY_SIZE: Int
        val VERTEX_ATTRIB_ARRAY_STRIDE: Int
        val VERTEX_ATTRIB_ARRAY_TYPE: Int
        val VERTEX_ATTRIB_ARRAY_NORMALIZED: Int
        val VERTEX_ATTRIB_ARRAY_POINTER: Int
        val VERTEX_ATTRIB_ARRAY_BUFFER_BINDING: Int
        val IMPLEMENTATION_COLOR_READ_TYPE: Int
        val IMPLEMENTATION_COLOR_READ_FORMAT: Int
        val COMPILE_STATUS: Int
        val LOW_FLOAT: Int
        val MEDIUM_FLOAT: Int
        val HIGH_FLOAT: Int
        val LOW_INT: Int
        val MEDIUM_INT: Int
        val HIGH_INT: Int
        val FRAMEBUFFER: Int
        val RENDERBUFFER: Int
        val RGBA4: Int
        val RGB5_A1: Int
        val RGBA8: Int
        val RGB565: Int
        val DEPTH_COMPONENT16: Int
        val STENCIL_INDEX8: Int
        val DEPTH_STENCIL: Int
        val RENDERBUFFER_WIDTH: Int
        val RENDERBUFFER_HEIGHT: Int
        val RENDERBUFFER_INTERNAL_FORMAT: Int
        val RENDERBUFFER_RED_SIZE: Int
        val RENDERBUFFER_GREEN_SIZE: Int
        val RENDERBUFFER_BLUE_SIZE: Int
        val RENDERBUFFER_ALPHA_SIZE: Int
        val RENDERBUFFER_DEPTH_SIZE: Int
        val RENDERBUFFER_STENCIL_SIZE: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE: Int
        val FRAMEBUFFER_ATTACHMENT_OBJECT_NAME: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL: Int
        val FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE: Int
        val COLOR_ATTACHMENT0: Int
        val DEPTH_ATTACHMENT: Int
        val STENCIL_ATTACHMENT: Int
        val DEPTH_STENCIL_ATTACHMENT: Int
        val NONE: Int
        val FRAMEBUFFER_COMPLETE: Int
        val FRAMEBUFFER_INCOMPLETE_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT: Int
        val FRAMEBUFFER_INCOMPLETE_DIMENSIONS: Int
        val FRAMEBUFFER_UNSUPPORTED: Int
        val FRAMEBUFFER_BINDING: Int
        val RENDERBUFFER_BINDING: Int
        val MAX_RENDERBUFFER_SIZE: Int
        val INVALID_FRAMEBUFFER_OPERATION: Int
        val UNPACK_FLIP_Y_WEBGL: Int
        val UNPACK_PREMULTIPLY_ALPHA_WEBGL: Int
        val CONTEXT_LOST_WEBGL: Int
        val UNPACK_COLORSPACE_CONVERSION_WEBGL: Int
        val BROWSER_DEFAULT_WEBGL: Int
    }
}

// file: org/w3c/xhr/xhr.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'xhr', DO NOT EDIT!

package org.w3c.xhr

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.files.*

public external open class FormData : JsAny {
    constructor(form: HTMLFormElement = definedExternally, submitter: HTMLElement? = definedExternally)
    open fun append(name: String, value: String)
    open fun append(name: String, blobValue: Blob, filename: String = definedExternally)
    open fun delete(name: String)
    open fun get(name: String): JsAny?
    open fun getAll(name: String): JsArray<JsAny>
    open fun has(name: String): Boolean
    open fun set(name: String, value: String)
    open fun set(name: String, blobValue: Blob, filename: String = definedExternally)
    // not printed yet: iterable
}

// file: org/w3c/fetch/fetch.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'fetch', DO NOT EDIT!

package org.w3c.fetch

import kotlin.js.*
import org.w3c.dom.*

public external open class Headers : JsAny {
    constructor(init: JsArray<JsArray<JsString>>)
    constructor(init: JsAny)
    constructor()
    open fun append(name: String, value: String)
    open fun delete(name: String)
    open fun get(name: String): String?
    open fun getSetCookie(): JsArray<JsString>
    open fun has(name: String): Boolean
    open fun set(name: String, value: String)
    // not printed yet: iterable
}

public external interface RequestInit : JsAny {
    var method: String?
    var headers: JsAny?
    var body: JsAny?
    var referrer: String?
    var referrerPolicy: ReferrerPolicy?
    var mode: RequestMode?
    var credentials: RequestCredentials?
    var cache: RequestCache?
    var redirect: RequestRedirect?
    var integrity: String?
    var keepalive: Boolean?
    var signal: AbortSignal?
    var duplex: RequestDuplex?
    var priority: RequestPriority?
    var window: JsAny?
}

public fun RequestInit(method: String? = null, headers: JsAny? = null, body: JsAny? = null, referrer: String? = null, referrerPolicy: ReferrerPolicy? = null, mode: RequestMode? = null, credentials: RequestCredentials? = null, cache: RequestCache? = null, redirect: RequestRedirect? = null, integrity: String? = null, keepalive: Boolean? = null, signal: AbortSignal? = null, duplex: RequestDuplex? = null, priority: RequestPriority? = null, window: JsAny? = null): RequestInit = newJsObject<RequestInit>().apply {
    if (method != null) this.method = method
    if (headers != null) this.headers = headers
    if (body != null) this.body = body
    if (referrer != null) this.referrer = referrer
    if (referrerPolicy != null) this.referrerPolicy = referrerPolicy
    if (mode != null) this.mode = mode
    if (credentials != null) this.credentials = credentials
    if (cache != null) this.cache = cache
    if (redirect != null) this.redirect = redirect
    if (integrity != null) this.integrity = integrity
    if (keepalive != null) this.keepalive = keepalive
    if (signal != null) this.signal = signal
    if (duplex != null) this.duplex = duplex
    if (priority != null) this.priority = priority
    if (window != null) this.window = window
}

public external interface RequestMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.CORS: RequestMode get() = "cors".toJsString().unsafeCast<RequestMode>()

public external interface RequestCredentials : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".toJsString().unsafeCast<RequestCredentials>()
public inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".toJsString().unsafeCast<RequestCredentials>()
public inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".toJsString().unsafeCast<RequestCredentials>()

// file: org/w3c/dom/wai-aria.kt
/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'wai-aria', DO NOT EDIT!

package org.w3c.dom


