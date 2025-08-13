/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.encryptedmedia

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*

/**
 * Exposes the JavaScript [MediaKeySystemConfiguration](https://developer.mozilla.org/en/docs/Web/API/MediaKeySystemConfiguration) to Kotlin
 */
actual external interface MediaKeySystemConfiguration {
    actual var label: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var initDataTypes: Array<String>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
    actual var audioCapabilities: Array<MediaKeySystemMediaCapability>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
    actual var videoCapabilities: Array<MediaKeySystemMediaCapability>? /* = arrayOf() */
        get() = definedExternally
        set(value) = definedExternally
    actual var distinctiveIdentifier: MediaKeysRequirement? /* = MediaKeysRequirement.OPTIONAL */
        get() = definedExternally
        set(value) = definedExternally
    actual var persistentState: MediaKeysRequirement? /* = MediaKeysRequirement.OPTIONAL */
        get() = definedExternally
        set(value) = definedExternally
    actual var sessionTypes: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaKeySystemConfiguration(label: String?, initDataTypes: Array<String>?, audioCapabilities: Array<MediaKeySystemMediaCapability>?, videoCapabilities: Array<MediaKeySystemMediaCapability>?, distinctiveIdentifier: MediaKeysRequirement?, persistentState: MediaKeysRequirement?, sessionTypes: Array<String>?): MediaKeySystemConfiguration {
    val o = js("({})")
    o["label"] = label
    o["initDataTypes"] = initDataTypes
    o["audioCapabilities"] = audioCapabilities
    o["videoCapabilities"] = videoCapabilities
    o["distinctiveIdentifier"] = distinctiveIdentifier
    o["persistentState"] = persistentState
    o["sessionTypes"] = sessionTypes
    return o as MediaKeySystemConfiguration
}

actual external interface MediaKeySystemMediaCapability {
    actual var contentType: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var robustness: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaKeySystemMediaCapability(contentType: String?, robustness: String?): MediaKeySystemMediaCapability {
    val o = js("({})")
    o["contentType"] = contentType
    o["robustness"] = robustness
    return o as MediaKeySystemMediaCapability
}

/**
 * Exposes the JavaScript [MediaKeySystemAccess](https://developer.mozilla.org/en/docs/Web/API/MediaKeySystemAccess) to Kotlin
 */
actual external abstract class MediaKeySystemAccess {
    actual open val keySystem: String
    actual fun getConfiguration(): MediaKeySystemConfiguration
    actual fun createMediaKeys(): Promise<MediaKeys>
}

/**
 * Exposes the JavaScript [MediaKeys](https://developer.mozilla.org/en/docs/Web/API/MediaKeys) to Kotlin
 */
actual external abstract class MediaKeys {
    actual fun createSession(sessionType: MediaKeySessionType): MediaKeySession
    actual fun setServerCertificate(serverCertificate: dynamic): Promise<Boolean>
}

/**
 * Exposes the JavaScript [MediaKeySession](https://developer.mozilla.org/en/docs/Web/API/MediaKeySession) to Kotlin
 */
actual external abstract class MediaKeySession : EventTarget {
    actual open val sessionId: String
    actual open val expiration: Double
    actual open val closed: Promise<Unit>
    actual open val keyStatuses: MediaKeyStatusMap
    actual open var onkeystatuseschange: ((Event) -> dynamic)?
    actual open var onmessage: ((MessageEvent) -> dynamic)?
    actual fun generateRequest(initDataType: String, initData: dynamic): Promise<Unit>
    actual fun load(sessionId: String): Promise<Boolean>
    actual fun update(response: dynamic): Promise<Unit>
    actual fun close(): Promise<Unit>
    actual fun remove(): Promise<Unit>
}

/**
 * Exposes the JavaScript [MediaKeyStatusMap](https://developer.mozilla.org/en/docs/Web/API/MediaKeyStatusMap) to Kotlin
 */
actual external abstract class MediaKeyStatusMap {
    actual open val size: Int
    actual fun has(keyId: dynamic): Boolean
    actual fun get(keyId: dynamic): Any?
}

/**
 * Exposes the JavaScript [MediaKeyMessageEvent](https://developer.mozilla.org/en/docs/Web/API/MediaKeyMessageEvent) to Kotlin
 */
actual external open class MediaKeyMessageEvent actual constructor(type: String, eventInitDict: MediaKeyMessageEventInit) : Event {
    actual open val messageType: MediaKeyMessageType
    actual open val message: ArrayBuffer

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface MediaKeyMessageEventInit : EventInit {
    actual var messageType: MediaKeyMessageType?
    actual var message: ArrayBuffer?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaKeyMessageEventInit(messageType: MediaKeyMessageType?, message: ArrayBuffer?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaKeyMessageEventInit {
    val o = js("({})")
    o["messageType"] = messageType
    o["message"] = message
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as MediaKeyMessageEventInit
}

actual external open class MediaEncryptedEvent actual constructor(type: String, eventInitDict: MediaEncryptedEventInit) : Event {
    actual open val initDataType: String
    actual open val initData: ArrayBuffer?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface MediaEncryptedEventInit : EventInit {
    actual var initDataType: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    actual var initData: ArrayBuffer? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaEncryptedEventInit(initDataType: String?, initData: ArrayBuffer?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaEncryptedEventInit {
    val o = js("({})")
    o["initDataType"] = initDataType
    o["initData"] = initData
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as MediaEncryptedEventInit
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface MediaKeysRequirement {
    actual companion object
}

actual inline val MediaKeysRequirement.Companion.REQUIRED: MediaKeysRequirement get() = "required".asDynamic().unsafeCast<MediaKeysRequirement>()

actual inline val MediaKeysRequirement.Companion.OPTIONAL: MediaKeysRequirement get() = "optional".asDynamic().unsafeCast<MediaKeysRequirement>()

actual inline val MediaKeysRequirement.Companion.NOT_ALLOWED: MediaKeysRequirement get() = "not-allowed".asDynamic().unsafeCast<MediaKeysRequirement>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface MediaKeySessionType {
    actual companion object
}

actual inline val MediaKeySessionType.Companion.TEMPORARY: MediaKeySessionType get() = "temporary".asDynamic().unsafeCast<MediaKeySessionType>()

actual inline val MediaKeySessionType.Companion.PERSISTENT_LICENSE: MediaKeySessionType get() = "persistent-license".asDynamic().unsafeCast<MediaKeySessionType>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface MediaKeyStatus {
    actual companion object
}

actual inline val MediaKeyStatus.Companion.USABLE: MediaKeyStatus get() = "usable".asDynamic().unsafeCast<MediaKeyStatus>()

actual inline val MediaKeyStatus.Companion.EXPIRED: MediaKeyStatus get() = "expired".asDynamic().unsafeCast<MediaKeyStatus>()

actual inline val MediaKeyStatus.Companion.RELEASED: MediaKeyStatus get() = "released".asDynamic().unsafeCast<MediaKeyStatus>()

actual inline val MediaKeyStatus.Companion.OUTPUT_RESTRICTED: MediaKeyStatus get() = "output-restricted".asDynamic().unsafeCast<MediaKeyStatus>()

actual inline val MediaKeyStatus.Companion.OUTPUT_DOWNSCALED: MediaKeyStatus get() = "output-downscaled".asDynamic().unsafeCast<MediaKeyStatus>()

actual inline val MediaKeyStatus.Companion.STATUS_PENDING: MediaKeyStatus get() = "status-pending".asDynamic().unsafeCast<MediaKeyStatus>()

actual inline val MediaKeyStatus.Companion.INTERNAL_ERROR: MediaKeyStatus get() = "internal-error".asDynamic().unsafeCast<MediaKeyStatus>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface MediaKeyMessageType {
    actual companion object
}

actual inline val MediaKeyMessageType.Companion.LICENSE_REQUEST: MediaKeyMessageType get() = "license-request".asDynamic().unsafeCast<MediaKeyMessageType>()

actual inline val MediaKeyMessageType.Companion.LICENSE_RENEWAL: MediaKeyMessageType get() = "license-renewal".asDynamic().unsafeCast<MediaKeyMessageType>()

actual inline val MediaKeyMessageType.Companion.LICENSE_RELEASE: MediaKeyMessageType get() = "license-release".asDynamic().unsafeCast<MediaKeyMessageType>()

actual inline val MediaKeyMessageType.Companion.INDIVIDUALIZATION_REQUEST: MediaKeyMessageType get() = "individualization-request".asDynamic().unsafeCast<MediaKeyMessageType>()