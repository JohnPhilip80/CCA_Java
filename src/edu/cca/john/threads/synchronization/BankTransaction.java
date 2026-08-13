package edu.cca.john.threads.synchronization;

public class BankTransaction extends Thread {
	private BankAccount account;
	private TransactionType transactionType;
	private int amount;
	
	public BankTransaction(String name,BankAccount account,TransactionType transactionType,int amount) {
		super(name);
		this.account = account;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	@Override
	public void run() {
		if(this.transactionType == TransactionType.DEPOSIT)
			try {
				this.account.deposit(amount,this.getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				this.account.withdraw(amount,this.getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
