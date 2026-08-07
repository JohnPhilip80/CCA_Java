package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Engine;

public class GasEngine implements Engine {
	@Override
	public void start() {
		System.out.println("Gas Engine Started..");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Gas Engine Accelerated..");
		
	}

	@Override
	public void stop() {
		System.out.println("Gas Engine Stopped..");
		
	}
}
