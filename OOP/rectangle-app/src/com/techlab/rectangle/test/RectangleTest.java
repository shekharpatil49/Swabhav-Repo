package com.techlab.rectangle.test;
import com.techlab.rectangle.*;

public class RectangleTest {
	
	public static void main(String args[])
	{
		Rectangle re = new Rectangle();
		re.setWidth(5);
		re.setHeight(-10);
		System.out.println("width is " +re.getWidth());
		System.out.println("height is " +re.getHeight());
		System.out.println("Area is " + re.calculateArea());
		
	}
	
	

}
