/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webidl', DO NOT EDIT!

package org.w3c.dom

import kotlin.js.*

public external open class QuotaExceededError : DOMException {
    constructor(message: String = definedExternally, options: QuotaExceededErrorOptions = definedExternally)
    open val quota: Double?
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

public external open class DOMException : JsAny {
    constructor(message: String = definedExternally, name: String = definedExternally)
    open val name: String
    open val message: String
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
