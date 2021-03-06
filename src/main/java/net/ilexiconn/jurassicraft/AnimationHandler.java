package net.ilexiconn.jurassicraft;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.Entity;
import net.ilexiconn.jurassicraft.packet.MessageAnimation;
import net.ilexiconn.jurassicraft.interfaces.IAnimatedEntity;

public class AnimationHandler
{
	public static boolean isClient()
	{
		return FMLCommonHandler.instance().getSide().isClient();
	}

	public static boolean isEffectiveClient()
	{
		return FMLCommonHandler.instance().getEffectiveSide().isClient();
	}

	public static void sendAnimationPacket(IAnimatedEntity entity, int animationId)
	{
		if(isEffectiveClient()) return;
		entity.setAnimationId(animationId);
		JurassiCraft.network.sendToAll(new MessageAnimation((byte) animationId, ((Entity) entity).getEntityId()));
	}
}
