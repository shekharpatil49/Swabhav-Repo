package com.techlab.interfacePolymorphism;

public class Man implements IMannerable {

	@Override
	public void wish() {
 
		System.out.println("Man is wishing hiii !");
	}

	@Override
	public void depart() {
		System.out.println("Man is departing good bye!");		
	}
	public void read() {
		System.out.println("Man is reading");
	}

	
}
