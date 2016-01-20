/**
 * 
 */
package JavaBooklet5;

import java.util.Scanner;

/**
 * @author Richard
 *
 */
public class Homework1E1 {
		public static void main(String[] args)
	   {
	      System.out.println("Sentance Analysis");
	      System.out.println();
	      System.out.println("Enter a sentence, then press 'Enter'");
	      System.out.println();
	      Scanner sc = new Scanner(System.in);
	      String sentance = sc.nextLine();
	      sc.close();
	      System.out.println();
	      System.out.println("Your sentance contains " + wordCount(sentance) + " words.");
	      System.out.println("Your sentance contains " + vowelCount(sentance)+ " vowles.");
	   } //end main method
	   private static int wordCount(String sent){
		   String[] t = sent.split(" ");
		   return t.length;
	   }
	   private static int vowelCount(String sent){
		   char[] sentCA = sent.toCharArray();
		   int count = 0;
		   for (char c: sentCA){
			   switch (c){
			   case 'a':	// fall through
			   case 'e':	// fall through
			   case 'i':	// fall through
			   case 'o':	// fall through
			   case 'u': count++;
			   default:	// Do nothing
			   }
		   }
		   return count;
	   }

}
