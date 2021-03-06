package net.ilexiconn.jurassicraft.block.fence;

import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.ModCreativeTabs;
import net.ilexiconn.jurassicraft.interfaces.IFenceMain;
import net.ilexiconn.jurassicraft.tile.TileSecurityFenceLowMain;
import net.ilexiconn.jurassicraft.tile.TileSecurityFenceLowPole;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class BlockSecurityFenceLowMain extends BlockSecurityFence implements IFenceMain
{
    public BlockSecurityFenceLowMain()
    {
    	super(10.0F, 150.0F, 2, "low_Security_Fence_Main");
        this.setCreativeTab(ModCreativeTabs.blocks);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            player.openGui(JurassiCraft.instance, 0, world, x, y, z);
            return true;
        }
        return false;
    }

    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int metadata)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileSecurityFenceLowMain)
        {
        	TileSecurityFenceLowMain fence = (TileSecurityFenceLowMain) tileEntity;
            if (fence.hasItems())
            {
                for (int i = 0; i < fence.getSizeInventory(); i++)
                {
                    ItemStack itemstack = fence.getStackInSlot(i);
                    if (itemstack != null)
                    {
                        float f = world.rand.nextFloat() * 0.8F + 0.1F;
                        float f1 = world.rand.nextFloat() * 0.8F + 0.1F;
                        float f2 = world.rand.nextFloat() * 0.8F + 0.1F;
                        while (itemstack.stackSize > 0)
                        {
                            int j = world.rand.nextInt(21) + 10;
                            if (j > itemstack.stackSize)
                            {
                                j = itemstack.stackSize;
                            }
                            itemstack.stackSize -= j;
                            EntityItem item = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(itemstack.getItem(), j, itemstack.getItemDamage()));
                            if (itemstack.hasTagCompound())
                            {
                                item.getEntityItem().setTagCompound((NBTTagCompound) itemstack.getTagCompound().copy());
                            }
                            world.spawnEntityInWorld(item);
                        }
                    }
                }

        		for (int side = 0; side < 4; side++)
                {
                	if (fence.hasFenceAt(side))
                	{
                		TileSecurityFenceLowMain neighborFence = fence.getNextLowSecurityMainFenceBlock(fence, side, 128);
						if (neighborFence != null)
						{
							switch (side)
							{
								/** South */
								case 0:
									neighborFence.setFenceAt(2, false);
									neighborFence.setFenceOff(2);
									break;
								/** West */
								case 1:
									neighborFence.setFenceAt(3, false);
									neighborFence.setFenceOff(3);
									break;
								/** North */
								case 2:
									neighborFence.setFenceAt(0, false);
									neighborFence.setFenceOff(0);
									break;
								/** East */
								case 3:
									neighborFence.setFenceAt(1, false);
									neighborFence.setFenceOff(1);
									break;
							}
							neighborFence.getWorldObj().markBlockForUpdate(neighborFence.xCoord, neighborFence.yCoord, neighborFence.zCoord);
						}
                	}
                }
                world.func_147453_f(x, y, z, block);
            }
        }
        tileEntity = world.getTileEntity(x, y + 1, z);
        if (tileEntity instanceof TileSecurityFenceLowPole)
        {
        	world.removeTileEntity(x, y + 1, z);
        	world.setBlockToAir(x, y + 1, z);
        }
        super.breakBlock(world, x, y, z, block, metadata);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new TileSecurityFenceLowMain();
    }
}
