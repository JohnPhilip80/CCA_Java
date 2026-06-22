//Java Arrays
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		/*
		 * An array is a collection of elements of the same type placed in contiguous memory locations 
		 * that can be individually referenced by using an index to a unique identifier.
		 * 
		 * Datatype variable_name [ ] ;
     		(or)
     	 * Datatype [ ] variable_name ;
		 */
		
		String[] trainerNames = {
				"John Philip",
				"Balamurugan", 
				"Sumaiya", 
				"Durka Ramesh", 
				"Subashini"
				};
		long[] trainerEmpCodes = {
				2019250324l,
				2016240301l,
				2022250502l,
				2030250728l,
				2035250901l
				};
		int[] trainerTravelCount = {25,30,20,28,12};
		float[] trainerExperiences = {1.5f,3.5f,2.5f,2.0f,0.5f};
		double[] trainerSalaries = {30000.00,35000.00,25000.00,28000.00,22000.00};
		
		trainerNames[2] = "Sumaiya Chan";
		
		System.out.printf("\n%-15s%-15s%-15s%-20s%-15s","Name","Employee Code","Travel Days", "Experience(Years)", "Salary");
		
		/*System.out.printf("\n%-15s%-15d%-15d%-20.1f%-15.2f",trainerNames[0],trainerEmpCodes[0],trainerTravelCount[0],trainerExperiences[0],trainerSalaries[0]);
		System.out.printf("\n%-15s%-15d%-15d%-20.1f%-15.2f",trainerNames[1],trainerEmpCodes[1],trainerTravelCount[1],trainerExperiences[1],trainerSalaries[1]);
		System.out.printf("\n%-15s%-15d%-15d%-20.1f%-15.2f",trainerNames[2],trainerEmpCodes[2],trainerTravelCount[2],trainerExperiences[2],trainerSalaries[2]);
		System.out.printf("\n%-15s%-15d%-15d%-20.1f%-15.2f",trainerNames[3],trainerEmpCodes[3],trainerTravelCount[3],trainerExperiences[3],trainerSalaries[3]);
		*/
		
		for(int i=0;i<trainerNames.length;i++) {
			System.out.printf("\n%-15s%-15d%-15d%-20.1f%-15.2f",
					trainerNames[i],
					trainerEmpCodes[i],
					trainerTravelCount[i],
					trainerExperiences[i],
					trainerSalaries[i]);
		}
		
		double totalSalary = 0.0;
		double averageSalary = 0.0;
		
		for(int i=0;i<trainerSalaries.length;i++) {
			totalSalary = totalSalary + trainerSalaries[i];
			//totalSalary += trainerSalaries[i];
		}
		averageSalary = totalSalary / trainerSalaries.length;
		
		System.out.println("\nTotal (Sum) Salary:" + totalSalary);
		System.out.println("\nAverage (Avg) Salary:" + averageSalary);
	}
}
