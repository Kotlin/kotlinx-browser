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
public expect open class Blob(blobParts: JsArray<JsAny? /* BufferSource|Blob|String */> = definedExternally, options: BlobPropertyBag = definedExternally) : MediaProvider, ImageBitmapSource, JsAny {
    open val size: JsNumber
    open val type: String
    open val isClosed: Boolean
    fun slice(start: Int = definedExternally, end: Int = definedExternally, contentType: String = definedExternally): Blob
    fun close()
}

public expect interface BlobPropertyBag : JsAny {
    open var type: String? /* = "" */
}

@Suppress("UNUSED_PARAMETER")
public expect fun BlobPropertyBag(type: String? = ""): BlobPropertyBag

/**
 * Exposes the JavaScript [File](https://developer.mozilla.org/en/docs/Web/API/File) to Kotlin
 */
public expect open class File(fileBits: JsArray<JsAny? /* BufferSource|Blob|String */>, fileName: String, options: FilePropertyBag = definedExternally) : Blob, JsAny {
    open val name: String
    open val lastModified: Int
}

public expect interface FilePropertyBag : BlobPropertyBag, JsAny {
    open var lastModified: Int?
}

@Suppress("UNUSED_PARAMETER")
public expect fun FilePropertyBag(lastModified: Int? = undefined, type: String? = ""): FilePropertyBag

/**
 * Exposes the JavaScript [FileList](https://developer.mozilla.org/en/docs/Web/API/FileList) to Kotlin
 */
public expect abstract class FileList : ItemArrayLike<File>, JsAny {
    override fun item(index: Int): File?
}

public expect operator fun FileList.get(index: Int): File?

/**
 * Exposes the JavaScript [FileReader](https://developer.mozilla.org/en/docs/Web/API/FileReader) to Kotlin
 */
public expect open class FileReader() : EventTarget, JsAny {
    open val readyState: Short
    open val result: JsAny? /* String|ArrayBuffer */
    open val error: JsAny?
    var onloadstart: ((ProgressEvent) -> Unit)?
    var onprogress: ((ProgressEvent) -> Unit)?
    var onload: ((Event) -> Unit)?
    var onabort: ((Event) -> Unit)?
    var onerror: ((Event) -> Unit)?
    var onloadend: ((Event) -> Unit)?
    fun readAsArrayBuffer(blob: Blob)
    fun readAsBinaryString(blob: Blob)
    fun readAsText(blob: Blob, label: String = definedExternally)
    fun readAsDataURL(blob: Blob)
    fun abort()

    companion object {
        val EMPTY: Short
        val LOADING: Short
        val DONE: Short
    }
}

/**
 * Exposes the JavaScript [FileReaderSync](https://developer.mozilla.org/en/docs/Web/API/FileReaderSync) to Kotlin
 */
public expect open class FileReaderSync() : JsAny {
    fun readAsArrayBuffer(blob: Blob): ArrayBuffer
    fun readAsBinaryString(blob: Blob): String
    fun readAsText(blob: Blob, label: String = definedExternally): String
    fun readAsDataURL(blob: Blob): String
}