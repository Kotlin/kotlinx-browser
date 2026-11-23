/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'referrer-policy', DO NOT EDIT!

package org.w3c.fetch

import kotlin.js.*

public external interface ReferrerPolicy : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    companion object
}

public inline val ReferrerPolicy.Companion.EMPTY: ReferrerPolicy get() = "".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.NO_REFERRER: ReferrerPolicy get() = "no-referrer".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.NO_REFERRER_WHEN_DOWNGRADE: ReferrerPolicy get() = "no-referrer-when-downgrade".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.SAME_ORIGIN: ReferrerPolicy get() = "same-origin".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.ORIGIN: ReferrerPolicy get() = "origin".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.STRICT_ORIGIN: ReferrerPolicy get() = "strict-origin".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.ORIGIN_WHEN_CROSS_ORIGIN: ReferrerPolicy get() = "origin-when-cross-origin".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.STRICT_ORIGIN_WHEN_CROSS_ORIGIN: ReferrerPolicy get() = "strict-origin-when-cross-origin".toJsString().unsafeCast<ReferrerPolicy>()
public inline val ReferrerPolicy.Companion.UNSAFE_URL: ReferrerPolicy get() = "unsafe-url".toJsString().unsafeCast<ReferrerPolicy>()
