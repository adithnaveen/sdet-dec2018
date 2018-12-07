package com.training.sdet.day3.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Naveen
 * @see additional information goes here
 * @since dec 12 2018
 * 
 */
public class ScannerEx {
	static Map<String, String[]> myMap = new HashMap<>();

	static {
		myMap.put("goodmorning", new String[] { "good morning", "bonjour" });
		myMap.put("goodmorning", new String[] { "good morning", "bonjour" });
		myMap.put("goodmorning", new String[] { "good morning", "bonjour" });
		myMap.put("goodmorning", new String[] { "good morning", "bonjour" });

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter number ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:

				break;

			default:
				break;
			}
		}
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int add(int num1, int num2) {
		return 0;
	}

}
