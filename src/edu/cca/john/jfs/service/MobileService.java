package edu.cca.john.jfs.service;

import java.util.List;
import java.util.Scanner;

import edu.cca.john.jfs.model.Mobile;
import edu.cca.john.jfs.repository.MobileRepository;

public class MobileService {
	private MobileRepository repo;
	private Scanner scanner;
	public MobileService() {
		repo = new MobileRepository();
		scanner = new Scanner(System.in);
	}
	public void createMobile() {
		Mobile mobile = new Mobile();
		System.out.println("Enter Mobile Brand:");
		mobile.setBrand(scanner.nextLine());
		System.out.println("Enter Mobile Model:");
		mobile.setModel(scanner.nextLine());
		System.out.println("Enter Year Launched:");
		mobile.setYearLaunched(scanner.nextInt());scanner.nextLine();
		System.out.println("Enter Mobile Price:");
		mobile.setPrice(scanner.nextDouble());scanner.nextLine();
		Long id = repo.createMobile(mobile);
		System.out.println("New Mobile " + id + " Created Successfully!");
	}
	public void readMobiles() {
		List<Mobile> mobiles = repo.readMobiles();
		if(mobiles.size() > 0)
		{
			Mobile.showHeading();
			for(int i=0;i<mobiles.size();i++)
				System.out.println(mobiles.get(i));
		}
		else
		{
			System.out.println("No Data Available!");
			
		}
	}
	public void readMobile()
	{
		System.out.println("Enter Mobile Id:");
		Long id = scanner.nextLong();scanner.nextLine();
		Mobile mobile = repo.readMobile(id);
		if(mobile != null) {
			Mobile.showHeading();
			System.out.println(mobile);
		}
		else
			System.out.println("Mobile Id " + id + " not found!");
	}
	
	public void updateMobile() {
		System.out.println("Enter Mobile Id to update:");
		Long id = scanner.nextLong();scanner.nextLine();
		System.out.println("Enter Updated Brand:");
		String brand = scanner.nextLine();
		System.out.println("Enter Updated Model:");
		String model = scanner.nextLine();
		System.out.println("Enter Updated Year Launched:");
		Integer yearLaunched = scanner.nextInt();scanner.nextLine();
		System.out.println("Enter Updated Price:");
		Double price = scanner.nextDouble(); scanner.nextLine();
		Mobile mobile = new Mobile(id,brand,model,yearLaunched,price);
		if(repo.updateMobile(mobile))	
			System.out.println("Mobile Updated Successfully!");
		else
			System.out.println("Mobile Id not found!");
	}
	
	public void deleteMobile() {
		System.out.println("Enter Mobile Id to delete:");
		Long id = scanner.nextLong();scanner.nextLine();
		if(repo.deleteMobile(id))
			System.out.println("Mobile Deleted Successfully!");
		else
			System.out.println("Mobile Id " + id + " not found!");
	}
}
