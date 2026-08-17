package edu.cca.john.threadcomm;

import java.util.LinkedList;
import java.util.Queue;

public class SharedBuffer {
	 private Queue<Integer> orders = new LinkedList<>();    
	 private final int CAPACITY = 5;
	 
	 public synchronized void produce(int orderId) throws InterruptedException {       
		 while (orders.size() == CAPACITY) {            
			 System.out.println("Buffer Full. Producer Waiting...");            
			 wait();        
			}        
		 orders.add(orderId);        
		 System.out.println("Order Produced : " + orderId);        
		 notifyAll();    
	}
	public synchronized void consume() throws InterruptedException {        
		while (orders.isEmpty()) {            
			System.out.println("Buffer Empty. Consumer Waiting...");            
			wait();        
		}        
		int orderId = orders.poll();        
		System.out.println("Order Processed : " + orderId);        
		notifyAll();    
	}
}
