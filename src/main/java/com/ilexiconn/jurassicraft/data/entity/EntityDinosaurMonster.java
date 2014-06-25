package com.ilexiconn.jurassicraft.data.entity;

import com.ilexiconn.jurassicraft.Util;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import thehippomaster.AnimationAPI.IAnimatedEntity;

public abstract class EntityDinosaurMonster extends EntityMob implements IAnimatedEntity
{
    public int animID;
    public int animTick;
    public int dinoID;

    public EntityDinosaurMonster(World world, int id)
    {
        super(world);
        dinoID = id;
        setSize(Util.getDinos().get(dinoID).hitboxSizeXZ, Util.getDinos().get(dinoID).hitboxSizeY);
        getNavigator().setAvoidsWater(true);
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(Util.getDinos().get(dinoID).dinoHealth * 2);
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(Util.getDinos().get(dinoID).dinoSpeed);
    }

    public String getLivingSound()
    {
        int I = rand.nextInt(1)+1;
        if(I == 1)
        {
            return Util.getDinos().get(dinoID).livingSound1;
        }
        else
        {
            return Util.getDinos().get(dinoID).livingSound2;
        }
    }

    public String getHurtSound()
    {
        return Util.getDinos().get(dinoID).hurtSound;
    }

    public String getDeathSound()
    {
        return Util.getDinos().get(dinoID).deathSound;
    }

    public float getSoundVolume()
    {
        return 0.4F;
    }

    public int getAnimTick()
    {
        return animTick;
    }

    public int getAnimID()
    {
        return animID;
    }

    public void setAnimID(int id)
    {
        animID = id;
    }

    public void setAnimTick(int tick)
    {
        animTick = tick;
    }

    public Item getDropItem()
    {
        return null;
    }

    public void onUpdate()
    {
        super.onUpdate();
        if(animID != 0) animTick++;
    }
}