package com.logicalprogram;

public class Recursion {

	public static void main(String[] args) {

		System.out.println("Answer : " + recurse(0));
	}

	public static int recurse(int n) {
		System.out.println(n + " " + n);

		if (n <= 1) {
			return 1;
		}

		return n * recurse(n - 1);

	}
	
	
	
	
	

}
