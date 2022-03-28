package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class FIlewrite {
	
	public static void main(String[] args) throws IOException  {
		String str = 
	"1. Ann finishes her work and calls her friends. Then she heads to the supermarket to buy food, waits in line to pay, and goes home. Once at home, she starts cooking. When dinner is ready, she cleans the apartment, gusts arrive, and most likely wait till Ann finishes all the work. The party starts later.\r\n"
	+ "\r\n"
	+ "This is a description of a sync approach to the problem (request), as all the tasks are completed one after another. As a result, it will take a long time for the party to start.\r\n"
	+ "\r\n"
	+ "2. Ann finishes her work and sends invitations to her friends. Then she orders food delivery online and heads home to clean the apartment. By the time the apartment is clean, food is delivered. Ann is having dinner without her friends.\r\n"
	+ "\r\n"
	+ "This is an example of the async approach.\r\n"
	+ "\r\n"
	+ "3. Ann finishes her work and sends invitations to her friends. She orders food delivery online and heads home to clean the apartment. She finishes cleaning and gets the delivery. But this time she waits for her friends to arrive and start the party.\r\n"
	+ "\r\n"
	+ "The last option is a description of the reactive approach. That is to say. The RP is when you wait for async actions to complete (make a change) to proceed with further steps.\r\n"
	+ "\r\n"
	+ "For better understanding, think of the experiment at your chemistry class. You have to combine two or more elements in order to get a certain reaction. Similar processes lay behind the reactive paradigm concept.";
        FileWriter fw=new FileWriter("D:\\Write.txt");
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Writing successful");
        fw.close();

	}
}
