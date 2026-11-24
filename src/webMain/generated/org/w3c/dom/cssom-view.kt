/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'cssom-view', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*

public external interface GeometryNode : JsAny

public external interface ScrollBehavior : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ScrollBehavior.Companion.AUTO: ScrollBehavior get() = "auto".toJsString().unsafeCast<ScrollBehavior>()
public inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior get() = "instant".toJsString().unsafeCast<ScrollBehavior>()
public inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior get() = "smooth".toJsString().unsafeCast<ScrollBehavior>()

public external interface ScrollOptions : JsAny {
    public var behavior: ScrollBehavior?
}

public fun ScrollOptions(behavior: ScrollBehavior? = null): ScrollOptions = newJsObject<ScrollOptions>().apply {
    if (behavior != null) this.behavior = behavior
}

public external interface ScrollToOptions : ScrollOptions {
    public var left: Double?
    public var top: Double?
}

public fun ScrollToOptions(behavior: ScrollBehavior? = null, left: Double? = null, top: Double? = null): ScrollToOptions = newJsObject<ScrollToOptions>().apply {
    if (behavior != null) this.behavior = behavior
    if (left != null) this.left = left
    if (top != null) this.top = top
}

public external interface ScrollResult : JsAny {
    public var interrupted: Boolean
}

public fun ScrollResult(interrupted: Boolean): ScrollResult = newJsObject<ScrollResult>().apply {
    this.interrupted = interrupted
}

/**
 * A MediaQueryList object stores information on a media query applied to a document, with support for both immediate
 * and event-driven matching against the state of the document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList)
 */
public abstract external class MediaQueryList : EventTarget {
    /**
     * The media read-only property of the MediaQueryList interface is a string representing a serialized media query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/media)
     */
    public open val media: String

    /**
     * The matches read-only property of the MediaQueryList interface is a boolean value that returns true if the
     * document currently matches the media query list, or false if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/matches)
     */
    public open val matches: Boolean

    /**
     * The deprecated addListener() method of the MediaQueryList interface adds a listener to the MediaQueryListener
     * that will run a custom callback function in response to the media query status changing.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/addListener)
     */
    public open fun addListener(callback: EventListener?)

    /**
     * The removeListener() method of the MediaQueryList interface removes a listener from the MediaQueryListener.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/removeListener)
     */
    public open fun removeListener(callback: EventListener?)

    /**
     * The removeListener() method of the MediaQueryList interface removes a listener from the MediaQueryListener.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/removeListener)
     */
    public open fun removeListener(callback: (Event) -> Unit)

    /**
     * The change event of the MediaQueryList interface fires when the status of media query support changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/change_event)
     */
    public open var onchange: ((MediaQueryListEvent) -> Unit)?
}

private fun toEventListener(callback: (Event) -> Unit): EventListener = js("callback")

/**
 * The deprecated addListener() method of the MediaQueryList interface adds a listener to the MediaQueryListener that
 * will run a custom callback function in response to the media query status changing.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryList/addListener)
 */
public fun MediaQueryList.addListener(callback: (Event) -> Unit): () -> Unit {
    val listener = toEventListener(callback)
    addListener(listener)
    return { removeListener(listener) }
}

/**
 * The MediaQueryListEvent object stores information on the changes that have happened to a MediaQueryList object —
 * instances are available as the event object on a function referenced by a change event.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent)
 */
public open external class MediaQueryListEvent : Event {
    /**
     * The MediaQueryListEvent() constructor creates a new MediaQueryListEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/MediaQueryListEvent)
     */
    public constructor(type: String, eventInitDict: MediaQueryListEventInit = definedExternally)

    /**
     * The media read-only property of the MediaQueryListEvent interface is a string representing a serialized media
     * query.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/media)
     */
    public open val media: String

    /**
     * The matches read-only property of the MediaQueryListEvent interface is a boolean value that is true if the
     * document currently matches the media query list, or false if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaQueryListEvent/matches)
     */
    public open val matches: Boolean

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface MediaQueryListEventInit : EventInit {
    public var media: String?
    public var matches: Boolean?
}

public fun MediaQueryListEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, media: String? = null, matches: Boolean? = null): MediaQueryListEventInit = newJsObject<MediaQueryListEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (media != null) this.media = media
    if (matches != null) this.matches = matches
}

/**
 * The Screen interface represents a screen, usually the one on which the current window is being rendered, and is
 * obtained using window.screen.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen)
 */
