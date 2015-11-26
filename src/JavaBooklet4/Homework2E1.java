package JavaBooklet4;

import java.util.Scanner;

public class Homework2E1 {

	public static void main(String[] args) {
		// Enter message - declare scanner, get message, close scanner.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your message:");
		String message = sc.nextLine();
		sc.close();
		
		int dim = (int)Math.sqrt(message.length());
		if(dim*dim < message.length()) dim++;
		char[][] key = new char[dim][dim];
		// Populate array with default space
		for(char[] x: key) for(int i = 0; i < x.length; i++) x[i] = ' ';
		
		int y = 0; // y coord
		int c = 0; // count
		while(c < message.length()){
			for(char[] x: key){ // For array x in key
				try{
					x[y] = message.charAt(c);
					c++;	// The whole reason I'm using c, not i. That and it's used more as a char
				} catch (Exception e){
					break; // If we run out of message, break the loop
				}
			}
			y++;
		}
		System.out.print("***MESSAGE START***");
		for(char[] x: key) for(char l: x) System.out.print(l);
		System.out.print("***MESSAGE END***");
	}

}
