import java.util.Scanner;

public class Array_Number {
    public static void main(String[] args) {
    	int a[]  = {3 , 25 , 26 , 48 , 85 , 12 , 74 , 1 , 2 , 45 , 9 }; 
    	
    	int num;
    Scanner sc = new Scanner(System.in);
    	    System.out.println("Array is");
    	    num = sc.nextInt();
    	
    	 // System.out.println("Enter the number");
    	  
    	for( int i=0; i<a.length; i++) {
    	    if(a[i]== num) {
    	        System.out.println ( "Element found at index "+i);
    	        break; }
    	        {
    	      //  else
    	        	System.out.println("not found");
    	        }
    	    }
    	}

	}

