package com.training.sdet.day1;

// ctrl + shift + f

//
//class Object{
//	public Object() {}
//}

///if your class has default constructor (same name as class name) 
// private variables and public getters and setters then 
// the class is called Java Bean 
public class Account {

	// gets injected by compiler when
	// compiling of this .java file
	public Account() {
		super();
	}

	private int accId;
	private double accBalance;
	private Name name; 

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		if(accBalance < 0) {
			System.out.println("Sorry balance too low");
			this.accBalance = 1000; 
		}else {
			this.accBalance = accBalance;
		}
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accBalance=" + accBalance + ", name=" + name + "]";
	}

	// create some methods which is accessable from
	// other class
	// default / protected / public


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
