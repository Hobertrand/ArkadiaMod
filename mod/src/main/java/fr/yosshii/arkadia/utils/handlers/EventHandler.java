package fr.yosshii.arkadia.utils.handlers;
import fr.yosshii.arkadia.items.MinerAmuletItem;
import net.java.games.input.*;
import net.minecraft.block.AirBlock;
import net.minecraft.block.Blocks;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;
import java.util.HashMap;

@Mod.EventBusSubscriber
public class EventHandler {



    @SubscribeEvent
    public static void onItemPickup(EntityItemPickupEvent e){
        if((e.getItem().getItem().getItem()).equals(Items.COBBLESTONE.getItem())
                || e.getItem().getItem().getItem().equals(Items.ANDESITE.getItem())
                || e.getItem().getItem().getItem().equals(Items.DIORITE)
                ||e.getItem().getItem().getItem().equals(Items.GRANITE.getItem())){
            PlayerEntity p = e.getPlayer();
            boolean hasItem = false;
            for(int i = 0; i<35; i++){
                ItemStack is1 = p.inventory.getItem(i);
                if(is1.getItem() instanceof MinerAmuletItem){
                    MinerAmuletItem ma =(MinerAmuletItem)is1.getItem();
                    if(ma.isActive())
                        hasItem = true;
                }
            }
            ItemStack is2 = p.getOffhandItem();
            if(is2.getItem() instanceof MinerAmuletItem){
                MinerAmuletItem ma = (MinerAmuletItem)is2.getItem();
                if(ma.isActive())
                    hasItem = true;
            }
            if(hasItem){
                e.setCanceled(true);
                e.getItem().kill();
            }
        }

        }






}

