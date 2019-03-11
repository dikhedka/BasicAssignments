public class Complexnumber
   {
     private double real;
     private double imaginery;
     public void setcomplexnumber(double real , double imaginery)
       {
          this.real = real;
          this.imaginery = imaginery;
       }
    public void display()
       {
         System.out.println(real+ "+ i" +imaginery);
       }
    public Complexnumber sumofComplex(Complexnumber number)
       {
         Complexnumber c1 = new Complexnumber();
         c1.real=this.real+number.real;
         c1.imaginery=this.imaginery+number.imaginery;
         return c1;
      }
   } 