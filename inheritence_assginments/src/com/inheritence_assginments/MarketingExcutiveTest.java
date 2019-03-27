package com.inheritence_assginments;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarketingExcutiveTest {
	
	MarketingExcutive marketing;
	
	@BeforeEach
	  public void setUp() {
		 marketing = new MarketingExcutive(108,"Neha",60000,5000);
	 }
	
	
	
	@Test
	public void testEmployeeObjectIsCreatedWithDefaultConstructor() {
		 MarketingExcutive marketing = new MarketingExcutive();
		 assertNotNull(marketing);
	 }
	
	 @Test
	 public void testWithRightGrossSalary() {
		 
		 assertEquals(97000,marketing.grosssalary(),0.01);
	 }
     
	 @Test
	 public void testWithRightNetSalary() {
		 
		 assertEquals(89600,marketing. Netsalary(),0.01);
	 }
     

	

}
