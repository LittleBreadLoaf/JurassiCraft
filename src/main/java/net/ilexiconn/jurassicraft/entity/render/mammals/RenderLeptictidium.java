package net.ilexiconn.jurassicraft.entity.render.mammals;

import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.client.model.entity.ModelLeptictidium;
import net.ilexiconn.jurassicraft.entity.Creature;
import net.ilexiconn.jurassicraft.entity.mammals.EntityLeptictidium;
import net.ilexiconn.jurassicraft.entity.render.RenderMammal;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderLeptictidium extends RenderMammal
{
    public RenderLeptictidium(Creature mammal)
    {
        super(new ModelLeptictidium(), mammal, 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity)
    {
        EntityLeptictidium mammal = (EntityLeptictidium) entity;
        if (mammal.isMale())
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Leptictidium_Male_1.png");
        }
        else
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Leptictidium_Female_1.png");
        }
    }
}
