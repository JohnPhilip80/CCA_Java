//CRUD Operations with ArrayList
package edu.cca.john.jfs;

import java.util.ArrayList;
import java.util.List;

import edu.cca.john.jfs.entity.CourseProduct;
import edu.cca.john.jfs.entity.DigitalProduct;
import edu.cca.john.jfs.entity.PhysicalProduct;
import edu.cca.john.jfs.entity.Product;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Abstraction & Polymorphism in Java!");
		List<Product> products = new ArrayList<Product>();
		products.add(new PhysicalProduct("Lenova Laptop",42800.00,2.5));
		products.add(new PhysicalProduct("Samsung Mobile",24400.00,0.7));
		products.add(new PhysicalProduct("Bluetooth Mouse",2500.00,0.6));
		products.add(new DigitalProduct("Nord VPN Subscription",5800.00));
		products.add(new DigitalProduct("Antivirus Software",8200.00));
		products.add(new DigitalProduct("Windows 11 Pro",3200.00));
		products.add(new CourseProduct("Java Full Stack",20000.00,9.2f));
		products.add(new CourseProduct("Java Full Stack",20000.00,8.2f));
		products.add(new CourseProduct("Java Full Stack",20000.00,7.8f));
		products.add(new CourseProduct("Java Full Stack",20000.00,6.2f));
		products.add(new CourseProduct("Java Full Stack",20000.00,5.2f));
		Product.showHeading();
		for(Product prod:products)
			System.out.println(prod);
	}
} 