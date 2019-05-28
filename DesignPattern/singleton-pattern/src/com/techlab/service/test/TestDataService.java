package com.techlab.service.test;

import com.techlab.service.DataService;

public class TestDataService {
	
	public static void main(String args[]) {
		
		DataService sv1 = DataService.getInstance();
		DataService sv2 = DataService.getInstance();
		
		System.out.println(sv1.hashCode());
		System.out.println(sv2.hashCode());
		sv1.doSomething();
		sv2.doSomething();
	}

}
