package Chapter5;

import java.util.Scanner;

public class Exercise05_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double POUNDSPERKILOGRAMS = 2.2;
		
		System.out.println("Kilograms\t\tPounds");
		
		for (int i = 1; i <=199 ; i += 2) {
			System.out.printf("%3d\t\t\t%4.2f\n",i,(i * POUNDSPERKILOGRAMS));
		}
	}
}
