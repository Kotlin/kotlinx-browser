/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.surface

import org.jetbrains.kotlin.tools.idl.frontend.IdlSource
import org.jetbrains.kotlin.tools.idl.ir.*
import kotlin.test.*

/** Pruning and resolution rules on small synthetic corpora. */
class SurfaceBuilderTest {

    private fun t(name: String, nullable: Boolean = false) = IdlNamedType(name, nullable)
    private fun attr(name: String, type: IdlType) = IdlAttribute(name, type, readonly = false, special = null, extAttrs = emptyList())
    private fun op(name: String, returnType: IdlType, vararg args: IdlType) = IdlOperation(
        name, returnType, args.mapIndexed { i, a -> IdlArgument("a$i", a, optional = false, variadic = false, default = null, extAttrs = emptyList()) },
        special = null, extAttrs = emptyList(),
    )

    private fun iface(name: String, vararg members: IdlMember, partial: Boolean = false, inheritance: String? = null, extAttrs: List<IdlExtendedAttribute> = emptyList()) =
        IdlInterface(name, IdlInterfaceKind.INTERFACE, partial, inheritance, members.toList(), extAttrs)

    private fun spec(name: String, vararg definitions: IdlDefinition) = IdlSpec(name, "", definitions.toList())

    private val excludedSpec = spec("ext", iface("Ext"), iface("Other"))

    private fun build(vararg main: IdlDefinition, exclusions: List<Exclusion> = listOf(Exclusion.Spec("ext", "test")), extra: List<IdlSpec> = emptyList()) =
        SurfaceBuilder.build(
            IdlIR(listOf(spec("main", *main), excludedSpec) + extra),
            listOf(IdlSource("main", "p")),
            exclusions,
        )

    private fun SurfaceResult.main(name: String) =
        ir.specs.single().definitions.filterIsInstance<IdlInterface>().single { it.name == name }

    @Test
    fun unionAlternativeIsDroppedAndSingleAlternativeUnwrapped() {
        val r = build(iface("A", attr("x", IdlUnionType(listOf(t("Ext"), t("DOMString")), nullable = true))))
        assertEquals(t("DOMString", nullable = true), (r.main("A").members.single() as IdlAttribute).type)
        assertEquals(listOf("ext"), r.pruned.map { it.excludedBy })
    }

    @Test
    fun memberThatCannotBeExpressedIsRemoved() {
        val r = build(iface("A", attr("keep", t("long")), op("drop", t("undefined"), t("Ext"))))
        assertEquals(listOf("keep"), r.main("A").members.map { (it as IdlAttribute).name })
        assertTrue(r.pruned.single().description.startsWith("removed from interface A: undefined drop(Ext a0);"), r.pruned.toString())
    }

    @Test
    fun removalCascadesThroughTypedefsAndCallbacks() {
        val r = build(
            IdlTypedef("T", t("Ext"), emptyList()),
            IdlCallback("C", t("undefined"), listOf(IdlArgument("t", t("T"), false, false, null, emptyList())), emptyList()),
            iface("A", attr("c", t("C", nullable = true)), attr("n", t("long"))),
        )
        assertEquals(listOf("A"), r.ir.definitions.map { (it as IdlNamedDefinition).name }.toList())
        assertEquals(listOf("n"), r.main("A").members.map { (it as IdlAttribute).name })
        assertEquals(3, r.pruned.size, r.pruned.toString())
        assertTrue(r.pruned.all { it.excludedBy == "ext" })
    }

    @Test
    fun partialsAndIncludesOfExcludedDefinitionsAreRemoved() {
        val r = build(
            iface("Ext", attr("y", t("long")), partial = true),
            IdlIncludes("Ext", "M", emptyList()),
            IdlInterface("M", IdlInterfaceKind.MIXIN, false, null, emptyList(), emptyList()),
        )
        assertEquals(listOf("M"), r.ir.definitions.map { (it as IdlNamedDefinition).name }.toList())
    }

    @Test
    fun unresolvedReferenceFails() {
        val e = assertFailsWith<SurfaceException> {
            build(iface("A", attr("x", t("Unknown")), attr("y", t("Elsewhere"))), extra = listOf(spec("other", iface("Elsewhere"))))
        }
        assertTrue(e.problems.any { "'Unknown'" in it && "not defined anywhere" in it }, e.message)
        assertTrue(e.problems.any { "'Elsewhere'" in it && "defined in other, which is neither allowlisted nor excluded" in it }, e.message)
    }

    @Test
    fun unusedExclusionFails() {
        val e = assertFailsWith<SurfaceException> { build(iface("A", attr("x", t("long")))) }
        assertTrue(e.problems.single().contains("excluded spec 'ext' prunes nothing any more"), e.message)
    }

    @Test
    fun excludedTypeWorksLikeExcludedSpec() {
        val r = build(
            IdlTypedef("Data", IdlUnionType(listOf(t("Uint8ClampedArray"), t("Float16Array"))), emptyList()),
            iface("A", attr("x", t("Ext", nullable = true))),
            exclusions = listOf(Exclusion.Spec("ext", "test"), Exclusion.Type("Float16Array", "test")),
        )
        assertEquals(t("Uint8ClampedArray"), r.ir.definitions.filterIsInstance<IdlTypedef>().single().type)
        assertEquals(setOf("ext", "Float16Array"), r.pruned.map { it.excludedBy }.toSet())
    }

    @Test
    fun builtinsResolveAndBuiltinDefinitionsAreReplaced() {
        val r = build(
            IdlTypedef("BufferSource", IdlUnionType(listOf(t("ArrayBuffer"), t("ArrayBufferView"))), emptyList()),
            iface("A", attr("b", t("BufferSource")), attr("w", t("WindowProxy")), attr("e", t("Ext", nullable = true))),
            iface("Window"),
        )
        assertEquals(listOf("main: BufferSource"), r.replacedByBuiltins)
        assertEquals(listOf("b", "w"), r.main("A").members.map { (it as IdlAttribute).name })
    }

    @Test
    fun legacyWindowAliasesResolve() {
        val alias = IdlExtendedAttribute("LegacyWindowAlias", IdlExtendedAttributeValue.Identifier("SVGPoint"))
        val r = build(iface("DOMPoint", extAttrs = listOf(alias)), iface("A", attr("p", t("SVGPoint")), attr("e", t("Ext", nullable = true))))
        assertEquals(listOf("p"), r.main("A").members.map { (it as IdlAttribute).name })
    }

    @Test
    fun excludedAndIncludedAtOnceFails() {
        val e = assertFailsWith<SurfaceException> {
            SurfaceBuilder.build(IdlIR(listOf(spec("main"))), listOf(IdlSource("main", "p")), listOf(Exclusion.Spec("main", "x")))
        }
        assertTrue(e.problems.single().contains("both allowlisted and excluded"), e.message)
    }
}
