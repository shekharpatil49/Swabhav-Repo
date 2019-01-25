package com.techlab.circle;
import com.techlab.circle.ColorOptions;

public class Circle {
	private  float radius;
	ColorOptions colour;
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
	
	
	public float getRadius() {
		return radius;
	}


	public void setRadius(float radius) {
		
			this.radius=validateDimention(radius);
	}

	public float calculateArea()
	{  
		return radius*radius*PI;
	}
	public void setBackgroundColor(ColorOptions Color) {
		this.colour=Color;
	}
	public ColorOptions getColor()
	{
		return colour;
	}


}

