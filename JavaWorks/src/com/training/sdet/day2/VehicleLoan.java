package com.training.sdet.day2;

public class VehicleLoan extends Loan {

	public VehicleLoan(int loanAmount) {
		super(loanAmount); 
	}
	@Override
	public double getROI() {
		return 11.3; 
	}
}
