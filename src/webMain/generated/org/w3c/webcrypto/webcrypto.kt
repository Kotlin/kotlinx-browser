/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'webcrypto', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.webcrypto

import kotlin.js.*
import kotlinx.browser.typedarrays.*
import org.w3c.dom.*

/**
 * The Crypto interface represents basic cryptography features available in the current context. It allows access to a
 * cryptographically strong random number generator and to cryptographic primitives.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class Crypto : JsAny {
    /**
     * The Crypto.subtle read-only property returns a SubtleCrypto which can then be used to perform low-level
     * cryptographic operations.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/subtle)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val subtle: SubtleCrypto

    /**
     * The Crypto.getRandomValues() method lets you get cryptographically strong random values. The array given as the
     * parameter is filled with random numbers (random in its cryptographic meaning).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/getRandomValues)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getRandomValues(array: ArrayBufferView): ArrayBufferView

    /**
     * The randomUUID() method of the Crypto interface is used to generate a v4 UUID using a cryptographically secure
     * random number generator.
     *
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Crypto/randomUUID)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun randomUUID(): String
}

public external interface Algorithm : JsAny {
    public var name: String
}

public fun Algorithm(name: String): Algorithm {
    val dictionary = newJsObject<Algorithm>()
    dictionary.name = name
    return dictionary
}

public external interface KeyAlgorithm : JsAny {
    public var name: String
}

public fun KeyAlgorithm(name: String): KeyAlgorithm {
    val dictionary = newJsObject<KeyAlgorithm>()
    dictionary.name = name
    return dictionary
}

public external interface KeyType : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val KeyType.Companion.PUBLIC: KeyType get() = "public".toJsString().unsafeCast<KeyType>()
public inline val KeyType.Companion.PRIVATE: KeyType get() = "private".toJsString().unsafeCast<KeyType>()
public inline val KeyType.Companion.SECRET: KeyType get() = "secret".toJsString().unsafeCast<KeyType>()

/**
 * The CryptoKey interface of the Web Crypto API represents a cryptographic key obtained from one of the SubtleCrypto
 * methods generateKey(), deriveKey(), importKey(), or unwrapKey().
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class CryptoKey : JsAny {
    /**
     * The read-only type property of the CryptoKey interface indicates which kind of key is represented by the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/type)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val type: KeyType

    /**
     * The read-only extractable property of the CryptoKey interface indicates whether or not the key may be extracted
     * using SubtleCrypto.exportKey() or SubtleCrypto.wrapKey().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/extractable)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val extractable: Boolean

    /**
     * The read-only algorithm property of the CryptoKey interface returns an object describing the algorithm for which
     * this key can be used, and any associated extra parameters.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/algorithm)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val algorithm: JsAny

    /**
     * The read-only usages property of the CryptoKey interface indicates what can be done with the key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CryptoKey/usages)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val usages: JsAny
}

/**
 * The SubtleCrypto interface of the Web Crypto API provides a number of low-level cryptographic functions.
 *
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class SubtleCrypto : JsAny {
    /**
     * The encrypt() method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun encrypt(algorithm: JsAny, key: CryptoKey, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The encrypt() method of the SubtleCrypto interface encrypts data.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/encrypt)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun encrypt(algorithm: String, key: CryptoKey, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to
     * decrypt with, some optional extra parameters, and the data to decrypt (also known as "ciphertext"). It returns a
     * Promise which will be fulfilled with the decrypted data (also known as "plaintext").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun decrypt(algorithm: JsAny, key: CryptoKey, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The decrypt() method of the SubtleCrypto interface decrypts some encrypted data. It takes as arguments a key to
     * decrypt with, some optional extra parameters, and the data to decrypt (also known as "ciphertext"). It returns a
     * Promise which will be fulfilled with the decrypted data (also known as "plaintext").
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/decrypt)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun decrypt(algorithm: String, key: CryptoKey, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The sign() method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun sign(algorithm: JsAny, key: CryptoKey, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The sign() method of the SubtleCrypto interface generates a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/sign)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun sign(algorithm: String, key: CryptoKey, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The verify() method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun verify(algorithm: JsAny, key: CryptoKey, signature: BufferDataSource, data: BufferDataSource): Promise<JsBoolean>

    /**
     * The verify() method of the SubtleCrypto interface verifies a digital signature.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/verify)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun verify(algorithm: String, key: CryptoKey, signature: BufferDataSource, data: BufferDataSource): Promise<JsBoolean>

    /**
     * The digest() method of the SubtleCrypto interface generates a digest of the given data, using the specified hash
     * function. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests
     * should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the
     * same digest value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun digest(algorithm: JsAny, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The digest() method of the SubtleCrypto interface generates a digest of the given data, using the specified hash
     * function. A digest is a short fixed-length value derived from some variable-length input. Cryptographic digests
     * should exhibit collision-resistance, meaning that it's hard to come up with two different inputs that have the
     * same digest value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/digest)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun digest(algorithm: String, data: BufferDataSource): Promise<ArrayBuffer>

    /**
     * The generateKey() method of the SubtleCrypto interface is used to generate a new key (for symmetric algorithms)
     * or key pair (for public-key algorithms).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun generateKey(algorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<JsAny>

    /**
     * The generateKey() method of the SubtleCrypto interface is used to generate a new key (for symmetric algorithms)
     * or key pair (for public-key algorithms).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/generateKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun generateKey(algorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<JsAny>

    /**
     * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deriveKey(algorithm: JsAny, baseKey: CryptoKey, derivedKeyType: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deriveKey(algorithm: JsAny, baseKey: CryptoKey, derivedKeyType: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deriveKey(algorithm: String, baseKey: CryptoKey, derivedKeyType: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The deriveKey() method of the SubtleCrypto interface can be used to derive a secret key from a master key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deriveKey(algorithm: String, baseKey: CryptoKey, derivedKeyType: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deriveBits(algorithm: JsAny, baseKey: CryptoKey, length: Int? = definedExternally): Promise<ArrayBuffer>

    /**
     * The deriveBits() method of the SubtleCrypto interface can be used to derive an array of bits from a base key.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/deriveBits)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deriveBits(algorithm: String, baseKey: CryptoKey, length: Int? = definedExternally): Promise<ArrayBuffer>

    /**
     * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an
     * external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importKey(format: KeyFormat, keyData: BufferDataSource, algorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an
     * external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importKey(format: KeyFormat, keyData: BufferDataSource, algorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an
     * external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importKey(format: KeyFormat, keyData: JsonWebKey, algorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The importKey() method of the SubtleCrypto interface imports a key: that is, it takes as input a key in an
     * external, portable format and gives you a CryptoKey object that you can use in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/importKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun importKey(format: KeyFormat, keyData: JsonWebKey, algorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The exportKey() method of the SubtleCrypto interface exports a key: that is, it takes as input a CryptoKey object
     * and gives you the key in an external, portable format.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/exportKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun exportKey(format: KeyFormat, key: CryptoKey): Promise<JsAny>

    /**
     * The wrapKey() method of the SubtleCrypto interface "wraps" a key. This means that it exports the key in an
     * external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted
     * environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: JsAny): Promise<ArrayBuffer>

    /**
     * The wrapKey() method of the SubtleCrypto interface "wraps" a key. This means that it exports the key in an
     * external, portable format, then encrypts the exported key. Wrapping a key helps protect it in untrusted
     * environments, such as inside an otherwise unprotected data store or in transmission over an unprotected network.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/wrapKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun wrapKey(format: KeyFormat, key: CryptoKey, wrappingKey: CryptoKey, wrapAlgorithm: String): Promise<ArrayBuffer>

    /**
     * The unwrapKey() method of the SubtleCrypto interface "unwraps" a key. This means that it takes as its input a key
     * that has been exported and then encrypted (also called "wrapped"). It decrypts the key and then imports it,
     * returning a CryptoKey object that can be used in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun unwrapKey(format: KeyFormat, wrappedKey: BufferDataSource, unwrappingKey: CryptoKey, unwrapAlgorithm: JsAny, unwrappedKeyAlgorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The unwrapKey() method of the SubtleCrypto interface "unwraps" a key. This means that it takes as its input a key
     * that has been exported and then encrypted (also called "wrapped"). It decrypts the key and then imports it,
     * returning a CryptoKey object that can be used in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun unwrapKey(format: KeyFormat, wrappedKey: BufferDataSource, unwrappingKey: CryptoKey, unwrapAlgorithm: JsAny, unwrappedKeyAlgorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The unwrapKey() method of the SubtleCrypto interface "unwraps" a key. This means that it takes as its input a key
     * that has been exported and then encrypted (also called "wrapped"). It decrypts the key and then imports it,
     * returning a CryptoKey object that can be used in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun unwrapKey(format: KeyFormat, wrappedKey: BufferDataSource, unwrappingKey: CryptoKey, unwrapAlgorithm: String, unwrappedKeyAlgorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * The unwrapKey() method of the SubtleCrypto interface "unwraps" a key. This means that it takes as its input a key
     * that has been exported and then encrypted (also called "wrapped"). It decrypts the key and then imports it,
     * returning a CryptoKey object that can be used in the Web Crypto API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SubtleCrypto/unwrapKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun unwrapKey(format: KeyFormat, wrappedKey: BufferDataSource, unwrappingKey: CryptoKey, unwrapAlgorithm: String, unwrappedKeyAlgorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * Available only in secure contexts.
     */
    public open fun encapsulateKey(encapsulationAlgorithm: JsAny, encapsulationKey: CryptoKey, sharedKeyAlgorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<EncapsulatedKey>

    /**
     * Available only in secure contexts.
     */
    public open fun encapsulateKey(encapsulationAlgorithm: JsAny, encapsulationKey: CryptoKey, sharedKeyAlgorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<EncapsulatedKey>

    /**
     * Available only in secure contexts.
     */
    public open fun encapsulateKey(encapsulationAlgorithm: String, encapsulationKey: CryptoKey, sharedKeyAlgorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<EncapsulatedKey>

    /**
     * Available only in secure contexts.
     */
    public open fun encapsulateKey(encapsulationAlgorithm: String, encapsulationKey: CryptoKey, sharedKeyAlgorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<EncapsulatedKey>

    /**
     * Available only in secure contexts.
     */
    public open fun encapsulateBits(encapsulationAlgorithm: JsAny, encapsulationKey: CryptoKey): Promise<EncapsulatedBits>

    /**
     * Available only in secure contexts.
     */
    public open fun encapsulateBits(encapsulationAlgorithm: String, encapsulationKey: CryptoKey): Promise<EncapsulatedBits>

    /**
     * Available only in secure contexts.
     */
    public open fun decapsulateKey(decapsulationAlgorithm: JsAny, decapsulationKey: CryptoKey, ciphertext: BufferDataSource, sharedKeyAlgorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * Available only in secure contexts.
     */
    public open fun decapsulateKey(decapsulationAlgorithm: JsAny, decapsulationKey: CryptoKey, ciphertext: BufferDataSource, sharedKeyAlgorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * Available only in secure contexts.
     */
    public open fun decapsulateKey(decapsulationAlgorithm: String, decapsulationKey: CryptoKey, ciphertext: BufferDataSource, sharedKeyAlgorithm: JsAny, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * Available only in secure contexts.
     */
    public open fun decapsulateKey(decapsulationAlgorithm: String, decapsulationKey: CryptoKey, ciphertext: BufferDataSource, sharedKeyAlgorithm: String, extractable: Boolean, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    /**
     * Available only in secure contexts.
     */
    public open fun decapsulateBits(decapsulationAlgorithm: JsAny, decapsulationKey: CryptoKey, ciphertext: BufferDataSource): Promise<ArrayBuffer>

    /**
     * Available only in secure contexts.
     */
    public open fun decapsulateBits(decapsulationAlgorithm: String, decapsulationKey: CryptoKey, ciphertext: BufferDataSource): Promise<ArrayBuffer>

    /**
     * Available only in secure contexts.
     */
    public open fun getPublicKey(key: CryptoKey, keyUsages: JsArray<KeyUsage>): Promise<CryptoKey>

    public companion object {
        /**
         * Available only in secure contexts.
         */
        public fun supports(operation: String, algorithm: JsAny, length: Int? = definedExternally): Boolean

        /**
         * Available only in secure contexts.
         */
        public fun supports(operation: String, algorithm: String, length: Int? = definedExternally): Boolean

        /**
         * Available only in secure contexts.
         */
        public fun supports(operation: String, algorithm: JsAny, additionalAlgorithm: JsAny): Boolean

        /**
         * Available only in secure contexts.
         */
        public fun supports(operation: String, algorithm: JsAny, additionalAlgorithm: String): Boolean

        /**
         * Available only in secure contexts.
         */
        public fun supports(operation: String, algorithm: String, additionalAlgorithm: JsAny): Boolean

        /**
         * Available only in secure contexts.
         */
        public fun supports(operation: String, algorithm: String, additionalAlgorithm: String): Boolean
    }
}

public external interface RsaOtherPrimesInfo : JsAny {
    public var r: String?
    public var d: String?
    public var t: String?
}

public fun RsaOtherPrimesInfo(r: String? = null, d: String? = null, t: String? = null): RsaOtherPrimesInfo {
    val dictionary = newJsObject<RsaOtherPrimesInfo>()
    if (r != null) dictionary.r = r
    if (d != null) dictionary.d = d
    if (t != null) dictionary.t = t
    return dictionary
}

public external interface JsonWebKey : JsAny {
    public var kty: String?
    public var use: String?
    public var key_ops: JsArray<JsString>?
    public var alg: String?
    public var ext: Boolean?
    public var crv: String?
    public var x: String?
    public var y: String?
    public var d: String?
    public var n: String?
    public var e: String?
    public var p: String?
    public var q: String?
    public var dp: String?
    public var dq: String?
    public var qi: String?
    public var oth: JsArray<RsaOtherPrimesInfo>?
    public var k: String?
    public var pub: String?
    public var priv: String?
}

public fun JsonWebKey(kty: String? = null, use: String? = null, key_ops: JsArray<JsString>? = null, alg: String? = null, ext: Boolean? = null, crv: String? = null, x: String? = null, y: String? = null, d: String? = null, n: String? = null, e: String? = null, p: String? = null, q: String? = null, dp: String? = null, dq: String? = null, qi: String? = null, oth: JsArray<RsaOtherPrimesInfo>? = null, k: String? = null, pub: String? = null, priv: String? = null): JsonWebKey {
    val dictionary = newJsObject<JsonWebKey>()
    if (kty != null) dictionary.kty = kty
    if (use != null) dictionary.use = use
    if (key_ops != null) dictionary.key_ops = key_ops
    if (alg != null) dictionary.alg = alg
    if (ext != null) dictionary.ext = ext
    if (crv != null) dictionary.crv = crv
    if (x != null) dictionary.x = x
    if (y != null) dictionary.y = y
    if (d != null) dictionary.d = d
    if (n != null) dictionary.n = n
    if (e != null) dictionary.e = e
    if (p != null) dictionary.p = p
    if (q != null) dictionary.q = q
    if (dp != null) dictionary.dp = dp
    if (dq != null) dictionary.dq = dq
    if (qi != null) dictionary.qi = qi
    if (oth != null) dictionary.oth = oth
    if (k != null) dictionary.k = k
    if (pub != null) dictionary.pub = pub
    if (priv != null) dictionary.priv = priv
    return dictionary
}

public external interface CryptoKeyPair : JsAny {
    public var publicKey: CryptoKey?
    public var privateKey: CryptoKey?
}

public fun CryptoKeyPair(publicKey: CryptoKey? = null, privateKey: CryptoKey? = null): CryptoKeyPair {
    val dictionary = newJsObject<CryptoKeyPair>()
    if (publicKey != null) dictionary.publicKey = publicKey
    if (privateKey != null) dictionary.privateKey = privateKey
    return dictionary
}

public external interface RsaKeyGenParams : Algorithm {
    public var modulusLength: Int
    public var publicExponent: Uint8Array
}

public fun RsaKeyGenParams(name: String, modulusLength: Int, publicExponent: Uint8Array): RsaKeyGenParams {
    val dictionary = newJsObject<RsaKeyGenParams>()
    dictionary.name = name
    dictionary.modulusLength = modulusLength
    dictionary.publicExponent = publicExponent
    return dictionary
}

public external interface RsaHashedKeyGenParams : RsaKeyGenParams {
    public var hash: JsAny
}

public fun RsaHashedKeyGenParams(name: String, modulusLength: Int, publicExponent: Uint8Array, hash: JsAny): RsaHashedKeyGenParams {
    val dictionary = newJsObject<RsaHashedKeyGenParams>()
    dictionary.name = name
    dictionary.modulusLength = modulusLength
    dictionary.publicExponent = publicExponent
    dictionary.hash = hash
    return dictionary
}

public external interface RsaKeyAlgorithm : KeyAlgorithm {
    public var modulusLength: Int
    public var publicExponent: Uint8Array
}

public fun RsaKeyAlgorithm(name: String, modulusLength: Int, publicExponent: Uint8Array): RsaKeyAlgorithm {
    val dictionary = newJsObject<RsaKeyAlgorithm>()
    dictionary.name = name
    dictionary.modulusLength = modulusLength
    dictionary.publicExponent = publicExponent
    return dictionary
}

public external interface RsaHashedKeyAlgorithm : RsaKeyAlgorithm {
    public var hash: KeyAlgorithm
}

public fun RsaHashedKeyAlgorithm(name: String, modulusLength: Int, publicExponent: Uint8Array, hash: KeyAlgorithm): RsaHashedKeyAlgorithm {
    val dictionary = newJsObject<RsaHashedKeyAlgorithm>()
    dictionary.name = name
    dictionary.modulusLength = modulusLength
    dictionary.publicExponent = publicExponent
    dictionary.hash = hash
    return dictionary
}

public external interface RsaHashedImportParams : Algorithm {
    public var hash: JsAny
}

public fun RsaHashedImportParams(name: String, hash: JsAny): RsaHashedImportParams {
    val dictionary = newJsObject<RsaHashedImportParams>()
    dictionary.name = name
    dictionary.hash = hash
    return dictionary
}

public external interface RsaPssParams : Algorithm {
    public var saltLength: Int
}

public fun RsaPssParams(name: String, saltLength: Int): RsaPssParams {
    val dictionary = newJsObject<RsaPssParams>()
    dictionary.name = name
    dictionary.saltLength = saltLength
    return dictionary
}

public external interface RsaOaepParams : Algorithm {
    public var label: BufferDataSource?
}

public fun RsaOaepParams(name: String, label: BufferDataSource? = null): RsaOaepParams {
    val dictionary = newJsObject<RsaOaepParams>()
    dictionary.name = name
    if (label != null) dictionary.label = label
    return dictionary
}

public external interface EcdsaParams : Algorithm {
    public var hash: JsAny
}

public fun EcdsaParams(name: String, hash: JsAny): EcdsaParams {
    val dictionary = newJsObject<EcdsaParams>()
    dictionary.name = name
    dictionary.hash = hash
    return dictionary
}

public external interface EcKeyGenParams : Algorithm {
    public var namedCurve: String
}

public fun EcKeyGenParams(name: String, namedCurve: String): EcKeyGenParams {
    val dictionary = newJsObject<EcKeyGenParams>()
    dictionary.name = name
    dictionary.namedCurve = namedCurve
    return dictionary
}

public external interface EcKeyAlgorithm : KeyAlgorithm {
    public var namedCurve: String
}

public fun EcKeyAlgorithm(name: String, namedCurve: String): EcKeyAlgorithm {
    val dictionary = newJsObject<EcKeyAlgorithm>()
    dictionary.name = name
    dictionary.namedCurve = namedCurve
    return dictionary
}

public external interface EcKeyImportParams : Algorithm {
    public var namedCurve: String
}

public fun EcKeyImportParams(name: String, namedCurve: String): EcKeyImportParams {
    val dictionary = newJsObject<EcKeyImportParams>()
    dictionary.name = name
    dictionary.namedCurve = namedCurve
    return dictionary
}

public external interface EcdhKeyDeriveParams : Algorithm {
    public var public: CryptoKey
}

public fun EcdhKeyDeriveParams(name: String, public: CryptoKey): EcdhKeyDeriveParams {
    val dictionary = newJsObject<EcdhKeyDeriveParams>()
    dictionary.name = name
    dictionary.public = public
    return dictionary
}

public external interface AesCtrParams : Algorithm {
    public var counter: BufferDataSource
    public var length: Byte
}

public fun AesCtrParams(name: String, counter: BufferDataSource, length: Byte): AesCtrParams {
    val dictionary = newJsObject<AesCtrParams>()
    dictionary.name = name
    dictionary.counter = counter
    dictionary.length = length
    return dictionary
}

public external interface AesKeyAlgorithm : KeyAlgorithm {
    public var length: Short
}

public fun AesKeyAlgorithm(name: String, length: Short): AesKeyAlgorithm {
    val dictionary = newJsObject<AesKeyAlgorithm>()
    dictionary.name = name
    dictionary.length = length
    return dictionary
}

public external interface AesKeyGenParams : Algorithm {
    public var length: Short
}

public fun AesKeyGenParams(name: String, length: Short): AesKeyGenParams {
    val dictionary = newJsObject<AesKeyGenParams>()
    dictionary.name = name
    dictionary.length = length
    return dictionary
}

public external interface AesDerivedKeyParams : Algorithm {
    public var length: Short
}

public fun AesDerivedKeyParams(name: String, length: Short): AesDerivedKeyParams {
    val dictionary = newJsObject<AesDerivedKeyParams>()
    dictionary.name = name
    dictionary.length = length
    return dictionary
}

public external interface AesCbcParams : Algorithm {
    public var iv: BufferDataSource
}

public fun AesCbcParams(name: String, iv: BufferDataSource): AesCbcParams {
    val dictionary = newJsObject<AesCbcParams>()
    dictionary.name = name
    dictionary.iv = iv
    return dictionary
}

public external interface AesGcmParams : Algorithm {
    public var iv: BufferDataSource
    public var additionalData: BufferDataSource?
    public var tagLength: Byte?
}

public fun AesGcmParams(name: String, iv: BufferDataSource, additionalData: BufferDataSource? = null, tagLength: Byte? = null): AesGcmParams {
    val dictionary = newJsObject<AesGcmParams>()
    dictionary.name = name
    dictionary.iv = iv
    if (additionalData != null) dictionary.additionalData = additionalData
    if (tagLength != null) dictionary.tagLength = tagLength
    return dictionary
}

public external interface HmacImportParams : Algorithm {
    public var hash: JsAny
    public var length: Int?
}

public fun HmacImportParams(name: String, hash: JsAny, length: Int? = null): HmacImportParams {
    val dictionary = newJsObject<HmacImportParams>()
    dictionary.name = name
    dictionary.hash = hash
    if (length != null) dictionary.length = length
    return dictionary
}

public external interface HmacKeyAlgorithm : KeyAlgorithm {
    public var hash: KeyAlgorithm
    public var length: Int
}

public fun HmacKeyAlgorithm(name: String, hash: KeyAlgorithm, length: Int): HmacKeyAlgorithm {
    val dictionary = newJsObject<HmacKeyAlgorithm>()
    dictionary.name = name
    dictionary.hash = hash
    dictionary.length = length
    return dictionary
}

public external interface HmacKeyGenParams : Algorithm {
    public var hash: JsAny
    public var length: Int?
}

public fun HmacKeyGenParams(name: String, hash: JsAny, length: Int? = null): HmacKeyGenParams {
    val dictionary = newJsObject<HmacKeyGenParams>()
    dictionary.name = name
    dictionary.hash = hash
    if (length != null) dictionary.length = length
    return dictionary
}

public external interface HkdfParams : Algorithm {
    public var hash: JsAny
    public var salt: BufferDataSource
    public var info: BufferDataSource
}

public fun HkdfParams(name: String, hash: JsAny, salt: BufferDataSource, info: BufferDataSource): HkdfParams {
    val dictionary = newJsObject<HkdfParams>()
    dictionary.name = name
    dictionary.hash = hash
    dictionary.salt = salt
    dictionary.info = info
    return dictionary
}

public external interface Pbkdf2Params : Algorithm {
    public var salt: BufferDataSource
    public var iterations: Int
    public var hash: JsAny
}

public fun Pbkdf2Params(name: String, salt: BufferDataSource, iterations: Int, hash: JsAny): Pbkdf2Params {
    val dictionary = newJsObject<Pbkdf2Params>()
    dictionary.name = name
    dictionary.salt = salt
    dictionary.iterations = iterations
    dictionary.hash = hash
    return dictionary
}
