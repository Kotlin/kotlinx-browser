/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'mediacapture-streams', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.mediacapture

import kotlin.js.*
import org.w3c.dom.*

public external open class MediaStream : EventTarget, MediaProvider {
    constructor()
    constructor(stream: MediaStream)
    constructor(tracks: JsArray<MediaStreamTrack>)
    open val id: String
    open fun getAudioTracks(): JsArray<MediaStreamTrack>
    open fun getVideoTracks(): JsArray<MediaStreamTrack>
    open fun getTracks(): JsArray<MediaStreamTrack>
    open fun getTrackById(trackId: String): MediaStreamTrack?
    open fun addTrack(track: MediaStreamTrack)
    open fun removeTrack(track: MediaStreamTrack)
    open fun clone(): MediaStream
    open val active: Boolean
    open var onaddtrack: ((MediaStreamTrackEvent) -> Unit)?
    open var onremovetrack: ((MediaStreamTrackEvent) -> Unit)?
}

public external abstract class MediaStreamTrack : EventTarget {
    open val kind: String
    open val id: String
    open val label: String
    open var enabled: Boolean
    open val muted: Boolean
    open var onmute: ((Event) -> Unit)?
    open var onunmute: ((Event) -> Unit)?
    open val readyState: MediaStreamTrackState
    open var onended: ((Event) -> Unit)?
    open fun clone(): MediaStreamTrack
    open fun stop()
    open fun getCapabilities(): MediaTrackCapabilities
    open fun getConstraints(): MediaTrackConstraints
    open fun getSettings(): MediaTrackSettings
    open fun applyConstraints(constraints: MediaTrackConstraints = definedExternally): Promise<JsAny?>
}

public external interface MediaStreamTrackState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaStreamTrackState.Companion.LIVE: MediaStreamTrackState get() = "live".toJsString().unsafeCast<MediaStreamTrackState>()
public inline val MediaStreamTrackState.Companion.ENDED: MediaStreamTrackState get() = "ended".toJsString().unsafeCast<MediaStreamTrackState>()

public external interface MediaTrackSupportedConstraints : JsAny {
    var width: Boolean?
    var height: Boolean?
    var aspectRatio: Boolean?
    var frameRate: Boolean?
    var facingMode: Boolean?
    var resizeMode: Boolean?
    var sampleRate: Boolean?
    var sampleSize: Boolean?
    var echoCancellation: Boolean?
    var autoGainControl: Boolean?
    var noiseSuppression: Boolean?
    var latency: Boolean?
    var channelCount: Boolean?
    var deviceId: Boolean?
    var groupId: Boolean?
    var backgroundBlur: Boolean?
}

public fun MediaTrackSupportedConstraints(width: Boolean? = null, height: Boolean? = null, aspectRatio: Boolean? = null, frameRate: Boolean? = null, facingMode: Boolean? = null, resizeMode: Boolean? = null, sampleRate: Boolean? = null, sampleSize: Boolean? = null, echoCancellation: Boolean? = null, autoGainControl: Boolean? = null, noiseSuppression: Boolean? = null, latency: Boolean? = null, channelCount: Boolean? = null, deviceId: Boolean? = null, groupId: Boolean? = null, backgroundBlur: Boolean? = null): MediaTrackSupportedConstraints = newJsObject<MediaTrackSupportedConstraints>().apply {
    if (width != null) this.width = width
    if (height != null) this.height = height
    if (aspectRatio != null) this.aspectRatio = aspectRatio
    if (frameRate != null) this.frameRate = frameRate
    if (facingMode != null) this.facingMode = facingMode
    if (resizeMode != null) this.resizeMode = resizeMode
    if (sampleRate != null) this.sampleRate = sampleRate
    if (sampleSize != null) this.sampleSize = sampleSize
    if (echoCancellation != null) this.echoCancellation = echoCancellation
    if (autoGainControl != null) this.autoGainControl = autoGainControl
    if (noiseSuppression != null) this.noiseSuppression = noiseSuppression
    if (latency != null) this.latency = latency
    if (channelCount != null) this.channelCount = channelCount
    if (deviceId != null) this.deviceId = deviceId
    if (groupId != null) this.groupId = groupId
    if (backgroundBlur != null) this.backgroundBlur = backgroundBlur
}

