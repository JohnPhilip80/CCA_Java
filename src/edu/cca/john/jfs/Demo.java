package edu.cca.john.jfs;

public class Demo {

	public static void main(String[] args) {
		/*
		&& (Logical AND): Returns true if both conditions are true.
		|| (Logical OR): Returns true if at least one condition is true.
		! (Logical NOT): Reverses the boolean value
		*/
		boolean eligibleForVote = true;
		boolean haveVoterId = false;
		
		System.out.println("Logical Operators");
		System.out.println(eligibleForVote && haveVoterId); // false
		System.out.println(eligibleForVote || haveVoterId); // true
		System.out.println(!haveVoterId);           // true
	}
}
