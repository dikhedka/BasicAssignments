package com.inheritence_assginments;

public class Manager extends Employee {
	
	private double PetrolAllowance;
	private double FoodAllowance;
	private double OtherAllowance;
	
	

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		
	}

	

	public Manager() {
		
	}



	@Override
	public double grosssalary() {
		PetrolAllowance = (8*getBasicSalary())/100;
		FoodAllowance = (13*getBasicSalary())/100;
		OtherAllowance = (3*getBasicSalary())/100;
		double ManagerGrossSalary = super.grosssalary() + PetrolAllowance + FoodAllowance + OtherAllowance;
		return  ManagerGrossSalary ;
	}
	
	
	public double Netsalary() {
		
		double PT = 200;
		double PF = (getBasicSalary()*12)/100;
		double ManagerNetSalary =  grosssalary() - (PT + PF);
		return  ManagerNetSalary ;
	}
	
	
	
	

	
	
	
	
	

}
