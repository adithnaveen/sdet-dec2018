package com.training.sdet.day2;

public class Account implements Comparable<Account>{
	private int accountId; 
	private String name; 
	private double balance;
	
	private static int count=100; 
	
	public Account(String name, double balance) {
		super();
		this.accountId = count ++; 
		this.name = name;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public String getName() {
		return name;
	}

	public static int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		// return  o.getAccountId() - this.getAccountId();
//		return this.getName().compareTo(o.getName());
		return o.getName().compareTo(this.getName());
	}

	
	
}
