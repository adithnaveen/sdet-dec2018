package com.training.sample;

public class MyClient {
	public static void main(String[] args) {
		try {
			Class.forName("com.training.sample.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
