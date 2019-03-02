package com.techlab.data;

public class Foo {

		
		private String firstName;
		private String lastName;
		private static int  nextEmp_no;
		private  int emp_no=100;
		static {
			nextEmp_no=100;
		}
		
		public String getfirstName() {
			return firstName;
		}
		
		public String getlastName() {
			return lastName;
		}
		
		public int getEmp_No() {
		
			return emp_no;
		}
	}

