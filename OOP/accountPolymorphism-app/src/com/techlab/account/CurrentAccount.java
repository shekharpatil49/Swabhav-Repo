package com.techlab.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int account_no, String name, double balance) {
		super(account_no, name, balance);
	}

	double balance = getBalance();

	@Override
	public void withdraw(double amount) {
		if (balance - amount > -2000) {
			balance -= amount;
			return;
		}
		if (balance - amount < -2000) {
			System.out.println("You dont have sufficient balanace");
			return;
		}

	}
}
