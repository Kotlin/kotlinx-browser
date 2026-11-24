/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'notifications', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.notifications

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.workers.*

/**
 * The Notification interface of the Notifications API is used to configure and display desktop notifications to the
 * user.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification)
 */
public open external class Notification : EventTarget {
    /**
     * The Notification() constructor creates a new Notification object instance, which represents a user notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/Notification)
     */
    constructor(title: String, options: NotificationOptions = definedExternally)

    /**
     * The click event of the Notification interface fires when the user clicks on displayed Notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/click_event)
     */
    open var onclick: ((Event) -> Unit)?

    /**
     * The show event of the Notification interface fires when a Notification is displayed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/show_event)
     */
    open var onshow: ((Event) -> Unit)?

    /**
     * The error event of the Notification interface fires when something goes wrong with a Notification (in many cases
     * an error preventing the notification from being displayed.)
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/error_event)
     */
    open var onerror: ((Event) -> Unit)?

    /**
     * The close event of the Notification interface fires when a Notification is closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close_event)
     */
    open var onclose: ((Event) -> Unit)?

    /**
     * The title read-only property of the Notification interface indicates the title of the notification, as specified
     * in the title parameter of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/title)
     */
    open val title: String

    /**
     * The dir read-only property of the Notification interface indicates the text direction of the notification, as
     * specified in the dir option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/dir)
     */
    open val dir: NotificationDirection

    /**
     * The lang read-only property of the Notification interface indicates the language used in the notification, as
     * specified in the lang option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/lang)
     */
    open val lang: String

    /**
     * The body read-only property of the Notification interface indicates the body string of the notification, as
     * specified in the body option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/body)
     */
    open val body: String

    /**
     * The navigate read-only property of the Notification interface contains the URL the user agent will navigate to
     * when the user activates the notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/navigate)
     */
    open val navigate: String

    /**
     * The tag read-only property of the Notification interface signifies an identifying tag for the notification, as
     * specified in the tag option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/tag)
     */
    open val tag: String

    /**
     * The image read-only property of the Notification interface returns a string containing the URL of a large image
     * displayed as part of the notification's content body — for example, a news photo or product thumbnail. It has the
     * highest visual priority of the three image options (image, icon, badge).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/image)
     */
    open val image: String

    /**
     * The icon read-only property of the Notification interface returns a string containing the URL of a small image
     * that reinforces the notification — for example, an app logo or a photo of the message sender. It is displayed
     * alongside the notification title and body.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/icon)
     */
    open val icon: String

    /**
     * The badge read-only property of the Notification interface returns a string containing the URL of a small icon
     * representing the web application itself. The badge is used by the platform when there is not enough space to
     * display the full notification — for example, in a status bar. On Android, the badge should accommodate up to 4x
     * display resolution (about 96×96px), and the image will be automatically masked to a monochrome silhouette.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/badge)
     */
    open val badge: String

    /**
     * The timestamp read-only property of the Notification interface returns a number, as specified in the timestamp
     * option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/timestamp)
     */
    open val timestamp: Double

    /**
     * The renotify read-only property of the Notification interface specifies whether the user should be notified after
     * a new notification replaces an old one, as specified in the renotify option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/renotify)
     */
    open val renotify: Boolean

    /**
     * The silent read-only property of the Notification interface specifies whether the notification should be silent,
     * i.e., no sounds or vibrations should be issued regardless of the device settings. This is controlled via the
     * silent option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/silent)
     */
    open val silent: Boolean?

    /**
     * The requireInteraction read-only property of the Notification interface returns a boolean value indicating that a
     * notification should remain active until the user clicks or dismisses it, rather than closing automatically.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requireInteraction)
     */
    open val requireInteraction: Boolean

    /**
     * The data read-only property of the Notification interface returns a structured clone of the notification's data,
     * as specified in the data option of the Notification() constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/data)
     */
    open val data: JsAny?

    /**
     * The actions read-only property of the Notification interface provides the actions available for users to select
     * when interacting with the notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/actions)
     */
    open val actions: JsArray<NotificationAction>

    /**
     * The close() method of the Notification interface is used to close/remove a previously displayed notification.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/close)
     */
    open fun close()

    companion object {
        /**
         * The permission read-only static property of the Notification interface indicates the current permission
         * granted by the user for the current origin to display web notifications.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/permission_static)
         */
        val permission: NotificationPermission

        /**
         * The requestPermission() static method of the Notification interface requests permission from the user for the
         * current origin to display notifications.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/requestPermission_static)
         */
        fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit = definedExternally): Promise<NotificationPermission>

        /**
         * The maxActions read-only static property of the Notification interface returns the maximum number of actions
         * that can be displayed in a notification.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Notification/maxActions_static)
         */
        val maxActions: Int
    }
}

