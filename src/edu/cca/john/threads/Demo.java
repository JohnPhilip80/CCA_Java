package edu.cca.john.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import edu.cca.john.threads.example.ArtificialIntelligence;
import edu.cca.john.threads.example.Java;
import edu.cca.john.threads.example.Python;
import edu.cca.john.threads.synchronization.BankAccount;
import edu.cca.john.threads.synchronization.BankTransaction;
import edu.cca.john.threads.synchronization.TransactionType;

public class Demo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//threadDemo();
		//synchronizationDemo();
		executorServiceDemo();
		
	}
	public static void executorServiceDemo() throws InterruptedException, ExecutionException {
		BankAccount account = new BankAccount(10000);
		System.out.println("Initial Balance = Rs." + account.getBalance());
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(new BankTransaction("UPI",account,TransactionType.DEPOSIT,2000)).get();
		service.submit(new BankTransaction("ATM",account,TransactionType.WITHDRAW,3000)).get();
		service.submit(new BankTransaction("Bank",account,TransactionType.DEPOSIT,1000)).get();
		service.submit(new BankTransaction("Bank",account,TransactionType.WITHDRAW,4000)).get();
		service.submit(new BankTransaction("Online",account,TransactionType.DEPOSIT,1500)).get();
		service.shutdown();
		System.out.println("------Transactions Completed----");
		System.out.println("Final Balance = Rs." + account.getBalance());
	}
	public static void synchronizationDemo() throws InterruptedException {
		BankAccount account = new BankAccount(10000);
		System.out.println("Initial Balance = Rs." + account.getBalance());
		BankTransaction t1,t2,t3,t4,t5;
		
		t1 = new BankTransaction("UPI",account,TransactionType.DEPOSIT,2000);
		t2 = new BankTransaction("ATM",account,TransactionType.WITHDRAW,3000);
		t3 = new BankTransaction("Bank",account,TransactionType.DEPOSIT,1000);
		t4 = new BankTransaction("Bank",account,TransactionType.WITHDRAW,4000);
		t5 = new BankTransaction("Online",account,TransactionType.DEPOSIT,1500);
		
		t1.start();t2.start();t3.start();t4.start();t5.start();
		
		t1.join();t2.join();t3.join();t4.join();t5.join();
		
		
		//t1.run();t2.run();t3.run();t4.run();t5.run();
		
		System.out.println("------Transactions Completed----");
		System.out.println("Final Balance = Rs." + account.getBalance());
	}
	public static void threadDemo()throws InterruptedException {
		/*pythonClass();
		javaClass();
		aiClass();
		*/
		//System.out.println("Main Thread Started");
		
		/*Thread t1 = new Thread(new Python());
		Thread t2 = new Thread(new Java());
		Thread t3 = new Thread(new ArtificialIntelligence());
		
		t1.start();
		t2.start();
		t3.start();
		*/
		/*
		Thread t1 = new Thread(() -> {
			System.out.println("Python Class Started!");
			for(int i=0;i<5;i++) {
				System.out.println("Python class in progress");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Pyton Class Completed");
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("Java Class Started!");
			for(int i=0;i<5;i++) {
				System.out.println("Java class in progress");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("Java Class Completed");
		});
		
		t1.start();
		t2.start();
		*/
		//System.out.println("Main Thread Started");
		System.out.println(Thread.currentThread().getName());
		
		Python python = new Python();
		Java java = new Java();
		ArtificialIntelligence ai = new ArtificialIntelligence();
		
		python.setName("Python Thread");
		java.setName("Java Thread");
		ai.setName("AI Thread");
			
		
		/*System.out.println(python.getPriority());
		System.out.println(java.getPriority());
		System.out.println(ai.getPriority());
		*/
		//ai.setPriority(10);
		
		/*System.out.println(python.getName());
		System.out.println(java.getName());
		System.out.println(ai.getName());
		*/
		
		System.out.println(python.getState());
		System.out.println(java.getState());
		System.out.println(ai.getState());
		
		
		python.start();
		java.start();
		ai.start();
		
		System.out.println(python.getState());
		System.out.println(java.getState());
		System.out.println(ai.getState());

		//int a = 20/0;
		java.join();
		python.join();
		ai.join();
		System.out.println("Main Thread Completed");
		
		System.out.println(python.isAlive());
		System.out.println(java.isAlive());
		System.out.println(ai.isAlive());
	}
	public static void pythonClass() throws InterruptedException {
		System.out.println("Python Class Started!");
		for(int i=0;i<5;i++) {
			System.out.println("Python class in progress");
			Thread.sleep(1000);
		}
		System.out.println("Pyton Class Completed");
	}
	public static void javaClass() throws InterruptedException {
		System.out.println("Java Class Started!");
		for(int i=0;i<5;i++) {
			System.out.println("Java class in progress");
			Thread.sleep(1000);
		}
		System.out.println("Java Class Completed");
	}
	public static void aiClass() throws InterruptedException {
		System.out.println("AI Class Started!");
		for(int i=0;i<5;i++) {
			System.out.println("AI class in progress");
			Thread.sleep(1000);
		}
		System.out.println("AI Class Completed");
}

}
