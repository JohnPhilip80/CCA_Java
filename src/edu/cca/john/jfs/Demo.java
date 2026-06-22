//Conditional Statements
package edu.cca.john.jfs;

public class Demo {
	public static void main(String[] args) {
		/*
		if Statement
			
			if (condition) {
				block of code to be executed if the condition is true
			}
		*/
		
		/*
		int age = 20;
		if(age >= 18) {
			System.out.println("You are Major");
			System.out.println("Inside the condition true block!");
		}
		System.out.println("Outside the condition!");
		*/
		
		
		/*
		if else statement
		
			if (condition) {
  		 		block of code to be executed if the condition is true
			} else {
  		 		block of code to be executed if the condition is false
			}
		*/
		
		/*int age = 20;
		if(age >= 18) {
			System.out.println("You are Major");
			System.out.println("Inside the condition true block!");
		}
		else {
			System.out.println("You are Minor");
			System.out.println("Inside the condition false block!");
		}
		System.out.println("Outside the condition!");
		*/
		
		
		/*	
		else if Ladder Statement
			if (condition1) {
			   block of code to be executed if condition1 is true
			} else if (condition2) {
			   block of code to be executed if condition1 is false and condition2 is true
			} else {
			   block of code to be executed if both conditions are false
			}
		*/
		
		/*
		int score = 78; 

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }
        */
        
		/*
		Nested if statement
			if (condition1) {
			  code to run if condition1 is true
			  if (condition2) {
			  code to run if both condition1 and condition2 are true
			  }
			}
		*/
		
		/*
		int a = 10, b=30, c=20;
		
		if(a>b) {
			if(a>c) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
		}
		else {
			if(b>c) {
				System.out.println("B is Greater");
			}
			else {
				System.out.println("C is Greater");
			}
		}
		
		*/
		
		/*
		int a = 10, b=30, c=50;
		if(a>=b && a>=c)
			System.out.println("A is Greater");
		else if(b>=a && b>=c)
			System.out.println("B is Greater");
		else
			System.out.println("C is Greater");
		*/
		/*
		//Nested If
		String name = "Subashini";
		char gender = 'F';
		boolean isMarried = false;
		
		if(gender == 'F') {
			if(isMarried) {
				System.out.println("MRS." + name);
			}
			else {
				System.out.println("Miss." + name);
			}
		}
		else {
			System.out.println("Mr." + name);
		}
		*/
		
		/*
		switch Statement
			switch(expression) {
			  case x:
			    // code block
			    break;
			  case y:
			    // code block
			    break;
			  default:
			    // code block
			}
		 */
		
		/*
		int day = 6;
		switch (day) {
		  case 1:
		  case 2:
		  case 3:
		  case 4:
		  case 5:
		    System.out.println("Week Day");
		    break;
		  case 6:
		  case 7:
		    System.out.println("Weekend");
		    break;
		}
		*/
	}
}
