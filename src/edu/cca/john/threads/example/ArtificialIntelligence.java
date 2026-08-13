package edu.cca.john.threads.example;

public class ArtificialIntelligence extends Thread {

	@Override
	public void run() {
		System.out.println("AI Class Started!");
		for(int i=0;i<50;i++) {
			System.out.println("AI class in progress - " + i);
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
		System.out.println("AI Class Completed");
		
	}

}
