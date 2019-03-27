package com.capgemini.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.banakapp.dao.imp.accountNotFoundException;
import com.cpagemini.bankapp.model.BankAccount;

public interface BankAccountDao {
	
	
	public double getBalance(long accountid);
	public void UpDateBalance(long accountid,double newBalance);
	public boolean deleteBankAccount(long accountid);
	public boolean addNewAccount(BankAccount account);
	public List<BankAccount> findAllBankAccounts(); 
	 public BankAccount searchBankAccount(Long accountId) throws SQLException, accountNotFoundException;
}
