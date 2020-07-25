package Chapter2;
import java.util.Scanner;

public class Exercise02_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter the monthly saving amount:");
		
		double initialAmount = input.nextDouble();
		
		double firstMonthBalance = initialAmount * (1 + (.05 / 12)) ;
		
		double secondMonthBalance = (firstMonthBalance + initialAmount) * (1 + (.05 / 12)) ;
		
		double thirdMonthBalance = (secondMonthBalance + initialAmount) * (1 + (.05 / 12)) ;

		double fourthMonthBalance = (thirdMonthBalance + initialAmount) * (1 + (.05 / 12)) ;
		
		double fifthMonthBalance = (fourthMonthBalance + initialAmount) * (1 + (.05 / 12)) ;
		
		double sixthMonthBalance = (fifthMonthBalance + initialAmount) * (1 + (.05 / 12)) ;

		System.out.println("After the sixth month, the account value is: " + ((int)(sixthMonthBalance *100) / 100.0 ));

	}
	
}
