/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'url', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom.url

import kotlin.js.*
import org.w3c.dom.*

public external interface UnionBlobOrMediaSource : MediaProvider

/**
 * The URL interface is used to parse, construct, normalize, and encode URLs. It works by providing properties which
 * allow you to easily read and modify the components of a URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL)
 */
public external open class URL : JsAny {
    /**
     * The URL() constructor returns a newly created URL object representing the URL defined by the parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/URL)
     */
    constructor(url: String, base: String = definedExternally)

    /**
     * The href property of the URL interface is a string containing the whole URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/href)
     */
    open var href: String

    /**
     * The origin read-only property of the URL interface returns a string containing the Unicode serialization of the
     * origin of the represented URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/origin)
     */
    open val origin: String

    /**
     * The protocol property of the URL interface is a string containing the protocol or scheme of the URL, including
     * the final ":".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/protocol)
     */
    open var protocol: String

    /**
     * The username property of the URL interface is a string containing the username component of the URL. If the URL
     * does not have a username, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/username)
     */
    open var username: String

    /**
     * The password property of the URL interface is a string containing the password component of the URL. If the URL
     * does not have a password, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/password)
     */
    open var password: String

    /**
     * The host property of the URL interface is a string containing the host, which is the hostname, and then, if the
     * port of the URL is nonempty, a ":", followed by the port of the URL. If the URL does not have a hostname, this
     * property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/host)
     */
    open var host: String

    /**
     * The hostname property of the URL interface is a string containing either the domain name or IP address of the
     * URL. If the URL does not have a hostname, this property contains an empty string, "". IPv4 and IPv6 addresses are
     * normalized, such as stripping leading zeros, and domain names are converted to IDN.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hostname)
     */
    open var hostname: String

    /**
     * The port property of the URL interface is a string containing the port number of the URL. If the port is the
     * default for the protocol (80 for ws: and http:, 443 for wss: and https:, and 21 for ftp:), this property contains
     * an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/port)
     */
    open var port: String

    /**
     * The pathname property of the URL interface represents a location in a hierarchical structure. It is a string
     * constructed from a list of path segments, each of which is prefixed by a / character.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/pathname)
     */
    open var pathname: String

    /**
     * The search property of the URL interface is a search string, also called a query string, that is a string
     * containing a "?" followed by the parameters of the URL. If the URL does not have a search query, this property
     * contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/search)
     */
    open var search: String

    /**
     * The searchParams read-only property of the URL interface returns a URLSearchParams object allowing access to the
     * GET decoded query arguments contained in the URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/searchParams)
     */
    open val searchParams: URLSearchParams

    /**
     * The hash property of the URL interface is a string containing a "#" followed by the fragment identifier of the
     * URL. If the URL does not have a fragment identifier, this property contains an empty string, "".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/hash)
     */
    open var hash: String

    /**
     * The toJSON() method of the URL interface returns a string representing the URL object. This is the same string
     * that URL.toString() returns.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/toJSON)
     */
    open fun toJSON(): String

    companion object {
        /**
         * The URL.parse() static method of the URL interface returns a newly created URL object representing the URL
         * defined by the parameters.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/parse_static)
         */
        fun parse(url: String, base: String = definedExternally): URL?

        /**
         * The URL.canParse() static method of the URL interface returns a boolean indicating whether or not an absolute
         * URL, or a relative URL combined with a base URL, are parsable and valid.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/canParse_static)
         */
        fun canParse(url: String, base: String = definedExternally): Boolean

        /**
         * The createObjectURL() static method of the URL interface creates a string containing a blob URL pointing to
         * the object given in the parameter.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/createObjectURL_static)
         */
        fun createObjectURL(obj: UnionBlobOrMediaSource): String

        /**
         * The revokeObjectURL() static method of the URL interface releases an existing object URL which was previously
         * created by calling URL.createObjectURL().
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URL/revokeObjectURL_static)
         */
        fun revokeObjectURL(url: String)
    }
}

/**
 * The URLSearchParams interface defines utility methods to work with the query string of a URL.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams)
 */
public external open class URLSearchParams : JsAny {
    /**
     * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/URLSearchParams)
     */
    constructor(init: JsArray<JsArray<JsString>>)

    /**
     * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/URLSearchParams)
     */
    constructor(init: JsAny)

    /**
     * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/URLSearchParams)
     */
    constructor(init: String)

    /**
     * The URLSearchParams() constructor creates and returns a new URLSearchParams object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/URLSearchParams)
     */
    constructor()

    /**
     * The size read-only property of the URLSearchParams interface indicates the total number of search parameter
     * entries.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/size)
     */
    open val size: Int

    /**
     * The append() method of the URLSearchParams interface appends a specified key/value pair as a new search
     * parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/append)
     */
    open fun append(name: String, value: String)

    /**
     * The delete() method of the URLSearchParams interface deletes specified parameters and their associated value(s)
     * from the list of all search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/delete)
     */
    open fun delete(name: String, value: String = definedExternally)

    /**
     * The get() method of the URLSearchParams interface returns the first value associated to the given search
     * parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/get)
     */
    open fun get(name: String): String?

    /**
     * The getAll() method of the URLSearchParams interface returns all the values associated with a given search
     * parameter as an array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/getAll)
     */
    open fun getAll(name: String): JsArray<JsString>

    /**
     * The has() method of the URLSearchParams interface returns a boolean value that indicates whether the specified
     * parameter is in the search parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/has)
     */
    open fun has(name: String, value: String = definedExternally): Boolean

    /**
     * The set() method of the URLSearchParams interface sets the value associated with a given search parameter to the
     * given value. If there were several matching values, this method deletes the others. If the search parameter
     * doesn't exist, this method creates it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/set)
     */
    open fun set(name: String, value: String)

    /**
     * The URLSearchParams.sort() method sorts all key/value pairs contained in this object in place and returns
     * undefined. Key/value pairs are sorted by the values of the UTF-16 code units of the keys. This method uses a
     * stable sorting algorithm (i.e., the relative order between key/value pairs with equal keys will be preserved).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/URLSearchParams/sort)
     */
    open fun sort()
    // not printed yet: iterable
}
