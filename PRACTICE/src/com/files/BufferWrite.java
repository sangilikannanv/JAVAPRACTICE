package com.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
	
	public static void main(String[] args) {
		
		String arr[]= {"asd","adad","sangili"};
		try
		{
			BufferedWriter writter=new BufferedWriter(new FileWriter("D:\\Write.txt"));
			BufferedReader reader=new BufferedReader(new FileReader("D:\\Read.txt"));
			writter.write("This is First Line");
			writter.write(reader.readLine());
			writter.write("\nThis is First Line");
			for(String name:arr)
				writter.write("\n"+name);
			writter.close();
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Success");
	}

}
