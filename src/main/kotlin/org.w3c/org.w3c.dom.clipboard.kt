/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.dom.clipboard

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.files.*

public external interface ClipboardEventInit : EventInit {
    var clipboardData: DataTransfer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ClipboardEventInit(clipboardData: DataTransfer? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ClipboardEventInit {
    val o = js("({})")
    o["clipboardData"] = clipboardData
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [ClipboardEvent](https://developer.mozilla.org/en/docs/Web/API/ClipboardEvent) to Kotlin
 */
public external abstract class ClipboardEvent : Event {
    open val clipboardData: DataTransfer?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

/**
 * Exposes the JavaScript [Clipboard](https://developer.mozilla.org/en/docs/Web/API/Clipboard) to Kotlin
 */
public external abstract class Clipboard : EventTarget {
    fun read(): Promise<Array<ClipboardItem>>
    fun readText(): Promise<String>
    fun write(data: Array<ClipboardItem>): Promise<dynamic>
    fun writeText(data: String): Promise<dynamic>
}

public external abstract class ClipboardItem {
    open val presentationStyle: PresentationStyle
    open val lastModified: Int
    open val delayed: Boolean
    open val types: Array<out String>
    fun getType(type: String): Promise<Blob>

    companion object {
        fun createDelayed(items: dynamic, options: ClipboardItemOptions = definedExternally): ClipboardItem
    }
}

public external interface ClipboardItemOptions {
    var presentationStyle: PresentationStyle? /* = PresentationStyle.UNSPECIFIED */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ClipboardItemOptions(presentationStyle: PresentationStyle? = PresentationStyle.UNSPECIFIED): ClipboardItemOptions {
    val o = js("({})")
    o["presentationStyle"] = presentationStyle
    return o
}

public external interface ClipboardPermissionDescriptor {
    var allowWithoutGesture: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ClipboardPermissionDescriptor(allowWithoutGesture: Boolean? = false): ClipboardPermissionDescriptor {
    val o = js("({})")
    o["allowWithoutGesture"] = allowWithoutGesture
    return o
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface PresentationStyle {
    companion object
}

public inline val PresentationStyle.Companion.UNSPECIFIED: PresentationStyle get() = "unspecified".asDynamic().unsafeCast<PresentationStyle>()

public inline val PresentationStyle.Companion.INLINE: PresentationStyle get() = "inline".asDynamic().unsafeCast<PresentationStyle>()

public inline val PresentationStyle.Companion.ATTACHMENT: PresentationStyle get() = "attachment".asDynamic().unsafeCast<PresentationStyle>()