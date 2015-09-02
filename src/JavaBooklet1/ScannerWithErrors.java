package JavaBooklet1;
/*
 * This program contains missing bits - shown in ??? - please complete it correctly.
 * 
 * The program reads in an integer using the Scanner class and prints it
 * Assigns the integer variable to a double variable and prints it
 * Then converts and assigns the double variable to the original integer variable - needing to use a cast
 * Why is the cast needed - could there be a problem in casting a very large double to an integer?
 */
import java.util.Scanner;
public class ScannerWithErrors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int varInt;
        double varDouble;

        //read in an integer and save into a double. Cast the double back into an int
        System.out.print("\nInteger please: ");
        varInt = sc.nextInt();
        varDouble = varInt;
        System.out.print("int: "+ varInt + " double: " + varDouble);
        varInt = (int)varDouble;  //cast to avoid possible loss of precision exception (error message)
        System.out.println("\nint (cast from double): " + varInt);
        sc.close();
    }//end main

}//end class	