package com.collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		TreeMap<String,Integer> trMap=new TreeMap<>();
		trMap.put("kannan", 21);
		trMap.put("zannan", 22);
		trMap.put("annan", 23);
		trMap.put("sannan", 24);
		trMap.put("zannan", 25);
		
		trMap.entrySet().forEach(x->System.out.println(x));
		
		for(Entry<String, Integer> set:trMap.entrySet())
		{
			System.out.println("Key : "+set.getKey()+"Value :"+set.getValue());
		}
	}

}
