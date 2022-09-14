package com.org.lockedMe;
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;

public class FileActions {
	static void add_file() {
		
		try {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the name of the file you'd like to add: ");
			String fileName = userInput.nextLine();
			//TODO: find away to get a dynamic path
			File file = new File("/Users/jasminedavies/Desktop/Assignments/phase1/LockedMe_dir/" +fileName);
			
			if (file.createNewFile()) {
				System.out.println(file.getAbsolutePath());
			            
				System.out.println("File has been created.");
			} else {
			        
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
