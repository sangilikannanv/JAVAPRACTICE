package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		int a[]={1,2,7,4,5,6,5,4,3,2,2,1,3};
		int max=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		
	    HashSet<Integer> hs=new HashSet<Integer>(al);
	    LinkedList<String> lhs=new LinkedList<>();
	    
	    System.out.println(hs);
	    
	    int count=0;
	    for(Integer ass : hs)
	    {
	    	count=Collections.frequency(al, ass);
	    	if(max<count)
	    	{
	    		temp=ass;
	    		max=count;
	    	}
	    	System.out.println(ass+" Occures "+count+" times");
	    }
	    System.out.println("Max Character :"+temp+" Occures "+max+" times");
	}

}
