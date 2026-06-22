//Auto Increment
package edu.cca.john.jfs;

import edu.cca.john.jfs.model.Mobile;

public class Demo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00);
		Mobile m2 = new Mobile("Samsung","S25",2023,92800.00);
		Mobile m3 = new Mobile("Motorola","Edge 5",2023,15900.00);
		Mobile m4 = new Mobile();
		Mobile m5 = new Mobile(m3);
		
		Mobile.showHeading();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
	}
}
