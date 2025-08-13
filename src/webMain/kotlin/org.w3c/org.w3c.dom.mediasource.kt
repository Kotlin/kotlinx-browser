/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.dom.mediasource

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined

/**
 * Exposes the JavaScript [MediaSource](https://developer.mozilla.org/en/docs/Web/API/MediaSource) to Kotlin
 */
public expect open class MediaSource() : EventTarget, MediaProvider, JsAny {
    open val sourceBuffers: SourceBufferList
    open val activeSourceBuffers: SourceBufferList
    open val readyState: ReadyState
    var duration: Double
    var onsourceopen: ((Event) -> Unit)?
    var onsourceended: ((Event) -> Unit)?
    var onsourceclose: ((Event) -> Unit)?
    fun addSourceBuffer(type: String): SourceBuffer
    fun removeSourceBuffer(sourceBuffer: SourceBuffer)
    fun endOfStream(error: EndOfStreamError = definedExternally)
    fun setLiveSeekableRange(start: Double, end: Double)
    fun clearLiveSeekableRange()

    companion object {
        fun isTypeSupported(type: String): Boolean
    }
}

/**
 * Exposes the JavaScript [SourceBuffer](https://developer.mozilla.org/en/docs/Web/API/SourceBuffer) to Kotlin
 */
public expect abstract class SourceBuffer : EventTarget, JsAny {
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
    fun appendBuffer(data: JsAny?)
    fun abort()
    fun remove(start: Double, end: Double)
}

/**
 * Exposes the JavaScript [SourceBufferList](https://developer.mozilla.org/en/docs/Web/API/SourceBufferList) to Kotlin
 */
public expect abstract class SourceBufferList : EventTarget, JsAny {
    open val length: Int
    open var onaddsourcebuffer: ((Event) -> Unit)?
    open var onremovesourcebuffer: ((Event) -> Unit)?
}

public expect operator fun SourceBufferList.get(index: Int): SourceBuffer?

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface ReadyState : JsAny {
    companion object
}

public expect inline val ReadyState.Companion.CLOSED: ReadyState

public expect inline val ReadyState.Companion.OPEN: ReadyState

public expect inline val ReadyState.Companion.ENDED: ReadyState

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface EndOfStreamError : JsAny {
    companion object
}

public expect inline val EndOfStreamError.Companion.NETWORK: EndOfStreamError

public expect inline val EndOfStreamError.Companion.DECODE: EndOfStreamError

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public expect interface AppendMode : JsAny {
    companion object
}

public expect inline val AppendMode.Companion.SEGMENTS: AppendMode

public expect inline val AppendMode.Companion.SEQUENCE: AppendMode