package net.ilexiconn.jurassicraft.entity.dinosaurs;

import net.ilexiconn.jurassicraft.ModItems;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIEatDroppedFood;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIFollowFood;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAITargetIfHasAgeAndNonTamed;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIWander;
import net.ilexiconn.jurassicraft.client.model.modelbase.ChainBuffer;
import net.ilexiconn.jurassicraft.entity.CreatureManager;
import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftLandAggressive;
import net.ilexiconn.jurassicraft.interfaces.ICarnivore;
import net.ilexiconn.jurassicraft.interfaces.IDinosaur;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityHerrerasaurus extends EntityJurassiCraftLandAggressive implements IDinosaur, ICarnivore
{
	public ChainBuffer tailBuffer = new ChainBuffer(6);
	
    public EntityHerrerasaurus(World par1World)
    {
        super(par1World, CreatureManager.classToCreature(EntityHerrerasaurus.class));
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new JurassiCraftAIWander(this, 0.7D * this.getCreatureSpeed()));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, this.getCreatureSpeed()));
        this.tasks.addTask(5, new JurassiCraftAIFollowFood(this, 1.1D * this.getCreatureSpeed()));
        this.tasks.addTask(5, new JurassiCraftAIEatDroppedFood(this, 16.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(5, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityHypsilophodon.class, 0, 0.4F));
        this.targetTasks.addTask(5, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityLeaellynasaura.class, 0, 0.4F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityChicken.class, 0, 0.9F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityCow.class, 0, 0.9F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityPig.class, 0, 0.9F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntitySheep.class, 0, 0.9F));

        this.setCreatureExperiencePoints(2500);
    }

    @Override
    public int getTalkInterval()
    {
        return 350;
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.tailBuffer.calculateChainSwingBuffer(40.0F, 3, 3.0F, this);
    }

    @Override
    protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus)
    {
    	float developmentFraction = this.getGrowthStage() / 120.0F;
        int count = Math.round(1 + (2.5F * developmentFraction) + this.rand.nextInt(1 + (int) (2.5F * developmentFraction)) + this.rand.nextInt(1 + enchantBonus));
    	if (!this.isBurning())
        {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getMeat(), count));
        }
        else
        {
            this.dropItem(this.getCreature().getSteak(), count);
        }
    	if (this.isMale() && this.worldObj.rand.nextFloat() < 0.25F) {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getSkin()));
    	}
    }
}
