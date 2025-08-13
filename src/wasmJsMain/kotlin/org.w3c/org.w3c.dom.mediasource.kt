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
public actual external open class MediaSource actual constructor() : EventTarget, MediaProvider, JsAny {
    actual open val sourceBuffers: SourceBufferList
    actual open val activeSourceBuffers: SourceBufferList
    actual open val readyState: ReadyState
    actual var duration: Double
    actual var onsourceopen: ((Event) -> Unit)?
    actual var onsourceended: ((Event) -> Unit)?
    actual var onsourceclose: ((Event) -> Unit)?
    actual fun addSourceBuffer(type: String): SourceBuffer
    actual fun removeSourceBuffer(sourceBuffer: SourceBuffer)
    actual fun endOfStream(error: EndOfStreamError)
    actual fun setLiveSeekableRange(start: Double, end: Double)
    actual fun clearLiveSeekableRange()

    actual companion object {
        actual fun isTypeSupported(type: String): Boolean
    }
}

/**
 * Exposes the JavaScript [SourceBuffer](https://developer.mozilla.org/en/docs/Web/API/SourceBuffer) to Kotlin
 */
public actual external abstract class SourceBuffer : EventTarget, JsAny {
    actual open var mode: AppendMode
    actual open val updating: Boolean
    actual open val buffered: TimeRanges
    actual open var timestampOffset: Double
    actual open val audioTracks: AudioTrackList
    actual open val videoTracks: VideoTrackList
    actual open val textTracks: TextTrackList
    actual open var appendWindowStart: Double
    actual open var appendWindowEnd: Double
    actual open var onupdatestart: ((Event) -> Unit)?
    actual open var onupdate: ((Event) -> Unit)?
    actual open var onupdateend: ((Event) -> Unit)?
    actual open var onerror: ((Event) -> Unit)?
    actual open var onabort: ((Event) -> Unit)?
    actual fun appendBuffer(data: JsAny?)
    actual fun abort()
    actual fun remove(start: Double, end: Double)
}

/**
 * Exposes the JavaScript [SourceBufferList](https://developer.mozilla.org/en/docs/Web/API/SourceBufferList) to Kotlin
 */
public actual external abstract class SourceBufferList : EventTarget, JsAny {
    actual open val length: Int
    actual open var onaddsourcebuffer: ((Event) -> Unit)?
    actual open var onremovesourcebuffer: ((Event) -> Unit)?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForSourceBufferList(obj: SourceBufferList, index: Int): SourceBuffer? = js("obj[index]")

public actual operator fun SourceBufferList.get(index: Int): SourceBuffer? = getMethodImplForSourceBufferList(this, index)

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface ReadyState : JsAny {
    actual companion object
}

public actual inline val ReadyState.Companion.CLOSED: ReadyState get() = "closed".toJsString().unsafeCast<ReadyState>()

public actual inline val ReadyState.Companion.OPEN: ReadyState get() = "open".toJsString().unsafeCast<ReadyState>()

public actual inline val ReadyState.Companion.ENDED: ReadyState get() = "ended".toJsString().unsafeCast<ReadyState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface EndOfStreamError : JsAny {
    actual companion object
}

public actual inline val EndOfStreamError.Companion.NETWORK: EndOfStreamError get() = "network".toJsString().unsafeCast<EndOfStreamError>()

public actual inline val EndOfStreamError.Companion.DECODE: EndOfStreamError get() = "decode".toJsString().unsafeCast<EndOfStreamError>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public actual external interface AppendMode : JsAny {
    actual companion object
}

public actual inline val AppendMode.Companion.SEGMENTS: AppendMode get() = "segments".toJsString().unsafeCast<AppendMode>()

public actual inline val AppendMode.Companion.SEQUENCE: AppendMode get() = "sequence".toJsString().unsafeCast<AppendMode>()