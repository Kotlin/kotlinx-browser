/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webidl', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*

/**
 * The QuotaExceededError interface represents an error when a requested operation would exceed a system-imposed storage
 * quota.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError)
 */
public open external class QuotaExceededError : DOMException {
    /**
     * The QuotaExceededError() constructor creates a new QuotaExceededError object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError/QuotaExceededError)
     */
    constructor(message: String = definedExternally, options: QuotaExceededErrorOptions = definedExternally)

    /**
     * The quota read-only property of the QuotaExceededError interface returns the system-defined storage quota (in
     * bytes) that the operation attempted to exceed, or undefined if the information is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError/quota)
     */
    open val quota: Double?

    /**
     * The requested read-only property of the QuotaExceededError interface returns the number of bytes that were
     * requested when the error occurred, or undefined if the information is not available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/QuotaExceededError/requested)
     */
    open val requested: Double?

    companion object {
        val INDEX_SIZE_ERR: Short
        val DOMSTRING_SIZE_ERR: Short
        val HIERARCHY_REQUEST_ERR: Short
        val WRONG_DOCUMENT_ERR: Short
        val INVALID_CHARACTER_ERR: Short
        val NO_DATA_ALLOWED_ERR: Short
        val NO_MODIFICATION_ALLOWED_ERR: Short
        val NOT_FOUND_ERR: Short
        val NOT_SUPPORTED_ERR: Short
        val INUSE_ATTRIBUTE_ERR: Short
        val INVALID_STATE_ERR: Short
        val SYNTAX_ERR: Short
        val INVALID_MODIFICATION_ERR: Short
        val NAMESPACE_ERR: Short
        val INVALID_ACCESS_ERR: Short
        val VALIDATION_ERR: Short
        val TYPE_MISMATCH_ERR: Short
        val SECURITY_ERR: Short
        val NETWORK_ERR: Short
        val ABORT_ERR: Short
        val URL_MISMATCH_ERR: Short
        val QUOTA_EXCEEDED_ERR: Short
        val TIMEOUT_ERR: Short
        val INVALID_NODE_TYPE_ERR: Short
        val DATA_CLONE_ERR: Short
    }
}

public external interface QuotaExceededErrorOptions : JsAny {
    var quota: Double?
    var requested: Double?
}

public fun QuotaExceededErrorOptions(quota: Double? = null, requested: Double? = null): QuotaExceededErrorOptions = newJsObject<QuotaExceededErrorOptions>().apply {
    if (quota != null) this.quota = quota
    if (requested != null) this.requested = requested
}

/**
 * The DOMException interface represents an abnormal event (called an exception) that occurs as a result of calling a
 * method or accessing a property of a web API. This is how error conditions are described in web APIs.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException)
 */
public open external class DOMException : JsAny {
    /**
     * The DOMException() constructor returns a DOMException object with a specified message and name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/DOMException)
     */
    constructor(message: String = definedExternally, name: String = definedExternally)

    /**
     * The name read-only property of the DOMException interface returns a string that contains one of the strings
     * associated with an error name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/name)
     */
    open val name: String

    /**
     * The message read-only property of the DOMException interface returns a string representing a message or
     * description associated with the given error name.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/message)
     */
    open val message: String

    /**
     * The code read-only property of the DOMException interface returns one of the legacy error code constants, or 0 if
     * none match.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMException/code)
     */
    open val code: Short

    companion object {
        val INDEX_SIZE_ERR: Short
        val DOMSTRING_SIZE_ERR: Short
        val HIERARCHY_REQUEST_ERR: Short
        val WRONG_DOCUMENT_ERR: Short
        val INVALID_CHARACTER_ERR: Short
        val NO_DATA_ALLOWED_ERR: Short
        val NO_MODIFICATION_ALLOWED_ERR: Short
        val NOT_FOUND_ERR: Short
        val NOT_SUPPORTED_ERR: Short
        val INUSE_ATTRIBUTE_ERR: Short
        val INVALID_STATE_ERR: Short
        val SYNTAX_ERR: Short
        val INVALID_MODIFICATION_ERR: Short
        val NAMESPACE_ERR: Short
        val INVALID_ACCESS_ERR: Short
        val VALIDATION_ERR: Short
        val TYPE_MISMATCH_ERR: Short
        val SECURITY_ERR: Short
        val NETWORK_ERR: Short
        val ABORT_ERR: Short
        val URL_MISMATCH_ERR: Short
        val QUOTA_EXCEEDED_ERR: Short
        val TIMEOUT_ERR: Short
        val INVALID_NODE_TYPE_ERR: Short
        val DATA_CLONE_ERR: Short
    }
}
