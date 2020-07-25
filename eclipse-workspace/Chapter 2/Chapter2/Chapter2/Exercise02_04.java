package Chapter2;
import java.util.Scanner;

public class Exercise02_04 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number in pounds:");
		
		Scanner input = new Scanner(System.in);
		
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms ");
		
	}
	
}
