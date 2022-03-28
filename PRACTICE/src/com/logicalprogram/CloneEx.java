package com.logicalprogram;

public class CloneEx implements Cloneable {

	static int  num =0;
	public static void main(String[] args) {
		
	
		
		CloneEx a = new CloneEx();
		CloneEx b = a;
		
		a.num = 5;
		b.num = 7;
		System.out.println(a.num);
		
		
	}
}
