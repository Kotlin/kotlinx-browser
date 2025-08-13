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
public expect open class Notification(title: String, options: NotificationOptions = definedExternally) : EventTarget, JsAny {
    var onclick: ((MouseEvent) -> Unit)?
    var onerror: ((Event) -> Unit)?
    open val title: String
    open val dir: NotificationDirection
    open val lang: String
    open val body: String
    open val tag: String
    open val image: String
    open val icon: String
    open val badge: String
    open val sound: String
    open val vibrate: JsArray<out JsNumber>
    open val timestamp: JsNumber
    open val renotify: Boolean
    open val silent: Boolean
    open val noscreen: Boolean
    open val requireInteraction: Boolean
    open val sticky: Boolean
    open val data: JsAny?
    open val actions: JsArray<out NotificationAction>
    fun close()

    companion object {
        val permission: NotificationPermission
        val maxActions: Int
        fun requestPermission(deprecatedCallback: (NotificationPermission) -> Unit = definedExternally): Promise<NotificationPermission>
    }
}

public expect interface NotificationOptions : JsAny {
    open var dir: NotificationDirection? /* = NotificationDirection.AUTO */
    open var lang: String? /* = "" */
    open var body: String? /* = "" */
    open var tag: String? /* = "" */
    open var image: String?
    open var icon: String?
    open var badge: String?
    open var sound: String?
    open var vibrate: JsAny? /* Int|JsArray<JsNumber> */
    open var timestamp: JsNumber?
    open var renotify: Boolean? /* = false */
    open var silent: Boolean? /* = false */
    open var noscreen: Boolean? /* = false */
    open var requireInteraction: Boolean? /* = false */
    open var sticky: Boolean? /* = false */
    open var data: JsAny? /* = null */
    open var actions: JsArray<NotificationAction>? /* = arrayOf() */
}

@Suppress("UNUSED_PARAMETER")
public expect fun NotificationOptions(dir: NotificationDirection? = NotificationDirection.AUTO, lang: String? = "", body: String? = "", tag: String? = "", image: String? = undefined, icon: String? = undefined, badge: String? = undefined, sound: String? = undefined, vibrate: JsAny? /* Int|JsArray<JsNumber> */ = undefined, timestamp: JsNumber? = undefined, renotify: Boolean? = false, silent: Boolean? = false, noscreen: Boolean? = false, requireInteraction: Boolean? = false, sticky: Boolean? = false, data: JsAny? = null, actions: JsArray<NotificationAction>? = JsArray()): NotificationOptions

public expect interface NotificationAction : JsAny {
    var action: String?
    var title: String?
    open var icon: String?
}

@Suppress("UNUSED_PARAMETER")
public expect fun NotificationAction(action: String?, title: String?, icon: String? = undefined): NotificationAction

public expect interface GetNotificationOptions : JsAny {
    open var tag: String? /* = "" */
}

@Suppress("UNUSED_PARAMETER")
public expect fun GetNotificationOptions(tag: String? = ""): GetNotificationOptions

/**
 * Exposes the JavaScript [NotificationEvent](https://developer.mozilla.org/en/docs/Web/API/NotificationEvent) to Kotlin
 */
public expect open class NotificationEvent(type: String, eventInitDict: NotificationEventInit) : ExtendableEvent, JsAny {
    open val notification: Notification
    open val action: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface NotificationEventInit : ExtendableEventInit, JsAny {
    var notification: Notification?
    open var action: String? /* = "" */
}

@Suppress("UNUSED_PARAMETER")
public expect fun NotificationEventInit(notification: Notification?, action: String? = "", bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): NotificationEventInit

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface NotificationPermission : JsAny {
    companion object
}

public expect inline val NotificationPermission.Companion.DEFAULT: NotificationPermission

public expect inline val NotificationPermission.Companion.DENIED: NotificationPermission

public expect inline val NotificationPermission.Companion.GRANTED: NotificationPermission

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface NotificationDirection : JsAny {
    companion object
}

public expect inline val NotificationDirection.Companion.AUTO: NotificationDirection

public expect inline val NotificationDirection.Companion.LTR: NotificationDirection

public expect inline val NotificationDirection.Companion.RTL: NotificationDirection