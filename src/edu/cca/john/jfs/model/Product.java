package edu.cca.john.jfs.model;

public class Product {
	private String id;
	private String name;
	private Double price;
	
	static Integer nextId=1001;
	
	public static void showHeading() {
		System.out.printf("\n%-15s%-30s%-15s\n","Id","Name","Price");
	}
	public Product() {
		this.id = "P" + nextId;
		nextId++;
		this.name = "";
		this.price =0.0; 
	}
	public Product(String id, String name, Double basePrice) {
		this.id = id;
		this.name = name;
		this.price = basePrice;
	}
	public Product(String name, Double price) {
		this.id = "P" + nextId;
		nextId++;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBasePrice() {
		return price;
	}
	public void setBasePrice(Double basePrice) {
		this.price = basePrice;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-30s%-15.2f",
				this.id,
				this.name,
				this.price
				);
	}
}
