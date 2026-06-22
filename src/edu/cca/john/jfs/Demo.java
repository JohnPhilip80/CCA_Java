//Looping Statements
package edu.cca.john.jfs;

public class Demo {
	public static void main(String[] args) {
		/*
		while Statement
			while (condition) {
			   code block to be executed
			}
		*/
		/*
		int countdown = 10;
		while (countdown > 0) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println(countdown);
			countdown--;
		}
		System.out.println("Happy New Year!");
		*/
		
		/*
		do while Statement
			while (condition) {
			  // code block to be executed
			}
		*/
		
		/*
		int i = 6;
        do {
            System.out.println("Number: " + i);
            i++; // Increments the counter variable
        } while (i <= 5);
		*/
		
		/*
		for loop Statement - 3 parts. 1. Initialization, 2. Condition, 3. Increment / Decrement
			for (statement 1; statement 2; statement 3) {
			   code block to be executed
			}
		*/
		
		/*
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);
			}
		*/
		
		/*
		//Nested Loop (Loop inside Loop)
		// Outer loop
		for (int i = 1; i <= 2; i++) {
		  System.out.println("Outer: " + i); // Executes 2 times
		  
		  // Inner loop
		  for (int j = 1; j <= 3; j++) {
		    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
		  }
		}
		*/
		/*
		//Multiplication table
		for (int i = 1; i <= 9; i++) {
		  for (int j = 1; j <= 10; j++) {
		    System.out.printf("\n%-3s%-3s%-3s%-3s%-3s", i, "*", j, " = " ,i * j);
		  }
		  System.out.println();
		}
		*/
		
		//break and continue
		for (int i = 1; i <= 10; i++) {
            if(i==5) {
                continue;
            }
            System.out.println(i);
            if(i==8){
                break;
            }
        }
	}
}
