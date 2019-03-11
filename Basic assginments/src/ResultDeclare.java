import java.util.Scanner;

public class ResultDeclare {
        public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			  int English;
			  int Biology;
			  int Maths;
			  
			 System.out.println(" Enter the marks of English");
			 English = sc.nextInt();
			 System.out.println(" Enter the marks of Biology");
			 Biology = sc.nextInt();
			 System.out.println(" Enter the marks of Maths");
			 Maths = sc.nextInt();
			  
			 	 if((English>=60) && (Biology>=60) && (Maths>=60))
			 {
				 System.out.println("Passed");
			 }
			 else {
				 System.out.println("failed");
			 }
			 if((English > 60 && Biology >60 && Maths < 60) || (English > 60 && Maths > 60 && Biology < 60) || (Maths > 60 && Biology > 60 && English < 60))
			 {
				 System.out.println("Promoted");
			 }
				 

		}
}
