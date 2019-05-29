package com.techlab.html.test;

import com.techlab.html.Control;
import com.techlab.html.ControlGroup;

public class TestHTML {
	
	public static void main(String args[]) {
		
		ControlGroup root = new ControlGroup("form");
		Control c1 = new Control("text","input","firstName");
		Control c2 = new Control("text","input","lastName");
		Control c3 = new Control("submit","input","Submit");
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(c3);
		System.out.println(root.buildHTML());;
		
	}

}
