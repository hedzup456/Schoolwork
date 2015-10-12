package JavaBooklet3;

import java.util.Scanner;

public class Homework1E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Num: ");
		int min, max, inputNum = sc.nextInt();
		min = max = inputNum;
		while(inputNum != -1){
			if (min > inputNum) min = inputNum;
			if (max < inputNum) max = inputNum;
			System.out.println("Num: ");
			inputNum = sc.nextInt();
		} // while
		System.out.println(min + " minimum and " + max + " max.");
		sc.close();
	}

}
