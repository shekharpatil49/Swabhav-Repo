package com.techlab.service;

public class DataService {

	private static DataService container;
	private DataService() {
		System.out.println("Service Started");
	}

	public static DataService getInstance() {
		if(container==null) {
			container= new DataService();
		    return container;
		 }
		return container;
		
	}
	public void doSomething() {
		System.out.println("Do Something!");
	}
}
