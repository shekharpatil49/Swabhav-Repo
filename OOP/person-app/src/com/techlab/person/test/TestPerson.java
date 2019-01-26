package com.techlab.person.test;

import com.techlab.person.Person;
import com.techlab.person.GenderType;

public class TestPerson {

	public static void main(String[] args) {
      
		Person p1 = 
				new Person("RAM",20,5.5f,50.5f,GenderType.MALE);
		Person p2 = 
				new Person("ABM",20,GenderType.MALE);
		
		putData(p1);
		putData(p2);
		
		p1.doWorkout();
		p1.eat();
		putData(p1);
		p1.calculateBMI();
	    p1.printBMI();
	    String category= p1.bmiCategory();
	    System.out.println(category);
		
	}
	public static void putData(Person p){
		System.out.print("Name is "+ p.getName()+". ");
		System.out.print("Age is " +p.getAge()+". ");
		System.out.print("Gender is " +p.getGender()+". ");
		System.out.print("Height is " +p.getHeight()+". ");
		System.out.println("Weight is "+p.getWeight()+". ");
	}

}
