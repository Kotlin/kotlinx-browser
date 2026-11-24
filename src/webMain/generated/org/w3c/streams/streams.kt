/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'streams', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.streams

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*

public external interface ReadableStreamReader : JsAny

public external interface ReadableStreamController : JsAny

/**
 * The ReadableStream interface of the Streams API represents a readable stream of byte data. The Fetch API offers a
 * concrete instance of a ReadableStream through the body property of a Response object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream)
 */
public open external class ReadableStream : JsAny {
    /**
     * The ReadableStream() constructor creates and returns a readable stream object from the given handlers.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/ReadableStream)
     */
    public constructor(underlyingSource: JsAny = definedExternally, strategy: QueuingStrategy = definedExternally)

    /**
     * The locked read-only property of the ReadableStream interface returns whether or not the readable stream is
     * locked to a reader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/locked)
     */
    public open val locked: Boolean

    /**
     * The cancel() method of the ReadableStream interface returns a Promise that resolves when the stream is canceled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/cancel)
     */
    public open fun cancel(reason: JsAny? = definedExternally): Promise<JsAny?>

    /**
     * The getReader() method of the ReadableStream interface creates a reader and locks the stream to it. While the
     * stream is locked, no other reader can be acquired until this one is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/getReader)
     */
    public open fun getReader(options: ReadableStreamGetReaderOptions = definedExternally): ReadableStreamReader

    /**
     * The pipeThrough() method of the ReadableStream interface provides a chainable way of piping the current stream
     * through a transform stream or any other writable/readable pair.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeThrough)
     */
    public open fun pipeThrough(transform: ReadableWritablePair, options: StreamPipeOptions = definedExternally): ReadableStream

    /**
     * The pipeTo() method of the ReadableStream interface pipes the current ReadableStream to a given WritableStream
     * and returns a Promise that fulfills when the piping process completes successfully, or rejects if any errors were
     * encountered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/pipeTo)
     */
    public open fun pipeTo(destination: WritableStream, options: StreamPipeOptions = definedExternally): Promise<JsAny?>

    /**
     * The tee() method of the ReadableStream interface tees the current readable stream, returning a two-element array
     * containing the two resulting branches as new ReadableStream instances.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/tee)
     */
    public open fun tee(): JsArray<ReadableStream>
    // not printed yet: async_iterable

    public companion object {
        /**
         * The ReadableStream.from() static method returns a ReadableStream from a provided iterable or async iterable
         * object.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStream/from_static)
         */
        public fun from(asyncIterable: JsAny): ReadableStream
    }
}

public external interface ReadableStreamReaderMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val ReadableStreamReaderMode.Companion.BYOB: ReadableStreamReaderMode get() = "byob".toJsString().unsafeCast<ReadableStreamReaderMode>()

public external interface ReadableStreamGetReaderOptions : JsAny {
    public var mode: ReadableStreamReaderMode?
}

public fun ReadableStreamGetReaderOptions(mode: ReadableStreamReaderMode? = null): ReadableStreamGetReaderOptions = newJsObject<ReadableStreamGetReaderOptions>().apply {
    if (mode != null) this.mode = mode
}

public external interface ReadableStreamIteratorOptions : JsAny {
    public var preventCancel: Boolean?
}

public fun ReadableStreamIteratorOptions(preventCancel: Boolean? = null): ReadableStreamIteratorOptions = newJsObject<ReadableStreamIteratorOptions>().apply {
    if (preventCancel != null) this.preventCancel = preventCancel
}

public external interface ReadableWritablePair : JsAny {
    public var readable: ReadableStream
    public var writable: WritableStream
}

public fun ReadableWritablePair(readable: ReadableStream, writable: WritableStream): ReadableWritablePair = newJsObject<ReadableWritablePair>().apply {
    this.readable = readable
    this.writable = writable
}

public external interface StreamPipeOptions : JsAny {
    public var preventClose: Boolean?
    public var preventAbort: Boolean?
    public var preventCancel: Boolean?
    public var signal: AbortSignal?
}

