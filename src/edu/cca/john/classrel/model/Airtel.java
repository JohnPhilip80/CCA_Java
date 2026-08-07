package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Browsable;
import edu.cca.john.classrel.blueprint.Callable;
import edu.cca.john.classrel.blueprint.Sim;

public class Airtel implements Callable,Browsable {

	@Override
	public void call() {
		System.out.println("Calling using Airtel Sim");
		
	}

	@Override
	public void browse() {
		System.out.println("Browsing using Airtel Sim");
		
	}

	@Override
	public String toString() {
		return "Airtel Sim";
	}
	
	

}
