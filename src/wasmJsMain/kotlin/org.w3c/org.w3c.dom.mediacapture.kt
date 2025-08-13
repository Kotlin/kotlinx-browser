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
public actual external open class MediaStream actual constructor() : EventTarget, MediaProvider, JsAny {
    actual constructor(stream: MediaStream)
    actual constructor(tracks: JsArray<MediaStreamTrack>)
    actual open val id: String
    actual open val active: Boolean
    actual var onaddtrack: ((MediaStreamTrackEvent) -> Unit)?
    actual var onremovetrack: ((MediaStreamTrackEvent) -> Unit)?
    actual fun getAudioTracks(): JsArray<MediaStreamTrack>
    actual fun getVideoTracks(): JsArray<MediaStreamTrack>
    actual fun getTracks(): JsArray<MediaStreamTrack>
    actual fun getTrackById(trackId: String): MediaStreamTrack?
    actual fun addTrack(track: MediaStreamTrack)
    actual fun removeTrack(track: MediaStreamTrack)
    actual fun clone(): MediaStream
}

/**
 * Exposes the JavaScript [MediaStreamTrack](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrack) to Kotlin
 */
public actual external abstract class MediaStreamTrack : EventTarget, JsAny {
    actual open val kind: String
    actual open val id: String
    actual open val label: String
    actual open var enabled: Boolean
    actual open val muted: Boolean
    actual open var onmute: ((Event) -> Unit)?
    actual open var onunmute: ((Event) -> Unit)?
    actual open val readyState: MediaStreamTrackState
    actual open var onended: ((Event) -> Unit)?
    actual open var onoverconstrained: ((Event) -> Unit)?
    actual fun clone(): MediaStreamTrack
    actual fun stop()
    actual fun getCapabilities(): MediaTrackCapabilities
    actual fun getConstraints(): MediaTrackConstraints
    actual fun getSettings(): MediaTrackSettings
    actual fun applyConstraints(constraints: MediaTrackConstraints): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [MediaTrackSupportedConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSupportedConstraints) to Kotlin
 */
public actual external interface MediaTrackSupportedConstraints : JsAny {
    actual var width: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var height: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var aspectRatio: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var frameRate: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var facingMode: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeMode: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var volume: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleRate: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleSize: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var echoCancellation: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var autoGainControl: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var noiseSuppression: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var latency: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var channelCount: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var deviceId: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
    actual var groupId: Boolean? /* = true */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaTrackSupportedConstraints(width: Boolean?, height: Boolean?, aspectRatio: Boolean?, frameRate: Boolean?, facingMode: Boolean?, resizeMode: Boolean?, volume: Boolean?, sampleRate: Boolean?, sampleSize: Boolean?, echoCancellation: Boolean?, autoGainControl: Boolean?, noiseSuppression: Boolean?, latency: Boolean?, channelCount: Boolean?, deviceId: Boolean?, groupId: Boolean?): MediaTrackSupportedConstraints = js("({ width: width, height: height, aspectRatio: aspectRatio, frameRate: frameRate, facingMode: facingMode, resizeMode: resizeMode, volume: volume, sampleRate: sampleRate, sampleSize: sampleSize, echoCancellation: echoCancellation, autoGainControl: autoGainControl, noiseSuppression: noiseSuppression, latency: latency, channelCount: channelCount, deviceId: deviceId, groupId: groupId })")

public actual external interface MediaTrackCapabilities : JsAny {
    actual var width: ULongRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var height: ULongRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var aspectRatio: DoubleRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var frameRate: DoubleRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var facingMode: JsArray<JsString>?
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeMode: JsArray<JsString>?
        get() = definedExternally
        set(value) = definedExternally
    actual var volume: DoubleRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleRate: ULongRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleSize: ULongRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var echoCancellation: JsArray<JsBoolean>?
        get() = definedExternally
        set(value) = definedExternally
    actual var autoGainControl: JsArray<JsBoolean>?
        get() = definedExternally
        set(value) = definedExternally
    actual var noiseSuppression: JsArray<JsBoolean>?
        get() = definedExternally
        set(value) = definedExternally
    actual var latency: DoubleRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var channelCount: ULongRange?
        get() = definedExternally
        set(value) = definedExternally
    actual var deviceId: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var groupId: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaTrackCapabilities(width: ULongRange?, height: ULongRange?, aspectRatio: DoubleRange?, frameRate: DoubleRange?, facingMode: JsArray<JsString>?, resizeMode: JsArray<JsString>?, volume: DoubleRange?, sampleRate: ULongRange?, sampleSize: ULongRange?, echoCancellation: JsArray<JsBoolean>?, autoGainControl: JsArray<JsBoolean>?, noiseSuppression: JsArray<JsBoolean>?, latency: DoubleRange?, channelCount: ULongRange?, deviceId: String?, groupId: String?): MediaTrackCapabilities = js("({ width: width, height: height, aspectRatio: aspectRatio, frameRate: frameRate, facingMode: facingMode, resizeMode: resizeMode, volume: volume, sampleRate: sampleRate, sampleSize: sampleSize, echoCancellation: echoCancellation, autoGainControl: autoGainControl, noiseSuppression: noiseSuppression, latency: latency, channelCount: channelCount, deviceId: deviceId, groupId: groupId })")

/**
 * Exposes the JavaScript [MediaTrackConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaTrackConstraints) to Kotlin
 */
public actual external interface MediaTrackConstraints : MediaTrackConstraintSet, JsAny {
    actual var advanced: JsArray<MediaTrackConstraintSet>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaTrackConstraints(advanced: JsArray<MediaTrackConstraintSet>?, width: JsAny? /* Int|ConstrainULongRange */, height: JsAny? /* Int|ConstrainULongRange */, aspectRatio: JsAny? /* Double|ConstrainDoubleRange */, frameRate: JsAny? /* Double|ConstrainDoubleRange */, facingMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */, resizeMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */, volume: JsAny? /* Double|ConstrainDoubleRange */, sampleRate: JsAny? /* Int|ConstrainULongRange */, sampleSize: JsAny? /* Int|ConstrainULongRange */, echoCancellation: JsAny? /* Boolean|ConstrainBooleanParameters */, autoGainControl: JsAny? /* Boolean|ConstrainBooleanParameters */, noiseSuppression: JsAny? /* Boolean|ConstrainBooleanParameters */, latency: JsAny? /* Double|ConstrainDoubleRange */, channelCount: JsAny? /* Int|ConstrainULongRange */, deviceId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */, groupId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */): MediaTrackConstraints = js("({ advanced: advanced, width: width, height: height, aspectRatio: aspectRatio, frameRate: frameRate, facingMode: facingMode, resizeMode: resizeMode, volume: volume, sampleRate: sampleRate, sampleSize: sampleSize, echoCancellation: echoCancellation, autoGainControl: autoGainControl, noiseSuppression: noiseSuppression, latency: latency, channelCount: channelCount, deviceId: deviceId, groupId: groupId })")

public actual external interface MediaTrackConstraintSet : JsAny {
    actual var width: JsAny? /* Int|ConstrainULongRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var height: JsAny? /* Int|ConstrainULongRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var aspectRatio: JsAny? /* Double|ConstrainDoubleRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var frameRate: JsAny? /* Double|ConstrainDoubleRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var facingMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
        get() = definedExternally
        set(value) = definedExternally
    actual var volume: JsAny? /* Double|ConstrainDoubleRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleRate: JsAny? /* Int|ConstrainULongRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleSize: JsAny? /* Int|ConstrainULongRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var echoCancellation: JsAny? /* Boolean|ConstrainBooleanParameters */
        get() = definedExternally
        set(value) = definedExternally
    actual var autoGainControl: JsAny? /* Boolean|ConstrainBooleanParameters */
        get() = definedExternally
        set(value) = definedExternally
    actual var noiseSuppression: JsAny? /* Boolean|ConstrainBooleanParameters */
        get() = definedExternally
        set(value) = definedExternally
    actual var latency: JsAny? /* Double|ConstrainDoubleRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var channelCount: JsAny? /* Int|ConstrainULongRange */
        get() = definedExternally
        set(value) = definedExternally
    actual var deviceId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
        get() = definedExternally
        set(value) = definedExternally
    actual var groupId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaTrackConstraintSet(width: JsAny? /* Int|ConstrainULongRange */, height: JsAny? /* Int|ConstrainULongRange */, aspectRatio: JsAny? /* Double|ConstrainDoubleRange */, frameRate: JsAny? /* Double|ConstrainDoubleRange */, facingMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */, resizeMode: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */, volume: JsAny? /* Double|ConstrainDoubleRange */, sampleRate: JsAny? /* Int|ConstrainULongRange */, sampleSize: JsAny? /* Int|ConstrainULongRange */, echoCancellation: JsAny? /* Boolean|ConstrainBooleanParameters */, autoGainControl: JsAny? /* Boolean|ConstrainBooleanParameters */, noiseSuppression: JsAny? /* Boolean|ConstrainBooleanParameters */, latency: JsAny? /* Double|ConstrainDoubleRange */, channelCount: JsAny? /* Int|ConstrainULongRange */, deviceId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */, groupId: JsAny? /* String|JsArray<JsString>|ConstrainDOMStringParameters */): MediaTrackConstraintSet = js("({ width: width, height: height, aspectRatio: aspectRatio, frameRate: frameRate, facingMode: facingMode, resizeMode: resizeMode, volume: volume, sampleRate: sampleRate, sampleSize: sampleSize, echoCancellation: echoCancellation, autoGainControl: autoGainControl, noiseSuppression: noiseSuppression, latency: latency, channelCount: channelCount, deviceId: deviceId, groupId: groupId })")

/**
 * Exposes the JavaScript [MediaTrackSettings](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSettings) to Kotlin
 */
public actual external interface MediaTrackSettings : JsAny {
    actual var width: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var height: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var aspectRatio: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var frameRate: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var facingMode: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeMode: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var volume: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleRate: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleSize: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var echoCancellation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var autoGainControl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var noiseSuppression: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var latency: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var channelCount: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var deviceId: String?
        get() = definedExternally
        set(value) = definedExternally
    actual var groupId: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaTrackSettings(width: Int?, height: Int?, aspectRatio: Double?, frameRate: Double?, facingMode: String?, resizeMode: String?, volume: Double?, sampleRate: Int?, sampleSize: Int?, echoCancellation: Boolean?, autoGainControl: Boolean?, noiseSuppression: Boolean?, latency: Double?, channelCount: Int?, deviceId: String?, groupId: String?): MediaTrackSettings = js("({ width: width, height: height, aspectRatio: aspectRatio, frameRate: frameRate, facingMode: facingMode, resizeMode: resizeMode, volume: volume, sampleRate: sampleRate, sampleSize: sampleSize, echoCancellation: echoCancellation, autoGainControl: autoGainControl, noiseSuppression: noiseSuppression, latency: latency, channelCount: channelCount, deviceId: deviceId, groupId: groupId })")

/**
 * Exposes the JavaScript [MediaStreamTrackEvent](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrackEvent) to Kotlin
 */
public actual external open class MediaStreamTrackEvent actual constructor(type: String, eventInitDict: MediaStreamTrackEventInit) : Event, JsAny {
    actual open val track: MediaStreamTrack

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface MediaStreamTrackEventInit : EventInit, JsAny {
    actual var track: MediaStreamTrack?
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaStreamTrackEventInit(track: MediaStreamTrack?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaStreamTrackEventInit = js("({ track: track, bubbles: bubbles, cancelable: cancelable, composed: composed })")

public actual external open class OverconstrainedErrorEvent actual constructor(type: String, eventInitDict: OverconstrainedErrorEventInit) : Event, JsAny {
    actual open val error: JsAny?

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

public actual external interface OverconstrainedErrorEventInit : EventInit, JsAny {
    actual var error: JsAny? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun OverconstrainedErrorEventInit(error: JsAny?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): OverconstrainedErrorEventInit = js("({ error: error, bubbles: bubbles, cancelable: cancelable, composed: composed })")

/**
 * Exposes the JavaScript [MediaDevices](https://developer.mozilla.org/en/docs/Web/API/MediaDevices) to Kotlin
 */
public actual external abstract class MediaDevices : EventTarget, JsAny {
    actual open var ondevicechange: ((Event) -> Unit)?
    actual fun enumerateDevices(): Promise<JsArray<MediaDeviceInfo>>
    actual fun getSupportedConstraints(): MediaTrackSupportedConstraints
    actual fun getUserMedia(constraints: MediaStreamConstraints): Promise<MediaStream>
}

/**
 * Exposes the JavaScript [MediaDeviceInfo](https://developer.mozilla.org/en/docs/Web/API/MediaDeviceInfo) to Kotlin
 */
public actual external abstract class MediaDeviceInfo : JsAny {
    actual open val deviceId: String
    actual open val kind: MediaDeviceKind
    actual open val label: String
    actual open val groupId: String
    actual fun toJSON(): JsAny
}

public actual external abstract class InputDeviceInfo : MediaDeviceInfo, JsAny {
    actual fun getCapabilities(): MediaTrackCapabilities
}

/**
 * Exposes the JavaScript [MediaStreamConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaStreamConstraints) to Kotlin
 */
public actual external interface MediaStreamConstraints : JsAny {
    actual var video: JsAny? /* Boolean|MediaTrackConstraints */
        get() = definedExternally
        set(value) = definedExternally
    actual var audio: JsAny? /* Boolean|MediaTrackConstraints */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun MediaStreamConstraints(video: JsAny? /* Boolean|MediaTrackConstraints */, audio: JsAny? /* Boolean|MediaTrackConstraints */): MediaStreamConstraints = js("({ video: video, audio: audio })")

public actual external interface ConstrainablePattern : JsAny {
    actual var onoverconstrained: ((Event) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    actual fun getCapabilities(): Capabilities
    actual fun getConstraints(): Constraints
    actual fun getSettings(): Settings
    actual fun applyConstraints(constraints: Constraints): Promise<Nothing?>
}

/**
 * Exposes the JavaScript [DoubleRange](https://developer.mozilla.org/en/docs/Web/API/DoubleRange) to Kotlin
 */
public actual external interface DoubleRange : JsAny {
    actual var max: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var min: Double?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun DoubleRange(max: Double?, min: Double?): DoubleRange = js("({ max: max, min: min })")

public actual external interface ConstrainDoubleRange : DoubleRange, JsAny {
    actual var exact: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: Double?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ConstrainDoubleRange(exact: Double?, ideal: Double?, max: Double?, min: Double?): ConstrainDoubleRange = js("({ exact: exact, ideal: ideal, max: max, min: min })")

public actual external interface ULongRange : JsAny {
    actual var max: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var min: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ULongRange(max: Int?, min: Int?): ULongRange = js("({ max: max, min: min })")

public actual external interface ConstrainULongRange : ULongRange, JsAny {
    actual var exact: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ConstrainULongRange(exact: Int?, ideal: Int?, max: Int?, min: Int?): ConstrainULongRange = js("({ exact: exact, ideal: ideal, max: max, min: min })")

/**
 * Exposes the JavaScript [ConstrainBooleanParameters](https://developer.mozilla.org/en/docs/Web/API/ConstrainBooleanParameters) to Kotlin
 */
public actual external interface ConstrainBooleanParameters : JsAny {
    actual var exact: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ConstrainBooleanParameters(exact: Boolean?, ideal: Boolean?): ConstrainBooleanParameters = js("({ exact: exact, ideal: ideal })")

/**
 * Exposes the JavaScript [ConstrainDOMStringParameters](https://developer.mozilla.org/en/docs/Web/API/ConstrainDOMStringParameters) to Kotlin
 */
public actual external interface ConstrainDOMStringParameters : JsAny {
    actual var exact: JsAny? /* String|JsArray<JsString> */
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: JsAny? /* String|JsArray<JsString> */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun ConstrainDOMStringParameters(exact: JsAny? /* String|JsArray<JsString> */, ideal: JsAny? /* String|JsArray<JsString> */): ConstrainDOMStringParameters = js("({ exact: exact, ideal: ideal })")

public actual external interface Capabilities : JsAny

@Suppress("UNUSED_PARAMETER")
public actual fun Capabilities(): Capabilities = js("({  })")

public actual external interface Settings : JsAny

@Suppress("UNUSED_PARAMETER")
public actual fun Settings(): Settings = js("({  })")

public actual external interface ConstraintSet : JsAny

@Suppress("UNUSED_PARAMETER")
public actual fun ConstraintSet(): ConstraintSet = js("({  })")

public actual external interface Constraints : ConstraintSet, JsAny {
    actual var advanced: JsArray<ConstraintSet>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun Constraints(advanced: JsArray<ConstraintSet>?): Constraints = js("({ advanced: advanced })")

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface MediaStreamTrackState : JsAny {
    actual companion object
}

public actual inline val MediaStreamTrackState.Companion.LIVE: MediaStreamTrackState get() = "live".toJsString().unsafeCast<MediaStreamTrackState>()

public actual inline val MediaStreamTrackState.Companion.ENDED: MediaStreamTrackState get() = "ended".toJsString().unsafeCast<MediaStreamTrackState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface VideoFacingModeEnum : JsAny {
    actual companion object
}

public actual inline val VideoFacingModeEnum.Companion.USER: VideoFacingModeEnum get() = "user".toJsString().unsafeCast<VideoFacingModeEnum>()

public actual inline val VideoFacingModeEnum.Companion.ENVIRONMENT: VideoFacingModeEnum get() = "environment".toJsString().unsafeCast<VideoFacingModeEnum>()

public actual inline val VideoFacingModeEnum.Companion.LEFT: VideoFacingModeEnum get() = "left".toJsString().unsafeCast<VideoFacingModeEnum>()

public actual inline val VideoFacingModeEnum.Companion.RIGHT: VideoFacingModeEnum get() = "right".toJsString().unsafeCast<VideoFacingModeEnum>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface VideoResizeModeEnum : JsAny {
    actual companion object
}

public actual inline val VideoResizeModeEnum.Companion.NONE: VideoResizeModeEnum get() = "none".toJsString().unsafeCast<VideoResizeModeEnum>()

public actual inline val VideoResizeModeEnum.Companion.CROP_AND_SCALE: VideoResizeModeEnum get() = "crop-and-scale".toJsString().unsafeCast<VideoResizeModeEnum>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface MediaDeviceKind : JsAny {
    actual companion object
}

public actual inline val MediaDeviceKind.Companion.AUDIOINPUT: MediaDeviceKind get() = "audioinput".toJsString().unsafeCast<MediaDeviceKind>()

public actual inline val MediaDeviceKind.Companion.AUDIOOUTPUT: MediaDeviceKind get() = "audiooutput".toJsString().unsafeCast<MediaDeviceKind>()

public actual inline val MediaDeviceKind.Companion.VIDEOINPUT: MediaDeviceKind get() = "videoinput".toJsString().unsafeCast<MediaDeviceKind>()