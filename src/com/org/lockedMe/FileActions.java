package com.org.lockedMe;
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;

public class FileActions {
	static String getDirPath() {
		File directory = new File("LockedMe_dir");
		String path = directory.getAbsolutePath();
		return path;
		
	}
	
	
	static void add_file() {
		
		try {
			String path = getDirPath();
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter the name of the file you'd like to add: ");
			String fileName = userInput.nextLine();
			File file = new File(path+"/"+fileName);
			
			if (file.createNewFile()) {
			      
				System.out.println("File has been created: " + file.getAbsolutePath());
			} else {
			        
				System.out.println("File already exists.");
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void delete_file() {
		String path = getDirPath();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the name of the file you'd like to add: ");
		String fileName = userInput.nextLine();
		File file = new File(path+"/"+fileName);
		
		if (file.exists()){
			file.delete();
			System.out.println("File deleted");
		}else {
			System.out.println("File not found");
		}
	}

}
