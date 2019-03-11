public class RectangleTest
     {
         public static void main(String[] args)
            {
                  
                  Rectangle r = new Rectangle(56,89);
                   r.display();
                   r.area();
                   r.perimeter();
                 Rectangle r1 = new Rectangle(25,56);
                   r1.display();
                   r1.area();
                   r1.perimeter();

              if(r.area()==r1.area())
                 {
                    System.out.println("Area is equal");
                 }
              else
                 {
                    System.out.println("Arear is not equal");
                 }
            }
      }
                     
                