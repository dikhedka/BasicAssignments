package com.inheritence_assginments;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Before;
import org.junit.Test;

import com.inheritence_assginments.BankAccount;

public class BankAccountTest {
	
	
	 private BankAccount account;
	 
	 @Before
	  public void setUp() {
		 account = new BankAccount(101,"John Doe","SAVING",35000);
	 }
		
	
	 
	 @Test
	 public void testBankAccountObjectIsCreatedWithDefaultConstructor() {
		 BankAccount account = new BankAccount();
		 
		assertNotNull(account);
	 }
     
	 
	



	@Test
	 public void testBankAccountObjectIsCreatedWithParameterizedConstructor() {
		 BankAccount account = new BankAccount(101, "john Doe", "SAVING",45000.0);
		 assertNotNull(account);
		 assertEquals(101,account.getAccountid());
		 assertEquals("john Doe",account.getAccountName());
		 assertEquals("SAVING",account.getAccounttype());
		 assertEquals(45000.0,account.getAccountBalance(),0.01);
	 }
	



	@Test
	 public void testbankAccountCurrentBalance() 
	 {
         assertEquals(35000,account.getAccountBalance(),0.01);
	 }
	 
	 @Test
	 public void testWithDrawWithSufficientFund() {
		 account.withdraw(5000);
		 assertEquals(30000,account.getAccountBalance(),0.01);
	 }
	 
	 @Test
	 public void testWithDrawWithInSufficientFund() {
		 account.withdraw(45000);
		 assertEquals(35000,account.getAccountBalance(),0.01);
	 }
	 
	 @Test
	 public void testDeposit() {
		 account.deposit(45000);
		 assertEquals(40000,account.getAccountBalance(),0.01);
	 }
	 
}
