package Chapter2;
import java.util.Scanner;

public class Exercise02_12 {

	public static void main(String[] args) {

		System.out.println("Enter speed and acceleration:");

		Scanner input = new Scanner(System.in);
		
		double speed = input.nextDouble();
		
		double acceleration = input.nextDouble();
		
		double length = (Math.pow(speed , 2)) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is: " + length);
			
		
		
	}	
}
