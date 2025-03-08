package net.mark.infinitymod.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    INFINITY(-1, 650, 4.5f, 14.0f, 60, () -> Ingredient.ofItems(ModItems.CARBON_NANOTUBES_STEEL));

    private final int miningLevel;
    private final int itemDutability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngridient;

    ModToolMaterial(int miningLevel, int itemDutability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngridient) {
        this.miningLevel = miningLevel;
        this.itemDutability = itemDutability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngridient = repairIngridient;
    }

    @Override
    public int getDurability() {
        return this.itemDutability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngridient.get();
    }
}
