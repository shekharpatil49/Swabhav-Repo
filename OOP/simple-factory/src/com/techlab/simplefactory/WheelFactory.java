package com.techlab.simplefactory;

public class WheelFactory {

	public static IWheel makeWheel (float diameter, float width) {
        return new CarWheel(diameter, width);
    }
}
