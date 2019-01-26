package com.techlab.person;

public class Person {
	
	private final String name;
	private  int age;
	private  float height;
	private float weight;
	private float BMI;
	
	public Person(String name ,int age,
			float height,float weight,GenderType gender) {
		    this.name=name;
		    this.age=age;
		    this.height=height;
		    this.weight=weight;
		    this.gender=gender;
	}
	
	public Person(String name,int age,GenderType gender) {
		this.name=name;
	    this.age=age;
	    this.gender=gender;
	    this.height=5.8f;
	    this.weight=55.6f;
	}
	
	public void eat() {
	
		      height = height*(0.01f) + height;
		      weight = weight*(0.05f) + weight;
	}
	public void doWorkout() {
		
		    weight = weight*(0.02f) + weight;
	}
	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	GenderType gender;
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public GenderType getGender() {
		return gender;
	}
	
	public float calculateBMI() {
		BMI = weight/ ((height/39.370f)*(39.370f/height));
		return BMI;
	}
	public void printBMI() {
		System.out.println("BMI is "+ BMI);
	}
	public String bmiCategory() {
		if (BMI<18.5f)
			return "UnderWeight";
		if(BMI>=18.5 && BMI<24.9)
			return "Healthy";
		if(BMI>=25 && BMI<29.9)
			return "OverWeight";
	    
		return "Obese";
	}
	

}
