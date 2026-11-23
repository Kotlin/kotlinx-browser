/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*

/** Small builders for synthetic IR in lowering tests. */
internal object Idl {
    fun t(name: String, nullable: Boolean = false, extAttrs: List<IdlExtendedAttribute> = emptyList()) = IdlNamedType(name, nullable, extAttrs)
    fun union(vararg members: IdlType, nullable: Boolean = false) = IdlUnionType(members.toList(), nullable)
    fun seq(of: IdlType) = IdlGenericType("sequence", listOf(of))

    fun attr(name: String, type: IdlType = t("long"), extAttrs: List<IdlExtendedAttribute> = emptyList()) =
        IdlAttribute(name, type, readonly = false, special = null, extAttrs = extAttrs)

    fun arg(name: String, type: IdlType, optional: Boolean = false) = IdlArgument(name, type, optional, variadic = false, default = null, extAttrs = emptyList())
    fun op(name: String, returnType: IdlType = t("undefined"), vararg args: IdlArgument) = IdlOperation(name, returnType, args.toList(), special = null, extAttrs = emptyList())
    fun ctor(vararg args: IdlArgument) = IdlConstructor(args.toList(), emptyList())
    fun const(name: String, value: String) = IdlConstant(name, t("unsigned short"), IdlValue.Num(value), emptyList())
    fun ext(name: String, rhs: String? = null, vararg args: IdlArgument) =
        IdlExtendedAttribute(name, rhs?.let { IdlExtendedAttributeValue.Identifier(it) }, args.toList())

    fun iface(
        name: String,
        vararg members: IdlMember,
        partial: Boolean = false,
        inheritance: String? = null,
        kind: IdlInterfaceKind = IdlInterfaceKind.INTERFACE,
        extAttrs: List<IdlExtendedAttribute> = emptyList(),
    ) = IdlInterface(name, kind, partial, inheritance, members.toList(), extAttrs)

    fun mixin(name: String, vararg members: IdlMember, partial: Boolean = false) = iface(name, *members, partial = partial, kind = IdlInterfaceKind.MIXIN)
    fun includes(target: String, mixin: String) = IdlIncludes(target, mixin, emptyList())
    fun typedef(name: String, type: IdlType) = IdlTypedef(name, type, emptyList())
    fun spec(name: String, vararg definitions: IdlDefinition) = IdlSpec(name, "p.$name", definitions.toList())
    fun ir(vararg specs: IdlSpec) = IdlIR(specs.toList())

    fun IdlIR.iface(name: String) = definitions.filterIsInstance<IdlInterface>().single { it.name == name }
}
