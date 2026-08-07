package edu.cca.john.classrel.model;

import edu.cca.john.classrel.blueprint.Browsable;
import edu.cca.john.classrel.blueprint.Callable;
import edu.cca.john.classrel.blueprint.Sim;

public class BSNL implements Callable,Browsable {

	@Override
	public void call() {
		System.out.println("Calling using BSNL Sim");
		
	}

	@Override
	public void browse() {
		System.out.println("Browsing using BSNL Sim");
		
	}
	@Override
	public String toString() {
		return "BSNL Sim";
	}
}
