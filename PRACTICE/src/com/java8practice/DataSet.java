package com.java8practice;

import java.util.ArrayList;
import java.util.List;

public class DataSet {
	
	
	public List<Worker> getWorker()
	{
		
		ArrayList<Worker> obj=new ArrayList<Worker>();
		obj.add(new Worker(1,"NameOne",21));
		obj.add(new Worker(2,"NameTwo",22));
		obj.add(new Worker(3,"NameThree",23));
		return obj;
		
	}

}
