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
    companion object
}

public inline val ScrollBehavior.Companion.AUTO: ScrollBehavior get() = "auto".toJsString().unsafeCast<ScrollBehavior>()
public inline val ScrollBehavior.Companion.INSTANT: ScrollBehavior get() = "instant".toJsString().unsafeCast<ScrollBehavior>()
public inline val ScrollBehavior.Companion.SMOOTH: ScrollBehavior get() = "smooth".toJsString().unsafeCast<ScrollBehavior>()

public external interface ScrollOptions : JsAny {
    var behavior: ScrollBehavior?
}

public fun ScrollOptions(behavior: ScrollBehavior? = null): ScrollOptions = newJsObject<ScrollOptions>().apply {
    if (behavior != null) this.behavior = behavior
}

public external interface ScrollToOptions : ScrollOptions {
    var left: Double?
    var top: Double?
}

public fun ScrollToOptions(behavior: ScrollBehavior? = null, left: Double? = null, top: Double? = null): ScrollToOptions = newJsObject<ScrollToOptions>().apply {
    if (behavior != null) this.behavior = behavior
    if (left != null) this.left = left
    if (top != null) this.top = top
}

public external interface ScrollResult : JsAny {
    var interrupted: Boolean
}

public fun ScrollResult(interrupted: Boolean): ScrollResult = newJsObject<ScrollResult>().apply {
    this.interrupted = interrupted
}

public external abstract class MediaQueryList : EventTarget {
    open val media: String
    open val matches: Boolean
    open fun addListener(callback: EventListener?)
    open fun removeListener(callback: EventListener?)
    open fun removeListener(callback: (Event) -> Unit)
    open var onchange: ((MediaQueryListEvent) -> Unit)?
}

private fun toEventListener(callback: (Event) -> Unit): EventListener = js("callback")

public fun MediaQueryList.addListener(callback: (Event) -> Unit): () -> Unit {
    val listener = toEventListener(callback)
    addListener(listener)
    return { removeListener(listener) }
}

public external open class MediaQueryListEvent : Event {
    constructor(type: String, eventInitDict: MediaQueryListEventInit = definedExternally)
    open val media: String
    open val matches: Boolean

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface MediaQueryListEventInit : EventInit {
    var media: String?
    var matches: Boolean?
}

public fun MediaQueryListEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, media: String? = null, matches: Boolean? = null): MediaQueryListEventInit = newJsObject<MediaQueryListEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (media != null) this.media = media
    if (matches != null) this.matches = matches
}

public external abstract class Screen : JsAny {
    open val availWidth: Int
    open val availHeight: Int
    open val width: Int
    open val height: Int
    open val colorDepth: Int
    open val pixelDepth: Int
}

public external interface CaretPositionFromPointOptions : JsAny {
    var shadowRoots: JsArray<ShadowRoot>?
}

public fun CaretPositionFromPointOptions(shadowRoots: JsArray<ShadowRoot>? = null): CaretPositionFromPointOptions = newJsObject<CaretPositionFromPointOptions>().apply {
    if (shadowRoots != null) this.shadowRoots = shadowRoots
}

public external abstract class CaretPosition : JsAny {
    open val offsetNode: Node
    open val offset: Int
    open fun getClientRect(): DOMRect?
}

public external interface ScrollLogicalPosition : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ScrollLogicalPosition.Companion.START: ScrollLogicalPosition get() = "start".toJsString().unsafeCast<ScrollLogicalPosition>()
public inline val ScrollLogicalPosition.Companion.CENTER: ScrollLogicalPosition get() = "center".toJsString().unsafeCast<ScrollLogicalPosition>()
public inline val ScrollLogicalPosition.Companion.END: ScrollLogicalPosition get() = "end".toJsString().unsafeCast<ScrollLogicalPosition>()
public inline val ScrollLogicalPosition.Companion.NEAREST: ScrollLogicalPosition get() = "nearest".toJsString().unsafeCast<ScrollLogicalPosition>()

