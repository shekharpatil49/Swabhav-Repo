package com.techlab.account;

public class SavingAccount extends Account {

	public SavingAccount(int account_no, String name, double balance) {
		super(account_no, name, balance);
	}

	double bal = getBalance();

	@Override
	public void withdraw(double amount) {
		if (bal - amount > 500) {
			bal -= amount;
			return;
		}
		if (bal - amount < 500) {
			System.out.println("You dont have sufficient balanace");
			return;
		}

	}

}
