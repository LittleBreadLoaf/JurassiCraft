package net.ilexiconn.jurassicraft.entity.mammals;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class EntityPregnantPig implements IExtendedEntityProperties
{

    public final static String PREGNANT_PIG_PROPERTY = "EntityPregnantPigJC";
    private final EntityPig pig;
    private String dnaSequence;
    private String mammalName;
    private int pregnancyProgress;
    private int pregnancySpeed;
    private int dnaQuality;

	public EntityPregnantPig(EntityPig pig) 
	{
		this.pig = pig;
		this.mammalName = "noEmbryo";
		this.dnaQuality = 0;
		this.dnaSequence = "";
		this.pregnancySpeed = 0;
	}

	@Override
	public void init(Entity entity, World world) 
	{
		
	}

	public static final void register(EntityPig entity) 
	{
		entity.registerExtendedProperties(EntityPregnantPig.PREGNANT_PIG_PROPERTY, new EntityPregnantPig(entity));
	}

	public static final EntityPregnantPig get(EntityPig entity) 
	{
		return (EntityPregnantPig) entity.getExtendedProperties(EntityPregnantPig.PREGNANT_PIG_PROPERTY);
	}
    
	public String getDNASequence() 
	{
		return dnaSequence;
	}

	public void setDNASequence(String dna) 
	{
		this.dnaSequence = dna;
	}

	public String getMammalName() 
	{
		return mammalName;
	}

	public void setMammalName(String mammal) 
	{
		this.mammalName = mammal;
	}

	public int getPregnancyProgress() 
	{
		return pregnancyProgress;
	}

	public void increasePregnancyProgress() 
	{
		this.pregnancyProgress = this.getPregnancyProgress() + 1;
	}

	public void setPregnancyProgress(int progress) 
	{
		this.pregnancyProgress = progress;
	}

	public int getPregnancySpeed() 
	{
		return pregnancySpeed;
	}

	public void setPregnancySpeed(int speed) 
	{
		this.pregnancySpeed = speed;
	}

	public int getDNAQuality() 
	{
		return dnaQuality;
	}

	public void setDNAQuality(int quality) 
	{
		this.dnaQuality = quality;
	}
	
	public int getPregnancyProgressScaled(int barSize)
    {
        if (this.getPregnancySpeed() <= 0)
        {
            this.setPregnancySpeed(2048);
        }
        return (this.getPregnancyProgress() * barSize) / this.getPregnancySpeed();
    }

    @Override
    public void saveNBTData(NBTTagCompound compound)
    {
        NBTTagCompound properties = new NBTTagCompound();
        properties.setString("DNASequence", this.dnaSequence);
        properties.setString("MammalName", this.mammalName);
        properties.setInteger("PregnancyProgress", this.pregnancyProgress);
        properties.setInteger("PregnancySpeed", this.pregnancySpeed);
        properties.setInteger("DNAQuality", this.dnaQuality);
        compound.setTag(EntityPregnantPig.PREGNANT_PIG_PROPERTY, properties);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound)
    {
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(EntityPregnantPig.PREGNANT_PIG_PROPERTY);
        this.dnaSequence = properties.getString("DNASequence");
        this.mammalName = properties.getString("MammalName");
        this.pregnancyProgress = properties.getInteger("PregnancyProgress");
        this.pregnancySpeed = properties.getInteger("PregnancySpeed");
        this.dnaQuality = properties.getInteger("DNAQuality");
    }
}