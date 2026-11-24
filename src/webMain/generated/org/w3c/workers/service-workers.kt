/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'service-workers', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.workers

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.fetch.*
import org.w3c.notifications.*

public external interface UnionClientOrMessagePortOrServiceWorker : JsAny

/**
 * The ServiceWorker interface of the Service Worker API provides a reference to a service worker. Multiple browsing
 * contexts (e.g., pages, workers, etc.) can be associated with the same service worker, each through a unique
 * ServiceWorker object.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker)
 */
public external abstract class ServiceWorker : EventTarget, AbstractWorker, MessageEventSource, UnionClientOrMessagePortOrServiceWorker {
    /**
     * The scriptURL read-only property of the ServiceWorker interface returns the ServiceWorker serialized script URL
     * defined as part of ServiceWorkerRegistration. Must be on the same origin as the document that registers the
     * ServiceWorker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/scriptURL)
     */
    open val scriptURL: String

    /**
     * The state read-only property of the ServiceWorker interface returns a string representing the current state of
     * the service worker. It can be one of the following values: parsed, installing, installed, activating, activated,
     * or redundant.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/state)
     */
    open val state: ServiceWorkerState

    /**
     * The postMessage() method of the ServiceWorker interface sends a message to the worker. The first parameter is the
     * data to send to the worker. The data may be any JavaScript object which can be handled by the structured clone
     * algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/postMessage)
     */
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)

    /**
     * The postMessage() method of the ServiceWorker interface sends a message to the worker. The first parameter is the
     * data to send to the worker. The data may be any JavaScript object which can be handled by the structured clone
     * algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/postMessage)
     */
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)

    /**
     * The statechange event fires anytime the ServiceWorker.state changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorker/statechange_event)
     */
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

/**
 * The ServiceWorkerRegistration interface of the Service Worker API represents the service worker registration. You
 * register a service worker to control one or more pages that share the same origin.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration)
 */
public external abstract class ServiceWorkerRegistration : EventTarget {
    /**
     * The installing read-only property of the ServiceWorkerRegistration interface returns a service worker whose
     * ServiceWorker.state is installing. This property is initially set to null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/installing)
     */
    open val installing: ServiceWorker?

    /**
     * The waiting read-only property of the ServiceWorkerRegistration interface returns a service worker whose
     * ServiceWorker.state is installed. This property is initially set to null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/waiting)
     */
    open val waiting: ServiceWorker?

    /**
     * The active read-only property of the ServiceWorkerRegistration interface returns a service worker whose
     * ServiceWorker.state is activating or activated. This property is initially set to null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/active)
     */
    open val active: ServiceWorker?

    /**
     * The navigationPreload read-only property of the ServiceWorkerRegistration interface returns the
     * NavigationPreloadManager associated with the current service worker registration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/navigationPreload)
     */
    open val navigationPreload: NavigationPreloadManager

    /**
     * The scope read-only property of the ServiceWorkerRegistration interface returns a string representing a URL that
     * defines a service worker's registration scope; that is, the range of URLs a service worker can control. This is
     * set using the scope parameter specified in the call to ServiceWorkerContainer.register() which registered the
     * service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/scope)
     */
    open val scope: String

    /**
     * The updateViaCache read-only property of the ServiceWorkerRegistration interface returns the value of the setting
     * used to determine the circumstances in which the browser will consult the HTTP cache when it tries to update the
     * service worker or any scripts that are imported via importScripts().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updateViaCache)
     */
    open val updateViaCache: ServiceWorkerUpdateViaCache

    /**
     * The update() method of the ServiceWorkerRegistration interface attempts to update the service worker. It fetches
     * the worker's script URL, and if the new worker is not byte-by-byte identical to the current worker, it installs
     * the new worker. The fetch of the worker bypasses any browser caches if the previous fetch occurred over 24 hours
     * ago.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/update)
     */
    open fun update(): Promise<ServiceWorkerRegistration>

    /**
     * The unregister() method of the ServiceWorkerRegistration interface unregisters the service worker registration
     * and returns a Promise. The promise will resolve to false if no registration was found, otherwise it resolves to
     * true irrespective of whether unregistration happened or not (it may not unregister if someone else just called
     * ServiceWorkerContainer.register() with the same scope.) The service worker will finish any ongoing operations
     * before it is unregistered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/unregister)
     */
    open fun unregister(): Promise<JsBoolean>

    /**
     * The updatefound event of the ServiceWorkerRegistration interface is fired any time the
     * ServiceWorkerRegistration.installing property acquires a new service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/updatefound_event)
     */
    open var onupdatefound: ((Event) -> Unit)?

    /**
     * The showNotification() method of the ServiceWorkerRegistration interface creates a notification on an active
     * service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/showNotification)
     */
    open fun showNotification(title: String, options: NotificationOptions = definedExternally): Promise<JsAny?>

    /**
     * The getNotifications() method of the ServiceWorkerRegistration interface returns a list of the notifications in
     * the order that they were created from the current origin via the current service worker registration. Origins can
     * have many active but differently-scoped service worker registrations. Notifications created by one service worker
     * on the same origin will not be available to other active service workers on that same origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerRegistration/getNotifications)
     */
    open fun getNotifications(filter: GetNotificationOptions = definedExternally): Promise<JsArray<Notification>>
}

