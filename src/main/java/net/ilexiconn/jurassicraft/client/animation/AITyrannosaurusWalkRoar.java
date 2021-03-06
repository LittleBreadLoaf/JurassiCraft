package net.ilexiconn.jurassicraft.client.animation;

import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityTyrannosaurus;
import net.ilexiconn.jurassicraft.ai.AIAnimation;

public class AITyrannosaurusWalkRoar extends AIAnimation
{
    private EntityTyrannosaurus entityTrex;

    public AITyrannosaurusWalkRoar(EntityTyrannosaurus trex)
    {
        super(trex);
        entityTrex = trex;
    }

    public int getAnimationId()
    {
        return 2;
    }

    public boolean isAutomatic()
    {
        return true;
    }
    
    public void startExecuting()
    {
        super.startExecuting();
    }

    public int getDuration()
    {
        return 75;
    }
}
