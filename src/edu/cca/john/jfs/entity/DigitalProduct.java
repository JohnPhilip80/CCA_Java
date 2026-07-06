package edu.cca.john.jfs.entity;

public class DigitalProduct extends Product {
	private Double discountPercentage;

	public DigitalProduct() {
		super();
		this.discountPercentage = 0.00;
	}

	public DigitalProduct(String name, Double price) {
		super(name, price);
		this.discountPercentage = 15.00;
	}

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	/*public Double calculateFinalPrice() {
		return this.price - (this.price * this.discountPercentage / 100);
	}
	public String priceRemark() {
		return "Discount Price (Less) - " + String.format("%-10.2f",(this.price * this.discountPercentage / 100));
	}*/
}