public abstract external class Screen : JsAny {
    /**
     * The availWidth read-only property of the Screen interface returns the amount of horizontal space (in CSS pixels)
     * available to the window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availWidth)
     */
    public open val availWidth: Int

    /**
     * The read-only Screen interface's availHeight property returns the height, in CSS pixels, of the space available
     * for Web content on the screen. Since Screen is exposed on the Window interface's window.screen property, you
     * access availHeight using window.screen.availHeight.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availHeight)
     */
    public open val availHeight: Int

    /**
     * The Screen.width read-only property returns the width of the screen in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/width)
     */
    public open val width: Int

    /**
     * The Screen.height read-only property returns the height of the screen in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/height)
     */
    public open val height: Int

    /**
     * The Screen.colorDepth read-only property returns the color depth of the screen. Per the CSSOM, some
     * implementations return 24 for compatibility reasons. See the browser compatibility section for those that don't.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/colorDepth)
     */
    public open val colorDepth: Int

    /**
     * The pixelDepth read-only property of the Screen interface returns the bit depth of the screen. Per the CSSOM,
     * some implementations return 24 for compatibility reasons. See the browser compatibility section for those that
     * don't.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/pixelDepth)
     */
    public open val pixelDepth: Int
}

public external interface CaretPositionFromPointOptions : JsAny {
    public var shadowRoots: JsArray<ShadowRoot>?
}

public fun CaretPositionFromPointOptions(shadowRoots: JsArray<ShadowRoot>? = null): CaretPositionFromPointOptions = newJsObject<CaretPositionFromPointOptions>().apply {
    if (shadowRoots != null) this.shadowRoots = shadowRoots
}

/**
 * The CaretPosition interface represents the caret position, an indicator for the text insertion point. You can get a
 * CaretPosition using the Document.caretPositionFromPoint() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition)
 */
public abstract external class CaretPosition : JsAny {
    /**
     * The offsetNode property of the CaretPosition interface returns a Node containing the found node at the caret's
     * position.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition/offsetNode)
     */
    public open val offsetNode: Node

    /**
     * The offset property of the CaretPosition interface returns an integer representing the offset of the selection in
     * the caret position node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition/offset)
     */
    public open val offset: Int

    /**
     * The getClientRect() method of the CaretPosition interface returns the client rectangle for the caret range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CaretPosition/getClientRect)
     */
    public open fun getClientRect(): DOMRect?
}

public external interface ScrollLogicalPosition : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ScrollLogicalPosition.Companion.START: ScrollLogicalPosition get() = "start".toJsString().unsafeCast<ScrollLogicalPosition>()
public inline val ScrollLogicalPosition.Companion.CENTER: ScrollLogicalPosition get() = "center".toJsString().unsafeCast<ScrollLogicalPosition>()
public inline val ScrollLogicalPosition.Companion.END: ScrollLogicalPosition get() = "end".toJsString().unsafeCast<ScrollLogicalPosition>()
public inline val ScrollLogicalPosition.Companion.NEAREST: ScrollLogicalPosition get() = "nearest".toJsString().unsafeCast<ScrollLogicalPosition>()

public external interface ScrollIntoViewOptions : ScrollOptions {
    public var block: ScrollLogicalPosition?
    public var inline: ScrollLogicalPosition?
    public var container: ScrollIntoViewContainer?
}

public fun ScrollIntoViewOptions(behavior: ScrollBehavior? = null, block: ScrollLogicalPosition? = null, inline: ScrollLogicalPosition? = null, container: ScrollIntoViewContainer? = null): ScrollIntoViewOptions = newJsObject<ScrollIntoViewOptions>().apply {
    if (behavior != null) this.behavior = behavior
    if (block != null) this.block = block
    if (inline != null) this.inline = inline
    if (container != null) this.container = container
}

public external interface ScrollIntoViewContainer : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ScrollIntoViewContainer.Companion.ALL: ScrollIntoViewContainer get() = "all".toJsString().unsafeCast<ScrollIntoViewContainer>()
public inline val ScrollIntoViewContainer.Companion.NEAREST: ScrollIntoViewContainer get() = "nearest".toJsString().unsafeCast<ScrollIntoViewContainer>()

public external interface CheckVisibilityOptions : JsAny {
    public var checkOpacity: Boolean?
    public var checkVisibilityCSS: Boolean?
    public var contentVisibilityAuto: Boolean?
    public var opacityProperty: Boolean?
    public var visibilityProperty: Boolean?
}

public fun CheckVisibilityOptions(checkOpacity: Boolean? = null, checkVisibilityCSS: Boolean? = null, contentVisibilityAuto: Boolean? = null, opacityProperty: Boolean? = null, visibilityProperty: Boolean? = null): CheckVisibilityOptions = newJsObject<CheckVisibilityOptions>().apply {
    if (checkOpacity != null) this.checkOpacity = checkOpacity
    if (checkVisibilityCSS != null) this.checkVisibilityCSS = checkVisibilityCSS
    if (contentVisibilityAuto != null) this.contentVisibilityAuto = contentVisibilityAuto
    if (opacityProperty != null) this.opacityProperty = opacityProperty
    if (visibilityProperty != null) this.visibilityProperty = visibilityProperty
}

