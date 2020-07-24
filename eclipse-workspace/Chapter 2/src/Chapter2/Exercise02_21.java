package Chapter2;
import java.util.Scanner;

public class Exercise02_21 {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount:");
		
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage:");
		
		double monthlyInterestRate = (input.nextDouble() / 1200);
		
		System.out.println("Enter number of years:");
		
		double numberOfYears = input.nextDouble();
		
		double futureInvestmenValue = investmentAmount * (Math.pow((1 + monthlyInterestRate) ,(numberOfYears * 12)) );
		
		System.out.println("Accumulated value is " + futureInvestmenValue);


		

	}
}
