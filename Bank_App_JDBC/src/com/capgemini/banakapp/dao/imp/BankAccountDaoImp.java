package com.capgemini.banakapp.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;

import com.capgemini.bankapp.util.DbUtil;
import com.cpagemini.bankapp.model.BankAccount;

public class BankAccountDaoImp implements BankAccountDao 
{

	@Override
	public double getBalance(long accountid) {
		String query = "SELECT account_balance FROM bankaccount WHERE account_id = " + accountid;
		double balance = 0;

		try (Connection connection = DbUtil.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(query);
				ResultSet resultset = preparedstatement.executeQuery())

		{
			if (resultset.next())
				balance = resultset.getDouble(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return balance;
	}

	@Override
	public void UpDateBalance(long accountid, double newBalance) {
		String query = "UPDATE bankaccount SET ACCOUNT_BALANCE =? WHERE account_id = ?";
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(query)) {
			preparedstatement.setDouble(1, newBalance);
			preparedstatement.setDouble(2, accountid);
			int result = preparedstatement.executeUpdate();
			System.out.println("No. of rows:" + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean deleteBankAccount(long accountid) {
		String query = "DELETE FROM bankaccount WHERE account_id=" + accountid;
		int result;

		try (Connection connection = DbUtil.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(query)) {
			result = preparedstatement.executeUpdate();
			if (result == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean addNewAccount(BankAccount account) {
		String query = "INSERT INTO bankaccount (customer_name,account_type, account_balance)VALUES(?,?,?)";
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, account.getAccountHolderName());
			statement.setString(2, account.getAccountType());
			statement.setDouble(3, account.getAccountBalance());
			int result = statement.executeUpdate();
			if (result == 1)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<BankAccount> findAllBankAccounts() {
		String query = "SELECT * FROM bankaccount";
		List<BankAccount> accounts = new ArrayList<>();

		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				long accountId = result.getLong(1);
				String accountHolderName = result.getString(2);
				String accountType = result.getString(3);
				double accountbalance = result.getDouble(4);
				BankAccount account = new BankAccount(accountId, accountHolderName, accountType, accountbalance);
				accounts.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accounts;

	}

	@Override
	public BankAccount searchBankAccount(Long accountId) throws accountNotFoundException {
			String query = "SELECT * from bankaccount WHERE account_id=" +accountId;
	{
		BankAccount account = new BankAccount();
		try(Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
		
			   ResultSet result = statement.executeQuery())
			   {
				   if(result.next())
				   {
					   long accountId1 = result.getLong(1);
					   String accountHolderName = result.getString(2);
					   String accountType = result.getString(3);
					   double accountbalance = result.getDouble(4);
					    account = new BankAccount( accountId1 , accountHolderName, accountType , accountbalance);
					   // throw new  accountNotFoundException("account not found");
					    
				   }else
		{ throw new  accountNotFoundException("account not found");
		}}
		
					   
			   catch(SQLException e) {
						   e.printStackTrace();
						   
					   }
				   
		return account;
	
	
	
	
	
	}
	}}
