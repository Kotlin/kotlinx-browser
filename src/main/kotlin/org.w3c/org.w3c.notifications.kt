/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.notifications

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*
import org.w3c.workers.*

/**
 * Exposes the JavaScript [Notification](https://developer.mozilla.org/en/docs/Web/API/Notification) to Kotlin
 */
public external abstract class Notification : EventTarget {
    open var onclick: ((MouseEvent) -> dynamic)?
    open var onshow: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
    open var onclose: ((Event) -> dynamic)?
    open val title: String
    open val dir: NotificationDirection
    open val lang: String
    open val body: String
    open val tag: String
    open val image: String
    open val icon: String
    open val badge: String
    open val vibrate: Array<out Int>
    open val timestamp: Number
    open val renotify: Boolean
    open val silent: Boolean
    open val requireInteraction: Boolean
    open val data: Any?
    open val actions: Array<out NotificationAction>
    fun close(): dynamic

    companion object {
        val permission: NotificationPermission
        val maxActions: Int
        fun requestPermission(deprecatedCallback: (NotificationPermission) -> dynamic = definedExternally): Promise<NotificationPermission>
    }
}

public external interface NotificationOptions {
    var dir: NotificationDirection? /* = NotificationDirection.AUTO */
        get() = definedExternally
        set(value) = definedExternally
    var lang: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var body: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var image: String?
        get() = definedExternally
        set(value) = definedExternally
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var badge: String?
        get() = definedExternally
        set(value) = definedExternally
    var vibrate: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var timestamp: Number?
        get() = definedExternally
        set(value) = definedExternally
    var renotify: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var requireInteraction: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var data: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var actions: Array<NotificationAction>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NotificationOptions(dir: NotificationDirection? = NotificationDirection.AUTO, lang: String? = "", body: String? = "", tag: String? = "", image: String? = undefined, icon: String? = undefined, badge: String? = undefined, vibrate: dynamic = undefined, timestamp: Number? = undefined, renotify: Boolean? = false, silent: Boolean? = false, requireInteraction: Boolean? = false, data: Any? = null, actions: Array<NotificationAction>? = arrayOf()): NotificationOptions {
    val o = js("({})")
    o["dir"] = dir
    o["lang"] = lang
    o["body"] = body
    o["tag"] = tag
    o["image"] = image
    o["icon"] = icon
    o["badge"] = badge
    o["vibrate"] = vibrate
    o["timestamp"] = timestamp
    o["renotify"] = renotify
    o["silent"] = silent
    o["requireInteraction"] = requireInteraction
    o["data"] = data
    o["actions"] = actions
    return o
}

public external interface NotificationAction {
    var action: String?
    var title: String?
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NotificationAction(action: String?, title: String?, icon: String? = undefined): NotificationAction {
    val o = js("({})")
    o["action"] = action
    o["title"] = title
    o["icon"] = icon
    return o
}

public external interface GetNotificationOptions {
    var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun GetNotificationOptions(tag: String? = ""): GetNotificationOptions {
    val o = js("({})")
    o["tag"] = tag
    return o
}

/**
 * Exposes the JavaScript [NotificationEvent](https://developer.mozilla.org/en/docs/Web/API/NotificationEvent) to Kotlin
 */
public external abstract class NotificationEvent : ExtendableEvent {
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
    var notification: Notification?
    var action: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun NotificationEventInit(notification: Notification?, action: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): NotificationEventInit {
    val o = js("({})")
    o["notification"] = notification
    o["action"] = action
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface NotificationPermission {
    companion object
}

public inline val NotificationPermission.Companion.DEFAULT: NotificationPermission get() = "default".asDynamic().unsafeCast<NotificationPermission>()

public inline val NotificationPermission.Companion.DENIED: NotificationPermission get() = "denied".asDynamic().unsafeCast<NotificationPermission>()

public inline val NotificationPermission.Companion.GRANTED: NotificationPermission get() = "granted".asDynamic().unsafeCast<NotificationPermission>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface NotificationDirection {
    companion object
}

public inline val NotificationDirection.Companion.AUTO: NotificationDirection get() = "auto".asDynamic().unsafeCast<NotificationDirection>()

public inline val NotificationDirection.Companion.LTR: NotificationDirection get() = "ltr".asDynamic().unsafeCast<NotificationDirection>()

public inline val NotificationDirection.Companion.RTL: NotificationDirection get() = "rtl".asDynamic().unsafeCast<NotificationDirection>()