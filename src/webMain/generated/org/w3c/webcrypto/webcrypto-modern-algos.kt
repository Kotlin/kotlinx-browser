/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webcrypto-modern-algos', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.webcrypto

import kotlin.js.*
import kotlinx.browser.typedarrays.*
import org.w3c.dom.*

public external interface KeyFormat : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val KeyFormat.Companion.RAW_PUBLIC: KeyFormat get() = "raw-public".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.RAW_PRIVATE: KeyFormat get() = "raw-private".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.RAW_SEED: KeyFormat get() = "raw-seed".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.RAW_SECRET: KeyFormat get() = "raw-secret".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.RAW: KeyFormat get() = "raw".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.SPKI: KeyFormat get() = "spki".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.PKCS8: KeyFormat get() = "pkcs8".toJsString().unsafeCast<KeyFormat>()
public inline val KeyFormat.Companion.JWK: KeyFormat get() = "jwk".toJsString().unsafeCast<KeyFormat>()

public external interface KeyUsage : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val KeyUsage.Companion.ENCRYPT: KeyUsage get() = "encrypt".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.DECRYPT: KeyUsage get() = "decrypt".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.SIGN: KeyUsage get() = "sign".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.VERIFY: KeyUsage get() = "verify".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.DERIVE_KEY: KeyUsage get() = "deriveKey".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.DERIVE_BITS: KeyUsage get() = "deriveBits".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.WRAP_KEY: KeyUsage get() = "wrapKey".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.UNWRAP_KEY: KeyUsage get() = "unwrapKey".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.ENCAPSULATE_KEY: KeyUsage get() = "encapsulateKey".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.ENCAPSULATE_BITS: KeyUsage get() = "encapsulateBits".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.DECAPSULATE_KEY: KeyUsage get() = "decapsulateKey".toJsString().unsafeCast<KeyUsage>()
public inline val KeyUsage.Companion.DECAPSULATE_BITS: KeyUsage get() = "decapsulateBits".toJsString().unsafeCast<KeyUsage>()

public external interface EncapsulatedKey : JsAny {
    public var sharedKey: CryptoKey?
    public var ciphertext: ArrayBuffer?
}

public fun EncapsulatedKey(sharedKey: CryptoKey? = null, ciphertext: ArrayBuffer? = null): EncapsulatedKey {
    val dictionary = newJsObject<EncapsulatedKey>()
    if (sharedKey != null) dictionary.sharedKey = sharedKey
    if (ciphertext != null) dictionary.ciphertext = ciphertext
    return dictionary
}

public external interface EncapsulatedBits : JsAny {
    public var sharedKey: ArrayBuffer?
    public var ciphertext: ArrayBuffer?
}

public fun EncapsulatedBits(sharedKey: ArrayBuffer? = null, ciphertext: ArrayBuffer? = null): EncapsulatedBits {
    val dictionary = newJsObject<EncapsulatedBits>()
    if (sharedKey != null) dictionary.sharedKey = sharedKey
    if (ciphertext != null) dictionary.ciphertext = ciphertext
    return dictionary
}

public external interface ContextParams : Algorithm {
    public var context: BufferDataSource?
}

public fun ContextParams(name: String, context: BufferDataSource? = null): ContextParams {
    val dictionary = newJsObject<ContextParams>()
    dictionary.name = name
    if (context != null) dictionary.context = context
    return dictionary
}

public external interface AeadParams : Algorithm {
    public var iv: BufferDataSource
    public var additionalData: BufferDataSource?
    public var tagLength: Byte?
}

public fun AeadParams(name: String, iv: BufferDataSource, additionalData: BufferDataSource? = null, tagLength: Byte? = null): AeadParams {
    val dictionary = newJsObject<AeadParams>()
    dictionary.name = name
    dictionary.iv = iv
    if (additionalData != null) dictionary.additionalData = additionalData
    if (tagLength != null) dictionary.tagLength = tagLength
    return dictionary
}

public external interface CShakeParams : Algorithm {
    public var outputLength: Int
    public var functionName: BufferDataSource?
    public var customization: BufferDataSource?
}

public fun CShakeParams(name: String, outputLength: Int, functionName: BufferDataSource? = null, customization: BufferDataSource? = null): CShakeParams {
    val dictionary = newJsObject<CShakeParams>()
    dictionary.name = name
    dictionary.outputLength = outputLength
    if (functionName != null) dictionary.functionName = functionName
    if (customization != null) dictionary.customization = customization
    return dictionary
}

public external interface TurboShakeParams : Algorithm {
    public var outputLength: Int
    public var domainSeparation: Byte?
}

public fun TurboShakeParams(name: String, outputLength: Int, domainSeparation: Byte? = null): TurboShakeParams {
    val dictionary = newJsObject<TurboShakeParams>()
    dictionary.name = name
    dictionary.outputLength = outputLength
    if (domainSeparation != null) dictionary.domainSeparation = domainSeparation
    return dictionary
}

public external interface KangarooTwelveParams : Algorithm {
    public var outputLength: Int
    public var customization: BufferDataSource?
}

public fun KangarooTwelveParams(name: String, outputLength: Int, customization: BufferDataSource? = null): KangarooTwelveParams {
    val dictionary = newJsObject<KangarooTwelveParams>()
    dictionary.name = name
    dictionary.outputLength = outputLength
    if (customization != null) dictionary.customization = customization
    return dictionary
}

public external interface KmacKeyGenParams : Algorithm {
    public var length: Int?
}

public fun KmacKeyGenParams(name: String, length: Int? = null): KmacKeyGenParams {
    val dictionary = newJsObject<KmacKeyGenParams>()
    dictionary.name = name
    if (length != null) dictionary.length = length
    return dictionary
}

public external interface KmacImportParams : Algorithm {
    public var length: Int?
}

public fun KmacImportParams(name: String, length: Int? = null): KmacImportParams {
    val dictionary = newJsObject<KmacImportParams>()
    dictionary.name = name
    if (length != null) dictionary.length = length
    return dictionary
}

public external interface KmacKeyAlgorithm : KeyAlgorithm {
    public var length: Int
}

public fun KmacKeyAlgorithm(name: String, length: Int): KmacKeyAlgorithm {
    val dictionary = newJsObject<KmacKeyAlgorithm>()
    dictionary.name = name
    dictionary.length = length
    return dictionary
}

public external interface KmacParams : Algorithm {
    public var outputLength: Int
    public var customization: BufferDataSource?
}

public fun KmacParams(name: String, outputLength: Int, customization: BufferDataSource? = null): KmacParams {
    val dictionary = newJsObject<KmacParams>()
    dictionary.name = name
    dictionary.outputLength = outputLength
    if (customization != null) dictionary.customization = customization
    return dictionary
}

public external interface Argon2Params : Algorithm {
    public var nonce: BufferDataSource
    public var parallelism: Int
    public var memory: Int
    public var passes: Int
    public var version: Byte?
    public var secretValue: BufferDataSource?
    public var associatedData: BufferDataSource?
}

public fun Argon2Params(name: String, nonce: BufferDataSource, parallelism: Int, memory: Int, passes: Int, version: Byte? = null, secretValue: BufferDataSource? = null, associatedData: BufferDataSource? = null): Argon2Params {
    val dictionary = newJsObject<Argon2Params>()
    dictionary.name = name
    dictionary.nonce = nonce
    dictionary.parallelism = parallelism
    dictionary.memory = memory
    dictionary.passes = passes
    if (version != null) dictionary.version = version
    if (secretValue != null) dictionary.secretValue = secretValue
    if (associatedData != null) dictionary.associatedData = associatedData
    return dictionary
}
