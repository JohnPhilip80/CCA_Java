package edu.cca.john.deadlock;

public class BankAccount {
	private int accountNumber;
	private double balance;
	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public synchronized void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	// Synchronized method locks the source account instance ("this")
    public synchronized void transferTo(BankAccount destination, double amount) {
        System.out.println(Thread.currentThread().getName() + " locked source account: " + this.getAccountNumber());

        // Simulated processing delay to guarantee both threads grab their first lock
        try { Thread.sleep(50); } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName() 
                + " trying to lock destination account: " + destination.getAccountNumber());

        // Locks the destination account instance
        destination.deposit(amount);
        this.balance -= amount;
        
        System.out.println(Thread.currentThread().getName() + " completed transfer.");
    }
}
