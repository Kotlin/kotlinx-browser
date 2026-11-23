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

public external open class Headers : JsAny {
    constructor(init: JsArray<JsArray<JsString>>)
    constructor(init: JsAny)
    constructor()
    open fun append(name: String, value: String)
    open fun delete(name: String)
    open fun get(name: String): String?
    open fun getSetCookie(): JsArray<JsString>
    open fun has(name: String): Boolean
    open fun set(name: String, value: String)
    // not printed yet: iterable
}

public external interface Body : JsAny {
    val body: ReadableStream?
    val bodyUsed: Boolean
    fun arrayBuffer(): Promise<ArrayBuffer>
    fun blob(): Promise<Blob>
    fun bytes(): Promise<Uint8Array>
    fun formData(): Promise<FormData>
    fun json(): Promise<JsAny?>
    fun text(): Promise<JsString>
    fun textStream(): ReadableStream
}

public external open class Request : Body {
    constructor(input: Request, init: RequestInit = definedExternally)
    constructor(input: String, init: RequestInit = definedExternally)
    open val method: String
    open val url: String
    open val headers: Headers
    open val destination: RequestDestination
    open val referrer: String
    open val referrerPolicy: ReferrerPolicy
    open val mode: RequestMode
    open val credentials: RequestCredentials
    open val cache: RequestCache
    open val redirect: RequestRedirect
    open val integrity: String
    open val keepalive: Boolean
    open val isReloadNavigation: Boolean
    open val isHistoryNavigation: Boolean
    open val signal: AbortSignal
    open val duplex: RequestDuplex
    open fun clone(): Request
    override val body: ReadableStream?
    override val bodyUsed: Boolean
    override fun arrayBuffer(): Promise<ArrayBuffer>
    override fun blob(): Promise<Blob>
    override fun bytes(): Promise<Uint8Array>
    override fun formData(): Promise<FormData>
    override fun json(): Promise<JsAny?>
    override fun text(): Promise<JsString>
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

public external open class Response : Body {
    constructor(body: ReadableStream?, init: ResponseInit = definedExternally)
    constructor(body: Blob?, init: ResponseInit = definedExternally)
    constructor(body: BufferDataSource?, init: ResponseInit = definedExternally)
    constructor(body: FormData?, init: ResponseInit = definedExternally)
    constructor(body: URLSearchParams?, init: ResponseInit = definedExternally)
    constructor(body: String?, init: ResponseInit = definedExternally)
    constructor()
    open val type: ResponseType
    open val url: String
    open val redirected: Boolean
    open val status: Short
    open val ok: Boolean
    open val statusText: String
    open val headers: Headers
    open fun clone(): Response
    override val body: ReadableStream?
    override val bodyUsed: Boolean
    override fun arrayBuffer(): Promise<ArrayBuffer>
    override fun blob(): Promise<Blob>
    override fun bytes(): Promise<Uint8Array>
    override fun formData(): Promise<FormData>
    override fun json(): Promise<JsAny?>
    override fun text(): Promise<JsString>
    override fun textStream(): ReadableStream

    companion object {
        fun error(): Response
        fun redirect(url: String, status: Short = definedExternally): Response
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

public external abstract class FetchLaterResult : JsAny {
    open val activated: Boolean
}
