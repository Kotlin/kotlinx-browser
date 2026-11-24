/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'fetch', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.fetch

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*
import org.w3c.files.*
import org.w3c.streams.*
import org.w3c.xhr.*

/**
 * The Headers interface of the Fetch API allows you to perform various actions on HTTP request and response headers.
 * These actions include retrieving, setting, adding to, and removing headers from the object's header list.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers)
 */
public open external class Headers : JsAny {
    /**
     * The Headers() constructor creates a new Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/Headers)
     */
    constructor(init: JsArray<JsArray<JsString>>)

    /**
     * The Headers() constructor creates a new Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/Headers)
     */
    constructor(init: JsAny)

    /**
     * The Headers() constructor creates a new Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/Headers)
     */
    constructor()

    /**
     * The append() method of the Headers interface appends a new value onto an existing header inside a Headers object,
     * or adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/append)
     */
    open fun append(name: String, value: String)

    /**
     * The delete() method of the Headers interface deletes a header from the current Headers object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/delete)
     */
    open fun delete(name: String)

    /**
     * The get() method of the Headers interface returns a byte string of all the values of a header within a Headers
     * object with a given name. If the requested header doesn't exist in the Headers object, it returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/get)
     */
    open fun get(name: String): String?

    /**
     * The getSetCookie() method of the Headers interface returns an array containing the values of all Set-Cookie
     * headers associated with a response. This allows Headers objects to handle having multiple Set-Cookie headers,
     * which wasn't possible prior to its implementation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/getSetCookie)
     */
    open fun getSetCookie(): JsArray<JsString>

    /**
     * The has() method of the Headers interface returns a boolean stating whether a Headers object contains a certain
     * header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/has)
     */
    open fun has(name: String): Boolean

    /**
     * The set() method of the Headers interface sets a new value for an existing header inside a Headers object, or
     * adds the header if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Headers/set)
     */
    open fun set(name: String, value: String)
    // not printed yet: iterable
}

public external interface Body : JsAny {
    /**
     * The body read-only property of the Request interface contains a ReadableStream with the body contents that have
     * been added to the request. Note that a request using the GET or HEAD method cannot have a body and null is
     * returned in these cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body)
     */
    val body: ReadableStream?

    /**
     * The bodyUsed read-only property of the Request interface is a boolean value that indicates whether the request
     * body has been read yet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed)
     */
    val bodyUsed: Boolean

    /**
     * The arrayBuffer() method of the Request interface reads the request body and returns it as a promise that
     * resolves with an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
     */
    fun arrayBuffer(): Promise<ArrayBuffer>

    /**
     * The blob() method of the Request interface reads the request body and returns it as a promise that resolves with
     * a Blob.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
     */
    fun blob(): Promise<Blob>

    /**
     * The bytes() method of the Request interface reads the request body and returns it as a promise that resolves with
     * a Uint8Array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
     */
    fun bytes(): Promise<Uint8Array>

    /**
     * The formData() method of the Request interface reads the request body and returns it as a promise that resolves
     * with a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
     */
    fun formData(): Promise<FormData>

    /**
     * The json() method of the Request interface reads the request body and returns it as a promise that resolves with
     * the result of parsing the body text as JSON.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
     */
    fun json(): Promise<JsAny?>

    /**
     * The text() method of the Request interface reads the request body and returns it as a promise that resolves with
     * a String. The response is always decoded using UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
     */
    fun text(): Promise<JsString>

    /**
     * The textStream() method of the Request interface returns a ReadableStream that can be used to read the contents
     * of the request body in chunks of UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/textStream)
     */
    fun textStream(): ReadableStream
}

/**
 * The Request interface of the Fetch API represents a resource request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request)
 */
