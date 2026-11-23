/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'service-workers', DO NOT EDIT!

package org.w3c.workers

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.fetch.*
import org.w3c.notifications.*

public external interface UnionClientOrMessagePortOrServiceWorker : JsAny

public external abstract class ServiceWorker : EventTarget, AbstractWorker, MessageEventSource, UnionClientOrMessagePortOrServiceWorker {
    open val scriptURL: String
    open val state: ServiceWorkerState
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)
    open var onstatechange: ((Event) -> Unit)?
}

public external interface ServiceWorkerState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ServiceWorkerState.Companion.PARSED: ServiceWorkerState get() = "parsed".toJsString().unsafeCast<ServiceWorkerState>()
public inline val ServiceWorkerState.Companion.INSTALLING: ServiceWorkerState get() = "installing".toJsString().unsafeCast<ServiceWorkerState>()
public inline val ServiceWorkerState.Companion.INSTALLED: ServiceWorkerState get() = "installed".toJsString().unsafeCast<ServiceWorkerState>()
public inline val ServiceWorkerState.Companion.ACTIVATING: ServiceWorkerState get() = "activating".toJsString().unsafeCast<ServiceWorkerState>()
public inline val ServiceWorkerState.Companion.ACTIVATED: ServiceWorkerState get() = "activated".toJsString().unsafeCast<ServiceWorkerState>()
public inline val ServiceWorkerState.Companion.REDUNDANT: ServiceWorkerState get() = "redundant".toJsString().unsafeCast<ServiceWorkerState>()

public external abstract class ServiceWorkerRegistration : EventTarget {
    open val installing: ServiceWorker?
    open val waiting: ServiceWorker?
    open val active: ServiceWorker?
    open val navigationPreload: NavigationPreloadManager
    open val scope: String
    open val updateViaCache: ServiceWorkerUpdateViaCache
    open fun update(): Promise<ServiceWorkerRegistration>
    open fun unregister(): Promise<JsBoolean>
    open var onupdatefound: ((Event) -> Unit)?
    open fun showNotification(title: String, options: NotificationOptions = definedExternally): Promise<JsAny?>
    open fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<JsArray<Notification>>
}

public external interface ServiceWorkerUpdateViaCache : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ServiceWorkerUpdateViaCache.Companion.IMPORTS: ServiceWorkerUpdateViaCache get() = "imports".toJsString().unsafeCast<ServiceWorkerUpdateViaCache>()
public inline val ServiceWorkerUpdateViaCache.Companion.ALL: ServiceWorkerUpdateViaCache get() = "all".toJsString().unsafeCast<ServiceWorkerUpdateViaCache>()
public inline val ServiceWorkerUpdateViaCache.Companion.NONE: ServiceWorkerUpdateViaCache get() = "none".toJsString().unsafeCast<ServiceWorkerUpdateViaCache>()

public external abstract class ServiceWorkerContainer : EventTarget {
    open val controller: ServiceWorker?
    open val ready: Promise<ServiceWorkerRegistration>
    open fun register(scriptURL: String, options: RegistrationOptions = definedExternally): Promise<ServiceWorkerRegistration>
    open fun getRegistration(clientURL: String = definedExternally): Promise<ServiceWorkerRegistration?>
    open fun getRegistrations(): Promise<JsArray<ServiceWorkerRegistration>>
    open fun startMessages()
    open var oncontrollerchange: ((Event) -> Unit)?
    open var onmessage: ((MessageEvent) -> Unit)?
    open var onmessageerror: ((MessageEvent) -> Unit)?
}

public external interface RegistrationOptions : JsAny {
    var scope: String?
    var type: WorkerType?
    var updateViaCache: ServiceWorkerUpdateViaCache?
}

public fun RegistrationOptions(scope: String? = null, type: WorkerType? = null, updateViaCache: ServiceWorkerUpdateViaCache? = null): RegistrationOptions = newJsObject<RegistrationOptions>().apply {
    if (scope != null) this.scope = scope
    if (type != null) this.type = type
    if (updateViaCache != null) this.updateViaCache = updateViaCache
}

