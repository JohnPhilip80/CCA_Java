package edu.cca.john.deadlock;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Deadlock Demo");
		
		BankAccount accountA = new BankAccount(111, 1000.0);
        BankAccount accountB = new BankAccount(222, 2000.0);

        // Thread 1: Transfer from A to B (Locks A, waits for B)
        Thread thread1 = new Thread(() -> accountA.transferTo(accountB, 100.0), "Transaction-1");

        // Thread 2: Transfer from B to A (Locks B, waits for A)
        Thread thread2 = new Thread(() -> accountB.transferTo(accountA, 200.0), "Transaction-2");

        thread1.start();
        thread2.start();
		
	}

}
