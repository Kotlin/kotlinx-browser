/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.fetch

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.files.*
import org.w3c.undefined
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Headers](https://developer.mozilla.org/en/docs/Web/API/Headers) to Kotlin
 */
public actual external open class Headers actual constructor(init: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */) : JsAny {
    actual fun append(name: String, value: String)
    actual fun delete(name: String)
    actual fun get(name: String): String?
    actual fun has(name: String): Boolean
    actual fun set(name: String, value: String)
}

/**
 * Exposes the JavaScript [Body](https://developer.mozilla.org/en/docs/Web/API/Body) to Kotlin
 */
public actual external interface Body : JsAny {
    actual val bodyUsed: Boolean
    actual fun arrayBuffer(): Promise<ArrayBuffer>
    actual fun blob(): Promise<Blob>
    actual fun formData(): Promise<FormData>
    actual fun json(): Promise<JsAny?>
    actual fun text(): Promise<JsString>
}

/**
 * Exposes the JavaScript [Request](https://developer.mozilla.org/en/docs/Web/API/Request) to Kotlin
 */
public actual external open class Request actual constructor(input: JsAny? /* Request|String */, init: RequestInit) : Body, JsAny {
    actual open val method: String
    actual open val url: String
    actual open val headers: Headers
    actual open val type: RequestType
    actual open val destination: RequestDestination
    actual open val referrer: String
    actual open val referrerPolicy: JsAny?
    actual open val mode: RequestMode
    actual open val credentials: RequestCredentials
    actual open val cache: RequestCache
    actual open val redirect: RequestRedirect
    actual open val integrity: String
    actual open val keepalive: Boolean
    actual override val bodyUsed: Boolean
    actual fun clone(): Request
    actual override fun arrayBuffer(): Promise<ArrayBuffer>
    actual override fun blob(): Promise<Blob>
    actual override fun formData(): Promise<FormData>
    actual override fun json(): Promise<JsAny?>
    actual override fun text(): Promise<JsString>
}

public actual external interface RequestInit : JsAny {
    actual var method: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */
        get() = definedExternally
        set(value) = definedExternally
    actual var body: JsAny? /* Blob|BufferSource|FormData|URLSearchParams|String */
        get() = definedExternally
        set(value) = definedExternally
    actual var referrer: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var referrerPolicy: JsAny?
        get() = definedExternally
        set(value) = definedExternally
    actual var mode: RequestMode?
        get() = definedExternally
        set(value) = definedExternally
    actual var credentials: RequestCredentials?
        get() = definedExternally
        set(value) = definedExternally
    actual var cache: RequestCache?
        get() = definedExternally
        set(value) = definedExternally
    actual var redirect: RequestRedirect?
        get() = definedExternally
        set(value) = definedExternally
    actual var integrity: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var keepalive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var window: JsAny?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun RequestInit(method: String?, headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */, body: JsAny? /* Blob|BufferSource|FormData|URLSearchParams|String */, referrer: String?, referrerPolicy: JsAny?, mode: RequestMode?, credentials: RequestCredentials?, cache: RequestCache?, redirect: RequestRedirect?, integrity: String?, keepalive: Boolean?, window: JsAny?): RequestInit = js("({ method: method, headers: headers, body: body, referrer: referrer, referrerPolicy: referrerPolicy, mode: mode, credentials: credentials, cache: cache, redirect: redirect, integrity: integrity, keepalive: keepalive, window: window })")

/**
 * Exposes the JavaScript [Response](https://developer.mozilla.org/en/docs/Web/API/Response) to Kotlin
 */
public actual external open class Response actual constructor(body: JsAny? /* JsAny?|ReadableStream */, init: ResponseInit) : Body, JsAny {
    actual open val type: ResponseType
    actual open val url: String
    actual open val redirected: Boolean
    actual open val status: Short
    actual open val ok: Boolean
    actual open val statusText: String
    actual open val headers: Headers
    actual open val body: JsAny?
    actual open val trailer: Promise<Headers>
    actual override val bodyUsed: Boolean
    actual fun clone(): Response
    actual override fun arrayBuffer(): Promise<ArrayBuffer>
    actual override fun blob(): Promise<Blob>
    actual override fun formData(): Promise<FormData>
    actual override fun json(): Promise<JsAny?>
    actual override fun text(): Promise<JsString>

    actual companion object {
        actual fun error(): Response
        actual fun redirect(url: String, status: Short): Response
    }
}

public actual external interface ResponseInit : JsAny {
    actual var status: Short? /* = 200 */
        get() = definedExternally
        set(value) = definedExternally
    actual var statusText: String? /* = "OK" */
        get() = definedExternally
        set(value) = definedExternally
    actual var headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ResponseInit(status: Short?, statusText: String?, headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */): ResponseInit = js("({ status: status, statusText: statusText, headers: headers })")

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface RequestType : JsAny {
    actual companion object
}

public actual inline val RequestType.Companion.EMPTY: RequestType get() = "".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.AUDIO: RequestType get() = "audio".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.FONT: RequestType get() = "font".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.IMAGE: RequestType get() = "image".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.SCRIPT: RequestType get() = "script".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.STYLE: RequestType get() = "style".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.TRACK: RequestType get() = "track".toJsString().unsafeCast<RequestType>()

public actual inline val RequestType.Companion.VIDEO: RequestType get() = "video".toJsString().unsafeCast<RequestType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface RequestDestination : JsAny {
    actual companion object
}

public actual inline val RequestDestination.Companion.EMPTY: RequestDestination get() = "".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.DOCUMENT: RequestDestination get() = "document".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.EMBED: RequestDestination get() = "embed".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.FONT: RequestDestination get() = "font".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.IMAGE: RequestDestination get() = "image".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.MANIFEST: RequestDestination get() = "manifest".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.MEDIA: RequestDestination get() = "media".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.OBJECT: RequestDestination get() = "object".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.REPORT: RequestDestination get() = "report".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.SCRIPT: RequestDestination get() = "script".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.SERVICEWORKER: RequestDestination get() = "serviceworker".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.SHAREDWORKER: RequestDestination get() = "sharedworker".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.STYLE: RequestDestination get() = "style".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.WORKER: RequestDestination get() = "worker".toJsString().unsafeCast<RequestDestination>()

public actual inline val RequestDestination.Companion.XSLT: RequestDestination get() = "xslt".toJsString().unsafeCast<RequestDestination>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface RequestMode : JsAny {
    actual companion object
}

public actual inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".toJsString().unsafeCast<RequestMode>()

public actual inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".toJsString().unsafeCast<RequestMode>()

public actual inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".toJsString().unsafeCast<RequestMode>()

public actual inline val RequestMode.Companion.CORS: RequestMode get() = "cors".toJsString().unsafeCast<RequestMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface RequestCredentials : JsAny {
    actual companion object
}

public actual inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".toJsString().unsafeCast<RequestCredentials>()

public actual inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".toJsString().unsafeCast<RequestCredentials>()

public actual inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".toJsString().unsafeCast<RequestCredentials>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface RequestCache : JsAny {
    actual companion object
}

public actual inline val RequestCache.Companion.DEFAULT: RequestCache get() = "default".toJsString().unsafeCast<RequestCache>()

public actual inline val RequestCache.Companion.NO_STORE: RequestCache get() = "no-store".toJsString().unsafeCast<RequestCache>()

public actual inline val RequestCache.Companion.RELOAD: RequestCache get() = "reload".toJsString().unsafeCast<RequestCache>()

public actual inline val RequestCache.Companion.NO_CACHE: RequestCache get() = "no-cache".toJsString().unsafeCast<RequestCache>()

public actual inline val RequestCache.Companion.FORCE_CACHE: RequestCache get() = "force-cache".toJsString().unsafeCast<RequestCache>()

public actual inline val RequestCache.Companion.ONLY_IF_CACHED: RequestCache get() = "only-if-cached".toJsString().unsafeCast<RequestCache>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface RequestRedirect : JsAny {
    actual companion object
}

public actual inline val RequestRedirect.Companion.FOLLOW: RequestRedirect get() = "follow".toJsString().unsafeCast<RequestRedirect>()

public actual inline val RequestRedirect.Companion.ERROR: RequestRedirect get() = "error".toJsString().unsafeCast<RequestRedirect>()

public actual inline val RequestRedirect.Companion.MANUAL: RequestRedirect get() = "manual".toJsString().unsafeCast<RequestRedirect>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ResponseType : JsAny {
    actual companion object
}

public actual inline val ResponseType.Companion.BASIC: ResponseType get() = "basic".toJsString().unsafeCast<ResponseType>()

public actual inline val ResponseType.Companion.CORS: ResponseType get() = "cors".toJsString().unsafeCast<ResponseType>()

public actual inline val ResponseType.Companion.DEFAULT: ResponseType get() = "default".toJsString().unsafeCast<ResponseType>()

public actual inline val ResponseType.Companion.ERROR: ResponseType get() = "error".toJsString().unsafeCast<ResponseType>()

public actual inline val ResponseType.Companion.OPAQUE: ResponseType get() = "opaque".toJsString().unsafeCast<ResponseType>()

public actual inline val ResponseType.Companion.OPAQUEREDIRECT: ResponseType get() = "opaqueredirect".toJsString().unsafeCast<ResponseType>()