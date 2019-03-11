
import java.util.*;
public class DistanceTest
{
     public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);
              int feet;
	      double inches;  
            System.out.println("Enter the feet");
            feet = sc.nextInt();
            System.out.println("Enter the inches");
            inches = sc.nextDouble();
            Distance d2 = new Distance();
             d2.setdistancenumber(feet,inches);
             d2.display();
           System.out.println("Enter the feet");
            feet = sc.nextInt();
           System.out.println("Enter the inches");
             inches = sc.nextDouble();
          Distance d3 = new Distance();
	 d3.setdistancenumber(feet,inches);
             d3.display();
		 Distance d1 = new Distance();
                  d1 = d2.sumofDistance(d3);
                   d1.display();
        }
}
