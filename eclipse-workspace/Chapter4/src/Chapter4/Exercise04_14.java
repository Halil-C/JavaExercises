package Chapter4;

import java.util.Scanner;

public class Exercise04_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter grade: ");
		
		String s = input.nextLine();
		
		char ch = s.charAt(0);
		
		if (ch >= 'A' && ch <= 'F' && ch != 'E')
		{
			System.out.print("The numeric value for grade " + ch + " is " );
			switch(ch)
			{
			case 'A': System.out.println(4); break;
			case 'B': System.out.println(3); break;
			case 'C': System.out.println(2); break;
			case 'D': System.out.println(1); break;
			case 'F': System.out.println(0); break;
			
			}
		}
		else 
			System.out.print(ch + " is an invalid grade.");
	}
}
