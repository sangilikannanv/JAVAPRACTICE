package com.java8practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {
	
	public static void main(String[] args) {
		
		DataSet dataSet=new DataSet();
		//System.out.println(dataSet.getWorker());
		List<Worker> curObj=new ArrayList<Worker>();
		curObj=dataSet.getWorker();
		curObj.stream().forEach(wor->System.out.println(wor.getAge()));
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "abc");
		hm.put(2, "xyz");
		hm.put(new Integer(1), "zzzz");
		System.out.println(hm);
	}

}
