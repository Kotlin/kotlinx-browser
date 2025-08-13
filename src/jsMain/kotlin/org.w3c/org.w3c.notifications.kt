/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.notifications

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*
import org.w3c.workers.*

/**
 * Exposes the JavaScript [Notification](https://developer.mozilla.org/en/docs/Web/API/Notification) to Kotlin
 */
actual external open class Notification actual constructor(title: String, options: NotificationOptions) : EventTarget {
    actual var onclick: ((MouseEvent) -> dynamic)?
    actual var onerror: ((Event) -> dynamic)?
    actual open val title: String
    actual open val dir: NotificationDirection
    actual open val lang: String
    actual open val body: String
    actual open val tag: String
    actual open val image: String
    actual open val icon: String
    actual open val badge: String
    actual open val sound: String
    actual open val vibrate: Array<out Int>
    actual open val timestamp: Number
    actual open val renotify: Boolean
    actual open val silent: Boolean
    actual open val noscreen: Boolean
    actual open val requireInteraction: Boolean
    actual open val sticky: Boolean
    actual open val data: Any?
    actual open val actions: Array<out NotificationAction>
    actual fun close()

    actual companion object {
        actual val permission: NotificationPermission
        actual val maxActions: Int
        actual fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit): Promise<NotificationPermission>
    }
}

actual external interface NotificationOptions {
    actual var dir: NotificationDirection? /* = NotificationDirection.AUTO */
        get() = definedExternally
        set(value) = definedExternally
    actual var lang: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var body: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var image: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var badge: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var sound: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var vibrate: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var timestamp: Number?
        get() = definedExternally
        set(value) = definedExternally
    actual var renotify: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var silent: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var noscreen: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var requireInteraction: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var sticky: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    actual var data: Any? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var actions: Array<NotificationAction>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun NotificationOptions(dir: NotificationDirection?, lang: String?, body: String?, tag: String?, image: String?, icon: String?, badge: String?, sound: String?, vibrate: dynamic, timestamp: Number?, renotify: Boolean?, silent: Boolean?, noscreen: Boolean?, requireInteraction: Boolean?, sticky: Boolean?, data: Any?, actions: Array<NotificationAction>?): NotificationOptions {
    val o = js("({})")
    o["dir"] = dir
    o["lang"] = lang
    o["body"] = body
    o["tag"] = tag
    o["image"] = image
    o["icon"] = icon
    o["badge"] = badge
    o["sound"] = sound
    o["vibrate"] = vibrate
    o["timestamp"] = timestamp
    o["renotify"] = renotify
    o["silent"] = silent
    o["noscreen"] = noscreen
    o["requireInteraction"] = requireInteraction
    o["sticky"] = sticky
    o["data"] = data
    o["actions"] = actions
    return o as NotificationOptions
}

actual external interface NotificationAction {
    actual var action: String?
    actual var title: String?
    actual var icon: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun NotificationAction(action: String?, title: String?, icon: String?): NotificationAction {
    val o = js("({})")
    o["action"] = action
    o["title"] = title
    o["icon"] = icon
    return o as NotificationAction
}

actual external interface GetNotificationOptions {
    actual var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun GetNotificationOptions(tag: String?): GetNotificationOptions {
    val o = js("({})")
    o["tag"] = tag
    return o as GetNotificationOptions
}

/**
 * Exposes the JavaScript [NotificationEvent](https://developer.mozilla.org/en/docs/Web/API/NotificationEvent) to Kotlin
 */
actual external open class NotificationEvent actual constructor(type: String, eventInitDict: NotificationEventInit) : ExtendableEvent {
    actual open val notification: Notification
    actual open val action: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface NotificationEventInit : ExtendableEventInit {
    actual var notification: Notification?
    actual var action: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun NotificationEventInit(notification: Notification?, action: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): NotificationEventInit {
    val o = js("({})")
    o["notification"] = notification
    o["action"] = action
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as NotificationEventInit
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface NotificationPermission {
    actual companion object
}

actual inline val NotificationPermission.Companion.DEFAULT: NotificationPermission get() = "default".asDynamic().unsafeCast<NotificationPermission>()

actual inline val NotificationPermission.Companion.DENIED: NotificationPermission get() = "denied".asDynamic().unsafeCast<NotificationPermission>()

actual inline val NotificationPermission.Companion.GRANTED: NotificationPermission get() = "granted".asDynamic().unsafeCast<NotificationPermission>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface NotificationDirection {
    actual companion object
}

actual inline val NotificationDirection.Companion.AUTO: NotificationDirection get() = "auto".asDynamic().unsafeCast<NotificationDirection>()

actual inline val NotificationDirection.Companion.LTR: NotificationDirection get() = "ltr".asDynamic().unsafeCast<NotificationDirection>()

actual inline val NotificationDirection.Companion.RTL: NotificationDirection get() = "rtl".asDynamic().unsafeCast<NotificationDirection>()