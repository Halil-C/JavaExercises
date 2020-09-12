package Chapter7;

import java.util.Scanner;

public class Exercise07_25 {

	public static void main(String[] args) {

		double[] eqn = new double[3];
		double[] roots = new double[3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		for (int i = 0; i < eqn.length; i++)
			eqn[i] = input.nextDouble();

		int rootNum = solveQuadratic(eqn, roots);

		if (rootNum == 0)
			System.out.print("No real roots.\n");
		else
			printRoots(roots, rootNum);

	}

	private static void printRoots(double[] roots, int numberOfRoots) {
		for (int i = 0; i < numberOfRoots; i++) {
			System.out.println("Root " + (i + 1) + " = " + roots[i]);
		}
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {

		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		double discriminant = b * b - 4.0 * a * c;

		if (discriminant > 0.0) {
			roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
			roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
			return 2;
		} else if (discriminant == 0.0) {
			roots[0] = -b / (2.0 * a);
			return 1;
		}

		return 0;
	}

}
