package com.techlab.singletonwithenum;

public enum DataService {
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}


}
