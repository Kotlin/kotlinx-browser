/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.xhr

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.url.*
import org.w3c.files.*
import org.w3c.undefined

/**
 * Exposes the JavaScript [XMLHttpRequestEventTarget](https://developer.mozilla.org/en/docs/Web/API/XMLHttpRequestEventTarget) to Kotlin
 */
public actual external abstract class XMLHttpRequestEventTarget : EventTarget, JsAny {
    actual open var onloadstart: ((ProgressEvent) -> Unit)?
    actual open var onprogress: ((ProgressEvent) -> Unit)?
    actual open var onabort: ((Event) -> Unit)?
    actual open var onerror: ((Event) -> Unit)?
    actual open var onload: ((Event) -> Unit)?
    actual open var ontimeout: ((Event) -> Unit)?
    actual open var onloadend: ((Event) -> Unit)?
}

public actual external abstract class XMLHttpRequestUpload : XMLHttpRequestEventTarget, JsAny

/**
 * Exposes the JavaScript [XMLHttpRequest](https://developer.mozilla.org/en/docs/Web/API/XMLHttpRequest) to Kotlin
 */
public actual external open class XMLHttpRequest actual constructor() : XMLHttpRequestEventTarget, JsAny {
    actual var onreadystatechange: ((Event) -> Unit)?
    actual open val readyState: Short
    actual var timeout: Int
    actual var withCredentials: Boolean
    actual open val upload: XMLHttpRequestUpload
    actual open val responseURL: String
    actual open val status: Short
    actual open val statusText: String
    actual var responseType: XMLHttpRequestResponseType
    actual open val response: JsAny?
    actual open val responseText: String
    actual open val responseXML: Document?
    actual fun open(method: String, url: String)
    actual fun open(method: String, url: String, async: Boolean, username: String?, password: String?)
    actual fun setRequestHeader(name: String, value: String)
    actual fun send(body: Document)
    actual fun send(body: Blob)
    actual fun send(body: FormData)
    actual fun send(body: URLSearchParams)
    actual fun send(body: String)
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
public actual external open class FormData actual constructor(form: HTMLFormElement) : JsAny {
    actual fun append(name: String, value: String)
    actual fun append(name: String, value: Blob, filename: String)
    actual fun delete(name: String)
    actual fun get(name: String): JsAny? /* File|String */
    actual fun getAll(name: String): JsArray<JsAny? /* File|String */>
    actual fun has(name: String): Boolean
    actual fun set(name: String, value: String)
    actual fun set(name: String, value: Blob, filename: String)
}

/**
 * Exposes the JavaScript [ProgressEvent](https://developer.mozilla.org/en/docs/Web/API/ProgressEvent) to Kotlin
 */
public actual external open class ProgressEvent actual constructor(type: String, eventInitDict: ProgressEventInit) : Event, JsAny {
    actual open val lengthComputable: Boolean
    actual open val loaded: JsNumber
    actual open val total: JsNumber

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface ProgressEventInit : EventInit, JsAny {
    actual var lengthComputable: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var loaded: JsNumber? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    actual var total: JsNumber? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ProgressEventInit(lengthComputable: Boolean?, loaded: JsNumber?, total: JsNumber?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ProgressEventInit = js("({ lengthComputable: lengthComputable, loaded: loaded, total: total, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface XMLHttpRequestResponseType : JsAny {
    actual companion object
}

public actual inline val XMLHttpRequestResponseType.Companion.EMPTY: XMLHttpRequestResponseType get() = "".toJsString().unsafeCast<XMLHttpRequestResponseType>()

public actual inline val XMLHttpRequestResponseType.Companion.ARRAYBUFFER: XMLHttpRequestResponseType get() = "arraybuffer".toJsString().unsafeCast<XMLHttpRequestResponseType>()

public actual inline val XMLHttpRequestResponseType.Companion.BLOB: XMLHttpRequestResponseType get() = "blob".toJsString().unsafeCast<XMLHttpRequestResponseType>()

public actual inline val XMLHttpRequestResponseType.Companion.DOCUMENT: XMLHttpRequestResponseType get() = "document".toJsString().unsafeCast<XMLHttpRequestResponseType>()

public actual inline val XMLHttpRequestResponseType.Companion.JSON: XMLHttpRequestResponseType get() = "json".toJsString().unsafeCast<XMLHttpRequestResponseType>()

public actual inline val XMLHttpRequestResponseType.Companion.TEXT: XMLHttpRequestResponseType get() = "text".toJsString().unsafeCast<XMLHttpRequestResponseType>()