public external abstract class NavigationPreloadManager : JsAny {
    open fun enable(): Promise<JsAny?>
    open fun disable(): Promise<JsAny?>
    open fun setHeaderValue(value: String): Promise<JsAny?>
    open fun getState(): Promise<NavigationPreloadState>
}

public external interface NavigationPreloadState : JsAny {
    var enabled: Boolean?
    var headerValue: String?
}

public fun NavigationPreloadState(enabled: Boolean? = null, headerValue: String? = null): NavigationPreloadState = newJsObject<NavigationPreloadState>().apply {
    if (enabled != null) this.enabled = enabled
    if (headerValue != null) this.headerValue = headerValue
}

public external abstract class ServiceWorkerGlobalScope : WorkerGlobalScope {
    open val clients: Clients
    open val registration: ServiceWorkerRegistration
    open val serviceWorker: ServiceWorker
    open fun skipWaiting(): Promise<JsAny?>
    open var oninstall: ((InstallEvent) -> Unit)?
    open var onactivate: ((ExtendableEvent) -> Unit)?
    open var onfetch: ((FetchEvent) -> Unit)?
    open var onmessage: ((ExtendableMessageEvent) -> Unit)?
    open var onmessageerror: ((ExtendableMessageEvent) -> Unit)?
    open var onnotificationclick: ((NotificationEvent) -> Unit)?
    open var onnotificationclose: ((NotificationEvent) -> Unit)?
}

public external abstract class Client : UnionClientOrMessagePortOrServiceWorker {
    open val url: String
    open val frameType: FrameType
    open val id: String
    open val type: ClientType
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)
}

public external abstract class WindowClient : Client {
    open val visibilityState: DocumentVisibilityState
    open val focused: Boolean
    open val ancestorOrigins: JsArray<JsString>
    open fun focus(): Promise<WindowClient>
    open fun navigate(url: String): Promise<WindowClient?>
}

public external interface FrameType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val FrameType.Companion.AUXILIARY: FrameType get() = "auxiliary".toJsString().unsafeCast<FrameType>()
public inline val FrameType.Companion.TOP_LEVEL: FrameType get() = "top-level".toJsString().unsafeCast<FrameType>()
public inline val FrameType.Companion.NESTED: FrameType get() = "nested".toJsString().unsafeCast<FrameType>()
public inline val FrameType.Companion.NONE: FrameType get() = "none".toJsString().unsafeCast<FrameType>()

public external abstract class Clients : JsAny {
    open fun get(id: String): Promise<Client?>
    open fun matchAll(options: ClientQueryOptions = definedExternally): Promise<JsArray<Client>>
    open fun openWindow(url: String): Promise<WindowClient?>
    open fun claim(): Promise<JsAny?>
}

public external interface ClientQueryOptions : JsAny {
    var includeUncontrolled: Boolean?
    var type: ClientType?
}

public fun ClientQueryOptions(includeUncontrolled: Boolean? = null, type: ClientType? = null): ClientQueryOptions = newJsObject<ClientQueryOptions>().apply {
    if (includeUncontrolled != null) this.includeUncontrolled = includeUncontrolled
    if (type != null) this.type = type
}

public external interface ClientType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ClientType.Companion.WINDOW: ClientType get() = "window".toJsString().unsafeCast<ClientType>()
public inline val ClientType.Companion.WORKER: ClientType get() = "worker".toJsString().unsafeCast<ClientType>()
public inline val ClientType.Companion.SHAREDWORKER: ClientType get() = "sharedworker".toJsString().unsafeCast<ClientType>()
public inline val ClientType.Companion.ALL: ClientType get() = "all".toJsString().unsafeCast<ClientType>()

