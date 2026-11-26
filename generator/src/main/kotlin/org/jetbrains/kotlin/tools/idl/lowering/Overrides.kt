/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.mapping.KotlinType
import org.jetbrains.kotlin.tools.idl.mapping.TypePosition
import org.jetbrains.kotlin.tools.idl.mapping.WasmTypeMapping

/**
 * How the members of one interface relate to the members of its supertypes in Kotlin.
 *
 * @property overriding own members printed with `override` (`DOMPoint.x` over `DOMPointReadOnly.x`, `NodeList.length`
 *   over `ItemArrayLike.length`).
 * @property dropped own members that cannot override an inherited member, so they are not generated, as dukat
 *   did: a different type for a `var`, a type that is not a subtype for a `val` or a return type,
 *   or a `val` over a `var` (`SVGElement.className` is an `SVGAnimatedString`, `Element.className` a `String`).
 * @property added members an open class must implement because it inherits them abstract: each member of an interface
 *   ancestor (mixin) that no class above it implements (`Document.onclick` from `GlobalEventHandlers`). Re-declared
 *   with `override`, printed as the declaring interface prints it, e.g. with that interface's narrowed event handler
 *   type. Statics are not inherited members in Kotlin; their copies are [Shape.inheritedStatics].
 */
data class InterfaceOverrides(
    val overriding: Set<IdlMember> = emptySet(),
    val dropped: Set<IdlMember> = emptySet(),
    val added: List<InheritedMember> = emptyList(),
) {
    fun isOverride(member: IdlMember): Boolean = member in overriding

    fun isDropped(member: IdlMember): Boolean = member in dropped

    companion object {
        val NONE = InterfaceOverrides()
    }
}

/**
 * Port of dukat's `addMissingMembers` and `OverrideHelper`: [InterfaceOverrides] for each interface, against its
 * supertypes ([Shape.supertypes], transitively: parent, mixins, union markers, and `ItemArrayLike`). Members are
 * matched by name, operations also by their Kotlin/Wasm parameter types ([WasmTypeMapping]), because that is what
 * Kotlin overrides by.
 *
 * Inheriting one member from two supertypes that do not inherit it from each other, without redeclaring it, is an
 * error (none on today's surface): Kotlin would require an explicit override with a type both accept.
 *
 * Like [Shapes], an analysis the backend reads; it needs [Shapes] and [UnionMarkers] for supertypes and subtyping.
 */
class Overrides
private constructor(
    /** Only interfaces with something to say; see [get]. */
    val byName: Map<String, InterfaceOverrides>,
) {
    operator fun get(name: String): InterfaceOverrides = byName[name] ?: InterfaceOverrides.NONE

    companion object {
        fun of(
            ir: IdlIR,
            shapes: Shapes,
            markers: UnionMarkers
        ): Overrides {
            val analysis = OverrideAnalysis(ir, shapes, markers)

            val byName = shapes.byName
                .filterValues { it.kind != ShapeKind.OBJECT }
                .mapValues { [name, _] -> analysis.overridesOf(name) }
                .filterValues { it != InterfaceOverrides.NONE }

            if (analysis.problems.isNotEmpty()) {
                throw LoweringException(analysis.problems)
            }

            return Overrides(byName)
        }
    }
}

