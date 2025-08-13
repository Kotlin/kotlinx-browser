/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.files

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Blob](https://developer.mozilla.org/en/docs/Web/API/Blob) to Kotlin
 */
actual external open class Blob actual constructor(blobParts: Array<dynamic>, options: BlobPropertyBag) : MediaProvider, ImageBitmapSource {
    actual open val size: Number
    actual open val type: String
    actual open val isClosed: Boolean
    actual fun slice(start: Int, end: Int, contentType: String): Blob
    actual fun close()
}

actual external interface BlobPropertyBag {
    actual var type: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun BlobPropertyBag(type: String?): BlobPropertyBag {
    val o = js("({})")
    o["type"] = type
    return o as BlobPropertyBag
}

/**
 * Exposes the JavaScript [File](https://developer.mozilla.org/en/docs/Web/API/File) to Kotlin
 */
actual external open class File actual constructor(fileBits: Array<dynamic>, fileName: String, options: FilePropertyBag) : Blob {
    actual open val name: String
    actual open val lastModified: Int
}

actual external interface FilePropertyBag : BlobPropertyBag {
    actual var lastModified: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline fun FilePropertyBag(lastModified: Int?, type: String?): FilePropertyBag {
    val o = js("({})")
    o["lastModified"] = lastModified
    o["type"] = type
    return o as FilePropertyBag
}

/**
 * Exposes the JavaScript [FileList](https://developer.mozilla.org/en/docs/Web/API/FileList) to Kotlin
 */
actual external abstract class FileList : ItemArrayLike<File> {
    actual override fun item(index: Int): File?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
actual inline operator fun FileList.get(index: Int): File? = asDynamic()[index]

/**
 * Exposes the JavaScript [FileReader](https://developer.mozilla.org/en/docs/Web/API/FileReader) to Kotlin
 */
actual external open class FileReader actual constructor() : EventTarget {
    actual open val readyState: Short
    actual open val result: dynamic
    actual open val error: dynamic
    actual var onloadstart: ((ProgressEvent) -> dynamic)?
    actual var onprogress: ((ProgressEvent) -> dynamic)?
    actual var onload: ((Event) -> dynamic)?
    actual var onabort: ((Event) -> dynamic)?
    actual var onerror: ((Event) -> dynamic)?
    actual var onloadend: ((Event) -> dynamic)?
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
actual external open class FileReaderSync actual constructor() {
    actual fun readAsArrayBuffer(blob: Blob): ArrayBuffer
    actual fun readAsBinaryString(blob: Blob): String
    actual fun readAsText(blob: Blob, label: String): String
    actual fun readAsDataURL(blob: Blob): String
}