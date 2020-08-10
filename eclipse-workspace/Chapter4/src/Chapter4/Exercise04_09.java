package Chapter4;

import java.util.Scanner;

public class Exercise04_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character:");

		String character = input.nextLine();

		char ch = character.charAt(0);

		System.out.println((int) ch);
	}
}
