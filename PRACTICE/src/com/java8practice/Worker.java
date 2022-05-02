package com.java8practice;

public class Worker {
	
	private int id;
	private String name;
	private int age;


	public Worker(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name)
	{
		this.name=name;
	}

}
