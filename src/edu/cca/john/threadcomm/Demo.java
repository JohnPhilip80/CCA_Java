package edu.cca.john.threadcomm;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Test");
		SharedBuffer buffer = new SharedBuffer();        
		Producer producer = new Producer(buffer);        
		Consumer consumer = new Consumer(buffer);        
		producer.start();        
		consumer.start();

	}

}