public open external class Request : Body {
    /**
     * The Request() constructor creates a new Request object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/Request)
     */
    constructor(input: Request, init: RequestInit = definedExternally)

    /**
     * The Request() constructor creates a new Request object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/Request)
     */
    constructor(input: String, init: RequestInit = definedExternally)

    /**
     * The method read-only property of the Request interface contains the request's method (GET, POST, etc.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/method)
     */
    open val method: String

    /**
     * The url read-only property of the Request interface contains the URL of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/url)
     */
    open val url: String

    /**
     * The headers read-only property of the Request interface contains the Headers object associated with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/headers)
     */
    open val headers: Headers

    /**
     * The destination read-only property of the Request interface returns a string describing the type of content being
     * requested.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/destination)
     */
    open val destination: RequestDestination

    /**
     * The referrer read-only property of the Request interface is set by the user agent to be the referrer of the
     * Request. (e.g., client, no-referrer, or a URL.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrer)
     */
    open val referrer: String

    /**
     * The referrerPolicy read-only property of the Request interface returns the referrer policy, which governs what
     * referrer information, sent in the Referer header, should be included with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/referrerPolicy)
     */
    open val referrerPolicy: ReferrerPolicy

    /**
     * The mode read-only property of the Request interface contains the mode of the request (e.g., cors, no-cors,
     * same-origin, or navigate.) This is used to determine if cross-origin requests lead to valid responses, and which
     * properties of the response are readable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/mode)
     */
    open val mode: RequestMode

    /**
     * The credentials read-only property of the Request interface reflects the value given to the Request() constructor
     * in the credentials option. It determines whether or not the browser sends credentials with the request, as well
     * as whether any Set-Cookie response headers are respected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/credentials)
     */
    open val credentials: RequestCredentials

    /**
     * The cache read-only property of the Request interface contains the cache mode of the request. It controls how the
     * request will interact with the browser's HTTP cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/cache)
     */
    open val cache: RequestCache

    /**
     * The redirect read-only property of the Request interface contains the mode for how redirects are handled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/redirect)
     */
    open val redirect: RequestRedirect

    /**
     * The integrity read-only property of the Request interface contains the subresource integrity value of the
     * request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/integrity)
     */
    open val integrity: String

    /**
     * The keepalive read-only property of the Request interface contains the request's keepalive setting (true or
     * false), which indicates whether the browser will keep the associated request alive if the page that initiated it
     * is unloaded before the request is complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/keepalive)
     */
    open val keepalive: Boolean

    /**
     * The isReloadNavigation read-only property of the Request interface is a boolean indicating whether the request is
     * a user-triggered reload.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/isReloadNavigation)
     */
    open val isReloadNavigation: Boolean

    /**
     * The isHistoryNavigation read-only property of the Request interface is a boolean indicating whether the request
     * is a history navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/isHistoryNavigation)
     */
    open val isHistoryNavigation: Boolean

    /**
     * The read-only signal property of the Request interface returns the AbortSignal associated with the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/signal)
     */
    open val signal: AbortSignal

    /**
     * The duplex read-only property of the Request interface returns the duplex mode of the request, which determines
     * whether the browser must send the entire request before processing the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/duplex)
     */
    open val duplex: RequestDuplex

    /**
     * The clone() method of the Request interface creates a copy of the current Request object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/clone)
     */
    open fun clone(): Request

    /**
     * The body read-only property of the Request interface contains a ReadableStream with the body contents that have
     * been added to the request. Note that a request using the GET or HEAD method cannot have a body and null is
     * returned in these cases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/body)
     */
    override val body: ReadableStream?

    /**
     * The bodyUsed read-only property of the Request interface is a boolean value that indicates whether the request
     * body has been read yet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bodyUsed)
     */
    override val bodyUsed: Boolean

    /**
     * The arrayBuffer() method of the Request interface reads the request body and returns it as a promise that
     * resolves with an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/arrayBuffer)
     */
    override fun arrayBuffer(): Promise<ArrayBuffer>

    /**
     * The blob() method of the Request interface reads the request body and returns it as a promise that resolves with
     * a Blob.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/blob)
     */
    override fun blob(): Promise<Blob>

    /**
     * The bytes() method of the Request interface reads the request body and returns it as a promise that resolves with
     * a Uint8Array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/bytes)
     */
    override fun bytes(): Promise<Uint8Array>

    /**
     * The formData() method of the Request interface reads the request body and returns it as a promise that resolves
     * with a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/formData)
     */
    override fun formData(): Promise<FormData>

    /**
     * The json() method of the Request interface reads the request body and returns it as a promise that resolves with
     * the result of parsing the body text as JSON.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/json)
     */
    override fun json(): Promise<JsAny?>

    /**
     * The text() method of the Request interface reads the request body and returns it as a promise that resolves with
     * a String. The response is always decoded using UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/text)
     */
    override fun text(): Promise<JsString>

    /**
     * The textStream() method of the Request interface returns a ReadableStream that can be used to read the contents
     * of the request body in chunks of UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Request/textStream)
     */
    override fun textStream(): ReadableStream
}

