/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.frontend

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.jetbrains.kotlin.tools.idl.ir.*
import java.nio.file.Files
import java.nio.file.Path

/**
 * Reads `webref-idl.json` — a map from webref spec shortname to the `webidl2.js` AST of that spec, written by the
 * `prepareWebref` Gradle task from the pinned `@webref/idl` — into [IdlIR].
 *
 * The reader is strict: an unknown node `type`, an unexpected key, or a value of the wrong JSON shape is reported as a
 * problem rather than skipped, so a `webidl2` upgrade that changes the AST cannot silently shrink the generated API.
 * All problems are collected and reported together via [IdlFrontendException].
 */
class WebIdl2JsonFrontend(private val root: JsonObject) : IdlFrontend {

    /** Spec shortnames present in the JSON, in file order. */
    val availableSpecs: List<String> get() = root.keySet().toList()

    override fun parse(sources: List<IdlSource>): IdlIR {
        val problems = mutableListOf<String>()
        val reader = AstReader(problems)
        val specs = sources.mapNotNull { source ->
            val definitions = root.get(source.spec)
            if (definitions == null) {
                problems += "spec '${source.spec}' is not present in the webref JSON"
                return@mapNotNull null
            }
            IdlSpec(
                name = source.spec,
                packageName = source.packageName,
                definitions = reader.array(definitions, source.spec).mapIndexedNotNull { i, d ->
                    reader.definition(d, "${source.spec}[$i]")
                }
            )
        }
        if (problems.isNotEmpty()) throw IdlFrontendException(problems)
        return IdlIR(specs)
    }

    companion object {
        fun fromFile(path: Path): WebIdl2JsonFrontend =
            Files.newBufferedReader(path).use { fromJson(JsonParser.parseReader(it), path.toString()) }

        fun fromString(json: String): WebIdl2JsonFrontend = fromJson(JsonParser.parseString(json), "<string>")

        private fun fromJson(element: JsonElement, origin: String): WebIdl2JsonFrontend {
            require(element.isJsonObject) { "$origin: expected a JSON object mapping spec shortname to webidl2 AST" }
            return WebIdl2JsonFrontend(element.asJsonObject)
        }
    }
}

/**
 * Mechanical webidl2 AST → IR translation. Every method reports problems into [problems] and returns a best-effort
 * value (or `null`) so that one run surfaces all issues at once.
 */
private class AstReader(private val problems: MutableList<String>) {

    // ---- definitions ------------------------------------------------------------------------------------------------

