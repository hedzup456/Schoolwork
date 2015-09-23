package JavaBooklet2;

import java.util.Scanner;

/*
 * Program to calc time of microwaving given # of items and single item time
 * 
 * 		# items |time (in terms of single object time)
 * 		1		|1
 * 		2		|1.5
 * 		3		|2
 * 		3+		| Do not microwave
 */
public class Homework3_MicrowaveOven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Items: ");
		int noItem = sc.nextInt();
		sc.nextLine();
		System.out.print("Time (MM:SS): ");
		String x = sc.nextLine();
		int mins, secs;
		mins = Integer.valueOf(x.split("\\D")[0]);
		secs = Integer.valueOf(x.split("\\D")[1]);
		
		if(noItem  == 1){
			System.out.printf("%02d:%02d", mins, secs); // print two-digit times
		} else if(noItem == 2){
			secs*=1.5;
			if (mins%2==0){
				mins+= mins/2;
			} else {
				mins+= mins/2;
				secs += 30;
			}
			if(secs%60 != 0){
				mins+= secs/60;
				secs%=60;
			}
			
			System.out.printf("%02d:%02d", mins, secs); // print two-digit times
		} else if(noItem==3){
			secs*=2;
			mins*=2;
			
			if(secs%60 != 0){
				mins+= secs/60;
				secs%=60;
			}
			System.out.printf("%02d:%02d", mins, secs); // print two-digit times
		} else {
			System.out.println("Break it down into loads of 3 items or less.");
		}
		sc.close();
	}

}
