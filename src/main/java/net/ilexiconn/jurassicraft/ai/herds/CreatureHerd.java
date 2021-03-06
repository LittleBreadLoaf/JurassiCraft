package net.ilexiconn.jurassicraft.ai.herds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;

import com.google.common.collect.Lists;

public class CreatureHerd implements Collection<EntityJurassiCraftCreature>
{

    private ArrayList<EntityJurassiCraftCreature> creatures;
    private Class<? extends EntityJurassiCraftCreature> herdType;
    
    private static List<CreatureHerd> herds = Lists.newArrayList();
    
    public static List<CreatureHerd> getHerds()
    {
        return herds;
    }
    
    public static void registerHerd(CreatureHerd herd)
    {
        herds.add(herd);
    }
    
    public static void removeHerd(CreatureHerd herd)
    {
        herds.remove(herd);
    }

    public CreatureHerd()
    {
        creatures = Lists.newArrayList();
    }

    /**
     * Adds the entity only if the herd "accepts" it<br/>
     * Acceptance is based on the creatures' types (T-rex herds will only accept T-rexs' friend dinosaurs)
     * @param e
     *         The entity to add to the herd
     * @return <code>true</code> if the creature was accepted and added to this herd. <code>false</code> is returned otherwise
     */
    @Override
    public boolean add(EntityJurassiCraftCreature e)
    {
        if(isAcceptable(e))
        {
            creatures.add(e);
            return true;
        }
        return false;
    }

    public boolean isAcceptable(EntityJurassiCraftCreature e)
    {
        if(herdType == null)
        {
            herdType = e.getClass(); 
            return true;
        }
        if(herdType == e.getClass()) // FIXME: We will need something else than per-class herds
        {
            return creatures.size() < 7 && !contains(e);
        }
        return false;
    }

    /**
     * Adds a collection of entities into this herd if possible
     * @param c
     *         The collection of creatures to add to this herd
     * @return <code>true</code> if all creatures were added to this herd
     */
    @Override
    public boolean addAll(Collection<? extends EntityJurassiCraftCreature> c)
    {
        boolean flag = true;
        for(EntityJurassiCraftCreature creature : c)
        {
            flag &= add(creature);
        }
        return flag;
    }

    @Override
    public void clear()
    {
        creatures.clear();
    }

    @Override
    public boolean contains(Object o)
    {
        return creatures.contains(o);
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        return creatures.containsAll(c);
    }

    @Override
    public boolean isEmpty()
    {
        return creatures.isEmpty();
    }

    @Override
    public Iterator<EntityJurassiCraftCreature> iterator()
    {
        return creatures.iterator();
    }

    @Override
    public boolean remove(Object o)
    {
        // TODO Notify herd maybe?
        if(creatures.size()-1 == 0)
        {
            herds.remove(this);
        }
        return creatures.remove(o);
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        // TODO Notify herd ?
        if(creatures.size()-c.size() <= 0)
        {
            herds.remove(this);
        }
        return creatures.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        // TODO Notify herd
        return creatures.retainAll(c);
    }

    @Override
    public int size()
    {
        return creatures.size();
    }

    @Override
    public Object[] toArray()
    {
        return creatures.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a)
    {
        return creatures.toArray(a);
    }
    
    public Vec3 computeCenter()
    {
        double x = 0f;
        double y = 0f;
        double z = 0f;
        for(EntityJurassiCraftCreature creature : creatures)
        {
            x += creature.posX;
            y += creature.posY;
            z += creature.posZ;
        }
        
        x /= creatures.size();
        y /= creatures.size();
        z /= creatures.size();
        return Vec3.createVectorHelper(x, y, z);
    }

    public double getDistanceFrom(EntityJurassiCraftCreature creature)
    {
        Vec3 center = computeCenter();
        return creature.getPosition(1f).distanceTo(center);
    }

    public void attack(EntityLivingBase target)
    {
        for(EntityJurassiCraftCreature creature : creatures)
        {
            creature.setAttackTarget(target);
        }
        
        System.out.println("Herd of "+size()+" creatures now attacking "+target);
    }
    
}
