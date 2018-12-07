package com.training.sdet.day2;

public class Home implements BankLoan{

	@Override
	public void loanAmount(int amount) {
		System.out.println("Home loan amount " + amount);
	}

	@Override
	public void repay(int repayAmount) {
		System.out.println("Home loan repaid " + repayAmount);
		
	}

	@Override
	public void foreClosure(boolean flag) {
		System.out.println("Forecloseure will charge 2.3% " + flag);
	}

}
