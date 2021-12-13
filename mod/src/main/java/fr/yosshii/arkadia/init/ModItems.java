package fr.yosshii.arkadia.init;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.items.ItemArmorEffect;
import fr.yosshii.arkadia.items.MinerAmuletItem;
import fr.yosshii.arkadia.utils.CustomArmorMaterials;
import fr.yosshii.arkadia.utils.CustomItemTier;
import fr.yosshii.arkadia.utils.ModItemGroups;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ModItems{


    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArkadiaMain.MODID);

    //Creation des Items
    public static final RegistryObject<Item> TITANE_INGOT = ITEMS.register("titane_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_MISC)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_MISC)));
    public static final RegistryObject<Item> DRAGONITE_GEM = ITEMS.register("dragonite_gem", () -> new Item(new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_MISC)));
    public static final RegistryObject<Item> ARKADIUM_INGOT = ITEMS.register("arkadium_ingot", () -> new Item(new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_MISC)));
    public static final RegistryObject<Item> MINER_AMULET = ITEMS.register("miner_amulet", ()-> new MinerAmuletItem(new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_MISC)));

    //Création des Outils / Armes
    public static final RegistryObject<Item> TITANE_SWORD = ITEMS.register("titane_sword", () -> new SwordItem(CustomItemTier.TITANE_SWORD, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_COMBAT)));
    public static final RegistryObject<Item> TITANE_PICKAXE = ITEMS.register("titane_pickaxe", () -> new PickaxeItem(CustomItemTier.TITANE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> TITANE_SHOVEL = ITEMS.register("titane_shovel", () -> new ShovelItem(CustomItemTier.TITANE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> TITANE_HOE = ITEMS.register("titane_hoe", () -> new HoeItem(CustomItemTier.TITANE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> TITANE_AXE = ITEMS.register("titane_axe", () -> new AxeItem(CustomItemTier.TITANE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));

    public static final RegistryObject<Item> COBALT_SWORD = ITEMS.register("cobalt_sword", () -> new SwordItem(CustomItemTier.COBALT_SWORD, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_COMBAT)));
    public static final RegistryObject<Item> COBALT_PICKAXE = ITEMS.register("cobalt_pickaxe", () -> new PickaxeItem(CustomItemTier.COBALT, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> COBALT_AXE = ITEMS.register("cobalt_axe", () -> new AxeItem(CustomItemTier.COBALT, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> COBALT_HOE = ITEMS.register("cobalt_hoe", () -> new HoeItem(CustomItemTier.COBALT, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> COBALT_SHOVEL = ITEMS.register("cobalt_shovel", () -> new ShovelItem(CustomItemTier.COBALT, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));

    public static final RegistryObject<Item> DRAGONITE_SWORD = ITEMS.register("dragonite_sword", () -> new SwordItem(CustomItemTier.DRAGONITE_SWORD, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_COMBAT)));
    public static final RegistryObject<Item> DRAGONITE_PICKAXE = ITEMS.register("dragonite_pickaxe", () -> new PickaxeItem(CustomItemTier.DRAGONITE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> DRAGONITE_AXE = ITEMS.register("dragonite_axe", () -> new AxeItem(CustomItemTier.DRAGONITE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> DRAGONITE_HOE = ITEMS.register("dragonite_hoe", () -> new HoeItem(CustomItemTier.DRAGONITE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> DRAGONITE_SHOVEL = ITEMS.register("dragonite_shovel", () -> new ShovelItem(CustomItemTier.DRAGONITE, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));

    public static final RegistryObject<Item> ARKADIUM_SWORD = ITEMS.register("arkadium_sword", () -> new SwordItem(CustomItemTier.ARKADIUM_SWORD, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_COMBAT)));
    public static final RegistryObject<Item> ARKADIUM_PICKAXE = ITEMS.register("arkadium_pickaxe", () -> new PickaxeItem(CustomItemTier.ARKADIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> ARKADIUM_AXE = ITEMS.register("arkadium_axe", () -> new AxeItem(CustomItemTier.ARKADIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> ARKADIUM_HOE = ITEMS.register("arkadium_hoe", () -> new HoeItem(CustomItemTier.ARKADIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));
    public static final RegistryObject<Item> ARKADIUM_SHOVEL = ITEMS.register("arkadium_shovel", () -> new ShovelItem(CustomItemTier.ARKADIUM, 0, -2.4f, new Item.Properties().stacksTo(1).tab(ModItemGroups.ARKADIA_TAB_TOOLS)));

    //Pièces d'armures
    public static final RegistryObject<Item> TITANE_HELMET = ITEMS.register("titane_helmet", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> TITANE_CHESTPLATE = ITEMS.register("titane_chestplate", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> TITANE_LEGGINGS = ITEMS.register("titane_leggings", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> TITANE_BOOTS = ITEMS.register("titane_boots", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));

    public static final RegistryObject<Item> COBALT_HELMET = ITEMS.register("cobalt_helmet", () -> new ArmorItem(CustomArmorMaterials.COBALT_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> COBALT_CHESTPLATE = ITEMS.register("cobalt_chestplate", () -> new ArmorItem(CustomArmorMaterials.COBALT_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> COBALT_LEGGINGS = ITEMS.register("cobalt_leggings", () -> new ArmorItem(CustomArmorMaterials.COBALT_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> COBALT_BOOTS = ITEMS.register("cobalt_boots", () -> new ArmorItem(CustomArmorMaterials.COBALT_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));

    public static final RegistryObject<Item> DRAGONITE_HELMET = ITEMS.register("dragonite_helmet", () -> new ArmorItem(CustomArmorMaterials.DRAGONITE_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> DRAGONITE_CHESTPLATE = ITEMS.register("dragonite_chestplate", () -> new ArmorItem(CustomArmorMaterials.DRAGONITE_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> DRAGONITE_LEGGINGS = ITEMS.register("dragonite_leggings", () -> new ArmorItem(CustomArmorMaterials.DRAGONITE_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> DRAGONITE_BOOTS = ITEMS.register("dragonite_boots", () -> new ArmorItem(CustomArmorMaterials.DRAGONITE_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));

    public static final RegistryObject<Item> ARKADIUM_HELMET = ITEMS.register("arkadium_helmet", () -> new ArmorItem(CustomArmorMaterials.ARKADIUM_ARMOR, EquipmentSlotType.HEAD,new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> ARKADIUM_CHESTPLATE = ITEMS.register("arkadium_chestplate", () -> new ArmorItem(CustomArmorMaterials.ARKADIUM_ARMOR, EquipmentSlotType.CHEST,new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> ARKADIUM_LEGGINGS = ITEMS.register("arkadium_leggings", () -> new ArmorItem(CustomArmorMaterials.ARKADIUM_ARMOR, EquipmentSlotType.LEGS,new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));
    public static final RegistryObject<Item> ARKADIUM_BOOTS = ITEMS.register("arkadium_boots", () -> new ArmorItem(CustomArmorMaterials.ARKADIUM_ARMOR, EquipmentSlotType.FEET,new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_ARMORS)));

    //Création des lances
    public static final RegistryObject<Item> WOODEN_SPEAR = ITEMS.register("wooden_spear", ()-> new TridentItem(new Item.Properties().tab(ModItemGroups.ARKADIA_TAB_COMBAT)));

}
