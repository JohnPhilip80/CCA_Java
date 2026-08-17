package edu.cca.john.threadcomm;

public class Consumer extends Thread {
	 private SharedBuffer buffer;    
	 public Consumer(SharedBuffer buffer) {        
		 this.buffer = buffer;    
	}
	 @Override    
	 public void run() {        
		 try {            
			 for (int i = 1; i <= 20; i++) {                
				 buffer.consume();                
				 Thread.sleep(1000);            
			 }        
		 } catch (InterruptedException e) {           
			 e.printStackTrace();        
		}    
	}
}
