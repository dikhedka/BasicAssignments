import java.util.Scanner;

public class UserPass {
	public static void main(String[] args) {
		final String password = "12345";
		final String username ="Divya";
		
		for (int Attempts = 0; Attempts < 3; Attempts++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String Username = sc.nextLine();
			System.out.println("Enter your password");
                        String Password = sc.nextLine();
			
			if(!(password.equals(password)) && (!(username.equals(username))))
                         {
                             System.out.println("Contact admin");
                         }
                         else
                         {
                              System.out.println("Welcome user");
                              break;
                         }
                              
		}
	}

}
