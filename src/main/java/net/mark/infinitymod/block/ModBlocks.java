package net.mark.infinitymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.mark.infinitymod.InfinityMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CARBON_NANOTUBES_STEEL_BLOCK = registerBlock("carbon_nanotubes_steel_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).sounds(BlockSoundGroup.METAL)));


    private static Block registerBlock(String name, Block block) {

        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(InfinityMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(InfinityMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        InfinityMod.LOGGER.info("Registring ModBlocks for " + InfinityMod.MOD_ID);
    }
}
