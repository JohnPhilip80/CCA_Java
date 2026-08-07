package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Sim;

public class Mobile {
	private String brand;
	private String model;
	private Sim sim;
	
	public Mobile() {
		
	}
	
	public Mobile(String brand, String model, Sim sim) {
		super();
		this.brand = brand;
		this.model = model;
		this.sim = sim;
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

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return brand + " - " + model + " - " + sim ;
	}
	
	
	
}
