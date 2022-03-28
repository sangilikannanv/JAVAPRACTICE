package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		
		Map<String,Integer> trMap=new LinkedHashMap<>();
		trMap.put("kannan", 20);
		trMap.put("zannan", 30);
		trMap.put("annan", 20);
		trMap.put("sannan", 20);
		trMap.put("zannan", 20);
		trMap.put(null, 245);
		trMap.put(null, 567);
		
		trMap.entrySet().forEach(x->System.out.println(x));
	}

}
