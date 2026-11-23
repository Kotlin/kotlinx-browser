/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'streams', DO NOT EDIT!

package org.w3c.streams

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*

public external interface ReadableStreamReader : JsAny

public external interface ReadableStreamController : JsAny

public external open class ReadableStream : JsAny {
    constructor(underlyingSource: JsAny = definedExternally, strategy: QueuingStrategy = definedExternally)
    open val locked: Boolean
    open fun cancel(reason: JsAny? = definedExternally): Promise<JsAny?>
    open fun getReader(options: ReadableStreamGetReaderOptions = definedExternally): ReadableStreamReader
    open fun pipeThrough(transform: ReadableWritablePair, options: StreamPipeOptions = definedExternally): ReadableStream
    open fun pipeTo(destination: WritableStream, options: StreamPipeOptions = definedExternally): Promise<JsAny?>
    open fun tee(): JsArray<ReadableStream>
    // not printed yet: async_iterable

    companion object {
        fun from(asyncIterable: JsAny): ReadableStream
    }
}

public external interface ReadableStreamReaderMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ReadableStreamReaderMode.Companion.BYOB: ReadableStreamReaderMode get() = "byob".toJsString().unsafeCast<ReadableStreamReaderMode>()

public external interface ReadableStreamGetReaderOptions : JsAny {
    var mode: ReadableStreamReaderMode?
}

public fun ReadableStreamGetReaderOptions(mode: ReadableStreamReaderMode? = null): ReadableStreamGetReaderOptions = newJsObject<ReadableStreamGetReaderOptions>().apply {
    if (mode != null) this.mode = mode
}

public external interface ReadableStreamIteratorOptions : JsAny {
    var preventCancel: Boolean?
}

public fun ReadableStreamIteratorOptions(preventCancel: Boolean? = null): ReadableStreamIteratorOptions = newJsObject<ReadableStreamIteratorOptions>().apply {
    if (preventCancel != null) this.preventCancel = preventCancel
}

public external interface ReadableWritablePair : JsAny {
    var readable: ReadableStream
    var writable: WritableStream
}

public fun ReadableWritablePair(readable: ReadableStream, writable: WritableStream): ReadableWritablePair = newJsObject<ReadableWritablePair>().apply {
    this.readable = readable
    this.writable = writable
}

public external interface StreamPipeOptions : JsAny {
    var preventClose: Boolean?
    var preventAbort: Boolean?
    var preventCancel: Boolean?
    var signal: AbortSignal?
}

public fun StreamPipeOptions(preventClose: Boolean? = null, preventAbort: Boolean? = null, preventCancel: Boolean? = null, signal: AbortSignal? = null): StreamPipeOptions = newJsObject<StreamPipeOptions>().apply {
    if (preventClose != null) this.preventClose = preventClose
    if (preventAbort != null) this.preventAbort = preventAbort
    if (preventCancel != null) this.preventCancel = preventCancel
    if (signal != null) this.signal = signal
}

public external interface UnderlyingSource : JsAny {
    var start: ((ReadableStreamController) -> JsAny?)?
    var pull: ((ReadableStreamController) -> Promise<JsAny?>)?
    var cancel: ((JsAny?) -> Promise<JsAny?>)?
    var type: ReadableStreamType?
    var autoAllocateChunkSize: Double?
}

public fun UnderlyingSource(start: ((ReadableStreamController) -> JsAny?)? = null, pull: ((ReadableStreamController) -> Promise<JsAny?>)? = null, cancel: ((JsAny?) -> Promise<JsAny?>)? = null, type: ReadableStreamType? = null, autoAllocateChunkSize: Double? = null): UnderlyingSource = newJsObject<UnderlyingSource>().apply {
    if (start != null) this.start = start
    if (pull != null) this.pull = pull
    if (cancel != null) this.cancel = cancel
    if (type != null) this.type = type
    if (autoAllocateChunkSize != null) this.autoAllocateChunkSize = autoAllocateChunkSize
}

public external interface ReadableStreamType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ReadableStreamType.Companion.BYTES: ReadableStreamType get() = "bytes".toJsString().unsafeCast<ReadableStreamType>()

public external interface ReadableStreamGenericReader : JsAny {
    val closed: Promise<JsAny?>
    fun cancel(reason: JsAny? = definedExternally): Promise<JsAny?>
}

public external open class ReadableStreamDefaultReader : ReadableStreamGenericReader, ReadableStreamReader {
    constructor(stream: ReadableStream)
    open fun read(): Promise<ReadableStreamReadResult>
    open fun releaseLock()
    override val closed: Promise<JsAny?>
    override fun cancel(reason: JsAny?): Promise<JsAny?>
}

public external interface ReadableStreamReadResult : JsAny {
    var value: JsAny?
    var done: Boolean?
}

public fun ReadableStreamReadResult(value: JsAny? = null, done: Boolean? = null): ReadableStreamReadResult = newJsObject<ReadableStreamReadResult>().apply {
    if (value != null) this.value = value
    if (done != null) this.done = done
}

public external open class ReadableStreamBYOBReader : ReadableStreamGenericReader, ReadableStreamReader {
    constructor(stream: ReadableStream)
    open fun read(view: ArrayBufferView, options: ReadableStreamBYOBReaderReadOptions = definedExternally): Promise<ReadableStreamReadResult>
    open fun releaseLock()
    override val closed: Promise<JsAny?>
    override fun cancel(reason: JsAny?): Promise<JsAny?>
}

public external interface ReadableStreamBYOBReaderReadOptions : JsAny {
    var min: Double?
}

