package edu.cca.john.threadcomm;

public class Producer extends Thread {
	 private SharedBuffer buffer;    
	 public Producer(SharedBuffer buffer) {        
		 this.buffer = buffer;    
	 }    
	 @Override    
	 public void run() {        
		 try {            
			 for (int i = 1; i <= 20; i++) {                
				 buffer.produce(i);
				 Thread.sleep(500);
			 }
		 }catch (InterruptedException e) {            
			 e.printStackTrace();
		 }
	 }
}
