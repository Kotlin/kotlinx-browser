/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'xhr', DO NOT EDIT!

package org.w3c.xhr

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*
import org.w3c.files.*

public external abstract class XMLHttpRequestEventTarget : EventTarget {
    open var onloadstart: ((ProgressEvent) -> Unit)?
    open var onprogress: ((ProgressEvent) -> Unit)?
    open var onabort: ((ProgressEvent) -> Unit)?
    open var onerror: ((ProgressEvent) -> Unit)?
    open var onload: ((ProgressEvent) -> Unit)?
    open var ontimeout: ((ProgressEvent) -> Unit)?
    open var onloadend: ((ProgressEvent) -> Unit)?
}

public external abstract class XMLHttpRequestUpload : XMLHttpRequestEventTarget

public external interface XMLHttpRequestResponseType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val XMLHttpRequestResponseType.Companion.EMPTY: XMLHttpRequestResponseType get() = "".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.ARRAYBUFFER: XMLHttpRequestResponseType get() = "arraybuffer".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.BLOB: XMLHttpRequestResponseType get() = "blob".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.DOCUMENT: XMLHttpRequestResponseType get() = "document".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.JSON: XMLHttpRequestResponseType get() = "json".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.TEXT: XMLHttpRequestResponseType get() = "text".toJsString().unsafeCast<XMLHttpRequestResponseType>()

public external open class XMLHttpRequest : XMLHttpRequestEventTarget {
    constructor()
    open var onreadystatechange: ((Event) -> Unit)?
    open val readyState: Short
    open fun open(method: String, url: String)
    open fun open(method: String, url: String, async: Boolean, username: String? = definedExternally, password: String? = definedExternally)
    open fun setRequestHeader(name: String, value: String)
    open var timeout: Int
    open var withCredentials: Boolean
    open val upload: XMLHttpRequestUpload
    open fun send(body: Document?)
    open fun send(body: Blob?)
    open fun send(body: BufferDataSource?)
    open fun send(body: FormData?)
    open fun send(body: URLSearchParams?)
    open fun send(body: String?)
    open fun send()
    open fun abort()
    open val responseURL: String
    open val status: Short
    open val statusText: String
    open fun getResponseHeader(name: String): String?
    open fun getAllResponseHeaders(): String
    open fun overrideMimeType(mime: String)
    open var responseType: XMLHttpRequestResponseType
    open val response: JsAny?
    open val responseText: String
    open val responseXML: Document?

    companion object {
        val UNSENT: Short
        val OPENED: Short
        val HEADERS_RECEIVED: Short
        val LOADING: Short
        val DONE: Short
    }
}

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

public external open class ProgressEvent : Event {
    constructor(type: String, eventInitDict: ProgressEventInit = definedExternally)
    open val lengthComputable: Boolean
    open val loaded: Double
    open val total: Double

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ProgressEventInit : EventInit {
    var lengthComputable: Boolean?
    var loaded: Double?
    var total: Double?
}

public fun ProgressEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, lengthComputable: Boolean? = null, loaded: Double? = null, total: Double? = null): ProgressEventInit = newJsObject<ProgressEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (lengthComputable != null) this.lengthComputable = lengthComputable
    if (loaded != null) this.loaded = loaded
    if (total != null) this.total = total
}
