/**
 * 
 */
package JavaBooklet5;

/**
 * @author Richard
 *
 */
public class Homework1E1 {
		public static void main(String[] args)
	   {
	      System.out.println("\nCalling simpleMethod() ...");
	      simpleMethod();	//call method
	      System.out.println("\nNow back to main method");
	      simpleMethod();
	   } //end main method
	   public static void simpleMethod()
	   {
	      System.out.println("\n simpleMethod displays this message");
	      System.out.print("\thas no parameters\n\treturns no values");
	   } //end of simpleMethod

}
