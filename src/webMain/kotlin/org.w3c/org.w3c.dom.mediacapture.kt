/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.mediacapture

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

/**
 * Exposes the JavaScript [MediaStream](https://developer.mozilla.org/en/docs/Web/API/MediaStream) to Kotlin
 */
public expect open class MediaStream() : EventTarget, MediaProvider, JsAny {
    constructor(stream: MediaStream)
    constructor(tracks: JsArray<MediaStreamTrack>)
    open val id: String
    open val active: Boolean
    var onaddtrack: ((MediaStreamTrackEvent) -> Unit)?
    var onremovetrack: ((MediaStreamTrackEvent) -> Unit)?
    fun getAudioTracks(): JsArray<MediaStreamTrack>
    fun getVideoTracks(): JsArray<MediaStreamTrack>
    fun getTracks(): JsArray<MediaStreamTrack>
    fun getTrackById(trackId: String): MediaStreamTrack?
    fun addTrack(track: MediaStreamTrack)
    fun removeTrack(track: MediaStreamTrack)
    fun clone(): MediaStream
}

/**
 * Exposes the JavaScript [MediaStreamTrack](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrack) to Kotlin
 */
public expect abstract class MediaStreamTrack : EventTarget, JsAny {
    open val kind: String
    open val id: String
    open val label: String
    open var enabled: Boolean
    open val muted: Boolean
    open var onmute: ((Event) -> Unit)?
    open var onunmute: ((Event) -> Unit)?
    open val readyState: MediaStreamTrackState
    open var onended: ((Event) -> Unit)?
    open var onoverconstrained: ((Event) -> Unit)?
    fun clone(): MediaStreamTrack
    fun stop()
    fun getCapabilities(): MediaTrackCapabilities
    fun getConstraints(): MediaTrackConstraints
    fun getSettings(): MediaTrackSettings
    fun applyConstraints(constraints: MediaTrackConstraints = definedExternally): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [MediaTrackSupportedConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSupportedConstraints) to Kotlin
 */
public expect interface MediaTrackSupportedConstraints : JsAny {
    open var width: Boolean? /* = true */
    open var height: Boolean? /* = true */
    open var aspectRatio: Boolean? /* = true */
    open var frameRate: Boolean? /* = true */
    open var facingMode: Boolean? /* = true */
    open var resizeMode: Boolean? /* = true */
    open var volume: Boolean? /* = true */
    open var sampleRate: Boolean? /* = true */
    open var sampleSize: Boolean? /* = true */
    open var echoCancellation: Boolean? /* = true */
    open var autoGainControl: Boolean? /* = true */
    open var noiseSuppression: Boolean? /* = true */
    open var latency: Boolean? /* = true */
    open var channelCount: Boolean? /* = true */
    open var deviceId: Boolean? /* = true */
    open var groupId: Boolean? /* = true */
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaTrackSupportedConstraints(width: Boolean? = true, height: Boolean? = true, aspectRatio: Boolean? = true, frameRate: Boolean? = true, facingMode: Boolean? = true, resizeMode: Boolean? = true, volume: Boolean? = true, sampleRate: Boolean? = true, sampleSize: Boolean? = true, echoCancellation: Boolean? = true, autoGainControl: Boolean? = true, noiseSuppression: Boolean? = true, latency: Boolean? = true, channelCount: Boolean? = true, deviceId: Boolean? = true, groupId: Boolean? = true): MediaTrackSupportedConstraints

public expect interface MediaTrackCapabilities : JsAny {
    open var width: ULongRange?
    open var height: ULongRange?
    open var aspectRatio: DoubleRange?
    open var frameRate: DoubleRange?
    open var facingMode: JsArray<JsString>?
    open var resizeMode: JsArray<JsString>?
    open var volume: DoubleRange?
    open var sampleRate: ULongRange?
    open var sampleSize: ULongRange?
    open var echoCancellation: JsArray<JsBoolean>?
    open var autoGainControl: JsArray<JsBoolean>?
    open var noiseSuppression: JsArray<JsBoolean>?
    open var latency: DoubleRange?
    open var channelCount: ULongRange?
    open var deviceId: String?
    open var groupId: String?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaTrackCapabilities(width: ULongRange? = undefined, height: ULongRange? = undefined, aspectRatio: DoubleRange? = undefined, frameRate: DoubleRange? = undefined, facingMode: JsArray<JsString>? = undefined, resizeMode: JsArray<JsString>? = undefined, volume: DoubleRange? = undefined, sampleRate: ULongRange? = undefined, sampleSize: ULongRange? = undefined, echoCancellation: JsArray<JsBoolean>? = undefined, autoGainControl: JsArray<JsBoolean>? = undefined, noiseSuppression: JsArray<JsBoolean>? = undefined, latency: DoubleRange? = undefined, channelCount: ULongRange? = undefined, deviceId: String? = undefined, groupId: String? = undefined): MediaTrackCapabilities

/**
 * Exposes the JavaScript [MediaTrackConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaTrackConstraints) to Kotlin
 */
public expect interface MediaTrackConstraints : MediaTrackConstraintSet, JsAny {
    open var advanced: JsArray<MediaTrackConstraintSet>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaTrackConstraints(advanced: JsArray<MediaTrackConstraintSet>? = undefined, width: JsAny? /* Int|ConstrainULongRange */ = undefined, height: JsAny? /* Int|ConstrainULongRange */ = undefined, aspectRatio: JsAny? /* Double|ConstrainDoubleRange */ = undefined, frameRate: JsAny? /* Double|ConstrainDoubleRange */ = undefined, facingMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined, resizeMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined, volume: JsAny? /* Double|ConstrainDoubleRange */ = undefined, sampleRate: JsAny? /* Int|ConstrainULongRange */ = undefined, sampleSize: JsAny? /* Int|ConstrainULongRange */ = undefined, echoCancellation: JsAny? /* Boolean|ConstrainBooleanParameters */ = undefined, autoGainControl: JsAny? /* Boolean|ConstrainBooleanParameters */ = undefined, noiseSuppression: JsAny? /* Boolean|ConstrainBooleanParameters */ = undefined, latency: JsAny? /* Double|ConstrainDoubleRange */ = undefined, channelCount: JsAny? /* Int|ConstrainULongRange */ = undefined, deviceId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined, groupId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined): MediaTrackConstraints

public expect interface MediaTrackConstraintSet : JsAny {
    open var width: JsAny? /* Int|ConstrainULongRange */
    open var height: JsAny? /* Int|ConstrainULongRange */
    open var aspectRatio: JsAny? /* Double|ConstrainDoubleRange */
    open var frameRate: JsAny? /* Double|ConstrainDoubleRange */
    open var facingMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
    open var resizeMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
    open var volume: JsAny? /* Double|ConstrainDoubleRange */
    open var sampleRate: JsAny? /* Int|ConstrainULongRange */
    open var sampleSize: JsAny? /* Int|ConstrainULongRange */
    open var echoCancellation: JsAny? /* Boolean|ConstrainBooleanParameters */
    open var autoGainControl: JsAny? /* Boolean|ConstrainBooleanParameters */
    open var noiseSuppression: JsAny? /* Boolean|ConstrainBooleanParameters */
    open var latency: JsAny? /* Double|ConstrainDoubleRange */
    open var channelCount: JsAny? /* Int|ConstrainULongRange */
    open var deviceId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
    open var groupId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaTrackConstraintSet(width: JsAny? /* Int|ConstrainULongRange */ = undefined, height: JsAny? /* Int|ConstrainULongRange */ = undefined, aspectRatio: JsAny? /* Double|ConstrainDoubleRange */ = undefined, frameRate: JsAny? /* Double|ConstrainDoubleRange */ = undefined, facingMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined, resizeMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined, volume: JsAny? /* Double|ConstrainDoubleRange */ = undefined, sampleRate: JsAny? /* Int|ConstrainULongRange */ = undefined, sampleSize: JsAny? /* Int|ConstrainULongRange */ = undefined, echoCancellation: JsAny? /* Boolean|ConstrainBooleanParameters */ = undefined, autoGainControl: JsAny? /* Boolean|ConstrainBooleanParameters */ = undefined, noiseSuppression: JsAny? /* Boolean|ConstrainBooleanParameters */ = undefined, latency: JsAny? /* Double|ConstrainDoubleRange */ = undefined, channelCount: JsAny? /* Int|ConstrainULongRange */ = undefined, deviceId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined, groupId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */ = undefined): MediaTrackConstraintSet

/**
 * Exposes the JavaScript [MediaTrackSettings](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSettings) to Kotlin
 */
public expect interface MediaTrackSettings : JsAny {
    open var width: Int?
    open var height: Int?
    open var aspectRatio: Double?
    open var frameRate: Double?
    open var facingMode: String?
    open var resizeMode: String?
    open var volume: Double?
    open var sampleRate: Int?
    open var sampleSize: Int?
    open var echoCancellation: Boolean?
    open var autoGainControl: Boolean?
    open var noiseSuppression: Boolean?
    open var latency: Double?
    open var channelCount: Int?
    open var deviceId: String?
    open var groupId: String?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaTrackSettings(width: Int? = undefined, height: Int? = undefined, aspectRatio: Double? = undefined, frameRate: Double? = undefined, facingMode: String? = undefined, resizeMode: String? = undefined, volume: Double? = undefined, sampleRate: Int? = undefined, sampleSize: Int? = undefined, echoCancellation: Boolean? = undefined, autoGainControl: Boolean? = undefined, noiseSuppression: Boolean? = undefined, latency: Double? = undefined, channelCount: Int? = undefined, deviceId: String? = undefined, groupId: String? = undefined): MediaTrackSettings

/**
 * Exposes the JavaScript [MediaStreamTrackEvent](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrackEvent) to Kotlin
 */
public expect open class MediaStreamTrackEvent(type: String, eventInitDict: MediaStreamTrackEventInit) : Event, JsAny {
    open val track: MediaStreamTrack

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface MediaStreamTrackEventInit : EventInit, JsAny {
    var track: MediaStreamTrack?
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaStreamTrackEventInit(track: MediaStreamTrack?, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): MediaStreamTrackEventInit

public expect open class OverconstrainedErrorEvent(type: String, eventInitDict: OverconstrainedErrorEventInit) : Event, JsAny {
    open val error: JsAny?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public expect interface OverconstrainedErrorEventInit : EventInit, JsAny {
    open var error: JsAny? /* = null */
}

@Suppress("UNUSED_PARAMETER")
public expect fun OverconstrainedErrorEventInit(error: JsAny? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): OverconstrainedErrorEventInit

/**
 * Exposes the JavaScript [MediaDevices](https://developer.mozilla.org/en/docs/Web/API/MediaDevices) to Kotlin
 */
public expect abstract class MediaDevices : EventTarget, JsAny {
    open var ondevicechange: ((Event) -> Unit)?
    fun enumerateDevices(): Promise<JsArray<MediaDeviceInfo>>
    fun getSupportedConstraints(): MediaTrackSupportedConstraints
    fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}

/**
 * Exposes the JavaScript [MediaDeviceInfo](https://developer.mozilla.org/en/docs/Web/API/MediaDeviceInfo) to Kotlin
 */
public expect abstract class MediaDeviceInfo : JsAny {
    open val deviceId: String
    open val kind: MediaDeviceKind
    open val label: String
    open val groupId: String
    fun toJSON(): JsAny
}

public expect abstract class InputDeviceInfo : MediaDeviceInfo, JsAny {
    fun getCapabilities(): MediaTrackCapabilities
}

/**
 * Exposes the JavaScript [MediaStreamConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaStreamConstraints) to Kotlin
 */
public expect interface MediaStreamConstraints : JsAny {
    open var video: JsAny? /* Boolean|MediaTrackConstraints */
    open var audio: JsAny? /* Boolean|MediaTrackConstraints */
}

@Suppress("UNUSED_PARAMETER")
public expect fun MediaStreamConstraints(video: JsAny? /* Boolean|MediaTrackConstraints */ = false.toJsBoolean(), audio: JsAny? /* Boolean|MediaTrackConstraints */ = false.toJsBoolean()): MediaStreamConstraints

public expect interface ConstrainablePattern : JsAny {
    open var onoverconstrained: ((Event) -> Unit)?
    fun getCapabilities(): Capabilities
    fun getConstraints(): Constraints
    fun getSettings(): Settings
    fun applyConstraints(constraints: Constraints = definedExternally): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [DoubleRange](https://developer.mozilla.org/en/docs/Web/API/DoubleRange) to Kotlin
 */
public expect interface DoubleRange : JsAny {
    open var max: Double?
    open var min: Double?
}

@Suppress("UNUSED_PARAMETER")
public expect fun DoubleRange(max: Double? = undefined, min: Double? = undefined): DoubleRange

public expect interface ConstrainDoubleRange : DoubleRange, JsAny {
    open var exact: Double?
    open var ideal: Double?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ConstrainDoubleRange(exact: Double? = undefined, ideal: Double? = undefined, max: Double? = undefined, min: Double? = undefined): ConstrainDoubleRange

public expect interface ULongRange : JsAny {
    open var max: Int?
    open var min: Int?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ULongRange(max: Int? = undefined, min: Int? = undefined): ULongRange

public expect interface ConstrainULongRange : ULongRange, JsAny {
    open var exact: Int?
    open var ideal: Int?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ConstrainULongRange(exact: Int? = undefined, ideal: Int? = undefined, max: Int? = undefined, min: Int? = undefined): ConstrainULongRange

/**
 * Exposes the JavaScript [ConstrainBooleanParameters](https://developer.mozilla.org/en/docs/Web/API/ConstrainBooleanParameters) to Kotlin
 */
public expect interface ConstrainBooleanParameters : JsAny {
    open var exact: Boolean?
    open var ideal: Boolean?
}

@Suppress("UNUSED_PARAMETER")
public expect fun ConstrainBooleanParameters(exact: Boolean? = undefined, ideal: Boolean? = undefined): ConstrainBooleanParameters

/**
 * Exposes the JavaScript [ConstrainDOMStringParameters](https://developer.mozilla.org/en/docs/Web/API/ConstrainDOMStringParameters) to Kotlin
 */
public expect interface ConstrainDOMStringParameters : JsAny {
    open var exact: JsAny? /* String|JsArray<JsString> */
    open var ideal: JsAny? /* String|JsArray<JsString> */
}

@Suppress("UNUSED_PARAMETER")
public expect fun ConstrainDOMStringParameters(exact: JsAny? /* String|JsArray<JsString> */ = undefined, ideal: JsAny? /* String|JsArray<JsString> */ = undefined): ConstrainDOMStringParameters

public expect interface Capabilities : JsAny

@Suppress("UNUSED_PARAMETER")
public expect fun Capabilities(): Capabilities

public expect interface Settings : JsAny

@Suppress("UNUSED_PARAMETER")
public expect fun Settings(): Settings

public expect interface ConstraintSet : JsAny

@Suppress("UNUSED_PARAMETER")
public expect fun ConstraintSet(): ConstraintSet

public expect interface Constraints : ConstraintSet, JsAny {
    open var advanced: JsArray<ConstraintSet>?
}

@Suppress("UNUSED_PARAMETER")
public expect fun Constraints(advanced: JsArray<ConstraintSet>? = undefined): Constraints

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface MediaStreamTrackState : JsAny {
    companion object
}

public expect inline val MediaStreamTrackState.Companion.LIVE: MediaStreamTrackState

public expect inline val MediaStreamTrackState.Companion.ENDED: MediaStreamTrackState

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface VideoFacingModeEnum : JsAny {
    companion object
}

public expect inline val VideoFacingModeEnum.Companion.USER: VideoFacingModeEnum

public expect inline val VideoFacingModeEnum.Companion.ENVIRONMENT: VideoFacingModeEnum

public expect inline val VideoFacingModeEnum.Companion.LEFT: VideoFacingModeEnum

public expect inline val VideoFacingModeEnum.Companion.RIGHT: VideoFacingModeEnum

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface VideoResizeModeEnum : JsAny {
    companion object
}

public expect inline val VideoResizeModeEnum.Companion.NONE: VideoResizeModeEnum

public expect inline val VideoResizeModeEnum.Companion.CROP_AND_SCALE: VideoResizeModeEnum

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface MediaDeviceKind : JsAny {
    companion object
}

public expect inline val MediaDeviceKind.Companion.AUDIOINPUT: MediaDeviceKind

public expect inline val MediaDeviceKind.Companion.AUDIOOUTPUT: MediaDeviceKind

public expect inline val MediaDeviceKind.Companion.VIDEOINPUT: MediaDeviceKind