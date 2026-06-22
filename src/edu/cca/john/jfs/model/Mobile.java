package edu.cca.john.jfs.model;

import java.util.Scanner;

public class Mobile {
	private Long id;
	private String brand;
	private String model;
	private Integer yearLaunched;
	private Double price;
	
	public static void showHeading() {
		System.out.printf("\n%-10s%-20s%-25s%-15s%15s\n","Id","Brand","Model","Year Launched","Price");
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYearLaunched() {
		return yearLaunched;
	}
	public void setYearLaunched(Integer yearLaunched) {
		this.yearLaunched = yearLaunched;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-20s%-25s%-15d%15.2f", this.id,this.brand,this.model,this.yearLaunched,this.price);
	}
	public void scanMobile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Id:");
		this.id = scan.nextLong();scan.nextLine();
		System.out.println("Enter Mobile Brand:");
		this.brand = scan.nextLine();
		System.out.println("Enter Mobile Model:");
		this.model = scan.nextLine();
		System.out.println("Enter Year Launched:");
		this.yearLaunched = scan.nextInt();scan.nextLine();
		System.out.println("Enter Mobile Price:");
		this.price = scan.nextDouble();scan.nextLine();
	}
}
