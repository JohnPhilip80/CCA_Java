//2D Array
package edu.cca.john.jfs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		/*
		 * 2D array is organized as matrices which can be represented as the collection of rows and column.
		 * It is possible to define an array with more than one dimension.
		 * multidimensional array is accessed by specifying an index for each dimension
		 * Datatype variable_name [ ] [ ] ;
		 */
		//Two Dimension array in Java
        int a[][] = {
                {10, 20, 30, 9},
                {40, 50, 60, 8},
                {70, 80, 90, 7}
        };
        a[1][2] = 100;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
	}
}
