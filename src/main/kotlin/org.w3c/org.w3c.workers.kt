/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

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
public external abstract class ServiceWorker : EventTarget, MessageEventSource, UnionClientOrMessagePortOrServiceWorker {
    open val scriptURL: String
    open val state: ServiceWorkerState
    open var onstatechange: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
    fun postMessage(message: Any?, transfer: Array<dynamic>): dynamic
    fun postMessage(message: Any?, options: PostMessageOptions = definedExternally): dynamic
}

/**
 * Exposes the JavaScript [ServiceWorkerRegistration](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerRegistration) to Kotlin
 */
public external abstract class ServiceWorkerRegistration : EventTarget {
    open val installing: ServiceWorker?
    open val waiting: ServiceWorker?
    open val active: ServiceWorker?
    open val navigationPreload: NavigationPreloadManager
    open val scope: String
    open val updateViaCache: ServiceWorkerUpdateViaCache
    open var onupdatefound: ((Event) -> dynamic)?
    open val APISpace: dynamic
    fun update(): Promise<dynamic>
    fun unregister(): Promise<Boolean>
    fun showNotification(title: String, options: NotificationOptions = definedExternally): Promise<dynamic>
    fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<Array<Notification>>
    fun methodName(): Promise<dynamic>
}

/**
 * Exposes the JavaScript [ServiceWorkerContainer](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerContainer) to Kotlin
 */
public external abstract class ServiceWorkerContainer : EventTarget {
    open val controller: ServiceWorker?
    open val ready: Promise<ServiceWorkerRegistration>
    open var oncontrollerchange: ((Event) -> dynamic)?
    open var onmessage: ((MessageEvent) -> dynamic)?
    open var onmessageerror: ((Event) -> dynamic)?
    fun register(scriptURL: String, options: RegistrationOptions = definedExternally): Promise<ServiceWorkerRegistration>
    fun getRegistration(clientURL: String = definedExternally): Promise<dynamic>
    fun getRegistrations(): Promise<Array<out ServiceWorkerRegistration>>
    fun startMessages(): dynamic
}

