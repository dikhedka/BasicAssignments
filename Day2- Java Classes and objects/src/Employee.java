public class Employee 
    {
          private int EmployeeId;
          private String Employeename;
          private double EmployeeMonthlyBasic;
          private int  medical = 1250;
          private int conveyance = 800;
          private double grosssalary;
          private double pf;
          private double hra;
          private double esic;
          private proftax;

    	public Employee(int EmployeeId, String Employeename, double EmployeeMonthlyBasic)
     	{
         	this.EmployeeId=EmployeeId;
         	this.Employeename=Employeename;
         	this.EmployeeMonthlyBasic=EmployeeMonthlyBasic;
     	}
    
   	 public void display()
    	{
        	System.out.println("Employee Id is " + EmployeeId);
        	System.out.println("Employee name is " + Employeename);
        	System.out.println("Employee monthly salary is " + EmployeeMonthlyBasic);
     	}
  
   	public double getAnnualBasic()
   	{  
     		System.out.println("Annual salary is" + (12*EmployeeMonthlyBasic));
      		return (12*EmployeeMonthlyBasic);
  	 }

   	public double getMonthlyGrossSalary()
   	{
     		hra=(EmployeeMonthlyBasic*50)/100;
     		grosssalary=(EmployeeMonthlyBasic + hra + medical + conveyance);
     		System.out.println("Monthly Gross Salary is:" + grosssalary);
     		return grosssalary;
   	} 
   
  	public double getAnnualGrossSalary()
  	{
   		System.out.println("Annual gross salary is" + (12*grosssalary));
     		return (12*grosssalary);
	}
        public double getMonthlyDeductions()
       {
          pf=(EmployeeMonthlyBasic*10)/100;
          esic=(EmployeeMonthlyBasic*4.75)/100;
   
}