/*
 * Copyright 2010-2025 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

@file:Suppress("EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE", "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE", "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION", "JS_NAME_CLASH", "EXPECT_ACTUAL_IR_INCOMPATIBILITY", "EXPECT_ACTUAL_IR_MISMATCH", "AMBIGUOUS_ACTUALS", "WRONG_JS_INTEROP_TYPE")
package org.w3c.performance

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.events.*
import org.w3c.undefined

/**
 * Exposes the JavaScript [Performance](https://developer.mozilla.org/en/docs/Web/API/Performance) to Kotlin
 */
public actual external abstract class Performance : EventTarget, JsAny {
    actual open val timing: PerformanceTiming
    actual open val navigation: PerformanceNavigation
    actual fun now(): Double
}

public actual external interface GlobalPerformance : JsAny {
    actual val performance: Performance
}

/**
 * Exposes the JavaScript [PerformanceTiming](https://developer.mozilla.org/en/docs/Web/API/PerformanceTiming) to Kotlin
 */
public actual external abstract class PerformanceTiming : JsAny {
    actual open val navigationStart: JsNumber
    actual open val unloadEventStart: JsNumber
    actual open val unloadEventEnd: JsNumber
    actual open val redirectStart: JsNumber
    actual open val redirectEnd: JsNumber
    actual open val fetchStart: JsNumber
    actual open val domainLookupStart: JsNumber
    actual open val domainLookupEnd: JsNumber
    actual open val connectStart: JsNumber
    actual open val connectEnd: JsNumber
    actual open val secureConnectionStart: JsNumber
    actual open val requestStart: JsNumber
    actual open val responseStart: JsNumber
    actual open val responseEnd: JsNumber
    actual open val domLoading: JsNumber
    actual open val domInteractive: JsNumber
    actual open val domContentLoadedEventStart: JsNumber
    actual open val domContentLoadedEventEnd: JsNumber
    actual open val domComplete: JsNumber
    actual open val loadEventStart: JsNumber
    actual open val loadEventEnd: JsNumber
}

/**
 * Exposes the JavaScript [PerformanceNavigation](https://developer.mozilla.org/en/docs/Web/API/PerformanceNavigation) to Kotlin
 */
public actual external abstract class PerformanceNavigation : JsAny {
    actual open val type: Short
    actual open val redirectCount: Short

    actual companion object {
        actual val TYPE_NAVIGATE: Short
        actual val TYPE_RELOAD: Short
        actual val TYPE_BACK_FORWARD: Short
        actual val TYPE_RESERVED: Short
    }
}