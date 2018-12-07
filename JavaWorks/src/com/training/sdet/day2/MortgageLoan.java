package com.training.sdet.day2;

public class MortgageLoan extends Loan {

	public MortgageLoan(int loanAmount) {
		super(loanAmount); 
	}

	@Override
	public double getROI() {
		return 3.4 ;
	}

}