public external interface ServiceWorkerUpdateViaCache : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ServiceWorkerUpdateViaCache.Companion.IMPORTS: ServiceWorkerUpdateViaCache get() = "imports".toJsString().unsafeCast<ServiceWorkerUpdateViaCache>()
public inline val ServiceWorkerUpdateViaCache.Companion.ALL: ServiceWorkerUpdateViaCache get() = "all".toJsString().unsafeCast<ServiceWorkerUpdateViaCache>()
public inline val ServiceWorkerUpdateViaCache.Companion.NONE: ServiceWorkerUpdateViaCache get() = "none".toJsString().unsafeCast<ServiceWorkerUpdateViaCache>()

/**
 * The ServiceWorkerContainer interface of the Service Worker API provides an object representing the service worker as
 * an overall unit in the network ecosystem, including facilities to register, unregister and update service workers,
 * and access the state of service workers and their registrations.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer)
 */
public external abstract class ServiceWorkerContainer : EventTarget {
    /**
     * The controller read-only property of the ServiceWorkerContainer interface represents the active service worker
     * controlling the current page (associated with this ServiceWorkerContainer), or null if the page has no active or
     * activating service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controller)
     */
    open val controller: ServiceWorker?

    /**
     * The ready read-only property of the ServiceWorkerContainer interface provides a way of delaying code execution
     * until a service worker is active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/ready)
     */
    open val ready: Promise<ServiceWorkerRegistration>

    /**
     * The register() method of the ServiceWorkerContainer interface creates or updates a ServiceWorkerRegistration for
     * the given scope.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/register)
     */
    open fun register(scriptURL: String, options: RegistrationOptions = definedExternally): Promise<ServiceWorkerRegistration>

    /**
     * The getRegistration() method of the ServiceWorkerContainer interface gets a ServiceWorkerRegistration object
     * whose scope URL matches the provided client URL. The method returns a Promise that resolves to a
     * ServiceWorkerRegistration or undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistration)
     */
    open fun getRegistration(clientURL: String = definedExternally): Promise<ServiceWorkerRegistration?>

    /**
     * The getRegistrations() method of the ServiceWorkerContainer interface gets all ServiceWorkerRegistrations
     * associated with a ServiceWorkerContainer, in an array. The method returns a Promise that resolves to an array of
     * ServiceWorkerRegistration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/getRegistrations)
     */
    open fun getRegistrations(): Promise<JsArray<ServiceWorkerRegistration>>

    /**
     * The startMessages() method of the ServiceWorkerContainer interface explicitly starts the flow of messages being
     * dispatched from a service worker to pages under its control (e.g., sent via Client.postMessage()). This can be
     * used to react to sent messages earlier, even before that page's content has finished loading.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/startMessages)
     */
    open fun startMessages()

    /**
     * The controllerchange event of the ServiceWorkerContainer interface fires when the document's associated
     * ServiceWorkerRegistration acquires a new active worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/controllerchange_event)
     */
    open var oncontrollerchange: ((Event) -> Unit)?

    /**
     * The message event is used in a page controlled by a service worker to receive messages from the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/message_event)
     */
    open var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The messageerror event is fired to the ServiceWorkerContainer when an incoming message sent to the associated
     * worker can't be deserialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerContainer/messageerror_event)
     */
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

/**
 * The NavigationPreloadManager interface of the Service Worker API provides methods for managing the preloading of
 * resources in parallel with service worker bootup.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager)
 */
public external abstract class NavigationPreloadManager : JsAny {
    /**
     * The enable() method of the NavigationPreloadManager interface is used to enable preloading of resources managed
     * by the service worker. It returns a promise that resolves with undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable)
     */
    open fun enable(): Promise<JsAny?>

    /**
     * The disable() method of the NavigationPreloadManager interface halts the automatic preloading of
     * service-worker-managed resources previously started using enable() It returns a promise that resolves with
     * undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable)
     */
    open fun disable(): Promise<JsAny?>

    /**
     * The setHeaderValue() method of the NavigationPreloadManager interface sets the value of the
     * Service-Worker-Navigation-Preload header that will be sent with requests resulting from a fetch() operation made
     * during service worker navigation preloading. It returns an empty Promise that resolves with undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue)
     */
    open fun setHeaderValue(value: String): Promise<JsAny?>

    /**
     * The getState() method of the NavigationPreloadManager interface returns a Promise that resolves to an object with
     * properties that indicate whether preload is enabled and what value will be sent in the
     * Service-Worker-Navigation-Preload HTTP header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState)
     */
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

/**
 * The ServiceWorkerGlobalScope interface of the Service Worker API represents the global execution context of a service
 * worker.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope)
 */
public external abstract class ServiceWorkerGlobalScope : WorkerGlobalScope {
    /**
     * The clients read-only property of the ServiceWorkerGlobalScope interface returns the Clients object associated
     * with the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/clients)
     */
    open val clients: Clients

    /**
     * The registration read-only property of the ServiceWorkerGlobalScope interface returns a reference to the
     * ServiceWorkerRegistration object, which represents the service worker's registration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/registration)
     */
    open val registration: ServiceWorkerRegistration

    /**
     * The serviceWorker read-only property of the ServiceWorkerGlobalScope interface returns a reference to the
     * ServiceWorker object, which represents the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/serviceWorker)
     */
    open val serviceWorker: ServiceWorker

    /**
     * The skipWaiting() method of the ServiceWorkerGlobalScope interface forces the waiting service worker to become
     * the active service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/skipWaiting)
     */
    open fun skipWaiting(): Promise<JsAny?>

    /**
     * The install event of the ServiceWorkerGlobalScope interface is fired when a ServiceWorkerRegistration acquires a
     * new ServiceWorkerRegistration.installing worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/install_event)
     */
    open var oninstall: ((InstallEvent) -> Unit)?

    /**
     * The activate event of the ServiceWorkerGlobalScope interface is fired when a ServiceWorkerRegistration acquires a
     * new ServiceWorkerRegistration.active worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/activate_event)
     */
    open var onactivate: ((ExtendableEvent) -> Unit)?

    /**
     * The fetch event of the ServiceWorkerGlobalScope interface is fired in the service worker's global scope when the
     * main app thread makes a network request. It enables the service worker to intercept network requests and send
     * customized responses (for example, from a local cache).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/fetch_event)
     */
    open var onfetch: ((FetchEvent) -> Unit)?

    /**
     * The message event of the ServiceWorkerGlobalScope interface occurs when incoming messages are received.
     * Controlled pages can use the ServiceWorker.postMessage() method to send messages to service workers. The service
     * worker can optionally send a response back via the Client.postMessage(), corresponding to the controlled page.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/message_event)
     */
    open var onmessage: ((ExtendableMessageEvent) -> Unit)?

    /**
     * The messageerror event of the ServiceWorkerGlobalScope interface occurs when incoming messages can't be
     * deserialized.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/messageerror_event)
     */
    open var onmessageerror: ((ExtendableMessageEvent) -> Unit)?

    /**
     * The notificationclick event of the ServiceWorkerGlobalScope interface is fired to indicate that a system
     * notification spawned by ServiceWorkerRegistration.showNotification() has been clicked.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclick_event)
     */
    open var onnotificationclick: ((NotificationEvent) -> Unit)?

    /**
     * The notificationclose event of the ServiceWorkerGlobalScope interface fires when a user closes a displayed
     * notification spawned by ServiceWorkerRegistration.showNotification().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ServiceWorkerGlobalScope/notificationclose_event)
     */
    open var onnotificationclose: ((NotificationEvent) -> Unit)?
}

/**
 * The Client interface represents an executable context such as a Worker, or a SharedWorker. Window clients are
 * represented by the more-specific WindowClient. You can get Client/WindowClient objects from methods such as
 * Clients.matchAll() and Clients.get().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client)
 */
public external abstract class Client : UnionClientOrMessagePortOrServiceWorker {
    /**
     * The url read-only property of the Client interface returns the URL of the current service worker client.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/url)
     */
    open val url: String

    /**
     * The frameType read-only property of the Client interface indicates the type of browsing context of the current
     * Client. This value can be one of "auxiliary", "top-level", "nested", or "none".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/frameType)
     */
    open val frameType: FrameType

    /**
     * The id read-only property of the Client interface returns the universally unique identifier of the Client object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/id)
     */
    open val id: String

    /**
     * The type read-only property of the Client interface indicates the type of client the service worker is
     * controlling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/type)
     */
    open val type: ClientType

    /**
     * The postMessage() method of the Client interface allows a service worker to send a message to a client (a Window,
     * Worker, or SharedWorker). The message is received in the message event on navigator.serviceWorker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/postMessage)
     */
    open fun postMessage(message: JsAny?, transfer: JsArray<JsAny>)

    /**
     * The postMessage() method of the Client interface allows a service worker to send a message to a client (a Window,
     * Worker, or SharedWorker). The message is received in the message event on navigator.serviceWorker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Client/postMessage)
     */
    open fun postMessage(message: JsAny?, options: StructuredSerializeOptions = definedExternally)
}

/**
 * The WindowClient interface of the ServiceWorker API represents the scope of a service worker client that is a
 * document in a browsing context, controlled by an active worker. The service worker client independently selects and
 * uses a service worker for its own loading and sub-resources.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient)
 */
public external abstract class WindowClient : Client {
    /**
     * The visibilityState read-only property of the WindowClient interface indicates the visibility of the current
     * client. This value can be one of "hidden", "visible", or "prerender".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/visibilityState)
     */
    open val visibilityState: DocumentVisibilityState

    /**
     * The focused read-only property of the WindowClient interface is a boolean value that indicates whether the
     * current client has focus.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focused)
     */
    open val focused: Boolean

    /**
     * The ancestorOrigins read-only property of the WindowClient interface is an array of strings listing the origins
     * of all ancestors of the browsing context represented by this WindowClient in reverse order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/ancestorOrigins)
     */
    open val ancestorOrigins: JsArray<JsString>

    /**
     * The focus() method of the WindowClient interface gives user input focus to the current client and returns a
     * Promise that resolves to the existing WindowClient.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focus)
     */
    open fun focus(): Promise<WindowClient>

    /**
     * The navigate() method of the WindowClient interface loads a specified URL into a controlled client page then
     * returns a Promise that resolves to the existing WindowClient.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/navigate)
     */
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

/**
 * The Clients interface provides access to Client objects. Access it via self.clients within a service worker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients)
 */
public external abstract class Clients : JsAny {
    /**
     * The get() method of the Clients interface gets a service worker client matching a given id and returns it in a
     * Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/get)
     */
    open fun get(id: String): Promise<Client?>

    /**
     * The matchAll() method of the Clients interface returns a Promise for a list of service worker Client objects.
     * Include the options parameter to return all service worker clients whose origin is the same as the associated
     * service worker's origin. If options are not included, the method returns only the service worker clients
     * controlled by the service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/matchAll)
     */
    open fun matchAll(options: ClientQueryOptions = definedExternally): Promise<JsArray<Client>>

    /**
     * The openWindow() method of the Clients interface creates a new top-level browsing context and loads a given URL.
     * If the calling script doesn't have permission to show popups, openWindow() will throw an InvalidAccessError.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/openWindow)
     */
    open fun openWindow(url: String): Promise<WindowClient?>

    /**
     * The claim() method of the Clients interface allows an active service worker to set itself as the controller for
     * all clients within its scope. This triggers a controllerchange event on navigator.serviceWorker in any clients
     * that become controlled by this service worker.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Clients/claim)
     */
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

/**
 * The ExtendableEvent interface extends the lifetime of the install and activate events dispatched on the global scope
 * as part of the service worker lifecycle. This ensures that any functional events (like FetchEvent) are not dispatched
 * until it upgrades database schemas and deletes the outdated cache entries.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent)
 */
public external open class ExtendableEvent : Event {
    /**
     * The ExtendableEvent() constructor creates a new ExtendableEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/ExtendableEvent)
     */
    constructor(type: String, eventInitDict: ExtendableEventInit = definedExternally)

    /**
     * The ExtendableEvent.waitUntil() method tells the event dispatcher that work is ongoing. It can also be used to
     * detect whether that work was successful. In service workers, waitUntil() tells the browser that work is ongoing
     * until the promise settles, and it shouldn't terminate the service worker if it wants that work to complete.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableEvent/waitUntil)
     */
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

/**
 * The parameter passed into an install event handler function, the InstallEvent interface represents an install action
 * that is dispatched on the ServiceWorkerGlobalScope of a ServiceWorker. As a child of ExtendableEvent, it ensures that
 * functional events such as FetchEvent are not dispatched during installation.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InstallEvent)
 */
public external open class InstallEvent : ExtendableEvent {
    /**
     * The InstallEvent() constructor creates a new InstallEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InstallEvent/InstallEvent)
     */
    constructor(type: String, eventInitDict: ExtendableEventInit = definedExternally)

    /**
     * The addRoutes() method of the InstallEvent interface specifies one or more static routes, which define rules for
     * fetching specified resources that will be used even before service worker startup. This allows you to, for
     * example, bypass a service worker in cases where you always want to fetch a resource from the network or a browser
     * Cache, and avoids the performance overhead of unnecessary service worker cycles.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InstallEvent/addRoutes)
     */
    open fun addRoutes(rules: RouterRule): Promise<JsAny?>

    /**
     * The addRoutes() method of the InstallEvent interface specifies one or more static routes, which define rules for
     * fetching specified resources that will be used even before service worker startup. This allows you to, for
     * example, bypass a service worker in cases where you always want to fetch a resource from the network or a browser
     * Cache, and avoids the performance overhead of unnecessary service worker cycles.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InstallEvent/addRoutes)
     */
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

/**
 * This is the event type for fetch events dispatched on the service worker global scope. It contains information about
 * the fetch, including the request and how the receiver will treat the response. It provides the event.respondWith()
 * method, which allows us to provide a response to this fetch.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent)
 */
public external open class FetchEvent : ExtendableEvent {
    /**
     * The FetchEvent() constructor creates a new FetchEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/FetchEvent)
     */
    constructor(type: String, eventInitDict: FetchEventInit)

    /**
     * The request read-only property of the FetchEvent interface returns the Request that triggered the event handler.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/request)
     */
    open val request: Request

    /**
     * The preloadResponse read-only property of the FetchEvent interface returns a Promise that resolves to the
     * navigation preload Response if navigation preload was triggered, or undefined otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/preloadResponse)
     */
    open val preloadResponse: Promise<JsAny?>

    /**
     * The clientId read-only property of the FetchEvent interface returns the id of the Client that the current service
     * worker is controlling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/clientId)
     */
    open val clientId: String

    /**
     * The resultingClientId read-only property of the FetchEvent interface is the id of the client that replaces the
     * previous client during a page navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/resultingClientId)
     */
    open val resultingClientId: String
    open val replacesClientId: String

    /**
     * The handled read-only property of the FetchEvent interface returns a promise indicating if the event has been
     * handled by the fetch algorithm or not. This property allows executing code after the browser has consumed a
     * response, and is usually used together with the waitUntil() method.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/handled)
     */
    open val handled: Promise<JsAny?>

    /**
     * The respondWith() method of FetchEvent prevents the browser's default fetch handling, and allows you to provide a
     * promise for a Response yourself.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FetchEvent/respondWith)
     */
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

/**
 * The ExtendableMessageEvent interface of the Service Worker API represents the event object of a message event fired
 * on a service worker (when a message is received on the ServiceWorkerGlobalScope from another context) — extends the
 * lifetime of such events.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent)
 */
public external open class ExtendableMessageEvent : ExtendableEvent {
    /**
     * The ExtendableMessageEvent() constructor creates a new ExtendableMessageEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ExtendableMessageEvent)
     */
    constructor(type: String, eventInitDict: ExtendableMessageEventInit = definedExternally)

    /**
     * The data read-only property of the ExtendableMessageEvent interface returns the event's data. It can be any data
     * type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/data)
     */
    open val data: JsAny?

    /**
     * The origin read-only property of the ExtendableMessageEvent interface returns the origin of the Client that sent
     * the message.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/origin)
     */
    open val origin: String

    /**
     * The lastEventID read-only property of the ExtendableMessageEvent interface represents, in server-sent events, the
     * last event ID of the event source. This is an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/lastEventId)
     */
    open val lastEventId: String

    /**
     * The source read-only property of the ExtendableMessageEvent interface returns a reference to the Client object
     * from which the message was sent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/source)
     */
    open val source: UnionClientOrMessagePortOrServiceWorker?

    /**
     * The ports read-only property of the ExtendableMessageEvent interface returns the array containing the MessagePort
     * objects representing the ports of the associated message channel (the channel the message is being sent through.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ExtendableMessageEvent/ports)
     */
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

/**
 * The Cache interface provides a persistent storage mechanism for Request / Response object pairs that are cached in
 * long lived memory. How long a Cache object lives is browser dependent, but a single origin's scripts can typically
 * rely on the presence of a previously populated Cache object. Note that the Cache interface is exposed to windowed
 * scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in
 * the service worker spec.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache)
 */
public external abstract class Cache : JsAny {
    /**
     * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the
     * first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
     */
    open fun match(request: Request, options: CacheQueryOptions = definedExternally): Promise<Response?>

    /**
     * The match() method of the Cache interface returns a Promise that resolves to the Response associated with the
     * first matching request in the Cache object. If no match is found, the Promise resolves to undefined.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/match)
     */
    open fun match(request: String, options: CacheQueryOptions = definedExternally): Promise<Response?>

    /**
     * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching
     * responses in the Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
     */
    open fun matchAll(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsArray<Response>>

    /**
     * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching
     * responses in the Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
     */
    open fun matchAll(request: String, options: CacheQueryOptions = definedExternally): Promise<JsArray<Response>>

    /**
     * The matchAll() method of the Cache interface returns a Promise that resolves to an array of all matching
     * responses in the Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/matchAll)
     */
    open fun matchAll(): Promise<JsArray<Response>>

    /**
     * The add() method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the
     * given cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add)
     */
    open fun add(request: Request): Promise<JsAny?>

    /**
     * The add() method of the Cache interface takes a URL, retrieves it, and adds the resulting response object to the
     * given cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/add)
     */
    open fun add(request: String): Promise<JsAny?>

    /**
     * The addAll() method of the Cache interface takes an array of URLs, retrieves them, and adds the resulting
     * response objects to the given cache. The request objects created during retrieval become keys to the stored
     * response operations.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/addAll)
     */
    open fun addAll(requests: JsArray<JsAny>): Promise<JsAny?>

    /**
     * The put() method of the Cache interface allows key/value pairs to be added to the current Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
     */
    open fun put(request: Request, response: Response): Promise<JsAny?>

    /**
     * The put() method of the Cache interface allows key/value pairs to be added to the current Cache object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/put)
     */
    open fun put(request: String, response: Response): Promise<JsAny?>

    /**
     * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes
     * the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
     */
    open fun delete(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsBoolean>

    /**
     * The delete() method of the Cache interface finds the Cache entry whose key is the request, and if found, deletes
     * the Cache entry and returns a Promise that resolves to true. If no Cache entry is found, it resolves to false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/delete)
     */
    open fun delete(request: String, options: CacheQueryOptions = definedExternally): Promise<JsBoolean>

    /**
     * The keys() method of the Cache interface returns a Promise that resolves to an array of Request objects
     * representing the keys of the Cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
     */
    open fun keys(request: Request, options: CacheQueryOptions = definedExternally): Promise<JsArray<Request>>

    /**
     * The keys() method of the Cache interface returns a Promise that resolves to an array of Request objects
     * representing the keys of the Cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
     */
    open fun keys(request: String, options: CacheQueryOptions = definedExternally): Promise<JsArray<Request>>

    /**
     * The keys() method of the Cache interface returns a Promise that resolves to an array of Request objects
     * representing the keys of the Cache.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Cache/keys)
     */
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

/**
 * The CacheStorage interface represents the storage for Cache objects.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage)
 */
public external abstract class CacheStorage : JsAny {
    /**
     * The match() method of the CacheStorage interface checks if a given Request or URL string is a key for a stored
     * Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is
     * found.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/match)
     */
    open fun match(request: Request, options: MultiCacheQueryOptions = definedExternally): Promise<Response?>

    /**
     * The match() method of the CacheStorage interface checks if a given Request or URL string is a key for a stored
     * Response. This method returns a Promise for a Response, or a Promise which resolves to undefined if no match is
     * found.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/match)
     */
    open fun match(request: String, options: MultiCacheQueryOptions = definedExternally): Promise<Response?>

    /**
     * The has() method of the CacheStorage interface returns a Promise that resolves to true if a Cache object matches
     * the cacheName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/has)
     */
    open fun has(cacheName: String): Promise<JsBoolean>

    /**
     * The open() method of the CacheStorage interface returns a Promise that resolves to the Cache object matching the
     * cacheName.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/open)
     */
    open fun open(cacheName: String): Promise<Cache>

    /**
     * The delete() method of the CacheStorage interface finds the Cache object matching the cacheName, and if found,
     * deletes the Cache object and returns a Promise that resolves to true. If no Cache object is found, it resolves to
     * false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/delete)
     */
    open fun delete(cacheName: String): Promise<JsBoolean>

    /**
     * The keys() method of the CacheStorage interface returns a Promise that will resolve with an array containing
     * strings corresponding to all of the named Cache objects tracked by the CacheStorage object in the order they were
     * created. Use this method to iterate over a list of all Cache objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CacheStorage/keys)
     */
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
