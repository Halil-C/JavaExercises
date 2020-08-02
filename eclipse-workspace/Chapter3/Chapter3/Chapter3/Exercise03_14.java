package Chapter3;

import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		
		int coin = (int)(Math.random() * 2);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your guess, 0 or 1:");
		
		int guess = input.nextInt();
		
		System.out.println(((guess == coin) ? "Correct " : "Incorrect ") + "Guess");
		
	}
	
	
}