public fun StreamPipeOptions(preventClose: Boolean? = null, preventAbort: Boolean? = null, preventCancel: Boolean? = null, signal: AbortSignal? = null): StreamPipeOptions = newJsObject<StreamPipeOptions>().apply {
    if (preventClose != null) this.preventClose = preventClose
    if (preventAbort != null) this.preventAbort = preventAbort
    if (preventCancel != null) this.preventCancel = preventCancel
    if (signal != null) this.signal = signal
}

public external interface UnderlyingSource : JsAny {
    public var start: ((ReadableStreamController) -> JsAny?)?
    public var pull: ((ReadableStreamController) -> Promise<JsAny?>)?
    public var cancel: ((JsAny?) -> Promise<JsAny?>)?
    public var type: ReadableStreamType?
    public var autoAllocateChunkSize: Double?
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
    public companion object
}

public inline val ReadableStreamType.Companion.BYTES: ReadableStreamType get() = "bytes".toJsString().unsafeCast<ReadableStreamType>()

public external interface ReadableStreamGenericReader : JsAny {
    /**
     * The closed read-only property of the ReadableStreamDefaultReader interface returns a Promise that fulfills when
     * the stream closes, or rejects if the stream throws an error or the reader's lock is released. This property
     * enables you to write code that responds to an end to the streaming process.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/closed)
     */
    public val closed: Promise<JsAny?>

    /**
     * The cancel() method of the ReadableStreamDefaultReader interface returns a Promise that resolves when the stream
     * is canceled. Calling this method signals a loss of interest in the stream by a consumer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/cancel)
     */
    public fun cancel(reason: JsAny? = definedExternally): Promise<JsAny?>
}

/**
 * The ReadableStreamDefaultReader interface of the Streams API represents a default reader that can be used to read
 * stream data supplied from a network (such as a fetch request).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader)
 */
public open external class ReadableStreamDefaultReader : ReadableStreamGenericReader, ReadableStreamReader {
    /**
     * The ReadableStreamDefaultReader() constructor creates and returns a ReadableStreamDefaultReader object instance.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/ReadableStreamDefaultReader)
     */
    public constructor(stream: ReadableStream)

    /**
     * The read() method of the ReadableStreamDefaultReader interface returns a Promise providing access to the next
     * chunk in the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read)
     */
    public open fun read(): Promise<ReadableStreamReadResult>

    /**
     * The releaseLock() method of the ReadableStreamDefaultReader interface releases the reader's lock on the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/releaseLock)
     */
    public open fun releaseLock()

    /**
     * The closed read-only property of the ReadableStreamDefaultReader interface returns a Promise that fulfills when
     * the stream closes, or rejects if the stream throws an error or the reader's lock is released. This property
     * enables you to write code that responds to an end to the streaming process.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/closed)
     */
    override val closed: Promise<JsAny?>

    /**
     * The cancel() method of the ReadableStreamDefaultReader interface returns a Promise that resolves when the stream
     * is canceled. Calling this method signals a loss of interest in the stream by a consumer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/cancel)
     */
    override fun cancel(reason: JsAny?): Promise<JsAny?>
}

public external interface ReadableStreamReadResult : JsAny {
    public var value: JsAny?
    public var done: Boolean?
}

public fun ReadableStreamReadResult(value: JsAny? = null, done: Boolean? = null): ReadableStreamReadResult = newJsObject<ReadableStreamReadResult>().apply {
    if (value != null) this.value = value
    if (done != null) this.done = done
}

/**
 * The ReadableStreamBYOBReader interface of the Streams API defines a reader for a ReadableStream that supports
 * zero-copy reading from an underlying byte source. It is used for efficient copying from underlying sources where the
 * data is delivered as an "anonymous" sequence of bytes, such as files.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader)
 */
