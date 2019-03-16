package com.techlab.dependancy.test.case2;

import com.techlab.core.IFooable;
import com.techlab.dependancy.business.case2.A;
import com.techlab.dependancy.data.case2.B;

public class TestA {

	public static void main(String[] args) {

		A  a = new A(new B());
		a.baar();
			
	}

}
