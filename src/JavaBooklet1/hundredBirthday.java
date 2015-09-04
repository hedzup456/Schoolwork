package JavaBooklet1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class hundredBirthday {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		//sc.nextLine(); // Purge newline
		System.out.print("Enter your current age: ");
		int curAge = sc.nextInt();
		sc.close();
		
		Date dNow = new Date();
		SimpleDateFormat format = new SimpleDateFormat("Y");
		int nowYear = Integer.valueOf(format.format(dNow));
		
		System.out.println("Nice to meet you " + name);
		System.out.println("It is the year " + nowYear);
		System.out.println("You will be 100 in " + (nowYear+100 - curAge) + ".");
		
	} // Main
} // Class
