package com.org.lockedMe;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LockedMe extends FileActions {

	static void descisionDisplay() {
		System.out.println(" ");
		System.out.println("Back to main menu?");
		System.out.println("1. Yes | 2. No ");
	}

	public static void main(String[] args) {
		//program creates a directory for the user to organise their files
		Scanner userInput = new Scanner(System.in);
		
		File directory = new File("LockedMe_dir");  
		directory.mkdir();
		
		//program loops until the user decides they want to quit the application
		while(true) {
			System.out.println("Welcome to LockedMe.com(protoype), developed by Jasmine Davies");
			System.out.println("_______________________________________________________________");
			System.out.println(" ");
			System.out.println("Insert the number below for the option you'd like to action...");
			System.out.println("1. View files | 2. add file | 3.delete file | 4. search file | 5. close app");
			
			
			int option = userInput.nextInt();
			
			
			if (option == 1) {
				while(true) {
					view_files();
					descisionDisplay();
					try {
						int decision = userInput.nextInt();
						if(decision == 1) {
							break;
						}else if(decision == 2) {
							System.out.println(" ");
							System.out.println("Continue viewing files...");
							continue;
						}         
					}catch(InputMismatchException e) {
						//TODO: find better solution to stop exception from being thrown
						System.out.println("Wrong input! Try again.");
						userInput.nextLine();
//						
					}
					
					
				}
				
			}else if (option == 2) {
				
				while(true) {
					
					add_file();
					descisionDisplay();
					
					try {
						int decision = userInput.nextInt();
						if(decision == 1) {
							break;
						}else if(decision == 2) {
							System.out.println(" ");
							System.out.println("Continue adding files...");
							continue;
						}         
					}catch(InputMismatchException e) {
						
						System.out.println("Wrong input! Try again.");
						userInput.nextLine();
			
					}
			
				}
				
			}else if(option == 3) {
				
				while(true) {
					
					delete_file();
					descisionDisplay();
					
					try {
						int decision = userInput.nextInt();
						if(decision == 1) {
							break;
						}else if(decision == 2) {
							System.out.println(" ");
							System.out.println("Continue deleting files...");
							continue;
						}         
					}catch(InputMismatchException e) {
						
						System.out.println("Wrong input! Try again.");
						userInput.nextLine();
			
					}

				}
				
			}else if(option == 4) {
				
				while(true) {
					
					search_file();
					descisionDisplay();
					
					try {
						int decision = userInput.nextInt();
						if(decision == 1) {
							break;
						}else if(decision == 2) {
							System.out.println(" ");
							System.out.println("Continue search files...");
							continue;
						}         
					}catch(InputMismatchException e) {
						
						System.out.println("Wrong input! Try again.");
						userInput.nextLine();
			
					}

				}
				
			}else if(option == 5) {
				System.out.println("Closing application, goodbye!");
				break;
				
			}
			
		}
		
	}

}
