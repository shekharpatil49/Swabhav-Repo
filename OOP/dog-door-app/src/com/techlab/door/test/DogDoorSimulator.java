package com.techlab.door.test;

import com.techlab.door.BarkRecognizer;
import com.techlab.door.DogDoor;
import com.techlab.door.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
    DogDoor door = new DogDoor();
    BarkRecognizer recognizer = new BarkRecognizer(door);
    Remote remote = new Remote(door);
    
    System.out.println("Fido start barking");
    recognizer.recognizer("woof");
    System.out.println("\nFido has gone outside...");
    System.out.println("\nFido all done");
    
    try {
    	Thread.currentThread().sleep(10000);
    }catch(InterruptedException e) {}
    System.out.println("...But he stuck outside");
    System.out.println("\nFido start barking");
    recognizer.recognizer("woof");
    System.out.println("\nFido’s back inside...");
    
	}

}
