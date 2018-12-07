package com.training.sdet.day1;

public class AccountImpl {
	public static void main(String[] args) {
		Account harryAccount ;
		
		// its in heap 
		harryAccount = new Account();
		
		harryAccount.setAccId(101);
		harryAccount.setAccBalance(-3000); 

		Name name = new Name(); 
		name.setFirstName("harry");
		name.setLastName("Peter");

		harryAccount.setName(name);

		System.out.println(harryAccount.toString()); // harryAccount.toString(); 
	}
}
