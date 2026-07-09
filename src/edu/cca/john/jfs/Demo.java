package edu.cca.john.jfs;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) {
        File file = new File("student.txt");
        try {
            if(file.createNewFile())
                System.out.println("File Created");
            else
                System.out.println("Already Exists");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
