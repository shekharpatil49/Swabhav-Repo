package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public class TestAccount {

	public static void main(String[] args) {
		SavingAccount account = new SavingAccount(1, "Shekhar", 5000);
		account.deposit(500);
		account.withdraw(3000);
		printDetails(account);
		CurrentAccount acc = new CurrentAccount(2, "Ram", 5000);
		acc.deposit(500);
		acc.withdraw(8000);
		printDetails(acc);

	}

	public static void printDetails(Account account) {
		System.out.println("Acconut_N0 = " + "" + account.getAccount_no());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());
	}

}
