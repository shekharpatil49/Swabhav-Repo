package com.techlab.guitar;

public class GuitarSpec {

	private String model;
	private Builder builder;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	
	public GuitarSpec
	(Builder builder, String model, Type type,
			Wood backWood, Wood topWood) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
	}

	public String getModel() {
		return model;
	}
	public Builder getBuilder() {
		return builder;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
}
