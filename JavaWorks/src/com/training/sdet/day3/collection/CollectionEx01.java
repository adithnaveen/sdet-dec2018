package com.training.sdet.day3.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// program to show working of list raw type 
public class CollectionEx01 {
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("hello"); 
		list.add(34.5); 
		list.add(true); 
		list.add(new Object()); 
		
		System.out.println(list);
		
		Iterator itr = list.iterator(); 
		
		// arrays start from 0  
		// iterators start from -1 
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
