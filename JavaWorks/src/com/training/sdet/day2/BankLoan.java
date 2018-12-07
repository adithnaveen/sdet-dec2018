package com.training.sdet.day2;

public interface BankLoan {
	void loanAmount(int amount); 
	void repay(int repayAmount); 
	void foreClosure(boolean flag); 
}