public open external class ReadableStreamBYOBReader : ReadableStreamGenericReader, ReadableStreamReader {
    /**
     * The ReadableStreamBYOBReader() constructor creates and returns a ReadableStreamBYOBReader object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/ReadableStreamBYOBReader)
     */
    public constructor(stream: ReadableStream)

    /**
     * The read() method of the ReadableStreamBYOBReader interface is used to read data into a view on a user-supplied
     * buffer from an associated readable byte stream. A request for data will be satisfied from the stream's internal
     * queues if there is any data present. If the stream queues are empty, the request may be supplied as a zero-copy
     * transfer from the underlying byte source.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/read)
     */
    public open fun read(view: ArrayBufferView, options: ReadableStreamBYOBReaderReadOptions = definedExternally): Promise<ReadableStreamReadResult>

    /**
     * The releaseLock() method of the ReadableStreamBYOBReader interface releases the reader's lock on the stream.
     * After the lock is released, the reader is no longer active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/releaseLock)
     */
    public open fun releaseLock()

    /**
     * The closed read-only property of the ReadableStreamBYOBReader interface returns a Promise that fulfills when the
     * stream closes, or rejects if the stream throws an error or the reader's lock is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/closed)
     */
    override val closed: Promise<JsAny?>

    /**
     * The cancel() method of the ReadableStreamBYOBReader interface returns a Promise that resolves when the stream is
     * canceled. Calling this method signals a loss of interest in the stream by a consumer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBReader/cancel)
     */
    override fun cancel(reason: JsAny?): Promise<JsAny?>
}

public external interface ReadableStreamBYOBReaderReadOptions : JsAny {
    public var min: Double?
}

public fun ReadableStreamBYOBReaderReadOptions(min: Double? = null): ReadableStreamBYOBReaderReadOptions = newJsObject<ReadableStreamBYOBReaderReadOptions>().apply {
    if (min != null) this.min = min
}

/**
 * The ReadableStreamDefaultController interface of the Streams API represents a controller allowing control of a
 * ReadableStream's state and internal queue. Default controllers are for streams that are not byte streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController)
 */
public abstract external class ReadableStreamDefaultController : ReadableStreamController {
    /**
     * The desiredSize read-only property of the ReadableStreamDefaultController interface returns the desired size
     * required to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/desiredSize)
     */
    public open val desiredSize: Double?

    /**
     * The close() method of the ReadableStreamDefaultController interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/close)
     */
    public open fun close()

    /**
     * The enqueue() method of the ReadableStreamDefaultController interface enqueues a given chunk in the associated
     * stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/enqueue)
     */
    public open fun enqueue(chunk: JsAny? = definedExternally)

    /**
     * The error() method of the ReadableStreamDefaultController interface causes any future interactions with the
     * associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultController/error)
     */
    public open fun error(e: JsAny? = definedExternally)
}

/**
 * The ReadableByteStreamController interface of the Streams API represents a controller for a readable byte stream. It
 * allows control of the state and internal queue of a ReadableStream with an underlying byte source, and enables
 * efficient zero-copy transfer of data from the underlying source to a consumer when the stream's internal queue is
 * empty.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController)
 */
public abstract external class ReadableByteStreamController : ReadableStreamController {
    /**
     * The byobRequest read-only property of the ReadableByteStreamController interface returns the current BYOB
     * request, or null if there are no pending requests.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/byobRequest)
     */
    public open val byobRequest: ReadableStreamBYOBRequest?

    /**
     * The desiredSize read-only property of the ReadableByteStreamController interface returns the number of bytes
     * required to fill the stream's internal queue to its "desired size".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/desiredSize)
     */
    public open val desiredSize: Double?

    /**
     * The close() method of the ReadableByteStreamController interface closes the associated stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/close)
     */
    public open fun close()

    /**
     * The enqueue() method of the ReadableByteStreamController interface enqueues a given chunk on the associated
     * readable byte stream (the chunk is transferred into the stream's internal queues).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/enqueue)
     */
    public open fun enqueue(chunk: ArrayBufferView)

    /**
     * The error() method of the ReadableByteStreamController interface causes any future interactions with the
     * associated stream to error with the specified reason.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableByteStreamController/error)
     */
    public open fun error(e: JsAny? = definedExternally)
}

