package com.training.sdet.day4.threads;

class MyBusinessLogic extends Thread{
	
	// simulate some time 
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.println("Value of i " + i +", " + 
					Thread.currentThread().getName());
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread " + 
				Thread.currentThread().getName() 
				+ " Exiting" );
	
	}
}



public class ThreadEx01 {
	public static void main(String[] args) {
		System.out.println(
				Thread.currentThread().getName()
				);
		
		MyBusinessLogic mbl = new MyBusinessLogic(); 
		mbl.start();
		
		MyBusinessLogic mbl2 = new MyBusinessLogic(); 
		mbl2.start(); 

		MyBusinessLogic mbl3 = new MyBusinessLogic(); 
		mbl3.start();
		
		try {
			mbl.join();
			mbl2.join();
			mbl3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of main");
		
	}
}