    fun definition(element: JsonElement, path: String): IdlDefinition? {
        val o = obj(element, path) ?: return null
        val type = string(o, "type", path) ?: return null
        val at = "$path ($type ${o.get("name")?.takeIf { it.isJsonPrimitive }?.asString ?: o.get("target")?.asString ?: ""})"
        return when (type) {
            "interface", "interface mixin", "callback interface" -> {
                keys(o, at, "type", "name", "inheritance", "members", "extAttrs", "partial")
                IdlInterface(
                    name = string(o, "name", at) ?: "",
                    kind = when (type) {
                        "interface" -> IdlInterfaceKind.INTERFACE
                        "interface mixin" -> IdlInterfaceKind.MIXIN
                        else -> IdlInterfaceKind.CALLBACK_INTERFACE
                    },
                    partial = bool(o, "partial", at),
                    inheritance = nullableString(o, "inheritance", at),
                    members = members(o, at),
                    extAttrs = extAttrs(o, at),
                )
            }

            "namespace" -> {
                keys(o, at, "type", "name", "inheritance", "members", "extAttrs", "partial")
                if (nullableString(o, "inheritance", at) != null) problems += "$at: namespace with inheritance"
                IdlNamespace(
                    name = string(o, "name", at) ?: "",
                    partial = bool(o, "partial", at),
                    members = members(o, at),
                    extAttrs = extAttrs(o, at),
                )
            }

            "dictionary" -> {
                keys(o, at, "type", "name", "inheritance", "members", "extAttrs", "partial")
                IdlDictionary(
                    name = string(o, "name", at) ?: "",
                    partial = bool(o, "partial", at),
                    inheritance = nullableString(o, "inheritance", at),
                    members = array(o.get("members"), "$at.members").mapIndexedNotNull { i, m ->
                        field(m, "$at.members[$i]")
                    },
                    extAttrs = extAttrs(o, at),
                )
            }

            "callback" -> {
                keys(o, at, "type", "name", "idlType", "arguments", "extAttrs")
                IdlCallback(
                    name = string(o, "name", at) ?: "",
                    returnType = type(o.get("idlType"), "$at.idlType"),
                    arguments = arguments(o, at),
                    extAttrs = extAttrs(o, at),
                )
            }

            "enum" -> {
                keys(o, at, "type", "name", "values", "extAttrs")
                IdlEnum(
                    name = string(o, "name", at) ?: "",
                    values = array(o.get("values"), "$at.values").mapIndexedNotNull { i, v ->
                        val vp = "$at.values[$i]"
                        val vo = obj(v, vp) ?: return@mapIndexedNotNull null
                        keys(vo, vp, "type", "value")
                        if (string(vo, "type", vp) != "enum-value") problems += "$vp: expected enum-value"
                        string(vo, "value", vp)
                    },
                    extAttrs = extAttrs(o, at),
                )
            }

            "typedef" -> {
                keys(o, at, "type", "name", "idlType", "extAttrs")
                IdlTypedef(
                    name = string(o, "name", at) ?: "",
                    type = type(o.get("idlType"), "$at.idlType"),
                    extAttrs = extAttrs(o, at),
                )
            }

            "includes" -> {
                keys(o, at, "type", "target", "includes", "extAttrs")
                IdlIncludes(
                    target = string(o, "target", at) ?: "",
                    mixin = string(o, "includes", at) ?: "",
                    extAttrs = extAttrs(o, at),
                )
            }

            else -> {
                problems += "$at: unknown definition type '$type'"
                null
            }
        }
    }

    // ---- members ----------------------------------------------------------------------------------------------------

    private fun members(o: JsonObject, path: String): List<IdlMember> =
        array(o.get("members"), "$path.members").mapIndexedNotNull { i, m -> member(m, "$path.members[$i]") }

