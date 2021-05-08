/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.xhr

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.files.*

/**
 * Exposes the JavaScript [XMLHttpRequestEventTarget](https://developer.mozilla.org/en/docs/Web/API/XMLHttpRequestEventTarget) to Kotlin
 */
public external abstract class XMLHttpRequestEventTarget : EventTarget {
    open var onloadstart: ((ProgressEvent) -> dynamic)?
    open var onprogress: ((ProgressEvent) -> dynamic)?
    open var onabort: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
    open var onload: ((Event) -> dynamic)?
    open var ontimeout: ((Event) -> dynamic)?
    open var onloadend: ((Event) -> dynamic)?
}

public external abstract class XMLHttpRequestUpload : XMLHttpRequestEventTarget

/**
 * Exposes the JavaScript [XMLHttpRequest](https://developer.mozilla.org/en/docs/Web/API/XMLHttpRequest) to Kotlin
 */
public external abstract class XMLHttpRequest : XMLHttpRequestEventTarget {
    open var onreadystatechange: ((Event) -> dynamic)?
    open val readyState: Short
    open var timeout: Int
    open var withCredentials: Boolean
    open val upload: XMLHttpRequestUpload
    open val responseURL: String
    open val status: Short
    open val statusText: String
    open var responseType: XMLHttpRequestResponseType
    open val response: Any?
    open val responseText: String
    open val responseXML: Document?
    fun open(method: String, url: String): dynamic
    fun open(method: String, url: String, async: Boolean, username: String? = definedExternally, password: String? = definedExternally): dynamic
    fun setRequestHeader(name: String, value: String): dynamic
    fun send(body: dynamic = definedExternally): dynamic
    fun abort(): dynamic
    fun getResponseHeader(name: String): String?
    fun getAllResponseHeaders(): String
    fun overrideMimeType(mime: String): dynamic

    companion object {
        val UNSENT: Short
        val OPENED: Short
        val HEADERS_RECEIVED: Short
        val LOADING: Short
        val DONE: Short
    }
}

/**
 * Exposes the JavaScript [FormData](https://developer.mozilla.org/en/docs/Web/API/FormData) to Kotlin
 */
public external abstract class FormData {
    fun append(name: String, value: String): dynamic
    fun append(name: String, blobValue: Blob, filename: String = definedExternally): dynamic
    fun delete(name: String): dynamic
    fun get(name: String): dynamic
    fun getAll(name: String): Array<dynamic>
    fun has(name: String): Boolean
    fun set(name: String, value: String): dynamic
    fun set(name: String, blobValue: Blob, filename: String = definedExternally): dynamic
}

/**
 * Exposes the JavaScript [ProgressEvent](https://developer.mozilla.org/en/docs/Web/API/ProgressEvent) to Kotlin
 */
public external abstract class ProgressEvent : Event {
    open val lengthComputable: Boolean
    open val loaded: Number
    open val total: Number

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ProgressEventInit : EventInit {
    var lengthComputable: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var loaded: Number? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    var total: Number? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ProgressEventInit(lengthComputable: Boolean? = false, loaded: Number? = 0, total: Number? = 0, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ProgressEventInit {
    val o = js("({})")
    o["lengthComputable"] = lengthComputable
    o["loaded"] = loaded
    o["total"] = total
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface XMLHttpRequestResponseType {
    companion object
}

public inline val XMLHttpRequestResponseType.Companion.EMPTY: XMLHttpRequestResponseType get() = "".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

public inline val XMLHttpRequestResponseType.Companion.ARRAYBUFFER: XMLHttpRequestResponseType get() = "arraybuffer".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

public inline val XMLHttpRequestResponseType.Companion.BLOB: XMLHttpRequestResponseType get() = "blob".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

public inline val XMLHttpRequestResponseType.Companion.DOCUMENT: XMLHttpRequestResponseType get() = "document".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

public inline val XMLHttpRequestResponseType.Companion.JSON: XMLHttpRequestResponseType get() = "json".asDynamic().unsafeCast<XMLHttpRequestResponseType>()

public inline val XMLHttpRequestResponseType.Companion.TEXT: XMLHttpRequestResponseType get() = "text".asDynamic().unsafeCast<XMLHttpRequestResponseType>()