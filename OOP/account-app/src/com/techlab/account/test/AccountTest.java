package com.techlab.account.test;

import com.techlab.account.*;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(1, "Shekhar", 1000);

		Account account2 = new Account(1, "Sham");

		printDetails(account1);
		printDetails(account2);
		account1.deposite(500);
		account1.deposite(500);
		account1.deposite(500);

		Account[] account = new Account[3];
		account[0] = new Account(4, "Yash", 9000);
		account[1] = new Account(5, "ash", 2000);
		account[2] = new Account(6, "Mahesh", 5000);

		Account maximumBalanceAccount = compare(account);
		System.out.println(maximumBalanceAccount);
		trasaction(account2);
	}

	public static void printDetails(Account account) {
		System.out.println("Acconut_N0 = " + "" + account.getAccountNO());
		System.out.println("Name = " + account.getName());
		System.out.println("Balance = " + account.getBalance());
	}

	public static Account compare(Account[] account) {
		double large = account[0].getBalance();
		int number = 0;
		for (int index = 0; index < account.length; index++) {
			number = position(account, large, number, index);
		}
		return account[number];

	}

	public static void trasaction(Account account) {
		System.out.println("No of Trascation done" + " on" + account + "is = " + account.NoOfTransactionDone());
	}

	private static int position(Account[] account, double large, int number, int index) {
		if (account[index].getBalance() >= large)
			number = index;
		return number;
	}

}
