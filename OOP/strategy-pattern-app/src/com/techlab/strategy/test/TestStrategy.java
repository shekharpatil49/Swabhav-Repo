package com.techlab.strategy.test;

import com.techlab.strategy.ArmStrongNumber;
import com.techlab.strategy.Context;
import com.techlab.strategy.PrimeNumber;

public class TestStrategy {

	public static void main(String[] args) {

		Context context = new Context(new PrimeNumber());
		System.out.println(context.executeStrategy(10));
		context = new Context(new ArmStrongNumber());
		System.out.println(context.executeStrategy(371));
	}

}
