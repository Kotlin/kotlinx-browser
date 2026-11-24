/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'media-source', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.mediasource

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*

public external interface ReadyState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ReadyState.Companion.CLOSED: ReadyState get() = "closed".toJsString().unsafeCast<ReadyState>()
public inline val ReadyState.Companion.OPEN: ReadyState get() = "open".toJsString().unsafeCast<ReadyState>()
public inline val ReadyState.Companion.ENDED: ReadyState get() = "ended".toJsString().unsafeCast<ReadyState>()

public external interface EndOfStreamError : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val EndOfStreamError.Companion.NETWORK: EndOfStreamError get() = "network".toJsString().unsafeCast<EndOfStreamError>()
public inline val EndOfStreamError.Companion.DECODE: EndOfStreamError get() = "decode".toJsString().unsafeCast<EndOfStreamError>()

/**
 * The MediaSource interface of the Media Source Extensions API represents a source of media data for an
 * HTMLMediaElement object. A MediaSource object can be attached to a HTMLMediaElement to be played in the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource)
 */
public open external class MediaSource : EventTarget, UnionBlobOrMediaSource {
    /**
     * The MediaSource() constructor of the MediaSource interface constructs and returns a new MediaSource object with
     * no associated source buffers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/MediaSource)
     */
    public constructor()

    /**
     * The handle read-only property of the MediaSource interface returns a MediaSourceHandle object, a proxy for the
     * MediaSource that can be transferred from a dedicated worker back to the main thread and attached to a media
     * element via its HTMLMediaElement.srcObject property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/handle)
     */
    public open val handle: MediaSourceHandle

    /**
     * The sourceBuffers read-only property of the MediaSource interface returns a SourceBufferList object containing
     * the list of SourceBuffer objects associated with this MediaSource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceBuffers)
     */
    public open val sourceBuffers: SourceBufferList

    /**
     * The activeSourceBuffers read-only property of the MediaSource interface returns a SourceBufferList object
     * containing a subset of the SourceBuffer objects contained within sourceBuffers — the list of objects providing
     * the selected video track, enabled audio tracks, and shown/hidden text tracks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/activeSourceBuffers)
     */
    public open val activeSourceBuffers: SourceBufferList

    /**
     * The readyState read-only property of the MediaSource interface returns an enum representing the state of the
     * current MediaSource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/readyState)
     */
    public open val readyState: ReadyState

    /**
     * The duration property of the MediaSource interface gets and sets the duration of the current media being
     * presented.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/duration)
     */
    public open var duration: Double

    /**
     * The sourceopen event is fired when a MediaSource object's readyState changes to "open". This indicates that the
     * MediaSource is ready to receive data from SourceBuffer objects. This can occur either when the MediaSource object
     * is first attached to a media element or when the readyState changes from "ended" back to "open".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceopen_event)
     */
    public open var onsourceopen: ((Event) -> Unit)?

    /**
     * The sourceended event is fired when a MediaSource object's readyState changes to "ended". This indicates that the
     * application has finished sending data to the MediaSource. When an application has finished appending all media
     * data to the SourceBuffer objects associated with a MediaSource, it calls the MediaSource.endOfStream() method on
     * the MediaSource. This causes the readyState to transition to "ended" and triggers the sourceended event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceended_event)
     */
    public open var onsourceended: ((Event) -> Unit)?

    /**
     * The sourceclose event is fired when a MediaSource object's readyState changes to "closed". This indicates that
     * the MediaSource has been detached from the media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/sourceclose_event)
     */
    public open var onsourceclose: ((Event) -> Unit)?

    /**
     * The addSourceBuffer() method of the MediaSource interface creates a new SourceBuffer of the given MIME type and
     * adds it to the MediaSource's sourceBuffers list. The new SourceBuffer is also returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/addSourceBuffer)
     */
    public open fun addSourceBuffer(type: String): SourceBuffer

    /**
     * The removeSourceBuffer() method of the MediaSource interface removes the given SourceBuffer from the
     * SourceBufferList associated with this MediaSource object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/removeSourceBuffer)
     */
    public open fun removeSourceBuffer(sourceBuffer: SourceBuffer)

    /**
     * The endOfStream() method of the MediaSource interface signals the end of the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/endOfStream)
     */
    public open fun endOfStream(error: EndOfStreamError = definedExternally)

    /**
     * The setLiveSeekableRange() method of the MediaSource interface sets the range that the user can seek to in the
     * media element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/setLiveSeekableRange)
     */
    public open fun setLiveSeekableRange(start: Double, end: Double)

    /**
     * The clearLiveSeekableRange() method of the MediaSource interface clears a seekable range previously set with a
     * call to setLiveSeekableRange().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/clearLiveSeekableRange)
     */
    public open fun clearLiveSeekableRange()

    public companion object {
        /**
         * The canConstructInDedicatedWorker read-only static property of the MediaSource interface returns true if
         * MediaSource worker support is implemented, providing a low-latency feature detection mechanism.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/canConstructInDedicatedWorker_static)
         */
        public val canConstructInDedicatedWorker: Boolean

        /**
         * The MediaSource.isTypeSupported() static method returns a boolean value which is true if the given MIME type
         * and (optional) codec are likely to be supported by the current user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/isTypeSupported_static)
         */
        public fun isTypeSupported(type: String): Boolean
    }
}

