package net.ilexiconn.jurassicraft.entity.render.dinosaurs;

import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.client.model.entity.ModelCarnotaurus;
import net.ilexiconn.jurassicraft.entity.Creature;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityCarnotaurus;
import net.ilexiconn.jurassicraft.entity.render.RenderDinosaur;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderCarnotaurus extends RenderDinosaur
{
    public RenderCarnotaurus(Creature dinosaur)
    {
        super(new ModelCarnotaurus(), dinosaur, 0.8F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity)
    {
    	EntityCarnotaurus dino = (EntityCarnotaurus) entity;
        if (dino.isMale())
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Carnotaurus_Male_1.png");
        }
        else
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Carnotaurus_Female_1.png");
        }
    }
}
