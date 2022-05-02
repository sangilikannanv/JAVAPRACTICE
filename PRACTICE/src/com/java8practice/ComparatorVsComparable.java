package com.java8practice;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorVsComparable{
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> al=new ArrayList<>();
		Student s1=new Student(11, "Abishake");
		Student s2=new Student(13, "Ybishake");
		Student s3=new Student(12, "Cbishake");
		Student s4=new Student(13, "Fbishake");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Collections.sort(al,new IdComparator(){

		});
		System.out.println(al);
	}

}
