/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
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
import org.w3c.undefined

/**
 * Exposes the JavaScript [ServiceWorker](https://developer.mozilla.org/en/docs/Web/API/ServiceWorker) to Kotlin
 */
public external abstract class ServiceWorker : EventTarget, AbstractWorker, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker, JsAny {
    open val scriptURL: String
    open val state: ServiceWorkerState
    open var onstatechange: ((Event) -> Unit)?
    fun postMessage(message: JsAny?, transfer: JsArray<JsAny> = definedExternally)
}

/**
 * Exposes the JavaScript [ServiceWorkerRegistration](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerRegistration) to Kotlin
 */
public external abstract class ServiceWorkerRegistration : EventTarget, JsAny {
    open val installing: ServiceWorker?
    open val waiting: ServiceWorker?
    open val active: ServiceWorker?
    open val scope: String
    open var onupdatefound: ((Event) -> Unit)?
    open val APISpace: JsAny?
    fun update(): Promise<Nothing?>
    fun unregister(): Promise<JsBoolean>
    fun showNotification(title: String, options: NotificationOptions = definedExternally): Promise<Nothing?>
    fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<JsArray<Notification>>
    fun methodName(): Promise<JsAny?>
}

/**
 * Exposes the JavaScript [ServiceWorkerContainer](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerContainer) to Kotlin
 */
public external abstract class ServiceWorkerContainer : EventTarget, JsAny {
    open val controller: ServiceWorker?
    open val ready: Promise<ServiceWorkerRegistration>
    open var oncontrollerchange: ((Event) -> Unit)?
    open var onmessage: ((MessageEvent) -> Unit)?
    fun register(scriptURL: String, options: RegistrationOptions = definedExternally): Promise<ServiceWorkerRegistration>
    fun getRegistration(clientURL: String = definedExternally): Promise<JsAny?>
    fun getRegistrations(): Promise<JsArray<ServiceWorkerRegistration>>
    fun startMessages()
}