public external interface RequestInit : JsAny {
    var method: String?
    var headers: JsAny?
    var body: JsAny?
    var referrer: String?
    var referrerPolicy: ReferrerPolicy?
    var mode: RequestMode?
    var credentials: RequestCredentials?
    var cache: RequestCache?
    var redirect: RequestRedirect?
    var integrity: String?
    var keepalive: Boolean?
    var signal: AbortSignal?
    var duplex: RequestDuplex?
    var priority: RequestPriority?
    var window: JsAny?
}

public fun RequestInit(method: String? = null, headers: JsAny? = null, body: JsAny? = null, referrer: String? = null, referrerPolicy: ReferrerPolicy? = null, mode: RequestMode? = null, credentials: RequestCredentials? = null, cache: RequestCache? = null, redirect: RequestRedirect? = null, integrity: String? = null, keepalive: Boolean? = null, signal: AbortSignal? = null, duplex: RequestDuplex? = null, priority: RequestPriority? = null, window: JsAny? = null): RequestInit = newJsObject<RequestInit>().apply {
    if (method != null) this.method = method
    if (headers != null) this.headers = headers
    if (body != null) this.body = body
    if (referrer != null) this.referrer = referrer
    if (referrerPolicy != null) this.referrerPolicy = referrerPolicy
    if (mode != null) this.mode = mode
    if (credentials != null) this.credentials = credentials
    if (cache != null) this.cache = cache
    if (redirect != null) this.redirect = redirect
    if (integrity != null) this.integrity = integrity
    if (keepalive != null) this.keepalive = keepalive
    if (signal != null) this.signal = signal
    if (duplex != null) this.duplex = duplex
    if (priority != null) this.priority = priority
    if (window != null) this.window = window
}

public external interface RequestDestination : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestDestination.Companion.EMPTY: RequestDestination get() = "".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.AUDIO: RequestDestination get() = "audio".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.AUDIOWORKLET: RequestDestination get() = "audioworklet".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.DOCUMENT: RequestDestination get() = "document".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.EMBED: RequestDestination get() = "embed".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.FONT: RequestDestination get() = "font".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.FRAME: RequestDestination get() = "frame".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.IFRAME: RequestDestination get() = "iframe".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.IMAGE: RequestDestination get() = "image".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.JSON: RequestDestination get() = "json".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.MANIFEST: RequestDestination get() = "manifest".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.OBJECT: RequestDestination get() = "object".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.PAINTWORKLET: RequestDestination get() = "paintworklet".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.REPORT: RequestDestination get() = "report".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.SCRIPT: RequestDestination get() = "script".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.SHAREDWORKER: RequestDestination get() = "sharedworker".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.STYLE: RequestDestination get() = "style".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.TEXT: RequestDestination get() = "text".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.TRACK: RequestDestination get() = "track".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.VIDEO: RequestDestination get() = "video".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.WORKER: RequestDestination get() = "worker".toJsString().unsafeCast<RequestDestination>()
public inline val RequestDestination.Companion.XSLT: RequestDestination get() = "xslt".toJsString().unsafeCast<RequestDestination>()

public external interface RequestMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestMode.Companion.NAVIGATE: RequestMode get() = "navigate".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.SAME_ORIGIN: RequestMode get() = "same-origin".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.NO_CORS: RequestMode get() = "no-cors".toJsString().unsafeCast<RequestMode>()
public inline val RequestMode.Companion.CORS: RequestMode get() = "cors".toJsString().unsafeCast<RequestMode>()

public external interface RequestCredentials : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestCredentials.Companion.OMIT: RequestCredentials get() = "omit".toJsString().unsafeCast<RequestCredentials>()
public inline val RequestCredentials.Companion.SAME_ORIGIN: RequestCredentials get() = "same-origin".toJsString().unsafeCast<RequestCredentials>()
public inline val RequestCredentials.Companion.INCLUDE: RequestCredentials get() = "include".toJsString().unsafeCast<RequestCredentials>()

public external interface RequestCache : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestCache.Companion.DEFAULT: RequestCache get() = "default".toJsString().unsafeCast<RequestCache>()
public inline val RequestCache.Companion.NO_STORE: RequestCache get() = "no-store".toJsString().unsafeCast<RequestCache>()
public inline val RequestCache.Companion.RELOAD: RequestCache get() = "reload".toJsString().unsafeCast<RequestCache>()
public inline val RequestCache.Companion.NO_CACHE: RequestCache get() = "no-cache".toJsString().unsafeCast<RequestCache>()
public inline val RequestCache.Companion.FORCE_CACHE: RequestCache get() = "force-cache".toJsString().unsafeCast<RequestCache>()
public inline val RequestCache.Companion.ONLY_IF_CACHED: RequestCache get() = "only-if-cached".toJsString().unsafeCast<RequestCache>()

