package Chapter2;
import java.util.Scanner;

public class Exercise02_06 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number between 0 and 1000:");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		int digit1 = number % 10;
		
		int digit2 = number / 10;
		
		int digit3 = digit2 % 10;
		
		int digit4 = digit2 / 10;
		
		int sum = digit1 + digit3 + digit4;
		
		System.out.println("The sum of the digits is: " + sum);

	}
	
}