/**
 * The ReadableStreamBYOBRequest interface of the Streams API represents a "pull request" for data from an underlying
 * source that will be made as a zero-copy transfer to a consumer (bypassing the stream's internal queues).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest)
 */
public abstract external class ReadableStreamBYOBRequest : JsAny {
    /**
     * The view getter property of the ReadableStreamBYOBRequest interface returns the current view.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/view)
     */
    public open val view: Uint8Array?

    /**
     * The respond() method of the ReadableStreamBYOBRequest interface is used to signal to the associated readable byte
     * stream that the specified number of bytes were written into the ReadableStreamBYOBRequest.view.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/respond)
     */
    public open fun respond(bytesWritten: Double)

    /**
     * The respondWithNewView() method of the ReadableStreamBYOBRequest interface specifies a new view that the consumer
     * of the associated readable byte stream should write to instead of ReadableStreamBYOBRequest.view.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamBYOBRequest/respondWithNewView)
     */
    public open fun respondWithNewView(view: ArrayBufferView)
}

/**
 * The WritableStream interface of the Streams API provides a standard abstraction for writing streaming data to a
 * destination, known as a sink. This object comes with built-in backpressure and queuing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream)
 */
public open external class WritableStream : JsAny {
    /**
     * The WritableStream() constructor creates a new WritableStream object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/WritableStream)
     */
    public constructor(underlyingSink: JsAny = definedExternally, strategy: QueuingStrategy = definedExternally)

    /**
     * The locked read-only property of the WritableStream interface returns a boolean indicating whether the
     * WritableStream is locked to a writer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/locked)
     */
    public open val locked: Boolean

    /**
     * The abort() method of the WritableStream interface aborts the stream, signaling that the producer can no longer
     * successfully write to the stream and it is to be immediately moved to an error state, with any queued writes
     * discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/abort)
     */
    public open fun abort(reason: JsAny? = definedExternally): Promise<JsAny?>

    /**
     * The close() method of the WritableStream interface closes the associated stream. All chunks written before this
     * method is called are sent before the returned promise is fulfilled.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/close)
     */
    public open fun close(): Promise<JsAny?>

    /**
     * The getWriter() method of the WritableStream interface returns a new instance of WritableStreamDefaultWriter and
     * locks the stream to that instance. While the stream is locked, no other writer can be acquired until this one is
     * released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStream/getWriter)
     */
    public open fun getWriter(): WritableStreamDefaultWriter
}

public external interface UnderlyingSink : JsAny {
    public var start: ((WritableStreamDefaultController) -> JsAny?)?
    public var write: ((JsAny?, WritableStreamDefaultController) -> Promise<JsAny?>)?
    public var close: (() -> Promise<JsAny?>)?
    public var abort: ((JsAny?) -> Promise<JsAny?>)?
    public var type: JsAny?
}

public fun UnderlyingSink(start: ((WritableStreamDefaultController) -> JsAny?)? = null, write: ((JsAny?, WritableStreamDefaultController) -> Promise<JsAny?>)? = null, close: (() -> Promise<JsAny?>)? = null, abort: ((JsAny?) -> Promise<JsAny?>)? = null, type: JsAny? = null): UnderlyingSink = newJsObject<UnderlyingSink>().apply {
    if (start != null) this.start = start
    if (write != null) this.write = write
    if (close != null) this.close = close
    if (abort != null) this.abort = abort
    if (type != null) this.type = type
}

/**
 * The WritableStreamDefaultWriter interface of the Streams API is the object returned by WritableStream.getWriter() and
 * once created locks the writer to the WritableStream ensuring that no other streams can write to the underlying sink.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter)
 */
