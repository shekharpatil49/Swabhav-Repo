package com.techlab.interfacePolymorphism.test;

import com.techlab.interfacePolymorphism.Boy;
import com.techlab.interfacePolymorphism.IEmotionable;
import com.techlab.interfacePolymorphism.IMannerable;
import com.techlab.interfacePolymorphism.Man;

public class TestInterfacePolymorphism {

	public static void main(String[] args) {

		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(boy);
		atTheParty(man);
		atTheMovie(boy);
		
	}

	public static void atTheMovie(IEmotionable obj) {
		System.out.println("At the movies");
		obj.cry();
		obj.laugh();
	} 
	

	public static void atTheParty(IMannerable obj) {
		System.out.println("At the party");
		obj.wish();
		obj.depart();
	}

}
