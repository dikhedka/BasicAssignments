package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exception_handling.InvalidDayException;
import com.capgemini.exception_handling.InvalidMonthException;
import com.capgemini.main.MyDate;

public class MyDateTest {

	@Test(expected = InvalidDayException.class)
	public void testDateWithWrongInput() throws InvalidDayException , InvalidMonthException{
		MyDate date = new MyDate(45,10,2004);
	}
	

	@Test
	public void testDateWithRightInput() throws InvalidDayException , InvalidMonthException{
		MyDate date = new MyDate(15,10,2008);
	}
	
	

	@Test(expected = InvalidMonthException.class)
	public void testMonthWithWrongInput() throws InvalidDayException , InvalidMonthException{
		MyDate date = new MyDate(5,21,2004);
	}
	
	

	@Test
	public void testMonthWithRightInput() throws InvalidDayException , InvalidMonthException{
		MyDate date = new MyDate(5,11,2004);
	}
	
	


}
