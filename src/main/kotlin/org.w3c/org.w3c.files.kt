/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.files

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.url.*
import org.w3c.xhr.*

/**
 * Exposes the JavaScript [Blob](https://developer.mozilla.org/en/docs/Web/API/Blob) to Kotlin
 */
public external abstract class Blob : MediaProvider, ImageBitmapSource, UnionBlobOrMediaSource {
    open val size: Number
    open val type: String
    fun slice(start: Int = definedExternally, end: Int = definedExternally, contentType: String = definedExternally): Blob
    fun stream(): dynamic
    fun text(): Promise<String>
    fun arrayBuffer(): Promise<ArrayBuffer>
}

public external interface BlobPropertyBag {
    var type: String? /* = "" */
        get() = definedExternally
        set(value) = definedExternally
    var endings: EndingType? /* = EndingType.TRANSPARENT */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun BlobPropertyBag(type: String? = "", endings: EndingType? = EndingType.TRANSPARENT): BlobPropertyBag {
    val o = js("({})")
    o["type"] = type
    o["endings"] = endings
    return o
}

/**
 * Exposes the JavaScript [File](https://developer.mozilla.org/en/docs/Web/API/File) to Kotlin
 */
public external abstract class File : Blob {
    open val name: String
    open val lastModified: Int
}

public external interface FilePropertyBag : BlobPropertyBag {
    var lastModified: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun FilePropertyBag(lastModified: Int? = undefined, type: String? = "", endings: EndingType? = EndingType.TRANSPARENT): FilePropertyBag {
    val o = js("({})")
    o["lastModified"] = lastModified
    o["type"] = type
    o["endings"] = endings
    return o
}

/**
 * Exposes the JavaScript [FileList](https://developer.mozilla.org/en/docs/Web/API/FileList) to Kotlin
 */
public external abstract class FileList : ItemArrayLike<File> {
    override fun item(index: Int): File?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline operator fun FileList.get(index: Int): File? = asDynamic()[index]

/**
 * Exposes the JavaScript [FileReader](https://developer.mozilla.org/en/docs/Web/API/FileReader) to Kotlin
 */
public external abstract class FileReader : EventTarget {
    open val readyState: Short
    open val result: dynamic
    open val error: dynamic
    open var onloadstart: ((ProgressEvent) -> dynamic)?
    open var onprogress: ((ProgressEvent) -> dynamic)?
    open var onload: ((Event) -> dynamic)?
    open var onabort: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
    open var onloadend: ((Event) -> dynamic)?
    fun readAsArrayBuffer(blob: Blob): dynamic
    fun readAsBinaryString(blob: Blob): dynamic
    fun readAsText(blob: Blob, encoding: String = definedExternally): dynamic
    fun readAsDataURL(blob: Blob): dynamic
    fun abort(): dynamic

    companion object {
        val EMPTY: Short
        val LOADING: Short
        val DONE: Short
    }
}

/**
 * Exposes the JavaScript [FileReaderSync](https://developer.mozilla.org/en/docs/Web/API/FileReaderSync) to Kotlin
 */
public external abstract class FileReaderSync {
    fun readAsArrayBuffer(blob: Blob): ArrayBuffer
    fun readAsBinaryString(blob: Blob): String
    fun readAsText(blob: Blob, encoding: String = definedExternally): String
    fun readAsDataURL(blob: Blob): String
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface EndingType {
    companion object
}

public inline val EndingType.Companion.TRANSPARENT: EndingType get() = "transparent".asDynamic().unsafeCast<EndingType>()

public inline val EndingType.Companion.NATIVE: EndingType get() = "native".asDynamic().unsafeCast<EndingType>()