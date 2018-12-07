package com.training.sdet.day2;

// static variables are available first 
// static blocks are executed first 
// static methods are loaded first 

public class MyMath {
	static int x; 
	static int add(int num1,  int num2 ) {
		return num1 + num2; 
	}
	
	static {

		System.out.println("x value is " + x);
		System.out.println("Hey this is static block 1 ");
	}
	
	static {
		System.out.println("Hey i'm second static block ");
	}
	static int sub(int num1, int num2) {
		return num1 - num2 ; 
	}
	
	public static void main(String[] args) {
		x = 345; 
		System.out.println(add(10, 20)); 
	}
	
	static {
		System.out.println("i'm last static block ");
	}
}
