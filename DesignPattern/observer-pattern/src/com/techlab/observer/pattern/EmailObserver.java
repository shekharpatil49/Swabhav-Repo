package com.techlab.observer.pattern;

public class EmailObserver implements IBalanceChangeObserver{

	@Override
	public void balanceChange(Account account) {

		System.out.println("EmailObserver get notification " +account.getBalance());
	}

}
