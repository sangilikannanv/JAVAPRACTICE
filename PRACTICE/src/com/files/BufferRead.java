package com.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferRead {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		try
		{
			String line=null;
			BufferedReader reader=new BufferedReader(new FileReader("D:\\Read.txt"));
			
			System.out.println(reader.readLine());  //for single line
			while((line =reader.readLine())!=null)
			{
			System.out.println(line);
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
