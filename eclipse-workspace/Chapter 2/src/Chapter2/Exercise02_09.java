package Chapter2;
import java.util.Scanner;

public class Exercise02_09 {

	public static void main(String[] args) {
		
		System.out.println("Enter v0, v1, and t:");
		
		Scanner input = new Scanner(System.in);
		
		double v0 = input.nextDouble();
		
		double v1 = input.nextDouble();
		
		double t = input.nextDouble();
		
		double a = (v1 - v0) / t;
		
		System.out.println("The average acceleration is " + a);
	}
	
}
