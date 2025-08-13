/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.dukat.wasm

import dukat.common.PutExpectActualToDeclarations
import dukat.util.suppress
import org.jetbrains.dukat.astCommon.IdentifierEntity
import org.jetbrains.dukat.astCommon.NameEntity
import org.jetbrains.dukat.astModel.*
import org.jetbrains.dukat.astModel.modifiers.ExpectActualModifier
import org.jetbrains.dukat.idlLowerings.*
import org.jetbrains.dukat.idlParser.parseIDL
import org.jetbrains.dukat.idlReferenceResolver.DirectoryReferencesResolver
import org.jetbrains.dukat.model.commonLowerings.*
import org.jetbrains.dukat.ownerContext.NodeOwner

fun translateIdlToWasmSourceSet(fileName: String): SourceSetModel {
    val translationContext = TranslationContext()
    return parseIDL(fileName, DirectoryReferencesResolver())
        .voidifyEventHandlerReturnType()
        .resolvePartials()
        .addConstructors()
        .resolveTypedefs()
        .specifyEventHandlerTypes()
        .specifyDefaultValues()
        .resolveImplementsStatements()
        .resolveMixins()
        .addItemArrayLike()
        .resolveTypesKeepingUnions()
        .addOverloadsForUnions()
        .markAbstractOrOpen()
        .addMissingMembers()
        .addOverloadsForCallbacks()
        .convertToWasmModel()
        .lower(
            ModelContextAwareLowering(translationContext),
            LowerOverrides(translationContext),
            EscapeIdentificators(),
        )
        .lower(PutExpectActualToDeclarations(ExpectActualModifier.ACTUAL),ReplaceDynamics())  // Wasm-specific
        .addKDocs()
        .relocateDeclarations()
        .addImportsForUsedPackages()
        .omitStdLib()
        .lower(WasmPostProcessingHacks())
}

class WasmPostProcessingHacks : TopLevelModelLowering {
    private fun fineItemMethodThatOverridersItemArrayLikeOrNull(klass: ClassLikeModel): MethodModel? {
        if (klass.parentEntities.none { it.value.value == IdentifierEntity("ItemArrayLike") })
            return null

        return klass.members.filterIsInstance<MethodModel>().find { member ->
            member.name == IdentifierEntity("item") &&
                    (member.parameters.firstOrNull()?.type as? TypeValueModel)?.value == IdentifierEntity("Int")
        }
    }

    override fun lower(module: ModuleModel): ModuleModel {
        module.annotations.add(
            suppress(
                "EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE",
                "NON_EXTERNAL_TYPE_EXTENDS_EXTERNAL_TYPE",
                "CALL_TO_DEFINED_EXTERNALLY_FROM_NON_EXTERNAL_DECLARATION",
                "JS_NAME_CLASH",
                "EXPECT_ACTUAL_IR_INCOMPATIBILITY",
                "EXPECT_ACTUAL_IR_MISMATCH",
                "AMBIGUOUS_ACTUALS",
                "WRONG_JS_INTEROP_TYPE",
                file = true
            )
        )
        return super.lower(module)
    }

    override fun lowerClassLikeModel(ownerContext: NodeOwner<ClassLikeModel>, parentModule: ModuleModel): ClassLikeModel {
        val klass: ClassLikeModel = super.lowerClassLikeModel(ownerContext, parentModule)
        val itemMethodThatOverridesAny: MethodModel = fineItemMethodThatOverridersItemArrayLikeOrNull(klass)
            ?: return klass

        fun translateMember(member: MemberModel): MemberModel {
            if (member !== itemMethodThatOverridesAny) return member

            val newTypeIdentifier = when ((member.type as? TypeValueModel)?.value) {
                IdentifierEntity("String") -> IdentifierEntity("JsString")
                else -> null
            }

            val newType = if (newTypeIdentifier != null) {
                TypeValueModel(
                    IdentifierEntity("JsString"),
                    fqName = null,
                    metaDescription = null,
                    nullable = member.type.nullable,
                    params = emptyList()
                )
            } else {
                member.type
            }

            return member.copy(
                type = newType,
                override = listOf<NameEntity>(IdentifierEntity("item"))
            )
        }

        return when(klass) {
            is ClassModel -> klass.copy(members = klass.members.map(::translateMember))
            is InterfaceModel -> klass.copy(members = klass.members.map(::translateMember))
            is ObjectModel -> klass.copy(members = klass.members.map(::translateMember))
            else -> error("Unknown ClassLikeModel: ${klass::class}")
        }
    }
}
