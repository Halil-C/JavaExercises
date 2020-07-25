package Chapter2;
import java.util.Scanner;

public class Exercise02_10 {

	public static void main(String[] args) {
		
		System.out.println("Enter the amount of water in kilograms:");
		
		Scanner input = new Scanner(System.in);
		
		double M = input.nextDouble();
		
		System.out.println("Enter the amount of initial temperature:");
		
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the amount of final temperature:");
		
		double finalTemperature = input.nextDouble();
		
		double Q = M * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is " + Q);
	}
	
}
