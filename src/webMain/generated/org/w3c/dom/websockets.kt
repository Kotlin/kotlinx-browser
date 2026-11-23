/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'websockets', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.dom

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.files.*

public external interface BinaryType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val BinaryType.Companion.BLOB: BinaryType get() = "blob".toJsString().unsafeCast<BinaryType>()
public inline val BinaryType.Companion.ARRAYBUFFER: BinaryType get() = "arraybuffer".toJsString().unsafeCast<BinaryType>()

public external open class WebSocket : EventTarget {
    constructor(url: String, protocols: String)
    constructor(url: String, protocols: JsArray<JsString>)
    constructor(url: String)
    open val url: String
    open val readyState: Short
    open val bufferedAmount: Double
    open var onopen: ((Event) -> Unit)?
    open var onerror: ((Event) -> Unit)?
    open var onclose: ((CloseEvent) -> Unit)?
    open val extensions: String
    open val protocol: String
    open fun close(code: Short = definedExternally, reason: String = definedExternally)
    open var onmessage: ((MessageEvent) -> Unit)?
    open var binaryType: BinaryType
    open fun send(data: BufferDataSource)
    open fun send(data: Blob)
    open fun send(data: String)

    companion object {
        val CONNECTING: Short
        val OPEN: Short
        val CLOSING: Short
        val CLOSED: Short
    }
}

public external open class CloseEvent : Event {
    constructor(type: String, eventInitDict: CloseEventInit = definedExternally)
    open val wasClean: Boolean
    open val code: Short
    open val reason: String

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface CloseEventInit : EventInit {
    var wasClean: Boolean?
    var code: Short?
    var reason: String?
}

public fun CloseEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, wasClean: Boolean? = null, code: Short? = null, reason: String? = null): CloseEventInit = newJsObject<CloseEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (wasClean != null) this.wasClean = wasClean
    if (code != null) this.code = code
    if (reason != null) this.reason = reason
}
