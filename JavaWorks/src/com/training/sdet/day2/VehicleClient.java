package com.training.sdet.day2;

public class VehicleClient {
	
	public static void display (Vehicle vehicle) {
		System.out.println("----------------------------");
		vehicle.move(); 
		vehicle.brake();
		
		
		if(vehicle instanceof Car) {
			((Car)vehicle).doors(); 
			((Car)vehicle).fuelCapacity();
		}else if(vehicle instanceof Truck) {
			((Truck)vehicle).load();
		}
	}
	
	public static void main(String[] args) {
		// singleObjectCall();
		
		Vehicle [] vehicles = new Vehicle[5];

		vehicles[0] = new Car(4, 40, 100); 
		vehicles[1] = new Truck(5000, 80); 
		vehicles[2] = new Car(2, 35, 120); 
		vehicles[3] = new Truck(4000, 90); 
		vehicles[4] = new Car(4, 80, 140); 
		
//		for(int i=0; i<vehicles.length ; i++) {
//			display(vehicles[i]); 
//		}
		
		for(Vehicle temp : vehicles) {
			display(temp);
		}
		
		
		Vehicle v = new Vehicle(10); 
	}

	private static void singleObjectCall() {
		Vehicle vehicle = new Car(4, 40, 120);  
		display(vehicle);

		System.out.println("----------------------------------------");
		vehicle = new Truck(4000, 75);
		display(vehicle);
	}
}
