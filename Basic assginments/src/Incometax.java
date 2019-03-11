import java.util.Scanner;

public class Incometax{

           public static void main(String[] args){
                
                float incometax;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the amount");
          int annualsalary = sc.nextInt();
        if(annualsalary <=180000) 
        {
         System.out.println("tax amount is nil");
        }
        else if(annualsalary <= 300000)
        {
        System.out.println("tax amount 10%");
        }
        if(annualsalary <=500000)
        {
        System.out.println("tax amount is 20%");
        }
        else if(annualsalary <=10000000)
        {
        System.out.println("tax amount 30%");
        }
}
}