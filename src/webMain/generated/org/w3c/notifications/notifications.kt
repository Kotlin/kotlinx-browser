/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'notifications', DO NOT EDIT!

package org.w3c.notifications

import kotlin.js.*
import org.w3c.dom.*
import org.w3c.workers.*

public external open class Notification : EventTarget {
    constructor(title: String, options: NotificationOptions = definedExternally)
    open var onclick: ((Event) -> Unit)?
    open var onshow: ((Event) -> Unit)?
    open var onerror: ((Event) -> Unit)?
    open var onclose: ((Event) -> Unit)?
    open val title: String
    open val dir: NotificationDirection
    open val lang: String
    open val body: String
    open val navigate: String
    open val tag: String
    open val image: String
    open val icon: String
    open val badge: String
    open val timestamp: Double
    open val renotify: Boolean
    open val silent: Boolean?
    open val requireInteraction: Boolean
    open val data: JsAny?
    open val actions: JsArray<NotificationAction>
    open fun close()

    companion object {
        val permission: NotificationPermission
        fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit = definedExternally): Promise<NotificationPermission>
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

public external open class NotificationEvent : ExtendableEvent {
    constructor(type: String, eventInitDict: NotificationEventInit)
    open val notification: Notification
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
