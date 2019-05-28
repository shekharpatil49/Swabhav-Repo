package com.techlab.simplefactory;

public class AutomobileFactory {
	
	private AutoType type; 
	private static AutomobileFactory factory;
	private AutomobileFactory() { 
		
	}
	public static AutomobileFactory getInstance() {
		if(factory==null)
			return factory = new AutomobileFactory();
		return factory;
		
	}
	public IAutomobile make(AutoType type) {
		
		if(type==type.BMW)
		return new BMW();
		
		if(type==type.AUDI)
			return new Audi();
		if(type==type.TESLA)
			return new Tesla();
		return null;
		
	}

}
