package com.collections;

import java.util.HashMap;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<String , String> hashMap= new HashMap<String,String>();
		
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put(null, "ragu");
		hashMap.put(null, null);
		hashMap.put(null, "sangili");
		hashMap.put(null, null);
		hashMap.put(null, null);
		hashMap.put("Zaaas", "aaaa");
		hashMap.put("Kannan", "aaaa");
		hashMap.put("Abcv", "aaaa");
		
		System.out.println(hashMap);
		
		System.out.println((int)"a".charAt(0));
		
		//hashMap.entrySet().forEach(s->);
		
	}

}
