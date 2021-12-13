package fr.yosshii.arkadia.init;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.enchantments.UpstepEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, ArkadiaMain.MODID);


    public static final RegistryObject<UpstepEnchantment> UPSTEP = ENCHANTMENTS.register("upstep", ()-> new UpstepEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET}, 47));
}