public external interface RequestRedirect : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestRedirect.Companion.FOLLOW: RequestRedirect get() = "follow".toJsString().unsafeCast<RequestRedirect>()
public inline val RequestRedirect.Companion.ERROR: RequestRedirect get() = "error".toJsString().unsafeCast<RequestRedirect>()
public inline val RequestRedirect.Companion.MANUAL: RequestRedirect get() = "manual".toJsString().unsafeCast<RequestRedirect>()

public external interface RequestDuplex : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestDuplex.Companion.HALF: RequestDuplex get() = "half".toJsString().unsafeCast<RequestDuplex>()

public external interface RequestPriority : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RequestPriority.Companion.HIGH: RequestPriority get() = "high".toJsString().unsafeCast<RequestPriority>()
public inline val RequestPriority.Companion.LOW: RequestPriority get() = "low".toJsString().unsafeCast<RequestPriority>()
public inline val RequestPriority.Companion.AUTO: RequestPriority get() = "auto".toJsString().unsafeCast<RequestPriority>()

/**
 * The Response interface of the Fetch API represents the response to a request.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response)
 */
public open external class Response : Body {
    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor(body: ReadableStream?, init: ResponseInit = definedExternally)

    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor(body: Blob?, init: ResponseInit = definedExternally)

    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor(body: BufferDataSource?, init: ResponseInit = definedExternally)

    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor(body: FormData?, init: ResponseInit = definedExternally)

    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor(body: URLSearchParams?, init: ResponseInit = definedExternally)

    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor(body: String?, init: ResponseInit = definedExternally)

    /**
     * The Response() constructor creates a new Response object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/Response)
     */
    constructor()

    /**
     * The type read-only property of the Response interface contains the type of the response. The type determines
     * whether scripts are able to access the response body and headers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/type)
     */
    open val type: ResponseType

    /**
     * The url read-only property of the Response interface contains the URL of the response. The value of the url
     * property will be the final URL obtained after any redirects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/url)
     */
    open val url: String

    /**
     * The redirected read-only property of the Response interface indicates whether or not the response is the result
     * of a request you made which was redirected.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirected)
     */
    open val redirected: Boolean

    /**
     * The status read-only property of the Response interface contains the HTTP status code of the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/status)
     */
    open val status: Short

    /**
     * The ok read-only property of the Response interface contains a Boolean stating whether the response was
     * successful (status in the range 200-299) or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/ok)
     */
    open val ok: Boolean

    /**
     * The statusText read-only property of the Response interface contains the status message corresponding to the HTTP
     * status code in Response.status.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/statusText)
     */
    open val statusText: String

    /**
     * The headers read-only property of the Response interface contains the Headers object associated with the
     * response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/headers)
     */
    open val headers: Headers

    /**
     * The clone() method of the Response interface creates a clone of a response object, identical in every way, but
     * stored in a different variable.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/clone)
     */
    open fun clone(): Response

    /**
     * The body read-only property of the Response interface is a ReadableStream of the body contents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/body)
     */
    override val body: ReadableStream?

    /**
     * The bodyUsed read-only property of the Response interface is a boolean value that indicates whether the body has
     * been read yet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/bodyUsed)
     */
    override val bodyUsed: Boolean

    /**
     * The arrayBuffer() method of the Response interface takes a Response stream and reads it to completion. It returns
     * a promise that resolves with an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/arrayBuffer)
     */
    override fun arrayBuffer(): Promise<ArrayBuffer>

    /**
     * The blob() method of the Response interface takes a Response stream and reads it to completion. It returns a
     * promise that resolves with a Blob.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/blob)
     */
    override fun blob(): Promise<Blob>

    /**
     * The bytes() method of the Response interface takes a Response stream and reads it to completion. It returns a
     * promise that resolves with a Uint8Array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/bytes)
     */
    override fun bytes(): Promise<Uint8Array>

    /**
     * The formData() method of the Response interface takes a Response stream and reads it to completion. It returns a
     * promise that resolves with a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/formData)
     */
    override fun formData(): Promise<FormData>

    /**
     * The json() method of the Response interface takes a Response stream and reads it to completion. It returns a
     * promise which resolves with the result of parsing the body text as JSON.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/json)
     */
    override fun json(): Promise<JsAny?>

    /**
     * The text() method of the Response interface takes a Response stream and reads it to completion. It returns a
     * promise that resolves with a String. The response is always decoded using UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/text)
     */
    override fun text(): Promise<JsString>

    /**
     * The textStream() method of the Response interface returns a ReadableStream that can be used to read the contents
     * of the response body in chunks of UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/textStream)
     */
    override fun textStream(): ReadableStream

    companion object {
        /**
         * The error() static method of the Response interface returns a new Response object associated with a network
         * error.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/error_static)
         */
        fun error(): Response

        /**
         * The redirect() static method of the Response interface returns a Response resulting in a redirect to the
         * specified URL.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/redirect_static)
         */
        fun redirect(url: String, status: Short = definedExternally): Response

        /**
         * The json() static method of the Response interface returns a Response that contains the provided JSON data as
         * body, and a Content-Type header which is set to application/json. The response status, status message, and
         * additional headers can also be set.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Response/json_static)
         */
        fun json(data: JsAny?, init: ResponseInit = definedExternally): Response
    }
}

