package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Engine;

public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Electric Engine Started..");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Electric Engine Accelerated..");
		
	}

	@Override
	public void stop() {
		System.out.println("Electric Engine Stopped..");
		
	}

}
