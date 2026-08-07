package edu.cca.john.jfs.service;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import edu.cca.john.jfs.blueprint.ServiceCRUD;
import edu.cca.john.jfs.entity.Mobile;
import edu.cca.john.jfs.repositories.SetRepository;

public class SetService implements ServiceCRUD {

	private SetRepository repo;
	private Scanner scanner;
	
	public SetService() {
		repo= new SetRepository();
		scanner = new Scanner(System.in);
	}
	
	@Override
	public void create() {
		Mobile mob = new Mobile();
		mob.scanMobile();
		repo.create(mob);
		System.out.println("Mobile Created Successfully");
	}

	@Override
	public void readAll() {
		Set<Mobile> mobiles = repo.readAll();
		Mobile.showHeading();
	
		Iterator<Mobile> iter = mobiles.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	@Override
	public void readOne() {
		Long id;
		System.out.println("Enter Mobile Id:");
		id= scanner.nextLong();scanner.nextLine();
		
		Mobile mobile = repo.readOne(id);
		if(mobile != null) {
			Mobile.showHeading();
			System.out.println(mobile);
		}
		else {
			System.out.println("Mobile Id Not Found!");
		}
	}

	@Override
	public void update() {
		Long id;
		System.out.println("Enter Mobile Id to Update:");
		id= scanner.nextLong();scanner.nextLine();
		Mobile mobile = repo.readOne(id);
		if(mobile != null) {
			System.out.println("Enter Update Mobile data:");
			mobile.scanMobile();
			repo.update(mobile);
		}
		else {
			System.out.println("Mobile Id Not Found!");
		}
	}

	@Override
	public void delete() {
		Long id;
		System.out.println("Enter Mobile Id to Delete:");
		id= scanner.nextLong();scanner.nextLine();
		Mobile mobile = repo.readOne(id);
		if(mobile != null) {
			repo.delete(id);
		}
		else {
			System.out.println("Mobile Id Not Found!");
		}
	}

}
