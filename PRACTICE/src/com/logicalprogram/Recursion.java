package com.logicalprogram;

public class Recursion {

	public static void main(String[] args) {

		System.out.println("Answer : " + recurse(5));
	}

	public static int recurse(int n) {

		if (n <= 1) {
			return 1;
		}

		return n * recurse(n - 1);

	}
	
	
	
	
	

}
