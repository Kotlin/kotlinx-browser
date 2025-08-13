/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.fetch

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.files.*
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Headers](https://developer.mozilla.org/en/docs/Web/API/Headers) to Kotlin
 */
actual external open class Headers actual constructor(init: dynamic) {
    actual fun append(name: String, value: String)
    actual fun delete(name: String)
    actual fun get(name: String): String?
    actual fun has(name: String): Boolean
    actual fun set(name: String, value: String)
}

/**
 * Exposes the JavaScript [Body](https://developer.mozilla.org/en/docs/Web/API/Body) to Kotlin
 */
actual external interface Body {
    actual val bodyUsed: Boolean
    actual fun arrayBuffer(): Promise<ArrayBuffer>
    actual fun blob(): Promise<Blob>
    actual fun formData(): Promise<FormData>
    actual fun json(): Promise<Any?>
    actual fun text(): Promise<String>
}

/**
 * Exposes the JavaScript [Request](https://developer.mozilla.org/en/docs/Web/API/Request) to Kotlin
 */
actual external open class Request actual constructor(input: dynamic, init: RequestInit) : Body {
    actual open val method: String
    actual open val url: String
    actual open val headers: Headers
    actual open val type: RequestType
    actual open val destination: RequestDestination
    actual open val referrer: String
    actual open val referrerPolicy: dynamic
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
    actual override fun json(): Promise<Any?>
    actual override fun text(): Promise<String>
}

actual external interface RequestInit {
    actual var method: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var headers: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var body: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var referrer: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var referrerPolicy: dynamic
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
    actual var window: Any?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun RequestInit(method: String?, headers: dynamic, body: dynamic, referrer: String?, referrerPolicy: dynamic, mode: RequestMode?, credentials: RequestCredentials?, cache: RequestCache?, redirect: RequestRedirect?, integrity: String?, keepalive: Boolean?, window: Any?): RequestInit {
    val o = js("({})")
    o["method"] = method
    o["headers"] = headers
    o["body"] = body
    o["referrer"] = referrer
    o["referrerPolicy"] = referrerPolicy
    o["mode"] = mode
    o["credentials"] = credentials
    o["cache"] = cache
    o["redirect"] = redirect
    o["integrity"] = integrity
    o["keepalive"] = keepalive
    o["window"] = window
    return o as RequestInit
}

/**
 * Exposes the JavaScript [Response](https://developer.mozilla.org/en/docs/Web/API/Response) to Kotlin
 */
actual external open class Response actual constructor(body: dynamic, init: ResponseInit) : Body {
    actual open val type: ResponseType
    actual open val url: String
    actual open val redirected: Boolean
    actual open val status: Short
    actual open val ok: Boolean
    actual open val statusText: String
    actual open val headers: Headers
    actual open val body: dynamic
    actual open val trailer: Promise<Headers>
    actual override val bodyUsed: Boolean
    actual fun clone(): Response
    actual override fun arrayBuffer(): Promise<ArrayBuffer>
    actual override fun blob(): Promise<Blob>
    actual override fun formData(): Promise<FormData>
    actual override fun json(): Promise<Any?>
    actual override fun text(): Promise<String>

    actual companion object {
        actual fun error(): Response
        actual fun redirect(url: String, status: Short): Response
    }
}

actual external interface ResponseInit {
    actual var status: Short? /* = 200 */
        get() = definedExternally
        set(value) = definedExternally
    actual var statusText: String? /* = "OK" */
        get() = definedExternally
        set(value) = definedExternally
    actual var headers: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ResponseInit(status: Short?, statusText: String?, headers: dynamic): ResponseInit {
    val o = js("({})")
    o["status"] = status
    o["statusText"] = statusText
    o["headers"] = headers
    return o as ResponseInit
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface RequestType {
    actual companion object
}

actual inline val RequestType.Companion.EMPTY: RequestType get() = "".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.AUDIO: RequestType get() = "audio".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.FONT: RequestType get() = "font".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.IMAGE: RequestType get() = "image".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.SCRIPT: RequestType get() = "script".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.STYLE: RequestType get() = "style".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.TRACK: RequestType get() = "track".asDynamic().unsafeCast<RequestType>()

actual inline val RequestType.Companion.VIDEO: RequestType get() = "video".asDynamic().unsafeCast<RequestType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface RequestDestination {
    actual companion object
}

actual inline val RequestDestination.Companion.EMPTY: RequestDestination get() = "".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.DOCUMENT: RequestDestination get() = "document".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.EMBED: RequestDestination get() = "embed".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.FONT: RequestDestination get() = "font".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.IMAGE: RequestDestination get() = "image".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.MANIFEST: RequestDestination get() = "manifest".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.MEDIA: RequestDestination get() = "media".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.OBJECT: RequestDestination get() = "object".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.REPORT: RequestDestination get() = "report".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.SCRIPT: RequestDestination get() = "script".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.SERVICEWORKER: RequestDestination get() = "serviceworker".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.SHAREDWORKER: RequestDestination get() = "sharedworker".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.STYLE: RequestDestination get() = "style".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.WORKER: RequestDestination get() = "worker".asDynamic().unsafeCast<RequestDestination>()

actual inline val RequestDestination.Companion.XSLT: RequestDestination get() = "xslt".asDynamic().unsafeCast<RequestDestination>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface RequestMode {
    actual companion object
}

actual inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".asDynamic().unsafeCast<RequestMode>()

actual inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".asDynamic().unsafeCast<RequestMode>()

actual inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".asDynamic().unsafeCast<RequestMode>()

actual inline val RequestMode.Companion.CORS: RequestMode get() = "cors".asDynamic().unsafeCast<RequestMode>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface RequestCredentials {
    actual companion object
}

actual inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".asDynamic().unsafeCast<RequestCredentials>()

actual inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".asDynamic().unsafeCast<RequestCredentials>()

actual inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".asDynamic().unsafeCast<RequestCredentials>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface RequestCache {
    actual companion object
}

actual inline val RequestCache.Companion.DEFAULT: RequestCache get() = "default".asDynamic().unsafeCast<RequestCache>()

actual inline val RequestCache.Companion.NO_STORE: RequestCache get() = "no-store".asDynamic().unsafeCast<RequestCache>()

actual inline val RequestCache.Companion.RELOAD: RequestCache get() = "reload".asDynamic().unsafeCast<RequestCache>()

actual inline val RequestCache.Companion.NO_CACHE: RequestCache get() = "no-cache".asDynamic().unsafeCast<RequestCache>()

actual inline val RequestCache.Companion.FORCE_CACHE: RequestCache get() = "force-cache".asDynamic().unsafeCast<RequestCache>()

actual inline val RequestCache.Companion.ONLY_IF_CACHED: RequestCache get() = "only-if-cached".asDynamic().unsafeCast<RequestCache>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface RequestRedirect {
    actual companion object
}

actual inline val RequestRedirect.Companion.FOLLOW: RequestRedirect get() = "follow".asDynamic().unsafeCast<RequestRedirect>()

actual inline val RequestRedirect.Companion.ERROR: RequestRedirect get() = "error".asDynamic().unsafeCast<RequestRedirect>()

actual inline val RequestRedirect.Companion.MANUAL: RequestRedirect get() = "manual".asDynamic().unsafeCast<RequestRedirect>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ResponseType {
    actual companion object
}

actual inline val ResponseType.Companion.BASIC: ResponseType get() = "basic".asDynamic().unsafeCast<ResponseType>()

actual inline val ResponseType.Companion.CORS: ResponseType get() = "cors".asDynamic().unsafeCast<ResponseType>()

actual inline val ResponseType.Companion.DEFAULT: ResponseType get() = "default".asDynamic().unsafeCast<ResponseType>()

actual inline val ResponseType.Companion.ERROR: ResponseType get() = "error".asDynamic().unsafeCast<ResponseType>()

actual inline val ResponseType.Companion.OPAQUE: ResponseType get() = "opaque".asDynamic().unsafeCast<ResponseType>()

actual inline val ResponseType.Companion.OPAQUEREDIRECT: ResponseType get() = "opaqueredirect".asDynamic().unsafeCast<ResponseType>()