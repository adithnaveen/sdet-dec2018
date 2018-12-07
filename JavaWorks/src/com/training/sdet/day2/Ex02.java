package com.training.sdet.day2;

public class Ex02 {

	public static void checkName(String custName) throws NameTooShortException {
		if (custName.length() < 6) {
			throw new NameTooShortException("Sorry Name is too short, please validate");
		}
	}

	public static void checkCreditScore(String custName, int creditScore) throws Exception {
		try {
			checkName(custName);

			if (creditScore < 400) {
				throw new RuntimeException("Sorry Credit Score too low " + custName);
			} else if (creditScore >= 400 && creditScore < 700) {
				throw new RuntimeException("Need Background Verification " + custName);
			} else {
				System.out.println("You are good to go " + custName);
			}
		} catch (NameTooShortException ntse) {
			throw new Exception("Sorry did not process since name problem", ntse);
		}
	}

	public static void main(String[] args) {
		try {
			checkCreditScore("Peter", 777);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Some Business logic ");
	}
}
