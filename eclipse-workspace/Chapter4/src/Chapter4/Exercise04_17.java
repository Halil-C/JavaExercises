package Chapter4;

import java.util.Scanner;

public class Exercise04_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		System.out.println("Enter the first three letters of a month (eg. Jan, Feb): ");
		String month = input.next();
		
		boolean leapYear = 
				((year % 4 == 0 && (year % 100 != 0)) || (year % 400 == 0));
		
		System.out.print(month + " " + year + " has ");
		
		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") ||month.equals("Dec"))
		
		{
			System.out.println(31 + " days");
		}
		
		else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov") )
				{
			System.out.println(30 + " days");
				}
		else
			System.out.println(((leapYear) ? 29 : 28) + " days");
	}

}
