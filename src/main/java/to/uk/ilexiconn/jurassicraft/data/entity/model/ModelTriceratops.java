// Date: 27/07/2014 4:09:35 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package to.uk.ilexiconn.jurassicraft.data.entity.model;

import to.uk.ilexiconn.llib.client.model.MowzieModelBase;
import to.uk.ilexiconn.llib.client.model.MowzieModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTriceratops extends MowzieModelBase
{
    //fields
    MowzieModelRenderer BackLeg1;
    MowzieModelRenderer BackLeg2;
    MowzieModelRenderer BackLeg3;
    MowzieModelRenderer BackLeg4;
    MowzieModelRenderer FrontLeg1;
    MowzieModelRenderer FrontLeg2;
    MowzieModelRenderer FrontLeg3;
    MowzieModelRenderer FrontLeg4;
    MowzieModelRenderer Tail1;
    MowzieModelRenderer Tail2;
    MowzieModelRenderer Tail3;
    MowzieModelRenderer Tail5;
    MowzieModelRenderer Tail6;
    MowzieModelRenderer Torso_1;
    MowzieModelRenderer Neck;
    MowzieModelRenderer Head;
    MowzieModelRenderer Mouth;
    MowzieModelRenderer Shield_thingy1;
    MowzieModelRenderer Shield_thingy2;
    MowzieModelRenderer Shield_thingy3;
    MowzieModelRenderer Middle_Horn;
    MowzieModelRenderer Left_Horn;
    MowzieModelRenderer Right_Back_Foot;
    MowzieModelRenderer Left_Back_Foot;
    MowzieModelRenderer Torso_2;
    MowzieModelRenderer Right_Horn;
    MowzieModelRenderer Shield_thingy4;
    MowzieModelRenderer Shield_thingy5;
    MowzieModelRenderer Shield_thingy6;
    MowzieModelRenderer Shield_thingy7;
    MowzieModelRenderer Shield_thingy8;
    MowzieModelRenderer Shield_thingy9;
    MowzieModelRenderer Shield_thingy10;
    MowzieModelRenderer Shield_thingy11;
    MowzieModelRenderer Shield_thingy12;
    MowzieModelRenderer Shield_thingy13;
    MowzieModelRenderer Chest;
    MowzieModelRenderer Left_Front_Foot;
    MowzieModelRenderer Right_Front_Foot;

    public ModelTriceratops()
    {
        textureWidth = 256;
        textureHeight = 256;

        BackLeg1 = new MowzieModelRenderer(this, 236, 0);
        BackLeg1.addBox(0F, 8.3F, -10.8F, 4, 13, 5);
        BackLeg1.setRotationPoint(8.5F, -2F, 10F);
        BackLeg1.setTextureSize(256, 256);
        BackLeg1.mirror = true;
        setRotation(BackLeg1, 0.3436956F, 0F, 0F);
        BackLeg2 = new MowzieModelRenderer(this, 213, 0);
        BackLeg2.addBox(-4F, 8.3F, -10.8F, 4, 13, 5);
        BackLeg2.setRotationPoint(-8.5F, -2F, 10F);
        BackLeg2.setTextureSize(256, 256);
        BackLeg2.mirror = true;
        setRotation(BackLeg2, 0.3436902F, 0F, 0F);
        BackLeg3 = new MowzieModelRenderer(this, 180, 0);
        BackLeg3.addBox(-0.5F, 0F, -3.5F, 5, 16, 9);
        BackLeg3.setRotationPoint(8.5F, -2F, 10F);
        BackLeg3.setTextureSize(256, 256);
        BackLeg3.mirror = true;
        setRotation(BackLeg3, -0.3285143F, 0F, 0F);
        BackLeg4 = new MowzieModelRenderer(this, 147, 0);
        BackLeg4.addBox(-4.5F, 0F, -3.5F, 5, 16, 9);
        BackLeg4.setRotationPoint(-8.5F, -2F, 10F);
        BackLeg4.setTextureSize(256, 256);
        BackLeg4.mirror = true;
        setRotation(BackLeg4, -0.3262369F, 0F, 0F);
        FrontLeg1 = new MowzieModelRenderer(this, 235, 23);
        FrontLeg1.addBox(-1.5F, 9.4F, 5F, 4, 9, 5);
        FrontLeg1.setRotationPoint(8F, 1F, -10F);
        FrontLeg1.setTextureSize(256, 256);
        FrontLeg1.mirror = true;
        setRotation(FrontLeg1, -0.3232474F, 0F, 0F);
        FrontLeg2 = new MowzieModelRenderer(this, 212, 24);
        FrontLeg2.addBox(-2.5F, 9.4F, 5F, 4, 9, 5);
        FrontLeg2.setRotationPoint(-8F, 1F, -10F);
        FrontLeg2.setTextureSize(256, 256);
        FrontLeg2.mirror = true;
        setRotation(FrontLeg2, -0.3232524F, 0F, 0F);
        FrontLeg3 = new MowzieModelRenderer(this, 182, 29);
        FrontLeg3.addBox(-2F, 0F, -3.5F, 5, 15, 7);
        FrontLeg3.setRotationPoint(8F, 1F, -10F);
        FrontLeg3.setTextureSize(256, 256);
        FrontLeg3.mirror = true;
        setRotation(FrontLeg3, 0.3035302F, -0.0174533F, 0F);
        FrontLeg4 = new MowzieModelRenderer(this, 147, 29);
        FrontLeg4.addBox(-3F, 0F, -3.5F, 5, 15, 7);
        FrontLeg4.setRotationPoint(-8F, 1F, -10F);
        FrontLeg4.setTextureSize(256, 256);
        FrontLeg4.mirror = true;
        setRotation(FrontLeg4, 0.3035302F, 0F, 0F);
        Tail1 = new MowzieModelRenderer(this, 0, 95);
        Tail1.addBox(-6F, 0F, 0F, 12, 14, 10);
        Tail1.setRotationPoint(0F, -5.8F, 15F);
        Tail1.setTextureSize(256, 256);
        Tail1.mirror = true;
        setRotation(Tail1, -0.2382529F, 0F, 0F);
        Tail2 = new MowzieModelRenderer(this, 0, 123);
        Tail2.addBox(-4.5F, 1F, 8F, 9, 12, 8);
        Tail2.setRotationPoint(0F, -5F, 14F);
        Tail2.setTextureSize(256, 256);
        Tail2.mirror = true;
        setRotation(Tail2, -0.1616237F, 0F, 0F);
        Tail3 = new MowzieModelRenderer(this, 37, 141);
        Tail3.addBox(-4F, 3F, 14F, 8, 9, 7);
        Tail3.setRotationPoint(0F, -4.8F, 14F);
        Tail3.setTextureSize(256, 256);
        Tail3.mirror = true;
        setRotation(Tail3, -0.1047198F, 0F, 0F);
        Tail5 = new MowzieModelRenderer(this, 0, 147);
        Tail5.addBox(-3F, 4.5F, 17F, 6, 7, 11);
        Tail5.setRotationPoint(0F, -4.4F, 12F);
        Tail5.setTextureSize(256, 256);
        Tail5.mirror = true;
        setRotation(Tail5, -0.0478158F, 0F, 0F);
        Tail6 = new MowzieModelRenderer(this, 37, 162);
        Tail6.addBox(-2F, 6F, 24F, 4, 5, 11);
        Tail6.setRotationPoint(0F, -3.9F, 12F);
        Tail6.setTextureSize(256, 256);
        Tail6.mirror = true;
        setRotation(Tail6, -0.0106372F, 0F, 0F);
        Torso_1 = new MowzieModelRenderer(this, 14, 219);
        Torso_1.addBox(-8F, 0F, -16F, 16, 17, 17);
        Torso_1.setRotationPoint(0F, -6.2F, 0.6F);
        Torso_1.setTextureSize(256, 256);
        Torso_1.mirror = true;
        setRotation(Torso_1, 0.1115358F, 0F, 0F);
        Neck = new MowzieModelRenderer(this, 0, 184);
        Neck.addBox(-4.5F, 0F, -7F, 9, 10, 8);
        Neck.setRotationPoint(0F, -3.1F, -15F);
        Neck.setTextureSize(256, 256);
        Neck.mirror = true;
        setRotation(Neck, 0.0174533F, 0F, 0F);
        Head = new MowzieModelRenderer(this, 37, 182);
        Head.addBox(-5F, 0F, -10F, 10, 10, 10);
        Head.setRotationPoint(0F, -2.9F, -22F);
        Head.setTextureSize(256, 256);
        Head.mirror = true;
        setRotation(Head, 0.179077F, 0F, 0F);
        Mouth = new MowzieModelRenderer(this, 0, 168);
        Mouth.addBox(-3F, 0F, -6F, 6, 7, 6);
        Mouth.setRotationPoint(0F, 1F, -31F);
        Mouth.setTextureSize(256, 256);
        Mouth.mirror = true;
        setRotation(Mouth, 0.3080661F, 0F, 0F);
        Shield_thingy1 = new MowzieModelRenderer(this, 0, 71);
        Shield_thingy1.addBox(-9F, -9.5F, 0F, 18, 18, 2);
        Shield_thingy1.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy1.setTextureSize(256, 256);
        Shield_thingy1.mirror = true;
        setRotation(Shield_thingy1, -0.3141593F, 0F, 0F);
        Shield_thingy2 = new MowzieModelRenderer(this, 31, 219);
        Shield_thingy2.addBox(-5.3F, -1F, -3F, 4, 3, 4);
        Shield_thingy2.setRotationPoint(0F, -2.9F, -21F);
        Shield_thingy2.setTextureSize(256, 256);
        Shield_thingy2.mirror = true;
        setRotation(Shield_thingy2, -0.6806784F, -0.0174533F, 0F);
        Shield_thingy3 = new MowzieModelRenderer(this, 31, 219);
        Shield_thingy3.addBox(1.3F, -1F, -3F, 4, 3, 4);
        Shield_thingy3.setRotationPoint(0F, -2.9F, -21F);
        Shield_thingy3.setTextureSize(256, 256);
        Shield_thingy3.mirror = true;
        setRotation(Shield_thingy3, -0.6806784F, -0.0174533F, 0F);
        Middle_Horn = new MowzieModelRenderer(this, 23, 59);
        Middle_Horn.addBox(-1F, -1.5F, -4F, 2, 4, 2);
        Middle_Horn.setRotationPoint(0F, 1F, -31F);
        Middle_Horn.setTextureSize(256, 256);
        Middle_Horn.mirror = true;
        setRotation(Middle_Horn, 0.0349066F, 0F, 0F);
        Left_Horn = new MowzieModelRenderer(this, 36, 52);
        Left_Horn.addBox(2.3F, -16F, -1.5F, 2, 16, 2);
        Left_Horn.setRotationPoint(0F, -2.9F, -21F);
        Left_Horn.setTextureSize(256, 256);
        Left_Horn.mirror = true;
        setRotation(Left_Horn, 0.8901179F, 0F, 0F);
        Right_Back_Foot = new MowzieModelRenderer(this, 0, 0);
        Right_Back_Foot.addBox(-4F, 22F, -3.3F, 4, 4, 5);
        Right_Back_Foot.setRotationPoint(-8.5F, -2F, 10F);
        Right_Back_Foot.setTextureSize(256, 256);
        Right_Back_Foot.mirror = true;
        setRotation(Right_Back_Foot, 0F, 0F, 0F);
        Left_Back_Foot = new MowzieModelRenderer(this, 0, 0);
        Left_Back_Foot.addBox(0F, 22F, -3.3F, 4, 4, 5);
        Left_Back_Foot.setRotationPoint(8.5F, -2F, 10F);
        Left_Back_Foot.setTextureSize(256, 256);
        Left_Back_Foot.mirror = true;
        setRotation(Left_Back_Foot, 0F, 0F, 0F);
        Torso_2 = new MowzieModelRenderer(this, 94, 217);
        Torso_2.addBox(-8.5F, -0.8F, 0F, 17, 18, 17);
        Torso_2.setRotationPoint(0F, -6.2F, 0.6F);
        Torso_2.setTextureSize(256, 256);
        Torso_2.mirror = true;
        setRotation(Torso_2, -0.0371786F, 0F, 0F);
        Right_Horn = new MowzieModelRenderer(this, 36, 52);
        Right_Horn.addBox(-4.3F, -16F, -1.5F, 2, 16, 2);
        Right_Horn.setRotationPoint(0F, -2.9F, -21F);
        Right_Horn.setTextureSize(256, 256);
        Right_Horn.mirror = true;
        setRotation(Right_Horn, 0.8901179F, 0F, 0F);
        Shield_thingy4 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy4.addBox(-10F, -8F, 0.5F, 2, 3, 1);
        Shield_thingy4.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy4.setTextureSize(256, 256);
        Shield_thingy4.mirror = true;
        setRotation(Shield_thingy4, -0.3171542F, 0F, 0.0174533F);
        Shield_thingy5 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy5.addBox(5F, -10.5F, 0.5F, 3, 2, 1);
        Shield_thingy5.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy5.setTextureSize(256, 256);
        Shield_thingy5.mirror = true;
        setRotation(Shield_thingy5, -0.3141593F, 0F, 0F);
        Shield_thingy6 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy6.addBox(1F, -10.5F, 0.5F, 3, 2, 1);
        Shield_thingy6.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy6.setTextureSize(256, 256);
        Shield_thingy6.mirror = true;
        setRotation(Shield_thingy6, -0.3141593F, 0F, 0F);
        Shield_thingy7 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy7.addBox(-4F, -10.5F, 0.5F, 3, 2, 1);
        Shield_thingy7.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy7.setTextureSize(256, 256);
        Shield_thingy7.mirror = true;
        setRotation(Shield_thingy7, -0.3141593F, 0F, 0F);
        Shield_thingy8 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy8.addBox(-8F, -10.5F, 0.5F, 3, 2, 1);
        Shield_thingy8.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy8.setTextureSize(256, 256);
        Shield_thingy8.mirror = true;
        setRotation(Shield_thingy8, -0.3141593F, 0F, 0F);
        Shield_thingy9 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy9.addBox(-10F, -4F, 0.5F, 2, 3, 1);
        Shield_thingy9.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy9.setTextureSize(256, 256);
        Shield_thingy9.mirror = true;
        setRotation(Shield_thingy9, -0.3171542F, 0F, 0.0174533F);
        Shield_thingy10 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy10.addBox(-10F, 0F, 0.5F, 2, 3, 1);
        Shield_thingy10.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy10.setTextureSize(256, 256);
        Shield_thingy10.mirror = true;
        setRotation(Shield_thingy10, -0.3171542F, 0F, 0.0174533F);
        Shield_thingy11 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy11.addBox(8F, 0F, 0.5F, 2, 3, 1);
        Shield_thingy11.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy11.setTextureSize(256, 256);
        Shield_thingy11.mirror = true;
        setRotation(Shield_thingy11, -0.3171542F, 0F, 0.0174533F);
        Shield_thingy12 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy12.addBox(8F, -8F, 0.5F, 2, 3, 1);
        Shield_thingy12.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy12.setTextureSize(256, 256);
        Shield_thingy12.mirror = true;
        setRotation(Shield_thingy12, -0.3171542F, 0F, 0.0174533F);
        Shield_thingy13 = new MowzieModelRenderer(this, 26, 40);
        Shield_thingy13.addBox(8F, -4F, 0.5F, 2, 3, 1);
        Shield_thingy13.setRotationPoint(0F, -2.9F, -22F);
        Shield_thingy13.setTextureSize(256, 256);
        Shield_thingy13.mirror = true;
        setRotation(Shield_thingy13, -0.3171542F, 0F, 0.0174533F);
        Chest = new MowzieModelRenderer(this, 28, 229);
        Chest.addBox(-6F, 0F, 0F, 12, 14, 7);
        Chest.setRotationPoint(0F, -2.8F, -8F);
        Chest.setTextureSize(256, 256);
        Chest.mirror = true;
        setRotation(Chest, -0.8042973F, 0F, 0F);
        Left_Front_Foot = new MowzieModelRenderer(this, 0, 0);
        Left_Front_Foot.addBox(0F, 0F, 0F, 4, 4, 5);
        Left_Front_Foot.setRotationPoint(6.5F, 20F, -11F);
        Left_Front_Foot.setTextureSize(256, 256);
        Left_Front_Foot.mirror = true;
        setRotation(Left_Front_Foot, 0F, 0F, 0F);
        Right_Front_Foot = new MowzieModelRenderer(this, 0, 0);
        Right_Front_Foot.addBox(-4F, 0F, 0F, 4, 4, 5);
        Right_Front_Foot.setRotationPoint(-6.5F, 20F, -11F);
        Right_Front_Foot.setTextureSize(256, 256);
        Right_Front_Foot.mirror = true;
        setRotation(Right_Front_Foot, 0F, 0F, 0F);
        
        addChildTo(Middle_Horn, Mouth);
        addChildTo(Mouth, Head);
        
        addChildTo(Left_Front_Foot, FrontLeg3);
        addChildTo(Right_Front_Foot, FrontLeg4);
        
        //Corrections
        Middle_Horn.setRotationPoint(0, 0, 0);
        
        BackLeg1.setInitValuesToCurrentPose();
        BackLeg2.setInitValuesToCurrentPose();
        BackLeg3.setInitValuesToCurrentPose();
        BackLeg4.setInitValuesToCurrentPose();
        FrontLeg1.setInitValuesToCurrentPose();
        FrontLeg2.setInitValuesToCurrentPose();
        FrontLeg3.setInitValuesToCurrentPose();
        FrontLeg4.setInitValuesToCurrentPose();
        Tail1.setInitValuesToCurrentPose();
        Tail2.setInitValuesToCurrentPose();
        Tail3.setInitValuesToCurrentPose();
        Tail5.setInitValuesToCurrentPose();
        Tail6.setInitValuesToCurrentPose();
        Torso_1.setInitValuesToCurrentPose();
        Neck.setInitValuesToCurrentPose();
        Head.setInitValuesToCurrentPose();
        Mouth.setInitValuesToCurrentPose();
        Shield_thingy1.setInitValuesToCurrentPose();
        Shield_thingy2.setInitValuesToCurrentPose();
        Shield_thingy3.setInitValuesToCurrentPose();
        Middle_Horn.setInitValuesToCurrentPose();
        Left_Horn.setInitValuesToCurrentPose();
        Right_Back_Foot.setInitValuesToCurrentPose();
        Left_Back_Foot.setInitValuesToCurrentPose();
        Torso_2.setInitValuesToCurrentPose();
        Right_Horn.setInitValuesToCurrentPose();
        Shield_thingy4.setInitValuesToCurrentPose();
        Shield_thingy5.setInitValuesToCurrentPose();
        Shield_thingy6.setInitValuesToCurrentPose();
        Shield_thingy7.setInitValuesToCurrentPose();
        Shield_thingy8.setInitValuesToCurrentPose();
        Shield_thingy9.setInitValuesToCurrentPose();
        Shield_thingy10.setInitValuesToCurrentPose();
        Shield_thingy11.setInitValuesToCurrentPose();
        Shield_thingy12.setInitValuesToCurrentPose();
        Shield_thingy13.setInitValuesToCurrentPose();
        Chest.setInitValuesToCurrentPose();
        Left_Front_Foot.setInitValuesToCurrentPose();
        Right_Front_Foot.setInitValuesToCurrentPose();
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        BackLeg1.render(f5);
        BackLeg2.render(f5);
        BackLeg3.render(f5);
        BackLeg4.render(f5);
        FrontLeg1.render(f5);
        FrontLeg2.render(f5);
        FrontLeg3.render(f5);
        FrontLeg4.render(f5);
        Tail1.render(f5);
        Tail2.render(f5);
        Tail3.render(f5);
        Tail5.render(f5);
        Tail6.render(f5);
        Torso_1.render(f5);
        Neck.render(f5);
        Head.render(f5);
//        Mouth.render(f5);
        Shield_thingy1.render(f5);
        Shield_thingy2.render(f5);
        Shield_thingy3.render(f5);
//        Middle_Horn.render(f5);
        Left_Horn.render(f5);
        Right_Back_Foot.render(f5);
        Left_Back_Foot.render(f5);
        Torso_2.render(f5);
        Right_Horn.render(f5);
        Shield_thingy4.render(f5);
        Shield_thingy5.render(f5);
        Shield_thingy6.render(f5);
        Shield_thingy7.render(f5);
        Shield_thingy8.render(f5);
        Shield_thingy9.render(f5);
        Shield_thingy10.render(f5);
        Shield_thingy11.render(f5);
        Shield_thingy12.render(f5);
        Shield_thingy13.render(f5);
        Chest.render(f5);
//        Left_Front_Foot.render(f5);
//        Right_Front_Foot.render(f5);
    }

    private void setRotation(MowzieModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void resetPose() {
    	BackLeg1.setCurrentPoseToInitValues();
        BackLeg2.setCurrentPoseToInitValues();
        BackLeg3.setCurrentPoseToInitValues();
        BackLeg4.setCurrentPoseToInitValues();
        FrontLeg1.setCurrentPoseToInitValues();
        FrontLeg2.setCurrentPoseToInitValues();
        FrontLeg3.setCurrentPoseToInitValues();
        FrontLeg4.setCurrentPoseToInitValues();
        Tail1.setCurrentPoseToInitValues();
        Tail2.setCurrentPoseToInitValues();
        Tail3.setCurrentPoseToInitValues();
        Tail5.setCurrentPoseToInitValues();
        Tail6.setCurrentPoseToInitValues();
        Torso_1.setCurrentPoseToInitValues();
        Neck.setCurrentPoseToInitValues();
        Head.setCurrentPoseToInitValues();
        Mouth.setCurrentPoseToInitValues();
        Shield_thingy1.setCurrentPoseToInitValues();
        Shield_thingy2.setCurrentPoseToInitValues();
        Shield_thingy3.setCurrentPoseToInitValues();
        Middle_Horn.setCurrentPoseToInitValues();
        Left_Horn.setCurrentPoseToInitValues();
        Right_Back_Foot.setCurrentPoseToInitValues();
        Left_Back_Foot.setCurrentPoseToInitValues();
        Torso_2.setCurrentPoseToInitValues();
        Right_Horn.setCurrentPoseToInitValues();
        Shield_thingy4.setCurrentPoseToInitValues();
        Shield_thingy5.setCurrentPoseToInitValues();
        Shield_thingy6.setCurrentPoseToInitValues();
        Shield_thingy7.setCurrentPoseToInitValues();
        Shield_thingy8.setCurrentPoseToInitValues();
        Shield_thingy9.setCurrentPoseToInitValues();
        Shield_thingy10.setCurrentPoseToInitValues();
        Shield_thingy11.setCurrentPoseToInitValues();
        Shield_thingy12.setCurrentPoseToInitValues();
        Shield_thingy13.setCurrentPoseToInitValues();
        Chest.setCurrentPoseToInitValues();
        Left_Front_Foot.setCurrentPoseToInitValues();
        Right_Front_Foot.setCurrentPoseToInitValues();
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        resetPose();
        faceTarget(Head, 1, f3, f4);
        faceTarget(Shield_thingy1, 1, f3, f4);
        faceTarget(Shield_thingy2, 1, f3, f4);
        faceTarget(Shield_thingy3, 1, f3, f4);
        faceTarget(Shield_thingy4, 1, f3, f4);
        faceTarget(Shield_thingy5, 1, f3, f4);
        faceTarget(Shield_thingy6, 1, f3, f4);
        faceTarget(Shield_thingy7, 1, f3, f4);
        faceTarget(Shield_thingy8, 1, f3, f4);
        faceTarget(Shield_thingy9, 1, f3, f4);
        faceTarget(Shield_thingy10, 1, f3, f4);
        faceTarget(Shield_thingy11, 1, f3, f4);
        faceTarget(Shield_thingy12, 1, f3, f4);
        faceTarget(Shield_thingy13, 1, f3, f4);
        faceTarget(Left_Horn, 1, f3, f4);
        faceTarget(Right_Horn, 1, f3, f4);
        walk(BackLeg1, 0.5F, 0.3F, false, 0F, 0, f, f1);
        walk(BackLeg2, 0.5F, 0.3F, true, 0F, 0, f, f1);
        walk(BackLeg3, 0.5F, 0.3F, false, 0F, 0, f, f1);
        walk(BackLeg4, 0.5F, 0.3F, true, 0F, 0, f, f1);
        walk(Right_Back_Foot, 0.5F, 0.3F, true, 0F, 0, f, f1);
        walk(Left_Back_Foot, 0.5F, 0.3F, false, 0F, 0, f, f1);
        walk(FrontLeg1, 0.5F, 0.5F, true, 0F, 0, f, f1);
        walk(FrontLeg2, 0.5F, 0.5F, false, 0F, 0, f, f1);
        walk(FrontLeg3, 0.5F, 0.5F, true, 0F, 0, f, f1);
        walk(FrontLeg4, 0.5F, 0.5F, false, 0F, 0, f, f1);
//        walk(Left_Front_Foot, 0.5F, 0.5F, false, 0F, 0, f, f1);
//        walk(Right_Front_Foot, 0.5F, 0.5F, true, 0F, 0, f, f1);
    }

}
