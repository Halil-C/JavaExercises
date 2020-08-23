package Chapter6;

import java.util.Scanner;

public class Exercise06_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter n: ");
		int n = input.nextInt();

		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols ++) {
				int s = (int) Math.round(Math.random());
				
				System.out.printf("%-3d" , s);
			}
			System.out.println();
		}
	}
}
