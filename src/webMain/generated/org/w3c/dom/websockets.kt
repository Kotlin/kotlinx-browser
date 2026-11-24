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

/**
 * The WebSocket object provides the API for creating and managing a WebSocket connection to a server, as well as for
 * sending and receiving data on the connection.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket)
 */
public open external class WebSocket : EventTarget {
    /**
     * The WebSocket() constructor returns a new WebSocket object and immediately attempts to establish a connection to
     * the specified WebSocket URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/WebSocket)
     */
    constructor(url: String, protocols: String)

    /**
     * The WebSocket() constructor returns a new WebSocket object and immediately attempts to establish a connection to
     * the specified WebSocket URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/WebSocket)
     */
    constructor(url: String, protocols: JsArray<JsString>)

    /**
     * The WebSocket() constructor returns a new WebSocket object and immediately attempts to establish a connection to
     * the specified WebSocket URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/WebSocket)
     */
    constructor(url: String)

    /**
     * The WebSocket.url read-only property returns the absolute URL of the WebSocket as resolved by the constructor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/url)
     */
    open val url: String

    /**
     * The WebSocket.readyState read-only property returns the current state of the WebSocket connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/readyState)
     */
    open val readyState: Short

    /**
     * The WebSocket.bufferedAmount read-only property returns the number of bytes of data that have been queued using
     * calls to send() but not yet transmitted to the network. This value resets to zero once all queued data has been
     * sent. This value does not reset to zero when the connection is closed; if you keep calling send(), this will
     * continue to climb.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/bufferedAmount)
     */
    open val bufferedAmount: Double

    /**
     * The open event is fired when a connection with a WebSocket is opened.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/open_event)
     */
    open var onopen: ((Event) -> Unit)?

    /**
     * The error event is fired when a connection with a WebSocket has been closed due to an error (some data couldn't
     * be sent for example).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/error_event)
     */
    open var onerror: ((Event) -> Unit)?

    /**
     * The close event is fired when a connection with a WebSocket is closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close_event)
     */
    open var onclose: ((CloseEvent) -> Unit)?

    /**
     * The WebSocket.extensions read-only property returns the extensions selected by the server. This is currently only
     * the empty string or a list of extensions as negotiated by the connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/extensions)
     */
    open val extensions: String

    /**
     * The WebSocket.protocol read-only property returns the name of the sub-protocol the server selected; this will be
     * one of the strings specified in the protocols parameter when creating the WebSocket object, or the empty string
     * if no connection is established.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/protocol)
     */
    open val protocol: String

    /**
     * The WebSocket.close() method closes the WebSocket connection or connection attempt, if any. If the connection is
     * already CLOSED, this method does nothing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/close)
     */
    open fun close(code: Short = definedExternally, reason: String = definedExternally)

    /**
     * The message event is fired when data is received through a WebSocket.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/message_event)
     */
    open var onmessage: ((MessageEvent) -> Unit)?

    /**
     * The WebSocket.binaryType property controls the type of binary data being received over the WebSocket connection.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/binaryType)
     */
    open var binaryType: BinaryType

    /**
     * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket
     * connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data
     * can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed
     * automatically. The browser will throw an exception if you call send() when the connection is in the CONNECTING
     * state. If you call send() when the connection is in the CLOSING or CLOSED states, the browser will silently
     * discard the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/send)
     */
    open fun send(data: BufferDataSource)

    /**
     * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket
     * connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data
     * can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed
     * automatically. The browser will throw an exception if you call send() when the connection is in the CONNECTING
     * state. If you call send() when the connection is in the CLOSING or CLOSED states, the browser will silently
     * discard the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/send)
     */
    open fun send(data: Blob)

    /**
     * The WebSocket.send() method enqueues the specified data to be transmitted to the server over the WebSocket
     * connection, increasing the value of bufferedAmount by the number of bytes needed to contain the data. If the data
     * can't be sent (for example, because it needs to be buffered but the buffer is full), the socket is closed
     * automatically. The browser will throw an exception if you call send() when the connection is in the CONNECTING
     * state. If you call send() when the connection is in the CLOSING or CLOSED states, the browser will silently
     * discard the data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WebSocket/send)
     */
    open fun send(data: String)

    companion object {
        val CONNECTING: Short
        val OPEN: Short
        val CLOSING: Short
        val CLOSED: Short
    }
}

/**
 * A CloseEvent is sent to clients using WebSockets when the connection is closed. This is delivered to the listener
 * indicated by the WebSocket object's onclose attribute.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent)
 */
public open external class CloseEvent : Event {
    /**
     * The CloseEvent() constructor creates a new CloseEvent object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/CloseEvent)
     */
    constructor(type: String, eventInitDict: CloseEventInit = definedExternally)

    /**
     * The wasClean read-only property of the CloseEvent interface returns true if the connection closed cleanly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/wasClean)
     */
    open val wasClean: Boolean

    /**
     * The code read-only property of the CloseEvent interface returns a WebSocket connection close code indicating the
     * reason the connection was closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/code)
     */
    open val code: Short

    /**
     * The reason read-only property of the CloseEvent interface returns the WebSocket connection close reason the
     * server gave for closing the connection; that is, a concise human-readable prose explanation for the closure.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CloseEvent/reason)
     */
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
