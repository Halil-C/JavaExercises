package Chapter4;

import java.util.Scanner;


public class Exercise04_08 {


		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter an ASCII code (0-127): ");
			int i = input.nextInt();

			System.out.println((char)i);
		}
	
}
