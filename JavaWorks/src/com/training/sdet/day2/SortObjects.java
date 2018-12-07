package com.training.sdet.day2;

import java.util.Arrays;

public class SortObjects {
	public static void main(String[] args) {
		int [] arr = {12,3,43,45,23,22,666, 10, 44}; 
		
		for(int temp : arr) {
			System.out.println(temp);
		}
		
		System.out.println("---- After Sort -------------");
		
		Arrays.sort(arr);
		for(int temp : arr) {
			System.out.println(temp);
		}
		
		
		String [] sarr = {"hello","how", "are", "you", "today"};
		Arrays.sort(sarr);

		for(String temp : sarr) {
			System.out.println(temp);
		}
	}
}
