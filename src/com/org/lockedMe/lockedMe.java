package com.org.lockedMe;
import java.util.Scanner;

public class lockedMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to LockedMe.com, developed by Jasmine Davies");
			System.out.println("_____________________________________________");
			System.out.println(" ");
			System.out.println("Insert the number below for the option you'd like to action...");
			System.out.println("1. View files | 2. add file | 3.delete file | 4. search file | 5. close app");
			
			
			int option = userInput.nextInt();
			
			
			if (option == 1) {
				while(true) {
					
					System.out.println("[Placeholder for logic] viewing files...");
					System.out.println(" ");
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
				
				while(true) {
					
					System.out.println("[Placeholder for logic] adding file...");
					System.out.println(" ");
					System.out.println("Back to main menu?");
					System.out.println("1. Yes | 2. No ");
					
					int decision = userInput.nextInt();
					if(decision == 1) {
						break;
					}else {
						
						System.out.println("Continue adding files...");
						continue;
					}

				}
				
			}else if(option == 3) {
				
				while(true) {
					
					System.out.println("[Placeholder for logic] deleting file...");
					System.out.println(" ");
					System.out.println("Back to main menu?");
					System.out.println("1. Yes | 2. No ");
					
					int decision = userInput.nextInt();
					if(decision == 1) {
						break;
					}else {
						
						System.out.println("Continue deleting files...");
						continue;
					}

				}
				
			}else if(option == 4) {
				
				while(true) {
					
					System.out.println("[Placeholder for logic] searching file");
					System.out.println(" ");
					System.out.println("Back to main menu?");
					System.out.println("1. Yes | 2. No ");
					
					int decision = userInput.nextInt();
					if(decision == 1) {
						break;
					}else {
						
						System.out.println("Continue searching files...");
						continue;
					}

				}
				
			}else if(option == 5) {
				System.out.println("Closing application, goodbye!");
				break;
			}
			
		}
		
	}

}
