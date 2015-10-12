package JavaBooklet3;

import java.util.Scanner;

public class Homework1E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int passwordHashCode;
		System.out.print("Enter a password: ");
		passwordHashCode = sc.nextLine().hashCode();
		
		while(passwordHashCode != -906277200){
			System.out.println("Password incorrect.");
			System.out.print("Enter a password: ");
			passwordHashCode = sc.nextLine().hashCode();
		} // while
		System.out.println("You are in");
		sc.close();
	} // main
} // homework 1
