package com.techlab.account.exception;

public class Account {

	private int account_no;
	private String name;
	private double balance;
	
	

	public Account(int account_no, String name, double balance) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
		
	}

	public String getName() {
		return name;
	}

	public void withrow(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
			return;
		}
		if (balance - amount < 500) {
			throw new InsufficentFundException(this);
		}
	}
}
