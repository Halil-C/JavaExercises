package Chapter5;

import java.util.Scanner;

public class Exercise05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer, the process ends if the entry is 0:");
		
		int positive = 0;
		int negative = 0;
		int count = 0;
		double total = 0;
		int number = input.nextInt();
		
		if (number == 0) {
			System.out.println("The entry is 0 and it ended the process.");
		}
		
		while (number != 0 ) {
			if (number > 0)
				positive++;
			else
				negative++;
			
			total += number;
			
			count++;
			
			number = input.nextInt();
			
		}
		double average = total / count;
		
		System.out.println("The number of positive integers is " + positive + 
				"\nThe number of negative integers is " + negative + 
				"\nThe avereage is " + average);
	}

}
