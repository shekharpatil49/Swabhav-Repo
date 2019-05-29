package com.techlab.singletonwithenum.test;

import com.techlab.singletonwithenum.DataService;

public class TestDataService {
	public static void main(String args[]) {
	DataService dataservice1 = DataService.INSTANCE; 
	DataService dataservice2 = DataService.INSTANCE;
	
    System.out.println(dataservice1.hashCode());
    System.out.println(dataservice2.hashCode());
	}
}