/**
 * The MediaSourceHandle interface of the Media Source Extensions API is a proxy for a MediaSource that can be
 * transferred from a dedicated worker back to the main thread and attached to a media element via its
 * HTMLMediaElement.srcObject property. MediaSource objects are not transferable because they are event targets, hence
 * the need for MediaSourceHandles.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSourceHandle)
 */
public abstract external class MediaSourceHandle : JsAny

public external interface AppendMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val AppendMode.Companion.SEGMENTS: AppendMode get() = "segments".toJsString().unsafeCast<AppendMode>()
public inline val AppendMode.Companion.SEQUENCE: AppendMode get() = "sequence".toJsString().unsafeCast<AppendMode>()

/**
 * The SourceBuffer interface represents a chunk of media to be passed into an HTMLMediaElement and played, via a
 * MediaSource object. This can be made up of one or several media segments.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer)
 */
public abstract external class SourceBuffer : EventTarget {
    /**
     * The mode property of the SourceBuffer interface controls whether media segments can be appended to the
     * SourceBuffer in any order, or in a strict sequence.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/mode)
     */
    public open var mode: AppendMode

    /**
     * The updating read-only property of the SourceBuffer interface indicates whether the SourceBuffer is currently
     * being updated — i.e., whether an appendBuffer() or remove() operation is currently in progress.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updating)
     */
    public open val updating: Boolean

    /**
     * The buffered read-only property of the SourceBuffer interface returns the time ranges that are currently buffered
     * in the SourceBuffer as a normalized TimeRanges object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/buffered)
     */
    public open val buffered: TimeRanges

    /**
     * The timestampOffset property of the SourceBuffer interface controls the offset applied to timestamps inside media
     * segments that are appended to the SourceBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/timestampOffset)
     */
    public open var timestampOffset: Double

    /**
     * The audioTracks read-only property of the SourceBuffer interface returns a list of the audio tracks currently
     * contained inside the SourceBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/audioTracks)
     */
    public open val audioTracks: AudioTrackList

    /**
     * The videoTracks read-only property of the SourceBuffer interface returns a list of the video tracks currently
     * contained inside the SourceBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/videoTracks)
     */
    public open val videoTracks: VideoTrackList

    /**
     * The textTracks read-only property of the SourceBuffer interface returns a list of the text tracks currently
     * contained inside the SourceBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/textTracks)
     */
    public open val textTracks: TextTrackList

    /**
     * The appendWindowStart property of the SourceBuffer interface controls the timestamp for the start of the append
     * window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media
     * frames with timestamps within this range will be appended, whereas those outside the range will be filtered out.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowStart)
     */
    public open var appendWindowStart: Double

    /**
     * The appendWindowEnd property of the SourceBuffer interface controls the timestamp for the end of the append
     * window, a timestamp range that can be used to filter what media data is appended to the SourceBuffer. Coded media
     * frames with timestamps within this range will be appended, whereas those outside the range will be filtered out.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendWindowEnd)
     */
    public open var appendWindowEnd: Double

    /**
     * The updatestart event of the SourceBuffer interface signals the beginning of an appendBuffer() or remove()
     * operation. The updating attribute transitions from false to true.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updatestart_event)
     */
    public open var onupdatestart: ((Event) -> Unit)?

    /**
     * The update event of the SourceBuffer interface signals the successful completion of an appendBuffer() or remove()
     * operation. The updating attribute transitions from true to false. This event is fired before the updateend event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/update_event)
     */
    public open var onupdate: ((Event) -> Unit)?

    /**
     * The updateend event of the SourceBuffer interface signals the (not necessarily successful) completion of an
     * appendBuffer() or remove() operation. The updating attribute transitions from true to false. This event is fired
     * after the update, error, or abort events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/updateend_event)
     */
    public open var onupdateend: ((Event) -> Unit)?

    /**
     * The error event of the SourceBuffer interface is fired when an error occurs during the processing of an
     * appendBuffer() operation. This may happen, for example, if the data being appended is not in the expected format,
     * the SourceBuffer is in an invalid state, or the user agent is unable to process the data. The updating property
     * transitions from true to false. This event is fired before the updateend event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/error_event)
     */
    public open var onerror: ((Event) -> Unit)?

    /**
     * The abort event of the SourceBuffer interface is fired when the buffer appending is aborted, because the
     * SourceBuffer.abort() or SourceBuffer.remove() method is called while the SourceBuffer.appendBuffer() algorithm is
     * still running. The updating property transitions from true to false. This event is fired before the updateend
     * event.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort_event)
     */
    public open var onabort: ((Event) -> Unit)?

    /**
     * The appendBuffer() method of the SourceBuffer interface appends media segment data from an ArrayBuffer, a
     * TypedArray or a DataView object to the SourceBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/appendBuffer)
     */
    public open fun appendBuffer(data: BufferDataSource)

    /**
     * The abort() method of the SourceBuffer interface aborts the current segment and resets the segment parser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/abort)
     */
    public open fun abort()

    /**
     * The changeType() method of the SourceBuffer interface sets the MIME type that future calls to appendBuffer()
     * should expect the new media data to conform to. This makes it possible to change codecs or container type
     * mid-stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/changeType)
     */
    public open fun changeType(type: String)

    /**
     * The remove() method of the SourceBuffer interface removes media segments within a specific time range from the
     * SourceBuffer. This method can only be called when SourceBuffer.updating equals false. If SourceBuffer.updating is
     * not equal to false, call SourceBuffer.abort().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBuffer/remove)
     */
    public open fun remove(start: Double, end: Double)
}

