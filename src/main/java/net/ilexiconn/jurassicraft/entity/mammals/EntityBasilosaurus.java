package net.ilexiconn.jurassicraft.entity.mammals;

import net.ilexiconn.jurassicraft.entity.CreatureManager;
import net.ilexiconn.jurassicraft.entity.NewEntitySwimming;
import net.ilexiconn.jurassicraft.interfaces.ICarnivore;
import net.ilexiconn.jurassicraft.interfaces.IMammal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class EntityBasilosaurus extends NewEntitySwimming implements IMammal, ICarnivore
{

    public EntityBasilosaurus(World world)
    {
        super(world, CreatureManager.classToCreature(EntityBasilosaurus.class));
        this.swimRadius = 16.0F;
        this.swimRadiusHeight = 10.0F;
        this.swimSpeed = (float) this.getCreatureSpeed();
        this.jumpOnLand = false;
        this.attackInterval = 1;
        this.isAgressive = true;
        this.setCreatureExperiencePoints(5000);
    }

    @Override
    protected Entity findEntityToAttack()
    {
        AxisAlignedBB area = this.boundingBox.expand(16.0D, 16.0D, 16.0D);

        EntityPlayer player = (EntityPlayer) super.findEntityToAttack();
        if (player != null) return player;

        return this.worldObj.findNearestEntityWithinAABB(EntityAnimal.class, area, this);
    }

    @Override
    protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus)
    {
    	float developmentFraction = this.getGrowthStage() / 120.0F;
        int count = Math.round(1 + (4.0F * developmentFraction) + this.rand.nextInt(1 + (int) (5.0F * developmentFraction)) + this.rand.nextInt(1 + enchantBonus));
    	if (!this.isBurning())
        {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getMeat(), count));
        }
        else
        {
            this.dropItem(this.getCreature().getSteak(), count);
        }
    }
}
