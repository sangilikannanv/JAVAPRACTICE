package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Tagged {
	
	public static void main(String[] args) {
		
	
	String val="malayalam";

	ArrayList<String> al=new ArrayList<String>();
	int count=0;
	for(int i=0;i<val.length();i++)
	{
	    al.add(String.valueOf(val.charAt(i)));
	}

	LinkedHashSet<String> lhs=new LinkedHashSet<String>(al);

	for(String itr:lhs)
	{
	    count=Collections.frequency(al, itr);
	    if(count==1)
	    {
	        System.out.println(itr);
	        break;
	    }
	}
	}
}
