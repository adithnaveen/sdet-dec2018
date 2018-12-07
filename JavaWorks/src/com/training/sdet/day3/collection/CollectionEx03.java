package com.training.sdet.day3.collection;

import java.util.Vector;

// program to show working of vector 
public class CollectionEx03 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(5,7); 
		
		System.out.println("Size " +vector.size());
		System.out.println("capacity "+vector.capacity());
		
		vector.add("one"); 
		vector.add("two"); 
		vector.add("three"); 
		vector.add("four"); 
		vector.add("five"); 
		vector.add("one"); 
		vector.add("two"); 
		vector.add("three"); 
		vector.add("four"); 
		vector.add("five"); 
		
		vector.add("one"); 

		
		System.out.println("Size " +vector.size());
		System.out.println("capacity "+vector.capacity());
		
		
	}
}
