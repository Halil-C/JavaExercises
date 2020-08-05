package Chapter3;

import java.util.Scanner;

public class Exercise03_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 	
		
		System.out.print("Enter a point's (x,y): ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		
	
		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);

		System.out.println("The point " + ((x > intersectx || y > intersecty)
			? "is not " : "is " ) + "in the triangle");
		
	}

	
}
