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
	static File getFileName() {
		String path = getDirPath();
		Scanner userInput = new Scanner(System.in);
		String fileName = userInput.nextLine();
		File file = new File(path+"/"+fileName);
		
		return file;
	}
	
	
	static void add_file() {
		
		try {
			System.out.println("Enter the name of the file you'd like to add: ");

			File file = getFileName();
			
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
		System.out.println("Enter the name of the file you'd like to delete: ");

		File file = getFileName();
		
		if (file.exists()){
			file.delete();
			System.out.println("File deleted");
		}else {
			System.out.println("File not found");
		}
	}

}