public external interface ResponseInit : JsAny {
    var status: Short?
    var statusText: String?
    var headers: JsAny?
}

public fun ResponseInit(status: Short? = null, statusText: String? = null, headers: JsAny? = null): ResponseInit = newJsObject<ResponseInit>().apply {
    if (status != null) this.status = status
    if (statusText != null) this.statusText = statusText
    if (headers != null) this.headers = headers
}

public external interface ResponseType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ResponseType.Companion.BASIC: ResponseType get() = "basic".toJsString().unsafeCast<ResponseType>()
public inline val ResponseType.Companion.CORS: ResponseType get() = "cors".toJsString().unsafeCast<ResponseType>()
public inline val ResponseType.Companion.DEFAULT: ResponseType get() = "default".toJsString().unsafeCast<ResponseType>()
public inline val ResponseType.Companion.ERROR: ResponseType get() = "error".toJsString().unsafeCast<ResponseType>()
public inline val ResponseType.Companion.OPAQUE: ResponseType get() = "opaque".toJsString().unsafeCast<ResponseType>()
public inline val ResponseType.Companion.OPAQUEREDIRECT: ResponseType get() = "opaqueredirect".toJsString().unsafeCast<ResponseType>()

public external interface DeferredRequestInit : RequestInit {
    var activateAfter: Double?
}

public fun DeferredRequestInit(method: String? = null, headers: JsAny? = null, body: JsAny? = null, referrer: String? = null, referrerPolicy: ReferrerPolicy? = null, mode: RequestMode? = null, credentials: RequestCredentials? = null, cache: RequestCache? = null, redirect: RequestRedirect? = null, integrity: String? = null, keepalive: Boolean? = null, signal: AbortSignal? = null, duplex: RequestDuplex? = null, priority: RequestPriority? = null, window: JsAny? = null, activateAfter: Double? = null): DeferredRequestInit = newJsObject<DeferredRequestInit>().apply {
    if (method != null) this.method = method
    if (headers != null) this.headers = headers
    if (body != null) this.body = body
    if (referrer != null) this.referrer = referrer
    if (referrerPolicy != null) this.referrerPolicy = referrerPolicy
    if (mode != null) this.mode = mode
    if (credentials != null) this.credentials = credentials
    if (cache != null) this.cache = cache
    if (redirect != null) this.redirect = redirect
    if (integrity != null) this.integrity = integrity
    if (keepalive != null) this.keepalive = keepalive
    if (signal != null) this.signal = signal
    if (duplex != null) this.duplex = duplex
    if (priority != null) this.priority = priority
    if (window != null) this.window = window
    if (activateAfter != null) this.activateAfter = activateAfter
}

/**
 * The FetchLaterResult interface of the Fetch API is returned by the Window.fetchLater() method after a deferred fetch
 * has been created.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchLaterResult)
 */
public abstract external class FetchLaterResult : JsAny {
    /**
     * The activated read-only property of the FetchLaterResult interface returns a boolean specifying whether the
     * deferred fetch has been sent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchLaterResult/activated)
     */
    open val activated: Boolean
}
