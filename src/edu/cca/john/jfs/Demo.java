//Jagged Array
package edu.cca.john.jfs;

public class Demo {
	public static void main(String[] args) {
		/*
		 *  jagged array is an array of arrays such that member arrays can be of different row sizes and column sizes
		 *  Jagged subarrays may also be null
		 */
		//Jagged Array using For Loop in Java Programming
        int a[][] = {
                {10, 20, 30, 40},//4
                {10, 20, 30},//3
                {10, 20, 30,40, 50}//5
        };
 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
	}
}
