package edu.cca.john.jfs;

public class Demo {

	public static void main(String[] args) {
		int a=10;
		int b=3;
		System.out.println("Arithmetic Operations");
		System.out.printf("\n%-15s%-5s%-5s%-5s%-5s%-5s","Addition",a,"+",b,"=",a+b);
		System.out.printf("\n%-15s%-5s%-5s%-5s%-5s%-5s","Subtraction",a,"-",b,"=",a-b);
		System.out.printf("\n%-15s%-5s%-5s%-5s%-5s%-5s","Multiplication",a,"*",b,"=",a*b);
		System.out.printf("\n%-15s%-5s%-5s%-5s%-5s%-5s","Division",a,"/",b,"=",a/b);
		System.out.printf("\n%-15s%-5s%-5s%-5s%-5s%-5s","Modulus",a,"%",b,"=",a%b);
	}
}
