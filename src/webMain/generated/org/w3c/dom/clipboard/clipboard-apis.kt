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
    public var clipboardData: DataTransfer?
}

public fun ClipboardEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, clipboardData: DataTransfer? = null): ClipboardEventInit = newJsObject<ClipboardEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (clipboardData != null) this.clipboardData = clipboardData
}

/**
 * The ClipboardEvent interface of the Clipboard API represents events providing information related to modification of
 * the clipboard, that is cut, copy, and paste events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent)
 */
public open external class ClipboardEvent : Event {
    /**
     * The ClipboardEvent() constructor returns a new ClipboardEvent, representing an event providing information
     * related to modification of the clipboard, that is cut, copy, and paste events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/ClipboardEvent)
     */
    public constructor(type: String, eventInitDict: ClipboardEventInit = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardEvent/clipboardData)
     */
    public open val clipboardData: DataTransfer?

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface ClipboardChangeEventInit : EventInit {
    public var types: JsArray<JsString>?
    public var changeId: JsBigInt?
}

public fun ClipboardChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, types: JsArray<JsString>? = null, changeId: JsBigInt? = null): ClipboardChangeEventInit = newJsObject<ClipboardChangeEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (types != null) this.types = types
    if (changeId != null) this.changeId = changeId
}

/**
 * The ClipboardChangeEvent interface of the Clipboard API represents events fired whenever the contents of the system
 * clipboard are changed.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent)
 */
public open external class ClipboardChangeEvent : Event {
    /**
     * The ClipboardChangeEvent() constructor creates a new ClipboardChangeEvent object instance when a clipboardchange
     * event occurs. The clipboardchange event fires whenever the system clipboard contents are changed either by a web
     * app or any other system application.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent/ClipboardChangeEvent)
     */
    public constructor(type: String, eventInitDict: ClipboardChangeEventInit = definedExternally)

    /**
     * The types read-only property of the ClipboardChangeEvent interface returns an array of strings representing the
     * mandatory MIME types available on the system clipboard when the ClipboardChangeEvent event was fired. Optional
     * types and custom formats are not included to limit fingerprinting.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent/types)
     */
    public open val types: JsArray<JsString>

    /**
     * The changeId read-only property of the ClipboardChangeEvent interface returns an integer representing a unique
     * identifier for this specific clipboard change operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardChangeEvent/changeId)
     */
    public open val changeId: JsBigInt

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

/**
 * The ClipboardItem interface of the Clipboard API represents a single item of data copied to, or read from, the
 * clipboard, used with Clipboard.write() and Clipboard.read() respectively.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem)
 */
public open external class ClipboardItem : JsAny {
    /**
     * The ClipboardItem() constructor creates a new ClipboardItem object, which represents data to be stored or
     * retrieved via the Clipboard API clipboard.write() and clipboard.read() methods, respectively.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/ClipboardItem)
     */
    public constructor(items: JsAny, options: ClipboardItemOptions = definedExternally)

    /**
     * The read-only presentationStyle property of the ClipboardItem interface returns a string indicating how an item
     * should be presented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/presentationStyle)
     */
    public open val presentationStyle: PresentationStyle

    /**
     * The read-only types property of the ClipboardItem interface returns an Array of MIME types available within the
     * ClipboardItem.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/types)
     */
    public open val types: JsArray<JsString>

    /**
     * The getType() method of the ClipboardItem interface returns a Promise that resolves with a Blob of the requested
     * MIME type or an error if the MIME type is not found.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/getType)
     */
    public open fun getType(type: String): Promise<Blob>

    public companion object {
        /**
         * The supports() static method of the ClipboardItem interface returns true if the given MIME type is supported
         * by the clipboard, and false otherwise.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ClipboardItem/supports_static)
         */
        public fun supports(type: String): Boolean
    }
}

public external interface PresentationStyle : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val PresentationStyle.Companion.UNSPECIFIED: PresentationStyle get() = "unspecified".toJsString().unsafeCast<PresentationStyle>()
public inline val PresentationStyle.Companion.INLINE: PresentationStyle get() = "inline".toJsString().unsafeCast<PresentationStyle>()
public inline val PresentationStyle.Companion.ATTACHMENT: PresentationStyle get() = "attachment".toJsString().unsafeCast<PresentationStyle>()

public external interface ClipboardItemOptions : JsAny {
    public var presentationStyle: PresentationStyle?
}

public fun ClipboardItemOptions(presentationStyle: PresentationStyle? = null): ClipboardItemOptions = newJsObject<ClipboardItemOptions>().apply {
    if (presentationStyle != null) this.presentationStyle = presentationStyle
}

/**
 * The Clipboard interface of the Clipboard API provides read and write access to the contents of the system clipboard.
 * This allows a web application to implement cut, copy, and paste features.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard)
 */
public abstract external class Clipboard : EventTarget {
    /**
     * The read() method of the Clipboard interface returns a Promise that fulfills with a copy of the clipboard's
     * contents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/read)
     */
    public open fun read(formats: ClipboardUnsanitizedFormats = definedExternally): Promise<JsArray<ClipboardItem>>

    /**
     * The readText() method of the Clipboard interface returns a Promise which fulfills with a copy of the textual
     * contents of the system clipboard.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/readText)
     */
    public open fun readText(): Promise<JsString>

    /**
     * The write() method of the Clipboard interface is used to write data such as images, text, and custom types, to
     * the system clipboard.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/write)
     */
    public open fun write(data: JsArray<ClipboardItem>): Promise<JsAny?>

    /**
     * The writeText() method of the Clipboard interface writes the specified text to the system clipboard, returning a
     * Promise that is resolved once the system clipboard has been updated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clipboard/writeText)
     */
    public open fun writeText(data: String): Promise<JsAny?>
}

public external interface ClipboardUnsanitizedFormats : JsAny {
    public var unsanitized: JsArray<JsString>?
}

public fun ClipboardUnsanitizedFormats(unsanitized: JsArray<JsString>? = null): ClipboardUnsanitizedFormats = newJsObject<ClipboardUnsanitizedFormats>().apply {
    if (unsanitized != null) this.unsanitized = unsanitized
}
