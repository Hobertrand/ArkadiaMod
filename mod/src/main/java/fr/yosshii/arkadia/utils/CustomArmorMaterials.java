package fr.yosshii.arkadia.utils;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements IArmorMaterial {

    TITANE_ARMOR(ArkadiaMain.MODID+":titane", 18, new int[]{4, 7, 8, 4}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0F, () -> {return Ingredient.of(ModItems.TITANE_INGOT.get());}),
    COBALT_ARMOR(ArkadiaMain.MODID+":cobalt", 18, new int[]{4, 7, 8, 4}, 11, SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0F, () -> {return Ingredient.of(ModItems.COBALT_INGOT.get());}),
    DRAGONITE_ARMOR(ArkadiaMain.MODID+":dragonite", 20, new int[]{8, 14, 16, 8}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.5f, 0.0f, () -> {return Ingredient.of(ModItems.DRAGONITE_GEM.get());}),
    ARKADIUM_ARMOR(ArkadiaMain.MODID+":arkadium", 30, new int[]{12,21,24,12},20, SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.0f, () -> {return Ingredient.of(ModItems.ARKADIUM_INGOT.get());})
    ;

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

        CustomArmorMaterials(String p_i231593_3_, int p_i231593_4_, int[] p_i231593_5_, int p_i231593_6_, SoundEvent p_i231593_7_, float p_i231593_8_, float p_i231593_9_, Supplier<Ingredient> p_i231593_10_) {
        this.name = p_i231593_3_;
        this.durabilityMultiplier = p_i231593_4_;
        this.slotProtections = p_i231593_5_;
        this.enchantmentValue = p_i231593_6_;
        this.sound = p_i231593_7_;
        this.toughness = p_i231593_8_;
        this.knockbackResistance = p_i231593_9_;
        this.repairIngredient = new LazyValue<>(p_i231593_10_);
    }

    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