/**
 * The SourceBufferList interface represents a simple container list for multiple SourceBuffer objects.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList)
 */
public abstract external class SourceBufferList : EventTarget {
    /**
     * The length read-only property of the SourceBufferList interface returns the number of SourceBuffer objects in the
     * list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SourceBufferList/length)
     */
    public open val length: Int
    public open var onaddsourcebuffer: ((Event) -> Unit)?
    public open var onremovesourcebuffer: ((Event) -> Unit)?
}

public operator fun SourceBufferList.get(index: Int): SourceBuffer? = getProperty(this, index)

/**
 * The ManagedMediaSource interface of the Media Source Extensions API is a MediaSource that actively manages its memory
 * content. Unlike a regular MediaSource, the user agent can evict content from its ManagedSourceBuffer objects at any
 * time, for reasons such as memory or hardware limitations. This makes it suitable for power-efficient streaming
 * scenarios where the user agent needs more control over buffered media data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedMediaSource)
 */
public open external class ManagedMediaSource : MediaSource {
    /**
     * The ManagedMediaSource() constructor of the ManagedMediaSource interface constructs and returns a new
     * ManagedMediaSource object instance with no associated source buffers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedMediaSource/ManagedMediaSource)
     */
    public constructor()

    /**
     * The streaming read-only property of the ManagedMediaSource interface is a boolean indicating whether the
     * application should actively fetch and append media data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedMediaSource/streaming)
     */
    public open val streaming: Boolean

    /**
     * The startstreaming event of the ManagedMediaSource interface is fired when the streaming property changes from
     * false to true. This indicates that the user agent needs more data to ensure uninterrupted playback, and the
     * application should begin fetching and appending media segments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedMediaSource/startstreaming_event)
     */
    public open var onstartstreaming: ((Event) -> Unit)?

    /**
     * The endstreaming event of the ManagedMediaSource interface is fired when the streaming property changes from true
     * to false. This indicates that the user agent has enough data buffered to ensure uninterrupted playback, and the
     * application can stop fetching new media segments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedMediaSource/endstreaming_event)
     */
    public open var onendstreaming: ((Event) -> Unit)?

    public companion object {
        /**
         * The canConstructInDedicatedWorker read-only static property of the MediaSource interface returns true if
         * MediaSource worker support is implemented, providing a low-latency feature detection mechanism.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/canConstructInDedicatedWorker_static)
         */
        public val canConstructInDedicatedWorker: Boolean

        /**
         * The MediaSource.isTypeSupported() static method returns a boolean value which is true if the given MIME type
         * and (optional) codec are likely to be supported by the current user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSource/isTypeSupported_static)
         */
        public fun isTypeSupported(type: String): Boolean
    }
}

