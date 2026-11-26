/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'encoding', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.encoding

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.streams.*

public external interface TextDecoderCommon : JsAny {
    /**
     * The TextDecoder.encoding read-only property returns a string containing the name of the character encoding that
     * this decoder will use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/encoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val encoding: String

    /**
     * The fatal read-only property of the TextDecoder interface is a Boolean indicating whether the error mode is
     * fatal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/fatal)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val fatal: Boolean

    /**
     * The ignoreBOM read-only property of the TextDecoder interface is a Boolean indicating whether the byte order mark
     * will be included in the output or skipped over. The value of the property is set in the ignoreBOM argument to the
     * decoder's constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/ignoreBOM)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val ignoreBOM: Boolean
}

public external interface TextDecoderOptions : JsAny {
    public var fatal: Boolean?
    public var ignoreBOM: Boolean?
}

public fun TextDecoderOptions(fatal: Boolean? = null, ignoreBOM: Boolean? = null): TextDecoderOptions {
    val dictionary = newJsObject<TextDecoderOptions>()
    if (fatal != null) dictionary.fatal = fatal
    if (ignoreBOM != null) dictionary.ignoreBOM = ignoreBOM
    return dictionary
}

public external interface TextDecodeOptions : JsAny {
    public var stream: Boolean?
}

public fun TextDecodeOptions(stream: Boolean? = null): TextDecodeOptions {
    val dictionary = newJsObject<TextDecodeOptions>()
    if (stream != null) dictionary.stream = stream
    return dictionary
}

/**
 * The TextDecoder interface represents a decoder for a specific text encoding, such as UTF-8, ISO-8859-2, or GBK. A
 * decoder takes an array of bytes as input and returns a JavaScript string.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class TextDecoder : TextDecoderCommon {
    /**
     * The TextDecoder() constructor returns a new TextDecoder object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/TextDecoder)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(label: String = definedExternally, options: TextDecoderOptions = definedExternally)

    /**
     * The TextDecoder.decode() method returns a string containing text decoded from the buffer passed as a parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/decode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun decode(input: BufferDataSource = definedExternally, options: TextDecodeOptions = definedExternally): String

    /**
     * The TextDecoder.encoding read-only property returns a string containing the name of the character encoding that
     * this decoder will use.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/encoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val encoding: String

    /**
     * The fatal read-only property of the TextDecoder interface is a Boolean indicating whether the error mode is
     * fatal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/fatal)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val fatal: Boolean

    /**
     * The ignoreBOM read-only property of the TextDecoder interface is a Boolean indicating whether the byte order mark
     * will be included in the output or skipped over. The value of the property is set in the ignoreBOM argument to the
     * decoder's constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoder/ignoreBOM)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val ignoreBOM: Boolean
}

public external interface TextEncoderCommon : JsAny {
    /**
     * The TextEncoder.encoding read-only property returns a string containing the name of the encoding algorithm used
     * by the specific encoder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public val encoding: String
}

public external interface TextEncoderEncodeIntoResult : JsAny {
    public var read: Double?
    public var written: Double?
}

public fun TextEncoderEncodeIntoResult(read: Double? = null, written: Double? = null): TextEncoderEncodeIntoResult {
    val dictionary = newJsObject<TextEncoderEncodeIntoResult>()
    if (read != null) dictionary.read = read
    if (written != null) dictionary.written = written
    return dictionary
}

/**
 * The TextEncoder interface enables you to encode a JavaScript string using UTF-8.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class TextEncoder : TextEncoderCommon {
    /**
     * The TextEncoder() constructor returns a newly created TextEncoder object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/TextEncoder)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The TextEncoder.encode() method takes a string as input, and returns a Uint8Array containing the string encoded
     * using UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun encode(input: String = definedExternally): Uint8Array

    /**
     * The TextEncoder.encodeInto() method takes a string to encode and a destination Uint8Array to put resulting UTF-8
     * encoded text into, and returns an object indicating the progress of the encoding. This is potentially more
     * performant than the encode() method — especially when the target buffer is a view into a Wasm heap.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encodeInto)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun encodeInto(source: String, destination: Uint8Array): TextEncoderEncodeIntoResult

    /**
     * The TextEncoder.encoding read-only property returns a string containing the name of the encoding algorithm used
     * by the specific encoder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoder/encoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val encoding: String
}

/**
 * The TextDecoderStream interface of the Encoding API converts a stream of text in a binary encoding, such as UTF-8
 * etc., to a stream of strings. It is the streaming equivalent of TextDecoder. It implements the same shape as a
 * TransformStream, allowing it to be used in ReadableStream.pipeThrough() and similar methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class TextDecoderStream : TextDecoderCommon, GenericTransformStream {
    /**
     * The TextDecoderStream() constructor creates a new TextDecoderStream object which is used to convert a stream of
     * text in a binary encoding into strings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream/TextDecoderStream)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(label: String = definedExternally, options: TextDecoderOptions = definedExternally)

    /**
     * The encoding read-only property of the TextDecoderStream interface returns a string containing the name of the
     * encoding algorithm used by the specific decoder.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream/encoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val encoding: String

    /**
     * The fatal read-only property of the TextDecoderStream interface is a Boolean indicating if the error mode of the
     * TextDecoderStream object is set to fatal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream/fatal)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val fatal: Boolean

    /**
     * The ignoreBOM read-only property of the TextDecoderStream interface is a Boolean indicating whether the byte
     * order mark will be included in the output or skipped over.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream/ignoreBOM)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val ignoreBOM: Boolean

    /**
     * The readable read-only property of the TextDecoderStream interface returns a ReadableStream that emits decoded
     * strings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream/readable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val readable: ReadableStream

    /**
     * The writable read-only property of the TextDecoderStream interface returns a WritableStream that accepts binary
     * data, in the form of ArrayBuffer, TypedArray, or DataView chunks (SharedArrayBuffer and its views are also
     * allowed), to be decoded into strings.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextDecoderStream/writable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val writable: WritableStream
}

/**
 * The TextEncoderStream interface of the Encoding API converts a stream of strings into bytes in the UTF-8 encoding. It
 * is the streaming equivalent of TextEncoder. It implements the same shape as a TransformStream, allowing it to be used
 * in ReadableStream.pipeThrough() and similar methods.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class TextEncoderStream : TextEncoderCommon, GenericTransformStream {
    /**
     * The TextEncoderStream() constructor creates a new TextEncoderStream object which is used to convert a stream of
     * strings into bytes using UTF-8 encoding.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream/TextEncoderStream)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The encoding read-only property of the TextEncoderStream interface returns a string containing the name of the
     * encoding algorithm used by the current TextEncoderStream object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream/encoding)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val encoding: String

    /**
     * The readable read-only property of the TextEncoderStream interface returns a ReadableStream that emits encoded
     * binary data as Uint8Array chunks.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream/readable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val readable: ReadableStream

    /**
     * The writable read-only property of the TextEncoderStream interface returns a WritableStream that accepts strings
     * to be encoded into binary data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEncoderStream/writable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val writable: WritableStream
}
