package edu.cca.john.jfs.entity;

public class PhysicalProduct extends Product {
	private Double weight;
	private Float shippingCostPerKG;
	public PhysicalProduct() {
		super();
		this.weight = 0.00;
		this.shippingCostPerKG = 0.00F;
	}
	public PhysicalProduct(String name, Double price, Double weight) {
		super(name, price);
		this.weight = weight;
		this.shippingCostPerKG = 650.00F;
	}
	public Double calculateFinalPrice() {
		return this.price + (this.weight * this.shippingCostPerKG);
	}
	public String priceRemark() {
		return "Shipping Charge (Extra) - " + String.format("%-10.2f",(this.weight * this.shippingCostPerKG));
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Float getShippingCostPerKG() {
		return shippingCostPerKG;
	}
	public void setShippingCostPerKG(Float shippingCostPerKG) {
		this.shippingCostPerKG = shippingCostPerKG;
	}
	
}
