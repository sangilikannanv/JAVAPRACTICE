package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

import com.java8.DatabaseService;
import com.java8.Employee;

public class Wipro {
	
	public static void main(String[] args) {
		
		DatabaseService ds=new DatabaseService();
		
		
		String name="javaj2ee";
		
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<name.length();i++)
		{
			al.add(String.valueOf(name.charAt(i)));
		}
		
		LinkedHashSet<String> hs=new LinkedHashSet<String>(al);
		int count=0;
		for(String val:hs)
		{
			count=Collections.frequency(al, val);
			if(count==1)
			{
				System.out.println(val);
				break;
			}
		}
		
		
		
		ArrayList<Employee> emp=(ArrayList<Employee>) ds.getEmployee();
		
		int temp=0;
		int max=0;
		
		
		//Map<Object,List<Long>> map=emp.stream().filter(emp->emp.getExperiance()).collect(Collectors.groupingBy(emp->emp.getExperiance(),Collectors.counting()));
		
			
		
		String test="AppleWebKit";
		if(test.contains("Apple"))
		{
			System.out.println("True");
		}
		
	}

}
