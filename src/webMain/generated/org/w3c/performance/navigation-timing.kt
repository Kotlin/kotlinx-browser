/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'navigation-timing', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*
import org.w3c.dom.*

/**
 * The PerformanceNavigationTiming interface provides methods and properties to store and retrieve metrics regarding the
 * browser's document navigation events. For example, this interface can be used to determine how much time it takes to
 * load or unload a document.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming)
 */
public external abstract class PerformanceNavigationTiming : PerformanceResourceTiming {
    /**
     * The unloadEventStart read-only property returns a DOMHighResTimeStamp representing the time immediately before
     * the previous document's unload event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventStart)
     */
    open val unloadEventStart: Double

    /**
     * The unloadEventEnd read-only property returns a DOMHighResTimeStamp representing the time immediately after the
     * previous document's unload event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/unloadEventEnd)
     */
    open val unloadEventEnd: Double

    /**
     * The domInteractive read-only property returns a DOMHighResTimeStamp representing the time immediately before the
     * user agent sets the document's readyState to "interactive".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domInteractive)
     */
    open val domInteractive: Double

    /**
     * The domContentLoadedEventStart read-only property returns a DOMHighResTimeStamp representing the time immediately
     * before the current document's DOMContentLoaded event handler starts.
     *
     * [MDN
     * Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventStart)
     */
    open val domContentLoadedEventStart: Double

    /**
     * The domContentLoadedEventEnd read-only property returns a DOMHighResTimeStamp representing the time immediately
     * after the current document's DOMContentLoaded event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domContentLoadedEventEnd)
     */
    open val domContentLoadedEventEnd: Double

    /**
     * The domComplete read-only property returns a DOMHighResTimeStamp representing the time immediately before the
     * user agent sets the document's readyState to "complete".
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/domComplete)
     */
    open val domComplete: Double

    /**
     * The loadEventStart read-only property returns a DOMHighResTimeStamp representing the time immediately before the
     * current document's load event handler starts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventStart)
     */
    open val loadEventStart: Double

    /**
     * The loadEventEnd read-only property returns a DOMHighResTimeStamp representing the time immediately after the
     * current document's load event handler completes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/loadEventEnd)
     */
    open val loadEventEnd: Double

    /**
     * The type read-only property returns the type of navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/type)
     */
    open val type: NavigationTimingType

    /**
     * The redirectCount read-only property returns a number representing the number of redirects since the last
     * non-redirect navigation in the current browsing context.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/redirectCount)
     */
    open val redirectCount: Short

    /**
     * A website can indicate that a particular Client Hint is critical to the page by including it in a Critical-CH
     * HTTP response header (as well as the Accept-CH HTTP request header which is needed for all client hints whether
     * critical or not). Doing so will trigger a connection restart if the hint listed in the Critical-CH HTTP response
     * header could have been, but wasn't, included in the HTTP request initially sent. If the browser does not support
     * that client hint, it is ignored and no connection restart occurs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/criticalCHRestart)
     */
    open val criticalCHRestart: Double

    /**
     * The notRestoredReasons read-only property of the PerformanceNavigationTiming interface returns a
     * NotRestoredReasons object providing report data on the reasons why the current document was blocked from using
     * the back/forward cache (bfcache) on navigation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/notRestoredReasons)
     */
    open val notRestoredReasons: NotRestoredReasons?

    /**
     * The confidence read-only property of the PerformanceNavigationTiming interface returns a
     * PerformanceTimingConfidence object containing information that indicates whether a performance record reflects
     * typical application performance, or is likely affected by external factors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/confidence)
     */
    open val confidence: PerformanceTimingConfidence

    /**
     * The toJSON() method of the PerformanceNavigationTiming interface returns a JSON-serializable plain object
     * representing the PerformanceNavigationTiming object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigationTiming/toJSON)
     */
    override fun toJSON(): JsAny
}

public external interface NavigationTimingType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NavigationTimingType.Companion.NAVIGATE: NavigationTimingType get() = "navigate".toJsString().unsafeCast<NavigationTimingType>()
public inline val NavigationTimingType.Companion.RELOAD: NavigationTimingType get() = "reload".toJsString().unsafeCast<NavigationTimingType>()
public inline val NavigationTimingType.Companion.BACK_FORWARD: NavigationTimingType get() = "back_forward".toJsString().unsafeCast<NavigationTimingType>()

/**
 * The PerformanceTimingConfidence interface provides access to information that indicates whether a performance record
 * reflects typical application performance, or is likely affected by external factors.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTimingConfidence)
 */
