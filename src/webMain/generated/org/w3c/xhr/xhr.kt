/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'xhr', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.xhr

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.url.*
import org.w3c.files.*

/**
 * XMLHttpRequestEventTarget is the interface that describes the event handlers shared on XMLHttpRequest and
 * XMLHttpRequestUpload.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestEventTarget)
 */
public abstract external class XMLHttpRequestEventTarget : EventTarget {
    open var onloadstart: ((ProgressEvent) -> Unit)?
    open var onprogress: ((ProgressEvent) -> Unit)?
    open var onabort: ((ProgressEvent) -> Unit)?
    open var onerror: ((ProgressEvent) -> Unit)?
    open var onload: ((ProgressEvent) -> Unit)?
    open var ontimeout: ((ProgressEvent) -> Unit)?
    open var onloadend: ((ProgressEvent) -> Unit)?
}

/**
 * The XMLHttpRequestUpload interface represents the upload process for a specific XMLHttpRequest. It is an opaque
 * object that represents the underlying, browser-dependent, upload process. It is an XMLHttpRequestEventTarget and can
 * be obtained by calling XMLHttpRequest.upload.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequestUpload)
 */
public abstract external class XMLHttpRequestUpload : XMLHttpRequestEventTarget

public external interface XMLHttpRequestResponseType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val XMLHttpRequestResponseType.Companion.EMPTY: XMLHttpRequestResponseType get() = "".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.ARRAYBUFFER: XMLHttpRequestResponseType get() = "arraybuffer".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.BLOB: XMLHttpRequestResponseType get() = "blob".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.DOCUMENT: XMLHttpRequestResponseType get() = "document".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.JSON: XMLHttpRequestResponseType get() = "json".toJsString().unsafeCast<XMLHttpRequestResponseType>()
public inline val XMLHttpRequestResponseType.Companion.TEXT: XMLHttpRequestResponseType get() = "text".toJsString().unsafeCast<XMLHttpRequestResponseType>()

/**
 * XMLHttpRequest (XHR) objects are used to interact with servers. You can retrieve data from a URL without having to do
 * a full page refresh. This enables a Web page to update just part of a page without disrupting what the user is doing.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest)
 */
public open external class XMLHttpRequest : XMLHttpRequestEventTarget {
    /**
     * The XMLHttpRequest() constructor creates a new XMLHttpRequest.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/XMLHttpRequest)
     */
    constructor()

    /**
     * The readystatechange event is fired whenever the readyState property of the XMLHttpRequest changes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readystatechange_event)
     */
    open var onreadystatechange: ((Event) -> Unit)?

    /**
     * The readyState read-only property of the XMLHttpRequest interface returns the state an XMLHttpRequest client is
     * in.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/readyState)
     */
    open val readyState: Short

    /**
     * The XMLHttpRequest method open() initializes a newly-created request, or re-initializes an existing one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/open)
     */
    open fun open(method: String, url: String)

    /**
     * The XMLHttpRequest method open() initializes a newly-created request, or re-initializes an existing one.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/open)
     */
    open fun open(method: String, url: String, async: Boolean, username: String? = definedExternally, password: String? = definedExternally)

    /**
     * The XMLHttpRequest method setRequestHeader() sets the value of an HTTP request header. When using
     * setRequestHeader(), you must call it after calling open(), but before calling send(). If this method is called
     * several times with the same header, the values are merged into one single request header.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/setRequestHeader)
     */
    open fun setRequestHeader(name: String, value: String)

    /**
     * The XMLHttpRequest.timeout property is an unsigned long representing the number of milliseconds a request can
     * take before automatically being terminated. The default value is 0, which means there is no timeout. Timeout
     * shouldn't be used for synchronous XMLHttpRequests requests used in a document environment or it will throw an
     * InvalidAccessError exception. When a timeout happens, a timeout event is fired.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/timeout)
     */
    open var timeout: Int

    /**
     * The XMLHttpRequest.withCredentials property is a boolean value that indicates whether or not cross-site
     * Access-Control requests should be made using credentials such as cookies, authentication headers or TLS client
     * certificates. Setting withCredentials has no effect on same-origin requests.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/withCredentials)
     */
    open var withCredentials: Boolean

    /**
     * The upload read-only property of the XMLHttpRequest interface returns an XMLHttpRequestUpload object that can be
     * observed to monitor an upload's progress.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/upload)
     */
    open val upload: XMLHttpRequestUpload

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send(body: Document?)

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send(body: Blob?)

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send(body: BufferDataSource?)

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send(body: FormData?)

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send(body: URLSearchParams?)

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send(body: String?)

    /**
     * The XMLHttpRequest method send() sends the request to the server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/send)
     */
    open fun send()

    /**
     * The XMLHttpRequest.abort() method aborts the request if it has already been sent. When a request is aborted, its
     * readyState is changed to XMLHttpRequest.UNSENT (0) and the request's status code is set to 0.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/abort)
     */
    open fun abort()

    /**
     * The read-only XMLHttpRequest.responseURL property returns the serialized URL of the response or the empty string
     * if the URL is null. If the URL is returned, any URL fragment present in the URL will be stripped away. The value
     * of responseURL will be the final URL obtained after any redirects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseURL)
     */
    open val responseURL: String

    /**
     * The read-only XMLHttpRequest.status property returns the numerical HTTP status code of the XMLHttpRequest's
     * response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/status)
     */
    open val status: Short

    /**
     * The read-only XMLHttpRequest.statusText property returns a string containing the response's status message as
     * returned by the HTTP server. Unlike XMLHttpRequest.status which indicates a numerical status code, this property
     * contains the text of the response status, such as "OK" or "Not Found". If the request's readyState is in UNSENT
     * or OPENED state, the value of statusText will be an empty string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/statusText)
     */
    open val statusText: String

    /**
     * The XMLHttpRequest method getResponseHeader() returns the string containing the text of a particular header's
     * value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/getResponseHeader)
     */
    open fun getResponseHeader(name: String): String?

    /**
     * The XMLHttpRequest method getAllResponseHeaders() returns all the response headers, separated by CRLF, as a
     * string, or returns null if no response has been received.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/getAllResponseHeaders)
     */
    open fun getAllResponseHeaders(): String

    /**
     * The XMLHttpRequest method overrideMimeType() specifies a MIME type other than the one provided by the server to
     * be used instead when interpreting the data being transferred in a request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/overrideMimeType)
     */
    open fun overrideMimeType(mime: String)

    /**
     * The XMLHttpRequest property responseType is an enumerated string value specifying the type of data contained in
     * the response.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseType)
     */
    open var responseType: XMLHttpRequestResponseType

    /**
     * The response read-only property of the XMLHttpRequest interface returns the response's body content as an
     * ArrayBuffer, a Blob, a Document, a JavaScript Object, or a string, depending on the value of the request's
     * responseType property.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/response)
     */
    open val response: JsAny?

    /**
     * The read-only XMLHttpRequest property responseText returns the text received from a server following a request
     * being sent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseText)
     */
    open val responseText: String

    /**
     * The XMLHttpRequest.responseXML read-only property returns a Document containing the HTML or XML retrieved by the
     * request; or null if the request was unsuccessful, has not yet been sent, or if the data can't be parsed as XML or
     * HTML.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XMLHttpRequest/responseXML)
     */
    open val responseXML: Document?

    companion object {
        val UNSENT: Short
        val OPENED: Short
        val HEADERS_RECEIVED: Short
        val LOADING: Short
        val DONE: Short
    }
}

