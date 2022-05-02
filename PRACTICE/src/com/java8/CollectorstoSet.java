package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorstoSet {
	
	public static void main(String[] args) {
		
		List<String> al=new ArrayList<>();
		al.add("kannan");
		al.add("zannan");
		al.add("kannan");
		
		Set<String> answer=al.stream().collect(Collectors.toSet());
		System.out.println(answer);
		for(String ans:answer)
		{
			System.out.println(ans);
		}
		
		Integer[] a= {4,3,21,7,6,8,0};
		List<Integer> kl=Arrays.asList(a);
		kl.stream().skip(a.length-2).forEach(i->System.out.println(i));
	}

}
