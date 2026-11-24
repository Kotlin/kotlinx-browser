/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'mediacapture-streams', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.mediacapture

import kotlin.js.*
import org.w3c.dom.*

/**
 * The MediaStream interface of the Media Capture and Streams API represents a stream of media content. A stream
 * consists of several tracks, such as video or audio tracks. Each track is specified as an instance of
 * MediaStreamTrack.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream)
 */
public external open class MediaStream : EventTarget, MediaProvider {
    /**
     * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks,
     * each represented by a MediaStreamTrack object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/MediaStream)
     */
    constructor()

    /**
     * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks,
     * each represented by a MediaStreamTrack object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/MediaStream)
     */
    constructor(stream: MediaStream)

    /**
     * The MediaStream() constructor returns a newly-created MediaStream, which serves as a collection of media tracks,
     * each represented by a MediaStreamTrack object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/MediaStream)
     */
    constructor(tracks: JsArray<MediaStreamTrack>)

    /**
     * The id read-only property of the MediaStream interface is a string containing 36 characters denoting a unique
     * identifier (GUID) for the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/id)
     */
    open val id: String

    /**
     * The getAudioTracks() method of the MediaStream interface returns a sequence that represents all the
     * MediaStreamTrack objects in this stream's track set where MediaStreamTrack.kind is audio.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getAudioTracks)
     */
    open fun getAudioTracks(): JsArray<MediaStreamTrack>

    /**
     * The getVideoTracks() method of the MediaStream interface returns a sequence of MediaStreamTrack objects
     * representing the video tracks in this stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getVideoTracks)
     */
    open fun getVideoTracks(): JsArray<MediaStreamTrack>

    /**
     * The getTracks() method of the MediaStream interface returns a sequence that represents all the MediaStreamTrack
     * objects in this stream's track set, regardless of MediaStreamTrack.kind.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTracks)
     */
    open fun getTracks(): JsArray<MediaStreamTrack>

    /**
     * The getTrackById() method of the MediaStream interface returns a MediaStreamTrack object representing the track
     * with the specified ID string. If there is no track with the specified ID, this method returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/getTrackById)
     */
    open fun getTrackById(trackId: String): MediaStreamTrack?

    /**
     * The addTrack() method of the MediaStream interface adds a new track to the stream. The track is specified as a
     * parameter of type MediaStreamTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addTrack)
     */
    open fun addTrack(track: MediaStreamTrack)

    /**
     * The removeTrack() method of the MediaStream interface removes a MediaStreamTrack from a stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removeTrack)
     */
    open fun removeTrack(track: MediaStreamTrack)

    /**
     * The clone() method of the MediaStream interface creates a duplicate of the MediaStream. This new MediaStream
     * object has a new unique id and contains clones of every MediaStreamTrack contained by the MediaStream on which
     * clone() was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/clone)
     */
    open fun clone(): MediaStream

    /**
     * The active read-only property of the MediaStream interface returns a Boolean value which is true if the stream is
     * currently active; otherwise, it returns false. A stream is considered active if at least one of its
     * MediaStreamTracks does not have its property MediaStreamTrack.readyState set to ended. Once every track has
     * ended, the stream's active property becomes false.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/active)
     */
    open val active: Boolean

    /**
     * The addtrack event is fired when a new MediaStreamTrack object has been added to a MediaStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/addtrack_event)
     */
    open var onaddtrack: ((MediaStreamTrackEvent) -> Unit)?

    /**
     * The removetrack event is fired when a new MediaStreamTrack object has been removed from a MediaStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStream/removetrack_event)
     */
    open var onremovetrack: ((MediaStreamTrackEvent) -> Unit)?
}

/**
 * The MediaStreamTrack interface of the Media Capture and Streams API represents a single media track within a stream;
 * typically, these are audio or video tracks, but other track types may exist as well.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack)
 */