    private fun member(element: JsonElement, path: String): IdlMember? {
        val o = obj(element, path) ?: return null
        val type = string(o, "type", path) ?: return null
        val at = "$path ($type ${o.get("name")?.takeIf { it.isJsonPrimitive }?.asString ?: ""})"
        return when (type) {
            "const" -> {
                keys(o, at, "type", "name", "idlType", "extAttrs", "value")
                IdlConstant(
                    name = string(o, "name", at) ?: "",
                    type = type(o.get("idlType"), "$at.idlType"),
                    value = value(o.get("value"), "$at.value") ?: IdlValue.Null,
                    extAttrs = extAttrs(o, at),
                )
            }

            "attribute" -> {
                keys(o, at, "type", "name", "idlType", "extAttrs", "readonly", "special")
                IdlAttribute(
                    name = string(o, "name", at) ?: "",
                    type = type(o.get("idlType"), "$at.idlType"),
                    readonly = bool(o, "readonly", at),
                    special = when (val s = special(o, at)) {
                        null -> null
                        "static" -> IdlAttributeSpecial.STATIC
                        "stringifier" -> IdlAttributeSpecial.STRINGIFIER
                        "inherit" -> IdlAttributeSpecial.INHERIT
                        else -> null.also { problems += "$at: unknown attribute special '$s'" }
                    },
                    extAttrs = extAttrs(o, at),
                )
            }

            "operation" -> {
                keys(o, at, "type", "name", "idlType", "arguments", "extAttrs", "special")
                val special = when (val s = special(o, at)) {
                    null -> null
                    "static" -> IdlOperationSpecial.STATIC
                    "getter" -> IdlOperationSpecial.GETTER
                    "setter" -> IdlOperationSpecial.SETTER
                    "deleter" -> IdlOperationSpecial.DELETER
                    "stringifier" -> IdlOperationSpecial.STRINGIFIER
                    else -> null.also { problems += "$at: unknown operation special '$s'" }
                }
                val returnType = o.get("idlType")?.takeUnless { it.isJsonNull }?.let { type(it, "$at.idlType") }
                if (returnType == null && special != IdlOperationSpecial.STRINGIFIER) {
                    problems += "$at: operation without a return type"
                }
                IdlOperation(
                    name = string(o, "name", at)?.ifEmpty { null },
                    returnType = returnType,
                    arguments = arguments(o, at),
                    special = special,
                    extAttrs = extAttrs(o, at),
                )
            }

            "constructor" -> {
                keys(o, at, "type", "arguments", "extAttrs")
                IdlConstructor(arguments = arguments(o, at), extAttrs = extAttrs(o, at))
            }

            "iterable", "async_iterable", "maplike", "setlike" -> {
                keys(o, at, "type", "idlType", "arguments", "extAttrs", "readonly", "async")
                val async = bool(o, "async", at)
                val kind = when (type) {
                    "iterable" -> if (async) IdlDeclarationMemberKind.ASYNC_ITERABLE else IdlDeclarationMemberKind.ITERABLE
                    "async_iterable" -> IdlDeclarationMemberKind.ASYNC_ITERABLE
                    "maplike" -> IdlDeclarationMemberKind.MAPLIKE
                    else -> IdlDeclarationMemberKind.SETLIKE
                }
                if (async && kind != IdlDeclarationMemberKind.ASYNC_ITERABLE) problems += "$at: async $type"
                IdlDeclarationMember(
                    kind = kind,
                    typeArguments = array(o.get("idlType"), "$at.idlType").mapIndexed { i, t ->
                        type(t, "$at.idlType[$i]", allowNullNodeType = true)
                    },
                    readonly = bool(o, "readonly", at),
                    arguments = arguments(o, at),
                    extAttrs = extAttrs(o, at),
                )
            }

            else -> {
                problems += "$at: unknown member type '$type'"
                null
            }
        }
    }

    private fun special(o: JsonObject, path: String): String? =
        nullableString(o, "special", path)?.ifEmpty { null }

    private fun field(element: JsonElement, path: String): IdlField? {
        val o = obj(element, path) ?: return null
        val at = "$path (field ${o.get("name")?.takeIf { it.isJsonPrimitive }?.asString ?: ""})"
        keys(o, at, "type", "name", "idlType", "extAttrs", "default", "required")
        if (string(o, "type", at) != "field") problems += "$at: expected a dictionary field"
        return IdlField(
            name = string(o, "name", at) ?: "",
            type = type(o.get("idlType"), "$at.idlType"),
            required = bool(o, "required", at),
            default = value(o.get("default"), "$at.default"),
            extAttrs = extAttrs(o, at),
        )
    }

    private fun arguments(o: JsonObject, path: String): List<IdlArgument> =
        array(o.get("arguments"), "$path.arguments").mapIndexedNotNull { i, a -> argument(a, "$path.arguments[$i]") }

    private fun argument(element: JsonElement, path: String): IdlArgument? {
        val o = obj(element, path) ?: return null
        val at = "$path (${o.get("name")?.takeIf { it.isJsonPrimitive }?.asString ?: ""})"
        keys(o, at, "type", "name", "idlType", "extAttrs", "default", "optional", "variadic")
        if (string(o, "type", at) != "argument") problems += "$at: expected an argument"
        return IdlArgument(
            name = string(o, "name", at) ?: "",
            type = type(o.get("idlType"), "$at.idlType"),
            optional = bool(o, "optional", at),
            variadic = bool(o, "variadic", at),
            default = value(o.get("default"), "$at.default"),
            extAttrs = extAttrs(o, at),
        )
    }

    // ---- types ------------------------------------------------------------------------------------------------------

    private val typeNodeTypes = setOf(
        "argument-type", "attribute-type", "callback-type", "const-type", "dictionary-type", "return-type", "typedef-type",
    )

