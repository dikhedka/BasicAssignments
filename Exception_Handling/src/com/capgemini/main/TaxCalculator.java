package com.capgemini.main;

import com.capgemini.exception_handling.EmployeeCountryInvalidException;
import com.capgemini.exception_handling.EmployeeNameInvalidException;
import com.capgemini.exception_handling.EmployeeTaxIsNotValid;

public class TaxCalculator {

	private String empName;
	private boolean isIndian;
	private double empSal;

	public TaxCalculator(String empName, boolean isIndian, double empSal)
			throws EmployeeNameInvalidException, EmployeeCountryInvalidException {
		if (empName != null && !empName.isEmpty()) {
			this.empName = empName;
		} else {
			throw new EmployeeNameInvalidException("name is not valid");
		}

		if (!isIndian)
			throw new EmployeeCountryInvalidException("Country is not valid exception");

		else
			this.isIndian = isIndian;
		this.empSal = empSal;
	}

	public double calculateTax(double empSal) throws EmployeeTaxIsNotValid {

		if (empSal >= 100000)
			return (empSal * 0.08);
		else if (empSal >= 50000 && empSal < 100000)
			return (empSal * 0.06);
		else if (empSal >= 30000 && empSal < 50000)
			return (empSal * 0.05);
		else if (empSal >= 10000 && empSal < 30000)
			return (empSal * 0.04);
		else
			throw new EmployeeTaxIsNotValid("Tax is not valid exception");

	}

}
