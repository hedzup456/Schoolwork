package JavaBooklet1;
import java.text.DecimalFormat;
import java.util.Scanner;
public class FahenheitToCentigrade {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Farenheit: ");
		double f = sc.nextDouble();
		double c = 5*(f-32)/9;
		DecimalFormat oneDP = new DecimalFormat("#.#");
		c = Double.valueOf(oneDP.format(c));
		System.out.println(c + " degrees C");		
		sc.close();
	} // Main
} // IO
