package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Engine;

public class PetrolEngine implements Engine {
	@Override
	public void start() {
		System.out.println("Petrol Engine Started..");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Petrol Engine Accelerated..");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine Stopped..");
		
	}
}
