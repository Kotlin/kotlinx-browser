/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.xhr

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.files.*

/**
 * Exposes the JavaScript [XMLHttpRequestEventTarget](https://developer.mozilla.org/en/docs/Web/API/XMLHttpRequestEventTarget) to Kotlin
 */
actual external abstract class XMLHttpRequestEventTarget : EventTarget {
    actual open var onloadstart: ((ProgressEvent) -> dynamic)?
    actual open var onprogress: ((ProgressEvent) -> dynamic)?
    actual open var onabort: ((Event) -> dynamic)?
    actual open var onerror: ((Event) -> dynamic)?
    actual open var onload: ((Event) -> dynamic)?
    actual open var ontimeout: ((Event) -> dynamic)?
    actual open var onloadend: ((Event) -> dynamic)?
}

actual external abstract class XMLHttpRequestUpload : XMLHttpRequestEventTarget

/**
 * Exposes the JavaScript [XMLHttpRequest](https://developer.mozilla.org/en/docs/Web/API/XMLHttpRequest) to Kotlin
 */
actual external open class XMLHttpRequest actual constructor() : XMLHttpRequestEventTarget {
    actual var onreadystatechange: ((Event) -> dynamic)?
    actual open val readyState: Short
    actual var timeout: Int
    actual var withCredentials: Boolean
    actual open val upload: XMLHttpRequestUpload
    actual open val responseURL: String
    actual open val status: Short
    actual open val statusText: String
    actual var responseType: XMLHttpRequestResponseType
    actual open val response: Any?
    actual open val responseText: String
    actual open val responseXML: Document?
    actual fun open(method: String, url: String)
    actual fun open(method: String, url: String, async: Boolean, username: String?, password: String?)
    actual fun setRequestHeader(name: String, value: String)
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun send(body: dynamic)
    actual fun send()
    actual fun abort()
    actual fun getResponseHeader(name: String): String?
    actual fun getAllResponseHeaders(): String
    actual fun overrideMimeType(mime: String)

    actual companion object {
        actual val UNSENT: Short
        actual val OPENED: Short
        actual val HEADERS_RECEIVED: Short
        actual val LOADING: Short
        actual val DONE: Short
    }
}

/**
 * Exposes the JavaScript [FormData](https://developer.mozilla.org/en/docs/Web/API/FormData) to Kotlin
 */
actual external open class FormData actual constructor(form: HTMLFormElement) {
    actual fun append(name: String, value: String)
    actual fun append(name: String, value: Blob, filename: String)
    actual fun delete(name: String)
    actual fun get(name: String): dynamic
    actual fun getAll(name: String): Array<dynamic>
    actual fun has(name: String): Boolean
    actual fun set(name: String, value: String)
    actual fun set(name: String, value: Blob, filename: String)
}

/**
 * Exposes the JavaScript [ProgressEvent](https://developer.mozilla.org/en/docs/Web/API/ProgressEvent) to Kotlin
 */
actual external open class ProgressEvent actual constructor(type: String, eventInitDict: ProgressEventInit) : Event {
    actual open val lengthComputable: Boolean
    actual open val loaded: Number
    actual open val total: Number

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ProgressEventInit : EventInit {
    actual var lengthComputable: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var loaded: Number? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var total: Number? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ProgressEventInit(lengthComputable: Boolean?, loaded: Number?, total: Number?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ProgressEventInit {
    val o = js("({})")
    o["lengthComputable"] = lengthComputable
    o["loaded"] = loaded
    o["total"] = total
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as ProgressEventInit
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface XMLHttpRequestResponseType {
    actual companion object
}

actual inline val XMLHttpRequestResponseType.Companion.EMPTY: XMLHttpRequestResponseType get() = "".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

actual inline val XMLHttpRequestResponseType.Companion.ARRAYBUFFER: XMLHttpRequestResponseType get() = "arraybuffer".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

actual inline val XMLHttpRequestResponseType.Companion.BLOB: XMLHttpRequestResponseType get() = "blob".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

actual inline val XMLHttpRequestResponseType.Companion.DOCUMENT: XMLHttpRequestResponseType get() = "document".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

actual inline val XMLHttpRequestResponseType.Companion.JSON: XMLHttpRequestResponseType get() = "json".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

actual inline val XMLHttpRequestResponseType.Companion.TEXT: XMLHttpRequestResponseType get() = "text".asDynamic().unsafeCast<XMLHttpRequestResponseType>()