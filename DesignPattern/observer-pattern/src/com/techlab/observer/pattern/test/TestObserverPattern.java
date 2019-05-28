package com.techlab.observer.pattern.test;

import com.techlab.observer.pattern.Account;
import com.techlab.observer.pattern.EmailObserver;
import com.techlab.observer.pattern.SmsObserver;

public class TestObserverPattern {

	public static void main(String args[]) {

		Account acc = new Account("abc@live.com", 1, 5600, "Shekhar");

		acc.addObserver(new SmsObserver());
		acc.addObserver(new EmailObserver());

		acc.withrow(1000);

	}
}
