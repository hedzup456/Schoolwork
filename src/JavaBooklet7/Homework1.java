
package JavaBooklet7;

public class Homework1 {
	public static void main(String[] args){
		System.out.format("%-20s%-20s%-10s%-10s\n\n", "Town", "County", "Pop", "Area");
		
		try{	// Files are always in try/catch.			
			AQAReadTextFile2016 rf = new AQAReadTextFile2016("/home/rjh/Documents/Programming/Code/Schoolwork/res/coastal towns csv file.txt");
			TownType t = new TownType(rf.readLine());
			do{				
				System.out.format("%-20s%-20s%-10d%-10d\n", t.name, t.county, t.population, t.area);
				t = new TownType(rf.readLine());
			} while (t != null);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
	}
}
