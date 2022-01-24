package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> trSet=new LinkedHashSet<String>();
		trSet.add("ragus");
		trSet.add("kannan");
		trSet.add("ragu");
		trSet.add("akannan");
		trSet.add("zkannan");
		trSet.add("bkannan");
		trSet.add("ragu");
		
		
		System.out.println(trSet.size());
		trSet.iterator().forEachRemaining(x->System.out.println(x));
	}

}
