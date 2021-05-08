/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED, DO NOT EDIT!
// See github.com/kotlin/dukat for details

package org.w3c.idb

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*

public external abstract class IDBRequest : EventTarget {
    open val result: Any?
    open val error: dynamic
    open val source: UnionIDBCursorOrIDBIndexOrIDBObjectStore?
    open val transaction: IDBTransaction?
    open val readyState: IDBRequestReadyState
    open var onsuccess: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
}

public external abstract class IDBOpenDBRequest : IDBRequest {
    open var onblocked: ((Event) -> dynamic)?
    open var onupgradeneeded: ((Event) -> dynamic)?
}

public external abstract class IDBVersionChangeEvent : Event {
    open val oldVersion: Number
    open val newVersion: Number?

    companion object {
        val NONE: Short
        val CAPTURING_PHASE: Short
        val AT_TARGET: Short
        val BUBBLING_PHASE: Short
    }
}

public external interface IDBVersionChangeEventInit : EventInit {
    var oldVersion: Number? /* = 0 */
        get() = definedExternally
        set(value) = definedExternally
    var newVersion: Number? /* = null */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun IDBVersionChangeEventInit(oldVersion: Number? = 0, newVersion: Number? = null, bubbles: Boolean? = false, cancelable: Boolean? = false, composed: Boolean? = false): IDBVersionChangeEventInit {
    val o = js("({})")
    o["oldVersion"] = oldVersion
    o["newVersion"] = newVersion
    o["bubbles"] = bubbles
    o["cancelable"] = cancelable
    o["composed"] = composed
    return o
}

public external abstract class IDBFactory {
    fun open(name: String, version: Number = definedExternally): IDBOpenDBRequest
    fun deleteDatabase(name: String): IDBOpenDBRequest
    fun databases(): Promise<Array<IDBDatabaseInfo>>
    fun cmp(first: Any?, second: Any?): Short
}

public external interface IDBDatabaseInfo {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var version: Number?
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun IDBDatabaseInfo(name: String? = undefined, version: Number? = undefined): IDBDatabaseInfo {
    val o = js("({})")
    o["name"] = name
    o["version"] = version
    return o
}

public external abstract class IDBDatabase : EventTarget {
    open val name: String
    open val version: Number
    open val objectStoreNames: DOMStringList
    open var onabort: ((Event) -> dynamic)?
    open var onclose: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
    open var onversionchange: ((Event) -> dynamic)?
    fun transaction(storeNames: dynamic, mode: IDBTransactionMode = definedExternally, options: IDBTransactionOptions = definedExternally): IDBTransaction
    fun close(): dynamic
    fun createObjectStore(name: String, options: IDBObjectStoreParameters = definedExternally): IDBObjectStore
    fun deleteObjectStore(name: String): dynamic
}

public external interface IDBTransactionOptions {
    var durability: IDBTransactionDurability? /* = IDBTransactionDurability.DEFAULT */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun IDBTransactionOptions(durability: IDBTransactionDurability? = IDBTransactionDurability.DEFAULT): IDBTransactionOptions {
    val o = js("({})")
    o["durability"] = durability
    return o
}

public external interface IDBObjectStoreParameters {
    var keyPath: dynamic /* = null */
        get() = definedExternally
        set(value) = definedExternally
    var autoIncrement: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun IDBObjectStoreParameters(keyPath: dynamic = null, autoIncrement: Boolean? = false): IDBObjectStoreParameters {
    val o = js("({})")
    o["keyPath"] = keyPath
    o["autoIncrement"] = autoIncrement
    return o
}

public external abstract class IDBObjectStore : UnionIDBCursorOrIDBIndexOrIDBObjectStore, UnionIDBIndexOrIDBObjectStore {
    open var name: String
    open val keyPath: Any?
    open val indexNames: DOMStringList
    open val transaction: IDBTransaction
    open val autoIncrement: Boolean
    fun put(value: Any?, key: Any? = definedExternally): IDBRequest
    fun add(value: Any?, key: Any? = definedExternally): IDBRequest
    fun delete(query: Any?): IDBRequest
    fun clear(): IDBRequest
    fun get(query: Any?): IDBRequest
    fun getKey(query: Any?): IDBRequest
    fun getAll(query: Any? = definedExternally, count: Int = definedExternally): IDBRequest
    fun getAllKeys(query: Any? = definedExternally, count: Int = definedExternally): IDBRequest
    fun count(query: Any? = definedExternally): IDBRequest
    fun openCursor(query: Any? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest
    fun openKeyCursor(query: Any? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest
    fun index(name: String): IDBIndex
    fun createIndex(name: String, keyPath: dynamic, options: IDBIndexParameters = definedExternally): IDBIndex
    fun deleteIndex(name: String): dynamic
}

public external interface IDBIndexParameters {
    var unique: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
    var multiEntry: Boolean? /* = false */
        get() = definedExternally
        set(value) = definedExternally
}

@Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@kotlin.internal.InlineOnly
public inline fun IDBIndexParameters(unique: Boolean? = false, multiEntry: Boolean? = false): IDBIndexParameters {
    val o = js("({})")
    o["unique"] = unique
    o["multiEntry"] = multiEntry
    return o
}

public external abstract class IDBIndex : UnionIDBCursorOrIDBIndexOrIDBObjectStore, UnionIDBIndexOrIDBObjectStore {
    open var name: String
    open val objectStore: IDBObjectStore
    open val keyPath: Any?
    open val multiEntry: Boolean
    open val unique: Boolean
    fun get(query: Any?): IDBRequest
    fun getKey(query: Any?): IDBRequest
    fun getAll(query: Any? = definedExternally, count: Int = definedExternally): IDBRequest
    fun getAllKeys(query: Any? = definedExternally, count: Int = definedExternally): IDBRequest
    fun count(query: Any? = definedExternally): IDBRequest
    fun openCursor(query: Any? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest
    fun openKeyCursor(query: Any? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest
}

public external abstract class IDBKeyRange {
    open val lower: Any?
    open val upper: Any?
    open val lowerOpen: Boolean
    open val upperOpen: Boolean
    fun includes(key: Any?): Boolean

    companion object {
        fun only(value: Any?): IDBKeyRange
        fun lowerBound(lower: Any?, open: Boolean = definedExternally): IDBKeyRange
        fun upperBound(upper: Any?, open: Boolean = definedExternally): IDBKeyRange
        fun bound(lower: Any?, upper: Any?, lowerOpen: Boolean = definedExternally, upperOpen: Boolean = definedExternally): IDBKeyRange
    }
}

public external abstract class IDBCursor : UnionIDBCursorOrIDBIndexOrIDBObjectStore {
    open val source: UnionIDBIndexOrIDBObjectStore
    open val direction: IDBCursorDirection
    open val key: Any?
    open val primaryKey: Any?
    open val request: IDBRequest
    fun advance(count: Int): dynamic
    fun `continue`(key: Any? = definedExternally): dynamic
    fun continuePrimaryKey(key: Any?, primaryKey: Any?): dynamic
    fun update(value: Any?): IDBRequest
    fun delete(): IDBRequest
}

public external abstract class IDBCursorWithValue : IDBCursor {
    open val value: Any?
}

public external abstract class IDBTransaction : EventTarget {
    open val objectStoreNames: DOMStringList
    open val mode: IDBTransactionMode
    open val durability: IDBTransactionDurability
    open val db: IDBDatabase
    open val error: dynamic
    open var onabort: ((Event) -> dynamic)?
    open var oncomplete: ((Event) -> dynamic)?
    open var onerror: ((Event) -> dynamic)?
    fun objectStore(name: String): IDBObjectStore
    fun commit(): dynamic
    fun abort(): dynamic
}

public external interface UnionIDBCursorOrIDBIndexOrIDBObjectStore

public external interface UnionIDBIndexOrIDBObjectStore

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface IDBRequestReadyState {
    companion object
}

public inline val IDBRequestReadyState.Companion.PENDING: IDBRequestReadyState get() = "pending".asDynamic().unsafeCast<IDBRequestReadyState>()

public inline val IDBRequestReadyState.Companion.DONE: IDBRequestReadyState get() = "done".asDynamic().unsafeCast<IDBRequestReadyState>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface IDBTransactionDurability {
    companion object
}

public inline val IDBTransactionDurability.Companion.DEFAULT: IDBTransactionDurability get() = "default".asDynamic().unsafeCast<IDBTransactionDurability>()

public inline val IDBTransactionDurability.Companion.STRICT: IDBTransactionDurability get() = "strict".asDynamic().unsafeCast<IDBTransactionDurability>()

public inline val IDBTransactionDurability.Companion.RELAXED: IDBTransactionDurability get() = "relaxed".asDynamic().unsafeCast<IDBTransactionDurability>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface IDBCursorDirection {
    companion object
}

public inline val IDBCursorDirection.Companion.NEXT: IDBCursorDirection get() = "next".asDynamic().unsafeCast<IDBCursorDirection>()

public inline val IDBCursorDirection.Companion.NEXTUNIQUE: IDBCursorDirection get() = "nextunique".asDynamic().unsafeCast<IDBCursorDirection>()

public inline val IDBCursorDirection.Companion.PREV: IDBCursorDirection get() = "prev".asDynamic().unsafeCast<IDBCursorDirection>()

public inline val IDBCursorDirection.Companion.PREVUNIQUE: IDBCursorDirection get() = "prevunique".asDynamic().unsafeCast<IDBCursorDirection>()

/* please, don't implement this interface! */
@JsName("null")
@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
public external interface IDBTransactionMode {
    companion object
}

public inline val IDBTransactionMode.Companion.READONLY: IDBTransactionMode get() = "readonly".asDynamic().unsafeCast<IDBTransactionMode>()

public inline val IDBTransactionMode.Companion.READWRITE: IDBTransactionMode get() = "readwrite".asDynamic().unsafeCast<IDBTransactionMode>()

public inline val IDBTransactionMode.Companion.VERSIONCHANGE: IDBTransactionMode get() = "versionchange".asDynamic().unsafeCast<IDBTransactionMode>()