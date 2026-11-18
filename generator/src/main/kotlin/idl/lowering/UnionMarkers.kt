/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.ir.*
import org.jetbrains.kotlin.tools.idl.surface.Builtins

/**
 * An empty `external interface` standing for a union of interfaces. Every member extends it, so the union is a
 * Kotlin type: `drawImage(image: CanvasImageSource, …)` accepts an `HTMLImageElement`.
 *
 * @property spec the spec of the first use, where the marker is declared (allowlist order).
 * @property supertypes the markers whose members are a strict superset, nearest only: `CanvasImageSource` extends
 *   `ImageBitmapSource`, so a `CanvasImageSource` can be passed to `createImageBitmap`. Sound, because every member of
 *   the subset is a member of the superset.
 */
data class UnionMarker(
    val name: String,
    val members: List<String>,
    val spec: String,
    val supertypes: List<String> = emptyList()
)

/**
 * Unions whose members are all interfaces or mixins (`WindowProxy` counts as `Window`), as dukat did in
 * `resolveTypesKeepingUnions`. A marker is named after its typedef (`CanvasImageSource`), or `Union` + the sorted
 * member names for a union written out in place (`UnionElementOrRadioNodeList`), so equal anonymous unions share one.
 *
 * Unlike dukat, dictionaries, enums and callback interfaces do not qualify: a union with them is expanded into
 * overloads where it is an argument (see [expandUnionOverloads]) and printed as `JsAny` elsewhere.
 *
 * Like [Shapes], an analysis the backend reads: union types stay in the IR, and the backend prints a union that has a
 * marker as the marker's name, in any position.
 */
class UnionMarkers
private constructor(
    val byName: Map<String, UnionMarker>,
) {
    /**
     * The marker [type] is printed as, or `null` if it is not a union of interfaces. Only unions of interfaces are in
     * [byName], so looking up the name the union would have is enough.
     */
    operator fun get(type: IdlUnionType): UnionMarker? =
        memberNames(type)?.let { byName[nameOf(type, it)] }

    /** Every marker [interfaceName] is a member of, in order of first use. */
    fun allOf(interfaceName: String): List<String> =
        byName.values
            .filter { interfaceName in it.members }
            .map { it.name }

    /** The markers [interfaceName] extends directly: those of [allOf] that are not a supertype of another of them. */
    fun of(interfaceName: String): List<String> {
        val all = allOf(interfaceName)
            .map { byName.getValue(it) }

        return all
            .filter { m ->
                all.none { it isStrictSubsetOf m }
            }
            .map { it.name }
    }

    companion object {
        fun of(ir: IdlIR): UnionMarkers {
            val interfaces = ir.definitions
                .filterIsInstance<IdlInterface>()
                .filter { it.kind != IdlInterfaceKind.CALLBACK_INTERFACE }
                .map { it.name }
                .toSet()

            val definitionNames = ir.definitions
                .filterIsInstance<IdlNamedDefinition>()
                .map { it.name }
                .toSet()

            val problems = mutableListOf<String>()

            val markers = linkedMapOf<String, UnionMarker>()
            for ((val specName = name, val definitions) in ir.specs) {
                for (d in definitions) {
                    for (t in d.allTypes()) {
                        if (t !is IdlUnionType) continue

                        val members = memberNames(t)
                            ?.takeIf { names -> names.size > 1 && names.all { it in interfaces } }
                            ?: continue
                        val name = nameOf(t, members)
                        val existing = markers[name]
                        when {
                            existing == null -> {
                                if (name in definitionNames) problems += "union marker $name clashes with a definition"
                                markers[name] = UnionMarker(name, members, specName)
                            }

                            existing.members.toSet() != members.toSet() ->
                                problems += "union marker $name is both ${existing.members} and $members"
                        }
                    }
                }
            }

            if (problems.isNotEmpty()) throw LoweringException(problems)

            val withSupertypes = markers
                .mapValues { [_, m] ->
                    val supersets = markers.values
                        .filter { m isStrictSubsetOf it }

                    m.copy(
                        supertypes = supersets
                            .filter { s -> supersets.none { it isStrictSubsetOf s } }
                            .map { it.name }
                    )
                }

            return UnionMarkers(withSupertypes)
        }

        private infix fun UnionMarker.isStrictSubsetOf(other: UnionMarker) =
            other.members.containsAll(members) && !members.containsAll(other.members)

        private fun nameOf(type: IdlUnionType, members: List<String>): String =
            type.typedef
                ?: members
                    .sorted()
                    .joinToString("Or", prefix = "Union")

        /** The names of the members (`WindowProxy` as `Window`), or `null` if a member is generic or a union. */
        private fun memberNames(type: IdlUnionType): List<String>? =
            type.members
                .map { m ->
                    val name = (m as? IdlNamedType)?.name ?: return null
                    Builtins.ALIASES[name] ?: name
                }
                .distinct()
    }
}
