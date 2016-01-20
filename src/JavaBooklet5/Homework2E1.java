/**
 * 
 */
package JavaBooklet5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 	Richard
 * @since	20 Jan 2016
 *
 */
public class Homework2E1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int upperBound = sc.nextInt();
		sc.close();
		ArrayList<Integer> perf = new ArrayList<Integer>();
		ArrayList<Integer> xsve = new ArrayList<Integer>();	// xsve, excessive
		for (int i = 1; i <= upperBound; i++){
			if (isPerfect(i)) perf.add(i);
			else if (isDefic(i)) xsve.add(i);
		}
		System.out.println("These numbers are pefect:");
		for (Object i: perf.toArray()) System.out.print((Integer)i + " ");
	}
	private static boolean isPerfect(int posInt){
		int sumOfFactors = 0;
		for (int i = 1; i < (posInt+1)/2; i++){	// No point in checking past halfway
			if (posInt % i == 0) sumOfFactors += i;
		}
		System.out.println(posInt + "f: " + sumOfFactors);
		return sumOfFactors == posInt;
	}
	private static boolean isDefic(int posInt){
		int sumOfFactors = 0;
		for (int i = 1; i <= (posInt); i++){
			if (posInt % i == 0) sumOfFactors += i;
		}
		return sumOfFactors < posInt;
	}

}
