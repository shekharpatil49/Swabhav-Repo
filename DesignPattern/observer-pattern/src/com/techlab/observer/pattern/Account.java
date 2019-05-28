package com.techlab.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String email;

	private int account_no;
	private String name;
	private double balance;
	private List<IBalanceChangeObserver> observers = new ArrayList();

	public Account(String email, int account_no, double balance, String name) {
		this.email = email;
		this.account_no = account_no;
		this.balance = balance;
		this.name = name;
	}

	public void deposite(int amount) {

		this.balance = this.balance + amount;
		notifyObservers();

	}

	public void withrow(int amount) {
		this.balance = this.balance - amount;
		notifyObservers();

	}

	public void addObserver(IBalanceChangeObserver ib) {
		observers.add(ib);
	}

	public String getEmail() {
		return email;
	}

	public int getAccount_no() {
		return account_no;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public List<IBalanceChangeObserver> getObservers() {
		return observers;
	}

	public void notifyObservers() {
		for (IBalanceChangeObserver st : observers) {
			st.balanceChange(this);
		}

	}

}
