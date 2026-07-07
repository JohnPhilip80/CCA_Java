package edu.cca.john.jfs.entity;

public class CourseProduct extends Product {
	private Float cgpa;
	
	public CourseProduct(String name, Double price, Float cgpa) {
		super(name, price);
		this.cgpa = cgpa;
	}
	
	public Float getCgpa() {
		return cgpa;
	}

	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}

	public static Double getDiscountPercentage(Float cgpa) {
		if(cgpa >= 9.0)
			return 30.00;
		else if(cgpa >= 8.0)
			return 20.00;
		else if(cgpa >= 7.5)
			return 10.00;
		else if(cgpa >= 6.0)
			return 5.00;
		else 
			return 0.0;
	}
	@Override
	public Double calculateFinalPrice() {
		return this.price - (this.price * getDiscountPercentage(this.cgpa) / 100);
	}
	@Override
	public String priceRemark() {
		return "CGPA Discount (Less) - " + String.format("%-10.2f",(this.price * getDiscountPercentage(this.cgpa) / 100));
	}
	
}
