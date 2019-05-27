package com.techlab.strategy;

public class ArmStrongNumber implements IStrategy {

	@Override
	public int doOperation(int number) {
		int c = 0, a, temp;
		temp = number;
		while (number > 0) {
			a = number % 10;
			number = number / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			return 1;
		if (temp != c)
			return 0;
		return 0;
	}

}
