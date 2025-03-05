package net.mark.infinitymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mark.infinitymod.InfinityMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup INFINITY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(InfinityMod.MOD_ID, "infinity"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.infinity"))
                    .icon(() -> new ItemStack(ModItems.INFINITY_BLADE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.INFINITY_BLADE);
                        entries.add(ModItems.MODERN_INFINITY_BLADE);


                    }).build());


    public static void registerItemGroups() {
        InfinityMod.LOGGER.info("Registering Item Groups for " +InfinityMod.MOD_ID);
    }
}
