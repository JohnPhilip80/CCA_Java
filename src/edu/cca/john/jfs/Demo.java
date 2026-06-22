//Java Methods
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		/*
		 * A Java method is a collection of statements that are grouped together to perform an operation.
		 * A method in Java is a block of code that, when called, performs specific actions mentioned in it.
		 * You can insert values or parameters into methods, and they will only be executed when called.
		 * They are also referred to as functions.
		 * 
		 * code re-usability
		 * break a complex program into smaller chunks of code
		 * increases code readability
		 * 
		 * 1. User-defined Methods : We can create our own method based on our requirements.
		 * 2. Standard Library Methods : These are built-in methods in Java that are available to use.
		 * 
		 * Syntax
		 * Access_ specifier Return_type Method_name ( Parameter list ){
		 * 		body of method;
		 * }
		 * 
		 * Access Specifiers - Private, Public and Protected
		 * Return Type - void or datatypes
		 * Parameter List - list of arguments (data_type variable_name) that will be used in the method
		 * Method Body - This is the set of instructions enclosed within curly brackets.
		 * 
		 */
		
		/*
		//No Return W/o args
		addNumber();
		
		//No Return With Args
		subtractNumber(7,2);
		
	    //Return Without Args
		int result = multiplyNumber();
		System.out.println("Multiplication : " + result);
		
		//Return With Args
		float answer = divideNumber(24,6);
		System.out.println("Division : " + answer);
		*/
		
		/*
		//Recursion Function
	    //Single Recursion - Method calls itself only once
		Scanner scanner = new Scanner(System.in);
        System.out.print("Factorial of what number do you want to calculate? ");
        int num = scanner.nextInt();// 5 = 5*4*3*2*1 = 120
        System.out.printf("%d! = %d", num, factorialNumber(num));
        System.out.printf("%d! = %d", num, factorial(num));
        scanner.close();
        */
		
		/*
		//Fibonacci Series - 0,1,1,2,3,5,8,13,21
		// Multiple Recursion. Function calls itself more than once
		// best for tree traversal such as depth – first search and Fibonacci sequence computation
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers in fibonacci series do you want to print? ");
	    int iter = scanner.nextInt();
	    fibonacciSeries(iter);
	    System.out.println("\n Recursive Fibonacci:");
	    for (int i=0;i<iter;i++) {
	    	System.out.print(fibonacci(i) + " ");
	    }
	    scanner.close();
	    */
	}
	
	public static long fibonacci(long n) {
		if (n<2)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
        
		//return (n < 2) ? n : fibonacci(n-1) + fibonacci(n-2);
    }
	
	public static void  fibonacciSeries(int n) {
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.print("Fibonacci Series: ");
        
        for (int i = 1; i <= n; i++) {
            // Print the current term
            System.out.print(firstTerm + " ");
            
            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            
            // Shift the values for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
	}
	
	public static long factorialNumber(int num) {
        long factorial = 1;
        // Loop from 1 to the given number
        for (int i = 1; i <= num; i++) {
            factorial *= i; // factorial = factorial * i;
        }
        return factorial;
	}
	
	public static int factorial(int num)//5!  =1*2*3*4*5=120
    {
        if(num<2)
            return 1;
        else
            return (num * factorial(num-1));
    }
	
	public static void addNumber() {
        int a = 123;
        int b = 10;
        System.out.println("Addition : " + (a + b));
    }
    public static void subtractNumber(int x, int y) {
        System.out.println("Subtraction : " + (x - y));
    }
    public static int multiplyNumber() {
        int a = 123;
        int b = 10;
        return a * b;
    }
    public static float divideNumber(int x, int y) {
        return (x / y);
    }
}