public external interface MediaTrackCapabilities : JsAny {
    var width: ULongRange?
    var height: ULongRange?
    var aspectRatio: DoubleRange?
    var frameRate: DoubleRange?
    var facingMode: JsArray<JsString>?
    var resizeMode: JsArray<JsString>?
    var sampleRate: ULongRange?
    var sampleSize: ULongRange?
    var echoCancellation: JsArray<JsAny>?
    var autoGainControl: JsArray<JsBoolean>?
    var noiseSuppression: JsArray<JsBoolean>?
    var latency: DoubleRange?
    var channelCount: ULongRange?
    var deviceId: String?
    var groupId: String?
    var backgroundBlur: JsArray<JsBoolean>?
}

public fun MediaTrackCapabilities(width: ULongRange? = null, height: ULongRange? = null, aspectRatio: DoubleRange? = null, frameRate: DoubleRange? = null, facingMode: JsArray<JsString>? = null, resizeMode: JsArray<JsString>? = null, sampleRate: ULongRange? = null, sampleSize: ULongRange? = null, echoCancellation: JsArray<JsAny>? = null, autoGainControl: JsArray<JsBoolean>? = null, noiseSuppression: JsArray<JsBoolean>? = null, latency: DoubleRange? = null, channelCount: ULongRange? = null, deviceId: String? = null, groupId: String? = null, backgroundBlur: JsArray<JsBoolean>? = null): MediaTrackCapabilities = newJsObject<MediaTrackCapabilities>().apply {
    if (width != null) this.width = width
    if (height != null) this.height = height
    if (aspectRatio != null) this.aspectRatio = aspectRatio
    if (frameRate != null) this.frameRate = frameRate
    if (facingMode != null) this.facingMode = facingMode
    if (resizeMode != null) this.resizeMode = resizeMode
    if (sampleRate != null) this.sampleRate = sampleRate
    if (sampleSize != null) this.sampleSize = sampleSize
    if (echoCancellation != null) this.echoCancellation = echoCancellation
    if (autoGainControl != null) this.autoGainControl = autoGainControl
    if (noiseSuppression != null) this.noiseSuppression = noiseSuppression
    if (latency != null) this.latency = latency
    if (channelCount != null) this.channelCount = channelCount
    if (deviceId != null) this.deviceId = deviceId
    if (groupId != null) this.groupId = groupId
    if (backgroundBlur != null) this.backgroundBlur = backgroundBlur
}

public external interface MediaTrackConstraints : MediaTrackConstraintSet {
    var advanced: JsArray<MediaTrackConstraintSet>?
}

public fun MediaTrackConstraints(width: JsAny? = null, height: JsAny? = null, aspectRatio: JsAny? = null, frameRate: JsAny? = null, facingMode: JsAny? = null, resizeMode: JsAny? = null, sampleRate: JsAny? = null, sampleSize: JsAny? = null, echoCancellation: JsAny? = null, autoGainControl: JsAny? = null, noiseSuppression: JsAny? = null, latency: JsAny? = null, channelCount: JsAny? = null, deviceId: JsAny? = null, groupId: JsAny? = null, backgroundBlur: JsAny? = null, advanced: JsArray<MediaTrackConstraintSet>? = null): MediaTrackConstraints = newJsObject<MediaTrackConstraints>().apply {
    if (width != null) this.width = width
    if (height != null) this.height = height
    if (aspectRatio != null) this.aspectRatio = aspectRatio
    if (frameRate != null) this.frameRate = frameRate
    if (facingMode != null) this.facingMode = facingMode
    if (resizeMode != null) this.resizeMode = resizeMode
    if (sampleRate != null) this.sampleRate = sampleRate
    if (sampleSize != null) this.sampleSize = sampleSize
    if (echoCancellation != null) this.echoCancellation = echoCancellation
    if (autoGainControl != null) this.autoGainControl = autoGainControl
    if (noiseSuppression != null) this.noiseSuppression = noiseSuppression
    if (latency != null) this.latency = latency
    if (channelCount != null) this.channelCount = channelCount
    if (deviceId != null) this.deviceId = deviceId
    if (groupId != null) this.groupId = groupId
    if (backgroundBlur != null) this.backgroundBlur = backgroundBlur
    if (advanced != null) this.advanced = advanced
}

