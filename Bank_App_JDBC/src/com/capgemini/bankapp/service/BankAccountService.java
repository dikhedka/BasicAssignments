package com.capgemini.bankapp.service;



import java.sql.SQLException;
import java.util.List;

import com.capgemini.banakapp.dao.imp.accountNotFoundException;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.cpagemini.bankapp.model.BankAccount;

public interface BankAccountService {
	
	  public double checkBalance(long accountid);
	  
	  public double deposit(long accountid,double amount);
	  public boolean deleteBankAccount(long accountid);
	  public double fundtransfer(long fromaccount , long toaccount , double amount) throws LowBalanceException;
	  public boolean addNewAccount(BankAccount account);
	  List<BankAccount> findAllBankAccounts();

	double withdraw(long accountid, double amount) throws LowBalanceException;
		  
	 public BankAccount searchBankAccount(Long accountId) throws SQLException, accountNotFoundException;

}
