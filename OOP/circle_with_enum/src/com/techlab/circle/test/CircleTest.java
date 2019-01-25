package com.techlab.circle.test;

import com.techlab.circle.ColorOptions;
import com.techlab.circle.*;

public class CircleTest {
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.setRadius(5);
	    c.setBackgroundColor(ColorOptions.BLUE);
		
		System.out.println("Radius is " +c.getRadius());
		System.out.println("Area is " + c.calculateArea());
		System.out.println("Colour is " + c.getColor());
		
	}

}
