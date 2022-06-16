package com.practice;

import java.util.ArrayList;

public class HCLCode {
	
	public static void main(String[] args) {
		
		
	int[] a= {10,15,8,49,25,98,32};
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++)
		al.add(a[i]);
	
	//List<int[]> al=Arrays.asList(a);
	
	al.stream().filter(x->x.toString().startsWith("1")).forEach(x->System.out.println(x));
			}

}
