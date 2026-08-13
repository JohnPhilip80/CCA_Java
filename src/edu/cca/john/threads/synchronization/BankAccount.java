package edu.cca.john.threads.synchronization;

public class BankAccount {
	
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public synchronized void deposit(int amount,String thName) throws InterruptedException {
		System.out.println(thName + " deposit Rs." + amount);
		Thread.sleep(200);
		balance += amount;
		System.out.println("	Current Balance:(" + Thread.currentThread().getName() + ")" + balance);
	}
	
	public synchronized void withdraw(int amount,String thName) throws InterruptedException {
		
		if(balance >= amount) {
			System.out.println(thName + " Withdrawn Rs." + amount);
			Thread.sleep(200);
			balance -= amount;
			System.out.println("	Current Balance:(" + Thread.currentThread().getName() + ")" + balance);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
}
