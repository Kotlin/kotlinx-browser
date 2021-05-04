/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.dom.url

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.mediasource.*

/**
 * Exposes the JavaScript [URL](https://developer.mozilla.org/en/docs/Web/API/URL) to Kotlin
 */
public external abstract class URL {
    open var href: String
    open val origin: String
    open var protocol: String
    open var username: String
    open var password: String
    open var host: String
    open var hostname: String
    open var port: String
    open var pathname: String
    open var search: String
    open val searchParams: URLSearchParams
    open var hash: String
    fun toJSON(): String

    companion object {
        fun createObjectURL(mediaSource: MediaSource): String
        fun createObjectURL(obj: UnionBlobOrMediaSource): String
        fun revokeObjectURL(url: String): dynamic
    }
}

/**
 * Exposes the JavaScript [URLSearchParams](https://developer.mozilla.org/en/docs/Web/API/URLSearchParams) to Kotlin
 */
public external abstract class URLSearchParams {
    fun append(name: String, value: String): dynamic
    fun delete(name: String): dynamic
    fun get(name: String): String?
    fun getAll(name: String): Array<String>
    fun has(name: String): Boolean
    fun set(name: String, value: String): dynamic
    fun sort(): dynamic
}

public external interface UnionBlobOrMediaSource