//Classes And Objects
package edu.cca.john.jfs;

import edu.cca.john.jfs.model.Mobile;

public class Demo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		
		m1.id = 2001L;
		m1.brand = "Apple";
		m1.model = "IPhone 16 Pro Max";
		m1.yearLaunched = 2026;
		m1.price = 125700.00;
		
		m2.id = 2002L;
		m2.brand = "Samsung";
		m2.model = "S25";
		m2.yearLaunched = 2025;
		m2.price = 92800.00;
		
		m3.id = 2003L;
		m3.brand = "Motorola";
		m3.model = "Edge 5";
		m3.yearLaunched = 2023;
		m3.price = 15900.00;
		
		//System.out.println(m1.id + " -- " + m1.brand + " -- " + m1.model + " -- " + m1.yearLaunched + " -- " + m1.price);
		//System.out.println(m2.id + " -- " + m2.brand + " -- " + m2.model + " -- " + m2.yearLaunched + " -- " + m2.price);
		//System.out.println(m3.id + " -- " + m3.brand + " -- " + m3.model + " -- " + m3.yearLaunched + " -- " + m3.price);
		
		System.out.printf("\n%-10s%-20s%-25s%-15s%15s","Id","Brand","Model","Year Launched","Price");
		System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m1.id,m1.brand,m1.model,m1.yearLaunched,m1.price);
		System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m2.id,m2.brand,m2.model,m2.yearLaunched,m2.price);
		System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m3.id,m3.brand,m3.model,m3.yearLaunched,m3.price);
	}
}
