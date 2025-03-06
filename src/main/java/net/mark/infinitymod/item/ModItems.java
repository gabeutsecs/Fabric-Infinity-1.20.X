package net.mark.infinitymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mark.infinitymod.InfinityMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item INFINITY_BLADE = registerItem("infinity_blade", new Item(new FabricItemSettings()));
    public static final Item MODERN_INFINITY_BLADE = registerItem("modern_infinity_blade", new Item(new FabricItemSettings()));
    public static final Item CARBON_NANOTUBES_STEEL = registerItem("carbon_nanotubes_steel", new Item(new FabricItemSettings()));
    public static final Item CARBON_NANOTUBE = registerItem("carbon_nanotube", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(INFINITY_BLADE);
        entries.add(MODERN_INFINITY_BLADE);
        entries.add(CARBON_NANOTUBES_STEEL);
        entries.add(CARBON_NANOTUBE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(InfinityMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        InfinityMod.LOGGER.info("Registering Mod Items for" + InfinityMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToIngredientItemGroup);
    }
}
