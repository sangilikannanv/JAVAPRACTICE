package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseService {
	
	public List<Employee> getEmployee()
	{
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee("one", 21, 1, 3));
		emp.add(new Employee("two",22, 2, 4));
		emp.add(new Employee("three",23 , 3, 2));
		emp.add(new Employee("four", 22, 4, 1));
		return emp;
	}
	public Map<Employee,Integer> getEmployeeMap()
	{
		Map<Employee,Integer> empMap=new HashMap<Employee,Integer>();
		empMap.put(new Employee("one", 21, 1, 3), 1);
		empMap.put(new Employee("one", 22, 2, 3), 2);
		empMap.put(new Employee("one", 23, 3, 3), 3);
		empMap.put(new Employee("one", 22, 4, 3), 4);
		return empMap;
	}

}
