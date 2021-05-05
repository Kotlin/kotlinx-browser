/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.storage

import kotlin.js.*
import org.khronos.webgl.*

public external abstract class StorageManager {
    fun persisted(): Promise<Boolean>
    fun persist(): Promise<Boolean>
    fun estimate(): Promise<StorageEstimate>
}

public external interface StorageEstimate {
    var usage: Number?
        get() = definedExternally
        set(value) = definedExternally
    var quota: Number?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun StorageEstimate(usage: Number? = undefined, quota: Number? = undefined): StorageEstimate {
    val o = js("({})")
    o["usage"] = usage
    o["quota"] = quota
    return o
}