package com.techlab.account;

public abstract class Account {

	private int account_no;
	private String name;
	protected double balance;

	public Account(int account_no, String name, double balance) {
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;

	}

	public void deposit(double deposite) {

		this.balance += deposite;

	}

	abstract public void withdraw(double amount);

	public int getAccount_no() {
		return account_no;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double amount) {
		this.balance=amount;
	}

}
