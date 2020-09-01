package Chapter7;

import java.util.Scanner;

public class Exercise07_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int length = 10;
		System.out.println("Enter " + length + " numbers");
		
		int[] numbers = new int[length] ;
		
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = input.nextInt();
						
		}
		
		for (int i = numbers.length - 1; i >= 0 ; i--) {
			System.out.print(numbers[i]+ " ");
		}
	}
	
	}
