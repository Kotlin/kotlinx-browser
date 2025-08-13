/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.tools.dukat.js

import dukat.common.PutExpectActualToDeclarations
import dukat.util.primitiveType
import dukat.util.suppress
import org.jetbrains.dukat.astModel.*
import org.jetbrains.dukat.astModel.modifiers.ExpectActualModifier
import org.jetbrains.dukat.idlDeclarations.IDLOperationDeclaration
import org.jetbrains.dukat.idlLowerings.*
import org.jetbrains.dukat.idlParser.parseIDL
import org.jetbrains.dukat.idlReferenceResolver.DirectoryReferencesResolver
import org.jetbrains.dukat.model.commonLowerings.*
import org.jetbrains.dukat.ownerContext.NodeOwner
import org.jetbrains.dukat.stdlib.isDynamic
import org.jetbrains.kotlin.tools.dukat.wasm.addOverloadsForUnions
import org.jetbrains.kotlin.tools.dukat.wasm.resolveTypesKeepingUnions
import kotlin.collections.listOf

fun translateIdlToJsSourceSet(fileName: String): SourceSetModel {
    val translationContext = TranslationContext()
    val hiddenOverloads = hashSetOf<IDLOperationDeclaration>()
    return parseIDL(fileName, DirectoryReferencesResolver())
        .resolvePartials()
        .addConstructors()
        .resolveTypedefs()
        .specifyEventHandlerTypes()
        .specifyDefaultValues()
        .resolveImplementsStatements()
        .resolveMixins()
        .addItemArrayLike()
        .resolveTypesKeepingUnions()
        .addOverloadsForUnions(addDynamicOverload = true, hiddenOverloads = hiddenOverloads)
        .resolveRemainingUnions()
        .markAbstractOrOpen()
        .addMissingMembers()
        .addOverloadsForCallbacks()
        .convertToJsModel(hiddenOverloads)
        .lower(
            ModelContextAwareLowering(translationContext),
            LowerOverrides(translationContext),
            EscapeIdentificators(),
            PutExpectActualToDeclarations(ExpectActualModifier.ACTUAL),
        )
        .addKDocs()
        .relocateDeclarations()
        .addImportsForUsedPackages()
        .omitStdLib()
        .lower(JsPostProcessingHacks())
}

class JsPostProcessingHacks : TopLevelModelLowering {
    override fun lower(module: ModuleModel): ModuleModel {
        module.annotations.add(
            suppress(
                "EXPECT_ACTUAL_INCOMPATIBLE_RETURN_TYPE",
                "EXPECT_ACTUAL_INCOMPATIBLE_CLASS_SCOPE",
                "ACTUAL_WITHOUT_EXPECT",
                "AMBIGUOUS_EXPECTS",
                file = true
            )
        )
        return super.lower(module)
    }

    private val arrayType = primitiveType("Array")
    private val floatType = primitiveType("Float")
    private val doubleType = primitiveType("Double")
    private val intType = primitiveType("Int")
    private val shortType = primitiveType("Short")
    private val byteType = primitiveType("Byte", dropQualifier = true)

    private val arrayOfFloatType = arrayType
        .copy(params = listOf(TypeParameterModel(floatType, emptyList())))

    private val arrayOfIntType = arrayType
        .copy(params = listOf(TypeParameterModel(intType, emptyList())))

    private val arrayOfByteType = arrayType
        .copy(params = listOf(TypeParameterModel(byteType, emptyList())))

    private val arrayOfShortType = arrayType
        .copy(params = listOf(TypeParameterModel(shortType, emptyList())))

    private val arrayOfDoubleType = arrayType
        .copy(params = listOf(TypeParameterModel(doubleType, emptyList())))

    override fun lowerClassLikeModel(ownerContext: NodeOwner<ClassLikeModel>, parentModule: ModuleModel): ClassLikeModel {
        val klass: ClassLikeModel = super.lowerClassLikeModel(ownerContext, parentModule)
        val parentEntities = klass.parentEntities.filter { (type) -> !type.value.isDynamic }

        fun translateMember(member: MemberModel): List<MemberModel> {
            if (member !is ParametersOwnerModel<*>) return listOf(member)
            var shouldHaveOverload = false
            val overloadParametersWithDoubleArray = member.parameters.map {
                val parameter = it as ParameterModel
                if (parameter.type == arrayOfFloatType || parameter.type == arrayOfIntType || parameter.type == arrayOfByteType || parameter.type == arrayOfShortType) {
                    shouldHaveOverload = true
                    parameter.copy(type = arrayOfDoubleType)
                } else parameter
            }

            if (!shouldHaveOverload) return listOf(member)

            return when (member) {
                is MethodModel -> listOf(member.copy(expectActualModifier = null), member.copy(parameters = overloadParametersWithDoubleArray))
                is ConstructorModel -> listOf(member.copy(expectActualModifier = null), member.copy(parameters = overloadParametersWithDoubleArray))
                else -> listOf(member)
            }

        }

        return when(klass) {
            is ClassModel -> klass.copy(
                parentEntities = parentEntities,
                members = klass.members.flatMap(::translateMember)
            )
            is InterfaceModel -> klass.copy(
                parentEntities = parentEntities,
                members = klass.members.flatMap(::translateMember)
            )
            is ObjectModel -> klass.copy(
                parentEntities = parentEntities,
                members = klass.members.flatMap(::translateMember)
            )
            else -> error("Unknown ClassLikeModel: ${klass::class}")
        }
    }
}

