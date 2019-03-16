package com.techlab.dependancy.business.case2;

import com.techlab.core.IFooable;

public class A {

private IFooable obj;

public A(IFooable obj) {
	this.obj=obj;
}

public void baar() {
	System.out.println("baar is called");
	obj.foo();
}

	
}
