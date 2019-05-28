package com.techlab.observer.pattern;

public class SmsObserver implements IBalanceChangeObserver {

	@Override
	public void balanceChange(Account account) {

		System.out.println("SmsObserver get notification "+account.getBalance());
	}

}
