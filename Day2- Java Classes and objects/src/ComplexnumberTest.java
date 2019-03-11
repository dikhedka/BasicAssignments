public class ComplexnumberTest
  {
     public static void main(String[] args)
      {
     Complexnumber c2 = new Complexnumber();
       c2.setcomplexnumber(3,5);
       c2.display();
     Complexnumber c3 = new Complexnumber();
        c3.setcomplexnumber(5,6);
        c3.display();
     Complexnumber c4 = new Complexnumber();
        c4 = c2.sumofComplex(c3);
        c4.display();
}
}