package com.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("singleton")
@Component
public class Student {

	public Student () {
		System.out.println("Object created");
	}
	 public Student(String name, String lastname) {
		 super(); 
		 this.name = name;
	  this.lastname = lastname; }
	 

	private String name;
	
	private String lastname;
 

	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Autowired
	private Department dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/*
	 * @Bean
	 * 
	 * public Department getDepartment() { return new Department(); }
	 */

	
	public void display() {
		System.out.println("Display method called...");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", dept=" + dept + "]";
	}
	

}