public open external class WritableStreamDefaultWriter : JsAny {
    /**
     * The WritableStreamDefaultWriter() constructor creates a new WritableStreamDefaultWriter object instance.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/WritableStreamDefaultWriter)
     */
    public constructor(stream: WritableStream)

    /**
     * The closed read-only property of the WritableStreamDefaultWriter interface returns a Promise that fulfills if the
     * stream becomes closed, or rejects if the stream errors or the writer's lock is released.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/closed)
     */
    public open val closed: Promise<JsAny?>

    /**
     * The desiredSize read-only property of the WritableStreamDefaultWriter interface returns the desired size required
     * to fill the stream's internal queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/desiredSize)
     */
    public open val desiredSize: Double?

    /**
     * The ready read-only property of the WritableStreamDefaultWriter interface returns a Promise that resolves when
     * the desired size of the stream's internal queue transitions from non-positive to positive, signaling that it is
     * no longer applying backpressure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/ready)
     */
    public open val ready: Promise<JsAny?>

    /**
     * The abort() method of the WritableStreamDefaultWriter interface aborts the stream, signaling that the producer
     * can no longer successfully write to the stream and it is to be immediately moved to an error state, with any
     * queued writes discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/abort)
     */
    public open fun abort(reason: JsAny? = definedExternally): Promise<JsAny?>

    /**
     * The close() method of the WritableStreamDefaultWriter interface closes the associated writable stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/close)
     */
    public open fun close(): Promise<JsAny?>

    /**
     * The releaseLock() method of the WritableStreamDefaultWriter interface releases the writer's lock on the
     * corresponding stream. After the lock is released, the writer is no longer active. If the associated stream is
     * errored when the lock is released, the writer will appear errored in the same way from now on; otherwise, the
     * writer will appear closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/releaseLock)
     */
    public open fun releaseLock()

    /**
     * The write() method of the WritableStreamDefaultWriter interface writes a passed chunk of data to a WritableStream
     * and its underlying sink, then returns a Promise that resolves to indicate the success or failure of the write
     * operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultWriter/write)
     */
    public open fun write(chunk: JsAny? = definedExternally): Promise<JsAny?>
}

/**
 * The WritableStreamDefaultController interface of the Streams API represents a controller allowing control of a
 * WritableStream's state. When constructing a WritableStream, the underlying sink is given a corresponding
 * WritableStreamDefaultController instance to manipulate.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController)
 */
public abstract external class WritableStreamDefaultController : JsAny {
    /**
     * The read-only signal property of the WritableStreamDefaultController interface returns the AbortSignal associated
     * with the controller.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/signal)
     */
    public open val signal: AbortSignal

    /**
     * The error() method of the WritableStreamDefaultController interface causes any future interactions with the
     * associated stream to error.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WritableStreamDefaultController/error)
     */
    public open fun error(e: JsAny? = definedExternally)
}

/**
 * The TransformStream interface of the Streams API represents a concrete implementation of the pipe chain transform
 * stream concept.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream)
 */
public open external class TransformStream : JsAny {
    /**
     * The TransformStream() constructor creates a new TransformStream object which represents a pair of streams: a
     * WritableStream representing the writable side, and a ReadableStream representing the readable side.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/TransformStream)
     */
    public constructor(transformer: JsAny = definedExternally, writableStrategy: QueuingStrategy = definedExternally, readableStrategy: QueuingStrategy = definedExternally)

    /**
     * The readable read-only property of the TransformStream interface returns the ReadableStream instance controlled
     * by this TransformStream. This stream emits the transformed output data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/readable)
     */
    public open val readable: ReadableStream

    /**
     * The writable read-only property of the TransformStream interface returns the WritableStream instance controlled
     * by this TransformStream. This stream accepts input data that will be transformed and emitted to the readable
     * stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStream/writable)
     */
    public open val writable: WritableStream
}

public external interface Transformer : JsAny {
    public var start: ((TransformStreamDefaultController) -> JsAny?)?
    public var transform: ((JsAny?, TransformStreamDefaultController) -> Promise<JsAny?>)?
    public var flush: ((TransformStreamDefaultController) -> Promise<JsAny?>)?
    public var cancel: ((JsAny?) -> Promise<JsAny?>)?
    public var readableType: JsAny?
    public var writableType: JsAny?
}

