package com.techlab.isp.solution.test;

import com.techlab.isp.solution.IEatable;
import com.techlab.isp.solution.IWorkEat;
import com.techlab.isp.solution.IWorkable;
import com.techlab.isp.solution.Manager;
import com.techlab.isp.solution.Robot;

public class ISPSolution {

	public static void main(String args[]) {
		
		atWorkStation(new Manager());
		atWorkStation(new Robot());
		atCafeteria(new Manager());
		
	}
	
     public static void atWorkStation(IWorkable i ) {
		
		System.out.println("At WorkStation");
		i.startWork();
		i.stopWork();
	}
	 public static void atCafeteria(IEatable i) {
		System.out.println("At Cafeteria");
		i.startEat();
		i.stopEat();
	}
}
