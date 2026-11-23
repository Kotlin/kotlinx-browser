/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'encrypted-media', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.encryptedmedia

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*

public external interface MediaKeysRequirement : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaKeysRequirement.Companion.REQUIRED: MediaKeysRequirement get() = "required".toJsString().unsafeCast<MediaKeysRequirement>()
public inline val MediaKeysRequirement.Companion.OPTIONAL: MediaKeysRequirement get() = "optional".toJsString().unsafeCast<MediaKeysRequirement>()
public inline val MediaKeysRequirement.Companion.NOT_ALLOWED: MediaKeysRequirement get() = "not-allowed".toJsString().unsafeCast<MediaKeysRequirement>()

public external interface MediaKeySystemConfiguration : JsAny {
    var label: String?
    var initDataTypes: JsArray<JsString>?
    var audioCapabilities: JsArray<MediaKeySystemMediaCapability>?
    var videoCapabilities: JsArray<MediaKeySystemMediaCapability>?
    var distinctiveIdentifier: MediaKeysRequirement?
    var persistentState: MediaKeysRequirement?
    var sessionTypes: JsArray<JsString>?
}

public fun MediaKeySystemConfiguration(label: String? = null, initDataTypes: JsArray<JsString>? = null, audioCapabilities: JsArray<MediaKeySystemMediaCapability>? = null, videoCapabilities: JsArray<MediaKeySystemMediaCapability>? = null, distinctiveIdentifier: MediaKeysRequirement? = null, persistentState: MediaKeysRequirement? = null, sessionTypes: JsArray<JsString>? = null): MediaKeySystemConfiguration = newJsObject<MediaKeySystemConfiguration>().apply {
    if (label != null) this.label = label
    if (initDataTypes != null) this.initDataTypes = initDataTypes
    if (audioCapabilities != null) this.audioCapabilities = audioCapabilities
    if (videoCapabilities != null) this.videoCapabilities = videoCapabilities
    if (distinctiveIdentifier != null) this.distinctiveIdentifier = distinctiveIdentifier
    if (persistentState != null) this.persistentState = persistentState
    if (sessionTypes != null) this.sessionTypes = sessionTypes
}

public external interface MediaKeySystemMediaCapability : JsAny {
    var contentType: String?
    var encryptionScheme: String?
    var robustness: String?
}

public fun MediaKeySystemMediaCapability(contentType: String? = null, encryptionScheme: String? = null, robustness: String? = null): MediaKeySystemMediaCapability = newJsObject<MediaKeySystemMediaCapability>().apply {
    if (contentType != null) this.contentType = contentType
    if (encryptionScheme != null) this.encryptionScheme = encryptionScheme
    if (robustness != null) this.robustness = robustness
}

public external abstract class MediaKeySystemAccess : JsAny {
    open val keySystem: String
    open fun getConfiguration(): MediaKeySystemConfiguration
    open fun createMediaKeys(): Promise<MediaKeys>
}

public external interface MediaKeySessionType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaKeySessionType.Companion.TEMPORARY: MediaKeySessionType get() = "temporary".toJsString().unsafeCast<MediaKeySessionType>()
public inline val MediaKeySessionType.Companion.PERSISTENT_LICENSE: MediaKeySessionType get() = "persistent-license".toJsString().unsafeCast<MediaKeySessionType>()

public external abstract class MediaKeys : JsAny {
    open fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession
    open fun getStatusForPolicy(policy: MediaKeysPolicy = definedExternally): Promise<MediaKeyStatus>
    open fun setServerCertificate(serverCertificate: BufferDataSource): Promise<JsBoolean>
}

public external interface MediaKeysPolicy : JsAny {
    var minHdcpVersion: String?
}

public fun MediaKeysPolicy(minHdcpVersion: String? = null): MediaKeysPolicy = newJsObject<MediaKeysPolicy>().apply {
    if (minHdcpVersion != null) this.minHdcpVersion = minHdcpVersion
}

