package com.practice;

import java.util.Arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int[] a= {32,1,2,5,6,7,89,3,91};
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}

}