public external abstract class PerformanceTimingConfidence : JsAny {
    /**
     * The randomizedTriggerRate read-only property of the PerformanceTimingConfidence interface indicates how often
     * noise is applied when exposing the PerformanceTimingConfidence.value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTimingConfidence/randomizedTriggerRate)
     */
    open val randomizedTriggerRate: Double

    /**
     * The value read-only property of the PerformanceTimingConfidence interface is a broad confidence measure of
     * whether a performance record reflects typical application performance, or is likely affected by external factors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTimingConfidence/value)
     */
    open val value: PerformanceTimingConfidenceValue

    /**
     * The toJSON() method of the PerformanceTimingConfidence interface returns a JSON-serializable plain object
     * representing the PerformanceTimingConfidence object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTimingConfidence/toJSON)
     */
    open fun toJSON(): JsAny
}

public external interface PerformanceTimingConfidenceValue : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val PerformanceTimingConfidenceValue.Companion.HIGH: PerformanceTimingConfidenceValue get() = "high".toJsString().unsafeCast<PerformanceTimingConfidenceValue>()
public inline val PerformanceTimingConfidenceValue.Companion.LOW: PerformanceTimingConfidenceValue get() = "low".toJsString().unsafeCast<PerformanceTimingConfidenceValue>()

/**
 * The PerformanceTiming interface is a legacy interface kept for backwards compatibility and contains properties that
 * offer performance timing information for various events which occur during the loading and use of the current page.
 * You get a PerformanceTiming object describing your page using the window.performance.timing property.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming)
 */
