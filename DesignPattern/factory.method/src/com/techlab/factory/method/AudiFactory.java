package com.techlab.factory.method;

public class AudiFactory implements IAutoFactory{
	
	private static AudiFactory audifactory;

	private AudiFactory() {

	}

	public static AudiFactory getInstance() {
		if(audifactory==null)
			return audifactory = new AudiFactory();
		return audifactory;
	}

	@Override
	public IAutomobile make() {
		// TODO Auto-generated method stub
		return null;
	}

}
