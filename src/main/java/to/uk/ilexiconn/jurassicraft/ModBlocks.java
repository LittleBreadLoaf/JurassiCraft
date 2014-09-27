package to.uk.ilexiconn.jurassicraft;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import to.uk.ilexiconn.jurassicraft.block.*;
import to.uk.ilexiconn.jurassicraft.item.ItemBlockCultivate;
import to.uk.ilexiconn.jurassicraft.item.ItemBlockFossilClayOre;
import to.uk.ilexiconn.llib.content.ContentHandler;
import to.uk.ilexiconn.llib.content.ContentType;
import to.uk.ilexiconn.llib.content.OverrideRegistry;

@ContentHandler(modid = "jurassicraft", type = ContentType.BLOCK)
public class ModBlocks
{
    @OverrideRegistry
    public static Block cultivateBottomOff;
    public static Block cultivateTopOff;
    @OverrideRegistry
    public static Block cultivateBottomOn;
    public static Block cultivateTopOn;
    public static Block dnaExtractor;
    public static Block dnaCombinator;
    public static Block amberOre;
    public static Block fossilOre;
    public static Block sandstoneFossilOre;
    @OverrideRegistry
    public static Block clayFossilOre;
    @OverrideRegistry
    public static Fluid cultivateFluid;
    @OverrideRegistry
    public static Block cultivateLiquid;

    public void init()
    {
        cultivateBottomOff = new BlockCultivateBottom(false);
        cultivateTopOff = new BlockCultivateTop(false);
        cultivateBottomOn = new BlockCultivateBottom(true);
        cultivateTopOn = new BlockCultivateTop(true);
        dnaExtractor = new BlockDNAExtractor();
        dnaCombinator = new BlockDNACombinator();
        amberOre = new BlockAmberOre();
        fossilOre = new BlockFossilOre();
        sandstoneFossilOre = new BlockFossilSandstoneOre();
        clayFossilOre = new BlockFossilClayOre();

        gameRegistry();
    }

    public void gameRegistry()
    {
        GameRegistry.registerBlock(cultivateBottomOff, ItemBlockCultivate.class, "cultivateOff");
        GameRegistry.registerBlock(cultivateBottomOn, ItemBlockCultivate.class, "cultivateOn");
        GameRegistry.registerBlock(clayFossilOre, ItemBlockFossilClayOre.class, "clayFossilOre");

        cultivateFluid = new Fluid("cultivate").setLuminosity(5).setViscosity(1);
        FluidRegistry.registerFluid(cultivateFluid);

        cultivateLiquid = new BlockStuffFluid(cultivateFluid, Material.water).setBlockName("culivateFluid").setCreativeTab(null);
        GameRegistry.registerBlock(cultivateLiquid, "culivateFluid");
    }
}
