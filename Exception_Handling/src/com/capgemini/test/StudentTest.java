package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exception_handling.AgeNotWithinRangeException;

import com.capgemini.main.Student;

public class StudentTest {
	
	

	@Test(expected= AgeNotWithinRangeException.class)
	public void testStudentAgeWithMoreThenMention() throws AgeNotWithinRangeException ,NameNotValidException {
		Student student = new Student(101,26,"Divya","be");
		
	}
	
	@Test(expected= AgeNotWithinRangeException.class)
	public void testStudentAgeWithLessThenMention() throws AgeNotWithinRangeException ,NameNotValidException {
		Student student = new Student(101,10,"Divya","be");

}
	
	@Test(expected = NameNotValidException.class)
	public void testNameWithSymbols() throws AgeNotWithinRangeException ,  NameNotValidException {
		Student student = new Student(101,18,"k@","be");

}
}