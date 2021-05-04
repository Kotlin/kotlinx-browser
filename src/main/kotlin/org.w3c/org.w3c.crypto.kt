/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.crypto

import kotlin.js.*
import org.khronos.webgl.*

public external interface GlobalCrypto {
    val crypto: Crypto
}

public external abstract class Crypto {
    open val subtle: SubtleCrypto
    fun getRandomValues(array: ArrayBufferView): ArrayBufferView
}

public external interface Algorithm {
    var name: String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun Algorithm(name: String?): Algorithm {
    val o = js("({})")
    o["name"] = name
    return o
}

public external interface KeyAlgorithm {
    var name: String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun KeyAlgorithm(name: String?): KeyAlgorithm {
    val o = js("({})")
    o["name"] = name
    return o
}

public external abstract class CryptoKey {
    open val type: KeyType
    open val extractable: Boolean
    open val algorithm: dynamic
    open val usages: dynamic
}

public external abstract class SubtleCrypto {
    fun encrypt(algorithm: dynamic, key: CryptoKey, data: dynamic): Promise<Any?>
    fun decrypt(algorithm: dynamic, key: CryptoKey, data: dynamic): Promise<Any?>
    fun sign(algorithm: dynamic, key: CryptoKey, data: dynamic): Promise<Any?>
    fun verify(algorithm: dynamic, key: CryptoKey, signature: dynamic, data: dynamic): Promise<Any?>
    fun digest(algorithm: dynamic, data: dynamic): Promise<Any?>
    fun generateKey(algorithm: dynamic, extractable: Boolean, keyUsages: Array<KeyUsage>): Promise<Any?>
    fun deriveKey(algorithm: dynamic, baseKey: CryptoKey, derivedKeyType: dynamic, extractable: Boolean, keyUsages: Array<KeyUsage>): Promise<Any?>
    fun deriveBits(algorithm: dynamic, baseKey: CryptoKey, length: Int): Promise<ArrayBuffer>
    fun importKey(format: KeyFormat, keyData: dynamic, algorithm: dynamic, extractable: Boolean, keyUsages: Array<KeyUsage>): Promise<CryptoKey>
    fun exportKey(format: KeyFormat, key: CryptoKey): Promise<Any?>
    fun wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: dynamic): Promise<Any?>
    fun unwrapKey(format: KeyFormat, wrappedKey: dynamic, unwrappingKey: CryptoKey, unwrapAlgorithm: dynamic, unwrappedKeyAlgorithm: dynamic, extractable: Boolean, keyUsages: Array<KeyUsage>): Promise<CryptoKey>
}

public external interface RsaOtherPrimesInfo {
    var r: String?
        get() = definedExternally
        set(value) = definedExternally
    var d: String?
        get() = definedExternally
        set(value) = definedExternally
    var t: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaOtherPrimesInfo(r: String? = undefined, d: String? = undefined, t: String? = undefined): RsaOtherPrimesInfo {
    val o = js("({})")
    o["r"] = r
    o["d"] = d
    o["t"] = t
    return o
}

public external interface JsonWebKey {
    var kty: String?
        get() = definedExternally
        set(value) = definedExternally
    var use: String?
        get() = definedExternally
        set(value) = definedExternally
    var key_ops: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var alg: String?
        get() = definedExternally
        set(value) = definedExternally
    var ext: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var crv: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: String?
        get() = definedExternally
        set(value) = definedExternally
    var y: String?
        get() = definedExternally
        set(value) = definedExternally
    var d: String?
        get() = definedExternally
        set(value) = definedExternally
    var n: String?
        get() = definedExternally
        set(value) = definedExternally
    var e: String?
        get() = definedExternally
        set(value) = definedExternally
    var p: String?
        get() = definedExternally
        set(value) = definedExternally
    var q: String?
        get() = definedExternally
        set(value) = definedExternally
    var dp: String?
        get() = definedExternally
        set(value) = definedExternally
    var dq: String?
        get() = definedExternally
        set(value) = definedExternally
    var qi: String?
        get() = definedExternally
        set(value) = definedExternally
    var oth: Array<RsaOtherPrimesInfo>?
        get() = definedExternally
        set(value) = definedExternally
    var k: String?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun JsonWebKey(kty: String? = undefined, use: String? = undefined, key_ops: Array<String>? = undefined, alg: String? = undefined, ext: Boolean? = undefined, crv: String? = undefined, x: String? = undefined, y: String? = undefined, d: String? = undefined, n: String? = undefined, e: String? = undefined, p: String? = undefined, q: String? = undefined, dp: String? = undefined, dq: String? = undefined, qi: String? = undefined, oth: Array<RsaOtherPrimesInfo>? = undefined, k: String? = undefined): JsonWebKey {
    val o = js("({})")
    o["kty"] = kty
    o["use"] = use
    o["key_ops"] = key_ops
    o["alg"] = alg
    o["ext"] = ext
    o["crv"] = crv
    o["x"] = x
    o["y"] = y
    o["d"] = d
    o["n"] = n
    o["e"] = e
    o["p"] = p
    o["q"] = q
    o["dp"] = dp
    o["dq"] = dq
    o["qi"] = qi
    o["oth"] = oth
    o["k"] = k
    return o
}

public external interface CryptoKeyPair {
    var publicKey: CryptoKey?
        get() = definedExternally
        set(value) = definedExternally
    var privateKey: CryptoKey?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun CryptoKeyPair(publicKey: CryptoKey? = undefined, privateKey: CryptoKey? = undefined): CryptoKeyPair {
    val o = js("({})")
    o["publicKey"] = publicKey
    o["privateKey"] = privateKey
    return o
}

public external interface RsaKeyGenParams : Algorithm {
    var modulusLength: Int?
    var publicExponent: Uint8Array?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaKeyGenParams(modulusLength: Int?, publicExponent: Uint8Array?, name: String?): RsaKeyGenParams {
    val o = js("({})")
    o["modulusLength"] = modulusLength
    o["publicExponent"] = publicExponent
    o["name"] = name
    return o
}

public external interface RsaHashedKeyGenParams : RsaKeyGenParams {
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaHashedKeyGenParams(hash: dynamic, modulusLength: Int?, publicExponent: Uint8Array?, name: String?): RsaHashedKeyGenParams {
    val o = js("({})")
    o["hash"] = hash
    o["modulusLength"] = modulusLength
    o["publicExponent"] = publicExponent
    o["name"] = name
    return o
}

public external interface RsaKeyAlgorithm : KeyAlgorithm {
    var modulusLength: Int?
    var publicExponent: Uint8Array?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaKeyAlgorithm(modulusLength: Int?, publicExponent: Uint8Array?, name: String?): RsaKeyAlgorithm {
    val o = js("({})")
    o["modulusLength"] = modulusLength
    o["publicExponent"] = publicExponent
    o["name"] = name
    return o
}

public external interface RsaHashedKeyAlgorithm : RsaKeyAlgorithm {
    var hash: KeyAlgorithm?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaHashedKeyAlgorithm(hash: KeyAlgorithm?, modulusLength: Int?, publicExponent: Uint8Array?, name: String?): RsaHashedKeyAlgorithm {
    val o = js("({})")
    o["hash"] = hash
    o["modulusLength"] = modulusLength
    o["publicExponent"] = publicExponent
    o["name"] = name
    return o
}

public external interface RsaHashedImportParams : Algorithm {
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaHashedImportParams(hash: dynamic, name: String?): RsaHashedImportParams {
    val o = js("({})")
    o["hash"] = hash
    o["name"] = name
    return o
}

public external interface RsaPssParams : Algorithm {
    var saltLength: Int?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaPssParams(saltLength: Int?, name: String?): RsaPssParams {
    val o = js("({})")
    o["saltLength"] = saltLength
    o["name"] = name
    return o
}

public external interface RsaOaepParams : Algorithm {
    var label: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun RsaOaepParams(label: dynamic = undefined, name: String?): RsaOaepParams {
    val o = js("({})")
    o["label"] = label
    o["name"] = name
    return o
}

public external interface EcdsaParams : Algorithm {
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun EcdsaParams(hash: dynamic, name: String?): EcdsaParams {
    val o = js("({})")
    o["hash"] = hash
    o["name"] = name
    return o
}

public external interface EcKeyGenParams : Algorithm {
    var namedCurve: String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun EcKeyGenParams(namedCurve: String?, name: String?): EcKeyGenParams {
    val o = js("({})")
    o["namedCurve"] = namedCurve
    o["name"] = name
    return o
}

public external interface EcKeyAlgorithm : KeyAlgorithm {
    var namedCurve: String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun EcKeyAlgorithm(namedCurve: String?, name: String?): EcKeyAlgorithm {
    val o = js("({})")
    o["namedCurve"] = namedCurve
    o["name"] = name
    return o
}

public external interface EcKeyImportParams : Algorithm {
    var namedCurve: String?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun EcKeyImportParams(namedCurve: String?, name: String?): EcKeyImportParams {
    val o = js("({})")
    o["namedCurve"] = namedCurve
    o["name"] = name
    return o
}

public external interface EcdhKeyDeriveParams : Algorithm {
    var public: CryptoKey?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun EcdhKeyDeriveParams(public: CryptoKey?, name: String?): EcdhKeyDeriveParams {
    val o = js("({})")
    o["public"] = public
    o["name"] = name
    return o
}

public external interface AesCtrParams : Algorithm {
    var counter: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var length: Byte?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun AesCtrParams(counter: dynamic, length: Byte?, name: String?): AesCtrParams {
    val o = js("({})")
    o["counter"] = counter
    o["length"] = length
    o["name"] = name
    return o
}

public external interface AesKeyAlgorithm : KeyAlgorithm {
    var length: Short?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun AesKeyAlgorithm(length: Short?, name: String?): AesKeyAlgorithm {
    val o = js("({})")
    o["length"] = length
    o["name"] = name
    return o
}

public external interface AesKeyGenParams : Algorithm {
    var length: Short?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun AesKeyGenParams(length: Short?, name: String?): AesKeyGenParams {
    val o = js("({})")
    o["length"] = length
    o["name"] = name
    return o
}

public external interface AesDerivedKeyParams : Algorithm {
    var length: Short?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun AesDerivedKeyParams(length: Short?, name: String?): AesDerivedKeyParams {
    val o = js("({})")
    o["length"] = length
    o["name"] = name
    return o
}

public external interface AesCbcParams : Algorithm {
    var iv: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun AesCbcParams(iv: dynamic, name: String?): AesCbcParams {
    val o = js("({})")
    o["iv"] = iv
    o["name"] = name
    return o
}

public external interface AesGcmParams : Algorithm {
    var iv: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var additionalData: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var tagLength: Byte?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun AesGcmParams(iv: dynamic, additionalData: dynamic = undefined, tagLength: Byte? = undefined, name: String?): AesGcmParams {
    val o = js("({})")
    o["iv"] = iv
    o["additionalData"] = additionalData
    o["tagLength"] = tagLength
    o["name"] = name
    return o
}

public external interface HmacImportParams : Algorithm {
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var length: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun HmacImportParams(hash: dynamic, length: Int? = undefined, name: String?): HmacImportParams {
    val o = js("({})")
    o["hash"] = hash
    o["length"] = length
    o["name"] = name
    return o
}

public external interface HmacKeyAlgorithm : KeyAlgorithm {
    var hash: KeyAlgorithm?
    var length: Int?
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun HmacKeyAlgorithm(hash: KeyAlgorithm?, length: Int?, name: String?): HmacKeyAlgorithm {
    val o = js("({})")
    o["hash"] = hash
    o["length"] = length
    o["name"] = name
    return o
}

public external interface HmacKeyGenParams : Algorithm {
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var length: Int?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun HmacKeyGenParams(hash: dynamic, length: Int? = undefined, name: String?): HmacKeyGenParams {
    val o = js("({})")
    o["hash"] = hash
    o["length"] = length
    o["name"] = name
    return o
}

public external interface HkdfParams : Algorithm {
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var salt: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var info: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun HkdfParams(hash: dynamic, salt: dynamic, info: dynamic, name: String?): HkdfParams {
    val o = js("({})")
    o["hash"] = hash
    o["salt"] = salt
    o["info"] = info
    o["name"] = name
    return o
}

public external interface Pbkdf2Params : Algorithm {
    var salt: dynamic
        get() = definedExternally
        set(value) = definedExternally
    var iterations: Int?
    var hash: dynamic
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun Pbkdf2Params(salt: dynamic, iterations: Int?, hash: dynamic, name: String?): Pbkdf2Params {
    val o = js("({})")
    o["salt"] = salt
    o["iterations"] = iterations
    o["hash"] = hash
    o["name"] = name
    return o
}

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface KeyType {
    companion object
}

public inline val KeyType.Companion.PUBLIC: KeyType get() = "public".asDynamic().unsafeCast<KeyType>()

public inline val KeyType.Companion.PRIVATE: KeyType get() = "private".asDynamic().unsafeCast<KeyType>()

public inline val KeyType.Companion.SECRET: KeyType get() = "secret".asDynamic().unsafeCast<KeyType>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface KeyUsage {
    companion object
}

public inline val KeyUsage.Companion.ENCRYPT: KeyUsage get() = "encrypt".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.DECRYPT: KeyUsage get() = "decrypt".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.SIGN: KeyUsage get() = "sign".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.VERIFY: KeyUsage get() = "verify".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.DERIVEKEY: KeyUsage get() = "deriveKey".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.DERIVEBITS: KeyUsage get() = "deriveBits".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.WRAPKEY: KeyUsage get() = "wrapKey".asDynamic().unsafeCast<KeyUsage>()

public inline val KeyUsage.Companion.UNWRAPKEY: KeyUsage get() = "unwrapKey".asDynamic().unsafeCast<KeyUsage>()

/* please, don't implement this interface! */
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface KeyFormat {
    companion object
}

public inline val KeyFormat.Companion.RAW: KeyFormat get() = "raw".asDynamic().unsafeCast<KeyFormat>()

public inline val KeyFormat.Companion.SPKI: KeyFormat get() = "spki".asDynamic().unsafeCast<KeyFormat>()

public inline val KeyFormat.Companion.PKCS8: KeyFormat get() = "pkcs8".asDynamic().unsafeCast<KeyFormat>()

public inline val KeyFormat.Companion.JWK: KeyFormat get() = "jwk".asDynamic().unsafeCast<KeyFormat>()