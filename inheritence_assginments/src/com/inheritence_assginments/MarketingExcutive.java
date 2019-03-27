package com.inheritence_assginments;

public class MarketingExcutive extends Employee{

	    private double Kilometer = 100;
	    private double TourAllowance;
	    private double TelephoneAllowance;
		
	    
	    public MarketingExcutive() {
			super();
			
		}
		public MarketingExcutive(int employeeId, String employeeName, double basicSalary, double medical) {
			super(employeeId, employeeName, basicSalary, medical);
			
		}
		
		@Override
		public double grosssalary() {
			TourAllowance = 100*5;
			TelephoneAllowance = 1500 ;
			double MarketingExcutiveGrossSalary = super.grosssalary() + TourAllowance + TelephoneAllowance;
			return  MarketingExcutiveGrossSalary ;
		}
		
		
		
		public double Netsalary() {
			
			double PT = 200;
			double PF = (getBasicSalary()*12)/100;
			double MarketingExcutiveNetSalary =  grosssalary() - (PT + PF);
			return  MarketingExcutiveNetSalary ;
		}
		
	    
	    
	    
	    
	    
}
