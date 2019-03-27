package main;

import static org.junit.Assert.*;
import org.junit.Test;
import main.Triangle;

public class TriangleTest
{
    @Test
    public void testforTriangleWhetherItIsRightAngled()
     {
         Triangle t1 = new Triangle();
         assertTrue(t1.isRight(5,4,8));
     }

     @Test
    public void testforTriangleWhetherItIsNotRightAngled()
     {
         Triangle t1 = new Triangle();
         assertFalse(t1.isRight(2,3,4));
     }

     @Test
    public void testforTriangleWhetherItIsIsScaleneAngled()
     {
         Triangle t1 = new Triangle();
         assertTrue(t1.isScalene(2,5,3));
     }

    @Test
    public void testforTriangleWhetherItIsNotScaleneAngled()
     {
         Triangle t1 = new Triangle();
         assertFalse(t1.isScalene(4,3,2));
     }
 
     @Test
    public void testforTriangleWhetherItIsIsoscelesAngled()
     {
         Triangle t1 = new Triangle();
         assertTrue(t1.isIsosceles(4,2,6));
     }

     @Test
    public void testforTriangleWhetherItIsNotIsoscelesAngled()
     {
         Triangle t1 = new Triangle();
         assertFalse(t1.isIsosceles(5,4,8));
     }
     

      @Test
    public void testforTriangleWhetherItIsEquilateralAngled()
     {
         Triangle t1 = new Triangle();
         assertTrue(t1.isEquilateral(2,5,8));
     }

      @Test
    public void testforTriangleWhetherItIsNotEquilateralAngled()
     {
         Triangle t1 = new Triangle();
         assertFalse(t1.isEquilateral(5,4,8));
     }
}