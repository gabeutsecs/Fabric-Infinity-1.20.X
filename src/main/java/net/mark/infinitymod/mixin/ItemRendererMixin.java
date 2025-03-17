package net.mark.infinitymod.mixin;

import net.mark.infinitymod.InfinityMod;
import net.mark.infinitymod.item.ModItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useInfinityBladeModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        // Check for the first item (INFINITY_BLADE)
        if (stack.isOf(ModItems.INFINITY_BLADE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(InfinityMod.MOD_ID, "infinity_blade_3d", "inventory"));
        }

        // Check for the second item (MODERN_INFINITY_BLADE)
        if (stack.isOf(ModItems.MODERN_INFINITY_BLADE) && renderMode != ModelTransformationMode.GUI) {
            return ((ItemRendererAccessor) this).mccourse$getModels().getModelManager().getModel(new ModelIdentifier(InfinityMod.MOD_ID, "modern_infinity_blade_3d", "inventory"));
        }

        // Return the original model if neither condition is met
        return value;
    }
}