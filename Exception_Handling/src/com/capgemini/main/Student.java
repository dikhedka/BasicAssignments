package com.capgemini.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.exception_handling.AgeNotWithinRangeException;
import com.capgemini.test.NameNotValidException;

public class Student {

	
	 private int RollNo;
	  private int Age;
	  private String Name;
	  private String Course;
	
	  
	 

	public Student(int rollNo, int age, String name, String course) throws AgeNotWithinRangeException , NameNotValidException{
		
		this.RollNo = rollNo;
		
		
		if(age>15 && age<21) {
			System.out.println("Age is Right");
			 this.Age = age;
		}
			else {
				throw new AgeNotWithinRangeException("age should be between 15 and 21");
			
		}
		
		this.Course = course;
		if(validateLetters(name)) {
			this.Name = name;
			throw new NameNotValidException("Name not valid");
		}
		else {
			System.out.println("NAme valid");
		}
	
		
	
	}
	

	


	public static boolean validateLetters(String txt) throws  NameNotValidException {
		String regx = "[^a-zA-Z]";
		Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(txt);
		return matcher.find();
		
	}

	

	public int getRollNo() {
		return RollNo;
	}


	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age)   {
		
		;
		Age = age;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getCourse() {
		return Course;
	}


	public void setCourse(String course) {
		Course = course;
	}
	  
	
	
	  
	  
	  
}
