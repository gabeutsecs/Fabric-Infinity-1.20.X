package net.mark.infinitymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mark.infinitymod.block.ModBlocks;
import net.mark.infinitymod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARBON_NANOTUBES_STEEL_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.INFINITY_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MODERN_INFINITY_BLADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARBON_NANOTUBE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARBON_NANOTUBES_STEEL, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AUSARS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AUSARS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AUSARS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AUSARS_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RAIDRIARS_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RAIDRIARS_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RAIDRIARS_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RAIDRIARS_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SIRISES_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SIRISES_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SIRISES_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SIRISES_BOOTS));

    }
}
