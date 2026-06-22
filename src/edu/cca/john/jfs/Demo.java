package edu.cca.john.jfs;

public class Demo {

	public static void main(String[] args) {
		/*
		++ (Increment): Increases value by 1.
		-- (Decrement): Decreases value by 1
		Post Increment & Post Decrement
		Pre Increment & Pre Decrement
		*/
		int count = 10;
		/*count++; // count is now 11 (count = count + 1 / count += 1)
		count--; // count goes back to 10
		System.out.println("Unary Operators");
		System.out.println("Count = " + count);
		*/
		int answer = 0;
		
		answer = count-- + --count;
		
		System.out.println("Count = " + count);
		System.out.println("Answer = " + answer);
	}
}
