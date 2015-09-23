package JavaBooklet2;

import java.util.Scanner;

/*
 * Program to calculate total costs from Sam and Ella Delicatessen
 * Takes an item, it's price, and whether overnight shipping is needed.
 * 
 * Shows the total price to customer
 */
public class Homework1_InternetDelicatessen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Item: ");
		String itemName = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		double shippingPrice = 0.0;
		sc.nextLine(); // clear buffer
		System.out.print("Overnight delivery? (Y/N)");
		boolean ovrNghtDeliv = false;
		if(sc.nextLine().toUpperCase().charAt(0) == 'Y') ovrNghtDeliv = true; // get the upper version of the first char
		
		sc.close(); // close scanner
		
		if(price < 10){
			shippingPrice += 2.0; // £2 for standard shipping if item costs less than £10
		} else {
			shippingPrice += 3.0; //  £3 for standard shipping if item cost  >= £10
		} // end if 
		
		if(ovrNghtDeliv){ // if overnight delivery
			shippingPrice += 5.0; // £5 for overnight shipping
		} // end if
		
		System.out.print("Invoice:");
		System.out.printf(" \n    %-10.10s %10.2f", itemName, price);
		System.out.printf(" \n    %-10.10s %10.2f", "Shipping", shippingPrice);
		System.out.printf(" \n    %-10.10s %10.2f", "Total", price+shippingPrice);
	}

}
