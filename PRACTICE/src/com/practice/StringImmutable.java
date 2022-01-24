package com.practice;

public class StringImmutable {
	
	public static void main(String[] args) {
		//String is Immutable in Java because String objects are cached in String pool
		String name = "Sangili";
		name.concat("Kannan");  
		System.out.println(name);
	}

}