public external interface MediaTrackConstraintSet : JsAny {
    var width: JsAny?
    var height: JsAny?
    var aspectRatio: JsAny?
    var frameRate: JsAny?
    var facingMode: JsAny?
    var resizeMode: JsAny?
    var sampleRate: JsAny?
    var sampleSize: JsAny?
    var echoCancellation: JsAny?
    var autoGainControl: JsAny?
    var noiseSuppression: JsAny?
    var latency: JsAny?
    var channelCount: JsAny?
    var deviceId: JsAny?
    var groupId: JsAny?
    var backgroundBlur: JsAny?
}

public fun MediaTrackConstraintSet(width: JsAny? = null, height: JsAny? = null, aspectRatio: JsAny? = null, frameRate: JsAny? = null, facingMode: JsAny? = null, resizeMode: JsAny? = null, sampleRate: JsAny? = null, sampleSize: JsAny? = null, echoCancellation: JsAny? = null, autoGainControl: JsAny? = null, noiseSuppression: JsAny? = null, latency: JsAny? = null, channelCount: JsAny? = null, deviceId: JsAny? = null, groupId: JsAny? = null, backgroundBlur: JsAny? = null): MediaTrackConstraintSet = newJsObject<MediaTrackConstraintSet>().apply {
    if (width != null) this.width = width
    if (height != null) this.height = height
    if (aspectRatio != null) this.aspectRatio = aspectRatio
    if (frameRate != null) this.frameRate = frameRate
    if (facingMode != null) this.facingMode = facingMode
    if (resizeMode != null) this.resizeMode = resizeMode
    if (sampleRate != null) this.sampleRate = sampleRate
    if (sampleSize != null) this.sampleSize = sampleSize
    if (echoCancellation != null) this.echoCancellation = echoCancellation
    if (autoGainControl != null) this.autoGainControl = autoGainControl
    if (noiseSuppression != null) this.noiseSuppression = noiseSuppression
    if (latency != null) this.latency = latency
    if (channelCount != null) this.channelCount = channelCount
    if (deviceId != null) this.deviceId = deviceId
    if (groupId != null) this.groupId = groupId
    if (backgroundBlur != null) this.backgroundBlur = backgroundBlur
}

public external interface MediaTrackSettings : JsAny {
    var width: Int?
    var height: Int?
    var aspectRatio: Double?
    var frameRate: Double?
    var facingMode: String?
    var resizeMode: String?
    var sampleRate: Int?
    var sampleSize: Int?
    var echoCancellation: JsAny?
    var autoGainControl: Boolean?
    var noiseSuppression: Boolean?
    var latency: Double?
    var channelCount: Int?
    var deviceId: String?
    var groupId: String?
    var backgroundBlur: Boolean?
}

public fun MediaTrackSettings(width: Int? = null, height: Int? = null, aspectRatio: Double? = null, frameRate: Double? = null, facingMode: String? = null, resizeMode: String? = null, sampleRate: Int? = null, sampleSize: Int? = null, echoCancellation: JsAny? = null, autoGainControl: Boolean? = null, noiseSuppression: Boolean? = null, latency: Double? = null, channelCount: Int? = null, deviceId: String? = null, groupId: String? = null, backgroundBlur: Boolean? = null): MediaTrackSettings = newJsObject<MediaTrackSettings>().apply {
    if (width != null) this.width = width
    if (height != null) this.height = height
    if (aspectRatio != null) this.aspectRatio = aspectRatio
    if (frameRate != null) this.frameRate = frameRate
    if (facingMode != null) this.facingMode = facingMode
    if (resizeMode != null) this.resizeMode = resizeMode
    if (sampleRate != null) this.sampleRate = sampleRate
    if (sampleSize != null) this.sampleSize = sampleSize
    if (echoCancellation != null) this.echoCancellation = echoCancellation
    if (autoGainControl != null) this.autoGainControl = autoGainControl
    if (noiseSuppression != null) this.noiseSuppression = noiseSuppression
    if (latency != null) this.latency = latency
    if (channelCount != null) this.channelCount = channelCount
    if (deviceId != null) this.deviceId = deviceId
    if (groupId != null) this.groupId = groupId
    if (backgroundBlur != null) this.backgroundBlur = backgroundBlur
}

