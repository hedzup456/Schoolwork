package SpecPaper1;

import java.util.Scanner;

public class question1{
	public static void main(String[] a){
		int HowFar;
		System.out.println("How far to count?");
		Scanner scanner = new Scanner(System.in);
		while ( (HowFar = scanner.nextInt()) < 1 ){
			System.out.println("Not a valid number, please try again.");
			HowFar = scanner.nextInt();
		}
		scanner.close();

		for (int MyLoop = 1; MyLoop <= HowFar; MyLoop++){
			if ( MyLoop % 3 == 0 && MyLoop % 5 == 0 ){
				System.out.println("FizzBuzz");
			} else {
				if ( MyLoop % 3 == 0 ){
					System.out.println("Fizz");
				} else if ( MyLoop % 5 == 0 ){
					System.out.println("Buzz");
				} else System.out.println(MyLoop);
			}
		}
	}
}	
