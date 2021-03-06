package net.ilexiconn.jurassicraft.client.model.entity;

import net.ilexiconn.jurassicraft.client.model.modelbase.MowzieModelBase;
import net.ilexiconn.jurassicraft.client.model.modelbase.MowzieModelRenderer;
import net.ilexiconn.jurassicraft.entity.mammals.EntityArsinoitherium;
import net.minecraft.entity.Entity;

public class ModelArsinoitherium extends MowzieModelBase 
{
	public MowzieModelRenderer upperbackbody;
	public MowzieModelRenderer middlebody;
	public MowzieModelRenderer upperfrontbody;
	public MowzieModelRenderer bottomfrontbody;
	public MowzieModelRenderer chest;
	public MowzieModelRenderer neck;
	public MowzieModelRenderer head;
	public MowzieModelRenderer leftear;
	public MowzieModelRenderer rightear;
	public MowzieModelRenderer mouth;
	public MowzieModelRenderer snout;
	public MowzieModelRenderer leftbackleg1;
	public MowzieModelRenderer leftbackleg2;
	public MowzieModelRenderer leftbackleg3;
	public MowzieModelRenderer leftbackleg4;
	public MowzieModelRenderer rightbackleg1;
	public MowzieModelRenderer rightbackleg2;
	public MowzieModelRenderer rightbackleg3;
	public MowzieModelRenderer rightbackleg4;
	public MowzieModelRenderer leftfrontleg1;
	public MowzieModelRenderer leftfrontleg2;
	public MowzieModelRenderer leftfrontleg3;
	public MowzieModelRenderer leftfrontleg4;
	public MowzieModelRenderer rightfrontleg1;
	public MowzieModelRenderer rightfrontleg2;
	public MowzieModelRenderer rightfrontleg3;
	public MowzieModelRenderer rightfrontleg4;
	public MowzieModelRenderer leftupperhorn;
	public MowzieModelRenderer rightupperhorn;
	public MowzieModelRenderer leftbottomhorn1;
	public MowzieModelRenderer leftbottomhorn2;
	public MowzieModelRenderer leftbottomhorn3;
	public MowzieModelRenderer rightbottomhorn1;
	public MowzieModelRenderer rightbottomhorn2;
	public MowzieModelRenderer rightbottomhorn3;
	public MowzieModelRenderer tail1;
	public MowzieModelRenderer tail2;

