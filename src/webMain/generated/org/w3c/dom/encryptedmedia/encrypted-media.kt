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

/**
 * The MediaKeySystemAccess interface of the Encrypted Media Extensions API provides access to a Key System for
 * decryption and/or a content protection provider. You can request an instance of this object using the
 * Navigator.requestMediaKeySystemAccess() method.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess)
 */
public external abstract class MediaKeySystemAccess : JsAny {
    /**
     * The keySystem read-only property of the MediaKeySystemAccess interface returns a string identifying the key
     * system being used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/keySystem)
     */
    open val keySystem: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/getConfiguration)
     */
    open fun getConfiguration(): MediaKeySystemConfiguration

    /**
     * The MediaKeySystemAccess.createMediaKeys() method returns a Promise that resolves to a new MediaKeys object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySystemAccess/createMediaKeys)
     */
    open fun createMediaKeys(): Promise<MediaKeys>
}

public external interface MediaKeySessionType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaKeySessionType.Companion.TEMPORARY: MediaKeySessionType get() = "temporary".toJsString().unsafeCast<MediaKeySessionType>()
public inline val MediaKeySessionType.Companion.PERSISTENT_LICENSE: MediaKeySessionType get() = "persistent-license".toJsString().unsafeCast<MediaKeySessionType>()

/**
 * The MediaKeys interface of Encrypted Media Extensions API represents a set of keys that an associated
 * HTMLMediaElement can use for decryption of media data during playback.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys)
 */
public external abstract class MediaKeys : JsAny {
    /**
     * The createSession() method of the MediaKeys interface returns a new MediaKeySession object, which represents a
     * context for message exchange with a content decryption module (CDM).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/createSession)
     */
    open fun createSession(sessionType: MediaKeySessionType = definedExternally): MediaKeySession

    /**
     * The getStatusForPolicy() method of the MediaKeys interface is used to check whether the Content Decryption Module
     * (CDM) would allow the presentation of encrypted media data using the keys, based on the specified policy
     * requirements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/getStatusForPolicy)
     */
    open fun getStatusForPolicy(policy: MediaKeysPolicy = definedExternally): Promise<MediaKeyStatus>

    /**
     * The setServerCertificate() method of the MediaKeys interface provides a server certificate to be used to encrypt
     * messages to the license server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeys/setServerCertificate)
     */
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

/**
 * The MediaKeySession interface of the Encrypted Media Extensions API represents a context for message exchange with a
 * content decryption module (CDM).
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession)
 */
public external abstract class MediaKeySession : EventTarget {
    /**
     * The sessionId read-only property of the MediaKeySession interface contains a unique string generated by the
     * content decryption module (CDM) for the current media object and its associated keys or licenses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/sessionId)
     */
    open val sessionId: String

    /**
     * The expiration read-only property of the MediaKeySession interface returns the time after which the keys in the
     * current session can no longer be used to decrypt media data, or NaN if no such time exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/expiration)
     */
    open val expiration: Double

    /**
     * The closed read-only property of the MediaKeySession interface returns a Promise signaling when a MediaKeySession
     * closes. This promise can only be fulfilled and is never rejected. Closing a session means that licenses and keys
     * associated with it are no longer valid for decrypting media data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/closed)
     */
    open val closed: Promise<MediaKeySessionClosedReason>

    /**
     * The keyStatuses read-only property of the MediaKeySession interface returns a reference to a read-only
     * MediaKeyStatusMap of the current session's keys and their statuses.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keyStatuses)
     */
    open val keyStatuses: MediaKeyStatusMap

    /**
     * The keystatuseschange event of the MediaKeySession API fires when there has been a change in the keys or their
     * statuses within a session.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/keystatuseschange_event)
     */
    open var onkeystatuseschange: ((Event) -> Unit)?

    /**
     * The message event of the MediaKeySession interface fires when a message is generated by the content decryption
     * module.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/message_event)
     */
    open var onmessage: ((MediaKeyMessageEvent) -> Unit)?

    /**
     * The generateRequest() method of the MediaKeySession interface returns a Promise after generating a license
     * request based on initialization data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/generateRequest)
     */
    open fun generateRequest(initDataType: String, initData: BufferDataSource): Promise<JsAny?>

    /**
     * The load() method of the MediaKeySession interface returns a Promise that resolves to a boolean value after
     * loading data for a specified session object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/load)
     */
    open fun load(sessionId: String): Promise<JsBoolean>

    /**
     * The update() method of the MediaKeySession interface loads messages and licenses to the CDM, and then returns a
     * Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/update)
     */
    open fun update(response: BufferDataSource): Promise<JsAny?>

    /**
     * The close() method of the MediaKeySession interface notifies that the current media session is no longer needed,
     * and that the content decryption module should release any resources associated with this object and close it.
     * Then, it returns a Promise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/close)
     */
    open fun close(): Promise<JsAny?>

    /**
     * The remove() method of the MediaKeySession interface returns a Promise after removing any session data associated
     * with the current object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeySession/remove)
     */
    open fun remove(): Promise<JsAny?>
}

/**
 * The MediaKeyStatusMap interface of the Encrypted Media Extensions API is a read-only map of media key statuses by key
 * IDs.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap)
 */
public external abstract class MediaKeyStatusMap : JsAny {
    // not printed yet: iterable

    /**
     * The size read-only property of the MediaKeyStatusMap interface returns the number of key/value paIrs in the
     * status map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size)
     */
    open val size: Int

    /**
     * The has() method of the MediaKeyStatusMap interface returns a Boolean, asserting whether a value has been
     * associated with the given key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has)
     */
    open fun has(keyId: BufferDataSource): Boolean

    /**
     * The get() method of the MediaKeyStatusMap interface returns the status value associated with the given key, or
     * undefined if there is none.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get)
     */
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

/**
 * The MediaKeyMessageEvent interface of the Encrypted Media Extensions API contains the content and related data when
 * the content decryption module generates a message for the session.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent)
 */
public external open class MediaKeyMessageEvent : Event {
    /**
     * The MediaKeyMessageEvent constructor creates a new MediaKeyMessageEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/MediaKeyMessageEvent)
     */
    constructor(type: String, eventInitDict: MediaKeyMessageEventInit)

    /**
     * The MediaKeyMessageEvent.messageType read-only property indicates the type of message. It may be one of
     * license-request, license-renewal, license-release, or individualization-request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/messageType)
     */
    open val messageType: MediaKeyMessageType

    /**
     * The MediaKeyMessageEvent.message read-only property returns an ArrayBuffer with a message from the content
     * decryption module. Messages vary by key system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyMessageEvent/message)
     */
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

/**
 * The MediaEncryptedEvent interface of the Encrypted Media Extensions API contains the information associated with an
 * encrypted event sent to a HTMLMediaElement when some initialization data is encountered in the media.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent)
 */
public external open class MediaEncryptedEvent : Event {
    /**
     * The MediaEncryptedEvent constructor creates a new MediaEncryptedEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/MediaEncryptedEvent)
     */
    constructor(type: String, eventInitDict: MediaEncryptedEventInit = definedExternally)

    /**
     * The read-only initDataType property of the MediaKeyMessageEvent returns a case-sensitive string describing the
     * type of the initialization data associated with this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initDataType)
     */
    open val initDataType: String

    /**
     * The read-only initData property of the MediaKeyMessageEvent returns the initialization data contained in this
     * event, if any.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaEncryptedEvent/initData)
     */
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