/**
 * The BufferedChangeEvent interface of the Media Source Extensions API represents the event object for the
 * bufferedchange event fired on a ManagedSourceBuffer. This event is fired whenever the buffered ranges of the
 * ManagedSourceBuffer change, for example as a result of appendBuffer(), remove(), or endOfStream() calls, or when the
 * user agent runs the memory cleanup algorithm.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BufferedChangeEvent)
 */
public open external class BufferedChangeEvent : Event {
    /**
     * The BufferedChangeEvent() constructor of the BufferedChangeEvent interface creates a new BufferedChangeEvent
     * object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BufferedChangeEvent/BufferedChangeEvent)
     */
    public constructor(type: String, eventInitDict: BufferedChangeEventInit = definedExternally)

    /**
     * The addedRanges read-only property of the BufferedChangeEvent interface returns a TimeRanges object representing
     * the time ranges that were added to the associated ManagedSourceBuffer. These are the ranges added between the
     * last updatestart and updateend events, during the most recent run of the coded frame processing algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BufferedChangeEvent/addedRanges)
     */
    public open val addedRanges: TimeRanges

    /**
     * The removedRanges read-only property of the BufferedChangeEvent interface returns a TimeRanges object
     * representing the time ranges that were removed from the associated ManagedSourceBuffer. These are the ranges
     * removed between the last updatestart and updateend events, during the most recent run of the coded frame removal
     * or coded frame eviction algorithm, or as a consequence of the user agent running the memory cleanup algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BufferedChangeEvent/removedRanges)
     */
    public open val removedRanges: TimeRanges

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface BufferedChangeEventInit : EventInit {
    public var addedRanges: TimeRanges?
    public var removedRanges: TimeRanges?
}

public fun BufferedChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, addedRanges: TimeRanges? = null, removedRanges: TimeRanges? = null): BufferedChangeEventInit = newJsObject<BufferedChangeEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (addedRanges != null) this.addedRanges = addedRanges
    if (removedRanges != null) this.removedRanges = removedRanges
}

/**
 * The ManagedSourceBuffer interface of the Media Source Extensions API is a SourceBuffer that is created by a
 * ManagedMediaSource when addSourceBuffer() is called. It inherits all the properties and methods of SourceBuffer, and
 * additionally fires a bufferedchange event whenever the buffered ranges change — including when the user agent evicts
 * content as part of its memory cleanup algorithm.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedSourceBuffer)
 */
public abstract external class ManagedSourceBuffer : SourceBuffer {
    /**
     * The bufferedchange event of the ManagedSourceBuffer interface is fired when the ManagedSourceBuffer's buffered
     * range changes. This can occur following a call to appendBuffer(), remove(), endOfStream(), or as a consequence of
     * the user agent running the memory cleanup algorithm.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ManagedSourceBuffer/bufferedchange_event)
     */
    public open var onbufferedchange: ((BufferedChangeEvent) -> Unit)?
}
