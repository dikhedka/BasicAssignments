package com.capgemini.exception_handling;

public class Sample_exceptionhandling {
	
	public static class TestThrow1{  
		    static void validate(int age){  
		     if(age<18)  
		      throw new ArithmeticException("not valid");  
		     else  
		      System.out.println("welcome to vote");  
		   }  
		   
		    public static void main(String[] args) {
		    	validate(12);
				  System.out.println("WE did the code");
			}
		}  

}
