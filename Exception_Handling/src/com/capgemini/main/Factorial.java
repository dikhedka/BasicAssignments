package com.capgemini.main;
import com.capgemini.exception_handling.*;
public class Factorial {
	private int number;

	public Factorial(int number) {
		super();
		this.number = number;
	}
	
	public long getFactorial(int number) throws InvalidInputException, FactorialException {
		long factorial = 1;
		if(number>2) {
			while(number!=1) {
				factorial = number * factorial;
				number--;
			}
			if(factorial>Integer.MAX_VALUE || factorial < Integer.MAX_VALUE) {
				throw new FactorialException("factorial is high range");
			}
			return factorial;
		}
		else
			throw new InvalidInputException("number should be greater than 2");
		
		
		
	}

}
