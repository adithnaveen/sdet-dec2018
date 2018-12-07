package com.training.sdet.day2;

public class HomeLoan extends Loan {

	public HomeLoan(int loanAmount) {
		super(loanAmount); 
	}

	@Override
	public double getROI() {
		return 8.7; 
	}

}
