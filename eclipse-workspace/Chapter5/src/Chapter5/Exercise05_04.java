package Chapter5;

import java.util.Scanner;

public class Exercise05_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double KILOMETERPERMILE = 1.609;
		
		System.out.println("Mile\t\tKilometer");
		
		for (int i = 1 ; i <= 10 ; i++)
		{
			System.out.printf("%4d\t\t%6.4f\n", i , (i * KILOMETERPERMILE));
		}
	}

}
