package net.ilexiconn.jurassicraft.ai;

import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftTameable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;

import java.util.ArrayList;
import java.util.List;

public class JurassiCraftAIGallimimusFlocking extends EntityAIBase
{

    private EntityJurassiCraftTameable herdCreature;
    private ArrayList<EntityJurassiCraftTameable> herd = new ArrayList<EntityJurassiCraftTameable>();
    private ArrayList<Double> followingDistanceOfTheHerd = new ArrayList<Double>();
    private double searchDistance;
    private double movementSpeed;
    private int flockingDistance;
    private int flockingDistanceVariation;
    private int maxTimeTryingToMove;
    private int numberOfGallimimus;
    private int timeTryingToMove;

    public JurassiCraftAIGallimimusFlocking(EntityJurassiCraftTameable creature, int minimumNumberOfGallimimus, double distanceToSearch, int distanceToFlock, int distanceToFlockVariation, double speed)
    {
        this.herdCreature = creature;
        this.numberOfGallimimus = minimumNumberOfGallimimus;
        this.searchDistance = distanceToSearch;
        this.flockingDistance = distanceToFlock;
        this.flockingDistanceVariation = distanceToFlockVariation;
        this.movementSpeed = speed;
        this.timeTryingToMove = 0;
        this.setMutexBits(3);
    }

    @Override
    public boolean isInterruptible()
    {
        return this.timeTryingToMove > 3.0D * this.maxTimeTryingToMove / 4.0D;
    }

    @Override
    public boolean shouldExecute()
    {
        if (this.herdCreature.getAttackTarget() != null || this.herdCreature.getRNG().nextInt(501) < 500 || this.herdCreature.isSitting())
        {
            return false;
        }
        List<Entity> nearEntityList = this.herdCreature.worldObj.getEntitiesWithinAABBExcludingEntity(this.herdCreature, this.herdCreature.boundingBox.expand(this.searchDistance, 8.0D, this.searchDistance));
        this.herd.add(this.herdCreature);
        if (!nearEntityList.isEmpty())
        {
            for (int i = 0; i < nearEntityList.size(); i++)
            {
                if (nearEntityList.get(i) instanceof EntityJurassiCraftTameable && nearEntityList.get(i).getClass() == herdCreature.getClass() && !((EntityJurassiCraftTameable) nearEntityList.get(i)).isSitting())
                {
                    this.herd.add((EntityJurassiCraftTameable) nearEntityList.get(i));
                }
            }
            if (this.herd.size() >= this.numberOfGallimimus)
            {
                return this.herdCreature.isEntityAlive();
            }
        }
        return false;
    }

    @Override
    public void startExecuting()
    {
        double xDistance = this.herdCreature.getRNG().nextInt(this.flockingDistance);
        double zDistance = this.flockingDistance - xDistance;
        if (this.herdCreature.getRNG().nextBoolean())
        {
            xDistance = -xDistance;
        }
        if (this.herdCreature.getRNG().nextBoolean())
        {
            zDistance = -zDistance;
        }
        for (int i = 0; i < herd.size(); i++)
        {
            this.followingDistanceOfTheHerd.add(this.herd.get(i).getEntityAttribute(SharedMonsterAttributes.followRange).getAttributeValue());
            this.herd.get(i).getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(this.flockingDistance + this.flockingDistanceVariation + 1);
            double xDistanceExtra = this.herd.get(i).getRNG().nextInt(this.flockingDistanceVariation);
            double zDistanceExtra = this.herd.get(i).getRNG().nextInt(this.flockingDistanceVariation);
            this.herd.get(i).getNavigator().setPath(this.herd.get(i).getNavigator().getPathToXYZ(this.herd.get(i).posX + xDistance + xDistanceExtra, this.herd.get(i).worldObj.getHeightValue((int) (this.herd.get(i).posX + xDistance + xDistanceExtra), (int) (this.herd.get(i).posZ + zDistance + zDistanceExtra)), this.herd.get(i).posZ + zDistance + zDistanceExtra), this.movementSpeed);
        }
        this.maxTimeTryingToMove = (int) (10.0D * this.herdCreature.getDistance(this.herdCreature.posX + xDistance, this.herdCreature.worldObj.getHeightValue((int) (this.herdCreature.posX + xDistance), (int) (this.herdCreature.posZ + zDistance)), this.herdCreature.posZ + zDistance));
        super.startExecuting();
    }

    @Override
    public void updateTask()
    {
        this.timeTryingToMove++;
    }

    @Override
    public boolean continueExecuting()
    {
        return (!this.herdCreature.getNavigator().noPath() || this.timeTryingToMove < this.maxTimeTryingToMove);
    }

    @Override
    public void resetTask()
    {
        for (int i = 0; i < herd.size(); i++)
        {
            if (this.herd.get(i).isEntityAlive())
            {
                this.herd.get(i).getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(this.followingDistanceOfTheHerd.get(i));
                this.herd.get(i).getNavigator().clearPathEntity();
            }
        }
        this.herd.clear();
        this.followingDistanceOfTheHerd.clear();
        this.timeTryingToMove = 0;
    }
}