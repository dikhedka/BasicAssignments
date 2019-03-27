package com.inheritence_assginments;

public class Employee {
	
	 private int employeeId;
	 private String employeeName;
	 private double basicSalary;
	 private double medical;
	
	 public Employee() {
		super();
		
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	public double grosssalary()
  {
		double hRA;
		
		double grossSalary;
		hRA = (basicSalary*50)/100;
		
		  grossSalary = basicSalary + hRA + medical;
		 
		 return grossSalary;
	}
	
	public double netSalary() {
		double pF;
		double pT = 200;
		double netsalary;
		pF = (basicSalary*12)/100;
		
		netsalary = grosssalary()-(pT+pF);
		return netsalary;
	}

	
	 
	 
	 
	 

}
