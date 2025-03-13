package net.mark.infinitymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mark.infinitymod.InfinityMod;
import net.mark.infinitymod.item.custom.ModArmorItem;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item INFINITY_BLADE = registerItem("infinity_blade",
            new SwordItem(ModToolMaterial.INFINITY, 14, 2f, new FabricItemSettings()));
    public static final Item MODERN_INFINITY_BLADE = registerItem("modern_infinity_blade",
            new SwordItem(ModToolMaterial.INFINITY, 14, 2f, new FabricItemSettings()));
    public static final Item CARBON_NANOTUBES_STEEL = registerItem("carbon_nanotubes_steel",
            new Item(new FabricItemSettings()));
    public static final Item CARBON_NANOTUBE = registerItem("carbon_nanotube",
            new Item(new FabricItemSettings()));
    public static final Item CARBON_NANOTUBE_FIBER = registerItem("carbon_nanotube_fiber",
            new Item(new FabricItemSettings()));

    public static final Item RAIDRIARS_HELMET = registerItem("raidriars_helmet",
            new ModArmorItem(ModArmorMaterials.RAIDRIAR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RAIDRIARS_CHESTPLATE = registerItem("raidriars_chestplate",
            new ArmorItem(ModArmorMaterials.RAIDRIAR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RAIDRIARS_LEGGINGS = registerItem("raidriars_leggings",
            new ArmorItem(ModArmorMaterials.RAIDRIAR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RAIDRIARS_BOOTS = registerItem("raidriars_boots",
            new ArmorItem(ModArmorMaterials.RAIDRIAR, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item SIRISES_HELMET = registerItem("sirises_helmet",
            new ModArmorItem(ModArmorMaterials.SIRIS, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SIRISES_CHESTPLATE = registerItem("sirises_chestplate",
            new ArmorItem(ModArmorMaterials.SIRIS, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SIRISES_LEGGINGS = registerItem("sirises_leggings",
            new ArmorItem(ModArmorMaterials.SIRIS, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SIRISES_BOOTS = registerItem("sirises_boots",
            new ArmorItem(ModArmorMaterials.SIRIS, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item AUSARS_HELMET = registerItem("ausars_helmet",
            new ModArmorItem(ModArmorMaterials.AUSAR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AUSARS_CHESTPLATE = registerItem("ausars_chestplate",
            new ArmorItem(ModArmorMaterials.AUSAR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AUSARS_LEGGINGS = registerItem("ausars_leggings",
            new ArmorItem(ModArmorMaterials.AUSAR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AUSARS_BOOTS = registerItem("ausars_boots",
            new ArmorItem(ModArmorMaterials.AUSAR, ArmorItem.Type.BOOTS, new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
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
