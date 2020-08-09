package Chapter4;

import java.util.Scanner;

public class Exercise04_04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side length of the hexagon: ");
		
		
		double side = input.nextDouble();
		
		double area = (6 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI / 6)));
		
		System.out.printf("The area of the hexagon is %4.2f\n" , area);
	}
	
}
