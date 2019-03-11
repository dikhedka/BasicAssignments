import java.util.*;
public class TimeTest
{
     public static void main(String[] args)
         {
            Scanner sc = new Scanner(System.in);
              int hours;
	      int minutes;  
            System.out.println("Enter the hours");
            hours = sc.nextInt();
            System.out.println("Enter the minutes");
            minutes = sc.nextInt();
            Time t2 = new Time();
             t2.setTimenumber(hours,minutes);
             t2.display();
           System.out.println("Enter the hours");
           hours = sc.nextInt();
           System.out.println("Enter the minutes");
             minutes = sc.nextInt();
          Time t3 = new Time();
	 t3.setTimenumber(hours,minutes);
             t3.display();
		 Time t1 = new Time();
                  t1 = t2.sumofTime(t3);
                   t1.display();
        }
}