package fr.yosshii.arkadia.data;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.data.recipe.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = ArkadiaMain.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {
    @SubscribeEvent
    public static void gatherData(final GatherDataEvent e) {
        DataGenerator generator = e.getGenerator();
        if (e.includeServer()) {
            generator.addProvider(new RecipeGenerator(generator));

        }
    }
}
