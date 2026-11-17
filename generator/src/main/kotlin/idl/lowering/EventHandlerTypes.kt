/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.frontend.WebrefEvent
import org.jetbrains.kotlin.tools.idl.frontend.WebrefEventTarget
import org.jetbrains.kotlin.tools.idl.ir.*

/**
 * Event handler attributes whose event type is narrower than `Event`, e.g. `GlobalEventHandlers.onclick` →
 * `PointerEvent`. Web IDL types every handler as `EventHandler` (a callback taking `Event`); the actual event types come
 * from `@webref/events`. Replaces dukat's hand-written `specifyEventHandlerTypes` table.
 *
 * The backend prints a narrowed attribute's callback with `Event` replaced by the event type:
 * `var onclick: ((PointerEvent) -> JsAny?)?`. Like [Shapes], this is an analysis the backend reads; the IR is unchanged,
 * because it has no function types (`onclick` is a reference to the callback `EventHandlerNonNull`).
 *
 * The type of handler `on<type>` declared on interface or mixin `X`:
 *  1. The candidate events are those of that type with a target, or an interface on the target's bubbling path, that
 *     is related (an ancestor, a descendant or the same) to `X`, or to an interface including `X` if it is a mixin.
 *  2. A plain `Event` candidate is dropped when a more specific candidate covers all of its targets: HTML's event index
 *     lists `focus` as `Event` at `Window` and `HTMLElement`, UI Events as `FocusEvent` at `Window` and `Element`.
 *  3. A candidate interface outside the surface counts as `Event`: its ancestry is unknown, and every event interface
 *     extends `Event`. (Today no surface handler has such a candidate besides plain-`Event` fallbacks, e.g.
 *     `onsecuritypolicyviolation` with `SecurityPolicyViolationEvent` from the excluded CSP spec.)
 *  4. The handler's type is the nearest common ancestor of the candidates. Without candidates it stays `Event`.
 *
 * So a handler shared by different events gets their common type: `GlobalEventHandlers.onprogress` stays `Event`,
 * because media elements fire `progress` as a plain `Event` and XHR as `ProgressEvent`.
 */
class EventHandlerTypes private constructor(
    private val byAttribute: Map<Pair<String, String>, String>,
    /** Handlers no `@webref/events` entry reaches (e.g. `onwebkitanimationend`), as `owner` to `attribute`. */
    val withoutEventData: List<Pair<String, String>>,
) {

    /** The narrowed event type of [attribute] declared on [owner] (an interface or mixin), or `null` for `Event`. */
    operator fun get(owner: String, attribute: String): String? = byAttribute[owner to attribute]

    /** All narrowed attributes of [owner], in no particular order. */
    fun of(owner: String): Map<String, String> =
        byAttribute.filterKeys { it.first == owner }.mapKeys { it.key.second }

    companion object {
        fun of(ir: IdlIR, events: List<WebrefEvent>): EventHandlerTypes {
            val callbacks = ir.definitions.filterIsInstance<IdlCallback>().associateBy { it.name }
            val interfaces = ir.definitions.filterIsInstance<IdlInterface>().associateBy { it.name }
            val includedBy = ir.definitions.filterIsInstance<IdlIncludes>().groupBy({ it.mixin }, { it.target })
            val eventsByType = events.groupBy { it.type }
            val problems = mutableListOf<String>()

            fun takesEvent(type: IdlType): Boolean {
                val callback = (type as? IdlNamedType)?.let { callbacks[it.name] } ?: return false
                return callback.arguments.any { it.type == IdlNamedType(EVENT) }
            }

            /** [name] and its surface ancestors, nearest first; just [name] for an interface outside the surface. */
            fun ancestors(name: String) = generateSequence(name) { interfaces[it]?.inheritance }.toList()
            fun isSameOrDescendant(name: String, of: String) = of in ancestors(name)
            fun related(a: String, b: String) = isSameOrDescendant(a, b) || isSameOrDescendant(b, a)

            fun candidates(type: String, hosts: List<String>): List<WebrefEvent> {
                fun reaches(t: WebrefEventTarget) = (listOf(t.target) + t.bubblingPath).any { p -> hosts.any { related(it, p) } }
                val reaching = eventsByType[type].orEmpty().filter { e -> e.targets.any(::reaches) }
                val specific = reaching.filter { it.eventInterface != EVENT }
                return reaching.filter { e ->
                    e.eventInterface != EVENT || specific.none { s ->
                        e.targets.all { et -> s.targets.any { st -> isSameOrDescendant(et.target, st.target) } }
                    }
                }
            }

            fun commonAncestor(names: Collection<String>): String? =
                names.map { ancestors(it) }.reduce { acc, chain -> acc.filter { it in chain } }.firstOrNull()

            val byAttribute = mutableMapOf<Pair<String, String>, String>()
            val withoutEventData = mutableListOf<Pair<String, String>>()
            for (owner in interfaces.values) {
                val hosts = if (owner.kind == IdlInterfaceKind.MIXIN) includedBy[owner.name].orEmpty() else listOf(owner.name)
                for (a in owner.members.filterIsInstance<IdlAttribute>()) {
                    if (!a.name.startsWith("on") || !takesEvent(a.type)) continue
                    val handler = "${owner.name}.${a.name}"
                    val found = candidates(a.name.removePrefix("on"), hosts)
                    if (found.isEmpty()) {
                        withoutEventData += owner.name to a.name
                        continue
                    }
                    val types = found.map { if (it.eventInterface in interfaces) it.eventInterface else EVENT }.toSet()
                    val type = commonAncestor(types)
                        ?: continue.also { problems += "$handler: events $types have no common ancestor" }
                    if (type != EVENT) byAttribute[owner.name to a.name] = type
                }
            }
            if (problems.isNotEmpty()) throw LoweringException(problems)
            return EventHandlerTypes(byAttribute, withoutEventData)
        }

        private const val EVENT = "Event"
    }
}
