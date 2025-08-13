package dukat.common

import org.jetbrains.dukat.astModel.ClassLikeModel
import org.jetbrains.dukat.astModel.ClassModel
import org.jetbrains.dukat.astModel.ConstructorModel
import org.jetbrains.dukat.astModel.EnumModel
import org.jetbrains.dukat.astModel.FunctionModel
import org.jetbrains.dukat.astModel.InterfaceModel
import org.jetbrains.dukat.astModel.MethodModel
import org.jetbrains.dukat.astModel.ModuleModel
import org.jetbrains.dukat.astModel.ObjectModel
import org.jetbrains.dukat.astModel.PropertyModel
import org.jetbrains.dukat.astModel.TypeAliasModel
import org.jetbrains.dukat.astModel.VariableModel
import org.jetbrains.dukat.astModel.modifiers.ExpectActualModifier
import org.jetbrains.dukat.model.commonLowerings.ModelWithOwnerTypeLowering
import org.jetbrains.dukat.ownerContext.NodeOwner
import org.jetbrains.kotlin.tools.dukat.wasm.GETTER_METHOD_IMPL_PREFIX
import org.jetbrains.kotlin.tools.dukat.wasm.SETTER_METHOD_IMPL_PREFIX

class PutExpectActualToDeclarations(val modifier: ExpectActualModifier) : ModelWithOwnerTypeLowering {
    private val isExpect = modifier == ExpectActualModifier.EXPECT
    private val NodeOwner<*>.isNested: Boolean
        get() = owner?.node as? ClassLikeModel !== node

    override fun lowerTypeAliasModel(
        ownerContext: NodeOwner<TypeAliasModel>,
        parentModule: ModuleModel
    ): TypeAliasModel {
        return super.lowerTypeAliasModel(ownerContext, parentModule)
            .copy(expectActualModifier = modifier)
    }

    private fun FunctionModel.isTopLevelSetterWhichIsCommonAcrossTargets(): Boolean {
        val nameAsString = name.toString()
        return nameAsString.startsWith(GETTER_METHOD_IMPL_PREFIX) || nameAsString.startsWith(SETTER_METHOD_IMPL_PREFIX)
    }

    override fun lowerFunctionModel(ownerContext: NodeOwner<FunctionModel>, parentModule: ModuleModel): FunctionModel {
        return super.lowerFunctionModel(ownerContext, parentModule)
            .run {
                if (ownerContext.node.isTopLevelSetterWhichIsCommonAcrossTargets())
                    this
                else copy(
                    expectActualModifier = modifier,
                    external = external && !isExpect,
                    body = body.takeIf { !isExpect })
            }
    }

    override fun lowerEnumModel(ownerContext: NodeOwner<EnumModel>, parentModule: ModuleModel): EnumModel {
        return super.lowerEnumModel(ownerContext, parentModule)
            .run { copy(expectActualModifier = modifier.takeIf { !isExpect || !ownerContext.isNested }, external = external && !isExpect) }
    }

    override fun lowerInterfaceModel(
        ownerContext: NodeOwner<InterfaceModel>,
        parentModule: ModuleModel
    ): InterfaceModel {
        return super.lowerInterfaceModel(ownerContext, parentModule)
            .run { copy(expectActualModifier = modifier.takeIf { !isExpect || !ownerContext.isNested }, external = external && !isExpect) }
    }

    override fun lowerClassModel(ownerContext: NodeOwner<ClassModel>, parentModule: ModuleModel): ClassModel {
        return super.lowerClassModel(ownerContext, parentModule)
            .run { copy(expectActualModifier = modifier.takeIf { !isExpect || !ownerContext.isNested }, external = external && !isExpect) }
    }

    override fun lowerObjectModel(ownerContext: NodeOwner<ObjectModel>, parentModule: ModuleModel): ObjectModel {
        return super.lowerObjectModel(ownerContext, parentModule)
            .run { copy(expectActualModifier = modifier.takeIf { !isExpect || !ownerContext.isNested }, external = external && !isExpect) }
    }

    override fun lowerVariableModel(ownerContext: NodeOwner<VariableModel>, parentModule: ModuleModel?): VariableModel {
        return super.lowerVariableModel(ownerContext, parentModule)
            .run {
                if (parentModule == null) return@run this
                copy(
                    expectActualModifier = modifier,
                    external = external && !isExpect,
                    initializer = initializer.takeIf { !isExpect },
                    get = get.takeIf { !isExpect },
                    set = set.takeIf { !isExpect },
                )
            }
    }

    override fun lowerConstructorModel(ownerContext: NodeOwner<ConstructorModel>): ConstructorModel {
        return super.lowerConstructorModel(ownerContext)
            .copy(expectActualModifier = modifier.takeIf { !isExpect })
    }

    override fun lowerMethodModel(ownerContext: NodeOwner<MethodModel>): MethodModel {
        return super.lowerMethodModel(ownerContext)
            .run { copy(expectActualModifier = modifier.takeIf { !isExpect }, body = body.takeIf { !isExpect }) }
    }

    override fun lowerPropertyModel(ownerContext: NodeOwner<PropertyModel>): PropertyModel {
        return super.lowerPropertyModel(ownerContext)
            .run {
                copy(
                    expectActualModifier = modifier.takeIf { !isExpect },
                    open = open || (ownerContext.owner?.owner?.node is InterfaceModel && (getter || setter) && isExpect),
                    initializer = initializer.takeIf { !isExpect },
                    getter = getter && !isExpect,
                    setter = setter && !isExpect
                )
            }
    }
}
