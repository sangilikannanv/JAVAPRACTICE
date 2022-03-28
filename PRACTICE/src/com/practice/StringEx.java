package com.practice;

public class StringEx {
	
	public static void main(String[] args) {
		
		int a,b,c,d;
		/*
		 * String a="a,b,c,d,e,f,g"; String name="Programming"; String name2 =
		 * "Programming"; System.out.println(name.endsWith("ing"));
		 * System.out.println(name.equals("programming")); name=name.join("&", a,name);
		 * System.out.println(name);
		 */
		
		a = 10;
		b = ++a;
		c = a--;
		d = a;
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
		System.out.println("  dsdsdsd ".trim());
		System.out.println("abcdefgh".substring(0,5));
		String ere="abcdefgh".replaceAll("fddfdf", "*");
		System.out.println("abcdefgh".charAt(8));
		
	}

}
