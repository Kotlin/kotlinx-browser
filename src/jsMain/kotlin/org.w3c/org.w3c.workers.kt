/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.workers

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.fetch.*
import org.w3c.notifications.*

/**
 * Exposes the JavaScript [ServiceWorker](https://developer.mozilla.org/en/docs/Web/API/ServiceWorker) to Kotlin
 */
actual external abstract class ServiceWorker : EventTarget, AbstractWorker, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker {
    actual open val scriptURL: String
    actual open val state: ServiceWorkerState
    actual open var onstatechange: ((Event) -> dynamic)?
    actual fun postMessage(message: Any?, transfer: Array<dynamic>)
}

/**
 * Exposes the JavaScript [ServiceWorkerRegistration](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerRegistration) to Kotlin
 */
actual external abstract class ServiceWorkerRegistration : EventTarget {
    actual open val installing: ServiceWorker?
    actual open val waiting: ServiceWorker?
    actual open val active: ServiceWorker?
    actual open val scope: String
    actual open var onupdatefound: ((Event) -> dynamic)?
    actual open val APISpace: dynamic
    actual fun update(): Promise<Unit>
    actual fun unregister(): Promise<Boolean>
    actual fun showNotification(title: String, options: NotificationOptions): Promise<Unit>
    actual fun getNotifications(filter: GetNotificationOptions): Promise<Array<Notification>>
    actual fun methodName(): Promise<dynamic>
}

/**
 * Exposes the JavaScript [ServiceWorkerContainer](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerContainer) to Kotlin
 */
actual external abstract class ServiceWorkerContainer : EventTarget {
    actual open val controller: ServiceWorker?
    actual open val ready: Promise<ServiceWorkerRegistration>
    actual open var oncontrollerchange: ((Event) -> dynamic)?
    actual open var onmessage: ((MessageEvent) -> dynamic)?
    actual fun register(scriptURL: String, options: RegistrationOptions): Promise<ServiceWorkerRegistration>
    actual fun getRegistration(clientURL: String): Promise<Any?>
    actual fun getRegistrations(): Promise<Array<ServiceWorkerRegistration>>
    actual fun startMessages()
}

