package com.java8practice;

public class Student implements Comparable<Student>{
	
	private int id;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	@Override
	public int compareTo(Student s) {
		if(id==s.id)
			return 0;
		else if(id>s.id)
			return 1;
		else 
			return -1;
	}

}
