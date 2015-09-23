package JavaBooklet2;
/*
 * Program to calculate the efficiency of a steam engine, given air and steam temp.
 * 
 * eff = 1 - (Tair/Tsteam)
 * 
 * Normal air temp = 300K
 * Boiling point of water is 373K 
 */
import java.util.Scanner;

public class Homework2_SteamEngineEfficiency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Air temp (K): ");
		double ta = sc.nextDouble();
		System.out.print("Steam temp (K): ");
		double ts = sc.nextDouble();
		
		sc.close();
		double efficiency = 0;
		if (ts > 373) efficiency =1.0 - (ta/ts); // less than boiling means no steam
		
		System.out.println("Efficiency: " + efficiency);
	} // main
} // class
