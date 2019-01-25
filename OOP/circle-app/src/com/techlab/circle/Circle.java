package com.techlab.circle;

public class Circle {
	private  float radius;
	private String colour;
	private static float PI = 3.142f;
	
	float validateDimention(float dim)
	{ 
		
		if(dim<0)
		{  dim = (float) 0.1;
			return dim;
			
		}
		else if(dim>1)
		{   dim = 1;
			return 1;
		}
		else
			return dim;
	
	}
	public String colorValidate(String colour)
	{
		if(colour.equalsIgnoreCase("red") 
		 || colour.equalsIgnoreCase("blue")|| 
		 colour.equalsIgnoreCase("green"))
		return colour;
		else
		{
			colour="blue";
		return colour;
		}
		
	}
	
	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		
			this.radius=validateDimention(radius);
	}
	public String getColor() {
		return colour;
	}
	public void setColour(String colour) {
		
		this.colour=colorValidate(colour);
}

	

	public float calculateArea()
	{  
		return radius*radius*PI;
	}
	public String backgroundColour()
	{
		return colour;
	}

}

