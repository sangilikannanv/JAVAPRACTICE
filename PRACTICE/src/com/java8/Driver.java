package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Driver {
	public static void main(String[] args) {

		DatabaseService obj = new DatabaseService();
		List<Employee> al = new ArrayList<>();
		al = obj.getEmployee();

		al.stream().forEach(list->System.out.println(list));
		System.out.println("---------------------------------------------");
		al.stream().filter(item -> item.getAge()>=22).forEach(System.out::println);
		System.out.println("---------------------------------------------");
		al.stream().filter(item -> item.getAge()>=22).forEach(employee ->{
			
			if(employee.getExperiance()>=2)
				employee.setSalary(employee.getSalary()+10);
			System.out.println(employee);
				});
		System.out.println("---------------------------------------------");
		al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).forEach(System.out::println);

		
	}

}
