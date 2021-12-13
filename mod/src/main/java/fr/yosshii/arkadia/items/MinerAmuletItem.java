package fr.yosshii.arkadia.items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;



public class MinerAmuletItem extends Item{
    private boolean active = false;

    public MinerAmuletItem(Properties properties){
        super(properties);

    }

    public void setActive(){
        this.active = true;
    }
    public boolean isActive(){
        return this.active;
    }
    public void setInactive(){ this.active = false;}

    @Override
    public ActionResult<ItemStack> use(World worldIn,PlayerEntity playerIn, Hand handIn ){
        if(!worldIn.isClientSide){
            if(!this.isActive()){
                this.setActive();
            }
            else{
                this.setInactive();
            }


            if (this.isActive()){
                playerIn.sendMessage(new StringTextComponent("Votre amulette s'allume !"), playerIn.getUUID());
            }
            else {
                playerIn.sendMessage(new StringTextComponent("Votre amulette s'eteint !"), playerIn.getUUID());
            }
        }
        return super.use(worldIn, playerIn, handIn);

    }

}