public fun ReadableStreamBYOBReaderReadOptions(min: Double? = null): ReadableStreamBYOBReaderReadOptions = newJsObject<ReadableStreamBYOBReaderReadOptions>().apply {
    if (min != null) this.min = min
}

public external abstract class ReadableStreamDefaultController : ReadableStreamController {
    open val desiredSize: Double?
    open fun close()
    open fun enqueue(chunk: JsAny? = definedExternally)
    open fun error(e: JsAny? = definedExternally)
}

public external abstract class ReadableByteStreamController : ReadableStreamController {
    open val byobRequest: ReadableStreamBYOBRequest?
    open val desiredSize: Double?
    open fun close()
    open fun enqueue(chunk: ArrayBufferView)
    open fun error(e: JsAny? = definedExternally)
}

public external abstract class ReadableStreamBYOBRequest : JsAny {
    open val view: Uint8Array?
    open fun respond(bytesWritten: Double)
    open fun respondWithNewView(view: ArrayBufferView)
}

public external open class WritableStream : JsAny {
    constructor(underlyingSink: JsAny = definedExternally, strategy: QueuingStrategy = definedExternally)
    open val locked: Boolean
    open fun abort(reason: JsAny? = definedExternally): Promise<JsAny?>
    open fun close(): Promise<JsAny?>
    open fun getWriter(): WritableStreamDefaultWriter
}

public external interface UnderlyingSink : JsAny {
    var start: ((WritableStreamDefaultController) -> JsAny?)?
    var write: ((JsAny?, WritableStreamDefaultController) -> Promise<JsAny?>)?
    var close: (() -> Promise<JsAny?>)?
    var abort: ((JsAny?) -> Promise<JsAny?>)?
    var type: JsAny?
}

public fun UnderlyingSink(start: ((WritableStreamDefaultController) -> JsAny?)? = null, write: ((JsAny?, WritableStreamDefaultController) -> Promise<JsAny?>)? = null, close: (() -> Promise<JsAny?>)? = null, abort: ((JsAny?) -> Promise<JsAny?>)? = null, type: JsAny? = null): UnderlyingSink = newJsObject<UnderlyingSink>().apply {
    if (start != null) this.start = start
    if (write != null) this.write = write
    if (close != null) this.close = close
    if (abort != null) this.abort = abort
    if (type != null) this.type = type
}

public external open class WritableStreamDefaultWriter : JsAny {
    constructor(stream: WritableStream)
    open val closed: Promise<JsAny?>
    open val desiredSize: Double?
    open val ready: Promise<JsAny?>
    open fun abort(reason: JsAny? = definedExternally): Promise<JsAny?>
    open fun close(): Promise<JsAny?>
    open fun releaseLock()
    open fun write(chunk: JsAny? = definedExternally): Promise<JsAny?>
}

public external abstract class WritableStreamDefaultController : JsAny {
    open val signal: AbortSignal
    open fun error(e: JsAny? = definedExternally)
}

public external open class TransformStream : JsAny {
    constructor(transformer: JsAny = definedExternally, writableStrategy: QueuingStrategy = definedExternally, readableStrategy: QueuingStrategy = definedExternally)
    open val readable: ReadableStream
    open val writable: WritableStream
}

public external interface Transformer : JsAny {
    var start: ((TransformStreamDefaultController) -> JsAny?)?
    var transform: ((JsAny?, TransformStreamDefaultController) -> Promise<JsAny?>)?
    var flush: ((TransformStreamDefaultController) -> Promise<JsAny?>)?
    var cancel: ((JsAny?) -> Promise<JsAny?>)?
    var readableType: JsAny?
    var writableType: JsAny?
}

public fun Transformer(start: ((TransformStreamDefaultController) -> JsAny?)? = null, transform: ((JsAny?, TransformStreamDefaultController) -> Promise<JsAny?>)? = null, flush: ((TransformStreamDefaultController) -> Promise<JsAny?>)? = null, cancel: ((JsAny?) -> Promise<JsAny?>)? = null, readableType: JsAny? = null, writableType: JsAny? = null): Transformer = newJsObject<Transformer>().apply {
    if (start != null) this.start = start
    if (transform != null) this.transform = transform
    if (flush != null) this.flush = flush
    if (cancel != null) this.cancel = cancel
    if (readableType != null) this.readableType = readableType
    if (writableType != null) this.writableType = writableType
}

public external abstract class TransformStreamDefaultController : JsAny {
    open val desiredSize: Double?
    open fun enqueue(chunk: JsAny? = definedExternally)
    open fun error(reason: JsAny? = definedExternally)
    open fun terminate()
}

public external interface QueuingStrategy : JsAny {
    var highWaterMark: Double?
    var size: ((JsAny?) -> Double)?
}

public fun QueuingStrategy(highWaterMark: Double? = null, size: ((JsAny?) -> Double)? = null): QueuingStrategy = newJsObject<QueuingStrategy>().apply {
    if (highWaterMark != null) this.highWaterMark = highWaterMark
    if (size != null) this.size = size
}

public external interface QueuingStrategyInit : JsAny {
    var highWaterMark: Double
}

public fun QueuingStrategyInit(highWaterMark: Double): QueuingStrategyInit = newJsObject<QueuingStrategyInit>().apply {
    this.highWaterMark = highWaterMark
}

public external open class ByteLengthQueuingStrategy : JsAny {
    constructor(init: QueuingStrategyInit)
    open val highWaterMark: Double
    open val size: (JsAny?) -> JsAny?
}

public external open class CountQueuingStrategy : JsAny {
    constructor(init: QueuingStrategyInit)
    open val highWaterMark: Double
    open val size: (JsAny?) -> JsAny?
}

public external interface GenericTransformStream : JsAny {
    val readable: ReadableStream
    val writable: WritableStream
}