public external interface VideoFacingModeEnum : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val VideoFacingModeEnum.Companion.USER: VideoFacingModeEnum get() = "user".toJsString().unsafeCast<VideoFacingModeEnum>()
public inline val VideoFacingModeEnum.Companion.ENVIRONMENT: VideoFacingModeEnum get() = "environment".toJsString().unsafeCast<VideoFacingModeEnum>()
public inline val VideoFacingModeEnum.Companion.LEFT: VideoFacingModeEnum get() = "left".toJsString().unsafeCast<VideoFacingModeEnum>()
public inline val VideoFacingModeEnum.Companion.RIGHT: VideoFacingModeEnum get() = "right".toJsString().unsafeCast<VideoFacingModeEnum>()

public external interface VideoResizeModeEnum : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val VideoResizeModeEnum.Companion.NONE: VideoResizeModeEnum get() = "none".toJsString().unsafeCast<VideoResizeModeEnum>()
public inline val VideoResizeModeEnum.Companion.CROP_AND_SCALE: VideoResizeModeEnum get() = "crop-and-scale".toJsString().unsafeCast<VideoResizeModeEnum>()

public external interface EchoCancellationModeEnum : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val EchoCancellationModeEnum.Companion.ALL: EchoCancellationModeEnum get() = "all".toJsString().unsafeCast<EchoCancellationModeEnum>()
public inline val EchoCancellationModeEnum.Companion.REMOTE_ONLY: EchoCancellationModeEnum get() = "remote-only".toJsString().unsafeCast<EchoCancellationModeEnum>()

public external open class MediaStreamTrackEvent : Event {
    constructor(type: String, eventInitDict: MediaStreamTrackEventInit)
    open val track: MediaStreamTrack

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface MediaStreamTrackEventInit : EventInit {
    var track: MediaStreamTrack
}

public fun MediaStreamTrackEventInit(track: MediaStreamTrack, bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null): MediaStreamTrackEventInit = newJsObject<MediaStreamTrackEventInit>().apply {
    this.track = track
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
}

public external open class OverconstrainedError : DOMException {
    constructor(constraint: String, message: String = definedExternally)
    open val constraint: String

    companion object {
        val INDEX_SIZE_ERR: Short
        val DOMSTRING_SIZE_ERR: Short
        val HIERARCHY_REQUEST_ERR: Short
        val WRONG_DOCUMENT_ERR: Short
        val INVALID_CHARACTER_ERR: Short
        val NO_DATA_ALLOWED_ERR: Short
        val NO_MODIFICATION_ALLOWED_ERR: Short
        val NOT_FOUND_ERR: Short
        val NOT_SUPPORTED_ERR: Short
        val INUSE_ATTRIBUTE_ERR: Short
        val INVALID_STATE_ERR: Short
        val SYNTAX_ERR: Short
        val INVALID_MODIFICATION_ERR: Short
        val NAMESPACE_ERR: Short
        val INVALID_ACCESS_ERR: Short
        val VALIDATION_ERR: Short
        val TYPE_MISMATCH_ERR: Short
        val SECURITY_ERR: Short
        val NETWORK_ERR: Short
        val ABORT_ERR: Short
        val URL_MISMATCH_ERR: Short
        val QUOTA_EXCEEDED_ERR: Short
        val TIMEOUT_ERR: Short
        val INVALID_NODE_TYPE_ERR: Short
        val DATA_CLONE_ERR: Short
    }
}

public external abstract class MediaDevices : EventTarget {
    open var ondevicechange: ((DeviceChangeEvent) -> Unit)?
    open fun enumerateDevices(): Promise<JsArray<MediaDeviceInfo>>
    open fun getSupportedConstraints(): MediaTrackSupportedConstraints
    open fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}

public external abstract class MediaDeviceInfo : JsAny {
    open val deviceId: String
    open val kind: MediaDeviceKind
    open val label: String
    open val groupId: String
    open fun toJSON(): JsAny
}

public external interface MediaDeviceKind : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaDeviceKind.Companion.AUDIOINPUT: MediaDeviceKind get() = "audioinput".toJsString().unsafeCast<MediaDeviceKind>()
public inline val MediaDeviceKind.Companion.AUDIOOUTPUT: MediaDeviceKind get() = "audiooutput".toJsString().unsafeCast<MediaDeviceKind>()
public inline val MediaDeviceKind.Companion.VIDEOINPUT: MediaDeviceKind get() = "videoinput".toJsString().unsafeCast<MediaDeviceKind>()

public external abstract class InputDeviceInfo : MediaDeviceInfo {
    open fun getCapabilities(): MediaTrackCapabilities
}

public external open class DeviceChangeEvent : Event {
    constructor(type: String, eventInitDict: DeviceChangeEventInit = definedExternally)
    open val devices: JsArray<MediaDeviceInfo>
    open val userInsertedDevices: JsArray<MediaDeviceInfo>

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface DeviceChangeEventInit : EventInit {
    var devices: JsArray<MediaDeviceInfo>?
}

public fun DeviceChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, devices: JsArray<MediaDeviceInfo>? = null): DeviceChangeEventInit = newJsObject<DeviceChangeEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (devices != null) this.devices = devices
}

