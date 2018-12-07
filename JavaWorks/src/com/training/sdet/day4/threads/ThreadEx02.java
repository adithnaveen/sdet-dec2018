package com.training.sdet.day4.threads;

class OtherClass{}

class MyClass extends OtherClass implements Runnable{

	private Thread t; 
	private String threadName;  
	
	public MyClass() {}
	
	public MyClass(String threadName, int priority) {
		t = new Thread(this, threadName); 
		t.setPriority(priority);
		/// the OS level thread is create 
		// and control is given for run() 
		// in between it goes to scheduler 
		t.start(); 
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			print(i);
		}
		System.out.println("Thread " 
			+ Thread.currentThread() +" exiting" );
	}
	
	public void  print(int i) {
		System.out.println(
		"i value in " + Thread.currentThread().getName()
				+", " + i);
	}
}

public class ThreadEx02 {
	public static void main(String[] args) {
		MyClass m1 = new MyClass("William", 
				Thread.NORM_PRIORITY+1); 
		
		MyClass m2 = new MyClass("Koh" , 
				Thread.NORM_PRIORITY+2);
		
		MyClass m3 = new MyClass("Huang", 
				Thread.MAX_PRIORITY); 
		
		Thread t = new Thread(new MyClass()); 
		t.setName("Ashwini");
		t.setPriority(10);
		t.start(); 
		
	}
}







