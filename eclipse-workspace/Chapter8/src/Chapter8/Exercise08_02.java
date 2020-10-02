package Chapter8;

import java.util.Scanner;

public class Exercise08_02 {
	public static void main(String[] args) {

		double[][] m = get4By4Matrix();

		double majorDiagSum = sumMajorDiagonal(m);

		System.out.println("Sum of the elements in the major diagonal is " + majorDiagSum);

	}

	public static double[][] get4By4Matrix() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 4-by-4 matrix row by row: ");

		double[][] m = new double[4][4];
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();
		input.close();

		return m;
	}

	public static double sumMajorDiagonal(double[][] m) {

		double total = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					total += m[i][j];
				}
			}
		}

		return total;
	}
	
	
}
