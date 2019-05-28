package com.techlab.simplefactory.unittest;


import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import com.techlab.simplefactory.AutoType;
import com.techlab.simplefactory.AutomobileFactory;
import com.techlab.simplefactory.IAutomobile;

public class UnitTestAutomobileFactory {
	
	@Test
	public void checkWhichInstanceIsCreated() {
		AutoType type = null;
		AutomobileFactory factory = AutomobileFactory.getInstance();
		IAutomobile auto = factory.make(type.AUDI);
		String expected="AUDi";
		assertEquals(expected.toLowerCase(), auto.getClass().getSimpleName().toLowerCase());
		
	}

}