public external interface MediaStreamConstraints : JsAny {
    var video: JsAny?
    var audio: JsAny?
}

public fun MediaStreamConstraints(video: JsAny? = null, audio: JsAny? = null): MediaStreamConstraints = newJsObject<MediaStreamConstraints>().apply {
    if (video != null) this.video = video
    if (audio != null) this.audio = audio
}

public external interface DoubleRange : JsAny {
    var max: Double?
    var min: Double?
}

public fun DoubleRange(max: Double? = null, min: Double? = null): DoubleRange = newJsObject<DoubleRange>().apply {
    if (max != null) this.max = max
    if (min != null) this.min = min
}

public external interface ConstrainDoubleRange : DoubleRange {
    var exact: Double?
    var ideal: Double?
}

public fun ConstrainDoubleRange(max: Double? = null, min: Double? = null, exact: Double? = null, ideal: Double? = null): ConstrainDoubleRange = newJsObject<ConstrainDoubleRange>().apply {
    if (max != null) this.max = max
    if (min != null) this.min = min
    if (exact != null) this.exact = exact
    if (ideal != null) this.ideal = ideal
}

public external interface ULongRange : JsAny {
    var max: Int?
    var min: Int?
}

public fun ULongRange(max: Int? = null, min: Int? = null): ULongRange = newJsObject<ULongRange>().apply {
    if (max != null) this.max = max
    if (min != null) this.min = min
}

public external interface ConstrainULongRange : ULongRange {
    var exact: Int?
    var ideal: Int?
}

public fun ConstrainULongRange(max: Int? = null, min: Int? = null, exact: Int? = null, ideal: Int? = null): ConstrainULongRange = newJsObject<ConstrainULongRange>().apply {
    if (max != null) this.max = max
    if (min != null) this.min = min
    if (exact != null) this.exact = exact
    if (ideal != null) this.ideal = ideal
}

public external interface ConstrainBooleanParameters : JsAny {
    var exact: Boolean?
    var ideal: Boolean?
}

public fun ConstrainBooleanParameters(exact: Boolean? = null, ideal: Boolean? = null): ConstrainBooleanParameters = newJsObject<ConstrainBooleanParameters>().apply {
    if (exact != null) this.exact = exact
    if (ideal != null) this.ideal = ideal
}

public external interface ConstrainDOMStringParameters : JsAny {
    var exact: JsAny?
    var ideal: JsAny?
}

public fun ConstrainDOMStringParameters(exact: JsAny? = null, ideal: JsAny? = null): ConstrainDOMStringParameters = newJsObject<ConstrainDOMStringParameters>().apply {
    if (exact != null) this.exact = exact
    if (ideal != null) this.ideal = ideal
}

public external interface ConstrainBooleanOrDOMStringParameters : JsAny {
    var exact: JsAny?
    var ideal: JsAny?
}

public fun ConstrainBooleanOrDOMStringParameters(exact: JsAny? = null, ideal: JsAny? = null): ConstrainBooleanOrDOMStringParameters = newJsObject<ConstrainBooleanOrDOMStringParameters>().apply {
    if (exact != null) this.exact = exact
    if (ideal != null) this.ideal = ideal
}
