package com.techlab.rectangle;

public class Rectangle {
	
	private  int width;
	private  int height;
	
	int validateDimention(int dim)
	{ 
		
		if(dim<0)
		{
			return 1;
			
		}
		else if(dim>100)
		{
			return 100;
		}
		else
			return dim;
	
	}
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		
			this.width=validateDimention(width);
	}


	public int getHeight() {
		
		 return height;
	}


	public void setHeight(int height) {
	 
		this.height = validateDimention(height);
	}
    
	

	public int calculateArea()
	{  
		return height*width;
	}

}