public external interface RegistrationOptions {
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
    var updateViaCache: ServiceWorkerUpdateViaCache? /* = ServiceWorkerUpdateViaCache.IMPORTS */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RegistrationOptions(scope: String? = undefined, type: WorkerType? = WorkerType.CLASSIC, updateViaCache: ServiceWorkerUpdateViaCache? = ServiceWorkerUpdateViaCache.IMPORTS): RegistrationOptions {
    val o = js("({})")
    o["scope"] = scope
    o["type"] = type
    o["updateViaCache"] = updateViaCache
    return o
}

public external abstract class NavigationPreloadManager {
    fun enable(): Promise<dynamic>
    fun disable(): Promise<dynamic>
    fun setHeaderValue(value: String): Promise<dynamic>
    fun getState(): Promise<NavigationPreloadState>
}

public external interface NavigationPreloadState {
    var enabled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var headerValue: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NavigationPreloadState(enabled: Boolean? = false, headerValue: String? = undefined): NavigationPreloadState {
    val o = js("({})")
    o["enabled"] = enabled
    o["headerValue"] = headerValue
    return o
}

/**
 * Exposes the JavaScript [ServiceWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerGlobalScope) to Kotlin
 */
public external abstract class ServiceWorkerGlobalScope : WorkerGlobalScope {
    open val clients: Clients
    open val registration: ServiceWorkerRegistration
    open val serviceWorker: ServiceWorker
    open var oninstall: ((Event) -> dynamic)?
    open var onactivate: ((Event) -> dynamic)?
    open var onfetch: ((FetchEvent) -> dynamic)?
    open var onmessage: ((MessageEvent) -> dynamic)?
    open var onmessageerror: ((Event) -> dynamic)?
    open var onnotificationclick: ((NotificationEvent) -> dynamic)?
    open var onnotificationclose: ((NotificationEvent) -> dynamic)?
    open var onfunctionalevent: ((Event) -> dynamic)?
    fun skipWaiting(): Promise<dynamic>
}

/**
 * Exposes the JavaScript [Client](https://developer.mozilla.org/en/docs/Web/API/Client) to Kotlin
 */
public external abstract class Client : UnionClientOrMessagePortOrServiceWorker {
    open val url: String
    open val frameType: FrameType
    open val id: String
    open val type: ClientType
    fun postMessage(message: Any?, transfer: Array<dynamic>): dynamic
    fun postMessage(message: Any?, options: PostMessageOptions = definedExternally): dynamic
}

/**
 * Exposes the JavaScript [WindowClient](https://developer.mozilla.org/en/docs/Web/API/WindowClient) to Kotlin
 */
public external abstract class WindowClient : Client {
    open val visibilityState: dynamic
    open val focused: Boolean
    open val ancestorOrigins: Array<out String>
    fun focus(): Promise<WindowClient>
    fun navigate(url: String): Promise<WindowClient?>
}

/**
 * Exposes the JavaScript [Clients](https://developer.mozilla.org/en/docs/Web/API/Clients) to Kotlin
 */
public external abstract class Clients {
    fun get(id: String): Promise<dynamic>
    fun matchAll(options: ClientQueryOptions = definedExternally): Promise<Array<out Client>>
    fun openWindow(url: String): Promise<WindowClient?>
    fun claim(): Promise<dynamic>
}

public external interface ClientQueryOptions {
    var includeUncontrolled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var type: ClientType? /* = ClientType.WINDOW */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ClientQueryOptions(includeUncontrolled: Boolean? = false, type: ClientType? = ClientType.WINDOW): ClientQueryOptions {
    val o = js("({})")
    o["includeUncontrolled"] = includeUncontrolled
    o["type"] = type
    return o
}

/**
 * Exposes the JavaScript [ExtendableEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableEvent) to Kotlin
 */
public external abstract class ExtendableEvent : Event {
    fun waitUntil(f: Promise<Any?>): dynamic

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ExtendableEventInit : EventInit

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ExtendableEventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableEventInit {
    val o = js("({})")
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [FetchEvent](https://developer.mozilla.org/en/docs/Web/API/FetchEvent) to Kotlin
 */
public external abstract class FetchEvent : ExtendableEvent {
    open val request: Request
    open val preloadResponse: Promise<Any?>
    open val clientId: String
    open val resultingClientId: String
    open val replacesClientId: String
    open val handled: Promise<dynamic>
    fun respondWith(r: Promise<Response>): dynamic

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface FetchEventInit : ExtendableEventInit {
    var request: Request?
    var preloadResponse: Promise<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var clientId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var resultingClientId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var replacesClientId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var handled: Promise<dynamic>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun FetchEventInit(request: Request?, preloadResponse: Promise<Any?>? = undefined, clientId: String? = "", resultingClientId: String? = "", replacesClientId: String? = "", handled: Promise<dynamic>? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): FetchEventInit {
    val o = js("({})")
    o["request"] = request
    o["preloadResponse"] = preloadResponse
    o["clientId"] = clientId
    o["resultingClientId"] = resultingClientId
    o["replacesClientId"] = replacesClientId
    o["handled"] = handled
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [ExtendableMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableMessageEvent) to Kotlin
 */
public external abstract class ExtendableMessageEvent : ExtendableEvent {
    open val data: Any?
    open val origin: String
    open val lastEventId: String
    open val source: UnionClientOrMessagePortOrServiceWorker?
    open val ports: Array<out MessagePort>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var origin: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var lastEventId: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var source: UnionClientOrMessagePortOrServiceWorker? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var ports: Array<MessagePort>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun ExtendableMessageEventInit(data: Any? = null, origin: String? = "", lastEventId: String? = "", source: UnionClientOrMessagePortOrServiceWorker? = null, ports: Array<MessagePort>? = arrayOf(), bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableMessageEventInit {
    val o = js("({})")
    o["data"] = data
    o["origin"] = origin
    o["lastEventId"] = lastEventId
    o["source"] = source
    o["ports"] = ports
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/**
 * Exposes the JavaScript [Cache](https://developer.mozilla.org/en/docs/Web/API/Cache) to Kotlin
 */
public external abstract class Cache {
    fun match(request: dynamic, options: CacheQueryOptions = definedExternally): Promise<dynamic>
    fun matchAll(request: dynamic = definedExternally, options: CacheQueryOptions = definedExternally): Promise<Array<out Response>>
    fun add(request: dynamic): Promise<dynamic>
    fun addAll(requests: Array<dynamic>): Promise<dynamic>
    fun put(request: dynamic, response: Response): Promise<dynamic>
    fun delete(request: dynamic, options: CacheQueryOptions = definedExternally): Promise<Boolean>
    fun keys(request: dynamic = definedExternally, options: CacheQueryOptions = definedExternally): Promise<Array<out Request>>
}

public external interface CacheQueryOptions {
    var ignoreSearch: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreMethod: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreVary: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun CacheQueryOptions(ignoreSearch: Boolean? = false, ignoreMethod: Boolean? = false, ignoreVary: Boolean? = false): CacheQueryOptions {
    val o = js("({})")
    o["ignoreSearch"] = ignoreSearch
    o["ignoreMethod"] = ignoreMethod
    o["ignoreVary"] = ignoreVary
    return o
}

/**
 * Exposes the JavaScript [CacheStorage](https://developer.mozilla.org/en/docs/Web/API/CacheStorage) to Kotlin
 */
public external abstract class CacheStorage {
    fun match(request: dynamic, options: MultiCacheQueryOptions = definedExternally): Promise<dynamic>
    fun has(cacheName: String): Promise<Boolean>
    fun open(cacheName: String): Promise<Cache>
    fun delete(cacheName: String): Promise<Boolean>
    fun keys(): Promise<Array<String>>
}

public external interface MultiCacheQueryOptions : CacheQueryOptions {
    var cacheName: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun MultiCacheQueryOptions(cacheName: String? = undefined, ignoreSearch: Boolean? = false, ignoreMethod: Boolean? = false, ignoreVary: Boolean? = false): MultiCacheQueryOptions {
    val o = js("({})")
    o["cacheName"] = cacheName
    o["ignoreSearch"] = ignoreSearch
    o["ignoreMethod"] = ignoreMethod
    o["ignoreVary"] = ignoreVary
    return o
}

public external abstract class FunctionalEvent : ExtendableEvent {
    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface UnionClientOrMessagePortOrServiceWorker

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ServiceWorkerState {
    companion object
}

public inline val ServiceWorkerState.Companion.PARSED: ServiceWorkerState get() = "parsed".asDynamic().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState get() = "installing".asDynamic().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState get() = "installed".asDynamic().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState get() = "activating".asDynamic().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState get() = "activated".asDynamic().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState get() = "redundant".asDynamic().unsafeCast<ServiceWorkerState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ServiceWorkerUpdateViaCache {
    companion object
}

public inline val ServiceWorkerUpdateViaCache.Companion.IMPORTS: ServiceWorkerUpdateViaCache get() = "imports".asDynamic().unsafeCast<ServiceWorkerUpdateViaCache>()

public inline val ServiceWorkerUpdateViaCache.Companion.ALL: ServiceWorkerUpdateViaCache get() = "all".asDynamic().unsafeCast<ServiceWorkerUpdateViaCache>()

public inline val ServiceWorkerUpdateViaCache.Companion.NONE: ServiceWorkerUpdateViaCache get() = "none".asDynamic().unsafeCast<ServiceWorkerUpdateViaCache>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface FrameType {
    companion object
}

public inline val FrameType.Companion.AUXILIARY: FrameType get() = "auxiliary".asDynamic().unsafeCast<FrameType>()

public inline val FrameType.Companion.TOP_LEVEL: FrameType get() = "top-level".asDynamic().unsafeCast<FrameType>()

public inline val FrameType.Companion.NESTED: FrameType get() = "nested".asDynamic().unsafeCast<FrameType>()

public inline val FrameType.Companion.NONE: FrameType get() = "none".asDynamic().unsafeCast<FrameType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ClientType {
    companion object
}

public inline val ClientType.Companion.WINDOW: ClientType get() = "window".asDynamic().unsafeCast<ClientType>()

public inline val ClientType.Companion.WORKER: ClientType get() = "worker".asDynamic().unsafeCast<ClientType>()

public inline val ClientType.Companion.SHAREDWORKER: ClientType get() = "sharedworker".asDynamic().unsafeCast<ClientType>()

public inline val ClientType.Companion.ALL: ClientType get() = "all".asDynamic().unsafeCast<ClientType>()