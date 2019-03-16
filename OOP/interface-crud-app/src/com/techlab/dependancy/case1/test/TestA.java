package com.techlab.dependancy.case1.test;

import com.techlab.dependancy.case1.business.A;
import com.techlab.dependancy.case1.data.B;

public class TestA {

	public static void main(String[] args) {
      
		A a = new A(new B());
		a.baar();
	}

}
