/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 *
 * The documentation comments adapted from MDN Web Docs are © Mozilla Contributors and licensed separately, under
 * CC BY-SA 2.5, not Apache 2.0. See the NOTICE file.
 */

// NOTE: THIS FILE IS AUTO-GENERATED FROM THE WEB IDL OF 'IndexedDB', DO NOT EDIT!
// See generator/src/main/kotlin/org/jetbrains/kotlin/tools/idl/generateWebApi.kt for details.

package org.w3c.indexeddb

import kotlin.js.*
import org.w3c.dom.*

public external interface UnionIDBCursorOrIDBIndexOrIDBObjectStore : JsAny

public external interface UnionIDBIndexOrIDBObjectStore : UnionIDBCursorOrIDBIndexOrIDBObjectStore

/**
 * The IDBRequest interface of the IndexedDB API provides access to results of asynchronous requests to databases and
 * database objects using event handler attributes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBRequest : EventTarget {
    /**
     * The result read-only property of the IDBRequest interface returns the result of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/result)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val result: JsAny?

    /**
     * The error read-only property of the IDBRequest interface returns the error in the event of an unsuccessful
     * request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val error: DOMException?

    /**
     * The source read-only property of the IDBRequest interface returns the source of the request, such as an Index or
     * an object store. If no source exists (such as when calling IDBFactory.open), it returns null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/source)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val source: UnionIDBCursorOrIDBIndexOrIDBObjectStore?

    /**
     * The transaction read-only property of the IDBRequest interface returns the transaction for the request, that is,
     * the transaction the request is being made inside.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/transaction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val transaction: IDBTransaction?

    /**
     * The readyState read-only property of the IDBRequest interface returns the state of the request.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val readyState: IDBRequestReadyState

    /**
     * The success event is fired when an IDBRequest succeeds. In the success event handler, you can access the result
     * of the request, as well as place more requests to the same transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/success_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onsuccess: ((Event) -> Unit)?

    /**
     * The error handler is executed when an error caused a request to fail. In the error event handler, you can access
     * the error of the request, as well as place more requests to the same transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/error_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onerror: ((Event) -> Unit)?
}

public external interface IDBRequestReadyState : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val IDBRequestReadyState.Companion.PENDING: IDBRequestReadyState get() = "pending".toJsString().unsafeCast<IDBRequestReadyState>()
public inline val IDBRequestReadyState.Companion.DONE: IDBRequestReadyState get() = "done".toJsString().unsafeCast<IDBRequestReadyState>()

/**
 * The IDBOpenDBRequest interface of the IndexedDB API provides access to the results of requests to open or delete
 * databases (performed using IDBFactory.open and IDBFactory.deleteDatabase), using specific event handler attributes.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBOpenDBRequest : IDBRequest {
    /**
     * The blocked handler is executed when an open connection to a database is blocking a versionchange transaction on
     * the same database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/blocked_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onblocked: ((IDBVersionChangeEvent) -> Unit)?

    /**
     * The upgradeneeded event is fired when an attempt was made to open a database with a version number higher than
     * its current version.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBOpenDBRequest/upgradeneeded_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onupgradeneeded: ((IDBVersionChangeEvent) -> Unit)?
}

/**
 * The IDBVersionChangeEvent interface of the IndexedDB API indicates that the version of the database has changed, as
 * the result of an onupgradeneeded event handler function.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public open external class IDBVersionChangeEvent : Event {
    /**
     * The IDBVersionChangeEvent() constructor creates a new IDBVersionChangeEvent object, which is used to represent
     * when a version of the database has changed, as a result of the onupgradeneeded event handler.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/IDBVersionChangeEvent)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public constructor(type: String, eventInitDict: IDBVersionChangeEventInit = definedExternally)

    /**
     * The oldVersion read-only property of the IDBVersionChangeEvent interface returns the old version number of the
     * database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/oldVersion)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val oldVersion: Double

    /**
     * The newVersion read-only property of the IDBVersionChangeEvent interface returns the new version number of the
     * database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBVersionChangeEvent/newVersion)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val newVersion: Double?

    public companion object {
        public val NONE: Short
        public val CAPTURING_PHASE: Short
        public val AT_TARGET: Short
        public val BUBBLING_PHASE: Short
    }
}

public external interface IDBVersionChangeEventInit : EventInit {
    public var oldVersion: Double?
    public var newVersion: Double?
}

public fun IDBVersionChangeEventInit(bubbles: Boolean? = null, cancelable: Boolean? = null, composed: Boolean? = null, oldVersion: Double? = null, newVersion: Double? = null): IDBVersionChangeEventInit {
    val dictionary = newJsObject<IDBVersionChangeEventInit>()
    if (bubbles != null) dictionary.bubbles = bubbles
    if (cancelable != null) dictionary.cancelable = cancelable
    if (composed != null) dictionary.composed = composed
    if (oldVersion != null) dictionary.oldVersion = oldVersion
    if (newVersion != null) dictionary.newVersion = newVersion
    return dictionary
}

/**
 * The IDBFactory interface of the IndexedDB API lets applications asynchronously access the indexed databases. The
 * object that implements the interface is window.indexedDB. You open — that is, create and access — and delete a
 * database with this object, and not directly with IDBFactory.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBFactory : JsAny {
    /**
     * The open() method of the IDBFactory interface requests opening a connection to a database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/open)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun open(name: String, version: Double = definedExternally): IDBOpenDBRequest

    /**
     * The deleteDatabase() method of the IDBFactory interface requests the deletion of a database. The method returns
     * an IDBOpenDBRequest object immediately, and performs the deletion operation asynchronously.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/deleteDatabase)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deleteDatabase(name: String): IDBOpenDBRequest

    /**
     * The databases method of the IDBFactory interface returns a Promise that fulfills with an array of objects
     * containing the name and version of all the available databases.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/databases)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun databases(): Promise<JsArray<IDBDatabaseInfo>>

    /**
     * The cmp() method of the IDBFactory interface compares two values as keys to determine equality and ordering for
     * IndexedDB operations, such as storing and iterating.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBFactory/cmp)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun cmp(first: JsAny?, second: JsAny?): Short
}

public external interface IDBDatabaseInfo : JsAny {
    public var name: String?
    public var version: Double?
}

public fun IDBDatabaseInfo(name: String? = null, version: Double? = null): IDBDatabaseInfo {
    val dictionary = newJsObject<IDBDatabaseInfo>()
    if (name != null) dictionary.name = name
    if (version != null) dictionary.version = version
    return dictionary
}

/**
 * The IDBDatabase interface of the IndexedDB API provides a connection to a database; you can use an IDBDatabase object
 * to open a transaction on your database then create, manipulate, and delete objects (data) in that database. The
 * interface provides the only way to get and manage versions of the database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBDatabase : EventTarget {
    /**
     * The name read-only property of the IDBDatabase interface is a string that contains the name of the connected
     * database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val name: String

    /**
     * The version read-only property of the IDBDatabase interface is non-negative integer that contains the version of
     * the connected database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/version)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val version: Double

    /**
     * The objectStoreNames read-only property of the IDBDatabase interface is a DOMStringList containing a list of the
     * names of the object stores currently in the connected database.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/objectStoreNames)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val objectStoreNames: DOMStringList

    /**
     * The transaction method of the IDBDatabase interface immediately returns a transaction object (IDBTransaction)
     * containing the IDBTransaction.objectStore method, which you can use to access your object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/transaction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun transaction(storeNames: String, mode: IDBTransactionMode = definedExternally, options: IDBTransactionOptions = definedExternally): IDBTransaction

    /**
     * The transaction method of the IDBDatabase interface immediately returns a transaction object (IDBTransaction)
     * containing the IDBTransaction.objectStore method, which you can use to access your object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/transaction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun transaction(storeNames: JsArray<JsString>, mode: IDBTransactionMode = definedExternally, options: IDBTransactionOptions = definedExternally): IDBTransaction

    /**
     * The close() method of the IDBDatabase interface returns immediately and closes the connection in a separate
     * thread.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun close()

    /**
     * The createObjectStore() method of the IDBDatabase interface creates and returns a new IDBObjectStore.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/createObjectStore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createObjectStore(name: String, options: IDBObjectStoreParameters = definedExternally): IDBObjectStore

    /**
     * The deleteObjectStore() method of the IDBDatabase interface destroys the object store with the given name in the
     * connected database, along with any indexes that reference it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/deleteObjectStore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deleteObjectStore(name: String)

    /**
     * The abort event is fired when an IndexedDB transaction is aborted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onabort: ((Event) -> Unit)?

    /**
     * The close event is fired on IDBDatabase when the database connection is unexpectedly closed. This could happen,
     * for example, if the underlying storage is removed or if the user clears the database in the browser's history
     * preferences.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/close_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onclose: ((Event) -> Unit)?
    public open var onerror: ((Event) -> Unit)?

    /**
     * The versionchange event is fired when a database structure change (upgradeneeded event send on an
     * IDBOpenDBRequest or IDBFactory.deleteDatabase) was requested elsewhere (most probably in another window/tab on
     * the same computer).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBDatabase/versionchange_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onversionchange: ((IDBVersionChangeEvent) -> Unit)?
}

public external interface IDBTransactionDurability : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val IDBTransactionDurability.Companion.DEFAULT: IDBTransactionDurability get() = "default".toJsString().unsafeCast<IDBTransactionDurability>()
public inline val IDBTransactionDurability.Companion.STRICT: IDBTransactionDurability get() = "strict".toJsString().unsafeCast<IDBTransactionDurability>()
public inline val IDBTransactionDurability.Companion.RELAXED: IDBTransactionDurability get() = "relaxed".toJsString().unsafeCast<IDBTransactionDurability>()

public external interface IDBTransactionOptions : JsAny {
    public var durability: IDBTransactionDurability?
}

public fun IDBTransactionOptions(durability: IDBTransactionDurability? = null): IDBTransactionOptions {
    val dictionary = newJsObject<IDBTransactionOptions>()
    if (durability != null) dictionary.durability = durability
    return dictionary
}

public external interface IDBObjectStoreParameters : JsAny {
    public var keyPath: JsAny?
    public var autoIncrement: Boolean?
}

public fun IDBObjectStoreParameters(keyPath: JsAny? = null, autoIncrement: Boolean? = null): IDBObjectStoreParameters {
    val dictionary = newJsObject<IDBObjectStoreParameters>()
    if (keyPath != null) dictionary.keyPath = keyPath
    if (autoIncrement != null) dictionary.autoIncrement = autoIncrement
    return dictionary
}

/**
 * The IDBObjectStore interface of the IndexedDB API represents an object store in a database. Records within an object
 * store are sorted according to their keys. This sorting enables fast insertion, look-up, and ordered retrieval.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBObjectStore : UnionIDBIndexOrIDBObjectStore {
    /**
     * The name property of the IDBObjectStore interface indicates the name of this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var name: String

    /**
     * The keyPath read-only property of the IDBObjectStore interface returns the key path of this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/keyPath)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val keyPath: JsAny?

    /**
     * The indexNames read-only property of the IDBObjectStore interface returns a list of the names of indexes on
     * objects in this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/indexNames)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val indexNames: DOMStringList

    /**
     * The transaction read-only property of the IDBObjectStore interface returns the transaction object to which this
     * object store belongs.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/transaction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val transaction: IDBTransaction

    /**
     * The autoIncrement read-only property of the IDBObjectStore interface returns the value of the auto increment flag
     * for this object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/autoIncrement)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val autoIncrement: Boolean

    /**
     * The put() method of the IDBObjectStore interface updates a given record in a database, or inserts a new record if
     * the given item does not already exist.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/put)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun put(value: JsAny?, key: JsAny? = definedExternally): IDBRequest

    /**
     * The add() method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread, creates
     * a structured clone of the value, and stores the cloned value in the object store. This is for adding new records
     * to an object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/add)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun add(value: JsAny?, key: JsAny? = definedExternally): IDBRequest

    /**
     * The delete() method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread,
     * deletes the specified record or records.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/delete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun delete(query: JsAny?): IDBRequest

    /**
     * The clear() method of the IDBObjectStore interface creates and immediately returns an IDBRequest object, and
     * clears this object store in a separate thread. This is for deleting all the current data out of an object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/clear)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun clear(): IDBRequest

    /**
     * The get() method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread, returns
     * the object selected by the specified key. This is for retrieving specific records from an object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/get)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun get(query: JsAny?): IDBRequest

    /**
     * The getKey() method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread,
     * returns the key selected by the specified query. This is for retrieving specific records from an object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getKey(query: JsAny?): IDBRequest

    /**
     * The getAll() method of the IDBObjectStore interface returns an IDBRequest object containing all objects in the
     * object store matching the specified parameter or all objects in the store if no parameters are given.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getAll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAll(queryOrOptions: JsAny? = definedExternally, count: Int = definedExternally): IDBRequest

    /**
     * The getAllKeys() method of the IDBObjectStore interface returns an IDBRequest object retrieves record keys for
     * all objects in the object store matching the specified parameter or all objects in the store if no parameters are
     * given.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getAllKeys)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAllKeys(queryOrOptions: JsAny? = definedExternally, count: Int = definedExternally): IDBRequest

    /**
     * The getAllRecords() method of the IDBObjectStore interface retrieves all records (including primary keys and
     * values) from the object store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/getAllRecords)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAllRecords(options: IDBGetAllOptions = definedExternally): IDBRequest

    /**
     * The count() method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread,
     * returns the total number of records that match the provided key or IDBKeyRange. If no arguments are provided, it
     * returns the total number of records in the store.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/count)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun count(query: JsAny? = definedExternally): IDBRequest

    /**
     * The openCursor() method of the IDBObjectStore interface returns an IDBRequest object, and, in a separate thread,
     * returns a new IDBCursorWithValue object. Used for iterating through an object store with a cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/openCursor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun openCursor(query: JsAny? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest

    /**
     * The openKeyCursor() method of the IDBObjectStore interface returns an IDBRequest object whose result will be set
     * to an IDBCursor that can be used to iterate through matching results. Used for iterating through the keys of an
     * object store with a cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/openKeyCursor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun openKeyCursor(query: JsAny? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest

    /**
     * The index() method of the IDBObjectStore interface opens a named index in the current object store, after which
     * it can be used to, for example, return a series of records sorted by that index using a cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/index)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun index(name: String): IDBIndex

    /**
     * The createIndex() method of the IDBObjectStore interface creates and returns a new IDBIndex object in the
     * connected database. It creates a new field/column defining a new data point for each database record to contain.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/createIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createIndex(name: String, keyPath: String, options: IDBIndexParameters = definedExternally): IDBIndex

    /**
     * The createIndex() method of the IDBObjectStore interface creates and returns a new IDBIndex object in the
     * connected database. It creates a new field/column defining a new data point for each database record to contain.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/createIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun createIndex(name: String, keyPath: JsArray<JsString>, options: IDBIndexParameters = definedExternally): IDBIndex

    /**
     * The deleteIndex() method of the IDBObjectStore interface destroys the index with the specified name in the
     * connected database, used during a version upgrade.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBObjectStore/deleteIndex)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun deleteIndex(name: String)
}

public external interface IDBIndexParameters : JsAny {
    public var unique: Boolean?
    public var multiEntry: Boolean?
}

public fun IDBIndexParameters(unique: Boolean? = null, multiEntry: Boolean? = null): IDBIndexParameters {
    val dictionary = newJsObject<IDBIndexParameters>()
    if (unique != null) dictionary.unique = unique
    if (multiEntry != null) dictionary.multiEntry = multiEntry
    return dictionary
}

public external interface IDBGetAllOptions : JsAny {
    public var query: JsAny?
    public var count: Int?
    public var direction: IDBCursorDirection?
}

public fun IDBGetAllOptions(query: JsAny? = null, count: Int? = null, direction: IDBCursorDirection? = null): IDBGetAllOptions {
    val dictionary = newJsObject<IDBGetAllOptions>()
    if (query != null) dictionary.query = query
    if (count != null) dictionary.count = count
    if (direction != null) dictionary.direction = direction
    return dictionary
}

/**
 * IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a kind of
 * object store for looking up records in another object store, called the referenced object store. You use this
 * interface to retrieve data.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBIndex : UnionIDBIndexOrIDBObjectStore {
    /**
     * The name property of the IDBIndex interface contains a string which names the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/name)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var name: String

    /**
     * The objectStore read-only property of the IDBIndex interface returns the object store referenced by the current
     * index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/objectStore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val objectStore: IDBObjectStore

    /**
     * The keyPath read-only property of the IDBIndex interface returns the key path of the current index. If null, this
     * index is not auto-populated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/keyPath)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val keyPath: JsAny?

    /**
     * The multiEntry read-only property of the IDBIndex interface returns a boolean value that affects how the index
     * behaves when the result of evaluating the index's key path yields an array.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/multiEntry)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val multiEntry: Boolean

    /**
     * The unique read-only property returns a boolean that states whether the index allows duplicate keys.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/unique)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val unique: Boolean

    /**
     * The get() method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread, finds either
     * the value in the referenced object store that corresponds to the given key or the first corresponding value, if
     * key is set to an IDBKeyRange.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/get)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun get(query: JsAny?): IDBRequest

    /**
     * The getKey() method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread, finds
     * either the primary key that corresponds to the given key in this index or the first corresponding primary key, if
     * key is set to an IDBKeyRange.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getKey(query: JsAny?): IDBRequest

    /**
     * The getAll() method of the IDBIndex interface retrieves all objects that are inside the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAll)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAll(queryOrOptions: JsAny? = definedExternally, count: Int = definedExternally): IDBRequest

    /**
     * The getAllKeys() method of the IDBIndex interface asynchronously retrieves the primary keys of all objects inside
     * the index, setting them as the result of the request object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAllKeys)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAllKeys(queryOrOptions: JsAny? = definedExternally, count: Int = definedExternally): IDBRequest

    /**
     * The getAllRecords() method of the IDBIndex interface retrieves all records (including index keys, primary keys,
     * and values) from the index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/getAllRecords)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun getAllRecords(options: IDBGetAllOptions = definedExternally): IDBRequest

    /**
     * The count() method of the IDBIndex interface returns an IDBRequest object, and in a separate thread, returns the
     * number of records within a key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/count)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun count(query: JsAny? = definedExternally): IDBRequest

    /**
     * The openCursor() method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread,
     * creates a cursor over the specified key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/openCursor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun openCursor(query: JsAny? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest

    /**
     * The openKeyCursor() method of the IDBIndex interface returns an IDBRequest object, and, in a separate thread,
     * creates a cursor over the specified key range, as arranged by this index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBIndex/openKeyCursor)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun openKeyCursor(query: JsAny? = definedExternally, direction: IDBCursorDirection = definedExternally): IDBRequest
}

/**
 * The IDBKeyRange interface of the IndexedDB API represents a continuous interval over some data type that is used for
 * keys. Records can be retrieved from IDBObjectStore and IDBIndex objects using keys or a range of keys. You can limit
 * the range using lower and upper bounds. For example, you can iterate over all values of a key in the value range A–Z.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBKeyRange : JsAny {
    /**
     * The lower read-only property of the IDBKeyRange interface returns the lower bound of the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lower)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val lower: JsAny?

    /**
     * The upper read-only property of the IDBKeyRange interface returns the upper bound of the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upper)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val upper: JsAny?

    /**
     * The lowerOpen read-only property of the IDBKeyRange interface returns a boolean indicating whether the
     * lower-bound value is included in the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerOpen)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val lowerOpen: Boolean

    /**
     * The upperOpen read-only property of the IDBKeyRange interface returns a boolean indicating whether the
     * upper-bound value is included in the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperOpen)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val upperOpen: Boolean

    /**
     * The includes() method of the IDBKeyRange interface returns a boolean indicating whether a specified key is inside
     * the key range.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/includes)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun includes(key: JsAny?): Boolean

    public companion object {
        /**
         * The only() static method of the IDBKeyRange interface creates a new key range containing a single value.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/only_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun only(value: JsAny?): IDBKeyRange

        /**
         * The lowerBound() static method of the IDBKeyRange interface creates a new key range with only a lower bound.
         * By default, it includes the lower endpoint value and is closed.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/lowerBound_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun lowerBound(lower: JsAny?, open: Boolean = definedExternally): IDBKeyRange

        /**
         * The upperBound() static method of the IDBKeyRange interface creates a new upper-bound key range. By default,
         * it includes the upper endpoint value and is closed.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/upperBound_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun upperBound(upper: JsAny?, open: Boolean = definedExternally): IDBKeyRange

        /**
         * The bound() static method of the IDBKeyRange interface creates a new key range with the specified upper and
         * lower bounds. The bounds can be open (that is, the bounds exclude the endpoint values) or closed (that is,
         * the bounds include the endpoint values). By default, the bounds are closed.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBKeyRange/bound_static)
         *
         * © Mozilla Contributors, licensed under CC BY-SA 2.5
         */
        public fun bound(lower: JsAny?, upper: JsAny?, lowerOpen: Boolean = definedExternally, upperOpen: Boolean = definedExternally): IDBKeyRange
    }
}