public external interface NotificationOptions : JsAny {
    var dir: NotificationDirection?
    var lang: String?
    var body: String?
    var navigate: String?
    var tag: String?
    var image: String?
    var icon: String?
    var badge: String?
    var timestamp: Double?
    var renotify: Boolean?
    var silent: Boolean?
    var requireInteraction: Boolean?
    var data: JsAny?
    var actions: JsArray<NotificationAction>?
}

public fun NotificationOptions(dir: NotificationDirection? = null, lang: String? = null, body: String? = null, navigate: String? = null, tag: String? = null, image: String? = null, icon: String? = null, badge: String? = null, timestamp: Double? = null, renotify: Boolean? = null, silent: Boolean? = null, requireInteraction: Boolean? = null, data: JsAny? = null, actions: JsArray<NotificationAction>? = null): NotificationOptions = newJsObject<NotificationOptions>().apply {
    if (dir != null) this.dir = dir
    if (lang != null) this.lang = lang
    if (body != null) this.body = body
    if (navigate != null) this.navigate = navigate
    if (tag != null) this.tag = tag
    if (image != null) this.image = image
    if (icon != null) this.icon = icon
    if (badge != null) this.badge = badge
    if (timestamp != null) this.timestamp = timestamp
    if (renotify != null) this.renotify = renotify
    if (silent != null) this.silent = silent
    if (requireInteraction != null) this.requireInteraction = requireInteraction
    if (data != null) this.data = data
    if (actions != null) this.actions = actions
}

public external interface NotificationPermission : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NotificationPermission.Companion.DEFAULT: NotificationPermission get() = "default".toJsString().unsafeCast<NotificationPermission>()
public inline val NotificationPermission.Companion.DENIED: NotificationPermission get() = "denied".toJsString().unsafeCast<NotificationPermission>()
public inline val NotificationPermission.Companion.GRANTED: NotificationPermission get() = "granted".toJsString().unsafeCast<NotificationPermission>()

public external interface NotificationDirection : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NotificationDirection.Companion.AUTO: NotificationDirection get() = "auto".toJsString().unsafeCast<NotificationDirection>()
public inline val NotificationDirection.Companion.LTR: NotificationDirection get() = "ltr".toJsString().unsafeCast<NotificationDirection>()
public inline val NotificationDirection.Companion.RTL: NotificationDirection get() = "rtl".toJsString().unsafeCast<NotificationDirection>()

public external interface NotificationAction : JsAny {
    var action: String
    var title: String
    var navigate: String?
    var icon: String?
}

public fun NotificationAction(action: String, title: String, navigate: String? = null, icon: String? = null): NotificationAction = newJsObject<NotificationAction>().apply {
    this.action = action
    this.title = title
    if (navigate != null) this.navigate = navigate
    if (icon != null) this.icon = icon
}

public external interface GetNotificationOptions : JsAny {
    var tag: String?
}

public fun GetNotificationOptions(tag: String? = null): GetNotificationOptions = newJsObject<GetNotificationOptions>().apply {
    if (tag != null) this.tag = tag
}

/**
 * The NotificationEvent interface of the Notifications API represents a notification event dispatched on the
 * ServiceWorkerGlobalScope of a ServiceWorker.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent)
 */
public open external class NotificationEvent : ExtendableEvent {
    /**
     * The NotificationEvent() constructor creates a new NotificationEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/NotificationEvent)
     */
    constructor(type: String, eventInitDict: NotificationEventInit)

    /**
     * The notification read-only property of the NotificationEvent interface returns the instance of the Notification
     * that was clicked to fire the event. The Notification provides read-only access to many properties that were set
     * at the instantiation time of the Notification such as tag and data attributes that allow you to store information
     * for deferred use in the notificationclick event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/notification)
     */
    open val notification: Notification

    /**
     * The action read-only property of the NotificationEvent interface returns the string ID of the notification button
     * the user clicked. This value returns an empty string if the user clicked the notification somewhere other than an
     * action button, or the notification does not have a button. The notification id is set during the creation of the
     * Notification via the actions array attribute and can't be modified unless the notification is replaced.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/NotificationEvent/action)
     */
    open val action: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface NotificationEventInit : ExtendableEventInit {
    var notification: Notification
    var action: String?
}

public fun NotificationEventInit(notification: Notification, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, action: String? = null): NotificationEventInit = newJsObject<NotificationEventInit>().apply {
    this.notification = notification
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (action != null) this.action = action
}
