package edu.cca.john.threads.example;

public class Python extends Thread {

	@Override
	public void run() {
		System.out.println("Python Class Started!");
		for(int i=0;i<50;i++) {
			//Thread.yield();
			System.out.println(Thread.currentThread().getName() + " class in progress - " + i);
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		System.out.println("Pyton Class Completed");
	}
}
