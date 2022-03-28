package com.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
	
	public static void main(String[] args) throws IOException {
        int ch;
        String value="";
        FileReader fr=null;
        try
        {
            fr = new FileReader("D:\\Notes\\Read.txt");
            while ((ch=fr.read())!=-1)
            {
            	value+=String.valueOf((char)ch);
                System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
       
        System.out.println("value is : "+value);
        fr.close();
        
        /*
		 * File file=new File("D:\\sample.txt"); Scanner sc=new Scanner(file);
		 * while(sc.hasNextLine()) { value=value+sc.nextLine(); }
		 * System.out.println("value : "+value);
		 */
	}

}
