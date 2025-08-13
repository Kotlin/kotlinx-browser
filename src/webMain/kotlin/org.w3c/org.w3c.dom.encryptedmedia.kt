/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.encryptedmedia

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

/**
 * Exposes the JavaScript [MediaKeySystemConfiguration](https://developer.mozilla.org/en/docs/Web/API/MediaKeySystemConfiguration) to Kotlin
 */
public expect interface MediaKeySystemConfiguration : JsAny {
    open var label: String? /* = "" */
    open var initDataTypes: JsArray<JsString>? /* = arrayOf() */
    open var audioCapabilities: JsArray<MediaKeySystemMediaCapability>? /* = arrayOf() */
    open var videoCapabilities: JsArray<MediaKeySystemMediaCapability>? /* = arrayOf() */
    open var distinctiveIdentifier: MediaKeysRequirement? /* = MediaKeysRequirement.OPTIONAL */
    open var persistentState: MediaKeysRequirement? /* = MediaKeysRequirement.OPTIONAL */
    open var sessionTypes: JsArray<JsString>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaKeySystemConfiguration(label: String? = "", initDataTypes: JsArray<JsString>? = JsArray(), audioCapabilities: JsArray<MediaKeySystemMediaCapability>? = JsArray(), videoCapabilities: JsArray<MediaKeySystemMediaCapability>? = JsArray(), distinctiveIdentifier: MediaKeysRequirement? = MediaKeysRequirement.OPTIONAL, persistentState: MediaKeysRequirement? = MediaKeysRequirement.OPTIONAL, sessionTypes: JsArray<JsString>? = undefined): MediaKeySystemConfiguration

public expect interface MediaKeySystemMediaCapability : JsAny {
    open var contentType: String? /* = "" */
    open var robustness: String? /* = "" */
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaKeySystemMediaCapability(contentType: String? = "", robustness: String? = ""): MediaKeySystemMediaCapability

/**
 * Exposes the JavaScript [MediaKeySystemAccess](https://developer.mozilla.org/en/docs/Web/API/MediaKeySystemAccess) to Kotlin
 */
public expect abstract class MediaKeySystemAccess : JsAny {
    open val keySystem: String
    fun getConfiguration(): MediaKeySystemConfiguration
    fun createMediaKeys(): Promise<MediaKeys>
}

/**
 * Exposes the JavaScript [MediaKeys](https://developer.mozilla.org/en/docs/Web/API/MediaKeys) to Kotlin
 */
public expect abstract class MediaKeys : JsAny {
    fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession
    fun setServerCertificate(serverCertificate: JsAny?): Promise<JsBoolean>
}

/**
 * Exposes the JavaScript [MediaKeySession](https://developer.mozilla.org/en/docs/Web/API/MediaKeySession) to Kotlin
 */
public expect abstract class MediaKeySession : EventTarget, JsAny {
    open val sessionId: String
    open val expiration: Double
    open val closed: Promise<Nothing?>
    open val keyStatuses: MediaKeyStatusMap
    open var onkeystatuseschange: ((Event) -> Unit)?
    open var onmessage: ((MessageEvent) -> Unit)?
    fun generateRequest(initDataType: String, initData: JsAny?): Promise<Nothing?>
    fun load(sessionId: String): Promise<JsBoolean>
    fun update(response: JsAny?): Promise<Nothing?>
    fun close(): Promise<Nothing?>
    fun remove(): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [MediaKeyStatusMap](https://developer.mozilla.org/en/docs/Web/API/MediaKeyStatusMap) to Kotlin
 */
public expect abstract class MediaKeyStatusMap : JsAny {
    open val size: Int
    fun has(keyId: JsAny?): Boolean
    fun get(keyId: JsAny?): JsAny?
}

/**
 * Exposes the JavaScript [MediaKeyMessageEvent](https://developer.mozilla.org/en/docs/Web/API/MediaKeyMessageEvent) to Kotlin
 */
public expect open class MediaKeyMessageEvent(type: String, eventInitDict: MediaKeyMessageEventInit) : Event, JsAny {
    open val messageType: MediaKeyMessageType
    open val message: ArrayBuffer

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface MediaKeyMessageEventInit : EventInit, JsAny {
    var messageType: MediaKeyMessageType?
    var message: ArrayBuffer?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaKeyMessageEventInit(messageType: MediaKeyMessageType?, message: ArrayBuffer?, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): MediaKeyMessageEventInit

public expect open class MediaEncryptedEvent(type: String, eventInitDict: MediaEncryptedEventInit = definedExternally) : Event, JsAny {
    open val initDataType: String
    open val initData: ArrayBuffer?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface MediaEncryptedEventInit : EventInit, JsAny {
    open var initDataType: String? /* = "" */
    open var initData: ArrayBuffer? /* = null */
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaEncryptedEventInit(initDataType: String? = "", initData: ArrayBuffer? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): MediaEncryptedEventInit

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface MediaKeysRequirement : JsAny {
    companion object
}

public expect inline val MediaKeysRequirement.Companion.REQUIRED: MediaKeysRequirement

public expect inline val MediaKeysRequirement.Companion.OPTIONAL: MediaKeysRequirement

public expect inline val MediaKeysRequirement.Companion.NOT_ALLOWED: MediaKeysRequirement

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface MediaKeySessionType : JsAny {
    companion object
}

public expect inline val MediaKeySessionType.Companion.TEMPORARY: MediaKeySessionType

public expect inline val MediaKeySessionType.Companion.PERSISTENT_LICENSE: MediaKeySessionType

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface MediaKeyStatus : JsAny {
    companion object
}

public expect inline val MediaKeyStatus.Companion.USABLE: MediaKeyStatus

public expect inline val MediaKeyStatus.Companion.EXPIRED: MediaKeyStatus

public expect inline val MediaKeyStatus.Companion.RELEASED: MediaKeyStatus

public expect inline val MediaKeyStatus.Companion.OUTPUT_RESTRICTED: MediaKeyStatus

public expect inline val MediaKeyStatus.Companion.OUTPUT_DOWNSCALED: MediaKeyStatus

public expect inline val MediaKeyStatus.Companion.STATUS_PENDING: MediaKeyStatus

public expect inline val MediaKeyStatus.Companion.INTERNAL_ERROR: MediaKeyStatus

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface MediaKeyMessageType : JsAny {
    companion object
}

public expect inline val MediaKeyMessageType.Companion.LICENSE_REQUEST: MediaKeyMessageType

public expect inline val MediaKeyMessageType.Companion.LICENSE_RENEWAL: MediaKeyMessageType

public expect inline val MediaKeyMessageType.Companion.LICENSE_RELEASE: MediaKeyMessageType

public expect inline val MediaKeyMessageType.Companion.INDIVIDUALIZATION_REQUEST: MediaKeyMessageType