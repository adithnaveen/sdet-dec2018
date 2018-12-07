package com.training.sdet.day2;

public class LoanClient {
	public static void main(String[] args) {
		Loan loan = new HomeLoan(1000); 

		showLoan(loan);
		
		loan = new VehicleLoan(2000);

		showLoan(loan);
		
		loan = new MortgageLoan(4000); 
		
	}

	private static void showLoan(Loan loan) {
		System.out.println("Name : "+loan.getName());
		System.out.println("Address " + loan.getAddress());
		System.out.println("ROI " + loan.getROI());
	}
}
