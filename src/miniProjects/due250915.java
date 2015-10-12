package miniProjects;

import java.util.Scanner;

/*
 * Mini project to demonstrate knowledge of conditional actions in Java.
 * 
 * Project will take a input from the user, tell the user the difference
 * between the number and 3, then count from the number to 3.
 */


public class due250915 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Declare scanner, checking keyboard
		
		int usersNumber = 4; // Declare and set default
		
		System.out.print("User, enter a number OR DIE: ");
		try { // Put user interaction with the user in a try/catch because users break things.
			usersNumber = sc.nextInt();
			String message = (usersNumber == 7)?" is an amazing number.":" is a crap number."; // User ternary operator to avoid a pointless if statement
			System.out.println(usersNumber + message); 
		} catch (java.util.InputMismatchException error){ // If the user enters something not an int
			System.out.println("Users always break stuff.");
		} finally {
			if (usersNumber != 7){ // Its nice to guarantee the user has no choice!
				System.out.println("Your number is 7. I don't care.");
				usersNumber = 7;
			} // if
		} // finally
		for(usersNumber--; usersNumber >= 3; usersNumber--){ // for loop, extra skills, thrilling
			System.out.println(usersNumber);
		} // for
		sc.close(); // close the scanner when it is no longer needed
		
		System.out.println("Wow, 3 is exciting.");
	} // main
} // class
