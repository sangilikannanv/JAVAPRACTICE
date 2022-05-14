package com.collections;

import java.util.ArrayList;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> arrList=new ArrayList<>(2);
		arrList.add("One");
		arrList.add("Two");
		arrList.add("Three");
		arrList.add("Four");
		
		for(String ref:arrList)
			System.out.println(ref);
	}

}
