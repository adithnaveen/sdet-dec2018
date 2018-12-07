package com.training.sdet.day1;

class A{
	A(int x){
		super();
		System.out.println("Hey i'm from Class A");
	}
}

class B extends A{
	B(int x ){
		super(x);
		System.out.println("Hey i'm from Class B");
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		B objB = new B(10);
	}
}