	public ModelArsinoitherium() 
	{
		this.textureWidth = 128;
		this.textureHeight = 128;

		this.snout = new MowzieModelRenderer(this, 34, 54);
		this.snout.setRotationPoint(0.0F, -0.5F, -8.0F);
		this.snout.addBox(-4.0F, -2.5F, -6.0F, 8, 5, 6);
		this.rightfrontleg1 = new MowzieModelRenderer(this, 0, 68);
		this.rightfrontleg1.setRotationPoint(-7.0F, 1.0F, 3.0F);
		this.rightfrontleg1.addBox(-2.0F, -4.0F, -2.0F, 6, 10, 8);
		this.setRotateAngle(rightfrontleg1, 0.17453292519943295F, -0.0F, 0.0F);
		this.rightear = new MowzieModelRenderer(this, 106, 60);
		this.rightear.setRotationPoint(-3.5F, -3.0F, 0.0F);
		this.rightear.addBox(-2.0F, -2.0F, -0.5F, 2, 3, 1);
		this.setRotateAngle(rightear, -0.37960911230876665F, 0.17191493132144145F, -0.17715091907742445F);
		this.leftbackleg4 = new MowzieModelRenderer(this, 88, 38);
		this.leftbackleg4.setRotationPoint(0.0F, 4.25F, 0.0F);
		this.leftbackleg4.addBox(-2.0F, 0.0F, -1.75F, 4, 4, 4);
		this.setRotateAngle(leftbackleg4, -0.4363323129985824F, 0.0F, 0.0F);
		this.neck = new MowzieModelRenderer(this, 75, 8);
		this.neck.setRotationPoint(0.0F, -1.5F, 0.0F);
		this.neck.addBox(-4.0F, -4.0F, -5.0F, 8, 8, 6);
		this.tail1 = new MowzieModelRenderer(this, 84, 8);
		this.tail1.setRotationPoint(0.0F, -5.0F, 8.0F);
		this.tail1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6);
		this.setRotateAngle(tail1, -0.5235987755982988F, 0.0F, 0.0F);
		this.leftbottomhorn2 = new MowzieModelRenderer(this, 116, 6);
		this.leftbottomhorn2.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.leftbottomhorn2.addBox(-1.75F, -3.5F, -1.75F, 3, 3, 3);
		this.rightfrontleg3 = new MowzieModelRenderer(this, 16, 86);
		this.rightfrontleg3.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.rightfrontleg3.addBox(-1.5F, -0.75F, -1.5F, 4, 6, 4);
		this.setRotateAngle(rightfrontleg3, -0.6544984694978736F, 0.0F, 0.0F);
		this.rightbottomhorn3 = new MowzieModelRenderer(this, 116, 12);
		this.rightbottomhorn3.setRotationPoint(0.0F, -3.0F, 0.0F);
		this.rightbottomhorn3.addBox(-1.5F, -3.0F, -1.5F, 2, 3, 2);
		this.upperfrontbody = new MowzieModelRenderer(this, 66, 0);
		this.upperfrontbody.setRotationPoint(0.0F, -0.25F, -5.0F);
		this.upperfrontbody.addBox(-7.5F, -7.0F, 0.0F, 15, 14, 8);
		this.setRotateAngle(upperfrontbody, 0.08726646259971647F, 0.0F, 0.0F);
		this.leftbackleg2 = new MowzieModelRenderer(this, 32, 86);
		this.leftbackleg2.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.leftbackleg2.addBox(-2.5F, -1.75F, -3.75F, 5, 5, 7);
		this.leftfrontleg3 = new MowzieModelRenderer(this, 16, 86);
		this.leftfrontleg3.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.leftfrontleg3.addBox(-2.5F, -0.75F, -1.5F, 4, 6, 4);
		this.setRotateAngle(leftfrontleg3, -0.6544984694978736F, 0.0F, 0.0F);
		this.leftbackleg3 = new MowzieModelRenderer(this, 64, 65);
		this.leftbackleg3.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.leftbackleg3.addBox(-2.0F, -1.5F, -2.0F, 4, 7, 4);
		this.setRotateAngle(leftbackleg3, 0.6108652381980153F, 0.0F, 0.0F);
		this.mouth = new MowzieModelRenderer(this, 56, 76);
		this.mouth.setRotationPoint(0.0F, 2.3F, -1.0F);
		this.mouth.addBox(-3.0F, -0.5F, -12.5F, 6, 3, 12);
		this.setRotateAngle(mouth, -0.05235987755982988F, 0.0F, 0.0F);
		this.leftear = new MowzieModelRenderer(this, 100, 60);
		this.leftear.setRotationPoint(3.5F, -3.0F, 0.0F);
		this.leftear.addBox(0.0F, -2.0F, -0.5F, 2, 3, 1);
		this.setRotateAngle(leftear, -0.37960911230876665F, -0.17191493132144145F, 0.17715091907742445F);
		this.leftbottomhorn3 = new MowzieModelRenderer(this, 116, 12);
		this.leftbottomhorn3.setRotationPoint(0.0F, -3.5F, 0.0F);
		this.leftbottomhorn3.addBox(-0.75F, -3.0F, -1.75F, 2, 3, 2);
		this.chest = new MowzieModelRenderer(this, 76, 24);
		this.chest.setRotationPoint(0.0F, 5.0F, -2.0F);
		this.chest.addBox(-4.0F, -8.75F, -3.5F, 8, 8, 6);
		this.setRotateAngle(chest, -0.8922123136195012F, 0.0F, 0.0F);
		this.rightfrontleg2 = new MowzieModelRenderer(this, 0, 86);
		this.rightfrontleg2.setRotationPoint(0.0F, 2.75F, 0.0F);
		this.rightfrontleg2.addBox(-1.5F, 0.0F, -1.5F, 4, 7, 4);
		this.setRotateAngle(rightfrontleg2, 0.20943951023931953F, -0.0F, 0.0F);
		this.rightbottomhorn2 = new MowzieModelRenderer(this, 116, 6);
		this.rightbottomhorn2.setRotationPoint(0.25F, -2.5F, -0.25F);
		this.rightbottomhorn2.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3);
		this.rightbackleg1 = new MowzieModelRenderer(this, 28, 65);
		this.rightbackleg1.setRotationPoint(-7.0F, 0.0F, 1.75F);
		this.rightbackleg1.addBox(-3.0F, -4.5F, -4.0F, 8, 11, 10);
		this.setRotateAngle(rightbackleg1, 0.17453292519943295F, 0.0F, 0.0F);
		this.leftbackleg1 = new MowzieModelRenderer(this, 28, 65);
		this.leftbackleg1.setRotationPoint(7.0F, 0.0F, 1.7F);
		this.leftbackleg1.addBox(-5.0F, -4.5F, -4.0F, 8, 11, 10);
		this.setRotateAngle(leftbackleg1, 0.17453292519943295F, 0.0F, 0.0F);
		this.rightupperhorn = new MowzieModelRenderer(this, 116, 0);
		this.rightupperhorn.setRotationPoint(-2.5F, -3.0F, -4.0F);
		this.rightupperhorn.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1);
		this.setRotateAngle(rightupperhorn, -0.5235987755982988F, 0.0F, 0.0F);
		this.leftbottomhorn1 = new MowzieModelRenderer(this, 116, 0);
		this.leftbottomhorn1.setRotationPoint(3.0F, -2.0F, -3.0F);
		this.leftbottomhorn1.addBox(-2.75F, -2.5F, -1.75F, 4, 2, 4);
		this.head = new MowzieModelRenderer(this, 0, 54);
		this.head.setRotationPoint(0.0F, -1.25F, -3.75F);
		this.head.addBox(-4.5F, -3.25F, -8.0F, 9, 8, 8);
		this.setRotateAngle(head, 0.3490658503988659F, 0.0F, 0.0F);
		this.rightbackleg3 = new MowzieModelRenderer(this, 64, 65);
		this.rightbackleg3.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.rightbackleg3.addBox(-2.0F, -1.5F, -2.0F, 4, 7, 4);
		this.setRotateAngle(rightbackleg3, 0.6108652381980153F, 0.0F, 0.0F);
		this.leftfrontleg2 = new MowzieModelRenderer(this, 0, 86);
		this.leftfrontleg2.setRotationPoint(0.0F, 2.75F, 0.0F);
		this.leftfrontleg2.addBox(-2.5F, 0.0F, -1.5F, 4, 7, 4);
		this.setRotateAngle(leftfrontleg2, 0.20943951023931953F, -0.0F, 0.0F);
		this.tail2 = new MowzieModelRenderer(this, 85, 70);
		this.tail2.setRotationPoint(0.0F, 0.0F, 5.5F);
		this.tail2.addBox(-1.0F, 0.0F, 0.0F, 2, 0, 3);
		this.bottomfrontbody = new MowzieModelRenderer(this, 66, 22);
		this.bottomfrontbody.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.bottomfrontbody.addBox(-7.0F, -4.0F, 0.5F, 14, 6, 10);
		this.setRotateAngle(bottomfrontbody, -0.11152653920243764F, -0.0F, 0.0F);
		this.middlebody = new MowzieModelRenderer(this, 0, 0);
		this.middlebody.setRotationPoint(0.0F, 5.5F, -14.5F);
		this.middlebody.addBox(-7.5F, -7.5F, 0.0F, 15, 15, 18);
		this.setRotateAngle(middlebody, 0.2617993877991494F, 0.0F, 0.0F);
		this.rightfrontleg4 = new MowzieModelRenderer(this, 88, 38);
		this.rightfrontleg4.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.rightfrontleg4.addBox(-1.5F, -0.35F, -1.5F, 4, 4, 4);
		this.setRotateAngle(rightfrontleg4, 0.2792526803190927F, 0.0F, 0.0F);
		this.leftfrontleg1 = new MowzieModelRenderer(this, 0, 68);
		this.leftfrontleg1.setRotationPoint(7.0F, 1.0F, 3.0F);
		this.leftfrontleg1.addBox(-4.0F, -4.0F, -2.0F, 6, 10, 8);
		this.setRotateAngle(leftfrontleg1, 0.17453292519943295F, -0.0F, 0.0F);
		this.rightbottomhorn1 = new MowzieModelRenderer(this, 116, 0);
		this.rightbottomhorn1.setRotationPoint(-3.0F, -2.0F, -3.0F);
		this.rightbottomhorn1.addBox(-1.25F, -2.5F, -1.75F, 4, 2, 4);
		this.setRotateAngle(rightbottomhorn1, 0.0F, 0.017453292519943295F, 0.0F);
		this.leftupperhorn = new MowzieModelRenderer(this, 116, 0);
		this.leftupperhorn.setRotationPoint(2.5F, -3.0F, -4.0F);
		this.leftupperhorn.addBox(-0.5F, -2.5F, -0.5F, 1, 3, 1);
		this.setRotateAngle(leftupperhorn, -0.5235987755982988F, 0.0F, 0.0F);
		this.leftfrontleg4 = new MowzieModelRenderer(this, 88, 38);
		this.leftfrontleg4.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.leftfrontleg4.addBox(-2.5F, -0.35F, -1.5F, 4, 4, 4);
		this.setRotateAngle(leftfrontleg4, 0.2792526803190927F, 0.0F, 0.0F);
		this.upperbackbody = new MowzieModelRenderer(this, 0, 33);
		this.upperbackbody.setRotationPoint(0.0F, 6.75F, 8.0F);
		this.upperbackbody.addBox(-7.0F, -6.0F, 0.0F, 14, 12, 9);
		this.setRotateAngle(upperbackbody, -0.3490658503988659F, 0.0F, 0.0F);
		this.rightbackleg4 = new MowzieModelRenderer(this, 88, 38);
		this.rightbackleg4.setRotationPoint(0.0F, 4.25F, 0.0F);
		this.rightbackleg4.addBox(-2.0F, 0.0F, -1.75F, 4, 4, 4);
		this.setRotateAngle(rightbackleg4, -0.4363323129985824F, 0.0F, 0.0F);
		this.rightbackleg2 = new MowzieModelRenderer(this, 32, 86);
		this.rightbackleg2.setRotationPoint(0.0F, 6.0F, 0.0F);
		this.rightbackleg2.addBox(-2.5F, -1.75F, -3.75F, 5, 5, 7);

		this.upperbackbody.addChild(this.tail1);
		this.tail1.addChild(this.tail2);

		this.upperbackbody.addChild(this.rightbackleg1);
		this.rightbackleg1.addChild(this.rightbackleg2);
		this.rightbackleg2.addChild(this.rightbackleg3);
		this.rightbackleg3.addChild(this.rightbackleg4);

		this.upperbackbody.addChild(this.leftbackleg1);
		this.leftbackleg1.addChild(this.leftbackleg2);
		this.leftbackleg2.addChild(this.leftbackleg3);
		this.leftbackleg3.addChild(this.leftbackleg4);

		this.upperbackbody.addChild(this.middlebody);
		this.middlebody.addChild(this.upperfrontbody);

		this.upperfrontbody.addChild(this.leftfrontleg1);
		this.leftfrontleg1.addChild(this.leftfrontleg2);
		this.leftfrontleg2.addChild(this.leftfrontleg3);
		this.leftfrontleg3.addChild(this.leftfrontleg4);

		this.upperfrontbody.addChild(this.rightfrontleg1);
		this.rightfrontleg1.addChild(this.rightfrontleg2);
		this.rightfrontleg2.addChild(this.rightfrontleg3);
		this.rightfrontleg3.addChild(this.rightfrontleg4);

		this.upperfrontbody.addChild(this.chest);
		this.upperfrontbody.addChild(this.bottomfrontbody);
		this.upperfrontbody.addChild(this.neck);
		this.neck.addChild(this.head);
		this.head.addChild(this.rightear);
		this.head.addChild(this.leftear);
		this.head.addChild(this.leftupperhorn);
		this.head.addChild(this.rightupperhorn);
		this.head.addChild(this.mouth);
		this.head.addChild(this.snout);

		this.snout.addChild(this.leftbottomhorn1);
		this.leftbottomhorn1.addChild(this.leftbottomhorn2);
		this.leftbottomhorn2.addChild(this.leftbottomhorn3);

		this.snout.addChild(this.rightbottomhorn1);
		this.rightbottomhorn1.addChild(this.rightbottomhorn2);
		this.rightbottomhorn2.addChild(this.rightbottomhorn3);

		this.upperbackbody.setInitValuesToCurrentPose();
		this.tail1.setInitValuesToCurrentPose();
		this.leftbackleg1.setInitValuesToCurrentPose();
		this.rightbackleg1.setInitValuesToCurrentPose();
		this.middlebody.setInitValuesToCurrentPose();
		this.tail2.setInitValuesToCurrentPose();
		this.leftbackleg2.setInitValuesToCurrentPose();
		this.leftbackleg3.setInitValuesToCurrentPose();
		this.leftbackleg4.setInitValuesToCurrentPose();
		this.rightbackleg2.setInitValuesToCurrentPose();
		this.rightbackleg3.setInitValuesToCurrentPose();
		this.rightbackleg4.setInitValuesToCurrentPose();
		this.upperfrontbody.setInitValuesToCurrentPose();
		this.chest.setInitValuesToCurrentPose();
		this.leftfrontleg1.setInitValuesToCurrentPose();
		this.rightfrontleg1.setInitValuesToCurrentPose();
		this.neck.setInitValuesToCurrentPose();
		this.bottomfrontbody.setInitValuesToCurrentPose();
		this.leftfrontleg2.setInitValuesToCurrentPose();
		this.leftfrontleg3.setInitValuesToCurrentPose();
		this.leftfrontleg4.setInitValuesToCurrentPose();
		this.rightfrontleg2.setInitValuesToCurrentPose();
		this.rightfrontleg3.setInitValuesToCurrentPose();
		this.rightfrontleg4.setInitValuesToCurrentPose();
		this.head.setInitValuesToCurrentPose();
		this.leftear.setInitValuesToCurrentPose();
		this.rightear.setInitValuesToCurrentPose();
		this.leftupperhorn.setInitValuesToCurrentPose();
		this.rightupperhorn.setInitValuesToCurrentPose();
		this.mouth.setInitValuesToCurrentPose();
		this.snout.setInitValuesToCurrentPose();
		this.leftbottomhorn1.setInitValuesToCurrentPose();
		this.rightbottomhorn1.setInitValuesToCurrentPose();
		this.leftbottomhorn2.setInitValuesToCurrentPose();
		this.leftbottomhorn3.setInitValuesToCurrentPose();
		this.rightbottomhorn2.setInitValuesToCurrentPose();
		this.rightbottomhorn3.setInitValuesToCurrentPose();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		this.setRotationAngles(f, f1, f2, f3, f4, f5, (EntityArsinoitherium) entity);
		this.upperbackbody.render(f5);
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, EntityArsinoitherium arsinoitherium) 
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, arsinoitherium);
		this.resetPose();
		float scaleFactor = 0.6F;

		this.faceTarget(this.head, 1, f3, f4);
		this.faceTarget(this.head, 2, f3, f4);

		this.walk(this.rightbackleg1, 0.5F * scaleFactor, 0.75F, true, 0.0F, 0.3F, f, f1);
		this.walk(this.rightbackleg2, 0.5F * scaleFactor, 0.5F, false, 2.0F, 0.0F, f, f1);
		this.walk(this.rightbackleg3, 0.5F * scaleFactor, 0.75F, true, 0.0F, -0.4F, f, f1);
		this.walk(this.rightbackleg4, 0.5F * scaleFactor, 0.75F, false, 0.5F, 1.0F, f, f1);
		
		this.walk(this.leftbackleg1, 0.5F * scaleFactor, 0.75F, false, 0.0F, 0.3F, f, f1);
		this.walk(this.leftbackleg2, 0.5F * scaleFactor, 0.5F, true, 2.0F, 0.0F, f, f1);
		this.walk(this.leftbackleg3, 0.5F * scaleFactor, 0.75F, false, 0.0F, -0.4F, f, f1);
		this.walk(this.leftbackleg4, 0.5F * scaleFactor, 0.75F, true, 0.5F, 1.0F, f, f1);

		this.walk(this.rightfrontleg1, 0.5F * scaleFactor, 0.5F, false, 0.0F, 0.3F, f, f1);
		this.walk(this.rightfrontleg2, 0.5F * scaleFactor, 0.5F, true, 2.0F, 0.0F, f, f1);
		this.walk(this.rightfrontleg3, 0.5F * scaleFactor, 0.25F, false, 0.0F, -0.4F, f, f1);
		this.walk(rightfrontleg4, 0.5F * scaleFactor, 0.5F, true, 0.5F, 1.0F, f, f1);
		
		this.walk(this.leftfrontleg1, 0.5F * scaleFactor, 0.5F, true, 0.0F, 0.3F, f, f1);
		this.walk(this.leftfrontleg1, 0.5F * scaleFactor, 0.5F, false, 2.0F, 0.0F, f, f1);
		this.walk(this.leftfrontleg1, 0.5F * scaleFactor, 0.25F, true, 0.0F, -0.4F, f, f1);
		this.walk(this.leftfrontleg1, 0.5F * scaleFactor, 0.5F, false, 0.5F, 1.0F, f, f1);
	}

	public void setRotateAngle(MowzieModelRenderer modelRenderer, float x, float y, float z) 
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	private void resetPose() 
	{
		this.upperbackbody.setCurrentPoseToInitValues();
		this.tail1.setCurrentPoseToInitValues();
		this.leftbackleg1.setCurrentPoseToInitValues();
		this.rightbackleg1.setCurrentPoseToInitValues();
		this.middlebody.setCurrentPoseToInitValues();
		this.tail2.setCurrentPoseToInitValues();
		this.leftbackleg2.setCurrentPoseToInitValues();
		this.leftbackleg3.setCurrentPoseToInitValues();
		this.leftbackleg4.setCurrentPoseToInitValues();
		this.rightbackleg2.setCurrentPoseToInitValues();
		this.rightbackleg3.setCurrentPoseToInitValues();
		this.rightbackleg4.setCurrentPoseToInitValues();
		this.upperfrontbody.setCurrentPoseToInitValues();
		this.chest.setCurrentPoseToInitValues();
		this.leftfrontleg1.setCurrentPoseToInitValues();
		this.rightfrontleg1.setCurrentPoseToInitValues();
		this.neck.setCurrentPoseToInitValues();
		this.bottomfrontbody.setCurrentPoseToInitValues();
		this.leftfrontleg2.setCurrentPoseToInitValues();
		this.leftfrontleg3.setCurrentPoseToInitValues();
		this.leftfrontleg4.setCurrentPoseToInitValues();
		this.rightfrontleg2.setCurrentPoseToInitValues();
		this.rightfrontleg3.setCurrentPoseToInitValues();
		this.rightfrontleg4.setCurrentPoseToInitValues();
		this.head.setCurrentPoseToInitValues();
		this.leftear.setCurrentPoseToInitValues();
		this.rightear.setCurrentPoseToInitValues();
		this.leftupperhorn.setCurrentPoseToInitValues();
		this.rightupperhorn.setCurrentPoseToInitValues();
		this.mouth.setCurrentPoseToInitValues();
		this.snout.setCurrentPoseToInitValues();
		this.leftbottomhorn1.setCurrentPoseToInitValues();
		this.rightbottomhorn1.setCurrentPoseToInitValues();
		this.leftbottomhorn2.setCurrentPoseToInitValues();
		this.leftbottomhorn3.setCurrentPoseToInitValues();
		this.rightbottomhorn2.setCurrentPoseToInitValues();
		this.rightbottomhorn3.setCurrentPoseToInitValues();
	}
}
