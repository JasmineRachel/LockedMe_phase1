package com.org.lockedMe;
import java.util.Scanner;

public class lockedMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to LockedMe.com, developed by Jasmine Davies");
			System.out.println("_____________________________________________");
			System.out.println("Please select an option: ");
			System.out.println("1. View files | 2. add file | 3.delete file | 4. search file | 5. close app");
			System.out.println("Insert the number for the option you'd like to action...");
			
			int option = userInput.nextInt();
			
			
			if (option == 1) {
				while(true) {
					
					System.out.println("viewing files...");
					System.out.println("Back to main menu?");
					System.out.println("1. Yes | 2. No ");
					
					int decision = userInput.nextInt();
					if(decision == 1) {
						break;
					}else {
						
						System.out.println("Continue viewing files...");
						continue;
					}

				}
	
				
			}else if (option == 2) {
				System.out.println("adding files");
				
			}else if(option == 3) {
				System.out.println("deleting file");
			}else if(option == 4) {
				System.out.println("searching file");
			}else if(option == 5) {
				System.out.println("closing application, goodbye!");
				break;
			}
			
		}
		
	}

}
