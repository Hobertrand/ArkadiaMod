package fr.yosshii.arkadia.items;

import fr.yosshii.arkadia.ArkadiaMain;
import fr.yosshii.arkadia.init.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ArkadiaMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ItemArmorEffect {

    @SubscribeEvent
    public static void onArmorEquipped(LivingEquipmentChangeEvent event){
        LivingEntity player = event.getEntityLiving();
        if(player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.ARKADIUM_HELMET.get()){
            player.addEffect(new EffectInstance(Effects.NIGHT_VISION, 1200000000, 0));
        }
        else{
            player.removeEffect(Effects.NIGHT_VISION);
        }
        if (player.getItemBySlot(EquipmentSlotType.HEAD).getItem() == ModItems.ARKADIUM_HELMET.get() &&
                player.getItemBySlot(EquipmentSlotType.CHEST).getItem() == ModItems.ARKADIUM_CHESTPLATE.get() &&
                player.getItemBySlot(EquipmentSlotType.LEGS).getItem() == ModItems.ARKADIUM_LEGGINGS.get() &&
                player.getItemBySlot(EquipmentSlotType.FEET).getItem() == ModItems.ARKADIUM_BOOTS.get()){
            player.addEffect(new EffectInstance(Effects.MOVEMENT_SPEED, 1200000000, 0));

        }
        else{
            player.removeEffect(Effects.MOVEMENT_SPEED);
        }
    }
}
