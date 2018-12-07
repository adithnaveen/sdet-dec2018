package com.training.sdet.day3.io;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteOperation {
	public static void main(String[] args) {
		
		try {
			BufferedReader br = 
					new BufferedReader
					(new FileReader("Sample.txt"));
			
			String line=null; 
			
			while((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		
	}

	
	
	
	private static void readWrite() {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)); 
		FileWriter fileWriter = null;
		
		try {
			System.out.println("Enter Emp Id :");
			int empId = Integer.parseInt(br.readLine());

			System.out.println("Enter Emp Name ");
			String empName = br.readLine(); 
			
			System.out.println("Emp Id " + empId);
			System.out.println("Emp Name " + empName);
			
			File file  = new File("Sample.txt"); 
			fileWriter = new FileWriter(file, true); 
			
			fileWriter.write("Emp Id " + empId  +"\n");
			fileWriter.write("Emp Name " + empName+"\n");
			
			System.out.println("Contents written to file");
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}
}
