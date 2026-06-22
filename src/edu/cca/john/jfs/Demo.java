//Sort Numbers
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] numbers = {8, 2, 9, 7, 33, 3, 87};
		int i=0,j=0,temp=0;
		System.out.println("Numbers before Sort:");
		for(i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		
		for(i=0;i<numbers.length;i++) {
			for(j=i+1;j<numbers.length; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		System.out.println("\nNumbers after Sort:");
		for(i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
