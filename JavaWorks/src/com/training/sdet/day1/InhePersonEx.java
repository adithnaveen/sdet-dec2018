package com.training.sdet.day1;

public class InhePersonEx {
	
	public static void main(String[] args) {
		// inheMethod1();
		
		Person p = new Employee(); 
		
		p.setPersonId(101);
		p.setPersonName("Sriram");
		((Employee)p).setEmployeeSalary(20000);
		((Employee)p).setProjectName("Automation Testing");
		
		System.out.println(p);
		p = new Customer(); 
		
		System.out.println(p);
		System.out.println(((Employee)p).getEmployeeSalary()); 
	}

	private static void inheMethod1() {
		Employee emp = new Employee(); 
		emp.setPersonId(101);
		emp.setPersonName("Sriram");
		emp.setEmployeeSalary(10000);
		emp.setProjectName("Automation Testing");
		
		System.out.println(emp); // -> emp.toString()
		
		
		Customer customer = new Customer(); 
		customer.setIncome(2323);
		customer.setPersonId(222);
		customer.setPersonName("Scott");
		System.out.println(customer);
	}
}