/**
 * The IDBRecord interface of the IndexedDB API represents a snapshot of a single record in an IDBObjectStore or
 * IDBIndex.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRecord)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBRecord : JsAny {
    public open val key: JsAny?
    public open val primaryKey: JsAny?
    public open val value: JsAny?
}

/**
 * The IDBCursor interface of the IndexedDB API represents a cursor for traversing or iterating over multiple records in
 * a database.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBCursor : UnionIDBCursorOrIDBIndexOrIDBObjectStore {
    /**
     * The source read-only property of the IDBCursor interface returns the IDBObjectStore or IDBIndex that the cursor
     * is iterating over. This function never returns null or throws an exception, even if the cursor is currently being
     * iterated, has iterated past its end, or its transaction is not active.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/source)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val source: UnionIDBIndexOrIDBObjectStore

    /**
     * The direction read-only property of the IDBCursor interface is a string that returns the direction of traversal
     * of the cursor (set using IDBObjectStore.openCursor for example). See the Value section below for possible values.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/direction)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val direction: IDBCursorDirection

    /**
     * The key read-only property of the IDBCursor interface returns the key for the record at the cursor's position. If
     * the cursor is outside its range, this is set to undefined. The cursor's key can be any data type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/key)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val key: JsAny?

    /**
     * The primaryKey read-only property of the IDBCursor interface returns the cursor's current effective key. If the
     * cursor is currently being iterated or has iterated outside its range, this is set to undefined. The cursor's
     * primary key can be any data type.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/primaryKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val primaryKey: JsAny?

    /**
     * The request read-only property of the IDBCursor interface returns the IDBRequest used to obtain the cursor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/request)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val request: IDBRequest

    /**
     * The advance() method of the IDBCursor interface sets the number of times a cursor should move its position
     * forward.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/advance)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun advance(count: Int)

    /**
     * The continue() method of the IDBCursor interface advances the cursor to the next position along its direction, to
     * the item whose key matches the optional key parameter. If no key is specified, the cursor advances to the
     * immediate next position, based on its direction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continue)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun `continue`(key: JsAny? = definedExternally)

    /**
     * The continuePrimaryKey() method of the IDBCursor interface advances the cursor to the item whose key matches the
     * key parameter as well as whose primary key matches the primary key parameter.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/continuePrimaryKey)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun continuePrimaryKey(key: JsAny?, primaryKey: JsAny?)

    /**
     * The update() method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, updates
     * the value at the current position of the cursor in the object store. If the cursor points to a record that has
     * just been deleted, a new record is created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/update)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun update(value: JsAny?): IDBRequest

    /**
     * The delete() method of the IDBCursor interface returns an IDBRequest object, and, in a separate thread, deletes
     * the record at the cursor's position, without changing the cursor's position. Once the record is deleted, the
     * cursor's value is set to null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursor/delete)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun delete(): IDBRequest
}

public external interface IDBCursorDirection : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val IDBCursorDirection.Companion.NEXT: IDBCursorDirection get() = "next".toJsString().unsafeCast<IDBCursorDirection>()
public inline val IDBCursorDirection.Companion.NEXTUNIQUE: IDBCursorDirection get() = "nextunique".toJsString().unsafeCast<IDBCursorDirection>()
public inline val IDBCursorDirection.Companion.PREV: IDBCursorDirection get() = "prev".toJsString().unsafeCast<IDBCursorDirection>()
public inline val IDBCursorDirection.Companion.PREVUNIQUE: IDBCursorDirection get() = "prevunique".toJsString().unsafeCast<IDBCursorDirection>()

/**
 * The IDBCursorWithValue interface of the IndexedDB API represents a cursor for traversing or iterating over multiple
 * records in a database. It is the same as the IDBCursor, except that it includes the value property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBCursorWithValue : IDBCursor {
    /**
     * The value read-only property of the IDBCursorWithValue interface returns the value of the current cursor,
     * whatever that is.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBCursorWithValue/value)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val value: JsAny?
}

/**
 * The IDBTransaction interface of the IndexedDB API provides a static, asynchronous transaction on a database using
 * event handler attributes. All reading and writing of data is done within transactions. You use IDBDatabase to start
 * transactions, IDBTransaction to set the mode of the transaction (e.g., is it readonly or readwrite), and you access
 * an IDBObjectStore to make a request. You can also use an IDBTransaction object to abort transactions.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction)
 *
 * © Mozilla Contributors, licensed under CC BY-SA 2.5
 */
