
package fr.yosshii.arkadia.init;


import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class ModFeatures
{
    public ConfiguredFeature<?,?> ORE_TITANE_FEATURE;
    public ConfiguredFeature<?, ?> ORE_COBALT_FEATURE;
    public ConfiguredFeature<?, ?> ORE_DRAGONITE_FEATURE;
    public ConfiguredFeature<?, ?> ORE_ARKADIUM_FEATURE;

    public void init()
    {
        ORE_TITANE_FEATURE = register("ore_titane", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TITANE_ORE.get().defaultBlockState(), 6))
                .squared()//Generation en forme de cube
                .range(25) //Couche à partir de laquelle on souhaite l'apparition du minerai
                .count(5)); // Nombre de fillons par chunk
        ORE_COBALT_FEATURE = register("ore_cobalt", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.COBALT_ORE.get().defaultBlockState(), 6)))
                .squared()
                .range(25)
                .count(5);
        ORE_DRAGONITE_FEATURE = register("ore_dragonite", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.DRAGONITE_ORE.get().defaultBlockState(), 4)))
                .squared()
                .range(20)
                .count(3);
        ORE_ARKADIUM_FEATURE = register("ore_arkadium", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ARKADIUM_ORE.get().defaultBlockState(), 4)))
                .squared()
                .range(12)
                .count(2);
    }

    public <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature)
    {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, name, feature);
    }

    @SubscribeEvent
    public void biomeLoading(BiomeLoadingEvent e)
    {
        BiomeGenerationSettingsBuilder generation = e.getGeneration();
        //Conditions pour les biomes ou on ne veut pas voir les minerais
        // Exemple NETHER
        if(e.getCategory() != Biome.Category.THEEND || e.getCategory() != Biome.Category.NETHER){

            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,ORE_TITANE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_COBALT_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_DRAGONITE_FEATURE);
            generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ORE_ARKADIUM_FEATURE);

        }

    }
}
