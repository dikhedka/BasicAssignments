package com.inheritence_assginments;

public class BankAccount {
	   
	   private long accountid;
	   private String accountName;
	   private String accounttype;
	   private double accountBalance;
	
	   public BankAccount() {
		super();
		
	}

	public BankAccount(long accountid, String accountName, String accounttype, double accountBalance) {
		super();
		this.accountid = accountid;
		this.accountName = accountName;
		this.accounttype = accounttype;
		this.accountBalance = accountBalance;
	}

	public long getAccountid() {
		return accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double withdraw(double amount) {
		if(accountBalance>= amount)
			 accountBalance = accountBalance-amount;
		else
			System.out.println("You dont have sufficient balance");
		      return accountBalance;
		
	}
	   
	public double deposit(double amount) {
		 accountBalance = accountBalance + amount;
	
		 return accountBalance;
	}
	   

}