public abstract external class IDBTransaction : EventTarget {
    /**
     * The objectStoreNames read-only property of the IDBTransaction interface returns a DOMStringList of names of
     * IDBObjectStore objects.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStoreNames)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val objectStoreNames: DOMStringList

    /**
     * The mode read-only property of the IDBTransaction interface returns the current mode for accessing the data in
     * the object stores in the scope of the transaction (i.e., is the mode to be read-only, or do you want to write to
     * the object stores?) The default value is readonly.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/mode)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val mode: IDBTransactionMode

    /**
     * The durability read-only property of the IDBTransaction interface returns the durability hint the transaction was
     * created with. This is a hint to the user agent of whether to prioritize performance or durability when committing
     * the transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/durability)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val durability: IDBTransactionDurability

    /**
     * The db read-only property of the IDBTransaction interface returns the database connection with which this
     * transaction is associated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/db)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val db: IDBDatabase

    /**
     * The error read-only property of the IDBTransaction interface returns the type of error when there is an
     * unsuccessful transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open val error: DOMException?

    /**
     * The objectStore() method of the IDBTransaction interface returns an object store that has already been added to
     * the scope of this transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/objectStore)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun objectStore(name: String): IDBObjectStore

    /**
     * The commit() method of the IDBTransaction interface commits the transaction if it is called on an active
     * transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/commit)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun commit()

    /**
     * The abort() method of the IDBTransaction interface rolls back all the changes to objects in the database
     * associated with this transaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open fun abort()

    /**
     * The abort event is fired when an IndexedDB transaction is aborted.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/abort_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onabort: ((Event) -> Unit)?

    /**
     * The complete event of the IndexedDB API is fired when the transaction has successfully committed, which is either
     * after you explicit call IDBTransaction.commit() or when all requests have been successfully completed, and after
     * handling their results, no new requests have been placed. See IDBTransaction for more information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/complete_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var oncomplete: ((Event) -> Unit)?

    /**
     * The error event is fired on IDBTransaction when a request returns an error and the event bubbles up to the
     * transaction object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBTransaction/error_event)
     *
     * © Mozilla Contributors, licensed under CC BY-SA 2.5
     */
    public open var onerror: ((Event) -> Unit)?
}

public external interface IDBTransactionMode : JsAny {
    @Suppress("COMPANION_OBJECT_IN_EXTERNAL_INTERFACE")
    public companion object
}

public inline val IDBTransactionMode.Companion.READONLY: IDBTransactionMode get() = "readonly".toJsString().unsafeCast<IDBTransactionMode>()
public inline val IDBTransactionMode.Companion.READWRITE: IDBTransactionMode get() = "readwrite".toJsString().unsafeCast<IDBTransactionMode>()
public inline val IDBTransactionMode.Companion.VERSIONCHANGE: IDBTransactionMode get() = "versionchange".toJsString().unsafeCast<IDBTransactionMode>()
