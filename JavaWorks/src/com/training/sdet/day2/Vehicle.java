package com.training.sdet.day2;

public class Vehicle {
	private int speed; 
	public Vehicle(int speed) {
		// other jobs can be written here 
		this.speed = speed; 
	}
	public void move() {
		System.out.println("Vehicle is Moving.. @ " + speed);
	}
	public void brake() {
		System.out.println("Vehicle is stopping... ");
	}
	protected int getSpeed() {
		return speed;
	}
	
	
}
