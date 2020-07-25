package Chapter2;
import java.util.Scanner;

public class Exercise02_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter weight in pounds:");
		
		double weightInKilograms = (input.nextDouble() * 0.45359237);
		
		System.out.println("Enter height in inches:");
		
		double heighttInMeters = (input.nextDouble() * 0.0254);
		
		double BMI = (weightInKilograms) / (Math.pow(heighttInMeters, 2));
		
		System.out.println("BMI is: " + BMI);


	}
}
