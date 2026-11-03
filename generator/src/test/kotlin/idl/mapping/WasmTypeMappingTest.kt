/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.mapping

import org.jetbrains.kotlin.tools.idl.ir.IdlGenericType
import org.jetbrains.kotlin.tools.idl.ir.IdlNamedType
import org.jetbrains.kotlin.tools.idl.ir.IdlType
import org.jetbrains.kotlin.tools.idl.ir.IdlUnionType
import org.jetbrains.kotlin.tools.idl.loadAllowlistedIdl
import org.jetbrains.kotlin.tools.idl.ir.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class WasmTypeMappingTest {

    private fun value(t: IdlType) = WasmTypeMapping.map(t, TypePosition.VALUE)
    private fun ret(t: IdlType) = WasmTypeMapping.map(t, TypePosition.RETURN)
    private fun named(fq: String, nullable: Boolean = false, vararg args: KotlinType) =
        KotlinType.Named(fq, args.toList(), nullable)

    private fun t(name: String, nullable: Boolean = false) = IdlNamedType(name, nullable)

    @Test
    fun undefined() {
        assertEquals(named("kotlin.Unit"), ret(t("undefined")))
        assertFailsWith<UnmappableTypeException> { value(t("undefined")) }
        assertEquals(
            named("kotlin.js.Promise", false, named("kotlin.js.JsAny", nullable = true)),
            ret(IdlGenericType("Promise", listOf(t("undefined")))),
        )
    }

    @Test
    fun noDynamicAnywhere() {
        assertEquals(named("kotlin.js.JsAny", nullable = true), value(t("any")))
        assertEquals(named("kotlin.js.JsAny"), value(t("object")))
        assertEquals(named("kotlin.js.JsAny", nullable = true), value(t("object", nullable = true)))
        assertEquals(named("kotlin.js.JsAny"), value(t("DOMError")))
        assertEquals(named("kotlin.js.JsAny"), value(IdlGenericType("record", listOf(t("DOMString"), t("DOMString")))))
    }

    @Test
    fun integersAndBigint() {
        assertEquals(named("kotlin.Int"), value(t("unsigned long")))
        // JS Numbers, not BigInts: see WasmTypeMapping KDoc.
        assertEquals(named("kotlin.Double"), value(t("long long")))
        assertEquals(named("kotlin.Double"), value(t("unsigned long long")))
        assertEquals(named("kotlin.js.JsBigInt"), value(t("bigint")))
        assertEquals(named("kotlin.js.JsBigInt", nullable = true), value(t("bigint", nullable = true)))
    }

    @Test
    fun typeArgumentsAreJsAnyBounded() {
        val seq = { arg: IdlType -> value(IdlGenericType("sequence", listOf(arg))) }
        assertEquals(named("kotlin.js.JsArray", false, named("kotlin.js.JsString")), seq(t("DOMString")))
        assertEquals(named("kotlin.js.JsArray", false, named("kotlin.js.JsNumber")), seq(t("unsigned long long")))
        assertEquals(named("kotlin.js.JsArray", false, named("kotlin.js.JsBoolean")), seq(t("boolean")))
        assertEquals(named("kotlin.js.JsArray", false, named("kotlin.js.JsString", nullable = true)), seq(t("DOMString", nullable = true)))
        assertEquals(named("kotlin.js.JsArray", false, KotlinType.Reference("Node")), seq(t("Node")))
        assertEquals(
            named("kotlin.js.JsArray", false, named("kotlin.js.JsAny")),
            seq(IdlUnionType(listOf(t("Node"), t("DOMString")))),
        )
        assertEquals(
            named("kotlin.js.JsArray", true, KotlinType.Reference("CSSStyleSheet")),
            value(IdlGenericType("ObservableArray", listOf(t("CSSStyleSheet")), nullable = true)),
        )
    }

    @Test
    fun stringsAndBuffers() {
        for (s in listOf("DOMString", "USVString", "ByteString", "CSSOMString")) assertEquals(named("kotlin.String"), value(t(s)))
        assertEquals(named("org.khronos.webgl.Float32Array"), value(t("Float32Array")))
        assertEquals(named("org.khronos.webgl.BufferDataSource", nullable = true), value(t("BufferSource", nullable = true)))
    }

    @Test
    fun undefinedInUnionMeansNullable() {
        assertEquals(KotlinType.Reference("CSSStyleValue", nullable = true), ret(IdlUnionType(listOf(t("undefined"), t("CSSStyleValue")))))
        assertEquals(
            KotlinType.Union(listOf(KotlinType.Reference("Node"), named("kotlin.String")), nullable = true),
            value(IdlUnionType(listOf(t("undefined"), t("Node"), t("DOMString")))),
        )
    }

    @Test
    fun unionsStayUnionsForTheBackend() {
        assertEquals(
            KotlinType.Union(listOf(KotlinType.Reference("Node"), named("kotlin.String")), nullable = true),
            value(IdlUnionType(listOf(t("Node"), t("DOMString")), nullable = true)),
        )
    }

    /** The whole allowlisted surface maps without throwing, and nothing outside the JsAny world leaks through. */
    @Test
    fun wholeAllowlistMaps() {
        val ir = loadAllowlistedIdl()
        val mapped = mutableListOf<KotlinType>()
        fun visit(type: IdlType, position: TypePosition) {
            mapped += WasmTypeMapping.map(type, position)
        }
        for (definition in ir.definitions) {
            when (definition) {
                is IdlInterface -> definition.members.forEach { visitMember(it, ::visit) }
                is IdlNamespace -> definition.members.forEach { visitMember(it, ::visit) }
                is IdlDictionary -> definition.members.forEach { visit(it.type, TypePosition.VALUE) }
                is IdlCallback -> {
                    visit(definition.returnType, TypePosition.RETURN)
                    definition.arguments.forEach { visit(it.type, TypePosition.VALUE) }
                }
                is IdlTypedef -> visit(definition.type, TypePosition.VALUE)
                is IdlEnum, is IdlIncludes -> {}
            }
        }
        assertTrue(mapped.size > 5000, "mapped only ${mapped.size} types")
        val fqNames = mapped.flatMap { it.allNamed() }.map { it.fqName }.toSet()
        assertTrue(fqNames.none { "dynamic" in it }, "dynamic leaked: $fqNames")
    }

    private fun visitMember(member: IdlMember, visit: (IdlType, TypePosition) -> Unit) {
        when (member) {
            is IdlAttribute -> visit(member.type, TypePosition.VALUE)
            is IdlConstant -> visit(member.type, TypePosition.VALUE)
            is IdlOperation -> {
                member.returnType?.let { visit(it, TypePosition.RETURN) }
                member.arguments.forEach { visit(it.type, TypePosition.VALUE) }
            }
            is IdlConstructor -> member.arguments.forEach { visit(it.type, TypePosition.VALUE) }
            is IdlDeclarationMember -> member.typeArguments.forEach { visit(it, TypePosition.TYPE_ARGUMENT) }
        }
    }

    private fun KotlinType.allNamed(): List<KotlinType.Named> = when (this) {
        is KotlinType.Named -> listOf(this) + typeArguments.flatMap { it.allNamed() }
        is KotlinType.Reference -> emptyList()
        is KotlinType.Union -> alternatives.flatMap { it.allNamed() }
    }
}
