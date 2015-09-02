package JavaBooklet1;
import java.util.Scanner;
public class IO {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("F: ");
		double f = sc.nextDouble();
		double c = 5*(f-32)/9;
		System.out.println(c);
		
		
		
		sc.close();
	} // Main
} // IO
