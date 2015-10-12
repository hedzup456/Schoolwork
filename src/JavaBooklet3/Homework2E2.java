package JavaBooklet3;

import java.util.Scanner;

public class Homework2E2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an upper bound: ");
		final int lim = sc.nextInt();
		sc.close();
		
		int numPr = 1, num = 1, count = 2, t;
		System.out.print("1 1 ");
		while(num+numPr <= lim){
			t = num;
			num += numPr;
			numPr = t;
			count++;
			System.out.print(num + " ");
		}
		System.out.println("There are " + count + " fibonacci numbers before " + lim);
	}

}
