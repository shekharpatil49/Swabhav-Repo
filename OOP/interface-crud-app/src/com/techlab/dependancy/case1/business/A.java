package com.techlab.dependancy.case1.business;

import com.techlab.dependancy.case1.data.B;

public class A {
	
		private B b;
		public A(B b) {
			this.b = b;
		}
		public void baar() {
			System.out.println("baar method in class A");
			b.foo();
		}
		

}
