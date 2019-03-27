package com.capgemini.main;

import com.capgemini.exception_handling.InvalidDayException;
import com.capgemini.exception_handling.InvalidMonthException;

public class MyDate 
{
	
	private int day;
	private int month;
	private int Year;
	
	
	public MyDate(int day, int month, int year) throws InvalidDayException ,InvalidMonthException{
		
		this.Year =Year;
		if(day>1 && day<31)
		{
			System.out.println("Valid Date");
			this.day = day;
		}
		else 
			throw new InvalidDayException();
		
		if(month>=1 && month <=12)
		{
			this.month = month;
		}
		
		else
			throw new InvalidMonthException("month should be between 1 and 12"); 
		
		
	}
	
	public static boolean isLeapyear(int year)
	{
		if((year%4 == 0 && year%100 !=0) || year%400==0)
		{
			return true;
		}
		else
		return false;
		
	}

	public static boolean isDayValid(int day ,int month, int year)
	{
		if(month == 4 || month == 6 || month == 9 || month == 11)
			if(day<=30 && day >=1)
				return true;
			else
				return false;
		
		if(month == 1 || month == 3 || month == 5 || month == 7|| month == 8 || month ==10 ||month ==12)
			if(day<=31 && day>=1)
				return true;
			else
				return false;
		
		else
			if(isLeapyear(year))
				if(day<=29 && day>=1)
					return true;
				else
					return false;
			else
				if(day == 28 && day >=1)
					return true;
				else
					return false;
				
	}
}
	
	



