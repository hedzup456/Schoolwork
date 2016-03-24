package JavaBooklet8;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Homework1 {
	private static int[] freqs = new int[26];
	
	private static void addFreq(char x){
		if(Character.isLowerCase(x)){
			freqs[x-97] ++;
		} else if (Character.isUpperCase(x)){
			freqs[x-65] ++;
		}
	}
	private static void findHighFreq(){
		System.out.println("A \tB \tC \tD \tF \tE \tG \tH \tI \tJ \tK \tL \tM \tN \tO \tP \tQ \tR \tS \tT \tU \tV \tW \tX \tY \tZ");
		int highestFreq = 0, highestFreqIndex = 0;
		for (int i = 0; i < freqs.length; i++){
			System.out.print(freqs[i] + "\t");
			highestFreq = (freqs[i] > highestFreq)?freqs[i]:highestFreq;
			highestFreqIndex = (freqs[i] > highestFreq)?i:highestFreqIndex;
		}
		System.out.print("\n");	// Polish off after using print.
		System.out.println((char)(highestFreqIndex + 65) + " is the most frequent, and likely e.");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string to check: ");
		
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		sc.close();
		
		for (char a: str)	addFreq(a);
		
		findHighFreq();
	}
}
