public class Rectangle
    {
      private double length;
      private double breath;

     public Rectangle(double length, double breath)
       {
         this.length=length;
         this.breath=breath;
       }
     public void display()
       {
          System.out.println("Length of rectangle is" + length);
          System.out.println("Breath of rectangle is" + breath);
       }
     public double area()
       {
         System.out.println(" Area of rectangle is" + (length*breath));
         return (length*breath);
       }
     public double perimeter()
       {
         System.out.println("Perimeter of rectangle is" + (2*(length+breath)));
          return (2*(length+breath));
       }
    }