public external abstract class MediaStreamTrack : EventTarget {
    /**
     * The kind read-only property of the MediaStreamTrack interface returns a string set to "audio" if the track is an
     * audio track and to "video" if it is a video track. It doesn't change if the track is disassociated from its
     * source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/kind)
     */
    open val kind: String

    /**
     * The id read-only property of the MediaStreamTrack interface returns a string containing a unique identifier
     * (GUID) for the track, which is generated by the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/id)
     */
    open val id: String

    /**
     * The label read-only property of the MediaStreamTrack interface returns a string containing a user agent-assigned
     * label that identifies the track source, as in "internal microphone".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/label)
     */
    open val label: String

    /**
     * The enabled property of the MediaStreamTrack interface is a Boolean value which is true if the track is allowed
     * to render the source stream or false if it is not. This can be used to intentionally mute a track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/enabled)
     */
    open var enabled: Boolean

    /**
     * The muted read-only property of the MediaStreamTrack interface returns a boolean value indicating whether or not
     * the track is currently unable to provide media output.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/muted)
     */
    open val muted: Boolean

    /**
     * The mute event is sent to a MediaStreamTrack when the track's source is temporarily unable to provide media data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/mute_event)
     */
    open var onmute: ((Event) -> Unit)?

    /**
     * The unmute event is sent to a MediaStreamTrack when the track's source is once again able to provide media data
     * after a period of not being able to do so.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/unmute_event)
     */
    open var onunmute: ((Event) -> Unit)?

    /**
     * The readyState read-only property of the MediaStreamTrack interface returns an enumerated value giving the status
     * of the track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/readyState)
     */
    open val readyState: MediaStreamTrackState

    /**
     * The ended event of the MediaStreamTrack interface is fired when playback or streaming has stopped because the end
     * of the media was reached or because no further data is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/ended_event)
     */
    open var onended: ((Event) -> Unit)?

    /**
     * The clone() method of the MediaStreamTrack interface creates a duplicate of the MediaStreamTrack. This new
     * MediaStreamTrack object is identical except for its unique id.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/clone)
     */
    open fun clone(): MediaStreamTrack

    /**
     * The stop() method of the MediaStreamTrack interface stops the track.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/stop)
     */
    open fun stop()

    /**
     * The getCapabilities() method of the MediaStreamTrack interface returns an object detailing the accepted values or
     * value range for each constrainable property of the associated MediaStreamTrack, based upon the platform and user
     * agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getCapabilities)
     */
    open fun getCapabilities(): MediaTrackCapabilities

    /**
     * The getConstraints() method of the MediaStreamTrack interface returns a MediaTrackConstraints object containing
     * the set of constraints most recently established for the track using a prior call to applyConstraints(). These
     * constraints indicate values and ranges of values that the website or application has specified are required or
     * acceptable for the included constrainable properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getConstraints)
     */
    open fun getConstraints(): MediaTrackConstraints

    /**
     * The getSettings() method of the MediaStreamTrack interface returns an object containing the current values of
     * each of the constrainable properties for the current MediaStreamTrack.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/getSettings)
     */
    open fun getSettings(): MediaTrackSettings

    /**
     * The applyConstraints() method of the MediaStreamTrack interface applies a set of constraints to the track; these
     * constraints let the website or app establish ideal values and acceptable ranges of values for the constrainable
     * properties of the track, such as frame rate, dimensions, echo cancellation, and so forth.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrack/applyConstraints)
     */
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

/**
 * The MediaStreamTrackEvent interface of the Media Capture and Streams API represents events which indicate that a
 * MediaStream has had tracks added to or removed from the stream through calls to Media Capture and Streams API
 * methods. These events are sent to the stream when these changes occur.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent)
 */
public external open class MediaStreamTrackEvent : Event {
    /**
     * The MediaStreamTrackEvent() constructor returns a new MediaStreamTrackEvent object, which represents an event
     * signaling that a MediaStreamTrack has been added to or removed from a MediaStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/MediaStreamTrackEvent)
     */
    constructor(type: String, eventInitDict: MediaStreamTrackEventInit)

    /**
     * The track read-only property of the MediaStreamTrackEvent interface returns the MediaStreamTrack associated with
     * this event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaStreamTrackEvent/track)
     */
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

/**
 * The OverconstrainedError interface of the Media Capture and Streams API indicates that the set of desired
 * capabilities for the current MediaStreamTrack cannot currently be met. When this event is thrown on a
 * MediaStreamTrack, it is muted until either the current constraints can be established or until satisfiable
 * constraints are applied.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError)
 */
public external open class OverconstrainedError : DOMException {
    /**
     * The OverconstrainedError() constructor creates a new OverconstrainedError object which indicates that the set of
     * desired capabilities for the current MediaStreamTrack cannot currently be met. When this event is thrown on a
     * MediaStreamTrack, it is muted until either the current constraints can be established or until satisfiable
     * constraints are applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError/OverconstrainedError)
     */
    constructor(constraint: String, message: String = definedExternally)

    /**
     * The constraint read-only property of the OverconstrainedError interface returns the constraint that was supplied
     * in the constructor, meaning the constraint that was not satisfied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OverconstrainedError/constraint)
     */
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

/**
 * The MediaDevices interface of the Media Capture and Streams API provides access to connected media input devices like
 * cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of
 * media data.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices)
 */
public external abstract class MediaDevices : EventTarget {
    /**
     * The devicechange event is sent to a MediaDevices instance whenever a media device such as a camera, microphone,
     * or speaker is connected to or removed from the system.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/devicechange_event)
     */
    open var ondevicechange: ((DeviceChangeEvent) -> Unit)?

    /**
     * The enumerateDevices() method of the MediaDevices interface requests a list of the currently available media
     * input and output devices, such as microphones, cameras, headsets, and so forth. The returned Promise is resolved
     * with an array of MediaDeviceInfo objects describing the devices.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/enumerateDevices)
     */
    open fun enumerateDevices(): Promise<JsArray<MediaDeviceInfo>>

    /**
     * The getSupportedConstraints() method of the MediaDevices interface returns an object whose member fields each
     * specify one of the constrainable properties the user agent understands.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getSupportedConstraints)
     */
    open fun getSupportedConstraints(): MediaTrackSupportedConstraints

    /**
     * The getUserMedia() method of the MediaDevices interface prompts the user for permission to use a media input
     * which produces a MediaStream with tracks containing the requested types of media.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDevices/getUserMedia)
     */
    open fun getUserMedia(constraints: MediaStreamConstraints = definedExternally): Promise<MediaStream>
}

/**
 * The MediaDeviceInfo interface of the Media Capture and Streams API contains information that describes a single media
 * input or output device.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo)
 */
public external abstract class MediaDeviceInfo : JsAny {
    /**
     * The deviceId read-only property of the MediaDeviceInfo interface returns a string that is an identifier for the
     * represented device and is persisted across sessions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/deviceId)
     */
    open val deviceId: String

    /**
     * The kind read-only property of the MediaDeviceInfo interface returns an enumerated value, that is either
     * "videoinput", "audioinput" or "audiooutput".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind)
     */
    open val kind: MediaDeviceKind

    /**
     * The label read-only property of the MediaDeviceInfo interface returns a string describing this device (for
     * example "External USB Webcam").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/label)
     */
    open val label: String

    /**
     * The groupId read-only property of the MediaDeviceInfo interface returns a string that is a group identifier.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/groupId)
     */
    open val groupId: String

    /**
     * The toJSON() method of the MediaDeviceInfo interface returns a JSON-serializable plain object representing the
     * MediaDeviceInfo object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/toJSON)
     */
    open fun toJSON(): JsAny
}

public external interface MediaDeviceKind : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val MediaDeviceKind.Companion.AUDIOINPUT: MediaDeviceKind get() = "audioinput".toJsString().unsafeCast<MediaDeviceKind>()
public inline val MediaDeviceKind.Companion.AUDIOOUTPUT: MediaDeviceKind get() = "audiooutput".toJsString().unsafeCast<MediaDeviceKind>()
public inline val MediaDeviceKind.Companion.VIDEOINPUT: MediaDeviceKind get() = "videoinput".toJsString().unsafeCast<MediaDeviceKind>()

/**
 * The InputDeviceInfo interface of the Media Capture and Streams API gives access to the capabilities of the input
 * device that it represents.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo)
 */
public external abstract class InputDeviceInfo : MediaDeviceInfo {
    /**
     * The getCapabilities() method of the InputDeviceInfo interface returns a MediaTrackCapabilities object describing
     * the primary audio or video track of the device's MediaStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities)
     */
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
