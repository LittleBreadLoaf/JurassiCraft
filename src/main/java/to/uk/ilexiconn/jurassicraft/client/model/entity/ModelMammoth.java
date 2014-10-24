package to.uk.ilexiconn.jurassicraft.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMammoth extends ModelBase
{
    ModelRenderer leftLegFront2;
    ModelRenderer leftLegFront1;
    ModelRenderer leftLegFront3;
    ModelRenderer leftLegFront4;
    ModelRenderer rightLegFront1;
    ModelRenderer rightLegFront2;
    ModelRenderer rightLegFront3;
    ModelRenderer rightLegFront4;
    ModelRenderer leftLegBack1;
    ModelRenderer leftLegBack2;
    ModelRenderer leftLegBack3;
    ModelRenderer rightLegBack1;
    ModelRenderer rightLegBack2;
    ModelRenderer rightLegBack3;
    ModelRenderer tail;
    ModelRenderer bodyBack;
    ModelRenderer bodyFront;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer headTop;
    ModelRenderer mouth;
    ModelRenderer trunk1;
    ModelRenderer trunk2;
    ModelRenderer trunk3;
    ModelRenderer trunk4;
    ModelRenderer trunk5;
    ModelRenderer trunk6;
    ModelRenderer trunk7;
    ModelRenderer leftEar;
    ModelRenderer rightEar;
    ModelRenderer leftTusk1;
    ModelRenderer leftTusk2;
    ModelRenderer leftTusk3;
    ModelRenderer leftTusk4;
    ModelRenderer leftTusk5;
    ModelRenderer rightTusk1;
    ModelRenderer rightTusk2;
    ModelRenderer rightTusk3;
    ModelRenderer rightTusk4;
    ModelRenderer rightTusk5;
  
  public ModelMammoth()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      leftLegFront2 = new ModelRenderer(this, 0, 19);
      leftLegFront2.addBox(-2F, 0F, 0F, 5, 7, 6);
      leftLegFront2.setRotationPoint(6.5F, 8F, -8F);
      leftLegFront2.setTextureSize(128, 128);
      leftLegFront2.mirror = true;
      setRotation(leftLegFront2, 0.2094395F, 0F, 0F);
      leftLegFront1 = new ModelRenderer(this, 0, 0);
      leftLegFront1.addBox(-2F, 0F, 0F, 6, 10, 7);
      leftLegFront1.setRotationPoint(6F, -1.9F, -9F);
      leftLegFront1.setTextureSize(128, 128);
      leftLegFront1.mirror = true;
      setRotation(leftLegFront1, 0.0523599F, 0F, 0F);
      leftLegFront3 = new ModelRenderer(this, 0, 34);
      leftLegFront3.addBox(0F, 0F, 0F, 4, 7, 5);
      leftLegFront3.setRotationPoint(5F, 13F, -6F);
      leftLegFront3.setTextureSize(128, 128);
      leftLegFront3.mirror = true;
      setRotation(leftLegFront3, -0.122173F, 0F, 0F);
      leftLegFront4 = new ModelRenderer(this, 0, 48);
      leftLegFront4.addBox(0F, 0F, 0F, 4, 4, 5);
      leftLegFront4.setRotationPoint(5F, 20F, -6.8F);
      leftLegFront4.setTextureSize(128, 128);
      leftLegFront4.mirror = true;
      setRotation(leftLegFront4, 0F, 0F, 0F);
      rightLegFront1 = new ModelRenderer(this, 0, 0);
      rightLegFront1.addBox(0F, 0F, 0F, 6, 10, 7);
      rightLegFront1.setRotationPoint(-12F, -1.9F, -9F);
      rightLegFront1.setTextureSize(128, 128);
      rightLegFront1.mirror = true;
      setRotation(rightLegFront1, 0.0523599F, 0F, 0F);
      rightLegFront2 = new ModelRenderer(this, 0, 19);
      rightLegFront2.addBox(0F, 0F, 0F, 5, 7, 6);
      rightLegFront2.setRotationPoint(-11.5F, 8F, -8F);
      rightLegFront2.setTextureSize(128, 128);
      rightLegFront2.mirror = true;
      setRotation(rightLegFront2, 0.2094395F, 0F, 0F);
      rightLegFront3 = new ModelRenderer(this, 0, 34);
      rightLegFront3.addBox(0F, 0F, 0F, 4, 7, 5);
      rightLegFront3.setRotationPoint(-11F, 13F, -6F);
      rightLegFront3.setTextureSize(128, 128);
      rightLegFront3.mirror = true;
      setRotation(rightLegFront3, -0.122173F, 0F, 0F);
      rightLegFront4 = new ModelRenderer(this, 0, 48);
      rightLegFront4.addBox(0F, 0F, 0F, 4, 4, 5);
      rightLegFront4.setRotationPoint(-11F, 20F, -6.8F);
      rightLegFront4.setTextureSize(128, 128);
      rightLegFront4.mirror = true;
      setRotation(rightLegFront4, 0F, 0F, 0F);
      leftLegBack1 = new ModelRenderer(this, 0, 87);
      leftLegBack1.addBox(0F, 0F, 0F, 6, 11, 8);
      leftLegBack1.setRotationPoint(2F, 1F, 10F);
      leftLegBack1.setTextureSize(128, 128);
      leftLegBack1.mirror = true;
      setRotation(leftLegBack1, -0.1745329F, 0F, 0F);
      leftLegBack2 = new ModelRenderer(this, 0, 71);
      leftLegBack2.addBox(0F, 0F, 0F, 5, 9, 6);
      leftLegBack2.setRotationPoint(2.5F, 11.9F, 9F);
      leftLegBack2.setTextureSize(128, 128);
      leftLegBack2.mirror = true;
      setRotation(leftLegBack2, 0.1919862F, 0F, 0F);
      leftLegBack3 = new ModelRenderer(this, 0, 59);
      leftLegBack3.addBox(0F, 0F, 0F, 4, 5, 6);
      leftLegBack3.setRotationPoint(3F, 19.1F, 10.5F);
      leftLegBack3.setTextureSize(128, 128);
      leftLegBack3.mirror = true;
      setRotation(leftLegBack3, 0F, 0F, 0F);
      rightLegBack1 = new ModelRenderer(this, 0, 87);
      rightLegBack1.addBox(0F, 0F, 0F, 6, 11, 8);
      rightLegBack1.setRotationPoint(-10F, 1F, 10F);
      rightLegBack1.setTextureSize(128, 128);
      rightLegBack1.mirror = true;
      setRotation(rightLegBack1, -0.1745329F, 0F, 0F);
      rightLegBack2 = new ModelRenderer(this, 0, 71);
      rightLegBack2.addBox(0F, 0F, 0F, 5, 9, 6);
      rightLegBack2.setRotationPoint(-9.5F, 11.9F, 9F);
      rightLegBack2.setTextureSize(128, 128);
      rightLegBack2.mirror = true;
      setRotation(rightLegBack2, 0.1919862F, 0F, 0F);
      rightLegBack3 = new ModelRenderer(this, 0, 59);
      rightLegBack3.addBox(0F, 0F, 0F, 4, 5, 6);
      rightLegBack3.setRotationPoint(-9F, 19.1F, 10.5F);
      rightLegBack3.setTextureSize(128, 128);
      rightLegBack3.mirror = true;
      setRotation(rightLegBack3, 0F, 0F, 0F);
      tail = new ModelRenderer(this, 23, 18);
      tail.addBox(0F, 0F, 0F, 1, 9, 1);
      tail.setRotationPoint(-1.5F, -1F, 18.5F);
      tail.setTextureSize(128, 128);
      tail.mirror = true;
      setRotation(tail, 0.1115358F, 0F, 0F);
      bodyBack = new ModelRenderer(this, 22, 38);
      bodyBack.addBox(-6F, 0F, 0F, 12, 18, 16);
      bodyBack.setRotationPoint(-1F, -8.1F, 4F);
      bodyBack.setTextureSize(128, 128);
      bodyBack.mirror = true;
      setRotation(bodyBack, -0.0523599F, 0F, 0F);
      bodyFront = new ModelRenderer(this, 28, 1);
      bodyFront.addBox(0F, 0F, 0F, 14, 19, 17);
      bodyFront.setRotationPoint(-8F, -9.6F, -10F);
      bodyFront.setTextureSize(128, 128);
      bodyFront.mirror = true;
      setRotation(bodyFront, -0.0303625F, 0F, 0F);
      neck = new ModelRenderer(this, 92, 106);
      neck.addBox(0F, 0F, 0F, 12, 14, 4);
      neck.setRotationPoint(-7F, -10F, -13.1F);
      neck.setTextureSize(128, 128);
      neck.mirror = true;
      setRotation(neck, 0F, 0F, 0F);
      head = new ModelRenderer(this, 29, 73);
      head.addBox(-6F, 0F, 0F, 11, 12, 8);
      head.setRotationPoint(-0.5F, -10F, -21F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      headTop = new ModelRenderer(this, 0, 106);
      headTop.addBox(-4F, 0F, 0F, 9, 5, 12);
      headTop.setRotationPoint(-1.5F, -14F, -20F);
      headTop.setTextureSize(128, 128);
      headTop.mirror = true;
      setRotation(headTop, -0.1115358F, 0F, 0F);
      mouth = new ModelRenderer(this, 44, 115);
      mouth.addBox(-4F, 0F, -7F, 7, 2, 7);
      mouth.setRotationPoint(-0.5F, 0F, -16.5F);
      mouth.setTextureSize(128, 128);
      mouth.mirror = true;
      setRotation(mouth, 0.3346075F, 0F, 0F);
      trunk1 = new ModelRenderer(this, 88, 73);
      trunk1.addBox(-5F, 0F, 0F, 9, 11, 6);
      trunk1.setRotationPoint(-0.5F, -7.4F, -26.6F);
      trunk1.setTextureSize(128, 128);
      trunk1.mirror = true;
      setRotation(trunk1, 0.36497F, 0F, 0F);
      trunk2 = new ModelRenderer(this, 43, 94);
      trunk2.addBox(-4F, 0F, 0F, 8, 9, 6);
      trunk2.setRotationPoint(-1F, -2.3F, -29.5F);
      trunk2.setTextureSize(128, 128);
      trunk2.mirror = true;
      setRotation(trunk2, 0.9226492F, 0F, 0F);
      trunk3 = new ModelRenderer(this, 93, 14);
      trunk3.addBox(-3F, 0F, 0F, 7, 7, 7);
      trunk3.setRotationPoint(-1.5F, 4F, -30.6F);
      trunk3.setTextureSize(128, 128);
      trunk3.mirror = true;
      setRotation(trunk3, 1.257257F, 0F, 0F);
      trunk4 = new ModelRenderer(this, 79, 53);
      trunk4.addBox(-2.5F, 0F, 0F, 6, 6, 6);
      trunk4.setRotationPoint(-1.5F, 9.5F, -30.2F);
      trunk4.setTextureSize(128, 128);
      trunk4.mirror = true;
      setRotation(trunk4, 1.591864F, 0F, 0F);
      trunk5 = new ModelRenderer(this, 91, 40);
      trunk5.addBox(-2F, 0F, 0F, 5, 5, 6);
      trunk5.setRotationPoint(-1.5F, 14F, -29.5F);
      trunk5.setTextureSize(128, 128);
      trunk5.mirror = true;
      setRotation(trunk5, 1.629043F, 0F, 0F);
      trunk6 = new ModelRenderer(this, 102, 2);
      trunk6.addBox(-2F, 0F, 0F, 4, 4, 6);
      trunk6.setRotationPoint(-1F, 18.5F, -25.5F);
      trunk6.setTextureSize(128, 128);
      trunk6.mirror = true;
      setRotation(trunk6, 2.245898F, 0F, 0F);
      trunk7 = new ModelRenderer(this, 94, 30);
      trunk7.addBox(-2F, 0F, -5F, 3, 3, 5);
      trunk7.setRotationPoint(-0.5F, 17.8F, -25.6F);
      trunk7.setTextureSize(128, 128);
      trunk7.mirror = true;
      setRotation(trunk7, 2.707222F, 0F, 0F);
      leftEar = new ModelRenderer(this, 114, 39);
      leftEar.addBox(0F, 0F, 0F, 1, 4, 3);
      leftEar.setRotationPoint(3.5F, -8F, -16F);
      leftEar.setTextureSize(128, 128);
      leftEar.mirror = true;
      setRotation(leftEar, 0.1350823F, 0.6108652F, 0F);
      rightEar = new ModelRenderer(this, 114, 39);
      rightEar.addBox(-1F, 0F, 0F, 1, 4, 3);
      rightEar.setRotationPoint(-5.5F, -8F, -15F);
      rightEar.setTextureSize(128, 128);
      rightEar.mirror = true;
      setRotation(rightEar, 0.1350823F, -0.6108652F, 0F);
      leftTusk1 = new ModelRenderer(this, 79, 39);
      leftTusk1.addBox(0F, 0F, 0F, 2, 8, 2);
      leftTusk1.setRotationPoint(2.4F, -2F, -22.2F);
      leftTusk1.setTextureSize(128, 128);
      leftTusk1.mirror = true;
      setRotation(leftTusk1, -0.1570796F, 0F, -0.0743572F);
      leftTusk2 = new ModelRenderer(this, 79, 39);
      leftTusk2.addBox(0F, 0F, 0F, 2, 6, 2);
      leftTusk2.setRotationPoint(3F, 5.3F, -23.3F);
      leftTusk2.setTextureSize(128, 128);
      leftTusk2.mirror = true;
      setRotation(leftTusk2, -0.4567805F, 0F, -0.0747946F);
      leftTusk3 = new ModelRenderer(this, 79, 39);
      leftTusk3.addBox(0F, 0F, 0F, 2, 5, 2);
      leftTusk3.setRotationPoint(3.4F, 10F, -25.3F);
      leftTusk3.setTextureSize(128, 128);
      leftTusk3.mirror = true;
      setRotation(leftTusk3, -0.9401025F, 0F, -0.0739198F);
      leftTusk4 = new ModelRenderer(this, 79, 39);
      leftTusk4.addBox(0F, 0F, 0F, 2, 5, 2);
      leftTusk4.setRotationPoint(3.6F, 12.6F, -28.5F);
      leftTusk4.setTextureSize(128, 128);
      leftTusk4.mirror = true;
      setRotation(leftTusk4, -1.386246F, 0F, -0.0739198F);
      leftTusk5 = new ModelRenderer(this, 79, 39);
      leftTusk5.addBox(0F, 0F, 0F, 2, 4, 2);
      leftTusk5.setRotationPoint(3.7F, 13.5F, -32.5F);
      leftTusk5.setTextureSize(128, 128);
      leftTusk5.mirror = true;
      setRotation(leftTusk5, -1.832389F, 0F, -0.0739198F);
      rightTusk1 = new ModelRenderer(this, 79, 39);
      rightTusk1.addBox(-2F, 0F, 0F, 2, 8, 2);
      rightTusk1.setRotationPoint(-4.4F, -2F, -22.2F);
      rightTusk1.setTextureSize(128, 128);
      rightTusk1.mirror = true;
      setRotation(rightTusk1, -0.1570796F, 0F, 0.0743572F);
      rightTusk2 = new ModelRenderer(this, 79, 39);
      rightTusk2.addBox(-2F, 0F, 0F, 2, 6, 2);
      rightTusk2.setRotationPoint(-5F, 5.3F, -23.3F);
      rightTusk2.setTextureSize(128, 128);
      rightTusk2.mirror = true;
      setRotation(rightTusk2, -0.4567805F, 0F, 0.0747874F);
      rightTusk3 = new ModelRenderer(this, 79, 39);
      rightTusk3.addBox(-2F, 0F, 0F, 2, 5, 2);
      rightTusk3.setRotationPoint(-5.4F, 10F, -25.3F);
      rightTusk3.setTextureSize(128, 128);
      rightTusk3.mirror = true;
      setRotation(rightTusk3, -0.9401025F, 0F, 0.0747946F);
      rightTusk4 = new ModelRenderer(this, 79, 39);
      rightTusk4.addBox(-2F, 0F, 0F, 2, 5, 2);
      rightTusk4.setRotationPoint(-5.6F, 12.6F, -28.5F);
      rightTusk4.setTextureSize(128, 128);
      rightTusk4.mirror = true;
      setRotation(rightTusk4, -1.386246F, 0F, 0.0747946F);
      rightTusk5 = new ModelRenderer(this, 79, 39);
      rightTusk5.addBox(-2F, 0F, 0F, 2, 4, 2);
      rightTusk5.setRotationPoint(-5.7F, 13.5F, -32.5F);
      rightTusk5.setTextureSize(128, 128);
      rightTusk5.mirror = true;
      setRotation(rightTusk5, -1.832389F, 0F, 0.0739147F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    leftLegFront2.render(f5);
    leftLegFront1.render(f5);
    leftLegFront3.render(f5);
    leftLegFront4.render(f5);
    rightLegFront1.render(f5);
    rightLegFront2.render(f5);
    rightLegFront3.render(f5);
    rightLegFront4.render(f5);
    leftLegBack1.render(f5);
    leftLegBack2.render(f5);
    leftLegBack3.render(f5);
    rightLegBack1.render(f5);
    rightLegBack2.render(f5);
    rightLegBack3.render(f5);
    tail.render(f5);
    bodyBack.render(f5);
    bodyFront.render(f5);
    neck.render(f5);
    head.render(f5);
    headTop.render(f5);
    mouth.render(f5);
    trunk1.render(f5);
    trunk2.render(f5);
    trunk3.render(f5);
    trunk4.render(f5);
    trunk5.render(f5);
    trunk6.render(f5);
    trunk7.render(f5);
    leftEar.render(f5);
    rightEar.render(f5);
    leftTusk1.render(f5);
    leftTusk2.render(f5);
    leftTusk3.render(f5);
    leftTusk4.render(f5);
    leftTusk5.render(f5);
    rightTusk1.render(f5);
    rightTusk2.render(f5);
    rightTusk3.render(f5);
    rightTusk4.render(f5);
    rightTusk5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
