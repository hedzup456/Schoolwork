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
	   public static void main(String[] args)
	   {
		   Scanner sc = new Scanner(System.in);
	      System.out.print("\nfirst integer: ");
	      int int1 = sc.nextInt();
	      System.out.print("second integer: ");
	      int int2 = sc.nextInt();
	      displaySum(int1, int2);

	      System.out.print("\nfirst decimal: ");
	      double db1 = sc.nextDouble();
	      System.out.print("second decimal: ");
	      double db2 = sc.nextDouble();
	      displaySum(db1, db2);
	      
	      wowOverloading("~");
	      wowOverloading(1,1);
	   } //end main method
	   
	   public static void displaySum(int num1, int num2)
	   {
	      System.out.println("\nInside integer displaySum: ");
	      System.out.print("\t"+num1+ " + "+num2+ " = " + (num1 +num2));
	   } //end displaySum (int,int)
	   public static void displaySum(double n1, double n2)
	   {
	      System.out.println("\nInside decimal displaySum: ");
	      System.out.print("\t"+n1+ " + "+n2+" = " + (n1 +n2));
	   } //end displaySum (double, double)
	   
	   private static void wowOverloading(String text){
		   System.out.println(text);
	   }
	   private static void wowOverloading(int a, int b){
		   System.out.println("a^2 + b^2 = c ^2, c = "  + Math.sqrt(a*a+b*b));
	   }

}
