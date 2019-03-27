package com.capgemini.test;



import org.junit.Test;


import com.capgemini.exception_handling.EmployeeCountryInvalidException;
import com.capgemini.exception_handling.EmployeeNameInvalidException;
import com.capgemini.exception_handling.EmployeeTaxIsNotValid;

import com.capgemini.main.TaxCalculator;

public class TaxCalculatorTest {

	@Test(expected= EmployeeNameInvalidException.class)
	public void testEmployeeNameInvalid() throws  EmployeeNameInvalidException, EmployeeCountryInvalidException,EmployeeTaxIsNotValid  {
		TaxCalculator taxcal = new TaxCalculator("", true, 100000);
		
	}
	
	@Test(expected= EmployeeCountryInvalidException.class)
	public void testEmployeeCountryInvalid() throws EmployeeNameInvalidException, EmployeeCountryInvalidException,EmployeeTaxIsNotValid  {
		TaxCalculator taxcal = new TaxCalculator("Divya ", false, 100000);

}
	
	@Test(expected = EmployeeTaxIsNotValid.class)
	public void testEmployeeTaxIsNotValid() throws EmployeeNameInvalidException, EmployeeCountryInvalidException,EmployeeTaxIsNotValid  {
		TaxCalculator taxcal = new TaxCalculator("Divya", true,5000 );
		taxcal.calculateTax(5000);

}

}
