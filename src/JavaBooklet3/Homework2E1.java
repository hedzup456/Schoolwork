package JavaBooklet3;

import java.util.Scanner;

public class Homework2E1 {

	public static void main(String[] args) {
		int numStud = 5;
		
		String[] names = new String[numStud];
		int[] scores = new int[numStud];
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= numStud; i++){
			System.out.print("Name " + i + ": ");
			names[i-1] = sc.nextLine();
			System.out.print("Score: ");
			scores[i-1] = sc.nextInt();
			sc.nextLine(); // puge buffer
		} // finish populating arrays
		sc.close();
		
		int highest = 0, highestIndex = -1;
		for (int i = 0; i < scores.length; i++){
			if (scores[i] > highest) {
				highest = scores[i];
				highestIndex = i;
			}
		}
		System.out.println(names[highestIndex] + ": " + scores[highestIndex]);
	}

}
