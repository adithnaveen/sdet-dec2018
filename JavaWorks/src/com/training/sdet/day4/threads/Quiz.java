package com.training.sdet.day4.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Question {
	private String question;
	private List<String> options;
	private int correctOption;

	@Override
	public String toString() {
		return "Question [question=" + question + ", options=" + options + ", correctOption=" + correctOption + "]";
	}

	public Question() {
	}

	public Question(String question, List<String> options, int correctOption) {
		super();
		this.question = question;
		this.options = options;
		this.correctOption = correctOption;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public int getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(int correctOption) {
		this.correctOption = correctOption;
	}

}

public class Quiz implements Runnable {

	static List<Question> questions = new ArrayList<>();

	static {
		questions.add(
				new Question("when was java invented1", Arrays.asList(new String[] { "1995", "1992", "1993" }), 1));

		questions.add(
				new Question("when was java invented2", Arrays.asList(new String[] { "1995", "1992", "1993" }), 1));

		questions.add(
				new Question("when was java invented3", Arrays.asList(new String[] { "1995", "1992", "1993" }), 1));

	}

	static long questionShown; 
	
	public static void main(String[] args) {
		questionShown  = new Date().getTime(); 
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in); 
		
		for (Question temp : questions) {
			
			System.out.println(temp.getQuestion());
			System.out.println("Enter Your choice ");
			int choice = sc.nextInt(); 
			long answeredTime  =   new Date().getTime();
			if((answeredTime - questionShown) > 5000) {
//				throw new TooLateException("Timed Out"); 
			}
			
			
		}
	}
}
