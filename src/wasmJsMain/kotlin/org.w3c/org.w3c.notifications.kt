/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.notifications

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*
import org.w3c.undefined
import org.w3c.workers.*

/**
 * Exposes the JavaScript [Notification](https://developer.mozilla.org/en/docs/Web/API/Notification) to Kotlin
 */
public actual external open class Notification actual constructor(title: String, options: NotificationOptions) : EventTarget, JsAny {
    actual var onclick: ((MouseEvent) -> Unit)?
    actual var onerror: ((Event) -> Unit)?
    actual open val title: String
    actual open val dir: NotificationDirection
    actual open val lang: String
    actual open val body: String
    actual open val tag: String
    actual open val image: String
    actual open val icon: String
    actual open val badge: String
    actual open val sound: String
    actual open val vibrate: JsArray<out JsNumber>
    actual open val timestamp: JsNumber
    actual open val renotify: Boolean
    actual open val silent: Boolean
    actual open val noscreen: Boolean
    actual open val requireInteraction: Boolean
    actual open val sticky: Boolean
    actual open val data: JsAny?
    actual open val actions: JsArray<out NotificationAction>
    actual fun close()

    actual companion object {
        actual val permission: NotificationPermission
        actual val maxActions: Int
        actual fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit): Promise<NotificationPermission>
    }
}

public actual external interface NotificationOptions : JsAny {
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
    actual var vibrate: JsAny? /* Int|JsArray<JsNumber> */
        get() = definedExternally
        set(value) = definedExternally
    actual var timestamp: JsNumber?
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
    actual var data: JsAny? /* = null */
        get() = definedExternally
        set(value) = definedExternally
    actual var actions: JsArray<NotificationAction>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun NotificationOptions(dir: NotificationDirection?, lang: String?, body: String?, tag: String?, image: String?, icon: String?, badge: String?, sound: String?, vibrate: JsAny? /* Int|JsArray<JsNumber> */, timestamp: JsNumber?, renotify: Boolean?, silent: Boolean?, noscreen: Boolean?, requireInteraction: Boolean?, sticky: Boolean?, data: JsAny?, actions: JsArray<NotificationAction>?): NotificationOptions = js("({ dir: dir, lang: lang, body: body, tag: tag, image: image, icon: icon, badge: badge, sound: sound, vibrate: vibrate, timestamp: timestamp, renotify: renotify, silent: silent, noscreen: noscreen, requireInteraction: requireInteraction, sticky: sticky, data: data, actions: actions })")

public actual external interface NotificationAction : JsAny {
    actual var action: String?
    actual var title: String?
    actual var icon: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun NotificationAction(action: String?, title: String?, icon: String?): NotificationAction = js("({ action: action, title: title, icon: icon })")

public actual external interface GetNotificationOptions : JsAny {
    actual var tag: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun GetNotificationOptions(tag: String?): GetNotificationOptions = js("({ tag: tag })")

/**
 * Exposes the JavaScript [NotificationEvent](https://developer.mozilla.org/en/docs/Web/API/NotificationEvent) to Kotlin
 */
public actual external open class NotificationEvent actual constructor(type: String, eventInitDict: NotificationEventInit) : ExtendableEvent, JsAny {
    actual open val notification: Notification
    actual open val action: String

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface NotificationEventInit : ExtendableEventInit, JsAny {
    actual var notification: Notification?
    actual var action: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun NotificationEventInit(notification: Notification?, action: String?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): NotificationEventInit = js("({ notification: notification, action: action, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface NotificationPermission : JsAny {
    actual companion object
}

public actual inline val NotificationPermission.Companion.DEFAULT: NotificationPermission get() = "default".toJsString().unsafeCast<NotificationPermission>()

public actual inline val NotificationPermission.Companion.DENIED: NotificationPermission get() = "denied".toJsString().unsafeCast<NotificationPermission>()

public actual inline val NotificationPermission.Companion.GRANTED: NotificationPermission get() = "granted".toJsString().unsafeCast<NotificationPermission>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface NotificationDirection : JsAny {
    actual companion object
}

public actual inline val NotificationDirection.Companion.AUTO: NotificationDirection get() = "auto".toJsString().unsafeCast<NotificationDirection>()

public actual inline val NotificationDirection.Companion.LTR: NotificationDirection get() = "ltr".toJsString().unsafeCast<NotificationDirection>()

public actual inline val NotificationDirection.Companion.RTL: NotificationDirection get() = "rtl".toJsString().unsafeCast<NotificationDirection>()