public fun Transformer(start: ((TransformStreamDefaultController) -> JsAny?)? = null, transform: ((JsAny?, TransformStreamDefaultController) -> Promise<JsAny?>)? = null, flush: ((TransformStreamDefaultController) -> Promise<JsAny?>)? = null, cancel: ((JsAny?) -> Promise<JsAny?>)? = null, readableType: JsAny? = null, writableType: JsAny? = null): Transformer = newJsObject<Transformer>().apply {
    if (start != null) this.start = start
    if (transform != null) this.transform = transform
    if (flush != null) this.flush = flush
    if (cancel != null) this.cancel = cancel
    if (readableType != null) this.readableType = readableType
    if (writableType != null) this.writableType = writableType
}

/**
 * The TransformStreamDefaultController interface of the Streams API provides methods to manipulate the associated
 * ReadableStream and WritableStream.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController)
 */
public abstract external class TransformStreamDefaultController : JsAny {
    /**
     * The desiredSize read-only property of the TransformStreamDefaultController interface returns the desired size to
     * fill the queue of the associated ReadableStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/desiredSize)
     */
    public open val desiredSize: Double?

    /**
     * The enqueue() method of the TransformStreamDefaultController interface enqueues the given chunk in the readable
     * side of the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/enqueue)
     */
    public open fun enqueue(chunk: JsAny? = definedExternally)

    /**
     * The error() method of the TransformStreamDefaultController interface errors both sides of the stream. Any further
     * interactions with it will fail with the given error message, and any chunks in the queue will be discarded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/error)
     */
    public open fun error(reason: JsAny? = definedExternally)

    /**
     * The terminate() method of the TransformStreamDefaultController interface closes the readable side and errors the
     * writable side of the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/terminate)
     */
    public open fun terminate()
}

public external interface QueuingStrategy : JsAny {
    public var highWaterMark: Double?
    public var size: ((JsAny?) -> Double)?
}

public fun QueuingStrategy(highWaterMark: Double? = null, size: ((JsAny?) -> Double)? = null): QueuingStrategy = newJsObject<QueuingStrategy>().apply {
    if (highWaterMark != null) this.highWaterMark = highWaterMark
    if (size != null) this.size = size
}

public external interface QueuingStrategyInit : JsAny {
    public var highWaterMark: Double
}

public fun QueuingStrategyInit(highWaterMark: Double): QueuingStrategyInit = newJsObject<QueuingStrategyInit>().apply {
    this.highWaterMark = highWaterMark
}

/**
 * The ByteLengthQueuingStrategy interface of the Streams API provides a built-in byte length queuing strategy that can
 * be used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy)
 */
public open external class ByteLengthQueuingStrategy : JsAny {
    /**
     * The ByteLengthQueuingStrategy() constructor creates and returns a ByteLengthQueuingStrategy object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/ByteLengthQueuingStrategy)
     */
    public constructor(init: QueuingStrategyInit)

    /**
     * The read-only ByteLengthQueuingStrategy.highWaterMark property returns the total number of bytes that can be
     * contained in the internal queue before backpressure is applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/highWaterMark)
     */
    public open val highWaterMark: Double

    /**
     * The size() method of the ByteLengthQueuingStrategy interface returns the given chunk's byteLength property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ByteLengthQueuingStrategy/size)
     */
    public open val size: (JsAny?) -> JsAny?
}

/**
 * The CountQueuingStrategy interface of the Streams API provides a built-in chunk counting queuing strategy that can be
 * used when constructing streams.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy)
 */
public open external class CountQueuingStrategy : JsAny {
    /**
     * The CountQueuingStrategy() constructor creates and returns a CountQueuingStrategy object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/CountQueuingStrategy)
     */
    public constructor(init: QueuingStrategyInit)

    /**
     * The read-only CountQueuingStrategy.highWaterMark property returns the total number of chunks that can be
     * contained in the internal queue before backpressure is applied.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/highWaterMark)
     */
    public open val highWaterMark: Double

    /**
     * The size() method of the CountQueuingStrategy interface always returns 1, so that the total queue size is a count
     * of the number of chunks in the queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CountQueuingStrategy/size)
     */
    public open val size: (JsAny?) -> JsAny?
}

public external interface GenericTransformStream : JsAny {
    public val readable: ReadableStream
    public val writable: WritableStream
}
