package com.techlab.factory.method;

public class BMWFactory implements IAutoFactory {

	private static BMWFactory bmwfactory;

	private BMWFactory() {

	}

	public static BMWFactory getInstance() {
		if(bmwfactory==null)
			return bmwfactory = new BMWFactory();
		return bmwfactory;
	}
	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
