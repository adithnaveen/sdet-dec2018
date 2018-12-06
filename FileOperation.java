package com.training.sdet.day3.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
	public static void main(String[] args) 
			throws IOException {
		File file = new File("Sample.txt");
		
		if(file.exists()) {
			System.out.println("File exists ");
			System.out.println("Modified Time " + 
					new Date(file.lastModified()));
			System.out.println("Can Read " + file.canRead());
			System.out.println("Car Write " + file.canWrite());
			System.out.println("Absolute Path : " + 
					file.getAbsolutePath());

			System.out.println("path Seperator " +
					File.separator);

			// file.delete(); 
		}else {
			file.createNewFile(); 
			System.out.println("File Created.. ");
		}
		
		System.out.println("JOb done ");
	}
}
