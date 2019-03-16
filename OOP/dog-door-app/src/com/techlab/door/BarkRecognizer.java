package com.techlab.door;

public class BarkRecognizer {
	
	private DogDoor door;
	public BarkRecognizer(DogDoor door) {
		this.door=door;
	}
	public void recognizer(String bark) {
		System.out.println("BarkRecognizer herd bark");
		door.doorOpen();
	}

}
