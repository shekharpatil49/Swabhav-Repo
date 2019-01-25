package com.techlab.array;

public class TestParameter {

	public static void main(String args[]) {

		int no = 10;
		changeToZero(no);
		int[] nos = { 10, 20, 30 };
		changeToZeros(nos);
		System.out.println(no);
		for (int m : nos)
			System.out.print(m + " ");
		
   
	}

	static void changeToZero(int no) {
		
		no = 0;
		
	}

	static void changeToZeros(int[] nos) {
		
		for (int i = 0; i < nos.length; i++)
			nos[i] = 0;
	}

}
