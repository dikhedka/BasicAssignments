import com.sun.java_cup.internal.runtime.Scanner;

public class ArmstrongNumber {
       public static void main(String[] args) {
    	   int number1 =489;
    	   int number2 = number1;
    	   int remainder;
    	   int result=0;
    	     while (number2 != 0) {
    	    	 remainder = number2 % 10;
    	     result += Math.pow(remainder , 3);
    	     number2 /= 10;
    	     }
    	     if (result == number1)
              System.out.println(number1+  "number is armstrong");
    	     else
    	    	 System.out.println(number1+ "number is not armstrong");
    	    	 
	
}
}
