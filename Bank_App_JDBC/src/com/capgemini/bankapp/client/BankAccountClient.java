package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.capgemini.banakapp.dao.imp.accountNotFoundException;
import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;
import com.cpagemini.bankapp.model.BankAccount;

public class BankAccountClient {
	public static void main(String[] args) throws IOException, LowBalanceException, SQLException, accountNotFoundException {
		int choice;
		long accountId;
		String accountHolderName;
		String accountType;
		double accountBalance;
		double amount = 0;
		long fromaccount = 0;
		long toaccount = 0;

		BankAccountService accountservice = new BankAccountServiceImpl();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				System.out.println("1. Add New BankAccount\n2. Withdraw\n3. Deposit\n4. Fund Transfer");
				System.out.println("5. Delete BankAccount\n6. Display All BankAccount Details");
				System.out.println("7. Search BankAccount\n8. Check Balance\n9. Exit\n");

				System.out.print("Please enter your choice = ");
				choice = Integer.parseInt(reader.readLine());

				switch (choice) {

				case 1:
					System.out.println("Enter account holder name: ");
					accountHolderName = reader.readLine();
					System.out.println("Enter account type: ");
					accountType = reader.readLine();
					System.out.println("Enter account balance: ");
					accountBalance = Double.parseDouble(reader.readLine());
					BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);
					if (accountservice.addNewAccount(account))
						System.out.println("Account created successfully...\n");
					else
						System.out.println("failed to create new account...\n");
					break;

				case 2:
					System.out.println("Enter the account number");
					accountId = Long.parseLong(reader.readLine());
					System.out.println("Enter the withdraw amount");
					amount = Double.parseDouble(reader.readLine());
					accountBalance = accountservice.withdraw(accountId, amount);
					System.out.println("Money has been withdrawn");
					break;

				case 3:
					System.out.println("Enter the account number");
					accountId = Long.parseLong(reader.readLine());
					System.out.println("Enter the amount");
					amount = Double.parseDouble(reader.readLine());
					accountBalance = accountservice.deposit(accountId, amount);
					System.out.println("Amount has been deposited");
					break;

				case 4:
					System.out.println("Enter the bank account number from where to transfer fund");
					accountId = Long.parseLong(reader.readLine());
					System.out.println("Enter the bank account number to whom to transfer fund");
					 long accountId1 = Long.parseLong(reader.readLine());
					System.out.println("Enter the amount");
					amount = Double.parseDouble(reader.readLine());
					accountBalance = accountservice.fundtransfer(accountId, accountId1, amount);
					System.out.println("Money is been transfered");
					break;
					
				case 5:
					System.out.println("Enter the account id:");
					accountId = Long.parseLong(reader.readLine());
					accountservice.deleteBankAccount(accountId);
					
				case 6:
					List<BankAccount> accounts = accountservice.findAllBankAccounts();
					for (BankAccount bankAccount : accounts) {
						System.out.println(bankAccount);
					}
					
				case 7 :
					System.out.println("Enter the account id");
					accountId = Long.parseLong(reader.readLine());
					//accountservice.searchBankAccount(accountId);
					System.out.println(accountservice.searchBankAccount(accountId));
					break;
				case 8:
					System.out.println("Enter the account number");
					accountId = Long.parseLong(reader.readLine());
					accountBalance = accountservice.checkBalance(accountId);
					System.out.println(accountBalance);
					

				case 9:
					System.out.println("Thanks for banking with us.");
					System.exit(0);

				}
			}
		}
	}
}
