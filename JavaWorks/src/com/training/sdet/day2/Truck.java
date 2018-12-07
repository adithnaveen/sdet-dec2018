package com.training.sdet.day2;

public class Truck extends Vehicle{
	
	private int noOfPounds; 
	
	public Truck(int noOfPounds, int speed) {
		super(speed); 
		this.noOfPounds = noOfPounds; 
	}
	
	public void load() {
		System.out.println("Truck has " + noOfPounds +" load");
	}

	@Override
	public void move() {
		System.out.println("Truck Moving @ Speed " + this.getSpeed());
	}

	@Override
	public void brake() {
		System.out.println("Truck applies brake... ");
	}
	
	
}
