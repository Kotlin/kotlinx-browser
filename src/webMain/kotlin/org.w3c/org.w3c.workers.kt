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
public expect abstract class ServiceWorker : EventTarget, AbstractWorker, UnionMessagePortOrServiceWorker, UnionClientOrMessagePortOrServiceWorker, JsAny {
    open val scriptURL: String
    open val state: ServiceWorkerState
    open var onstatechange: ((Event) -> Unit)?
    fun postMessage(message: JsAny?, transfer: JsArray<JsAny> = definedExternally)
}

/**
 * Exposes the JavaScript [ServiceWorkerRegistration](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerRegistration) to Kotlin
 */
public expect abstract class ServiceWorkerRegistration : EventTarget, JsAny {
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
public expect abstract class ServiceWorkerContainer : EventTarget, JsAny {
    open val controller: ServiceWorker?
    open val ready: Promise<ServiceWorkerRegistration>
    open var oncontrollerchange: ((Event) -> Unit)?
    open var onmessage: ((MessageEvent) -> Unit)?
    fun register(scriptURL: String, options: RegistrationOptions = definedExternally): Promise<ServiceWorkerRegistration>
    fun getRegistration(clientURL: String = definedExternally): Promise<JsAny?>
    fun getRegistrations(): Promise<JsArray<ServiceWorkerRegistration>>
    fun startMessages()
}

public expect interface RegistrationOptions : JsAny {
    open var scope: String?
    open var type: WorkerType? /* = WorkerType.CLASSIC */
}

@Suppress("UNUSED_PARAMETER")
public expect fun RegistrationOptions(scope: String? = undefined, type: WorkerType? = WorkerType.CLASSIC): RegistrationOptions

/**
 * Exposes the JavaScript [ServiceWorkerMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerMessageEvent) to Kotlin
 */
public expect open class ServiceWorkerMessageEvent(type: String, eventInitDict: ServiceWorkerMessageEventInit = definedExternally) : Event, JsAny {
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

public expect interface ServiceWorkerMessageEventInit : EventInit, JsAny {
    open var data: JsAny?
    open var origin: String?
    open var lastEventId: String?
    open var source: UnionMessagePortOrServiceWorker?
    open var ports: JsArray<MessagePort>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ServiceWorkerMessageEventInit(data: JsAny? = undefined, origin: String? = undefined, lastEventId: String? = undefined, source: UnionMessagePortOrServiceWorker? = undefined, ports: JsArray<MessagePort>? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ServiceWorkerMessageEventInit

/**
 * Exposes the JavaScript [ServiceWorkerGlobalScope](https://developer.mozilla.org/en/docs/Web/API/ServiceWorkerGlobalScope) to Kotlin
 */
public expect abstract class ServiceWorkerGlobalScope : WorkerGlobalScope, JsAny {
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
public expect abstract class Client : UnionClientOrMessagePortOrServiceWorker, JsAny {
    open val url: String
    open val frameType: FrameType
    open val id: String
    fun postMessage(message: JsAny?, transfer: JsArray<JsAny> = definedExternally)
}

/**
 * Exposes the JavaScript [WindowClient](https://developer.mozilla.org/en/docs/Web/API/WindowClient) to Kotlin
 */
public expect abstract class WindowClient : Client, JsAny {
    open val visibilityState: JsAny?
    open val focused: Boolean
    fun focus(): Promise<WindowClient>
    fun navigate(url: String): Promise<WindowClient>
}

/**
 * Exposes the JavaScript [Clients](https://developer.mozilla.org/en/docs/Web/API/Clients) to Kotlin
 */
public expect abstract class Clients : JsAny {
    fun get(id: String): Promise<JsAny?>
    fun matchAll(options: ClientQueryOptions = definedExternally): Promise<JsArray<Client>>
    fun openWindow(url: String): Promise<WindowClient?>
    fun claim(): Promise<Nothing?>
}

public expect interface ClientQueryOptions : JsAny {
    open var includeUncontrolled: Boolean? /* = false */
    open var type: ClientType? /* = ClientType.WINDOW */
}

@Suppress("UNUSED_PARAMETER")
public expect fun ClientQueryOptions(includeUncontrolled: Boolean? = false, type: ClientType? = ClientType.WINDOW): ClientQueryOptions

/**
 * Exposes the JavaScript [ExtendableEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableEvent) to Kotlin
 */
public expect open class ExtendableEvent(type: String, eventInitDict: ExtendableEventInit = definedExternally) : Event, JsAny {
    fun waitUntil(f: Promise<JsAny?>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface ExtendableEventInit : EventInit, JsAny

@Suppress("UNUSED_PARAMETER")
public expect fun ExtendableEventInit(bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableEventInit

/**
 * Exposes the JavaScript [InstallEvent](https://developer.mozilla.org/en/docs/Web/API/InstallEvent) to Kotlin
 */
public expect open class InstallEvent(type: String, eventInitDict: ExtendableEventInit = definedExternally) : ExtendableEvent, JsAny {
    fun registerForeignFetch(options: ForeignFetchOptions)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface ForeignFetchOptions : JsAny {
    var scopes: JsArray<JsString>?
    var origins: JsArray<JsString>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ForeignFetchOptions(scopes: JsArray<JsString>?, origins: JsArray<JsString>?): ForeignFetchOptions

/**
 * Exposes the JavaScript [FetchEvent](https://developer.mozilla.org/en/docs/Web/API/FetchEvent) to Kotlin
 */
public expect open class FetchEvent(type: String, eventInitDict: FetchEventInit) : ExtendableEvent, JsAny {
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

public expect interface FetchEventInit : ExtendableEventInit, JsAny {
    var request: Request?
    open var clientId: String? /* = null */
    open var isReload: Boolean? /* = false */
}

@Suppress("UNUSED_PARAMETER")
public expect fun FetchEventInit(request: Request?, clientId: String? = null, isReload: Boolean? = false, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): FetchEventInit

public expect open class ForeignFetchEvent(type: String, eventInitDict: ForeignFetchEventInit) : ExtendableEvent, JsAny {
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

public expect interface ForeignFetchEventInit : ExtendableEventInit, JsAny {
    var request: Request?
    open var origin: String? /* = "null" */
}

@Suppress("UNUSED_PARAMETER")
public expect fun ForeignFetchEventInit(request: Request?, origin: String? = "null", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ForeignFetchEventInit

public expect interface ForeignFetchResponse : JsAny {
    var response: Response?
    open var origin: String?
    open var headers: JsArray<JsString>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ForeignFetchResponse(response: Response?, origin: String? = undefined, headers: JsArray<JsString>? = undefined): ForeignFetchResponse

/**
 * Exposes the JavaScript [ExtendableMessageEvent](https://developer.mozilla.org/en/docs/Web/API/ExtendableMessageEvent) to Kotlin
 */
public expect open class ExtendableMessageEvent(type: String, eventInitDict: ExtendableMessageEventInit = definedExternally) : ExtendableEvent, JsAny {
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

public expect interface ExtendableMessageEventInit : ExtendableEventInit, JsAny {
    open var data: JsAny?
    open var origin: String?
    open var lastEventId: String?
    open var source: UnionClientOrMessagePortOrServiceWorker?
    open var ports: JsArray<MessagePort>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ExtendableMessageEventInit(data: JsAny? = undefined, origin: String? = undefined, lastEventId: String? = undefined, source: UnionClientOrMessagePortOrServiceWorker? = undefined, ports: JsArray<MessagePort>? = undefined, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): ExtendableMessageEventInit

/**
 * Exposes the JavaScript [Cache](https://developer.mozilla.org/en/docs/Web/API/Cache) to Kotlin
 */
public expect abstract class Cache : JsAny {
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

public expect interface CacheQueryOptions : JsAny {
    open var ignoreSearch: Boolean? /* = false */
    open var ignoreMethod: Boolean? /* = false */
    open var ignoreVary: Boolean? /* = false */
    open var cacheName: String?
}

@Suppress("UNUSED_PARAMETER")
public expect fun CacheQueryOptions(ignoreSearch: Boolean? = false, ignoreMethod: Boolean? = false, ignoreVary: Boolean? = false, cacheName: String? = undefined): CacheQueryOptions

public expect interface CacheBatchOperation : JsAny {
    open var type: String?
    open var request: Request?
    open var response: Response?
    open var options: CacheQueryOptions?
}

@Suppress("UNUSED_PARAMETER")
public expect fun CacheBatchOperation(type: String? = undefined, request: Request? = undefined, response: Response? = undefined, options: CacheQueryOptions? = undefined): CacheBatchOperation

/**
 * Exposes the JavaScript [CacheStorage](https://developer.mozilla.org/en/docs/Web/API/CacheStorage) to Kotlin
 */
public expect abstract class CacheStorage : JsAny {
    fun match(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsAny?>
    fun match(request: String, options: CacheQueryOptions = definedExternally): Promise<JsAny?>
    fun has(cacheName: String): Promise<JsBoolean>
    fun open(cacheName: String): Promise<Cache>
    fun delete(cacheName: String): Promise<JsBoolean>
    fun keys(): Promise<JsArray<JsString>>
}

public expect open class FunctionalEvent : ExtendableEvent, JsAny {
    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface UnionMessagePortOrServiceWorker

public expect interface UnionClientOrMessagePortOrServiceWorker

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface ServiceWorkerState : JsAny {
    companion object
}

public expect inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState

public expect inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState

public expect inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState

public expect inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState

public expect inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface FrameType : JsAny {
    companion object
}

public expect inline val FrameType.Companion.AUXILIARY: FrameType

public expect inline val FrameType.Companion.TOP_LEVEL: FrameType

public expect inline val FrameType.Companion.NESTED: FrameType

public expect inline val FrameType.Companion.NONE: FrameType

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface ClientType : JsAny {
    companion object
}

public expect inline val ClientType.Companion.WINDOW: ClientType

public expect inline val ClientType.Companion.WORKER: ClientType

public expect inline val ClientType.Companion.SHAREDWORKER: ClientType

public expect inline val ClientType.Companion.ALL: ClientType