public external abstract class PerformanceTiming : JsAny {
    /**
     * The legacy PerformanceTiming.navigationStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, right after the prompt for unload terminates on the previous
     * document in the same browsing context. If there is no previous document, this value will be the same as
     * PerformanceTiming.fetchStart.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/navigationStart)
     */
    open val navigationStart: Double

    /**
     * The legacy PerformanceTiming.unloadEventStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, the unload event has been thrown. If there is no previous document,
     * or if the previous document, or one of the needed redirects, is not of the same origin, the value returned is 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/unloadEventStart)
     */
    open val unloadEventStart: Double

    /**
     * The legacy PerformanceTiming.unloadEventEnd read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, the unload event handler finishes. If there is no previous
     * document, or if the previous document, or one of the needed redirects, is not of the same origin, the value
     * returned is 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/unloadEventEnd)
     */
    open val unloadEventEnd: Double

    /**
     * The legacy PerformanceTiming.redirectStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, the first HTTP redirect starts. If there is no redirect, or if one
     * of the redirects is not of the same origin, the value returned is 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/redirectStart)
     */
    open val redirectStart: Double

    /**
     * The legacy PerformanceTiming.redirectEnd read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, the last HTTP redirect is completed, that is when the last byte of
     * the HTTP response has been received. If there is no redirect, or if one of the redirect is not of the same
     * origin, the value returned is 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/redirectEnd)
     */
    open val redirectEnd: Double

    /**
     * The legacy PerformanceTiming.fetchStart read-only property returns an unsigned long long representing the moment,
     * in milliseconds since the UNIX epoch, the browser is ready to fetch the document using an HTTP request. This
     * moment is before the check to any application cache.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/fetchStart)
     */
    open val fetchStart: Double

    /**
     * The legacy PerformanceTiming.domainLookupStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, where the domain lookup starts. If a persistent connection is used,
     * or the information is stored in a cache or a local resource, the value will be the same as
     * PerformanceTiming.fetchStart.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domainLookupStart)
     */
    open val domainLookupStart: Double

    /**
     * The legacy PerformanceTiming.domainLookupEnd read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, where the domain lookup is finished. If a persistent connection is
     * used, or the information is stored in a cache or a local resource, the value will be the same as
     * PerformanceTiming.fetchStart.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domainLookupEnd)
     */
    open val domainLookupEnd: Double

    /**
     * The legacy PerformanceTiming.connectStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, where the request to open a connection is sent to the network. If
     * the transport layer reports an error and the connection establishment is started again, the last connection
     * establishment start time is given. If a persistent connection is used, the value will be the same as
     * PerformanceTiming.fetchStart.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/connectStart)
     */
    open val connectStart: Double

    /**
     * The legacy PerformanceTiming.connectEnd read-only property returns an unsigned long long representing the moment,
     * in milliseconds since the UNIX epoch, where the connection is opened network. If the transport layer reports an
     * error and the connection establishment is started again, the last connection establishment end time is given. If
     * a persistent connection is used, the value will be the same as PerformanceTiming.fetchStart. A connection is
     * considered as opened when all secure connection handshake, or SOCKS authentication, is terminated.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/connectEnd)
     */
    open val connectEnd: Double

    /**
     * The legacy PerformanceTiming.secureConnectionStart read-only property returns an unsigned long long representing
     * the moment, in milliseconds since the UNIX epoch, where the secure connection handshake starts. If no such
     * connection is requested, it returns 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/secureConnectionStart)
     */
    open val secureConnectionStart: Double

    /**
     * The legacy PerformanceTiming.requestStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, when the browser sent the request to obtain the actual document,
     * from the server or from a cache. If the transport layer fails after the start of the request and the connection
     * is reopened, this property will be set to the time corresponding to the new request.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/requestStart)
     */
    open val requestStart: Double

    /**
     * The legacy PerformanceTiming.responseStart read-only property returns an unsigned long long representing the
     * moment in time (in milliseconds since the UNIX epoch) when the browser received the first byte of the response
     * from the server, cache, or local resource.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/responseStart)
     */
    open val responseStart: Double

    /**
     * The legacy PerformanceTiming.responseEnd read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, when the browser received the last byte of the response, or when
     * the connection is closed if this happened first, from the server from a cache or from a local resource.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/responseEnd)
     */
    open val responseEnd: Double

    /**
     * The legacy PerformanceTiming.domLoading read-only property returns an unsigned long long representing the moment,
     * in milliseconds since the UNIX epoch, when the parser started its work, that is when its Document.readyState
     * changes to 'loading' and the corresponding readystatechange event is thrown.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domLoading)
     */
    open val domLoading: Double

    /**
     * The legacy PerformanceTiming.domInteractive read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, when the parser finished its work on the main document, that is
     * when its Document.readyState changes to 'interactive' and the corresponding readystatechange event is thrown.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domInteractive)
     */
    open val domInteractive: Double

    /**
     * The legacy PerformanceTiming.domContentLoadedEventStart read-only property returns an unsigned long long
     * representing the moment, in milliseconds since the UNIX epoch, right before the parser sent the DOMContentLoaded
     * event, that is right after all the scripts that need to be executed right after parsing has been executed.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domContentLoadedEventStart)
     */
    open val domContentLoadedEventStart: Double

    /**
     * The legacy PerformanceTiming.domContentLoadedEventEnd read-only property returns an unsigned long long
     * representing the moment, in milliseconds since the UNIX epoch, right after all the scripts that need to be
     * executed as soon as possible, in order or not, has been executed.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domContentLoadedEventEnd)
     */
    open val domContentLoadedEventEnd: Double

    /**
     * The legacy PerformanceTiming.domComplete read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, when the parser finished its work on the main document, that is
     * when its Document.readyState changes to 'complete' and the corresponding readystatechange event is thrown.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/domComplete)
     */
    open val domComplete: Double

    /**
     * The legacy PerformanceTiming.loadEventStart read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, when the load event was sent for the current document. If this
     * event has not yet been sent, it returns 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/loadEventStart)
     */
    open val loadEventStart: Double

    /**
     * The legacy PerformanceTiming.loadEventEnd read-only property returns an unsigned long long representing the
     * moment, in milliseconds since the UNIX epoch, when the load event handler terminated, that is when the load event
     * is completed. If this event has not yet been sent, or is not yet completed, it returns 0.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/loadEventEnd)
     */
    open val loadEventEnd: Double

    /**
     * The toJSON() method of the PerformanceTiming interface returns a JSON-serializable plain object representing the
     * PerformanceTiming object.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceTiming/toJSON)
     */
    open fun toJSON(): JsAny
}

/**
 * The legacy PerformanceNavigation interface represents information about how the navigation to the current document
 * was done.
 *
 * Deprecated: MDN no longer recommends using this feature.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation)
 */
public external abstract class PerformanceNavigation : JsAny {
    /**
     * The legacy PerformanceNavigation.type read-only property returns an unsigned short containing a constant
     * describing how the navigation to this page was done.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/type)
     */
    open val type: Short

    /**
     * The legacy PerformanceNavigation.redirectCount read-only property returns an unsigned short representing the
     * number of REDIRECTs done before reaching the page.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/redirectCount)
     */
    open val redirectCount: Short

    /**
     * The toJSON() method of the PerformanceNavigation interface returns a JSON-serializable plain object representing
     * the PerformanceNavigation object.
     *
     * Deprecated: MDN no longer recommends using this feature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation/toJSON)
     */
    open fun toJSON(): JsAny

    companion object {
        val TYPE_NAVIGATE: Short
        val TYPE_RELOAD: Short
        val TYPE_BACK_FORWARD: Short
        val TYPE_RESERVED: Short
    }
}