/** The facts [Overrides] is computed from, for one lowered IR. */
private class OverrideAnalysis(
    ir: IdlIR,
    private val shapes: Shapes,
    private val markers: UnionMarkers,
) {
    val problems = mutableListOf<String>()

    private val interfaces = ir.definitions
        .filterIsInstance<IdlInterface>()
        .associateBy { it.name }

    private val ancestorsCache = mutableMapOf<String, Set<String>>()
    private val implementedCache = mutableMapOf<String, Set<String>>()

    fun overridesOf(name: String): InterfaceOverrides {
        checkInheritedOnce(name)
        val [overriding, dropped] = ownOverrides(name)
        return InterfaceOverrides(overriding, dropped, membersToAdd(name))
    }

    // ---------------------------------------------------------------------------------------------------------------
    // The three questions, per interface

    /**
     * The own members of [name] that redeclare an inherited member: those that can override it, and those that
     * cannot.
     */
    private fun ownOverrides(name: String): Pair<Set<IdlMember>, Set<IdlMember>> {
        val inheritedByKey = inheritedByKey(name)
        val overriding = mutableSetOf<IdlMember>()
        val conflicting = mutableSetOf<IdlMember>()

        declared(name)
            .filter { !it.member.isStatic() }
            .forEach { m ->
                val parents = inheritedByKey[key(m.member)]
                    .orEmpty()
                    .filter { !it.member.isStatic() }

                if (parents.isEmpty()) return@forEach

                if (parents.all { canOverride(m.member, it.member) }) {
                    overriding += m.member
                } else {
                    conflicting += m.member
                }
            }

        return overriding to conflicting
    }

    /** Reports a member [name] inherits from supertypes that do not inherit it from one another, unless redeclared. */
    private fun checkInheritedOnce(name: String) {
        val ownKeys = ownKeys(name)
        for ([k, from] in inheritedByKey(name)) {
            if (k in ownKeys) {
                continue
            }

            val owners = from
                .filter { !it.member.isStatic() }
                .map { it.declaredIn }
                .distinct()

            val nearest = owners
                .filter { o ->
                    owners.none { it != o && o in ancestors(it) }
                }

            if (nearest.size > 1) {
                problems += "$name inherits '$k' from both ${nearest.joinToString(" and ")}"
            }
        }
    }

    /**
     * What open class [name] re-declares: the abstract members no class above it implements.
     */
    private fun membersToAdd(name: String): List<InheritedMember> {
        if (shapes[name].kind != ShapeKind.OPEN_CLASS) {
            return emptyList()
        }

        val ownKeys = ownKeys(name)
        val alreadyImplemented = parentClass(name)
            ?.let { implemented(it) }
            .orEmpty()

        return inherited(name)
            .filter {
                isAbstractMember(it) &&
                        key(it.member) !in alreadyImplemented &&
                        key(it.member) !in ownKeys
            }
            .distinctBy { key(it.member) }
    }

    // ---------------------------------------------------------------------------------------------------------------
    // Members

    /** The members [name] declares that are functions or properties in Kotlin. */
    private fun declared(name: String): List<InheritedMember> =
        interfaces[name]
            ?.members
            .orEmpty()
            .filter { key(it) != null }
            .map { InheritedMember(it, name) }

    /** `ItemArrayLike<T>`'s members if [name] extends it, as the IDL members that override them are written. */
    private fun itemArrayLike(name: String): List<InheritedMember> {
        val itemType = shapes.byName[name]?.itemArrayLike
            ?: return emptyList()

        val index = IdlArgument(
            name = "index",
            type = UNSIGNED_LONG,
            optional = false,
            variadic = false,
            default = null,
            extAttrs = emptyList()
        )

        return listOf(
            InheritedMember(
                IdlAttribute(
                    "length",
                    UNSIGNED_LONG,
                    true,
                    null,
                    emptyList()
                ),
                ITEM_ARRAY_LIKE
            ),
            InheritedMember(
                IdlOperation(
                    "item",
                    itemType.withNullable(true),
                    listOf(index),
                    null,
                    emptyList()
                ),
                ITEM_ARRAY_LIKE
            ),
        )
    }

    private fun ownKeys(name: String): Set<String> =
        declared(name)
            .mapNotNull { key(it.member) }
            .toSet()

    /** Every member of every supertype of [name], including `ItemArrayLike`'s. */
    private fun inherited(name: String): List<InheritedMember> =
        ancestors(name).flatMap {
            declared(it) + itemArrayLike(it)
        } + itemArrayLike(name)

    private fun inheritedByKey(name: String): Map<String, List<InheritedMember>> =
        inherited(name).groupBy { key(it.member)!! }

    /** The key Kotlin overrides by; `null` for members that are not functions or properties in Kotlin. */
    private fun key(m: IdlMember): String? = when (m) {
        is IdlAttribute -> "val ${m.name}"

        // A named special operation (`getter Node? item(unsigned long index)`) is a function in Kotlin too.
        is IdlOperation -> m.name
            ?.let { name ->
                "fun $name" + m.arguments
                    .joinToString(", ", "(", ")") { (val type, val variadic) ->
                        kotlin(type, TypePosition.VALUE).toString() + if (variadic) "..." else ""
                    }
            }

        else -> null
    }

    private fun isAbstractMember(m: InheritedMember) = !isClass(m.declaredIn) && !m.member.isStatic()

    /** Keys of the non-static members class [name] has an implementation of: declared or added by it or a class above. */
    private fun implemented(name: String): Set<String> = implementedCache.getOrPut(name) {
        val own = ownKeys(name)
        val addedHere = if (shapes[name].kind == ShapeKind.OPEN_CLASS) {
            inherited(name)
                .filter(::isAbstractMember)
                .mapNotNull { key(it.member) }
        } else {
            emptyList()
        }
        own + addedHere + parentClass(name)?.let { implemented(it) }.orEmpty()
    }

    // ---------------------------------------------------------------------------------------------------------------
    // Supertypes

    /** Direct supertypes: [Shape.supertypes] plus `ItemArrayLike`, or a marker's supertypes. */
    private fun supertypes(name: String): List<String> {
        (val supertypes, val itemArrayLike) = shapes.byName[name]
            ?: return markers.byName[name]?.supertypes.orEmpty()

        return supertypes + listOfNotNull(ITEM_ARRAY_LIKE.takeIf { itemArrayLike != null })
    }

    /** All supertypes of [name], nearest first. */
    private fun ancestors(name: String): Set<String> = ancestorsCache.getOrPut(name) {
        val result = mutableSetOf<String>()

        fun visit(n: String): Unit = supertypes(n)
            .forEach {
                if (result.add(it)) {
                    visit(it)
                }
            }

        visit(name)

        result
    }

    private fun isClass(name: String) =
        shapes.byName[name]?.kind.let { it == ShapeKind.OPEN_CLASS || it == ShapeKind.ABSTRACT_CLASS }

    private fun parentClass(name: String): String? =
        shapes[name].supertypes
            .firstOrNull()
            ?.takeIf { isClass(it) }

    // ---------------------------------------------------------------------------------------------------------------
    // Kotlin types

    /** Whether [member] can override [parent] in Kotlin. */
    private fun canOverride(member: IdlMember, parent: IdlMember): Boolean =
        when {
            member is IdlAttribute && parent is IdlAttribute -> {
                val type = kotlin(member.type, TypePosition.VALUE)

                val parentType = kotlin(parent.type, TypePosition.VALUE)

                when {
                    parent.readonly -> isSubtype(type, parentType)

                    member.readonly && !parent.readonly -> false

                    else -> isSubtype(type, parentType) && isSubtype(parentType, type)
                }
            }

            member is IdlOperation && parent is IdlOperation -> isSubtype(
                kotlin(member.returnType!!, TypePosition.RETURN),
                kotlin(parent.returnType!!, TypePosition.RETURN),
            )

            else -> false
        }

    /** The Kotlin type of [type], with a union that has a marker as the marker. */
    private fun kotlin(type: IdlType, position: TypePosition): KotlinType =
        WasmTypeMapping.map(type, position) { markers[it]?.name }

    private fun isSubtype(a: KotlinType, b: KotlinType): Boolean = when {
        a.nullable && !b.nullable -> false

        b is KotlinType.Named && b.fqName == JS_ANY -> true

        a is KotlinType.Reference && b is KotlinType.Reference -> a.idlName == b.idlName || b.idlName in ancestors(a.idlName)

        else -> a.withNullable(false) == b.withNullable(false)
    }
}

private fun KotlinType.withNullable(nullable: Boolean): KotlinType =
    when (this) {
        is KotlinType.Named -> copy(nullable = nullable)
        is KotlinType.Reference -> copy(nullable = nullable)
        is KotlinType.Union -> copy(nullable = nullable)
    }

private const val JS_ANY = "kotlin.js.JsAny"
private const val ITEM_ARRAY_LIKE = "ItemArrayLike"
private val UNSIGNED_LONG = IdlNamedType("unsigned long")
