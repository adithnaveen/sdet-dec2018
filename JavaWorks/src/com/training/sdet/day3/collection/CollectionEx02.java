package com.training.sdet.day3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// program to show working of list with type safe 
public class CollectionEx02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); 
		
		list.add("Harry"); 
		list.add("Suresh"); 
		list.add("Brain"); 
		list.add("Peter"); 
		list.add("Sriram"); 
		list.add("Raj"); 
		
		System.out.println(list);
		System.out.println("Size " + list.size());
		
		list.remove("Harry"); 
		System.out.println(list);
		System.out.println("Size " + list.size());
		
		System.out.println(list.contains("Radhika"));
		
		List<String> subList = list.subList(2, list.size());
		System.out.println("sublist -> " +subList);
	}

	private static void iteratorWay(List<String> list) {
		Iterator<String> itr = list.iterator(); 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
