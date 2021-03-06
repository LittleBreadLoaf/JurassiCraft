package net.ilexiconn.jurassicraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.ilexiconn.jurassicraft.ModCreativeTabs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class ItemNet extends Item
{
    public static IIcon iconNet;

    public ItemNet()
    {
        super();
        this.setMaxDamage(60);
        setUnlocalizedName("net");
        setTextureName(net.ilexiconn.jurassicraft.JurassiCraft.getModId() + "net");
        setCreativeTab(ModCreativeTabs.items);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister par1IconRegister)
    {
        ItemNet.iconNet = par1IconRegister.registerIcon("jurassicraft:net");
    }

    public IIcon getIconFromDamage(final int par1)
    {
        return ItemNet.iconNet;
    }

    public boolean isRepairable()
    {
        return true;
    }
}
