/**
 * 
 */
package JavaBooklet5;

import java.util.Scanner;

/**
 * @author Richard
 *
 */
public class Homework1E2 {
	   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Message: ");
		   String mesg = sc.nextLine();
		   sc.close();
		   
		   System.out.println(swapChars(mesg));
	   }
	   private static String swapChars(String pt){
		   StringBuilder ct = new StringBuilder(pt);
		   for (int i = 0; i < ct.length(); i += 2){
			   if (i != ct.length()-1){
			   char t = ct.charAt(i);
			   ct.setCharAt(i, ct.charAt(i+1));
			   ct.setCharAt(i+1, t);
			   }
		   }
		   return ct.toString();
	   }
	   

}
