package JavaBooklet7;

import java.util.Scanner;

public class HomeworkTask2 {
	private static Scanner sc = new Scanner(System.in);
	
	private static void out(){
		System.out.format("%-20s%-20s%-10s%-10s\n\n", "Town", "County", "Pop", "Area");
		
		try{	// Files are always in try/catch.
			String town, county, l;
			int pop, area;
			
			AQAReadTextFile2016 rf = new AQAReadTextFile2016("/home/rjh/Documents/Programming/Code/Schoolwork/res/coastal towns csv file.txt");
			
			l = rf.readLine();
			do{
				String[] ls = l.split("\\s*,\\s*");
				town = (String)ls[0];
				county = (String)ls[1];
				pop = Integer.parseInt(ls[2]);
				area = Integer.parseInt(ls[3]);
				
				System.out.format("%-20s%-20s%-10d%-10d\n", town, county, pop, area);
				
				l = rf.readLine();
			} while (l != null);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void add(){
		try{
			AQAWriteTextFile2016 wf = new AQAWriteTextFile2016("/home/rjh/Documents/Programming/Code/Schoolwork/res/coastal towns csv file.txt", true);
			String town, county;
			int pop, area;
			System.out.print("Town name: ");
			town = sc.nextLine();
			System.out.print("County: ");
			county = sc.nextLine();
			System.out.print("Population: ");
			pop = sc.nextInt();
			System.out.print("Area: ");
			area = sc.nextInt();
			
			String tW = town + ", " + county + ", " + pop + ", " + area;
			wf.writeToTextFile(tW);
			wf.closeFile();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		int op = 0;
		do{
			System.out.println("\n1) View \n2) Add \n0) Quit");
			op = sc.nextInt();
			sc.nextLine(); // Purge buffer
			switch(op){
			case 1:
				out();
				break;
			case 2:
				add();
				break;
			// Default etc is to fall through
			}
		} while (op != 0);
	}
}