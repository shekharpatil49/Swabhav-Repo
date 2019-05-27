package com.techlab.strategy;

public class Context {
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int number) {
		return strategy.doOperation(number);
	}
}
