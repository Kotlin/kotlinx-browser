/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'clipboard-apis', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.clipboard

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.files.*

public external interface ClipboardEventInit : EventInit {
    var clipboardData: DataTransfer?
}

public fun ClipboardEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, clipboardData: DataTransfer? = null): ClipboardEventInit = newJsObject<ClipboardEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (clipboardData != null) this.clipboardData = clipboardData
}

public external open class ClipboardEvent : Event {
    constructor(type: String, eventInitDict: ClipboardEventInit = definedExternally)
    open val clipboardData: DataTransfer?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ClipboardChangeEventInit : EventInit {
    var types: JsArray<JsString>?
    var changeId: JsBigInt?
}

public fun ClipboardChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, types: JsArray<JsString>? = null, changeId: JsBigInt? = null): ClipboardChangeEventInit = newJsObject<ClipboardChangeEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (types != null) this.types = types
    if (changeId != null) this.changeId = changeId
}

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

public external open class ClipboardItem : JsAny {
    constructor(items: JsAny, options: ClipboardItemOptions = definedExternally)
    open val presentationStyle: PresentationStyle
    open val types: JsArray<JsString>
    open fun getType(type: String): Promise<Blob>

    companion object {
        fun supports(type: String): Boolean
    }
}

public external interface PresentationStyle : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val PresentationStyle.Companion.UNSPECIFIED: PresentationStyle get() = "unspecified".toJsString().unsafeCast<PresentationStyle>()
public inline val PresentationStyle.Companion.INLINE: PresentationStyle get() = "inline".toJsString().unsafeCast<PresentationStyle>()
public inline val PresentationStyle.Companion.ATTACHMENT: PresentationStyle get() = "attachment".toJsString().unsafeCast<PresentationStyle>()

public external interface ClipboardItemOptions : JsAny {
    var presentationStyle: PresentationStyle?
}

public fun ClipboardItemOptions(presentationStyle: PresentationStyle? = null): ClipboardItemOptions = newJsObject<ClipboardItemOptions>().apply {
    if (presentationStyle != null) this.presentationStyle = presentationStyle
}

public external abstract class Clipboard : EventTarget {
    open fun read(formats: ClipboardUnsanitizedFormats = definedExternally): Promise<JsArray<ClipboardItem>>
    open fun readText(): Promise<JsString>
    open fun write(data: JsArray<ClipboardItem>): Promise<JsAny?>
    open fun writeText(data: String): Promise<JsAny?>
}

public external interface ClipboardUnsanitizedFormats : JsAny {
    var unsanitized: JsArray<JsString>?
}

public fun ClipboardUnsanitizedFormats(unsanitized: JsArray<JsString>? = null): ClipboardUnsanitizedFormats = newJsObject<ClipboardUnsanitizedFormats>().apply {
    if (unsanitized != null) this.unsanitized = unsanitized
}
