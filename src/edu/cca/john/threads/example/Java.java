package edu.cca.john.threads.example;

public class Java extends Thread {

	@Override
	public void run() {
		System.out.println("Java Class Started!");
		for(int i=0;i<50;i++) {
			System.out.println("Java class in progress - " + i);
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		System.out.println("Java Class Completed");
	}
}
