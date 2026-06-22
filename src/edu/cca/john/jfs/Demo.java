//Typecasting 
package edu.cca.john.jfs;

public class Demo {

	public static void main(String[] args) {
		/*int myInt = 9;
        // Automatic casting: int to double
        double myDouble = myInt; 

        System.out.println(myInt);      // Outputs: 9
        System.out.println(myDouble);   // Outputs: 9.0
        */
		
        double myDouble = 9.78;
        // Manual casting: double to int
        int myInt = (int)myDouble; 

        System.out.println(myDouble);   // Outputs: 9.78
        System.out.println(myInt);      // Outputs: 9 (decimal is lost)
	}
}
