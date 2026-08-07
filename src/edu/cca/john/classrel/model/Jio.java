package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Browsable;
import edu.cca.john.classrel.blueprint.Callable;
import edu.cca.john.classrel.blueprint.Sim;

public class Jio implements Callable,Browsable {

	@Override
	public void call() {
		System.out.println("Calling using Jio Sim");
		
	}

	@Override
	public void browse() {
		System.out.println("Browsing using Jio Sim");
		
	}
	@Override
	public String toString() {
		return "Jio Sim";
	}
}
