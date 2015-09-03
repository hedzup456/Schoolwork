package JavaBooklet1;
import java.util.Scanner;
public class HolidayMoney {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int moneyLeft = 50000; // 500 euros in cents
		System.out.println("European Holiday");
		System.out.printf("Euros at the start of the holiday: \u20ac%,.2f%n", moneyLeft/100.0);
		System.out.print("Money spent on food:  \u20ac");
		moneyLeft -= Math.round(sc.nextDouble()*100);
		System.out.print("Money spent on trips: \u20ac");
		moneyLeft -= Math.round(sc.nextDouble()*100);
		System.out.print("Money spent on gifts: \u20ac");
		moneyLeft -= Math.round(sc.nextDouble()*100);
		System.out.printf("Money left: \u20ac%,.2f%n", moneyLeft/100.0);
		sc.close();
	} // End main
} // End class
