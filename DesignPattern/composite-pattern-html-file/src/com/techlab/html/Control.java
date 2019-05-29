package com.techlab.html;

public class Control implements IHTMLElement{
	
	private String type;
	private String tName;
	private String value;

	public Control(String type, String tName, String value) {
		this.type = type;
		this.tName = tName;
		this.value = value;
	}

	
	@Override
	public String buildHTML() {
		
		return "  <"+tName+" type="+type+" name ="+value+"> <br>";
		
		
	}
	
	

}
