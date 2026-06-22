//Scanner - Input from User during run time
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName = "";
		byte userAge = 0;
		short employeeCount = 0;
		int totalScore = 0;
		long worldPopulation = 0L;
		float productPrice = 0.0F;
		double piValue = 0.0;
		char studentGrade = ' ';
		boolean isPremiumCustomer = true;
		
		System.out.println("--- Enter Data ---");
        System.out.println("Enter User Name: ");userName = scanner.nextLine();
        System.out.print("Enter User Age: "); userAge = scanner.nextByte();
        System.out.print("Enter Employee Count: "); employeeCount = scanner.nextShort();
        System.out.print("Enter Total Score: "); totalScore = scanner.nextInt();
        System.out.print("Enter World Population: "); worldPopulation = scanner.nextLong();
        System.out.print("Enter Product Price: "); productPrice = scanner.nextFloat();
        System.out.print("Enter PI Value: "); piValue = scanner.nextDouble();
        System.out.print("Enter Student Grade: "); studentGrade = scanner.next().charAt(0);
        System.out.print("Enter Is Premium Customer: "); isPremiumCustomer = scanner.nextBoolean();
        
        scanner.nextLine();
        
        System.out.println("Scanned Data:");
		System.out.printf("\n%-15s%-25s%-20s","Data Type","Property","Value");
		System.out.printf("\n%-15s%-25s%-20s","String","User Name",userName);
		System.out.printf("\n%-15s%-25s%-20s","byte","User Age",userAge);
		System.out.printf("\n%-15s%-25s%-20s","short","Employee Count",employeeCount);
		System.out.printf("\n%-15s%-25s%-20s","int","Total Score",totalScore);
		System.out.printf("\n%-15s%-25s%-20s","long","World Population",worldPopulation);
		System.out.printf("\n%-15s%-25s%-20s","float","Product Price",productPrice);
		System.out.printf("\n%-15s%-25s%-20s","double","PI Value",piValue);
		System.out.printf("\n%-15s%-25s%-20s","char","Student Grade",studentGrade);
		System.out.printf("\n%-15s%-25s%-20s","boolean","Is Premium Customer",isPremiumCustomer);
		scanner.close();
	}
}
