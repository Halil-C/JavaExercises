package Chapter3;

import java.util.Scanner;

public class Exercise03_34 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for p0, p1, and p2:");
		
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		
		boolean location = 
				
				!(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0) || 
				((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0) || 
				(x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
				
		System.out.print("p2 is ");
		if (!location)
			System.out.print("not");
		System.out.print(" on the line segment from p0 to p1");
				
	
}
}
