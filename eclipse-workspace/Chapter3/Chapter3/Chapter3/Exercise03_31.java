package Chapter3;

import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB:");
		
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		
		int direction = input.nextInt();
		
		System.out.println("Enter the amount of currencty to be converted:");
		
		double amount = input.nextDouble();
		
		switch (direction)
		{
		case 0: System.out.println("$" + amount + " is " + (amount * rate) + " yuan." ); break;
		case 1: System.out.println( + amount + " yuan is $ " + ((int)((amount * 100) / rate)) / 100.0); break;
		default: System.out.println("Incorrect input");
		
		
		}
		
	}
	
	
}
