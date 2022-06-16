package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseService {
	
	public List<Employee> getEmployee()
	{
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee("one", 21, 15000, 2));
		emp.add(new Employee("four",32, 2000, 2));
		emp.add(new Employee("three",23 , 3000, 3));
		emp.add(new Employee("four", 22, 4000, 12));
		emp.add(new Employee("abi", 26, 12500, 11));
		emp.add(new Employee("sai", 28, 13500, 25));
		emp.add(new Employee("kannan", 28, 14500, 10));
		emp.add(new Employee("Last",31, 2000, 2));
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
