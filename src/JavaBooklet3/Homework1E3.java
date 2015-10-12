package JavaBooklet3;

import java.util.Scanner;

public class Homework1E3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What number to go to? ");
		int max = sc.nextInt();
		sc.close();
		
		for(int y = 0; y <= max; y++){
			for(int x = 0; x <= max; x++){
				if (y == 0 && x == 0){
					System.out.print("\t");
				} else if (y == 0){
					System.out.print(x + "\t");
				} else if (x == 0){
					System.out.print(y + "\t");
				} else {
					System.out.print(x*y + "\t");
				} // if/else
			} // for x
			System.out.println(); // newline
		} // for y
	}

}
