package com.training.sdet.day1;

// immutable 
class Device{
	private int dId; 
	private String dName;
	
	
	public Device(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}


	public int getdId() {
		return dId;
	}


	public String getdName() {
		return dName;
	}


	public void setdId(int dId) {
		this.dId = dId;
	}


	public void setdName(String dName) {
		this.dName = dName;
	} 
	
	
}

public class DeviceImpl {
		public static void main(String[] args) {
			Device d1 = new Device(101, "Laptop"); 
			System.out.println(d1.hashCode());
			
			d1.setdName("Mouse");
			System.out.println(d1.hashCode());
		}
	

}
