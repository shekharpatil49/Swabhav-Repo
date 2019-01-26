package com.techlab.rectangle.test;

import com.techlab.rectangle.*;

public class RectangleTest {

	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		
		r1.setWidth(100);
		r1.setHeight(20);
		
		Rectangle r2 = new Rectangle();
		
		r2.setWidth(50);
		r2.setHeight(70);

		printDetails(r1);
		printDetails(r2);
		
		Rectangle r3 = r1;
		
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());

		
		r3.setHeight(2);
		System.out.println(r3.getHeight());
		System.out.println(r1.getHeight());
		//r3=null;
		
		new Rectangle().setHeight(20);
		System.out.println(new Rectangle().getHeight());
		printDetails(new Rectangle());
		
		
	

	}

	public static void printDetails(Rectangle r) {
		System.out.println("width is " + r.getWidth());
		System.out.println("height is " + r.getHeight());
		System.out.println("Area is " + r.calculateArea());
	}

}
