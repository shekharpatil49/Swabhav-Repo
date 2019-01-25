package com.techlab.cicle.test;
import com.techlab.circle.*;
public class CircleTest {

	public static void main(String args[])
	{
		Circle c = new Circle();
		c.setRadius(5);
		c.setColour("RED");
		
		System.out.println("Radius is " +c.getRadius());
		System.out.println("Area is " + c.calculateArea());
		System.out.println("Colour is "+c.backgroundColour());
		
	}
}
