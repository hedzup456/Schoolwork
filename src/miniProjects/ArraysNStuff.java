/**
 * 
 */
package miniProjects;

import java.util.Scanner;

/**
 * @author Richard
 *
 */
public class ArraysNStuff {
	public static void main(String[] args){
		int[] arrayOfThings = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2}; // I am using an array to meet the criteria of using an array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 and " + arrayOfThings.length + " inclusive");
		int index = sc.nextInt()-1; // -1 as zero-indexed
		while(index < arrayOfThings.length){ // Look I can use indentation too
			System.out.println(arrayOfThings[index]);
			index++;
		}
		sc.close();
	}
}
