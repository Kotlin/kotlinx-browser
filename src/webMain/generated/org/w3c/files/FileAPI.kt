/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'FileAPI', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.files

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*
import org.w3c.streams.*
import org.w3c.xhr.*

/**
 * The Blob interface represents a blob, which is a file-like object of immutable, raw data; they can be read as text or
 * binary data, or converted into a ReadableStream so its methods can be used for processing the data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class Blob : ImageBitmapSource, UnionBlobOrMediaSource {
    /**
     * The Blob() constructor returns a new Blob object. The content of the blob consists of the concatenation of the
     * values given in the parameter blobParts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/Blob)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(blobParts: JsArray<JsAny> = definedExternally, options: BlobPropertyBag = definedExternally)

    /**
     * The size read-only property of the Blob interface returns the size of the Blob or File in bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/size)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val size: Double

    /**
     * The type read-only property of the Blob interface returns the MIME type of the file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val type: String

    /**
     * The slice() method of the Blob interface creates and returns a new Blob object which contains data from a subset
     * of the blob on which it's called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/slice)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun slice(start: Double = definedExternally, end: Double = definedExternally, contentType: String = definedExternally): Blob

    /**
     * The stream() method of the Blob interface returns a ReadableStream which upon reading returns the data contained
     * within the Blob as chunks of raw bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/stream)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun stream(): ReadableStream

    /**
     * The text() method of the Blob interface returns a Promise that resolves with a string containing the contents of
     * the blob, interpreted as UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/text)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun text(): Promise<JsString>

    /**
     * The arrayBuffer() method of the Blob interface returns a Promise that resolves with the contents of the blob as
     * binary data contained in an ArrayBuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/arrayBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun arrayBuffer(): Promise<ArrayBuffer>

    /**
     * The textStream() method of the Blob interface returns a ReadableStream that can be used to read the contents of
     * the Blob in chunks of UTF-8.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/textStream)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun textStream(): ReadableStream

    /**
     * The bytes() method of the Blob interface returns a Promise that resolves with a Uint8Array containing the
     * contents of the blob as an array of bytes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Blob/bytes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun bytes(): Promise<Uint8Array>
}

public external interface EndingType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val EndingType.Companion.TRANSPARENT: EndingType get() = "transparent".toJsString().unsafeCast<EndingType>()
public inline val EndingType.Companion.NATIVE: EndingType get() = "native".toJsString().unsafeCast<EndingType>()

public external interface BlobPropertyBag : JsAny {
    public var type: String?
    public var endings: EndingType?
}

public fun BlobPropertyBag(type: String? = null, endings: EndingType? = null): BlobPropertyBag {
    val dictionary = newJsObject<BlobPropertyBag>()
    if (type != null) dictionary.type = type
    if (endings != null) dictionary.endings = endings
    return dictionary
}

/**
 * The File interface provides information about files and allows JavaScript in a web page to access their content.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class File : Blob {
    /**
     * The File() constructor creates a new File object instance.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/File)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(fileBits: JsArray<JsAny>, fileName: String, options: FilePropertyBag = definedExternally)

    /**
     * The name read-only property of the File interface returns the name of the file represented by a File object. For
     * security reasons, the path is excluded from this property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val name: String

    /**
     * The lastModified read-only property of the File interface provides the last modified date of the file as the
     * number of milliseconds since the Unix epoch (January 1, 1970 at midnight). Files without a known last modified
     * date return the current date.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/File/lastModified)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val lastModified: Double
}

public external interface FilePropertyBag : BlobPropertyBag {
    public var lastModified: Double?
}

public fun FilePropertyBag(type: String? = null, endings: EndingType? = null, lastModified: Double? = null): FilePropertyBag {
    val dictionary = newJsObject<FilePropertyBag>()
    if (type != null) dictionary.type = type
    if (endings != null) dictionary.endings = endings
    if (lastModified != null) dictionary.lastModified = lastModified
    return dictionary
}

/**
 * The FileList interface represents an object of this type returned by the files property of the HTML &lt;input&gt;
 * element; this lets you access the list of files selected with the &lt;input type="file"&gt; element. It's also used
 * for a list of files dropped into web content when using the drag and drop API; see the DataTransfer object for
 * details on this usage.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class FileList : ItemArrayLike<File> {
    /**
     * The item() method of the FileList interface returns a File object representing the file at the specified index in
     * the file list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/item)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override fun item(index: Int): File?

    /**
     * The length read-only property of the FileList interface returns the number of files in the FileList.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileList/length)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    override val length: Int
}

public operator fun FileList.get(index: Int): File? = getProperty(this, index)

/**
 * The FileReader interface lets web applications asynchronously read the contents of files (or raw data buffers) stored
 * on the user's computer, using File or Blob objects to specify the file or data to read.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class FileReader : EventTarget {
    /**
     * The FileReader() constructor creates a new FileReader.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/FileReader)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The readAsArrayBuffer() method of the FileReader interface is used to start reading the contents of a specified
     * Blob or File. When the read operation is finished, the readyState property becomes DONE, and the loadend event is
     * triggered. At that time, the result property contains an ArrayBuffer representing the file's data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsArrayBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsArrayBuffer(blob: Blob)

    /**
     * The readAsBinaryString() method of the FileReader interface is used to start reading the contents of the
     * specified Blob or File. When the read operation is finished, the readyState property becomes DONE, and the
     * loadend event is triggered. At that time, the result property contains the raw binary data from the file.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsBinaryString)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsBinaryString(blob: Blob)

    /**
     * The readAsText() method of the FileReader interface is used to read the contents of the specified Blob or File.
     * When the read operation is complete, the readyState property is changed to DONE, the loadend event is triggered,
     * and the result property contains the contents of the file as a text string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsText(blob: Blob, encoding: String = definedExternally)

    /**
     * The readAsDataURL() method of the FileReader interface is used to read the contents of the specified Blob or
     * File. When the read operation is finished, the readyState property becomes DONE, and the loadend event is
     * triggered. At that time, the result attribute contains the data as a data: URL representing the file's data as a
     * base64 encoded string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readAsDataURL)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsDataURL(blob: Blob)

    /**
     * The abort() method of the FileReader interface aborts the read operation. Upon return, the readyState will be
     * DONE.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun abort()

    /**
     * The readyState read-only property of the FileReader interface provides the current state of the reading
     * operation. This will be one of the states: EMPTY, LOADING, or DONE.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/readyState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val readyState: Short

    /**
     * The result read-only property of the FileReader interface returns the file's contents. This property is only
     * valid after the read operation is complete, and the format of the data depends on which of the methods was used
     * to initiate the read operation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/result)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val result: JsAny?

    /**
     * The error read-only property of the FileReader interface returns the error that occurred while reading the file.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val error: DOMException?

    /**
     * The loadstart event of the FileReader interface is fired when a file read operation has begun.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadstart_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onloadstart: ((ProgressEvent) -> Unit)?

    /**
     * The progress event of the FileReader interface is fired periodically as the FileReader reads data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/progress_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onprogress: ((ProgressEvent) -> Unit)?

    /**
     * The load event of the FileReader interface is fired when a file has been read successfully.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/load_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onload: ((ProgressEvent) -> Unit)?

    /**
     * The abort event of the FileReader interface is fired when a read has been aborted: for instance because the
     * program called FileReader.abort().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/abort_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onabort: ((ProgressEvent) -> Unit)?

    /**
     * The error event of the FileReader interface is fired when the read failed due to an error (for example, because
     * the file was not found or not readable).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/error_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onerror: ((ProgressEvent) -> Unit)?

    /**
     * The loadend event of the FileReader interface is fired when a file read has completed, successfully or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReader/loadend_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onloadend: ((ProgressEvent) -> Unit)?

    public companion object {
        public val EMPTY: Short
        public val LOADING: Short
        public val DONE: Short
    }
}

/**
 * The FileReaderSync interface allows you to read File or Blob objects synchronously. This interface is only available
 * in workers as it enables synchronous I/O that could potentially block.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class FileReaderSync : JsAny {
    /**
     * The FileReaderSync() constructor creates a new FileReaderSync.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/FileReaderSync)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor()

    /**
     * The readAsArrayBuffer() method of the FileReaderSync interface allows you to read File or Blob objects in a
     * synchronous way into an ArrayBuffer. This interface is only available in workers as it enables synchronous I/O
     * that could potentially block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsArrayBuffer)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsArrayBuffer(blob: Blob): ArrayBuffer

    /**
     * The readAsBinaryString() method of the FileReaderSync interface allows you to read File or Blob objects in a
     * synchronous way into a string. This interface is only available in workers as it enables synchronous I/O that
     * could potentially block.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsBinaryString)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsBinaryString(blob: Blob): String

    /**
     * The readAsText() method of the FileReaderSync interface allows you to read File or Blob objects in a synchronous
     * way into a string. This interface is only available in workers as it enables synchronous I/O that could
     * potentially block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsText)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsText(blob: Blob, encoding: String = definedExternally): String

    /**
     * The readAsDataURL() method of the FileReaderSync interface allows you to read File or Blob objects in a
     * synchronous way into a string representing a data URL. This interface is only available in workers as it enables
     * synchronous I/O that could potentially block.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FileReaderSync/readAsDataURL)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun readAsDataURL(blob: Blob): String
}
