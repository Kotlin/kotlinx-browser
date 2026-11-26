/*
 * Copyright 2010-2026 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
 */

package org.jetbrains.kotlin.tools.idl.lowering

import org.jetbrains.kotlin.tools.idl.TYPE_CORRECTIONS
import org.jetbrains.kotlin.tools.idl.TypeCorrection
import org.jetbrains.kotlin.tools.idl.ir.*

/**
 * Applies [corrections]: each named attribute or dictionary field gets the corrected type, keeping its nullability
 * and type-level extended attributes. Runs after [mergePartials], so a member declared in a partial is found.
 *
 * Like the exclusions, the list can only stay accurate: an entry whose owner or member is missing, or whose member
 * already has the corrected type, fails the build.
 */
fun IdlIR.correctTypes(corrections: List<TypeCorrection> = TYPE_CORRECTIONS): IdlIR {
    if (corrections.isEmpty()) return this
    val byMember = corrections.associateBy { it.owner to it.member }
    val applied = mutableSetOf<Pair<String, String>>()
    val problems = mutableListOf<String>()

    fun correct(owner: String, member: String, type: IdlType): IdlType {
        val correction = byMember[owner to member] ?: return type
        applied += owner to member
        if (type is IdlNamedType && type.name == correction.type) {
            problems += "$owner.$member is already ${correction.type}; remove it from TYPE_CORRECTIONS"
            return type
        }
        return IdlNamedType(correction.type, type.nullable, type.extAttrs)
    }

    val result = IdlIR(
        specs.map { spec ->
            spec.copy(
                definitions = spec.definitions.map { d ->
                    when (d) {
                        is IdlInterface -> d.copy(
                            members = d.members
                                .map { m ->
                                    if (m is IdlAttribute) {
                                        m.copy(type = correct(d.name, m.name, m.type))
                                    } else {
                                        m
                                    }
                                }
                        )

                        is IdlDictionary -> d.copy(
                            members = d.members
                                .map { f ->
                                    f.copy(type = correct(d.name, f.name, f.type))
                                }
                        )

                        else -> d
                    }
                }
            )
        }
    )
    (byMember.keys - applied).forEach { [owner, member] ->
        problems += "$owner.$member is not an attribute or dictionary field; remove it from TYPE_CORRECTIONS"
    }
    if (problems.isNotEmpty()) throw LoweringException(problems)
    return result
}
