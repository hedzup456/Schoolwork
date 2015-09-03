package JavaBooklet1;
import java.util.Scanner;
public class FCCoaches {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of passengers: ");
		int pax = sc.nextInt();
		System.out.print("Enter capacity of a coach: ");
		int coachCap = sc.nextInt();
		System.out.println("Full coaches: " + pax/coachCap);
		if(pax%coachCap == 0){
			System.out.println("Passengers in the last coach:" + coachCap);
		} else {
		System.out.println("Passengers in the last coach: " + pax%coachCap);
		} // End if/else
		sc.close();
	} // Main
} // Class
