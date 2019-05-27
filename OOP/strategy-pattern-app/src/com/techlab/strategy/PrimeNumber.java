package com.techlab.strategy;

public class PrimeNumber implements IStrategy {

	@Override
	public int doOperation(int number) {
		int i, m = 0, flag = 0;
		m = number / 2;
		if (number == 0 || number == 1) {
			return 0;
		} else {
			for (i = 2; i <= m; i++) {
				if (number % i == 0) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			return 1;
		}
		return 0;
	}
}