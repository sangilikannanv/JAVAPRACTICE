package com.collections;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet<String> trSet=new TreeSet<String>();
		trSet.add("ragus");
		trSet.add("kannan");
		trSet.add("ragu");
		trSet.add("akannan");
		trSet.add("zkannan");
		trSet.add("bkannan");
		
		trSet.iterator().forEachRemaining(x->System.out.println(x));
		
		for(String value:trSet)
		{
			System.out.println(value);
		}
	}

}
