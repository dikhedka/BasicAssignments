public class Distance
   {
     private int feet;
     private double inches;
     public void setdistancenumber(int feet , double inches)
       {
          this.feet = feet;
          this.inches = inches;
       }
    public void display()
       {
         System.out.println(feet+ "feet" +inches+ "inches");
       }
    public Distance sumofDistance(Distance number)
       {
         Distance d1 = new Distance();
         d1.feet=this.feet+number.feet;
         d1.inches=this.inches+number.inches;
         if(d1.inches >= 12.0)
           {
              d1.inches = d1.inches-12;
              d1.feet = d1.feet+1;
            }

         return d1;
      }
   } 