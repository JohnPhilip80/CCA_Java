//Ternary Operators
package edu.cca.john.jfs;

public class Demo {

	public static void main(String[] args) {
		// (condition part)?(true part):(false part)
		// condition ? expression_if_true : expression_if_false;
		int age = 10;
		String status = (age >= 18) ? "Adult" : "Minor"; 
		System.out.println("Ternary Operators:");
		System.out.println(status); // Prints "Adult"
	}
}
