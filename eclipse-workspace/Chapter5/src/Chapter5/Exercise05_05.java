package Chapter5;

import java.util.Scanner;

public class Exercise05_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		final double POUNDSPERKILOGRAMS = 2.2;

		System.out.printf(
				"Kilograms\t\tPounds\t\t|\t\tPounds\t\tKilograms\n");
			
		for (int k = 1 , p = 20; k <= 199 && p <= 515 ; k += 2 , p += 5 ) // why use && ? does it work with 3 at a time?
			
		{
			System.out.printf("%6d\t\t\t%6.1f" , k , (k * POUNDSPERKILOGRAMS));
			System.out.print("\t\t|\t\t");
			System.out.printf("%6d\t\t%6.2f\n" , p , (p / POUNDSPERKILOGRAMS));		
					
		}
	}

}
