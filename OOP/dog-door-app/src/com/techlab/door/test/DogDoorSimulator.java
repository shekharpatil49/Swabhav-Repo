package com.techlab.door.test;

import com.techlab.door.Bark;
import com.techlab.door.BarkRecognizer;
import com.techlab.door.DogDoor;
import com.techlab.door.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
    DogDoor door = new DogDoor();
    door.addAllowedBark(new Bark("rowlf")); 
    door.addAllowedBark(new Bark("rooowlf")); 
    door.addAllowedBark(new Bark("rawlf")); 
    door.addAllowedBark(new Bark("woof"));
    BarkRecognizer recognizer = new BarkRecognizer(door);
    Remote remote = new Remote(door);
    
    System.out.println("Bruce start barking");
    recognizer.recognize(new Bark("rawlf"));
    System.out.println("\nBruce has gone outside...");
       
    try {
    	Thread.currentThread().sleep(5000);
    }catch(InterruptedException e) {}
    System.out.println("\nBruce all done");
    System.out.println("...But he stuck outside");
    Bark smallDog = new Bark("yip");
    System.out.println("\nA small dog start barking");
    recognizer.recognize(smallDog);
    try {
    	Thread.currentThread().sleep(5000);
    }catch(InterruptedException e) {}
    System.out.println("\nBruce start barking");
    recognizer.recognize(new Bark("rooowlf"));
    System.out.println("\nFido’s back inside...");
    
	}

}
