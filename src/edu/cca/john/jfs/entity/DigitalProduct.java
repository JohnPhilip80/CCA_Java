package edu.cca.john.jfs.entity;

public class DigitalProduct extends Product {
	private static final Double discountPercentage = 30.00;

	public DigitalProduct(String name, Double price) {
		super(name, price);
	}
	public Double calculateFinalPrice() {
		return this.price - (this.price * discountPercentage / 100);
	}
	public String priceRemark() {
		return "Discount Price (Less) - " + String.format("%-10.2f",(this.price * discountPercentage / 100));
	}
}
