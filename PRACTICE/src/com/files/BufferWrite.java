package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {
	
	public static void main(String[] args) {
		
		String arr[]= {"asd","adad","sangili"};
		try
		{
			BufferedWriter writter=new BufferedWriter(new FileWriter("D:\\Write.txt"));
			writter.write("This is First Line");
			writter.write("\nThis is First Line");
			for(String name:arr)
				writter.write("\n"+name);
			writter.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
