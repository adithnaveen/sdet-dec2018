package com.training.sdet.day1;

public class Customer extends Person{
	private double income;

	@Override
	public String toString() {
		return "Customer [income=" + income + "]" + super.toString();
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	} 
	
	
}
