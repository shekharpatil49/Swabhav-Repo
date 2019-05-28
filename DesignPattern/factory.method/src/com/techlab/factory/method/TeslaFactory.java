package com.techlab.factory.method;

public class TeslaFactory implements IAutoFactory{

	private static TeslaFactory teslafactory;
	
	private TeslaFactory() { 
		
	}
	public static TeslaFactory getInstance() {
		if(teslafactory==null)
			return teslafactory = new TeslaFactory();
		return teslafactory;
		
	}
	@Override 
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return new Tesla();
	}

}
