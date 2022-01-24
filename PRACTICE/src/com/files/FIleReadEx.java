package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FIleReadEx {
	
	public static void main(String[] args) {
		
		
		try {
			BufferedReader reader=new BufferedReader(new FileReader("D:\\Read.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
