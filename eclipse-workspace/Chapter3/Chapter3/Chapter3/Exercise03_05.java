package Chapter3;

import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day (0 for Sunday, 1 for Monday so on):");

		int todaysDay = input.nextInt();

		System.out.println("Enter the number of days elapsed since today: ");

		int elapsedDay = input.nextInt();

		int futureDay = (todaysDay + elapsedDay) % 7;
		
		System.out.print("Today is ");
		switch (todaysDay)
		
		{
		
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); 
		
		}
		
		System.out.print("And the future day is ");
		switch (futureDay)
		
		{
		
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday"); 
		
		
		}
		
	}
}

