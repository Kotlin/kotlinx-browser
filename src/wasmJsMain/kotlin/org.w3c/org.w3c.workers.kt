/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
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
public actual external abstract class ServiceWorker : EventTarget, AbstractWorker, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker, JsAny {
    actual open val scriptURL: String
    actual open val state: ServiceWorkerState
    actual open var onstatechange: ((Event) -> Unit)?
    actual fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
}

/**
 * Exposes the JavaScript [ServiceWorkerRegistration](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerRegistration) to Kotlin
 */
public actual external abstract class ServiceWorkerRegistration : EventTarget, JsAny {
    actual open val installing: ServiceWorker?
    actual open val waiting: ServiceWorker?
    actual open val active: ServiceWorker?
    actual open val scope: String
    actual open var onupdatefound: ((Event) -> Unit)?
    actual open val APISpace: JsAny?
    actual fun update(): Promise<Nothing?>
    actual fun unregister(): Promise<JsBoolean>
    actual fun showNotification(title: String, options: NotificationOptions): Promise<Nothing?>
    actual fun getNotifications(filter: GetNotificationOptions): Promise<JsArray<Notification>>
    actual fun methodName(): Promise<JsAny?>
}

/**
 * Exposes the JavaScript [ServiceWorkerContainer](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerContainer) to Kotlin
 */
public actual external abstract class ServiceWorkerContainer : EventTarget, JsAny {
    actual open val controller: ServiceWorker?
    actual open val ready: Promise<ServiceWorkerRegistration>
    actual open var oncontrollerchange: ((Event) -> Unit)?
    actual open var onmessage: ((MessageEvent) -> Unit)?
    actual fun register(scriptURL: String, options: RegistrationOptions): Promise<ServiceWorkerRegistration>
    actual fun getRegistration(clientURL: String): Promise<JsAny?>
    actual fun getRegistrations(): Promise<JsArray<ServiceWorkerRegistration>>
    actual fun startMessages()
}

