package com.java8;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {

	public static void main(String[] args) {
		
		Integer v[]= {5,3,4,10,15};
		List<Integer> values=Arrays.asList(v);
		
//		Predicate<Integer> pre=new Predicate<Integer>()
//				{
//					public boolean test(Integer i) {
//						return i%5==0;
//					}
//				};
				
				System.out.println(values.stream().filter(x->x%5==0).map(x->x*2).reduce(0,(a,b)->a+b));		
	}
}