    /**
     * @param allowNullNodeType webidl2 emits `"type": null` for the type arguments of `iterable`/`maplike`/`setlike`
     *   and for every type nested inside them.
     */
    fun type(element: JsonElement?, path: String, allowNullNodeType: Boolean = false): IdlType {
        val fallback = IdlNamedType("<error>")
        val o = obj(element, path) ?: return fallback
        keys(o, path, "type", "extAttrs", "generic", "nullable", "union", "idlType")
        val nodeType = o.get("type")
        if (nodeType == null || nodeType.isJsonNull) {
            if (!allowNullNodeType) problems += "$path: type node without 'type'"
        } else if (!nodeType.isJsonPrimitive || nodeType.asString !in typeNodeTypes) {
            problems += "$path: unknown type node '$nodeType'"
        }

        val nullable = bool(o, "nullable", path)
        val extAttrs = extAttrs(o, path)
        val generic = string(o, "generic", path) ?: ""
        val union = bool(o, "union", path)
        val inner = o.get("idlType")

        return when {
            union -> {
                if (generic.isNotEmpty()) problems += "$path: union with generic '$generic'"
                IdlUnionType(
                    members = array(inner, "$path.idlType").mapIndexed { i, t -> type(t, "$path.idlType[$i]", allowNullNodeType) },
                    nullable = nullable,
                    extAttrs = extAttrs,
                )
            }

            generic.isNotEmpty() -> {
                val args = array(inner, "$path.idlType").mapIndexed { i, t -> type(t, "$path.idlType[$i]", allowNullNodeType) }
                val expectedArity = GENERIC_ARITY[generic]
                if (expectedArity == null) problems += "$path: unknown generic type '$generic'"
                else if (args.size != expectedArity) problems += "$path: $generic expects $expectedArity type argument(s), got ${args.size}"
                IdlGenericType(generic, args, nullable, extAttrs)
            }

            else -> {
                val name = if (inner != null && inner.isJsonPrimitive && inner.asJsonPrimitive.isString) inner.asString else {
                    problems += "$path: expected a type name, got $inner"
                    "<error>"
                }
                IdlNamedType(name, nullable, extAttrs)
            }
        }
    }

    // ---- values -----------------------------------------------------------------------------------------------------

    private fun value(element: JsonElement?, path: String): IdlValue? {
        if (element == null || element.isJsonNull) return null
        val o = obj(element, path) ?: return null
        val type = string(o, "type", path) ?: return null
        return when (type) {
            "string" -> keys(o, path, "type", "value").let { IdlValue.Str(string(o, "value", path) ?: "") }
            "number" -> keys(o, path, "type", "value").let { IdlValue.Num(string(o, "value", path) ?: "0") }
            "boolean" -> keys(o, path, "type", "value").let { IdlValue.Bool(bool(o, "value", path)) }
            "null" -> keys(o, path, "type").let { IdlValue.Null }
            "NaN" -> keys(o, path, "type").let { IdlValue.NaN }
            "Infinity" -> keys(o, path, "type", "negative").let { IdlValue.Infinity(bool(o, "negative", path)) }
            "sequence" -> {
                keys(o, path, "type", "value")
                if (array(o.get("value"), "$path.value").size() != 0) problems += "$path: non-empty sequence default"
                IdlValue.EmptySequence
            }

            "dictionary" -> keys(o, path, "type").let { IdlValue.EmptyDictionary }
            else -> null.also { problems += "$path: unknown value type '$type'" }
        }
    }

    // ---- extended attributes ----------------------------------------------------------------------------------------

    private fun extAttrs(o: JsonObject, path: String): List<IdlExtendedAttribute> =
        array(o.get("extAttrs"), "$path.extAttrs").mapIndexedNotNull { i, e -> extAttr(e, "$path.extAttrs[$i]") }

