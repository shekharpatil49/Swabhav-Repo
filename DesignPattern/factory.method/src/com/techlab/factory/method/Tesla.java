package com.techlab.factory.method;

class Tesla implements IAutomobile{

	@Override
	public void start() {
		  System.out.println("Tesla Started");			
	}

	@Override
	public void stop() {
		  System.out.println("Tesla Stopped");	
		
	}

}
