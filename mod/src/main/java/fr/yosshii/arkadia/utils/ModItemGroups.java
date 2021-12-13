package fr.yosshii.arkadia.utils;

import fr.yosshii.arkadia.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.lwjgl.system.CallbackI;

public class ModItemGroups {

    public static final ItemGroup ARKADIA_TAB_MISC = new ItemGroup("arkadia_tab_misc") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARKADIUM_INGOT.get());
        }
    };
    public static final ItemGroup ARKADIA_TAB_COMBAT = new ItemGroup("arkadia_tab_combat") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARKADIUM_SWORD.get());
        }
    };
    public static final ItemGroup ARKADIA_TAB_TOOLS = new ItemGroup("arkadia_tab_tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARKADIUM_PICKAXE.get());
        }
    };
    public static final ItemGroup ARKADIA_TAB_ARMORS = new ItemGroup("arkadia_tab_armors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ARKADIUM_CHESTPLATE.get());
        }
    };

}