    private fun extAttr(element: JsonElement, path: String): IdlExtendedAttribute? {
        val o = obj(element, path) ?: return null
        val at = "$path [${o.get("name")?.takeIf { it.isJsonPrimitive }?.asString ?: ""}]"
        keys(o, at, "type", "name", "rhs", "arguments")
        if (string(o, "type", at) != "extended-attribute") problems += "$at: expected an extended-attribute"
        return IdlExtendedAttribute(
            name = string(o, "name", at) ?: "",
            rhs = extAttrValue(o.get("rhs"), "$at.rhs"),
            arguments = arguments(o, at),
        )
    }

    private fun extAttrValue(element: JsonElement?, path: String): IdlExtendedAttributeValue? {
        if (element == null || element.isJsonNull) return null
        val o = obj(element, path) ?: return null
        keys(o, path, "type", "value")
        fun items(): List<String> = array(o.get("value"), "$path.value").mapIndexedNotNull { i, item ->
            val ip = "$path.value[$i]"
            obj(item, ip)?.let { keys(it, ip, "value"); string(it, "value", ip) }
        }

        fun scalar(): String = string(o, "value", path) ?: ""
        return when (val type = string(o, "type", path)) {
            "identifier" -> IdlExtendedAttributeValue.Identifier(scalar())
            "identifier-list" -> IdlExtendedAttributeValue.IdentifierList(items())
            "string" -> IdlExtendedAttributeValue.StringValue(unquote(scalar(), path))
            "string-list" -> IdlExtendedAttributeValue.StringList(items().map { unquote(it, path) })
            "integer" -> IdlExtendedAttributeValue.Integer(scalar())
            "integer-list" -> IdlExtendedAttributeValue.IntegerList(items())
            "decimal" -> IdlExtendedAttributeValue.Decimal(scalar())
            "decimal-list" -> IdlExtendedAttributeValue.DecimalList(items())
            "*" -> IdlExtendedAttributeValue.Wildcard
            else -> null.also { problems += "$path: unknown extended attribute value type '$type'" }
        }
    }

    /** webidl2 keeps the quotes on string-valued extended attributes (but not on string default values). */
    private fun unquote(s: String, path: String): String {
        if (s.length < 2 || !s.startsWith('"') || !s.endsWith('"')) {
            problems += "$path: expected a quoted string, got $s"
            return s
        }
        return s.substring(1, s.length - 1)
    }

    // ---- strict JSON access -----------------------------------------------------------------------------------------

    private fun keys(o: JsonObject, path: String, vararg allowed: String) {
        val unknown = o.keySet() - allowed.toSet()
        if (unknown.isNotEmpty()) problems += "$path: unexpected key(s) ${unknown.sorted()}"
    }

    private fun obj(element: JsonElement?, path: String): JsonObject? {
        if (element != null && element.isJsonObject) return element.asJsonObject
        problems += "$path: expected an object, got $element"
        return null
    }

    fun array(element: JsonElement?, path: String): JsonArray {
        if (element != null && element.isJsonArray) return element.asJsonArray
        problems += "$path: expected an array, got $element"
        return JsonArray()
    }

    private fun string(o: JsonObject, key: String, path: String): String? {
        val e = o.get(key)
        if (e != null && e.isJsonPrimitive && e.asJsonPrimitive.isString) return e.asString
        problems += "$path.$key: expected a string, got $e"
        return null
    }

    private fun nullableString(o: JsonObject, key: String, path: String): String? {
        val e = o.get(key)
        if (e == null || e.isJsonNull) return null
        return string(o, key, path)
    }

    private fun bool(o: JsonObject, key: String, path: String): Boolean {
        val e = o.get(key)
        if (e != null && e.isJsonPrimitive && e.asJsonPrimitive.isBoolean) return e.asBoolean
        problems += "$path.$key: expected a boolean, got $e"
        return false
    }

    private companion object {
        val GENERIC_ARITY = mapOf(
            "sequence" to 1,
            "FrozenArray" to 1,
            "ObservableArray" to 1,
            "Promise" to 1,
            "async_sequence" to 1,
            "record" to 2,
        )
    }
}
