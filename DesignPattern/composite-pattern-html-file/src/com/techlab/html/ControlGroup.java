package com.techlab.html;

import java.util.ArrayList;
import java.util.List;



public class ControlGroup implements IHTMLElement{

	private String tagName;
	private List<IHTMLElement> children;
	
	public ControlGroup(String tagName) {
		children = new ArrayList();
		this.tagName = tagName;
	}
	
	
	public void addChild(IHTMLElement ie) {
		children.add(ie);
	}
	@Override
	public String buildHTML() {
		String str="<"+tagName+">";
		for (IHTMLElement item : children) {
          str=str+"\n"+item.buildHTML();
          
	}
		     return str+"\n"+"</"+tagName+">";
	
}
}
