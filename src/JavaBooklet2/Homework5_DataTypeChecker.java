package JavaBooklet2;

import java.util.Scanner;

public class Homework5_DataTypeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = new String();
		int age = 0;
		double heightM = 0;
		
		System.out.print("Name:   ");
		if (sc.hasNextLine()) name = sc.nextLine();
		System.out.print("Age:    ");
		if (sc.hasNextInt()) age = sc.nextInt();
		System.out.print("Height: ");
		if (sc.hasNextDouble()) heightM = sc.nextDouble();
		
		sc.close();
		
		boolean check = (name.length() > 0 && age > 10 && heightM > 1.5);
		if (check && name.contains("an")){
			System.out.println(name + " " + age + " " + heightM*100 + " and you are especially blessed.");
		} else if (check) {
			System.out.println(name + " " + age + " " + heightM*100);
		} // if
	} // main
} // class
