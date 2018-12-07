package com.training.sdet.day3.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// set to keep user defined objects 
public class SetEx02 {
	public static void main(String[] args) {

		TreeSet<Emp> ts = new TreeSet<>(); 
		ts.add(new Emp(101, "Kumar", 3344)); 
		ts.add(new Emp(105, "Frank", 5432)); 
		ts.add(new Emp(123, "Urvi", 5544));
		ts.add(new Emp(101, "Kumar", 3344)); 
		ts.add(new Emp(678, "Archana", 5555)); 
		
		for(Emp temp : ts) {
			System.out.println(temp);
		}
		

	}

	private static void hashSetUserObject() {
		Set<Emp> set = new HashSet<>(); 

		set.add(new Emp(101, "Kumar", 3344)); 
		set.add(new Emp(105, "Frank", 5432)); 
		set.add(new Emp(123, "Urvi", 5544)); 
		set.add(new Emp(101, "Kumar", 3344)); 
		set.add(new Emp(678, "Archana", 5555)); 
		
		for(Emp temp : set) {
			System.out.println(temp + ", " + temp.hashCode());
		}
	}
}
