package JavaBooklet2;

import java.util.Scanner;

public class Homework4_FantasyGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to HomeworkQuest");
		System.out.print("Enter the name of your characer: ");
		String name = sc.nextLine();
		int str = -1, smt = -1, chr = -1;
		while(str > 10 || str < 0){
			System.out.print("Strenth (1-10): ");
			str = sc.nextInt();
		}
		while(smt > 10 || smt < 0){
			System.out.print("Smarts (1-10): ");
			smt = sc.nextInt();
		}
		while(chr > 10 || chr < 0){
			System.out.print("Charisma(1-10): ");
			chr = sc.nextInt();
		}
		if(str+smt+chr > 15){
			System.out.println("You assigned too many points");
			System.out.println("Defaults have been assigned.");
			str = smt = chr = 5;
		}
		System.out.printf("%s, Strength: %d, Smarts: %d, Charisma: %d", name, str, smt, chr);
		sc.close();

	}

}
