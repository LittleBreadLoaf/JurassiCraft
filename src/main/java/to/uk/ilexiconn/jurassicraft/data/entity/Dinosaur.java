package to.uk.ilexiconn.jurassicraft.data.entity;

import java.util.ArrayList;

public class Dinosaur
{
    public byte creatureID;

    public String creatureName;
    public String livingSound1;
    public String livingSound2;
    public String hurtSound;
    public String deathSound;

    public double minHealth;
    public double minStrength;
    public double minSpeed;
    public double minKnockback;
    public double minProximate;
    public double minMinerals;
    public double minVitamins;
    public double minLipids;
    public double maxHealth;
    public double maxStrength;
    public double maxSpeed;
    public double maxKnockback;
    public double ridingSpeed;

    public float adultAge;
    public float minLength;
    public float minHeight;
    public float maxLength;
    public float maxHeight;
    public float xzBoxMin;
    public float yBoxMin;
    public float xzBoxDelta;
    public float yBoxDelta;
    public float scaleAdjustment;

    public int ticksToAdulthood;
    public int cultivateSpeed;

    public ArrayList favoriteFoodList;
    public ArrayList ridingItemList;

    public boolean isRidable;
    public boolean waterCreature;
}