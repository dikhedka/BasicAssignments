

public class Armstrongnumber1
{ 
             public static void main (String [] args) 
             { 
                  
                    for (int k = 100 ; k <= 1000 ; k++) 
                     { 
                                int number = k; 
                                int d = 0; 
                                int s = 0;

                                while (number > 0) 
                                 { 
                                             d = number % 10; 
                                             s = s + (d * d * d); 
                                             number1 = number / 10; 
                                 } 
                                 if (k == s) 
                                  { 
                                             System.out.println (k + ” is Armstrong number”); 
                                   } 
                      } 
            }  
} 