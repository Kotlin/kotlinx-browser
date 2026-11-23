/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'media-source', DO NOT EDIT!

package org.w3c.dom.mediasource

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*

public external interface ReadyState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ReadyState.Companion.CLOSED: ReadyState get() = "closed".toJsString().unsafeCast<ReadyState>()
public inline val ReadyState.Companion.OPEN: ReadyState get() = "open".toJsString().unsafeCast<ReadyState>()
public inline val ReadyState.Companion.ENDED: ReadyState get() = "ended".toJsString().unsafeCast<ReadyState>()

public external interface EndOfStreamError : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val EndOfStreamError.Companion.NETWORK: EndOfStreamError get() = "network".toJsString().unsafeCast<EndOfStreamError>()
public inline val EndOfStreamError.Companion.DECODE: EndOfStreamError get() = "decode".toJsString().unsafeCast<EndOfStreamError>()

public external open class MediaSource : EventTarget, UnionBlobOrMediaSource {
    constructor()
    open val handle: MediaSourceHandle
    open val sourceBuffers: SourceBufferList
    open val activeSourceBuffers: SourceBufferList
    open val readyState: ReadyState
    open var duration: Double
    open var onsourceopen: ((Event) -> Unit)?
    open var onsourceended: ((Event) -> Unit)?
    open var onsourceclose: ((Event) -> Unit)?
    open fun addSourceBuffer(type: String): SourceBuffer
    open fun removeSourceBuffer(sourceBuffer: SourceBuffer)
    open fun endOfStream(error: EndOfStreamError = definedExternally)
    open fun setLiveSeekableRange(start: Double, end: Double)
    open fun clearLiveSeekableRange()

    companion object {
        val canConstructInDedicatedWorker: Boolean
        fun isTypeSupported(type: String): Boolean
    }
}

public external abstract class MediaSourceHandle : JsAny

public external interface AppendMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val AppendMode.Companion.SEGMENTS: AppendMode get() = "segments".toJsString().unsafeCast<AppendMode>()
public inline val AppendMode.Companion.SEQUENCE: AppendMode get() = "sequence".toJsString().unsafeCast<AppendMode>()

public external abstract class SourceBuffer : EventTarget {
    open var mode: AppendMode
    open val updating: Boolean
    open val buffered: TimeRanges
    open var timestampOffset: Double
    open val audioTracks: AudioTrackList
    open val videoTracks: VideoTrackList
    open val textTracks: TextTrackList
    open var appendWindowStart: Double
    open var appendWindowEnd: Double
    open var onupdatestart: ((Event) -> Unit)?
    open var onupdate: ((Event) -> Unit)?
    open var onupdateend: ((Event) -> Unit)?
    open var onerror: ((Event) -> Unit)?
    open var onabort: ((Event) -> Unit)?
    open fun appendBuffer(data: BufferDataSource)
    open fun abort()
    open fun changeType(type: String)
    open fun remove(start: Double, end: Double)
}

public external abstract class SourceBufferList : EventTarget {
    open val length: Int
    open var onaddsourcebuffer: ((Event) -> Unit)?
    open var onremovesourcebuffer: ((Event) -> Unit)?
}

public operator fun SourceBufferList.get(index: Int): SourceBuffer? = getProperty(this, index)

public external open class ManagedMediaSource : MediaSource {
    constructor()
    open val streaming: Boolean
    open var onstartstreaming: ((Event) -> Unit)?
    open var onendstreaming: ((Event) -> Unit)?

    companion object {
        val canConstructInDedicatedWorker: Boolean
        fun isTypeSupported(type: String): Boolean
    }
}

public external open class BufferedChangeEvent : Event {
    constructor(type: String, eventInitDict: BufferedChangeEventInit = definedExternally)
    open val addedRanges: TimeRanges
    open val removedRanges: TimeRanges

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface BufferedChangeEventInit : EventInit {
    var addedRanges: TimeRanges?
    var removedRanges: TimeRanges?
}

public fun BufferedChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, addedRanges: TimeRanges? = null, removedRanges: TimeRanges? = null): BufferedChangeEventInit = newJsObject<BufferedChangeEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (addedRanges != null) this.addedRanges = addedRanges
    if (removedRanges != null) this.removedRanges = removedRanges
}

public external abstract class ManagedSourceBuffer : SourceBuffer {
    open var onbufferedchange: ((BufferedChangeEvent) -> Unit)?
}
