package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {

		DatabaseService obj = new DatabaseService();
		List<Employee> al = new ArrayList<>();
		al = obj.getEmployee();
		Function<String, Integer> fun = x-> x.length();
		Function<Integer, Integer> fun2 = x-> x * x;
        Integer res=fun.andThen(fun2).apply("ragu");
        System.out.println("res "+res);
		
		al.stream().forEach(list->System.out.println(list));
		System.out.println("---------------------------------------------");
		al.stream().filter(item -> item.getAge()>=22).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		al.stream().filter(item -> item.getAge()>=22).forEach(employee ->{
			
			if(employee.getExperiance()>=2)
				employee.setSalary(employee.getSalary()+10);
			System.out.println(employee);
				});
		System.out.println("---------------------------------------------");
		Map<Object, Long> nameCount = al.stream().collect(Collectors.groupingBy(string -> string.getAge(), Collectors.counting()));
        nameCount.forEach((name, count) -> {
            System.out.println(name + ":" + count);
        });
        
		al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).forEach(System.out::println);
		List<Employee> result =al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).collect(Collectors.toList());
		Set<Employee> result1 =al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).collect(Collectors.toSet());
	    System.out.println(result1);
		//Map<Integer, String> result2 =al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).collect(Collectors.toMap(Employee::getAge, Employee ::getName));
	}

}
