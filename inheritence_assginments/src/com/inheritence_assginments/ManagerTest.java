package com.inheritence_assginments;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {

	 Manager manager;
		
	 @BeforeEach
	  public void setUp() {
		 manager = new Manager(105,"Rohit",20000,50000);
	 }
        
		
		@Test
		public void testEmployeeObjectIsCreatedWithDefaultConstructor() {
			 Manager manager = new Manager();
			 assertNotNull(manager);
		 }
		
		 @Test
		 public void testWithRightGrossSalary() {
			 
			 assertEquals(84800,manager.grosssalary(),0.01);
		 }
         
		 @Test
		 public void testWithRightNetSalary() {
			 
			 assertEquals(82200,manager. Netsalary(),0.01);
		 }
         
		
		
}
