package com.inheritence_assginments;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.inheritence_assginments.Employee;

public class EmployeeTest {
	
	
	 Employee employee;
	
	@BeforeEach
	  public void setUp() {
		 employee = new Employee(101,"John Doe",30000,40000);
	 }

	@Test
	public void testEmployeeObjectIsCreatedWithDefaultConstructor() {
		 Employee employee = new Employee();
		 assertNotNull(employee);
	 }
	
	@Test
	public void testEmployeeObjectIsCreatedWithParameterizedConstructor() {
		 Employee employee = new Employee(101, "john Doe",30000,40000);
		 assertNotNull(employee);
		 assertEquals(101,employee.getEmployeeId());
		 assertEquals("john Doe",employee.getEmployeeName());
		 assertEquals(30000,employee.getBasicSalary());
		 assertEquals(40000,employee.getMedical());
	 }
	
	 @Test
	 public void testWithRightGrossSalary() {
		 
		 assertEquals(85000,employee.grosssalary(),0.01);
	 }
	
	 @Test
	 public void testWithRightNetSalary() {
		 
		 assertEquals(81200,employee.netSalary(),0.01);
	 }

}