public external interface MediaKeySessionClosedReason : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaKeySessionClosedReason.Companion.INTERNAL_ERROR: MediaKeySessionClosedReason get() = "internal-error".toJsString().unsafeCast<MediaKeySessionClosedReason>()
public inline val MediaKeySessionClosedReason.Companion.CLOSED_BY_APPLICATION: MediaKeySessionClosedReason get() = "closed-by-application".toJsString().unsafeCast<MediaKeySessionClosedReason>()
public inline val MediaKeySessionClosedReason.Companion.RELEASE_ACKNOWLEDGED: MediaKeySessionClosedReason get() = "release-acknowledged".toJsString().unsafeCast<MediaKeySessionClosedReason>()
public inline val MediaKeySessionClosedReason.Companion.HARDWARE_CONTEXT_RESET: MediaKeySessionClosedReason get() = "hardware-context-reset".toJsString().unsafeCast<MediaKeySessionClosedReason>()
public inline val MediaKeySessionClosedReason.Companion.RESOURCE_EVICTED: MediaKeySessionClosedReason get() = "resource-evicted".toJsString().unsafeCast<MediaKeySessionClosedReason>()

public external abstract class MediaKeySession : EventTarget {
    open val sessionId: String
    open val expiration: Double
    open val closed: Promise<MediaKeySessionClosedReason>
    open val keyStatuses: MediaKeyStatusMap
    open var onkeystatuseschange: ((Event) -> Unit)?
    open var onmessage: ((MediaKeyMessageEvent) -> Unit)?
    open fun generateRequest(initDataType: String, initData: BufferDataSource): Promise<JsAny?>
    open fun load(sessionId: String): Promise<JsBoolean>
    open fun update(response: BufferDataSource): Promise<JsAny?>
    open fun close(): Promise<JsAny?>
    open fun remove(): Promise<JsAny?>
}

public external abstract class MediaKeyStatusMap : JsAny {
    // not printed yet: iterable
    open val size: Int
    open fun has(keyId: BufferDataSource): Boolean
    open fun get(keyId: BufferDataSource): MediaKeyStatus?
}

public external interface MediaKeyStatus : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaKeyStatus.Companion.USABLE: MediaKeyStatus get() = "usable".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.EXPIRED: MediaKeyStatus get() = "expired".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.RELEASED: MediaKeyStatus get() = "released".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.OUTPUT_RESTRICTED: MediaKeyStatus get() = "output-restricted".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.OUTPUT_DOWNSCALED: MediaKeyStatus get() = "output-downscaled".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.USABLE_IN_FUTURE: MediaKeyStatus get() = "usable-in-future".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.STATUS_PENDING: MediaKeyStatus get() = "status-pending".toJsString().unsafeCast<MediaKeyStatus>()
public inline val MediaKeyStatus.Companion.INTERNAL_ERROR: MediaKeyStatus get() = "internal-error".toJsString().unsafeCast<MediaKeyStatus>()

public external interface MediaKeyMessageType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaKeyMessageType.Companion.LICENSE_REQUEST: MediaKeyMessageType get() = "license-request".toJsString().unsafeCast<MediaKeyMessageType>()
public inline val MediaKeyMessageType.Companion.LICENSE_RENEWAL: MediaKeyMessageType get() = "license-renewal".toJsString().unsafeCast<MediaKeyMessageType>()
public inline val MediaKeyMessageType.Companion.LICENSE_RELEASE: MediaKeyMessageType get() = "license-release".toJsString().unsafeCast<MediaKeyMessageType>()
public inline val MediaKeyMessageType.Companion.INDIVIDUALIZATION_REQUEST: MediaKeyMessageType get() = "individualization-request".toJsString().unsafeCast<MediaKeyMessageType>()

public external open class MediaKeyMessageEvent : Event {
    constructor(type: String, eventInitDict: MediaKeyMessageEventInit)
    open val messageType: MediaKeyMessageType
    open val message: ArrayBuffer

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface MediaKeyMessageEventInit : EventInit {
    var messageType: MediaKeyMessageType
    var message: ArrayBuffer
}

public fun MediaKeyMessageEventInit(messageType: MediaKeyMessageType, message: ArrayBuffer, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): MediaKeyMessageEventInit = newJsObject<MediaKeyMessageEventInit>().apply {
    this.messageType = messageType
    this.message = message
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

public external open class MediaEncryptedEvent : Event {
    constructor(type: String, eventInitDict: MediaEncryptedEventInit = definedExternally)
    open val initDataType: String
    open val initData: ArrayBuffer?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface MediaEncryptedEventInit : EventInit {
    var initDataType: String?
    var initData: ArrayBuffer?
}

public fun MediaEncryptedEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, initDataType: String? = null, initData: ArrayBuffer? = null): MediaEncryptedEventInit = newJsObject<MediaEncryptedEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (initDataType != null) this.initDataType = initDataType
    if (initData != null) this.initData = initData
}
