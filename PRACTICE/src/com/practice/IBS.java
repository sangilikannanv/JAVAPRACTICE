package com.practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IBS {
	
	public static void main(String[] args) {
		
		Map<Integer,List<String>> map = new HashMap<Integer,List<String>>();
		map.put(1, Arrays.asList("dubai","india"));
		map.put(2, Arrays.asList("india	","china"));

		String key="India";

		map.entrySet().stream().forEach(item ->{
			System.out.println(item.getValue().contains("india"));
			if(item.getValue().contains(key)) {
				System.out.println(item.getKey());
			}
			
		});
		
	}

}
