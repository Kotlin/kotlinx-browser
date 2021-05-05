/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.css.fontloading

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*

public external interface FontFaceDescriptors {
    var style: String? /* = "normal" */
        get() = definedExternally
        set(value) = definedExternally
    var weight: String? /* = "normal" */
        get() = definedExternally
        set(value) = definedExternally
    var stretch: String? /* = "normal" */
        get() = definedExternally
        set(value) = definedExternally
    var unicodeRange: String? /* = "U+0-10FFFF" */
        get() = definedExternally
        set(value) = definedExternally
    var variant: String? /* = "normal" */
        get() = definedExternally
        set(value) = definedExternally
    var featureSettings: String? /* = "normal" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun FontFaceDescriptors(style: String? = "normal", weight: String? = "normal", stretch: String? = "normal", unicodeRange: String? = "U+0-10FFFF", variant: String? = "normal", featureSettings: String? = "normal"): FontFaceDescriptors {
    val o = js("({})")
    o["style"] = style
    o["weight"] = weight
    o["stretch"] = stretch
    o["unicodeRange"] = unicodeRange
    o["variant"] = variant
    o["featureSettings"] = featureSettings
    return o
}

public external open class FontFace(family: String, source: dynamic, descriptors: FontFaceDescriptors) {
    var family: String
    var style: String
    var weight: String
    var stretch: String
    var unicodeRange: String
    var variant: String
    var featureSettings: String
    open val status: FontFaceLoadStatus
    var loaded: Promise<Boolean>
    fun load(): Promise<FontFace>
}

public external interface CSSFontFaceLoadEventInit : EventInit {
    var fontfaces: Array<dynamic>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun CSSFontFaceLoadEventInit(fontfaces: Array<dynamic>? = arrayOf(), bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): CSSFontFaceLoadEventInit {
    val o = js("({})")
    o["fontfaces"] = fontfaces
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

public external open class CSSFontFaceLoadEvent(type: String, eventInitDict: CSSFontFaceLoadEventInit = definedExternally) : Event {
    open val fontfaces: Array<dynamic>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external abstract class FontFaceSet : EventTarget {
    open var onloading: ((Event) -> dynamic)?
    open var onloadingdone: ((Event) -> dynamic)?
    open var onloadingerror: ((Event) -> dynamic)?
    open val status: FontFaceLoadStatus
    fun load(font: String, text: String = definedExternally): Promise<Array<FontFace>>
    fun check(font: String, text: String = definedExternally): Boolean
    fun ready(): Promise<FontFaceSet>
}

public external interface FontFaceSource {
    val fonts: FontFaceSet
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface FontFaceLoadStatus {
    companion object
}

public inline val FontFaceLoadStatus.Companion.UNLOADED: FontFaceLoadStatus get() = "unloaded".asDynamic().unsafeCast<FontFaceLoadStatus>()

public inline val FontFaceLoadStatus.Companion.LOADING: FontFaceLoadStatus get() = "loading".asDynamic().unsafeCast<FontFaceLoadStatus>()

public inline val FontFaceLoadStatus.Companion.LOADED: FontFaceLoadStatus get() = "loaded".asDynamic().unsafeCast<FontFaceLoadStatus>()

public inline val FontFaceLoadStatus.Companion.ERROR: FontFaceLoadStatus get() = "error".asDynamic().unsafeCast<FontFaceLoadStatus>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface FontFaceSetLoadStatus {
    companion object
}

public inline val FontFaceSetLoadStatus.Companion.LOADING: FontFaceSetLoadStatus get() = "loading".asDynamic().unsafeCast<FontFaceSetLoadStatus>()

public inline val FontFaceSetLoadStatus.Companion.LOADED: FontFaceSetLoadStatus get() = "loaded".asDynamic().unsafeCast<FontFaceSetLoadStatus>()