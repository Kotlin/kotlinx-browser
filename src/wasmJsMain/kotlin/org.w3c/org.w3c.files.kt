/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.files

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.undefined
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Blob](https://developer.mozilla.org/en/docs/Web/API/Blob) to Kotlin
 */
public actual external open class Blob actual constructor(blobParts: JsArray<JsAny? /* BufferSource|Blob|String */>, options: BlobPropertyBag) : MediaProvider, ImageBitmapSource, JsAny {
    actual open val size: JsNumber
    actual open val type: String
    actual open val isClosed: Boolean
    actual fun slice(start: Int, end: Int, contentType: String): Blob
    actual fun close()
}

public actual external interface BlobPropertyBag : JsAny {
    actual var type: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun BlobPropertyBag(type: String?): BlobPropertyBag = js("({ type: type })")

/**
 * Exposes the JavaScript [File](https://developer.mozilla.org/en/docs/Web/API/File) to Kotlin
 */
public actual external open class File actual constructor(fileBits: JsArray<JsAny? /* BufferSource|Blob|String */>, fileName: String, options: FilePropertyBag) : Blob, JsAny {
    actual open val name: String
    actual open val lastModified: Int
}

public actual external interface FilePropertyBag : BlobPropertyBag, JsAny {
    actual var lastModified: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("UNUSED_PARAMETER")
public actual fun FilePropertyBag(lastModified: Int?, type: String?): FilePropertyBag = js("({ lastModified: lastModified, type: type })")

/**
 * Exposes the JavaScript [FileList](https://developer.mozilla.org/en/docs/Web/API/FileList) to Kotlin
 */
public actual external abstract class FileList : ItemArrayLike<File>, JsAny {
    actual override fun item(index: Int): File?
}

@Suppress("UNUSED_PARAMETER")
internal fun getMethodImplForFileList(obj: FileList, index: Int): File? = js("obj[index]")

public actual operator fun FileList.get(index: Int): File? = getMethodImplForFileList(this, index)

/**
 * Exposes the JavaScript [FileReader](https://developer.mozilla.org/en/docs/Web/API/FileReader) to Kotlin
 */
public actual external open class FileReader actual constructor() : EventTarget, JsAny {
    actual open val readyState: Short
    actual open val result: JsAny? /* String|ArrayBuffer */
    actual open val error: JsAny?
    actual var onloadstart: ((ProgressEvent) -> Unit)?
    actual var onprogress: ((ProgressEvent) -> Unit)?
    actual var onload: ((Event) -> Unit)?
    actual var onabort: ((Event) -> Unit)?
    actual var onerror: ((Event) -> Unit)?
    actual var onloadend: ((Event) -> Unit)?
    actual fun readAsArrayBuffer(blob: Blob)
    actual fun readAsBinaryString(blob: Blob)
    actual fun readAsText(blob: Blob, label: String)
    actual fun readAsDataURL(blob: Blob)
    actual fun abort()

    actual companion object {
        actual val EMPTY: Short
        actual val LOADING: Short
        actual val DONE: Short
    }
}

/**
 * Exposes the JavaScript [FileReaderSync](https://developer.mozilla.org/en/docs/Web/API/FileReaderSync) to Kotlin
 */
public actual external open class FileReaderSync actual constructor() : JsAny {
    actual fun readAsArrayBuffer(blob: Blob): ArrayBuffer
    actual fun readAsBinaryString(blob: Blob): String
    actual fun readAsText(blob: Blob, label: String): String
    actual fun readAsDataURL(blob: Blob): String
}