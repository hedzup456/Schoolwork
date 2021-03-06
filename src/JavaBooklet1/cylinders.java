package JavaBooklet1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class cylinders {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double r = sc.nextDouble();
		System.out.print("Enter height: ");
		double h = sc.nextDouble();
		System.out.print("Enter units: ");
		sc.nextLine();
		String units = sc.nextLine();
		sc.close();
		
		DecimalFormat df = new DecimalFormat("#.####");
		double v = Math.PI*Math.pow(r, 2)*h;
		double sa = Math.PI*Math.pow(r, 2);

		System.out.println("The volume is " + df.format(v) + " cubic " + units);
		System.out.println("The surface area is " + df.format(sa) + " square " + units);
	} // Main
} // Class
