package fr.yosshii.arkadia.data.recipe;
import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.init.ModBlocks;
import fr.yosshii.arkadia.init.ModItems;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator p_i48262_1_) {
        super(p_i48262_1_);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {

        //Items
        ShapedRecipeBuilder.shaped(ModItems.MINER_AMULET.get())
                .pattern("DDD")
                .pattern("DTD")
                .pattern("DDD")
                .define('D', ModBlocks.DRAGONITE_BLOCK.get())
                .define('T', ModBlocks.TITANE_BLOCK.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        //Blocs
        ShapedRecipeBuilder.shaped(ModBlocks.TITANE_BLOCK.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TITANE_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.COBALT_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COBALT_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.DRAGONITE_BLOCK.get())
                .pattern("DDD")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.ARKADIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);
        //Outils
        ShapedRecipeBuilder.shaped(ModItems.TITANE_PICKAXE.get())
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANE_AXE.get())
                .pattern(" TT")
                .pattern(" ST")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANE_AXE.get())
                .pattern("TT ")
                .pattern("TS ")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_titane_axe"));

        ShapedRecipeBuilder.shaped(ModItems.TITANE_SWORD.get())
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANE_SHOVEL.get())
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANE_HOE.get())
                .pattern(" TT")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(ModItems.TITANE_HOE.get())
                .pattern("TT ")
                .pattern(" S ")
                .pattern(" S ")
                .define('T', ModItems.TITANE_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_titane_hoe"));

        ShapedRecipeBuilder.shaped(ModItems.COBALT_PICKAXE.get())
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_AXE.get())
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_AXE.get())
                .pattern(" CC")
                .pattern(" SC")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_cobalt_axe"));

        ShapedRecipeBuilder.shaped(ModItems.COBALT_SWORD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_HOE.get())
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_HOE.get())
                .pattern(" CC")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_cobalt_hoe"));

        ShapedRecipeBuilder.shaped(ModItems.COBALT_SHOVEL.get())
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', ModItems.COBALT_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_PICKAXE.get())
                .pattern("DDD")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_AXE.get())
                .pattern(" DD")
                .pattern(" SD")
                .pattern(" S ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_dragonite_axe"));

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_SHOVEL.get())
                .pattern(" D ")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_SWORD.get())
                .pattern(" D ")
                .pattern(" D ")
                .pattern(" S ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_HOE.get())
                .pattern(" DD")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_HOE.get())
                .pattern("DD ")
                .pattern(" S ")
                .pattern(" S ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_dragonite_hoe"));

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_AXE.get())
                .pattern(" AA")
                .pattern(" SA")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_arkadium_axe"));

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_HOE.get())
                .pattern(" AA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .define('S', Items.STICK)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "alternative_arkadium_hoe"));

        //Décraft Blocs
        ShapelessRecipeBuilder.shapeless(ModItems.TITANE_INGOT.get(), 9)
                .requires(ModBlocks.TITANE_BLOCK.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.COBALT_INGOT.get(), 9)
                .requires(ModBlocks.COBALT_BLOCK.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.DRAGONITE_GEM.get(), 9)
                .requires(ModBlocks.DRAGONITE_BLOCK.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(ModItems.ARKADIUM_INGOT.get(), 9)
                .requires(ModBlocks.ARKADIUM_BLOCK.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        //Lingots (Four)
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.TITANE_ORE.get()), ModItems.TITANE_INGOT.get(), 0.15f, 200)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "titane_ore_to_ingot"));

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBALT_ORE.get()), ModItems.COBALT_INGOT.get(), 0.15f, 200)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "cobalt_ore_to_ingot"));
        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.ARKADIUM_ORE.get()), ModItems.ARKADIUM_INGOT.get(), 0.30f,220 )
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "arkadium_ore_to_ingot"));


        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.TITANE_ORE.get()), ModItems.TITANE_INGOT.get(), 0.30f, 120)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "titane_ingot_blast_furnace"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.COBALT_ORE.get()), ModItems.COBALT_INGOT.get(), 0.30f, 120)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "cobalt_ingot_blast_furnace"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.ARKADIUM_ORE.get()), ModItems.ARKADIUM_INGOT.get(), 0.60f, 120)
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer, new ResourceLocation(ArkadiaMain.MODID, "arkadium_ingot_blast_furnace"));

        //Armures
        ShapedRecipeBuilder.shaped(ModItems.TITANE_HELMET.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("   ")
                .define('T', ModItems.TITANE_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANE_CHESTPLATE.get())
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T', ModItems.TITANE_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANE_LEGGINGS.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TITANE_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.TITANE_BOOTS.get())
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .define('T', ModItems.TITANE_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.TITANE_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_HELMET.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .define('C', ModItems.COBALT_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.COBALT_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.COBALT_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.COBALT_BOOTS.get())
                .pattern("   ")
                .pattern("C C")
                .pattern("C C")
                .define('C', ModItems.COBALT_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.COBALT_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_HELMET.get())
                .pattern("DDD")
                .pattern("D D")
                .pattern("   ")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_CHESTPLATE.get())
                .pattern("D D")
                .pattern("DDD")
                .pattern("DDD")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_LEGGINGS.get())
                .pattern("DDD")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.DRAGONITE_BOOTS.get())
                .pattern("   ")
                .pattern("D D")
                .pattern("D D")
                .define('D', ModItems.DRAGONITE_GEM.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModItems.DRAGONITE_GEM.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModItems.ARKADIUM_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.ARKADIUM_INGOT.get())
                .unlockedBy("unlock", InventoryChangeTrigger.Instance.hasItems(ModBlocks.ARKADIUM_ORE.get()))
                .save(consumer);


    }
}