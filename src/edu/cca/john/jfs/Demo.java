//CRUD Operations with ArrayList
package edu.cca.john.jfs;

import java.util.Scanner;

import edu.cca.john.jfs.service.ListService;
/*import edu.cca.john.jfs.service.MapService;
import edu.cca.john.jfs.service.QueueService;
import edu.cca.john.jfs.service.SetService;
import edu.cca.john.jfs.service.StackService;
*/
public class Demo {
	public static void main(String[] args) {
		ListService service = new ListService();
		//MapService service = new MapService();
		//QueueService service = new QueueService();
		//SetService service = new SetService();
		//StackService service = new StackService();
		Scanner scanner = new Scanner(System.in);
		byte choice = 0;
		System.out.println("Welcome to Mobile CRUD Operations.");
		do {
			System.out.println("1.Create 2.Read All 3.Read One 4.Update 5.Delete 6.Sort 7.Exit. Enter your choice:");
			choice = scanner.nextByte(); scanner.nextLine();
			switch(choice) {
			case 1:
				service.create();break;
			case 2:
				service.readAll();break;
			case 3:
				service.readOne();break;
			case 4:
				service.update();break;
			case 5:
				service.delete();break;
			case 6:
				service.sort();break;
			default:
				choice = 7;
			}
		}while(choice !=6);
		System.out.println("Program Ends Here!");
		scanner.close();
	}
}