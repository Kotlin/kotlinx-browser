/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.dukat.js

import org.jetbrains.dukat.idlDeclarations.*
import org.jetbrains.dukat.idlLowerings.IDLLowering

class ResolveUnionsLowering : IDLLowering {
    override fun lowerTypeDeclaration(declaration: IDLTypeDeclaration, owner: IDLFileDeclaration): IDLTypeDeclaration {
        return when (val type = super.lowerTypeDeclaration(declaration, owner)) {
            is IDLUnionTypeDeclaration -> IDLSingleTypeDeclaration("\$dynamic", null, false)
            is IDLFunctionTypeDeclaration -> type.copy(
                arguments = type.arguments.map { lowerArgumentDeclaration(it, owner) },
                returnType = lowerTypeDeclaration(type.returnType, owner)
            )
            is IDLSingleTypeDeclaration -> type.copy(typeParameter = type.typeParameter?.let { lowerTypeDeclaration(it, owner) })
            else -> type
        }
    }
}

fun IDLSourceSetDeclaration.resolveRemainingUnions(): IDLSourceSetDeclaration {
    return ResolveUnionsLowering().lowerSourceSetDeclaration(this)
}