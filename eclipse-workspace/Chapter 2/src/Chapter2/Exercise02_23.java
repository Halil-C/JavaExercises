package Chapter2;
import java.util.Scanner;

public class Exercise02_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print( "Enter the driving distance: ");
		
		double drivingDistance = input.nextDouble();
		
		System.out.print( "Enter miles per gallon: ");
		
		double drivingMPG = input.nextDouble();
		
		System.out.print( "Enter price per gallon: ");
		
		double costPerGallon = input.nextDouble();

		double totalCost = ((drivingDistance) / drivingMPG) * costPerGallon;
		
		System.out.print( "The cost of driving is " + (int)((totalCost) * 100) / 100.0);


	}
}
