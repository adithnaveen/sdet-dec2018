package com.training.sdet.day2;

public class Ex01 {
	public static void main(String[] args) {
		try {
			
			// abort call 
			try {
				int arr[] = new int[-5];
				arr[55] = 33; 
			}catch(NegativeArraySizeException nase) {
				System.out.println(nase);
			}
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int res = num1 / num2; 
			System.out.println("Result is " + res);

		}catch(ArithmeticException ae) {
			System.out.println("Division problem: " +ae);
		}catch(NumberFormatException nfe) {
			System.out.println("Please pass only integers " + nfe);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("hey i'm from finally ");
		}
		System.out.println("some other business logic... ");
	}
}
