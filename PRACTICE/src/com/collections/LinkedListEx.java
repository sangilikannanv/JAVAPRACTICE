package com.collections;

import java.util.LinkedList;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList<String> arrList=new LinkedList<>();
		arrList.add("One");
		arrList.add("Two");
		arrList.add("Three");
		arrList.add("Four");
		
		for(String ref:arrList)
			System.out.println(ref);
	}

}
