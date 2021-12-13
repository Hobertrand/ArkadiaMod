package fr.yosshii.arkadia.utils;

import fr.yosshii.arkadia.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTier implements IItemTier {
    TITANE(2, 500, 7.0f, 4.5f, 15, new LazyValue<>(() -> { return Ingredient.of(ModItems.TITANE_INGOT.get());})),
    COBALT(2, 500, 7.0f, 4.5f, 15, new LazyValue<>(() -> { return Ingredient.of(ModItems.TITANE_INGOT.get());})),
    DRAGONITE(5, 2500, 11.0f, 6.5f, 20, new LazyValue<>(() ->{return Ingredient.of(ModItems.DRAGONITE_GEM.get());})),
    ARKADIUM(6, 5500, 19.0f, 7f, 30, new LazyValue<>(() -> {return Ingredient.of(ModItems.ARKADIUM_INGOT.get());})),

    TITANE_SWORD(2, 500, 7.0f, 4.5f, 15, new LazyValue<>(() -> { return Ingredient.of(ModItems.TITANE_INGOT.get());})),
    COBALT_SWORD(2, 500, 7.0f, 4.5f, 15, new LazyValue<>(() -> { return Ingredient.of(ModItems.TITANE_INGOT.get());})),
    DRAGONITE_SWORD(5, 2500, 11.0f, 8.5f, 20, new LazyValue<>(() ->{return Ingredient.of(ModItems.DRAGONITE_GEM.get());})),
    ARKADIUM_SWORD(6, 5500, 15.0f, 11f, 30, new LazyValue<>(() -> {return Ingredient.of(ModItems.ARKADIUM_INGOT.get());}))
    ;

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    CustomItemTier(int level, int uses, float speed, float damage, int enchantmentValue, LazyValue<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
