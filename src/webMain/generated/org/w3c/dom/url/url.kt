/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'url', DO NOT EDIT!

package org.w3c.dom.url

import kotlin.js.*
import org.w3c.dom.*

public external interface UnionBlobOrMediaSource : MediaProvider

public external open class URL : JsAny {
    constructor(url: String, base: String = definedExternally)
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
    open fun toJSON(): String

    companion object {
        fun parse(url: String, base: String = definedExternally): URL?
        fun canParse(url: String, base: String = definedExternally): Boolean
        fun createObjectURL(obj: UnionBlobOrMediaSource): String
        fun revokeObjectURL(url: String)
    }
}

public external open class URLSearchParams : JsAny {
    constructor(init: JsArray<JsArray<JsString>>)
    constructor(init: JsAny)
    constructor(init: String)
    constructor()
    open val size: Int
    open fun append(name: String, value: String)
    open fun delete(name: String, value: String = definedExternally)
    open fun get(name: String): String?
    open fun getAll(name: String): JsArray<JsString>
    open fun has(name: String, value: String = definedExternally): Boolean
    open fun set(name: String, value: String)
    open fun sort()
    // not printed yet: iterable
}