public actual external interface RegistrationOptions : JsAny {
    actual var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var type: WorkerType? /* = WorkerType.CLASSIC */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun RegistrationOptions(scope: String?, type: WorkerType?): RegistrationOptions = js("({ scope: scope, type: type })")

/**
 * Exposes the JavaScript [ServiceWorkerMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerMessageEvent) to Kotlin
 */
public actual external open class ServiceWorkerMessageEvent actual constructor(type: String, eventInitDict: ServiceWorkerMessageEventInit) : Event, JsAny {
    actual open val data: JsAny?
    actual open val origin: String
    actual open val lastEventId: String
    actual open val source: UnionMessagePortOrServiceWorker?
    actual open val ports: JsArray<out MessagePort>?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface ServiceWorkerMessageEventInit : EventInit, JsAny {
    actual var data: JsAny?
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
    actual var ports: JsArray<MessagePort>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ServiceWorkerMessageEventInit(data: JsAny?, origin: String?, lastEventId: String?, source: UnionMessagePortOrServiceWorker?, ports: JsArray<MessagePort>?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ServiceWorkerMessageEventInit = js("({ data: data, origin: origin, lastEventId: lastEventId, source: source, ports: ports, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [ServiceWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerGlobalScope) to Kotlin
 */
public actual external abstract class ServiceWorkerGlobalScope : WorkerGlobalScope, JsAny {
    actual open val clients: Clients
    actual open val registration: ServiceWorkerRegistration
    actual open var oninstall: ((Event) -> Unit)?
    actual open var onactivate: ((Event) -> Unit)?
    actual open var onfetch: ((FetchEvent) -> Unit)?
    actual open var onforeignfetch: ((Event) -> Unit)?
    actual open var onmessage: ((MessageEvent) -> Unit)?
    actual open var onnotificationclick: ((NotificationEvent) -> Unit)?
    actual open var onnotificationclose: ((NotificationEvent) -> Unit)?
    actual open var onfunctionalevent: ((Event) -> Unit)?
    actual fun skipWaiting(): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [Client](https://developer.mozilla.org/en/docs/Web/API/Client) to Kotlin
 */
public actual external abstract class Client : UnionClientOrMessagePortOrServiceWorker, JsAny {
    actual open val url: String
    actual open val frameType: FrameType
    actual open val id: String
    actual fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
}

/**
 * Exposes the JavaScript [WindowClient](https://developer.mozilla.org/en/docs/Web/API/WindowClient) to Kotlin
 */
public actual external abstract class WindowClient : Client, JsAny {
    actual open val visibilityState: JsAny?
    actual open val focused: Boolean
    actual fun focus(): Promise<WindowClient>
    actual fun navigate(url: String): Promise<WindowClient>
}

/**
 * Exposes the JavaScript [Clients](https://developer.mozilla.org/en/docs/Web/API/Clients) to Kotlin
 */
public actual external abstract class Clients : JsAny {
    actual fun get(id: String): Promise<JsAny?>
    actual fun matchAll(options: ClientQueryOptions): Promise<JsArray<Client>>
    actual fun openWindow(url: String): Promise<WindowClient?>
    actual fun claim(): Promise<Nothing?>
}

public actual external interface ClientQueryOptions : JsAny {
    actual var includeUncontrolled: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var type: ClientType? /* = ClientType.WINDOW */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ClientQueryOptions(includeUncontrolled: Boolean?, type: ClientType?): ClientQueryOptions = js("({ includeUncontrolled: includeUncontrolled, type: type })")

/**
 * Exposes the JavaScript [ExtendableEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableEvent) to Kotlin
 */
public actual external open class ExtendableEvent actual constructor(type: String, eventInitDict: ExtendableEventInit) : Event, JsAny {
    actual fun waitUntil(f: Promise<JsAny?>)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface ExtendableEventInit : EventInit, JsAny

@Suppress("UNUSED_PARAMETER")
public actual fun ExtendableEventInit(bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ExtendableEventInit = js("({ bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [InstallEvent](https://developer.mozilla.org/en/docs/Web/API/InstallEvent) to Kotlin
 */
public actual external open class InstallEvent actual constructor(type: String, eventInitDict: ExtendableEventInit) : ExtendableEvent, JsAny {
    actual fun registerForeignFetch(options: ForeignFetchOptions)

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface ForeignFetchOptions : JsAny {
    actual var scopes: JsArray<JsString>?
    actual var origins: JsArray<JsString>?
}

@Suppress("UNUSED_PARAMETER")
public actual fun ForeignFetchOptions(scopes: JsArray<JsString>?, origins: JsArray<JsString>?): ForeignFetchOptions = js("({ scopes: scopes, origins: origins })")

/**
 * Exposes the JavaScript [FetchEvent](https://developer.mozilla.org/en/docs/Web/API/FetchEvent) to Kotlin
 */
public actual external open class FetchEvent actual constructor(type: String, eventInitDict: FetchEventInit) : ExtendableEvent, JsAny {
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

public actual external interface FetchEventInit : ExtendableEventInit, JsAny {
    actual var request: Request?
    actual var clientId: String? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var isReload: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun FetchEventInit(request: Request?, clientId: String?, isReload: Boolean?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): FetchEventInit = js("({ request: request, clientId: clientId, isReload: isReload, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external open class ForeignFetchEvent actual constructor(type: String, eventInitDict: ForeignFetchEventInit) : ExtendableEvent, JsAny {
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

public actual external interface ForeignFetchEventInit : ExtendableEventInit, JsAny {
    actual var request: Request?
    actual var origin: String? /* = "null" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ForeignFetchEventInit(request: Request?, origin: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ForeignFetchEventInit = js("({ request: request, origin: origin, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external interface ForeignFetchResponse : JsAny {
    actual var response: Response?
    actual var origin: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var headers: JsArray<JsString>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ForeignFetchResponse(response: Response?, origin: String?, headers: JsArray<JsString>?): ForeignFetchResponse = js("({ response: response, origin: origin, headers: headers })")

/**
 * Exposes the JavaScript [ExtendableMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableMessageEvent) to Kotlin
 */
public actual external open class ExtendableMessageEvent actual constructor(type: String, eventInitDict: ExtendableMessageEventInit) : ExtendableEvent, JsAny {
    actual open val data: JsAny?
    actual open val origin: String
    actual open val lastEventId: String
    actual open val source: UnionClientOrMessagePortOrServiceWorker?
    actual open val ports: JsArray<out MessagePort>?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface ExtendableMessageEventInit : ExtendableEventInit, JsAny {
    actual var data: JsAny?
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
    actual var ports: JsArray<MessagePort>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ExtendableMessageEventInit(data: JsAny?, origin: String?, lastEventId: String?, source: UnionClientOrMessagePortOrServiceWorker?, ports: JsArray<MessagePort>?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): ExtendableMessageEventInit = js("({ data: data, origin: origin, lastEventId: lastEventId, source: source, ports: ports, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [Cache](https://developer.mozilla.org/en/docs/Web/API/Cache) to Kotlin
 */
public actual external abstract class Cache : JsAny {
    actual fun match(request: Request, options: CacheQueryOptions): Promise<JsAny?>
    actual fun match(request: String, options: CacheQueryOptions): Promise<JsAny?>
    actual fun matchAll(request: Request, options: CacheQueryOptions): Promise<JsArray<Response>>
    actual fun matchAll(request: String, options: CacheQueryOptions): Promise<JsArray<Response>>
    actual fun matchAll(): Promise<JsArray<Response>>
    actual fun add(request: Request): Promise<Nothing?>
    actual fun add(request: String): Promise<Nothing?>
    actual fun addAll(requests: JsArray<JsAny? /* Request|String */>): Promise<Nothing?>
    actual fun put(request: Request, response: Response): Promise<Nothing?>
    actual fun put(request: String, response: Response): Promise<Nothing?>
    actual fun delete(request: Request, options: CacheQueryOptions): Promise<JsBoolean>
    actual fun delete(request: String, options: CacheQueryOptions): Promise<JsBoolean>
    actual fun keys(request: Request, options: CacheQueryOptions): Promise<JsArray<Request>>
    actual fun keys(request: String, options: CacheQueryOptions): Promise<JsArray<Request>>
    actual fun keys(): Promise<JsArray<Request>>
}

public actual external interface CacheQueryOptions : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun CacheQueryOptions(ignoreSearch: Boolean?, ignoreMethod: Boolean?, ignoreVary: Boolean?, cacheName: String?): CacheQueryOptions = js("({ ignoreSearch: ignoreSearch, ignoreMethod: ignoreMethod, ignoreVary: ignoreVary, cacheName: cacheName })")

public actual external interface CacheBatchOperation : JsAny {
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

@Suppress("UNUSED_PARAMETER")
public actual fun CacheBatchOperation(type: String?, request: Request?, response: Response?, options: CacheQueryOptions?): CacheBatchOperation = js("({ type: type, request: request, response: response, options: options })")

/**
 * Exposes the JavaScript [CacheStorage](https://developer.mozilla.org/en/docs/Web/API/CacheStorage) to Kotlin
 */
public actual external abstract class CacheStorage : JsAny {
    actual fun match(request: Request, options: CacheQueryOptions): Promise<JsAny?>
    actual fun match(request: String, options: CacheQueryOptions): Promise<JsAny?>
    actual fun has(cacheName: String): Promise<JsBoolean>
    actual fun open(cacheName: String): Promise<Cache>
    actual fun delete(cacheName: String): Promise<JsBoolean>
    actual fun keys(): Promise<JsArray<JsString>>
}

public actual external open class FunctionalEvent : ExtendableEvent, JsAny {
    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface UnionMessagePortOrServiceWorker

public actual external interface UnionClientOrMessagePortOrServiceWorker

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ServiceWorkerState : JsAny {
    actual companion object
}

public actual inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState get() = "installing".toJsString().unsafeCast<ServiceWorkerState>()

public actual inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState get() = "installed".toJsString().unsafeCast<ServiceWorkerState>()

public actual inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState get() = "activating".toJsString().unsafeCast<ServiceWorkerState>()

public actual inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState get() = "activated".toJsString().unsafeCast<ServiceWorkerState>()

public actual inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState get() = "redundant".toJsString().unsafeCast<ServiceWorkerState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface FrameType : JsAny {
    actual companion object
}

public actual inline val FrameType.Companion.AUXILIARY: FrameType get() = "auxiliary".toJsString().unsafeCast<FrameType>()

public actual inline val FrameType.Companion.TOP_LEVEL: FrameType get() = "top-level".toJsString().unsafeCast<FrameType>()

public actual inline val FrameType.Companion.NESTED: FrameType get() = "nested".toJsString().unsafeCast<FrameType>()

public actual inline val FrameType.Companion.NONE: FrameType get() = "none".toJsString().unsafeCast<FrameType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ClientType : JsAny {
    actual companion object
}

public actual inline val ClientType.Companion.WINDOW: ClientType get() = "window".toJsString().unsafeCast<ClientType>()

public actual inline val ClientType.Companion.WORKER: ClientType get() = "worker".toJsString().unsafeCast<ClientType>()

public actual inline val ClientType.Companion.SHAREDWORKER: ClientType get() = "sharedworker".toJsString().unsafeCast<ClientType>()

public actual inline val ClientType.Companion.ALL: ClientType get() = "all".toJsString().unsafeCast<ClientType>()