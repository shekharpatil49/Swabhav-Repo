package com.techlab.simplefactory;

public class CarWheel implements IWheel {

	protected float diameter;
	protected float width;

	public CarWheel(float diameter, float width) {
		this.diameter = diameter;
		this.width = width;
	}

	@Override
	public float getDiameter() {
		return diameter;
	}

	@Override
	public float getWidth() {
		return width;
	}

}
