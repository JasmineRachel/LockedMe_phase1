package com.org.lockedMe;
import java.util.Scanner;

public class lockedMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developed by Jasmine Davies");
		System.out.println("Please select an option: ");
		System.out.println("1. View files, 2. add file, 3.delete file, 4. search file, 5. close app");
		System.out.println("type the number for the option you'd like to action...");
		
		int option = userInput.nextInt();
		
		if (option == 1) {
			System.out.println("view files");
		}else if (option == 2) {
			System.out.println("add files");
		}else if(option == 3) {
			System.out.println("delete file");
		}else if(option == 4) {
			System.out.println("search file");
		}else if(option == 5) {
			System.out.println("close application");
		}
	}

}
