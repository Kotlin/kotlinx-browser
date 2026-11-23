/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'navigation-timing', DO NOT EDIT!
// See generator/src/main/kotlin/idl/generateWebApi.kt for details.

package org.w3c.performance

import kotlin.js.*
import org.w3c.dom.*

public external abstract class PerformanceNavigationTiming : PerformanceResourceTiming {
    open val unloadEventStart: Double
    open val unloadEventEnd: Double
    open val domInteractive: Double
    open val domContentLoadedEventStart: Double
    open val domContentLoadedEventEnd: Double
    open val domComplete: Double
    open val loadEventStart: Double
    open val loadEventEnd: Double
    open val type: NavigationTimingType
    open val redirectCount: Short
    open val criticalCHRestart: Double
    open val notRestoredReasons: NotRestoredReasons?
    open val confidence: PerformanceTimingConfidence
    override fun toJSON(): JsAny
}

public external interface NavigationTimingType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val NavigationTimingType.Companion.NAVIGATE: NavigationTimingType get() = "navigate".toJsString().unsafeCast<NavigationTimingType>()
public inline val NavigationTimingType.Companion.RELOAD: NavigationTimingType get() = "reload".toJsString().unsafeCast<NavigationTimingType>()
public inline val NavigationTimingType.Companion.BACK_FORWARD: NavigationTimingType get() = "back_forward".toJsString().unsafeCast<NavigationTimingType>()

public external abstract class PerformanceTimingConfidence : JsAny {
    open val randomizedTriggerRate: Double
    open val value: PerformanceTimingConfidenceValue
    open fun toJSON(): JsAny
}

public external interface PerformanceTimingConfidenceValue : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val PerformanceTimingConfidenceValue.Companion.HIGH: PerformanceTimingConfidenceValue get() = "high".toJsString().unsafeCast<PerformanceTimingConfidenceValue>()
public inline val PerformanceTimingConfidenceValue.Companion.LOW: PerformanceTimingConfidenceValue get() = "low".toJsString().unsafeCast<PerformanceTimingConfidenceValue>()

public external abstract class PerformanceTiming : JsAny {
    open val navigationStart: Double
    open val unloadEventStart: Double
    open val unloadEventEnd: Double
    open val redirectStart: Double
    open val redirectEnd: Double
    open val fetchStart: Double
    open val domainLookupStart: Double
    open val domainLookupEnd: Double
    open val connectStart: Double
    open val connectEnd: Double
    open val secureConnectionStart: Double
    open val requestStart: Double
    open val responseStart: Double
    open val responseEnd: Double
    open val domLoading: Double
    open val domInteractive: Double
    open val domContentLoadedEventStart: Double
    open val domContentLoadedEventEnd: Double
    open val domComplete: Double
    open val loadEventStart: Double
    open val loadEventEnd: Double
    open fun toJSON(): JsAny
}

public external abstract class PerformanceNavigation : JsAny {
    open val type: Short
    open val redirectCount: Short
    open fun toJSON(): JsAny

    companion object {
        val TYPE_NAVIGATE: Short
        val TYPE_RELOAD: Short
        val TYPE_BACK_FORWARD: Short
        val TYPE_RESERVED: Short
    }
}
