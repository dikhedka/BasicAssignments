package com.inheritence_assginments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingAccountTest {

	CurrentAccount currentAccount;
	//private Object currentaccount;

	@BeforeEach
	public void setup() {
		currentAccount  = new CurrentAccount(101,"Divya",24000,20000);
	}
	
	@Test
	public void testCurrentAccountIsCreatedWithDefultConstructor() {
		CurrentAccount currentAccount = new CurrentAccount();
		assertNotNull(currentAccount);
	}
	
	@Test
	public void testCurrentBankAccountIsCreatedWithParameter() {
		assertEquals(101,currentAccount.getAccountid());
		assertEquals("Divya",currentAccount.getAccountName());
		assertEquals(24000.0,currentAccount.getAccountBalance(),0.01);
		assertEquals(20000.0,currentAccount.getDebitLimit(),0.01);
		
	}
	
	@Test
	public void testWithdrawAmountWithCurrentBalance() {
		currentAccount.withdraw(24000);
		assertEquals(0,currentAccount.getAccountBalance(),0.01);
	}
	
	@Test
	public void testWithdraAmountwWithoutExtendingDebitLimit() {
		currentAccount.withdraw(34000);
		assertEquals(0,currentAccount.getAccountBalance(),0.01);
	}
	
	

}
