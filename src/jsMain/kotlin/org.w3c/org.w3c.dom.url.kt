/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE", "ACTUAL_WITHOUT_EXPECT", "AMBIGUOUS_EXPECTS")
package org.w3c.dom.url

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.mediasource.*
import org.w3c.files.*

/**
 * Exposes the JavaScript [URL](https://developer.mozilla.org/en/docs/Web/API/URL) to Kotlin
 */
actual external open class URL actual constructor(url: String, base: String) {
    actual var href: String
    actual open val origin: String
    actual var protocol: String
    actual var username: String
    actual var password: String
    actual var host: String
    actual var hostname: String
    actual var port: String
    actual var pathname: String
    actual var search: String
    actual open val searchParams: URLSearchParams
    actual var hash: String

    actual companion object {
        actual fun domainToASCII(domain: String): String
        actual fun domainToUnicode(domain: String): String
        actual fun createObjectURL(mediaSource: MediaSource): String
        actual fun createObjectURL(blob: Blob): String
        actual fun createFor(blob: Blob): String
        actual fun revokeObjectURL(url: String)
    }
}

/**
 * Exposes the JavaScript [URLSearchParams](https://developer.mozilla.org/en/docs/Web/API/URLSearchParams) to Kotlin
 */
actual external open class URLSearchParams actual constructor(init: dynamic) {
    actual fun append(name: String, value: String)
    actual fun delete(name: String)
    actual fun get(name: String): String?
    actual fun getAll(name: String): Array<String>
    actual fun has(name: String): Boolean
    actual fun set(name: String, value: String)
}