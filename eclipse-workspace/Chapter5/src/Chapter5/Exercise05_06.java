package Chapter5;

import java.util.Scanner;

public class Exercise05_06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double MILESTOKILOMETERS = 1.609;
		
		System.out.printf(
				"Miles\t\tKilometers\t\t|\t\tKilometers\t\tMiles\n");
			for (int k = 1 , p = 20 ; k <=10 && p <=65 ; k++ , p += 5)
			{
				System.out.printf("%6d\t\t%6.3f" , k , (k * MILESTOKILOMETERS));
				System.out.print("\t\t\t|\t\t");
				System.out.printf("%6d\t\t\t%6.3f\n" , p , (p / MILESTOKILOMETERS));	
			}

	}

}
