package edu.cca.john.jfs;

public class Demo {

	public static void main(String[] args) {
		String userName = "John Philip";
		byte userAge = 30;// 8 bits
		short employeeCount = 1500;//16 bits
		int totalScore = 214500; //32 bits
		long worldPopulation = 80000000000L;//64 bits
		float productPrice = 4500.50F; //32 bits, upto 7 decimal digits
		double piValue = 3.141592653589793; //64 bits, upto 15 decimal digits
		char studentGrade = 'A'; //16 bits
		boolean isPremiumCustomer = true; // 1 bit (true / false)
		
		/*System.out.println("User Name (String): " + userName);
		System.out.println("User Age (byte): " + userAge);
		System.out.println("Employee Count (short): " + employeeCount);
		System.out.println("Total Score (int): " + totalScore);
		System.out.println("World Population (long): " + worldPopulation);
		System.out.println("Product Price (float): " + productPrice);
		System.out.println("PI Value (double): " + piValue);
		System.out.println("Student Grade (char): " + studentGrade);
		System.out.println("Is Premium Customer (boolean): " + isPremiumCustomer);*/
		
		System.out.println("Data Types");
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
	}
}
