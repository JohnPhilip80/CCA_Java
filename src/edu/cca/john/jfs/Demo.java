//Array of Objects
package edu.cca.john.jfs;

import edu.cca.john.jfs.model.Mobile;

public class Demo {
	public static void main(String[] args) {
		
		
		Mobile[] mobiles = new Mobile[6];
		mobiles[0] = new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00);
		mobiles[1] = new Mobile("Samsung","S25",2023,92800.00);
		mobiles[2] = new Mobile("Motorola","Edge 5",2023,15900.00);
		mobiles[3] = new Mobile();
		mobiles[4] = new Mobile(mobiles[2]);
		mobiles[5] = new Mobile();
		
		mobiles[3].setBrand("Redmi");
		mobiles[3].setModel("Note 6");
		mobiles[3].setYearLaunched(2022);
		mobiles[3].setPrice(18250.00);
		
		mobiles[4].setModel("Edge 6");
		mobiles[4].setYearLaunched(2024);
		mobiles[4].setPrice(17250.00);
		
		mobiles[5].scanMobile();
		
		
		
		/*
		Mobile[] mobiles = {
				new Mobile("Apple","IPhone 16 Pro Max",2026,125700.00),
				new Mobile("Samsung","S25",2023,92800.00),
				new Mobile("Motorola","Edge 5",2023,15900.00),
				new Mobile("Motorola","Edge 6",2024,17250.00),
				new Mobile("Oppo","F31",2024,24700.00)
		};*/
		
				
		Mobile.showHeading();
		/*System.out.println(mobiles[0]);
		System.out.println(mobiles[1]);
		System.out.println(mobiles[2]);
		System.out.println(mobiles[3]);
		System.out.println(mobiles[4]);*/
		for(int i=0;i<mobiles.length;i++) {
			System.out.println(mobiles[i]);
		}
	}
}
