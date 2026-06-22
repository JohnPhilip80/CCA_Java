//Math Operations 
package edu.cca.john.jfs;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Minimum Value: " + Math.min(10,3));
		System.out.println("Maximum Value: " + Math.max(10,3));
		System.out.println("Square Root: " + Math.sqrt(121));
		System.out.println("Absolute Value: " + Math.abs(-10.23));
		System.out.println("Power Of: " + Math.pow(2,8));
		System.out.println("Round Number: " + Math.round(4.5));
		System.out.println("Ceil Number: " + Math.ceil(4.1));
		System.out.println("Floor Number: " + Math.floor(4.9));
		System.out.printf("%-20s%-10.2f","Random Value: " ,Math.random() * 101);
	}
}
