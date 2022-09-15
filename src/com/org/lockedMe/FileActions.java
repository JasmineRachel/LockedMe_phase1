package com.org.lockedMe;
import java.io.File; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileActions {
	//retrieves the absolute path of the directory created for the user
	static String getDirPath() {
		File directory = new File("LockedMe_dir");
		String path = directory.getAbsolutePath();
		return path;
		
	}
	//creates file name from user input
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
			
			e.printStackTrace();
		}
	}
	
	static void delete_file() {
		
		try {
			// checks that the user's input matches any of the files in the directory and removes it from the directory if successful
			File directory = new File(getDirPath());
			String[] files = directory.list();
			System.out.println("Enter the name of the file you'd like to delete: ");

			File searchedFile = getFileName();
			boolean fileDeleted = false;
			for (String file : files) {
				if(searchedFile.getName().equals(file)) {
					System.out.println(file + " is the file you wish to delete");
					File selectedFile = new File(directory.getAbsolutePath()+ "/" + file);
					selectedFile.delete();
					System.out.println(file + " file deleted");
					fileDeleted = true;
				}
			}
			if (fileDeleted == false) {
				System.out.println("File not found");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	static void view_files(){
		// lists the all the files in the directory
		
		File directory = new File(getDirPath());
		String[] files = directory.list();
		//used an ArrayList as the director.list length is greater than 0 when empty - returned 64 bytes.
		ArrayList <String> fileList = new ArrayList <String>();
		for(String file : files) {
			fileList.add(file);
		}
		Collections.sort(fileList);
	
		if (fileList.size() > 0 ) {
			System.out.println("Here are your files...");
			System.out.println(" ");
			for(String file : fileList) {
				System.out.println(" - " + file);
			}
		} else{

			System.out.println("no files are stored in this directory");
		}
		
	}
	
	static void search_file() {
		// checks that the user's input matches any of the files in the directory and displays it from the directory if successful
		System.out.println("Enter the name of the file you'd like to search: ");
		File fileName = getFileName();
		String searchedFile = fileName.getName();
		File directory = new File(getDirPath());
		String[] files = directory.list();
		
		boolean searched = false; //created this boolean because 'else' clause doesn't work inside the for loop
		for(String file : files) {
			if(searchedFile.equals(file)) {
				System.out.println("Here is your file...");
				System.out.println(file);
				searched = true;
			}
				
		}
		if(searched == false) {
			System.out.println("File not found");
		}
		
	}

}
