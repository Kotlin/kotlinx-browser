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
public expect open class Headers(init: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */ = definedExternally) : JsAny {
    fun append(name: String, value: String)
    fun delete(name: String)
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(name: String, value: String)
}

/**
 * Exposes the JavaScript [Body](https://developer.mozilla.org/en/docs/Web/API/Body) to Kotlin
 */
public expect interface Body : JsAny {
    val bodyUsed: Boolean
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun formData(): Promise<FormData>
    fun json(): Promise<JsAny?>
    fun text(): Promise<JsString>
}

/**
 * Exposes the JavaScript [Request](https://developer.mozilla.org/en/docs/Web/API/Request) to Kotlin
 */
public expect open class Request(input: JsAny? /* Request|String */, init: RequestInit = definedExternally) : Body, JsAny {
    open val method: String
    open val url: String
    open val headers: Headers
    open val type: RequestType
    open val destination: RequestDestination
    open val referrer: String
    open val referrerPolicy: JsAny?
    open val mode: RequestMode
    open val credentials: RequestCredentials
    open val cache: RequestCache
    open val redirect: RequestRedirect
    open val integrity: String
    open val keepalive: Boolean
    override val bodyUsed: Boolean
    fun clone(): Request
    override fun arrayBuffer(): Promise<ArrayBuffer>
    override fun blob(): Promise<Blob>
    override fun formData(): Promise<FormData>
    override fun json(): Promise<JsAny?>
    override fun text(): Promise<JsString>
}

public expect interface RequestInit : JsAny {
    open var method: String?
    open var headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */
    open var body: JsAny? /* Blob|BufferSource|FormData|URLSearchParams|String */
    open var referrer: String?
    open var referrerPolicy: JsAny?
    open var mode: RequestMode?
    open var credentials: RequestCredentials?
    open var cache: RequestCache?
    open var redirect: RequestRedirect?
    open var integrity: String?
    open var keepalive: Boolean?
    open var window: JsAny?
}

@Suppress("UNUSED_PARAMETER")
public expect fun RequestInit(method: String? = undefined, headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */ = undefined, body: JsAny? /* Blob|BufferSource|FormData|URLSearchParams|String */ = undefined, referrer: String? = undefined, referrerPolicy: JsAny? = undefined, mode: RequestMode? = undefined, credentials: RequestCredentials? = undefined, cache: RequestCache? = undefined, redirect: RequestRedirect? = undefined, integrity: String? = undefined, keepalive: Boolean? = undefined, window: JsAny? = undefined): RequestInit

/**
 * Exposes the JavaScript [Response](https://developer.mozilla.org/en/docs/Web/API/Response) to Kotlin
 */
public expect open class Response(body: JsAny? /* JsAny?|ReadableStream */ = definedExternally, init: ResponseInit = definedExternally) : Body, JsAny {
    open val type: ResponseType
    open val url: String
    open val redirected: Boolean
    open val status: Short
    open val ok: Boolean
    open val statusText: String
    open val headers: Headers
    open val body: JsAny?
    open val trailer: Promise<Headers>
    override val bodyUsed: Boolean
    fun clone(): Response
    override fun arrayBuffer(): Promise<ArrayBuffer>
    override fun blob(): Promise<Blob>
    override fun formData(): Promise<FormData>
    override fun json(): Promise<JsAny?>
    override fun text(): Promise<JsString>

    companion object {
        fun error(): Response
        fun redirect(url: String, status: Short = definedExternally): Response
    }
}

public expect interface ResponseInit : JsAny {
    open var status: Short? /* = 200 */
    open var statusText: String? /* = "OK" */
    open var headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */
}

@Suppress("UNUSED_PARAMETER")
public expect fun ResponseInit(status: Short? = 200, statusText: String? = "OK", headers: JsAny? /* Headers|JsArray<JsArray<JsString>>|OpenEndedDictionary<JsString> */ = undefined): ResponseInit

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RequestType : JsAny {
    companion object
}

public expect inline val RequestType.Companion.EMPTY: RequestType

public expect inline val RequestType.Companion.AUDIO: RequestType

public expect inline val RequestType.Companion.FONT: RequestType

public expect inline val RequestType.Companion.IMAGE: RequestType

public expect inline val RequestType.Companion.SCRIPT: RequestType

public expect inline val RequestType.Companion.STYLE: RequestType

public expect inline val RequestType.Companion.TRACK: RequestType

public expect inline val RequestType.Companion.VIDEO: RequestType

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RequestDestination : JsAny {
    companion object
}

public expect inline val RequestDestination.Companion.EMPTY: RequestDestination

public expect inline val RequestDestination.Companion.DOCUMENT: RequestDestination

public expect inline val RequestDestination.Companion.EMBED: RequestDestination

public expect inline val RequestDestination.Companion.FONT: RequestDestination

public expect inline val RequestDestination.Companion.IMAGE: RequestDestination

public expect inline val RequestDestination.Companion.MANIFEST: RequestDestination

public expect inline val RequestDestination.Companion.MEDIA: RequestDestination

public expect inline val RequestDestination.Companion.OBJECT: RequestDestination

public expect inline val RequestDestination.Companion.REPORT: RequestDestination

public expect inline val RequestDestination.Companion.SCRIPT: RequestDestination

public expect inline val RequestDestination.Companion.SERVICEWORKER: RequestDestination

public expect inline val RequestDestination.Companion.SHAREDWORKER: RequestDestination

public expect inline val RequestDestination.Companion.STYLE: RequestDestination

public expect inline val RequestDestination.Companion.WORKER: RequestDestination

public expect inline val RequestDestination.Companion.XSLT: RequestDestination

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RequestMode : JsAny {
    companion object
}

public expect inline val RequestMode.Companion.NAVIGATE: RequestMode

public expect inline val RequestMode.Companion.SAME_ORIGIN: RequestMode

public expect inline val RequestMode.Companion.NO_CORS: RequestMode

public expect inline val RequestMode.Companion.CORS: RequestMode

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RequestCredentials : JsAny {
    companion object
}

public expect inline val RequestCredentials.Companion.OMIT: RequestCredentials

public expect inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials

public expect inline val RequestCredentials.Companion.INCLUDE: RequestCredentials

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RequestCache : JsAny {
    companion object
}

public expect inline val RequestCache.Companion.DEFAULT: RequestCache

public expect inline val RequestCache.Companion.NO_STORE: RequestCache

public expect inline val RequestCache.Companion.RELOAD: RequestCache

public expect inline val RequestCache.Companion.NO_CACHE: RequestCache

public expect inline val RequestCache.Companion.FORCE_CACHE: RequestCache

public expect inline val RequestCache.Companion.ONLY_IF_CACHED: RequestCache

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface RequestRedirect : JsAny {
    companion object
}

public expect inline val RequestRedirect.Companion.FOLLOW: RequestRedirect

public expect inline val RequestRedirect.Companion.ERROR: RequestRedirect

public expect inline val RequestRedirect.Companion.MANUAL: RequestRedirect

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface ResponseType : JsAny {
    companion object
}

public expect inline val ResponseType.Companion.BASIC: ResponseType

public expect inline val ResponseType.Companion.CORS: ResponseType

public expect inline val ResponseType.Companion.DEFAULT: ResponseType

public expect inline val ResponseType.Companion.ERROR: ResponseType

public expect inline val ResponseType.Companion.OPAQUE: ResponseType

public expect inline val ResponseType.Companion.OPAQUEREDIRECT: ResponseType