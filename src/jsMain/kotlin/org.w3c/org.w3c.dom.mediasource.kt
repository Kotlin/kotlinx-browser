/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.mediasource

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*

/**
 * Exposes the JavaScript [MediaSource](https://developer.mozilla.org/en/docs/Web/API/MediaSource) to Kotlin
 */
actual external open class MediaSource actual constructor() : EventTarget, MediaProvider {
    actual open val sourceBuffers: SourceBufferList
    actual open val activeSourceBuffers: SourceBufferList
    actual open val readyState: ReadyState
    actual var duration: Double
    actual var onsourceopen: ((Event) -> dynamic)?
    actual var onsourceended: ((Event) -> dynamic)?
    actual var onsourceclose: ((Event) -> dynamic)?
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
actual external abstract class SourceBuffer : EventTarget {
    actual open var mode: AppendMode
    actual open val updating: Boolean
    actual open val buffered: TimeRanges
    actual open var timestampOffset: Double
    actual open val audioTracks: AudioTrackList
    actual open val videoTracks: VideoTrackList
    actual open val textTracks: TextTrackList
    actual open var appendWindowStart: Double
    actual open var appendWindowEnd: Double
    actual open var onupdatestart: ((Event) -> dynamic)?
    actual open var onupdate: ((Event) -> dynamic)?
    actual open var onupdateend: ((Event) -> dynamic)?
    actual open var onerror: ((Event) -> dynamic)?
    actual open var onabort: ((Event) -> dynamic)?
    actual fun appendBuffer(data: dynamic)
    actual fun abort()
    actual fun remove(start: Double, end: Double)
}

/**
 * Exposes the JavaScript [SourceBufferList](https://developer.mozilla.org/en/docs/Web/API/SourceBufferList) to Kotlin
 */
actual external abstract class SourceBufferList : EventTarget {
    actual open val length: Int
    actual open var onaddsourcebuffer: ((Event) -> dynamic)?
    actual open var onremovesourcebuffer: ((Event) -> dynamic)?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun SourceBufferList.get(index: Int): SourceBuffer? = asDynamic()[index]

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface ReadyState {
    actual companion object
}

actual inline val ReadyState.Companion.CLOSED: ReadyState get() = "closed".asDynamic().unsafeCast<ReadyState>()

actual inline val ReadyState.Companion.OPEN: ReadyState get() = "open".asDynamic().unsafeCast<ReadyState>()

actual inline val ReadyState.Companion.ENDED: ReadyState get() = "ended".asDynamic().unsafeCast<ReadyState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface EndOfStreamError {
    actual companion object
}

actual inline val EndOfStreamError.Companion.NETWORK: EndOfStreamError get() = "network".asDynamic().unsafeCast<EndOfStreamError>()

actual inline val EndOfStreamError.Companion.DECODE: EndOfStreamError get() = "decode".asDynamic().unsafeCast<EndOfStreamError>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
actual external interface AppendMode {
    actual companion object
}

actual inline val AppendMode.Companion.SEGMENTS: AppendMode get() = "segments".asDynamic().unsafeCast<AppendMode>()

actual inline val AppendMode.Companion.SEQUENCE: AppendMode get() = "sequence".asDynamic().unsafeCast<AppendMode>()