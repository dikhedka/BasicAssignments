package com.capgemini.bankapp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.banakapp.dao.imp.BankAccountDaoImp;
import com.capgemini.banakapp.dao.imp.accountNotFoundException;
import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.service.BankAccountService;
import com.cpagemini.bankapp.model.BankAccount;

public class BankAccountServiceImpl implements BankAccountService {
         
	private BankAccountDao bankaccountdao;
	
	
	    
	public BankAccountServiceImpl() {
		bankaccountdao = new BankAccountDaoImp();
	}

	@Override
	public double checkBalance(long accountid) {
		return bankaccountdao.getBalance(accountid);
		
	}

	@Override
	public double withdraw(long accountid, double amount) throws LowBalanceException {
		double balance = bankaccountdao.getBalance(accountid);
		if(balance - amount >=0) {
			balance = balance - amount;
			bankaccountdao.UpDateBalance(accountid, balance);
			return balance;
		}
		else
			throw new  LowBalanceException("You don't have sufficient amount");
	}

	@Override
	public double deposit(long accountid, double amount)  {
		double balance = bankaccountdao.getBalance(accountid);
		 balance = balance + amount;
		 bankaccountdao.UpDateBalance(accountid, balance);
		return balance;
	}

	@Override
	public boolean deleteBankAccount(long accountid) {
		return bankaccountdao.deleteBankAccount(accountid);
	}

	@Override
	public double fundtransfer(long fromaccount, long toaccount, double amount) throws LowBalanceException  {
		double newbalance = withdraw(fromaccount, amount);
		deposit(toaccount, amount);
		return newbalance;
	}

	@Override
	public boolean addNewAccount(BankAccount account) {
		return bankaccountdao.addNewAccount(account);
	}

	@Override
	public List<BankAccount> findAllBankAccounts() {
	  return bankaccountdao.findAllBankAccounts();
	}

	@Override
	public BankAccount searchBankAccount(Long accountId) throws SQLException, accountNotFoundException {
		
		return bankaccountdao.searchBankAccount(accountId);
	}
	
	
	
	
	

}
