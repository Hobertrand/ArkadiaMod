package fr.yosshii.arkadia.enchantments;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.init.ModEnchantments;
import fr.yosshii.arkadia.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.HashMap;

@Mod.EventBusSubscriber(modid = ArkadiaMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class UpstepEnchantment extends Enchantment {

    public int id;
    private static int count = 0;


    public UpstepEnchantment(Rarity p_i46731_1_, EnchantmentType p_i46731_2_, EquipmentSlotType[] p_i46731_3_, int id) {
        super(p_i46731_1_, p_i46731_2_, p_i46731_3_);
        id = this.id;


    }

    public int getId() {
        return this.id;
    }

    @Override
    public int getMaxLevel() {
        return 30;
    }

    public int getMinLevel() {
        return 25;
    }


    public static boolean hasEnchant(PlayerEntity p) {
        UpstepEnchantment enchant = ModEnchantments.UPSTEP.get();
        return (p.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.ARKADIUM_BOOTS.get() && p.getItemBySlot(EquipmentSlotType.FEET).getEnchantmentTags().getId() == 9);

    }

    // @OnlyIn(Dist.CLIENT)
    // @SubscribeEvent
    // public static void check_jump(LivingEvent.LivingJumpEvent e){
    //   LivingEntity entity = e.getEntityLiving();
    //   if(entity instanceof PlayerEntity && hasEnchant(entity)){
    //     jumped = true;
    // System.out.println(e.getEntity());
    // }

    //}
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void allowDoubleJump(InputEvent.KeyInputEvent keyInputEvent){
        PlayerEntity p = Minecraft.getInstance().player;
        if (p != null) {
            if (keyInputEvent.getKey() == 32 && !(p.isOnGround()) && hasEnchant(p)) {
                if (count <= 1) {
                    count += 1;
                    p.setOnGround(true);
                }
            } else if (p.isOnGround()) {
                count = 0;
            }
            System.out.println(p.getName());
            System.out.println(count);
        }

    }

}
