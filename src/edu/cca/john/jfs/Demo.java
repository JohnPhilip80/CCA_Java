//Prime Number
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int number;
		boolean isPrime = true;
		
		System.out.println("Enter a Number:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		for(int i = 2;i<number;i++)
		{
			if(number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println("Given Number is Prime Number");
		else
			System.out.println("Given Number is not Prime Number");
	}
}
