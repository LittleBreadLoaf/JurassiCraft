package to.uk.ilexiconn.jurassicraft.entity.entity;

import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import to.uk.ilexiconn.jurassicraft.Util;
import to.uk.ilexiconn.jurassicraft.ai.JurassiCraftEntityAIAvoidEntityIfNotTamed;
import to.uk.ilexiconn.jurassicraft.ai.JurassiCraftEntityAIFollowFoodCoward;
import to.uk.ilexiconn.jurassicraft.entity.EntityJurassiCraftLandCoward;
import to.uk.ilexiconn.jurassicraft.entity.IDinosaur;

public class EntityLeaellynasaur extends EntityJurassiCraftLandCoward implements IDinosaur
{

    public EntityLeaellynasaur(World world)
    {
        super(world, (byte) 9);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(3, new JurassiCraftEntityAIAvoidEntityIfNotTamed(this, EntityPlayer.class, 10.0F, 0.9D * this.getCreatureSpeed(), 1.2D * this.getCreatureSpeed()));
        this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityHerrerasaur.class, 16.0F, 1.0D * this.getCreatureSpeed(), 1.2D * this.getCreatureSpeed()));
        //tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(4, new JurassiCraftEntityAIFollowFoodCoward(this, 1.1D * this.getCreatureSpeed()));
        //tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 0.8D * this.getCreatureSpeed()));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
    }

    @Override
    public int getTalkInterval()
    {
        return 350;
    }

    @Override
    public String getLivingSound()
    {
        if (this.rand.nextInt(2) == 0)
        {
            return Util.getDinoByID(this.getCreatureID()).livingSound1;
        }
        else
        {
            return Util.getDinoByID(this.getCreatureID()).livingSound2;
        }
    }

    @Override
    public String getHurtSound()
    {
        return Util.getDinoByID(this.getCreatureID()).hurtSound;
    }

    @Override
    public String getDeathSound()
    {
        return Util.getDinoByID(this.getCreatureID()).deathSound;
    }
}