public external open class ExtendableEvent : Event {
    constructor(type: String, eventInitDict: ExtendableEventInit = definedExternally)
    open fun waitUntil(f: Promise<JsAny?>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ExtendableEventInit : EventInit

public fun ExtendableEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): ExtendableEventInit = newJsObject<ExtendableEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

public external open class InstallEvent : ExtendableEvent {
    constructor(type: String, eventInitDict: ExtendableEventInit = definedExternally)
    open fun addRoutes(rules: RouterRule): Promise<JsAny?>
    open fun addRoutes(rules: JsArray<RouterRule>): Promise<JsAny?>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface RouterRule : JsAny {
    var condition: RouterCondition
    var source: JsAny
}

public fun RouterRule(condition: RouterCondition, source: JsAny): RouterRule = newJsObject<RouterRule>().apply {
    this.condition = condition
    this.source = source
}

public external interface RouterCondition : JsAny {
    var requestMethod: String?
    var requestMode: RequestMode?
    var requestDestination: RequestDestination?
    var runningStatus: RunningStatus?
    var or: JsArray<RouterCondition>?
    var not: RouterCondition?
}

public fun RouterCondition(requestMethod: String? = null, requestMode: RequestMode? = null, requestDestination: RequestDestination? = null, runningStatus: RunningStatus? = null, or: JsArray<RouterCondition>? = null, not: RouterCondition? = null): RouterCondition = newJsObject<RouterCondition>().apply {
    if (requestMethod != null) this.requestMethod = requestMethod
    if (requestMode != null) this.requestMode = requestMode
    if (requestDestination != null) this.requestDestination = requestDestination
    if (runningStatus != null) this.runningStatus = runningStatus
    if (or != null) this.or = or
    if (not != null) this.not = not
}

public external interface RouterSourceDict : JsAny {
    var cacheName: String?
}

public fun RouterSourceDict(cacheName: String? = null): RouterSourceDict = newJsObject<RouterSourceDict>().apply {
    if (cacheName != null) this.cacheName = cacheName
}

public external interface RunningStatus : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RunningStatus.Companion.RUNNING: RunningStatus get() = "running".toJsString().unsafeCast<RunningStatus>()
public inline val RunningStatus.Companion.NOT_RUNNING: RunningStatus get() = "not-running".toJsString().unsafeCast<RunningStatus>()

public external interface RouterSourceEnum : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RouterSourceEnum.Companion.CACHE: RouterSourceEnum get() = "cache".toJsString().unsafeCast<RouterSourceEnum>()
public inline val RouterSourceEnum.Companion.FETCH_EVENT: RouterSourceEnum get() = "fetch-event".toJsString().unsafeCast<RouterSourceEnum>()
public inline val RouterSourceEnum.Companion.NETWORK: RouterSourceEnum get() = "network".toJsString().unsafeCast<RouterSourceEnum>()
public inline val RouterSourceEnum.Companion.RACE_NETWORK_AND_FETCH_HANDLER: RouterSourceEnum get() = "race-network-and-fetch-handler".toJsString().unsafeCast<RouterSourceEnum>()

public external open class FetchEvent : ExtendableEvent {
    constructor(type: String, eventInitDict: FetchEventInit)
    open val request: Request
    open val preloadResponse: Promise<JsAny?>
    open val clientId: String
    open val resultingClientId: String
    open val replacesClientId: String
    open val handled: Promise<JsAny?>
    open fun respondWith(r: Promise<Response>)

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface FetchEventInit : ExtendableEventInit {
    var request: Request
    var preloadResponse: Promise<JsAny?>?
    var clientId: String?
    var resultingClientId: String?
    var replacesClientId: String?
    var handled: Promise<JsAny?>?
}

public fun FetchEventInit(request: Request, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, preloadResponse: Promise<JsAny?>? = null, clientId: String? = null, resultingClientId: String? = null, replacesClientId: String? = null, handled: Promise<JsAny?>? = null): FetchEventInit = newJsObject<FetchEventInit>().apply {
    this.request = request
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (preloadResponse != null) this.preloadResponse = preloadResponse
    if (clientId != null) this.clientId = clientId
    if (resultingClientId != null) this.resultingClientId = resultingClientId
    if (replacesClientId != null) this.replacesClientId = replacesClientId
    if (handled != null) this.handled = handled
}

public external open class ExtendableMessageEvent : ExtendableEvent {
    constructor(type: String, eventInitDict: ExtendableMessageEventInit = definedExternally)
    open val data: JsAny?
    open val origin: String
    open val lastEventId: String
    open val source: UnionClientOrMessagePortOrServiceWorker?
    open val ports: JsArray<MessagePort>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ExtendableMessageEventInit : ExtendableEventInit {
    var data: JsAny?
    var origin: String?
    var lastEventId: String?
    var source: UnionClientOrMessagePortOrServiceWorker?
    var ports: JsArray<MessagePort>?
}

public fun ExtendableMessageEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, data: JsAny? = null, origin: String? = null, lastEventId: String? = null, source: UnionClientOrMessagePortOrServiceWorker? = null, ports: JsArray<MessagePort>? = null): ExtendableMessageEventInit = newJsObject<ExtendableMessageEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (data != null) this.data = data
    if (origin != null) this.origin = origin
    if (lastEventId != null) this.lastEventId = lastEventId
    if (source != null) this.source = source
    if (ports != null) this.ports = ports
}

public external abstract class Cache : JsAny {
    open fun match(request: Request, options: CacheQueryOptions = definedExternally): Promise<Response?>
    open fun match(request: String, options: CacheQueryOptions = definedExternally): Promise<Response?>
    open fun matchAll(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsArray<Response>>
    open fun matchAll(request: String, options: CacheQueryOptions = definedExternally): Promise<JsArray<Response>>
    open fun matchAll(): Promise<JsArray<Response>>
    open fun add(request: Request): Promise<JsAny?>
    open fun add(request: String): Promise<JsAny?>
    open fun addAll(requests: JsArray<JsAny>): Promise<JsAny?>
    open fun put(request: Request, response: Response): Promise<JsAny?>
    open fun put(request: String, response: Response): Promise<JsAny?>
    open fun delete(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsBoolean>
    open fun delete(request: String, options: CacheQueryOptions = definedExternally): Promise<JsBoolean>
    open fun keys(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsArray<Request>>
    open fun keys(request: String, options: CacheQueryOptions = definedExternally): Promise<JsArray<Request>>
    open fun keys(): Promise<JsArray<Request>>
}

public external interface CacheQueryOptions : JsAny {
    var ignoreSearch: Boolean?
    var ignoreMethod: Boolean?
    var ignoreVary: Boolean?
}

public fun CacheQueryOptions(ignoreSearch: Boolean? = null, ignoreMethod: Boolean? = null, ignoreVary: Boolean? = null): CacheQueryOptions = newJsObject<CacheQueryOptions>().apply {
    if (ignoreSearch != null) this.ignoreSearch = ignoreSearch
    if (ignoreMethod != null) this.ignoreMethod = ignoreMethod
    if (ignoreVary != null) this.ignoreVary = ignoreVary
}

public external abstract class CacheStorage : JsAny {
    open fun match(request: Request, options: MultiCacheQueryOptions = definedExternally): Promise<Response?>
    open fun match(request: String, options: MultiCacheQueryOptions = definedExternally): Promise<Response?>
    open fun has(cacheName: String): Promise<JsBoolean>
    open fun open(cacheName: String): Promise<Cache>
    open fun delete(cacheName: String): Promise<JsBoolean>
    open fun keys(): Promise<JsArray<JsString>>
}

public external interface MultiCacheQueryOptions : CacheQueryOptions {
    var cacheName: String?
}

public fun MultiCacheQueryOptions(ignoreSearch: Boolean? = null, ignoreMethod: Boolean? = null, ignoreVary: Boolean? = null, cacheName: String? = null): MultiCacheQueryOptions = newJsObject<MultiCacheQueryOptions>().apply {
    if (ignoreSearch != null) this.ignoreSearch = ignoreSearch
    if (ignoreMethod != null) this.ignoreMethod = ignoreMethod
    if (ignoreVary != null) this.ignoreVary = ignoreVary
    if (cacheName != null) this.cacheName = cacheName
}
