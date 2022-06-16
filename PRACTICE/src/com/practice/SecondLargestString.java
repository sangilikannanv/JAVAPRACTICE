package com.practice;

import java.util.TreeMap;

public class SecondLargestString {
	public static void main(String[] args) {
		
	
	String[] aaa= {"as","bs","cs","as","er","as","bs"};
	TreeMap<String,Integer> trMaps=new TreeMap<>();
	
	
	for(String s:aaa)
	{
		if(trMaps.containsKey(s))
		trMaps.put(s, trMaps.get(s)+1);
		else
			trMaps.put(s, 1);
	}
	
	//trMaps.entrySet().forEach(x->System.out.println(x));
	
	
	
	
	//ragu
//	TreeMap<String, Long> values= (TreeMap<String, Long>) Arrays.asList(aaa).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	
//	values.entrySet().stream().sorted().limit(2).skip(1).findFirst();
//	System.out.println(values);
	}
}
	