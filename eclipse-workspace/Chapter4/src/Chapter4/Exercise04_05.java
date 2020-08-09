package Chapter4;

import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of sides of a regular polygon: ");
		int numberOfSides = input.nextInt();
		
		System.out.print("Enter the side length of the polygon: ");
		double side = input.nextDouble();

		double area = (numberOfSides * Math.pow(side, 2) / 
			(4 * Math.tan(Math.PI / numberOfSides)));

		System.out.printf("The area of the polygon is %.2f" , area);
	}
}
