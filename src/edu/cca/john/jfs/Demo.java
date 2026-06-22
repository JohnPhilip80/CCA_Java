//Swap Numbers
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int a=8;
		int b=3;
		
		System.out.println("Before Swapping: a=" + a + ",b=" + b);
		
		/*int t =0;
		t=a;//t=8
		a=b;//a=3
		b=t;//b=8
		*/
		a=a*b;// a= 11
		b=a/b;// b= 8
		a=a/b;// a= 3
		
		System.out.println("After Swapping: a=" + a + ",b=" + b);
	}
}
