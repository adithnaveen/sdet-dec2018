package com.training.businesslogic.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.businesslogic.MyBusinessLogic;

public class MyBusinessLogicTest {

	MyBusinessLogic mbl = null; 

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Hi i'm in before class, and only once");
	}
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("Hi i'm in after class and only once ");
	}
	
	@Before
	public void setUp() {
		mbl = new MyBusinessLogic(); 
	}
	
	@After
	public void tearDown() {
		System.out.println("i'm in after");
	}
	
	@Test(timeout=500)
	public void insertRecordTest() {
		int retVal = mbl.insertRecord(101, "Harry");
		assertEquals(1, retVal); 
	}

	@Test (expected=RuntimeException.class)
	public void sayHelloTest() {
		String name = "Vimala"; 
		String retVal = "Hello " + name; 
		
		assertEquals(retVal, mbl.sayHello(name));
	}
	
}
