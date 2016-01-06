/**
 * 
 */
package miniProjects;

import java.util.Scanner;

/**
 * @author 	Richard
 * @since	6 Jan 2016
 *
 */
public class Miniproject4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		if (name.equalsIgnoreCase("jason")) name = "Jason, the swole-wannabe idiot.";
		else name = reverse(name);
		System.out.println(name);
		sc.close();
	}
	private static String reverse(String forwards){
		int len = forwards.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) sb.insert(i, forwards.charAt(len-1-i));
		return sb.toString();
	}

}
