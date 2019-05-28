package com.techlab.simplefactory.test;

import com.techlab.simplefactory.AutoType;
import com.techlab.simplefactory.AutomobileFactory;
import com.techlab.simplefactory.IAutomobile;

public class TestAutomobileFactory {

	public static void main(String[] args) {
		AutoType type = null;
		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAutomobile auto = factory.make(type.TESLA);
		auto.start();
		auto.stop();
	}

}
