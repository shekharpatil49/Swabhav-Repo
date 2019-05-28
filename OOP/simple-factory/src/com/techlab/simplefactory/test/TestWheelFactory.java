package com.techlab.simplefactory.test;

import com.techlab.simplefactory.IWheel;
import com.techlab.simplefactory.WheelFactory;

public class TestWheelFactory {
	
	public static void main(String[] args) {
		
		IWheel carWheel = WheelFactory.makeWheel(10, 250);

		System.out.println(carWheel.getDiameter());
		System.out.println(carWheel.getWidth());
	}

}
