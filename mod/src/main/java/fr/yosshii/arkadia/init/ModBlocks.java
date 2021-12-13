package fr.yosshii.arkadia.init;

import fr.yosshii.arkadia.ArkadiaMain;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.client.model.obj.MaterialLibrary;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks
{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArkadiaMain.MODID);

    //Cration des blocs
    public static final RegistryObject<Block> TITANE_BLOCK = createBlock("titane_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TITANE_ORE = createBlock("titane_ore", () ->new Block(AbstractBlock.Properties.of(Material.STONE).strength(4.5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COBALT_BLOCK = createBlock("cobalt_block", ()-> new Block(AbstractBlock.Properties.of(Material.METAL).strength(4.5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> COBALT_ORE = createBlock("cobalt_ore", ()-> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4.5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(2).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> DRAGONITE_BLOCK = createBlock("dragonite_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(7f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DRAGONITE_ORE = createBlock("dragonite_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4.5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> ARKADIUM_ORE = createBlock("arkadium_ore", () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(4.5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ARKADIUM_BLOCK = createBlock("arkadium_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL).strength(5f, 15f).harvestTool(ToolType.PICKAXE).harvestLevel(3).requiresCorrectToolForDrops()));


    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return block;
    }

}