public external interface CSSBoxType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val CSSBoxType.Companion.MARGIN: CSSBoxType get() = "margin".toJsString().unsafeCast<CSSBoxType>()
public inline val CSSBoxType.Companion.BORDER: CSSBoxType get() = "border".toJsString().unsafeCast<CSSBoxType>()
public inline val CSSBoxType.Companion.PADDING: CSSBoxType get() = "padding".toJsString().unsafeCast<CSSBoxType>()
public inline val CSSBoxType.Companion.CONTENT: CSSBoxType get() = "content".toJsString().unsafeCast<CSSBoxType>()

public external interface BoxQuadOptions : JsAny {
    public var box: CSSBoxType?
    public var relativeTo: GeometryNode?
}

public fun BoxQuadOptions(box: CSSBoxType? = null, relativeTo: GeometryNode? = null): BoxQuadOptions = newJsObject<BoxQuadOptions>().apply {
    if (box != null) this.box = box
    if (relativeTo != null) this.relativeTo = relativeTo
}

public external interface ConvertCoordinateOptions : JsAny {
    public var fromBox: CSSBoxType?
    public var toBox: CSSBoxType?
}

public fun ConvertCoordinateOptions(fromBox: CSSBoxType? = null, toBox: CSSBoxType? = null): ConvertCoordinateOptions = newJsObject<ConvertCoordinateOptions>().apply {
    if (fromBox != null) this.fromBox = fromBox
    if (toBox != null) this.toBox = toBox
}

public external interface GeometryUtils : JsAny {
    public fun getBoxQuads(options: BoxQuadOptions = definedExternally): JsArray<DOMQuad>
    public fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions = definedExternally): DOMQuad
    public fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions = definedExternally): DOMQuad
    public fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions = definedExternally): DOMPoint
}

/**
 * The VisualViewport interface of the CSSOM view API represents the visual viewport for a given window. For a page
 * containing frames, each &lt;iframe&gt; , as well as the containing page, will have a unique window object. Each
 * window on a page will have a unique VisualViewport representing the properties associated with that window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport)
 */
public abstract external class VisualViewport : EventTarget {
    /**
     * The offsetLeft read-only property of the VisualViewport interface returns the offset of the left edge of the
     * visual viewport from the left edge of the layout viewport in CSS pixels, or 0 if current document is not fully
     * active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetLeft)
     */
    public open val offsetLeft: Double

    /**
     * The offsetTop read-only property of the VisualViewport interface returns the offset of the top edge of the visual
     * viewport from the top edge of the layout viewport in CSS pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/offsetTop)
     */
    public open val offsetTop: Double

    /**
     * The pageLeft read-only property of the VisualViewport interface returns the x coordinate of the left edge of the
     * visual viewport relative to the initial containing block origin, in CSS pixels, or 0 if current document is not
     * fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageLeft)
     */
    public open val pageLeft: Double

    /**
     * The pageTop read-only property of the VisualViewport interface returns the y coordinate of the top edge of the
     * visual viewport relative to the initial containing block origin, in CSS pixels, or 0 if current document is not
     * fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/pageTop)
     */
    public open val pageTop: Double

    /**
     * The width read-only property of the VisualViewport interface returns the width of the visual viewport, in CSS
     * pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/width)
     */
    public open val width: Double

    /**
     * The height read-only property of the VisualViewport interface returns the height of the visual viewport, in CSS
     * pixels, or 0 if current document is not fully active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/height)
     */
    public open val height: Double

    /**
     * The scale read-only property of the VisualViewport interface returns the pinch-zoom scaling factor applied to the
     * visual viewport, or 0 if current document is not fully active, or 1 if there is no output device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scale)
     */
    public open val scale: Double

    /**
     * The resize event of the VisualViewport interface is fired when the visual viewport is resized. This allows you to
     * position elements relative to the visual viewport as it is zoomed, which would normally be anchored to the layout
     * viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/resize_event)
     */
    public open var onresize: ((Event) -> Unit)?

    /**
     * The scroll event of the VisualViewport interface is fired when the visual viewport is scrolled. This allows you
     * to position elements relative to the visual viewport as it is scrolled, which would normally be anchored to the
     * layout viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scroll_event)
     */
    public open var onscroll: ((Event) -> Unit)?

    /**
     * The scrollend event of the VisualViewport interface is fired when a scrolling operation on the visual viewport
     * ends. This allows you to update an element when a scrolling action is completed. For example, you could use the
     * resize and scroll events to keep an element fixed to the visual viewport as it is pinch-zoomed and scrolled, and
     * update it with new content when scrolling ends using scrollend.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VisualViewport/scrollend_event)
     */
    public open var onscrollend: ((Event) -> Unit)?
}