/**
 * The FormData interface provides a way to construct a set of key/value pairs representing form fields and their
 * values, which can be sent using the fetch(), XMLHttpRequest.send() or navigator.sendBeacon() methods. It uses the
 * same format a form would use if the encoding type were set to "multipart/form-data".
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData)
 */
public open external class FormData : JsAny {
    /**
     * The FormData() constructor creates a new FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/FormData)
     */
    constructor(form: HTMLFormElement = definedExternally, submitter: HTMLElement? = definedExternally)

    /**
     * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object,
     * or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    open fun append(name: String, value: String)

    /**
     * The append() method of the FormData interface appends a new value onto an existing key inside a FormData object,
     * or adds the key if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/append)
     */
    open fun append(name: String, blobValue: Blob, filename: String = definedExternally)

    /**
     * The delete() method of the FormData interface deletes a key and its value(s) from a FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/delete)
     */
    open fun delete(name: String)

    /**
     * The get() method of the FormData interface returns the first value associated with a given key from within a
     * FormData object. If you expect multiple values and want all of them, use the getAll() method instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/get)
     */
    open fun get(name: String): JsAny?

    /**
     * The getAll() method of the FormData interface returns all the values associated with a given key from within a
     * FormData object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/getAll)
     */
    open fun getAll(name: String): JsArray<JsAny>

    /**
     * The has() method of the FormData interface returns whether a FormData object contains a certain key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/has)
     */
    open fun has(name: String): Boolean

    /**
     * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds
     * the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    open fun set(name: String, value: String)

    /**
     * The set() method of the FormData interface sets a new value for an existing key inside a FormData object, or adds
     * the key/value if it does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/FormData/set)
     */
    open fun set(name: String, blobValue: Blob, filename: String = definedExternally)
    // not printed yet: iterable
}

/**
 * The ProgressEvent interface represents events that measure the progress of an underlying process, like an HTTP
 * request (e.g., an XMLHttpRequest, or the loading of the underlying resource of an &lt;img&gt;, &lt;audio&gt;,
 * &lt;video&gt;, &lt;style&gt; or &lt;link&gt;).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent)
 */
public open external class ProgressEvent : Event {
    /**
     * The ProgressEvent() constructor returns a new ProgressEvent object, representing the current completion of a long
     * process.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/ProgressEvent)
     */
    constructor(type: String, eventInitDict: ProgressEventInit = definedExternally)

    /**
     * The ProgressEvent.lengthComputable read-only property is a boolean flag indicating if the resource concerned by
     * the ProgressEvent has a length that can be calculated. If not, the ProgressEvent.total property has no
     * significant value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/lengthComputable)
     */
    open val lengthComputable: Boolean

    /**
     * The ProgressEvent.loaded read-only property is a number indicating the size of the data already transmitted or
     * processed. The progress ratio can be calculated by dividing the value of this property by ProgressEvent.total.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/loaded)
     */
    open val loaded: Double

    /**
     * The ProgressEvent.total read-only property is a number indicating the total size of the data being transmitted or
     * processed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ProgressEvent/total)
     */
    open val total: Double

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface ProgressEventInit : EventInit {
    var lengthComputable: Boolean?
    var loaded: Double?
    var total: Double?
}

public fun ProgressEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, lengthComputable: Boolean? = null, loaded: Double? = null, total: Double? = null): ProgressEventInit = newJsObject<ProgressEventInit>().apply {
    if (bubbles != null) this.bubbles = bubbles
    if (cancelable != null) this.cancelable = cancelable
    if (composed != null) this.composed = composed
    if (lengthComputable != null) this.lengthComputable = lengthComputable
    if (loaded != null) this.loaded = loaded
    if (total != null) this.total = total
}
