package edu.cca.john.jfs.entity;

public class PhysicalProduct extends Product {
	private Double weight;
	private static final Float shippingCostPerKG = 80.00f;
	
	public PhysicalProduct(String name, Double price, Double weight) {
		super(name, price);
		this.weight = weight;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Double calculateFinalPrice() {
		return this.price + (this.weight * shippingCostPerKG);
	}
	public String priceRemark() {
		return "Shipping Charge (Extra) - " + String.format("%-10.2f",(this.weight * shippingCostPerKG));
	}
}
