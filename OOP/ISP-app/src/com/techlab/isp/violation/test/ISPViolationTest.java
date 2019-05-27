package com.techlab.isp.violation.test;

import com.techlab.isp.violation.IWorker;
import com.techlab.isp.violation.Manager;
import com.techlab.isp.violation.Robot;

public class ISPViolationTest {

	public static void main(String[] args) {
      
		
		atWorkStation(new Robot());
		atWorkStation(new Manager());
		atCafeteria(new Manager());
		atCafeteria(new Robot());
		
		
	}
	public static void atWorkStation(IWorker i) {
		
		System.out.println("At WorkStation");
		i.startWork();
		i.stopWork();
	}
	public static void atCafeteria(IWorker i) {
		System.out.println("At Cafeteria");
		i.startEat();
		i.stopEat();
	}

}