actual external interface RegistrationOptions {
    actual var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun RegistrationOptions(scope: String?, type: WorkerType?): RegistrationOptions {
    val o = js("({})")
    o["scope"] = scope
    o["type"] = type
    return o as RegistrationOptions
}

/**
 * Exposes the JavaScript [ServiceWorkerMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerMessageEvent) to Kotlin
 */
actual external open class ServiceWorkerMessageEvent actual constructor(type: String, eventInitDict: ServiceWorkerMessageEventInit) : Event {
    actual open val data: Any?
    actual open val origin: String
    actual open val lastEventId: String
    actual open val source: UnionMessagePortOrServiceWorker?
    actual open val ports: Array<out MessagePort>?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ServiceWorkerMessageEventInit : EventInit {
    actual var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    actual var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var lastEventId: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var source: UnionMessagePortOrServiceWorker?
        get() = definedExternally
        set(value) = definedExternally
    actual var ports: Array<MessagePort>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ServiceWorkerMessageEventInit(data: Any?, origin: String?, lastEventId: String?, source: UnionMessagePortOrServiceWorker?, ports: Array<MessagePort>?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ServiceWorkerMessageEventInit {
    val o = js("({})")
    o["data"] = data
    o["origin"] = origin
    o["lastEventId"] = lastEventId
    o["source"] = source
    o["ports"] = ports
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as ServiceWorkerMessageEventInit
}

/**
 * Exposes the JavaScript [ServiceWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerGlobalScope) to Kotlin
 */
actual external abstract class ServiceWorkerGlobalScope : WorkerGlobalScope {
    actual open val clients: Clients
    actual open val registration: ServiceWorkerRegistration
    actual open var oninstall: ((Event) -> dynamic)?
    actual open var onactivate: ((Event) -> dynamic)?
    actual open var onfetch: ((FetchEvent) -> dynamic)?
    actual open var onforeignfetch: ((Event) -> dynamic)?
    actual open var onmessage: ((MessageEvent) -> dynamic)?
    actual open var onnotificationclick: ((NotificationEvent) -> dynamic)?
    actual open var onnotificationclose: ((NotificationEvent) -> dynamic)?
    actual open var onfunctionalevent: ((Event) -> dynamic)?
    actual fun skipWaiting(): Promise<Unit>
}

/**
 * Exposes the JavaScript [Client](https://developer.mozilla.org/en/docs/Web/API/Client) to Kotlin
 */
actual external abstract class Client : UnionClientOrMessagePortOrServiceWorker {
    actual open val url: String
    actual open val frameType: FrameType
    actual open val id: String
    actual fun postMessage(message: Any?, transfer: Array<dynamic>)
}

/**
 * Exposes the JavaScript [WindowClient](https://developer.mozilla.org/en/docs/Web/API/WindowClient) to Kotlin
 */
actual external abstract class WindowClient : Client {
    actual open val visibilityState: dynamic
    actual open val focused: Boolean
    actual fun focus(): Promise<WindowClient>
    actual fun navigate(url: String): Promise<WindowClient>
}

/**
 * Exposes the JavaScript [Clients](https://developer.mozilla.org/en/docs/Web/API/Clients) to Kotlin
 */
actual external abstract class Clients {
    actual fun get(id: String): Promise<Any?>
    actual fun matchAll(options: ClientQueryOptions): Promise<Array<Client>>
    actual fun openWindow(url: String): Promise<WindowClient?>
    actual fun claim(): Promise<Unit>
}

actual external interface ClientQueryOptions {
    actual var includeUncontrolled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var type: ClientType? /* = ClientType.WINDOW */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ClientQueryOptions(includeUncontrolled: Boolean?, type: ClientType?): ClientQueryOptions {
    val o = js("({})")
    o["includeUncontrolled"] = includeUncontrolled
    o["type"] = type
    return o as ClientQueryOptions
}

/**
 * Exposes the JavaScript [ExtendableEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableEvent) to Kotlin
 */
actual external open class ExtendableEvent actual constructor(type: String, eventInitDict: ExtendableEventInit) : Event {
    actual fun waitUntil(f: Promise<Any?>)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ExtendableEventInit : EventInit

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ExtendableEventInit(bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ExtendableEventInit {
    val o = js("({})")
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as ExtendableEventInit
}

/**
 * Exposes the JavaScript [InstallEvent](https://developer.mozilla.org/en/docs/Web/API/InstallEvent) to Kotlin
 */
actual external open class InstallEvent actual constructor(type: String, eventInitDict: ExtendableEventInit) : ExtendableEvent {
    actual fun registerForeignFetch(options: ForeignFetchOptions)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ForeignFetchOptions {
    actual var scopes: Array<String>?
    actual var origins: Array<String>?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ForeignFetchOptions(scopes: Array<String>?, origins: Array<String>?): ForeignFetchOptions {
    val o = js("({})")
    o["scopes"] = scopes
    o["origins"] = origins
    return o as ForeignFetchOptions
}

/**
 * Exposes the JavaScript [FetchEvent](https://developer.mozilla.org/en/docs/Web/API/FetchEvent) to Kotlin
 */
actual external open class FetchEvent actual constructor(type: String, eventInitDict: FetchEventInit) : ExtendableEvent {
    actual open val request: Request
    actual open val clientId: String?
    actual open val isReload: Boolean
    actual fun respondWith(r: Promise<Response>)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface FetchEventInit : ExtendableEventInit {
    actual var request: Request?
    actual var clientId: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var isReload: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun FetchEventInit(request: Request?, clientId: String?, isReload: Boolean?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): FetchEventInit {
    val o = js("({})")
    o["request"] = request
    o["clientId"] = clientId
    o["isReload"] = isReload
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as FetchEventInit
}

actual external open class ForeignFetchEvent actual constructor(type: String, eventInitDict: ForeignFetchEventInit) : ExtendableEvent {
    actual open val request: Request
    actual open val origin: String
    actual fun respondWith(r: Promise<ForeignFetchResponse>)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ForeignFetchEventInit : ExtendableEventInit {
    actual var request: Request?
    actual var origin: String? /* = "null" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ForeignFetchEventInit(request: Request?, origin: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ForeignFetchEventInit {
    val o = js("({})")
    o["request"] = request
    o["origin"] = origin
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as ForeignFetchEventInit
}

actual external interface ForeignFetchResponse {
    actual var response: Response?
    actual var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var headers: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ForeignFetchResponse(response: Response?, origin: String?, headers: Array<String>?): ForeignFetchResponse {
    val o = js("({})")
    o["response"] = response
    o["origin"] = origin
    o["headers"] = headers
    return o as ForeignFetchResponse
}

/**
 * Exposes the JavaScript [ExtendableMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableMessageEvent) to Kotlin
 */
actual external open class ExtendableMessageEvent actual constructor(type: String, eventInitDict: ExtendableMessageEventInit) : ExtendableEvent {
    actual open val data: Any?
    actual open val origin: String
    actual open val lastEventId: String
    actual open val source: UnionClientOrMessagePortOrServiceWorker?
    actual open val ports: Array<out MessagePort>?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface ExtendableMessageEventInit : ExtendableEventInit {
    actual var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    actual var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var lastEventId: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var source: UnionClientOrMessagePortOrServiceWorker?
        get() = definedExternally
        set(value) = definedExternally
    actual var ports: Array<MessagePort>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ExtendableMessageEventInit(data: Any?, origin: String?, lastEventId: String?, source: UnionClientOrMessagePortOrServiceWorker?, ports: Array<MessagePort>?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ExtendableMessageEventInit {
    val o = js("({})")
    o["data"] = data
    o["origin"] = origin
    o["lastEventId"] = lastEventId
    o["source"] = source
    o["ports"] = ports
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as ExtendableMessageEventInit
}

/**
 * Exposes the JavaScript [Cache](https://developer.mozilla.org/en/docs/Web/API/Cache) to Kotlin
 */
actual external abstract class Cache {
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun match(request: dynamic, options: CacheQueryOptions): Promise<Any?>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun matchAll(request: dynamic, options: CacheQueryOptions): Promise<Array<Response>>
    actual fun matchAll(): Promise<Array<Response>>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun add(request: dynamic): Promise<Unit>
    actual fun addAll(requests: Array<dynamic>): Promise<Unit>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun put(request: dynamic, response: Response): Promise<Unit>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun delete(request: dynamic, options: CacheQueryOptions): Promise<Boolean>
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun keys(request: dynamic, options: CacheQueryOptions): Promise<Array<Request>>
    actual fun keys(): Promise<Array<Request>>
}

actual external interface CacheQueryOptions {
    actual var ignoreSearch: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var ignoreMethod: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var ignoreVary: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var cacheName: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun CacheQueryOptions(ignoreSearch: Boolean?, ignoreMethod: Boolean?, ignoreVary: Boolean?, cacheName: String?): CacheQueryOptions {
    val o = js("({})")
    o["ignoreSearch"] = ignoreSearch
    o["ignoreMethod"] = ignoreMethod
    o["ignoreVary"] = ignoreVary
    o["cacheName"] = cacheName
    return o as CacheQueryOptions
}

actual external interface CacheBatchOperation {
    actual var type: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var request: Request?
        get() = definedExternally
        set(value) = definedExternally
    actual var response: Response?
        get() = definedExternally
        set(value) = definedExternally
    actual var options: CacheQueryOptions?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun CacheBatchOperation(type: String?, request: Request?, response: Response?, options: CacheQueryOptions?): CacheBatchOperation {
    val o = js("({})")
    o["type"] = type
    o["request"] = request
    o["response"] = response
    o["options"] = options
    return o as CacheBatchOperation
}

/**
 * Exposes the JavaScript [CacheStorage](https://developer.mozilla.org/en/docs/Web/API/CacheStorage) to Kotlin
 */
actual external abstract class CacheStorage {
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    @kotlin.internal.LowPriorityInOverloadResolution
    actual fun match(request: dynamic, options: CacheQueryOptions): Promise<Any?>
    actual fun has(cacheName: String): Promise<Boolean>
    actual fun open(cacheName: String): Promise<Cache>
    actual fun delete(cacheName: String): Promise<Boolean>
    actual fun keys(): Promise<Array<String>>
}

actual external open class FunctionalEvent : ExtendableEvent {
    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface UnionMessagePortOrServiceWorker

actual external interface UnionClientOrMessagePortOrServiceWorker

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ServiceWorkerState {
    actual companion object
}

actual inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState get() = "installing".asDynamic().unsafeCast<ServiceWorkerState>()

actual inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState get() = "installed".asDynamic().unsafeCast<ServiceWorkerState>()

actual inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState get() = "activating".asDynamic().unsafeCast<ServiceWorkerState>()

actual inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState get() = "activated".asDynamic().unsafeCast<ServiceWorkerState>()

actual inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState get() = "redundant".asDynamic().unsafeCast<ServiceWorkerState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface FrameType {
    actual companion object
}

actual inline val FrameType.Companion.AUXILIARY: FrameType get() = "auxiliary".asDynamic().unsafeCast<FrameType>()

actual inline val FrameType.Companion.TOP_LEVEL: FrameType get() = "top-level".asDynamic().unsafeCast<FrameType>()

actual inline val FrameType.Companion.NESTED: FrameType get() = "nested".asDynamic().unsafeCast<FrameType>()

actual inline val FrameType.Companion.NONE: FrameType get() = "none".asDynamic().unsafeCast<FrameType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ClientType {
    actual companion object
}

actual inline val ClientType.Companion.WINDOW: ClientType get() = "window".asDynamic().unsafeCast<ClientType>()

actual inline val ClientType.Companion.WORKER: ClientType get() = "worker".asDynamic().unsafeCast<ClientType>()

actual inline val ClientType.Companion.SHAREDWORKER: ClientType get() = "sharedworker".asDynamic().unsafeCast<ClientType>()

actual inline val ClientType.Companion.ALL: ClientType get() = "all".asDynamic().unsafeCast<ClientType>()