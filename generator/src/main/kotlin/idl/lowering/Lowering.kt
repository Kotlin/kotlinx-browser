/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.frontend.WebrefEvent
import org.jetbrains.kotlin.tools.idl.ir.IdlIR
import org.jetbrains.kotlin.tools.idl.ir.IdlInterface
import org.jetbrains.kotlin.tools.idl.ir.IdlNamedDefinition
import org.jetbrains.kotlin.tools.idl.ir.IdlUnionType
import org.jetbrains.kotlin.tools.idl.ir.allTypes
import org.jetbrains.kotlin.tools.idl.ir.render

/**
 * The input of the backend: the IR after all IR-to-IR lowerings, plus the analyses computed from it.
 *
 * Invariants: no `partial` definitions, no typedefs, every `includes` names an interface and a mixin, and every union
 * in an operation or constructor argument has a [UnionMarker].
 */
class LoweredIR(
    val ir: IdlIR,
    val shapes: Shapes,
    val eventHandlerTypes: EventHandlerTypes,
    val unionMarkers: UnionMarkers,
    val overrides: Overrides,
)

/**
 * The lowering pipeline, in order. Each pass is IR → IR and can be tested on its own. [events] is `@webref/events`,
 * read by [EventHandlerTypes].
 */
fun IdlIR.lower(events: List<WebrefEvent>): LoweredIR {
    val resolved = this
        .mergePartials()
        .resolveTypedefs()

    val markers = UnionMarkers.of(resolved)

    val ir = resolved
        .expandUnionOverloads(markers)

    val shapes = Shapes.of(ir, markers)

    return LoweredIR(
        ir,
        shapes,
        EventHandlerTypes.of(ir, events),
        markers,
        Overrides.of(ir, shapes, markers),
    )
}

/**
 * Renders the lowered IR as Web IDL, with each interface preceded by a `// shape:` comment holding the facts the
 * backend will act on (kind, supertypes, copied constants and statics, overrides, narrowed event handler types), and each spec followed by the
 * union markers it declares that its definitions use. Used for golden files.
 */
fun LoweredIR.render(): String = buildString {
    for ((val name, val packageName, val definitions) in ir.specs) {
        append("// spec: ").append(name).append(" (").append(packageName).append(")\n")
        definitions
            .asSequence()
            .flatMap { it.allTypes() }
            .filterIsInstance<IdlUnionType>()
            .mapNotNull { unionMarkers[it] }
            .distinct()
            .filter { it.spec == name }
            .toList()
            .forEach {
                append("// union marker ").append(it.name)
                if (it.supertypes.isNotEmpty()) append(" : ").append(it.supertypes.joinToString(", "))
                append(" = ").append(it.members.joinToString(" | ")).append('\n')
            }
        for (d in definitions) {
            if (d is IdlNamedDefinition) {
                shapes.byName[d.name]?.let {
                    append(it.render())
                }
                renderOverrides(overrides[d.name])
                val events = eventHandlerTypes.of(d.name)
                if (events.isNotEmpty()) {
                    append("//   event types: ")
                    append(events.entries.sortedBy { it.key }.joinToString(", ") { "${it.key}=${it.value}" })
                    append('\n')
                }
            }

            append(d.render()).append('\n')

            if (d is IdlInterface) {
                shapes.factoryClasses
                    .filter { it.host == d.name }
                    .forEach { (val nameFactoryClass = name, val host, val arguments) ->
                        append("// factory class ")
                            .append(nameFactoryClass)
                            .append('(')
                            .append(
                                arguments.joinToString(", ") {
                                    it.render()
                                }
                            )
                            .append(") : ")
                            .append(host)
                            .append('\n')
                        append(shapes[nameFactoryClass].render())
                    }
            }
        }
    }
}

private fun StringBuilder.renderOverrides(overrides: InterfaceOverrides) {
    val [overriding, dropped, added] = overrides
    if (overriding.isNotEmpty()) {
        append("//   overrides: ").append(overriding.joinToString(", ") { memberKey(it) }).append('\n')
    }
    if (added.isNotEmpty()) {
        append("//   adds: ")
        append(added.groupBy { it.declaredIn }.entries.joinToString("; ") { [from, ms] -> "$from(${ms.size})" })
        append('\n')
    }
    if (dropped.isNotEmpty()) {
        append("//   dropped: ")
        append(dropped.joinToString(", ") { memberKey(it) })
        append('\n')
    }
}

private fun Shape.render(): String = buildString {
    append("// shape: ").append(kind.name.lowercase().replace('_', ' '))
    val all = supertypes + listOfNotNull(itemArrayLike?.let { "ItemArrayLike<${it.render()}>" })
    if (all.isNotEmpty()) {
        append(" : ").append(all.joinToString(", "))
    }
    append('\n')
    if (constants.isNotEmpty()) {
        val inherited = constants
            .filter { it.declaredIn != name }

        if (inherited.isNotEmpty()) {
            append("//   copied constants: ")
            append(
                inherited
                    .groupBy { it.declaredIn }
                    .entries
                    .joinToString("; ") { [from, cs] ->
                        "$from(${cs.size})"
                    }
            )
            append('\n')
        }
    }
    if (inheritedStatics.isNotEmpty()) {
        append("//   copied statics: ")
        append(
            inheritedStatics
                .groupBy { it.declaredIn }
                .entries
                .joinToString("; ") { [from, ms] ->
                    "$from(${ms.size})"
                }
        )
        append('\n')
    }
}
