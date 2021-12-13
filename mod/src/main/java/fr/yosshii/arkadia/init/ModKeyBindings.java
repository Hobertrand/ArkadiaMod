package fr.yosshii.arkadia.init;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.network.TestPacket;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;

public class ModKeyBindings {

    public static final KeyBinding TEST_KEY = new KeyBinding("key." + ArkadiaMain.MODID + ".test_key", GLFW.GLFW_KEY_G, "key.categories." + ArkadiaMain.MODID);

    public static void register()
    {
        ClientRegistry.registerKeyBinding(TEST_KEY);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onKeyPress(InputEvent.KeyInputEvent e)
    {
        if(TEST_KEY.isDown())
        {
            ArkadiaMain.NETWORK.sendToServer(new TestPacket(64));
        }
    }

}
