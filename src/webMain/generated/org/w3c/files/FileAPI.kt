/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'FileAPI', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.files

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*
import org.w3c.streams.*
import org.w3c.xhr.*

public external open class Blob : ImageBitmapSource, UnionBlobOrMediaSource {
    constructor(blobParts: JsArray<JsAny> = definedExternally, options: BlobPropertyBag = definedExternally)
    open val size: Double
    open val type: String
    open fun slice(start: Double = definedExternally, end: Double = definedExternally, contentType: String = definedExternally): Blob
    open fun stream(): ReadableStream
    open fun text(): Promise<JsString>
    open fun arrayBuffer(): Promise<ArrayBuffer>
    open fun textStream(): ReadableStream
    open fun bytes(): Promise<Uint8Array>
}

public external interface EndingType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val EndingType.Companion.TRANSPARENT: EndingType get() = "transparent".toJsString().unsafeCast<EndingType>()
public inline val EndingType.Companion.NATIVE: EndingType get() = "native".toJsString().unsafeCast<EndingType>()

public external interface BlobPropertyBag : JsAny {
    var type: String?
    var endings: EndingType?
}

public fun BlobPropertyBag(type: String? = null, endings: EndingType? = null): BlobPropertyBag = newJsObject<BlobPropertyBag>().apply {
    if (type != null) this.type = type
    if (endings != null) this.endings = endings
}

public external open class File : Blob {
    constructor(fileBits: JsArray<JsAny>, fileName: String, options: FilePropertyBag = definedExternally)
    open val name: String
    open val lastModified: Double
}

public external interface FilePropertyBag : BlobPropertyBag {
    var lastModified: Double?
}

public fun FilePropertyBag(type: String? = null, endings: EndingType? = null, lastModified: Double? = null): FilePropertyBag = newJsObject<FilePropertyBag>().apply {
    if (type != null) this.type = type
    if (endings != null) this.endings = endings
    if (lastModified != null) this.lastModified = lastModified
}

public external abstract class FileList : ItemArrayLike<File> {
    override fun item(index: Int): File?
    override val length: Int
}

public operator fun FileList.get(index: Int): File? = getProperty(this, index)

public external open class FileReader : EventTarget {
    constructor()
    open fun readAsArrayBuffer(blob: Blob)
    open fun readAsBinaryString(blob: Blob)
    open fun readAsText(blob: Blob, encoding: String = definedExternally)
    open fun readAsDataURL(blob: Blob)
    open fun abort()
    open val readyState: Short
    open val result: JsAny?
    open val error: DOMException?
    open var onloadstart: ((ProgressEvent) -> Unit)?
    open var onprogress: ((ProgressEvent) -> Unit)?
    open var onload: ((ProgressEvent) -> Unit)?
    open var onabort: ((ProgressEvent) -> Unit)?
    open var onerror: ((ProgressEvent) -> Unit)?
    open var onloadend: ((ProgressEvent) -> Unit)?

    companion object {
        val EMPTY: Short
        val LOADING: Short
        val DONE: Short
    }
}

public external open class FileReaderSync : JsAny {
    constructor()
    open fun readAsArrayBuffer(blob: Blob): ArrayBuffer
    open fun readAsBinaryString(blob: Blob): String
    open fun readAsText(blob: Blob, encoding: String = definedExternally): String
    open fun readAsDataURL(blob: Blob): String
}
