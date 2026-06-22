//CRUD Operations with ArrayList
package edu.cca.john.jfs;

import java.util.Scanner;

import edu.cca.john.jfs.service.MobileService;

public class Demo {
	public static void main(String[] args) {
		MobileService service = new MobileService();
		Scanner scanner = new Scanner(System.in);
		byte choice = 0;
		System.out.println("Welcome to Mobile CRUD Operations.");
		do {
			System.out.println("1.Create 2.Read All 3.Read One 4.Update 5.Delete 6.Exit. Enter your choice:");
			choice = scanner.nextByte(); scanner.nextLine();
			switch(choice) {
			case 1:
				service.createMobile();break;
			case 2:
				service.readMobiles();break;
			case 3:
				service.readMobile();break;
			case 4:
				service.updateMobile();break;
			case 5:
				service.deleteMobile();break;
			default:
				choice = 6;
			}
		}while(choice !=6);
		System.out.println("Program Ends Here!");
	}
}
