/**
 * 
 */
package JavaBooklet5;

/**
 * @author 	Richard
 * @since	20 Jan 2016
 *
 */
public class Homework2E2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++){
			if (i % 5 == 0 && i % 3 == 0) System.out.print("FizzBuzz ");
			else if (i % 5 == 0) System.out.print("Buzz ");
			else if (i % 3 == 0) System.out.print("Fizz ");
			else System.out.print(i + " ");
		}

	}

}
