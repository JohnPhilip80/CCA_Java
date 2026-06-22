//Private, Public, Getters, Setters, toString, static method, instance method
package edu.cca.john.jfs;

import edu.cca.john.jfs.model.Mobile;

public class Demo {
	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		Mobile m3 = new Mobile();
		Mobile m4 = new Mobile();
		
		m1.setId(2001L);
		m1.setBrand("Apple");
		m1.setModel("IPhone 16 Pro Max");
		m1.setYearLaunched(2026);
		m1.setPrice(125700.00);
		
		m2.setId(2002L);
		m2.setBrand("Samsung");
		m2.setModel("S25");
		m2.setYearLaunched(2025);
		m2.setPrice(92800.00);
		
		m3.setId(2003L);
		m3.setBrand("Motorola");
		m3.setModel("Edge 5");
		m3.setYearLaunched(2023);
		m3.setPrice(15900.00);
		
		m4.scanMobile();
		
		//System.out.printf("\n%-10s%-20s%-25s%-15s%15s","Id","Brand","Model","Year Launched","Price");
		//System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m1.getId(),m1.getBrand(),m1.getModel(),m1.getYearLaunched(),m1.getPrice());
		//System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m2.getId(),m2.getBrand(),m2.getModel(),m2.getYearLaunched(),m2.getPrice());
		//System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m3.getId(),m3.getBrand(),m3.getModel(),m3.getYearLaunched(),m3.getPrice());
		//System.out.printf("\n%-10d%-20s%-25s%-15d%15.2f",m4.getId(),m4.getBrand(),m4.getModel(),m4.getYearLaunched(),m4.getPrice());		
		
		Mobile.showHeading();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
}
