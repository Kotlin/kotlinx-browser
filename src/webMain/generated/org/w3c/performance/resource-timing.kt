/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'resource-timing', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*

public external abstract class PerformanceResourceTiming : PerformanceEntry {
    open val initiatorType: String
    open val deliveryType: String
    open val nextHopProtocol: String
    open val workerStart: Double
    open val redirectStart: Double
    open val redirectEnd: Double
    open val fetchStart: Double
    open val domainLookupStart: Double
    open val domainLookupEnd: Double
    open val connectStart: Double
    open val connectEnd: Double
    open val secureConnectionStart: Double
    open val requestStart: Double
    open val finalResponseHeadersStart: Double
    open val firstInterimResponseStart: Double
    open val responseStart: Double
    open val responseEnd: Double
    open val workerRouterEvaluationStart: Double
    open val workerCacheLookupStart: Double
    open val workerMatchedRouterSource: String
    open val workerFinalRouterSource: String
    open val transferSize: Double
    open val encodedBodySize: Double
    open val decodedBodySize: Double
    open val responseStatus: Short
    open val renderBlockingStatus: RenderBlockingStatusType
    open val contentType: String
    open val contentEncoding: String
    override fun toJSON(): JsAny
}

public external interface RenderBlockingStatusType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val RenderBlockingStatusType.Companion.BLOCKING: RenderBlockingStatusType get() = "blocking".toJsString().unsafeCast<RenderBlockingStatusType>()
public inline val RenderBlockingStatusType.Companion.NON_BLOCKING: RenderBlockingStatusType get() = "non-blocking".toJsString().unsafeCast<RenderBlockingStatusType>()
