package com.java8;

import java.util.ArrayList;
import java.util.Collections;
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
		Map<Object, Long> ageCount = al.stream().collect(Collectors.groupingBy(emp -> emp.getAge(), Collectors.counting()));
		ageCount.forEach((age, count) -> {
            System.out.println(age + ":" + count);
        });
		
		Map<Object, Integer> sum = al.stream().filter(emp -> emp.getAge()>22).collect(
                Collectors.groupingBy(emp -> emp.getName(), Collectors.summingInt(emp -> emp.getAge())));
		
		sum.forEach((age, count) -> {
            System.out.println(age + ":" + count);
        });
        
		
		
		al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).forEach(System.out::println);
		List<Employee> result =al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).collect(Collectors.toList());
		Set<Employee> result1 =al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).collect(Collectors.toSet());
	    System.out.println(result1);
		//Map<Integer, String> result2 =al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(emp -> emp.getExperiance())).collect(Collectors.toMap(Employee::getAge, Employee ::getName));
	

	    
	    System.out.println("************************");
		al.stream().filter(item -> item.getAge() >= 22).sorted(Comparator.comparing(Employee::getExperiance).thenComparing(Employee::getAge).thenComparing(Employee::getName).reversed()).forEach(System.out::println);
	
		al.sort((o1,o2) -> o1.getAge()-o2.getAge());
		System.out.println("**********************");
		System.out.println(al);
		
		Collections.sort(al,(o1,o2)->o2.getSalary()-o1.getSalary());
		System.out.println("**********************");
		System.out.println(al);
		
		
	}

}
