package com.techlab.inheritance.test;

import com.techlab.inheritance.Boy;
import com.techlab.inheritance.Child;
import com.techlab.inheritance.Kid;
import com.techlab.inheritance.Man;

public class TestInheritance {

	public static void main(String[] args) {

		// case1();
		// case2();
		// case3();
		//case4();
		case5();
	}

	public static void case1() {

		Man x;
		x = new Man();
		x.read();
		x.play();
		x.walk();

	}

	public static void case2() {

		Boy y;
		y = new Boy();
		y.read();
		y.play();
		y.walk();
		y.eat();

	}

	public static void case3() {

		Man x;
		x = new Boy();

		x.read();
		x.walk();
		x.play(); // polymorphism

	}

	public static void case4() {

		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Boy());
		atThePark(new Child());

	}

	public static void atThePark(Man x) {
		System.out.println("At Park");
		x.play();
	}
	
	public static void case5() {
		Object x;
		x=10;
		x="Hello";
		x=true;
		x=10.5;
		System.out.println(x);
	}

}
