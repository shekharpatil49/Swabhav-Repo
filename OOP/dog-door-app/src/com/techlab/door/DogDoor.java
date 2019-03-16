package com.techlab.door;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

	private boolean open;
	
	public DogDoor() {
		this.open = false;
	}
	public void doorOpen() {
		System.out.println("The dog door opens");
		open = true;
		final Timer timer = new Timer();
 	    timer.schedule(new TimerTask() {
 	    public void run() {
 	    	doorClose();
 	    	timer.cancel();
 	    	}
 	    },5000);
	}
	public void doorClose() {
		System.out.println("The dog door closes");
		open = false;
	}
	
	public boolean isOpen() {
	  return open;
	}
	
}