public external interface ScrollIntoViewOptions : ScrollOptions {
    var block: ScrollLogicalPosition?
    var inline: ScrollLogicalPosition?
    var container: ScrollIntoViewContainer?
}

public fun ScrollIntoViewOptions(behavior: ScrollBehavior? = null, block: ScrollLogicalPosition? = null, inline: ScrollLogicalPosition? = null, container: ScrollIntoViewContainer? = null): ScrollIntoViewOptions = newJsObject<ScrollIntoViewOptions>().apply {
    if (behavior != null) this.behavior = behavior
    if (block != null) this.block = block
    if (inline != null) this.inline = inline
    if (container != null) this.container = container
}

public external interface ScrollIntoViewContainer : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ScrollIntoViewContainer.Companion.ALL: ScrollIntoViewContainer get() = "all".toJsString().unsafeCast<ScrollIntoViewContainer>()
public inline val ScrollIntoViewContainer.Companion.NEAREST: ScrollIntoViewContainer get() = "nearest".toJsString().unsafeCast<ScrollIntoViewContainer>()

public external interface CheckVisibilityOptions : JsAny {
    var checkOpacity: Boolean?
    var checkVisibilityCSS: Boolean?
    var contentVisibilityAuto: Boolean?
    var opacityProperty: Boolean?
    var visibilityProperty: Boolean?
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
    companion object
}

public inline val CSSBoxType.Companion.MARGIN: CSSBoxType get() = "margin".toJsString().unsafeCast<CSSBoxType>()
public inline val CSSBoxType.Companion.BORDER: CSSBoxType get() = "border".toJsString().unsafeCast<CSSBoxType>()
public inline val CSSBoxType.Companion.PADDING: CSSBoxType get() = "padding".toJsString().unsafeCast<CSSBoxType>()
public inline val CSSBoxType.Companion.CONTENT: CSSBoxType get() = "content".toJsString().unsafeCast<CSSBoxType>()

public external interface BoxQuadOptions : JsAny {
    var box: CSSBoxType?
    var relativeTo: GeometryNode?
}

public fun BoxQuadOptions(box: CSSBoxType? = null, relativeTo: GeometryNode? = null): BoxQuadOptions = newJsObject<BoxQuadOptions>().apply {
    if (box != null) this.box = box
    if (relativeTo != null) this.relativeTo = relativeTo
}

public external interface ConvertCoordinateOptions : JsAny {
    var fromBox: CSSBoxType?
    var toBox: CSSBoxType?
}

public fun ConvertCoordinateOptions(fromBox: CSSBoxType? = null, toBox: CSSBoxType? = null): ConvertCoordinateOptions = newJsObject<ConvertCoordinateOptions>().apply {
    if (fromBox != null) this.fromBox = fromBox
    if (toBox != null) this.toBox = toBox
}

public external interface GeometryUtils : JsAny {
    fun getBoxQuads(options: BoxQuadOptions = definedExternally): JsArray<DOMQuad>
    fun convertQuadFromNode(quad: DOMQuadInit, from: GeometryNode, options: ConvertCoordinateOptions = definedExternally): DOMQuad
    fun convertRectFromNode(rect: DOMRectReadOnly, from: GeometryNode, options: ConvertCoordinateOptions = definedExternally): DOMQuad
    fun convertPointFromNode(point: DOMPointInit, from: GeometryNode, options: ConvertCoordinateOptions = definedExternally): DOMPoint
}

public external abstract class VisualViewport : EventTarget {
    open val offsetLeft: Double
    open val offsetTop: Double
    open val pageLeft: Double
    open val pageTop: Double
    open val width: Double
    open val height: Double
    open val scale: Double
    open var onresize: ((Event) -> Unit)?
    open var onscroll: ((Event) -> Unit)?
    open var onscrollend: ((Event) -> Unit)?
}
