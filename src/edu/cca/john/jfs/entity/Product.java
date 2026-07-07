package edu.cca.john.jfs.entity;

public abstract class Product {
	protected String id;
	protected String name;
	protected Double price;
	
	static Integer nextId=1001;
	
	public static void showHeading() {
		System.out.printf("\n%-15s%-30s%-15s%-15s%-30s\n","Id","Name","Price","Final Price","Remarks");
	}
	public Product(String name,Double price) {
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
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public static Integer getNextId() {
		return nextId;
	}
	public static void setNextId(Integer nextId) {
		Product.nextId = nextId;
	}
	public abstract Double calculateFinalPrice();
	public abstract String priceRemark();
	@Override
	public String toString() {
		return String.format("%-15s%-30s%-15.2f%-15.2f%-30s",
				this.id,
				this.name,
				this.price,
				calculateFinalPrice(),
				priceRemark()
				);
	}
}
