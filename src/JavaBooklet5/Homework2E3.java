/**
 * 
 */
package JavaBooklet5;

import java.util.Scanner;

/**
 * @author 	Richard
 * @since	20 Jan 2016
 *
 */
public class Homework2E3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Upper limit: ");
		int lim = sc.nextInt();
		sc.close();
		int count = 0;
		for (int i = 2; i <= lim; i++){
			if(checkIfPrime(i)){
				System.out.println(i);
				count++;
			}
		}
		System.out.println("[" + count + " primes found, (" + count*100.0/lim + "%)]");
	}
	public static boolean checkIfPrime(long numCheck) {
		if(numCheck <= 1) return false;
		long sqrtNumcheck = (long)Math.pow(numCheck, 0.5) + 1;
		for(int i = 2; i < sqrtNumcheck; i++) {
			if (numCheck%i == 0) return false; // If at any point it's divisible it can't be prime
		}
		return true; // Return true if false has not been returned yet
	}

}
