/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.mediacapture

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*

/**
 * Exposes the JavaScript [MediaStream](https://developer.mozilla.org/en/docs/Web/API/MediaStream) to Kotlin
 */
actual external open class MediaStream actual constructor() : EventTarget, MediaProvider {
    actual constructor(stream: MediaStream)
    actual constructor(tracks: Array<MediaStreamTrack>)
    actual open val id: String
    actual open val active: Boolean
    actual var onaddtrack: ((MediaStreamTrackEvent) -> dynamic)?
    actual var onremovetrack: ((MediaStreamTrackEvent) -> dynamic)?
    actual fun getAudioTracks(): Array<MediaStreamTrack>
    actual fun getVideoTracks(): Array<MediaStreamTrack>
    actual fun getTracks(): Array<MediaStreamTrack>
    actual fun getTrackById(trackId: String): MediaStreamTrack?
    actual fun addTrack(track: MediaStreamTrack)
    actual fun removeTrack(track: MediaStreamTrack)
    actual fun clone(): MediaStream
}

/**
 * Exposes the JavaScript [MediaStreamTrack](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrack) to Kotlin
 */
actual external abstract class MediaStreamTrack : EventTarget {
    actual open val kind: String
    actual open val id: String
    actual open val label: String
    actual open var enabled: Boolean
    actual open val muted: Boolean
    actual open var onmute: ((Event) -> dynamic)?
    actual open var onunmute: ((Event) -> dynamic)?
    actual open val readyState: MediaStreamTrackState
    actual open var onended: ((Event) -> dynamic)?
    actual open var onoverconstrained: ((Event) -> dynamic)?
    actual fun clone(): MediaStreamTrack
    actual fun stop()
    actual fun getCapabilities(): MediaTrackCapabilities
    actual fun getConstraints(): MediaTrackConstraints
    actual fun getSettings(): MediaTrackSettings
    actual fun applyConstraints(constraints: MediaTrackConstraints): Promise<Unit>
}

/**
 * Exposes the JavaScript [MediaTrackSupportedConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSupportedConstraints) to Kotlin
 */
