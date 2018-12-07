package com.training.sdet.day2;

public class EducationLoan extends Loan {

	public EducationLoan (int loanAmount) {
		super(loanAmount); 
	}
	
	@Override
	public double getROI() {
		return 4.5; 
	}

}