public external interface RegistrationOptions : JsAny {
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun RegistrationOptions(scope: String? = undefined, type: WorkerType? = WorkerType.CLASSIC): RegistrationOptions = js("({ scope: scope, type: type })")

/**
 * Exposes the JavaScript [ServiceWorkerMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerMessageEvent) to Kotlin
 */
public external open class ServiceWorkerMessageEvent(type: String, eventInitDict: ServiceWorkerMessageEventInit = definedExternally) : Event, JsAny {
    open val data: JsAny?
    open val origin: String
    open val lastEventId: String
    open val source: UnionMessagePortOrServiceWorker?
    open val ports: JsArray<out MessagePort>?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ServiceWorkerMessageEventInit : EventInit, JsAny {
    var data: JsAny?
        get() = definedExternally
        set(value) = definedExternally
    var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastEventId: String?
        get() = definedExternally
        set(value) = definedExternally
    var source: UnionMessagePortOrServiceWorker?
        get() = definedExternally
        set(value) = definedExternally
    var ports: JsArray<MessagePort>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun ServiceWorkerMessageEventInit(data: JsAny? = undefined, origin: String? = undefined, lastEventId: String? = undefined, source: UnionMessagePortOrServiceWorker? = undefined, ports: JsArray<MessagePort>? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ServiceWorkerMessageEventInit = js("({ data: data, origin: origin, lastEventId: lastEventId, source: source, ports: ports, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [ServiceWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerGlobalScope) to Kotlin
 */
public external abstract class ServiceWorkerGlobalScope : WorkerGlobalScope, JsAny {
    open val clients: Clients
    open val registration: ServiceWorkerRegistration
    open var oninstall: ((Event) -> Unit)?
    open var onactivate: ((Event) -> Unit)?
    open var onfetch: ((FetchEvent) -> Unit)?
    open var onforeignfetch: ((Event) -> Unit)?
    open var onmessage: ((MessageEvent) -> Unit)?
    open var onnotificationclick: ((NotificationEvent) -> Unit)?
    open var onnotificationclose: ((NotificationEvent) -> Unit)?
    open var onfunctionalevent: ((Event) -> Unit)?
    fun skipWaiting(): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [Client](https://developer.mozilla.org/en/docs/Web/API/Client) to Kotlin
 */
public external abstract class Client : UnionClientOrMessagePortOrServiceWorker, JsAny {
    open val url: String
    open val frameType: FrameType
    open val id: String
    fun postMessage(message: JsAny?, transfer: JsArray<JsAny> = definedExternally)
}

/**
 * Exposes the JavaScript [WindowClient](https://developer.mozilla.org/en/docs/Web/API/WindowClient) to Kotlin
 */
public external abstract class WindowClient : Client, JsAny {
    open val visibilityState: JsAny?
    open val focused: Boolean
    fun focus(): Promise<WindowClient>
    fun navigate(url: String): Promise<WindowClient>
}

/**
 * Exposes the JavaScript [Clients](https://developer.mozilla.org/en/docs/Web/API/Clients) to Kotlin
 */
public external abstract class Clients : JsAny {
    fun get(id: String): Promise<JsAny?>
    fun matchAll(options: ClientQueryOptions = definedExternally): Promise<JsArray<Client>>
    fun openWindow(url: String): Promise<WindowClient?>
    fun claim(): Promise<Nothing?>
}

public external interface ClientQueryOptions : JsAny {
    var includeUncontrolled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var type: ClientType? /* = ClientType.WINDOW */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun ClientQueryOptions(includeUncontrolled: Boolean? = false, type: ClientType? = ClientType.WINDOW): ClientQueryOptions = js("({ includeUncontrolled: includeUncontrolled, type: type })")

/**
 * Exposes the JavaScript [ExtendableEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableEvent) to Kotlin
 */
public external open class ExtendableEvent(type: String, eventInitDict: ExtendableEventInit = definedExternally) : Event, JsAny {
    fun waitUntil(f: Promise<JsAny?>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ExtendableEventInit : EventInit, JsAny

@Suppress("UNUSED_PARAMETER")
public fun ExtendableEventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableEventInit = js("({ bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [InstallEvent](https://developer.mozilla.org/en/docs/Web/API/InstallEvent) to Kotlin
 */
public external open class InstallEvent(type: String, eventInitDict: ExtendableEventInit = definedExternally) : ExtendableEvent, JsAny {
    fun registerForeignFetch(options: ForeignFetchOptions)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ForeignFetchOptions : JsAny {
    var scopes: JsArray<JsString>?
    var origins: JsArray<JsString>?
}

@Suppress("UNUSED_PARAMETER")
public fun ForeignFetchOptions(scopes: JsArray<JsString>?, origins: JsArray<JsString>?): ForeignFetchOptions = js("({ scopes: scopes, origins: origins })")

/**
 * Exposes the JavaScript [FetchEvent](https://developer.mozilla.org/en/docs/Web/API/FetchEvent) to Kotlin
 */
public external open class FetchEvent(type: String, eventInitDict: FetchEventInit) : ExtendableEvent, JsAny {
    open val request: Request
    open val clientId: String?
    open val isReload: Boolean
    fun respondWith(r: Promise<Response>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface FetchEventInit : ExtendableEventInit, JsAny {
    var request: Request?
    var clientId: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var isReload: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun FetchEventInit(request: Request?, clientId: String? = null, isReload: Boolean? = false, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): FetchEventInit = js("({ request: request, clientId: clientId, isReload: isReload, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public external open class ForeignFetchEvent(type: String, eventInitDict: ForeignFetchEventInit) : ExtendableEvent, JsAny {
    open val request: Request
    open val origin: String
    fun respondWith(r: Promise<ForeignFetchResponse>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ForeignFetchEventInit : ExtendableEventInit, JsAny {
    var request: Request?
    var origin: String? /* = "null" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun ForeignFetchEventInit(request: Request?, origin: String? = "null", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ForeignFetchEventInit = js("({ request: request, origin: origin, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public external interface ForeignFetchResponse : JsAny {
    var response: Response?
    var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: JsArray<JsString>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun ForeignFetchResponse(response: Response?, origin: String? = undefined, headers: JsArray<JsString>? = undefined): ForeignFetchResponse = js("({ response: response, origin: origin, headers: headers })")

/**
 * Exposes the JavaScript [ExtendableMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableMessageEvent) to Kotlin
 */
public external open class ExtendableMessageEvent(type: String, eventInitDict: ExtendableMessageEventInit = definedExternally) : ExtendableEvent, JsAny {
    open val data: JsAny?
    open val origin: String
    open val lastEventId: String
    open val source: UnionClientOrMessagePortOrServiceWorker?
    open val ports: JsArray<out MessagePort>?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ExtendableMessageEventInit : ExtendableEventInit, JsAny {
    var data: JsAny?
        get() = definedExternally
        set(value) = definedExternally
    var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    var lastEventId: String?
        get() = definedExternally
        set(value) = definedExternally
    var source: UnionClientOrMessagePortOrServiceWorker?
        get() = definedExternally
        set(value) = definedExternally
    var ports: JsArray<MessagePort>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun ExtendableMessageEventInit(data: JsAny? = undefined, origin: String? = undefined, lastEventId: String? = undefined, source: UnionClientOrMessagePortOrServiceWorker? = undefined, ports: JsArray<MessagePort>? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableMessageEventInit = js("({ data: data, origin: origin, lastEventId: lastEventId, source: source, ports: ports, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [Cache](https://developer.mozilla.org/en/docs/Web/API/Cache) to Kotlin
 */
public external abstract class Cache : JsAny {
    fun match(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsAny?>
    fun match(request: String, options: CacheQueryOptions = definedExternally): Promise<JsAny?>
    fun matchAll(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsArray<Response>>
    fun matchAll(request: String, options: CacheQueryOptions = definedExternally): Promise<JsArray<Response>>
    fun matchAll(): Promise<JsArray<Response>>
    fun add(request: Request): Promise<Nothing?>
    fun add(request: String): Promise<Nothing?>
    fun addAll(requests: JsArray<JsAny? /* Request|String */>): Promise<Nothing?>
    fun put(request: Request, response: Response): Promise<Nothing?>
    fun put(request: String, response: Response): Promise<Nothing?>
    fun delete(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsBoolean>
    fun delete(request: String, options: CacheQueryOptions = definedExternally): Promise<JsBoolean>
    fun keys(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsArray<Request>>
    fun keys(request: String, options: CacheQueryOptions = definedExternally): Promise<JsArray<Request>>
    fun keys(): Promise<JsArray<Request>>
}

public external interface CacheQueryOptions : JsAny {
    var ignoreSearch: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreMethod: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreVary: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var cacheName: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun CacheQueryOptions(ignoreSearch: Boolean? = false, ignoreMethod: Boolean? = false, ignoreVary: Boolean? = false, cacheName: String? = undefined): CacheQueryOptions = js("({ ignoreSearch: ignoreSearch, ignoreMethod: ignoreMethod, ignoreVary: ignoreVary, cacheName: cacheName })")

public external interface CacheBatchOperation : JsAny {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var request: Request?
        get() = definedExternally
        set(value) = definedExternally
    var response: Response?
        get() = definedExternally
        set(value) = definedExternally
    var options: CacheQueryOptions?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public fun CacheBatchOperation(type: String? = undefined, request: Request? = undefined, response: Response? = undefined, options: CacheQueryOptions? = undefined): CacheBatchOperation = js("({ type: type, request: request, response: response, options: options })")

/**
 * Exposes the JavaScript [CacheStorage](https://developer.mozilla.org/en/docs/Web/API/CacheStorage) to Kotlin
 */
public external abstract class CacheStorage : JsAny {
    fun match(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsAny?>
    fun match(request: String, options: CacheQueryOptions = definedExternally): Promise<JsAny?>
    fun has(cacheName: String): Promise<JsBoolean>
    fun open(cacheName: String): Promise<Cache>
    fun delete(cacheName: String): Promise<JsBoolean>
    fun keys(): Promise<JsArray<JsString>>
}

public external open class FunctionalEvent : ExtendableEvent, JsAny {
    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface UnionMessagePortOrServiceWorker

public external interface UnionClientOrMessagePortOrServiceWorker

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ServiceWorkerState : JsAny {
    companion object
}

public inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState get() = "installing".toJsString().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState get() = "installed".toJsString().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState get() = "activating".toJsString().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState get() = "activated".toJsString().unsafeCast<ServiceWorkerState>()

public inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState get() = "redundant".toJsString().unsafeCast<ServiceWorkerState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface FrameType : JsAny {
    companion object
}

public inline val FrameType.Companion.AUXILIARY: FrameType get() = "auxiliary".toJsString().unsafeCast<FrameType>()

public inline val FrameType.Companion.TOP_LEVEL: FrameType get() = "top-level".toJsString().unsafeCast<FrameType>()

public inline val FrameType.Companion.NESTED: FrameType get() = "nested".toJsString().unsafeCast<FrameType>()

public inline val FrameType.Companion.NONE: FrameType get() = "none".toJsString().unsafeCast<FrameType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface ClientType : JsAny {
    companion object
}

public inline val ClientType.Companion.WINDOW: ClientType get() = "window".toJsString().unsafeCast<ClientType>()

public inline val ClientType.Companion.WORKER: ClientType get() = "worker".toJsString().unsafeCast<ClientType>()

public inline val ClientType.Companion.SHAREDWORKER: ClientType get() = "sharedworker".toJsString().unsafeCast<ClientType>()

public inline val ClientType.Companion.ALL: ClientType get() = "all".toJsString().unsafeCast<ClientType>()