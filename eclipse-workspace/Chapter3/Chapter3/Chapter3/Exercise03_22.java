package Chapter3;

import java.util.Scanner;

public class Exercise03_22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates:");
		
		double x1 = input.nextInt();
		double y1 = input.nextInt();
		
		double distance = Math.pow(((Math.pow(x1, 2)) + (Math.pow(y1, 2))), 0.5);
		
		if (distance < 10) 
		{
			System.out.println("Point (" + x1 + "," + y1 + ") is in the circle.");
		}
		
		else 
		{
			System.out.println("Point (" + x1 + "," + y1 + ") is not in the circle.");
		}
	}
	
}
