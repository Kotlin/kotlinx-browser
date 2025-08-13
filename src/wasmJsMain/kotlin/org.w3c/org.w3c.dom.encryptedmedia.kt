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
public actual external interface MediaKeySystemConfiguration : JsAny {
    actual var label: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var initDataTypes: JsArray<JsString>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
    actual var audioCapabilities: JsArray<MediaKeySystemMediaCapability>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
    actual var videoCapabilities: JsArray<MediaKeySystemMediaCapability>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
    actual var distinctiveIdentifier: MediaKeysRequirement? /* = MediaKeysRequirement.OPTIONAL */
        get() = definedExternally
        set(value) = definedExternally
    actual var persistentState: MediaKeysRequirement? /* = MediaKeysRequirement.OPTIONAL */
        get() = definedExternally
        set(value) = definedExternally
    actual var sessionTypes: JsArray<JsString>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaKeySystemConfiguration(label: String?, initDataTypes: JsArray<JsString>?, audioCapabilities: JsArray<MediaKeySystemMediaCapability>?, videoCapabilities: JsArray<MediaKeySystemMediaCapability>?, distinctiveIdentifier: MediaKeysRequirement?, persistentState: MediaKeysRequirement?, sessionTypes: JsArray<JsString>?): MediaKeySystemConfiguration = js("({ label: label, initDataTypes: initDataTypes, audioCapabilities: audioCapabilities, videoCapabilities: videoCapabilities, distinctiveIdentifier: distinctiveIdentifier, persistentState: persistentState, sessionTypes: sessionTypes })")

public actual external interface MediaKeySystemMediaCapability : JsAny {
    actual var contentType: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var robustness: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaKeySystemMediaCapability(contentType: String?, robustness: String?): MediaKeySystemMediaCapability = js("({ contentType: contentType, robustness: robustness })")

/**
 * Exposes the JavaScript [MediaKeySystemAccess](https://developer.mozilla.org/en/docs/Web/API/MediaKeySystemAccess) to Kotlin
 */
public actual external abstract class MediaKeySystemAccess : JsAny {
    actual open val keySystem: String
    actual fun getConfiguration(): MediaKeySystemConfiguration
    actual fun createMediaKeys(): Promise<MediaKeys>
}

/**
 * Exposes the JavaScript [MediaKeys](https://developer.mozilla.org/en/docs/Web/API/MediaKeys) to Kotlin
 */
public actual external abstract class MediaKeys : JsAny {
    actual fun createSession(sessionType: MediaKeySessionType): MediaKeySession
    actual fun setServerCertificate(serverCertificate: JsAny?): Promise<JsBoolean>
}

/**
 * Exposes the JavaScript [MediaKeySession](https://developer.mozilla.org/en/docs/Web/API/MediaKeySession) to Kotlin
 */
public actual external abstract class MediaKeySession : EventTarget, JsAny {
    actual open val sessionId: String
    actual open val expiration: Double
    actual open val closed: Promise<Nothing?>
    actual open val keyStatuses: MediaKeyStatusMap
    actual open var onkeystatuseschange: ((Event) -> Unit)?
    actual open var onmessage: ((MessageEvent) -> Unit)?
    actual fun generateRequest(initDataType: String, initData: JsAny?): Promise<Nothing?>
    actual fun load(sessionId: String): Promise<JsBoolean>
    actual fun update(response: JsAny?): Promise<Nothing?>
    actual fun close(): Promise<Nothing?>
    actual fun remove(): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [MediaKeyStatusMap](https://developer.mozilla.org/en/docs/Web/API/MediaKeyStatusMap) to Kotlin
 */
public actual external abstract class MediaKeyStatusMap : JsAny {
    actual open val size: Int
    actual fun has(keyId: JsAny?): Boolean
    actual fun get(keyId: JsAny?): JsAny?
}

/**
 * Exposes the JavaScript [MediaKeyMessageEvent](https://developer.mozilla.org/en/docs/Web/API/MediaKeyMessageEvent) to Kotlin
 */
public actual external open class MediaKeyMessageEvent actual constructor(type: String, eventInitDict: MediaKeyMessageEventInit) : Event, JsAny {
    actual open val messageType: MediaKeyMessageType
    actual open val message: ArrayBuffer

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface MediaKeyMessageEventInit : EventInit, JsAny {
    actual var messageType: MediaKeyMessageType?
    actual var message: ArrayBuffer?
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaKeyMessageEventInit(messageType: MediaKeyMessageType?, message: ArrayBuffer?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaKeyMessageEventInit = js("({ messageType: messageType, message: message, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external open class MediaEncryptedEvent actual constructor(type: String, eventInitDict: MediaEncryptedEventInit) : Event, JsAny {
    actual open val initDataType: String
    actual open val initData: ArrayBuffer?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface MediaEncryptedEventInit : EventInit, JsAny {
    actual var initDataType: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var initData: ArrayBuffer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaEncryptedEventInit(initDataType: String?, initData: ArrayBuffer?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaEncryptedEventInit = js("({ initDataType: initDataType, initData: initData, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface MediaKeysRequirement : JsAny {
    actual companion object
}

public actual inline val MediaKeysRequirement.Companion.REQUIRED: MediaKeysRequirement get() = "required".toJsString().unsafeCast<MediaKeysRequirement>()

public actual inline val MediaKeysRequirement.Companion.OPTIONAL: MediaKeysRequirement get() = "optional".toJsString().unsafeCast<MediaKeysRequirement>()

public actual inline val MediaKeysRequirement.Companion.NOT_ALLOWED: MediaKeysRequirement get() = "not-allowed".toJsString().unsafeCast<MediaKeysRequirement>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface MediaKeySessionType : JsAny {
    actual companion object
}

public actual inline val MediaKeySessionType.Companion.TEMPORARY: MediaKeySessionType get() = "temporary".toJsString().unsafeCast<MediaKeySessionType>()

public actual inline val MediaKeySessionType.Companion.PERSISTENT_LICENSE: MediaKeySessionType get() = "persistent-license".toJsString().unsafeCast<MediaKeySessionType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface MediaKeyStatus : JsAny {
    actual companion object
}

public actual inline val MediaKeyStatus.Companion.USABLE: MediaKeyStatus get() = "usable".toJsString().unsafeCast<MediaKeyStatus>()

public actual inline val MediaKeyStatus.Companion.EXPIRED: MediaKeyStatus get() = "expired".toJsString().unsafeCast<MediaKeyStatus>()

public actual inline val MediaKeyStatus.Companion.RELEASED: MediaKeyStatus get() = "released".toJsString().unsafeCast<MediaKeyStatus>()

public actual inline val MediaKeyStatus.Companion.OUTPUT_RESTRICTED: MediaKeyStatus get() = "output-restricted".toJsString().unsafeCast<MediaKeyStatus>()

public actual inline val MediaKeyStatus.Companion.OUTPUT_DOWNSCALED: MediaKeyStatus get() = "output-downscaled".toJsString().unsafeCast<MediaKeyStatus>()

public actual inline val MediaKeyStatus.Companion.STATUS_PENDING: MediaKeyStatus get() = "status-pending".toJsString().unsafeCast<MediaKeyStatus>()

public actual inline val MediaKeyStatus.Companion.INTERNAL_ERROR: MediaKeyStatus get() = "internal-error".toJsString().unsafeCast<MediaKeyStatus>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface MediaKeyMessageType : JsAny {
    actual companion object
}

public actual inline val MediaKeyMessageType.Companion.LICENSE_REQUEST: MediaKeyMessageType get() = "license-request".toJsString().unsafeCast<MediaKeyMessageType>()

public actual inline val MediaKeyMessageType.Companion.LICENSE_RENEWAL: MediaKeyMessageType get() = "license-renewal".toJsString().unsafeCast<MediaKeyMessageType>()

public actual inline val MediaKeyMessageType.Companion.LICENSE_RELEASE: MediaKeyMessageType get() = "license-release".toJsString().unsafeCast<MediaKeyMessageType>()

public actual inline val MediaKeyMessageType.Companion.INDIVIDUALIZATION_REQUEST: MediaKeyMessageType get() = "individualization-request".toJsString().unsafeCast<MediaKeyMessageType>()