actual external interface MediaTrackSupportedConstraints {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaTrackSupportedConstraints(width: Boolean?, height: Boolean?, aspectRatio: Boolean?, frameRate: Boolean?, facingMode: Boolean?, resizeMode: Boolean?, volume: Boolean?, sampleRate: Boolean?, sampleSize: Boolean?, echoCancellation: Boolean?, autoGainControl: Boolean?, noiseSuppression: Boolean?, latency: Boolean?, channelCount: Boolean?, deviceId: Boolean?, groupId: Boolean?): MediaTrackSupportedConstraints {
    val o = js("({})")
    o["width"] = width
    o["height"] = height
    o["aspectRatio"] = aspectRatio
    o["frameRate"] = frameRate
    o["facingMode"] = facingMode
    o["resizeMode"] = resizeMode
    o["volume"] = volume
    o["sampleRate"] = sampleRate
    o["sampleSize"] = sampleSize
    o["echoCancellation"] = echoCancellation
    o["autoGainControl"] = autoGainControl
    o["noiseSuppression"] = noiseSuppression
    o["latency"] = latency
    o["channelCount"] = channelCount
    o["deviceId"] = deviceId
    o["groupId"] = groupId
    return o as MediaTrackSupportedConstraints
}

actual external interface MediaTrackCapabilities {
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
    actual var facingMode: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeMode: Array<String>?
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
    actual var echoCancellation: Array<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    actual var autoGainControl: Array<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    actual var noiseSuppression: Array<Boolean>?
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaTrackCapabilities(width: ULongRange?, height: ULongRange?, aspectRatio: DoubleRange?, frameRate: DoubleRange?, facingMode: Array<String>?, resizeMode: Array<String>?, volume: DoubleRange?, sampleRate: ULongRange?, sampleSize: ULongRange?, echoCancellation: Array<Boolean>?, autoGainControl: Array<Boolean>?, noiseSuppression: Array<Boolean>?, latency: DoubleRange?, channelCount: ULongRange?, deviceId: String?, groupId: String?): MediaTrackCapabilities {
    val o = js("({})")
    o["width"] = width
    o["height"] = height
    o["aspectRatio"] = aspectRatio
    o["frameRate"] = frameRate
    o["facingMode"] = facingMode
    o["resizeMode"] = resizeMode
    o["volume"] = volume
    o["sampleRate"] = sampleRate
    o["sampleSize"] = sampleSize
    o["echoCancellation"] = echoCancellation
    o["autoGainControl"] = autoGainControl
    o["noiseSuppression"] = noiseSuppression
    o["latency"] = latency
    o["channelCount"] = channelCount
    o["deviceId"] = deviceId
    o["groupId"] = groupId
    return o as MediaTrackCapabilities
}

/**
 * Exposes the JavaScript [MediaTrackConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaTrackConstraints) to Kotlin
 */
actual external interface MediaTrackConstraints : MediaTrackConstraintSet {
    actual var advanced: Array<MediaTrackConstraintSet>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaTrackConstraints(advanced: Array<MediaTrackConstraintSet>?, width: dynamic, height: dynamic, aspectRatio: dynamic, frameRate: dynamic, facingMode: dynamic, resizeMode: dynamic, volume: dynamic, sampleRate: dynamic, sampleSize: dynamic, echoCancellation: dynamic, autoGainControl: dynamic, noiseSuppression: dynamic, latency: dynamic, channelCount: dynamic, deviceId: dynamic, groupId: dynamic): MediaTrackConstraints {
    val o = js("({})")
    o["advanced"] = advanced
    o["width"] = width
    o["height"] = height
    o["aspectRatio"] = aspectRatio
    o["frameRate"] = frameRate
    o["facingMode"] = facingMode
    o["resizeMode"] = resizeMode
    o["volume"] = volume
    o["sampleRate"] = sampleRate
    o["sampleSize"] = sampleSize
    o["echoCancellation"] = echoCancellation
    o["autoGainControl"] = autoGainControl
    o["noiseSuppression"] = noiseSuppression
    o["latency"] = latency
    o["channelCount"] = channelCount
    o["deviceId"] = deviceId
    o["groupId"] = groupId
    return o as MediaTrackConstraints
}

actual external interface MediaTrackConstraintSet {
    actual var width: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var height: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var aspectRatio: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var frameRate: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var facingMode: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var resizeMode: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var volume: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleRate: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var sampleSize: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var echoCancellation: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var autoGainControl: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var noiseSuppression: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var latency: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var channelCount: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var deviceId: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var groupId: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaTrackConstraintSet(width: dynamic, height: dynamic, aspectRatio: dynamic, frameRate: dynamic, facingMode: dynamic, resizeMode: dynamic, volume: dynamic, sampleRate: dynamic, sampleSize: dynamic, echoCancellation: dynamic, autoGainControl: dynamic, noiseSuppression: dynamic, latency: dynamic, channelCount: dynamic, deviceId: dynamic, groupId: dynamic): MediaTrackConstraintSet {
    val o = js("({})")
    o["width"] = width
    o["height"] = height
    o["aspectRatio"] = aspectRatio
    o["frameRate"] = frameRate
    o["facingMode"] = facingMode
    o["resizeMode"] = resizeMode
    o["volume"] = volume
    o["sampleRate"] = sampleRate
    o["sampleSize"] = sampleSize
    o["echoCancellation"] = echoCancellation
    o["autoGainControl"] = autoGainControl
    o["noiseSuppression"] = noiseSuppression
    o["latency"] = latency
    o["channelCount"] = channelCount
    o["deviceId"] = deviceId
    o["groupId"] = groupId
    return o as MediaTrackConstraintSet
}

/**
 * Exposes the JavaScript [MediaTrackSettings](https://developer.mozilla.org/en/docs/Web/API/MediaTrackSettings) to Kotlin
 */
actual external interface MediaTrackSettings {
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

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaTrackSettings(width: Int?, height: Int?, aspectRatio: Double?, frameRate: Double?, facingMode: String?, resizeMode: String?, volume: Double?, sampleRate: Int?, sampleSize: Int?, echoCancellation: Boolean?, autoGainControl: Boolean?, noiseSuppression: Boolean?, latency: Double?, channelCount: Int?, deviceId: String?, groupId: String?): MediaTrackSettings {
    val o = js("({})")
    o["width"] = width
    o["height"] = height
    o["aspectRatio"] = aspectRatio
    o["frameRate"] = frameRate
    o["facingMode"] = facingMode
    o["resizeMode"] = resizeMode
    o["volume"] = volume
    o["sampleRate"] = sampleRate
    o["sampleSize"] = sampleSize
    o["echoCancellation"] = echoCancellation
    o["autoGainControl"] = autoGainControl
    o["noiseSuppression"] = noiseSuppression
    o["latency"] = latency
    o["channelCount"] = channelCount
    o["deviceId"] = deviceId
    o["groupId"] = groupId
    return o as MediaTrackSettings
}

/**
 * Exposes the JavaScript [MediaStreamTrackEvent](https://developer.mozilla.org/en/docs/Web/API/MediaStreamTrackEvent) to Kotlin
 */
actual external open class MediaStreamTrackEvent actual constructor(type: String, eventInitDict: MediaStreamTrackEventInit) : Event {
    actual open val track: MediaStreamTrack

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface MediaStreamTrackEventInit : EventInit {
    actual var track: MediaStreamTrack?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaStreamTrackEventInit(track: MediaStreamTrack?, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): MediaStreamTrackEventInit {
    val o = js("({})")
    o["track"] = track
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as MediaStreamTrackEventInit
}

actual external open class OverconstrainedErrorEvent actual constructor(type: String, eventInitDict: OverconstrainedErrorEventInit) : Event {
    actual open val error: dynamic

    actual companion object {
        actual val NONE: Short
        actual val CAPTURING_PHASE: Short
        actual val AT_TARGET: Short
        actual val BUBBLING_PHASE: Short
    }
}

actual external interface OverconstrainedErrorEventInit : EventInit {
    actual var error: dynamic /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun OverconstrainedErrorEventInit(error: dynamic, bubbles: Boolean?, cancelable: Boolean?, composed: Boolean?): OverconstrainedErrorEventInit {
    val o = js("({})")
    o["error"] = error
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o as OverconstrainedErrorEventInit
}

/**
 * Exposes the JavaScript [MediaDevices](https://developer.mozilla.org/en/docs/Web/API/MediaDevices) to Kotlin
 */
actual external abstract class MediaDevices : EventTarget {
    actual open var ondevicechange: ((Event) -> dynamic)?
    actual fun enumerateDevices(): Promise<Array<MediaDeviceInfo>>
    actual fun getSupportedConstraints(): MediaTrackSupportedConstraints
    actual fun getUserMedia(constraints: MediaStreamConstraints): Promise<MediaStream>
}

/**
 * Exposes the JavaScript [MediaDeviceInfo](https://developer.mozilla.org/en/docs/Web/API/MediaDeviceInfo) to Kotlin
 */
actual external abstract class MediaDeviceInfo {
    actual open val deviceId: String
    actual open val kind: MediaDeviceKind
    actual open val label: String
    actual open val groupId: String
    actual fun toJSON(): dynamic
}

actual external abstract class InputDeviceInfo : MediaDeviceInfo {
    actual fun getCapabilities(): MediaTrackCapabilities
}

/**
 * Exposes the JavaScript [MediaStreamConstraints](https://developer.mozilla.org/en/docs/Web/API/MediaStreamConstraints) to Kotlin
 */
actual external interface MediaStreamConstraints {
    actual var video: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var audio: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun MediaStreamConstraints(video: dynamic, audio: dynamic): MediaStreamConstraints {
    val o = js("({})")
    o["video"] = video
    o["audio"] = audio
    return o as MediaStreamConstraints
}

actual external interface ConstrainablePattern {
    actual var onoverconstrained: ((Event) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    actual fun getCapabilities(): Capabilities
    actual fun getConstraints(): Constraints
    actual fun getSettings(): Settings
    actual fun applyConstraints(constraints: Constraints): Promise<Unit>
}

/**
 * Exposes the JavaScript [DoubleRange](https://developer.mozilla.org/en/docs/Web/API/DoubleRange) to Kotlin
 */
actual external interface DoubleRange {
    actual var max: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var min: Double?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun DoubleRange(max: Double?, min: Double?): DoubleRange {
    val o = js("({})")
    o["max"] = max
    o["min"] = min
    return o as DoubleRange
}

actual external interface ConstrainDoubleRange : DoubleRange {
    actual var exact: Double?
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: Double?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ConstrainDoubleRange(exact: Double?, ideal: Double?, max: Double?, min: Double?): ConstrainDoubleRange {
    val o = js("({})")
    o["exact"] = exact
    o["ideal"] = ideal
    o["max"] = max
    o["min"] = min
    return o as ConstrainDoubleRange
}

actual external interface ULongRange {
    actual var max: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var min: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ULongRange(max: Int?, min: Int?): ULongRange {
    val o = js("({})")
    o["max"] = max
    o["min"] = min
    return o as ULongRange
}

actual external interface ConstrainULongRange : ULongRange {
    actual var exact: Int?
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ConstrainULongRange(exact: Int?, ideal: Int?, max: Int?, min: Int?): ConstrainULongRange {
    val o = js("({})")
    o["exact"] = exact
    o["ideal"] = ideal
    o["max"] = max
    o["min"] = min
    return o as ConstrainULongRange
}

/**
 * Exposes the JavaScript [ConstrainBooleanParameters](https://developer.mozilla.org/en/docs/Web/API/ConstrainBooleanParameters) to Kotlin
 */
actual external interface ConstrainBooleanParameters {
    actual var exact: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ConstrainBooleanParameters(exact: Boolean?, ideal: Boolean?): ConstrainBooleanParameters {
    val o = js("({})")
    o["exact"] = exact
    o["ideal"] = ideal
    return o as ConstrainBooleanParameters
}

/**
 * Exposes the JavaScript [ConstrainDOMStringParameters](https://developer.mozilla.org/en/docs/Web/API/ConstrainDOMStringParameters) to Kotlin
 */
actual external interface ConstrainDOMStringParameters {
    actual var exact: dynamic
        get() = definedExternally
        set(value) = definedExternally
    actual var ideal: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ConstrainDOMStringParameters(exact: dynamic, ideal: dynamic): ConstrainDOMStringParameters {
    val o = js("({})")
    o["exact"] = exact
    o["ideal"] = ideal
    return o as ConstrainDOMStringParameters
}

actual external interface Capabilities

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun Capabilities(): Capabilities {
    val o = js("({})")
    return o as Capabilities
}

actual external interface Settings

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun Settings(): Settings {
    val o = js("({})")
    return o as Settings
}

actual external interface ConstraintSet

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun ConstraintSet(): ConstraintSet {
    val o = js("({})")
    return o as ConstraintSet
}

actual external interface Constraints : ConstraintSet {
    actual var advanced: Array<ConstraintSet>?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun Constraints(advanced: Array<ConstraintSet>?): Constraints {
    val o = js("({})")
    o["advanced"] = advanced
    return o as Constraints
}

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface MediaStreamTrackState {
    actual companion object
}

actual inline val MediaStreamTrackState.Companion.LIVE: MediaStreamTrackState get() = "live".asDynamic().unsafeCast<MediaStreamTrackState>()

actual inline val MediaStreamTrackState.Companion.ENDED: MediaStreamTrackState get() = "ended".asDynamic().unsafeCast<MediaStreamTrackState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface VideoFacingModeEnum {
    actual companion object
}

actual inline val VideoFacingModeEnum.Companion.USER: VideoFacingModeEnum get() = "user".asDynamic().unsafeCast<VideoFacingModeEnum>()

actual inline val VideoFacingModeEnum.Companion.ENVIRONMENT: VideoFacingModeEnum get() = "environment".asDynamic().unsafeCast<VideoFacingModeEnum>()

actual inline val VideoFacingModeEnum.Companion.LEFT: VideoFacingModeEnum get() = "left".asDynamic().unsafeCast<VideoFacingModeEnum>()

actual inline val VideoFacingModeEnum.Companion.RIGHT: VideoFacingModeEnum get() = "right".asDynamic().unsafeCast<VideoFacingModeEnum>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface VideoResizeModeEnum {
    actual companion object
}

actual inline val VideoResizeModeEnum.Companion.NONE: VideoResizeModeEnum get() = "none".asDynamic().unsafeCast<VideoResizeModeEnum>()

actual inline val VideoResizeModeEnum.Companion.CROP_AND_SCALE: VideoResizeModeEnum get() = "crop-and-scale".asDynamic().unsafeCast<VideoResizeModeEnum>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface MediaDeviceKind {
    actual companion object
}

actual inline val MediaDeviceKind.Companion.AUDIOINPUT: MediaDeviceKind get() = "audioinput".asDynamic().unsafeCast<MediaDeviceKind>()

actual inline val MediaDeviceKind.Companion.AUDIOOUTPUT: MediaDeviceKind get() = "audiooutput".asDynamic().unsafeCast<MediaDeviceKind>()

actual inline val MediaDeviceKind.Companion.VIDEOINPUT: MediaDeviceKind get() = "videoinput".asDynamic().unsafeCast<MediaDeviceKind>()