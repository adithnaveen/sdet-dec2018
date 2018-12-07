package com.training.sdet.day2;

public class Personal implements BankLoan{

	@Override
	public void loanAmount(int amount) {
		System.out.println("Personal Loan applied for " + amount);
	}

	@Override
	public void repay(int repayAmount) {
		System.out.println("For Personal loan repaid  " + repayAmount);
	}

	@Override
	public void foreClosure(boolean flag) {
		System.out.println("There shall be 2% on fore closure " + flag);
	}

}
