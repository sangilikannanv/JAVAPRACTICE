package com.collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		TreeMap<String,Integer> trMap=new TreeMap<>();
		trMap.put("kannan", 20);
		trMap.put("zannan", 20);
		trMap.put("annan", 20);
		trMap.put("sannan", 20);
		trMap.put("zannan", 20);
		
		trMap.entrySet().forEach(x->System.out.println(x));
		
		for(Entry<String, Integer> set:trMap.entrySet())
		{
			System.out.println("Key : "+set.getKey()+"Value :"+set.getValue());
		}
	}

}
