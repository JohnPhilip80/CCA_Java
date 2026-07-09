package edu.cca.john.jfs;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
		 try {
	            FileWriter writer = new FileWriter("student.txt");
	            writer.write("101,John,Java\n");
	            writer.write("102,Saraswathy,Python\n");
	            writer.write("103,Sumaya,Data Science\n");
	            writer.write("104,Bala,Cyber Security");
	            writer.close();
	            System.out.println("Data Written");
	        }
	        catch(IOException e){
	            System.out.println(e.getMessage());
	        }
    }
}
